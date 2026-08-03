package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC6281 extends java.lang.Enum<Yue.EnumC6281> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.EnumC6281.C6282 f22346 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final Yue.EnumC6281 f22347 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final Yue.EnumC6281 f22348 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final Yue.EnumC6281 f22349 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final Yue.EnumC6281 f22350 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final Yue.EnumC6281 f22351 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.EnumC6281[] f22352 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.String f22353;

    /* JADX INFO: renamed from: Yue.ۥۢۡۧ۟$ۥ, reason: contains not printable characters */
    public static final class C6282 {
        public C6282() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C6282(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.EnumC6281 m23398(@Yue.InterfaceC4418 java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = "javaName"
                Yue.C3329.m13906(r4, r0)
                int r0 = r4.hashCode()
                r1 = 79201641(0x4b88569, float:4.338071E-36)
                if (r0 == r1) goto L43
                r1 = 79923350(0x4c38896, float:4.5969714E-36)
                if (r0 == r1) goto L38
                switch(r0) {
                    case -503070503: goto L2d;
                    case -503070502: goto L22;
                    case -503070501: goto L17;
                    default: goto L16;
                }
            L16:
                goto L4e
            L17:
                java.lang.String r0 = "TLSv1.3"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L4e
                Yue.ۥۢۡۧ۟ r4 = Yue.EnumC6281.f22347
                goto L4d
            L22:
                java.lang.String r0 = "TLSv1.2"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L4e
                Yue.ۥۢۡۧ۟ r4 = Yue.EnumC6281.f22348
                goto L4d
            L2d:
                java.lang.String r0 = "TLSv1.1"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L4e
                Yue.ۥۢۡۧ۟ r4 = Yue.EnumC6281.f22349
                goto L4d
            L38:
                java.lang.String r0 = "TLSv1"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L4e
                Yue.ۥۢۡۧ۟ r4 = Yue.EnumC6281.f22350
                goto L4d
            L43:
                java.lang.String r0 = "SSLv3"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L4e
                Yue.ۥۢۡۧ۟ r4 = Yue.EnumC6281.f22351
            L4d:
                return r4
            L4e:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unexpected TLS version: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }
    }

    static {
            Yue.ۥۢۡۧ۟ r0 = new Yue.ۥۢۡۧ۟
            r1 = 0
            java.lang.String r2 = "TLSv1.3"
            java.lang.String r3 = "TLS_1_3"
            r0.<init>(r3, r1, r2)
            Yue.EnumC6281.f22347 = r0
            Yue.ۥۢۡۧ۟ r0 = new Yue.ۥۢۡۧ۟
            r1 = 1
            java.lang.String r2 = "TLSv1.2"
            java.lang.String r3 = "TLS_1_2"
            r0.<init>(r3, r1, r2)
            Yue.EnumC6281.f22348 = r0
            Yue.ۥۢۡۧ۟ r0 = new Yue.ۥۢۡۧ۟
            r1 = 2
            java.lang.String r2 = "TLSv1.1"
            java.lang.String r3 = "TLS_1_1"
            r0.<init>(r3, r1, r2)
            Yue.EnumC6281.f22349 = r0
            Yue.ۥۢۡۧ۟ r0 = new Yue.ۥۢۡۧ۟
            r1 = 3
            java.lang.String r2 = "TLSv1"
            java.lang.String r3 = "TLS_1_0"
            r0.<init>(r3, r1, r2)
            Yue.EnumC6281.f22350 = r0
            Yue.ۥۢۡۧ۟ r0 = new Yue.ۥۢۡۧ۟
            r1 = 4
            java.lang.String r2 = "SSLv3"
            java.lang.String r3 = "SSL_3_0"
            r0.<init>(r3, r1, r2)
            Yue.EnumC6281.f22351 = r0
            Yue.ۥۢۡۧ۟[] r0 = m23394()
            Yue.EnumC6281.f22352 = r0
            Yue.ۥۢۡۧ۟$ۥ r0 = new Yue.ۥۢۡۧ۟$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.EnumC6281.f22346 = r0
            return
    }

    EnumC6281(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f22353 = r3
            return
    }

    public static Yue.EnumC6281 valueOf(java.lang.String r1) {
            java.lang.Class<Yue.ۥۢۡۧ۟> r0 = Yue.EnumC6281.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            Yue.ۥۢۡۧ۟ r1 = (Yue.EnumC6281) r1
            return r1
    }

    public static Yue.EnumC6281[] values() {
            Yue.ۥۢۡۧ۟[] r0 = Yue.EnumC6281.f22352
            java.lang.Object r0 = r0.clone()
            Yue.ۥۢۡۧ۟[] r0 = (Yue.EnumC6281[]) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.EnumC6281[] m23394() {
            Yue.ۥۢۡۧ۟ r0 = Yue.EnumC6281.f22347
            Yue.ۥۢۡۧ۟ r1 = Yue.EnumC6281.f22348
            Yue.ۥۢۡۧ۟ r2 = Yue.EnumC6281.f22349
            Yue.ۥۢۡۧ۟ r3 = Yue.EnumC6281.f22350
            Yue.ۥۢۡۧ۟ r4 = Yue.EnumC6281.f22351
            Yue.ۥۢۡۧ۟[] r0 = new Yue.EnumC6281[]{r0, r1, r2, r3, r4}
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Yue.EnumC6281 m23395(@Yue.InterfaceC4418 java.lang.String r1) {
            Yue.ۥۢۡۧ۟$ۥ r0 = Yue.EnumC6281.f22346
            Yue.ۥۢۡۧ۟ r1 = r0.m23398(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "javaName", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_javaName")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final java.lang.String m23396() {
            r1 = this;
            java.lang.String r0 = r1.f22353
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "javaName")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final java.lang.String m23397() {
            r1 = this;
            java.lang.String r0 = r1.f22353
            return r0
    }
}
