package xhss;

/* JADX INFO: renamed from: xhss.ᛱᲀᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0090 implements xhss.InterfaceC1095 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final long f439;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public boolean f440;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final xhss.C0338 f441;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0741 f442;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.C0338 f443;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public boolean f444;

    public C0090(xhss.C0741 r1, long r2, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f442 = r1
            r0.f439 = r2
            r0.f440 = r4
            xhss.ᛴᛲᛴᛶ r1 = new xhss.ᛴᛲᛴᛶ
            r1.<init>()
            r0.f443 = r1
            xhss.ᛴᛲᛴᛶ r1 = new xhss.ᛴᛲᛴᛶ
            r1.<init>()
            r0.f441 = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r4 = this;
            xhss.ᛸᛳᛴ r0 = r4.f442
            monitor-enter(r0)
            r1 = 1
            r4.f444 = r1     // Catch: java.lang.Throwable -> L26
            xhss.ᛴᛲᛴᛶ r1 = r4.f441     // Catch: java.lang.Throwable -> L26
            long r2 = r1.f1261     // Catch: java.lang.Throwable -> L26
            r1.m696(r2)     // Catch: java.lang.Throwable -> L26
            r0.notifyAll()     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L20
            xhss.ᛸᛳᛴ r0 = r4.f442
            java.util.TimeZone r1 = xhss.AbstractC0559.f1984
            xhss.ᲁᛲᛵ r0 = r0.f2479
            r0.m1523(r2)
        L20:
            xhss.ᛸᛳᛴ r4 = r4.f442
            r4.m1281()
            return
        L26:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    @Override // xhss.InterfaceC1095
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0213 mo250() {
            r0 = this;
            xhss.ᛸᛳᛴ r0 = r0.f442
            xhss.ᛵᛴᲇ r0 = r0.f2490
            return r0
    }

    @Override // xhss.InterfaceC1095
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public final long mo235(long r22, xhss.C0338 r24) {
            r21 = this;
            r0 = r21
        L2:
            xhss.ᛸᛳᛴ r1 = r0.f442
            monitor-enter(r1)
            xhss.ᲁᛲᛵ r2 = r1.f2479     // Catch: java.lang.Throwable -> L22
            r2.getClass()     // Catch: java.lang.Throwable -> L22
            xhss.ᲀᛲᲀᲁ r2 = r1.f2485     // Catch: java.lang.Throwable -> L22
            boolean r3 = r2.f2729     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L19
            boolean r2 = r2.f2726     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L17
            goto L19
        L17:
            r2 = r5
            goto L1a
        L19:
            r2 = r4
        L1a:
            if (r2 == 0) goto L25
            xhss.ᛵᛴᲇ r3 = r1.f2490     // Catch: java.lang.Throwable -> L22
            r3.m1893()     // Catch: java.lang.Throwable -> L22
            goto L25
        L22:
            r0 = move-exception
            goto Le2
        L25:
            int r3 = r1.m1283()     // Catch: java.lang.Throwable -> L3d
            if (r3 == 0) goto L40
            boolean r3 = r0.f440     // Catch: java.lang.Throwable -> L3d
            if (r3 != 0) goto L40
            java.io.IOException r3 = r1.f2489     // Catch: java.lang.Throwable -> L3d
            if (r3 != 0) goto L41
            xhss.ᛱᲁᛲᛱ r3 = new xhss.ᛱᲁᛲᛱ     // Catch: java.lang.Throwable -> L3d
            int r6 = r1.m1283()     // Catch: java.lang.Throwable -> L3d
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L3d
            goto L41
        L3d:
            r0 = move-exception
            goto Lda
        L40:
            r3 = 0
        L41:
            boolean r6 = r0.f444     // Catch: java.lang.Throwable -> L3d
            if (r6 != 0) goto Ld2
            xhss.ᛴᛲᛴᛶ r6 = r0.f441     // Catch: java.lang.Throwable -> L3d
            long r7 = r6.f1261     // Catch: java.lang.Throwable -> L3d
            r9 = 0
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 <= 0) goto L94
            r12 = 8192(0x2000, double:4.0474E-320)
            long r7 = java.lang.Math.min(r12, r7)     // Catch: java.lang.Throwable -> L3d
            r9 = r24
            long r13 = r6.mo235(r7, r9)     // Catch: java.lang.Throwable -> L3d
            xhss.ᲈᛳᛷᲀ r12 = r1.f2487     // Catch: java.lang.Throwable -> L3d
            r15 = 0
            r17 = 2
            xhss.C1132.m1824(r12, r13, r15, r17)     // Catch: java.lang.Throwable -> L3d
            xhss.ᲈᛳᛷᲀ r4 = r1.f2487     // Catch: java.lang.Throwable -> L3d
            long r6 = r4.m1825()     // Catch: java.lang.Throwable -> L3d
            if (r3 != 0) goto L90
            xhss.ᲁᛲᛵ r4 = r1.f2479     // Catch: java.lang.Throwable -> L3d
            xhss.ᛴᲇᛳᲇ r4 = r4.f2997     // Catch: java.lang.Throwable -> L3d
            int r4 = r4.m805()     // Catch: java.lang.Throwable -> L3d
            int r4 = r4 / 2
            r22 = -1
            long r10 = (long) r4     // Catch: java.lang.Throwable -> L3d
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 < 0) goto L92
            xhss.ᲁᛲᛵ r4 = r1.f2479     // Catch: java.lang.Throwable -> L3d
            int r8 = r1.f2478     // Catch: java.lang.Throwable -> L3d
            r4.m1527(r6, r8)     // Catch: java.lang.Throwable -> L3d
            xhss.ᲈᛳᛷᲀ r15 = r1.f2487     // Catch: java.lang.Throwable -> L3d
            r16 = 0
            r20 = 1
            r18 = r6
            xhss.C1132.m1824(r15, r16, r18, r20)     // Catch: java.lang.Throwable -> L3d
            goto L92
        L90:
            r22 = -1
        L92:
            r4 = r5
            goto Lb4
        L94:
            r9 = r24
            r22 = -1
            boolean r6 = r0.f440     // Catch: java.lang.Throwable -> L3d
            if (r6 != 0) goto Lb1
            if (r3 != 0) goto Lb1
            r1.wait()     // Catch: java.lang.Throwable -> L3d java.lang.InterruptedException -> La4
            r13 = r22
            goto Lb4
        La4:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L3d
            r0.interrupt()     // Catch: java.lang.Throwable -> L3d
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L3d
            r0.<init>()     // Catch: java.lang.Throwable -> L3d
            throw r0     // Catch: java.lang.Throwable -> L3d
        Lb1:
            r13 = r22
            goto L92
        Lb4:
            if (r2 == 0) goto Lbb
            xhss.ᛵᛴᲇ r2 = r1.f2490     // Catch: java.lang.Throwable -> L22
            r2.m852()     // Catch: java.lang.Throwable -> L22
        Lbb:
            monitor-exit(r1)
            xhss.ᛸᛳᛴ r1 = r0.f442
            xhss.ᲁᛲᛵ r1 = r1.f2479
            xhss.ᛵᛷᛷᲀ r1 = r1.f3000
            r1.getClass()
            if (r4 == 0) goto Lc9
            goto L2
        Lc9:
            int r0 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r0 == 0) goto Lce
            return r13
        Lce:
            if (r3 != 0) goto Ld1
            return r22
        Ld1:
            throw r3
        Ld2:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L3d
            java.lang.String r3 = "stream closed"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L3d
            throw r0     // Catch: java.lang.Throwable -> L3d
        Lda:
            if (r2 == 0) goto Le1
            xhss.ᛵᛴᲇ r2 = r1.f2490     // Catch: java.lang.Throwable -> L22
            r2.m852()     // Catch: java.lang.Throwable -> L22
        Le1:
            throw r0     // Catch: java.lang.Throwable -> L22
        Le2:
            monitor-exit(r1)
            throw r0
    }
}
