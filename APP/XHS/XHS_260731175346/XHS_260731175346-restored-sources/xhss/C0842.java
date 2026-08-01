package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛲᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0842 implements xhss.InterfaceC0102 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final boolean f2726;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0338 f2727;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0741 f2728;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public boolean f2729;

    public C0842(xhss.C0741 r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f2728 = r1
            r0.f2726 = r2
            xhss.ᛴᛲᛴᛶ r1 = new xhss.ᛴᛲᛴᛶ
            r1.<init>()
            r0.f2727 = r1
            return
    }

    @Override // xhss.InterfaceC0102, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
            r13 = this;
            xhss.ᛸᛳᛴ r1 = r13.f2728
            java.util.TimeZone r0 = xhss.AbstractC0559.f1984
            monitor-enter(r1)
            boolean r0 = r13.f2729     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto Lb
            monitor-exit(r1)
            return
        Lb:
            int r0 = r1.m1283()     // Catch: java.lang.Throwable -> L5b
            r2 = 1
            if (r0 != 0) goto L14
            r0 = r2
            goto L15
        L14:
            r0 = 0
        L15:
            monitor-exit(r1)
            xhss.ᛸᛳᛴ r1 = r13.f2728
            xhss.ᲀᛲᲀᲁ r3 = r1.f2485
            boolean r3 = r3.f2726
            if (r3 != 0) goto L41
            xhss.ᛴᛲᛴᛶ r3 = r13.f2727
            long r3 = r3.f1261
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L34
        L28:
            xhss.ᛴᛲᛴᛶ r0 = r13.f2727
            long r0 = r0.f1261
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L41
            r13.m1420(r2)
            goto L28
        L34:
            if (r0 == 0) goto L41
            xhss.ᲁᛲᛵ r7 = r1.f2479
            int r8 = r1.f2478
            r10 = 0
            r11 = 0
            r9 = 1
            r7.m1522(r8, r9, r10, r11)
        L41:
            xhss.ᛸᛳᛴ r1 = r13.f2728
            monitor-enter(r1)
            r13.f2729 = r2     // Catch: java.lang.Throwable -> L57
            r1.notifyAll()     // Catch: java.lang.Throwable -> L57
            monitor-exit(r1)
            xhss.ᛸᛳᛴ r0 = r13.f2728
            xhss.ᲁᛲᛵ r0 = r0.f2479
            r0.flush()
            xhss.ᛸᛳᛴ r13 = r13.f2728
            r13.m1281()
            return
        L57:
            r0 = move-exception
            r13 = r0
            monitor-exit(r1)
            throw r13
        L5b:
            r0 = move-exception
            r13 = r0
            monitor-exit(r1)
            throw r13
    }

    @Override // xhss.InterfaceC0102, java.io.Flushable
    public final void flush() {
            r4 = this;
            xhss.ᛸᛳᛴ r0 = r4.f2728
            java.util.TimeZone r1 = xhss.AbstractC0559.f1984
            monitor-enter(r0)
            r0.m1279()     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)
        L9:
            xhss.ᛴᛲᛴᛶ r0 = r4.f2727
            long r0 = r0.f1261
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1f
            r0 = 0
            r4.m1420(r0)
            xhss.ᛸᛳᛴ r0 = r4.f2728
            xhss.ᲁᛲᛵ r0 = r0.f2479
            r0.flush()
            goto L9
        L1f:
            return
        L20:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m1420(boolean r13) {
            r12 = this;
            xhss.ᛸᛳᛴ r1 = r12.f2728
            monitor-enter(r1)
            xhss.ᛵᛴᲇ r0 = r1.f2481     // Catch: java.lang.Throwable -> L59
            r0.m1893()     // Catch: java.lang.Throwable -> L59
        L8:
            long r2 = r1.f2480     // Catch: java.lang.Throwable -> L2f
            long r4 = r1.f2488     // Catch: java.lang.Throwable -> L2f
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L32
            boolean r0 = r12.f2726     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L32
            boolean r0 = r12.f2729     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L32
            int r0 = r1.m1283()     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L32
            r1.wait()     // Catch: java.lang.InterruptedException -> L22 java.lang.Throwable -> L2f
            goto L8
        L22:
            java.lang.Thread r12 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2f
            r12.interrupt()     // Catch: java.lang.Throwable -> L2f
            java.io.InterruptedIOException r12 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2f
            r12.<init>()     // Catch: java.lang.Throwable -> L2f
            throw r12     // Catch: java.lang.Throwable -> L2f
        L2f:
            r0 = move-exception
            r12 = r0
            goto L83
        L32:
            xhss.ᛵᛴᲇ r0 = r1.f2481     // Catch: java.lang.Throwable -> L59
            r0.m852()     // Catch: java.lang.Throwable -> L59
            r1.m1279()     // Catch: java.lang.Throwable -> L59
            long r2 = r1.f2488     // Catch: java.lang.Throwable -> L59
            long r4 = r1.f2480     // Catch: java.lang.Throwable -> L59
            long r2 = r2 - r4
            xhss.ᛴᛲᛴᛶ r0 = r12.f2727     // Catch: java.lang.Throwable -> L59
            long r4 = r0.f1261     // Catch: java.lang.Throwable -> L59
            long r10 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L59
            long r2 = r1.f2480     // Catch: java.lang.Throwable -> L59
            long r2 = r2 + r10
            r1.f2480 = r2     // Catch: java.lang.Throwable -> L59
            if (r13 == 0) goto L5c
            xhss.ᛴᛲᛴᛶ r13 = r12.f2727     // Catch: java.lang.Throwable -> L59
            long r2 = r13.f1261     // Catch: java.lang.Throwable -> L59
            int r13 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r13 != 0) goto L5c
            r13 = 1
        L57:
            r8 = r13
            goto L5e
        L59:
            r0 = move-exception
            r12 = r0
            goto L89
        L5c:
            r13 = 0
            goto L57
        L5e:
            monitor-exit(r1)
            xhss.ᛸᛳᛴ r13 = r12.f2728
            xhss.ᛵᛴᲇ r13 = r13.f2481
            r13.m1893()
            xhss.ᛸᛳᛴ r13 = r12.f2728     // Catch: java.lang.Throwable -> L79
            xhss.ᲁᛲᛵ r6 = r13.f2479     // Catch: java.lang.Throwable -> L79
            int r7 = r13.f2478     // Catch: java.lang.Throwable -> L79
            xhss.ᛴᛲᛴᛶ r9 = r12.f2727     // Catch: java.lang.Throwable -> L79
            r6.m1522(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L79
            xhss.ᛸᛳᛴ r12 = r12.f2728
            xhss.ᛵᛴᲇ r12 = r12.f2481
            r12.m852()
            return
        L79:
            r0 = move-exception
            r13 = r0
            xhss.ᛸᛳᛴ r12 = r12.f2728
            xhss.ᛵᛴᲇ r12 = r12.f2481
            r12.m852()
            throw r13
        L83:
            xhss.ᛵᛴᲇ r13 = r1.f2481     // Catch: java.lang.Throwable -> L59
            r13.m852()     // Catch: java.lang.Throwable -> L59
            throw r12     // Catch: java.lang.Throwable -> L59
        L89:
            monitor-exit(r1)
            throw r12
    }

    @Override // xhss.InterfaceC0102
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public final void mo228(long r4, xhss.C0338 r6) {
            r3 = this;
            java.util.TimeZone r0 = xhss.AbstractC0559.f1984
            xhss.ᛴᛲᛴᛶ r0 = r3.f2727
            r0.mo228(r4, r6)
        L7:
            long r4 = r0.f1261
            r1 = 16384(0x4000, double:8.095E-320)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 < 0) goto L14
            r4 = 0
            r3.m1420(r4)
            goto L7
        L14:
            return
    }

    @Override // xhss.InterfaceC0102
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final xhss.C0213 mo229() {
            r0 = this;
            xhss.ᛸᛳᛴ r0 = r0.f2728
            xhss.ᛵᛴᲇ r0 = r0.f2481
            return r0
    }
}
