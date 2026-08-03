package z2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements java.util.concurrent.Future {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final boolean f22513j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final java.util.logging.Logger f22514k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final r9.e0 f22515l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final java.lang.Object f22516m = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile java.lang.Object f22517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile z2.c f22518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile z2.f f22519i;

    static {
            java.lang.Class<z2.f> r0 = z2.f.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            z2.g.f22513j = r1
            java.lang.Class<z2.g> r1 = z2.g.class
            java.lang.String r2 = r1.getName()
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            z2.g.f22514k = r2
            z2.d r3 = new z2.d     // Catch: java.lang.Throwable -> L47
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r4 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r4)     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = "i"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)     // Catch: java.lang.Throwable -> L47
            java.lang.Class<z2.c> r0 = z2.c.class
            java.lang.String r2 = "h"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)     // Catch: java.lang.Throwable -> L47
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r2 = "g"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)     // Catch: java.lang.Throwable -> L47
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L47
            r0 = 0
            goto L4d
        L47:
            r0 = move-exception
            z2.e r3 = new z2.e
            r3.<init>()
        L4d:
            z2.g.f22515l = r3
            if (r0 == 0) goto L5a
            java.util.logging.Logger r1 = z2.g.f22514k
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L5a:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            z2.g.f22516m = r0
            return
    }

    public static void b(z2.g r5) {
        L0:
            z2.f r0 = r5.f22519i
            r9.e0 r1 = z2.g.f22515l
            z2.f r2 = z2.f.f22510c
            boolean r1 = r1.m(r5, r0, r2)
            if (r1 == 0) goto L0
        Lc:
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.Thread r2 = r0.f22511a
            if (r2 == 0) goto L18
            r0.f22511a = r1
            java.util.concurrent.locks.LockSupport.unpark(r2)
        L18:
            z2.f r0 = r0.f22512b
            goto Lc
        L1b:
            z2.c r0 = r5.f22518h
            r9.e0 r2 = z2.g.f22515l
            boolean r2 = r2.k(r5, r0)
            if (r2 == 0) goto L1b
            r5 = r1
        L26:
            if (r0 == 0) goto L2f
            z2.c r2 = r0.f22504a
            r0.f22504a = r5
            r5 = r0
            r0 = r2
            goto L26
        L2f:
            if (r5 != 0) goto L32
            return
        L32:
            z2.c r5 = r5.f22504a
            throw r1     // Catch: java.lang.RuntimeException -> L35
        L35:
            r0 = move-exception
            java.util.logging.Logger r2 = z2.g.f22514k
            java.util.logging.Level r3 = java.util.logging.Level.SEVERE
            java.lang.String r4 = "RuntimeException while executing runnable null with executor null"
            r2.log(r3, r4, r0)
            goto L2f
    }

    public static java.lang.Object c(java.lang.Object r2) {
            boolean r0 = r2 instanceof z2.a
            if (r0 != 0) goto L15
            boolean r0 = r2 instanceof z2.b
            if (r0 != 0) goto Le
            java.lang.Object r0 = z2.g.f22516m
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
            z2.a r2 = (z2.a) r2
            java.lang.Throwable r2 = r2.f22502a
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Task was cancelled."
            r0.<init>(r1)
            r0.initCause(r2)
            throw r0
    }

    public static java.lang.Object d(z2.g r1) {
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
            java.lang.Object r0 = r4.f22517g
            if (r0 != 0) goto L29
            boolean r1 = z2.g.f22513j
            if (r1 == 0) goto L15
            z2.a r1 = new z2.a
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r3 = "Future.cancel() was called."
            r2.<init>(r3)
            r1.<init>(r2, r5)
            goto L1c
        L15:
            if (r5 == 0) goto L1a
            z2.a r1 = z2.a.f22500b
            goto L1c
        L1a:
            z2.a r1 = z2.a.f22501c
        L1c:
            r9.e0 r5 = z2.g.f22515l
            boolean r5 = r5.l(r4, r0, r1)
            if (r5 == 0) goto L29
            b(r4)
            r5 = 1
            return r5
        L29:
            r5 = 0
            return r5
    }

    public final void e(z2.f r5) {
            r4 = this;
            r0 = 0
            r5.f22511a = r0
        L3:
            z2.f r5 = r4.f22519i
            z2.f r1 = z2.f.f22510c
            if (r5 != r1) goto La
            goto L29
        La:
            r1 = r0
        Lb:
            if (r5 == 0) goto L29
            z2.f r2 = r5.f22512b
            java.lang.Thread r3 = r5.f22511a
            if (r3 == 0) goto L15
            r1 = r5
            goto L27
        L15:
            if (r1 == 0) goto L1e
            r1.f22512b = r2
            java.lang.Thread r5 = r1.f22511a
            if (r5 != 0) goto L27
            goto L3
        L1e:
            r9.e0 r3 = z2.g.f22515l
            boolean r5 = r3.m(r4, r5, r2)
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
            z2.f r0 = z2.f.f22510c
            boolean r1 = java.lang.Thread.interrupted()
            if (r1 != 0) goto L4b
            java.lang.Object r1 = r4.f22517g
            if (r1 == 0) goto L11
            java.lang.Object r0 = c(r1)
            return r0
        L11:
            z2.f r1 = r4.f22519i
            if (r1 == r0) goto L44
            z2.f r2 = new z2.f
            r2.<init>()
        L1a:
            r9.e0 r3 = z2.g.f22515l
            r3.a0(r2, r1)
            boolean r1 = r3.m(r4, r1, r2)
            if (r1 == 0) goto L40
        L25:
            java.util.concurrent.locks.LockSupport.park(r4)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L37
            java.lang.Object r0 = r4.f22517g
            if (r0 == 0) goto L25
            java.lang.Object r0 = c(r0)
            return r0
        L37:
            r4.e(r2)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L40:
            z2.f r1 = r4.f22519i
            if (r1 != r0) goto L1a
        L44:
            java.lang.Object r0 = r4.f22517g
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
            z2.f r4 = z2.f.f22510c
            long r5 = r3.toNanos(r1)
            boolean r7 = java.lang.Thread.interrupted()
            if (r7 != 0) goto L13d
            java.lang.Object r7 = r0.f22517g
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
            z2.f r13 = r0.f22519i
            if (r13 == r4) goto L6f
            z2.f r14 = new z2.f
            r14.<init>()
        L37:
            r9.e0 r15 = z2.g.f22515l
            r15.a0(r14, r13)
            boolean r13 = r15.m(r0, r13, r14)
            if (r13 == 0) goto L6b
        L42:
            java.util.concurrent.locks.LockSupport.parkNanos(r0, r5)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L62
            java.lang.Object r4 = r0.f22517g
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
            z2.f r13 = r0.f22519i
            if (r13 != r4) goto L37
        L6f:
            java.lang.Object r1 = r0.f22517g
            java.lang.Object r1 = c(r1)
            return r1
        L76:
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 <= 0) goto L96
            java.lang.Object r4 = r0.f22517g
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
            java.lang.String r13 = "Waited "
            java.lang.String r14 = " "
            java.lang.StringBuilder r1 = p.a.o(r1, r13, r14)
            java.lang.String r2 = r3.toString()
            java.lang.String r2 = r2.toLowerCase(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            long r15 = r5 + r11
            int r2 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r2 >= 0) goto L11f
            java.lang.String r2 = " (plus "
            java.lang.String r1 = r1.concat(r2)
            long r5 = -r5
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            r15 = r7
            long r7 = r3.convert(r5, r2)
            long r2 = r3.toNanos(r7)
            long r5 = r5 - r2
            int r2 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r2 == 0) goto Ldf
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 <= 0) goto Ldd
            goto Ldf
        Ldd:
            r3 = 0
            goto Le0
        Ldf:
            r3 = 1
        Le0:
            if (r2 <= 0) goto L103
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r7)
            r2.append(r14)
            r2.append(r9)
            java.lang.String r1 = r2.toString()
            if (r3 == 0) goto Lff
            java.lang.String r2 = ","
            java.lang.String r1 = r1.concat(r2)
        Lff:
            java.lang.String r1 = r1.concat(r14)
        L103:
            if (r3 == 0) goto L119
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = " nanoseconds "
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L119:
            java.lang.String r2 = "delay)"
            java.lang.String r1 = r1.concat(r2)
        L11f:
            boolean r2 = r0.isDone()
            if (r2 == 0) goto L131
            java.util.concurrent.TimeoutException r2 = new java.util.concurrent.TimeoutException
            java.lang.String r3 = " but future completed as timeout expired"
            java.lang.String r1 = r1.concat(r3)
            r2.<init>(r1)
            throw r2
        L131:
            java.util.concurrent.TimeoutException r2 = new java.util.concurrent.TimeoutException
            java.lang.String r3 = " for "
            java.lang.String r1 = wb.en.h(r1, r3, r4)
            r2.<init>(r1)
            throw r2
        L13d:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
            r1 = this;
            java.lang.Object r0 = r1.f22517g
            boolean r0 = r0 instanceof z2.a
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
            r1 = this;
            java.lang.Object r0 = r1.f22517g
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
            java.lang.Object r1 = r5.f22517g
            boolean r1 = r1 instanceof z2.a
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
