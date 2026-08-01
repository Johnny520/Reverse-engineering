package xhss;

/* JADX INFO: renamed from: xhss.ᛳᲀᛲᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0305 implements xhss.InterfaceC0666 {

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static final java.util.List f1159 = null;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static final java.util.List f1160 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C1000 f1161;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0927 f1162;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final xhss.EnumC1122 f1163;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C1184 f1164;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public volatile xhss.C0741 f1165;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public volatile boolean f1166;

    static {
            java.lang.String r10 = ":scheme"
            java.lang.String r11 = ":authority"
            java.lang.String r0 = "connection"
            java.lang.String r1 = "host"
            java.lang.String r2 = "keep-alive"
            java.lang.String r3 = "proxy-connection"
            java.lang.String r4 = "te"
            java.lang.String r5 = "transfer-encoding"
            java.lang.String r6 = "encoding"
            java.lang.String r7 = "upgrade"
            java.lang.String r8 = ":method"
            java.lang.String r9 = ":path"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            java.util.List r0 = xhss.AbstractC0559.m992(r0)
            xhss.C0305.f1160 = r0
            java.lang.String r7 = "encoding"
            java.lang.String r8 = "upgrade"
            java.lang.String r1 = "connection"
            java.lang.String r2 = "host"
            java.lang.String r3 = "keep-alive"
            java.lang.String r4 = "proxy-connection"
            java.lang.String r5 = "te"
            java.lang.String r6 = "transfer-encoding"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8}
            java.util.List r0 = xhss.AbstractC0559.m992(r0)
            xhss.C0305.f1159 = r0
            return
    }

    public C0305(xhss.C0504 r1, xhss.C1184 r2, xhss.C1000 r3, xhss.C0927 r4) {
            r0 = this;
            r0.<init>()
            r0.f1164 = r2
            r0.f1161 = r3
            r0.f1162 = r4
            java.util.List r1 = r1.f1842
            xhss.ᲈᛲᛵᛴ r2 = xhss.EnumC1122.f3619
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L14
            goto L16
        L14:
            xhss.ᲈᛲᛵᛴ r2 = xhss.EnumC1122.f3621
        L16:
            r0.f1163 = r2
            return
    }

    @Override // xhss.InterfaceC0666
    public final void cancel() {
            r1 = this;
            r0 = 1
            r1.f1166 = r0
            xhss.ᛸᛳᛴ r1 = r1.f1165
            if (r1 == 0) goto Lc
            r0 = 9
            r1.m1285(r0)
        Lc:
            return
    }

    @Override // xhss.InterfaceC0666
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final boolean mo632() {
            r4 = this;
            xhss.ᛸᛳᛴ r4 = r4.f1165
            r0 = 0
            if (r4 == 0) goto L20
            monitor-enter(r4)
            xhss.ᛱᲀᲇᛳ r1 = r4.f2482     // Catch: java.lang.Throwable -> L17
            boolean r2 = r1.f440     // Catch: java.lang.Throwable -> L17
            r3 = 1
            if (r2 == 0) goto L19
            xhss.ᛴᛲᛴᛶ r1 = r1.f441     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.m683()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            r1 = r3
            goto L1a
        L17:
            r0 = move-exception
            goto L1e
        L19:
            r1 = r0
        L1a:
            monitor-exit(r4)
            if (r1 != r3) goto L20
            return r3
        L1e:
            monitor-exit(r4)
            throw r0
        L20:
            return r0
    }

    @Override // xhss.InterfaceC0666
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.InterfaceC0268 mo633() {
            r0 = this;
            xhss.ᛸᛳᛴ r0 = r0.f1165
            return r0
    }

    @Override // xhss.InterfaceC0666
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final long mo634(xhss.C0871 r1) {
            r0 = this;
            boolean r0 = xhss.AbstractC1109.m1806(r1)
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            long r0 = xhss.AbstractC0559.m988(r1)
            return r0
    }

    @Override // xhss.InterfaceC0666
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void mo635() {
            r0 = this;
            xhss.ᛸᛳᛴ r0 = r0.f1165
            xhss.ᲀᛲᲀᲁ r0 = r0.f2485
            r0.close()
            return
    }

    @Override // xhss.InterfaceC0666
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final xhss.C0270 mo636() {
            r10 = this;
            xhss.ᛸᛳᛴ r0 = r10.f1165
            r1 = 0
            if (r0 == 0) goto Lee
            monitor-enter(r0)
        L6:
            java.util.ArrayDeque r2 = r0.f2486     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L2f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L54
            int r2 = r0.m1283()     // Catch: java.lang.Throwable -> L2f
            if (r2 != 0) goto L54
            xhss.ᲁᛲᛵ r2 = r0.f2479     // Catch: java.lang.Throwable -> L2f
            r2.getClass()     // Catch: java.lang.Throwable -> L2f
            xhss.ᲀᛲᲀᲁ r2 = r0.f2485     // Catch: java.lang.Throwable -> L2f
            boolean r5 = r2.f2729     // Catch: java.lang.Throwable -> L2f
            if (r5 != 0) goto L27
            boolean r2 = r2.f2726     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L26
            goto L27
        L26:
            r3 = r4
        L27:
            if (r3 == 0) goto L32
            xhss.ᛵᛴᲇ r2 = r0.f2490     // Catch: java.lang.Throwable -> L2f
            r2.m1893()     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r10 = move-exception
            goto Lec
        L32:
            r0.wait()     // Catch: java.lang.Throwable -> L3d java.lang.InterruptedException -> L3f
            if (r3 == 0) goto L6
            xhss.ᛵᛴᲇ r2 = r0.f2490     // Catch: java.lang.Throwable -> L2f
            r2.m852()     // Catch: java.lang.Throwable -> L2f
            goto L6
        L3d:
            r10 = move-exception
            goto L4c
        L3f:
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L3d
            r10.interrupt()     // Catch: java.lang.Throwable -> L3d
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L3d
            r10.<init>()     // Catch: java.lang.Throwable -> L3d
            throw r10     // Catch: java.lang.Throwable -> L3d
        L4c:
            if (r3 == 0) goto L53
            xhss.ᛵᛴᲇ r1 = r0.f2490     // Catch: java.lang.Throwable -> L2f
            r1.m852()     // Catch: java.lang.Throwable -> L2f
        L53:
            throw r10     // Catch: java.lang.Throwable -> L2f
        L54:
            java.util.ArrayDeque r2 = r0.f2486     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L2f
            if (r2 != 0) goto Ldd
            java.util.ArrayDeque r2 = r0.f2486     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r2 = r2.removeFirst()     // Catch: java.lang.Throwable -> L2f
            xhss.ᲁᛸᛱᛵ r2 = (xhss.C0972) r2     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)
            xhss.ᲈᛲᛵᛴ r10 = r10.f1163
            java.util.ArrayList r0 = new java.util.ArrayList
            r5 = 20
            r0.<init>(r5)
            int r5 = r2.size()
            r6 = r4
        L73:
            if (r6 >= r5) goto La9
            java.lang.String r7 = xhss.AbstractC0694.m1204(r2, r6)
            java.lang.String r8 = xhss.AbstractC0694.m1219(r2, r6)
            java.lang.String r9 = ":status"
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L90
            java.lang.String r1 = "HTTP/1.1 "
            java.lang.String r1 = r1.concat(r8)
            xhss.ᛵᛶᛳ r1 = xhss.AbstractC0955.m1563(r1)
            goto La6
        L90:
            java.util.List r9 = xhss.C0305.f1159
            boolean r9 = r9.contains(r7)
            if (r9 != 0) goto La6
            r0.add(r7)
            java.lang.CharSequence r7 = xhss.AbstractC0120.m346(r8)
            java.lang.String r7 = r7.toString()
            r0.add(r7)
        La6:
            int r6 = r6 + 1
            goto L73
        La9:
            if (r1 == 0) goto Ld5
            xhss.ᛳᛵᛴ r2 = new xhss.ᛳᛵᛴ
            r2.<init>()
            r2.f1020 = r10
            int r10 = r1.f1741
            r2.f1021 = r10
            java.lang.Object r10 = r1.f1744
            java.lang.String r10 = (java.lang.String) r10
            r2.f1031 = r10
            java.lang.String[] r10 = new java.lang.String[r4]
            java.lang.Object[] r10 = r0.toArray(r10)
            java.lang.String[] r10 = (java.lang.String[]) r10
            xhss.ᛴᲈᛱᲁ r0 = new xhss.ᛴᲈᛱᲁ
            r0.<init>(r3)
            java.util.ArrayList r1 = r0.f1504
            java.util.List r10 = java.util.Arrays.asList(r10)
            r1.addAll(r10)
            r2.f1032 = r0
            return r2
        Ld5:
            java.net.ProtocolException r10 = new java.net.ProtocolException
            java.lang.String r0 = "Expected ':status' header not present"
            r10.<init>(r0)
            throw r10
        Ldd:
            java.io.IOException r10 = r0.f2489     // Catch: java.lang.Throwable -> L2f
            if (r10 == 0) goto Le2
            goto Leb
        Le2:
            xhss.ᛱᲁᛲᛱ r10 = new xhss.ᛱᲁᛲᛱ     // Catch: java.lang.Throwable -> L2f
            int r1 = r0.m1283()     // Catch: java.lang.Throwable -> L2f
            r10.<init>(r1)     // Catch: java.lang.Throwable -> L2f
        Leb:
            throw r10     // Catch: java.lang.Throwable -> L2f
        Lec:
            monitor-exit(r0)
            throw r10
        Lee:
            java.lang.String r10 = "stream wasn't created"
            xhss.C0532.m947(r10)
            return r1
    }

    @Override // xhss.InterfaceC0666
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final void mo637(xhss.C0355 r10) {
            r9 = this;
            xhss.ᛸᛳᛴ r0 = r9.f1165
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.Object r0 = r10.f1317
            xhss.ᲁᛸᛱᛵ r0 = (xhss.C0972) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + 4
            r1.<init>(r2)
            xhss.ᛱᛵᲀᛱ r2 = new xhss.ᛱᛵᲀᛱ
            xhss.ᛳᛶᲈᲈ r3 = xhss.C0047.f324
            java.lang.Object r4 = r10.f1314
            java.lang.String r4 = (java.lang.String) r4
            r2.<init>(r3, r4)
            r1.add(r2)
            xhss.ᛱᛵᲀᛱ r2 = new xhss.ᛱᛵᲀᛱ
            xhss.ᛳᛶᲈᲈ r3 = xhss.C0047.f322
            java.lang.Object r10 = r10.f1313
            xhss.ᛷᛶᲁᛵ r10 = (xhss.C0669) r10
            java.lang.String r4 = r10.m1154()
            java.lang.String r5 = r10.m1160()
            if (r5 == 0) goto L45
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            r4 = 63
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
        L45:
            r2.<init>(r3, r4)
            r1.add(r2)
            java.lang.String r2 = "Host"
            java.lang.String r2 = r0.m1605(r2)
            if (r2 == 0) goto L5d
            xhss.ᛱᛵᲀᛱ r3 = new xhss.ᛱᛵᲀᛱ
            xhss.ᛳᛶᲈᲈ r4 = xhss.C0047.f320
            r3.<init>(r4, r2)
            r1.add(r3)
        L5d:
            xhss.ᛱᛵᲀᛱ r2 = new xhss.ᛱᛵᲀᛱ
            xhss.ᛳᛶᲈᲈ r3 = xhss.C0047.f321
            java.lang.String r10 = r10.f2285
            r2.<init>(r3, r10)
            r1.add(r2)
            int r10 = r0.size()
            r2 = 0
        L6e:
            if (r2 >= r10) goto La5
            java.lang.String r3 = xhss.AbstractC0694.m1204(r0, r2)
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r4)
            java.util.List r4 = xhss.C0305.f1160
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L96
            java.lang.String r4 = "te"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto La2
            java.lang.String r4 = xhss.AbstractC0694.m1219(r0, r2)
            java.lang.String r5 = "trailers"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto La2
        L96:
            xhss.ᛱᛵᲀᛱ r4 = new xhss.ᛱᛵᲀᛱ
            java.lang.String r5 = xhss.AbstractC0694.m1219(r0, r2)
            r4.<init>(r3, r5)
            r1.add(r4)
        La2:
            int r2 = r2 + 1
            goto L6e
        La5:
            xhss.ᲁᛲᛵ r5 = r9.f1162
            xhss.ᲀᛱᛶᛳ r10 = r5.f3003
            monitor-enter(r10)
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L112
            int r0 = r5.f3008     // Catch: java.lang.Throwable -> Lb8
            r2 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r2) goto Lbb
            r0 = 8
            r5.m1525(r0)     // Catch: java.lang.Throwable -> Lb8
            goto Lbb
        Lb8:
            r0 = move-exception
            r9 = r0
            goto L11b
        Lbb:
            boolean r0 = r5.f3004     // Catch: java.lang.Throwable -> Lb8
            if (r0 != 0) goto L115
            int r4 = r5.f3008     // Catch: java.lang.Throwable -> Lb8
            int r0 = r4 + 2
            r5.f3008 = r0     // Catch: java.lang.Throwable -> Lb8
            xhss.ᛸᛳᛴ r3 = new xhss.ᛸᛳᛴ     // Catch: java.lang.Throwable -> Lb8
            r8 = 0
            r6 = 1
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r3.m1284()     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto Ldc
            java.util.LinkedHashMap r0 = r5.f2991     // Catch: java.lang.Throwable -> Lb8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lb8
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lb8
        Ldc:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L112
            xhss.ᲀᛱᛶᛳ r0 = r5.f3003     // Catch: java.lang.Throwable -> L112
            r0.m1414(r6, r4, r1)     // Catch: java.lang.Throwable -> L112
            monitor-exit(r10)
            xhss.ᲀᛱᛶᛳ r10 = r5.f3003
            r10.flush()
            r9.f1165 = r3
            boolean r10 = r9.f1166
            xhss.ᛸᛳᛴ r0 = r9.f1165
            if (r10 != 0) goto L107
            xhss.ᛵᛴᲇ r10 = r0.f2490
            xhss.ᲁᲈᲀᲈ r0 = r9.f1161
            int r0 = r0.f3281
            long r0 = (long) r0
            r10.mo481(r0)
            xhss.ᛸᛳᛴ r10 = r9.f1165
            xhss.ᛵᛴᲇ r10 = r10.f2481
            xhss.ᲁᲈᲀᲈ r9 = r9.f1161
            int r9 = r9.f3277
            long r0 = (long) r9
            r10.mo481(r0)
            return
        L107:
            r9 = 9
            r0.m1285(r9)
            java.lang.String r9 = "Canceled"
            xhss.C0532.m947(r9)
            return
        L112:
            r0 = move-exception
            r9 = r0
            goto L11d
        L115:
            xhss.ᲇᛷᛴᛴ r9 = new xhss.ᲇᛷᛴᛴ     // Catch: java.lang.Throwable -> Lb8
            r9.<init>()     // Catch: java.lang.Throwable -> Lb8
            throw r9     // Catch: java.lang.Throwable -> Lb8
        L11b:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L112
            throw r9     // Catch: java.lang.Throwable -> L112
        L11d:
            monitor-exit(r10)
            throw r9
    }

    @Override // xhss.InterfaceC0666
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.InterfaceC0900 mo638() {
            r0 = this;
            xhss.ᲈᲁᛲᲇ r0 = r0.f1164
            return r0
    }

    @Override // xhss.InterfaceC0666
    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.InterfaceC1095 mo639(xhss.C0871 r1) {
            r0 = this;
            xhss.ᛸᛳᛴ r0 = r0.f1165
            xhss.ᛱᲀᲇᛳ r0 = r0.f2482
            return r0
    }
}
