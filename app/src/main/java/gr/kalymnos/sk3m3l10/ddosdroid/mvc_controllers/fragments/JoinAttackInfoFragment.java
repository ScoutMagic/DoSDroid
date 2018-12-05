package gr.kalymnos.sk3m3l10.ddosdroid.mvc_controllers.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import gr.kalymnos.sk3m3l10.ddosdroid.mvc_views.screen_join_attack.JoinAttackInfoViewMvc;
import gr.kalymnos.sk3m3l10.ddosdroid.mvc_views.screen_join_attack.JoinAttackInfoViewMvcImp;
import gr.kalymnos.sk3m3l10.ddosdroid.pojos.Attack;

public class JoinAttackInfoFragment extends Fragment implements JoinAttackInfoViewMvc.OnJoinAttackClickListener {

    private JoinAttackInfoViewMvc viewMvc;
    private Attack attack;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        attack = getArguments().getParcelable(Attack.Extra.EXTRA_ATTACK);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        initializeViewMvc(inflater, container);
        bindAttackToUi();
        return viewMvc.getRootView();
    }

    @Override
    public void onJoinAttackClicked() {

    }

    private void bindAttackToUi() {
        viewMvc.bindAttackForce(attack.getBotNetCount());
        viewMvc.bindNetworkConfiguration(Attack.NetworkTypeTranslator.translate(attack.getNetworkType()));
        viewMvc.bindWebsite(attack.getWebsite());
        viewMvc.bindWebsiteDate(attack.getTimeMilli());
    }

    private void initializeViewMvc(@NonNull LayoutInflater inflater, @Nullable ViewGroup container) {
        viewMvc = new JoinAttackInfoViewMvcImp(inflater, container);
        viewMvc.setOnJoinAttackClickListener(this);
    }

    public static JoinAttackInfoFragment getInstance(Bundle args) {
        JoinAttackInfoFragment instance = new JoinAttackInfoFragment();
        instance.setArguments(args);
        return instance;
    }
}
