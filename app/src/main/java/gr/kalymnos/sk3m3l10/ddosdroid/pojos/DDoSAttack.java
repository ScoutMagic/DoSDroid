package gr.kalymnos.sk3m3l10.ddosdroid.pojos;

import java.util.List;

import static gr.kalymnos.sk3m3l10.ddosdroid.utils.ListUtils.listHasItems;

public class DDoSAttack {

    private static final String TAG = DDoSAttack.class.getSimpleName();

    private String pushId, targetWebsite;
    private List<DDoSBot> botsList;
    private DDoSBot owner;
    private long timeMilli;

    public DDoSAttack(String targetWebsite, DDoSBot owner) {
        this.targetWebsite = targetWebsite;
        this.owner = owner;
        this.timeMilli = System.currentTimeMillis();
    }

    public int getBotNetCount() {
        if (listHasItems(botsList)) {
            return botsList.size();
        }
        return 0;
    }

    public void addBot(DDoSBot bot) {
        if (listHasItems(botsList)) {
            botsList.add(bot);
        }
        throw new UnsupportedOperationException(TAG + "bot list is null or empty");
    }

    public void removeBot(DDoSBot bot) {
        if (listHasItems(botsList)) {
            botsList.remove(bot);
        }
        throw new UnsupportedOperationException(TAG + "bot list is null or empty");
    }

    public void start(){
        // TODO: needs implementation
    }

    public void stop(){
        // TODO: needs implementation
    }

    public String getPushId() {
        return pushId;
    }

    public String getTargetWebsite() {
        return targetWebsite;
    }

    public DDoSBot getOwner() {
        return owner;
    }

    public long getTimeMilli() {
        return timeMilli;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }
}