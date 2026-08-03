package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nConnectionSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,350:1\n11065#2:351\n11400#2,3:352\n11065#2:355\n11400#2,3:356\n*S KotlinDebug\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec\n*L\n59#1:351\n59#1:352,3\n75#1:355\n75#1:356,3\n*E\n"})
public final class C1487 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C1487.C1489 f4634 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C1134[] f4635 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C1134[] f4636 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public static final Yue.C1487 f4637 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public static final Yue.C1487 f4638 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public static final Yue.C1487 f4639 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public static final Yue.C1487 f4640 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final boolean f4641;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean f4642;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.String[] f4643;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.String[] f4644;

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۧۨ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nConnectionSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,350:1\n1#2:351\n11065#3:352\n11400#3,3:353\n11065#3:358\n11400#3,3:359\n37#4,2:356\n37#4,2:362\n*S KotlinDebug\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec$Builder\n*L\n225#1:352\n225#1:353,3\n244#1:358\n244#1:359,3\n225#1:356,2\n244#1:362,2\n*E\n"})
    public static final class C1488 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean f4645;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4543
        public java.lang.String[] f4646;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4543
        public java.lang.String[] f4647;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f4648;

        public C1488(@Yue.InterfaceC4418 Yue.C1487 r2) {
                r1 = this;
                java.lang.String r0 = "connectionSpec"
                Yue.C3329.m13906(r2, r0)
                r1.<init>()
                boolean r0 = r2.m7332()
                r1.f4645 = r0
                java.lang.String[] r0 = Yue.C1487.m7324(r2)
                r1.f4646 = r0
                java.lang.String[] r0 = Yue.C1487.m7325(r2)
                r1.f4647 = r0
                boolean r2 = r2.m7334()
                r1.f4648 = r2
                return
        }

        public C1488(boolean r1) {
                r0 = this;
                r0.<init>()
                r0.f4645 = r1
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C1487.C1488 m7336() {
                r2 = this;
                boolean r0 = r2.f4645
                if (r0 == 0) goto L8
                r0 = 0
                r2.f4646 = r0
                return r2
            L8:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "no cipher suites for cleartext connections"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Yue.C1487.C1488 m7337() {
                r2 = this;
                boolean r0 = r2.f4645
                if (r0 == 0) goto L8
                r0 = 0
                r2.f4647 = r0
                return r2
            L8:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "no TLS versions for cleartext connections"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.C1487 m7338() {
                r5 = this;
                Yue.ۥ۟ۦۧۨ r0 = new Yue.ۥ۟ۦۧۨ
                boolean r1 = r5.f4645
                boolean r2 = r5.f4648
                java.lang.String[] r3 = r5.f4646
                java.lang.String[] r4 = r5.f4647
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final Yue.C1487.C1488 m7339(@Yue.InterfaceC4418 Yue.C1134... r6) {
                r5 = this;
                java.lang.String r0 = "cipherSuites"
                Yue.C3329.m13906(r6, r0)
                boolean r0 = r5.f4645
                if (r0 == 0) goto L34
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r6.length
                r0.<init>(r1)
                int r1 = r6.length
                r2 = 0
                r3 = r2
            L12:
                if (r3 >= r1) goto L20
                r4 = r6[r3]
                java.lang.String r4 = r4.m5953()
                r0.add(r4)
                int r3 = r3 + 1
                goto L12
            L20:
                java.lang.String[] r6 = new java.lang.String[r2]
                java.lang.Object[] r6 = r0.toArray(r6)
                java.lang.String[] r6 = (java.lang.String[]) r6
                int r0 = r6.length
                java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
                java.lang.String[] r6 = (java.lang.String[]) r6
                Yue.ۥ۟ۦۧۨ$ۥ r6 = r5.m7340(r6)
                return r6
            L34:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "no cipher suites for cleartext connections"
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final Yue.C1487.C1488 m7340(@Yue.InterfaceC4418 java.lang.String... r3) {
                r2 = this;
                java.lang.String r0 = "cipherSuites"
                Yue.C3329.m13906(r3, r0)
                boolean r0 = r2.f4645
                if (r0 == 0) goto L28
                int r0 = r3.length
                r1 = 1
                if (r0 != 0) goto Lf
                r0 = r1
                goto L10
            Lf:
                r0 = 0
            L10:
                r0 = r0 ^ r1
                if (r0 == 0) goto L1c
                java.lang.Object r3 = r3.clone()
                java.lang.String[] r3 = (java.lang.String[]) r3
                r2.f4646 = r3
                return r2
            L1c:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "At least one cipher suite is required"
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
            L28:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "no cipher suites for cleartext connections"
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final java.lang.String[] m7341() {
                r1 = this;
                java.lang.String[] r0 = r1.f4646
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final boolean m7342() {
                r1 = this;
                boolean r0 = r1.f4648
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final boolean m7343() {
                r1 = this;
                boolean r0 = r1.f4645
                return r0
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final java.lang.String[] m7344() {
                r1 = this;
                java.lang.String[] r0 = r1.f4647
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final void m7345(@Yue.InterfaceC4543 java.lang.String[] r1) {
                r0 = this;
                r0.f4646 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final void m7346(boolean r1) {
                r0 = this;
                r0.f4648 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m7347(boolean r1) {
                r0 = this;
                r0.f4645 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final void m7348(@Yue.InterfaceC4543 java.lang.String[] r1) {
                r0 = this;
                r0.f4647 = r1
                return
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC1816(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public final Yue.C1487.C1488 m7349(boolean r2) {
                r1 = this;
                boolean r0 = r1.f4645
                if (r0 == 0) goto L7
                r1.f4648 = r2
                return r1
            L7:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "no TLS extensions for cleartext connections"
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final Yue.C1487.C1488 m7350(@Yue.InterfaceC4418 Yue.EnumC6281... r6) {
                r5 = this;
                java.lang.String r0 = "tlsVersions"
                Yue.C3329.m13906(r6, r0)
                boolean r0 = r5.f4645
                if (r0 == 0) goto L34
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r6.length
                r0.<init>(r1)
                int r1 = r6.length
                r2 = 0
                r3 = r2
            L12:
                if (r3 >= r1) goto L20
                r4 = r6[r3]
                java.lang.String r4 = r4.m23397()
                r0.add(r4)
                int r3 = r3 + 1
                goto L12
            L20:
                java.lang.String[] r6 = new java.lang.String[r2]
                java.lang.Object[] r6 = r0.toArray(r6)
                java.lang.String[] r6 = (java.lang.String[]) r6
                int r0 = r6.length
                java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
                java.lang.String[] r6 = (java.lang.String[]) r6
                Yue.ۥ۟ۦۧۨ$ۥ r6 = r5.m7351(r6)
                return r6
            L34:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "no TLS versions for cleartext connections"
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final Yue.C1487.C1488 m7351(@Yue.InterfaceC4418 java.lang.String... r3) {
                r2 = this;
                java.lang.String r0 = "tlsVersions"
                Yue.C3329.m13906(r3, r0)
                boolean r0 = r2.f4645
                if (r0 == 0) goto L28
                int r0 = r3.length
                r1 = 1
                if (r0 != 0) goto Lf
                r0 = r1
                goto L10
            Lf:
                r0 = 0
            L10:
                r0 = r0 ^ r1
                if (r0 == 0) goto L1c
                java.lang.Object r3 = r3.clone()
                java.lang.String[] r3 = (java.lang.String[]) r3
                r2.f4647 = r3
                return r2
            L1c:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "At least one TLS version is required"
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
            L28:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "no TLS versions for cleartext connections"
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۧۨ$ۥ۟, reason: contains not printable characters */
    public static final class C1489 {
        public C1489() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C1489(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            Yue.ۥ۟ۦۧۨ$ۥ۟ r0 = new Yue.ۥ۟ۦۧۨ$ۥ۟
            r1 = 0
            r0.<init>(r1)
            Yue.C1487.f4634 = r0
            Yue.ۥ۟ۤۦۣ r0 = Yue.C1134.f3495
            Yue.ۥ۟ۤۦۣ r1 = Yue.C1134.f3496
            Yue.ۥ۟ۤۦۣ r11 = Yue.C1134.f3497
            Yue.ۥ۟ۤۦۣ r12 = Yue.C1134.f3481
            Yue.ۥ۟ۤۦۣ r13 = Yue.C1134.f3485
            Yue.ۥ۟ۤۦۣ r14 = Yue.C1134.f3482
            Yue.ۥ۟ۤۦۣ r15 = Yue.C1134.f3486
            Yue.ۥ۟ۤۦۣ r16 = Yue.C1134.f3492
            Yue.ۥ۟ۤۦۣ r17 = Yue.C1134.f3491
            r2 = r0
            r3 = r1
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = r17
            Yue.ۥ۟ۤۦۣ[] r10 = new Yue.C1134[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            Yue.C1487.f4635 = r10
            Yue.ۥ۟ۤۦۣ r18 = Yue.C1134.f3466
            Yue.ۥ۟ۤۦۣ r19 = Yue.C1134.f3467
            Yue.ۥ۟ۤۦۣ r20 = Yue.C1134.f3438
            Yue.ۥ۟ۤۦۣ r21 = Yue.C1134.f3439
            Yue.ۥ۟ۤۦۣ r22 = Yue.C1134.f3410
            Yue.ۥ۟ۤۦۣ r23 = Yue.C1134.f3414
            Yue.ۥ۟ۤۦۣ r24 = Yue.C1134.f3388
            r0 = r10
            r10 = r17
            r11 = r18
            r12 = r19
            r13 = r20
            r14 = r21
            r15 = r22
            r16 = r23
            r17 = r24
            Yue.ۥ۟ۤۦۣ[] r1 = new Yue.C1134[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17}
            Yue.C1487.f4636 = r1
            Yue.ۥ۟ۦۧۨ$ۥ r2 = new Yue.ۥ۟ۦۧۨ$ۥ
            r3 = 1
            r2.<init>(r3)
            int r4 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            Yue.ۥ۟ۤۦۣ[] r0 = (Yue.C1134[]) r0
            Yue.ۥ۟ۦۧۨ$ۥ r0 = r2.m7339(r0)
            Yue.ۥۢۡۧ۟ r2 = Yue.EnumC6281.f22347
            Yue.ۥۢۡۧ۟ r4 = Yue.EnumC6281.f22348
            Yue.ۥۢۡۧ۟[] r5 = new Yue.EnumC6281[]{r2, r4}
            Yue.ۥ۟ۦۧۨ$ۥ r0 = r0.m7350(r5)
            Yue.ۥ۟ۦۧۨ$ۥ r0 = r0.m7349(r3)
            Yue.ۥ۟ۦۧۨ r0 = r0.m7338()
            Yue.C1487.f4637 = r0
            Yue.ۥ۟ۦۧۨ$ۥ r0 = new Yue.ۥ۟ۦۧۨ$ۥ
            r0.<init>(r3)
            int r5 = r1.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r1, r5)
            Yue.ۥ۟ۤۦۣ[] r5 = (Yue.C1134[]) r5
            Yue.ۥ۟ۦۧۨ$ۥ r0 = r0.m7339(r5)
            Yue.ۥۢۡۧ۟[] r5 = new Yue.EnumC6281[]{r2, r4}
            Yue.ۥ۟ۦۧۨ$ۥ r0 = r0.m7350(r5)
            Yue.ۥ۟ۦۧۨ$ۥ r0 = r0.m7349(r3)
            Yue.ۥ۟ۦۧۨ r0 = r0.m7338()
            Yue.C1487.f4638 = r0
            Yue.ۥ۟ۦۧۨ$ۥ r0 = new Yue.ۥ۟ۦۧۨ$ۥ
            r0.<init>(r3)
            int r5 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r5)
            Yue.ۥ۟ۤۦۣ[] r1 = (Yue.C1134[]) r1
            Yue.ۥ۟ۦۧۨ$ۥ r0 = r0.m7339(r1)
            Yue.ۥۢۡۧ۟ r1 = Yue.EnumC6281.f22349
            Yue.ۥۢۡۧ۟ r5 = Yue.EnumC6281.f22350
            Yue.ۥۢۡۧ۟[] r1 = new Yue.EnumC6281[]{r2, r4, r1, r5}
            Yue.ۥ۟ۦۧۨ$ۥ r0 = r0.m7350(r1)
            Yue.ۥ۟ۦۧۨ$ۥ r0 = r0.m7349(r3)
            Yue.ۥ۟ۦۧۨ r0 = r0.m7338()
            Yue.C1487.f4639 = r0
            Yue.ۥ۟ۦۧۨ$ۥ r0 = new Yue.ۥ۟ۦۧۨ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.ۥ۟ۦۧۨ r0 = r0.m7338()
            Yue.C1487.f4640 = r0
            return
    }

    public C1487(boolean r1, boolean r2, @Yue.InterfaceC4543 java.lang.String[] r3, @Yue.InterfaceC4543 java.lang.String[] r4) {
            r0 = this;
            r0.<init>()
            r0.f4641 = r1
            r0.f4642 = r2
            r0.f4643 = r3
            r0.f4644 = r4
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.String[] m7324(Yue.C1487 r0) {
            java.lang.String[] r0 = r0.f4643
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.String[] m7325(Yue.C1487 r0) {
            java.lang.String[] r0 = r0.f4644
            return r0
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof Yue.C1487
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r5 != r4) goto La
            return r0
        La:
            boolean r2 = r4.f4641
            Yue.ۥ۟ۦۧۨ r5 = (Yue.C1487) r5
            boolean r3 = r5.f4641
            if (r2 == r3) goto L13
            return r1
        L13:
            if (r2 == 0) goto L32
            java.lang.String[] r2 = r4.f4643
            java.lang.String[] r3 = r5.f4643
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            java.lang.String[] r2 = r4.f4644
            java.lang.String[] r3 = r5.f4644
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto L2b
            return r1
        L2b:
            boolean r2 = r4.f4642
            boolean r5 = r5.f4642
            if (r2 == r5) goto L32
            return r1
        L32:
            return r0
    }

    public int hashCode() {
            r3 = this;
            boolean r0 = r3.f4641
            if (r0 == 0) goto L25
            java.lang.String[] r0 = r3.f4643
            r1 = 0
            if (r0 == 0) goto Le
            int r0 = java.util.Arrays.hashCode(r0)
            goto Lf
        Le:
            r0 = r1
        Lf:
            r2 = 527(0x20f, float:7.38E-43)
            int r2 = r2 + r0
            int r2 = r2 * 31
            java.lang.String[] r0 = r3.f4644
            if (r0 == 0) goto L1c
            int r1 = java.util.Arrays.hashCode(r0)
        L1c:
            int r2 = r2 + r1
            int r2 = r2 * 31
            boolean r0 = r3.f4642
            r0 = r0 ^ 1
            int r2 = r2 + r0
            goto L27
        L25:
            r2 = 17
        L27:
            return r2
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r3 = this;
            boolean r0 = r3.f4641
            if (r0 != 0) goto L7
            java.lang.String r0 = "ConnectionSpec()"
            return r0
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ConnectionSpec(cipherSuites="
            r0.append(r1)
            java.util.List r1 = r3.m7330()
            java.lang.String r2 = "[all enabled]"
            java.lang.String r1 = java.util.Objects.toString(r1, r2)
            r0.append(r1)
            java.lang.String r1 = ", tlsVersions="
            r0.append(r1)
            java.util.List r1 = r3.m7335()
            java.lang.String r1 = java.util.Objects.toString(r1, r2)
            r0.append(r1)
            java.lang.String r1 = ", supportsTlsExtensions="
            r0.append(r1)
            boolean r1 = r3.f4642
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "cipherSuites", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_cipherSuites")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.List<Yue.C1134> m7326() {
            r1 = this;
            java.util.List r0 = r1.m7330()
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "supportsTlsExtensions", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_supportsTlsExtensions")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean m7327() {
            r1 = this;
            boolean r0 = r1.f4642
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "tlsVersions", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_tlsVersions")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.util.List<Yue.EnumC6281> m7328() {
            r1 = this;
            java.util.List r0 = r1.m7335()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m7329(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۟ۦۧۨ r3 = r1.m7333(r2, r3)
            java.util.List r0 = r3.m7335()
            if (r0 == 0) goto L14
            java.lang.String[] r0 = r3.f4644
            r2.setEnabledProtocols(r0)
        L14:
            java.util.List r0 = r3.m7330()
            if (r0 == 0) goto L1f
            java.lang.String[] r3 = r3.f4643
            r2.setEnabledCipherSuites(r3)
        L1f:
            return
    }

    @Yue.InterfaceC3421(name = "cipherSuites")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final java.util.List<Yue.C1134> m7330() {
            r6 = this;
            java.lang.String[] r0 = r6.f4643
            if (r0 == 0) goto L21
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L1c
            r4 = r0[r3]
            Yue.ۥ۟ۤۦۣ$ۥ۟ r5 = Yue.C1134.f3378
            Yue.ۥ۟ۤۦۣ r4 = r5.m5956(r4)
            r1.add(r4)
            int r3 = r3 + 1
            goto Lc
        L1c:
            java.util.List r0 = Yue.C1219.m6537(r1)
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m7331(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r5) {
            r4 = this;
            java.lang.String r0 = "socket"
            Yue.C3329.m13906(r5, r0)
            boolean r0 = r4.f4641
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            java.lang.String[] r0 = r4.f4644
            if (r0 == 0) goto L1e
            java.lang.String[] r2 = r5.getEnabledProtocols()
            java.util.Comparator r3 = Yue.C1395.m6940()
            boolean r0 = Yue.C6656.m25578(r0, r2, r3)
            if (r0 != 0) goto L1e
            return r1
        L1e:
            java.lang.String[] r0 = r4.f4643
            if (r0 == 0) goto L33
            java.lang.String[] r5 = r5.getEnabledCipherSuites()
            Yue.ۥ۟ۤۦۣ$ۥ۟ r2 = Yue.C1134.f3378
            java.util.Comparator r2 = r2.m5957()
            boolean r5 = Yue.C6656.m25578(r0, r5, r2)
            if (r5 != 0) goto L33
            return r1
        L33:
            r5 = 1
            return r5
    }

    @Yue.InterfaceC3421(name = "isTls")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m7332() {
            r1 = this;
            boolean r0 = r1.f4641
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final Yue.C1487 m7333(javax.net.ssl.SSLSocket r5, boolean r6) {
            r4 = this;
            java.lang.String[] r0 = r4.f4643
            if (r0 == 0) goto L1a
            java.lang.String[] r0 = r5.getEnabledCipherSuites()
            java.lang.String r1 = "sslSocket.enabledCipherSuites"
            Yue.C3329.m13905(r0, r1)
            java.lang.String[] r1 = r4.f4643
            Yue.ۥ۟ۤۦۣ$ۥ۟ r2 = Yue.C1134.f3378
            java.util.Comparator r2 = r2.m5957()
            java.lang.String[] r0 = Yue.C6656.m25590(r0, r1, r2)
            goto L1e
        L1a:
            java.lang.String[] r0 = r5.getEnabledCipherSuites()
        L1e:
            java.lang.String[] r1 = r4.f4644
            if (r1 == 0) goto L36
            java.lang.String[] r1 = r5.getEnabledProtocols()
            java.lang.String r2 = "sslSocket.enabledProtocols"
            Yue.C3329.m13905(r1, r2)
            java.lang.String[] r2 = r4.f4644
            java.util.Comparator r3 = Yue.C1395.m6940()
            java.lang.String[] r1 = Yue.C6656.m25590(r1, r2, r3)
            goto L3a
        L36:
            java.lang.String[] r1 = r5.getEnabledProtocols()
        L3a:
            java.lang.String[] r5 = r5.getSupportedCipherSuites()
            java.lang.String r2 = "supportedCipherSuites"
            Yue.C3329.m13905(r5, r2)
            Yue.ۥ۟ۤۦۣ$ۥ۟ r2 = Yue.C1134.f3378
            java.util.Comparator r2 = r2.m5957()
            java.lang.String r3 = "TLS_FALLBACK_SCSV"
            int r2 = Yue.C6656.m25582(r5, r3, r2)
            java.lang.String r3 = "cipherSuitesIntersection"
            if (r6 == 0) goto L64
            r6 = -1
            if (r2 == r6) goto L64
            Yue.C3329.m13905(r0, r3)
            r5 = r5[r2]
            java.lang.String r6 = "supportedCipherSuites[indexOfFallbackScsv]"
            Yue.C3329.m13905(r5, r6)
            java.lang.String[] r0 = Yue.C6656.m25570(r0, r5)
        L64:
            Yue.ۥ۟ۦۧۨ$ۥ r5 = new Yue.ۥ۟ۦۧۨ$ۥ
            r5.<init>(r4)
            Yue.C3329.m13905(r0, r3)
            int r6 = r0.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r0, r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            Yue.ۥ۟ۦۧۨ$ۥ r5 = r5.m7340(r6)
            java.lang.String r6 = "tlsVersionsIntersection"
            Yue.C3329.m13905(r1, r6)
            int r6 = r1.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r1, r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            Yue.ۥ۟ۦۧۨ$ۥ r5 = r5.m7351(r6)
            Yue.ۥ۟ۦۧۨ r5 = r5.m7338()
            return r5
    }

    @Yue.InterfaceC3421(name = "supportsTlsExtensions")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final boolean m7334() {
            r1 = this;
            boolean r0 = r1.f4642
            return r0
    }

    @Yue.InterfaceC3421(name = "tlsVersions")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final java.util.List<Yue.EnumC6281> m7335() {
            r6 = this;
            java.lang.String[] r0 = r6.f4644
            if (r0 == 0) goto L21
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L1c
            r4 = r0[r3]
            Yue.ۥۢۡۧ۟$ۥ r5 = Yue.EnumC6281.f22346
            Yue.ۥۢۡۧ۟ r4 = r5.m23398(r4)
            r1.add(r4)
            int r3 = r3 + 1
            goto Lc
        L1c:
            java.util.List r0 = Yue.C1219.m6537(r1)
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
    }
}
