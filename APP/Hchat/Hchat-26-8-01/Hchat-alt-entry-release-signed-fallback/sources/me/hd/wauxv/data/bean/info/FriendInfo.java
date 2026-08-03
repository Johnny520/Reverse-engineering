package me.hd.wauxv.data.bean.info;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class FriendInfo {
    private final java.lang.String alias;
    private final java.lang.String avatarBackupUrl;
    private final java.lang.String avatarUrl;
    private final java.lang.String city;
    private final java.lang.String encryptedUsername;
    private final int gender;
    private final java.lang.String nickname;
    private final java.lang.String province;
    private final java.lang.String remark;
    private final int type;
    private final java.lang.String wxid;

    public FriendInfo(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, int r11) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = safe(r1)
            r0.wxid = r1
            java.lang.String r1 = safe(r2)
            r0.nickname = r1
            java.lang.String r1 = safe(r3)
            r0.remark = r1
            java.lang.String r1 = safe(r4)
            r0.alias = r1
            java.lang.String r1 = safe(r5)
            r0.avatarUrl = r1
            java.lang.String r1 = safe(r6)
            r0.avatarBackupUrl = r1
            java.lang.String r1 = safe(r7)
            r0.encryptedUsername = r1
            java.lang.String r1 = safe(r8)
            r0.province = r1
            java.lang.String r1 = safe(r9)
            r0.city = r1
            r0.gender = r10
            r0.type = r11
            return
    }

    private static java.lang.String safe(java.lang.String r0) {
            if (r0 != 0) goto L4
            java.lang.String r0 = ""
        L4:
            return r0
    }

    public java.lang.String getAlias() {
            r1 = this;
            java.lang.String r0 = r1.alias
            return r0
    }

    public java.lang.String getAvatarBackupUrl() {
            r1 = this;
            java.lang.String r0 = r1.avatarBackupUrl
            return r0
    }

    public java.lang.String getAvatarUrl() {
            r1 = this;
            java.lang.String r0 = r1.avatarUrl
            return r0
    }

    public java.lang.String getCity() {
            r1 = this;
            java.lang.String r0 = r1.city
            return r0
    }

    public java.lang.String getDisplayName() {
            r1 = this;
            java.lang.String r0 = r1.getName()
            return r0
    }

    public java.lang.String getEncryptedUsername() {
            r1 = this;
            java.lang.String r0 = r1.encryptedUsername
            return r0
    }

    public int getGender() {
            r1 = this;
            int r0 = r1.gender
            return r0
    }

    public java.lang.String getName() {
            r3 = this;
            java.lang.String r0 = r3.remark
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L28
            java.lang.String r0 = r3.nickname
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.remark
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            java.lang.String r1 = r3.nickname
            java.lang.String r2 = ")"
            java.lang.String r0 = eh.a.r(r0, r1, r2)
            return r0
        L28:
            java.lang.String r0 = r3.remark
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L33
            java.lang.String r0 = r3.remark
            return r0
        L33:
            java.lang.String r0 = r3.nickname
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3e
            java.lang.String r0 = r3.nickname
            return r0
        L3e:
            java.lang.String r0 = r3.wxid
            return r0
    }

    public java.lang.String getNickName() {
            r1 = this;
            java.lang.String r0 = r1.nickname
            return r0
    }

    public java.lang.String getNickname() {
            r1 = this;
            java.lang.String r0 = r1.nickname
            return r0
    }

    public java.lang.String getProvince() {
            r1 = this;
            java.lang.String r0 = r1.province
            return r0
    }

    public java.lang.String getRegion() {
            r2 = this;
            java.lang.String r0 = r2.province
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L29
            java.lang.String r0 = r2.city
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.province
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r2.city
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L29:
            java.lang.String r0 = r2.province
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L34
            java.lang.String r0 = r2.province
            return r0
        L34:
            java.lang.String r0 = r2.city
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3f
            java.lang.String r0 = r2.city
            return r0
        L3f:
            java.lang.String r0 = ""
            return r0
    }

    public java.lang.String getRemark() {
            r1 = this;
            java.lang.String r0 = r1.remark
            return r0
    }

    public java.lang.String getRemarkName() {
            r1 = this;
            java.lang.String r0 = r1.remark
            return r0
    }

    public int getSex() {
            r1 = this;
            int r0 = r1.gender
            return r0
    }

    public int getType() {
            r1 = this;
            int r0 = r1.type
            return r0
    }

    public java.lang.String getUserName() {
            r1 = this;
            java.lang.String r0 = r1.wxid
            return r0
    }

    public java.lang.String getUsername() {
            r1 = this;
            java.lang.String r0 = r1.wxid
            return r0
    }

    public java.lang.String getWxId() {
            r1 = this;
            java.lang.String r0 = r1.wxid
            return r0
    }

    public java.lang.String getWxid() {
            r1 = this;
            java.lang.String r0 = r1.wxid
            return r0
    }

    public boolean isGroup() {
            r2 = this;
            java.lang.String r0 = r2.wxid
            java.lang.String r1 = "@chatroom"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L17
            java.lang.String r0 = r2.wxid
            java.lang.String r1 = "@im.chatroom"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    public boolean isOfficialAccount() {
            r2 = this;
            java.lang.String r0 = r2.wxid
            java.lang.String r1 = "gh_"
            boolean r0 = r0.startsWith(r1)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FriendInfo(wxid="
            r0.<init>(r1)
            java.lang.String r1 = r3.wxid
            r0.append(r1)
            java.lang.String r1 = ", nickname="
            r0.append(r1)
            java.lang.String r1 = r3.nickname
            r0.append(r1)
            java.lang.String r1 = ", remark="
            r0.append(r1)
            java.lang.String r1 = r3.remark
            java.lang.String r2 = ")"
            java.lang.String r0 = eh.a.r(r0, r1, r2)
            return r0
    }
}
