package xhss;

/* JADX INFO: renamed from: xhss.ᛳᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0323 implements xhss.InterfaceC0666 {

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static final xhss.C0972 f1231 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.InterfaceC0900 f1232;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0623 f1233;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final xhss.C0066 f1234;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0504 f1235;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f1236;

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
            java.lang.CharSequence r6 = xhss.AbstractC0120.m346(r6)
            java.lang.String r6 = r6.toString()
            r2[r5] = r6
            int r5 = r5 + 1
            goto L1d
        L32:
            java.lang.String r0 = "Headers cannot be null"
            xhss.C0532.m959(r0)
            return
        L38:
            int r0 = r2.length
            int r0 = r0 + (-1)
            int r0 = xhss.AbstractC0694.m1205(r4, r0, r1)
            if (r0 < 0) goto L52
        L41:
            r1 = r2[r4]
            int r3 = r4 + 1
            r3 = r2[r3]
            xhss.AbstractC0694.m1197(r1)
            xhss.AbstractC0694.m1213(r3, r1)
            if (r4 == r0) goto L52
            int r4 = r4 + 2
            goto L41
        L52:
            xhss.ᲁᛸᛱᛵ r0 = new xhss.ᲁᛸᛱᛵ
            r0.<init>(r2)
            xhss.C0323.f1231 = r0
            return
        L5a:
            java.lang.String r0 = "Expected alternating header names and values"
            xhss.C0532.m959(r0)
            return
    }

    public C0323(xhss.C0504 r1, xhss.InterfaceC0900 r2, xhss.C0623 r3) {
            r0 = this;
            r0.<init>()
            r0.f1235 = r1
            r0.f1232 = r2
            r0.f1233 = r3
            xhss.ᛱᛷᲇᲁ r1 = new xhss.ᛱᛷᲇᲁ
            java.lang.Object r2 = r3.f2153
            xhss.ᲁᛸᛵᛳ r2 = (xhss.C0976) r2
            r1.<init>(r2)
            r0.f1234 = r1
            return
    }

    @Override // xhss.InterfaceC0666
    public final void cancel() {
            r0 = this;
            xhss.ᲀᲀᲁᛱ r0 = r0.f1232
            r0.cancel()
            return
    }

    @Override // xhss.InterfaceC0666
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final boolean mo632() {
            r1 = this;
            int r1 = r1.f1236
            r0 = 6
            if (r1 != r0) goto L7
            r1 = 1
            return r1
        L7:
            r1 = 0
            return r1
    }

    @Override // xhss.InterfaceC0666
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final xhss.InterfaceC0268 mo633() {
            r0 = this;
            xhss.ᛷᛱᛳᲁ r0 = r0.f1233
            return r0
    }

    @Override // xhss.InterfaceC0666
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public final long mo634(xhss.C0871 r2) {
            r1 = this;
            boolean r1 = xhss.AbstractC1109.m1806(r2)
            if (r1 != 0) goto L9
            r1 = 0
            return r1
        L9:
            xhss.ᲁᛸᛱᛵ r1 = r2.f2820
            java.lang.String r0 = "Transfer-Encoding"
            java.lang.String r1 = r1.m1605(r0)
            if (r1 != 0) goto L14
            r1 = 0
        L14:
            java.lang.String r0 = "chunked"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L1f
            r1 = -1
            return r1
        L1f:
            long r1 = xhss.AbstractC0559.m988(r2)
            return r1
    }

    @Override // xhss.InterfaceC0666
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo635() {
            r0 = this;
            xhss.ᛷᛱᛳᲁ r0 = r0.f1233
            java.lang.Object r0 = r0.f2152
            xhss.ᛱᛸᛵᛱ r0 = (xhss.C0075) r0
            r0.flush()
            return
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final xhss.C0077 m662(xhss.C0669 r3, long r4) {
            r2 = this;
            int r0 = r2.f1236
            r1 = 4
            if (r0 != r1) goto Le
            r0 = 5
            r2.f1236 = r0
            xhss.ᛱᛸᛵᲈ r0 = new xhss.ᛱᛸᛵᲈ
            r0.<init>(r2, r3, r4)
            return r0
        Le:
            java.lang.String r3 = "state: "
            int r2 = r2.f1236
            xhss.C0532.m955(r3, r2)
            r2 = 0
            return r2
    }

    @Override // xhss.InterfaceC0666
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public final xhss.C0270 mo636() {
            r7 = this;
            xhss.ᛱᛷᲇᲁ r0 = r7.f1234
            int r1 = r7.f1236
            r2 = 3
            if (r1 == 0) goto L19
            r3 = 1
            if (r1 == r3) goto L19
            r3 = 2
            if (r1 == r3) goto L19
            if (r1 != r2) goto L10
            goto L19
        L10:
            java.lang.String r0 = "state: "
            int r7 = r7.f1236
            xhss.C0532.m955(r0, r7)
            r7 = 0
            return r7
        L19:
            xhss.ᲁᛸᛵᛳ r1 = r0.f361     // Catch: java.io.EOFException -> L55
            long r3 = r0.f360     // Catch: java.io.EOFException -> L55
            java.lang.String r1 = r1.m1616(r3)     // Catch: java.io.EOFException -> L55
            long r3 = r0.f360     // Catch: java.io.EOFException -> L55
            int r5 = r1.length()     // Catch: java.io.EOFException -> L55
            long r5 = (long) r5     // Catch: java.io.EOFException -> L55
            long r3 = r3 - r5
            r0.f360 = r3     // Catch: java.io.EOFException -> L55
            xhss.ᛵᛶᛳ r1 = xhss.AbstractC0955.m1563(r1)     // Catch: java.io.EOFException -> L55
            int r3 = r1.f1741     // Catch: java.io.EOFException -> L55
            xhss.ᛳᛵᛴ r4 = new xhss.ᛳᛵᛴ     // Catch: java.io.EOFException -> L55
            r4.<init>()     // Catch: java.io.EOFException -> L55
            java.lang.Object r5 = r1.f1742     // Catch: java.io.EOFException -> L55
            xhss.ᲈᛲᛵᛴ r5 = (xhss.EnumC1122) r5     // Catch: java.io.EOFException -> L55
            r4.f1020 = r5     // Catch: java.io.EOFException -> L55
            r4.f1021 = r3     // Catch: java.io.EOFException -> L55
            java.lang.Object r1 = r1.f1744     // Catch: java.io.EOFException -> L55
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.io.EOFException -> L55
            r4.f1031 = r1     // Catch: java.io.EOFException -> L55
            xhss.ᲁᛸᛱᛵ r0 = r0.m214()     // Catch: java.io.EOFException -> L55
            xhss.ᛴᲈᛱᲁ r0 = xhss.AbstractC0694.m1209(r0)     // Catch: java.io.EOFException -> L55
            r4.f1032 = r0     // Catch: java.io.EOFException -> L55
            r0 = 100
            if (r3 != r0) goto L57
            r7.f1236 = r2     // Catch: java.io.EOFException -> L55
            return r4
        L55:
            r0 = move-exception
            goto L66
        L57:
            r0 = 102(0x66, float:1.43E-43)
            if (r0 > r3) goto L62
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 >= r0) goto L62
            r7.f1236 = r2     // Catch: java.io.EOFException -> L55
            return r4
        L62:
            r0 = 4
            r7.f1236 = r0     // Catch: java.io.EOFException -> L55
            return r4
        L66:
            xhss.ᲀᲀᲁᛱ r7 = r7.f1232
            xhss.ᛱᛷᲁᛶ r7 = r7.mo590()
            xhss.ᛵᲈᛱᛳ r7 = r7.f359
            xhss.ᛷᛶᲁᛵ r7 = r7.f1924
            java.lang.String r7 = r7.m1159()
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "unexpected end of stream on "
            java.lang.String r7 = r2.concat(r7)
            r1.<init>(r7, r0)
            throw r1
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final void m663(xhss.C0972 r6, java.lang.String r7) {
            r5 = this;
            int r0 = r5.f1236
            if (r0 != 0) goto L3d
            xhss.ᛷᛱᛳᲁ r0 = r5.f1233
            java.lang.Object r1 = r0.f2152
            xhss.ᛱᛸᛵᛱ r1 = (xhss.C0075) r1
            r1.mo230(r7)
            java.lang.String r7 = "\r\n"
            r1.mo230(r7)
            int r1 = r6.size()
            r2 = 0
        L17:
            java.lang.Object r3 = r0.f2152
            xhss.ᛱᛸᛵᛱ r3 = (xhss.C0075) r3
            if (r2 >= r1) goto L36
            java.lang.String r4 = xhss.AbstractC0694.m1204(r6, r2)
            r3.mo230(r4)
            java.lang.String r4 = ": "
            r3.mo230(r4)
            java.lang.String r4 = xhss.AbstractC0694.m1219(r6, r2)
            r3.mo230(r4)
            r3.mo230(r7)
            int r2 = r2 + 1
            goto L17
        L36:
            r3.mo230(r7)
            r6 = 1
            r5.f1236 = r6
            return
        L3d:
            java.lang.String r6 = "state: "
            int r5 = r5.f1236
            xhss.C0532.m955(r6, r5)
            return
    }

    @Override // xhss.InterfaceC0666
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public final void mo637(xhss.C0355 r6) {
            r5 = this;
            xhss.ᲀᲀᲁᛱ r0 = r5.f1232
            xhss.ᛱᛷᲁᛶ r0 = r0.mo590()
            java.net.Proxy r0 = r0.f357
            java.net.Proxy$Type r0 = r0.type()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Object r2 = r6.f1314
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            java.lang.Object r2 = r6.f1313
            xhss.ᛷᛶᲁᛵ r2 = (xhss.C0669) r2
            java.lang.String r3 = r2.f2285
            java.lang.String r4 = "https"
            boolean r3 = xhss.AbstractC0007.m97(r3, r4)
            if (r3 != 0) goto L33
            java.net.Proxy$Type r3 = java.net.Proxy.Type.HTTP
            if (r0 != r3) goto L33
            r1.append(r2)
            goto L51
        L33:
            java.lang.String r0 = r2.m1154()
            java.lang.String r2 = r2.m1160()
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
            java.lang.Object r6 = r6.f1317
            xhss.ᲁᛸᛱᛵ r6 = (xhss.C0972) r6
            r5.m663(r6, r0)
            return
    }

    @Override // xhss.InterfaceC0666
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final xhss.InterfaceC0900 mo638() {
            r0 = this;
            xhss.ᲀᲀᲁᛱ r0 = r0.f1232
            return r0
    }

    @Override // xhss.InterfaceC0666
    /* JADX INFO: renamed from: ᲇᛶᛴᲀ */
    public final xhss.InterfaceC1095 mo639(xhss.C0871 r11) {
            r10 = this;
            xhss.ᛴᛴᛴᛵ r0 = r11.f2809
            boolean r1 = xhss.AbstractC1109.m1806(r11)
            if (r1 != 0) goto L13
            java.lang.Object r11 = r0.f1313
            xhss.ᛷᛶᲁᛵ r11 = (xhss.C0669) r11
            r0 = 0
            xhss.ᛱᛸᛵᲈ r10 = r10.m662(r11, r0)
            return r10
        L13:
            java.lang.String r1 = "Transfer-Encoding"
            xhss.ᲁᛸᛱᛵ r2 = r11.f2820
            java.lang.String r1 = r2.m1605(r1)
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
            java.lang.Object r11 = r0.f1313
            xhss.ᛷᛶᲁᛵ r11 = (xhss.C0669) r11
            int r0 = r10.f1236
            if (r0 != r5) goto L3b
            r10.f1236 = r4
            xhss.ᛳᛳᛷᲇ r0 = new xhss.ᛳᛳᛷᲇ
            r0.<init>(r10, r11)
            return r0
        L3b:
            int r10 = r10.f1236
            xhss.C0532.m955(r3, r10)
            return r2
        L41:
            long r6 = xhss.AbstractC0559.m988(r11)
            r8 = -1
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 == 0) goto L54
            java.lang.Object r11 = r0.f1313
            xhss.ᛷᛶᲁᛵ r11 = (xhss.C0669) r11
            xhss.ᛱᛸᛵᲈ r10 = r10.m662(r11, r6)
            return r10
        L54:
            java.lang.Object r11 = r0.f1313
            xhss.ᛷᛶᲁᛵ r11 = (xhss.C0669) r11
            int r0 = r10.f1236
            if (r0 != r5) goto L69
            r10.f1236 = r4
            xhss.ᲀᲀᲁᛱ r0 = r10.f1232
            r0.mo593()
            xhss.ᛶᛲᛵᛲ r0 = new xhss.ᛶᛲᛵᛲ
            r0.<init>(r10, r11)
            return r0
        L69:
            int r10 = r10.f1236
            xhss.C0532.m955(r3, r10)
            return r2
    }
}
