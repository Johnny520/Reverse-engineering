package h.Hchat.hooks.api.model;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatImageMsg {
    public static final int $stable = 0;
    public final java.lang.String bigImgUrl;
    public final int bigLength;
    public final java.lang.String key;
    public final java.lang.String md5;
    public final java.lang.String midImgUrl;
    public final int midLength;
    public final int thumbLength;
    public final java.lang.String thumbUrl;

    public WeChatImageMsg(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, int r7, int r8) {
            r0 = this;
            j8.b.q(r1, r2, r3, r4, r5)
            r0.<init>()
            r0.md5 = r1
            r0.bigImgUrl = r2
            r0.midImgUrl = r3
            r0.thumbUrl = r4
            r0.key = r5
            r0.bigLength = r6
            r0.midLength = r7
            r0.thumbLength = r8
            return
    }

    public /* synthetic */ WeChatImageMsg(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, int r8, int r9, int r10, gg.g r11) {
            r1 = this;
            r11 = r10 & 32
            r0 = 0
            if (r11 == 0) goto L6
            r7 = r0
        L6:
            r11 = r10 & 64
            if (r11 == 0) goto Lb
            r8 = r0
        Lb:
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L19
            r10 = r0
        L10:
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            goto L1b
        L19:
            r10 = r9
            goto L10
        L1b:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static /* synthetic */ h.Hchat.hooks.api.model.WeChatImageMsg copy$default(h.Hchat.hooks.api.model.WeChatImageMsg r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, int r7, int r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r1 = r0.md5
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            java.lang.String r2 = r0.bigImgUrl
        Lc:
            r10 = r9 & 4
            if (r10 == 0) goto L12
            java.lang.String r3 = r0.midImgUrl
        L12:
            r10 = r9 & 8
            if (r10 == 0) goto L18
            java.lang.String r4 = r0.thumbUrl
        L18:
            r10 = r9 & 16
            if (r10 == 0) goto L1e
            java.lang.String r5 = r0.key
        L1e:
            r10 = r9 & 32
            if (r10 == 0) goto L24
            int r6 = r0.bigLength
        L24:
            r10 = r9 & 64
            if (r10 == 0) goto L2a
            int r7 = r0.midLength
        L2a:
            r9 = r9 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L30
            int r8 = r0.thumbLength
        L30:
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            r2 = r0
            h.Hchat.hooks.api.model.WeChatImageMsg r0 = r2.copy(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.md5
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.bigImgUrl
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.midImgUrl
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.thumbUrl
            return r0
    }

    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.key
            return r0
    }

    public final int component6() {
            r1 = this;
            int r0 = r1.bigLength
            return r0
    }

    public final int component7() {
            r1 = this;
            int r0 = r1.midLength
            return r0
    }

    public final int component8() {
            r1 = this;
            int r0 = r1.thumbLength
            return r0
    }

    public final h.Hchat.hooks.api.model.WeChatImageMsg copy(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15, int r16, int r17) {
            r9 = this;
            r10.getClass()
            r11.getClass()
            r12.getClass()
            r13.getClass()
            r14.getClass()
            h.Hchat.hooks.api.model.WeChatImageMsg r0 = new h.Hchat.hooks.api.model.WeChatImageMsg
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof h.Hchat.hooks.api.model.WeChatImageMsg
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            h.Hchat.hooks.api.model.WeChatImageMsg r5 = (h.Hchat.hooks.api.model.WeChatImageMsg) r5
            java.lang.String r1 = r4.md5
            java.lang.String r3 = r5.md5
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.bigImgUrl
            java.lang.String r3 = r5.bigImgUrl
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.midImgUrl
            java.lang.String r3 = r5.midImgUrl
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.thumbUrl
            java.lang.String r3 = r5.thumbUrl
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.key
            java.lang.String r3 = r5.key
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            int r1 = r4.bigLength
            int r3 = r5.bigLength
            if (r1 == r3) goto L4a
            return r2
        L4a:
            int r1 = r4.midLength
            int r3 = r5.midLength
            if (r1 == r3) goto L51
            return r2
        L51:
            int r1 = r4.thumbLength
            int r5 = r5.thumbLength
            if (r1 == r5) goto L58
            return r2
        L58:
            return r0
    }

    public final java.lang.String getBigImgUrl() {
            r1 = this;
            java.lang.String r0 = r1.bigImgUrl
            return r0
    }

    public final int getBigLength() {
            r1 = this;
            int r0 = r1.bigLength
            return r0
    }

    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = r1.key
            return r0
    }

    public final java.lang.String getMd5() {
            r1 = this;
            java.lang.String r0 = r1.md5
            return r0
    }

    public final java.lang.String getMidImgUrl() {
            r1 = this;
            java.lang.String r0 = r1.midImgUrl
            return r0
    }

    public final int getMidLength() {
            r1 = this;
            int r0 = r1.midLength
            return r0
    }

    public final int getThumbLength() {
            r1 = this;
            int r0 = r1.thumbLength
            return r0
    }

    public final java.lang.String getThumbUrl() {
            r1 = this;
            java.lang.String r0 = r1.thumbUrl
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.md5
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.bigImgUrl
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.midImgUrl
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.thumbUrl
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.key
            int r0 = eh.a.g(r0, r1, r2)
            int r2 = r3.bigLength
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.midLength
            int r0 = eh.a.e(r2, r0, r1)
            int r1 = r3.thumbLength
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r11 = this;
            java.lang.String r0 = r11.md5
            java.lang.String r1 = r11.bigImgUrl
            java.lang.String r2 = r11.midImgUrl
            java.lang.String r3 = r11.thumbUrl
            java.lang.String r4 = r11.key
            int r5 = r11.bigLength
            int r6 = r11.midLength
            int r7 = r11.thumbLength
            java.lang.String r8 = ", bigImgUrl="
            java.lang.String r9 = ", midImgUrl="
            java.lang.String r10 = "WeChatImageMsg(md5="
            java.lang.StringBuilder r0 = bc.e.p(r10, r0, r8, r1, r9)
            java.lang.String r1 = ", thumbUrl="
            java.lang.String r8 = ", key="
            j8.b.t(r0, r2, r1, r3, r8)
            r0.append(r4)
            java.lang.String r1 = ", bigLength="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ", midLength="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ", thumbLength="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
