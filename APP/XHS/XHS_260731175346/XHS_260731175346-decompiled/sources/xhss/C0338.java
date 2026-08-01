package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛲᛴᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0338 implements xhss.InterfaceC0870, xhss.InterfaceC1135, java.lang.Cloneable, java.nio.channels.ByteChannel {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public xhss.C0147 f1260;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public long f1261;

    public final java.lang.Object clone() {
            r6 = this;
            xhss.ᛴᛲᛴᛶ r0 = new xhss.ᛴᛲᛴᛶ
            r0.<init>()
            long r1 = r6.f1261
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto Le
            return r0
        Le:
            xhss.ᛲᛳᲁᛳ r1 = r6.f1260
            xhss.ᛲᛳᲁᛳ r2 = r1.m390()
            r0.f1260 = r2
            r2.f623 = r2
            r2.f625 = r2
            xhss.ᛲᛳᲁᛳ r3 = r1.f625
        L1c:
            if (r3 == r1) goto L2a
            xhss.ᛲᛳᲁᛳ r4 = r2.f623
            xhss.ᛲᛳᲁᛳ r5 = r3.m390()
            r4.m389(r5)
            xhss.ᛲᛳᲁᛳ r3 = r3.f625
            goto L1c
        L2a:
            long r1 = r6.f1261
            r0.f1261 = r1
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, xhss.InterfaceC0102
    public final void close() {
            r0 = this;
            return
    }

    public final boolean equals(java.lang.Object r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r0 != r1) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof xhss.C0338
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            long r5 = r0.f1261
            xhss.ᛴᛲᛴᛶ r1 = (xhss.C0338) r1
            long r7 = r1.f1261
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L19
            return r4
        L19:
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L20
            return r2
        L20:
            xhss.ᛲᛳᲁᛳ r3 = r0.f1260
            xhss.ᛲᛳᲁᛳ r1 = r1.f1260
            int r5 = r3.f619
            int r6 = r1.f619
            r9 = r7
        L29:
            long r11 = r0.f1261
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L68
            int r11 = r3.f620
            int r11 = r11 - r5
            int r12 = r1.f620
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L3b:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L56
            byte[] r15 = r3.f622
            int r16 = r5 + 1
            r5 = r15[r5]
            byte[] r15 = r1.f622
            int r17 = r6 + 1
            r6 = r15[r6]
            if (r5 == r6) goto L4e
            return r4
        L4e:
            r5 = 1
            long r13 = r13 + r5
            r5 = r16
            r6 = r17
            goto L3b
        L56:
            int r13 = r3.f620
            if (r5 != r13) goto L5e
            xhss.ᛲᛳᲁᛳ r3 = r3.f625
            int r5 = r3.f619
        L5e:
            int r13 = r1.f620
            if (r6 != r13) goto L66
            xhss.ᛲᛳᲁᛳ r1 = r1.f625
            int r6 = r1.f619
        L66:
            long r9 = r9 + r11
            goto L29
        L68:
            return r2
    }

    @Override // xhss.InterfaceC0102, java.io.Flushable
    public final void flush() {
            r0 = this;
            return
    }

    public final int hashCode() {
            r5 = this;
            xhss.ᛲᛳᲁᛳ r0 = r5.f1260
            if (r0 != 0) goto L6
            r5 = 0
            return r5
        L6:
            r1 = 1
        L7:
            int r2 = r0.f619
            int r3 = r0.f620
        Lb:
            if (r2 >= r3) goto L17
            int r1 = r1 * 31
            byte[] r4 = r0.f622
            r4 = r4[r2]
            int r1 = r1 + r4
            int r2 = r2 + 1
            goto Lb
        L17:
            xhss.ᛲᛳᲁᛳ r0 = r0.f625
            xhss.ᛲᛳᲁᛳ r2 = r5.f1260
            if (r0 != r2) goto L7
            return r1
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(java.nio.ByteBuffer r7) {
            r6 = this;
            xhss.ᛲᛳᲁᛳ r0 = r6.f1260
            if (r0 != 0) goto L6
            r6 = -1
            return r6
        L6:
            int r1 = r7.remaining()
            int r2 = r0.f620
            int r3 = r0.f619
            int r2 = r2 - r3
            int r1 = java.lang.Math.min(r1, r2)
            byte[] r2 = r0.f622
            int r3 = r0.f619
            r7.put(r2, r3, r1)
            int r7 = r0.f619
            int r7 = r7 + r1
            r0.f619 = r7
            long r2 = r6.f1261
            long r4 = (long) r1
            long r2 = r2 - r4
            r6.f1261 = r2
            int r2 = r0.f620
            if (r7 != r2) goto L32
            xhss.ᛲᛳᲁᛳ r7 = r0.m391()
            r6.f1260 = r7
            xhss.AbstractC0185.m445(r0)
        L32:
            return r1
    }

    public final int read(byte[] r8, int r9, int r10) {
            r7 = this;
            int r0 = r8.length
            long r1 = (long) r0
            long r3 = (long) r9
            long r5 = (long) r10
            xhss.AbstractC0694.m1210(r1, r3, r5)
            xhss.ᛲᛳᲁᛳ r0 = r7.f1260
            if (r0 != 0) goto Ld
            r7 = -1
            return r7
        Ld:
            int r1 = r0.f620
            int r2 = r0.f619
            int r1 = r1 - r2
            int r10 = java.lang.Math.min(r10, r1)
            byte[] r1 = r0.f622
            int r2 = r0.f619
            int r3 = r2 + r10
            int r3 = r3 - r2
            java.lang.System.arraycopy(r1, r2, r8, r9, r3)
            int r8 = r0.f619
            int r8 = r8 + r10
            r0.f619 = r8
            long r1 = r7.f1261
            long r3 = (long) r10
            long r1 = r1 - r3
            r7.f1261 = r1
            int r9 = r0.f620
            if (r8 != r9) goto L38
            xhss.ᛲᛳᲁᛳ r8 = r0.m391()
            r7.f1260 = r8
            xhss.AbstractC0185.m445(r0)
        L38:
            return r10
    }

    public final java.lang.String toString() {
            r4 = this;
            long r0 = r4.f1261
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L13
            int r0 = (int) r0
            xhss.ᛳᛶᲈᲈ r4 = r4.m694(r0)
            java.lang.String r4 = r4.toString()
            return r4
        L13:
            long r0 = r4.f1261
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = "size > Int.MAX_VALUE: "
            r4.<init>(r2)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer r7) {
            r6 = this;
            int r0 = r7.remaining()
            r1 = r0
        L5:
            if (r1 <= 0) goto L22
            r2 = 1
            xhss.ᛲᛳᲁᛳ r2 = r6.m691(r2)
            int r3 = r2.f620
            int r3 = 8192 - r3
            int r3 = java.lang.Math.min(r1, r3)
            byte[] r4 = r2.f622
            int r5 = r2.f620
            r7.get(r4, r5, r3)
            int r1 = r1 - r3
            int r4 = r2.f620
            int r4 = r4 + r3
            r2.f620 = r4
            goto L5
        L22:
            long r1 = r6.f1261
            long r3 = (long) r0
            long r1 = r1 + r3
            r6.f1261 = r1
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final boolean m683() {
            r4 = this;
            long r0 = r4.f1261
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r4 = 1
            return r4
        La:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ᛱᛳᲁᲈ, reason: contains not printable characters */
    public final void m684(long r13) {
            r12 = this;
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 != 0) goto Lc
            r13 = 48
            r12.m701(r13)
            return
        Lc:
            r0 = 1
            long r1 = r13 >>> r0
            long r1 = r1 | r13
            r3 = 2
            long r4 = r1 >>> r3
            long r1 = r1 | r4
            r4 = 4
            long r5 = r1 >>> r4
            long r1 = r1 | r5
            r5 = 8
            long r6 = r1 >>> r5
            long r1 = r1 | r6
            r6 = 16
            long r7 = r1 >>> r6
            long r1 = r1 | r7
            r7 = 32
            long r8 = r1 >>> r7
            long r1 = r1 | r8
            long r8 = r1 >>> r0
            r10 = 6148914691236517205(0x5555555555555555, double:1.1945305291614955E103)
            long r8 = r8 & r10
            long r1 = r1 - r8
            long r8 = r1 >>> r3
            r10 = 3689348814741910323(0x3333333333333333, double:4.667261458395856E-62)
            long r8 = r8 & r10
            long r1 = r1 & r10
            long r8 = r8 + r1
            long r1 = r8 >>> r4
            long r1 = r1 + r8
            r8 = 1085102592571150095(0xf0f0f0f0f0f0f0f, double:3.815736827118017E-236)
            long r1 = r1 & r8
            long r8 = r1 >>> r5
            long r1 = r1 + r8
            long r5 = r1 >>> r6
            long r1 = r1 + r5
            r5 = 63
            long r8 = r1 & r5
            long r1 = r1 >>> r7
            long r1 = r1 & r5
            long r8 = r8 + r1
            r1 = 3
            long r8 = r8 + r1
            r1 = 4
            long r8 = r8 / r1
            int r1 = (int) r8
            xhss.ᛲᛳᲁᛳ r2 = r12.m691(r1)
            byte[] r3 = r2.f622
            int r5 = r2.f620
            int r6 = r5 + r1
            int r6 = r6 - r0
        L62:
            if (r6 < r5) goto L72
            byte[] r0 = xhss.AbstractC0003.f139
            r7 = 15
            long r7 = r7 & r13
            int r7 = (int) r7
            r0 = r0[r7]
            r3[r6] = r0
            long r13 = r13 >>> r4
            int r6 = r6 + (-1)
            goto L62
        L72:
            int r13 = r2.f620
            int r13 = r13 + r1
            r2.f620 = r13
            long r13 = r12.f1261
            long r0 = (long) r1
            long r13 = r13 + r0
            r12.f1261 = r13
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲀᲈ, reason: contains not printable characters */
    public final void m685(int r8) {
            r7 = this;
            r0 = 4
            xhss.ᛲᛳᲁᛳ r1 = r7.m691(r0)
            byte[] r2 = r1.f622
            int r3 = r1.f620
            int r4 = r3 + 1
            int r5 = r8 >>> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r2[r3] = r5
            int r5 = r3 + 2
            int r6 = r8 >>> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r3 + 3
            int r6 = r8 >>> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r2[r5] = r6
            int r3 = r3 + r0
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r2[r4] = r8
            r1.f620 = r3
            long r0 = r7.f1261
            r2 = 4
            long r0 = r0 + r2
            r7.f1261 = r0
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛲ, reason: contains not printable characters */
    public final void m686(java.lang.String r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length()
            r2.m702(r3, r0, r1)
            return
    }

    /* JADX INFO: renamed from: ᛳᛶᛷᲀ, reason: contains not printable characters */
    public final void m687(xhss.C0289 r2) {
            r1 = this;
            int r0 = r2.mo611()
            r2.mo618(r1, r0)
            return
    }

    /* JADX INFO: renamed from: ᛳᛸᛵᲀ, reason: contains not printable characters */
    public final void m688(int r9) {
            r8 = this;
            r0 = 128(0x80, float:1.8E-43)
            if (r9 >= r0) goto L8
            r8.m701(r9)
            return
        L8:
            r1 = 2048(0x800, float:2.87E-42)
            r2 = 63
            if (r9 >= r1) goto L30
            r1 = 2
            xhss.ᛲᛳᲁᛳ r3 = r8.m691(r1)
            byte[] r4 = r3.f622
            int r5 = r3.f620
            int r6 = r9 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            r9 = r9 & r2
            r9 = r9 | r0
            byte r9 = (byte) r9
            r4[r6] = r9
            int r5 = r5 + r1
            r3.f620 = r5
            long r0 = r8.f1261
            r2 = 2
            long r0 = r0 + r2
            r8.f1261 = r0
            return
        L30:
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r1 > r9) goto L3e
            r1 = 57344(0xe000, float:8.0356E-41)
            if (r9 >= r1) goto L3e
            r8.m701(r2)
            return
        L3e:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r9 >= r1) goto L6d
            r1 = 3
            xhss.ᛲᛳᲁᛳ r3 = r8.m691(r1)
            byte[] r4 = r3.f622
            int r5 = r3.f620
            int r6 = r9 >> 12
            r6 = r6 | 224(0xe0, float:3.14E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            int r7 = r9 >> 6
            r7 = r7 & r2
            r7 = r7 | r0
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 2
            r9 = r9 & r2
            r9 = r9 | r0
            byte r9 = (byte) r9
            r4[r6] = r9
            int r5 = r5 + r1
            r3.f620 = r5
            long r0 = r8.f1261
            r2 = 3
            long r0 = r0 + r2
            r8.f1261 = r0
            return
        L6d:
            r1 = 1114111(0x10ffff, float:1.561202E-39)
            if (r9 > r1) goto La6
            r1 = 4
            xhss.ᛲᛳᲁᛳ r3 = r8.m691(r1)
            byte[] r4 = r3.f622
            int r5 = r3.f620
            int r6 = r9 >> 18
            r6 = r6 | 240(0xf0, float:3.36E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            int r7 = r9 >> 12
            r7 = r7 & r2
            r7 = r7 | r0
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 2
            int r7 = r9 >> 6
            r7 = r7 & r2
            r7 = r7 | r0
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 3
            r9 = r9 & r2
            r9 = r9 | r0
            byte r9 = (byte) r9
            r4[r6] = r9
            int r5 = r5 + r1
            r3.f620 = r5
            long r0 = r8.f1261
            r2 = 4
            long r0 = r0 + r2
            r8.f1261 = r0
            return
        La6:
            java.lang.String r8 = xhss.AbstractC0694.m1201(r9)
            java.lang.String r9 = "Unexpected code point: 0x"
            java.lang.String r8 = r9.concat(r8)
            xhss.C0532.m959(r8)
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final byte m689(long r7) {
            r6 = this;
            long r0 = r6.f1261
            r4 = 1
            r2 = r7
            xhss.AbstractC0694.m1210(r0, r2, r4)
            xhss.ᛲᛳᲁᛳ r7 = r6.f1260
            r7.getClass()
            long r0 = r6.f1261
            long r4 = r0 - r2
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L2e
        L15:
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L23
            xhss.ᛲᛳᲁᛳ r7 = r7.f623
            int r6 = r7.f620
            int r8 = r7.f619
            int r6 = r6 - r8
            long r4 = (long) r6
            long r0 = r0 - r4
            goto L15
        L23:
            byte[] r6 = r7.f622
            int r7 = r7.f619
            long r7 = (long) r7
            long r7 = r7 + r2
            long r7 = r7 - r0
            int r7 = (int) r7
            r6 = r6[r7]
            return r6
        L2e:
            r0 = 0
        L30:
            int r6 = r7.f620
            int r8 = r7.f619
            int r6 = r6 - r8
            long r4 = (long) r6
            long r4 = r4 + r0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 > 0) goto L3f
            xhss.ᛲᛳᲁᛳ r7 = r7.f625
            r0 = r4
            goto L30
        L3f:
            byte[] r6 = r7.f622
            long r7 = (long) r8
            long r7 = r7 + r2
            long r7 = r7 - r0
            int r7 = (int) r7
            r6 = r6[r7]
            return r6
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public final java.lang.String m690(long r7, java.nio.charset.Charset r9) {
            r6 = this;
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L55
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 > 0) goto L55
            long r1 = r6.f1261
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 < 0) goto L4f
            if (r0 != 0) goto L18
            java.lang.String r6 = ""
            return r6
        L18:
            xhss.ᛲᛳᲁᛳ r0 = r6.f1260
            int r1 = r0.f619
            long r2 = (long) r1
            long r2 = r2 + r7
            int r4 = r0.f620
            long r4 = (long) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L2f
            java.lang.String r0 = new java.lang.String
            byte[] r6 = r6.m699(r7)
            r0.<init>(r6, r9)
            return r0
        L2f:
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r0.f622
            int r4 = (int) r7
            r2.<init>(r3, r1, r4, r9)
            int r9 = r0.f619
            int r9 = r9 + r4
            r0.f619 = r9
            long r3 = r6.f1261
            long r3 = r3 - r7
            r6.f1261 = r3
            int r7 = r0.f620
            if (r9 != r7) goto L4e
            xhss.ᛲᛳᲁᛳ r7 = r0.m391()
            r6.f1260 = r7
            xhss.AbstractC0185.m445(r0)
        L4e:
            return r2
        L4f:
            java.io.EOFException r6 = new java.io.EOFException
            r6.<init>()
            throw r6
        L55:
            java.lang.String r6 = "byteCount: "
            xhss.C0532.m952(r6, r7)
            r6 = 0
            return r6
    }

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public final xhss.C0147 m691(int r3) {
            r2 = this;
            r0 = 1
            if (r3 < r0) goto L2b
            r0 = 8192(0x2000, float:1.148E-41)
            if (r3 > r0) goto L2b
            xhss.ᛲᛳᲁᛳ r1 = r2.f1260
            if (r1 != 0) goto L16
            xhss.ᛲᛳᲁᛳ r3 = xhss.AbstractC0185.m444()
            r2.f1260 = r3
            r3.f623 = r3
            r3.f625 = r3
            return r3
        L16:
            xhss.ᛲᛳᲁᛳ r2 = r1.f623
            int r1 = r2.f620
            int r1 = r1 + r3
            if (r1 > r0) goto L23
            boolean r3 = r2.f621
            if (r3 != 0) goto L22
            goto L23
        L22:
            return r2
        L23:
            xhss.ᛲᛳᲁᛳ r3 = xhss.AbstractC0185.m444()
            r2.m389(r3)
            return r3
        L2b:
            java.lang.String r2 = "unexpected capacity"
            xhss.C0532.m959(r2)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public final java.lang.String m692() {
            r3 = this;
            long r0 = r3.f1261
            java.nio.charset.Charset r2 = xhss.AbstractC0619.f2136
            java.lang.String r3 = r3.m690(r0, r2)
            return r3
    }

    @Override // xhss.InterfaceC0102
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public final void mo228(long r9, xhss.C0338 r11) {
            r8 = this;
            if (r11 == r8) goto Ld9
            long r0 = r11.f1261
            r2 = 0
            r4 = r9
            xhss.AbstractC0694.m1210(r0, r2, r4)
        La:
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto Ld8
            xhss.ᛲᛳᲁᛳ r0 = r11.f1260
            int r1 = r0.f620
            int r2 = r0.f619
            int r1 = r1 - r2
            long r2 = (long) r1
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            r3 = 0
            if (r2 >= 0) goto L84
            xhss.ᛲᛳᲁᛳ r2 = r8.f1260
            if (r2 == 0) goto L24
            xhss.ᛲᛳᲁᛳ r2 = r2.f623
            goto L25
        L24:
            r2 = 0
        L25:
            if (r2 == 0) goto L4e
            boolean r4 = r2.f621
            if (r4 == 0) goto L4e
            int r4 = r2.f620
            long r4 = (long) r4
            long r4 = r4 + r9
            boolean r6 = r2.f624
            if (r6 == 0) goto L35
            r6 = r3
            goto L37
        L35:
            int r6 = r2.f619
        L37:
            long r6 = (long) r6
            long r4 = r4 - r6
            r6 = 8192(0x2000, double:4.0474E-320)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 > 0) goto L4e
            int r1 = (int) r9
            r0.m392(r2, r1)
            long r0 = r11.f1261
            long r0 = r0 - r9
            r11.f1261 = r0
            long r0 = r8.f1261
            long r0 = r0 + r9
            r8.f1261 = r0
            return
        L4e:
            int r2 = (int) r9
            if (r2 <= 0) goto L7e
            if (r2 > r1) goto L7e
            r1 = 1024(0x400, float:1.435E-42)
            if (r2 < r1) goto L5c
            xhss.ᛲᛳᲁᛳ r1 = r0.m390()
            goto L6b
        L5c:
            xhss.ᛲᛳᲁᛳ r1 = xhss.AbstractC0185.m444()
            byte[] r4 = r0.f622
            byte[] r5 = r1.f622
            int r6 = r0.f619
            int r7 = r6 + r2
            xhss.AbstractC0193.m452(r4, r5, r6, r7)
        L6b:
            int r4 = r1.f619
            int r4 = r4 + r2
            r1.f620 = r4
            int r4 = r0.f619
            int r4 = r4 + r2
            r0.f619 = r4
            xhss.ᛲᛳᲁᛳ r0 = r0.f623
            r0.m389(r1)
            r11.f1260 = r1
            r0 = r1
            goto L84
        L7e:
            java.lang.String r8 = "byteCount out of range"
            xhss.C0532.m959(r8)
            return
        L84:
            int r1 = r0.f620
            int r2 = r0.f619
            int r1 = r1 - r2
            long r1 = (long) r1
            xhss.ᛲᛳᲁᛳ r4 = r0.m391()
            r11.f1260 = r4
            xhss.ᛲᛳᲁᛳ r4 = r8.f1260
            if (r4 != 0) goto L9b
            r8.f1260 = r0
            r0.f623 = r0
            r0.f625 = r0
            goto Lc6
        L9b:
            xhss.ᛲᛳᲁᛳ r4 = r4.f623
            r4.m389(r0)
            xhss.ᛲᛳᲁᛳ r4 = r0.f623
            if (r4 == r0) goto Ld3
            boolean r5 = r4.f621
            if (r5 != 0) goto La9
            goto Lc6
        La9:
            int r5 = r0.f620
            int r6 = r0.f619
            int r5 = r5 - r6
            int r6 = r4.f620
            int r6 = 8192 - r6
            boolean r7 = r4.f624
            if (r7 == 0) goto Lb7
            goto Lb9
        Lb7:
            int r3 = r4.f619
        Lb9:
            int r6 = r6 + r3
            if (r5 <= r6) goto Lbd
            goto Lc6
        Lbd:
            r0.m392(r4, r5)
            r0.m391()
            xhss.AbstractC0185.m445(r0)
        Lc6:
            long r3 = r11.f1261
            long r3 = r3 - r1
            r11.f1261 = r3
            long r3 = r8.f1261
            long r3 = r3 + r1
            r8.f1261 = r3
            long r9 = r9 - r1
            goto La
        Ld3:
            java.lang.String r8 = "cannot compact"
            xhss.C0532.m950(r8)
        Ld8:
            return
        Ld9:
            java.lang.String r8 = "source == this"
            xhss.C0532.m959(r8)
            return
    }

    @Override // xhss.InterfaceC1095
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final xhss.C0213 mo250() {
            r0 = this;
            xhss.ᛳᲁᲁᛲ r0 = xhss.C0213.f787
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public final long m693() {
            r15 = this;
            long r0 = r15.f1261
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La6
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            xhss.ᛲᛳᲁᛳ r7 = r15.f1260
            byte[] r8 = r7.f622
            int r9 = r7.f619
            int r10 = r7.f620
        L14:
            if (r9 >= r10) goto L8b
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L23
            r12 = 57
            if (r11 > r12) goto L23
            int r12 = r11 + (-48)
            goto L38
        L23:
            r12 = 97
            if (r11 < r12) goto L2e
            r12 = 102(0x66, float:1.43E-43)
            if (r11 > r12) goto L2e
            int r12 = r11 + (-87)
            goto L38
        L2e:
            r12 = 65
            if (r11 < r12) goto L63
            r12 = 70
            if (r11 > r12) goto L63
            int r12 = r11 + (-55)
        L38:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r4
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L48
            r11 = 4
            long r4 = r4 << r11
            long r11 = (long) r12
            long r4 = r4 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L14
        L48:
            xhss.ᛴᛲᛴᛶ r15 = new xhss.ᛴᛲᛴᛶ
            r15.<init>()
            r15.m684(r4)
            r15.m701(r11)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r15 = r15.m692()
            java.lang.String r1 = "Number too large: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15)
            throw r0
        L63:
            r6 = 1
            if (r1 == 0) goto L67
            goto L8b
        L67:
            java.lang.NumberFormatException r15 = new java.lang.NumberFormatException
            char[] r1 = xhss.AbstractC0694.f2348
            int r2 = r11 >> 4
            r2 = r2 & 15
            char r2 = r1[r2]
            r3 = r11 & 15
            char r1 = r1[r3]
            r3 = 2
            char[] r3 = new char[r3]
            r3[r0] = r2
            r3[r6] = r1
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r15.<init>(r0)
            throw r15
        L8b:
            if (r9 != r10) goto L97
            xhss.ᛲᛳᲁᛳ r8 = r7.m391()
            r15.f1260 = r8
            xhss.AbstractC0185.m445(r7)
            goto L99
        L97:
            r7.f619 = r9
        L99:
            if (r6 != 0) goto L9f
            xhss.ᛲᛳᲁᛳ r7 = r15.f1260
            if (r7 != 0) goto Lc
        L9f:
            long r2 = r15.f1261
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f1261 = r2
            return r4
        La6:
            java.io.EOFException r15 = new java.io.EOFException
            r15.<init>()
            throw r15
    }

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public final xhss.C0289 m694(int r8) {
            r7 = this;
            if (r8 != 0) goto L5
            xhss.ᛳᛶᲈᲈ r7 = xhss.C0289.f1117
            return r7
        L5:
            long r0 = r7.f1261
            r2 = 0
            long r4 = (long) r8
            xhss.AbstractC0694.m1210(r0, r2, r4)
            xhss.ᛲᛳᲁᛳ r0 = r7.f1260
            r1 = 0
            r2 = r1
            r3 = r2
        L12:
            if (r2 >= r8) goto L29
            int r4 = r0.f620
            int r5 = r0.f619
            if (r4 == r5) goto L21
            int r4 = r4 - r5
            int r2 = r2 + r4
            int r3 = r3 + 1
            xhss.ᛲᛳᲁᛳ r0 = r0.f625
            goto L12
        L21:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r8 = "s.limit == s.pos"
            r7.<init>(r8)
            throw r7
        L29:
            byte[][] r0 = new byte[r3][]
            int r2 = r3 * 2
            int[] r2 = new int[r2]
            xhss.ᛲᛳᲁᛳ r7 = r7.f1260
            r4 = r1
        L32:
            if (r1 >= r8) goto L51
            byte[] r5 = r7.f622
            r0[r4] = r5
            int r5 = r7.f620
            int r6 = r7.f619
            int r5 = r5 - r6
            int r1 = r1 + r5
            int r5 = java.lang.Math.min(r1, r8)
            r2[r4] = r5
            int r5 = r4 + r3
            int r6 = r7.f619
            r2[r5] = r6
            r5 = 1
            r7.f624 = r5
            int r4 = r4 + r5
            xhss.ᛲᛳᲁᛳ r7 = r7.f625
            goto L32
        L51:
            xhss.ᛷᛷᛱᛵ r7 = new xhss.ᛷᛷᛱᛵ
            r7.<init>(r0, r2)
            return r7
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final xhss.C0289 m695(long r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L32
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L32
            long r0 = r2.f1261
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L2c
            r0 = 4096(0x1000, double:2.0237E-320)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L22
            int r0 = (int) r3
            xhss.ᛳᛶᲈᲈ r0 = r2.m694(r0)
            r2.m696(r3)
            return r0
        L22:
            xhss.ᛳᛶᲈᲈ r0 = new xhss.ᛳᛶᲈᲈ
            byte[] r2 = r2.m699(r3)
            r0.<init>(r2)
            return r0
        L2c:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
        L32:
            java.lang.String r2 = "byteCount: "
            xhss.C0532.m952(r2, r3)
            r2 = 0
            return r2
    }

    @Override // xhss.InterfaceC1095
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public final long mo235(long r5, xhss.C0338 r7) {
            r4 = this;
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L18
            long r2 = r4.f1261
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto Lf
            r4 = -1
            return r4
        Lf:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L14
            r5 = r2
        L14:
            r7.mo228(r5, r4)
            return r5
        L18:
            java.lang.String r4 = "byteCount < 0: "
            xhss.C0532.m952(r4, r5)
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public final void m696(long r7) {
            r6 = this;
        L0:
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L35
            xhss.ᛲᛳᲁᛳ r0 = r6.f1260
            if (r0 == 0) goto L2f
            int r1 = r0.f620
            int r2 = r0.f619
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r7, r1)
            int r1 = (int) r1
            long r2 = r6.f1261
            long r4 = (long) r1
            long r2 = r2 - r4
            r6.f1261 = r2
            long r7 = r7 - r4
            int r2 = r0.f619
            int r2 = r2 + r1
            r0.f619 = r2
            int r1 = r0.f620
            if (r2 != r1) goto L0
            xhss.ᛲᛳᲁᛳ r1 = r0.m391()
            r6.f1260 = r1
            xhss.AbstractC0185.m445(r0)
            goto L0
        L2f:
            java.io.EOFException r6 = new java.io.EOFException
            r6.<init>()
            throw r6
        L35:
            return
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public final int m697() {
            r11 = this;
            long r0 = r11.f1261
            r2 = 4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L6c
            xhss.ᛲᛳᲁᛳ r4 = r11.f1260
            int r5 = r4.f619
            int r6 = r4.f620
            int r7 = r6 - r5
            long r7 = (long) r7
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 >= 0) goto L37
            byte r0 = r11.m703()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            byte r1 = r11.m703()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            byte r1 = r11.m703()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            byte r11 = r11.m703()
            r11 = r11 & 255(0xff, float:3.57E-43)
            r11 = r11 | r0
            return r11
        L37:
            byte[] r7 = r4.f622
            int r8 = r5 + 1
            r9 = r7[r5]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 24
            int r10 = r5 + 2
            r8 = r7[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 16
            r8 = r8 | r9
            int r9 = r5 + 3
            r10 = r7[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 8
            r8 = r8 | r10
            int r5 = r5 + 4
            r7 = r7[r9]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r7 = r7 | r8
            long r0 = r0 - r2
            r11.f1261 = r0
            if (r5 != r6) goto L69
            xhss.ᛲᛳᲁᛳ r0 = r4.m391()
            r11.f1260 = r0
            xhss.AbstractC0185.m445(r4)
            return r7
        L69:
            r4.f619 = r5
            return r7
        L6c:
            java.io.EOFException r11 = new java.io.EOFException
            r11.<init>()
            throw r11
    }

    @Override // xhss.InterfaceC1135
    /* JADX INFO: renamed from: ᛸᛷᲈᲈ */
    public final /* bridge */ /* synthetic */ xhss.InterfaceC1135 mo230(java.lang.String r1) {
            r0 = this;
            r0.m686(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᲀᛷᲁᲀ, reason: contains not printable characters */
    public final void m698(long r12) {
            r11 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 != 0) goto Lc
            r12 = 48
            r11.m701(r12)
            return
        Lc:
            r3 = 0
            r4 = 1
            if (r2 >= 0) goto L1d
            long r12 = -r12
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 >= 0) goto L1b
            java.lang.String r12 = "-9223372036854775808"
            r11.m686(r12)
            return
        L1b:
            r2 = r4
            goto L1e
        L1d:
            r2 = r3
        L1e:
            byte[] r5 = xhss.AbstractC0003.f139
            int r5 = java.lang.Long.numberOfLeadingZeros(r12)
            int r5 = 64 - r5
            int r5 = r5 * 10
            int r5 = r5 >>> 5
            long[] r6 = xhss.AbstractC0003.f138
            r6 = r6[r5]
            int r6 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r6 <= 0) goto L33
            r3 = r4
        L33:
            int r5 = r5 + r3
            if (r2 == 0) goto L38
            int r5 = r5 + 1
        L38:
            xhss.ᛲᛳᲁᛳ r3 = r11.m691(r5)
            byte[] r4 = r3.f622
            int r6 = r3.f620
            int r6 = r6 + r5
        L41:
            int r7 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r7 == 0) goto L54
            r7 = 10
            long r9 = r12 % r7
            int r9 = (int) r9
            int r6 = r6 + (-1)
            byte[] r10 = xhss.AbstractC0003.f139
            r9 = r10[r9]
            r4[r6] = r9
            long r12 = r12 / r7
            goto L41
        L54:
            if (r2 == 0) goto L5c
            int r6 = r6 + (-1)
            r12 = 45
            r4[r6] = r12
        L5c:
            int r12 = r3.f620
            int r12 = r12 + r5
            r3.f620 = r12
            long r12 = r11.f1261
            long r0 = (long) r5
            long r12 = r12 + r0
            r11.f1261 = r12
            return
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final byte[] m699(long r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L31
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L31
            long r0 = r3.f1261
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L2b
            int r4 = (int) r4
            byte[] r5 = new byte[r4]
            r0 = 0
        L17:
            if (r0 >= r4) goto L2a
            int r1 = r4 - r0
            int r1 = r3.read(r5, r0, r1)
            r2 = -1
            if (r1 == r2) goto L24
            int r0 = r0 + r1
            goto L17
        L24:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
        L2a:
            return r5
        L2b:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
        L31:
            java.lang.String r3 = "byteCount: "
            xhss.C0532.m952(r3, r4)
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ᲁᛲᛴᛴ, reason: contains not printable characters */
    public final void m700(byte[] r10, int r11) {
            r9 = this;
            int r0 = r10.length
            long r1 = (long) r0
            long r5 = (long) r11
            r3 = 0
            xhss.AbstractC0694.m1210(r1, r3, r5)
            r0 = 0
        L9:
            if (r0 >= r11) goto L2c
            r1 = 1
            xhss.ᛲᛳᲁᛳ r1 = r9.m691(r1)
            int r2 = r11 - r0
            int r3 = r1.f620
            int r3 = 8192 - r3
            int r2 = java.lang.Math.min(r2, r3)
            byte[] r3 = r1.f622
            int r4 = r1.f620
            int r7 = r0 + r2
            int r8 = r7 - r0
            java.lang.System.arraycopy(r10, r0, r3, r4, r8)
            int r0 = r1.f620
            int r0 = r0 + r2
            r1.f620 = r0
            r0 = r7
            goto L9
        L2c:
            long r10 = r9.f1261
            long r10 = r10 + r5
            r9.f1261 = r10
            return
    }

    /* JADX INFO: renamed from: ᲁᛴᲇᛲ, reason: contains not printable characters */
    public final void m701(int r5) {
            r4 = this;
            r0 = 1
            xhss.ᛲᛳᲁᛳ r0 = r4.m691(r0)
            byte[] r1 = r0.f622
            int r2 = r0.f620
            int r3 = r2 + 1
            r0.f620 = r3
            byte r5 = (byte) r5
            r1[r2] = r5
            long r0 = r4.f1261
            r2 = 1
            long r0 = r0 + r2
            r4.f1261 = r0
            return
    }

    /* JADX INFO: renamed from: ᲁᲁᛴᲁ, reason: contains not printable characters */
    public final void m702(java.lang.String r10, int r11, int r12) {
            r9 = this;
            if (r11 < 0) goto L124
            if (r12 < r11) goto L118
            int r0 = r10.length()
            if (r12 > r0) goto L10c
        La:
            if (r11 >= r12) goto L10b
            char r0 = r10.charAt(r11)
            r1 = 128(0x80, float:1.8E-43)
            if (r0 >= r1) goto L48
            r2 = 1
            xhss.ᛲᛳᲁᛳ r2 = r9.m691(r2)
            byte[] r3 = r2.f622
            int r4 = r2.f620
            int r4 = r4 - r11
            int r5 = 8192 - r4
            int r5 = java.lang.Math.min(r12, r5)
            int r6 = r11 + 1
            int r11 = r11 + r4
            byte r0 = (byte) r0
            r3[r11] = r0
        L2a:
            r11 = r6
            if (r11 >= r5) goto L3a
            char r0 = r10.charAt(r11)
            if (r0 >= r1) goto L3a
            int r6 = r11 + 1
            int r11 = r11 + r4
            byte r0 = (byte) r0
            r3[r11] = r0
            goto L2a
        L3a:
            int r4 = r4 + r11
            int r0 = r2.f620
            int r4 = r4 - r0
            int r0 = r0 + r4
            r2.f620 = r0
            long r0 = r9.f1261
            long r2 = (long) r4
            long r0 = r0 + r2
            r9.f1261 = r0
            goto La
        L48:
            r2 = 2048(0x800, float:2.87E-42)
            if (r0 >= r2) goto L71
            r2 = 2
            xhss.ᛲᛳᲁᛳ r3 = r9.m691(r2)
            byte[] r4 = r3.f622
            int r5 = r3.f620
            int r6 = r0 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            r0 = r0 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            r4[r6] = r0
            int r5 = r5 + r2
            r3.f620 = r5
            long r0 = r9.f1261
            r2 = 2
            long r0 = r0 + r2
            r9.f1261 = r0
        L6e:
            int r11 = r11 + 1
            goto La
        L71:
            r2 = 55296(0xd800, float:7.7486E-41)
            r3 = 63
            if (r0 < r2) goto Lde
            r2 = 57343(0xdfff, float:8.0355E-41)
            if (r0 <= r2) goto L7e
            goto Lde
        L7e:
            int r2 = r11 + 1
            if (r2 >= r12) goto L87
            char r4 = r10.charAt(r2)
            goto L88
        L87:
            r4 = 0
        L88:
            r5 = 56319(0xdbff, float:7.892E-41)
            if (r0 > r5) goto Ld8
            r5 = 56320(0xdc00, float:7.8921E-41)
            if (r5 > r4) goto Ld8
            r5 = 57344(0xe000, float:8.0356E-41)
            if (r4 >= r5) goto Ld8
            r0 = r0 & 1023(0x3ff, float:1.434E-42)
            int r0 = r0 << 10
            r2 = r4 & 1023(0x3ff, float:1.434E-42)
            r0 = r0 | r2
            r2 = 65536(0x10000, float:9.1835E-41)
            int r0 = r0 + r2
            r2 = 4
            xhss.ᛲᛳᲁᛳ r4 = r9.m691(r2)
            byte[] r5 = r4.f622
            int r6 = r4.f620
            int r7 = r0 >> 18
            r7 = r7 | 240(0xf0, float:3.36E-43)
            byte r7 = (byte) r7
            r5[r6] = r7
            int r7 = r6 + 1
            int r8 = r0 >> 12
            r8 = r8 & r3
            r8 = r8 | r1
            byte r8 = (byte) r8
            r5[r7] = r8
            int r7 = r6 + 2
            int r8 = r0 >> 6
            r8 = r8 & r3
            r8 = r8 | r1
            byte r8 = (byte) r8
            r5[r7] = r8
            int r7 = r6 + 3
            r0 = r0 & r3
            r0 = r0 | r1
            byte r0 = (byte) r0
            r5[r7] = r0
            int r6 = r6 + r2
            r4.f620 = r6
            long r0 = r9.f1261
            r2 = 4
            long r0 = r0 + r2
            r9.f1261 = r0
            int r11 = r11 + 2
            goto La
        Ld8:
            r9.m701(r3)
            r11 = r2
            goto La
        Lde:
            r2 = 3
            xhss.ᛲᛳᲁᛳ r4 = r9.m691(r2)
            byte[] r5 = r4.f622
            int r6 = r4.f620
            int r7 = r0 >> 12
            r7 = r7 | 224(0xe0, float:3.14E-43)
            byte r7 = (byte) r7
            r5[r6] = r7
            int r7 = r6 + 1
            int r8 = r0 >> 6
            r3 = r3 & r8
            r3 = r3 | r1
            byte r3 = (byte) r3
            r5[r7] = r3
            int r3 = r6 + 2
            r0 = r0 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            r5[r3] = r0
            int r6 = r6 + r2
            r4.f620 = r6
            long r0 = r9.f1261
            r2 = 3
            long r0 = r0 + r2
            r9.f1261 = r0
            goto L6e
        L10b:
            return
        L10c:
            java.lang.String r9 = " > "
            int r10 = r10.length()
            java.lang.String r11 = "endIndex > string.length: "
            xhss.C0532.m963(r11, r12, r9, r10)
            return
        L118:
            java.lang.String r9 = "endIndex < beginIndex: "
            java.lang.String r10 = " < "
            java.lang.String r9 = xhss.AbstractC0390.m782(r12, r11, r9, r10)
            xhss.C0532.m946(r9)
            return
        L124:
            java.lang.String r9 = "beginIndex < 0: "
            java.lang.String r9 = xhss.AbstractC0390.m774(r9, r11)
            xhss.C0532.m946(r9)
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final byte m703() {
            r9 = this;
            long r0 = r9.f1261
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L28
            xhss.ᛲᛳᲁᛳ r2 = r9.f1260
            int r3 = r2.f619
            int r4 = r2.f620
            byte[] r5 = r2.f622
            int r6 = r3 + 1
            r3 = r5[r3]
            r7 = 1
            long r0 = r0 - r7
            r9.f1261 = r0
            if (r6 != r4) goto L25
            xhss.ᛲᛳᲁᛳ r0 = r2.m391()
            r9.f1260 = r0
            xhss.AbstractC0185.m445(r2)
            return r3
        L25:
            r2.f619 = r6
            return r3
        L28:
            java.io.EOFException r9 = new java.io.EOFException
            r9.<init>()
            throw r9
    }

    @Override // xhss.InterfaceC0870
    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final byte[] mo704() {
            r2 = this;
            long r0 = r2.f1261
            byte[] r2 = r2.m699(r0)
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public final short m705() {
            r11 = this;
            long r0 = r11.f1261
            r2 = 2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L47
            xhss.ᛲᛳᲁᛳ r4 = r11.f1260
            int r5 = r4.f619
            int r6 = r4.f620
            int r7 = r6 - r5
            r8 = 2
            if (r7 >= r8) goto L24
            byte r0 = r11.m703()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            byte r11 = r11.m703()
            r11 = r11 & 255(0xff, float:3.57E-43)
            r11 = r11 | r0
            short r11 = (short) r11
            return r11
        L24:
            byte[] r7 = r4.f622
            int r9 = r5 + 1
            r10 = r7[r5]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 8
            int r5 = r5 + r8
            r7 = r7[r9]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r7 = r7 | r10
            long r0 = r0 - r2
            r11.f1261 = r0
            if (r5 != r6) goto L43
            xhss.ᛲᛳᲁᛳ r0 = r4.m391()
            r11.f1260 = r0
            xhss.AbstractC0185.m445(r4)
            goto L45
        L43:
            r4.f619 = r5
        L45:
            short r11 = (short) r7
            return r11
        L47:
            java.io.EOFException r11 = new java.io.EOFException
            r11.<init>()
            throw r11
    }

    /* JADX INFO: renamed from: ᲈᛲᛵᲁ, reason: contains not printable characters */
    public final void m706(xhss.InterfaceC1095 r5) {
            r4 = this;
        L0:
            r0 = 8192(0x2000, double:4.0474E-320)
            long r0 = r5.mo235(r0, r4)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Ld
            goto L0
        Ld:
            return
    }

    @Override // xhss.InterfaceC0870
    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final java.io.InputStream mo707() {
            r2 = this;
            xhss.ᲀᲈᲈ r0 = new xhss.ᲀᲈᲈ
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }
}
