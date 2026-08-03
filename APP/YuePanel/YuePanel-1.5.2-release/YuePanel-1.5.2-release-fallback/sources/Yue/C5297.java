package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۣۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5297 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C5297.C5298 f19832 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f19833 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f19834 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public static final Yue.C0879 f19835 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public static final Yue.C0879 f19836 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final long f19837 = 32;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public java.io.RandomAccessFile f19838;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.InterfaceC5839 f19839;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public long f19840;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C0879 f19841;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final long f19842;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public java.lang.Thread f19843;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C0843 f19844;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean f19845;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C0843 f19846;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int f19847;

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۧ$ۥ, reason: contains not printable characters */
    public static final class C5298 {
        public C5298() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C5298(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C5297 m20027(@Yue.InterfaceC4418 java.io.File r11, @Yue.InterfaceC4418 Yue.InterfaceC5839 r12, @Yue.InterfaceC4418 Yue.C0879 r13, long r14) throws java.io.IOException {
                r10 = this;
                java.lang.String r0 = "file"
                Yue.C3329.m13906(r11, r0)
                java.lang.String r0 = "upstream"
                Yue.C3329.m13906(r12, r0)
                java.lang.String r0 = "metadata"
                Yue.C3329.m13906(r13, r0)
                java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
                java.lang.String r1 = "rw"
                r0.<init>(r11, r1)
                Yue.ۥۡۦۣۧ r11 = new Yue.ۥۡۦۣۧ
                r4 = 0
                r9 = 0
                r1 = r11
                r2 = r0
                r3 = r12
                r6 = r13
                r7 = r14
                r1.<init>(r2, r3, r4, r6, r7, r9)
                r12 = 0
                r0.setLength(r12)
                Yue.ۥۣ۟ۥۤ r3 = Yue.C5297.f19836
                r4 = -1
                r6 = -1
                r2 = r11
                Yue.C5297.m20005(r2, r3, r4, r6)
                return r11
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Yue.C5297 m20028(@Yue.InterfaceC4418 java.io.File r12) throws java.io.IOException {
                r11 = this;
                java.lang.String r0 = "file"
                Yue.C3329.m13906(r12, r0)
                java.io.RandomAccessFile r2 = new java.io.RandomAccessFile
                java.lang.String r0 = "rw"
                r2.<init>(r12, r0)
                Yue.ۥ۠ۡۨ۟ r12 = new Yue.ۥ۠ۡۨ۟
                java.nio.channels.FileChannel r0 = r2.getChannel()
                java.lang.String r1 = "randomAccessFile.channel"
                Yue.C3329.m13905(r0, r1)
                r12.<init>(r0)
                Yue.ۥۣ۟ۢۨ r0 = new Yue.ۥۣ۟ۢۨ
                r0.<init>()
                r4 = 0
                r7 = 32
                r3 = r12
                r6 = r0
                r3.m10866(r4, r6, r7)
                Yue.ۥۣ۟ۥۤ r1 = Yue.C5297.f19835
                int r3 = r1.m5095()
                long r3 = (long) r3
                Yue.ۥۣ۟ۥۤ r3 = r0.mo4817(r3)
                boolean r1 = Yue.C3329.m13897(r3, r1)
                if (r1 == 0) goto L60
                long r9 = r0.readLong()
                long r7 = r0.readLong()
                Yue.ۥۣ۟ۢۨ r0 = new Yue.ۥۣ۟ۢۨ
                r0.<init>()
                r3 = 32
                long r4 = r9 + r3
                r3 = r12
                r6 = r0
                r3.m10866(r4, r6, r7)
                Yue.ۥۣ۟ۥۤ r6 = r0.mo4853()
                Yue.ۥۡۦۣۧ r12 = new Yue.ۥۡۦۣۧ
                r7 = 0
                r0 = 0
                r3 = 0
                r1 = r12
                r4 = r9
                r9 = r0
                r1.<init>(r2, r3, r4, r6, r7, r9)
                return r12
            L60:
                java.io.IOException r12 = new java.io.IOException
                java.lang.String r0 = "unreadable cache file"
                r12.<init>(r0)
                throw r12
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۧ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nRelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,356:1\n563#2:357\n*S KotlinDebug\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n*L\n267#1:357\n*E\n"})
    public final class C5299 implements Yue.InterfaceC5839 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.C6250 f19848;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @Yue.InterfaceC4543
        public Yue.C2360 f19849;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public long f19850;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5297 f19851;

        public C5299(Yue.C5297 r3) {
                r2 = this;
                r2.f19851 = r3
                r2.<init>()
                Yue.ۥۢۡۤۧ r0 = new Yue.ۥۢۡۤۧ
                r0.<init>()
                r2.f19848 = r0
                Yue.ۥ۠ۡۨ۟ r0 = new Yue.ۥ۠ۡۨ۟
                java.io.RandomAccessFile r3 = r3.m20010()
                Yue.C3329.m13903(r3)
                java.nio.channels.FileChannel r3 = r3.getChannel()
                java.lang.String r1 = "file!!.channel"
                Yue.C3329.m13905(r3, r1)
                r0.<init>(r3)
                r2.f19849 = r0
                return
        }

        @Override // Yue.InterfaceC5839, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r3 = this;
                Yue.ۥ۠ۡۨ۟ r0 = r3.f19849
                if (r0 != 0) goto L5
                return
            L5:
                r0 = 0
                r3.f19849 = r0
                Yue.ۥۡۦۣۧ r1 = r3.f19851
                monitor-enter(r1)
                int r2 = r1.m20011()     // Catch: java.lang.Throwable -> L23
                int r2 = r2 + (-1)
                r1.m20021(r2)     // Catch: java.lang.Throwable -> L23
                int r2 = r1.m20011()     // Catch: java.lang.Throwable -> L23
                if (r2 != 0) goto L25
                java.io.RandomAccessFile r2 = r1.m20010()     // Catch: java.lang.Throwable -> L23
                r1.m20020(r0)     // Catch: java.lang.Throwable -> L23
                r0 = r2
                goto L25
            L23:
                r0 = move-exception
                goto L2e
            L25:
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L23
                monitor-exit(r1)
                if (r0 == 0) goto L2d
                Yue.C6656.m25567(r0)
            L2d:
                return
            L2e:
                monitor-exit(r1)
                throw r0
        }

        @Override // Yue.InterfaceC5839
        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ */
        public Yue.C6250 mo4177() {
                r1 = this;
                Yue.ۥۢۡۤۧ r0 = r1.f19848
                return r0
        }

        @Override // Yue.InterfaceC5839
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
        public long mo4179(@Yue.InterfaceC4418 Yue.C0843 r22, long r23) throws java.io.IOException {
                r21 = this;
                r1 = r21
                r2 = r23
                java.lang.String r0 = "sink"
                r5 = r22
                Yue.C3329.m13906(r5, r0)
                Yue.ۥ۠ۡۨ۟ r0 = r1.f19849
                if (r0 == 0) goto L17b
                Yue.ۥۡۦۣۧ r8 = r1.f19851
                monitor-enter(r8)
            L12:
                long r6 = r8.m20014()     // Catch: java.lang.Throwable -> L33
                long r9 = r1.f19850     // Catch: java.lang.Throwable -> L33
                int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                r4 = 2
                r6 = -1
                if (r0 != 0) goto L3f
                boolean r0 = r8.m20009()     // Catch: java.lang.Throwable -> L33
                if (r0 == 0) goto L27
                monitor-exit(r8)
                return r6
            L27:
                java.lang.Thread r0 = r8.m20015()     // Catch: java.lang.Throwable -> L33
                if (r0 == 0) goto L36
                Yue.ۥۢۡۤۧ r0 = r1.f19848     // Catch: java.lang.Throwable -> L33
                r0.m23307(r8)     // Catch: java.lang.Throwable -> L33
                goto L12
            L33:
                r0 = move-exception
                goto L179
            L36:
                java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L33
                r8.m20024(r0)     // Catch: java.lang.Throwable -> L33
                r0 = 1
                goto L53
            L3f:
                long r9 = r8.m20014()     // Catch: java.lang.Throwable -> L33
                Yue.ۥۣ۟ۢۨ r0 = r8.m20007()     // Catch: java.lang.Throwable -> L33
                long r11 = r0.m4889()     // Catch: java.lang.Throwable -> L33
                long r9 = r9 - r11
                long r11 = r1.f19850     // Catch: java.lang.Throwable -> L33
                int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r0 >= 0) goto L158
                r0 = r4
            L53:
                monitor-exit(r8)
                r8 = 32
                if (r0 != r4) goto L79
                Yue.ۥۡۦۣۧ r0 = r1.f19851
                long r6 = r0.m20014()
                long r10 = r1.f19850
                long r6 = r6 - r10
                long r10 = java.lang.Math.min(r2, r6)
                Yue.ۥ۠ۡۨ۟ r2 = r1.f19849
                Yue.C3329.m13903(r2)
                long r3 = r1.f19850
                long r3 = r3 + r8
                r5 = r22
                r6 = r10
                r2.m10866(r3, r5, r6)
                long r2 = r1.f19850
                long r2 = r2 + r10
                r1.f19850 = r2
                return r10
            L79:
                r10 = 0
                Yue.ۥۡۦۣۧ r0 = r1.f19851     // Catch: java.lang.Throwable -> Lb5
                Yue.ۥۣۢ۟ۦ r0 = r0.m20012()     // Catch: java.lang.Throwable -> Lb5
                Yue.C3329.m13903(r0)     // Catch: java.lang.Throwable -> Lb5
                Yue.ۥۡۦۣۧ r4 = r1.f19851     // Catch: java.lang.Throwable -> Lb5
                Yue.ۥۣ۟ۢۨ r4 = r4.m20013()     // Catch: java.lang.Throwable -> Lb5
                Yue.ۥۡۦۣۧ r11 = r1.f19851     // Catch: java.lang.Throwable -> Lb5
                long r11 = r11.m20008()     // Catch: java.lang.Throwable -> Lb5
                long r11 = r0.mo4179(r4, r11)     // Catch: java.lang.Throwable -> Lb5
                int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r0 != 0) goto Lb8
                Yue.ۥۡۦۣۧ r0 = r1.f19851     // Catch: java.lang.Throwable -> Lb5
                long r2 = r0.m20014()     // Catch: java.lang.Throwable -> Lb5
                r0.m20006(r2)     // Catch: java.lang.Throwable -> Lb5
                Yue.ۥۡۦۣۧ r2 = r1.f19851
                monitor-enter(r2)
                r2.m20024(r10)     // Catch: java.lang.Throwable -> Lb2
                java.lang.String r0 = "null cannot be cast to non-null type java.lang.Object"
                Yue.C3329.m13904(r2, r0)     // Catch: java.lang.Throwable -> Lb2
                r2.notifyAll()     // Catch: java.lang.Throwable -> Lb2
                Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> Lb2
                monitor-exit(r2)
                return r6
            Lb2:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            Lb5:
                r0 = move-exception
                goto L143
            Lb8:
                long r19 = java.lang.Math.min(r11, r2)     // Catch: java.lang.Throwable -> Lb5
                Yue.ۥۡۦۣۧ r0 = r1.f19851     // Catch: java.lang.Throwable -> Lb5
                Yue.ۥۣ۟ۢۨ r2 = r0.m20013()     // Catch: java.lang.Throwable -> Lb5
                r6 = 0
                r3 = r22
                r4 = r6
                r6 = r19
                r2.m4825(r3, r4, r6)     // Catch: java.lang.Throwable -> Lb5
                long r2 = r1.f19850     // Catch: java.lang.Throwable -> Lb5
                long r2 = r2 + r19
                r1.f19850 = r2     // Catch: java.lang.Throwable -> Lb5
                Yue.ۥ۠ۡۨ۟ r13 = r1.f19849     // Catch: java.lang.Throwable -> Lb5
                Yue.C3329.m13903(r13)     // Catch: java.lang.Throwable -> Lb5
                Yue.ۥۡۦۣۧ r0 = r1.f19851     // Catch: java.lang.Throwable -> Lb5
                long r2 = r0.m20014()     // Catch: java.lang.Throwable -> Lb5
                long r14 = r2 + r8
                Yue.ۥۡۦۣۧ r0 = r1.f19851     // Catch: java.lang.Throwable -> Lb5
                Yue.ۥۣ۟ۢۨ r0 = r0.m20013()     // Catch: java.lang.Throwable -> Lb5
                Yue.ۥۣ۟ۢۨ r16 = r0.m4811()     // Catch: java.lang.Throwable -> Lb5
                r17 = r11
                r13.m10867(r14, r16, r17)     // Catch: java.lang.Throwable -> Lb5
                Yue.ۥۡۦۣۧ r2 = r1.f19851     // Catch: java.lang.Throwable -> Lb5
                monitor-enter(r2)     // Catch: java.lang.Throwable -> Lb5
                Yue.ۥۣ۟ۢۨ r0 = r2.m20007()     // Catch: java.lang.Throwable -> L121
                Yue.ۥۣ۟ۢۨ r3 = r2.m20013()     // Catch: java.lang.Throwable -> L121
                r0.mo4176(r3, r11)     // Catch: java.lang.Throwable -> L121
                Yue.ۥۣ۟ۢۨ r0 = r2.m20007()     // Catch: java.lang.Throwable -> L121
                long r3 = r0.m4889()     // Catch: java.lang.Throwable -> L121
                long r5 = r2.m20008()     // Catch: java.lang.Throwable -> L121
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 <= 0) goto L123
                Yue.ۥۣ۟ۢۨ r0 = r2.m20007()     // Catch: java.lang.Throwable -> L121
                Yue.ۥۣ۟ۢۨ r3 = r2.m20007()     // Catch: java.lang.Throwable -> L121
                long r3 = r3.m4889()     // Catch: java.lang.Throwable -> L121
                long r5 = r2.m20008()     // Catch: java.lang.Throwable -> L121
                long r3 = r3 - r5
                r0.skip(r3)     // Catch: java.lang.Throwable -> L121
                goto L123
            L121:
                r0 = move-exception
                goto L141
            L123:
                long r3 = r2.m20014()     // Catch: java.lang.Throwable -> L121
                long r3 = r3 + r11
                r2.m20023(r3)     // Catch: java.lang.Throwable -> L121
                Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L121
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb5
                Yue.ۥۡۦۣۧ r2 = r1.f19851
                monitor-enter(r2)
                r2.m20024(r10)     // Catch: java.lang.Throwable -> L13e
                java.lang.String r0 = "null cannot be cast to non-null type java.lang.Object"
                Yue.C3329.m13904(r2, r0)     // Catch: java.lang.Throwable -> L13e
                r2.notifyAll()     // Catch: java.lang.Throwable -> L13e
                monitor-exit(r2)
                return r19
            L13e:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L141:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb5
                throw r0     // Catch: java.lang.Throwable -> Lb5
            L143:
                Yue.ۥۡۦۣۧ r2 = r1.f19851
                monitor-enter(r2)
                r2.m20024(r10)     // Catch: java.lang.Throwable -> L155
                java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
                Yue.C3329.m13904(r2, r3)     // Catch: java.lang.Throwable -> L155
                r2.notifyAll()     // Catch: java.lang.Throwable -> L155
                Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L155
                monitor-exit(r2)
                throw r0
            L155:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L158:
                long r6 = r8.m20014()     // Catch: java.lang.Throwable -> L33
                long r11 = r1.f19850     // Catch: java.lang.Throwable -> L33
                long r6 = r6 - r11
                long r11 = java.lang.Math.min(r2, r6)     // Catch: java.lang.Throwable -> L33
                Yue.ۥۣ۟ۢۨ r2 = r8.m20007()     // Catch: java.lang.Throwable -> L33
                long r3 = r1.f19850     // Catch: java.lang.Throwable -> L33
                long r6 = r3 - r9
                r3 = r22
                r4 = r6
                r6 = r11
                r2.m4825(r3, r4, r6)     // Catch: java.lang.Throwable -> L33
                long r2 = r1.f19850     // Catch: java.lang.Throwable -> L33
                long r2 = r2 + r11
                r1.f19850 = r2     // Catch: java.lang.Throwable -> L33
                monitor-exit(r8)
                return r11
            L179:
                monitor-exit(r8)
                throw r0
            L17b:
                java.lang.String r0 = "Check failed."
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
        }
    }

    static {
            Yue.ۥۡۦۣۧ$ۥ r0 = new Yue.ۥۡۦۣۧ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C5297.f19832 = r0
            Yue.ۥۣ۟ۥۤ$ۥ r0 = Yue.C0879.f2556
            java.lang.String r1 = "OkHttp cache v1\n"
            Yue.ۥۣ۟ۥۤ r1 = r0.m5121(r1)
            Yue.C5297.f19835 = r1
            java.lang.String r1 = "OkHttp DIRTY :(\n"
            Yue.ۥۣ۟ۥۤ r0 = r0.m5121(r1)
            Yue.C5297.f19836 = r0
            return
    }

    public C5297(java.io.RandomAccessFile r1, Yue.InterfaceC5839 r2, long r3, Yue.C0879 r5, long r6) {
            r0 = this;
            r0.<init>()
            r0.f19838 = r1
            r0.f19839 = r2
            r0.f19840 = r3
            r0.f19841 = r5
            r0.f19842 = r6
            Yue.ۥۣ۟ۢۨ r1 = new Yue.ۥۣ۟ۢۨ
            r1.<init>()
            r0.f19844 = r1
            Yue.ۥۣۢ۟ۦ r1 = r0.f19839
            if (r1 != 0) goto L1a
            r1 = 1
            goto L1b
        L1a:
            r1 = 0
        L1b:
            r0.f19845 = r1
            Yue.ۥۣ۟ۢۨ r1 = new Yue.ۥۣ۟ۢۨ
            r1.<init>()
            r0.f19846 = r1
            return
    }

    public /* synthetic */ C5297(java.io.RandomAccessFile r1, Yue.InterfaceC5839 r2, long r3, Yue.C0879 r5, long r6, Yue.C1769 r8) {
            r0 = this;
            r0.<init>(r1, r2, r3, r5, r6)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ void m20005(Yue.C5297 r0, Yue.C0879 r1, long r2, long r4) {
            r0.m20025(r1, r2, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m20006(long r9) throws java.io.IOException {
            r8 = this;
            r8.m20026(r9)
            java.io.RandomAccessFile r0 = r8.f19838
            Yue.C3329.m13903(r0)
            java.nio.channels.FileChannel r0 = r0.getChannel()
            r1 = 0
            r0.force(r1)
            Yue.ۥۣ۟ۥۤ r3 = Yue.C5297.f19835
            Yue.ۥۣ۟ۥۤ r0 = r8.f19841
            int r0 = r0.m5095()
            long r6 = (long) r0
            r2 = r8
            r4 = r9
            r2.m20025(r3, r4, r6)
            java.io.RandomAccessFile r9 = r8.f19838
            Yue.C3329.m13903(r9)
            java.nio.channels.FileChannel r9 = r9.getChannel()
            r9.force(r1)
            monitor-enter(r8)
            r9 = 1
            r8.f19845 = r9     // Catch: java.lang.Throwable -> L3c
            Yue.ۥۣۢ۠ۤ r9 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r8)
            Yue.ۥۣۢ۟ۦ r9 = r8.f19839
            if (r9 == 0) goto L38
            Yue.C6656.m25567(r9)
        L38:
            r9 = 0
            r8.f19839 = r9
            return
        L3c:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.C0843 m20007() {
            r1 = this;
            Yue.ۥۣ۟ۢۨ r0 = r1.f19846
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final long m20008() {
            r2 = this;
            long r0 = r2.f19842
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m20009() {
            r1 = this;
            boolean r0 = r1.f19845
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final java.io.RandomAccessFile m20010() {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.f19838
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int m20011() {
            r1 = this;
            int r0 = r1.f19847
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final Yue.InterfaceC5839 m20012() {
            r1 = this;
            Yue.ۥۣۢ۟ۦ r0 = r1.f19839
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final Yue.C0843 m20013() {
            r1 = this;
            Yue.ۥۣ۟ۢۨ r0 = r1.f19844
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final long m20014() {
            r2 = this;
            long r0 = r2.f19840
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final java.lang.Thread m20015() {
            r1 = this;
            java.lang.Thread r0 = r1.f19843
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final boolean m20016() {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.f19838
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final Yue.C0879 m20017() {
            r1 = this;
            Yue.ۥۣ۟ۥۤ r0 = r1.f19841
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final Yue.InterfaceC5839 m20018() {
            r1 = this;
            monitor-enter(r1)
            java.io.RandomAccessFile r0 = r1.f19838     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L8
            monitor-exit(r1)
            r0 = 0
            return r0
        L8:
            int r0 = r1.f19847     // Catch: java.lang.Throwable -> L15
            int r0 = r0 + 1
            r1.f19847 = r0     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)
            Yue.ۥۡۦۣۧ$ۥ۟ r0 = new Yue.ۥۡۦۣۧ$ۥ۟
            r0.<init>(r1)
            return r0
        L15:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m20019(boolean r1) {
            r0 = this;
            r0.f19845 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m20020(@Yue.InterfaceC4543 java.io.RandomAccessFile r1) {
            r0 = this;
            r0.f19838 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m20021(int r1) {
            r0 = this;
            r0.f19847 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m20022(@Yue.InterfaceC4543 Yue.InterfaceC5839 r1) {
            r0 = this;
            r0.f19839 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m20023(long r1) {
            r0 = this;
            r0.f19840 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m20024(@Yue.InterfaceC4543 java.lang.Thread r1) {
            r0 = this;
            r0.f19843 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m20025(Yue.C0879 r7, long r8, long r10) throws java.io.IOException {
            r6 = this;
            Yue.ۥۣ۟ۢۨ r3 = new Yue.ۥۣ۟ۢۨ
            r3.<init>()
            r3.m4893(r7)
            r3.m4903(r8)
            r3.m4903(r10)
            long r7 = r3.m4889()
            r9 = 32
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L33
            Yue.ۥ۠ۡۨ۟ r0 = new Yue.ۥ۠ۡۨ۟
            java.io.RandomAccessFile r7 = r6.f19838
            Yue.C3329.m13903(r7)
            java.nio.channels.FileChannel r7 = r7.getChannel()
            java.lang.String r8 = "file!!.channel"
            Yue.C3329.m13905(r7, r8)
            r0.<init>(r7)
            r1 = 0
            r4 = 32
            r0.m10867(r1, r3, r4)
            return
        L33:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Failed requirement."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final void m20026(long r7) throws java.io.IOException {
            r6 = this;
            Yue.ۥۣ۟ۢۨ r3 = new Yue.ۥۣ۟ۢۨ
            r3.<init>()
            Yue.ۥۣ۟ۥۤ r0 = r6.f19841
            r3.m4893(r0)
            Yue.ۥ۠ۡۨ۟ r0 = new Yue.ۥ۠ۡۨ۟
            java.io.RandomAccessFile r1 = r6.f19838
            Yue.C3329.m13903(r1)
            java.nio.channels.FileChannel r1 = r1.getChannel()
            java.lang.String r2 = "file!!.channel"
            Yue.C3329.m13905(r1, r2)
            r0.<init>(r1)
            r1 = 32
            long r1 = r1 + r7
            Yue.ۥۣ۟ۥۤ r7 = r6.f19841
            int r7 = r7.m5095()
            long r4 = (long) r7
            r0.m10867(r1, r3, r4)
            return
    }
}
