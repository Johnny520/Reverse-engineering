package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛱᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0331 implements java.io.Closeable {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final java.util.logging.Logger f1243 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0976 f1244;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0887 f1245;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.C0223 f1246;

    static {
            java.lang.Class<xhss.ᲁᛱᛱᲇ> r0 = xhss.AbstractC0922.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            xhss.C0331.f1243 = r0
            return
    }

    public C0331(xhss.C0976 r2) {
            r1 = this;
            r1.<init>()
            r1.f1244 = r2
            xhss.ᲀᛸᲀᛳ r0 = new xhss.ᲀᛸᲀᛳ
            r0.<init>(r2)
            r1.f1245 = r0
            xhss.ᛲᲈᛵᛶ r2 = new xhss.ᛲᲈᛵᛶ
            r2.<init>(r0)
            r1.f1246 = r2
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            xhss.ᲁᛸᛵᛳ r0 = r0.f1244
            r0.close()
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final boolean m669(boolean r17, xhss.C0770 r18) {
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = 0
            xhss.ᲁᛸᛵᛳ r3 = r0.f1244     // Catch: java.io.EOFException -> L35b
            r4 = 9
            r3.m1609(r4)     // Catch: java.io.EOFException -> L35b
            xhss.ᲁᛸᛵᛳ r3 = r0.f1244
            int r3 = xhss.AbstractC0577.m1049(r3)
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r3 > r4) goto L352
            xhss.ᲁᛸᛵᛳ r5 = r0.f1244
            byte r5 = r5.m1615()
            r5 = r5 & 255(0xff, float:3.57E-43)
            xhss.ᲁᛸᛵᛳ r6 = r0.f1244
            byte r6 = r6.m1615()
            r7 = r6 & 255(0xff, float:3.57E-43)
            xhss.ᲁᛸᛵᛳ r8 = r0.f1244
            int r8 = r8.m1611()
            r9 = 2147483647(0x7fffffff, float:NaN)
            r9 = r9 & r8
            r10 = 8
            r11 = 1
            if (r5 == r10) goto L46
            java.util.logging.Logger r12 = xhss.C0331.f1243
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r13 = r12.isLoggable(r13)
            if (r13 == 0) goto L46
            java.lang.String r13 = xhss.AbstractC0922.m1517(r11, r9, r3, r5, r7)
            r12.fine(r13)
        L46:
            r12 = 4
            if (r17 == 0) goto L64
            if (r5 != r12) goto L4c
            goto L64
        L4c:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Expected a SETTINGS frame but was "
            java.lang.String r2 = xhss.AbstractC0922.m1519(r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L64:
            r13 = 3
            r15 = 5
            r17 = 14
            r14 = 2
            switch(r5) {
                case 0: goto L34e;
                case 1: goto L34a;
                case 2: goto L31e;
                case 3: goto L28c;
                case 4: goto L1e8;
                case 5: goto L1e4;
                case 6: goto L17a;
                case 7: goto Le7;
                case 8: goto L73;
                default: goto L6c;
            }
        L6c:
            xhss.ᲁᛸᛵᛳ r0 = r0.f1244
            long r1 = (long) r3
            r0.m1612(r1)
            return r11
        L73:
            java.lang.String r2 = "TYPE_WINDOW_UPDATE length !=4: "
            if (r3 != r12) goto Lcb
            xhss.ᲁᛸᛵᛳ r0 = r0.f1244     // Catch: java.lang.Exception -> Lc9
            int r0 = r0.m1611()     // Catch: java.lang.Exception -> Lc9
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r12 = (long) r0
            long r4 = r4 & r12
            r12 = 0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 == 0) goto Lc1
            java.util.logging.Logger r2 = xhss.C0331.f1243
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            boolean r6 = r2.isLoggable(r6)
            if (r6 == 0) goto L99
            java.lang.String r3 = xhss.AbstractC0922.m1518(r11, r9, r3, r4)
            r2.fine(r3)
        L99:
            xhss.ᲁᛲᛵ r1 = r1.f2545
            if (r9 != 0) goto Lab
            monitor-enter(r1)
            long r2 = r1.f3010     // Catch: java.lang.Throwable -> La8
            long r2 = r2 + r4
            r1.f3010 = r2     // Catch: java.lang.Throwable -> La8
            r1.notifyAll()     // Catch: java.lang.Throwable -> La8
            monitor-exit(r1)
            return r11
        La8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        Lab:
            xhss.ᛸᛳᛴ r1 = r1.m1521(r9)
            if (r1 == 0) goto L2f4
            monitor-enter(r1)
            long r2 = r1.f2488     // Catch: java.lang.Throwable -> Lbe
            long r2 = r2 + r4
            r1.f2488 = r2     // Catch: java.lang.Throwable -> Lbe
            if (r0 <= 0) goto Lbc
            r1.notifyAll()     // Catch: java.lang.Throwable -> Lbe
        Lbc:
            monitor-exit(r1)
            return r11
        Lbe:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        Lc1:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Exception -> Lc9
            java.lang.String r1 = "windowSizeIncrement was 0"
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lc9
            throw r0     // Catch: java.lang.Exception -> Lc9
        Lc9:
            r0 = move-exception
            goto Ldd
        Lcb:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Exception -> Lc9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc9
            r1.<init>(r2)     // Catch: java.lang.Exception -> Lc9
            r1.append(r3)     // Catch: java.lang.Exception -> Lc9
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Lc9
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lc9
            throw r0     // Catch: java.lang.Exception -> Lc9
        Ldd:
            java.util.logging.Logger r1 = xhss.C0331.f1243
            java.lang.String r2 = xhss.AbstractC0922.m1517(r11, r9, r3, r10, r7)
            r1.fine(r2)
            throw r0
        Le7:
            if (r3 < r10) goto L170
            if (r9 != 0) goto L16a
            xhss.ᲁᛸᛵᛳ r4 = r0.f1244
            int r4 = r4.m1611()
            xhss.ᲁᛸᛵᛳ r5 = r0.f1244
            int r5 = r5.m1611()
            int r3 = r3 - r10
            int[] r6 = xhss.AbstractC0390.m769(r17)
            int r7 = r6.length
            r8 = r2
        Lfe:
            if (r8 >= r7) goto L10c
            r9 = r6[r8]
            int r12 = xhss.AbstractC0390.m784(r9)
            if (r12 != r5) goto L109
            goto L10d
        L109:
            int r8 = r8 + 1
            goto Lfe
        L10c:
            r9 = r2
        L10d:
            if (r9 == 0) goto L160
            xhss.ᛳᛶᲈᲈ r5 = xhss.C0289.f1117
            if (r3 <= 0) goto L11a
            xhss.ᲁᛸᛵᛳ r0 = r0.f1244
            long r5 = (long) r3
            xhss.ᛳᛶᲈᲈ r5 = r0.m1614(r5)
        L11a:
            r5.mo611()
            xhss.ᲁᛲᛵ r3 = r1.f2545
            monitor-enter(r3)
            java.util.LinkedHashMap r0 = r3.f2991     // Catch: java.lang.Throwable -> L15d
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L15d
            xhss.ᛸᛳᛴ[] r5 = new xhss.C0741[r2]     // Catch: java.lang.Throwable -> L15d
            java.lang.Object[] r0 = r0.toArray(r5)     // Catch: java.lang.Throwable -> L15d
            r3.f3004 = r11     // Catch: java.lang.Throwable -> L15d
            monitor-exit(r3)
            xhss.ᛸᛳᛴ[] r0 = (xhss.C0741[]) r0
            int r3 = r0.length
        L132:
            if (r2 >= r3) goto L2f4
            r5 = r0[r2]
            int r6 = r5.f2478
            if (r6 <= r4) goto L15a
            boolean r6 = r5.m1282()
            if (r6 == 0) goto L15a
            monitor-enter(r5)
            int r6 = r5.m1283()     // Catch: java.lang.Throwable -> L14d
            if (r6 != 0) goto L14f
            r5.f2484 = r10     // Catch: java.lang.Throwable -> L14d
            r5.notifyAll()     // Catch: java.lang.Throwable -> L14d
            goto L14f
        L14d:
            r0 = move-exception
            goto L158
        L14f:
            monitor-exit(r5)
            xhss.ᲁᛲᛵ r6 = r1.f2545
            int r5 = r5.f2478
            r6.m1526(r5)
            goto L15a
        L158:
            monitor-exit(r5)
            throw r0
        L15a:
            int r2 = r2 + 1
            goto L132
        L15d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L160:
            java.lang.String r0 = "TYPE_GOAWAY unexpected error code: "
            java.lang.String r0 = xhss.AbstractC0390.m774(r0, r5)
            xhss.C0532.m947(r0)
            return r2
        L16a:
            java.lang.String r0 = "TYPE_GOAWAY streamId != 0"
            xhss.C0532.m947(r0)
            return r2
        L170:
            java.lang.String r0 = "TYPE_GOAWAY length < 8: "
            java.lang.String r0 = xhss.AbstractC0390.m774(r0, r3)
            xhss.C0532.m947(r0)
            return r2
        L17a:
            if (r3 != r10) goto L1da
            if (r9 != 0) goto L1d4
            xhss.ᲁᛸᛵᛳ r3 = r0.f1244
            int r3 = r3.m1611()
            xhss.ᲁᛸᛵᛳ r0 = r0.f1244
            int r0 = r0.m1611()
            r4 = r6 & 1
            if (r4 == 0) goto L18f
            r2 = r11
        L18f:
            xhss.ᲁᛲᛵ r4 = r1.f2545
            if (r2 == 0) goto L1b2
            monitor-enter(r4)
            r0 = 1
            if (r3 == r11) goto L1a9
            if (r3 == r14) goto L1a3
            if (r3 == r13) goto L19d
            goto L1ae
        L19d:
            r4.notifyAll()     // Catch: java.lang.Throwable -> L1a1
            goto L1ae
        L1a1:
            r0 = move-exception
            goto L1b0
        L1a3:
            long r2 = r4.f2992     // Catch: java.lang.Throwable -> L1a1
            long r2 = r2 + r0
            r4.f2992 = r2     // Catch: java.lang.Throwable -> L1a1
            goto L1ae
        L1a9:
            long r2 = r4.f3001     // Catch: java.lang.Throwable -> L1a1
            long r2 = r2 + r0
            r4.f3001 = r2     // Catch: java.lang.Throwable -> L1a1
        L1ae:
            monitor-exit(r4)
            return r11
        L1b0:
            monitor-exit(r4)
            throw r0
        L1b2:
            xhss.ᲇᲀᲀᛷ r2 = r4.f2998
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            xhss.ᲁᛲᛵ r5 = r1.f2545
            java.lang.String r5 = r5.f3007
            r4.append(r5)
            java.lang.String r5 = " ping"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            xhss.ᲁᛲᛵ r1 = r1.f2545
            xhss.ᲈᛸᛲᛱ r5 = new xhss.ᲈᛸᛲᛱ
            r5.<init>(r1, r3, r0, r11)
            xhss.C1081.m1738(r2, r4, r5)
            return r11
        L1d4:
            java.lang.String r0 = "TYPE_PING streamId != 0"
            xhss.C0532.m947(r0)
            return r2
        L1da:
            java.lang.String r0 = "TYPE_PING length != 8: "
            java.lang.String r0 = xhss.AbstractC0390.m774(r0, r3)
            xhss.C0532.m947(r0)
            return r2
        L1e4:
            r0.m671(r1, r3, r7, r9)
            return r11
        L1e8:
            xhss.ᲁᛸᛵᛳ r0 = r0.f1244
            if (r9 != 0) goto L286
            r5 = r6 & 1
            if (r5 == 0) goto L1fa
            if (r3 != 0) goto L1f4
            goto L2f4
        L1f4:
            java.lang.String r0 = "FRAME_SIZE_ERROR ack frame should be empty!"
            xhss.C0532.m947(r0)
            return r2
        L1fa:
            int r5 = r3 % 6
            if (r5 != 0) goto L27c
            xhss.ᛴᲇᛳᲇ r5 = new xhss.ᛴᲇᛳᲇ
            r5.<init>()
            xhss.ᛱᛲᲇᲀ r3 = xhss.AbstractC0473.m855(r2, r3)
            r6 = 6
            xhss.ᲁᛵᛶᲁ r3 = xhss.AbstractC0473.m869(r3, r6)
            int r6 = r3.f3090
            int r7 = r3.f3091
            int r3 = r3.f3092
            if (r3 <= 0) goto L216
            if (r6 <= r7) goto L21a
        L216:
            if (r3 >= 0) goto L25c
            if (r7 > r6) goto L25c
        L21a:
            short r8 = r0.m1613()
            byte[] r9 = xhss.AbstractC0577.f2010
            r9 = 65535(0xffff, float:9.1834E-41)
            r8 = r8 & r9
            int r9 = r0.m1611()
            if (r8 == r14) goto L24a
            if (r8 == r12) goto L241
            if (r8 == r15) goto L22f
            goto L255
        L22f:
            if (r9 < r4) goto L237
            r10 = 16777215(0xffffff, float:2.3509886E-38)
            if (r9 > r10) goto L237
            goto L255
        L237:
            java.lang.String r0 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            java.lang.String r0 = xhss.AbstractC0390.m774(r0, r9)
            xhss.C0532.m947(r0)
            return r2
        L241:
            if (r9 < 0) goto L244
            goto L255
        L244:
            java.lang.String r0 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            xhss.C0532.m947(r0)
            return r2
        L24a:
            if (r9 == 0) goto L255
            if (r9 != r11) goto L24f
            goto L255
        L24f:
            java.lang.String r0 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            xhss.C0532.m947(r0)
            return r2
        L255:
            r5.m804(r8, r9)
            if (r6 == r7) goto L25c
            int r6 = r6 + r3
            goto L21a
        L25c:
            xhss.ᲁᛲᛵ r0 = r1.f2545
            xhss.ᲇᲀᲀᛷ r2 = r0.f2998
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = r0.f3007
            r3.append(r0)
            java.lang.String r0 = " applyAndAckSettings"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            xhss.ᛱᲀᲇᛸ r3 = new xhss.ᛱᲀᲇᛸ
            r3.<init>(r13, r1, r5)
            xhss.C1081.m1738(r2, r0, r3)
            return r11
        L27c:
            java.lang.String r0 = "TYPE_SETTINGS length % 6 != 0: "
            java.lang.String r0 = xhss.AbstractC0390.m774(r0, r3)
            xhss.C0532.m947(r0)
            return r2
        L286:
            java.lang.String r0 = "TYPE_SETTINGS streamId != 0"
            xhss.C0532.m947(r0)
            return r2
        L28c:
            if (r3 != r12) goto L305
            if (r9 == 0) goto L2ff
            xhss.ᲁᛸᛵᛳ r0 = r0.f1244
            int r0 = r0.m1611()
            int[] r3 = xhss.AbstractC0390.m769(r17)
            int r4 = r3.length
            r5 = r2
        L29c:
            if (r5 >= r4) goto L2aa
            r6 = r3[r5]
            int r7 = xhss.AbstractC0390.m784(r6)
            if (r7 != r0) goto L2a7
            goto L2ab
        L2a7:
            int r5 = r5 + 1
            goto L29c
        L2aa:
            r6 = r2
        L2ab:
            if (r6 == 0) goto L2f5
            xhss.ᲁᛲᛵ r0 = r1.f2545
            if (r9 == 0) goto L2db
            r1 = r8 & 1
            if (r1 != 0) goto L2db
            xhss.ᲇᲀᲀᛷ r1 = r0.f3002
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.f3007
            r2.append(r3)
            r3 = 91
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = "] onReset"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            xhss.ᛱᛸᲈᛶ r3 = new xhss.ᛱᛸᲈᛶ
            r3.<init>(r0, r9, r6)
            xhss.C1081.m1738(r1, r2, r3)
            return r11
        L2db:
            xhss.ᛸᛳᛴ r1 = r0.m1526(r9)
            if (r1 == 0) goto L2f4
            monitor-enter(r1)
            int r0 = r1.m1283()     // Catch: java.lang.Throwable -> L2ee
            if (r0 != 0) goto L2f0
            r1.f2484 = r6     // Catch: java.lang.Throwable -> L2ee
            r1.notifyAll()     // Catch: java.lang.Throwable -> L2ee
            goto L2f0
        L2ee:
            r0 = move-exception
            goto L2f2
        L2f0:
            monitor-exit(r1)
            return r11
        L2f2:
            monitor-exit(r1)
            throw r0
        L2f4:
            return r11
        L2f5:
            java.lang.String r1 = "TYPE_RST_STREAM unexpected error code: "
            java.lang.String r0 = xhss.AbstractC0390.m774(r1, r0)
            xhss.C0532.m947(r0)
            return r2
        L2ff:
            java.lang.String r0 = "TYPE_RST_STREAM streamId == 0"
            xhss.C0532.m947(r0)
            return r2
        L305:
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
        L31e:
            if (r3 != r15) goto L331
            if (r9 == 0) goto L32b
            xhss.ᲁᛸᛵᛳ r0 = r0.f1244
            r0.m1611()
            r0.m1615()
            return r11
        L32b:
            java.lang.String r0 = "TYPE_PRIORITY streamId == 0"
            xhss.C0532.m947(r0)
            return r2
        L331:
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
        L34a:
            r0.m672(r1, r3, r7, r9)
            return r11
        L34e:
            r0.m670(r1, r3, r7, r9)
            return r11
        L352:
            java.lang.String r0 = "FRAME_SIZE_ERROR: "
            java.lang.String r0 = xhss.AbstractC0390.m774(r0, r3)
            xhss.C0532.m947(r0)
        L35b:
            return r2
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final void m670(xhss.C0770 r17, int r18, int r19, int r20) {
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
            xhss.ᲁᛸᛵᛳ r7 = r0.f1244
            byte r7 = r7.m1615()
            byte[] r8 = xhss.AbstractC0577.f2010
            r7 = r7 & 255(0xff, float:3.57E-43)
        L25:
            r8 = r18
            goto L2a
        L28:
            r7 = 0
            goto L25
        L2a:
            int r2 = xhss.AbstractC0485.m890(r8, r2, r7)
            xhss.ᲁᛸᛵᛳ r8 = r0.f1244
            xhss.ᲁᛲᛵ r9 = r1.f2545
            if (r3 == 0) goto L3a
            r10 = r3 & 1
            if (r10 != 0) goto L3a
            r10 = r4
            goto L3b
        L3a:
            r10 = 0
        L3b:
            if (r10 == 0) goto L72
            xhss.ᛴᛲᛴᛶ r4 = new xhss.ᛴᛲᛴᛶ
            r4.<init>()
            long r10 = (long) r2
            r8.m1609(r10)
            r8.mo235(r10, r4)
            xhss.ᲇᲀᲀᛷ r8 = r9.f3002
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = r9.f3007
            r1.append(r5)
            r5 = 91
            r1.append(r5)
            r1.append(r3)
            java.lang.String r5 = "] onData"
            r1.append(r5)
            java.lang.String r10 = r1.toString()
            xhss.ᲈᛲᲈᛶ r1 = new xhss.ᲈᛲᲈᛶ
            r5 = r2
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            xhss.C1081.m1738(r8, r10, r1)
            goto L119
        L72:
            xhss.ᛸᛳᛴ r9 = r9.m1521(r3)
            if (r9 != 0) goto L89
            xhss.ᲁᛲᛵ r4 = r1.f2545
            r5 = 2
            r4.m1524(r3, r5)
            xhss.ᲁᛲᛵ r1 = r1.f2545
            long r2 = (long) r2
            r1.m1523(r2)
            r8.m1612(r2)
            goto L119
        L89:
            java.util.TimeZone r1 = xhss.AbstractC0559.f1984
            xhss.ᛱᲀᲇᛳ r1 = r9.f2482
            long r2 = (long) r2
            r1.getClass()
            r10 = r2
        L92:
            r12 = 0
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            xhss.ᛸᛳᛴ r15 = r1.f442
            if (r14 <= 0) goto L101
            monitor-enter(r15)
            boolean r14 = r1.f440     // Catch: java.lang.Throwable -> Lfe
            xhss.ᛴᛲᛴᛶ r5 = r1.f441     // Catch: java.lang.Throwable -> Lfe
            r17 = r12
            long r12 = r5.f1261     // Catch: java.lang.Throwable -> Lfe
            long r12 = r12 + r10
            long r4 = r1.f439     // Catch: java.lang.Throwable -> Lfe
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 <= 0) goto Lac
            r4 = 1
            goto Lad
        Lac:
            r4 = 0
        Lad:
            monitor-exit(r15)
            if (r4 == 0) goto Lba
            r8.m1612(r10)
            xhss.ᛸᛳᛴ r1 = r1.f442
            r2 = 4
            r1.m1285(r2)
            goto L111
        Lba:
            if (r14 == 0) goto Lc0
            r8.m1612(r10)
            goto L111
        Lc0:
            xhss.ᛴᛲᛴᛶ r4 = r1.f443
            long r4 = r8.mo235(r10, r4)
            r12 = -1
            int r12 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r12 == 0) goto Lf8
            long r10 = r10 - r4
            xhss.ᛸᛳᛴ r4 = r1.f442
            monitor-enter(r4)
            boolean r5 = r1.f444     // Catch: java.lang.Throwable -> Ldc
            if (r5 == 0) goto Lde
            xhss.ᛴᛲᛴᛶ r5 = r1.f443     // Catch: java.lang.Throwable -> Ldc
            long r12 = r5.f1261     // Catch: java.lang.Throwable -> Ldc
            r5.m696(r12)     // Catch: java.lang.Throwable -> Ldc
            goto Lf3
        Ldc:
            r0 = move-exception
            goto Lf6
        Lde:
            xhss.ᛴᛲᛴᛶ r5 = r1.f441     // Catch: java.lang.Throwable -> Ldc
            long r12 = r5.f1261     // Catch: java.lang.Throwable -> Ldc
            int r12 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r12 != 0) goto Le8
            r12 = 1
            goto Le9
        Le8:
            r12 = 0
        Le9:
            xhss.ᛴᛲᛴᛶ r13 = r1.f443     // Catch: java.lang.Throwable -> Ldc
            r5.m706(r13)     // Catch: java.lang.Throwable -> Ldc
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
            java.util.TimeZone r4 = xhss.AbstractC0559.f1984
            xhss.ᲁᛲᛵ r4 = r15.f2479
            r4.m1523(r2)
            xhss.ᛸᛳᛴ r1 = r1.f442
            xhss.ᲁᛲᛵ r1 = r1.f2479
            xhss.ᛵᛷᛷᲀ r1 = r1.f3000
            r1.getClass()
        L111:
            if (r6 == 0) goto L119
            xhss.ᲁᛸᛱᛵ r1 = xhss.C0972.f3172
            r4 = 1
            r9.m1287(r1, r4)
        L119:
            xhss.ᲁᛸᛵᛳ r0 = r0.f1244
            long r1 = (long) r7
            r0.m1612(r1)
            return
        L120:
            java.lang.String r0 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            xhss.C0532.m947(r0)
            return
        L126:
            java.lang.String r0 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            xhss.C0532.m947(r0)
            return
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final void m671(xhss.C0770 r4, int r5, int r6, int r7) {
            r3 = this;
            if (r7 == 0) goto L6f
            r0 = r6 & 8
            if (r0 == 0) goto L11
            xhss.ᲁᛸᛵᛳ r0 = r3.f1244
            byte r0 = r0.m1615()
            byte[] r1 = xhss.AbstractC0577.f2010
            r0 = r0 & 255(0xff, float:3.57E-43)
            goto L12
        L11:
            r0 = 0
        L12:
            xhss.ᲁᛸᛵᛳ r1 = r3.f1244
            int r1 = r1.m1611()
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r2
            int r5 = r5 + (-4)
            int r5 = xhss.AbstractC0485.m890(r5, r6, r0)
            java.util.List r3 = r3.m673(r5, r0, r6, r7)
            xhss.ᲁᛲᛵ r4 = r4.f2545
            monitor-enter(r4)
            java.util.LinkedHashSet r5 = r4.f2989     // Catch: java.lang.Throwable -> L3b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L3b
            boolean r5 = r5.contains(r6)     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L3d
            r3 = 2
            r4.m1524(r1, r3)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r4)
            return
        L3b:
            r3 = move-exception
            goto L6d
        L3d:
            java.util.LinkedHashSet r5 = r4.f2989     // Catch: java.lang.Throwable -> L3b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L3b
            r5.add(r6)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r4)
            xhss.ᲇᲀᲀᛷ r5 = r4.f3002
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r4.f3007
            r6.append(r7)
            r7 = 91
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = "] onRequest"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            xhss.ᛱᛸᲈᛶ r7 = new xhss.ᛱᛸᲈᛶ
            r7.<init>(r4, r1, r3)
            xhss.C1081.m1738(r5, r6, r7)
            return
        L6d:
            monitor-exit(r4)
            throw r3
        L6f:
            java.lang.String r3 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            xhss.C0532.m947(r3)
            return
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final void m672(xhss.C0770 r10, int r11, int r12, int r13) {
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
            xhss.ᲁᛸᛵᛳ r0 = r9.f1244
            byte r0 = r0.m1615()
            byte[] r3 = xhss.AbstractC0577.f2010
            r0 = r0 & 255(0xff, float:3.57E-43)
            goto L1b
        L1a:
            r0 = r1
        L1b:
            r3 = r12 & 32
            if (r3 == 0) goto L2b
            xhss.ᲁᛸᛵᛳ r3 = r9.f1244
            r3.m1611()
            r3.m1615()
            byte[] r3 = xhss.AbstractC0577.f2010
            int r11 = r11 + (-5)
        L2b:
            int r11 = xhss.AbstractC0485.m890(r11, r12, r0)
            java.util.List r9 = r9.m673(r11, r0, r12, r13)
            xhss.ᲁᛲᛵ r5 = r10.f2545
            if (r13 == 0) goto L3c
            r10 = r13 & 1
            if (r10 != 0) goto L3c
            r1 = r2
        L3c:
            r10 = 91
            if (r1 == 0) goto L64
            xhss.ᲇᲀᲀᛷ r11 = r5.f3002
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = r5.f3007
            r12.append(r0)
            r12.append(r10)
            r12.append(r13)
            java.lang.String r10 = "] onHeaders"
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            xhss.ᛱᛸᲈᛶ r12 = new xhss.ᛱᛸᲈᛶ
            r12.<init>(r5, r13, r9, r7)
            xhss.C1081.m1738(r11, r10, r12)
            return
        L64:
            monitor-enter(r5)
            xhss.ᛸᛳᛴ r11 = r5.m1521(r13)     // Catch: java.lang.Throwable -> Lc0
            if (r11 != 0) goto Lc3
            boolean r11 = r5.f3004     // Catch: java.lang.Throwable -> Lc0
            if (r11 == 0) goto L71
            monitor-exit(r5)
            return
        L71:
            int r11 = r5.f2995     // Catch: java.lang.Throwable -> Lc0
            if (r13 > r11) goto L77
            monitor-exit(r5)
            return
        L77:
            int r11 = r13 % 2
            int r12 = r5.f3008     // Catch: java.lang.Throwable -> Lc0
            r0 = 2
            int r12 = r12 % r0
            if (r11 != r12) goto L81
            monitor-exit(r5)
            return
        L81:
            xhss.ᲁᛸᛱᛵ r8 = xhss.AbstractC0559.m993(r9)     // Catch: java.lang.Throwable -> Lc0
            xhss.ᛸᛳᛴ r3 = new xhss.ᛸᛳᛴ     // Catch: java.lang.Throwable -> Lc0
            r6 = 0
            r4 = r13
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lc0
            r5.f2995 = r4     // Catch: java.lang.Throwable -> Lc0
            java.util.LinkedHashMap r9 = r5.f2991     // Catch: java.lang.Throwable -> Lc0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lc0
            r9.put(r11, r3)     // Catch: java.lang.Throwable -> Lc0
            xhss.ᛸᛱᛴᛳ r9 = r5.f2999     // Catch: java.lang.Throwable -> Lc0
            xhss.ᲇᲀᲀᛷ r9 = r9.m1271()     // Catch: java.lang.Throwable -> Lc0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc0
            r11.<init>()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r12 = r5.f3007     // Catch: java.lang.Throwable -> Lc0
            r11.append(r12)     // Catch: java.lang.Throwable -> Lc0
            r11.append(r10)     // Catch: java.lang.Throwable -> Lc0
            r11.append(r4)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r10 = "] onStream"
            r11.append(r10)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> Lc0
            xhss.ᛱᲀᲇᛸ r11 = new xhss.ᛱᲀᲇᛸ     // Catch: java.lang.Throwable -> Lc0
            r11.<init>(r0, r5, r3)     // Catch: java.lang.Throwable -> Lc0
            xhss.C1081.m1738(r9, r10, r11)     // Catch: java.lang.Throwable -> Lc0
            monitor-exit(r5)
            return
        Lc0:
            r0 = move-exception
            r9 = r0
            goto Lcc
        Lc3:
            monitor-exit(r5)
            xhss.ᲁᛸᛱᛵ r9 = xhss.AbstractC0559.m993(r9)
            r11.m1287(r9, r7)
            return
        Lcc:
            monitor-exit(r5)
            throw r9
        Lce:
            java.lang.String r9 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            xhss.C0532.m947(r9)
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.util.List m673(int r3, int r4, int r5, int r6) {
            r2 = this;
            xhss.ᲀᛸᲀᛳ r0 = r2.f1245
            r0.f2863 = r3
            r0.f2865 = r4
            r0.f2862 = r5
            r0.f2864 = r6
            xhss.ᛲᲈᛵᛶ r2 = r2.f1246
            xhss.ᲁᛸᛵᛳ r3 = r2.f834
        Le:
            boolean r4 = r3.m1606()
            if (r4 != 0) goto L11c
            byte r4 = r3.m1615()
            byte[] r5 = xhss.AbstractC0577.f2010
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 0
            r0 = 128(0x80, float:1.8E-43)
            if (r5 == r0) goto L116
            r1 = r4 & 128(0x80, float:1.8E-43)
            if (r1 != r0) goto L5c
            r4 = 127(0x7f, float:1.78E-43)
            int r4 = r2.m491(r5, r4)
            int r5 = r4 + (-1)
            if (r5 < 0) goto L3c
            xhss.ᛱᛵᲀᛱ[] r0 = xhss.AbstractC0907.f2936
            int r1 = r0.length
            int r1 = r1 + (-1)
            if (r5 > r1) goto L3c
            r4 = r0[r5]
            r2.m489(r4)
            goto Le
        L3c:
            xhss.ᛱᛵᲀᛱ[] r0 = xhss.AbstractC0907.f2936
            int r0 = r0.length
            int r5 = r5 - r0
            int r0 = r2.f835
            int r0 = r0 + 1
            int r0 = r0 + r5
            if (r0 < 0) goto L52
            xhss.ᛱᛵᲀᛱ[] r5 = r2.f830
            int r1 = r5.length
            if (r0 >= r1) goto L52
            r4 = r5[r0]
            r2.m489(r4)
            goto Le
        L52:
            java.lang.String r2 = "Header index too large "
            java.lang.String r2 = xhss.AbstractC0390.m774(r2, r4)
            xhss.C0532.m947(r2)
            return r6
        L5c:
            r0 = 64
            if (r5 != r0) goto L76
            xhss.ᛱᛵᲀᛱ[] r4 = xhss.AbstractC0907.f2936
            xhss.ᛳᛶᲈᲈ r4 = r2.m488()
            xhss.AbstractC0907.m1462(r4)
            xhss.ᛳᛶᲈᲈ r5 = r2.m488()
            xhss.ᛱᛵᲀᛱ r6 = new xhss.ᛱᛵᲀᛱ
            r6.<init>(r4, r5)
            r2.m490(r6)
            goto Le
        L76:
            r1 = r4 & 64
            if (r1 != r0) goto L94
            r4 = 63
            int r4 = r2.m491(r5, r4)
            int r4 = r4 + (-1)
            xhss.ᛳᛶᲈᲈ r4 = r2.m487(r4)
            xhss.ᛳᛶᲈᲈ r5 = r2.m488()
            xhss.ᛱᛵᲀᛱ r6 = new xhss.ᛱᛵᲀᛱ
            r6.<init>(r4, r5)
            r2.m490(r6)
            goto Le
        L94:
            r4 = r4 & 32
            r0 = 32
            if (r4 != r0) goto Lde
            r4 = 31
            int r4 = r2.m491(r5, r4)
            r2.f831 = r4
            if (r4 < 0) goto Lc8
            r5 = 4096(0x1000, float:5.74E-42)
            if (r4 > r5) goto Lc8
            int r5 = r2.f832
            if (r4 >= r5) goto Le
            if (r4 != 0) goto Lc2
            xhss.ᛱᛵᲀᛱ[] r4 = r2.f830
            int r5 = r4.length
            r0 = 0
            java.util.Arrays.fill(r4, r0, r5, r6)
            xhss.ᛱᛵᲀᛱ[] r4 = r2.f830
            int r4 = r4.length
            int r4 = r4 + (-1)
            r2.f835 = r4
            r2.f833 = r0
            r2.f832 = r0
            goto Le
        Lc2:
            int r5 = r5 - r4
            r2.m486(r5)
            goto Le
        Lc8:
            java.io.IOException r3 = new java.io.IOException
            int r2 = r2.f831
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
            int r4 = r2.m491(r5, r4)
            int r4 = r4 + (-1)
            xhss.ᛳᛶᲈᲈ r4 = r2.m487(r4)
            xhss.ᛳᛶᲈᲈ r5 = r2.m488()
            xhss.ᛱᛵᲀᛱ r6 = new xhss.ᛱᛵᲀᛱ
            r6.<init>(r4, r5)
            r2.m489(r6)
            goto Le
        Lff:
            xhss.ᛱᛵᲀᛱ[] r4 = xhss.AbstractC0907.f2936
            xhss.ᛳᛶᲈᲈ r4 = r2.m488()
            xhss.AbstractC0907.m1462(r4)
            xhss.ᛳᛶᲈᲈ r5 = r2.m488()
            xhss.ᛱᛵᲀᛱ r6 = new xhss.ᛱᛵᲀᛱ
            r6.<init>(r4, r5)
            r2.m489(r6)
            goto Le
        L116:
            java.lang.String r2 = "index == 0"
            xhss.C0532.m947(r2)
            return r6
        L11c:
            java.util.ArrayList r3 = r2.f828
            java.util.List r4 = xhss.AbstractC0713.m1243(r3)
            r3.clear()
            r5 = 0
            r2.f829 = r5
            return r4
    }
}
