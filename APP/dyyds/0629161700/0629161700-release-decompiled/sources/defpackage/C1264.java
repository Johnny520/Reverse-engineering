package defpackage;

/* JADX INFO: renamed from: ᛷᛴᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1264 implements java.io.Closeable {

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final java.util.logging.Logger f5664 = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C2305 f5665;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1066 f5666;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C2252 f5667;

    static {
            java.lang.Class<ᲁᛵᛲᲇ> r0 = defpackage.AbstractC1853.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            defpackage.C1264.f5664 = r0
            return
    }

    public C1264(defpackage.C2252 r2) {
            r1 = this;
            r1.<init>()
            r1.f5667 = r2
            ᛶᛵᛲᛳ r0 = new ᛶᛵᛲᛳ
            r0.<init>(r2)
            r1.f5666 = r0
            ᲈᛸᛴᛵ r2 = new ᲈᛸᛴᛵ
            r2.<init>(r0)
            r1.f5665 = r2
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            ᲈᛵᲈᛵ r0 = r0.f5667
            r0.close()
            return
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final void m2364(defpackage.C0996 r10, int r11, int r12, int r13) {
            r9 = this;
            if (r13 == 0) goto Lce
            r0 = r12 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La
            r7 = r2
            goto Lb
        La:
            r7 = r1
        Lb:
            r0 = r12 & 8
            if (r0 == 0) goto L1a
            ᲈᛵᲈᛵ r0 = r9.f5667
            byte r0 = r0.m3641()
            byte[] r3 = defpackage.AbstractC0709.f3358
            r0 = r0 & 255(0xff, float:3.57E-43)
            goto L1b
        L1a:
            r0 = r1
        L1b:
            r3 = r12 & 32
            if (r3 == 0) goto L2b
            ᲈᛵᲈᛵ r3 = r9.f5667
            r3.m3640()
            r3.m3641()
            byte[] r3 = defpackage.AbstractC0709.f3358
            int r11 = r11 + (-5)
        L2b:
            int r11 = defpackage.AbstractC0425.m1185(r11, r12, r0)
            java.util.List r9 = r9.m2366(r11, r0, r12, r13)
            ᲈᲈ r5 = r10.f4438
            if (r13 == 0) goto L3c
            r10 = r13 & 1
            if (r10 != 0) goto L3c
            r1 = r2
        L3c:
            r10 = 91
            if (r1 == 0) goto L64
            ᛴᛴᛸᛴ r11 = r5.f10207
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = r5.f10214
            r12.append(r0)
            r12.append(r10)
            r12.append(r13)
            java.lang.String r10 = "] onHeaders"
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            ᲀᛵᛴᛳ r12 = new ᲀᛵᛴᛳ
            r12.<init>(r5, r13, r9, r7)
            defpackage.C0658.m1488(r11, r10, r12)
            return
        L64:
            monitor-enter(r5)
            ᲁᲈᛲᛱ r11 = r5.m3863(r13)     // Catch: java.lang.Throwable -> Lc0
            if (r11 != 0) goto Lc3
            boolean r11 = r5.f10206     // Catch: java.lang.Throwable -> Lc0
            if (r11 == 0) goto L71
            monitor-exit(r5)
            return
        L71:
            int r11 = r5.f10227     // Catch: java.lang.Throwable -> Lc0
            if (r13 > r11) goto L77
            monitor-exit(r5)
            return
        L77:
            int r11 = r13 % 2
            int r12 = r5.f10230     // Catch: java.lang.Throwable -> Lc0
            r0 = 2
            int r12 = r12 % r0
            if (r11 != r12) goto L81
            monitor-exit(r5)
            return
        L81:
            ᛱᛱᛷᛳ r8 = defpackage.AbstractC0508.m1289(r9)     // Catch: java.lang.Throwable -> Lc0
            ᲁᲈᛲᛱ r3 = new ᲁᲈᛲᛱ     // Catch: java.lang.Throwable -> Lc0
            r6 = 0
            r4 = r13
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lc0
            r5.f10227 = r4     // Catch: java.lang.Throwable -> Lc0
            java.util.LinkedHashMap r9 = r5.f10216     // Catch: java.lang.Throwable -> Lc0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lc0
            r9.put(r11, r3)     // Catch: java.lang.Throwable -> Lc0
            ᛵᲀᲇᛸ r9 = r5.f10209     // Catch: java.lang.Throwable -> Lc0
            ᛴᛴᛸᛴ r9 = r9.m1908()     // Catch: java.lang.Throwable -> Lc0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc0
            r11.<init>()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r12 = r5.f10214     // Catch: java.lang.Throwable -> Lc0
            r11.append(r12)     // Catch: java.lang.Throwable -> Lc0
            r11.append(r10)     // Catch: java.lang.Throwable -> Lc0
            r11.append(r4)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r10 = "] onStream"
            r11.append(r10)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> Lc0
            ᲇᛱᲈᲀ r11 = new ᲇᛱᲈᲀ     // Catch: java.lang.Throwable -> Lc0
            r11.<init>(r5, r0, r3)     // Catch: java.lang.Throwable -> Lc0
            defpackage.C0658.m1488(r9, r10, r11)     // Catch: java.lang.Throwable -> Lc0
            monitor-exit(r5)
            return
        Lc0:
            r0 = move-exception
            r9 = r0
            goto Lcc
        Lc3:
            monitor-exit(r5)
            ᛱᛱᛷᛳ r9 = defpackage.AbstractC0508.m1289(r9)
            r11.m3379(r9, r7)
            return
        Lcc:
            monitor-exit(r5)
            throw r9
        Lce:
            java.lang.String r9 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            defpackage.C2264.m3682(r9)
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final void m2365(defpackage.C0996 r4, int r5, int r6, int r7) {
            r3 = this;
            if (r7 == 0) goto L6f
            r0 = r6 & 8
            if (r0 == 0) goto L11
            ᲈᛵᲈᛵ r0 = r3.f5667
            byte r0 = r0.m3641()
            byte[] r1 = defpackage.AbstractC0709.f3358
            r0 = r0 & 255(0xff, float:3.57E-43)
            goto L12
        L11:
            r0 = 0
        L12:
            ᲈᛵᲈᛵ r1 = r3.f5667
            int r1 = r1.m3640()
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r2
            int r5 = r5 + (-4)
            int r5 = defpackage.AbstractC0425.m1185(r5, r6, r0)
            java.util.List r3 = r3.m2366(r5, r0, r6, r7)
            ᲈᲈ r4 = r4.f4438
            monitor-enter(r4)
            java.util.LinkedHashSet r5 = r4.f10223     // Catch: java.lang.Throwable -> L3b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L3b
            boolean r5 = r5.contains(r6)     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L3d
            r3 = 2
            r4.m3859(r1, r3)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r4)
            return
        L3b:
            r3 = move-exception
            goto L6d
        L3d:
            java.util.LinkedHashSet r5 = r4.f10223     // Catch: java.lang.Throwable -> L3b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L3b
            r5.add(r6)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r4)
            ᛴᛴᛸᛴ r5 = r4.f10207
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r4.f10214
            r6.append(r7)
            r7 = 91
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = "] onRequest"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            ᲀᛵᛴᛳ r7 = new ᲀᛵᛴᛳ
            r7.<init>(r4, r1, r3)
            defpackage.C0658.m1488(r5, r6, r7)
            return
        L6d:
            monitor-exit(r4)
            throw r3
        L6f:
            java.lang.String r3 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            defpackage.C2264.m3682(r3)
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final java.util.List m2366(int r3, int r4, int r5, int r6) {
            r2 = this;
            ᛶᛵᛲᛳ r0 = r2.f5666
            r0.f4746 = r3
            r0.f4747 = r4
            r0.f4744 = r5
            r0.f4743 = r6
            ᲈᛸᛴᛵ r2 = r2.f5665
            ᲈᛵᲈᛵ r3 = r2.f9753
        Le:
            boolean r4 = r3.m3645()
            if (r4 != 0) goto L11c
            byte r4 = r3.m3641()
            byte[] r5 = defpackage.AbstractC0709.f3358
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 0
            r0 = 128(0x80, float:1.8E-43)
            if (r5 == r0) goto L116
            r1 = r4 & 128(0x80, float:1.8E-43)
            if (r1 != r0) goto L5c
            r4 = 127(0x7f, float:1.78E-43)
            int r4 = r2.m3750(r5, r4)
            int r5 = r4 + (-1)
            if (r5 < 0) goto L3c
            ᛵᛲᛵᲁ[] r0 = defpackage.AbstractC0928.f4193
            int r1 = r0.length
            int r1 = r1 + (-1)
            if (r5 > r1) goto L3c
            r4 = r0[r5]
            r2.m3748(r4)
            goto Le
        L3c:
            ᛵᛲᛵᲁ[] r0 = defpackage.AbstractC0928.f4193
            int r0 = r0.length
            int r5 = r5 - r0
            int r0 = r2.f9757
            int r0 = r0 + 1
            int r0 = r0 + r5
            if (r0 < 0) goto L52
            ᛵᛲᛵᲁ[] r5 = r2.f9752
            int r1 = r5.length
            if (r0 >= r1) goto L52
            r4 = r5[r0]
            r2.m3748(r4)
            goto Le
        L52:
            java.lang.String r2 = "Header index too large "
            java.lang.String r2 = defpackage.AbstractC1124.m2145(r4, r2)
            defpackage.C2264.m3682(r2)
            return r6
        L5c:
            r0 = 64
            if (r5 != r0) goto L76
            ᛵᛲᛵᲁ[] r4 = defpackage.AbstractC0928.f4193
            ᛶᛸᛸᛶ r4 = r2.m3745()
            defpackage.AbstractC0928.m1883(r4)
            ᛶᛸᛸᛶ r5 = r2.m3745()
            ᛵᛲᛵᲁ r6 = new ᛵᛲᛵᲁ
            r6.<init>(r4, r5)
            r2.m3746(r6)
            goto Le
        L76:
            r1 = r4 & 64
            if (r1 != r0) goto L94
            r4 = 63
            int r4 = r2.m3750(r5, r4)
            int r4 = r4 + (-1)
            ᛶᛸᛸᛶ r4 = r2.m3747(r4)
            ᛶᛸᛸᛶ r5 = r2.m3745()
            ᛵᛲᛵᲁ r6 = new ᛵᛲᛵᲁ
            r6.<init>(r4, r5)
            r2.m3746(r6)
            goto Le
        L94:
            r4 = r4 & 32
            r0 = 32
            if (r4 != r0) goto Lde
            r4 = 31
            int r4 = r2.m3750(r5, r4)
            r2.f9755 = r4
            if (r4 < 0) goto Lc8
            r5 = 4096(0x1000, float:5.74E-42)
            if (r4 > r5) goto Lc8
            int r5 = r2.f9751
            if (r4 >= r5) goto Le
            if (r4 != 0) goto Lc2
            ᛵᛲᛵᲁ[] r4 = r2.f9752
            int r5 = r4.length
            r0 = 0
            java.util.Arrays.fill(r4, r0, r5, r6)
            ᛵᛲᛵᲁ[] r4 = r2.f9752
            int r4 = r4.length
            int r4 = r4 + (-1)
            r2.f9757 = r4
            r2.f9758 = r0
            r2.f9751 = r0
            goto Le
        Lc2:
            int r5 = r5 - r4
            r2.m3749(r5)
            goto Le
        Lc8:
            java.io.IOException r3 = new java.io.IOException
            int r2 = r2.f9755
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Invalid dynamic table size update "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
        Lde:
            r4 = 16
            if (r5 == r4) goto Lff
            if (r5 != 0) goto Le5
            goto Lff
        Le5:
            r4 = 15
            int r4 = r2.m3750(r5, r4)
            int r4 = r4 + (-1)
            ᛶᛸᛸᛶ r4 = r2.m3747(r4)
            ᛶᛸᛸᛶ r5 = r2.m3745()
            ᛵᛲᛵᲁ r6 = new ᛵᛲᛵᲁ
            r6.<init>(r4, r5)
            r2.m3748(r6)
            goto Le
        Lff:
            ᛵᛲᛵᲁ[] r4 = defpackage.AbstractC0928.f4193
            ᛶᛸᛸᛶ r4 = r2.m3745()
            defpackage.AbstractC0928.m1883(r4)
            ᛶᛸᛸᛶ r5 = r2.m3745()
            ᛵᛲᛵᲁ r6 = new ᛵᛲᛵᲁ
            r6.<init>(r4, r5)
            r2.m3748(r6)
            goto Le
        L116:
            java.lang.String r2 = "index == 0"
            defpackage.C2264.m3682(r2)
            return r6
        L11c:
            java.util.ArrayList r3 = r2.f9756
            java.util.List r4 = defpackage.AbstractC1107.m2113(r3)
            r3.clear()
            r5 = 0
            r2.f9754 = r5
            return r4
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean m2367(boolean r17, defpackage.C0996 r18) {
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = 0
            ᲈᛵᲈᛵ r3 = r0.f5667     // Catch: java.io.EOFException -> L34d
            r4 = 9
            r3.m3644(r4)     // Catch: java.io.EOFException -> L34d
            ᲈᛵᲈᛵ r3 = r0.f5667
            int r3 = defpackage.AbstractC0709.m1602(r3)
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r3 > r4) goto L344
            ᲈᛵᲈᛵ r5 = r0.f5667
            byte r5 = r5.m3641()
            r5 = r5 & 255(0xff, float:3.57E-43)
            ᲈᛵᲈᛵ r6 = r0.f5667
            byte r6 = r6.m3641()
            r7 = r6 & 255(0xff, float:3.57E-43)
            ᲈᛵᲈᛵ r8 = r0.f5667
            int r8 = r8.m3640()
            r9 = 2147483647(0x7fffffff, float:NaN)
            r9 = r9 & r8
            r10 = 8
            r11 = 1
            if (r5 == r10) goto L46
            java.util.logging.Logger r12 = defpackage.C1264.f5664
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r13 = r12.isLoggable(r13)
            if (r13 == 0) goto L46
            java.lang.String r13 = defpackage.AbstractC1853.m3269(r11, r9, r3, r5, r7)
            r12.fine(r13)
        L46:
            r12 = 4
            if (r17 == 0) goto L56
            if (r5 != r12) goto L4c
            goto L56
        L4c:
            java.lang.String r0 = "Expected a SETTINGS frame but was "
            java.lang.String r1 = defpackage.AbstractC1853.m3268(r5)
            defpackage.C2264.m3683(r1, r0)
            return r2
        L56:
            r13 = 3
            r15 = 5
            r17 = 14
            r14 = 2
            switch(r5) {
                case 0: goto L340;
                case 1: goto L33c;
                case 2: goto L310;
                case 3: goto L27e;
                case 4: goto L1da;
                case 5: goto L1d6;
                case 6: goto L16c;
                case 7: goto Ld9;
                case 8: goto L65;
                default: goto L5e;
            }
        L5e:
            ᲈᛵᲈᛵ r0 = r0.f5667
            long r1 = (long) r3
            r0.m3647(r1)
            return r11
        L65:
            java.lang.String r2 = "TYPE_WINDOW_UPDATE length !=4: "
            if (r3 != r12) goto Lbd
            ᲈᛵᲈᛵ r0 = r0.f5667     // Catch: java.lang.Exception -> Lbb
            int r0 = r0.m3640()     // Catch: java.lang.Exception -> Lbb
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r12 = (long) r0
            long r4 = r4 & r12
            r12 = 0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 == 0) goto Lb3
            java.util.logging.Logger r2 = defpackage.C1264.f5664
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            boolean r6 = r2.isLoggable(r6)
            if (r6 == 0) goto L8b
            java.lang.String r3 = defpackage.AbstractC1853.m3267(r11, r9, r3, r4)
            r2.fine(r3)
        L8b:
            ᲈᲈ r1 = r1.f4438
            if (r9 != 0) goto L9d
            monitor-enter(r1)
            long r2 = r1.f10221     // Catch: java.lang.Throwable -> L9a
            long r2 = r2 + r4
            r1.f10221 = r2     // Catch: java.lang.Throwable -> L9a
            r1.notifyAll()     // Catch: java.lang.Throwable -> L9a
            monitor-exit(r1)
            return r11
        L9a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L9d:
            ᲁᲈᛲᛱ r1 = r1.m3863(r9)
            if (r1 == 0) goto L2e6
            monitor-enter(r1)
            long r2 = r1.f8522     // Catch: java.lang.Throwable -> Lb0
            long r2 = r2 + r4
            r1.f8522 = r2     // Catch: java.lang.Throwable -> Lb0
            if (r0 <= 0) goto Lae
            r1.notifyAll()     // Catch: java.lang.Throwable -> Lb0
        Lae:
            monitor-exit(r1)
            return r11
        Lb0:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        Lb3:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Exception -> Lbb
            java.lang.String r1 = "windowSizeIncrement was 0"
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lbb
            throw r0     // Catch: java.lang.Exception -> Lbb
        Lbb:
            r0 = move-exception
            goto Lcf
        Lbd:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Exception -> Lbb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbb
            r1.<init>(r2)     // Catch: java.lang.Exception -> Lbb
            r1.append(r3)     // Catch: java.lang.Exception -> Lbb
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Lbb
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lbb
            throw r0     // Catch: java.lang.Exception -> Lbb
        Lcf:
            java.util.logging.Logger r1 = defpackage.C1264.f5664
            java.lang.String r2 = defpackage.AbstractC1853.m3269(r11, r9, r3, r10, r7)
            r1.fine(r2)
            throw r0
        Ld9:
            if (r3 < r10) goto L162
            if (r9 != 0) goto L15c
            ᲈᛵᲈᛵ r4 = r0.f5667
            int r4 = r4.m3640()
            ᲈᛵᲈᛵ r5 = r0.f5667
            int r5 = r5.m3640()
            int r3 = r3 - r10
            int[] r6 = defpackage.AbstractC0225.m825(r17)
            int r7 = r6.length
            r8 = r2
        Lf0:
            if (r8 >= r7) goto Lfe
            r9 = r6[r8]
            int r12 = defpackage.AbstractC0225.m812(r9)
            if (r12 != r5) goto Lfb
            goto Lff
        Lfb:
            int r8 = r8 + 1
            goto Lf0
        Lfe:
            r9 = r2
        Lff:
            if (r9 == 0) goto L152
            ᛶᛸᛸᛶ r5 = defpackage.C1128.f5017
            if (r3 <= 0) goto L10c
            ᲈᛵᲈᛵ r0 = r0.f5667
            long r5 = (long) r3
            ᛶᛸᛸᛶ r5 = r0.m3638(r5)
        L10c:
            r5.mo2165()
            ᲈᲈ r3 = r1.f4438
            monitor-enter(r3)
            java.util.LinkedHashMap r0 = r3.f10216     // Catch: java.lang.Throwable -> L14f
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L14f
            ᲁᲈᛲᛱ[] r5 = new defpackage.C1958[r2]     // Catch: java.lang.Throwable -> L14f
            java.lang.Object[] r0 = r0.toArray(r5)     // Catch: java.lang.Throwable -> L14f
            r3.f10206 = r11     // Catch: java.lang.Throwable -> L14f
            monitor-exit(r3)
            ᲁᲈᛲᛱ[] r0 = (defpackage.C1958[]) r0
            int r3 = r0.length
        L124:
            if (r2 >= r3) goto L2e6
            r5 = r0[r2]
            int r6 = r5.f8518
            if (r6 <= r4) goto L14c
            boolean r6 = r5.m3373()
            if (r6 == 0) goto L14c
            monitor-enter(r5)
            int r6 = r5.m3381()     // Catch: java.lang.Throwable -> L13f
            if (r6 != 0) goto L141
            r5.f8520 = r10     // Catch: java.lang.Throwable -> L13f
            r5.notifyAll()     // Catch: java.lang.Throwable -> L13f
            goto L141
        L13f:
            r0 = move-exception
            goto L14a
        L141:
            monitor-exit(r5)
            ᲈᲈ r6 = r1.f4438
            int r5 = r5.f8518
            r6.m3858(r5)
            goto L14c
        L14a:
            monitor-exit(r5)
            throw r0
        L14c:
            int r2 = r2 + 1
            goto L124
        L14f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L152:
            java.lang.String r0 = "TYPE_GOAWAY unexpected error code: "
            java.lang.String r0 = defpackage.AbstractC1124.m2145(r5, r0)
            defpackage.C2264.m3682(r0)
            return r2
        L15c:
            java.lang.String r0 = "TYPE_GOAWAY streamId != 0"
            defpackage.C2264.m3682(r0)
            return r2
        L162:
            java.lang.String r0 = "TYPE_GOAWAY length < 8: "
            java.lang.String r0 = defpackage.AbstractC1124.m2145(r3, r0)
            defpackage.C2264.m3682(r0)
            return r2
        L16c:
            if (r3 != r10) goto L1cc
            if (r9 != 0) goto L1c6
            ᲈᛵᲈᛵ r3 = r0.f5667
            int r3 = r3.m3640()
            ᲈᛵᲈᛵ r0 = r0.f5667
            int r0 = r0.m3640()
            r4 = r6 & 1
            if (r4 == 0) goto L181
            r2 = r11
        L181:
            ᲈᲈ r4 = r1.f4438
            if (r2 == 0) goto L1a4
            monitor-enter(r4)
            r0 = 1
            if (r3 == r11) goto L19b
            if (r3 == r14) goto L195
            if (r3 == r13) goto L18f
            goto L1a0
        L18f:
            r4.notifyAll()     // Catch: java.lang.Throwable -> L193
            goto L1a0
        L193:
            r0 = move-exception
            goto L1a2
        L195:
            long r2 = r4.f10228     // Catch: java.lang.Throwable -> L193
            long r2 = r2 + r0
            r4.f10228 = r2     // Catch: java.lang.Throwable -> L193
            goto L1a0
        L19b:
            long r2 = r4.f10220     // Catch: java.lang.Throwable -> L193
            long r2 = r2 + r0
            r4.f10220 = r2     // Catch: java.lang.Throwable -> L193
        L1a0:
            monitor-exit(r4)
            return r11
        L1a2:
            monitor-exit(r4)
            throw r0
        L1a4:
            ᛴᛴᛸᛴ r2 = r4.f10219
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            ᲈᲈ r5 = r1.f4438
            java.lang.String r5 = r5.f10214
            r4.append(r5)
            java.lang.String r5 = " ping"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            ᲈᲈ r1 = r1.f4438
            ᛶᛱᛶᲈ r5 = new ᛶᛱᛶᲈ
            r5.<init>(r1, r3, r0, r11)
            defpackage.C0658.m1488(r2, r4, r5)
            return r11
        L1c6:
            java.lang.String r0 = "TYPE_PING streamId != 0"
            defpackage.C2264.m3682(r0)
            return r2
        L1cc:
            java.lang.String r0 = "TYPE_PING length != 8: "
            java.lang.String r0 = defpackage.AbstractC1124.m2145(r3, r0)
            defpackage.C2264.m3682(r0)
            return r2
        L1d6:
            r0.m2365(r1, r3, r7, r9)
            return r11
        L1da:
            ᲈᛵᲈᛵ r0 = r0.f5667
            if (r9 != 0) goto L278
            r5 = r6 & 1
            if (r5 == 0) goto L1ec
            if (r3 != 0) goto L1e6
            goto L2e6
        L1e6:
            java.lang.String r0 = "FRAME_SIZE_ERROR ack frame should be empty!"
            defpackage.C2264.m3682(r0)
            return r2
        L1ec:
            int r5 = r3 % 6
            if (r5 != 0) goto L26e
            ᛴᛶᛳᛷ r5 = new ᛴᛶᛳᛷ
            r5.<init>()
            ᛱᛵᲇᲇ r3 = defpackage.AbstractC1754.m3143(r2, r3)
            r6 = 6
            ᲈᛳᛷᛴ r3 = defpackage.AbstractC1754.m3157(r3, r6)
            int r6 = r3.f9424
            int r7 = r3.f9423
            int r3 = r3.f9422
            if (r3 <= 0) goto L208
            if (r6 <= r7) goto L20c
        L208:
            if (r3 >= 0) goto L24e
            if (r7 > r6) goto L24e
        L20c:
            short r8 = r0.m3642()
            byte[] r9 = defpackage.AbstractC0709.f3358
            r9 = 65535(0xffff, float:9.1834E-41)
            r8 = r8 & r9
            int r9 = r0.m3640()
            if (r8 == r14) goto L23c
            if (r8 == r12) goto L233
            if (r8 == r15) goto L221
            goto L247
        L221:
            if (r9 < r4) goto L229
            r10 = 16777215(0xffffff, float:2.3509886E-38)
            if (r9 > r10) goto L229
            goto L247
        L229:
            java.lang.String r0 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            java.lang.String r0 = defpackage.AbstractC1124.m2145(r9, r0)
            defpackage.C2264.m3682(r0)
            return r2
        L233:
            if (r9 < 0) goto L236
            goto L247
        L236:
            java.lang.String r0 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            defpackage.C2264.m3682(r0)
            return r2
        L23c:
            if (r9 == 0) goto L247
            if (r9 != r11) goto L241
            goto L247
        L241:
            java.lang.String r0 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            defpackage.C2264.m3682(r0)
            return r2
        L247:
            r5.m1575(r8, r9)
            if (r6 == r7) goto L24e
            int r6 = r6 + r3
            goto L20c
        L24e:
            ᲈᲈ r0 = r1.f4438
            ᛴᛴᛸᛴ r2 = r0.f10219
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = r0.f10214
            r3.append(r0)
            java.lang.String r0 = " applyAndAckSettings"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            ᲇᛱᲈᲀ r3 = new ᲇᛱᲈᲀ
            r3.<init>(r1, r13, r5)
            defpackage.C0658.m1488(r2, r0, r3)
            return r11
        L26e:
            java.lang.String r0 = "TYPE_SETTINGS length % 6 != 0: "
            java.lang.String r0 = defpackage.AbstractC1124.m2145(r3, r0)
            defpackage.C2264.m3682(r0)
            return r2
        L278:
            java.lang.String r0 = "TYPE_SETTINGS streamId != 0"
            defpackage.C2264.m3682(r0)
            return r2
        L27e:
            if (r3 != r12) goto L2f7
            if (r9 == 0) goto L2f1
            ᲈᛵᲈᛵ r0 = r0.f5667
            int r0 = r0.m3640()
            int[] r3 = defpackage.AbstractC0225.m825(r17)
            int r4 = r3.length
            r5 = r2
        L28e:
            if (r5 >= r4) goto L29c
            r6 = r3[r5]
            int r7 = defpackage.AbstractC0225.m812(r6)
            if (r7 != r0) goto L299
            goto L29d
        L299:
            int r5 = r5 + 1
            goto L28e
        L29c:
            r6 = r2
        L29d:
            if (r6 == 0) goto L2e7
            ᲈᲈ r0 = r1.f4438
            if (r9 == 0) goto L2cd
            r1 = r8 & 1
            if (r1 != 0) goto L2cd
            ᛴᛴᛸᛴ r1 = r0.f10207
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.f10214
            r2.append(r3)
            r3 = 91
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = "] onReset"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            ᲀᛵᛴᛳ r3 = new ᲀᛵᛴᛳ
            r3.<init>(r0, r9, r6)
            defpackage.C0658.m1488(r1, r2, r3)
            return r11
        L2cd:
            ᲁᲈᛲᛱ r1 = r0.m3858(r9)
            if (r1 == 0) goto L2e6
            monitor-enter(r1)
            int r0 = r1.m3381()     // Catch: java.lang.Throwable -> L2e0
            if (r0 != 0) goto L2e2
            r1.f8520 = r6     // Catch: java.lang.Throwable -> L2e0
            r1.notifyAll()     // Catch: java.lang.Throwable -> L2e0
            goto L2e2
        L2e0:
            r0 = move-exception
            goto L2e4
        L2e2:
            monitor-exit(r1)
            return r11
        L2e4:
            monitor-exit(r1)
            throw r0
        L2e6:
            return r11
        L2e7:
            java.lang.String r1 = "TYPE_RST_STREAM unexpected error code: "
            java.lang.String r0 = defpackage.AbstractC1124.m2145(r0, r1)
            defpackage.C2264.m3682(r0)
            return r2
        L2f1:
            java.lang.String r0 = "TYPE_RST_STREAM streamId == 0"
            defpackage.C2264.m3682(r0)
            return r2
        L2f7:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "TYPE_RST_STREAM length: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = " != 4"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L310:
            if (r3 != r15) goto L323
            if (r9 == 0) goto L31d
            ᲈᛵᲈᛵ r0 = r0.f5667
            r0.m3640()
            r0.m3641()
            return r11
        L31d:
            java.lang.String r0 = "TYPE_PRIORITY streamId == 0"
            defpackage.C2264.m3682(r0)
            return r2
        L323:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "TYPE_PRIORITY length: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = " != 5"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L33c:
            r0.m2364(r1, r3, r7, r9)
            return r11
        L340:
            r0.m2368(r1, r3, r7, r9)
            return r11
        L344:
            java.lang.String r0 = "FRAME_SIZE_ERROR: "
            java.lang.String r0 = defpackage.AbstractC1124.m2145(r3, r0)
            defpackage.C2264.m3682(r0)
        L34d:
            return r2
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final void m2368(defpackage.C0996 r17, int r18, int r19, int r20) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r20
            if (r3 == 0) goto L126
            r4 = r2 & 1
            r6 = 1
            if (r4 == 0) goto L11
            r4 = r6
            goto L13
        L11:
            r4 = r6
            r6 = 0
        L13:
            r7 = r2 & 32
            if (r7 != 0) goto L120
            r7 = r2 & 8
            if (r7 == 0) goto L28
            ᲈᛵᲈᛵ r7 = r0.f5667
            byte r7 = r7.m3641()
            byte[] r8 = defpackage.AbstractC0709.f3358
            r7 = r7 & 255(0xff, float:3.57E-43)
        L25:
            r8 = r18
            goto L2a
        L28:
            r7 = 0
            goto L25
        L2a:
            int r2 = defpackage.AbstractC0425.m1185(r8, r2, r7)
            ᲈᛵᲈᛵ r8 = r0.f5667
            ᲈᲈ r9 = r1.f4438
            if (r3 == 0) goto L3a
            r10 = r3 & 1
            if (r10 != 0) goto L3a
            r10 = r4
            goto L3b
        L3a:
            r10 = 0
        L3b:
            if (r10 == 0) goto L72
            ᛸᲁᛵ r4 = new ᛸᲁᛵ
            r4.<init>()
            long r10 = (long) r2
            r8.m3644(r10)
            r8.mo782(r10, r4)
            ᛴᛴᛸᛴ r8 = r9.f10207
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = r9.f10214
            r1.append(r5)
            r5 = 91
            r1.append(r5)
            r1.append(r3)
            java.lang.String r5 = "] onData"
            r1.append(r5)
            java.lang.String r10 = r1.toString()
            ᲇᛳᲈ r1 = new ᲇᛳᲈ
            r5 = r2
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            defpackage.C0658.m1488(r8, r10, r1)
            goto L119
        L72:
            ᲁᲈᛲᛱ r9 = r9.m3863(r3)
            if (r9 != 0) goto L89
            ᲈᲈ r4 = r1.f4438
            r5 = 2
            r4.m3859(r3, r5)
            ᲈᲈ r1 = r1.f4438
            long r2 = (long) r2
            r1.m3857(r2)
            r8.m3647(r2)
            goto L119
        L89:
            java.util.TimeZone r1 = defpackage.AbstractC0508.f2501
            ᛵᲁᛵᛴ r1 = r9.f8519
            long r2 = (long) r2
            r1.getClass()
            r10 = r2
        L92:
            r12 = 0
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            ᲁᲈᛲᛱ r15 = r1.f4321
            if (r14 <= 0) goto L101
            monitor-enter(r15)
            boolean r14 = r1.f4323     // Catch: java.lang.Throwable -> Lfe
            ᛸᲁᛵ r5 = r1.f4325     // Catch: java.lang.Throwable -> Lfe
            r17 = r12
            long r12 = r5.f6928     // Catch: java.lang.Throwable -> Lfe
            long r12 = r12 + r10
            long r4 = r1.f4324     // Catch: java.lang.Throwable -> Lfe
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 <= 0) goto Lac
            r4 = 1
            goto Lad
        Lac:
            r4 = 0
        Lad:
            monitor-exit(r15)
            if (r4 == 0) goto Lba
            r8.m3647(r10)
            ᲁᲈᛲᛱ r1 = r1.f4321
            r2 = 4
            r1.m3375(r2)
            goto L111
        Lba:
            if (r14 == 0) goto Lc0
            r8.m3647(r10)
            goto L111
        Lc0:
            ᛸᲁᛵ r4 = r1.f4322
            long r4 = r8.mo782(r10, r4)
            r12 = -1
            int r12 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r12 == 0) goto Lf8
            long r10 = r10 - r4
            ᲁᲈᛲᛱ r4 = r1.f4321
            monitor-enter(r4)
            boolean r5 = r1.f4326     // Catch: java.lang.Throwable -> Ldc
            if (r5 == 0) goto Lde
            ᛸᲁᛵ r5 = r1.f4322     // Catch: java.lang.Throwable -> Ldc
            long r12 = r5.f6928     // Catch: java.lang.Throwable -> Ldc
            r5.m2847(r12)     // Catch: java.lang.Throwable -> Ldc
            goto Lf3
        Ldc:
            r0 = move-exception
            goto Lf6
        Lde:
            ᛸᲁᛵ r5 = r1.f4325     // Catch: java.lang.Throwable -> Ldc
            long r12 = r5.f6928     // Catch: java.lang.Throwable -> Ldc
            int r12 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r12 != 0) goto Le8
            r12 = 1
            goto Le9
        Le8:
            r12 = 0
        Le9:
            ᛸᲁᛵ r13 = r1.f4322     // Catch: java.lang.Throwable -> Ldc
            r5.m2836(r13)     // Catch: java.lang.Throwable -> Ldc
            if (r12 == 0) goto Lf3
            r4.notifyAll()     // Catch: java.lang.Throwable -> Ldc
        Lf3:
            monitor-exit(r4)
            r4 = 1
            goto L92
        Lf6:
            monitor-exit(r4)
            throw r0
        Lf8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        Lfe:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L101:
            java.util.TimeZone r4 = defpackage.AbstractC0508.f2501
            ᲈᲈ r4 = r15.f8517
            r4.m3857(r2)
            ᲁᲈᛲᛱ r1 = r1.f4321
            ᲈᲈ r1 = r1.f8517
            ᲁᛲᲈᛱ r1 = r1.f10225
            r1.getClass()
        L111:
            if (r6 == 0) goto L119
            ᛱᛱᛷᛳ r1 = defpackage.C0024.f465
            r4 = 1
            r9.m3379(r1, r4)
        L119:
            ᲈᛵᲈᛵ r0 = r0.f5667
            long r1 = (long) r7
            r0.m3647(r1)
            return
        L120:
            java.lang.String r0 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            defpackage.C2264.m3682(r0)
            return
        L126:
            java.lang.String r0 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            defpackage.C2264.m3682(r0)
            return
    }
}
