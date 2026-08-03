package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dispatcher.kt\nokhttp3/Dispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,241:1\n1#2:242\n615#3,4:243\n1549#4:247\n1620#4,3:248\n1549#4:251\n1620#4,3:252\n*S KotlinDebug\n*F\n+ 1 Dispatcher.kt\nokhttp3/Dispatcher\n*L\n162#1:243,4\n222#1:247\n222#1:248,3\n227#1:251\n227#1:252,3\n*E\n"})
public final class C1876 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int f5797;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f5798;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public java.lang.Runnable f5799;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public java.util.concurrent.ExecutorService f5800;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.ArrayDeque<Yue.C5215.RunnableC5216> f5801;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.ArrayDeque<Yue.C5215.RunnableC5216> f5802;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.ArrayDeque<Yue.C5215> f5803;

    public C1876() {
            r1 = this;
            r1.<init>()
            r0 = 64
            r1.f5797 = r0
            r0 = 5
            r1.f5798 = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.f5801 = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.f5802 = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.f5803 = r0
            return
    }

    public C1876(@Yue.InterfaceC4418 java.util.concurrent.ExecutorService r2) {
            r1 = this;
            java.lang.String r0 = "executorService"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f5800 = r2
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "executorService", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_executorService")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.concurrent.ExecutorService m8769() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.m8773()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final synchronized void m8770() {
            r2 = this;
            monitor-enter(r2)
            java.util.ArrayDeque<Yue.ۥۡۦ۠ۤ$ۥ> r0 = r2.f5801     // Catch: java.lang.Throwable -> L1b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1b
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1b
            Yue.ۥۡۦ۠ۤ$ۥ r1 = (Yue.C5215.RunnableC5216) r1     // Catch: java.lang.Throwable -> L1b
            Yue.ۥۡۦ۠ۤ r1 = r1.m19701()     // Catch: java.lang.Throwable -> L1b
            r1.cancel()     // Catch: java.lang.Throwable -> L1b
            goto L7
        L1b:
            r0 = move-exception
            goto L4f
        L1d:
            java.util.ArrayDeque<Yue.ۥۡۦ۠ۤ$ۥ> r0 = r2.f5802     // Catch: java.lang.Throwable -> L1b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1b
        L23:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1b
            Yue.ۥۡۦ۠ۤ$ۥ r1 = (Yue.C5215.RunnableC5216) r1     // Catch: java.lang.Throwable -> L1b
            Yue.ۥۡۦ۠ۤ r1 = r1.m19701()     // Catch: java.lang.Throwable -> L1b
            r1.cancel()     // Catch: java.lang.Throwable -> L1b
            goto L23
        L37:
            java.util.ArrayDeque<Yue.ۥۡۦ۠ۤ> r0 = r2.f5803     // Catch: java.lang.Throwable -> L1b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1b
        L3d:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1b
            Yue.ۥۡۦ۠ۤ r1 = (Yue.C5215) r1     // Catch: java.lang.Throwable -> L1b
            r1.cancel()     // Catch: java.lang.Throwable -> L1b
            goto L3d
        L4d:
            monitor-exit(r2)
            return
        L4f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m8771(@Yue.InterfaceC4418 Yue.C5215.RunnableC5216 r2) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            monitor-enter(r1)
            java.util.ArrayDeque<Yue.ۥۡۦ۠ۤ$ۥ> r0 = r1.f5801     // Catch: java.lang.Throwable -> L23
            r0.add(r2)     // Catch: java.lang.Throwable -> L23
            Yue.ۥۡۦ۠ۤ r0 = r2.m19701()     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.m19685()     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L25
            java.lang.String r0 = r2.m19703()     // Catch: java.lang.Throwable -> L23
            Yue.ۥۡۦ۠ۤ$ۥ r0 = r1.m8774(r0)     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L25
            r2.m19705(r0)     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r2 = move-exception
            goto L2c
        L25:
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L23
            monitor-exit(r1)
            r1.m8781()
            return
        L2c:
            monitor-exit(r1)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final synchronized void m8772(@Yue.InterfaceC4418 Yue.C5215 r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)     // Catch: java.lang.Throwable -> Ld
            java.util.ArrayDeque<Yue.ۥۡۦ۠ۤ> r0 = r1.f5803     // Catch: java.lang.Throwable -> Ld
            r0.add(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "executorService")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final synchronized java.util.concurrent.ExecutorService m8773() {
            r9 = this;
            monitor-enter(r9)
            java.util.concurrent.ExecutorService r0 = r9.f5800     // Catch: java.lang.Throwable -> L33
            if (r0 != 0) goto L35
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L33
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L33
            java.util.concurrent.SynchronousQueue r7 = new java.util.concurrent.SynchronousQueue     // Catch: java.lang.Throwable -> L33
            r7.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r1.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = Yue.C6656.f23212     // Catch: java.lang.Throwable -> L33
            r1.append(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = " Dispatcher"
            r1.append(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L33
            r2 = 0
            java.util.concurrent.ThreadFactory r8 = Yue.C6656.m25603(r1, r2)     // Catch: java.lang.Throwable -> L33
            r2 = 0
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 60
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L33
            r9.f5800 = r0     // Catch: java.lang.Throwable -> L33
            goto L35
        L33:
            r0 = move-exception
            goto L3c
        L35:
            java.util.concurrent.ExecutorService r0 = r9.f5800     // Catch: java.lang.Throwable -> L33
            Yue.C3329.m13903(r0)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r9)
            return r0
        L3c:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L33
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final Yue.C5215.RunnableC5216 m8774(java.lang.String r4) {
            r3 = this;
            java.util.ArrayDeque<Yue.ۥۡۦ۠ۤ$ۥ> r0 = r3.f5802
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            Yue.ۥۡۦ۠ۤ$ۥ r1 = (Yue.C5215.RunnableC5216) r1
            java.lang.String r2 = r1.m19703()
            boolean r2 = Yue.C3329.m13897(r2, r4)
            if (r2 == 0) goto L6
            return r1
        L1d:
            java.util.ArrayDeque<Yue.ۥۡۦ۠ۤ$ۥ> r0 = r3.f5801
            java.util.Iterator r0 = r0.iterator()
        L23:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            Yue.ۥۡۦ۠ۤ$ۥ r1 = (Yue.C5215.RunnableC5216) r1
            java.lang.String r2 = r1.m19703()
            boolean r2 = Yue.C3329.m13897(r2, r4)
            if (r2 == 0) goto L23
            return r1
        L3a:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final <T> void m8775(java.util.Deque<T> r1, T r2) {
            r0 = this;
            monitor-enter(r0)
            boolean r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1a
            java.lang.Runnable r1 = r0.f5799     // Catch: java.lang.Throwable -> L18
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)
            boolean r2 = r0.m8781()
            if (r2 != 0) goto L17
            if (r1 == 0) goto L17
            r1.run()
        L17:
            return
        L18:
            r1 = move-exception
            goto L22
        L1a:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = "Call wasn't in-flight!"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L18
            throw r1     // Catch: java.lang.Throwable -> L18
        L22:
            monitor-exit(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m8776(@Yue.InterfaceC4418 Yue.C5215.RunnableC5216 r2) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r2.m19702()
            r0.decrementAndGet()
            java.util.ArrayDeque<Yue.ۥۡۦ۠ۤ$ۥ> r0 = r1.f5802
            r1.m8775(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m8777(@Yue.InterfaceC4418 Yue.C5215 r2) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.util.ArrayDeque<Yue.ۥۡۦ۠ۤ> r0 = r1.f5803
            r1.m8775(r0, r2)
            return
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final synchronized java.lang.Runnable m8778() {
            r1 = this;
            monitor-enter(r1)
            java.lang.Runnable r0 = r1.f5799     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final synchronized int m8779() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.f5797     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final synchronized int m8780() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.f5798     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final boolean m8781() {
            r6 = this;
            boolean r0 = Yue.C6656.f23211
            if (r0 == 0) goto L32
            boolean r0 = java.lang.Thread.holdsLock(r6)
            if (r0 != 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST NOT hold lock on "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L32:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r6)
            java.util.ArrayDeque<Yue.ۥۡۦ۠ۤ$ۥ> r1 = r6.f5801     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = "readyAsyncCalls.iterator()"
            Yue.C3329.m13905(r1, r2)     // Catch: java.lang.Throwable -> L7d
        L43:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L7d
            if (r2 == 0) goto L7f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L7d
            Yue.ۥۡۦ۠ۤ$ۥ r2 = (Yue.C5215.RunnableC5216) r2     // Catch: java.lang.Throwable -> L7d
            java.util.ArrayDeque<Yue.ۥۡۦ۠ۤ$ۥ> r3 = r6.f5802     // Catch: java.lang.Throwable -> L7d
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L7d
            int r4 = r6.f5797     // Catch: java.lang.Throwable -> L7d
            if (r3 >= r4) goto L7f
            java.util.concurrent.atomic.AtomicInteger r3 = r2.m19702()     // Catch: java.lang.Throwable -> L7d
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L7d
            int r4 = r6.f5798     // Catch: java.lang.Throwable -> L7d
            if (r3 >= r4) goto L43
            r1.remove()     // Catch: java.lang.Throwable -> L7d
            java.util.concurrent.atomic.AtomicInteger r3 = r2.m19702()     // Catch: java.lang.Throwable -> L7d
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = "asyncCall"
            Yue.C3329.m13905(r2, r3)     // Catch: java.lang.Throwable -> L7d
            r0.add(r2)     // Catch: java.lang.Throwable -> L7d
            java.util.ArrayDeque<Yue.ۥۡۦ۠ۤ$ۥ> r3 = r6.f5802     // Catch: java.lang.Throwable -> L7d
            r3.add(r2)     // Catch: java.lang.Throwable -> L7d
            goto L43
        L7d:
            r0 = move-exception
            goto La3
        L7f:
            int r1 = r6.m8785()     // Catch: java.lang.Throwable -> L7d
            r2 = 0
            if (r1 <= 0) goto L88
            r1 = 1
            goto L89
        L88:
            r1 = r2
        L89:
            Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r6)
            int r3 = r0.size()
        L90:
            if (r2 >= r3) goto La2
            java.lang.Object r4 = r0.get(r2)
            Yue.ۥۡۦ۠ۤ$ۥ r4 = (Yue.C5215.RunnableC5216) r4
            java.util.concurrent.ExecutorService r5 = r6.m8773()
            r4.m19700(r5)
            int r2 = r2 + 1
            goto L90
        La2:
            return r1
        La3:
            monitor-exit(r6)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final synchronized java.util.List<Yue.InterfaceC0904> m8782() {
            r3 = this;
            monitor-enter(r3)
            java.util.ArrayDeque<Yue.ۥۡۦ۠ۤ$ۥ> r0 = r3.f5801     // Catch: java.lang.Throwable -> L26
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L26
            r2 = 10
            int r2 = Yue.C1210.m6231(r0, r2)     // Catch: java.lang.Throwable -> L26
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L26
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L26
        L12:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L28
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L26
            Yue.ۥۡۦ۠ۤ$ۥ r2 = (Yue.C5215.RunnableC5216) r2     // Catch: java.lang.Throwable -> L26
            Yue.ۥۡۦ۠ۤ r2 = r2.m19701()     // Catch: java.lang.Throwable -> L26
            r1.add(r2)     // Catch: java.lang.Throwable -> L26
            goto L12
        L26:
            r0 = move-exception
            goto L33
        L28:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = "unmodifiableList(readyAsyncCalls.map { it.call })"
            Yue.C3329.m13905(r0, r1)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r3)
            return r0
        L33:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final synchronized int m8783() {
            r1 = this;
            monitor-enter(r1)
            java.util.ArrayDeque<Yue.ۥۡۦ۠ۤ$ۥ> r0 = r1.f5801     // Catch: java.lang.Throwable -> L9
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final synchronized java.util.List<Yue.InterfaceC0904> m8784() {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayDeque<Yue.ۥۡۦ۠ۤ> r0 = r4.f5803     // Catch: java.lang.Throwable -> L28
            java.util.ArrayDeque<Yue.ۥۡۦ۠ۤ$ۥ> r1 = r4.f5802     // Catch: java.lang.Throwable -> L28
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L28
            r3 = 10
            int r3 = Yue.C1210.m6231(r1, r3)     // Catch: java.lang.Throwable -> L28
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L28
        L14:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L28
            Yue.ۥۡۦ۠ۤ$ۥ r3 = (Yue.C5215.RunnableC5216) r3     // Catch: java.lang.Throwable -> L28
            Yue.ۥۡۦ۠ۤ r3 = r3.m19701()     // Catch: java.lang.Throwable -> L28
            r2.add(r3)     // Catch: java.lang.Throwable -> L28
            goto L14
        L28:
            r0 = move-exception
            goto L39
        L2a:
            java.util.List r0 = Yue.C1219.m6468(r0, r2)     // Catch: java.lang.Throwable -> L28
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "unmodifiableList(running…yncCalls.map { it.call })"
            Yue.C3329.m13905(r0, r1)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r4)
            return r0
        L39:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L28
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final synchronized int m8785() {
            r2 = this;
            monitor-enter(r2)
            java.util.ArrayDeque<Yue.ۥۡۦ۠ۤ$ۥ> r0 = r2.f5802     // Catch: java.lang.Throwable -> L10
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L10
            java.util.ArrayDeque<Yue.ۥۡۦ۠ۤ> r1 = r2.f5803     // Catch: java.lang.Throwable -> L10
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L10
            int r0 = r0 + r1
            monitor-exit(r2)
            return r0
        L10:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final synchronized void m8786(@Yue.InterfaceC4543 java.lang.Runnable r1) {
            r0 = this;
            monitor-enter(r0)
            r0.f5799 = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m8787(int r3) {
            r2 = this;
            r0 = 1
            if (r3 < r0) goto L10
            monitor-enter(r2)
            r2.f5797 = r3     // Catch: java.lang.Throwable -> Ld
            Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            r2.m8781()
            return
        Ld:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L10:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "max < 1: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m8788(int r3) {
            r2 = this;
            r0 = 1
            if (r3 < r0) goto L10
            monitor-enter(r2)
            r2.f5798 = r3     // Catch: java.lang.Throwable -> Ld
            Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            r2.m8781()
            return
        Ld:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L10:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "max < 1: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }
}
