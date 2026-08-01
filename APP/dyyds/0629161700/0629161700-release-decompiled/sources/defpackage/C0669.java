package defpackage;

/* JADX INFO: renamed from: ᛴᛴᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0669 implements defpackage.InterfaceC1559 {

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final defpackage.C0024 f3239 = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C0167 f3240;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f3241;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1326 f3242;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C2225 f3243;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC0561 f3244;

    static {
            java.lang.String r0 = "OkHttp-Response-Body"
            java.lang.String r1 = "Truncated"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r1 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r2 = r0.length
            int r2 = r2 % r1
            if (r2 != 0) goto L5a
            int r2 = r0.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            int r3 = r2.length
            r4 = 0
            r5 = r4
        L1d:
            if (r5 >= r3) goto L38
            r6 = r2[r5]
            if (r6 == 0) goto L32
            r6 = r0[r5]
            java.lang.CharSequence r6 = defpackage.AbstractC1347.m2521(r6)
            java.lang.String r6 = r6.toString()
            r2[r5] = r6
            int r5 = r5 + 1
            goto L1d
        L32:
            java.lang.String r0 = "Headers cannot be null"
            defpackage.C2264.m3684(r0)
            return
        L38:
            int r0 = r2.length
            int r0 = r0 + (-1)
            int r0 = defpackage.AbstractC0425.m1187(r4, r0, r1)
            if (r0 < 0) goto L52
        L41:
            r1 = r2[r4]
            int r3 = r4 + 1
            r3 = r2[r3]
            defpackage.AbstractC0729.m1642(r1)
            defpackage.AbstractC0729.m1645(r3, r1)
            if (r4 == r0) goto L52
            int r4 = r4 + 2
            goto L41
        L52:
            ᛱᛱᛷᛳ r0 = new ᛱᛱᛷᛳ
            r0.<init>(r2)
            defpackage.C0669.f3239 = r0
            return
        L5a:
            java.lang.String r0 = "Expected alternating header names and values"
            defpackage.C2264.m3684(r0)
            return
    }

    public C0669(defpackage.C2225 r1, defpackage.InterfaceC0561 r2, defpackage.C1326 r3) {
            r0 = this;
            r0.<init>()
            r0.f3243 = r1
            r0.f3244 = r2
            r0.f3242 = r3
            ᛱᲀᛸᛴ r1 = new ᛱᲀᛸᛴ
            java.lang.Object r2 = r3.f5857
            ᲈᛵᲈᛵ r2 = (defpackage.C2252) r2
            r1.<init>(r2)
            r0.f3240 = r1
            return
    }

    @Override // defpackage.InterfaceC1559
    public final void cancel() {
            r0 = this;
            ᛳᲁᲀᲇ r0 = r0.f3244
            r0.cancel()
            return
    }

    @Override // defpackage.InterfaceC1559
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final long mo1505(defpackage.C0569 r2) {
            r1 = this;
            boolean r1 = defpackage.AbstractC0232.m841(r2)
            if (r1 != 0) goto L9
            r1 = 0
            return r1
        L9:
            ᛱᛱᛷᛳ r1 = r2.f2820
            java.lang.String r0 = "Transfer-Encoding"
            java.lang.String r1 = r1.m324(r0)
            if (r1 != 0) goto L14
            r1 = 0
        L14:
            java.lang.String r0 = "chunked"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L1f
            r1 = -1
            return r1
        L1f:
            long r1 = defpackage.AbstractC0508.m1292(r2)
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final defpackage.C1788 m1506(defpackage.C0520 r3, long r4) {
            r2 = this;
            int r0 = r2.f3241
            r1 = 4
            if (r0 != r1) goto Le
            r0 = 5
            r2.f3241 = r0
            ᲀᲈᲈᲀ r0 = new ᲀᲈᲈᲀ
            r0.<init>(r2, r3, r4)
            return r0
        Le:
            java.lang.String r3 = "state: "
            int r2 = r2.f3241
            defpackage.C0086.m554(r2, r3)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final void m1507(defpackage.C0024 r6, java.lang.String r7) {
            r5 = this;
            int r0 = r5.f3241
            if (r0 != 0) goto L3d
            ᛷᛸᛱᛸ r0 = r5.f3242
            java.lang.Object r1 = r0.f5859
            ᛶᛳᛵᛸ r1 = (defpackage.C1037) r1
            r1.mo706(r7)
            java.lang.String r7 = "\r\n"
            r1.mo706(r7)
            int r1 = r6.size()
            r2 = 0
        L17:
            java.lang.Object r3 = r0.f5859
            ᛶᛳᛵᛸ r3 = (defpackage.C1037) r3
            if (r2 >= r1) goto L36
            java.lang.String r4 = defpackage.AbstractC0729.m1649(r6, r2)
            r3.mo706(r4)
            java.lang.String r4 = ": "
            r3.mo706(r4)
            java.lang.String r4 = defpackage.AbstractC0729.m1635(r6, r2)
            r3.mo706(r4)
            r3.mo706(r7)
            int r2 = r2 + 1
            goto L17
        L36:
            r3.mo706(r7)
            r6 = 1
            r5.f3241 = r6
            return
        L3d:
            java.lang.String r6 = "state: "
            int r5 = r5.f3241
            defpackage.C0086.m554(r5, r6)
            return
    }

    @Override // defpackage.InterfaceC1559
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final defpackage.InterfaceC2085 mo1508(defpackage.C0478 r7, long r8) {
            r6 = this;
            java.lang.Object r7 = r7.f2403
            ᛱᛱᛷᛳ r7 = (defpackage.C0024) r7
            java.lang.String r0 = "Transfer-Encoding"
            java.lang.String r7 = r7.m324(r0)
            java.lang.String r0 = "chunked"
            boolean r7 = r0.equalsIgnoreCase(r7)
            r0 = 0
            java.lang.String r1 = "state: "
            r2 = 2
            r3 = 1
            if (r7 == 0) goto L29
            int r7 = r6.f3241
            if (r7 != r3) goto L23
            r6.f3241 = r2
            ᛱᛷᛱᛸ r7 = new ᛱᛷᛱᛸ
            r7.<init>(r6)
            return r7
        L23:
            int r6 = r6.f3241
            defpackage.C0086.m554(r6, r1)
            return r0
        L29:
            r4 = -1
            int r7 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r7 == 0) goto L41
            int r7 = r6.f3241
            if (r7 != r3) goto L3b
            r6.f3241 = r2
            ᛱᛳᲇᲀ r7 = new ᛱᛳᲇᲀ
            r7.<init>(r6)
            return r7
        L3b:
            int r6 = r6.f3241
            defpackage.C0086.m554(r6, r1)
            return r0
        L41:
            java.lang.String r6 = "Cannot stream a request body without chunked encoding or a known content length!"
            defpackage.C2264.m3676(r6)
            return r0
    }

    @Override // defpackage.InterfaceC1559
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void mo1509() {
            r0 = this;
            ᛷᛸᛱᛸ r0 = r0.f3242
            java.lang.Object r0 = r0.f5859
            ᛶᛳᛵᛸ r0 = (defpackage.C1037) r0
            r0.flush()
            return
    }

    @Override // defpackage.InterfaceC1559
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final boolean mo1510() {
            r1 = this;
            int r1 = r1.f3241
            r0 = 6
            if (r1 != r0) goto L7
            r1 = 1
            return r1
        L7:
            r1 = 0
            return r1
    }

    @Override // defpackage.InterfaceC1559
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void mo1511() {
            r0 = this;
            ᛷᛸᛱᛸ r0 = r0.f3242
            java.lang.Object r0 = r0.f5859
            ᛶᛳᛵᛸ r0 = (defpackage.C1037) r0
            r0.flush()
            return
    }

    @Override // defpackage.InterfaceC1559
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void mo1512(defpackage.C0478 r6) {
            r5 = this;
            ᛳᲁᲀᲇ r0 = r5.f3244
            ᲇᛵᲇᲇ r0 = r0.mo1357()
            java.net.Proxy r0 = r0.f8855
            java.net.Proxy$Type r0 = r0.type()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Object r2 = r6.f2400
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            java.lang.Object r2 = r6.f2401
            ᛳᛸᛲ r2 = (defpackage.C0520) r2
            java.lang.String r3 = r2.f2565
            java.lang.String r4 = "https"
            boolean r3 = defpackage.AbstractC0498.m1280(r3, r4)
            if (r3 != 0) goto L33
            java.net.Proxy$Type r3 = java.net.Proxy.Type.HTTP
            if (r0 != r3) goto L33
            r1.append(r2)
            goto L51
        L33:
            java.lang.String r0 = r2.m1309()
            java.lang.String r2 = r2.m1306()
            if (r2 == 0) goto L4e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r0 = 63
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
        L4e:
            r1.append(r0)
        L51:
            java.lang.String r0 = " HTTP/1.1"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Object r6 = r6.f2403
            ᛱᛱᛷᛳ r6 = (defpackage.C0024) r6
            r5.m1507(r6, r0)
            return
    }

    @Override // defpackage.InterfaceC1559
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final defpackage.C0147 mo1513(boolean r9) {
            r8 = this;
            ᛱᲀᛸᛴ r0 = r8.f3240
            int r1 = r8.f3241
            r2 = 0
            r3 = 3
            if (r1 == 0) goto L19
            r4 = 1
            if (r1 == r4) goto L19
            r4 = 2
            if (r1 == r4) goto L19
            if (r1 != r3) goto L11
            goto L19
        L11:
            java.lang.String r9 = "state: "
            int r8 = r8.f3241
            defpackage.C0086.m554(r8, r9)
            return r2
        L19:
            java.lang.Object r1 = r0.f1143     // Catch: java.io.EOFException -> L5c
            ᲈᛵᲈᛵ r1 = (defpackage.C2252) r1     // Catch: java.io.EOFException -> L5c
            long r4 = r0.f1145     // Catch: java.io.EOFException -> L5c
            java.lang.String r1 = r1.m3646(r4)     // Catch: java.io.EOFException -> L5c
            long r4 = r0.f1145     // Catch: java.io.EOFException -> L5c
            int r6 = r1.length()     // Catch: java.io.EOFException -> L5c
            long r6 = (long) r6     // Catch: java.io.EOFException -> L5c
            long r4 = r4 - r6
            r0.f1145 = r4     // Catch: java.io.EOFException -> L5c
            ᛶᛸᛶᛲ r1 = defpackage.AbstractC0209.m769(r1)     // Catch: java.io.EOFException -> L5c
            int r4 = r1.f5016     // Catch: java.io.EOFException -> L5c
            ᛱᛸᛵᲁ r5 = new ᛱᛸᛵᲁ     // Catch: java.io.EOFException -> L5c
            r5.<init>()     // Catch: java.io.EOFException -> L5c
            java.lang.Object r6 = r1.f5014     // Catch: java.io.EOFException -> L5c
            ᲁᛳᛶᛵ r6 = (defpackage.EnumC1832) r6     // Catch: java.io.EOFException -> L5c
            r5.f1109 = r6     // Catch: java.io.EOFException -> L5c
            r5.f1105 = r4     // Catch: java.io.EOFException -> L5c
            java.lang.Object r1 = r1.f5013     // Catch: java.io.EOFException -> L5c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.io.EOFException -> L5c
            r5.f1104 = r1     // Catch: java.io.EOFException -> L5c
            ᛱᛱᛷᛳ r0 = r0.m703()     // Catch: java.io.EOFException -> L5c
            ᛳᲈᛳᛸ r0 = defpackage.AbstractC0729.m1651(r0)     // Catch: java.io.EOFException -> L5c
            r5.f1110 = r0     // Catch: java.io.EOFException -> L5c
            r0 = 100
            if (r9 == 0) goto L57
            if (r4 != r0) goto L57
            return r2
        L57:
            if (r4 != r0) goto L5e
            r8.f3241 = r3     // Catch: java.io.EOFException -> L5c
            return r5
        L5c:
            r9 = move-exception
            goto L6d
        L5e:
            r9 = 102(0x66, float:1.43E-43)
            if (r9 > r4) goto L69
            r9 = 200(0xc8, float:2.8E-43)
            if (r4 >= r9) goto L69
            r8.f3241 = r3     // Catch: java.io.EOFException -> L5c
            return r5
        L69:
            r9 = 4
            r8.f3241 = r9     // Catch: java.io.EOFException -> L5c
            return r5
        L6d:
            ᛳᲁᲀᲇ r8 = r8.f3244
            ᲇᛵᲇᲇ r8 = r8.mo1357()
            ᛱᛲᛶᲈ r8 = r8.f8854
            ᛳᛸᛲ r8 = r8.f538
            java.lang.String r8 = r8.m1311()
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "unexpected end of stream on "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8, r9)
            throw r0
    }

    @Override // defpackage.InterfaceC1559
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC2182 mo1514(defpackage.C0569 r11) {
            r10 = this;
            ᛳᛵᛴᛴ r0 = r11.f2828
            boolean r1 = defpackage.AbstractC0232.m841(r11)
            if (r1 != 0) goto L13
            java.lang.Object r11 = r0.f2401
            ᛳᛸᛲ r11 = (defpackage.C0520) r11
            r0 = 0
            ᲀᲈᲈᲀ r10 = r10.m1506(r11, r0)
            return r10
        L13:
            java.lang.String r1 = "Transfer-Encoding"
            ᛱᛱᛷᛳ r2 = r11.f2820
            java.lang.String r1 = r2.m324(r1)
            r2 = 0
            if (r1 != 0) goto L1f
            r1 = r2
        L1f:
            java.lang.String r3 = "chunked"
            boolean r1 = r3.equalsIgnoreCase(r1)
            java.lang.String r3 = "state: "
            r4 = 5
            r5 = 4
            if (r1 == 0) goto L41
            java.lang.Object r11 = r0.f2401
            ᛳᛸᛲ r11 = (defpackage.C0520) r11
            int r0 = r10.f3241
            if (r0 != r5) goto L3b
            r10.f3241 = r4
            ᛱᲈᛱᛷ r0 = new ᛱᲈᛱᛷ
            r0.<init>(r10, r11)
            return r0
        L3b:
            int r10 = r10.f3241
            defpackage.C0086.m554(r10, r3)
            return r2
        L41:
            long r6 = defpackage.AbstractC0508.m1292(r11)
            r8 = -1
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 == 0) goto L54
            java.lang.Object r11 = r0.f2401
            ᛳᛸᛲ r11 = (defpackage.C0520) r11
            ᲀᲈᲈᲀ r10 = r10.m1506(r11, r6)
            return r10
        L54:
            java.lang.Object r11 = r0.f2401
            ᛳᛸᛲ r11 = (defpackage.C0520) r11
            int r0 = r10.f3241
            if (r0 != r5) goto L69
            r10.f3241 = r4
            ᛳᲁᲀᲇ r0 = r10.f3244
            r0.mo1355()
            ᲈᲇᲈᛳ r0 = new ᲈᲇᲈᛳ
            r0.<init>(r10, r11)
            return r0
        L69:
            int r10 = r10.f3241
            defpackage.C0086.m554(r10, r3)
            return r2
    }

    @Override // defpackage.InterfaceC1559
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.InterfaceC0319 mo1515() {
            r0 = this;
            ᛷᛸᛱᛸ r0 = r0.f3242
            return r0
    }

    @Override // defpackage.InterfaceC1559
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.InterfaceC0561 mo1516() {
            r0 = this;
            ᛳᲁᲀᲇ r0 = r0.f3244
            return r0
    }
}
