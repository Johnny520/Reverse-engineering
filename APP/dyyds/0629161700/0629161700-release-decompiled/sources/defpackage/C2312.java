package defpackage;

/* JADX INFO: renamed from: ᲈᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2312 implements defpackage.InterfaceC1559 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final java.util.List f9771 = null;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final java.util.List f9772 = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.EnumC1832 f9773;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public volatile defpackage.C1958 f9774;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C2361 f9775;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1894 f9776;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1756 f9777;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public volatile boolean f9778;

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
            java.util.List r0 = defpackage.AbstractC0508.m1290(r0)
            defpackage.C2312.f9772 = r0
            java.lang.String r7 = "encoding"
            java.lang.String r8 = "upgrade"
            java.lang.String r1 = "connection"
            java.lang.String r2 = "host"
            java.lang.String r3 = "keep-alive"
            java.lang.String r4 = "proxy-connection"
            java.lang.String r5 = "te"
            java.lang.String r6 = "transfer-encoding"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8}
            java.util.List r0 = defpackage.AbstractC0508.m1290(r0)
            defpackage.C2312.f9771 = r0
            return
    }

    public C2312(defpackage.C2225 r1, defpackage.C1894 r2, defpackage.C1756 r3, defpackage.C2361 r4) {
            r0 = this;
            r0.<init>()
            r0.f9776 = r2
            r0.f9777 = r3
            r0.f9775 = r4
            java.util.List r1 = r1.f9511
            ᲁᛳᛶᛵ r2 = defpackage.EnumC1832.f7978
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L14
            goto L16
        L14:
            ᲁᛳᛶᛵ r2 = defpackage.EnumC1832.f7985
        L16:
            r0.f9773 = r2
            return
    }

    @Override // defpackage.InterfaceC1559
    public final void cancel() {
            r1 = this;
            r0 = 1
            r1.f9778 = r0
            ᲁᲈᛲᛱ r1 = r1.f9774
            if (r1 == 0) goto Lc
            r0 = 9
            r1.m3375(r0)
        Lc:
            return
    }

    @Override // defpackage.InterfaceC1559
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final long mo1505(defpackage.C0569 r1) {
            r0 = this;
            boolean r0 = defpackage.AbstractC0232.m841(r1)
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            long r0 = defpackage.AbstractC0508.m1292(r1)
            return r0
    }

    @Override // defpackage.InterfaceC1559
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final defpackage.InterfaceC2085 mo1508(defpackage.C0478 r1, long r2) {
            r0 = this;
            ᲁᲈᛲᛱ r0 = r0.f9774
            ᲁᲈᲀᲀ r0 = r0.f8511
            return r0
    }

    @Override // defpackage.InterfaceC1559
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final void mo1509() {
            r0 = this;
            ᲈᲈ r0 = r0.f9775
            r0.flush()
            return
    }

    @Override // defpackage.InterfaceC1559
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final boolean mo1510() {
            r4 = this;
            ᲁᲈᛲᛱ r4 = r4.f9774
            r0 = 0
            if (r4 == 0) goto L20
            monitor-enter(r4)
            ᛵᲁᛵᛴ r1 = r4.f8519     // Catch: java.lang.Throwable -> L17
            boolean r2 = r1.f4323     // Catch: java.lang.Throwable -> L17
            r3 = 1
            if (r2 == 0) goto L19
            ᛸᲁᛵ r1 = r1.f4325     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.m2848()     // Catch: java.lang.Throwable -> L17
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

    @Override // defpackage.InterfaceC1559
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo1511() {
            r0 = this;
            ᲁᲈᛲᛱ r0 = r0.f9774
            ᲁᲈᲀᲀ r0 = r0.f8511
            r0.close()
            return
    }

    @Override // defpackage.InterfaceC1559
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo1512(defpackage.C0478 r15) {
            r14 = this;
            ᲁᲈᛲᛱ r0 = r14.f9774
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.Object r0 = r15.f2404
            ᛸᛳᛲᛳ r0 = (defpackage.AbstractC1450) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lf
            r0 = r2
            goto L10
        Lf:
            r0 = r1
        L10:
            java.lang.Object r3 = r15.f2403
            ᛱᛱᛷᛳ r3 = (defpackage.C0024) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r3.size()
            int r5 = r5 + 4
            r4.<init>(r5)
            ᛵᛲᛵᲁ r5 = new ᛵᛲᛵᲁ
            ᛶᛸᛸᛶ r6 = defpackage.C0828.f3830
            java.lang.Object r7 = r15.f2400
            java.lang.String r7 = (java.lang.String) r7
            r5.<init>(r6, r7)
            r4.add(r5)
            ᛵᛲᛵᲁ r5 = new ᛵᛲᛵᲁ
            ᛶᛸᛸᛶ r6 = defpackage.C0828.f3831
            java.lang.Object r15 = r15.f2401
            ᛳᛸᛲ r15 = (defpackage.C0520) r15
            java.lang.String r7 = r15.m1309()
            java.lang.String r8 = r15.m1306()
            if (r8 == 0) goto L50
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r7)
            r7 = 63
            r9.append(r7)
            r9.append(r8)
            java.lang.String r7 = r9.toString()
        L50:
            r5.<init>(r6, r7)
            r4.add(r5)
            java.lang.String r5 = "Host"
            java.lang.String r5 = r3.m324(r5)
            if (r5 == 0) goto L68
            ᛵᛲᛵᲁ r6 = new ᛵᛲᛵᲁ
            ᛶᛸᛸᛶ r7 = defpackage.C0828.f3827
            r6.<init>(r7, r5)
            r4.add(r6)
        L68:
            ᛵᛲᛵᲁ r5 = new ᛵᛲᛵᲁ
            ᛶᛸᛸᛶ r6 = defpackage.C0828.f3826
            java.lang.String r15 = r15.f2565
            r5.<init>(r6, r15)
            r4.add(r5)
            int r15 = r3.size()
            r5 = r1
        L79:
            if (r5 >= r15) goto Lb0
            java.lang.String r6 = defpackage.AbstractC0729.m1649(r3, r5)
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r6 = r6.toLowerCase(r7)
            java.util.List r7 = defpackage.C2312.f9772
            boolean r7 = r7.contains(r6)
            if (r7 == 0) goto La1
            java.lang.String r7 = "te"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto Lad
            java.lang.String r7 = defpackage.AbstractC0729.m1635(r3, r5)
            java.lang.String r8 = "trailers"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto Lad
        La1:
            ᛵᛲᛵᲁ r7 = new ᛵᛲᛵᲁ
            java.lang.String r8 = defpackage.AbstractC0729.m1635(r3, r5)
            r7.<init>(r6, r8)
            r4.add(r7)
        Lad:
            int r5 = r5 + 1
            goto L79
        Lb0:
            ᲈᲈ r8 = r14.f9775
            r9 = r0 ^ 1
            ᛴᲈᛲᲀ r15 = r8.f10229
            monitor-enter(r15)
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L134
            int r3 = r8.f10230     // Catch: java.lang.Throwable -> Lc5
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r3 <= r5) goto Lc9
            r3 = 8
            r8.m3856(r3)     // Catch: java.lang.Throwable -> Lc5
            goto Lc9
        Lc5:
            r0 = move-exception
            r14 = r0
            goto L13d
        Lc9:
            boolean r3 = r8.f10206     // Catch: java.lang.Throwable -> Lc5
            if (r3 != 0) goto L137
            int r7 = r8.f10230     // Catch: java.lang.Throwable -> Lc5
            int r3 = r7 + 2
            r8.f10230 = r3     // Catch: java.lang.Throwable -> Lc5
            ᲁᲈᛲᛱ r6 = new ᲁᲈᛲᛱ     // Catch: java.lang.Throwable -> Lc5
            r11 = 0
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lc5
            if (r0 == 0) goto Lec
            long r10 = r8.f10217     // Catch: java.lang.Throwable -> Lc5
            long r12 = r8.f10221     // Catch: java.lang.Throwable -> Lc5
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 >= 0) goto Lec
            long r10 = r6.f8521     // Catch: java.lang.Throwable -> Lc5
            long r12 = r6.f8522     // Catch: java.lang.Throwable -> Lc5
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 < 0) goto Led
        Lec:
            r1 = r2
        Led:
            boolean r0 = r6.m3374()     // Catch: java.lang.Throwable -> Lc5
            if (r0 == 0) goto Lfc
            java.util.LinkedHashMap r0 = r8.f10216     // Catch: java.lang.Throwable -> Lc5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Lc5
            r0.put(r2, r6)     // Catch: java.lang.Throwable -> Lc5
        Lfc:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L134
            ᛴᲈᛲᲀ r0 = r8.f10229     // Catch: java.lang.Throwable -> L134
            r0.m1716(r9, r7, r4)     // Catch: java.lang.Throwable -> L134
            monitor-exit(r15)
            if (r1 == 0) goto L10a
            ᛴᲈᛲᲀ r15 = r8.f10229
            r15.flush()
        L10a:
            r14.f9774 = r6
            boolean r15 = r14.f9778
            ᲁᲈᛲᛱ r0 = r14.f9774
            if (r15 != 0) goto L129
            ᛶᛸᛲᛵ r15 = r0.f8512
            ᲀᲁᛷᛱ r0 = r14.f9777
            int r0 = r0.f7772
            long r0 = (long) r0
            r15.mo1365(r0)
            ᲁᲈᛲᛱ r15 = r14.f9774
            ᛶᛸᛲᛵ r15 = r15.f8516
            ᲀᲁᛷᛱ r14 = r14.f9777
            int r14 = r14.f7751
            long r0 = (long) r14
            r15.mo1365(r0)
            return
        L129:
            r14 = 9
            r0.m3375(r14)
            java.lang.String r14 = "Canceled"
            defpackage.C2264.m3682(r14)
            return
        L134:
            r0 = move-exception
            r14 = r0
            goto L13f
        L137:
            ᲈᛵᲈᛶ r14 = new ᲈᛵᲈᛶ     // Catch: java.lang.Throwable -> Lc5
            r14.<init>()     // Catch: java.lang.Throwable -> Lc5
            throw r14     // Catch: java.lang.Throwable -> Lc5
        L13d:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L134
            throw r14     // Catch: java.lang.Throwable -> L134
        L13f:
            monitor-exit(r15)
            throw r14
    }

    @Override // defpackage.InterfaceC1559
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final defpackage.C0147 mo1513(boolean r11) {
            r10 = this;
            ᲁᲈᛲᛱ r0 = r10.f9774
            r1 = 0
            if (r0 == 0) goto Lfc
            monitor-enter(r0)
        L6:
            java.util.ArrayDeque r2 = r0.f8510     // Catch: java.lang.Throwable -> L36
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L36
            r3 = 0
            if (r2 == 0) goto L5b
            int r2 = r0.m3381()     // Catch: java.lang.Throwable -> L36
            if (r2 != 0) goto L5b
            r2 = 1
            if (r11 != 0) goto L2d
            ᲈᲈ r4 = r0.f8517     // Catch: java.lang.Throwable -> L36
            r4.getClass()     // Catch: java.lang.Throwable -> L36
            ᲁᲈᲀᲀ r4 = r0.f8511     // Catch: java.lang.Throwable -> L36
            boolean r5 = r4.f8552     // Catch: java.lang.Throwable -> L36
            if (r5 != 0) goto L2a
            boolean r4 = r4.f8554     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L28
            goto L2a
        L28:
            r4 = r3
            goto L2b
        L2a:
            r4 = r2
        L2b:
            if (r4 == 0) goto L2e
        L2d:
            r3 = r2
        L2e:
            if (r3 == 0) goto L39
            ᛶᛸᛲᛵ r2 = r0.f8512     // Catch: java.lang.Throwable -> L36
            r2.m3418()     // Catch: java.lang.Throwable -> L36
            goto L39
        L36:
            r10 = move-exception
            goto Lfa
        L39:
            r0.wait()     // Catch: java.lang.Throwable -> L44 java.lang.InterruptedException -> L46
            if (r3 == 0) goto L6
            ᛶᛸᛲᛵ r2 = r0.f8512     // Catch: java.lang.Throwable -> L36
            r2.m2142()     // Catch: java.lang.Throwable -> L36
            goto L6
        L44:
            r10 = move-exception
            goto L53
        L46:
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L44
            r10.interrupt()     // Catch: java.lang.Throwable -> L44
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L44
            r10.<init>()     // Catch: java.lang.Throwable -> L44
            throw r10     // Catch: java.lang.Throwable -> L44
        L53:
            if (r3 == 0) goto L5a
            ᛶᛸᛲᛵ r11 = r0.f8512     // Catch: java.lang.Throwable -> L36
            r11.m2142()     // Catch: java.lang.Throwable -> L36
        L5a:
            throw r10     // Catch: java.lang.Throwable -> L36
        L5b:
            java.util.ArrayDeque r2 = r0.f8510     // Catch: java.lang.Throwable -> L36
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L36
            if (r2 != 0) goto Leb
            java.util.ArrayDeque r2 = r0.f8510     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r2.removeFirst()     // Catch: java.lang.Throwable -> L36
            ᛱᛱᛷᛳ r2 = (defpackage.C0024) r2     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)
            ᲁᛳᛶᛵ r10 = r10.f9773
            java.util.ArrayList r0 = new java.util.ArrayList
            r4 = 20
            r0.<init>(r4)
            int r4 = r2.size()
            r6 = r1
            r5 = r3
        L7b:
            if (r5 >= r4) goto Lb1
            java.lang.String r7 = defpackage.AbstractC0729.m1649(r2, r5)
            java.lang.String r8 = defpackage.AbstractC0729.m1635(r2, r5)
            java.lang.String r9 = ":status"
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L98
            java.lang.String r6 = "HTTP/1.1 "
            java.lang.String r6 = r6.concat(r8)
            ᛶᛸᛶᛲ r6 = defpackage.AbstractC0209.m769(r6)
            goto Lae
        L98:
            java.util.List r9 = defpackage.C2312.f9771
            boolean r9 = r9.contains(r7)
            if (r9 != 0) goto Lae
            r0.add(r7)
            java.lang.CharSequence r7 = defpackage.AbstractC1347.m2521(r8)
            java.lang.String r7 = r7.toString()
            r0.add(r7)
        Lae:
            int r5 = r5 + 1
            goto L7b
        Lb1:
            if (r6 == 0) goto Le3
            ᛱᛸᛵᲁ r2 = new ᛱᛸᛵᲁ
            r2.<init>()
            r2.f1109 = r10
            int r10 = r6.f5016
            r2.f1105 = r10
            java.lang.Object r10 = r6.f5013
            java.lang.String r10 = (java.lang.String) r10
            r2.f1104 = r10
            java.lang.String[] r10 = new java.lang.String[r3]
            java.lang.Object[] r10 = r0.toArray(r10)
            java.lang.String[] r10 = (java.lang.String[]) r10
            ᛳᲈᛳᛸ r0 = new ᛳᲈᛳᛸ
            r3 = 2
            r0.<init>(r3)
            java.util.ArrayList r3 = r0.f2955
            defpackage.AbstractC1376.m2543(r3, r10)
            r2.f1110 = r0
            if (r11 == 0) goto Le2
            int r10 = r2.f1105
            r11 = 100
            if (r10 != r11) goto Le2
            return r1
        Le2:
            return r2
        Le3:
            java.net.ProtocolException r10 = new java.net.ProtocolException
            java.lang.String r11 = "Expected ':status' header not present"
            r10.<init>(r11)
            throw r10
        Leb:
            java.io.IOException r10 = r0.f8514     // Catch: java.lang.Throwable -> L36
            if (r10 == 0) goto Lf0
            goto Lf9
        Lf0:
            ᛳᛸᲁᲈ r10 = new ᛳᛸᲁᲈ     // Catch: java.lang.Throwable -> L36
            int r11 = r0.m3381()     // Catch: java.lang.Throwable -> L36
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L36
        Lf9:
            throw r10     // Catch: java.lang.Throwable -> L36
        Lfa:
            monitor-exit(r0)
            throw r10
        Lfc:
            java.lang.String r10 = "stream wasn't created"
            defpackage.C2264.m3682(r10)
            return r1
    }

    @Override // defpackage.InterfaceC1559
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final defpackage.InterfaceC2182 mo1514(defpackage.C0569 r1) {
            r0 = this;
            ᲁᲈᛲᛱ r0 = r0.f9774
            ᛵᲁᛵᛴ r0 = r0.f8519
            return r0
    }

    @Override // defpackage.InterfaceC1559
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final defpackage.InterfaceC0319 mo1515() {
            r0 = this;
            ᲁᲈᛲᛱ r0 = r0.f9774
            return r0
    }

    @Override // defpackage.InterfaceC1559
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final defpackage.InterfaceC0561 mo1516() {
            r0 = this;
            ᲁᛸᛲᛶ r0 = r0.f9776
            return r0
    }
}
