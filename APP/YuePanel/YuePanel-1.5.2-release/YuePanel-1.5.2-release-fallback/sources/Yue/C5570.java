package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۨ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
@java.lang.Deprecated
public class C5570 {

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f20527 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f20528 = 0;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.Object f20529;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC2947("mLock")
    public android.os.HandlerThread f20530;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC2947("mLock")
    public android.os.Handler f20531;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC2947("mLock")
    public int f20532;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public android.os.Handler.Callback f20533;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int f20534;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int f20535;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final java.lang.String f20536;

    /* JADX INFO: renamed from: Yue.ۥۡۨ۟ۢ$ۥ, reason: contains not printable characters */
    public class C5571 implements android.os.Handler.Callback {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5570 f20537;

        public C5571(Yue.C5570 r1) {
                r0 = this;
                r0.f20537 = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = 1
                if (r0 == 0) goto L12
                if (r0 == r1) goto L8
                return r1
            L8:
                Yue.ۥۡۨ۟ۢ r0 = r2.f20537
                java.lang.Object r3 = r3.obj
                java.lang.Runnable r3 = (java.lang.Runnable) r3
                r0.m20881(r3)
                return r1
            L12:
                Yue.ۥۡۨ۟ۢ r3 = r2.f20537
                r3.m20880()
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۨ۟ۢ$ۥ۟, reason: contains not printable characters */
    public class RunnableC5572 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.util.concurrent.Callable f20538;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ android.os.Handler f20539;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5570.InterfaceC5575 f20540;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5570 f20541;

        /* JADX INFO: renamed from: Yue.ۥۡۨ۟ۢ$ۥ۟$ۥ, reason: contains not printable characters */
        public class RunnableC5573 implements java.lang.Runnable {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ java.lang.Object f20542;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C5570.RunnableC5572 f20543;

            public RunnableC5573(Yue.C5570.RunnableC5572 r1, java.lang.Object r2) {
                    r0 = this;
                    r0.f20543 = r1
                    r0.f20542 = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    Yue.ۥۡۨ۟ۢ$ۥ۟ r0 = r2.f20543
                    Yue.ۥۡۨ۟ۢ$ۥ۟۟۟ r0 = r0.f20540
                    java.lang.Object r1 = r2.f20542
                    r0.m20885(r1)
                    return
            }
        }

        public RunnableC5572(Yue.C5570 r1, java.util.concurrent.Callable r2, android.os.Handler r3, Yue.C5570.InterfaceC5575 r4) {
                r0 = this;
                r0.f20541 = r1
                r0.f20538 = r2
                r0.f20539 = r3
                r0.f20540 = r4
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                java.util.concurrent.Callable r0 = r3.f20538     // Catch: java.lang.Exception -> L7
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L7
                goto L8
            L7:
                r0 = 0
            L8:
                android.os.Handler r1 = r3.f20539
                Yue.ۥۡۨ۟ۢ$ۥ۟$ۥ r2 = new Yue.ۥۡۨ۟ۢ$ۥ۟$ۥ
                r2.<init>(r3, r0)
                r1.post(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۨ۟ۢ$ۥ۟۟, reason: contains not printable characters */
    public class RunnableC5574 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f20544;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ java.util.concurrent.Callable f20545;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ java.util.concurrent.locks.ReentrantLock f20546;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f20547;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ java.util.concurrent.locks.Condition f20548;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5570 f20549;

        public RunnableC5574(Yue.C5570 r1, java.util.concurrent.atomic.AtomicReference r2, java.util.concurrent.Callable r3, java.util.concurrent.locks.ReentrantLock r4, java.util.concurrent.atomic.AtomicBoolean r5, java.util.concurrent.locks.Condition r6) {
                r0 = this;
                r0.f20549 = r1
                r0.f20544 = r2
                r0.f20545 = r3
                r0.f20546 = r4
                r0.f20547 = r5
                r0.f20548 = r6
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference r0 = r2.f20544     // Catch: java.lang.Exception -> Lb
                java.util.concurrent.Callable r1 = r2.f20545     // Catch: java.lang.Exception -> Lb
                java.lang.Object r1 = r1.call()     // Catch: java.lang.Exception -> Lb
                r0.set(r1)     // Catch: java.lang.Exception -> Lb
            Lb:
                java.util.concurrent.locks.ReentrantLock r0 = r2.f20546
                r0.lock()
                java.util.concurrent.atomic.AtomicBoolean r0 = r2.f20547     // Catch: java.lang.Throwable -> L21
                r1 = 0
                r0.set(r1)     // Catch: java.lang.Throwable -> L21
                java.util.concurrent.locks.Condition r0 = r2.f20548     // Catch: java.lang.Throwable -> L21
                r0.signal()     // Catch: java.lang.Throwable -> L21
                java.util.concurrent.locks.ReentrantLock r0 = r2.f20546
                r0.unlock()
                return
            L21:
                r0 = move-exception
                java.util.concurrent.locks.ReentrantLock r1 = r2.f20546
                r1.unlock()
                throw r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۨ۟ۢ$ۥ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC5575<T> {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        void m20885(T r1);
    }

    public C5570(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f20529 = r0
            Yue.ۥۡۨ۟ۢ$ۥ r0 = new Yue.ۥۡۨ۟ۢ$ۥ
            r0.<init>(r1)
            r1.f20533 = r0
            r1.f20536 = r2
            r1.f20535 = r3
            r1.f20534 = r4
            r2 = 0
            r1.f20532 = r2
            return
    }

    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int m20878() {
            r2 = this;
            java.lang.Object r0 = r2.f20529
            monitor-enter(r0)
            int r1 = r2.f20532     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean m20879() {
            r2 = this;
            java.lang.Object r0 = r2.f20529
            monitor-enter(r0)
            android.os.HandlerThread r1 = r2.f20530     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m20880() {
            r3 = this;
            java.lang.Object r0 = r3.f20529
            monitor-enter(r0)
            android.os.Handler r1 = r3.f20531     // Catch: java.lang.Throwable -> Le
            r2 = 1
            boolean r1 = r1.hasMessages(r2)     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r1 = move-exception
            goto L1c
        L10:
            android.os.HandlerThread r1 = r3.f20530     // Catch: java.lang.Throwable -> Le
            r1.quit()     // Catch: java.lang.Throwable -> Le
            r1 = 0
            r3.f20530 = r1     // Catch: java.lang.Throwable -> Le
            r3.f20531 = r1     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m20881(java.lang.Runnable r5) {
            r4 = this;
            r5.run()
            java.lang.Object r5 = r4.f20529
            monitor-enter(r5)
            android.os.Handler r0 = r4.f20531     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            r0.removeMessages(r1)     // Catch: java.lang.Throwable -> L1a
            android.os.Handler r0 = r4.f20531     // Catch: java.lang.Throwable -> L1a
            android.os.Message r1 = r0.obtainMessage(r1)     // Catch: java.lang.Throwable -> L1a
            int r2 = r4.f20534     // Catch: java.lang.Throwable -> L1a
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L1a
            r0.sendMessageDelayed(r1, r2)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1a
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m20882(java.lang.Runnable r6) {
            r5 = this;
            java.lang.Object r0 = r5.f20529
            monitor-enter(r0)
            android.os.HandlerThread r1 = r5.f20530     // Catch: java.lang.Throwable -> L2b
            r2 = 1
            if (r1 != 0) goto L2d
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = r5.f20536     // Catch: java.lang.Throwable -> L2b
            int r4 = r5.f20535     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L2b
            r5.f20530 = r1     // Catch: java.lang.Throwable -> L2b
            r1.start()     // Catch: java.lang.Throwable -> L2b
            android.os.Handler r1 = new android.os.Handler     // Catch: java.lang.Throwable -> L2b
            android.os.HandlerThread r3 = r5.f20530     // Catch: java.lang.Throwable -> L2b
            android.os.Looper r3 = r3.getLooper()     // Catch: java.lang.Throwable -> L2b
            android.os.Handler$Callback r4 = r5.f20533     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L2b
            r5.f20531 = r1     // Catch: java.lang.Throwable -> L2b
            int r1 = r5.f20532     // Catch: java.lang.Throwable -> L2b
            int r1 = r1 + r2
            r5.f20532 = r1     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r6 = move-exception
            goto L3e
        L2d:
            android.os.Handler r1 = r5.f20531     // Catch: java.lang.Throwable -> L2b
            r3 = 0
            r1.removeMessages(r3)     // Catch: java.lang.Throwable -> L2b
            android.os.Handler r1 = r5.f20531     // Catch: java.lang.Throwable -> L2b
            android.os.Message r6 = r1.obtainMessage(r2, r6)     // Catch: java.lang.Throwable -> L2b
            r1.sendMessage(r6)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public <T> void m20883(java.util.concurrent.Callable<T> r3, Yue.C5570.InterfaceC5575<T> r4) {
            r2 = this;
            android.os.Handler r0 = Yue.C0922.m5269()
            Yue.ۥۡۨ۟ۢ$ۥ۟ r1 = new Yue.ۥۡۨ۟ۢ$ۥ۟
            r1.<init>(r2, r3, r0, r4)
            r2.m20882(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public <T> T m20884(java.util.concurrent.Callable<T> r13, int r14) throws java.lang.InterruptedException {
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            Yue.ۥۡۨ۟ۢ$ۥ۟۟ r11 = new Yue.ۥۡۨ۟ۢ$ۥ۟۟
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.m20882(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch: java.lang.Throwable -> L34
            if (r13 != 0) goto L36
            java.lang.Object r13 = r9.get()     // Catch: java.lang.Throwable -> L34
            r7.unlock()
            return r13
        L34:
            r13 = move-exception
            goto L5e
        L36:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L34
            long r0 = (long) r14     // Catch: java.lang.Throwable -> L34
            long r13 = r13.toNanos(r0)     // Catch: java.lang.Throwable -> L34
        L3d:
            long r13 = r8.awaitNanos(r13)     // Catch: java.lang.Throwable -> L34 java.lang.InterruptedException -> L41
        L41:
            boolean r0 = r10.get()     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto L4f
            java.lang.Object r13 = r9.get()     // Catch: java.lang.Throwable -> L34
            r7.unlock()
            return r13
        L4f:
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 <= 0) goto L56
            goto L3d
        L56:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L34
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L34
            throw r13     // Catch: java.lang.Throwable -> L34
        L5e:
            r7.unlock()
            throw r13
    }
}
