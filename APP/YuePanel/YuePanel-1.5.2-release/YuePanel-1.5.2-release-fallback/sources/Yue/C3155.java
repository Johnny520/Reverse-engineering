package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nHttp2Writer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Writer.kt\nokhttp3/internal/http2/Http2Writer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,317:1\n1#2:318\n*E\n"})
public final class C3155 implements java.io.Closeable {

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C3155.C3156 f10390 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final java.util.logging.Logger f10391 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC0848 f10392;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean f10393;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C0843 f10394;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f10395;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f10396;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C3081.C3083 f10397;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۨ۟$ۥ, reason: contains not printable characters */
    public static final class C3156 {
        public C3156() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C3156(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            Yue.ۥ۠ۤۨ۟$ۥ r0 = new Yue.ۥ۠ۤۨ۟$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C3155.f10390 = r0
            java.lang.Class<Yue.ۥ۠ۤۧۥ> r0 = Yue.C3124.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            Yue.C3155.f10391 = r0
            return
    }

    public C3155(@Yue.InterfaceC4418 Yue.InterfaceC0848 r8, boolean r9) {
            r7 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r8, r0)
            r7.<init>()
            r7.f10392 = r8
            r7.f10393 = r9
            Yue.ۥۣ۟ۢۨ r4 = new Yue.ۥۣ۟ۢۨ
            r4.<init>()
            r7.f10394 = r4
            r8 = 16384(0x4000, float:2.2959E-41)
            r7.f10395 = r8
            Yue.ۥ۠ۤۧ$ۥ۟ r8 = new Yue.ۥ۠ۤۧ$ۥ۟
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f10397 = r8
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.f10396 = r0     // Catch: java.lang.Throwable -> Lb
            Yue.ۥۣۣ۟۟ r0 = r1.f10392     // Catch: java.lang.Throwable -> Lb
            r0.close()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    public final synchronized void flush() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f10396     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto Le
            Yue.ۥۣۣ۟۟ r0 = r2.f10392     // Catch: java.lang.Throwable -> Lc
            r0.flush()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        Lc:
            r0 = move-exception
            goto L16
        Le:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0     // Catch: java.lang.Throwable -> Lc
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final synchronized void m13352(@Yue.InterfaceC4418 Yue.C5705 r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "peerSettings"
            Yue.C3329.m13906(r3, r0)     // Catch: java.lang.Throwable -> L23
            boolean r0 = r2.f10396     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L32
            int r0 = r2.f10395     // Catch: java.lang.Throwable -> L23
            int r0 = r3.m21321(r0)     // Catch: java.lang.Throwable -> L23
            r2.f10395 = r0     // Catch: java.lang.Throwable -> L23
            int r0 = r3.m21318()     // Catch: java.lang.Throwable -> L23
            r1 = -1
            if (r0 == r1) goto L25
            Yue.ۥ۠ۤۧ$ۥ۟ r0 = r2.f10397     // Catch: java.lang.Throwable -> L23
            int r3 = r3.m21318()     // Catch: java.lang.Throwable -> L23
            r0.m12992(r3)     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r3 = move-exception
            goto L3a
        L25:
            r3 = 4
            r0 = 1
            r1 = 0
            r2.m13356(r1, r1, r3, r0)     // Catch: java.lang.Throwable -> L23
            Yue.ۥۣۣ۟۟ r3 = r2.f10392     // Catch: java.lang.Throwable -> L23
            r3.flush()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            return
        L32:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = "closed"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L23
            throw r3     // Catch: java.lang.Throwable -> L23
        L3a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final synchronized void m13353() throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f10396     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L47
            boolean r0 = r3.f10393     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto Lb
            monitor-exit(r3)
            return
        Lb:
            java.util.logging.Logger r0 = Yue.C3155.f10391     // Catch: java.lang.Throwable -> L37
            java.util.logging.Level r1 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L37
            boolean r1 = r0.isLoggable(r1)     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r1.<init>()     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = ">> CONNECTION "
            r1.append(r2)     // Catch: java.lang.Throwable -> L37
            Yue.ۥۣ۟ۥۤ r2 = Yue.C3124.f10226     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = r2.mo5071()     // Catch: java.lang.Throwable -> L37
            r1.append(r2)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L37
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = Yue.C6656.m25577(r1, r2)     // Catch: java.lang.Throwable -> L37
            r0.fine(r1)     // Catch: java.lang.Throwable -> L37
            goto L39
        L37:
            r0 = move-exception
            goto L4f
        L39:
            Yue.ۥۣۣ۟۟ r0 = r3.f10392     // Catch: java.lang.Throwable -> L37
            Yue.ۥۣ۟ۥۤ r1 = Yue.C3124.f10226     // Catch: java.lang.Throwable -> L37
            r0.mo4873(r1)     // Catch: java.lang.Throwable -> L37
            Yue.ۥۣۣ۟۟ r0 = r3.f10392     // Catch: java.lang.Throwable -> L37
            r0.flush()     // Catch: java.lang.Throwable -> L37
            monitor-exit(r3)
            return
        L47:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L37
            throw r0     // Catch: java.lang.Throwable -> L37
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final synchronized void m13354(boolean r2, int r3, @Yue.InterfaceC4543 Yue.C0843 r4, int r5) throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f10396     // Catch: java.lang.Throwable -> La
            if (r0 != 0) goto Lc
            r1.m13355(r3, r2, r4, r5)     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            return
        La:
            r2 = move-exception
            goto L14
        Lc:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> La
            java.lang.String r3 = "closed"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> La
            throw r2     // Catch: java.lang.Throwable -> La
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m13355(int r3, int r4, @Yue.InterfaceC4543 Yue.C0843 r5, int r6) throws java.io.IOException {
            r2 = this;
            r0 = 0
            r2.m13356(r3, r6, r0, r4)
            if (r6 <= 0) goto Lf
            Yue.ۥۣۣ۟۟ r3 = r2.f10392
            Yue.C3329.m13903(r5)
            long r0 = (long) r6
            r3.mo4176(r5, r0)
        Lf:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m13356(int r9, int r10, int r11, int r12) throws java.io.IOException {
            r8 = this;
            java.util.logging.Logger r0 = Yue.C3155.f10391
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r1 = r0.isLoggable(r1)
            if (r1 == 0) goto L18
            Yue.ۥ۠ۤۧۥ r2 = Yue.C3124.f10225
            r3 = 0
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            java.lang.String r1 = r2.m13154(r3, r4, r5, r6, r7)
            r0.fine(r1)
        L18:
            int r0 = r8.f10395
            if (r10 > r0) goto L59
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r9
            if (r0 != 0) goto L3e
            Yue.ۥۣۣ۟۟ r0 = r8.f10392
            Yue.C6656.m25620(r0, r10)
            Yue.ۥۣۣ۟۟ r10 = r8.f10392
            r11 = r11 & 255(0xff, float:3.57E-43)
            r10.writeByte(r11)
            Yue.ۥۣۣ۟۟ r10 = r8.f10392
            r11 = r12 & 255(0xff, float:3.57E-43)
            r10.writeByte(r11)
            Yue.ۥۣۣ۟۟ r10 = r8.f10392
            r11 = 2147483647(0x7fffffff, float:NaN)
            r9 = r9 & r11
            r10.writeInt(r9)
            return
        L3e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "reserved bit set: "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L59:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "FRAME_SIZE_ERROR length > "
            r9.append(r11)
            int r11 = r8.f10395
            r9.append(r11)
            java.lang.String r11 = ": "
            r9.append(r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final Yue.C3081.C3083 m13357() {
            r1 = this;
            Yue.ۥ۠ۤۧ$ۥ۟ r0 = r1.f10397
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final synchronized void m13358(int r4, @Yue.InterfaceC4418 Yue.EnumC2176 r5, @Yue.InterfaceC4418 byte[] r6) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "errorCode"
            Yue.C3329.m13906(r5, r0)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = "debugData"
            Yue.C3329.m13906(r6, r0)     // Catch: java.lang.Throwable -> L3b
            boolean r0 = r3.f10396     // Catch: java.lang.Throwable -> L3b
            if (r0 != 0) goto L50
            int r0 = r5.m10166()     // Catch: java.lang.Throwable -> L3b
            r1 = -1
            if (r0 == r1) goto L44
            int r0 = r6.length     // Catch: java.lang.Throwable -> L3b
            int r0 = r0 + 8
            r1 = 7
            r2 = 0
            r3.m13356(r2, r0, r1, r2)     // Catch: java.lang.Throwable -> L3b
            Yue.ۥۣۣ۟۟ r0 = r3.f10392     // Catch: java.lang.Throwable -> L3b
            r0.writeInt(r4)     // Catch: java.lang.Throwable -> L3b
            Yue.ۥۣۣ۟۟ r4 = r3.f10392     // Catch: java.lang.Throwable -> L3b
            int r5 = r5.m10166()     // Catch: java.lang.Throwable -> L3b
            r4.writeInt(r5)     // Catch: java.lang.Throwable -> L3b
            int r4 = r6.length     // Catch: java.lang.Throwable -> L3b
            r5 = 1
            if (r4 != 0) goto L31
            r2 = r5
        L31:
            r4 = r2 ^ 1
            if (r4 == 0) goto L3d
            Yue.ۥۣۣ۟۟ r4 = r3.f10392     // Catch: java.lang.Throwable -> L3b
            r4.write(r6)     // Catch: java.lang.Throwable -> L3b
            goto L3d
        L3b:
            r4 = move-exception
            goto L58
        L3d:
            Yue.ۥۣۣ۟۟ r4 = r3.f10392     // Catch: java.lang.Throwable -> L3b
            r4.flush()     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r3)
            return
        L44:
            java.lang.String r4 = "errorCode.httpCode == -1"
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L3b
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L3b
            throw r5     // Catch: java.lang.Throwable -> L3b
        L50:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L3b
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L3b
            throw r4     // Catch: java.lang.Throwable -> L3b
        L58:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final synchronized void m13359(boolean r7, int r8, @Yue.InterfaceC4418 java.util.List<Yue.C2992> r9) throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "headerBlock"
            Yue.C3329.m13906(r9, r0)     // Catch: java.lang.Throwable -> L3a
            boolean r0 = r6.f10396     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L3e
            Yue.ۥ۠ۤۧ$ۥ۟ r0 = r6.f10397     // Catch: java.lang.Throwable -> L3a
            r0.m12994(r9)     // Catch: java.lang.Throwable -> L3a
            Yue.ۥۣ۟ۢۨ r9 = r6.f10394     // Catch: java.lang.Throwable -> L3a
            long r0 = r9.m4889()     // Catch: java.lang.Throwable -> L3a
            int r9 = r6.f10395     // Catch: java.lang.Throwable -> L3a
            long r2 = (long) r9     // Catch: java.lang.Throwable -> L3a
            long r2 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L3a
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 != 0) goto L22
            r4 = 4
            goto L23
        L22:
            r4 = 0
        L23:
            if (r7 == 0) goto L27
            r4 = r4 | 1
        L27:
            int r7 = (int) r2     // Catch: java.lang.Throwable -> L3a
            r5 = 1
            r6.m13356(r8, r7, r5, r4)     // Catch: java.lang.Throwable -> L3a
            Yue.ۥۣۣ۟۟ r7 = r6.f10392     // Catch: java.lang.Throwable -> L3a
            Yue.ۥۣ۟ۢۨ r4 = r6.f10394     // Catch: java.lang.Throwable -> L3a
            r7.mo4176(r4, r2)     // Catch: java.lang.Throwable -> L3a
            if (r9 <= 0) goto L3c
            long r0 = r0 - r2
            r6.m13366(r8, r0)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            r7 = move-exception
            goto L46
        L3c:
            monitor-exit(r6)
            return
        L3e:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L3a
            java.lang.String r8 = "closed"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L3a
            throw r7     // Catch: java.lang.Throwable -> L3a
        L46:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3a
            throw r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final int m13360() {
            r1 = this;
            int r0 = r1.f10395
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final synchronized void m13361(boolean r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f10396     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L1f
            r0 = 0
            r1 = 8
            r2 = 6
            r3.m13356(r0, r1, r2, r4)     // Catch: java.lang.Throwable -> L1d
            Yue.ۥۣۣ۟۟ r4 = r3.f10392     // Catch: java.lang.Throwable -> L1d
            r4.writeInt(r5)     // Catch: java.lang.Throwable -> L1d
            Yue.ۥۣۣ۟۟ r4 = r3.f10392     // Catch: java.lang.Throwable -> L1d
            r4.writeInt(r6)     // Catch: java.lang.Throwable -> L1d
            Yue.ۥۣۣ۟۟ r4 = r3.f10392     // Catch: java.lang.Throwable -> L1d
            r4.flush()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return
        L1d:
            r4 = move-exception
            goto L27
        L1f:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L1d
            throw r4     // Catch: java.lang.Throwable -> L1d
        L27:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final synchronized void m13362(int r8, int r9, @Yue.InterfaceC4418 java.util.List<Yue.C2992> r10) throws java.io.IOException {
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "requestHeaders"
            Yue.C3329.m13906(r10, r0)     // Catch: java.lang.Throwable -> L45
            boolean r0 = r7.f10396     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L49
            Yue.ۥ۠ۤۧ$ۥ۟ r0 = r7.f10397     // Catch: java.lang.Throwable -> L45
            r0.m12994(r10)     // Catch: java.lang.Throwable -> L45
            Yue.ۥۣ۟ۢۨ r10 = r7.f10394     // Catch: java.lang.Throwable -> L45
            long r0 = r10.m4889()     // Catch: java.lang.Throwable -> L45
            int r10 = r7.f10395     // Catch: java.lang.Throwable -> L45
            long r2 = (long) r10     // Catch: java.lang.Throwable -> L45
            r4 = 4
            long r2 = r2 - r4
            long r2 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L45
            int r10 = (int) r2     // Catch: java.lang.Throwable -> L45
            int r2 = r10 + 4
            long r3 = (long) r10     // Catch: java.lang.Throwable -> L45
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 != 0) goto L29
            r5 = 4
            goto L2a
        L29:
            r5 = 0
        L2a:
            r6 = 5
            r7.m13356(r8, r2, r6, r5)     // Catch: java.lang.Throwable -> L45
            Yue.ۥۣۣ۟۟ r2 = r7.f10392     // Catch: java.lang.Throwable -> L45
            r5 = 2147483647(0x7fffffff, float:NaN)
            r9 = r9 & r5
            r2.writeInt(r9)     // Catch: java.lang.Throwable -> L45
            Yue.ۥۣۣ۟۟ r9 = r7.f10392     // Catch: java.lang.Throwable -> L45
            Yue.ۥۣ۟ۢۨ r2 = r7.f10394     // Catch: java.lang.Throwable -> L45
            r9.mo4176(r2, r3)     // Catch: java.lang.Throwable -> L45
            if (r10 <= 0) goto L47
            long r0 = r0 - r3
            r7.m13366(r8, r0)     // Catch: java.lang.Throwable -> L45
            goto L47
        L45:
            r8 = move-exception
            goto L51
        L47:
            monitor-exit(r7)
            return
        L49:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L45
            java.lang.String r9 = "closed"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L45
            throw r8     // Catch: java.lang.Throwable -> L45
        L51:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L45
            throw r8
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final synchronized void m13363(int r4, @Yue.InterfaceC4418 Yue.EnumC2176 r5) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "errorCode"
            Yue.C3329.m13906(r5, r0)     // Catch: java.lang.Throwable -> L27
            boolean r0 = r3.f10396     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L35
            int r0 = r5.m10166()     // Catch: java.lang.Throwable -> L27
            r1 = -1
            if (r0 == r1) goto L29
            r0 = 3
            r1 = 0
            r2 = 4
            r3.m13356(r4, r2, r0, r1)     // Catch: java.lang.Throwable -> L27
            Yue.ۥۣۣ۟۟ r4 = r3.f10392     // Catch: java.lang.Throwable -> L27
            int r5 = r5.m10166()     // Catch: java.lang.Throwable -> L27
            r4.writeInt(r5)     // Catch: java.lang.Throwable -> L27
            Yue.ۥۣۣ۟۟ r4 = r3.f10392     // Catch: java.lang.Throwable -> L27
            r4.flush()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r3)
            return
        L27:
            r4 = move-exception
            goto L3d
        L29:
            java.lang.String r4 = "Failed requirement."
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L27
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L27
            throw r5     // Catch: java.lang.Throwable -> L27
        L35:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L27
            throw r4     // Catch: java.lang.Throwable -> L27
        L3d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final synchronized void m13364(@Yue.InterfaceC4418 Yue.C5705 r5) throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "settings"
            Yue.C3329.m13906(r5, r0)     // Catch: java.lang.Throwable -> L38
            boolean r0 = r4.f10396     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L44
            int r0 = r5.m21326()     // Catch: java.lang.Throwable -> L38
            int r0 = r0 * 6
            r1 = 4
            r2 = 0
            r4.m13356(r2, r0, r1, r2)     // Catch: java.lang.Throwable -> L38
        L15:
            r0 = 10
            if (r2 >= r0) goto L3d
            boolean r0 = r5.m21323(r2)     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            if (r2 == r1) goto L28
            r0 = 7
            if (r2 == r0) goto L26
            r0 = r2
            goto L29
        L26:
            r0 = r1
            goto L29
        L28:
            r0 = 3
        L29:
            Yue.ۥۣۣ۟۟ r3 = r4.f10392     // Catch: java.lang.Throwable -> L38
            r3.writeShort(r0)     // Catch: java.lang.Throwable -> L38
            Yue.ۥۣۣ۟۟ r0 = r4.f10392     // Catch: java.lang.Throwable -> L38
            int r3 = r5.m21316(r2)     // Catch: java.lang.Throwable -> L38
            r0.writeInt(r3)     // Catch: java.lang.Throwable -> L38
            goto L3a
        L38:
            r5 = move-exception
            goto L4c
        L3a:
            int r2 = r2 + 1
            goto L15
        L3d:
            Yue.ۥۣۣ۟۟ r5 = r4.f10392     // Catch: java.lang.Throwable -> L38
            r5.flush()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r4)
            return
        L44:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = "closed"
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L38
            throw r5     // Catch: java.lang.Throwable -> L38
        L4c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final synchronized void m13365(int r4, long r5) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f10396     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L43
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L28
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L28
            r0 = 8
            r1 = 0
            r2 = 4
            r3.m13356(r4, r2, r0, r1)     // Catch: java.lang.Throwable -> L26
            Yue.ۥۣۣ۟۟ r4 = r3.f10392     // Catch: java.lang.Throwable -> L26
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L26
            r4.writeInt(r5)     // Catch: java.lang.Throwable -> L26
            Yue.ۥۣۣ۟۟ r4 = r3.f10392     // Catch: java.lang.Throwable -> L26
            r4.flush()     // Catch: java.lang.Throwable -> L26
            monitor-exit(r3)
            return
        L26:
            r4 = move-exception
            goto L4b
        L28:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r4.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: "
            r4.append(r0)     // Catch: java.lang.Throwable -> L26
            r4.append(r5)     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L26
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L26
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L26
            throw r5     // Catch: java.lang.Throwable -> L26
        L43:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L26
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L26
            throw r4     // Catch: java.lang.Throwable -> L26
        L4b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final void m13366(int r6, long r7) throws java.io.IOException {
            r5 = this;
        L0:
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L23
            int r2 = r5.f10395
            long r2 = (long) r2
            long r2 = java.lang.Math.min(r2, r7)
            long r7 = r7 - r2
            int r4 = (int) r2
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto L15
            r0 = 4
            goto L16
        L15:
            r0 = 0
        L16:
            r1 = 9
            r5.m13356(r6, r4, r1, r0)
            Yue.ۥۣۣ۟۟ r0 = r5.f10392
            Yue.ۥۣ۟ۢۨ r1 = r5.f10394
            r0.mo4176(r1, r2)
            goto L0
        L23:
            return
    }
}
