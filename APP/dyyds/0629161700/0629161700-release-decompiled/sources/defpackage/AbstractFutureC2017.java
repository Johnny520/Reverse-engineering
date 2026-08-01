package defpackage;

/* JADX INFO: renamed from: ᲇᛳᛴᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFutureC2017 implements java.util.concurrent.Future {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final defpackage.AbstractC0397 f8712 = null;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static final java.lang.Object f8713 = null;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final boolean f8714 = false;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final java.util.logging.Logger f8715 = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public volatile defpackage.C2246 f8716;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public volatile defpackage.C1317 f8717;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public volatile java.lang.Object f8718;

    static {
            java.lang.String r0 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r1 = "false"
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            defpackage.AbstractFutureC2017.f8714 = r0
            java.lang.Class<ᲇᛳᛴᲈ> r0 = defpackage.AbstractFutureC2017.class
            java.lang.String r1 = r0.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            defpackage.AbstractFutureC2017.f8715 = r1
            ᲀᲀᛴᛳ r2 = new ᲀᲀᛴᛳ     // Catch: java.lang.Throwable -> L47
            java.lang.Class<ᲈᛵᲀᛱ> r1 = defpackage.C2246.class
            java.lang.Class<java.lang.Thread> r3 = java.lang.Thread.class
            java.lang.String r4 = "ᛷᲁᛳᛳ"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r3, r4)     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = "ᲇᛶᛵᲇ"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r1, r4)     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = "ᛵᛱᛵᛲ"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r5)     // Catch: java.lang.Throwable -> L47
            java.lang.Class<ᛷᛷᲀᛴ> r1 = defpackage.C1317.class
            java.lang.String r6 = "ᛷᛲᲇᲈ"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r6)     // Catch: java.lang.Throwable -> L47
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r7 = "ᛷᛸᛵᲇ"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r7)     // Catch: java.lang.Throwable -> L47
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L47
            r0 = 0
            goto L4d
        L47:
            r0 = move-exception
            ᲁᛴᛵᛲ r2 = new ᲁᛴᛵᛲ
            r2.<init>()
        L4d:
            defpackage.AbstractFutureC2017.f8712 = r2
            if (r0 == 0) goto L5a
            java.util.logging.Logger r1 = defpackage.AbstractFutureC2017.f8715
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L5a:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.AbstractFutureC2017.f8713 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static java.lang.Object m3405(defpackage.AbstractFutureC2017 r1) {
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

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static java.lang.Object m3406(java.lang.Object r2) {
            boolean r0 = r2 instanceof defpackage.C0566
            if (r0 != 0) goto L15
            boolean r0 = r2 instanceof defpackage.AbstractC0392
            r1 = 0
            if (r0 != 0) goto Lf
            java.lang.Object r0 = defpackage.AbstractFutureC2017.f8713
            if (r2 != r0) goto Le
            return r1
        Le:
            return r2
        Lf:
            java.util.concurrent.ExecutionException r2 = new java.util.concurrent.ExecutionException
            r2.<init>(r1)
            throw r2
        L15:
            ᛳᲁᲈᲁ r2 = (defpackage.C0566) r2
            java.lang.Throwable r2 = r2.f2817
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Task was cancelled."
            r0.<init>(r1)
            r0.initCause(r2)
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static void m3407(defpackage.AbstractFutureC2017 r5) {
        L0:
            ᲈᛵᲀᛱ r0 = r5.f8716
            ᛲᲈᲀᲈ r1 = defpackage.AbstractFutureC2017.f8712
            ᲈᛵᲀᛱ r2 = defpackage.C2246.f9562
            boolean r1 = r1.mo1154(r5, r0, r2)
            if (r1 == 0) goto L0
        Lc:
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.Thread r2 = r0.f9563
            if (r2 == 0) goto L18
            r0.f9563 = r1
            java.util.concurrent.locks.LockSupport.unpark(r2)
        L18:
            ᲈᛵᲀᛱ r0 = r0.f9564
            goto Lc
        L1b:
            ᛷᛷᲀᛴ r0 = r5.f8717
            ᛲᲈᲀᲈ r2 = defpackage.AbstractFutureC2017.f8712
            boolean r2 = r2.mo1156(r5, r0)
            if (r2 == 0) goto L1b
            r5 = r1
        L26:
            if (r0 == 0) goto L2f
            ᛷᛷᲀᛴ r2 = r0.f5829
            r0.f5829 = r5
            r5 = r0
            r0 = r2
            goto L26
        L2f:
            if (r5 != 0) goto L32
            return
        L32:
            ᛷᛷᲀᛴ r5 = r5.f5829
            throw r1     // Catch: java.lang.RuntimeException -> L35
        L35:
            r0 = move-exception
            java.util.logging.Logger r2 = defpackage.AbstractFutureC2017.f8715
            java.util.logging.Level r3 = java.util.logging.Level.SEVERE
            java.lang.String r4 = "RuntimeException while executing runnable null with executor null"
            r2.log(r3, r4, r0)
            goto L2f
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r5) {
            r4 = this;
            java.lang.Object r0 = r4.f8718
            if (r0 != 0) goto L29
            boolean r1 = defpackage.AbstractFutureC2017.f8714
            if (r1 == 0) goto L15
            ᛳᲁᲈᲁ r1 = new ᛳᲁᲈᲁ
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r3 = "Future.cancel() was called."
            r2.<init>(r3)
            r1.<init>(r2, r5)
            goto L1c
        L15:
            if (r5 == 0) goto L1a
            ᛳᲁᲈᲁ r1 = defpackage.C0566.f2816
            goto L1c
        L1a:
            ᛳᲁᲈᲁ r1 = defpackage.C0566.f2815
        L1c:
            ᛲᲈᲀᲈ r5 = defpackage.AbstractFutureC2017.f8712
            boolean r5 = r5.mo1155(r4, r0, r1)
            if (r5 == 0) goto L29
            m3407(r4)
            r4 = 1
            return r4
        L29:
            r4 = 0
            return r4
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
            r4 = this;
            ᲈᛵᲀᛱ r0 = defpackage.C2246.f9562
            boolean r1 = java.lang.Thread.interrupted()
            if (r1 != 0) goto L4b
            java.lang.Object r1 = r4.f8718
            if (r1 == 0) goto L11
            java.lang.Object r4 = m3406(r1)
            return r4
        L11:
            ᲈᛵᲀᛱ r1 = r4.f8716
            if (r1 == r0) goto L44
            ᲈᛵᲀᛱ r2 = new ᲈᛵᲀᛱ
            r2.<init>()
        L1a:
            ᛲᲈᲀᲈ r3 = defpackage.AbstractFutureC2017.f8712
            r3.mo1158(r2, r1)
            boolean r1 = r3.mo1154(r4, r1, r2)
            if (r1 == 0) goto L40
        L25:
            java.util.concurrent.locks.LockSupport.park(r4)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L37
            java.lang.Object r0 = r4.f8718
            if (r0 == 0) goto L25
            java.lang.Object r4 = m3406(r0)
            return r4
        L37:
            r4.m3408(r2)
            java.lang.InterruptedException r4 = new java.lang.InterruptedException
            r4.<init>()
            throw r4
        L40:
            ᲈᛵᲀᛱ r1 = r4.f8716
            if (r1 != r0) goto L1a
        L44:
            java.lang.Object r4 = r4.f8718
            java.lang.Object r4 = m3406(r4)
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
            ᲈᛵᲀᛱ r4 = defpackage.C2246.f9562
            long r5 = r3.toNanos(r1)
            boolean r7 = java.lang.Thread.interrupted()
            if (r7 != 0) goto L13d
            java.lang.Object r7 = r0.f8718
            if (r7 == 0) goto L1b
            java.lang.Object r0 = m3406(r7)
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
            ᲈᛵᲀᛱ r13 = r0.f8716
            if (r13 == r4) goto L6f
            ᲈᛵᲀᛱ r14 = new ᲈᛵᲀᛱ
            r14.<init>()
        L37:
            ᛲᲈᲀᲈ r15 = defpackage.AbstractFutureC2017.f8712
            r15.mo1158(r14, r13)
            boolean r13 = r15.mo1154(r0, r13, r14)
            if (r13 == 0) goto L6b
        L42:
            java.util.concurrent.locks.LockSupport.parkNanos(r0, r5)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L62
            java.lang.Object r4 = r0.f8718
            if (r4 == 0) goto L54
            java.lang.Object r0 = m3406(r4)
            return r0
        L54:
            long r4 = java.lang.System.nanoTime()
            long r5 = r9 - r4
            int r4 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r4 >= 0) goto L42
            r0.m3408(r14)
            goto L76
        L62:
            r0.m3408(r14)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L6b:
            ᲈᛵᲀᛱ r13 = r0.f8716
            if (r13 != r4) goto L37
        L6f:
            java.lang.Object r0 = r0.f8718
            java.lang.Object r0 = m3406(r0)
            return r0
        L76:
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 <= 0) goto L96
            java.lang.Object r4 = r0.f8718
            if (r4 == 0) goto L83
            java.lang.Object r0 = m3406(r4)
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
            java.lang.String r1 = defpackage.AbstractC0225.m817(r2, r1, r4)
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
            java.lang.Object r0 = r0.f8718
            boolean r0 = r0 instanceof defpackage.C0566
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
            r0 = this;
            java.lang.Object r0 = r0.f8718
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
            java.lang.Object r1 = r5.f8718
            boolean r1 = r1 instanceof defpackage.C0566
            java.lang.String r2 = "]"
            if (r1 == 0) goto L1f
            java.lang.String r5 = "CANCELLED"
            r0.append(r5)
            goto L82
        L1f:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L29
            r5.m3409(r0)
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
            r5.m3409(r0)
            goto L82
        L7d:
            java.lang.String r5 = "PENDING"
            r0.append(r5)
        L82:
            r0.append(r2)
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m3408(defpackage.C2246 r5) {
            r4 = this;
            r0 = 0
            r5.f9563 = r0
        L3:
            ᲈᛵᲀᛱ r5 = r4.f8716
            ᲈᛵᲀᛱ r1 = defpackage.C2246.f9562
            if (r5 != r1) goto La
            goto L29
        La:
            r1 = r0
        Lb:
            if (r5 == 0) goto L29
            ᲈᛵᲀᛱ r2 = r5.f9564
            java.lang.Thread r3 = r5.f9563
            if (r3 == 0) goto L15
            r1 = r5
            goto L27
        L15:
            if (r1 == 0) goto L1e
            r1.f9564 = r2
            java.lang.Thread r5 = r1.f9563
            if (r5 != 0) goto L27
            goto L3
        L1e:
            ᛲᲈᲀᲈ r3 = defpackage.AbstractFutureC2017.f8712
            boolean r5 = r3.mo1154(r4, r5, r2)
            if (r5 != 0) goto L27
            goto L3
        L27:
            r5 = r2
            goto Lb
        L29:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m3409(java.lang.StringBuilder r4) {
            r3 = this;
            java.lang.String r0 = "]"
            java.lang.Object r1 = m3405(r3)     // Catch: java.lang.RuntimeException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L31
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
