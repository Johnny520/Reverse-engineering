package xhss;

/* JADX INFO: renamed from: xhss.ᲇᲀᲀᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1081 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.String f3480;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public boolean f3481;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final java.util.ArrayList f3482;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0723 f3483;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public xhss.AbstractC0458 f3484;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public boolean f3485;

    public C1081(xhss.C0723 r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f3483 = r1
            r0.f3480 = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f3482 = r1
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static void m1738(xhss.C1081 r1, java.lang.String r2, xhss.InterfaceC0030 r3) {
            r1.getClass()
            xhss.ᛷᲀᲁᲇ r0 = new xhss.ᛷᲀᲁᲇ
            r0.<init>(r2, r3)
            r2 = 0
            r1.m1739(r0, r2)
            return
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.f3480
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final void m1739(xhss.AbstractC0458 r3, long r4) {
            r2 = this;
            xhss.ᛸᛱᛴᛳ r0 = r2.f3483
            monitor-enter(r0)
            boolean r1 = r2.f3481     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L34
            boolean r4 = r3.f1636     // Catch: java.lang.Throwable -> L1d
            xhss.ᛸᛱᛴᛳ r5 = r2.f3483
            java.util.logging.Logger r5 = r5.f2443
            if (r4 == 0) goto L21
            java.util.logging.Level r4 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L1d
            boolean r4 = r5.isLoggable(r4)     // Catch: java.lang.Throwable -> L1d
            if (r4 == 0) goto L1f
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            xhss.AbstractC1178.m1866(r5, r3, r2, r4)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r2 = move-exception
            goto L42
        L1f:
            monitor-exit(r0)
            return
        L21:
            java.util.logging.Level r4 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L1d
            boolean r4 = r5.isLoggable(r4)     // Catch: java.lang.Throwable -> L1d
            if (r4 == 0) goto L2e
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            xhss.AbstractC1178.m1866(r5, r3, r2, r4)     // Catch: java.lang.Throwable -> L1d
        L2e:
            java.util.concurrent.RejectedExecutionException r2 = new java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L1d
            r2.<init>()     // Catch: java.lang.Throwable -> L1d
            throw r2     // Catch: java.lang.Throwable -> L1d
        L34:
            r1 = 0
            boolean r3 = r2.m1742(r3, r4, r1)     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L40
            xhss.ᛸᛱᛴᛳ r3 = r2.f3483     // Catch: java.lang.Throwable -> L1d
            r3.m1268(r2)     // Catch: java.lang.Throwable -> L1d
        L40:
            monitor-exit(r0)
            return
        L42:
            monitor-exit(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final void m1740() {
            r2 = this;
            xhss.ᛸᛱᛴᛳ r0 = r2.f3483
            java.util.TimeZone r1 = xhss.AbstractC0559.f1984
            monitor-enter(r0)
            r1 = 1
            r2.f3481 = r1     // Catch: java.lang.Throwable -> L14
            boolean r1 = r2.m1741()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            xhss.ᛸᛱᛴᛳ r1 = r2.f3483     // Catch: java.lang.Throwable -> L14
            r1.m1268(r2)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r2 = move-exception
            goto L18
        L16:
            monitor-exit(r0)
            return
        L18:
            monitor-exit(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final boolean m1741() {
            r6 = this;
            xhss.ᛵᛳᲀᛲ r0 = r6.f3484
            r1 = 1
            if (r0 == 0) goto Lb
            boolean r0 = r0.f1636
            if (r0 == 0) goto Lb
            r6.f3485 = r1
        Lb:
            java.util.ArrayList r0 = r6.f3482
            int r2 = r0.size()
            int r2 = r2 - r1
            r3 = 0
        L13:
            r4 = -1
            if (r4 >= r2) goto L3e
            java.lang.Object r4 = r0.get(r2)
            xhss.ᛵᛳᲀᛲ r4 = (xhss.AbstractC0458) r4
            boolean r4 = r4.f1636
            if (r4 == 0) goto L3b
            xhss.ᛸᛱᛴᛳ r3 = r6.f3483
            java.util.logging.Logger r3 = r3.f2443
            java.lang.Object r4 = r0.get(r2)
            xhss.ᛵᛳᲀᛲ r4 = (xhss.AbstractC0458) r4
            java.util.logging.Level r5 = java.util.logging.Level.FINE
            boolean r5 = r3.isLoggable(r5)
            if (r5 == 0) goto L37
            java.lang.String r5 = "canceled"
            xhss.AbstractC1178.m1866(r3, r4, r6, r5)
        L37:
            r0.remove(r2)
            r3 = r1
        L3b:
            int r2 = r2 + (-1)
            goto L13
        L3e:
            return r3
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final boolean m1742(xhss.AbstractC0458 r12, long r13, boolean r15) {
            r11 = this;
            xhss.ᛸᛱᛴᛳ r0 = r11.f3483
            java.util.logging.Logger r0 = r0.f2443
            xhss.ᲇᲀᲀᛷ r1 = r12.f1637
            r2 = 0
            if (r1 != r11) goto La
            goto Le
        La:
            if (r1 != 0) goto L85
            r12.f1637 = r11
        Le:
            long r3 = java.lang.System.nanoTime()
            long r5 = r3 + r13
            java.util.ArrayList r1 = r11.f3482
            int r7 = r1.indexOf(r12)
            r8 = -1
            if (r7 == r8) goto L34
            long r9 = r12.f1639
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 > 0) goto L31
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r13 = r0.isLoggable(r13)
            if (r13 == 0) goto L84
            java.lang.String r13 = "already scheduled"
            xhss.AbstractC1178.m1866(r0, r12, r11, r13)
            return r2
        L31:
            r1.remove(r7)
        L34:
            r12.f1639 = r5
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            boolean r7 = r0.isLoggable(r7)
            if (r7 == 0) goto L5a
            if (r15 == 0) goto L4c
            long r5 = r5 - r3
            java.lang.String r15 = xhss.AbstractC1178.m1873(r5)
            java.lang.String r5 = "run again after "
            java.lang.String r15 = r5.concat(r15)
            goto L57
        L4c:
            long r5 = r5 - r3
            java.lang.String r15 = xhss.AbstractC1178.m1873(r5)
            java.lang.String r5 = "scheduled after "
            java.lang.String r15 = r5.concat(r15)
        L57:
            xhss.AbstractC1178.m1866(r0, r12, r11, r15)
        L5a:
            java.util.Iterator r11 = r1.iterator()
            r15 = r2
        L5f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r0 = r11.next()
            xhss.ᛵᛳᲀᛲ r0 = (xhss.AbstractC0458) r0
            long r5 = r0.f1639
            long r5 = r5 - r3
            int r0 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r0 <= 0) goto L73
            goto L77
        L73:
            int r15 = r15 + 1
            goto L5f
        L76:
            r15 = r8
        L77:
            if (r15 != r8) goto L7d
            int r15 = r1.size()
        L7d:
            r1.add(r15, r12)
            if (r15 != 0) goto L84
            r11 = 1
            return r11
        L84:
            return r2
        L85:
            java.lang.String r11 = "task is in multiple queues"
            xhss.C0532.m950(r11)
            return r2
    }
}
