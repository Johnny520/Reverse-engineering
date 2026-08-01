package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛱᛴᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0723 {

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public static final xhss.C0723 f2441 = null;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public static final java.util.logging.Logger f2442 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.util.logging.Logger f2443;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public int f2444;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public long f2445;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C1037 f2446;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final java.util.ArrayList f2447;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final java.util.ArrayList f2448;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final xhss.RunnableC0432 f2449;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public int f2450;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public boolean f2451;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public int f2452;

    static {
            java.lang.Class<xhss.ᛸᛱᛴᛳ> r0 = xhss.C0723.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            xhss.C0723.f2442 = r0
            xhss.ᛸᛱᛴᛳ r0 = new xhss.ᛸᛱᛴᛳ
            xhss.ᲇᛵᛲᲁ r1 = new xhss.ᲇᛵᛲᲁ
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = xhss.AbstractC0559.f1983
            r2.append(r3)
            java.lang.String r3 = " TaskRunner"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            xhss.ᛸᛴᲇᛵ r3 = new xhss.ᛸᛴᲇᛵ
            r4 = 1
            r3.<init>(r2, r4)
            r1.<init>(r3)
            r0.<init>(r1)
            xhss.C0723.f2441 = r0
            return
    }

    public C0723(xhss.C1037 r2) {
            r1 = this;
            r1.<init>()
            r1.f2446 = r2
            java.util.logging.Logger r2 = xhss.C0723.f2442
            r1.f2443 = r2
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.f2444 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f2448 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f2447 = r2
            xhss.ᛴᲈᲀᲇ r2 = new xhss.ᛴᲈᲀᲇ
            r0 = 6
            r2.<init>(r0, r1)
            r1.f2449 = r2
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.AbstractC0458 m1267() {
            r17 = this;
            r1 = r17
            java.util.TimeZone r0 = xhss.AbstractC0559.f1984
        L4:
            java.util.ArrayList r0 = r1.f2447
            boolean r2 = r0.isEmpty()
            r3 = 0
            if (r2 == 0) goto Lf
            goto L83
        Lf:
            long r4 = java.lang.System.nanoTime()
            java.util.Iterator r2 = r0.iterator()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8 = r3
        L1d:
            boolean r9 = r2.hasNext()
            r10 = 1
            r11 = 0
            r13 = 0
            if (r9 == 0) goto L4b
            java.lang.Object r9 = r2.next()
            xhss.ᲇᲀᲀᛷ r9 = (xhss.C1081) r9
            java.util.ArrayList r9 = r9.f3482
            java.lang.Object r9 = r9.get(r13)
            xhss.ᛵᛳᲀᛲ r9 = (xhss.AbstractC0458) r9
            long r14 = r9.f1639
            long r14 = r14 - r4
            long r14 = java.lang.Math.max(r11, r14)
            int r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r16 <= 0) goto L45
            long r6 = java.lang.Math.min(r14, r6)
            goto L1d
        L45:
            if (r8 == 0) goto L49
            r2 = r10
            goto L4c
        L49:
            r8 = r9
            goto L1d
        L4b:
            r2 = r13
        L4c:
            java.util.ArrayList r9 = r1.f2448
            if (r8 == 0) goto L75
            java.util.TimeZone r3 = xhss.AbstractC0559.f1984
            r3 = -1
            r8.f1639 = r3
            xhss.ᲇᲀᲀᛷ r3 = r8.f1637
            java.util.ArrayList r4 = r3.f3482
            r4.remove(r8)
            r0.remove(r3)
            r3.f3484 = r8
            r9.add(r3)
            if (r2 != 0) goto L71
            boolean r2 = r1.f2451
            if (r2 != 0) goto L74
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L74
        L71:
            r1.m1269()
        L74:
            return r8
        L75:
            boolean r2 = r1.f2451
            if (r2 == 0) goto L84
            long r8 = r1.f2445
            long r8 = r8 - r4
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L83
            r1.notify()
        L83:
            return r3
        L84:
            r1.f2451 = r10
            long r4 = r4 + r6
            r1.f2445 = r4
            java.util.TimeZone r2 = xhss.AbstractC0559.f1984     // Catch: java.lang.Throwable -> La1 java.lang.InterruptedException -> La7
            int r2 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r2 <= 0) goto La3
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r14 = r6 / r3
            long r3 = r3 * r14
            long r6 = r6 - r3
            int r3 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r3 > 0) goto L9c
            if (r2 <= 0) goto La3
        L9c:
            int r2 = (int) r6     // Catch: java.lang.Throwable -> La1 java.lang.InterruptedException -> La7
            r1.wait(r14, r2)     // Catch: java.lang.Throwable -> La1 java.lang.InterruptedException -> La7
            goto La3
        La1:
            r0 = move-exception
            goto Ldb
        La3:
            r1.f2451 = r13
            goto L4
        La7:
            java.util.TimeZone r2 = xhss.AbstractC0559.f1984     // Catch: java.lang.Throwable -> La1
            int r2 = r9.size()     // Catch: java.lang.Throwable -> La1
            int r2 = r2 - r10
        Lae:
            r3 = -1
            if (r3 >= r2) goto Lbd
            java.lang.Object r3 = r9.get(r2)     // Catch: java.lang.Throwable -> La1
            xhss.ᲇᲀᲀᛷ r3 = (xhss.C1081) r3     // Catch: java.lang.Throwable -> La1
            r3.m1741()     // Catch: java.lang.Throwable -> La1
            int r2 = r2 + (-1)
            goto Lae
        Lbd:
            int r2 = r0.size()     // Catch: java.lang.Throwable -> La1
            int r2 = r2 - r10
        Lc2:
            if (r3 >= r2) goto La3
            java.lang.Object r4 = r0.get(r2)     // Catch: java.lang.Throwable -> La1
            xhss.ᲇᲀᲀᛷ r4 = (xhss.C1081) r4     // Catch: java.lang.Throwable -> La1
            r4.m1741()     // Catch: java.lang.Throwable -> La1
            java.util.ArrayList r4 = r4.f3482     // Catch: java.lang.Throwable -> La1
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> La1
            if (r4 == 0) goto Ld8
            r0.remove(r2)     // Catch: java.lang.Throwable -> La1
        Ld8:
            int r2 = r2 + (-1)
            goto Lc2
        Ldb:
            r1.f2451 = r13
            throw r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final void m1268(xhss.C1081 r3) {
            r2 = this;
            java.util.TimeZone r0 = xhss.AbstractC0559.f1984
            xhss.ᛵᛳᲀᛲ r0 = r3.f3484
            if (r0 != 0) goto L1f
            java.util.ArrayList r0 = r3.f3482
            boolean r0 = r0.isEmpty()
            java.util.ArrayList r1 = r2.f2447
            if (r0 != 0) goto L1c
            byte[] r0 = xhss.AbstractC0577.f2010
            boolean r0 = r1.contains(r3)
            if (r0 != 0) goto L1f
            r1.add(r3)
            goto L1f
        L1c:
            r1.remove(r3)
        L1f:
            boolean r3 = r2.f2451
            if (r3 == 0) goto L27
            r2.notify()
            return
        L27:
            r2.m1269()
            return
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final void m1269() {
            r2 = this;
            java.util.TimeZone r0 = xhss.AbstractC0559.f1984
            int r0 = r2.f2452
            int r1 = r2.f2450
            if (r0 <= r1) goto L9
            return
        L9:
            int r0 = r0 + 1
            r2.f2452 = r0
            xhss.ᲇᛵᛲᲁ r0 = r2.f2446
            java.lang.Object r0 = r0.f3349
            java.util.concurrent.ThreadPoolExecutor r0 = (java.util.concurrent.ThreadPoolExecutor) r0
            xhss.ᛴᲈᲀᲇ r2 = r2.f2449
            r0.execute(r2)
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m1270(xhss.AbstractC0458 r5, long r6, boolean r8) {
            r4 = this;
            java.util.TimeZone r0 = xhss.AbstractC0559.f1984
            xhss.ᲇᲀᲀᛷ r0 = r5.f1637
            xhss.ᛵᛳᲀᛲ r1 = r0.f3484
            if (r1 != r5) goto L38
            boolean r1 = r0.f3485
            r2 = 0
            r0.f3485 = r2
            r2 = 0
            r0.f3484 = r2
            java.util.ArrayList r2 = r4.f2448
            r2.remove(r0)
            r2 = -1
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 == 0) goto L25
            if (r1 != 0) goto L25
            boolean r1 = r0.f3481
            if (r1 != 0) goto L25
            r1 = 1
            r0.m1742(r5, r6, r1)
        L25:
            java.util.ArrayList r5 = r0.f3482
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L37
            java.util.ArrayList r5 = r4.f2447
            r5.add(r0)
            if (r8 != 0) goto L37
            r4.m1269()
        L37:
            return
        L38:
            java.lang.String r4 = "Check failed."
            xhss.C0532.m950(r4)
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.C1081 m1271() {
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.f2444     // Catch: java.lang.Throwable -> L14
            int r1 = r0 + 1
            r3.f2444 = r1     // Catch: java.lang.Throwable -> L14
            monitor-exit(r3)
            xhss.ᲇᲀᲀᛷ r1 = new xhss.ᲇᲀᲀᛷ
            java.lang.String r2 = "Q"
            java.lang.String r0 = xhss.AbstractC0390.m774(r2, r0)
            r1.<init>(r3, r0)
            return r1
        L14:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }
}
