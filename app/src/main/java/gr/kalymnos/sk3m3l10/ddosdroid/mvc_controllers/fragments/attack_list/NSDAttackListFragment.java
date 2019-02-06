package gr.kalymnos.sk3m3l10.ddosdroid.mvc_controllers.fragments.attack_list;

import android.util.Log;

import java.util.Iterator;

import gr.kalymnos.sk3m3l10.ddosdroid.pojos.attack.Attack;
import gr.kalymnos.sk3m3l10.ddosdroid.pojos.attack.Attacks;
import gr.kalymnos.sk3m3l10.ddosdroid.pojos.bot.Bots;

import static gr.kalymnos.sk3m3l10.ddosdroid.pojos.attack.Constants.AttackType.TYPE_FETCH_ALL;
import static gr.kalymnos.sk3m3l10.ddosdroid.pojos.attack.Constants.AttackType.TYPE_FETCH_JOINED;
import static gr.kalymnos.sk3m3l10.ddosdroid.pojos.attack.Constants.AttackType.TYPE_FETCH_NOT_JOINED;
import static gr.kalymnos.sk3m3l10.ddosdroid.pojos.attack.Constants.AttackType.TYPE_FETCH_OWNER;
import static gr.kalymnos.sk3m3l10.ddosdroid.pojos.attack.Constants.NetworkType.BLUETOOTH;
import static gr.kalymnos.sk3m3l10.ddosdroid.pojos.attack.Constants.NetworkType.INTERNET;
import static gr.kalymnos.sk3m3l10.ddosdroid.pojos.attack.Constants.NetworkType.NSD;

public class NSDAttackListFragment extends AttackListFragment {
    private static final String TAG = AttackListFragment.TAG + "NSD";

    @Override
    public void onAttackUpload(Attack attack) {

    }

    @Override
    public void onAttackUpdate(Attack changedAttack) {

    }

    @Override
    public void onAttackDelete(Attack deletedAttack) {

    }

    @Override
    public void onAttackItemClick(int position) {

    }

    @Override
    public void onJoinSwitchCheckedState(int position, boolean isChecked) {

    }

    @Override
    public void onActivateSwitchCheckedState(int position, boolean isChecked) {

    }
}
