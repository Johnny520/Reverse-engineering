package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۡۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"})
public final class C4304 implements java.io.Closeable {

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C4304.C4305 f13635 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C4650 f13636 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC0849 f13637;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.String f13638;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C0879 f13639;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C0879 f13640;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f13641;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean f13642;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean f13643;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.C4304.C4307 f13644;

    /* JADX INFO: renamed from: Yue.ۥۡۡۦۤ$ۥ, reason: contains not printable characters */
    public static final class C4305 {
        public C4305() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C4305(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C4650 m16919() {
                r1 = this;
                Yue.ۥۣۡۤۥ r0 = Yue.C4304.m16912()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۦۤ$ۥ۟, reason: contains not printable characters */
    public static final class C4306 implements java.io.Closeable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.C2994 f13645;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.InterfaceC0849 f13646;

        public C4306(@Yue.InterfaceC4418 Yue.C2994 r2, @Yue.InterfaceC4418 Yue.InterfaceC0849 r3) {
                r1 = this;
                java.lang.String r0 = "headers"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r0 = "body"
                Yue.C3329.m13906(r3, r0)
                r1.<init>()
                r1.f13645 = r2
                r1.f13646 = r3
                return
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                Yue.ۥۣۣ۟۠ r0 = r1.f13646
                r0.close()
                return
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3421(name = "body")
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Yue.InterfaceC0849 m16920() {
                r1 = this;
                Yue.ۥۣۣ۟۠ r0 = r1.f13646
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3421(name = "headers")
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.C2994 m16921() {
                r1 = this;
                Yue.ۥ۠ۤۢۢ r0 = r1.f13645
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۦۤ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,210:1\n1#2:211\n268#3,26:212\n*S KotlinDebug\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n*L\n159#1:212,26\n*E\n"})
    public final class C4307 implements Yue.InterfaceC5839 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.C6250 f13647;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4304 f13648;

        public C4307(Yue.C4304 r1) {
                r0 = this;
                r0.f13648 = r1
                r0.<init>()
                Yue.ۥۢۡۤۧ r1 = new Yue.ۥۢۡۤۧ
                r1.<init>()
                r0.f13647 = r1
                return
        }

        @Override // Yue.InterfaceC5839, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r2 = this;
                Yue.ۥۡۡۦۤ r0 = r2.f13648
                Yue.ۥۡۡۦۤ$ۥ۟۟ r0 = Yue.C4304.m16913(r0)
                boolean r0 = Yue.C3329.m13897(r0, r2)
                if (r0 == 0) goto L12
                Yue.ۥۡۡۦۤ r0 = r2.f13648
                r1 = 0
                Yue.C4304.m16915(r0, r1)
            L12:
                return
        }

        @Override // Yue.InterfaceC5839
        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ */
        public Yue.C6250 mo4177() {
                r1 = this;
                Yue.ۥۢۡۤۧ r0 = r1.f13647
                return r0
        }

        @Override // Yue.InterfaceC5839
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
        public long mo4179(@Yue.InterfaceC4418 Yue.C0843 r18, long r19) {
                r17 = this;
                r1 = r17
                r0 = r18
                r2 = r19
                java.lang.String r4 = "sink"
                Yue.C3329.m13906(r0, r4)
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto Lde
                Yue.ۥۡۡۦۤ r6 = r1.f13648
                Yue.ۥۡۡۦۤ$ۥ۟۟ r6 = Yue.C4304.m16913(r6)
                boolean r6 = Yue.C3329.m13897(r6, r1)
                if (r6 == 0) goto Ld2
                Yue.ۥۡۡۦۤ r6 = r1.f13648
                Yue.ۥۣۣ۟۠ r6 = Yue.C4304.m16914(r6)
                Yue.ۥۢۡۤۧ r6 = r6.mo4177()
                Yue.ۥۢۡۤۧ r7 = r1.f13647
                Yue.ۥۡۡۦۤ r8 = r1.f13648
                long r9 = r6.mo12064()
                Yue.ۥۢۡۤۧ$ۥ۟ r11 = Yue.C6250.f22299
                long r12 = r7.mo12064()
                long r14 = r6.mo12064()
                long r11 = r11.m23308(r12, r14)
                java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS
                r6.mo12063(r11, r13)
                boolean r11 = r6.mo12061()
                if (r11 == 0) goto L93
                long r11 = r6.mo12059()
                boolean r16 = r7.mo12061()
                if (r16 == 0) goto L61
                long r14 = r6.mo12059()
                long r4 = r7.mo12059()
                long r4 = java.lang.Math.min(r14, r4)
                r6.mo12060(r4)
            L61:
                long r2 = Yue.C4304.m16911(r8, r2)     // Catch: java.lang.Throwable -> L83
                r4 = 0
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r4 != 0) goto L6e
                r14 = -1
                goto L76
            L6e:
                Yue.ۥۣۣ۟۠ r4 = Yue.C4304.m16914(r8)     // Catch: java.lang.Throwable -> L83
                long r14 = r4.mo4179(r0, r2)     // Catch: java.lang.Throwable -> L83
            L76:
                r6.mo12063(r9, r13)
                boolean r0 = r7.mo12061()
                if (r0 == 0) goto L82
                r6.mo12060(r11)
            L82:
                return r14
            L83:
                r0 = move-exception
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
                r6.mo12063(r9, r2)
                boolean r2 = r7.mo12061()
                if (r2 == 0) goto L92
                r6.mo12060(r11)
            L92:
                throw r0
            L93:
                boolean r4 = r7.mo12061()
                if (r4 == 0) goto La0
                long r4 = r7.mo12059()
                r6.mo12060(r4)
            La0:
                long r2 = Yue.C4304.m16911(r8, r2)     // Catch: java.lang.Throwable -> Lc2
                r4 = 0
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r4 != 0) goto Lad
                r14 = -1
                goto Lb5
            Lad:
                Yue.ۥۣۣ۟۠ r4 = Yue.C4304.m16914(r8)     // Catch: java.lang.Throwable -> Lc2
                long r14 = r4.mo4179(r0, r2)     // Catch: java.lang.Throwable -> Lc2
            Lb5:
                r6.mo12063(r9, r13)
                boolean r0 = r7.mo12061()
                if (r0 == 0) goto Lc1
                r6.mo12057()
            Lc1:
                return r14
            Lc2:
                r0 = move-exception
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
                r6.mo12063(r9, r2)
                boolean r2 = r7.mo12061()
                if (r2 == 0) goto Ld1
                r6.mo12057()
            Ld1:
                throw r0
            Ld2:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "closed"
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            Lde:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = "byteCount < 0: "
                r0.append(r4)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
        }
    }

    static {
            Yue.ۥۡۡۦۤ$ۥ r0 = new Yue.ۥۡۡۦۤ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C4304.f13635 = r0
            Yue.ۥۣۡۤۥ$ۥ r0 = Yue.C4650.f14814
            Yue.ۥۣ۟ۥۤ$ۥ r1 = Yue.C0879.f2556
            java.lang.String r2 = "\r\n"
            Yue.ۥۣ۟ۥۤ r2 = r1.m5121(r2)
            java.lang.String r3 = "--"
            Yue.ۥۣ۟ۥۤ r3 = r1.m5121(r3)
            java.lang.String r4 = " "
            Yue.ۥۣ۟ۥۤ r4 = r1.m5121(r4)
            java.lang.String r5 = "\t"
            Yue.ۥۣ۟ۥۤ r1 = r1.m5121(r5)
            Yue.ۥۣ۟ۥۤ[] r1 = new Yue.C0879[]{r2, r3, r4, r1}
            Yue.ۥۣۡۤۥ r0 = r0.m18486(r1)
            Yue.C4304.f13636 = r0
            return
    }

    public C4304(@Yue.InterfaceC4418 Yue.InterfaceC0849 r2, @Yue.InterfaceC4418 java.lang.String r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "boundary"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f13637 = r2
            r1.f13638 = r3
            Yue.ۥۣ۟ۢۨ r2 = new Yue.ۥۣ۟ۢۨ
            r2.<init>()
            java.lang.String r0 = "--"
            Yue.ۥۣ۟ۢۨ r2 = r2.m4911(r0)
            Yue.ۥۣ۟ۢۨ r2 = r2.m4911(r3)
            Yue.ۥۣ۟ۥۤ r2 = r2.mo4853()
            r1.f13639 = r2
            Yue.ۥۣ۟ۢۨ r2 = new Yue.ۥۣ۟ۢۨ
            r2.<init>()
            java.lang.String r0 = "\r\n--"
            Yue.ۥۣ۟ۢۨ r2 = r2.m4911(r0)
            Yue.ۥۣ۟ۢۨ r2 = r2.m4911(r3)
            Yue.ۥۣ۟ۥۤ r2 = r2.mo4853()
            r1.f13640 = r2
            return
    }

    public C4304(@Yue.InterfaceC4418 Yue.AbstractC5379 r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "response"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥۣۣ۟۠ r0 = r3.mo5165()
            Yue.ۥۡ۠ۥۨ r3 = r3.mo5164()
            if (r3 == 0) goto L1b
            java.lang.String r1 = "boundary"
            java.lang.String r3 = r3.m16147(r1)
            if (r3 == 0) goto L1b
            r2.<init>(r0, r3)
            return
        L1b:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r0 = "expected the Content-Type to have a boundary parameter"
            r3.<init>(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ long m16911(Yue.C4304 r0, long r1) {
            long r0 = r0.m16917(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C4650 m16912() {
            Yue.ۥۣۡۤۥ r0 = Yue.C4304.f13636
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C4304.C4307 m16913(Yue.C4304 r0) {
            Yue.ۥۡۡۦۤ$ۥ۟۟ r0 = r0.f13644
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC0849 m16914(Yue.C4304 r0) {
            Yue.ۥۣۣ۟۠ r0 = r0.f13637
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final /* synthetic */ void m16915(Yue.C4304 r0, Yue.C4304.C4307 r1) {
            r0.f13644 = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.f13642
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.f13642 = r0
            r0 = 0
            r1.f13644 = r0
            Yue.ۥۣۣ۟۠ r0 = r1.f13637
            r0.close()
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "boundary")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final java.lang.String m16916() {
            r1 = this;
            java.lang.String r0 = r1.f13638
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final long m16917(long r5) {
            r4 = this;
            Yue.ۥۣۣ۟۠ r0 = r4.f13637
            Yue.ۥۣ۟ۥۤ r1 = r4.f13640
            int r1 = r1.m5095()
            long r1 = (long) r1
            r0.mo4875(r1)
            Yue.ۥۣۣ۟۠ r0 = r4.f13637
            Yue.ۥۣ۟ۢۨ r0 = r0.mo4810()
            Yue.ۥۣ۟ۥۤ r1 = r4.f13640
            long r0 = r0.mo4868(r1)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L38
            Yue.ۥۣۣ۟۠ r0 = r4.f13637
            Yue.ۥۣ۟ۢۨ r0 = r0.mo4810()
            long r0 = r0.m4889()
            Yue.ۥۣ۟ۥۤ r2 = r4.f13640
            int r2 = r2.m5095()
            long r2 = (long) r2
            long r0 = r0 - r2
            r2 = 1
            long r0 = r0 + r2
            long r5 = java.lang.Math.min(r5, r0)
            goto L3c
        L38:
            long r5 = java.lang.Math.min(r5, r0)
        L3c:
            return r5
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final Yue.C4304.C4306 m16918() throws java.io.IOException {
            r7 = this;
            boolean r0 = r7.f13642
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L9e
            boolean r0 = r7.f13643
            r2 = 0
            if (r0 == 0) goto Lc
            return r2
        Lc:
            int r0 = r7.f13641
            r3 = 0
            if (r0 != 0) goto L29
            Yue.ۥۣۣ۟۠ r0 = r7.f13637
            Yue.ۥۣ۟ۥۤ r5 = r7.f13639
            boolean r0 = r0.mo4852(r3, r5)
            if (r0 == 0) goto L29
            Yue.ۥۣۣ۟۠ r0 = r7.f13637
            Yue.ۥۣ۟ۥۤ r3 = r7.f13639
            int r3 = r3.m5095()
            long r3 = (long) r3
            r0.skip(r3)
            goto L45
        L29:
            r5 = 8192(0x2000, double:4.0474E-320)
            long r5 = r7.m16917(r5)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L39
            Yue.ۥۣۣ۟۠ r0 = r7.f13637
            r0.skip(r5)
            goto L29
        L39:
            Yue.ۥۣۣ۟۠ r0 = r7.f13637
            Yue.ۥۣ۟ۥۤ r3 = r7.f13640
            int r3 = r3.m5095()
            long r3 = (long) r3
            r0.skip(r3)
        L45:
            r0 = 0
        L46:
            Yue.ۥۣۣ۟۠ r3 = r7.f13637
            Yue.ۥۣۡۤۥ r4 = Yue.C4304.f13636
            int r3 = r3.mo4848(r4)
            r4 = -1
            java.lang.String r5 = "unexpected characters after boundary"
            if (r3 == r4) goto L98
            if (r3 == 0) goto L77
            if (r3 == r1) goto L60
            r4 = 2
            if (r3 == r4) goto L5e
            r4 = 3
            if (r3 == r4) goto L5e
            goto L46
        L5e:
            r0 = r1
            goto L46
        L60:
            if (r0 != 0) goto L71
            int r0 = r7.f13641
            if (r0 == 0) goto L69
            r7.f13643 = r1
            return r2
        L69:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "expected at least 1 part"
            r0.<init>(r1)
            throw r0
        L71:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r5)
            throw r0
        L77:
            int r0 = r7.f13641
            int r0 = r0 + r1
            r7.f13641 = r0
            Yue.ۥۣ۠ۤۢ r0 = new Yue.ۥۣ۠ۤۢ
            Yue.ۥۣۣ۟۠ r1 = r7.f13637
            r0.<init>(r1)
            Yue.ۥ۠ۤۢۢ r0 = r0.m12714()
            Yue.ۥۡۡۦۤ$ۥ۟۟ r1 = new Yue.ۥۡۡۦۤ$ۥ۟۟
            r1.<init>(r7)
            r7.f13644 = r1
            Yue.ۥۡۡۦۤ$ۥ۟ r2 = new Yue.ۥۡۡۦۤ$ۥ۟
            Yue.ۥۣۣ۟۠ r1 = Yue.C4603.m18380(r1)
            r2.<init>(r0, r1)
            return r2
        L98:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r5)
            throw r0
        L9e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
