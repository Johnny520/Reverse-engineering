package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,257:1\n1#2:258\n268#3,26:259\n*S KotlinDebug\n*F\n+ 1 Pipe.kt\nokio/Pipe\n*L\n217#1:259,26\n*E\n"})
public final class C4770 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final long f15109;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C0843 f15110;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f15111;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f15112;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f15113;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.InterfaceC5794 f15114;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.concurrent.locks.ReentrantLock f15115;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.concurrent.locks.Condition f15116;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC5794 f15117;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC5839 f15118;

    /* JADX INFO: renamed from: Yue.ۥۡۤۡۡ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe$sink$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Pipe.kt\nokio/Pipe\n+ 4 Timeout.kt\nokio/Timeout\n*L\n1#1,257:1\n1#2:258\n217#3:259\n218#3:286\n217#3:287\n218#3:314\n217#3:315\n218#3:342\n268#4,26:260\n268#4,26:288\n268#4,26:316\n*S KotlinDebug\n*F\n+ 1 Pipe.kt\nokio/Pipe$sink$1\n*L\n87#1:259\n87#1:286\n106#1:287\n106#1:314\n124#1:315\n124#1:342\n87#1:260,26\n106#1:288,26\n124#1:316,26\n*E\n"})
    public static final class C4771 implements Yue.InterfaceC5794 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.C6250 f15119;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4770 f15120;

        public C4771(Yue.C4770 r1) {
                r0 = this;
                r0.f15120 = r1
                r0.<init>()
                Yue.ۥۢۡۤۧ r1 = new Yue.ۥۢۡۤۧ
                r1.<init>()
                r0.f15119 = r1
                return
        }

        @Override // Yue.InterfaceC5794, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r12 = this;
                Yue.ۥۡۤۡۡ r0 = r12.f15120
                java.util.concurrent.locks.ReentrantLock r0 = r0.m18998()
                Yue.ۥۡۤۡۡ r1 = r12.f15120
                r0.lock()
                boolean r2 = r1.m19000()     // Catch: java.lang.Throwable -> L39
                if (r2 == 0) goto L15
                r0.unlock()
                return
            L15:
                Yue.ۥۣۢ۟ۡ r2 = r1.m18997()     // Catch: java.lang.Throwable -> L39
                if (r2 == 0) goto L1c
                goto L48
            L1c:
                boolean r2 = r1.m19001()     // Catch: java.lang.Throwable -> L39
                if (r2 == 0) goto L3c
                Yue.ۥۣ۟ۢۨ r2 = r1.m18994()     // Catch: java.lang.Throwable -> L39
                long r2 = r2.m4889()     // Catch: java.lang.Throwable -> L39
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 > 0) goto L31
                goto L3c
            L31:
                java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L39
                java.lang.String r2 = "source is closed"
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L39
                throw r1     // Catch: java.lang.Throwable -> L39
            L39:
                r1 = move-exception
                goto Le1
            L3c:
                r2 = 1
                r1.m19004(r2)     // Catch: java.lang.Throwable -> L39
                java.util.concurrent.locks.Condition r1 = r1.m18996()     // Catch: java.lang.Throwable -> L39
                r1.signalAll()     // Catch: java.lang.Throwable -> L39
                r2 = 0
            L48:
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L39
                r0.unlock()
                if (r2 == 0) goto Le0
                Yue.ۥۡۤۡۡ r0 = r12.f15120
                Yue.ۥۢۡۤۧ r1 = r2.mo4174()
                Yue.ۥۣۢ۟ۡ r0 = r0.m19006()
                Yue.ۥۢۡۤۧ r0 = r0.mo4174()
                long r3 = r1.mo12064()
                Yue.ۥۢۡۤۧ$ۥ۟ r5 = Yue.C6250.f22299
                long r6 = r0.mo12064()
                long r8 = r1.mo12064()
                long r5 = r5.m23308(r6, r8)
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS
                r1.mo12063(r5, r7)
                boolean r5 = r1.mo12061()
                if (r5 == 0) goto Lb3
                long r5 = r1.mo12059()
                boolean r8 = r0.mo12061()
                if (r8 == 0) goto L93
                long r8 = r1.mo12059()
                long r10 = r0.mo12059()
                long r8 = java.lang.Math.min(r8, r10)
                r1.mo12060(r8)
            L93:
                r2.close()     // Catch: java.lang.Throwable -> La3
                r1.mo12063(r3, r7)
                boolean r0 = r0.mo12061()
                if (r0 == 0) goto Le0
                r1.mo12060(r5)
                goto Le0
            La3:
                r2 = move-exception
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS
                r1.mo12063(r3, r7)
                boolean r0 = r0.mo12061()
                if (r0 == 0) goto Lb2
                r1.mo12060(r5)
            Lb2:
                throw r2
            Lb3:
                boolean r5 = r0.mo12061()
                if (r5 == 0) goto Lc0
                long r5 = r0.mo12059()
                r1.mo12060(r5)
            Lc0:
                r2.close()     // Catch: java.lang.Throwable -> Ld0
                r1.mo12063(r3, r7)
                boolean r0 = r0.mo12061()
                if (r0 == 0) goto Le0
                r1.mo12057()
                goto Le0
            Ld0:
                r2 = move-exception
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
                r1.mo12063(r3, r5)
                boolean r0 = r0.mo12061()
                if (r0 == 0) goto Ldf
                r1.mo12057()
            Ldf:
                throw r2
            Le0:
                return
            Le1:
                r0.unlock()
                throw r1
        }

        @Override // Yue.InterfaceC5794, java.io.Flushable
        public void flush() {
                r12 = this;
                Yue.ۥۡۤۡۡ r0 = r12.f15120
                java.util.concurrent.locks.ReentrantLock r0 = r0.m18998()
                Yue.ۥۡۤۡۡ r1 = r12.f15120
                r0.lock()
                boolean r2 = r1.m19000()     // Catch: java.lang.Throwable -> L3d
                r2 = r2 ^ 1
                if (r2 == 0) goto Le2
                boolean r2 = r1.m18995()     // Catch: java.lang.Throwable -> L3d
                if (r2 != 0) goto Lda
                Yue.ۥۣۢ۟ۡ r2 = r1.m18997()     // Catch: java.lang.Throwable -> L3d
                if (r2 == 0) goto L20
                goto L41
            L20:
                boolean r2 = r1.m19001()     // Catch: java.lang.Throwable -> L3d
                if (r2 == 0) goto L40
                Yue.ۥۣ۟ۢۨ r1 = r1.m18994()     // Catch: java.lang.Throwable -> L3d
                long r1 = r1.m4889()     // Catch: java.lang.Throwable -> L3d
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 > 0) goto L35
                goto L40
            L35:
                java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L3d
                java.lang.String r2 = "source is closed"
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L3d
                throw r1     // Catch: java.lang.Throwable -> L3d
            L3d:
                r1 = move-exception
                goto Lee
            L40:
                r2 = 0
            L41:
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L3d
                r0.unlock()
                if (r2 == 0) goto Ld9
                Yue.ۥۡۤۡۡ r0 = r12.f15120
                Yue.ۥۢۡۤۧ r1 = r2.mo4174()
                Yue.ۥۣۢ۟ۡ r0 = r0.m19006()
                Yue.ۥۢۡۤۧ r0 = r0.mo4174()
                long r3 = r1.mo12064()
                Yue.ۥۢۡۤۧ$ۥ۟ r5 = Yue.C6250.f22299
                long r6 = r0.mo12064()
                long r8 = r1.mo12064()
                long r5 = r5.m23308(r6, r8)
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS
                r1.mo12063(r5, r7)
                boolean r5 = r1.mo12061()
                if (r5 == 0) goto Lac
                long r5 = r1.mo12059()
                boolean r8 = r0.mo12061()
                if (r8 == 0) goto L8c
                long r8 = r1.mo12059()
                long r10 = r0.mo12059()
                long r8 = java.lang.Math.min(r8, r10)
                r1.mo12060(r8)
            L8c:
                r2.flush()     // Catch: java.lang.Throwable -> L9c
                r1.mo12063(r3, r7)
                boolean r0 = r0.mo12061()
                if (r0 == 0) goto Ld9
                r1.mo12060(r5)
                goto Ld9
            L9c:
                r2 = move-exception
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS
                r1.mo12063(r3, r7)
                boolean r0 = r0.mo12061()
                if (r0 == 0) goto Lab
                r1.mo12060(r5)
            Lab:
                throw r2
            Lac:
                boolean r5 = r0.mo12061()
                if (r5 == 0) goto Lb9
                long r5 = r0.mo12059()
                r1.mo12060(r5)
            Lb9:
                r2.flush()     // Catch: java.lang.Throwable -> Lc9
                r1.mo12063(r3, r7)
                boolean r0 = r0.mo12061()
                if (r0 == 0) goto Ld9
                r1.mo12057()
                goto Ld9
            Lc9:
                r2 = move-exception
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
                r1.mo12063(r3, r5)
                boolean r0 = r0.mo12061()
                if (r0 == 0) goto Ld8
                r1.mo12057()
            Ld8:
                throw r2
            Ld9:
                return
            Lda:
                java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L3d
                java.lang.String r2 = "canceled"
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L3d
                throw r1     // Catch: java.lang.Throwable -> L3d
            Le2:
                java.lang.String r1 = "closed"
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3d
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L3d
                r2.<init>(r1)     // Catch: java.lang.Throwable -> L3d
                throw r2     // Catch: java.lang.Throwable -> L3d
            Lee:
                r0.unlock()
                throw r1
        }

        @Override // Yue.InterfaceC5794
        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ */
        public Yue.C6250 mo4174() {
                r1 = this;
                Yue.ۥۢۡۤۧ r0 = r1.f15119
                return r0
        }

        @Override // Yue.InterfaceC5794
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public void mo4176(@Yue.InterfaceC4418 Yue.C0843 r13, long r14) {
                r12 = this;
                java.lang.String r0 = "source"
                Yue.C3329.m13906(r13, r0)
                Yue.ۥۡۤۡۡ r0 = r12.f15120
                java.util.concurrent.locks.ReentrantLock r0 = r0.m18998()
                Yue.ۥۡۤۡۡ r1 = r12.f15120
                r0.lock()
                boolean r2 = r1.m19000()     // Catch: java.lang.Throwable -> L5a
                r2 = r2 ^ 1
                if (r2 == 0) goto L119
                boolean r2 = r1.m18995()     // Catch: java.lang.Throwable -> L5a
                java.lang.String r3 = "canceled"
                if (r2 != 0) goto L113
            L20:
                r4 = 0
                int r2 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
                if (r2 <= 0) goto L79
                Yue.ۥۣۢ۟ۡ r2 = r1.m18997()     // Catch: java.lang.Throwable -> L5a
                if (r2 == 0) goto L2d
                goto L7a
            L2d:
                boolean r2 = r1.m19001()     // Catch: java.lang.Throwable -> L5a
                if (r2 != 0) goto L71
                long r6 = r1.m18999()     // Catch: java.lang.Throwable -> L5a
                Yue.ۥۣ۟ۢۨ r2 = r1.m18994()     // Catch: java.lang.Throwable -> L5a
                long r8 = r2.m4889()     // Catch: java.lang.Throwable -> L5a
                long r6 = r6 - r8
                int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r2 != 0) goto L5d
                Yue.ۥۢۡۤۧ r2 = r12.f15119     // Catch: java.lang.Throwable -> L5a
                java.util.concurrent.locks.Condition r4 = r1.m18996()     // Catch: java.lang.Throwable -> L5a
                r2.m23304(r4)     // Catch: java.lang.Throwable -> L5a
                boolean r2 = r1.m18995()     // Catch: java.lang.Throwable -> L5a
                if (r2 != 0) goto L54
                goto L20
            L54:
                java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L5a
                r13.<init>(r3)     // Catch: java.lang.Throwable -> L5a
                throw r13     // Catch: java.lang.Throwable -> L5a
            L5a:
                r13 = move-exception
                goto L125
            L5d:
                long r4 = java.lang.Math.min(r6, r14)     // Catch: java.lang.Throwable -> L5a
                Yue.ۥۣ۟ۢۨ r2 = r1.m18994()     // Catch: java.lang.Throwable -> L5a
                r2.mo4176(r13, r4)     // Catch: java.lang.Throwable -> L5a
                long r14 = r14 - r4
                java.util.concurrent.locks.Condition r2 = r1.m18996()     // Catch: java.lang.Throwable -> L5a
                r2.signalAll()     // Catch: java.lang.Throwable -> L5a
                goto L20
            L71:
                java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L5a
                java.lang.String r14 = "source is closed"
                r13.<init>(r14)     // Catch: java.lang.Throwable -> L5a
                throw r13     // Catch: java.lang.Throwable -> L5a
            L79:
                r2 = 0
            L7a:
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L5a
                r0.unlock()
                if (r2 == 0) goto L112
                Yue.ۥۡۤۡۡ r0 = r12.f15120
                Yue.ۥۢۡۤۧ r1 = r2.mo4174()
                Yue.ۥۣۢ۟ۡ r0 = r0.m19006()
                Yue.ۥۢۡۤۧ r0 = r0.mo4174()
                long r3 = r1.mo12064()
                Yue.ۥۢۡۤۧ$ۥ۟ r5 = Yue.C6250.f22299
                long r6 = r0.mo12064()
                long r8 = r1.mo12064()
                long r5 = r5.m23308(r6, r8)
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS
                r1.mo12063(r5, r7)
                boolean r5 = r1.mo12061()
                if (r5 == 0) goto Le5
                long r5 = r1.mo12059()
                boolean r8 = r0.mo12061()
                if (r8 == 0) goto Lc5
                long r8 = r1.mo12059()
                long r10 = r0.mo12059()
                long r8 = java.lang.Math.min(r8, r10)
                r1.mo12060(r8)
            Lc5:
                r2.mo4176(r13, r14)     // Catch: java.lang.Throwable -> Ld5
                r1.mo12063(r3, r7)
                boolean r13 = r0.mo12061()
                if (r13 == 0) goto L112
                r1.mo12060(r5)
                goto L112
            Ld5:
                r13 = move-exception
                java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.NANOSECONDS
                r1.mo12063(r3, r14)
                boolean r14 = r0.mo12061()
                if (r14 == 0) goto Le4
                r1.mo12060(r5)
            Le4:
                throw r13
            Le5:
                boolean r5 = r0.mo12061()
                if (r5 == 0) goto Lf2
                long r5 = r0.mo12059()
                r1.mo12060(r5)
            Lf2:
                r2.mo4176(r13, r14)     // Catch: java.lang.Throwable -> L102
                r1.mo12063(r3, r7)
                boolean r13 = r0.mo12061()
                if (r13 == 0) goto L112
                r1.mo12057()
                goto L112
            L102:
                r13 = move-exception
                java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.NANOSECONDS
                r1.mo12063(r3, r14)
                boolean r14 = r0.mo12061()
                if (r14 == 0) goto L111
                r1.mo12057()
            L111:
                throw r13
            L112:
                return
            L113:
                java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L5a
                r13.<init>(r3)     // Catch: java.lang.Throwable -> L5a
                throw r13     // Catch: java.lang.Throwable -> L5a
            L119:
                java.lang.String r13 = "closed"
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5a
                java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L5a
                r14.<init>(r13)     // Catch: java.lang.Throwable -> L5a
                throw r14     // Catch: java.lang.Throwable -> L5a
            L125:
                r0.unlock()
                throw r13
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤۡۡ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe$source$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,257:1\n1#2:258\n*E\n"})
    public static final class C4772 implements Yue.InterfaceC5839 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.C6250 f15121;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4770 f15122;

        public C4772(Yue.C4770 r1) {
                r0 = this;
                r0.f15122 = r1
                r0.<init>()
                Yue.ۥۢۡۤۧ r1 = new Yue.ۥۢۡۤۧ
                r1.<init>()
                r0.f15121 = r1
                return
        }

        @Override // Yue.InterfaceC5839, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r3 = this;
                Yue.ۥۡۤۡۡ r0 = r3.f15122
                java.util.concurrent.locks.ReentrantLock r0 = r0.m18998()
                Yue.ۥۡۤۡۡ r1 = r3.f15122
                r0.lock()
                r2 = 1
                r1.m19005(r2)     // Catch: java.lang.Throwable -> L1c
                java.util.concurrent.locks.Condition r1 = r1.m18996()     // Catch: java.lang.Throwable -> L1c
                r1.signalAll()     // Catch: java.lang.Throwable -> L1c
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L1c
                r0.unlock()
                return
            L1c:
                r1 = move-exception
                r0.unlock()
                throw r1
        }

        @Override // Yue.InterfaceC5839
        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ */
        public Yue.C6250 mo4177() {
                r1 = this;
                Yue.ۥۢۡۤۧ r0 = r1.f15121
                return r0
        }

        @Override // Yue.InterfaceC5839
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
        public long mo4179(@Yue.InterfaceC4418 Yue.C0843 r9, long r10) {
                r8 = this;
                java.lang.String r0 = "sink"
                Yue.C3329.m13906(r9, r0)
                Yue.ۥۡۤۡۡ r0 = r8.f15122
                java.util.concurrent.locks.ReentrantLock r0 = r0.m18998()
                Yue.ۥۡۤۡۡ r1 = r8.f15122
                r0.lock()
                boolean r2 = r1.m19001()     // Catch: java.lang.Throwable -> L50
                r2 = r2 ^ 1
                if (r2 == 0) goto L6b
                boolean r2 = r1.m18995()     // Catch: java.lang.Throwable -> L50
                java.lang.String r3 = "canceled"
                if (r2 != 0) goto L65
            L20:
                Yue.ۥۣ۟ۢۨ r2 = r1.m18994()     // Catch: java.lang.Throwable -> L50
                long r4 = r2.m4889()     // Catch: java.lang.Throwable -> L50
                r6 = 0
                int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r2 != 0) goto L52
                boolean r2 = r1.m19000()     // Catch: java.lang.Throwable -> L50
                if (r2 == 0) goto L3a
                r0.unlock()
                r9 = -1
                return r9
            L3a:
                Yue.ۥۢۡۤۧ r2 = r8.f15121     // Catch: java.lang.Throwable -> L50
                java.util.concurrent.locks.Condition r4 = r1.m18996()     // Catch: java.lang.Throwable -> L50
                r2.m23304(r4)     // Catch: java.lang.Throwable -> L50
                boolean r2 = r1.m18995()     // Catch: java.lang.Throwable -> L50
                if (r2 != 0) goto L4a
                goto L20
            L4a:
                java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L50
                r9.<init>(r3)     // Catch: java.lang.Throwable -> L50
                throw r9     // Catch: java.lang.Throwable -> L50
            L50:
                r9 = move-exception
                goto L77
            L52:
                Yue.ۥۣ۟ۢۨ r2 = r1.m18994()     // Catch: java.lang.Throwable -> L50
                long r9 = r2.mo4179(r9, r10)     // Catch: java.lang.Throwable -> L50
                java.util.concurrent.locks.Condition r11 = r1.m18996()     // Catch: java.lang.Throwable -> L50
                r11.signalAll()     // Catch: java.lang.Throwable -> L50
                r0.unlock()
                return r9
            L65:
                java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L50
                r9.<init>(r3)     // Catch: java.lang.Throwable -> L50
                throw r9     // Catch: java.lang.Throwable -> L50
            L6b:
                java.lang.String r9 = "closed"
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L50
                java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L50
                r10.<init>(r9)     // Catch: java.lang.Throwable -> L50
                throw r10     // Catch: java.lang.Throwable -> L50
            L77:
                r0.unlock()
                throw r9
        }
    }

    public C4770(long r3) {
            r2 = this;
            r2.<init>()
            r2.f15109 = r3
            Yue.ۥۣ۟ۢۨ r0 = new Yue.ۥۣ۟ۢۨ
            r0.<init>()
            r2.f15110 = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r2.f15115 = r0
            java.util.concurrent.locks.Condition r0 = r0.newCondition()
            java.lang.String r1 = "newCondition(...)"
            Yue.C3329.m13905(r0, r1)
            r2.f15116 = r0
            r0 = 1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L33
            Yue.ۥۡۤۡۡ$ۥ r3 = new Yue.ۥۡۤۡۡ$ۥ
            r3.<init>(r2)
            r2.f15117 = r3
            Yue.ۥۡۤۡۡ$ۥ۟ r3 = new Yue.ۥۡۤۡۡ$ۥ۟
            r3.<init>(r2)
            r2.f15118 = r3
            return
        L33:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "maxBufferSize < 1: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "sink", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_sink")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.InterfaceC5794 m18989() {
            r1 = this;
            Yue.ۥۣۢ۟ۡ r0 = r1.f15117
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "source", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_source")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.InterfaceC5839 m18990() {
            r1 = this;
            Yue.ۥۣۢ۟ۦ r0 = r1.f15118
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m18991() {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.f15115
            r0.lock()
            r1 = 1
            r2.f15111 = r1     // Catch: java.lang.Throwable -> L18
            Yue.ۥۣ۟ۢۨ r1 = r2.f15110     // Catch: java.lang.Throwable -> L18
            r1.m4808()     // Catch: java.lang.Throwable -> L18
            java.util.concurrent.locks.Condition r1 = r2.f15116     // Catch: java.lang.Throwable -> L18
            r1.signalAll()     // Catch: java.lang.Throwable -> L18
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L18
            r0.unlock()
            return
        L18:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m18992(@Yue.InterfaceC4418 Yue.InterfaceC5794 r8) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r8, r0)
        L5:
            java.util.concurrent.locks.ReentrantLock r0 = r7.f15115
            r0.lock()
            Yue.ۥۣۢ۟ۡ r1 = r7.f15114     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L73
            boolean r1 = r7.f15111     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L69
            Yue.ۥۣ۟ۢۨ r1 = r7.f15110     // Catch: java.lang.Throwable -> L23
            boolean r1 = r1.mo4827()     // Catch: java.lang.Throwable -> L23
            r2 = 1
            if (r1 == 0) goto L25
            r7.f15113 = r2     // Catch: java.lang.Throwable -> L23
            r7.f15114 = r8     // Catch: java.lang.Throwable -> L23
            r0.unlock()
            return
        L23:
            r8 = move-exception
            goto L7f
        L25:
            boolean r1 = r7.f15112     // Catch: java.lang.Throwable -> L23
            Yue.ۥۣ۟ۢۨ r3 = new Yue.ۥۣ۟ۢۨ     // Catch: java.lang.Throwable -> L23
            r3.<init>()     // Catch: java.lang.Throwable -> L23
            Yue.ۥۣ۟ۢۨ r4 = r7.f15110     // Catch: java.lang.Throwable -> L23
            long r5 = r4.m4889()     // Catch: java.lang.Throwable -> L23
            r3.mo4176(r4, r5)     // Catch: java.lang.Throwable -> L23
            java.util.concurrent.locks.Condition r4 = r7.f15116     // Catch: java.lang.Throwable -> L23
            r4.signalAll()     // Catch: java.lang.Throwable -> L23
            Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L23
            r0.unlock()
            long r4 = r3.m4889()     // Catch: java.lang.Throwable -> L4c
            r8.mo4176(r3, r4)     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L4e
            r8.close()     // Catch: java.lang.Throwable -> L4c
            goto L5
        L4c:
            r8 = move-exception
            goto L52
        L4e:
            r8.flush()     // Catch: java.lang.Throwable -> L4c
            goto L5
        L52:
            java.util.concurrent.locks.ReentrantLock r0 = r7.f15115
            r0.lock()
            r7.f15113 = r2     // Catch: java.lang.Throwable -> L64
            java.util.concurrent.locks.Condition r1 = r7.f15116     // Catch: java.lang.Throwable -> L64
            r1.signalAll()     // Catch: java.lang.Throwable -> L64
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L64
            r0.unlock()
            throw r8
        L64:
            r8 = move-exception
            r0.unlock()
            throw r8
        L69:
            r7.f15114 = r8     // Catch: java.lang.Throwable -> L23
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "canceled"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L23
            throw r8     // Catch: java.lang.Throwable -> L23
        L73:
            java.lang.String r8 = "sink already folded"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L23
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.lang.Throwable -> L23
        L7f:
            r0.unlock()
            throw r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m18993(Yue.InterfaceC5794 r14, Yue.InterfaceC2825<? super Yue.InterfaceC5794, Yue.C6593> r15) {
            r13 = this;
            Yue.ۥۢۡۤۧ r0 = r14.mo4174()
            Yue.ۥۣۢ۟ۡ r1 = r13.m19006()
            Yue.ۥۢۡۤۧ r1 = r1.mo4174()
            long r2 = r0.mo12064()
            Yue.ۥۢۡۤۧ$ۥ۟ r4 = Yue.C6250.f22299
            long r5 = r1.mo12064()
            long r7 = r0.mo12064()
            long r4 = r4.m23308(r5, r7)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0.mo12063(r4, r6)
            boolean r4 = r0.mo12061()
            r5 = 1
            if (r4 == 0) goto L71
            long r7 = r0.mo12059()
            boolean r4 = r1.mo12061()
            if (r4 == 0) goto L43
            long r9 = r0.mo12059()
            long r11 = r1.mo12059()
            long r9 = java.lang.Math.min(r9, r11)
            r0.mo12060(r9)
        L43:
            r15.invoke(r14)     // Catch: java.lang.Throwable -> L5b
            Yue.ۥۣۢ۠ۤ r14 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L5b
            Yue.C3249.m13687(r5)
            r0.mo12063(r2, r6)
            boolean r14 = r1.mo12061()
            if (r14 == 0) goto L57
            r0.mo12060(r7)
        L57:
            Yue.C3249.m13686(r5)
            goto L95
        L5b:
            r14 = move-exception
            Yue.C3249.m13687(r5)
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0.mo12063(r2, r15)
            boolean r15 = r1.mo12061()
            if (r15 == 0) goto L6d
            r0.mo12060(r7)
        L6d:
            Yue.C3249.m13686(r5)
            throw r14
        L71:
            boolean r4 = r1.mo12061()
            if (r4 == 0) goto L7e
            long r7 = r1.mo12059()
            r0.mo12060(r7)
        L7e:
            r15.invoke(r14)     // Catch: java.lang.Throwable -> L96
            Yue.ۥۣۢ۠ۤ r14 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L96
            Yue.C3249.m13687(r5)
            r0.mo12063(r2, r6)
            boolean r14 = r1.mo12061()
            if (r14 == 0) goto L92
            r0.mo12057()
        L92:
            Yue.C3249.m13686(r5)
        L95:
            return
        L96:
            r14 = move-exception
            Yue.C3249.m13687(r5)
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0.mo12063(r2, r15)
            boolean r15 = r1.mo12061()
            if (r15 == 0) goto La8
            r0.mo12057()
        La8:
            Yue.C3249.m13686(r5)
            throw r14
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final Yue.C0843 m18994() {
            r1 = this;
            Yue.ۥۣ۟ۢۨ r0 = r1.f15110
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean m18995() {
            r1 = this;
            boolean r0 = r1.f15111
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final java.util.concurrent.locks.Condition m18996() {
            r1 = this;
            java.util.concurrent.locks.Condition r0 = r1.f15116
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final Yue.InterfaceC5794 m18997() {
            r1 = this;
            Yue.ۥۣۢ۟ۡ r0 = r1.f15114
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final java.util.concurrent.locks.ReentrantLock m18998() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.f15115
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final long m18999() {
            r2 = this;
            long r0 = r2.f15109
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final boolean m19000() {
            r1 = this;
            boolean r0 = r1.f15112
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final boolean m19001() {
            r1 = this;
            boolean r0 = r1.f15113
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m19002(boolean r1) {
            r0 = this;
            r0.f15111 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m19003(@Yue.InterfaceC4543 Yue.InterfaceC5794 r1) {
            r0 = this;
            r0.f15114 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m19004(boolean r1) {
            r0 = this;
            r0.f15112 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m19005(boolean r1) {
            r0 = this;
            r0.f15113 = r1
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "sink")
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final Yue.InterfaceC5794 m19006() {
            r1 = this;
            Yue.ۥۣۢ۟ۡ r0 = r1.f15117
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "source")
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final Yue.InterfaceC5839 m19007() {
            r1 = this;
            Yue.ۥۣۢ۟ۦ r0 = r1.f15118
            return r0
    }
}
