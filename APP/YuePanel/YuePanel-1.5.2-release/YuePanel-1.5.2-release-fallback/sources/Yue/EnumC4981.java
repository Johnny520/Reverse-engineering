package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۥۣۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC4981 extends java.lang.Enum<Yue.EnumC4981> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.EnumC4981.C4982 f15837 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final Yue.EnumC4981 f15838 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final Yue.EnumC4981 f15839 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC1816(message = "OkHttp has dropped support for SPDY. Prefer {@link #HTTP_2}.")
    public static final Yue.EnumC4981 f15840 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final Yue.EnumC4981 f15841 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final Yue.EnumC4981 f15842 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final Yue.EnumC4981 f15843 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final /* synthetic */ Yue.EnumC4981[] f15844 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.String f15845;

    /* JADX INFO: renamed from: Yue.ۥۡۥۣۧ$ۥ, reason: contains not printable characters */
    public static final class C4982 {
        public C4982() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C4982(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.EnumC4981 m19410(@Yue.InterfaceC4418 java.lang.String r4) throws java.io.IOException {
                r3 = this;
                java.lang.String r0 = "protocol"
                Yue.C3329.m13906(r4, r0)
                Yue.ۥۡۥۣۧ r0 = Yue.EnumC4981.f15838
                java.lang.String r1 = Yue.EnumC4981.m19408(r0)
                boolean r1 = Yue.C3329.m13897(r4, r1)
                if (r1 == 0) goto L12
                goto L52
            L12:
                Yue.ۥۡۥۣۧ r0 = Yue.EnumC4981.f15839
                java.lang.String r1 = Yue.EnumC4981.m19408(r0)
                boolean r1 = Yue.C3329.m13897(r4, r1)
                if (r1 == 0) goto L1f
                goto L52
            L1f:
                Yue.ۥۡۥۣۧ r0 = Yue.EnumC4981.f15842
                java.lang.String r1 = Yue.EnumC4981.m19408(r0)
                boolean r1 = Yue.C3329.m13897(r4, r1)
                if (r1 == 0) goto L2c
                goto L52
            L2c:
                Yue.ۥۡۥۣۧ r0 = Yue.EnumC4981.f15841
                java.lang.String r1 = Yue.EnumC4981.m19408(r0)
                boolean r1 = Yue.C3329.m13897(r4, r1)
                if (r1 == 0) goto L39
                goto L52
            L39:
                Yue.ۥۡۥۣۧ r0 = Yue.EnumC4981.f15840
                java.lang.String r1 = Yue.EnumC4981.m19408(r0)
                boolean r1 = Yue.C3329.m13897(r4, r1)
                if (r1 == 0) goto L46
                goto L52
            L46:
                Yue.ۥۡۥۣۧ r0 = Yue.EnumC4981.f15843
                java.lang.String r1 = Yue.EnumC4981.m19408(r0)
                boolean r1 = Yue.C3329.m13897(r4, r1)
                if (r1 == 0) goto L53
            L52:
                return r0
            L53:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unexpected protocol: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }
    }

    static {
            Yue.ۥۡۥۣۧ r0 = new Yue.ۥۡۥۣۧ
            r1 = 0
            java.lang.String r2 = "http/1.0"
            java.lang.String r3 = "HTTP_1_0"
            r0.<init>(r3, r1, r2)
            Yue.EnumC4981.f15838 = r0
            Yue.ۥۡۥۣۧ r0 = new Yue.ۥۡۥۣۧ
            r1 = 1
            java.lang.String r2 = "http/1.1"
            java.lang.String r3 = "HTTP_1_1"
            r0.<init>(r3, r1, r2)
            Yue.EnumC4981.f15839 = r0
            Yue.ۥۡۥۣۧ r0 = new Yue.ۥۡۥۣۧ
            r1 = 2
            java.lang.String r2 = "spdy/3.1"
            java.lang.String r3 = "SPDY_3"
            r0.<init>(r3, r1, r2)
            Yue.EnumC4981.f15840 = r0
            Yue.ۥۡۥۣۧ r0 = new Yue.ۥۡۥۣۧ
            r1 = 3
            java.lang.String r2 = "h2"
            java.lang.String r3 = "HTTP_2"
            r0.<init>(r3, r1, r2)
            Yue.EnumC4981.f15841 = r0
            Yue.ۥۡۥۣۧ r0 = new Yue.ۥۡۥۣۧ
            r1 = 4
            java.lang.String r2 = "h2_prior_knowledge"
            java.lang.String r3 = "H2_PRIOR_KNOWLEDGE"
            r0.<init>(r3, r1, r2)
            Yue.EnumC4981.f15842 = r0
            Yue.ۥۡۥۣۧ r0 = new Yue.ۥۡۥۣۧ
            r1 = 5
            java.lang.String r2 = "quic"
            java.lang.String r3 = "QUIC"
            r0.<init>(r3, r1, r2)
            Yue.EnumC4981.f15843 = r0
            Yue.ۥۡۥۣۧ[] r0 = m19407()
            Yue.EnumC4981.f15844 = r0
            Yue.ۥۡۥۣۧ$ۥ r0 = new Yue.ۥۡۥۣۧ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.EnumC4981.f15837 = r0
            return
    }

    EnumC4981(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f15845 = r3
            return
    }

    public static Yue.EnumC4981 valueOf(java.lang.String r1) {
            java.lang.Class<Yue.ۥۡۥۣۧ> r0 = Yue.EnumC4981.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            Yue.ۥۡۥۣۧ r1 = (Yue.EnumC4981) r1
            return r1
    }

    public static Yue.EnumC4981[] values() {
            Yue.ۥۡۥۣۧ[] r0 = Yue.EnumC4981.f15844
            java.lang.Object r0 = r0.clone()
            Yue.ۥۡۥۣۧ[] r0 = (Yue.EnumC4981[]) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.EnumC4981[] m19407() {
            Yue.ۥۡۥۣۧ r0 = Yue.EnumC4981.f15838
            Yue.ۥۡۥۣۧ r1 = Yue.EnumC4981.f15839
            Yue.ۥۡۥۣۧ r2 = Yue.EnumC4981.f15840
            Yue.ۥۡۥۣۧ r3 = Yue.EnumC4981.f15841
            Yue.ۥۡۥۣۧ r4 = Yue.EnumC4981.f15842
            Yue.ۥۡۥۣۧ r5 = Yue.EnumC4981.f15843
            Yue.ۥۡۥۣۧ[] r0 = new Yue.EnumC4981[]{r0, r1, r2, r3, r4, r5}
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.String m19408(Yue.EnumC4981 r0) {
            java.lang.String r0 = r0.f15845
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Yue.EnumC4981 m19409(@Yue.InterfaceC4418 java.lang.String r1) throws java.io.IOException {
            Yue.ۥۡۥۣۧ$ۥ r0 = Yue.EnumC4981.f15837
            Yue.ۥۡۥۣۧ r1 = r0.m19410(r1)
            return r1
    }

    @Override // java.lang.Enum
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f15845
            return r0
    }
}
