package h.Hchat.hooks.api.model;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatFileMsg {
    public static final int $stable = 0;
    public final java.lang.String attachId;
    public final java.lang.String ext;
    public final java.lang.String fileName;
    public final java.lang.String key;
    public final java.lang.String md5;
    public final long size;
    public final java.lang.String title;
    public final java.lang.String url;

    public WeChatFileMsg(java.lang.String r1, long r2, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r0 = this;
            j8.b.q(r1, r4, r5, r6, r7)
            r8.getClass()
            r9.getClass()
            r0.<init>()
            r0.title = r1
            r0.size = r2
            r0.ext = r4
            r0.md5 = r5
            r0.url = r6
            r0.key = r7
            r0.attachId = r8
            r0.fileName = r9
            return
    }

    public static /* synthetic */ h.Hchat.hooks.api.model.WeChatFileMsg copy$default(h.Hchat.hooks.api.model.WeChatFileMsg r0, java.lang.String r1, long r2, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, java.lang.Object r11) {
            r11 = r10 & 1
            if (r11 == 0) goto L6
            java.lang.String r1 = r0.title
        L6:
            r11 = r10 & 2
            if (r11 == 0) goto Lc
            long r2 = r0.size
        Lc:
            r11 = r10 & 4
            if (r11 == 0) goto L12
            java.lang.String r4 = r0.ext
        L12:
            r11 = r10 & 8
            if (r11 == 0) goto L18
            java.lang.String r5 = r0.md5
        L18:
            r11 = r10 & 16
            if (r11 == 0) goto L1e
            java.lang.String r6 = r0.url
        L1e:
            r11 = r10 & 32
            if (r11 == 0) goto L24
            java.lang.String r7 = r0.key
        L24:
            r11 = r10 & 64
            if (r11 == 0) goto L2a
            java.lang.String r8 = r0.attachId
        L2a:
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L30
            java.lang.String r9 = r0.fileName
        L30:
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r2 = r0
            r3 = r1
            h.Hchat.hooks.api.model.WeChatFileMsg r0 = r2.copy(r3, r4, r6, r7, r8, r9, r10, r11)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.title
            return r0
    }

    public final long component2() {
            r2 = this;
            long r0 = r2.size
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.ext
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.md5
            return r0
    }

    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.url
            return r0
    }

    public final java.lang.String component6() {
            r1 = this;
            java.lang.String r0 = r1.key
            return r0
    }

    public final java.lang.String component7() {
            r1 = this;
            java.lang.String r0 = r1.attachId
            return r0
    }

    public final java.lang.String component8() {
            r1 = this;
            java.lang.String r0 = r1.fileName
            return r0
    }

    public final h.Hchat.hooks.api.model.WeChatFileMsg copy(java.lang.String r11, long r12, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19) {
            r10 = this;
            r6 = r16
            r7 = r17
            j8.b.q(r11, r14, r15, r6, r7)
            r18.getClass()
            r19.getClass()
            h.Hchat.hooks.api.model.WeChatFileMsg r0 = new h.Hchat.hooks.api.model.WeChatFileMsg
            r1 = r11
            r2 = r12
            r4 = r14
            r5 = r15
            r8 = r18
            r9 = r19
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof h.Hchat.hooks.api.model.WeChatFileMsg
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            h.Hchat.hooks.api.model.WeChatFileMsg r8 = (h.Hchat.hooks.api.model.WeChatFileMsg) r8
            java.lang.String r1 = r7.title
            java.lang.String r3 = r8.title
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.size
            long r5 = r8.size
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L20
            return r2
        L20:
            java.lang.String r1 = r7.ext
            java.lang.String r3 = r8.ext
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2b
            return r2
        L2b:
            java.lang.String r1 = r7.md5
            java.lang.String r3 = r8.md5
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L36
            return r2
        L36:
            java.lang.String r1 = r7.url
            java.lang.String r3 = r8.url
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L41
            return r2
        L41:
            java.lang.String r1 = r7.key
            java.lang.String r3 = r8.key
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L4c
            return r2
        L4c:
            java.lang.String r1 = r7.attachId
            java.lang.String r3 = r8.attachId
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L57
            return r2
        L57:
            java.lang.String r1 = r7.fileName
            java.lang.String r8 = r8.fileName
            boolean r8 = gg.l.a(r1, r8)
            if (r8 != 0) goto L62
            return r2
        L62:
            return r0
    }

    public final java.lang.String getAttachId() {
            r1 = this;
            java.lang.String r0 = r1.attachId
            return r0
    }

    public final java.lang.String getExt() {
            r1 = this;
            java.lang.String r0 = r1.ext
            return r0
    }

    public final java.lang.String getFileName() {
            r1 = this;
            java.lang.String r0 = r1.fileName
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

    public final long getSize() {
            r2 = this;
            long r0 = r2.size
            return r0
    }

    public final java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.title
            return r0
    }

    public final java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = r1.url
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.title
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.size
            int r0 = eh.a.f(r0, r1, r2)
            java.lang.String r2 = r4.ext
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.md5
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.url
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.key
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.attachId
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r4.fileName
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r11 = this;
            java.lang.String r0 = r11.title
            long r1 = r11.size
            java.lang.String r3 = r11.ext
            java.lang.String r4 = r11.md5
            java.lang.String r5 = r11.url
            java.lang.String r6 = r11.key
            java.lang.String r7 = r11.attachId
            java.lang.String r8 = r11.fileName
            java.lang.String r9 = "WeChatFileMsg(title="
            java.lang.String r10 = ", size="
            java.lang.StringBuilder r0 = eh.a.v(r9, r0, r10, r1)
            java.lang.String r1 = ", ext="
            java.lang.String r2 = ", md5="
            j8.b.t(r0, r1, r3, r2, r4)
            java.lang.String r1 = ", url="
            java.lang.String r2 = ", key="
            j8.b.t(r0, r1, r5, r2, r6)
            java.lang.String r1 = ", attachId="
            java.lang.String r2 = ", fileName="
            j8.b.t(r0, r1, r7, r2, r8)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
