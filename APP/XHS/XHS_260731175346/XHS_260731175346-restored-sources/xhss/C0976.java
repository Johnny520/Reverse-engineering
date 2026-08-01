package xhss;

/* JADX INFO: renamed from: xhss.ᲁᛸᛵᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0976 implements xhss.InterfaceC0870 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.InterfaceC1095 f3177;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0338 f3178;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public boolean f3179;

    public C0976(xhss.InterfaceC1095 r1) {
            r0 = this;
            r0.<init>()
            r0.f3177 = r1
            xhss.ᛴᛲᛴᛶ r1 = new xhss.ᛴᛲᛴᛶ
            r1.<init>()
            r0.f3178 = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
            r2 = this;
            boolean r0 = r2.f3179
            if (r0 != 0) goto L13
            r0 = 1
            r2.f3179 = r0
            xhss.ᲇᲁᲀᲇ r0 = r2.f3177
            r0.close()
            xhss.ᛴᛲᛴᛶ r2 = r2.f3178
            long r0 = r2.f1261
            r2.m696(r0)
        L13:
            return
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
            r0 = this;
            boolean r0 = r0.f3179
            r0 = r0 ^ 1
            return r0
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(java.nio.ByteBuffer r6) {
            r5 = this;
            xhss.ᛴᛲᛴᛶ r0 = r5.f3178
            long r1 = r0.f1261
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L1a
            xhss.ᲇᲁᲀᲇ r5 = r5.f3177
            r1 = 8192(0x2000, double:4.0474E-320)
            long r1 = r5.mo235(r1, r0)
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L1a
            r5 = -1
            return r5
        L1a:
            int r5 = r0.read(r6)
            return r5
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "buffer("
            r0.<init>(r1)
            xhss.ᲇᲁᲀᲇ r2 = r2.f3177
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final boolean m1606() {
            r6 = this;
            boolean r0 = r6.f3179
            r1 = 0
            if (r0 != 0) goto L1e
            xhss.ᛴᛲᛴᛶ r0 = r6.f3178
            boolean r2 = r0.m683()
            if (r2 == 0) goto L1d
            xhss.ᲇᲁᲀᲇ r6 = r6.f3177
            r2 = 8192(0x2000, double:4.0474E-320)
            long r2 = r6.mo235(r2, r0)
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L1d
            r6 = 1
            return r6
        L1d:
            return r1
        L1e:
            java.lang.String r6 = "closed"
            xhss.C0532.m950(r6)
            return r1
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final long m1607(byte r23, long r24, long r26) {
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r26
            boolean r4 = r0.f3179
            r5 = 0
            if (r4 != 0) goto L133
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 > 0) goto L12b
            r7 = r5
        L11:
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 >= 0) goto L128
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            xhss.ᛴᛲᛴᛶ r11 = r0.f3178
            if (r4 > 0) goto Lfe
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 > 0) goto Lfe
            long r12 = r11.f1261
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 <= 0) goto L27
            r14 = r12
            goto L28
        L27:
            r14 = r2
        L28:
            int r4 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r4 != 0) goto L32
        L2c:
            r24 = r5
        L2e:
            r16 = -1
            goto Ldc
        L32:
            xhss.ᛲᛳᲁᛳ r4 = r11.f1260
            if (r4 != 0) goto L37
            goto L2c
        L37:
            long r16 = r12 - r7
            int r16 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r16 >= 0) goto L8c
        L3d:
            int r16 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r16 <= 0) goto L4f
            xhss.ᛲᛳᲁᛳ r4 = r4.f623
            r24 = r5
            int r5 = r4.f620
            int r6 = r4.f619
            int r5 = r5 - r6
            long r5 = (long) r5
            long r12 = r12 - r5
            r5 = r24
            goto L3d
        L4f:
            r24 = r5
            r5 = r7
        L52:
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 >= 0) goto L2e
            r16 = -1
            byte[] r9 = r4.f622
            int r10 = r4.f620
            r18 = r5
            long r5 = (long) r10
            int r10 = r4.f619
            r20 = r9
            long r9 = (long) r10
            long r9 = r9 + r14
            long r9 = r9 - r12
            long r5 = java.lang.Math.min(r5, r9)
            int r5 = (int) r5
            int r6 = r4.f619
            long r9 = (long) r6
            long r9 = r9 + r18
            long r9 = r9 - r12
            int r6 = (int) r9
        L72:
            if (r6 >= r5) goto L81
            r9 = r20[r6]
            if (r9 != r1) goto L7e
            int r4 = r4.f619
            int r6 = r6 - r4
            long r4 = (long) r6
            long r4 = r4 + r12
            goto Lde
        L7e:
            int r6 = r6 + 1
            goto L72
        L81:
            int r5 = r4.f620
            int r6 = r4.f619
            int r5 = r5 - r6
            long r5 = (long) r5
            long r5 = r5 + r12
            xhss.ᛲᛳᲁᛳ r4 = r4.f625
            r12 = r5
            goto L52
        L8c:
            r24 = r5
            r16 = -1
        L90:
            int r9 = r4.f620
            int r10 = r4.f619
            int r9 = r9 - r10
            long r9 = (long) r9
            long r9 = r9 + r5
            int r12 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r12 > 0) goto L9f
            xhss.ᛲᛳᲁᛳ r4 = r4.f625
            r5 = r9
            goto L90
        L9f:
            r9 = r7
        La0:
            int r12 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r12 >= 0) goto Ldc
            byte[] r12 = r4.f622
            int r13 = r4.f620
            r18 = r5
            long r5 = (long) r13
            int r13 = r4.f619
            r20 = r9
            long r9 = (long) r13
            long r9 = r9 + r14
            long r9 = r9 - r18
            long r5 = java.lang.Math.min(r5, r9)
            int r5 = (int) r5
            int r6 = r4.f619
            long r9 = (long) r6
            long r9 = r9 + r20
            long r9 = r9 - r18
            int r6 = (int) r9
        Lc0:
            if (r6 >= r5) goto Ld0
            r9 = r12[r6]
            if (r9 != r1) goto Lcd
            int r4 = r4.f619
            int r6 = r6 - r4
            long r4 = (long) r6
            long r4 = r4 + r18
            goto Lde
        Lcd:
            int r6 = r6 + 1
            goto Lc0
        Ld0:
            int r5 = r4.f620
            int r6 = r4.f619
            int r5 = r5 - r6
            long r5 = (long) r5
            long r9 = r18 + r5
            xhss.ᛲᛳᲁᛳ r4 = r4.f625
            r5 = r9
            goto La0
        Ldc:
            r4 = r16
        Lde:
            int r6 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r6 == 0) goto Le3
            return r4
        Le3:
            long r4 = r11.f1261
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L12a
            xhss.ᲇᲁᲀᲇ r6 = r0.f3177
            r9 = 8192(0x2000, double:4.0474E-320)
            long r9 = r6.mo235(r9, r11)
            int r6 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r6 != 0) goto Lf6
            goto L12a
        Lf6:
            long r7 = java.lang.Math.max(r7, r4)
            r5 = r24
            goto L11
        Lfe:
            long r0 = r11.f1261
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "size="
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = " fromIndex="
            r4.append(r0)
            r4.append(r7)
            java.lang.String r0 = " toIndex="
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L128:
            r16 = -1
        L12a:
            return r16
        L12b:
            r24 = r5
            java.lang.String r0 = "fromIndex=0 toIndex="
            xhss.C0532.m952(r0, r2)
            return r24
        L133:
            r24 = r5
            java.lang.String r0 = "closed"
            xhss.C0532.m950(r0)
            return r24
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public final boolean m1608(long r7) {
            r6 = this;
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L2a
            boolean r0 = r6.f3179
            if (r0 != 0) goto L24
        Lb:
            xhss.ᛴᛲᛴᛶ r0 = r6.f3178
            long r2 = r0.f1261
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 >= 0) goto L22
            xhss.ᲇᲁᲀᲇ r2 = r6.f3177
            r3 = 8192(0x2000, double:4.0474E-320)
            long r2 = r2.mo235(r3, r0)
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto Lb
            return r1
        L22:
            r6 = 1
            return r6
        L24:
            java.lang.String r6 = "closed"
            xhss.C0532.m950(r6)
            return r1
        L2a:
            java.lang.String r6 = "byteCount < 0: "
            xhss.C0532.m952(r6, r7)
            return r1
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public final void m1609(long r1) {
            r0 = this;
            boolean r0 = r0.m1608(r1)
            if (r0 == 0) goto L7
            return
        L7:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // xhss.InterfaceC1095
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final xhss.C0213 mo250() {
            r0 = this;
            xhss.ᲇᲁᲀᲇ r0 = r0.f3177
            xhss.ᛲᲁᲈᛲ r0 = r0.mo250()
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public final int m1610() {
            r2 = this;
            r0 = 4
            r2.m1609(r0)
            xhss.ᛴᛲᛴᛶ r2 = r2.f3178
            int r2 = r2.m697()
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r2
            int r0 = r0 >>> 24
            r1 = 16711680(0xff0000, float:2.3418052E-38)
            r1 = r1 & r2
            int r1 = r1 >>> 8
            r0 = r0 | r1
            r1 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r2
            int r1 = r1 << 8
            r0 = r0 | r1
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final int m1611() {
            r2 = this;
            r0 = 4
            r2.m1609(r0)
            xhss.ᛴᛲᛴᛶ r2 = r2.f3178
            int r2 = r2.m697()
            return r2
    }

    @Override // xhss.InterfaceC1095
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public final long mo235(long r7, xhss.C0338 r9) {
            r6 = this;
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 < 0) goto L35
            boolean r3 = r6.f3179
            if (r3 != 0) goto L2f
            xhss.ᛴᛲᛴᛶ r3 = r6.f3178
            long r4 = r3.f1261
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L24
            if (r2 != 0) goto L15
            return r0
        L15:
            xhss.ᲇᲁᲀᲇ r6 = r6.f3177
            r0 = 8192(0x2000, double:4.0474E-320)
            long r0 = r6.mo235(r0, r3)
            r4 = -1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L24
            return r4
        L24:
            long r0 = r3.f1261
            long r6 = java.lang.Math.min(r7, r0)
            long r6 = r3.mo235(r6, r9)
            return r6
        L2f:
            java.lang.String r6 = "closed"
            xhss.C0532.m950(r6)
            return r0
        L35:
            java.lang.String r6 = "byteCount < 0: "
            xhss.C0532.m952(r6, r7)
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public final void m1612(long r6) {
            r5 = this;
            boolean r0 = r5.f3179
            if (r0 != 0) goto L33
        L4:
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L32
            xhss.ᛴᛲᛴᛶ r2 = r5.f3178
            long r3 = r2.f1261
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L27
            xhss.ᲇᲁᲀᲇ r0 = r5.f3177
            r3 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.mo235(r3, r2)
            r3 = -1
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L21
            goto L27
        L21:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L27:
            long r0 = r2.f1261
            long r0 = java.lang.Math.min(r6, r0)
            r2.m696(r0)
            long r6 = r6 - r0
            goto L4
        L32:
            return
        L33:
            java.lang.String r5 = "closed"
            xhss.C0532.m950(r5)
            return
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public final short m1613() {
            r2 = this;
            r0 = 2
            r2.m1609(r0)
            xhss.ᛴᛲᛴᛶ r2 = r2.f3178
            short r2 = r2.m705()
            return r2
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final xhss.C0289 m1614(long r1) {
            r0 = this;
            r0.m1609(r1)
            xhss.ᛴᛲᛴᛶ r0 = r0.f3178
            xhss.ᛳᛶᲈᲈ r0 = r0.m695(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final byte m1615() {
            r2 = this;
            r0 = 1
            r2.m1609(r0)
            xhss.ᛴᛲᛴᛶ r2 = r2.f3178
            byte r2 = r2.m703()
            return r2
    }

    @Override // xhss.InterfaceC0870
    /* JADX INFO: renamed from: ᲇᛶᛴᲀ */
    public final byte[] mo704() {
            r2 = this;
            xhss.ᲇᲁᲀᲇ r0 = r2.f3177
            xhss.ᛴᛲᛴᛶ r2 = r2.f3178
            r2.m706(r0)
            long r0 = r2.f1261
            byte[] r2 = r2.m699(r0)
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public final java.lang.String m1616(long r22) {
            r21 = this;
            r6 = r22
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto Lf0
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r12 = 1
            if (r0 != 0) goto L15
            r4 = r10
            goto L18
        L15:
            long r0 = r6 + r12
            r4 = r0
        L18:
            r1 = 10
            r2 = 0
            r0 = r21
            long r1 = r0.m1607(r1, r2, r4)
            r14 = -1
            int r3 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            xhss.ᛴᛲᛴᛶ r14 = r0.f3178
            if (r3 == 0) goto L2f
            java.lang.String r0 = xhss.AbstractC0003.m91(r1, r14)
            return r0
        L2f:
            int r1 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r1 >= 0) goto L58
            boolean r1 = r0.m1608(r4)
            if (r1 == 0) goto L58
            long r1 = r4 - r12
            byte r1 = r14.m689(r1)
            r2 = 13
            if (r1 != r2) goto L58
            long r1 = r4 + r12
            boolean r0 = r0.m1608(r1)
            if (r0 == 0) goto L58
            byte r0 = r14.m689(r4)
            r1 = 10
            if (r0 != r1) goto L58
            java.lang.String r0 = xhss.AbstractC0003.m91(r4, r14)
            return r0
        L58:
            xhss.ᛴᛲᛴᛶ r0 = new xhss.ᛴᛲᛴᛶ
            r0.<init>()
            long r1 = r14.f1261
            r3 = 32
            long r19 = java.lang.Math.min(r3, r1)
            long r1 = r14.f1261
            r17 = 0
            r15 = r1
            xhss.AbstractC0694.m1210(r15, r17, r19)
            int r1 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
            if (r1 == 0) goto Lbf
            long r1 = r0.f1261
            long r1 = r1 + r19
            r0.f1261 = r1
            xhss.ᛲᛳᲁᛳ r1 = r14.f1260
        L79:
            int r2 = r1.f620
            int r3 = r1.f619
            int r2 = r2 - r3
            long r2 = (long) r2
            int r4 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r4 < 0) goto L88
            long r17 = r17 - r2
            xhss.ᛲᛳᲁᛳ r1 = r1.f625
            goto L79
        L88:
            r2 = r17
            r4 = r19
        L8c:
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 <= 0) goto Lbf
            xhss.ᛲᛳᲁᛳ r10 = r1.m390()
            int r11 = r10.f619
            int r2 = (int) r2
            int r11 = r11 + r2
            r10.f619 = r11
            int r2 = (int) r4
            int r11 = r11 + r2
            int r2 = r10.f620
            int r2 = java.lang.Math.min(r11, r2)
            r10.f620 = r2
            xhss.ᛲᛳᲁᛳ r2 = r0.f1260
            if (r2 != 0) goto Laf
            r10.f623 = r10
            r10.f625 = r10
            r0.f1260 = r10
            goto Lb4
        Laf:
            xhss.ᛲᛳᲁᛳ r2 = r2.f623
            r2.m389(r10)
        Lb4:
            int r2 = r10.f620
            int r3 = r10.f619
            int r2 = r2 - r3
            long r2 = (long) r2
            long r4 = r4 - r2
            xhss.ᛲᛳᲁᛳ r1 = r1.f625
            r2 = r8
            goto L8c
        Lbf:
            java.io.EOFException r1 = new java.io.EOFException
            long r2 = r14.f1261
            long r2 = java.lang.Math.min(r2, r6)
            long r4 = r0.f1261
            xhss.ᛳᛶᲈᲈ r0 = r0.m695(r4)
            java.lang.String r0 = r0.mo608()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "\\n not found: limit="
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = " content="
            r4.append(r2)
            r4.append(r0)
            r0 = 8230(0x2026, float:1.1533E-41)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.<init>(r0)
            throw r1
        Lf0:
            java.lang.String r0 = "limit < 0: "
            xhss.C0532.m952(r0, r6)
            r0 = 0
            return r0
    }

    @Override // xhss.InterfaceC0870
    /* JADX INFO: renamed from: ᲈᛳᲀ */
    public final java.io.InputStream mo707() {
            r2 = this;
            xhss.ᲀᲈᲈ r0 = new xhss.ᲀᲈᲈ
            r1 = 1
            r0.<init>(r2, r1)
            return r0
    }
}
