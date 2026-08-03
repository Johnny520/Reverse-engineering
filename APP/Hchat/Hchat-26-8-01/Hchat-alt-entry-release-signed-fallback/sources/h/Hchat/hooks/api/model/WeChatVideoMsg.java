package h.Hchat.hooks.api.model;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatVideoMsg {
    public static final int $stable = 0;
    public final java.lang.String aesKey;
    public final java.lang.String cdnVideoUrl;
    public final long length;
    public final java.lang.String md5;
    public final java.lang.String newMd5;
    public final int playLength;

    public WeChatVideoMsg(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, long r5, int r7) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.md5 = r1
            r0.newMd5 = r2
            r0.cdnVideoUrl = r3
            r0.aesKey = r4
            r0.length = r5
            r0.playLength = r7
            return
    }

    public static /* synthetic */ h.Hchat.hooks.api.model.WeChatVideoMsg copy$default(h.Hchat.hooks.api.model.WeChatVideoMsg r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, long r5, int r7, int r8, java.lang.Object r9) {
            r9 = r8 & 1
            if (r9 == 0) goto L6
            java.lang.String r1 = r0.md5
        L6:
            r9 = r8 & 2
            if (r9 == 0) goto Lc
            java.lang.String r2 = r0.newMd5
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L12
            java.lang.String r3 = r0.cdnVideoUrl
        L12:
            r9 = r8 & 8
            if (r9 == 0) goto L18
            java.lang.String r4 = r0.aesKey
        L18:
            r9 = r8 & 16
            if (r9 == 0) goto L1e
            long r5 = r0.length
        L1e:
            r8 = r8 & 32
            if (r8 == 0) goto L24
            int r7 = r0.playLength
        L24:
            r9 = r7
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            r2 = r0
            h.Hchat.hooks.api.model.WeChatVideoMsg r0 = r2.copy(r3, r4, r5, r6, r7, r9)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.md5
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.newMd5
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.cdnVideoUrl
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.aesKey
            return r0
    }

    public final long component5() {
            r2 = this;
            long r0 = r2.length
            return r0
    }

    public final int component6() {
            r1 = this;
            int r0 = r1.playLength
            return r0
    }

    public final h.Hchat.hooks.api.model.WeChatVideoMsg copy(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, long r13, int r15) {
            r8 = this;
            r9.getClass()
            r10.getClass()
            r11.getClass()
            r12.getClass()
            h.Hchat.hooks.api.model.WeChatVideoMsg r0 = new h.Hchat.hooks.api.model.WeChatVideoMsg
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r7)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof h.Hchat.hooks.api.model.WeChatVideoMsg
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            h.Hchat.hooks.api.model.WeChatVideoMsg r8 = (h.Hchat.hooks.api.model.WeChatVideoMsg) r8
            java.lang.String r1 = r7.md5
            java.lang.String r3 = r8.md5
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.newMd5
            java.lang.String r3 = r8.newMd5
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r7.cdnVideoUrl
            java.lang.String r3 = r8.cdnVideoUrl
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r7.aesKey
            java.lang.String r3 = r8.aesKey
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            long r3 = r7.length
            long r5 = r8.length
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L41
            return r2
        L41:
            int r1 = r7.playLength
            int r8 = r8.playLength
            if (r1 == r8) goto L48
            return r2
        L48:
            return r0
    }

    public final java.lang.String getAesKey() {
            r1 = this;
            java.lang.String r0 = r1.aesKey
            return r0
    }

    public final java.lang.String getCdnVideoUrl() {
            r1 = this;
            java.lang.String r0 = r1.cdnVideoUrl
            return r0
    }

    public final long getLength() {
            r2 = this;
            long r0 = r2.length
            return r0
    }

    public final java.lang.String getMd5() {
            r1 = this;
            java.lang.String r0 = r1.md5
            return r0
    }

    public final java.lang.String getNewMd5() {
            r1 = this;
            java.lang.String r0 = r1.newMd5
            return r0
    }

    public final int getPlayLength() {
            r1 = this;
            int r0 = r1.playLength
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.md5
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.newMd5
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.cdnVideoUrl
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.aesKey
            int r0 = eh.a.g(r0, r1, r2)
            long r2 = r4.length
            int r0 = eh.a.f(r0, r1, r2)
            int r1 = r4.playLength
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r10 = this;
            java.lang.String r0 = r10.md5
            java.lang.String r1 = r10.newMd5
            java.lang.String r2 = r10.cdnVideoUrl
            java.lang.String r3 = r10.aesKey
            long r4 = r10.length
            int r6 = r10.playLength
            java.lang.String r7 = ", newMd5="
            java.lang.String r8 = ", cdnVideoUrl="
            java.lang.String r9 = "WeChatVideoMsg(md5="
            java.lang.StringBuilder r0 = bc.e.p(r9, r0, r7, r1, r8)
            java.lang.String r1 = ", aesKey="
            java.lang.String r7 = ", length="
            j8.b.t(r0, r2, r1, r3, r7)
            r0.append(r4)
            java.lang.String r1 = ", playLength="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
