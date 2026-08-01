package defpackage;

/* JADX INFO: renamed from: ᲁᲈᲀᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1972 implements defpackage.InterfaceC2085 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f8552;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1569 f8553;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final boolean f8554;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1958 f8555;

    public C1972(defpackage.C1958 r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f8555 = r1
            r0.f8554 = r2
            ᛸᲁᛵ r1 = new ᛸᲁᛵ
            r1.<init>()
            r0.f8553 = r1
            return
    }

    @Override // defpackage.InterfaceC2085, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r13 = this;
            ᲁᲈᛲᛱ r1 = r13.f8555
            java.util.TimeZone r0 = defpackage.AbstractC0508.f2501
            monitor-enter(r1)
            boolean r0 = r13.f8552     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto Lb
            monitor-exit(r1)
            return
        Lb:
            int r0 = r1.m3381()     // Catch: java.lang.Throwable -> L5b
            r2 = 1
            if (r0 != 0) goto L14
            r0 = r2
            goto L15
        L14:
            r0 = 0
        L15:
            monitor-exit(r1)
            ᲁᲈᛲᛱ r1 = r13.f8555
            ᲁᲈᲀᲀ r3 = r1.f8511
            boolean r3 = r3.f8554
            if (r3 != 0) goto L41
            ᛸᲁᛵ r3 = r13.f8553
            long r3 = r3.f6928
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L34
        L28:
            ᛸᲁᛵ r0 = r13.f8553
            long r0 = r0.f6928
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L41
            r13.m3390(r2)
            goto L28
        L34:
            if (r0 == 0) goto L41
            ᲈᲈ r7 = r1.f8517
            int r8 = r1.f8518
            r10 = 0
            r11 = 0
            r9 = 1
            r7.m3860(r8, r9, r10, r11)
        L41:
            ᲁᲈᛲᛱ r1 = r13.f8555
            monitor-enter(r1)
            r13.f8552 = r2     // Catch: java.lang.Throwable -> L57
            r1.notifyAll()     // Catch: java.lang.Throwable -> L57
            monitor-exit(r1)
            ᲁᲈᛲᛱ r0 = r13.f8555
            ᲈᲈ r0 = r0.f8517
            r0.flush()
            ᲁᲈᛲᛱ r13 = r13.f8555
            r13.m3378()
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

    @Override // defpackage.InterfaceC2085, java.io.Flushable
    public final void flush() {
            r4 = this;
            ᲁᲈᛲᛱ r0 = r4.f8555
            java.util.TimeZone r1 = defpackage.AbstractC0508.f2501
            monitor-enter(r0)
            r0.m3380()     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)
        L9:
            ᛸᲁᛵ r0 = r4.f8553
            long r0 = r0.f6928
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1f
            r0 = 0
            r4.m3390(r0)
            ᲁᲈᛲᛱ r0 = r4.f8555
            ᲈᲈ r0 = r0.f8517
            r0.flush()
            goto L9
        L1f:
            return
        L20:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    @Override // defpackage.InterfaceC2085
    /* JADX INFO: renamed from: ᛴᛸᲈᲈ */
    public final void mo484(long r4, defpackage.C1569 r6) {
            r3 = this;
            java.util.TimeZone r0 = defpackage.AbstractC0508.f2501
            ᛸᲁᛵ r0 = r3.f8553
            r0.mo484(r4, r6)
        L7:
            long r4 = r0.f6928
            r1 = 16384(0x4000, double:8.095E-320)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 < 0) goto L14
            r4 = 0
            r3.m3390(r4)
            goto L7
        L14:
            return
    }

    @Override // defpackage.InterfaceC2085
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.C1077 mo485() {
            r0 = this;
            ᲁᲈᛲᛱ r0 = r0.f8555
            ᛶᛸᛲᛵ r0 = r0.f8516
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m3390(boolean r13) {
            r12 = this;
            ᲁᲈᛲᛱ r1 = r12.f8555
            monitor-enter(r1)
            ᛶᛸᛲᛵ r0 = r1.f8516     // Catch: java.lang.Throwable -> L59
            r0.m3418()     // Catch: java.lang.Throwable -> L59
        L8:
            long r2 = r1.f8521     // Catch: java.lang.Throwable -> L2f
            long r4 = r1.f8522     // Catch: java.lang.Throwable -> L2f
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L32
            boolean r0 = r12.f8554     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L32
            boolean r0 = r12.f8552     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L32
            int r0 = r1.m3381()     // Catch: java.lang.Throwable -> L2f
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
            ᛶᛸᛲᛵ r0 = r1.f8516     // Catch: java.lang.Throwable -> L59
            r0.m2142()     // Catch: java.lang.Throwable -> L59
            r1.m3380()     // Catch: java.lang.Throwable -> L59
            long r2 = r1.f8522     // Catch: java.lang.Throwable -> L59
            long r4 = r1.f8521     // Catch: java.lang.Throwable -> L59
            long r2 = r2 - r4
            ᛸᲁᛵ r0 = r12.f8553     // Catch: java.lang.Throwable -> L59
            long r4 = r0.f6928     // Catch: java.lang.Throwable -> L59
            long r10 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L59
            long r2 = r1.f8521     // Catch: java.lang.Throwable -> L59
            long r2 = r2 + r10
            r1.f8521 = r2     // Catch: java.lang.Throwable -> L59
            if (r13 == 0) goto L5c
            ᛸᲁᛵ r13 = r12.f8553     // Catch: java.lang.Throwable -> L59
            long r2 = r13.f6928     // Catch: java.lang.Throwable -> L59
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
            ᲁᲈᛲᛱ r13 = r12.f8555
            ᛶᛸᛲᛵ r13 = r13.f8516
            r13.m3418()
            ᲁᲈᛲᛱ r13 = r12.f8555     // Catch: java.lang.Throwable -> L79
            ᲈᲈ r6 = r13.f8517     // Catch: java.lang.Throwable -> L79
            int r7 = r13.f8518     // Catch: java.lang.Throwable -> L79
            ᛸᲁᛵ r9 = r12.f8553     // Catch: java.lang.Throwable -> L79
            r6.m3860(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L79
            ᲁᲈᛲᛱ r12 = r12.f8555
            ᛶᛸᛲᛵ r12 = r12.f8516
            r12.m2142()
            return
        L79:
            r0 = move-exception
            r13 = r0
            ᲁᲈᛲᛱ r12 = r12.f8555
            ᛶᛸᛲᛵ r12 = r12.f8516
            r12.m2142()
            throw r13
        L83:
            ᛶᛸᛲᛵ r13 = r1.f8516     // Catch: java.lang.Throwable -> L59
            r13.m2142()     // Catch: java.lang.Throwable -> L59
            throw r12     // Catch: java.lang.Throwable -> L59
        L89:
            monitor-exit(r1)
            throw r12
    }
}
