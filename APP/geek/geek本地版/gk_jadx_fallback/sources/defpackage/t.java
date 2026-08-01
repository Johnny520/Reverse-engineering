package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class t implements java.util.concurrent.Future {
    public static final boolean d = false;
    public static final java.util.logging.Logger e = null;
    public static final defpackage.ff f = null;
    public static final java.lang.Object g = null;
    public volatile java.lang.Object a;
    public volatile defpackage.p b;
    public volatile defpackage.s c;

    static {
            java.lang.String r0 = "b"
            java.lang.String r1 = "a"
            java.lang.Class<s> r2 = defpackage.s.class
            java.lang.String r3 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r4 = "false"
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            defpackage.t.d = r3
            java.lang.Class<t> r3 = defpackage.t.class
            java.lang.String r4 = r3.getName()
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            defpackage.t.e = r4
            q r5 = new q     // Catch: java.lang.Throwable -> L43
            java.lang.Class<java.lang.Thread> r4 = java.lang.Thread.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r4, r1)     // Catch: java.lang.Throwable -> L43
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r2, r0)     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r4)     // Catch: java.lang.Throwable -> L43
            java.lang.Class<p> r2 = defpackage.p.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r0)     // Catch: java.lang.Throwable -> L43
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r0, r1)     // Catch: java.lang.Throwable -> L43
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L43
            r0 = 0
            goto L49
        L43:
            r0 = move-exception
            r r5 = new r
            r5.<init>()
        L49:
            defpackage.t.f = r5
            if (r0 == 0) goto L56
            java.util.logging.Logger r1 = defpackage.t.e
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L56:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.t.g = r0
            return
    }

    public static void b(defpackage.t r5) {
        L0:
            s r0 = r5.c
            ff r1 = defpackage.t.f
            s r2 = defpackage.s.c
            boolean r1 = r1.g(r5, r0, r2)
            if (r1 == 0) goto L0
        Lc:
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.Thread r2 = r0.a
            if (r2 == 0) goto L18
            r0.a = r1
            java.util.concurrent.locks.LockSupport.unpark(r2)
        L18:
            s r0 = r0.b
            goto Lc
        L1b:
            p r0 = r5.b
            ff r2 = defpackage.t.f
            boolean r2 = r2.e(r5, r0)
            if (r2 == 0) goto L1b
            r5 = r1
        L26:
            if (r0 == 0) goto L2f
            p r2 = r0.a
            r0.a = r5
            r5 = r0
            r0 = r2
            goto L26
        L2f:
            if (r5 != 0) goto L32
            return
        L32:
            p r5 = r5.a
            throw r1     // Catch: java.lang.RuntimeException -> L35
        L35:
            r0 = move-exception
            java.util.logging.Logger r2 = defpackage.t.e
            java.util.logging.Level r3 = java.util.logging.Level.SEVERE
            java.lang.String r4 = "RuntimeException while executing runnable null with executor null"
            r2.log(r3, r4, r0)
            goto L2f
    }

    public static java.lang.Object c(java.lang.Object r2) {
            boolean r0 = r2 instanceof defpackage.n
            if (r0 != 0) goto L15
            boolean r0 = r2 instanceof defpackage.o
            if (r0 != 0) goto Le
            java.lang.Object r0 = defpackage.t.g
            if (r2 != r0) goto Ld
            r2 = 0
        Ld:
            return r2
        Le:
            java.util.concurrent.ExecutionException r2 = new java.util.concurrent.ExecutionException
            r0 = 0
            r2.<init>(r0)
            throw r2
        L15:
            n r2 = (defpackage.n) r2
            java.lang.Throwable r2 = r2.a
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Task was cancelled."
            r0.<init>(r1)
            r0.initCause(r2)
            throw r0
    }

    public static java.lang.Object d(defpackage.t r1) {
            r0 = 0
        L1:
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lf java.lang.InterruptedException -> L1a
            if (r0 == 0) goto Le
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        Le:
            return r1
        Lf:
            r1 = move-exception
            if (r0 == 0) goto L19
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L19:
            throw r1
        L1a:
            r0 = 1
            goto L1
    }

    public final void a(java.lang.StringBuilder r4) {
            r3 = this;
            java.lang.String r0 = "]"
            java.lang.Object r1 = d(r3)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
            java.lang.String r2 = "SUCCESS, result=["
            r4.append(r2)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
            if (r1 != r3) goto L10
            java.lang.String r1 = "this future"
            goto L14
        L10:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
        L14:
            r4.append(r1)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
            r4.append(r0)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
            return
        L1b:
            r0 = move-exception
            goto L1f
        L1d:
            r1 = move-exception
            goto L37
        L1f:
            java.lang.String r1 = "UNKNOWN, cause=["
            r4.append(r1)
            java.lang.Class r0 = r0.getClass()
            r4.append(r0)
            java.lang.String r0 = " thrown from get()]"
            r4.append(r0)
            goto L46
        L31:
            java.lang.String r0 = "CANCELLED"
            r4.append(r0)
            goto L46
        L37:
            java.lang.String r2 = "FAILURE, cause=["
            r4.append(r2)
            java.lang.Throwable r1 = r1.getCause()
            r4.append(r1)
            r4.append(r0)
        L46:
            return
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r5) {
            r4 = this;
            java.lang.Object r0 = r4.a
            if (r0 != 0) goto L29
            boolean r1 = defpackage.t.d
            if (r1 == 0) goto L15
            n r1 = new n
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r3 = "Future.cancel() was called."
            r2.<init>(r3)
            r1.<init>(r2, r5)
            goto L1c
        L15:
            if (r5 == 0) goto L1a
            n r1 = defpackage.n.b
            goto L1c
        L1a:
            n r1 = defpackage.n.c
        L1c:
            ff r5 = defpackage.t.f
            boolean r5 = r5.f(r4, r0, r1)
            if (r5 == 0) goto L29
            b(r4)
            r5 = 1
            return r5
        L29:
            r5 = 0
            return r5
    }

    public final void e(defpackage.s r5) {
            r4 = this;
            r0 = 0
            r5.a = r0
        L3:
            s r5 = r4.c
            s r1 = defpackage.s.c
            if (r5 != r1) goto La
            goto L29
        La:
            r1 = r0
        Lb:
            if (r5 == 0) goto L29
            s r2 = r5.b
            java.lang.Thread r3 = r5.a
            if (r3 == 0) goto L15
            r1 = r5
            goto L27
        L15:
            if (r1 == 0) goto L1e
            r1.b = r2
            java.lang.Thread r5 = r1.a
            if (r5 != 0) goto L27
            goto L3
        L1e:
            ff r3 = defpackage.t.f
            boolean r5 = r3.g(r4, r5, r2)
            if (r5 != 0) goto L27
            goto L3
        L27:
            r5 = r2
            goto Lb
        L29:
            return
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
            r4 = this;
            s r0 = defpackage.s.c
            boolean r1 = java.lang.Thread.interrupted()
            if (r1 != 0) goto L4b
            java.lang.Object r1 = r4.a
            if (r1 == 0) goto L11
            java.lang.Object r0 = c(r1)
            return r0
        L11:
            s r1 = r4.c
            if (r1 == r0) goto L44
            s r2 = new s
            r2.<init>()
        L1a:
            ff r3 = defpackage.t.f
            r3.F(r2, r1)
            boolean r1 = r3.g(r4, r1, r2)
            if (r1 == 0) goto L40
        L25:
            java.util.concurrent.locks.LockSupport.park(r4)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L37
            java.lang.Object r0 = r4.a
            if (r0 == 0) goto L25
            java.lang.Object r0 = c(r0)
            return r0
        L37:
            r4.e(r2)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L40:
            s r1 = r4.c
            if (r1 != r0) goto L1a
        L44:
            java.lang.Object r0 = r4.a
            java.lang.Object r0 = c(r0)
            return r0
        L4b:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long r18, java.util.concurrent.TimeUnit r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r20
            s r4 = defpackage.s.c
            long r5 = r3.toNanos(r1)
            boolean r7 = java.lang.Thread.interrupted()
            if (r7 != 0) goto L151
            java.lang.Object r7 = r0.a
            if (r7 == 0) goto L1b
            java.lang.Object r1 = c(r7)
            return r1
        L1b:
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L27
            long r9 = java.lang.System.nanoTime()
            long r9 = r9 + r5
            goto L28
        L27:
            r9 = r7
        L28:
            r11 = 1000(0x3e8, double:4.94E-321)
            int r13 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r13 < 0) goto L76
            s r13 = r0.c
            if (r13 == r4) goto L6f
            s r14 = new s
            r14.<init>()
        L37:
            ff r15 = defpackage.t.f
            r15.F(r14, r13)
            boolean r13 = r15.g(r0, r13, r14)
            if (r13 == 0) goto L6b
        L42:
            java.util.concurrent.locks.LockSupport.parkNanos(r0, r5)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L62
            java.lang.Object r4 = r0.a
            if (r4 == 0) goto L54
            java.lang.Object r1 = c(r4)
            return r1
        L54:
            long r4 = java.lang.System.nanoTime()
            long r5 = r9 - r4
            int r4 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r4 >= 0) goto L42
            r0.e(r14)
            goto L76
        L62:
            r0.e(r14)
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
        L6b:
            s r13 = r0.c
            if (r13 != r4) goto L37
        L6f:
            java.lang.Object r1 = r0.a
            java.lang.Object r1 = c(r1)
            return r1
        L76:
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 <= 0) goto L96
            java.lang.Object r4 = r0.a
            if (r4 == 0) goto L83
            java.lang.Object r1 = c(r4)
            return r1
        L83:
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L90
            long r4 = java.lang.System.nanoTime()
            long r5 = r9 - r4
            goto L76
        L90:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
        L96:
            java.lang.String r4 = r0.toString()
            java.lang.String r9 = r3.toString()
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toLowerCase(r10)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Waited "
            r13.<init>(r14)
            r13.append(r1)
            java.lang.String r1 = " "
            r13.append(r1)
            java.lang.String r2 = r3.toString()
            java.lang.String r2 = r2.toLowerCase(r10)
            r13.append(r2)
            java.lang.String r2 = r13.toString()
            long r13 = r5 + r11
            int r10 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r10 >= 0) goto L125
            java.lang.String r10 = " (plus "
            java.lang.String r2 = defpackage.z30.i(r2, r10)
            long r5 = -r5
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r13 = r3.convert(r5, r10)
            long r15 = r3.toNanos(r13)
            long r5 = r5 - r15
            int r3 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r3 == 0) goto Le5
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 <= 0) goto Le3
            goto Le5
        Le3:
            r7 = 0
            goto Le6
        Le5:
            r7 = 1
        Le6:
            if (r3 <= 0) goto L109
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r13)
            r3.append(r1)
            r3.append(r9)
            java.lang.String r2 = r3.toString()
            if (r7 == 0) goto L105
            java.lang.String r3 = ","
            java.lang.String r2 = defpackage.z30.i(r2, r3)
        L105:
            java.lang.String r2 = defpackage.z30.i(r2, r1)
        L109:
            if (r7 == 0) goto L11f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = " nanoseconds "
            r1.append(r2)
            java.lang.String r2 = r1.toString()
        L11f:
            java.lang.String r1 = "delay)"
            java.lang.String r2 = defpackage.z30.i(r2, r1)
        L125:
            boolean r1 = r0.isDone()
            if (r1 == 0) goto L137
            java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException
            java.lang.String r3 = " but future completed as timeout expired"
            java.lang.String r2 = defpackage.z30.i(r2, r3)
            r1.<init>(r2)
            throw r1
        L137:
            java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " for "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L151:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
            r1 = this;
            java.lang.Object r0 = r1.a
            boolean r0 = r0 instanceof defpackage.n
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
            r1 = this;
            java.lang.Object r0 = r1.a
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            java.lang.Object r1 = r5.a
            boolean r1 = r1 instanceof defpackage.n
            java.lang.String r2 = "]"
            if (r1 == 0) goto L1f
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto L82
        L1f:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L29
            r5.a(r0)
            goto L82
        L29:
            boolean r1 = r5 instanceof java.util.concurrent.ScheduledFuture     // Catch: java.lang.RuntimeException -> L4c
            if (r1 == 0) goto L4a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L4c
            java.lang.String r3 = "remaining delay=["
            r1.<init>(r3)     // Catch: java.lang.RuntimeException -> L4c
            r3 = r5
            java.util.concurrent.ScheduledFuture r3 = (java.util.concurrent.ScheduledFuture) r3     // Catch: java.lang.RuntimeException -> L4c
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.RuntimeException -> L4c
            long r3 = r3.getDelay(r4)     // Catch: java.lang.RuntimeException -> L4c
            r1.append(r3)     // Catch: java.lang.RuntimeException -> L4c
            java.lang.String r3 = " ms]"
            r1.append(r3)     // Catch: java.lang.RuntimeException -> L4c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.RuntimeException -> L4c
            goto L5f
        L4a:
            r1 = 0
            goto L5f
        L4c:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Exception thrown from implementation: "
            r3.<init>(r4)
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L5f:
            if (r1 == 0) goto L73
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L73
            java.lang.String r3 = "PENDING, info=["
            r0.append(r3)
            r0.append(r1)
            r0.append(r2)
            goto L82
        L73:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L7d
            r5.a(r0)
            goto L82
        L7d:
            java.lang.String r1 = "PENDING"
            r0.append(r1)
        L82:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
