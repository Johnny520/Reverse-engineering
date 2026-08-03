package p099h.Hchat.hooks.api.model;

import android.text.TextUtils;
import okhttp3.HttpUrl;
import p218og.AbstractC3156t;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatContact {
    public static final int $stable = 0;
    public final String avatarBackupUrl;
    public final String avatarUrl;
    public final String city;
    public final String customWxId;
    public final String encryptedUsername;
    public final int gender;
    public final String nickname;
    public final String province;
    public final String remarkName;
    public final int type;
    public final String wxId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WeChatContact(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i9, int i10) {
        this.gender = i9;
        this.type = i10;
        this.wxId = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        this.nickname = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        this.customWxId = str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
        this.remarkName = str4 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str4;
        this.avatarUrl = str5 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str5;
        this.avatarBackupUrl = str6 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str6;
        this.encryptedUsername = str7 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str7;
        this.province = str8 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str8;
        this.city = str9 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String displayName() {
        return isGroup() ? !TextUtils.isEmpty(this.nickname) ? this.nickname : this.wxId : (TextUtils.isEmpty(this.remarkName) || TextUtils.isEmpty(this.nickname)) ? !TextUtils.isEmpty(this.remarkName) ? this.remarkName : !TextUtils.isEmpty(this.nickname) ? this.nickname : this.wxId : AbstractC4855en.m9265i(this.remarkName, " (", this.nickname, ")");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getAlias() {
        return this.customWxId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getAvatarBackupUrl() {
        return this.avatarBackupUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getCity() {
        return this.city;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getDisplayName() {
        return displayName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getEncryptedUsername() {
        return this.encryptedUsername;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getGender() {
        return this.gender;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getName() {
        return displayName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getNickName() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getProvince() {
        return this.province;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getRegion() {
        return (TextUtils.isEmpty(this.province) || TextUtils.isEmpty(this.city)) ? !TextUtils.isEmpty(this.province) ? this.province : !TextUtils.isEmpty(this.city) ? this.city : HttpUrl.FRAGMENT_ENCODE_SET : AbstractC4855en.m9264h(this.province, " ", this.city);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getRemarkName() {
        return this.remarkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getSex() {
        return this.gender;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getUserName() {
        return this.wxId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getWxId() {
        return this.wxId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getWxid() {
        return this.wxId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isFriend() {
        return (isGroup() || isOfficialAccount() || (this.type & 1) == 0) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isGroup() {
        return AbstractC3156t.m6733W(this.wxId, "@chatroom", false) || AbstractC3156t.m6733W(this.wxId, "@im.chatroom", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isOfficialAccount() {
        return AbstractC3156t.m6740d0(this.wxId, "gh_", false);
    }
}
