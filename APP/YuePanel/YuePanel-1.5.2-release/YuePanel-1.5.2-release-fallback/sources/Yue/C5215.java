package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nRealCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,551:1\n1#2:552\n608#3,4:553\n615#3,4:557\n615#3,4:561\n608#3,4:565\n350#4,7:569\n*S KotlinDebug\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall\n*L\n269#1:553,4\n344#1:557,4\n348#1:561,4\n375#1:565,4\n378#1:569,7\n*E\n"})
public final class C5215 implements Yue.InterfaceC0904 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C4559 f19564;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C5317 f19565;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean f19566;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C5225 f19567;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.AbstractC2233 f19568;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C5215.C5218 f19569;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.concurrent.atomic.AtomicBoolean f19570;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public java.lang.Object f19571;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.C2274 f19572;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.C5219 f19573;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean f19574;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.C2269 f19575;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public boolean f19576;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public boolean f19577;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public boolean f19578;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public volatile boolean f19579;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public volatile Yue.C2269 f19580;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public volatile Yue.C5219 f19581;

    /* JADX INFO: renamed from: Yue.ۥۡۦ۠ۤ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nRealCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,551:1\n615#2,4:552\n409#2,9:556\n*S KotlinDebug\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n*L\n494#1:552,4\n513#1:556,9\n*E\n"})
    public final class RunnableC5216 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.InterfaceC0910 f19582;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public volatile java.util.concurrent.atomic.AtomicInteger f19583;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5215 f19584;

        public RunnableC5216(@Yue.InterfaceC4418 Yue.C5215 r2, Yue.InterfaceC0910 r3) {
                r1 = this;
                java.lang.String r0 = "responseCallback"
                Yue.C3329.m13906(r3, r0)
                r1.f19584 = r2
                r1.<init>()
                r1.f19582 = r3
                java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
                r3 = 0
                r2.<init>(r3)
                r1.f19583 = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "OkHttp "
                r0.append(r1)
                Yue.ۥۡۦ۠ۤ r1 = r8.f19584
                java.lang.String r1 = r1.m19692()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                Yue.ۥۡۦ۠ۤ r1 = r8.f19584
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                java.lang.String r3 = r2.getName()
                r2.setName(r0)
                Yue.ۥۡۦ۠ۤ$ۥ۟۟ r0 = Yue.C5215.m19672(r1)     // Catch: java.lang.Throwable -> L43
                r0.m4159()     // Catch: java.lang.Throwable -> L43
                r0 = 0
                Yue.ۥۡۦۧ r0 = r1.m19688()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L75
                r4 = 1
                Yue.ۥۣ۟ۦۧ r5 = r8.f19582     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
                r5.mo5252(r1, r0)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
                Yue.ۥۣۡۢۨ r0 = r1.m19681()     // Catch: java.lang.Throwable -> L43
                Yue.ۥ۠۟ۢۤ r0 = r0.m18177()     // Catch: java.lang.Throwable -> L43
            L3e:
                r0.m8776(r8)     // Catch: java.lang.Throwable -> L43
                goto La9
            L43:
                r0 = move-exception
                goto Lb9
            L46:
                r0 = move-exception
                goto L4e
            L48:
                r0 = move-exception
                goto L79
            L4a:
                r4 = move-exception
                r7 = r4
                r4 = r0
                r0 = r7
            L4e:
                r1.cancel()     // Catch: java.lang.Throwable -> L72
                if (r4 != 0) goto L74
                java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L72
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L72
                r5.<init>()     // Catch: java.lang.Throwable -> L72
                java.lang.String r6 = "canceled due to "
                r5.append(r6)     // Catch: java.lang.Throwable -> L72
                r5.append(r0)     // Catch: java.lang.Throwable -> L72
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L72
                r4.<init>(r5)     // Catch: java.lang.Throwable -> L72
                Yue.C2268.m10468(r4, r0)     // Catch: java.lang.Throwable -> L72
                Yue.ۥۣ۟ۦۧ r5 = r8.f19582     // Catch: java.lang.Throwable -> L72
                r5.mo5251(r1, r4)     // Catch: java.lang.Throwable -> L72
                goto L74
            L72:
                r0 = move-exception
                goto Lad
            L74:
                throw r0     // Catch: java.lang.Throwable -> L72
            L75:
                r4 = move-exception
                r7 = r4
                r4 = r0
                r0 = r7
            L79:
                if (r4 == 0) goto L9b
                Yue.ۥۡۤۡۢ$ۥ r4 = Yue.C4773.f15123     // Catch: java.lang.Throwable -> L72
                Yue.ۥۡۤۡۢ r4 = r4.m19021()     // Catch: java.lang.Throwable -> L72
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L72
                r5.<init>()     // Catch: java.lang.Throwable -> L72
                java.lang.String r6 = "Callback failure for "
                r5.append(r6)     // Catch: java.lang.Throwable -> L72
                java.lang.String r6 = Yue.C5215.m19673(r1)     // Catch: java.lang.Throwable -> L72
                r5.append(r6)     // Catch: java.lang.Throwable -> L72
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L72
                r6 = 4
                r4.m19013(r5, r6, r0)     // Catch: java.lang.Throwable -> L72
                goto La0
            L9b:
                Yue.ۥۣ۟ۦۧ r4 = r8.f19582     // Catch: java.lang.Throwable -> L72
                r4.mo5251(r1, r0)     // Catch: java.lang.Throwable -> L72
            La0:
                Yue.ۥۣۡۢۨ r0 = r1.m19681()     // Catch: java.lang.Throwable -> L43
                Yue.ۥ۠۟ۢۤ r0 = r0.m18177()     // Catch: java.lang.Throwable -> L43
                goto L3e
            La9:
                r2.setName(r3)
                return
            Lad:
                Yue.ۥۣۡۢۨ r1 = r1.m19681()     // Catch: java.lang.Throwable -> L43
                Yue.ۥ۠۟ۢۤ r1 = r1.m18177()     // Catch: java.lang.Throwable -> L43
                r1.m8776(r8)     // Catch: java.lang.Throwable -> L43
                throw r0     // Catch: java.lang.Throwable -> L43
            Lb9:
                r2.setName(r3)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m19700(@Yue.InterfaceC4418 java.util.concurrent.ExecutorService r4) {
                r3 = this;
                java.lang.String r0 = "executorService"
                Yue.C3329.m13906(r4, r0)
                Yue.ۥۡۦ۠ۤ r0 = r3.f19584
                Yue.ۥۣۡۢۨ r0 = r0.m19681()
                Yue.ۥ۠۟ۢۤ r0 = r0.m18177()
                boolean r1 = Yue.C6656.f23211
                if (r1 == 0) goto L41
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L1a
                goto L41
            L1a:
                java.lang.AssertionError r4 = new java.lang.AssertionError
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Thread "
                r1.append(r2)
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                java.lang.String r2 = r2.getName()
                r1.append(r2)
                java.lang.String r2 = " MUST NOT hold lock on "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r4.<init>(r0)
                throw r4
            L41:
                r4.execute(r3)     // Catch: java.lang.Throwable -> L45 java.util.concurrent.RejectedExecutionException -> L47
                goto L6b
            L45:
                r4 = move-exception
                goto L6c
            L47:
                r4 = move-exception
                java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L45
                java.lang.String r1 = "executor rejected"
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L45
                r0.initCause(r4)     // Catch: java.lang.Throwable -> L45
                Yue.ۥۡۦ۠ۤ r4 = r3.f19584     // Catch: java.lang.Throwable -> L45
                r4.m19691(r0)     // Catch: java.lang.Throwable -> L45
                Yue.ۥۣ۟ۦۧ r4 = r3.f19582     // Catch: java.lang.Throwable -> L45
                Yue.ۥۡۦ۠ۤ r1 = r3.f19584     // Catch: java.lang.Throwable -> L45
                r4.mo5251(r1, r0)     // Catch: java.lang.Throwable -> L45
                Yue.ۥۡۦ۠ۤ r4 = r3.f19584
                Yue.ۥۣۡۢۨ r4 = r4.m19681()
                Yue.ۥ۠۟ۢۤ r4 = r4.m18177()
                r4.m8776(r3)
            L6b:
                return
            L6c:
                Yue.ۥۡۦ۠ۤ r0 = r3.f19584
                Yue.ۥۣۡۢۨ r0 = r0.m19681()
                Yue.ۥ۠۟ۢۤ r0 = r0.m18177()
                r0.m8776(r3)
                throw r4
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Yue.C5215 m19701() {
                r1 = this;
                Yue.ۥۡۦ۠ۤ r0 = r1.f19584
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.util.concurrent.atomic.AtomicInteger m19702() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.f19583
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final java.lang.String m19703() {
                r1 = this;
                Yue.ۥۡۦ۠ۤ r0 = r1.f19584
                Yue.ۥۡۦۤۧ r0 = r0.m19687()
                Yue.ۥ۠ۤۨۥ r0 = r0.m20090()
                java.lang.String r0 = r0.m13463()
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final Yue.C5317 m19704() {
                r1 = this;
                Yue.ۥۡۦ۠ۤ r0 = r1.f19584
                Yue.ۥۡۦۤۧ r0 = r0.m19687()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final void m19705(@Yue.InterfaceC4418 Yue.C5215.RunnableC5216 r2) {
                r1 = this;
                java.lang.String r0 = "other"
                Yue.C3329.m13906(r2, r0)
                java.util.concurrent.atomic.AtomicInteger r2 = r2.f19583
                r1.f19583 = r2
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦ۠ۤ$ۥ۟, reason: contains not printable characters */
    public static final class C5217 extends java.lang.ref.WeakReference<Yue.C5215> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4543
        public final java.lang.Object f19585;

        public C5217(@Yue.InterfaceC4418 Yue.C5215 r2, @Yue.InterfaceC4543 java.lang.Object r3) {
                r1 = this;
                java.lang.String r0 = "referent"
                Yue.C3329.m13906(r2, r0)
                r1.<init>(r2)
                r1.f19585 = r3
                return
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.Object m19706() {
                r1 = this;
                java.lang.Object r0 = r1.f19585
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦ۠ۤ$ۥ۟۟, reason: contains not printable characters */
    public static final class C5218 extends Yue.C0632 {

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5215 f19586;

        public C5218(Yue.C5215 r1) {
                r0 = this;
                r0.f19586 = r1
                r0.<init>()
                return
        }

        @Override // Yue.C0632
        /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
        public void mo4165() {
                r1 = this;
                Yue.ۥۡۦ۠ۤ r0 = r1.f19586
                r0.cancel()
                return
        }
    }

    public C5215(@Yue.InterfaceC4418 Yue.C4559 r3, @Yue.InterfaceC4418 Yue.C5317 r4, boolean r5) {
            r2 = this;
            java.lang.String r0 = "client"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "originalRequest"
            Yue.C3329.m13906(r4, r0)
            r2.<init>()
            r2.f19564 = r3
            r2.f19565 = r4
            r2.f19566 = r5
            Yue.ۥ۟ۦۧۦ r4 = r3.m18174()
            Yue.ۥۡۦ۠ۦ r4 = r4.m7322()
            r2.f19567 = r4
            Yue.ۥ۠ۡۡ۟$ۥ۟۟ r4 = r3.m18179()
            Yue.ۥ۠ۡۡ۟ r4 = r4.mo10250(r2)
            r2.f19568 = r4
            Yue.ۥۡۦ۠ۤ$ۥ۟۟ r4 = new Yue.ۥۡۦ۠ۤ$ۥ۟۟
            r4.<init>(r2)
            int r3 = r3.m18170()
            long r0 = (long) r3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r4.mo12063(r0, r3)
            r2.f19569 = r4
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r3.<init>()
            r2.f19570 = r3
            r3 = 1
            r2.f19578 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C5215.C5218 m19672(Yue.C5215 r0) {
            Yue.ۥۡۦ۠ۤ$ۥ۟۟ r0 = r0.f19569
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.String m19673(Yue.C5215 r0) {
            java.lang.String r0 = r0.m19699()
            return r0
    }

    @Override // Yue.InterfaceC0904
    public void cancel() {
            r1 = this;
            boolean r0 = r1.f19579
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.f19579 = r0
            Yue.ۥۣ۠ۡ۟ r0 = r1.f19580
            if (r0 == 0) goto Lf
            r0.m10478()
        Lf:
            Yue.ۥۡۦ۠ۥ r0 = r1.f19581
            if (r0 == 0) goto L16
            r0.m19709()
        L16:
            Yue.ۥ۠ۡۡ۟ r0 = r1.f19568
            r0.mo10227(r1)
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            Yue.ۥۡۦ۠ۤ r0 = r1.m19677()
            return r0
    }

    @Override // Yue.InterfaceC0904
    /* JADX INFO: renamed from: ۥ */
    public /* bridge */ /* synthetic */ Yue.C6250 mo5240() {
            r1 = this;
            Yue.ۥ۟ۢ۟ۤ r0 = r1.m19696()
            return r0
    }

    @Override // Yue.InterfaceC0904
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ */
    public Yue.C5317 mo5241() {
            r1 = this;
            Yue.ۥۡۦۤۧ r0 = r1.f19565
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m19674(@Yue.InterfaceC4418 Yue.C5219 r4) {
            r3 = this;
            java.lang.String r0 = "connection"
            Yue.C3329.m13906(r4, r0)
            boolean r0 = Yue.C6656.f23211
            if (r0 == 0) goto L37
            boolean r0 = java.lang.Thread.holdsLock(r4)
            if (r0 == 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L37:
            Yue.ۥۡۦ۠ۥ r0 = r3.f19573
            if (r0 != 0) goto L4c
            r3.f19573 = r4
            java.util.List r4 = r4.m19719()
            Yue.ۥۡۦ۠ۤ$ۥ۟ r0 = new Yue.ۥۡۦ۠ۤ$ۥ۟
            java.lang.Object r1 = r3.f19571
            r0.<init>(r3, r1)
            r4.add(r0)
            return
        L4c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final <E extends java.io.IOException> E m19675(E r4) {
            r3 = this;
            boolean r0 = Yue.C6656.f23211
            if (r0 == 0) goto L32
            boolean r1 = java.lang.Thread.holdsLock(r3)
            if (r1 != 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Thread "
            r0.append(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " MUST NOT hold lock on "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L32:
            Yue.ۥۡۦ۠ۥ r1 = r3.f19573
            if (r1 == 0) goto L8d
            if (r0 == 0) goto L66
            boolean r0 = java.lang.Thread.holdsLock(r1)
            if (r0 != 0) goto L3f
            goto L66
        L3f:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Thread "
            r0.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = " MUST NOT hold lock on "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L66:
            monitor-enter(r1)
            java.net.Socket r0 = r3.m19693()     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r1)
            Yue.ۥۡۦ۠ۥ r2 = r3.f19573
            if (r2 != 0) goto L7b
            if (r0 == 0) goto L75
            Yue.C6656.m25569(r0)
        L75:
            Yue.ۥ۠ۡۡ۟ r0 = r3.f19568
            r0.mo10232(r3, r1)
            goto L8d
        L7b:
            if (r0 != 0) goto L7e
            goto L8d
        L7e:
            java.lang.String r4 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L8a:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        L8d:
            java.io.IOException r0 = r3.m19698(r4)
            if (r4 == 0) goto L9c
            Yue.ۥ۠ۡۡ۟ r4 = r3.f19568
            Yue.C3329.m13903(r0)
            r4.mo10225(r3, r0)
            goto La1
        L9c:
            Yue.ۥ۠ۡۡ۟ r4 = r3.f19568
            r4.mo10224(r3)
        La1:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m19676() {
            r2 = this;
            Yue.ۥۡۤۡۢ$ۥ r0 = Yue.C4773.f15123
            Yue.ۥۡۤۡۢ r0 = r0.m19021()
            java.lang.String r1 = "response.body().close()"
            java.lang.Object r0 = r0.mo1423(r1)
            r2.f19571 = r0
            Yue.ۥ۠ۡۡ۟ r0 = r2.f19568
            r0.mo10226(r2)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Yue.C5215 m19677() {
            r4 = this;
            Yue.ۥۡۦ۠ۤ r0 = new Yue.ۥۡۦ۠ۤ
            Yue.ۥۣۡۢۨ r1 = r4.f19564
            Yue.ۥۡۦۤۧ r2 = r4.f19565
            boolean r3 = r4.f19566
            r0.<init>(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final Yue.C0296 m19678(Yue.C3171 r15) {
            r14 = this;
            boolean r0 = r15.m13464()
            if (r0 == 0) goto L1c
            Yue.ۥۣۡۢۨ r0 = r14.f19564
            javax.net.ssl.SSLSocketFactory r0 = r0.m18196()
            Yue.ۥۣۡۢۨ r1 = r14.f19564
            javax.net.ssl.HostnameVerifier r1 = r1.m18183()
            Yue.ۥۣۡۢۨ r2 = r14.f19564
            Yue.ۥ۟ۤ۟ۧ r2 = r2.m18172()
            r6 = r0
            r7 = r1
            r8 = r2
            goto L20
        L1c:
            r0 = 0
            r6 = r0
            r7 = r6
            r8 = r7
        L20:
            Yue.ۥ۟۠ۢ r0 = new Yue.ۥ۟۠ۢ
            java.lang.String r2 = r15.m13463()
            int r3 = r15.m13470()
            Yue.ۥۣۡۢۨ r15 = r14.f19564
            Yue.ۥ۠۟ۧۢ r4 = r15.m18178()
            Yue.ۥۣۡۢۨ r15 = r14.f19564
            javax.net.SocketFactory r5 = r15.m18195()
            Yue.ۥۣۡۢۨ r15 = r14.f19564
            Yue.ۥ۟ۢۡۡ r9 = r15.m18191()
            Yue.ۥۣۡۢۨ r15 = r14.f19564
            java.net.Proxy r10 = r15.m18190()
            Yue.ۥۣۡۢۨ r15 = r14.f19564
            java.util.List r11 = r15.m18189()
            Yue.ۥۣۡۢۨ r15 = r14.f19564
            java.util.List r12 = r15.m18175()
            Yue.ۥۣۡۢۨ r15 = r14.f19564
            java.net.ProxySelector r13 = r15.m18192()
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m19679(@Yue.InterfaceC4418 Yue.C5317 r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "request"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥۣ۠ۡ۟ r0 = r2.f19575
            if (r0 != 0) goto L4b
            monitor-enter(r2)
            boolean r0 = r2.f19577     // Catch: java.lang.Throwable -> L2f
            r0 = r0 ^ 1
            if (r0 == 0) goto L3d
            boolean r0 = r2.f19576     // Catch: java.lang.Throwable -> L2f
            r0 = r0 ^ 1
            if (r0 == 0) goto L31
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r2)
            if (r4 == 0) goto L2e
            Yue.ۥۣ۠ۡۡ r4 = new Yue.ۥۣ۠ۡۡ
            Yue.ۥۡۦ۠ۦ r0 = r2.f19567
            Yue.ۥ۠ۤۨۥ r3 = r3.m20090()
            Yue.ۥ۟۠ۢ r3 = r2.m19678(r3)
            Yue.ۥ۠ۡۡ۟ r1 = r2.f19568
            r4.<init>(r0, r3, r2, r1)
            r2.f19572 = r4
        L2e:
            return
        L2f:
            r3 = move-exception
            goto L49
        L31:
            java.lang.String r3 = "Check failed."
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2f
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L2f
            throw r4     // Catch: java.lang.Throwable -> L2f
        L3d:
            java.lang.String r3 = "cannot make a new request because the previous response is still open: please call response.close()"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2f
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L2f
            throw r4     // Catch: java.lang.Throwable -> L2f
        L49:
            monitor-exit(r2)
            throw r3
        L4b:
            java.lang.String r3 = "Check failed."
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m19680(boolean r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f19578     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)
            if (r2 == 0) goto L11
            Yue.ۥۣ۠ۡ۟ r2 = r1.f19580
            if (r2 == 0) goto L11
            r2.m10480()
        L11:
            r2 = 0
            r1.f19575 = r2
            return
        L15:
            r2 = move-exception
            goto L23
        L17:
            java.lang.String r2 = "released"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L15
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L15
            throw r0     // Catch: java.lang.Throwable -> L15
        L23:
            monitor-exit(r1)
            throw r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final Yue.C4559 m19681() {
            r1 = this;
            Yue.ۥۣۡۢۨ r0 = r1.f19564
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final Yue.C5219 m19682() {
            r1 = this;
            Yue.ۥۡۦ۠ۥ r0 = r1.f19573
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final Yue.C5219 m19683() {
            r1 = this;
            Yue.ۥۡۦ۠ۥ r0 = r1.f19581
            return r0
    }

    @Override // Yue.InterfaceC0904
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public Yue.C5377 mo5242() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f19570
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L34
            Yue.ۥۡۦ۠ۤ$ۥ۟۟ r0 = r3.f19569
            r0.m4159()
            r3.m19676()
            Yue.ۥۣۡۢۨ r0 = r3.f19564     // Catch: java.lang.Throwable -> L29
            Yue.ۥ۠۟ۢۤ r0 = r0.m18177()     // Catch: java.lang.Throwable -> L29
            r0.m8772(r3)     // Catch: java.lang.Throwable -> L29
            Yue.ۥۡۦۧ r0 = r3.m19688()     // Catch: java.lang.Throwable -> L29
            Yue.ۥۣۡۢۨ r1 = r3.f19564
            Yue.ۥ۠۟ۢۤ r1 = r1.m18177()
            r1.m8777(r3)
            return r0
        L29:
            r0 = move-exception
            Yue.ۥۣۡۢۨ r1 = r3.f19564
            Yue.ۥ۠۟ۢۤ r1 = r1.m18177()
            r1.m8777(r3)
            throw r0
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already Executed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final Yue.AbstractC2233 m19684() {
            r1 = this;
            Yue.ۥ۠ۡۡ۟ r0 = r1.f19568
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final boolean m19685() {
            r1 = this;
            boolean r0 = r1.f19566
            return r0
    }

    @Override // Yue.InterfaceC0904
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public boolean mo5243() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f19570
            boolean r0 = r0.get()
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final Yue.C2269 m19686() {
            r1 = this;
            Yue.ۥۣ۠ۡ۟ r0 = r1.f19575
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Yue.C5317 m19687() {
            r1 = this;
            Yue.ۥۡۦۤۧ r0 = r1.f19565
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final Yue.C5377 m19688() throws java.io.IOException {
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            Yue.ۥۣۡۢۨ r0 = r11.f19564
            java.util.List r0 = r0.m18184()
            Yue.C1216.m6247(r2, r0)
            Yue.ۥۡۦۨۢ r0 = new Yue.ۥۡۦۨۢ
            Yue.ۥۣۡۢۨ r1 = r11.f19564
            r0.<init>(r1)
            r2.add(r0)
            Yue.ۥۣ۟ۢ۠ r0 = new Yue.ۥۣ۟ۢ۠
            Yue.ۥۣۡۢۨ r1 = r11.f19564
            Yue.ۥ۟ۧۦ r1 = r1.m18176()
            r0.<init>(r1)
            r2.add(r0)
            Yue.ۥۣ۟ۦ۠ r0 = new Yue.ۥۣ۟ۦ۠
            Yue.ۥۣۡۢۨ r1 = r11.f19564
            Yue.ۥۣ۟ۥۧ r1 = r1.m18169()
            r0.<init>(r1)
            r2.add(r0)
            Yue.ۥ۟ۦۣۧ r0 = Yue.C1477.f4622
            r2.add(r0)
            boolean r0 = r11.f19566
            if (r0 != 0) goto L46
            Yue.ۥۣۡۢۨ r0 = r11.f19564
            java.util.List r0 = r0.m18186()
            Yue.C1216.m6247(r2, r0)
        L46:
            Yue.ۥۣ۟ۦۤ r0 = new Yue.ۥۣ۟ۦۤ
            boolean r1 = r11.f19566
            r0.<init>(r1)
            r2.add(r0)
            Yue.ۥۡۦ۠ۧ r9 = new Yue.ۥۡۦ۠ۧ
            Yue.ۥۡۦۤۧ r5 = r11.f19565
            Yue.ۥۣۡۢۨ r0 = r11.f19564
            int r6 = r0.m18173()
            Yue.ۥۣۡۢۨ r0 = r11.f19564
            int r7 = r0.m18193()
            Yue.ۥۣۡۢۨ r0 = r11.f19564
            int r8 = r0.m18198()
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            Yue.ۥۡۦۤۧ r2 = r11.f19565     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            Yue.ۥۡۦۧ r2 = r9.mo13878(r2)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            boolean r3 = r11.mo5244()     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            if (r3 != 0) goto L7f
            r11.m19691(r0)
            return r2
        L7f:
            Yue.C6656.m25567(r2)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            throw r2     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
        L8a:
            r2 = move-exception
            goto L9c
        L8c:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r11.m19691(r1)     // Catch: java.lang.Throwable -> L98
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            Yue.C3329.m13904(r1, r3)     // Catch: java.lang.Throwable -> L98
            throw r1     // Catch: java.lang.Throwable -> L98
        L98:
            r1 = move-exception
            r10 = r2
            r2 = r1
            r1 = r10
        L9c:
            if (r1 != 0) goto La1
            r11.m19691(r0)
        La1:
            throw r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final Yue.C2269 m19689(@Yue.InterfaceC4418 Yue.C5228 r5) {
            r4 = this;
            java.lang.String r0 = "chain"
            Yue.C3329.m13906(r5, r0)
            monitor-enter(r4)
            boolean r0 = r4.f19578     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L5e
            boolean r0 = r4.f19577     // Catch: java.lang.Throwable -> L44
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L52
            boolean r0 = r4.f19576     // Catch: java.lang.Throwable -> L44
            r0 = r0 ^ r1
            if (r0 == 0) goto L46
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L44
            monitor-exit(r4)
            Yue.ۥۣ۠ۡۡ r0 = r4.f19572
            Yue.C3329.m13903(r0)
            Yue.ۥۣۡۢۨ r2 = r4.f19564
            Yue.ۥۣ۠ۡ۠ r5 = r0.m10512(r2, r5)
            Yue.ۥۣ۠ۡ۟ r2 = new Yue.ۥۣ۠ۡ۟
            Yue.ۥ۠ۡۡ۟ r3 = r4.f19568
            r2.<init>(r4, r3, r0, r5)
            r4.f19575 = r2
            r4.f19580 = r2
            monitor-enter(r4)
            r4.f19576 = r1     // Catch: java.lang.Throwable -> L41
            r4.f19577 = r1     // Catch: java.lang.Throwable -> L41
            monitor-exit(r4)
            boolean r5 = r4.f19579
            if (r5 != 0) goto L39
            return r2
        L39:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r0 = "Canceled"
            r5.<init>(r0)
            throw r5
        L41:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L44:
            r5 = move-exception
            goto L6a
        L46:
            java.lang.String r5 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L44
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L44
            throw r0     // Catch: java.lang.Throwable -> L44
        L52:
            java.lang.String r5 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L44
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L44
            throw r0     // Catch: java.lang.Throwable -> L44
        L5e:
            java.lang.String r5 = "released"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L44
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L44
            throw r0     // Catch: java.lang.Throwable -> L44
        L6a:
            monitor-exit(r4)
            throw r5
    }

    @Override // Yue.InterfaceC0904
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public boolean mo5244() {
            r1 = this;
            boolean r0 = r1.f19579
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final <E extends java.io.IOException> E m19690(@Yue.InterfaceC4418 Yue.C2269 r2, boolean r3, boolean r4, E r5) {
            r1 = this;
            java.lang.String r0 = "exchange"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۣ۠ۡ۟ r0 = r1.f19580
            boolean r2 = Yue.C3329.m13897(r2, r0)
            if (r2 != 0) goto Le
            return r5
        Le:
            monitor-enter(r1)
            r2 = 0
            if (r3 == 0) goto L19
            boolean r0 = r1.f19576     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1f
            goto L19
        L17:
            r2 = move-exception
            goto L59
        L19:
            if (r4 == 0) goto L41
            boolean r0 = r1.f19577     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L41
        L1f:
            if (r3 == 0) goto L23
            r1.f19576 = r2     // Catch: java.lang.Throwable -> L17
        L23:
            if (r4 == 0) goto L27
            r1.f19577 = r2     // Catch: java.lang.Throwable -> L17
        L27:
            boolean r3 = r1.f19576     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 != 0) goto L32
            boolean r0 = r1.f19577     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L32
            r0 = r4
            goto L33
        L32:
            r0 = r2
        L33:
            if (r3 != 0) goto L3e
            boolean r3 = r1.f19577     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            boolean r3 = r1.f19578     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            r2 = r4
        L3e:
            r3 = r2
            r2 = r0
            goto L42
        L41:
            r3 = r2
        L42:
            Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            if (r2 == 0) goto L51
            r2 = 0
            r1.f19580 = r2
            Yue.ۥۡۦ۠ۥ r2 = r1.f19573
            if (r2 == 0) goto L51
            r2.m19724()
        L51:
            if (r3 == 0) goto L58
            java.io.IOException r2 = r1.m19675(r5)
            return r2
        L58:
            return r5
        L59:
            monitor-exit(r1)
            throw r2
    }

    @Override // Yue.InterfaceC0904
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public /* bridge */ /* synthetic */ Yue.InterfaceC0904 mo5245() {
            r1 = this;
            Yue.ۥۡۦ۠ۤ r0 = r1.m19677()
            return r0
    }

    @Override // Yue.InterfaceC0904
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public void mo5246(@Yue.InterfaceC4418 Yue.InterfaceC0910 r4) {
            r3 = this;
            java.lang.String r0 = "responseCallback"
            Yue.C3329.m13906(r4, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f19570
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L21
            r3.m19676()
            Yue.ۥۣۡۢۨ r0 = r3.f19564
            Yue.ۥ۠۟ۢۤ r0 = r0.m18177()
            Yue.ۥۡۦ۠ۤ$ۥ r1 = new Yue.ۥۡۦ۠ۤ$ۥ
            r1.<init>(r3, r4)
            r0.m8771(r1)
            return
        L21:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already Executed"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final java.io.IOException m19691(@Yue.InterfaceC4543 java.io.IOException r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f19578     // Catch: java.lang.Throwable -> L12
            r1 = 0
            if (r0 == 0) goto L14
            r2.f19578 = r1     // Catch: java.lang.Throwable -> L12
            boolean r0 = r2.f19576     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L14
            boolean r0 = r2.f19577     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L14
            r1 = 1
            goto L14
        L12:
            r3 = move-exception
            goto L1e
        L14:
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)
            if (r1 == 0) goto L1d
            java.io.IOException r3 = r2.m19675(r3)
        L1d:
            return r3
        L1e:
            monitor-exit(r2)
            throw r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final java.lang.String m19692() {
            r1 = this;
            Yue.ۥۡۦۤۧ r0 = r1.f19565
            Yue.ۥ۠ۤۨۥ r0 = r0.m20090()
            java.lang.String r0 = r0.m13478()
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final java.net.Socket m19693() {
            r6 = this;
            Yue.ۥۡۦ۠ۥ r0 = r6.f19573
            Yue.C3329.m13903(r0)
            boolean r1 = Yue.C6656.f23211
            if (r1 == 0) goto L37
            boolean r1 = java.lang.Thread.holdsLock(r0)
            if (r1 == 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Thread "
            r2.append(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = " MUST hold lock on "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L37:
            java.util.List r1 = r0.m19719()
            java.util.Iterator r2 = r1.iterator()
            r3 = 0
        L40:
            boolean r4 = r2.hasNext()
            r5 = -1
            if (r4 == 0) goto L5b
            java.lang.Object r4 = r2.next()
            java.lang.ref.Reference r4 = (java.lang.ref.Reference) r4
            java.lang.Object r4 = r4.get()
            boolean r4 = Yue.C3329.m13897(r4, r6)
            if (r4 == 0) goto L58
            goto L5c
        L58:
            int r3 = r3 + 1
            goto L40
        L5b:
            r3 = r5
        L5c:
            if (r3 == r5) goto L7f
            r1.remove(r3)
            r2 = 0
            r6.f19573 = r2
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L7e
            long r3 = java.lang.System.nanoTime()
            r0.m19733(r3)
            Yue.ۥۡۦ۠ۦ r1 = r6.f19567
            boolean r1 = r1.m19742(r0)
            if (r1 == 0) goto L7e
            java.net.Socket r0 = r0.mo7319()
            return r0
        L7e:
            return r2
        L7f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final boolean m19694() {
            r1 = this;
            Yue.ۥۣ۠ۡۡ r0 = r1.f19572
            Yue.C3329.m13903(r0)
            boolean r0 = r0.m10516()
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m19695(@Yue.InterfaceC4543 Yue.C5219 r1) {
            r0 = this;
            r0.f19581 = r1
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public Yue.C0632 m19696() {
            r1 = this;
            Yue.ۥۡۦ۠ۤ$ۥ۟۟ r0 = r1.f19569
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final void m19697() {
            r2 = this;
            boolean r0 = r2.f19574
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto Le
            r2.f19574 = r1
            Yue.ۥۡۦ۠ۤ$ۥ۟۟ r0 = r2.f19569
            r0.m4160()
            return
        Le:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final <E extends java.io.IOException> E m19698(E r3) {
            r2 = this;
            boolean r0 = r2.f19574
            if (r0 == 0) goto L5
            return r3
        L5:
            Yue.ۥۡۦ۠ۤ$ۥ۟۟ r0 = r2.f19569
            boolean r0 = r0.m4160()
            if (r0 != 0) goto Le
            return r3
        Le:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "timeout"
            r0.<init>(r1)
            if (r3 == 0) goto L1a
            r0.initCause(r3)
        L1a:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final java.lang.String m19699() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r2.mo5244()
            if (r1 == 0) goto Le
            java.lang.String r1 = "canceled "
            goto L10
        Le:
            java.lang.String r1 = ""
        L10:
            r0.append(r1)
            boolean r1 = r2.f19566
            if (r1 == 0) goto L1a
            java.lang.String r1 = "web socket"
            goto L1c
        L1a:
            java.lang.String r1 = "call"
        L1c:
            r0.append(r1)
            java.lang.String r1 = " to "
            r0.append(r1)
            java.lang.String r1 = r2.m19692()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
