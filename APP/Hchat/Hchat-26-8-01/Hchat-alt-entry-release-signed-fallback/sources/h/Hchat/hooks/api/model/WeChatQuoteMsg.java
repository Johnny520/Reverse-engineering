package h.Hchat.hooks.api.model;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatQuoteMsg {
    public static final int $stable = 0;
    public final java.lang.String content;
    public final long createTime;
    public final java.lang.String displayName;
    public final java.lang.String msgSource;
    public final java.lang.String sendTalker;
    public final java.lang.String strId;
    public final long svrId;
    public final java.lang.String talker;
    public final java.lang.String title;
    public final int type;

    public WeChatQuoteMsg(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, java.lang.String r7, long r8, java.lang.String r10, long r11) {
            r0 = this;
            j8.b.q(r1, r2, r3, r4, r5)
            r7.getClass()
            r10.getClass()
            r0.<init>()
            r0.title = r1
            r0.msgSource = r2
            r0.sendTalker = r3
            r0.displayName = r4
            r0.talker = r5
            r0.type = r6
            r0.content = r7
            r0.svrId = r8
            r0.strId = r10
            r0.createTime = r11
            return
    }

    public static /* synthetic */ h.Hchat.hooks.api.model.WeChatQuoteMsg copy$default(h.Hchat.hooks.api.model.WeChatQuoteMsg r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, java.lang.String r7, long r8, java.lang.String r10, long r11, int r13, java.lang.Object r14) {
            r14 = r13 & 1
            if (r14 == 0) goto L6
            java.lang.String r1 = r0.title
        L6:
            r14 = r13 & 2
            if (r14 == 0) goto Lc
            java.lang.String r2 = r0.msgSource
        Lc:
            r14 = r13 & 4
            if (r14 == 0) goto L12
            java.lang.String r3 = r0.sendTalker
        L12:
            r14 = r13 & 8
            if (r14 == 0) goto L18
            java.lang.String r4 = r0.displayName
        L18:
            r14 = r13 & 16
            if (r14 == 0) goto L1e
            java.lang.String r5 = r0.talker
        L1e:
            r14 = r13 & 32
            if (r14 == 0) goto L24
            int r6 = r0.type
        L24:
            r14 = r13 & 64
            if (r14 == 0) goto L2a
            java.lang.String r7 = r0.content
        L2a:
            r14 = r13 & 128(0x80, float:1.8E-43)
            if (r14 == 0) goto L30
            long r8 = r0.svrId
        L30:
            r14 = r13 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L36
            java.lang.String r10 = r0.strId
        L36:
            r13 = r13 & 512(0x200, float:7.17E-43)
            if (r13 == 0) goto L3c
            long r11 = r0.createTime
        L3c:
            r13 = r11
            r12 = r10
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r2 = r0
            r3 = r1
            h.Hchat.hooks.api.model.WeChatQuoteMsg r0 = r2.copy(r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.title
            return r0
    }

    public final long component10() {
            r2 = this;
            long r0 = r2.createTime
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.msgSource
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.sendTalker
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.displayName
            return r0
    }

    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.talker
            return r0
    }

    public final int component6() {
            r1 = this;
            int r0 = r1.type
            return r0
    }

    public final java.lang.String component7() {
            r1 = this;
            java.lang.String r0 = r1.content
            return r0
    }

    public final long component8() {
            r2 = this;
            long r0 = r2.svrId
            return r0
    }

    public final java.lang.String component9() {
            r1 = this;
            java.lang.String r0 = r1.strId
            return r0
    }

    public final h.Hchat.hooks.api.model.WeChatQuoteMsg copy(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, int r19, java.lang.String r20, long r21, java.lang.String r23, long r24) {
            r13 = this;
            j8.b.q(r14, r15, r16, r17, r18)
            r20.getClass()
            r23.getClass()
            h.Hchat.hooks.api.model.WeChatQuoteMsg r0 = new h.Hchat.hooks.api.model.WeChatQuoteMsg
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r10 = r23
            r11 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof h.Hchat.hooks.api.model.WeChatQuoteMsg
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            h.Hchat.hooks.api.model.WeChatQuoteMsg r8 = (h.Hchat.hooks.api.model.WeChatQuoteMsg) r8
            java.lang.String r1 = r7.title
            java.lang.String r3 = r8.title
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.msgSource
            java.lang.String r3 = r8.msgSource
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r7.sendTalker
            java.lang.String r3 = r8.sendTalker
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r7.displayName
            java.lang.String r3 = r8.displayName
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r7.talker
            java.lang.String r3 = r8.talker
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            int r1 = r7.type
            int r3 = r8.type
            if (r1 == r3) goto L4a
            return r2
        L4a:
            java.lang.String r1 = r7.content
            java.lang.String r3 = r8.content
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L55
            return r2
        L55:
            long r3 = r7.svrId
            long r5 = r8.svrId
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L5e
            return r2
        L5e:
            java.lang.String r1 = r7.strId
            java.lang.String r3 = r8.strId
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L69
            return r2
        L69:
            long r3 = r7.createTime
            long r5 = r8.createTime
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L72
            return r2
        L72:
            return r0
    }

    public final java.lang.String getContent() {
            r1 = this;
            java.lang.String r0 = r1.content
            return r0
    }

    public final long getCreateTime() {
            r2 = this;
            long r0 = r2.createTime
            return r0
    }

    public final java.lang.String getDisplayName() {
            r1 = this;
            java.lang.String r0 = r1.displayName
            return r0
    }

    public final java.lang.String getMsgSource() {
            r1 = this;
            java.lang.String r0 = r1.msgSource
            return r0
    }

    public final java.lang.String getSendTalker() {
            r1 = this;
            java.lang.String r0 = r1.sendTalker
            return r0
    }

    public final java.lang.String getStrId() {
            r1 = this;
            java.lang.String r0 = r1.strId
            return r0
    }

    public final long getSvrId() {
            r2 = this;
            long r0 = r2.svrId
            return r0
    }

    public final java.lang.String getTalker() {
            r1 = this;
            java.lang.String r0 = r1.talker
            return r0
    }

    public final java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.title
            return r0
    }

    public final int getType() {
            r1 = this;
            int r0 = r1.type
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.title
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.msgSource
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.sendTalker
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.displayName
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.talker
            int r0 = eh.a.g(r0, r1, r2)
            int r2 = r4.type
            int r0 = eh.a.e(r2, r0, r1)
            java.lang.String r2 = r4.content
            int r0 = eh.a.g(r0, r1, r2)
            long r2 = r4.svrId
            int r0 = eh.a.f(r0, r1, r2)
            java.lang.String r2 = r4.strId
            int r0 = eh.a.g(r0, r1, r2)
            long r1 = r4.createTime
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r15 = this;
            java.lang.String r0 = r15.title
            java.lang.String r1 = r15.msgSource
            java.lang.String r2 = r15.sendTalker
            java.lang.String r3 = r15.displayName
            java.lang.String r4 = r15.talker
            int r5 = r15.type
            java.lang.String r6 = r15.content
            long r7 = r15.svrId
            java.lang.String r9 = r15.strId
            long r10 = r15.createTime
            java.lang.String r12 = ", msgSource="
            java.lang.String r13 = ", sendTalker="
            java.lang.String r14 = "WeChatQuoteMsg(title="
            java.lang.StringBuilder r0 = bc.e.p(r14, r0, r12, r1, r13)
            java.lang.String r1 = ", displayName="
            java.lang.String r12 = ", talker="
            j8.b.t(r0, r2, r1, r3, r12)
            r0.append(r4)
            java.lang.String r1 = ", type="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ", content="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ", svrId="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ", strId="
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ", createTime="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r0 = eh.a.p(r0, r10, r1)
            return r0
    }
}
