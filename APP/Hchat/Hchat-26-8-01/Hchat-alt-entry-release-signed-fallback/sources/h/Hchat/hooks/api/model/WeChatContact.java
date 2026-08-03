package h.Hchat.hooks.api.model;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatContact {
    public static final int $stable = 0;
    public final java.lang.String avatarBackupUrl;
    public final java.lang.String avatarUrl;
    public final java.lang.String city;
    public final java.lang.String customWxId;
    public final java.lang.String encryptedUsername;
    public final int gender;
    public final java.lang.String nickname;
    public final java.lang.String province;
    public final java.lang.String remarkName;
    public final int type;
    public final java.lang.String wxId;

    public WeChatContact(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, int r11) {
            r0 = this;
            r0.<init>()
            r0.gender = r10
            r0.type = r11
            java.lang.String r10 = ""
            if (r1 != 0) goto Lc
            r1 = r10
        Lc:
            r0.wxId = r1
            if (r2 != 0) goto L11
            r2 = r10
        L11:
            r0.nickname = r2
            if (r3 != 0) goto L16
            r3 = r10
        L16:
            r0.customWxId = r3
            if (r4 != 0) goto L1b
            r4 = r10
        L1b:
            r0.remarkName = r4
            if (r5 != 0) goto L20
            r5 = r10
        L20:
            r0.avatarUrl = r5
            if (r6 != 0) goto L25
            r6 = r10
        L25:
            r0.avatarBackupUrl = r6
            if (r7 != 0) goto L2a
            r7 = r10
        L2a:
            r0.encryptedUsername = r7
            if (r8 != 0) goto L2f
            r8 = r10
        L2f:
            r0.province = r8
            if (r9 != 0) goto L34
            r9 = r10
        L34:
            r0.city = r9
            return
    }

    public final java.lang.String displayName() {
            r4 = this;
            boolean r0 = r4.isGroup()
            if (r0 == 0) goto L14
            java.lang.String r0 = r4.nickname
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L11
            java.lang.String r0 = r4.nickname
            return r0
        L11:
            java.lang.String r0 = r4.wxId
            return r0
        L14:
            java.lang.String r0 = r4.remarkName
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L31
            java.lang.String r0 = r4.nickname
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L31
            java.lang.String r0 = r4.remarkName
            java.lang.String r1 = r4.nickname
            java.lang.String r2 = " ("
            java.lang.String r3 = ")"
            java.lang.String r0 = wb.en.i(r0, r2, r1, r3)
            return r0
        L31:
            java.lang.String r0 = r4.remarkName
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3c
            java.lang.String r0 = r4.remarkName
            return r0
        L3c:
            java.lang.String r0 = r4.nickname
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L47
            java.lang.String r0 = r4.nickname
            return r0
        L47:
            java.lang.String r0 = r4.wxId
            return r0
    }

    public final java.lang.String getAlias() {
            r1 = this;
            java.lang.String r0 = r1.customWxId
            return r0
    }

    public final java.lang.String getAvatarBackupUrl() {
            r1 = this;
            java.lang.String r0 = r1.avatarBackupUrl
            return r0
    }

    public final java.lang.String getAvatarUrl() {
            r1 = this;
            java.lang.String r0 = r1.avatarUrl
            return r0
    }

    public final java.lang.String getCity() {
            r1 = this;
            java.lang.String r0 = r1.city
            return r0
    }

    public final java.lang.String getDisplayName() {
            r1 = this;
            java.lang.String r0 = r1.displayName()
            return r0
    }

    public final java.lang.String getEncryptedUsername() {
            r1 = this;
            java.lang.String r0 = r1.encryptedUsername
            return r0
    }

    public final int getGender() {
            r1 = this;
            int r0 = r1.gender
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.displayName()
            return r0
    }

    public final java.lang.String getNickName() {
            r1 = this;
            java.lang.String r0 = r1.nickname
            return r0
    }

    public final java.lang.String getNickname() {
            r1 = this;
            java.lang.String r0 = r1.nickname
            return r0
    }

    public final java.lang.String getProvince() {
            r1 = this;
            java.lang.String r0 = r1.province
            return r0
    }

    public final java.lang.String getRegion() {
            r3 = this;
            java.lang.String r0 = r3.province
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.String r0 = r3.city
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.String r0 = r3.province
            java.lang.String r1 = r3.city
            java.lang.String r2 = " "
            java.lang.String r0 = wb.en.h(r0, r2, r1)
            return r0
        L1b:
            java.lang.String r0 = r3.province
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L26
            java.lang.String r0 = r3.province
            return r0
        L26:
            java.lang.String r0 = r3.city
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L31
            java.lang.String r0 = r3.city
            return r0
        L31:
            java.lang.String r0 = ""
            return r0
    }

    public final java.lang.String getRemarkName() {
            r1 = this;
            java.lang.String r0 = r1.remarkName
            return r0
    }

    public final int getSex() {
            r1 = this;
            int r0 = r1.gender
            return r0
    }

    public final java.lang.String getUserName() {
            r1 = this;
            java.lang.String r0 = r1.wxId
            return r0
    }

    public final java.lang.String getWxId() {
            r1 = this;
            java.lang.String r0 = r1.wxId
            return r0
    }

    public final java.lang.String getWxid() {
            r1 = this;
            java.lang.String r0 = r1.wxId
            return r0
    }

    public final boolean isFriend() {
            r2 = this;
            boolean r0 = r2.isGroup()
            if (r0 != 0) goto L13
            boolean r0 = r2.isOfficialAccount()
            if (r0 != 0) goto L13
            int r0 = r2.type
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L13
            return r1
        L13:
            r0 = 0
            return r0
    }

    public final boolean isGroup() {
            r3 = this;
            java.lang.String r0 = r3.wxId
            java.lang.String r1 = "@chatroom"
            r2 = 0
            boolean r0 = og.t.W(r0, r1, r2)
            if (r0 != 0) goto L17
            java.lang.String r0 = r3.wxId
            java.lang.String r1 = "@im.chatroom"
            boolean r0 = og.t.W(r0, r1, r2)
            if (r0 == 0) goto L16
            goto L17
        L16:
            return r2
        L17:
            r0 = 1
            return r0
    }

    public final boolean isOfficialAccount() {
            r3 = this;
            java.lang.String r0 = r3.wxId
            java.lang.String r1 = "gh_"
            r2 = 0
            boolean r0 = og.t.d0(r0, r1, r2)
            return r0
    }
}
