package gr.kalymnos.sk3m3l10.ddosdroid.pojos.attack;

import android.support.annotation.NonNull;
import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;
import java.util.UUID;

import gr.kalymnos.sk3m3l10.ddosdroid.pojos.bot.Bot;

import static gr.kalymnos.sk3m3l10.ddosdroid.pojos.attack.Constants.Extra.EXTRA_ATTACK_HOST_UUID;
import static gr.kalymnos.sk3m3l10.ddosdroid.pojos.attack.Constants.Extra.EXTRA_MAC_ADDRESS;

public final class Attacks {
    private static final String TAG = "Attacks";

    public static void removeBot(Attack attack, Bot bot) {
        attack.getBotIds().remove(bot.getId());
    }

    public static void addBot(Attack attack, Bot bot) {
        if (!attack.getBotIds().contains(bot.getId()))
            attack.getBotIds().add(bot.getId());
    }

    public static void addBotIds(Attack attack, List<String> botIds) {
        for (String id : botIds) {
            addBot(attack, new Bot(id));
        }
    }

    public static boolean includes(Attack attack, Bot bot) {
        Log.d(TAG, "Attacks.inclures returns " + attack.getBotIds().contains(bot.getId()));
        return attack.getBotIds().contains(bot.getId());
    }

    public static boolean ownedBy(Attack attack, Bot bot) {
        String attackHostId = attack.getHostInfo().get(EXTRA_ATTACK_HOST_UUID);
        String localHostId = bot.getId();
        return attackHostId.equals(localHostId);
    }

    public static String createPushId() {
        return getAttackDatabaseReference().push().getKey();
    }

    @NonNull
    private static DatabaseReference getAttackDatabaseReference() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        return database.getReference().child("attacks");
    }

    public static UUID getUUID(Attack attack) {
        String uuidString = attack.getHostInfo().get(EXTRA_ATTACK_HOST_UUID);
        return UUID.fromString(uuidString);
    }

    public static String getHostMacAddress(Attack attack) {
        return attack.getHostInfo().get(EXTRA_MAC_ADDRESS);
    }
}
