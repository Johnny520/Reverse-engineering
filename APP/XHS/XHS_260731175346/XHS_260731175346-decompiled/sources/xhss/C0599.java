package xhss;

/* JADX INFO: renamed from: xhss.ᛶᲇᛳᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0599 implements xhss.InterfaceC0521 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0946 f2071;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0723 f2072;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final java.util.concurrent.CopyOnWriteArrayList f2073;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public long f2074;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final java.util.concurrent.LinkedBlockingDeque f2075;

    public C0599(xhss.C0946 r1, xhss.C0723 r2) {
            r0 = this;
            r0.<init>()
            r0.f2071 = r1
            r0.f2072 = r2
            r1 = -9223372036854775808
            r0.f2074 = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r0.f2073 = r1
            java.util.concurrent.LinkedBlockingDeque r1 = new java.util.concurrent.LinkedBlockingDeque
            r1.<init>()
            r0.f2075 = r1
            return
    }

    @Override // xhss.InterfaceC0521
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final xhss.C0946 mo929() {
            r0 = this;
            xhss.ᲁᛴᛶᛸ r0 = r0.f2071
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final void m1052() {
            r4 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.f2073
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r1.next()
            xhss.ᛱᛸᲁᛶ r2 = (xhss.InterfaceC0080) r2
            r2.cancel()
            xhss.ᛱᛸᲁᛶ r2 = r2.mo240()
            if (r2 != 0) goto L1c
            goto L6
        L1c:
            xhss.ᲁᛴᛶᛸ r3 = r4.f2071
            xhss.ᛸᲀᛷᛷ r3 = r3.f3069
            r3.addLast(r2)
            goto L6
        L24:
            r0.clear()
            return
    }

    @Override // xhss.InterfaceC0521
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final xhss.C1184 mo930() {
            r8 = this;
            r0 = 0
            r1 = r0
        L2:
            java.util.concurrent.CopyOnWriteArrayList r2 = r8.f2073     // Catch: java.lang.Throwable -> L17
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L1a
            xhss.ᲁᛴᛶᛸ r2 = r8.f2071     // Catch: java.lang.Throwable -> L17
            boolean r2 = r2.m1542(r0)     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L13
            goto L1a
        L13:
            r8.m1052()
            throw r1
        L17:
            r0 = move-exception
            goto Lc4
        L1a:
            xhss.ᲁᛴᛶᛸ r2 = r8.f2071     // Catch: java.lang.Throwable -> L17
            xhss.ᛸᲇᲇᛶ r2 = r2.f3081     // Catch: java.lang.Throwable -> L17
            boolean r2 = r2.f2667     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto Lbc
            long r2 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L17
            long r4 = r8.f2074     // Catch: java.lang.Throwable -> L17
            long r4 = r4 - r2
            java.util.concurrent.CopyOnWriteArrayList r6 = r8.f2073     // Catch: java.lang.Throwable -> L17
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r6 != 0) goto L3b
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 > 0) goto L38
            goto L3b
        L38:
            r5 = r4
            r4 = r0
            goto L45
        L3b:
            xhss.ᛲᛷᛷᛵ r4 = r8.m1053()     // Catch: java.lang.Throwable -> L17
            r5 = 250000000(0xee6b280, double:1.235164115E-315)
            long r2 = r2 + r5
            r8.f2074 = r2     // Catch: java.lang.Throwable -> L17
        L45:
            if (r4 != 0) goto L67
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.CopyOnWriteArrayList r3 = r8.f2073     // Catch: java.lang.Throwable -> L17
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L53
        L51:
            r4 = r0
            goto L64
        L53:
            java.util.concurrent.LinkedBlockingDeque r4 = r8.f2075     // Catch: java.lang.Throwable -> L17
            java.lang.Object r2 = r4.poll(r5, r2)     // Catch: java.lang.Throwable -> L17
            xhss.ᛲᛷᛷᛵ r2 = (xhss.C0190) r2     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L5e
            goto L51
        L5e:
            xhss.ᛱᛸᲁᛶ r4 = r2.f747     // Catch: java.lang.Throwable -> L17
            r3.remove(r4)     // Catch: java.lang.Throwable -> L17
            r4 = r2
        L64:
            if (r4 != 0) goto L67
            goto L2
        L67:
            xhss.ᛱᛸᲁᛶ r2 = r4.f745     // Catch: java.lang.Throwable -> L17
            r3 = 0
            r5 = 1
            if (r2 != 0) goto L73
            java.lang.Throwable r2 = r4.f746     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L73
            r2 = r5
            goto L74
        L73:
            r2 = r3
        L74:
            if (r2 == 0) goto L9c
            r8.m1052()     // Catch: java.lang.Throwable -> L17
            xhss.ᛱᛸᲁᛶ r2 = r4.f747     // Catch: java.lang.Throwable -> L17
            boolean r2 = r2.mo242()     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L87
            xhss.ᛱᛸᲁᛶ r2 = r4.f747     // Catch: java.lang.Throwable -> L17
            xhss.ᛲᛷᛷᛵ r4 = r2.mo238()     // Catch: java.lang.Throwable -> L17
        L87:
            xhss.ᛱᛸᲁᛶ r2 = r4.f745     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L90
            java.lang.Throwable r2 = r4.f746     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L90
            r3 = r5
        L90:
            if (r3 == 0) goto L9c
            xhss.ᛱᛸᲁᛶ r0 = r4.f747     // Catch: java.lang.Throwable -> L17
            xhss.ᲈᲁᛲᲇ r0 = r0.mo239()     // Catch: java.lang.Throwable -> L17
            r8.m1052()
            return r0
        L9c:
            java.lang.Throwable r2 = r4.f746     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto Laf
            boolean r3 = r2 instanceof java.io.IOException     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto Lae
            if (r1 != 0) goto Laa
            java.io.IOException r2 = (java.io.IOException) r2     // Catch: java.lang.Throwable -> L17
            r1 = r2
            goto Laf
        Laa:
            xhss.AbstractC1178.m1874(r1, r2)     // Catch: java.lang.Throwable -> L17
            goto Laf
        Lae:
            throw r2     // Catch: java.lang.Throwable -> L17
        Laf:
            xhss.ᛱᛸᲁᛶ r2 = r4.f745     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L2
            xhss.ᲁᛴᛶᛸ r3 = r8.f2071     // Catch: java.lang.Throwable -> L17
            xhss.ᛸᲀᛷᛷ r3 = r3.f3069     // Catch: java.lang.Throwable -> L17
            r3.addFirst(r2)     // Catch: java.lang.Throwable -> L17
            goto L2
        Lbc:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17
            throw r0     // Catch: java.lang.Throwable -> L17
        Lc4:
            r8.m1052()
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.C0190 m1053() {
            r7 = this;
            xhss.ᲁᛴᛶᛸ r0 = r7.f2071
            r1 = 0
            boolean r2 = r0.m1542(r1)
            if (r2 == 0) goto L5e
            xhss.ᛱᛸᲁᛶ r2 = r0.m1540()     // Catch: java.lang.Throwable -> Le
            goto L15
        Le:
            r2 = move-exception
            xhss.ᛳᲁᛶᛳ r3 = new xhss.ᛳᲁᛶᛳ
            r3.<init>(r2)
            r2 = r3
        L15:
            boolean r3 = r2.mo242()
            if (r3 == 0) goto L22
            xhss.ᛲᛷᛷᛵ r7 = new xhss.ᛲᛷᛷᛵ
            r0 = 6
            r7.<init>(r2, r1, r0)
            return r7
        L22:
            boolean r3 = r2 instanceof xhss.C0316
            if (r3 == 0) goto L2b
            xhss.ᛳᲁᛶᛳ r2 = (xhss.C0316) r2
            xhss.ᛲᛷᛷᛵ r7 = r2.f1198
            return r7
        L2b:
            java.util.concurrent.CopyOnWriteArrayList r3 = r7.f2073
            r3.add(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = xhss.AbstractC0559.f1983
            r3.append(r4)
            java.lang.String r4 = " connect "
            r3.append(r4)
            xhss.ᛵᲈᛱᛳ r0 = r0.f3073
            xhss.ᛷᛶᲁᛵ r0 = r0.f1924
            java.lang.String r0 = r0.m1159()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            xhss.ᛸᛱᛴᛳ r3 = r7.f2072
            xhss.ᲇᲀᲀᛷ r3 = r3.m1271()
            xhss.ᛸᛷᛱᲁ r4 = new xhss.ᛸᛷᛱᲁ
            r4.<init>(r0, r2, r7)
            r5 = 0
            r3.m1739(r4, r5)
        L5e:
            return r1
    }
}
