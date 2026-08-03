package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۡ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4193<T> implements Yue.InterfaceC6193<T> {

    /* JADX INFO: renamed from: Yue.ۥۡۡ۠ۢ$ۥ, reason: contains not printable characters */
    public class C4194 implements Yue.InterfaceC6193.InterfaceC6195<T> {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f12938 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f12939 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f12940 = 3;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C4193.C4198 f12941;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final android.os.Handler f12942;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public java.lang.Runnable f12943;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC6193.InterfaceC6195 f12944;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4193 f12945;

        /* JADX INFO: renamed from: Yue.ۥۡۡ۠ۢ$ۥ$ۥ, reason: contains not printable characters */
        public class RunnableC4195 implements java.lang.Runnable {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ Yue.C4193.C4194 f12946;

            public RunnableC4195(Yue.C4193.C4194 r1) {
                    r0 = this;
                    r0.f12946 = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r3 = this;
                    Yue.ۥۡۡ۠ۢ$ۥ r0 = r3.f12946
                    Yue.ۥۡۡ۠ۢ$ۥ۟۟ r0 = r0.f12941
                    Yue.ۥۡۡ۠ۢ$ۥ۟۟۟ r0 = r0.m16346()
                L8:
                    if (r0 == 0) goto L5c
                    int r1 = r0.f12962
                    r2 = 1
                    if (r1 == r2) goto L48
                    r2 = 2
                    if (r1 == r2) goto L3a
                    r2 = 3
                    if (r1 == r2) goto L2e
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Unsupported message, what="
                    r1.append(r2)
                    int r0 = r0.f12962
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    java.lang.String r1 = "ThreadUtil"
                    android.util.Log.e(r1, r0)
                    goto L53
                L2e:
                    Yue.ۥۡۡ۠ۢ$ۥ r1 = r3.f12946
                    Yue.ۥۢۡۢۦ$ۥ۟ r1 = r1.f12944
                    int r2 = r0.f12963
                    int r0 = r0.f12964
                    r1.mo4103(r2, r0)
                    goto L53
                L3a:
                    java.lang.Object r1 = r0.f12968
                    Yue.ۥۣۣۢۡ$ۥ r1 = (Yue.C6210.C6211) r1
                    Yue.ۥۡۡ۠ۢ$ۥ r2 = r3.f12946
                    Yue.ۥۢۡۢۦ$ۥ۟ r2 = r2.f12944
                    int r0 = r0.f12963
                    r2.mo4105(r0, r1)
                    goto L53
                L48:
                    Yue.ۥۡۡ۠ۢ$ۥ r1 = r3.f12946
                    Yue.ۥۢۡۢۦ$ۥ۟ r1 = r1.f12944
                    int r2 = r0.f12963
                    int r0 = r0.f12964
                    r1.mo4104(r2, r0)
                L53:
                    Yue.ۥۡۡ۠ۢ$ۥ r0 = r3.f12946
                    Yue.ۥۡۡ۠ۢ$ۥ۟۟ r0 = r0.f12941
                    Yue.ۥۡۡ۠ۢ$ۥ۟۟۟ r0 = r0.m16346()
                    goto L8
                L5c:
                    return
            }
        }

        public C4194(Yue.C4193 r1, Yue.InterfaceC6193.InterfaceC6195 r2) {
                r0 = this;
                r0.f12945 = r1
                r0.f12944 = r2
                r0.<init>()
                Yue.ۥۡۡ۠ۢ$ۥ۟۟ r1 = new Yue.ۥۡۡ۠ۢ$ۥ۟۟
                r1.<init>()
                r0.f12941 = r1
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r2 = android.os.Looper.getMainLooper()
                r1.<init>(r2)
                r0.f12942 = r1
                Yue.ۥۡۡ۠ۢ$ۥ$ۥ r1 = new Yue.ۥۡۡ۠ۢ$ۥ$ۥ
                r1.<init>(r0)
                r0.f12943 = r1
                return
        }

        @Override // Yue.InterfaceC6193.InterfaceC6195
        /* JADX INFO: renamed from: ۥ */
        public void mo4103(int r2, int r3) {
                r1 = this;
                r0 = 3
                Yue.ۥۡۡ۠ۢ$ۥ۟۟۟ r2 = Yue.C4193.C4199.m16350(r0, r2, r3)
                r1.m16342(r2)
                return
        }

        @Override // Yue.InterfaceC6193.InterfaceC6195
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo4104(int r2, int r3) {
                r1 = this;
                r0 = 1
                Yue.ۥۡۡ۠ۢ$ۥ۟۟۟ r2 = Yue.C4193.C4199.m16350(r0, r2, r3)
                r1.m16342(r2)
                return
        }

        @Override // Yue.InterfaceC6193.InterfaceC6195
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo4105(int r2, Yue.C6210.C6211<T> r3) {
                r1 = this;
                r0 = 2
                Yue.ۥۡۡ۠ۢ$ۥ۟۟۟ r2 = Yue.C4193.C4199.m16352(r0, r2, r3)
                r1.m16342(r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m16342(Yue.C4193.C4199 r2) {
                r1 = this;
                Yue.ۥۡۡ۠ۢ$ۥ۟۟ r0 = r1.f12941
                r0.m16348(r2)
                android.os.Handler r2 = r1.f12942
                java.lang.Runnable r0 = r1.f12943
                r2.post(r0)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡ۠ۢ$ۥ۟, reason: contains not printable characters */
    public class C4196 implements Yue.InterfaceC6193.InterfaceC6194<T> {

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f12947 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f12948 = 2;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f12949 = 3;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final int f12950 = 4;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C4193.C4198 f12951;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.util.concurrent.Executor f12952;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public java.util.concurrent.atomic.AtomicBoolean f12953;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public java.lang.Runnable f12954;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC6193.InterfaceC6194 f12955;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4193 f12956;

        /* JADX INFO: renamed from: Yue.ۥۡۡ۠ۢ$ۥ۟$ۥ, reason: contains not printable characters */
        public class RunnableC4197 implements java.lang.Runnable {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ Yue.C4193.C4196 f12957;

            public RunnableC4197(Yue.C4193.C4196 r1) {
                    r0 = this;
                    r0.f12957 = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r8 = this;
                L0:
                    Yue.ۥۡۡ۠ۢ$ۥ۟ r0 = r8.f12957
                    Yue.ۥۡۡ۠ۢ$ۥ۟۟ r0 = r0.f12951
                    Yue.ۥۡۡ۠ۢ$ۥ۟۟۟ r0 = r0.m16346()
                    if (r0 != 0) goto L13
                    Yue.ۥۡۡ۠ۢ$ۥ۟ r0 = r8.f12957
                    java.util.concurrent.atomic.AtomicBoolean r0 = r0.f12953
                    r1 = 0
                    r0.set(r1)
                    return
                L13:
                    int r1 = r0.f12962
                    r2 = 1
                    if (r1 == r2) goto L72
                    r2 = 3
                    r3 = 2
                    if (r1 == r3) goto L52
                    if (r1 == r2) goto L46
                    r2 = 4
                    if (r1 == r2) goto L3a
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Unsupported message, what="
                    r1.append(r2)
                    int r0 = r0.f12962
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    java.lang.String r1 = "ThreadUtil"
                    android.util.Log.e(r1, r0)
                    goto L0
                L3a:
                    java.lang.Object r0 = r0.f12968
                    Yue.ۥۣۣۢۡ$ۥ r0 = (Yue.C6210.C6211) r0
                    Yue.ۥۡۡ۠ۢ$ۥ۟ r1 = r8.f12957
                    Yue.ۥۢۡۢۦ$ۥ r1 = r1.f12955
                    r1.mo4111(r0)
                    goto L0
                L46:
                    Yue.ۥۡۡ۠ۢ$ۥ۟ r1 = r8.f12957
                    Yue.ۥۢۡۢۦ$ۥ r1 = r1.f12955
                    int r2 = r0.f12963
                    int r0 = r0.f12964
                    r1.mo4109(r2, r0)
                    goto L0
                L52:
                    Yue.ۥۡۡ۠ۢ$ۥ۟ r1 = r8.f12957
                    Yue.ۥۡۡ۠ۢ$ۥ۟۟ r1 = r1.f12951
                    r1.m16347(r3)
                    Yue.ۥۡۡ۠ۢ$ۥ۟ r1 = r8.f12957
                    Yue.ۥۡۡ۠ۢ$ۥ۟۟ r1 = r1.f12951
                    r1.m16347(r2)
                    Yue.ۥۡۡ۠ۢ$ۥ۟ r1 = r8.f12957
                    Yue.ۥۢۡۢۦ$ۥ r2 = r1.f12955
                    int r3 = r0.f12963
                    int r4 = r0.f12964
                    int r5 = r0.f12965
                    int r6 = r0.f12966
                    int r7 = r0.f12967
                    r2.mo4108(r3, r4, r5, r6, r7)
                    goto L0
                L72:
                    Yue.ۥۡۡ۠ۢ$ۥ۟ r1 = r8.f12957
                    Yue.ۥۡۡ۠ۢ$ۥ۟۟ r1 = r1.f12951
                    r1.m16347(r2)
                    Yue.ۥۡۡ۠ۢ$ۥ۟ r1 = r8.f12957
                    Yue.ۥۢۡۢۦ$ۥ r1 = r1.f12955
                    int r0 = r0.f12963
                    r1.mo4110(r0)
                    goto L0
            }
        }

        public C4196(Yue.C4193 r1, Yue.InterfaceC6193.InterfaceC6194 r2) {
                r0 = this;
                r0.f12956 = r1
                r0.f12955 = r2
                r0.<init>()
                Yue.ۥۡۡ۠ۢ$ۥ۟۟ r1 = new Yue.ۥۡۡ۠ۢ$ۥ۟۟
                r1.<init>()
                r0.f12951 = r1
                java.util.concurrent.Executor r1 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
                r0.f12952 = r1
                java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
                r2 = 0
                r1.<init>(r2)
                r0.f12953 = r1
                Yue.ۥۡۡ۠ۢ$ۥ۟$ۥ r1 = new Yue.ۥۡۡ۠ۢ$ۥ۟$ۥ
                r1.<init>(r0)
                r0.f12954 = r1
                return
        }

        @Override // Yue.InterfaceC6193.InterfaceC6194
        /* JADX INFO: renamed from: ۥ */
        public void mo4108(int r8, int r9, int r10, int r11, int r12) {
                r7 = this;
                r0 = 2
                r6 = 0
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                Yue.ۥۡۡ۠ۢ$ۥ۟۟۟ r8 = Yue.C4193.C4199.m16351(r0, r1, r2, r3, r4, r5, r6)
                r7.m16345(r8)
                return
        }

        @Override // Yue.InterfaceC6193.InterfaceC6194
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo4109(int r2, int r3) {
                r1 = this;
                r0 = 3
                Yue.ۥۡۡ۠ۢ$ۥ۟۟۟ r2 = Yue.C4193.C4199.m16350(r0, r2, r3)
                r1.m16344(r2)
                return
        }

        @Override // Yue.InterfaceC6193.InterfaceC6194
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo4110(int r3) {
                r2 = this;
                r0 = 1
                r1 = 0
                Yue.ۥۡۡ۠ۢ$ۥ۟۟۟ r3 = Yue.C4193.C4199.m16352(r0, r3, r1)
                r2.m16345(r3)
                return
        }

        @Override // Yue.InterfaceC6193.InterfaceC6194
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo4111(Yue.C6210.C6211<T> r3) {
                r2 = this;
                r0 = 4
                r1 = 0
                Yue.ۥۡۡ۠ۢ$ۥ۟۟۟ r3 = Yue.C4193.C4199.m16352(r0, r1, r3)
                r2.m16344(r3)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m16343() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.f12953
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L11
                java.util.concurrent.Executor r0 = r3.f12952
                java.lang.Runnable r1 = r3.f12954
                r0.execute(r1)
            L11:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final void m16344(Yue.C4193.C4199 r2) {
                r1 = this;
                Yue.ۥۡۡ۠ۢ$ۥ۟۟ r0 = r1.f12951
                r0.m16348(r2)
                r1.m16343()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final void m16345(Yue.C4193.C4199 r2) {
                r1 = this;
                Yue.ۥۡۡ۠ۢ$ۥ۟۟ r0 = r1.f12951
                r0.m16349(r2)
                r1.m16343()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡ۠ۢ$ۥ۟۟, reason: contains not printable characters */
    public static class C4198 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public Yue.C4193.C4199 f12958;

        public C4198() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public synchronized Yue.C4193.C4199 m16346() {
                r2 = this;
                monitor-enter(r2)
                Yue.ۥۡۡ۠ۢ$ۥ۟۟۟ r0 = r2.f12958     // Catch: java.lang.Throwable -> Le
                if (r0 != 0) goto L8
                monitor-exit(r2)
                r0 = 0
                return r0
            L8:
                Yue.ۥۡۡ۠ۢ$ۥ۟۟۟ r1 = r0.f12961     // Catch: java.lang.Throwable -> Le
                r2.f12958 = r1     // Catch: java.lang.Throwable -> Le
                monitor-exit(r2)
                return r0
            Le:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public synchronized void m16347(int r5) {
                r4 = this;
                monitor-enter(r4)
            L1:
                Yue.ۥۡۡ۠ۢ$ۥ۟۟۟ r0 = r4.f12958     // Catch: java.lang.Throwable -> L11
                if (r0 == 0) goto L13
                int r1 = r0.f12962     // Catch: java.lang.Throwable -> L11
                if (r1 != r5) goto L13
                Yue.ۥۡۡ۠ۢ$ۥ۟۟۟ r1 = r0.f12961     // Catch: java.lang.Throwable -> L11
                r4.f12958 = r1     // Catch: java.lang.Throwable -> L11
                r0.m16353()     // Catch: java.lang.Throwable -> L11
                goto L1
            L11:
                r5 = move-exception
                goto L2a
            L13:
                if (r0 == 0) goto L28
                Yue.ۥۡۡ۠ۢ$ۥ۟۟۟ r1 = r0.f12961     // Catch: java.lang.Throwable -> L11
            L17:
                if (r1 == 0) goto L28
                Yue.ۥۡۡ۠ۢ$ۥ۟۟۟ r2 = r1.f12961     // Catch: java.lang.Throwable -> L11
                int r3 = r1.f12962     // Catch: java.lang.Throwable -> L11
                if (r3 != r5) goto L25
                r0.f12961 = r2     // Catch: java.lang.Throwable -> L11
                r1.m16353()     // Catch: java.lang.Throwable -> L11
                goto L26
            L25:
                r0 = r1
            L26:
                r1 = r2
                goto L17
            L28:
                monitor-exit(r4)
                return
            L2a:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
                throw r5
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public synchronized void m16348(Yue.C4193.C4199 r3) {
                r2 = this;
                monitor-enter(r2)
                Yue.ۥۡۡ۠ۢ$ۥ۟۟۟ r0 = r2.f12958     // Catch: java.lang.Throwable -> L9
                if (r0 != 0) goto Lb
                r2.f12958 = r3     // Catch: java.lang.Throwable -> L9
                monitor-exit(r2)
                return
            L9:
                r3 = move-exception
                goto L15
            Lb:
                Yue.ۥۡۡ۠ۢ$ۥ۟۟۟ r1 = r0.f12961     // Catch: java.lang.Throwable -> L9
                if (r1 == 0) goto L11
                r0 = r1
                goto Lb
            L11:
                r0.f12961 = r3     // Catch: java.lang.Throwable -> L9
                monitor-exit(r2)
                return
            L15:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
                throw r3
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public synchronized void m16349(Yue.C4193.C4199 r2) {
                r1 = this;
                monitor-enter(r1)
                Yue.ۥۡۡ۠ۢ$ۥ۟۟۟ r0 = r1.f12958     // Catch: java.lang.Throwable -> L9
                r2.f12961 = r0     // Catch: java.lang.Throwable -> L9
                r1.f12958 = r2     // Catch: java.lang.Throwable -> L9
                monitor-exit(r1)
                return
            L9:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
                throw r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡ۠ۢ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C4199 {

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static Yue.C4193.C4199 f12959;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final java.lang.Object f12960 = null;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public Yue.C4193.C4199 f12961;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f12962;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f12963;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f12964;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f12965;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f12966;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f12967;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public java.lang.Object f12968;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                Yue.C4193.C4199.f12960 = r0
                return
        }

        public C4199() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static Yue.C4193.C4199 m16350(int r7, int r8, int r9) {
                r5 = 0
                r6 = 0
                r3 = 0
                r4 = 0
                r0 = r7
                r1 = r8
                r2 = r9
                Yue.ۥۡۡ۠ۢ$ۥ۟۟۟ r7 = m16351(r0, r1, r2, r3, r4, r5, r6)
                return r7
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static Yue.C4193.C4199 m16351(int r3, int r4, int r5, int r6, int r7, int r8, java.lang.Object r9) {
                java.lang.Object r0 = Yue.C4193.C4199.f12960
                monitor-enter(r0)
                Yue.ۥۡۡ۠ۢ$ۥ۟۟۟ r1 = Yue.C4193.C4199.f12959     // Catch: java.lang.Throwable -> Ld
                if (r1 != 0) goto Lf
                Yue.ۥۡۡ۠ۢ$ۥ۟۟۟ r1 = new Yue.ۥۡۡ۠ۢ$ۥ۟۟۟     // Catch: java.lang.Throwable -> Ld
                r1.<init>()     // Catch: java.lang.Throwable -> Ld
                goto L16
            Ld:
                r3 = move-exception
                goto L26
            Lf:
                Yue.ۥۡۡ۠ۢ$ۥ۟۟۟ r2 = r1.f12961     // Catch: java.lang.Throwable -> Ld
                Yue.C4193.C4199.f12959 = r2     // Catch: java.lang.Throwable -> Ld
                r2 = 0
                r1.f12961 = r2     // Catch: java.lang.Throwable -> Ld
            L16:
                r1.f12962 = r3     // Catch: java.lang.Throwable -> Ld
                r1.f12963 = r4     // Catch: java.lang.Throwable -> Ld
                r1.f12964 = r5     // Catch: java.lang.Throwable -> Ld
                r1.f12965 = r6     // Catch: java.lang.Throwable -> Ld
                r1.f12966 = r7     // Catch: java.lang.Throwable -> Ld
                r1.f12967 = r8     // Catch: java.lang.Throwable -> Ld
                r1.f12968 = r9     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            L26:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static Yue.C4193.C4199 m16352(int r7, int r8, java.lang.Object r9) {
                r4 = 0
                r5 = 0
                r2 = 0
                r3 = 0
                r0 = r7
                r1 = r8
                r6 = r9
                Yue.ۥۡۡ۠ۢ$ۥ۟۟۟ r7 = m16351(r0, r1, r2, r3, r4, r5, r6)
                return r7
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m16353() {
                r2 = this;
                r0 = 0
                r2.f12961 = r0
                r1 = 0
                r2.f12967 = r1
                r2.f12966 = r1
                r2.f12965 = r1
                r2.f12964 = r1
                r2.f12963 = r1
                r2.f12962 = r1
                r2.f12968 = r0
                java.lang.Object r0 = Yue.C4193.C4199.f12960
                monitor-enter(r0)
                Yue.ۥۡۡ۠ۢ$ۥ۟۟۟ r1 = Yue.C4193.C4199.f12959     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L1e
                r2.f12961 = r1     // Catch: java.lang.Throwable -> L1c
                goto L1e
            L1c:
                r1 = move-exception
                goto L22
            L1e:
                Yue.C4193.C4199.f12959 = r2     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
                return
            L22:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
                throw r1
        }
    }

    public C4193() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.InterfaceC6193
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.InterfaceC6193.InterfaceC6195<T> mo16340(Yue.InterfaceC6193.InterfaceC6195<T> r2) {
            r1 = this;
            Yue.ۥۡۡ۠ۢ$ۥ r0 = new Yue.ۥۡۡ۠ۢ$ۥ
            r0.<init>(r1, r2)
            return r0
    }

    @Override // Yue.InterfaceC6193
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.InterfaceC6193.InterfaceC6194<T> mo16341(Yue.InterfaceC6193.InterfaceC6194<T> r2) {
            r1 = this;
            Yue.ۥۡۡ۠ۢ$ۥ۟ r0 = new Yue.ۥۡۡ۠ۢ$ۥ۟
            r0.<init>(r1, r2)
            return r0
    }
}
