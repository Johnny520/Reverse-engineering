package me.p186hd.wauxv.data.bean.info;

import android.text.TextUtils;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class FriendInfo {
    private final String alias;
    private final String avatarBackupUrl;
    private final String avatarUrl;
    private final String city;
    private final String encryptedUsername;
    private final int gender;
    private final String nickname;
    private final String province;
    private final String remark;
    private final int type;
    private final String wxid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FriendInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i9, int i10) {
        this.wxid = safe(str);
        this.nickname = safe(str2);
        this.remark = safe(str3);
        this.alias = safe(str4);
        this.avatarUrl = safe(str5);
        this.avatarBackupUrl = safe(str6);
        this.encryptedUsername = safe(str7);
        this.province = safe(str8);
        this.city = safe(str9);
        this.gender = i9;
        this.type = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String safe(String str) {
        return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getAlias() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getAvatarBackupUrl() {
        return this.avatarBackupUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getCity() {
        return this.city;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getDisplayName() {
        return getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getEncryptedUsername() {
        return this.encryptedUsername;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getGender() {
        return this.gender;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getName() {
        if (TextUtils.isEmpty(this.remark) || TextUtils.isEmpty(this.nickname)) {
            return !TextUtils.isEmpty(this.remark) ? this.remark : !TextUtils.isEmpty(this.nickname) ? this.nickname : this.wxid;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.remark);
        sb2.append(" (");
        return AbstractC0921a.m2255r(sb2, this.nickname, ")");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getNickName() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getNickname() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getProvince() {
        return this.province;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getRegion() {
        if (TextUtils.isEmpty(this.province) || TextUtils.isEmpty(this.city)) {
            return !TextUtils.isEmpty(this.province) ? this.province : !TextUtils.isEmpty(this.city) ? this.city : HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return this.province + " " + this.city;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getRemark() {
        return this.remark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getRemarkName() {
        return this.remark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getSex() {
        return this.gender;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getUserName() {
        return this.wxid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getUsername() {
        return this.wxid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getWxId() {
        return this.wxid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getWxid() {
        return this.wxid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isGroup() {
        return this.wxid.endsWith("@chatroom") || this.wxid.endsWith("@im.chatroom");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isOfficialAccount() {
        return this.wxid.startsWith("gh_");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FriendInfo(wxid=");
        sb2.append(this.wxid);
        sb2.append(", nickname=");
        sb2.append(this.nickname);
        sb2.append(", remark=");
        return AbstractC0921a.m2255r(sb2, this.remark, ")");
    }
}
