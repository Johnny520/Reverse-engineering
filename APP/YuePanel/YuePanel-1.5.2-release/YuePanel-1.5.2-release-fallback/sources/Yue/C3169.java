package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3169 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C3169 f10460 = null;

    static {
            Yue.ۥۣ۠ۤۨ r0 = new Yue.ۥۣ۠ۤۨ
            r0.<init>()
            Yue.C3169.f10460 = r0
            return
    }

    public C3169() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final boolean m13424(@Yue.InterfaceC4418 java.lang.String r1) {
            java.lang.String r0 = "method"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "GET"
            boolean r0 = Yue.C3329.m13897(r1, r0)
            if (r0 != 0) goto L17
            java.lang.String r0 = "HEAD"
            boolean r1 = Yue.C3329.m13897(r1, r0)
            if (r1 != 0) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            return r1
    }

    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final boolean m13425(@Yue.InterfaceC4418 java.lang.String r1) {
            java.lang.String r0 = "method"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "POST"
            boolean r0 = Yue.C3329.m13897(r1, r0)
            if (r0 != 0) goto L30
            java.lang.String r0 = "PUT"
            boolean r0 = Yue.C3329.m13897(r1, r0)
            if (r0 != 0) goto L30
            java.lang.String r0 = "PATCH"
            boolean r0 = Yue.C3329.m13897(r1, r0)
            if (r0 != 0) goto L30
            java.lang.String r0 = "PROPPATCH"
            boolean r0 = Yue.C3329.m13897(r1, r0)
            if (r0 != 0) goto L30
            java.lang.String r0 = "REPORT"
            boolean r1 = Yue.C3329.m13897(r1, r0)
            if (r1 == 0) goto L2e
            goto L30
        L2e:
            r1 = 0
            goto L31
        L30:
            r1 = 1
        L31:
            return r1
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final boolean m13426(@Yue.InterfaceC4418 java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "method"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "POST"
            boolean r0 = Yue.C3329.m13897(r2, r0)
            if (r0 != 0) goto L30
            java.lang.String r0 = "PATCH"
            boolean r0 = Yue.C3329.m13897(r2, r0)
            if (r0 != 0) goto L30
            java.lang.String r0 = "PUT"
            boolean r0 = Yue.C3329.m13897(r2, r0)
            if (r0 != 0) goto L30
            java.lang.String r0 = "DELETE"
            boolean r0 = Yue.C3329.m13897(r2, r0)
            if (r0 != 0) goto L30
            java.lang.String r0 = "MOVE"
            boolean r2 = Yue.C3329.m13897(r2, r0)
            if (r2 == 0) goto L2e
            goto L30
        L2e:
            r2 = 0
            goto L31
        L30:
            r2 = 1
        L31:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m13427(@Yue.InterfaceC4418 java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "method"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "PROPFIND"
            boolean r2 = Yue.C3329.m13897(r2, r0)
            r2 = r2 ^ 1
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean m13428(@Yue.InterfaceC4418 java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "method"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "PROPFIND"
            boolean r2 = Yue.C3329.m13897(r2, r0)
            return r2
    }
}
