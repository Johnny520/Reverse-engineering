package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2269 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C5215 f7028;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.AbstractC2233 f7029;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C2274 f7030;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2272 f7031;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f7032;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f7033;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C5219 f7034;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۡ۟$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exchange.kt\nokhttp3/internal/connection/Exchange$RequestBodySink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
    public final class C2270 extends Yue.AbstractC2753 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final long f7035;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f7036;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public long f7037;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public boolean f7038;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2269 f7039;

        public C2270(@Yue.InterfaceC4418 Yue.C2269 r2, Yue.InterfaceC5794 r3, long r4) {
                r1 = this;
                java.lang.String r0 = "delegate"
                Yue.C3329.m13906(r3, r0)
                r1.f7039 = r2
                r1.<init>(r3)
                r1.f7035 = r4
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        private final <E extends java.io.IOException> E m10501(E r8) {
                r7 = this;
                boolean r0 = r7.f7036
                if (r0 == 0) goto L5
                return r8
            L5:
                r0 = 1
                r7.f7036 = r0
                Yue.ۥۣ۠ۡ۟ r1 = r7.f7039
                long r2 = r7.f7037
                r4 = 0
                r5 = 1
                r6 = r8
                java.io.IOException r8 = r1.m10477(r2, r4, r5, r6)
                return r8
        }

        @Override // Yue.AbstractC2753, Yue.InterfaceC5794, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r4 = this;
                boolean r0 = r4.f7038
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r4.f7038 = r0
                long r0 = r4.f7035
                r2 = -1
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 == 0) goto L1f
                long r2 = r4.f7037
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 != 0) goto L17
                goto L1f
            L17:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r1 = "unexpected end of stream"
                r0.<init>(r1)
                throw r0
            L1f:
                super.close()     // Catch: java.io.IOException -> L27
                r0 = 0
                r4.m10501(r0)     // Catch: java.io.IOException -> L27
                return
            L27:
                r0 = move-exception
                java.io.IOException r0 = r4.m10501(r0)
                throw r0
        }

        @Override // Yue.AbstractC2753, Yue.InterfaceC5794, java.io.Flushable
        public void flush() throws java.io.IOException {
                r1 = this;
                super.flush()     // Catch: java.io.IOException -> L4
                return
            L4:
                r0 = move-exception
                java.io.IOException r0 = r1.m10501(r0)
                throw r0
        }

        @Override // Yue.AbstractC2753, Yue.InterfaceC5794
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public void mo4176(@Yue.InterfaceC4418 Yue.C0843 r5, long r6) throws java.io.IOException {
                r4 = this;
                java.lang.String r0 = "source"
                Yue.C3329.m13906(r5, r0)
                boolean r0 = r4.f7038
                r0 = r0 ^ 1
                if (r0 == 0) goto L4e
                long r0 = r4.f7035
                r2 = -1
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 == 0) goto L3f
                long r2 = r4.f7037
                long r2 = r2 + r6
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 > 0) goto L1b
                goto L3f
            L1b:
                java.net.ProtocolException r5 = new java.net.ProtocolException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "expected "
                r0.append(r1)
                long r1 = r4.f7035
                r0.append(r1)
                java.lang.String r1 = " bytes but received "
                r0.append(r1)
                long r1 = r4.f7037
                long r1 = r1 + r6
                r0.append(r1)
                java.lang.String r6 = r0.toString()
                r5.<init>(r6)
                throw r5
            L3f:
                super.mo4176(r5, r6)     // Catch: java.io.IOException -> L48
                long r0 = r4.f7037     // Catch: java.io.IOException -> L48
                long r0 = r0 + r6
                r4.f7037 = r0     // Catch: java.io.IOException -> L48
                return
            L48:
                r5 = move-exception
                java.io.IOException r5 = r4.m10501(r5)
                throw r5
            L4e:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "closed"
                java.lang.String r6 = r6.toString()
                r5.<init>(r6)
                throw r5
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۡ۟$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exchange.kt\nokhttp3/internal/connection/Exchange$ResponseBodySource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
    public final class C2271 extends Yue.AbstractC2754 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final long f7040;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public long f7041;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public boolean f7042;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public boolean f7043;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public boolean f7044;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2269 f7045;

        public C2271(@Yue.InterfaceC4418 Yue.C2269 r2, Yue.InterfaceC5839 r3, long r4) {
                r1 = this;
                java.lang.String r0 = "delegate"
                Yue.C3329.m13906(r3, r0)
                r1.f7045 = r2
                r1.<init>(r3)
                r1.f7040 = r4
                r2 = 1
                r1.f7042 = r2
                r2 = 0
                int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r2 != 0) goto L19
                r2 = 0
                r1.m10502(r2)
            L19:
                return
        }

        @Override // Yue.AbstractC2754, Yue.InterfaceC5839, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r1 = this;
                boolean r0 = r1.f7044
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.f7044 = r0
                super.close()     // Catch: java.io.IOException -> L10
                r0 = 0
                r1.m10502(r0)     // Catch: java.io.IOException -> L10
                return
            L10:
                r0 = move-exception
                java.io.IOException r0 = r1.m10502(r0)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final <E extends java.io.IOException> E m10502(E r9) {
                r8 = this;
                boolean r0 = r8.f7043
                if (r0 == 0) goto L5
                return r9
            L5:
                r0 = 1
                r8.f7043 = r0
                if (r9 != 0) goto L20
                boolean r0 = r8.f7042
                if (r0 == 0) goto L20
                r0 = 0
                r8.f7042 = r0
                Yue.ۥۣ۠ۡ۟ r0 = r8.f7045
                Yue.ۥ۠ۡۡ۟ r0 = r0.m10485()
                Yue.ۥۣ۠ۡ۟ r1 = r8.f7045
                Yue.ۥۡۦ۠ۤ r1 = r1.m10483()
                r0.mo10243(r1)
            L20:
                Yue.ۥۣ۠ۡ۟ r2 = r8.f7045
                long r3 = r8.f7041
                r5 = 1
                r6 = 0
                r7 = r9
                java.io.IOException r9 = r2.m10477(r3, r5, r6, r7)
                return r9
        }

        @Override // Yue.AbstractC2754, Yue.InterfaceC5839
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
        public long mo4179(@Yue.InterfaceC4418 Yue.C0843 r8, long r9) throws java.io.IOException {
                r7 = this;
                java.lang.String r0 = "sink"
                Yue.C3329.m13906(r8, r0)
                boolean r0 = r7.f7044
                r0 = r0 ^ 1
                if (r0 == 0) goto L75
                Yue.ۥۣۢ۟ۦ r0 = r7.m12056()     // Catch: java.io.IOException -> L2a
                long r8 = r0.mo4179(r8, r9)     // Catch: java.io.IOException -> L2a
                boolean r10 = r7.f7042     // Catch: java.io.IOException -> L2a
                if (r10 == 0) goto L2c
                r10 = 0
                r7.f7042 = r10     // Catch: java.io.IOException -> L2a
                Yue.ۥۣ۠ۡ۟ r10 = r7.f7045     // Catch: java.io.IOException -> L2a
                Yue.ۥ۠ۡۡ۟ r10 = r10.m10485()     // Catch: java.io.IOException -> L2a
                Yue.ۥۣ۠ۡ۟ r0 = r7.f7045     // Catch: java.io.IOException -> L2a
                Yue.ۥۡۦ۠ۤ r0 = r0.m10483()     // Catch: java.io.IOException -> L2a
                r10.mo10243(r0)     // Catch: java.io.IOException -> L2a
                goto L2c
            L2a:
                r8 = move-exception
                goto L70
            L2c:
                r0 = -1
                int r10 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                r2 = 0
                if (r10 != 0) goto L37
                r7.m10502(r2)     // Catch: java.io.IOException -> L2a
                return r0
            L37:
                long r3 = r7.f7041     // Catch: java.io.IOException -> L2a
                long r3 = r3 + r8
                long r5 = r7.f7040     // Catch: java.io.IOException -> L2a
                int r10 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r10 == 0) goto L66
                int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r10 > 0) goto L45
                goto L66
            L45:
                java.net.ProtocolException r8 = new java.net.ProtocolException     // Catch: java.io.IOException -> L2a
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L2a
                r9.<init>()     // Catch: java.io.IOException -> L2a
                java.lang.String r10 = "expected "
                r9.append(r10)     // Catch: java.io.IOException -> L2a
                long r0 = r7.f7040     // Catch: java.io.IOException -> L2a
                r9.append(r0)     // Catch: java.io.IOException -> L2a
                java.lang.String r10 = " bytes but received "
                r9.append(r10)     // Catch: java.io.IOException -> L2a
                r9.append(r3)     // Catch: java.io.IOException -> L2a
                java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> L2a
                r8.<init>(r9)     // Catch: java.io.IOException -> L2a
                throw r8     // Catch: java.io.IOException -> L2a
            L66:
                r7.f7041 = r3     // Catch: java.io.IOException -> L2a
                int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r10 != 0) goto L6f
                r7.m10502(r2)     // Catch: java.io.IOException -> L2a
            L6f:
                return r8
            L70:
                java.io.IOException r8 = r7.m10502(r8)
                throw r8
            L75:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "closed"
                java.lang.String r9 = r9.toString()
                r8.<init>(r9)
                throw r8
        }
    }

    public C2269(@Yue.InterfaceC4418 Yue.C5215 r2, @Yue.InterfaceC4418 Yue.AbstractC2233 r3, @Yue.InterfaceC4418 Yue.C2274 r4, @Yue.InterfaceC4418 Yue.InterfaceC2272 r5) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "eventListener"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "finder"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "codec"
            Yue.C3329.m13906(r5, r0)
            r1.<init>()
            r1.f7028 = r2
            r1.f7029 = r3
            r1.f7030 = r4
            r1.f7031 = r5
            Yue.ۥۡۦ۠ۥ r2 = r5.mo10508()
            r1.f7034 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final <E extends java.io.IOException> E m10477(long r3, boolean r5, boolean r6, E r7) {
            r2 = this;
            if (r7 == 0) goto L5
            r2.m10497(r7)
        L5:
            if (r6 == 0) goto L18
            if (r7 == 0) goto L11
            Yue.ۥ۠ۡۡ۟ r0 = r2.f7029
            Yue.ۥۡۦ۠ۤ r1 = r2.f7028
            r0.mo10239(r1, r7)
            goto L18
        L11:
            Yue.ۥ۠ۡۡ۟ r0 = r2.f7029
            Yue.ۥۡۦ۠ۤ r1 = r2.f7028
            r0.mo10237(r1, r3)
        L18:
            if (r5 == 0) goto L2b
            if (r7 == 0) goto L24
            Yue.ۥ۠ۡۡ۟ r3 = r2.f7029
            Yue.ۥۡۦ۠ۤ r4 = r2.f7028
            r3.mo10244(r4, r7)
            goto L2b
        L24:
            Yue.ۥ۠ۡۡ۟ r0 = r2.f7029
            Yue.ۥۡۦ۠ۤ r1 = r2.f7028
            r0.mo10242(r1, r3)
        L2b:
            Yue.ۥۡۦ۠ۤ r3 = r2.f7028
            java.io.IOException r3 = r3.m19690(r2, r6, r5, r7)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m10478() {
            r1 = this;
            Yue.ۥۣ۠ۡ۠ r0 = r1.f7031
            r0.cancel()
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.InterfaceC5794 m10479(@Yue.InterfaceC4418 Yue.C5317 r4, boolean r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "request"
            Yue.C3329.m13906(r4, r0)
            r3.f7032 = r5
            Yue.ۥۡۦۥ r5 = r4.m20079()
            Yue.C3329.m13903(r5)
            long r0 = r5.mo12019()
            Yue.ۥ۠ۡۡ۟ r5 = r3.f7029
            Yue.ۥۡۦ۠ۤ r2 = r3.f7028
            r5.mo10238(r2)
            Yue.ۥۣ۠ۡ۠ r5 = r3.f7031
            Yue.ۥۣۢ۟ۡ r4 = r5.mo10504(r4, r0)
            Yue.ۥۣ۠ۡ۟$ۥ r5 = new Yue.ۥۣ۠ۡ۟$ۥ
            r5.<init>(r3, r4, r0)
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m10480() {
            r3 = this;
            Yue.ۥۣ۠ۡ۠ r0 = r3.f7031
            r0.cancel()
            Yue.ۥۡۦ۠ۤ r0 = r3.f7028
            r1 = 1
            r2 = 0
            r0.m19690(r3, r1, r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m10481() throws java.io.IOException {
            r3 = this;
            Yue.ۥۣ۠ۡ۠ r0 = r3.f7031     // Catch: java.io.IOException -> L6
            r0.mo10505()     // Catch: java.io.IOException -> L6
            return
        L6:
            r0 = move-exception
            Yue.ۥ۠ۡۡ۟ r1 = r3.f7029
            Yue.ۥۡۦ۠ۤ r2 = r3.f7028
            r1.mo10239(r2, r0)
            r3.m10497(r0)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m10482() throws java.io.IOException {
            r3 = this;
            Yue.ۥۣ۠ۡ۠ r0 = r3.f7031     // Catch: java.io.IOException -> L6
            r0.mo10509()     // Catch: java.io.IOException -> L6
            return
        L6:
            r0 = move-exception
            Yue.ۥ۠ۡۡ۟ r1 = r3.f7029
            Yue.ۥۡۦ۠ۤ r2 = r3.f7028
            r1.mo10239(r2, r0)
            r3.m10497(r0)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final Yue.C5215 m10483() {
            r1 = this;
            Yue.ۥۡۦ۠ۤ r0 = r1.f7028
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final Yue.C5219 m10484() {
            r1 = this;
            Yue.ۥۡۦ۠ۥ r0 = r1.f7034
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final Yue.AbstractC2233 m10485() {
            r1 = this;
            Yue.ۥ۠ۡۡ۟ r0 = r1.f7029
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final Yue.C2274 m10486() {
            r1 = this;
            Yue.ۥۣ۠ۡۡ r0 = r1.f7030
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final boolean m10487() {
            r1 = this;
            boolean r0 = r1.f7033
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final boolean m10488() {
            r2 = this;
            Yue.ۥۣ۠ۡۡ r0 = r2.f7030
            Yue.ۥ۟۠ۢ r0 = r0.m10515()
            Yue.ۥ۠ۤۨۥ r0 = r0.m1318()
            java.lang.String r0 = r0.m13463()
            Yue.ۥۡۦ۠ۥ r1 = r2.f7034
            Yue.ۥۣۡۧ۠ r1 = r1.mo7317()
            Yue.ۥ۟۠ۢ r1 = r1.m20512()
            Yue.ۥ۠ۤۨۥ r1 = r1.m1318()
            java.lang.String r1 = r1.m13463()
            boolean r0 = Yue.C3329.m13897(r0, r1)
            r0 = r0 ^ 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final boolean m10489() {
            r1 = this;
            boolean r0 = r1.f7032
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final Yue.C5230.AbstractC5234 m10490() throws java.net.SocketException {
            r1 = this;
            Yue.ۥۡۦ۠ۤ r0 = r1.f7028
            r0.m19697()
            Yue.ۥۣ۠ۡ۠ r0 = r1.f7031
            Yue.ۥۡۦ۠ۥ r0 = r0.mo10508()
            Yue.ۥۡۦۡ$ۥ۟۟۟ r0 = r0.m19729(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m10491() {
            r1 = this;
            Yue.ۥۣ۠ۡ۠ r0 = r1.f7031
            Yue.ۥۡۦ۠ۥ r0 = r0.mo10508()
            r0.m19731()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m10492() {
            r4 = this;
            Yue.ۥۡۦ۠ۤ r0 = r4.f7028
            r1 = 0
            r2 = 0
            r3 = 1
            r0.m19690(r4, r3, r1, r2)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final Yue.AbstractC5379 m10493(@Yue.InterfaceC4418 Yue.C5377 r5) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "response"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "Content-Type"
            r1 = 2
            r2 = 0
            java.lang.String r0 = Yue.C5377.m20266(r5, r0, r2, r1, r2)     // Catch: java.io.IOException -> L28
            Yue.ۥۣ۠ۡ۠ r1 = r4.f7031     // Catch: java.io.IOException -> L28
            long r1 = r1.mo10503(r5)     // Catch: java.io.IOException -> L28
            Yue.ۥۣ۠ۡ۠ r3 = r4.f7031     // Catch: java.io.IOException -> L28
            Yue.ۥۣۢ۟ۦ r5 = r3.mo10511(r5)     // Catch: java.io.IOException -> L28
            Yue.ۥۣ۠ۡ۟$ۥ۟ r3 = new Yue.ۥۣ۠ۡ۟$ۥ۟     // Catch: java.io.IOException -> L28
            r3.<init>(r4, r5, r1)     // Catch: java.io.IOException -> L28
            Yue.ۥۡۦ۠ۨ r5 = new Yue.ۥۡۦ۠ۨ     // Catch: java.io.IOException -> L28
            Yue.ۥۣۣ۟۠ r3 = Yue.C4603.m18380(r3)     // Catch: java.io.IOException -> L28
            r5.<init>(r0, r1, r3)     // Catch: java.io.IOException -> L28
            return r5
        L28:
            r5 = move-exception
            Yue.ۥ۠ۡۡ۟ r0 = r4.f7029
            Yue.ۥۡۦ۠ۤ r1 = r4.f7028
            r0.mo10244(r1, r5)
            r4.m10497(r5)
            throw r5
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final Yue.C5377.C5378 m10494(boolean r3) throws java.io.IOException {
            r2 = this;
            Yue.ۥۣ۠ۡ۠ r0 = r2.f7031     // Catch: java.io.IOException -> Lc
            Yue.ۥۡۦۧ$ۥ r3 = r0.mo10507(r3)     // Catch: java.io.IOException -> Lc
            if (r3 == 0) goto Le
            r3.m20326(r2)     // Catch: java.io.IOException -> Lc
            goto Le
        Lc:
            r3 = move-exception
            goto Lf
        Le:
            return r3
        Lf:
            Yue.ۥ۠ۡۡ۟ r0 = r2.f7029
            Yue.ۥۡۦ۠ۤ r1 = r2.f7028
            r0.mo10244(r1, r3)
            r2.m10497(r3)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m10495(@Yue.InterfaceC4418 Yue.C5377 r3) {
            r2 = this;
            java.lang.String r0 = "response"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥ۠ۡۡ۟ r0 = r2.f7029
            Yue.ۥۡۦ۠ۤ r1 = r2.f7028
            r0.mo10245(r1, r3)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m10496() {
            r2 = this;
            Yue.ۥ۠ۡۡ۟ r0 = r2.f7029
            Yue.ۥۡۦ۠ۤ r1 = r2.f7028
            r0.mo10246(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m10497(java.io.IOException r3) {
            r2 = this;
            r0 = 1
            r2.f7033 = r0
            Yue.ۥۣ۠ۡۡ r0 = r2.f7030
            r0.m10519(r3)
            Yue.ۥۣ۠ۡ۠ r0 = r2.f7031
            Yue.ۥۡۦ۠ۥ r0 = r0.mo10508()
            Yue.ۥۡۦ۠ۤ r1 = r2.f7028
            r0.m19738(r1, r3)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final Yue.C2994 m10498() throws java.io.IOException {
            r1 = this;
            Yue.ۥۣ۠ۡ۠ r0 = r1.f7031
            Yue.ۥ۠ۤۢۢ r0 = r0.mo10510()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m10499() {
            r6 = this;
            r4 = 1
            r5 = 0
            r1 = -1
            r3 = 1
            r0 = r6
            r0.m10477(r1, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final void m10500(@Yue.InterfaceC4418 Yue.C5317 r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "request"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥ۠ۡۡ۟ r0 = r2.f7029     // Catch: java.io.IOException -> L19
            Yue.ۥۡۦ۠ۤ r1 = r2.f7028     // Catch: java.io.IOException -> L19
            r0.mo10241(r1)     // Catch: java.io.IOException -> L19
            Yue.ۥۣ۠ۡ۠ r0 = r2.f7031     // Catch: java.io.IOException -> L19
            r0.mo10506(r3)     // Catch: java.io.IOException -> L19
            Yue.ۥ۠ۡۡ۟ r0 = r2.f7029     // Catch: java.io.IOException -> L19
            Yue.ۥۡۦ۠ۤ r1 = r2.f7028     // Catch: java.io.IOException -> L19
            r0.mo10240(r1, r3)     // Catch: java.io.IOException -> L19
            return
        L19:
            r3 = move-exception
            Yue.ۥ۠ۡۡ۟ r0 = r2.f7029
            Yue.ۥۡۦ۠ۤ r1 = r2.f7028
            r0.mo10239(r1, r3)
            r2.m10497(r3)
            throw r3
    }
}
