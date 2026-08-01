package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛸᛵᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1066 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.InterfaceC0521 f3438;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.InterfaceC0666 f3439;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0819 f3440;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public boolean f3441;

    public C1066(xhss.C0819 r1, xhss.InterfaceC0521 r2, xhss.InterfaceC0666 r3) {
            r0 = this;
            r0.<init>()
            r0.f3440 = r1
            r0.f3438 = r2
            r0.f3439 = r3
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static java.io.IOException m1722(xhss.C1066 r11, boolean r12, java.io.IOException r13, int r14) {
            r0 = r14 & 4
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            r14 = r14 & 8
            if (r14 == 0) goto Lf
            r14 = r2
            goto L10
        Lf:
            r14 = r1
        L10:
            if (r13 == 0) goto L15
            r11.m1726(r13)
        L15:
            if (r14 == 0) goto L24
            xhss.ᛸᲇᲇᛶ r3 = r11.f3440
            xhss.ᲀᲀᛱᲇ r3 = r3.f2665
            if (r13 == 0) goto L21
            r3.getClass()
            goto L24
        L21:
            r3.getClass()
        L24:
            if (r0 == 0) goto L33
            xhss.ᛸᲇᲇᛶ r3 = r11.f3440
            xhss.ᲀᲀᛱᲇ r3 = r3.f2665
            if (r13 == 0) goto L30
            r3.getClass()
            goto L33
        L30:
            r3.getClass()
        L33:
            xhss.ᛸᲇᲇᛶ r4 = r11.f3440
            if (r14 == 0) goto L3b
            if (r12 != 0) goto L3b
            r6 = r1
            goto L3c
        L3b:
            r6 = r2
        L3c:
            if (r0 == 0) goto L42
            if (r12 != 0) goto L42
            r7 = r1
            goto L43
        L42:
            r7 = r2
        L43:
            if (r14 == 0) goto L49
            if (r12 == 0) goto L49
            r9 = r1
            goto L4a
        L49:
            r9 = r2
        L4a:
            if (r0 == 0) goto L52
            if (r12 == 0) goto L52
            r8 = r1
        L4f:
            r5 = r11
            r10 = r13
            goto L54
        L52:
            r8 = r2
            goto L4f
        L54:
            java.io.IOException r11 = r4.m1390(r5, r6, r7, r8, r9, r10)
            return r11
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C1184 m1723() {
            r2 = this;
            xhss.ᛷᛶᛷᛲ r2 = r2.f3439
            xhss.ᲀᲀᲁᛱ r2 = r2.mo638()
            boolean r0 = r2 instanceof xhss.C1184
            r1 = 0
            if (r0 == 0) goto Le
            xhss.ᲈᲁᛲᲇ r2 = (xhss.C1184) r2
            goto Lf
        Le:
            r2 = r1
        Lf:
            if (r2 == 0) goto L12
            return r2
        L12:
            java.lang.String r2 = "no connection for CONNECT tunnels"
            xhss.C0532.m950(r2)
            return r1
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0369 m1724(xhss.C0871 r9) {
            r8 = this;
            java.lang.String r0 = "Content-Type"
            xhss.ᲁᛸᛱᛵ r1 = r9.f2820     // Catch: java.io.IOException -> L2c
            java.lang.String r0 = r1.m1605(r0)     // Catch: java.io.IOException -> L2c
            if (r0 != 0) goto Lb
            r0 = 0
        Lb:
            xhss.ᛷᛶᛷᛲ r1 = r8.f3439     // Catch: java.io.IOException -> L2c
            long r5 = r1.mo634(r9)     // Catch: java.io.IOException -> L2c
            xhss.ᛷᛶᛷᛲ r1 = r8.f3439     // Catch: java.io.IOException -> L2c
            xhss.ᲇᲁᲀᲇ r4 = r1.mo639(r9)     // Catch: java.io.IOException -> L2c
            xhss.ᲀᛵᛶᲀ r2 = new xhss.ᲀᛵᛶᲀ     // Catch: java.io.IOException -> L2c
            r7 = 0
            r3 = r8
            r2.<init>(r3, r4, r5, r7)     // Catch: java.io.IOException -> L29
            xhss.ᛴᛵᲈᛸ r8 = new xhss.ᛴᛵᲈᛸ     // Catch: java.io.IOException -> L29
            xhss.ᲁᛸᛵᛳ r9 = new xhss.ᲁᛸᛵᛳ     // Catch: java.io.IOException -> L29
            r9.<init>(r2)     // Catch: java.io.IOException -> L29
            r8.<init>(r0, r5, r9)     // Catch: java.io.IOException -> L29
            return r8
        L29:
            r0 = move-exception
        L2a:
            r8 = r0
            goto L2f
        L2c:
            r0 = move-exception
            r3 = r8
            goto L2a
        L2f:
            xhss.ᛸᲇᲇᛶ r9 = r3.f3440
            xhss.ᲀᲀᛱᲇ r9 = r9.f2665
            r9.getClass()
            r3.m1726(r8)
            throw r8
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final xhss.C0230 m1725() {
            r3 = this;
            xhss.ᛸᲇᲇᛶ r0 = r3.f3440
            boolean r1 = r0.f2677
            if (r1 != 0) goto L65
            r1 = 1
            r0.f2677 = r1
            xhss.ᲈᲁᛶᛱ r2 = r0.f2675
            r2.m1892()
            monitor-enter(r0)
            xhss.ᲇᛸᛵᛴ r2 = r0.f2663     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L5b
            boolean r2 = r0.f2662     // Catch: java.lang.Throwable -> L41
            if (r2 != 0) goto L53
            boolean r2 = r0.f2664     // Catch: java.lang.Throwable -> L41
            if (r2 != 0) goto L53
            boolean r2 = r0.f2671     // Catch: java.lang.Throwable -> L41
            if (r2 != 0) goto L4b
            boolean r2 = r0.f2676     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L43
            r2 = 0
            r0.f2676 = r2     // Catch: java.lang.Throwable -> L41
            r0.f2662 = r1     // Catch: java.lang.Throwable -> L41
            r0.f2664 = r1     // Catch: java.lang.Throwable -> L41
            monitor-exit(r0)
            xhss.ᛷᛶᛷᛲ r0 = r3.f3439
            xhss.ᲀᲀᲁᛱ r0 = r0.mo638()
            xhss.ᲈᲁᛲᲇ r0 = (xhss.C1184) r0
            java.net.Socket r1 = r0.f3825
            r1.setSoTimeout(r2)
            r0.mo593()
            xhss.ᛳᛱᛲᲀ r0 = new xhss.ᛳᛱᛲᲀ
            r0.<init>(r3)
            return r0
        L41:
            r3 = move-exception
            goto L63
        L43:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = "Check failed."
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L41
            throw r3     // Catch: java.lang.Throwable -> L41
        L4b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = "Check failed."
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L41
            throw r3     // Catch: java.lang.Throwable -> L41
        L53:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = "Check failed."
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L41
            throw r3     // Catch: java.lang.Throwable -> L41
        L5b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = "Check failed."
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L41
            throw r3     // Catch: java.lang.Throwable -> L41
        L63:
            monitor-exit(r0)
            throw r3
        L65:
            java.lang.String r3 = "Check failed."
            xhss.C0532.m950(r3)
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final void m1726(java.io.IOException r2) {
            r1 = this;
            r0 = 1
            r1.f3441 = r0
            xhss.ᛷᛶᛷᛲ r0 = r1.f3439
            xhss.ᲀᲀᲁᛱ r0 = r0.mo638()
            xhss.ᛸᲇᲇᛶ r1 = r1.f3440
            r0.mo596(r1, r2)
            return
    }
}
