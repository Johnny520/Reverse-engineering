package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛱᛶᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0830 implements java.io.Closeable {

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static final java.util.logging.Logger f2706 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0075 f2707;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0338 f2708;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public boolean f2709;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f2710;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.C0816 f2711;

    static {
            java.lang.Class<xhss.ᲁᛱᛱᲇ> r0 = xhss.AbstractC0922.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            xhss.C0830.f2706 = r0
            return
    }

    public C0830(xhss.C0075 r2) {
            r1 = this;
            r1.<init>()
            r1.f2707 = r2
            xhss.ᛴᛲᛴᛶ r2 = new xhss.ᛴᛲᛴᛶ
            r2.<init>()
            r1.f2708 = r2
            r0 = 16384(0x4000, float:2.2959E-41)
            r1.f2710 = r0
            xhss.ᛸᲇᲀᛳ r0 = new xhss.ᛸᲇᲀᛳ
            r0.<init>(r2)
            r1.f2711 = r0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.f2709 = r0     // Catch: java.lang.Throwable -> Lb
            xhss.ᛱᛸᛵᛱ r0 = r1.f2707     // Catch: java.lang.Throwable -> Lb
            r0.close()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final void flush() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f2709     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto Le
            xhss.ᛱᛸᛵᛱ r0 = r2.f2707     // Catch: java.lang.Throwable -> Lc
            r0.flush()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        Lc:
            r0 = move-exception
            goto L16
        Le:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0     // Catch: java.lang.Throwable -> Lc
        L16:
            monitor-exit(r2)
            throw r0
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m1411(xhss.C0414 r6) {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f2709     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L70
            int r0 = r5.f2710     // Catch: java.lang.Throwable -> L63
            int r1 = r6.f1468     // Catch: java.lang.Throwable -> L63
            r2 = r1 & 32
            if (r2 == 0) goto L12
            int[] r0 = r6.f1467     // Catch: java.lang.Throwable -> L63
            r2 = 5
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L63
        L12:
            r5.f2710 = r0     // Catch: java.lang.Throwable -> L63
            r0 = r1 & 2
            r2 = -1
            r3 = 1
            if (r0 == 0) goto L1f
            int[] r0 = r6.f1467     // Catch: java.lang.Throwable -> L63
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L63
            goto L20
        L1f:
            r0 = r2
        L20:
            r4 = 0
            if (r0 == r2) goto L65
            xhss.ᛸᲇᲀᛳ r0 = r5.f2711     // Catch: java.lang.Throwable -> L63
            r1 = r1 & 2
            if (r1 == 0) goto L2d
            int[] r6 = r6.f1467     // Catch: java.lang.Throwable -> L63
            r2 = r6[r3]     // Catch: java.lang.Throwable -> L63
        L2d:
            r6 = 16384(0x4000, float:2.2959E-41)
            int r6 = java.lang.Math.min(r2, r6)     // Catch: java.lang.Throwable -> L63
            int r1 = r0.f2650     // Catch: java.lang.Throwable -> L63
            if (r1 != r6) goto L38
            goto L65
        L38:
            if (r6 >= r1) goto L42
            int r1 = r0.f2644     // Catch: java.lang.Throwable -> L63
            int r1 = java.lang.Math.min(r1, r6)     // Catch: java.lang.Throwable -> L63
            r0.f2644 = r1     // Catch: java.lang.Throwable -> L63
        L42:
            r0.f2645 = r3     // Catch: java.lang.Throwable -> L63
            r0.f2650 = r6     // Catch: java.lang.Throwable -> L63
            int r1 = r0.f2648     // Catch: java.lang.Throwable -> L63
            if (r6 >= r1) goto L65
            if (r6 != 0) goto L5e
            xhss.ᛱᛵᲀᛱ[] r6 = r0.f2646     // Catch: java.lang.Throwable -> L63
            int r1 = r6.length     // Catch: java.lang.Throwable -> L63
            r2 = 0
            java.util.Arrays.fill(r6, r4, r1, r2)     // Catch: java.lang.Throwable -> L63
            xhss.ᛱᛵᲀᛱ[] r6 = r0.f2646     // Catch: java.lang.Throwable -> L63
            int r6 = r6.length     // Catch: java.lang.Throwable -> L63
            int r6 = r6 - r3
            r0.f2651 = r6     // Catch: java.lang.Throwable -> L63
            r0.f2649 = r4     // Catch: java.lang.Throwable -> L63
            r0.f2648 = r4     // Catch: java.lang.Throwable -> L63
            goto L65
        L5e:
            int r1 = r1 - r6
            r0.m1381(r1)     // Catch: java.lang.Throwable -> L63
            goto L65
        L63:
            r6 = move-exception
            goto L78
        L65:
            r6 = 4
            r5.m1417(r4, r4, r6, r3)     // Catch: java.lang.Throwable -> L63
            xhss.ᛱᛸᛵᛱ r6 = r5.f2707     // Catch: java.lang.Throwable -> L63
            r6.flush()     // Catch: java.lang.Throwable -> L63
            monitor-exit(r5)
            return
        L70:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = "closed"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L63
            throw r6     // Catch: java.lang.Throwable -> L63
        L78:
            monitor-exit(r5)
            throw r6
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final void m1412(boolean r3, int r4, xhss.C0338 r5, int r6) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f2709     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L13
            r0 = 0
            r2.m1417(r4, r6, r0, r3)     // Catch: java.lang.Throwable -> L1b
            if (r6 <= 0) goto L11
            xhss.ᛱᛸᛵᛱ r3 = r2.f2707     // Catch: java.lang.Throwable -> L1b
            long r0 = (long) r6     // Catch: java.lang.Throwable -> L1b
            r3.mo228(r0, r5)     // Catch: java.lang.Throwable -> L1b
        L11:
            monitor-exit(r2)
            return
        L13:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L1b
            java.lang.String r4 = "closed"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1b
            throw r3     // Catch: java.lang.Throwable -> L1b
        L1b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public final void m1413(int r4, int r5, boolean r6) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f2709     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L1f
            r0 = 8
            r1 = 6
            r2 = 0
            r3.m1417(r2, r0, r1, r6)     // Catch: java.lang.Throwable -> L1d
            xhss.ᛱᛸᛵᛱ r6 = r3.f2707     // Catch: java.lang.Throwable -> L1d
            r6.m231(r4)     // Catch: java.lang.Throwable -> L1d
            xhss.ᛱᛸᛵᛱ r4 = r3.f2707     // Catch: java.lang.Throwable -> L1d
            r4.m231(r5)     // Catch: java.lang.Throwable -> L1d
            xhss.ᛱᛸᛵᛱ r4 = r3.f2707     // Catch: java.lang.Throwable -> L1d
            r4.flush()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return
        L1d:
            r4 = move-exception
            goto L27
        L1f:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L1d
            throw r4     // Catch: java.lang.Throwable -> L1d
        L27:
            monitor-exit(r3)
            throw r4
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final void m1414(boolean r9, int r10, java.util.ArrayList r11) {
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.f2709     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L58
            xhss.ᛸᲇᲀᛳ r0 = r8.f2711     // Catch: java.lang.Throwable -> L56
            r0.m1382(r11)     // Catch: java.lang.Throwable -> L56
            xhss.ᛴᛲᛴᛶ r11 = r8.f2708     // Catch: java.lang.Throwable -> L56
            long r0 = r11.f1261     // Catch: java.lang.Throwable -> L56
            int r11 = r8.f2710     // Catch: java.lang.Throwable -> L56
            long r2 = (long) r11     // Catch: java.lang.Throwable -> L56
            long r2 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L56
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r4 = 0
            r5 = 4
            if (r11 != 0) goto L1d
            r6 = r5
            goto L1e
        L1d:
            r6 = r4
        L1e:
            if (r9 == 0) goto L22
            r6 = r6 | 1
        L22:
            int r9 = (int) r2     // Catch: java.lang.Throwable -> L56
            r7 = 1
            r8.m1417(r10, r9, r7, r6)     // Catch: java.lang.Throwable -> L56
            xhss.ᛱᛸᛵᛱ r9 = r8.f2707     // Catch: java.lang.Throwable -> L56
            xhss.ᛴᛲᛴᛶ r6 = r8.f2708     // Catch: java.lang.Throwable -> L56
            r9.mo228(r2, r6)     // Catch: java.lang.Throwable -> L56
            if (r11 <= 0) goto L54
            long r0 = r0 - r2
        L31:
            r2 = 0
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 <= 0) goto L54
            int r9 = r8.f2710     // Catch: java.lang.Throwable -> L56
            long r6 = (long) r9     // Catch: java.lang.Throwable -> L56
            long r6 = java.lang.Math.min(r6, r0)     // Catch: java.lang.Throwable -> L56
            long r0 = r0 - r6
            int r9 = (int) r6     // Catch: java.lang.Throwable -> L56
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 != 0) goto L46
            r11 = r5
            goto L47
        L46:
            r11 = r4
        L47:
            r2 = 9
            r8.m1417(r10, r9, r2, r11)     // Catch: java.lang.Throwable -> L56
            xhss.ᛱᛸᛵᛱ r9 = r8.f2707     // Catch: java.lang.Throwable -> L56
            xhss.ᛴᛲᛴᛶ r11 = r8.f2708     // Catch: java.lang.Throwable -> L56
            r9.mo228(r6, r11)     // Catch: java.lang.Throwable -> L56
            goto L31
        L54:
            monitor-exit(r8)
            return
        L56:
            r9 = move-exception
            goto L60
        L58:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L56
            java.lang.String r10 = "closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L56
            throw r9     // Catch: java.lang.Throwable -> L56
        L60:
            monitor-exit(r8)
            throw r9
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public final void m1415(int r4, int r5) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f2709     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L2c
            int r0 = xhss.AbstractC0390.m784(r5)     // Catch: java.lang.Throwable -> L22
            r1 = -1
            if (r0 == r1) goto L24
            r0 = 3
            r1 = 0
            r2 = 4
            r3.m1417(r4, r2, r0, r1)     // Catch: java.lang.Throwable -> L22
            xhss.ᛱᛸᛵᛱ r4 = r3.f2707     // Catch: java.lang.Throwable -> L22
            int r5 = xhss.AbstractC0390.m784(r5)     // Catch: java.lang.Throwable -> L22
            r4.m231(r5)     // Catch: java.lang.Throwable -> L22
            xhss.ᛱᛸᛵᛱ r4 = r3.f2707     // Catch: java.lang.Throwable -> L22
            r4.flush()     // Catch: java.lang.Throwable -> L22
            monitor-exit(r3)
            return
        L22:
            r4 = move-exception
            goto L34
        L24:
            java.lang.String r4 = "Failed requirement."
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L22
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L22
            throw r5     // Catch: java.lang.Throwable -> L22
        L2c:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L22
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L34:
            monitor-exit(r3)
            throw r4
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final void m1416(byte[] r4, int r5, int r6) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f2709     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L4e
            int r0 = xhss.AbstractC0390.m784(r6)     // Catch: java.lang.Throwable -> L3c
            r1 = -1
            if (r0 == r1) goto L46
            int r0 = r4.length     // Catch: java.lang.Throwable -> L3c
            int r0 = r0 + 8
            r1 = 7
            r2 = 0
            r3.m1417(r2, r0, r1, r2)     // Catch: java.lang.Throwable -> L3c
            xhss.ᛱᛸᛵᛱ r0 = r3.f2707     // Catch: java.lang.Throwable -> L3c
            r0.m231(r5)     // Catch: java.lang.Throwable -> L3c
            xhss.ᛱᛸᛵᛱ r5 = r3.f2707     // Catch: java.lang.Throwable -> L3c
            int r6 = xhss.AbstractC0390.m784(r6)     // Catch: java.lang.Throwable -> L3c
            r5.m231(r6)     // Catch: java.lang.Throwable -> L3c
            int r5 = r4.length     // Catch: java.lang.Throwable -> L3c
            if (r5 != 0) goto L26
            goto L35
        L26:
            xhss.ᛱᛸᛵᛱ r5 = r3.f2707     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r5.f409     // Catch: java.lang.Throwable -> L3c
            if (r6 != 0) goto L3e
            xhss.ᛴᛲᛴᛶ r6 = r5.f408     // Catch: java.lang.Throwable -> L3c
            int r0 = r4.length     // Catch: java.lang.Throwable -> L3c
            r6.m700(r4, r0)     // Catch: java.lang.Throwable -> L3c
            r5.m226()     // Catch: java.lang.Throwable -> L3c
        L35:
            xhss.ᛱᛸᛵᛱ r4 = r3.f2707     // Catch: java.lang.Throwable -> L3c
            r4.flush()     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r3)
            return
        L3c:
            r4 = move-exception
            goto L56
        L3e:
            java.lang.String r4 = "closed"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3c
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L3c
            throw r5     // Catch: java.lang.Throwable -> L3c
        L46:
            java.lang.String r4 = "errorCode.httpCode == -1"
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L3c
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L3c
            throw r5     // Catch: java.lang.Throwable -> L3c
        L4e:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L3c
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L3c
            throw r4     // Catch: java.lang.Throwable -> L3c
        L56:
            monitor-exit(r3)
            throw r4
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final void m1417(int r3, int r4, int r5, int r6) {
            r2 = this;
            r0 = 8
            if (r5 == r0) goto L16
            java.util.logging.Level r0 = java.util.logging.Level.FINE
            java.util.logging.Logger r1 = xhss.C0830.f2706
            boolean r0 = r1.isLoggable(r0)
            if (r0 == 0) goto L16
            r0 = 0
            java.lang.String r0 = xhss.AbstractC0922.m1517(r0, r3, r4, r5, r6)
            r1.fine(r0)
        L16:
            int r0 = r2.f2710
            if (r4 > r0) goto L52
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r3
            if (r0 != 0) goto L48
            byte[] r0 = xhss.AbstractC0577.f2010
            int r0 = r4 >>> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            xhss.ᛱᛸᛵᛱ r2 = r2.f2707
            r2.m227(r0)
            int r0 = r4 >>> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2.m227(r0)
            r4 = r4 & 255(0xff, float:3.57E-43)
            r2.m227(r4)
            r4 = r5 & 255(0xff, float:3.57E-43)
            r2.m227(r4)
            r4 = r6 & 255(0xff, float:3.57E-43)
            r2.m227(r4)
            r4 = 2147483647(0x7fffffff, float:NaN)
            r3 = r3 & r4
            r2.m231(r3)
            return
        L48:
            java.lang.String r2 = "reserved bit set: "
            java.lang.String r2 = xhss.AbstractC0390.m774(r2, r3)
            xhss.C0532.m946(r2)
            return
        L52:
            int r2 = r2.f2710
            java.lang.String r3 = ": "
            java.lang.String r5 = "FRAME_SIZE_ERROR length > "
            xhss.C0532.m963(r5, r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public final void m1418(long r5, int r7) {
            r4 = this;
            java.lang.String r0 = "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: "
            monitor-enter(r4)
            boolean r1 = r4.f2709     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L52
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L3c
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L3c
            java.util.logging.Logger r0 = xhss.C0830.f2706     // Catch: java.lang.Throwable -> L28
            java.util.logging.Level r1 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L28
            boolean r1 = r0.isLoggable(r1)     // Catch: java.lang.Throwable -> L28
            r2 = 4
            r3 = 0
            if (r1 == 0) goto L2a
            java.lang.String r1 = xhss.AbstractC0922.m1518(r3, r7, r2, r5)     // Catch: java.lang.Throwable -> L28
            r0.fine(r1)     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r5 = move-exception
            goto L5a
        L2a:
            r0 = 8
            r4.m1417(r7, r2, r0, r3)     // Catch: java.lang.Throwable -> L28
            xhss.ᛱᛸᛵᛱ r7 = r4.f2707     // Catch: java.lang.Throwable -> L28
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L28
            r7.m231(r5)     // Catch: java.lang.Throwable -> L28
            xhss.ᛱᛸᛵᛱ r5 = r4.f2707     // Catch: java.lang.Throwable -> L28
            r5.flush()     // Catch: java.lang.Throwable -> L28
            monitor-exit(r4)
            return
        L3c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L28
            r7.append(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L28
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L28
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L28
            throw r6     // Catch: java.lang.Throwable -> L28
        L52:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L28
            java.lang.String r6 = "closed"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L28
            throw r5     // Catch: java.lang.Throwable -> L28
        L5a:
            monitor-exit(r4)
            throw r5
    }
}
