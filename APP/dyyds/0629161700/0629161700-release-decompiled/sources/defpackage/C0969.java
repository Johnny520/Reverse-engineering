package defpackage;

/* JADX INFO: renamed from: ᛵᲁᛵᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0969 implements defpackage.InterfaceC2182 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1958 f4321;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C1569 f4322;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f4323;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final long f4324;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C1569 f4325;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public boolean f4326;

    public C0969(defpackage.C1958 r1, long r2, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f4321 = r1
            r0.f4324 = r2
            r0.f4323 = r4
            ᛸᲁᛵ r1 = new ᛸᲁᛵ
            r1.<init>()
            r0.f4322 = r1
            ᛸᲁᛵ r1 = new ᛸᲁᛵ
            r1.<init>()
            r0.f4325 = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r4 = this;
            ᲁᲈᛲᛱ r0 = r4.f4321
            monitor-enter(r0)
            r1 = 1
            r4.f4326 = r1     // Catch: java.lang.Throwable -> L26
            ᛸᲁᛵ r1 = r4.f4325     // Catch: java.lang.Throwable -> L26
            long r2 = r1.f6928     // Catch: java.lang.Throwable -> L26
            r1.m2847(r2)     // Catch: java.lang.Throwable -> L26
            r0.notifyAll()     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L20
            ᲁᲈᛲᛱ r0 = r4.f4321
            java.util.TimeZone r1 = defpackage.AbstractC0508.f2501
            ᲈᲈ r0 = r0.f8517
            r0.m3857(r2)
        L20:
            ᲁᲈᛲᛱ r4 = r4.f4321
            r4.m3378()
            return
        L26:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    @Override // defpackage.InterfaceC2182
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.C1077 mo1707() {
            r0 = this;
            ᲁᲈᛲᛱ r0 = r0.f4321
            ᛶᛸᛲᛵ r0 = r0.f8512
            return r0
    }

    @Override // defpackage.InterfaceC2182
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final long mo782(long r22, defpackage.C1569 r24) {
            r21 = this;
            r0 = r21
        L2:
            ᲁᲈᛲᛱ r1 = r0.f4321
            monitor-enter(r1)
            ᲈᲈ r2 = r1.f8517     // Catch: java.lang.Throwable -> L22
            r2.getClass()     // Catch: java.lang.Throwable -> L22
            ᲁᲈᲀᲀ r2 = r1.f8511     // Catch: java.lang.Throwable -> L22
            boolean r3 = r2.f8552     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L19
            boolean r2 = r2.f8554     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L17
            goto L19
        L17:
            r2 = r5
            goto L1a
        L19:
            r2 = r4
        L1a:
            if (r2 == 0) goto L25
            ᛶᛸᛲᛵ r3 = r1.f8512     // Catch: java.lang.Throwable -> L22
            r3.m3418()     // Catch: java.lang.Throwable -> L22
            goto L25
        L22:
            r0 = move-exception
            goto Le2
        L25:
            int r3 = r1.m3381()     // Catch: java.lang.Throwable -> L3d
            if (r3 == 0) goto L40
            boolean r3 = r0.f4323     // Catch: java.lang.Throwable -> L3d
            if (r3 != 0) goto L40
            java.io.IOException r3 = r1.f8514     // Catch: java.lang.Throwable -> L3d
            if (r3 != 0) goto L41
            ᛳᛸᲁᲈ r3 = new ᛳᛸᲁᲈ     // Catch: java.lang.Throwable -> L3d
            int r6 = r1.m3381()     // Catch: java.lang.Throwable -> L3d
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L3d
            goto L41
        L3d:
            r0 = move-exception
            goto Lda
        L40:
            r3 = 0
        L41:
            boolean r6 = r0.f4326     // Catch: java.lang.Throwable -> L3d
            if (r6 != 0) goto Ld2
            ᛸᲁᛵ r6 = r0.f4325     // Catch: java.lang.Throwable -> L3d
            long r7 = r6.f6928     // Catch: java.lang.Throwable -> L3d
            r9 = 0
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 <= 0) goto L94
            r12 = 8192(0x2000, double:4.0474E-320)
            long r7 = java.lang.Math.min(r12, r7)     // Catch: java.lang.Throwable -> L3d
            r9 = r24
            long r13 = r6.mo782(r7, r9)     // Catch: java.lang.Throwable -> L3d
            ᲁᛳᛸᲈ r12 = r1.f8515     // Catch: java.lang.Throwable -> L3d
            r15 = 0
            r17 = 2
            defpackage.C1835.m3228(r12, r13, r15, r17)     // Catch: java.lang.Throwable -> L3d
            ᲁᛳᛸᲈ r4 = r1.f8515     // Catch: java.lang.Throwable -> L3d
            long r6 = r4.m3230()     // Catch: java.lang.Throwable -> L3d
            if (r3 != 0) goto L90
            ᲈᲈ r4 = r1.f8517     // Catch: java.lang.Throwable -> L3d
            ᛴᛶᛳᛷ r4 = r4.f10213     // Catch: java.lang.Throwable -> L3d
            int r4 = r4.m1574()     // Catch: java.lang.Throwable -> L3d
            int r4 = r4 / 2
            r22 = -1
            long r10 = (long) r4     // Catch: java.lang.Throwable -> L3d
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 < 0) goto L92
            ᲈᲈ r4 = r1.f8517     // Catch: java.lang.Throwable -> L3d
            int r8 = r1.f8518     // Catch: java.lang.Throwable -> L3d
            r4.m3862(r6, r8)     // Catch: java.lang.Throwable -> L3d
            ᲁᛳᛸᲈ r15 = r1.f8515     // Catch: java.lang.Throwable -> L3d
            r16 = 0
            r20 = 1
            r18 = r6
            defpackage.C1835.m3228(r15, r16, r18, r20)     // Catch: java.lang.Throwable -> L3d
            goto L92
        L90:
            r22 = -1
        L92:
            r4 = r5
            goto Lb4
        L94:
            r9 = r24
            r22 = -1
            boolean r6 = r0.f4323     // Catch: java.lang.Throwable -> L3d
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
            ᛶᛸᛲᛵ r2 = r1.f8512     // Catch: java.lang.Throwable -> L22
            r2.m2142()     // Catch: java.lang.Throwable -> L22
        Lbb:
            monitor-exit(r1)
            ᲁᲈᛲᛱ r1 = r0.f4321
            ᲈᲈ r1 = r1.f8517
            ᲁᛲᲈᛱ r1 = r1.f10225
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
            ᛶᛸᛲᛵ r2 = r1.f8512     // Catch: java.lang.Throwable -> L22
            r2.m2142()     // Catch: java.lang.Throwable -> L22
        Le1:
            throw r0     // Catch: java.lang.Throwable -> L22
        Le2:
            monitor-exit(r1)
            throw r0
    }
}
