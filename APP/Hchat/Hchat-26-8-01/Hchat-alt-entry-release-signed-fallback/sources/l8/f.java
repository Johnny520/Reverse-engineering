package l8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f7918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f7919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f7920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f7922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f7923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f7924i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h.Hchat.hooks.api.model.WeChatMessage f7925j;

    public f(long r1, long r3, java.lang.String r5, java.lang.String r6, java.lang.String r7, long r8, java.lang.String r10, java.lang.String r11, int r12, h.Hchat.hooks.api.model.WeChatMessage r13) {
            r0 = this;
            r0.<init>()
            r0.f7916a = r1
            r0.f7917b = r3
            java.lang.String r1 = ""
            if (r5 == 0) goto Lc
            goto Ld
        Lc:
            r5 = r1
        Ld:
            r0.f7918c = r5
            if (r6 == 0) goto L12
            goto L13
        L12:
            r6 = r1
        L13:
            r0.f7919d = r6
            if (r7 == 0) goto L18
            goto L19
        L18:
            r7 = r1
        L19:
            r0.f7920e = r7
            r0.f7921f = r8
            if (r10 == 0) goto L20
            goto L21
        L20:
            r10 = r1
        L21:
            r0.f7922g = r10
            if (r11 == 0) goto L26
            goto L27
        L26:
            r11 = r1
        L27:
            r0.f7923h = r11
            r0.f7924i = r12
            r0.f7925j = r13
            return
    }

    public final long a() {
            r4 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r4.f7925j
            if (r0 == 0) goto Ld
            long r0 = r0.createTime
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto Ld
            return r0
        Ld:
            long r0 = r4.f7921f
            return r0
    }
}
