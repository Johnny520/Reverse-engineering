package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1673 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C1673 f5259 = null;

    static {
            Yue.ۥ۟ۧۨۤ r0 = new Yue.ۥ۟ۧۨۤ
            r0.<init>()
            Yue.C1673.f5259 = r0
            return
    }

    public C1673() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    @Yue.InterfaceC3422
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String m8046(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 java.lang.String r3) {
            java.lang.String r0 = "username"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "password"
            Yue.C3329.m13906(r3, r0)
            r0 = 0
            r1 = 4
            java.lang.String r2 = m8048(r2, r3, r0, r1, r0)
            return r2
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    @Yue.InterfaceC3422
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String m8047(@Yue.InterfaceC4418 java.lang.String r1, @Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 java.nio.charset.Charset r3) {
            java.lang.String r0 = "username"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "password"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            Yue.ۥۣ۟ۥۤ$ۥ r2 = Yue.C0879.f2556
            Yue.ۥۣ۟ۥۤ r1 = r2.m5120(r1, r3)
            java.lang.String r1 = r1.mo5059()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Basic "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m8048(java.lang.String r0, java.lang.String r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) {
            r3 = r3 & 4
            if (r3 == 0) goto Lb
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.ISO_8859_1
            java.lang.String r3 = "ISO_8859_1"
            Yue.C3329.m13905(r2, r3)
        Lb:
            java.lang.String r0 = m8047(r0, r1, r2)
            return r0
    }
}
