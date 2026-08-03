package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5332 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C5332 f19919 = null;

    static {
            Yue.ۥۡۦۥ۠ r0 = new Yue.ۥۡۦۥ۠
            r0.<init>()
            Yue.C5332.f19919 = r0
            return
    }

    public C5332() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.String m20165(@Yue.InterfaceC4418 Yue.C5317 r3, @Yue.InterfaceC4418 java.net.Proxy.Type r4) {
            r2 = this;
            java.lang.String r0 = "request"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "proxyType"
            Yue.C3329.m13906(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.m20086()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            Yue.ۥۡۦۥ۠ r1 = Yue.C5332.f19919
            boolean r4 = r1.m20166(r3, r4)
            if (r4 == 0) goto L2b
            Yue.ۥ۠ۤۨۥ r3 = r3.m20090()
            r0.append(r3)
            goto L36
        L2b:
            Yue.ۥ۠ۤۨۥ r3 = r3.m20090()
            java.lang.String r3 = r1.m20167(r3)
            r0.append(r3)
        L36:
            java.lang.String r3 = " HTTP/1.1"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "StringBuilder().apply(builderAction).toString()"
            Yue.C3329.m13905(r3, r4)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean m20166(Yue.C5317 r1, java.net.Proxy.Type r2) {
            r0 = this;
            boolean r1 = r1.m20085()
            if (r1 != 0) goto Lc
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP
            if (r2 != r1) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.lang.String m20167(@Yue.InterfaceC4418 Yue.C3171 r3) {
            r2 = this;
            java.lang.String r0 = "url"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = r3.m13458()
            java.lang.String r3 = r3.m13460()
            if (r3 == 0) goto L23
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r0 = 63
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
        L23:
            return r0
    }
}
