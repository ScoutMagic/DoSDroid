package gr.kalymnos.sk3m3l10.ddosdroid.pojos;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class Attack implements Parcelable {

    private String pushId, website;
    private int networkType;
    private long timeMillis;
    private Bot owner;
    private List<String> botIds = new ArrayList<>();

    public Attack() {
    }

    public Attack(String website, int networkType, Bot owner) {
        this.website = website;
        this.owner = owner;
        this.networkType = networkType;
        this.timeMillis = System.currentTimeMillis();
    }

    public String getPushId() {
        return pushId;
    }

    public String getWebsite() {
        return website;
    }

    public int getNetworkType() {
        return networkType;
    }

    public long getTimeMillis() {
        return timeMillis;
    }

    public Bot getOwner() {
        return owner;
    }

    public List<String> getBotIds() {
        return botIds;
    }

    public void setBotIds(List<String> botIds) {
        this.botIds = botIds;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }

    protected Attack(Parcel in) {
        pushId = in.readString();
        website = in.readString();
        networkType = in.readInt();
        timeMillis = in.readLong();
        owner = in.readParcelable(Bot.class.getClassLoader());
        botIds = in.createStringArrayList();
    }

    public static final Creator<Attack> CREATOR = new Creator<Attack>() {
        @Override
        public Attack createFromParcel(Parcel in) {
            return new Attack(in);
        }

        @Override
        public Attack[] newArray(int size) {
            return new Attack[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(pushId);
        parcel.writeString(website);
        parcel.writeInt(networkType);
        parcel.writeLong(timeMillis);
        parcel.writeParcelable(owner, i);
        parcel.writeStringList(botIds);
    }
}
