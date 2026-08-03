package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3146 implements java.io.Closeable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C3146.C3147 f10349 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.util.logging.Logger f10350 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC0849 f10351;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean f10352;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C3146.C3148 f10353;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C3081.C3082 f10354;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۨ$ۥ, reason: contains not printable characters */
    public static final class C3147 {
        public C3147() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C3147(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.util.logging.Logger m13283() {
                r1 = this;
                java.util.logging.Logger r0 = Yue.C3146.m13269()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final int m13284(int r3, int r4, int r5) throws java.io.IOException {
                r2 = this;
                r4 = r4 & 8
                if (r4 == 0) goto L6
                int r3 = r3 + (-1)
            L6:
                if (r5 > r3) goto La
                int r3 = r3 - r5
                return r3
            La:
                java.io.IOException r4 = new java.io.IOException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "PROTOCOL_ERROR padding "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r5 = " > remaining length "
                r0.append(r5)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r4.<init>(r3)
                throw r4
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۨ$ۥ۟, reason: contains not printable characters */
    public static final class C3148 implements Yue.InterfaceC5839 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.InterfaceC0849 f10355;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f10356;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f10357;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f10358;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f10359;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public int f10360;

        public C3148(@Yue.InterfaceC4418 Yue.InterfaceC0849 r2) {
                r1 = this;
                java.lang.String r0 = "source"
                Yue.C3329.m13906(r2, r0)
                r1.<init>()
                r1.f10355 = r2
                return
        }

        @Override // Yue.InterfaceC5839, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r0 = this;
                return
        }

        @Override // Yue.InterfaceC5839
        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ */
        public Yue.C6250 mo4177() {
                r1 = this;
                Yue.ۥۣۣ۟۠ r0 = r1.f10355
                Yue.ۥۢۡۤۧ r0 = r0.mo4177()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final int m13285() {
                r1 = this;
                int r0 = r1.f10357
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m13286() {
                r1 = this;
                int r0 = r1.f10359
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final int m13287() {
                r1 = this;
                int r0 = r1.f10356
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final int m13288() {
                r1 = this;
                int r0 = r1.f10360
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final int m13289() {
                r1 = this;
                int r0 = r1.f10358
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final void m13290() throws java.io.IOException {
                r9 = this;
                int r0 = r9.f10358
                Yue.ۥۣۣ۟۠ r1 = r9.f10355
                int r1 = Yue.C6656.m25600(r1)
                r9.f10359 = r1
                r9.f10356 = r1
                Yue.ۥۣۣ۟۠ r1 = r9.f10355
                byte r1 = r1.readByte()
                r2 = 255(0xff, float:3.57E-43)
                int r1 = Yue.C6656.m25556(r1, r2)
                Yue.ۥۣۣ۟۠ r3 = r9.f10355
                byte r3 = r3.readByte()
                int r2 = Yue.C6656.m25556(r3, r2)
                r9.f10357 = r2
                Yue.ۥ۠ۤۧۨ$ۥ r2 = Yue.C3146.f10349
                java.util.logging.Logger r3 = r2.m13283()
                java.util.logging.Level r4 = java.util.logging.Level.FINE
                boolean r3 = r3.isLoggable(r4)
                if (r3 == 0) goto L47
                java.util.logging.Logger r2 = r2.m13283()
                Yue.ۥ۠ۤۧۥ r3 = Yue.C3124.f10225
                int r5 = r9.f10358
                int r6 = r9.f10356
                int r8 = r9.f10357
                r4 = 1
                r7 = r1
                java.lang.String r3 = r3.m13154(r4, r5, r6, r7, r8)
                r2.fine(r3)
            L47:
                Yue.ۥۣۣ۟۠ r2 = r9.f10355
                int r2 = r2.readInt()
                r3 = 2147483647(0x7fffffff, float:NaN)
                r2 = r2 & r3
                r9.f10358 = r2
                r3 = 9
                if (r1 != r3) goto L62
                if (r2 != r0) goto L5a
                return
            L5a:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "TYPE_CONTINUATION streamId changed"
                r0.<init>(r1)
                throw r0
            L62:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                java.lang.String r1 = " != TYPE_CONTINUATION"
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public final void m13291(int r1) {
                r0 = this;
                r0.f10357 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final void m13292(int r1) {
                r0 = this;
                r0.f10359 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public final void m13293(int r1) {
                r0 = this;
                r0.f10356 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final void m13294(int r1) {
                r0 = this;
                r0.f10360 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final void m13295(int r1) {
                r0 = this;
                r0.f10358 = r1
                return
        }

        @Override // Yue.InterfaceC5839
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
        public long mo4179(@Yue.InterfaceC4418 Yue.C0843 r7, long r8) throws java.io.IOException {
                r6 = this;
                java.lang.String r0 = "sink"
                Yue.C3329.m13906(r7, r0)
            L5:
                int r0 = r6.f10359
                r1 = -1
                if (r0 != 0) goto L21
                Yue.ۥۣۣ۟۠ r0 = r6.f10355
                int r3 = r6.f10360
                long r3 = (long) r3
                r0.skip(r3)
                r0 = 0
                r6.f10360 = r0
                int r0 = r6.f10357
                r0 = r0 & 4
                if (r0 == 0) goto L1d
                return r1
            L1d:
                r6.m13290()
                goto L5
            L21:
                Yue.ۥۣۣ۟۠ r3 = r6.f10355
                long r4 = (long) r0
                long r8 = java.lang.Math.min(r8, r4)
                long r7 = r3.mo4179(r7, r8)
                int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r9 != 0) goto L31
                return r1
            L31:
                int r9 = r6.f10359
                int r0 = (int) r7
                int r9 = r9 - r0
                r6.f10359 = r9
                return r7
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧۨ$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC3149 {
        /* JADX INFO: renamed from: ۥ۟۟ */
        void mo13251();

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        void mo13252(int r1, @Yue.InterfaceC4418 Yue.EnumC2176 r2);

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        void mo13253(boolean r1, int r2, int r3, @Yue.InterfaceC4418 java.util.List<Yue.C2992> r4);

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        void mo13254(int r1, long r2);

        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        void mo13255(boolean r1, @Yue.InterfaceC4418 Yue.C5705 r2);

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        void mo13256(boolean r1, int r2, int r3);

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        void mo13257(int r1, int r2, int r3, boolean r4);

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        void mo13258(boolean r1, int r2, @Yue.InterfaceC4418 Yue.InterfaceC0849 r3, int r4) throws java.io.IOException;

        /* JADX INFO: renamed from: ۥ۟۟۠۠ */
        void mo13259(int r1, @Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 Yue.C0879 r3, @Yue.InterfaceC4418 java.lang.String r4, int r5, long r6);

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        void mo13260(int r1, int r2, @Yue.InterfaceC4418 java.util.List<Yue.C2992> r3) throws java.io.IOException;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
        void mo13261(int r1, @Yue.InterfaceC4418 Yue.EnumC2176 r2, @Yue.InterfaceC4418 Yue.C0879 r3);
    }

    static {
            Yue.ۥ۠ۤۧۨ$ۥ r0 = new Yue.ۥ۠ۤۧۨ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C3146.f10349 = r0
            java.lang.Class<Yue.ۥ۠ۤۧۥ> r0 = Yue.C3124.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            java.lang.String r1 = "getLogger(Http2::class.java.name)"
            Yue.C3329.m13905(r0, r1)
            Yue.C3146.f10350 = r0
            return
    }

    public C3146(@Yue.InterfaceC4418 Yue.InterfaceC0849 r8, boolean r9) {
            r7 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r8, r0)
            r7.<init>()
            r7.f10351 = r8
            r7.f10352 = r9
            Yue.ۥ۠ۤۧۨ$ۥ۟ r2 = new Yue.ۥ۠ۤۧۨ$ۥ۟
            r2.<init>(r8)
            r7.f10353 = r2
            Yue.ۥ۠ۤۧ$ۥ r8 = new Yue.ۥ۠ۤۧ$ۥ
            r5 = 4
            r6 = 0
            r3 = 4096(0x1000, float:5.74E-42)
            r4 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f10354 = r8
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ java.util.logging.Logger m13269() {
            java.util.logging.Logger r0 = Yue.C3146.f10350
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            Yue.ۥۣۣ۟۠ r0 = r1.f10351
            r0.close()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m13270(boolean r12, @Yue.InterfaceC4418 Yue.C3146.InterfaceC3149 r13) throws java.io.IOException {
            r11 = this;
            java.lang.String r0 = "handler"
            Yue.C3329.m13906(r13, r0)
            Yue.ۥۣۣ۟۠ r0 = r11.f10351     // Catch: java.io.EOFException -> Lb8
            r1 = 9
            r0.mo4875(r1)     // Catch: java.io.EOFException -> Lb8
            Yue.ۥۣۣ۟۠ r0 = r11.f10351
            int r0 = Yue.C6656.m25600(r0)
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r0 > r1) goto La1
            Yue.ۥۣۣ۟۠ r1 = r11.f10351
            byte r1 = r1.readByte()
            r2 = 255(0xff, float:3.57E-43)
            int r7 = Yue.C6656.m25556(r1, r2)
            Yue.ۥۣۣ۟۠ r1 = r11.f10351
            byte r1 = r1.readByte()
            int r8 = Yue.C6656.m25556(r1, r2)
            Yue.ۥۣۣ۟۠ r1 = r11.f10351
            int r1 = r1.readInt()
            r2 = 2147483647(0x7fffffff, float:NaN)
            r9 = r1 & r2
            java.util.logging.Logger r10 = Yue.C3146.f10350
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r1 = r10.isLoggable(r1)
            if (r1 == 0) goto L4f
            Yue.ۥ۠ۤۧۥ r1 = Yue.C3124.f10225
            r2 = 1
            r3 = r9
            r4 = r0
            r5 = r7
            r6 = r8
            java.lang.String r1 = r1.m13154(r2, r3, r4, r5, r6)
            r10.fine(r1)
        L4f:
            if (r12 == 0) goto L72
            r12 = 4
            if (r7 != r12) goto L55
            goto L72
        L55:
            java.io.IOException r12 = new java.io.IOException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Expected a SETTINGS frame but was "
            r13.append(r0)
            Yue.ۥ۠ۤۧۥ r0 = Yue.C3124.f10225
            java.lang.String r0 = r0.m13153(r7)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L72:
            switch(r7) {
                case 0: goto L9c;
                case 1: goto L98;
                case 2: goto L94;
                case 3: goto L90;
                case 4: goto L8c;
                case 5: goto L88;
                case 6: goto L84;
                case 7: goto L80;
                case 8: goto L7c;
                default: goto L75;
            }
        L75:
            Yue.ۥۣۣ۟۠ r12 = r11.f10351
            long r0 = (long) r0
            r12.skip(r0)
            goto L9f
        L7c:
            r11.m13282(r13, r0, r8, r9)
            goto L9f
        L80:
            r11.m13273(r13, r0, r8, r9)
            goto L9f
        L84:
            r11.m13276(r13, r0, r8, r9)
            goto L9f
        L88:
            r11.m13279(r13, r0, r8, r9)
            goto L9f
        L8c:
            r11.m13281(r13, r0, r8, r9)
            goto L9f
        L90:
            r11.m13280(r13, r0, r8, r9)
            goto L9f
        L94:
            r11.m13278(r13, r0, r8, r9)
            goto L9f
        L98:
            r11.m13275(r13, r0, r8, r9)
            goto L9f
        L9c:
            r11.m13272(r13, r0, r8, r9)
        L9f:
            r12 = 1
            return r12
        La1:
            java.io.IOException r12 = new java.io.IOException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r1 = "FRAME_SIZE_ERROR: "
            r13.append(r1)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        Lb8:
            r12 = 0
            return r12
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m13271(@Yue.InterfaceC4418 Yue.C3146.InterfaceC3149 r5) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "handler"
            Yue.C3329.m13906(r5, r0)
            boolean r0 = r4.f10352
            if (r0 == 0) goto L19
            r0 = 1
            boolean r5 = r4.m13270(r0, r5)
            if (r5 == 0) goto L11
            goto L55
        L11:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r0 = "Required SETTINGS preface not received"
            r5.<init>(r0)
            throw r5
        L19:
            Yue.ۥۣۣ۟۠ r5 = r4.f10351
            Yue.ۥۣ۟ۥۤ r0 = Yue.C3124.f10226
            int r1 = r0.m5095()
            long r1 = (long) r1
            Yue.ۥۣ۟ۥۤ r5 = r5.mo4817(r1)
            java.util.logging.Logger r1 = Yue.C3146.f10350
            java.util.logging.Level r2 = java.util.logging.Level.FINE
            boolean r2 = r1.isLoggable(r2)
            if (r2 == 0) goto L4f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "<< CONNECTION "
            r2.append(r3)
            java.lang.String r3 = r5.mo5071()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r2 = Yue.C6656.m25577(r2, r3)
            r1.fine(r2)
        L4f:
            boolean r0 = Yue.C3329.m13897(r0, r5)
            if (r0 == 0) goto L56
        L55:
            return
        L56:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected a connection header but was "
            r1.append(r2)
            java.lang.String r5 = r5.m5105()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m13272(Yue.C3146.InterfaceC3149 r4, int r5, int r6, int r7) throws java.io.IOException {
            r3 = this;
            if (r7 == 0) goto L38
            r0 = r6 & 1
            r1 = 0
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = r1
        La:
            r2 = r6 & 32
            if (r2 != 0) goto L30
            r2 = r6 & 8
            if (r2 == 0) goto L1e
            Yue.ۥۣۣ۟۠ r1 = r3.f10351
            byte r1 = r1.readByte()
            r2 = 255(0xff, float:3.57E-43)
            int r1 = Yue.C6656.m25556(r1, r2)
        L1e:
            Yue.ۥ۠ۤۧۨ$ۥ r2 = Yue.C3146.f10349
            int r5 = r2.m13284(r5, r6, r1)
            Yue.ۥۣۣ۟۠ r6 = r3.f10351
            r4.mo13258(r0, r7, r6, r5)
            Yue.ۥۣۣ۟۠ r4 = r3.f10351
            long r5 = (long) r1
            r4.skip(r5)
            return
        L30:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            r4.<init>(r5)
            throw r4
        L38:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            r4.<init>(r5)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m13273(Yue.C3146.InterfaceC3149 r4, int r5, int r6, int r7) throws java.io.IOException {
            r3 = this;
            r6 = 8
            if (r5 < r6) goto L49
            if (r7 != 0) goto L41
            Yue.ۥۣۣ۟۠ r7 = r3.f10351
            int r7 = r7.readInt()
            Yue.ۥۣۣ۟۠ r0 = r3.f10351
            int r0 = r0.readInt()
            int r5 = r5 - r6
            Yue.ۥ۠ۡ۠ۢ$ۥ r6 = Yue.EnumC2176.f6789
            Yue.ۥ۠ۡ۠ۢ r6 = r6.m10167(r0)
            if (r6 == 0) goto L2a
            Yue.ۥۣ۟ۥۤ r0 = Yue.C0879.f2558
            if (r5 <= 0) goto L26
            Yue.ۥۣۣ۟۠ r0 = r3.f10351
            long r1 = (long) r5
            Yue.ۥۣ۟ۥۤ r0 = r0.mo4817(r1)
        L26:
            r4.mo13261(r7, r6, r0)
            return
        L2a:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "TYPE_GOAWAY unexpected error code: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L41:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "TYPE_GOAWAY streamId != 0"
            r4.<init>(r5)
            throw r4
        L49:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "TYPE_GOAWAY length < 8: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final java.util.List<Yue.C2992> m13274(int r2, int r3, int r4, int r5) throws java.io.IOException {
            r1 = this;
            Yue.ۥ۠ۤۧۨ$ۥ۟ r0 = r1.f10353
            r0.m13292(r2)
            Yue.ۥ۠ۤۧۨ$ۥ۟ r2 = r1.f10353
            int r0 = r2.m13286()
            r2.m13293(r0)
            Yue.ۥ۠ۤۧۨ$ۥ۟ r2 = r1.f10353
            r2.m13294(r3)
            Yue.ۥ۠ۤۧۨ$ۥ۟ r2 = r1.f10353
            r2.m13291(r4)
            Yue.ۥ۠ۤۧۨ$ۥ۟ r2 = r1.f10353
            r2.m13295(r5)
            Yue.ۥ۠ۤۧ$ۥ r2 = r1.f10354
            r2.m12981()
            Yue.ۥ۠ۤۧ$ۥ r2 = r1.f10354
            java.util.List r2 = r2.m12974()
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m13275(Yue.C3146.InterfaceC3149 r4, int r5, int r6, int r7) throws java.io.IOException {
            r3 = this;
            if (r7 == 0) goto L32
            r0 = r6 & 1
            r1 = 0
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = r1
        La:
            r2 = r6 & 8
            if (r2 == 0) goto L1a
            Yue.ۥۣۣ۟۠ r1 = r3.f10351
            byte r1 = r1.readByte()
            r2 = 255(0xff, float:3.57E-43)
            int r1 = Yue.C6656.m25556(r1, r2)
        L1a:
            r2 = r6 & 32
            if (r2 == 0) goto L23
            r3.m13277(r4, r7)
            int r5 = r5 + (-5)
        L23:
            Yue.ۥ۠ۤۧۨ$ۥ r2 = Yue.C3146.f10349
            int r5 = r2.m13284(r5, r6, r1)
            java.util.List r5 = r3.m13274(r5, r1, r6, r7)
            r6 = -1
            r4.mo13253(r0, r7, r6, r5)
            return
        L32:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            r4.<init>(r5)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m13276(Yue.C3146.InterfaceC3149 r2, int r3, int r4, int r5) throws java.io.IOException {
            r1 = this;
            r0 = 8
            if (r3 != r0) goto L24
            if (r5 != 0) goto L1c
            Yue.ۥۣۣ۟۠ r3 = r1.f10351
            int r3 = r3.readInt()
            Yue.ۥۣۣ۟۠ r5 = r1.f10351
            int r5 = r5.readInt()
            r0 = 1
            r4 = r4 & r0
            if (r4 == 0) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            r2.mo13256(r0, r3, r5)
            return
        L1c:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "TYPE_PING streamId != 0"
            r2.<init>(r3)
            throw r2
        L24:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "TYPE_PING length != 8: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m13277(Yue.C3146.InterfaceC3149 r6, int r7) throws java.io.IOException {
            r5 = this;
            Yue.ۥۣۣ۟۠ r0 = r5.f10351
            int r0 = r0.readInt()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r0
            r2 = 1
            if (r1 == 0) goto Le
            r1 = r2
            goto Lf
        Le:
            r1 = 0
        Lf:
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r3
            Yue.ۥۣۣ۟۠ r3 = r5.f10351
            byte r3 = r3.readByte()
            r4 = 255(0xff, float:3.57E-43)
            int r3 = Yue.C6656.m25556(r3, r4)
            int r3 = r3 + r2
            r6.mo13257(r7, r0, r3, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m13278(Yue.C3146.InterfaceC3149 r1, int r2, int r3, int r4) throws java.io.IOException {
            r0 = this;
            r3 = 5
            if (r2 != r3) goto L11
            if (r4 == 0) goto L9
            r0.m13277(r1, r4)
            return
        L9:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_PRIORITY streamId == 0"
            r1.<init>(r2)
            throw r1
        L11:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "TYPE_PRIORITY length: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " != 5"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m13279(Yue.C3146.InterfaceC3149 r4, int r5, int r6, int r7) throws java.io.IOException {
            r3 = this;
            if (r7 == 0) goto L2e
            r0 = r6 & 8
            if (r0 == 0) goto L13
            Yue.ۥۣۣ۟۠ r0 = r3.f10351
            byte r0 = r0.readByte()
            r1 = 255(0xff, float:3.57E-43)
            int r0 = Yue.C6656.m25556(r0, r1)
            goto L14
        L13:
            r0 = 0
        L14:
            Yue.ۥۣۣ۟۠ r1 = r3.f10351
            int r1 = r1.readInt()
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r2
            Yue.ۥ۠ۤۧۨ$ۥ r2 = Yue.C3146.f10349
            int r5 = r5 + (-4)
            int r5 = r2.m13284(r5, r6, r0)
            java.util.List r5 = r3.m13274(r5, r0, r6, r7)
            r4.mo13260(r7, r1, r5)
            return
        L2e:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            r4.<init>(r5)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final void m13280(Yue.C3146.InterfaceC3149 r1, int r2, int r3, int r4) throws java.io.IOException {
            r0 = this;
            r3 = 4
            if (r2 != r3) goto L36
            if (r4 == 0) goto L2e
            Yue.ۥۣۣ۟۠ r2 = r0.f10351
            int r2 = r2.readInt()
            Yue.ۥ۠ۡ۠ۢ$ۥ r3 = Yue.EnumC2176.f6789
            Yue.ۥ۠ۡ۠ۢ r3 = r3.m10167(r2)
            if (r3 == 0) goto L17
            r1.mo13252(r4, r3)
            return
        L17:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "TYPE_RST_STREAM unexpected error code: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L2e:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_RST_STREAM streamId == 0"
            r1.<init>(r2)
            throw r1
        L36:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "TYPE_RST_STREAM length: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " != 4"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final void m13281(Yue.C3146.InterfaceC3149 r8, int r9, int r10, int r11) throws java.io.IOException {
            r7 = this;
            if (r11 != 0) goto Lb9
            r11 = 1
            r10 = r10 & r11
            if (r10 == 0) goto L14
            if (r9 != 0) goto Lc
            r8.mo13251()
            return
        Lc:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "FRAME_SIZE_ERROR ack frame should be empty!"
            r8.<init>(r9)
            throw r8
        L14:
            int r10 = r9 % 6
            if (r10 != 0) goto La2
            Yue.ۥۡۨۥۦ r10 = new Yue.ۥۡۨۥۦ
            r10.<init>()
            r0 = 0
            Yue.ۥ۠ۥۣۨ r9 = Yue.C5196.m19646(r0, r9)
            r1 = 6
            Yue.ۥ۠ۥۣۦ r9 = Yue.C5196.m19625(r9, r1)
            int r1 = r9.m13737()
            int r2 = r9.m13738()
            int r9 = r9.m13739()
            if (r9 <= 0) goto L37
            if (r1 <= r2) goto L3b
        L37:
            if (r9 >= 0) goto L9e
            if (r2 > r1) goto L9e
        L3b:
            Yue.ۥۣۣ۟۠ r3 = r7.f10351
            short r3 = r3.readShort()
            r4 = 65535(0xffff, float:9.1834E-41)
            int r3 = Yue.C6656.m25557(r3, r4)
            Yue.ۥۣۣ۟۠ r4 = r7.f10351
            int r4 = r4.readInt()
            r5 = 2
            if (r3 == r5) goto L8a
            r5 = 3
            r6 = 4
            if (r3 == r5) goto L88
            if (r3 == r6) goto L7c
            r5 = 5
            if (r3 == r5) goto L5b
            goto L97
        L5b:
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r4 < r5) goto L65
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            if (r4 > r5) goto L65
            goto L97
        L65:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L7c:
            if (r4 < 0) goto L80
            r3 = 7
            goto L97
        L80:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            r8.<init>(r9)
            throw r8
        L88:
            r3 = r6
            goto L97
        L8a:
            if (r4 == 0) goto L97
            if (r4 != r11) goto L8f
            goto L97
        L8f:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            r8.<init>(r9)
            throw r8
        L97:
            r10.m21325(r3, r4)
            if (r1 == r2) goto L9e
            int r1 = r1 + r9
            goto L3b
        L9e:
            r8.mo13255(r0, r10)
            return
        La2:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "TYPE_SETTINGS length % 6 != 0: "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        Lb9:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "TYPE_SETTINGS streamId != 0"
            r8.<init>(r9)
            throw r8
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final void m13282(Yue.C3146.InterfaceC3149 r3, int r4, int r5, int r6) throws java.io.IOException {
            r2 = this;
            r5 = 4
            if (r4 != r5) goto L22
            Yue.ۥۣۣ۟۠ r4 = r2.f10351
            int r4 = r4.readInt()
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r4 = Yue.C6656.m25558(r4, r0)
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L1a
            r3.mo13254(r6, r4)
            return
        L1a:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "windowSizeIncrement was 0"
            r3.<init>(r4)
            throw r3
        L22:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "TYPE_WINDOW_UPDATE length !=4: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
    }
}
