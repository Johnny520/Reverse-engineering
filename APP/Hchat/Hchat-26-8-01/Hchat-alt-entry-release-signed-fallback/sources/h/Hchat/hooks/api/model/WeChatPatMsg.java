package h.Hchat.hooks.api.model;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatPatMsg {
    public static final int $stable = 0;
    public final long createTime;
    public final java.lang.String fromUser;
    public final java.lang.String pattedUser;
    public final java.lang.String talker;
    public final java.lang.String template;

    public WeChatPatMsg(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, long r5) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.talker = r1
            r0.fromUser = r2
            r0.pattedUser = r3
            r0.template = r4
            r0.createTime = r5
            return
    }

    public static /* synthetic */ h.Hchat.hooks.api.model.WeChatPatMsg copy$default(h.Hchat.hooks.api.model.WeChatPatMsg r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, long r5, int r7, java.lang.Object r8) {
            r8 = r7 & 1
            if (r8 == 0) goto L6
            java.lang.String r1 = r0.talker
        L6:
            r8 = r7 & 2
            if (r8 == 0) goto Lc
            java.lang.String r2 = r0.fromUser
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L12
            java.lang.String r3 = r0.pattedUser
        L12:
            r8 = r7 & 8
            if (r8 == 0) goto L18
            java.lang.String r4 = r0.template
        L18:
            r7 = r7 & 16
            if (r7 == 0) goto L1e
            long r5 = r0.createTime
        L1e:
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            r2 = r0
            h.Hchat.hooks.api.model.WeChatPatMsg r0 = r2.copy(r3, r4, r5, r6, r7)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.talker
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.fromUser
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.pattedUser
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.template
            return r0
    }

    public final long component5() {
            r2 = this;
            long r0 = r2.createTime
            return r0
    }

    public final h.Hchat.hooks.api.model.WeChatPatMsg copy(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, long r12) {
            r7 = this;
            r8.getClass()
            r9.getClass()
            r10.getClass()
            r11.getClass()
            h.Hchat.hooks.api.model.WeChatPatMsg r0 = new h.Hchat.hooks.api.model.WeChatPatMsg
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof h.Hchat.hooks.api.model.WeChatPatMsg
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            h.Hchat.hooks.api.model.WeChatPatMsg r8 = (h.Hchat.hooks.api.model.WeChatPatMsg) r8
            java.lang.String r1 = r7.talker
            java.lang.String r3 = r8.talker
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.fromUser
            java.lang.String r3 = r8.fromUser
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r7.pattedUser
            java.lang.String r3 = r8.pattedUser
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r7.template
            java.lang.String r3 = r8.template
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            long r3 = r7.createTime
            long r5 = r8.createTime
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L41
            return r2
        L41:
            return r0
    }

    public final long getCreateTime() {
            r2 = this;
            long r0 = r2.createTime
            return r0
    }

    public final java.lang.String getFromUser() {
            r1 = this;
            java.lang.String r0 = r1.fromUser
            return r0
    }

    public final java.lang.String getPattedUser() {
            r1 = this;
            java.lang.String r0 = r1.pattedUser
            return r0
    }

    public final java.lang.String getTalker() {
            r1 = this;
            java.lang.String r0 = r1.talker
            return r0
    }

    public final java.lang.String getTemplate() {
            r1 = this;
            java.lang.String r0 = r1.template
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.talker
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.fromUser
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.pattedUser
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.template
            int r0 = eh.a.g(r0, r1, r2)
            long r1 = r3.createTime
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r9 = this;
            java.lang.String r0 = r9.talker
            java.lang.String r1 = r9.fromUser
            java.lang.String r2 = r9.pattedUser
            java.lang.String r3 = r9.template
            long r4 = r9.createTime
            java.lang.String r6 = ", fromUser="
            java.lang.String r7 = ", pattedUser="
            java.lang.String r8 = "WeChatPatMsg(talker="
            java.lang.StringBuilder r0 = bc.e.p(r8, r0, r6, r1, r7)
            java.lang.String r1 = ", template="
            java.lang.String r6 = ", createTime="
            j8.b.t(r0, r2, r1, r3, r6)
            java.lang.String r1 = ")"
            java.lang.String r0 = eh.a.p(r0, r4, r1)
            return r0
    }
}
