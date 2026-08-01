package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛲᛵᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFutureC1123 implements java.util.concurrent.Future {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final boolean f3623 = false;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static final java.lang.Object f3624 = null;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static final xhss.AbstractC0473 f3625 = null;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static final java.util.logging.Logger f3626 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public volatile java.lang.Object f3627;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public volatile xhss.C0734 f3628;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public volatile xhss.C0926 f3629;

    static {
            java.lang.String r0 = "ᛱᛱᛲᲇ"
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            xhss.AbstractFutureC1123.f3623 = r1
            java.lang.Class<xhss.ᲈᛲᛵᲁ> r1 = xhss.AbstractFutureC1123.class
            java.lang.String r2 = r1.getName()
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            xhss.AbstractFutureC1123.f3626 = r2
            xhss.ᛴᲈᛱᛴ r3 = new xhss.ᛴᲈᛱᛴ     // Catch: java.lang.Throwable -> L45
            java.lang.Class<xhss.ᲁᛲᛴᛴ> r2 = xhss.C0926.class
            java.lang.Class<java.lang.Thread> r4 = java.lang.Thread.class
            java.lang.String r5 = "ᛷᛵᛵᲈ"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r4, r5)     // Catch: java.lang.Throwable -> L45
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r2, r0)     // Catch: java.lang.Throwable -> L45
            java.lang.String r6 = "ᲇᛴᲇᛵ"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r6)     // Catch: java.lang.Throwable -> L45
            java.lang.Class<xhss.ᛸᛲᛷᛱ> r2 = xhss.C0734.class
            java.lang.String r7 = "ᛳᲁᲇᛸ"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r7)     // Catch: java.lang.Throwable -> L45
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)     // Catch: java.lang.Throwable -> L45
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L45
            r0 = 0
            goto L4b
        L45:
            r0 = move-exception
            xhss.ᛳᛶᛷᲀ r3 = new xhss.ᛳᛶᛷᲀ
            r3.<init>()
        L4b:
            xhss.AbstractFutureC1123.f3625 = r3
            if (r0 == 0) goto L58
            java.util.logging.Logger r1 = xhss.AbstractFutureC1123.f3626
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L58:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            xhss.AbstractFutureC1123.f3624 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static void m1809(xhss.AbstractFutureC1123 r5) {
        L0:
            xhss.ᲁᛲᛴᛴ r0 = r5.f3629
            xhss.ᛵᛵᛲᲈ r1 = xhss.AbstractFutureC1123.f3625
            xhss.ᲁᛲᛴᛴ r2 = xhss.C0926.f2983
            boolean r1 = r1.mo601(r5, r0, r2)
            if (r1 == 0) goto L0
        Lc:
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.Thread r2 = r0.f2985
            if (r2 == 0) goto L18
            r0.f2985 = r1
            java.util.concurrent.locks.LockSupport.unpark(r2)
        L18:
            xhss.ᲁᛲᛴᛴ r0 = r0.f2984
            goto Lc
        L1b:
            xhss.ᛸᛲᛷᛱ r0 = r5.f3628
            xhss.ᛵᛵᛲᲈ r2 = xhss.AbstractFutureC1123.f3625
            boolean r2 = r2.mo600(r5, r0)
            if (r2 == 0) goto L1b
            r5 = r1
        L26:
            if (r0 == 0) goto L2f
            xhss.ᛸᛲᛷᛱ r2 = r0.f2467
            r0.f2467 = r5
            r5 = r0
            r0 = r2
            goto L26
        L2f:
            if (r5 != 0) goto L32
            return
        L32:
            xhss.ᛸᛲᛷᛱ r5 = r5.f2467
            throw r1     // Catch: java.lang.RuntimeException -> L35
        L35:
            r0 = move-exception
            java.util.logging.Logger r2 = xhss.AbstractFutureC1123.f3626
            java.util.logging.Level r3 = java.util.logging.Level.SEVERE
            java.lang.String r4 = "RuntimeException while executing runnable null with executor null"
            r2.log(r3, r4, r0)
            goto L2f
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static java.lang.Object m1810(java.lang.Object r2) {
            boolean r0 = r2 instanceof xhss.C0609
            if (r0 != 0) goto L15
            boolean r0 = r2 instanceof xhss.AbstractC0776
            r1 = 0
            if (r0 != 0) goto Lf
            java.lang.Object r0 = xhss.AbstractFutureC1123.f3624
            if (r2 != r0) goto Le
            return r1
        Le:
            return r2
        Lf:
            java.util.concurrent.ExecutionException r2 = new java.util.concurrent.ExecutionException
            r2.<init>(r1)
            throw r2
        L15:
            xhss.ᛶᲇᲈᛸ r2 = (xhss.C0609) r2
            java.lang.Throwable r2 = r2.f2096
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Task was cancelled."
            r0.<init>(r1)
            r0.initCause(r2)
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static java.lang.Object m1811(xhss.AbstractFutureC1123 r1) {
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

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r5) {
            r4 = this;
            java.lang.Object r0 = r4.f3627
            if (r0 != 0) goto L29
            boolean r1 = xhss.AbstractFutureC1123.f3623
            if (r1 == 0) goto L15
            xhss.ᛶᲇᲈᛸ r1 = new xhss.ᛶᲇᲈᛸ
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r3 = "Future.cancel() was called."
            r2.<init>(r3)
            r1.<init>(r2, r5)
            goto L1c
        L15:
            if (r5 == 0) goto L1a
            xhss.ᛶᲇᲈᛸ r1 = xhss.C0609.f2094
            goto L1c
        L1a:
            xhss.ᛶᲇᲈᛸ r1 = xhss.C0609.f2095
        L1c:
            xhss.ᛵᛵᛲᲈ r5 = xhss.AbstractFutureC1123.f3625
            boolean r5 = r5.mo604(r4, r0, r1)
            if (r5 == 0) goto L29
            m1809(r4)
            r4 = 1
            return r4
        L29:
            r4 = 0
            return r4
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
            r4 = this;
            xhss.ᲁᛲᛴᛴ r0 = xhss.C0926.f2983
            boolean r1 = java.lang.Thread.interrupted()
            if (r1 != 0) goto L4b
            java.lang.Object r1 = r4.f3627
            if (r1 == 0) goto L11
            java.lang.Object r4 = m1810(r1)
            return r4
        L11:
            xhss.ᲁᛲᛴᛴ r1 = r4.f3629
            if (r1 == r0) goto L44
            xhss.ᲁᛲᛴᛴ r2 = new xhss.ᲁᛲᛴᛴ
            r2.<init>()
        L1a:
            xhss.ᛵᛵᛲᲈ r3 = xhss.AbstractFutureC1123.f3625
            r3.mo603(r2, r1)
            boolean r1 = r3.mo601(r4, r1, r2)
            if (r1 == 0) goto L40
        L25:
            java.util.concurrent.locks.LockSupport.park(r4)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L37
            java.lang.Object r0 = r4.f3627
            if (r0 == 0) goto L25
            java.lang.Object r4 = m1810(r0)
            return r4
        L37:
            r4.m1812(r2)
            java.lang.InterruptedException r4 = new java.lang.InterruptedException
            r4.<init>()
            throw r4
        L40:
            xhss.ᲁᛲᛴᛴ r1 = r4.f3629
            if (r1 != r0) goto L1a
        L44:
            java.lang.Object r4 = r4.f3627
            java.lang.Object r4 = m1810(r4)
            return r4
        L4b:
            java.lang.InterruptedException r4 = new java.lang.InterruptedException
            r4.<init>()
            throw r4
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long r18, java.util.concurrent.TimeUnit r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r20
            xhss.ᲁᛲᛴᛴ r4 = xhss.C0926.f2983
            long r5 = r3.toNanos(r1)
            boolean r7 = java.lang.Thread.interrupted()
            if (r7 != 0) goto L13d
            java.lang.Object r7 = r0.f3627
            if (r7 == 0) goto L1b
            java.lang.Object r0 = m1810(r7)
            return r0
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
            xhss.ᲁᛲᛴᛴ r13 = r0.f3629
            if (r13 == r4) goto L6f
            xhss.ᲁᛲᛴᛴ r14 = new xhss.ᲁᛲᛴᛴ
            r14.<init>()
        L37:
            xhss.ᛵᛵᛲᲈ r15 = xhss.AbstractFutureC1123.f3625
            r15.mo603(r14, r13)
            boolean r13 = r15.mo601(r0, r13, r14)
            if (r13 == 0) goto L6b
        L42:
            java.util.concurrent.locks.LockSupport.parkNanos(r0, r5)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L62
            java.lang.Object r4 = r0.f3627
            if (r4 == 0) goto L54
            java.lang.Object r0 = m1810(r4)
            return r0
        L54:
            long r4 = java.lang.System.nanoTime()
            long r5 = r9 - r4
            int r4 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r4 >= 0) goto L42
            r0.m1812(r14)
            goto L76
        L62:
            r0.m1812(r14)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L6b:
            xhss.ᲁᛲᛴᛴ r13 = r0.f3629
            if (r13 != r4) goto L37
        L6f:
            java.lang.Object r0 = r0.f3627
            java.lang.Object r0 = m1810(r0)
            return r0
        L76:
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 <= 0) goto L96
            java.lang.Object r4 = r0.f3627
            if (r4 == 0) goto L83
            java.lang.Object r0 = m1810(r4)
            return r0
        L83:
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L90
            long r4 = java.lang.System.nanoTime()
            long r5 = r9 - r4
            goto L76
        L90:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
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
            if (r10 >= 0) goto L11f
            java.lang.String r10 = " (plus "
            java.lang.String r2 = r2.concat(r10)
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
            if (r3 <= 0) goto L106
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r13)
            r3.append(r1)
            r3.append(r9)
            java.lang.String r2 = r3.toString()
            if (r7 == 0) goto L102
            java.lang.String r3 = ","
            java.lang.String r2 = r2.concat(r3)
        L102:
            java.lang.String r2 = r2.concat(r1)
        L106:
            if (r7 == 0) goto L119
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r2 = " nanoseconds "
            r1.append(r2)
            java.lang.String r2 = r1.toString()
        L119:
            java.lang.String r1 = "delay)"
            java.lang.String r2 = r2.concat(r1)
        L11f:
            boolean r0 = r0.isDone()
            if (r0 == 0) goto L131
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            java.lang.String r1 = " but future completed as timeout expired"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L131:
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            java.lang.String r1 = " for "
            java.lang.String r1 = xhss.AbstractC0390.m781(r2, r1, r4)
            r0.<init>(r1)
            throw r0
        L13d:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
            r0 = this;
            java.lang.Object r0 = r0.f3627
            boolean r0 = r0 instanceof xhss.C0609
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
            r0 = this;
            java.lang.Object r0 = r0.f3627
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
            java.lang.Object r1 = r5.f3627
            boolean r1 = r1 instanceof xhss.C0609
            java.lang.String r2 = "]"
            if (r1 == 0) goto L1f
            java.lang.String r5 = "CANCELLED"
            r0.append(r5)
            goto L82
        L1f:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L29
            r5.m1813(r0)
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
            java.lang.String r5 = "PENDING, info=["
            r0.append(r5)
            r0.append(r1)
            r0.append(r2)
            goto L82
        L73:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L7d
            r5.m1813(r0)
            goto L82
        L7d:
            java.lang.String r5 = "PENDING"
            r0.append(r5)
        L82:
            r0.append(r2)
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final void m1812(xhss.C0926 r5) {
            r4 = this;
            r0 = 0
            r5.f2985 = r0
        L3:
            xhss.ᲁᛲᛴᛴ r5 = r4.f3629
            xhss.ᲁᛲᛴᛴ r1 = xhss.C0926.f2983
            if (r5 != r1) goto La
            goto L29
        La:
            r1 = r0
        Lb:
            if (r5 == 0) goto L29
            xhss.ᲁᛲᛴᛴ r2 = r5.f2984
            java.lang.Thread r3 = r5.f2985
            if (r3 == 0) goto L15
            r1 = r5
            goto L27
        L15:
            if (r1 == 0) goto L1e
            r1.f2984 = r2
            java.lang.Thread r5 = r1.f2985
            if (r5 != 0) goto L27
            goto L3
        L1e:
            xhss.ᛵᛵᛲᲈ r3 = xhss.AbstractFutureC1123.f3625
            boolean r5 = r3.mo601(r4, r5, r2)
            if (r5 != 0) goto L27
            goto L3
        L27:
            r5 = r2
            goto Lb
        L29:
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m1813(java.lang.StringBuilder r4) {
            r3 = this;
            java.lang.String r0 = "]"
            java.lang.Object r1 = m1811(r3)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
            java.lang.String r2 = "SUCCESS, result=["
            r4.append(r2)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
            if (r1 != r3) goto L10
            java.lang.String r3 = "this future"
            goto L14
        L10:
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
        L14:
            r4.append(r3)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
            r4.append(r0)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
            return
        L1b:
            r3 = move-exception
            goto L1f
        L1d:
            r3 = move-exception
            goto L37
        L1f:
            java.lang.String r0 = "UNKNOWN, cause=["
            r4.append(r0)
            java.lang.Class r3 = r3.getClass()
            r4.append(r3)
            java.lang.String r3 = " thrown from get()]"
            r4.append(r3)
            goto L46
        L31:
            java.lang.String r3 = "CANCELLED"
            r4.append(r3)
            goto L46
        L37:
            java.lang.String r1 = "FAILURE, cause=["
            r4.append(r1)
            java.lang.Throwable r3 = r3.getCause()
            r4.append(r3)
            r4.append(r0)
        L46:
            return
    }
}
