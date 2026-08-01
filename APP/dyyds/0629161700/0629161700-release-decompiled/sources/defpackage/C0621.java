package defpackage;

/* JADX INFO: renamed from: ᛴᛲᛲᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0621 implements defpackage.InterfaceC0545 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final defpackage.ExecutorServiceC0166 f3033;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicInteger f3034;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public defpackage.C0442 f3035;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final defpackage.ExecutorServiceC0166 f3036;

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public defpackage.RunnableC1425 f3037;

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public defpackage.C2014 f3038;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public defpackage.InterfaceC1901 f3039;

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public boolean f3040;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C0827 f3041;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public boolean f3042;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C0943 f3043;

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public volatile boolean f3044;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0379 f3045;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final defpackage.ExecutorServiceC0166 f3046;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public boolean f3047;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public boolean f3048;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public defpackage.C0991 f3049;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.InterfaceC1398 f3050;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public int f3051;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C0827 f3052;

    static {
            return
    }

    public C0621(defpackage.ExecutorServiceC0166 r3, defpackage.ExecutorServiceC0166 r4, defpackage.ExecutorServiceC0166 r5, defpackage.ExecutorServiceC0166 r6, defpackage.C0827 r7, defpackage.C0827 r8, defpackage.C1326 r9) {
            r2 = this;
            r2.<init>()
            ᛲᲈᛱᛸ r5 = new ᛲᲈᛱᛸ
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            r5.<init>(r0)
            r2.f3045 = r5
            ᛵᛸᛴᛶ r5 = new ᛵᛸᛴᛶ
            r5.<init>()
            r2.f3043 = r5
            java.util.concurrent.atomic.AtomicInteger r5 = new java.util.concurrent.atomic.AtomicInteger
            r5.<init>()
            r2.f3034 = r5
            r2.f3033 = r3
            r2.f3036 = r4
            r2.f3046 = r6
            r2.f3052 = r7
            r2.f3041 = r8
            r2.f3050 = r9
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final boolean m1425() {
            r1 = this;
            boolean r0 = r1.f3040
            if (r0 != 0) goto Lf
            boolean r0 = r1.f3048
            if (r0 != 0) goto Lf
            boolean r1 = r1.f3044
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final synchronized void m1426(int r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.m1425()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "Not yet complete!"
            defpackage.C0292.m945(r1, r0)     // Catch: java.lang.Throwable -> L1a
            java.util.concurrent.atomic.AtomicInteger r0 = r2.f3034     // Catch: java.lang.Throwable -> L1a
            int r3 = r0.getAndAdd(r3)     // Catch: java.lang.Throwable -> L1a
            if (r3 != 0) goto L1c
            ᲇᛳᛲ r3 = r2.f3038     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L1c
            r3.m3403()     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r3 = move-exception
            goto L1e
        L1c:
            monitor-exit(r2)
            return
        L1e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r3
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m1427() {
            r3 = this;
            monitor-enter(r3)
            ᛵᛸᛴᛶ r0 = r3.f3043     // Catch: java.lang.Throwable -> L27
            r0.m1896()     // Catch: java.lang.Throwable -> L27
            boolean r0 = r3.m1425()     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "Not yet complete!"
            defpackage.C0292.m945(r1, r0)     // Catch: java.lang.Throwable -> L27
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f3034     // Catch: java.lang.Throwable -> L27
            int r0 = r0.decrementAndGet()     // Catch: java.lang.Throwable -> L27
            if (r0 < 0) goto L19
            r1 = 1
            goto L1a
        L19:
            r1 = 0
        L1a:
            java.lang.String r2 = "Can't decrement below 0"
            defpackage.C0292.m945(r2, r1)     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L29
            ᲇᛳᛲ r0 = r3.f3038     // Catch: java.lang.Throwable -> L27
            r3.m1429()     // Catch: java.lang.Throwable -> L27
            goto L2a
        L27:
            r0 = move-exception
            goto L31
        L29:
            r0 = 0
        L2a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L30
            r0.m3404()
        L30:
            return
        L31:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final synchronized void m1428(defpackage.C1622 r3, java.util.concurrent.Executor r4) {
            r2 = this;
            monitor-enter(r2)
            ᛵᛸᛴᛶ r0 = r2.f3043     // Catch: java.lang.Throwable -> L23
            r0.m1896()     // Catch: java.lang.Throwable -> L23
            ᛲᲈᛱᛸ r0 = r2.f3045     // Catch: java.lang.Throwable -> L23
            java.util.ArrayList r0 = r0.f1963     // Catch: java.lang.Throwable -> L23
            ᛳᲇᛶᛳ r1 = new ᛳᲇᛶᛳ     // Catch: java.lang.Throwable -> L23
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L23
            r0.add(r1)     // Catch: java.lang.Throwable -> L23
            boolean r0 = r2.f3048     // Catch: java.lang.Throwable -> L23
            r1 = 1
            if (r0 == 0) goto L25
            r2.m1426(r1)     // Catch: java.lang.Throwable -> L23
            ᲈᛱᲀᛳ r0 = new ᲈᛱᲀᛳ     // Catch: java.lang.Throwable -> L23
            r0.<init>(r2, r3, r1)     // Catch: java.lang.Throwable -> L23
            r4.execute(r0)     // Catch: java.lang.Throwable -> L23
            goto L3e
        L23:
            r3 = move-exception
            goto L40
        L25:
            boolean r0 = r2.f3040     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L36
            r2.m1426(r1)     // Catch: java.lang.Throwable -> L23
            ᲈᛱᲀᛳ r0 = new ᲈᛱᲀᛳ     // Catch: java.lang.Throwable -> L23
            r1 = 0
            r0.<init>(r2, r3, r1)     // Catch: java.lang.Throwable -> L23
            r4.execute(r0)     // Catch: java.lang.Throwable -> L23
            goto L3e
        L36:
            boolean r3 = r2.f3044     // Catch: java.lang.Throwable -> L23
            r3 = r3 ^ r1
            java.lang.String r4 = "Cannot add callbacks to a cancelled EngineJob"
            defpackage.C0292.m945(r4, r3)     // Catch: java.lang.Throwable -> L23
        L3e:
            monitor-exit(r2)
            return
        L40:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
            throw r3
    }

    @Override // defpackage.InterfaceC0545
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final defpackage.C0943 mo1334() {
            r0 = this;
            ᛵᛸᛴᛶ r0 = r0.f3043
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final synchronized void m1429() {
            r5 = this;
            monitor-enter(r5)
            ᛳᛳᛸᛷ r0 = r5.f3035     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L3e
            ᛲᲈᛱᛸ r0 = r5.f3045     // Catch: java.lang.Throwable -> L39
            java.util.ArrayList r0 = r0.f1963     // Catch: java.lang.Throwable -> L39
            r0.clear()     // Catch: java.lang.Throwable -> L39
            r0 = 0
            r5.f3035 = r0     // Catch: java.lang.Throwable -> L39
            r5.f3038 = r0     // Catch: java.lang.Throwable -> L39
            r5.f3039 = r0     // Catch: java.lang.Throwable -> L39
            r1 = 0
            r5.f3040 = r1     // Catch: java.lang.Throwable -> L39
            r5.f3044 = r1     // Catch: java.lang.Throwable -> L39
            r5.f3048 = r1     // Catch: java.lang.Throwable -> L39
            ᛸᛱᲁᛵ r2 = r5.f3037     // Catch: java.lang.Throwable -> L39
            ᛷᛱᛷᲈ r3 = r2.f6255     // Catch: java.lang.Throwable -> L39
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L39
            r4 = 1
            r3.f5450 = r4     // Catch: java.lang.Throwable -> L3b
            boolean r4 = r3.m2342()     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L39
            if (r4 == 0) goto L2c
            r2.m2607()     // Catch: java.lang.Throwable -> L39
        L2c:
            r5.f3037 = r0     // Catch: java.lang.Throwable -> L39
            r5.f3049 = r0     // Catch: java.lang.Throwable -> L39
            r5.f3051 = r1     // Catch: java.lang.Throwable -> L39
            ᛷᲈᛲᛶ r0 = r5.f3050     // Catch: java.lang.Throwable -> L39
            r0.mo914(r5)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r5)
            return
        L39:
            r0 = move-exception
            goto L44
        L3b:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            throw r0     // Catch: java.lang.Throwable -> L39
        L3e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L39
            r0.<init>()     // Catch: java.lang.Throwable -> L39
            throw r0     // Catch: java.lang.Throwable -> L39
        L44:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L39
            throw r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final synchronized void m1430(defpackage.C1622 r4) {
            r3 = this;
            monitor-enter(r3)
            ᛵᛸᛴᛶ r0 = r3.f3043     // Catch: java.lang.Throwable -> L53
            r0.m1896()     // Catch: java.lang.Throwable -> L53
            ᛲᲈᛱᛸ r0 = r3.f3045     // Catch: java.lang.Throwable -> L53
            java.util.ArrayList r0 = r0.f1963     // Catch: java.lang.Throwable -> L53
            ᛳᲇᛶᛳ r1 = new ᛳᲇᛶᛳ     // Catch: java.lang.Throwable -> L53
            ᲁᛲᛵᛵ r2 = defpackage.C1825.f7960     // Catch: java.lang.Throwable -> L53
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L53
            r0.remove(r1)     // Catch: java.lang.Throwable -> L53
            ᛲᲈᛱᛸ r4 = r3.f3045     // Catch: java.lang.Throwable -> L53
            java.util.ArrayList r4 = r4.f1963     // Catch: java.lang.Throwable -> L53
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L64
            boolean r4 = r3.m1425()     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L25
            goto L4a
        L25:
            r4 = 1
            r3.f3044 = r4     // Catch: java.lang.Throwable -> L53
            ᛸᛱᲁᛵ r0 = r3.f3037     // Catch: java.lang.Throwable -> L53
            r0.f6253 = r4     // Catch: java.lang.Throwable -> L53
            ᛱᲁᲈᛱ r4 = r0.f6263     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L33
            r4.cancel()     // Catch: java.lang.Throwable -> L53
        L33:
            ᛵᛲᛵᛴ r4 = r3.f3052     // Catch: java.lang.Throwable -> L53
            ᛳᛳᛸᛷ r0 = r3.f3035     // Catch: java.lang.Throwable -> L53
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L53
            ᛶᲈᛷᛶ r1 = r4.f3822     // Catch: java.lang.Throwable -> L61
            r1.getClass()     // Catch: java.lang.Throwable -> L61
            java.util.HashMap r1 = r1.f5383     // Catch: java.lang.Throwable -> L61
            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> L61
            if (r3 == r2) goto L46
            goto L49
        L46:
            r1.remove(r0)     // Catch: java.lang.Throwable -> L61
        L49:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L53
        L4a:
            boolean r4 = r3.f3048     // Catch: java.lang.Throwable -> L53
            if (r4 != 0) goto L55
            boolean r4 = r3.f3040     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L64
            goto L55
        L53:
            r4 = move-exception
            goto L66
        L55:
            java.util.concurrent.atomic.AtomicInteger r4 = r3.f3034     // Catch: java.lang.Throwable -> L53
            int r4 = r4.get()     // Catch: java.lang.Throwable -> L53
            if (r4 != 0) goto L64
            r3.m1429()     // Catch: java.lang.Throwable -> L53
            goto L64
        L61:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L61
            throw r0     // Catch: java.lang.Throwable -> L53
        L64:
            monitor-exit(r3)
            return
        L66:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L53
            throw r4
    }
}
