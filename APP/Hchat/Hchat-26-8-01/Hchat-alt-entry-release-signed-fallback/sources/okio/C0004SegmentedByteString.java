package okio;

/* JADX INFO: renamed from: okio.SegmentedByteString, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0004SegmentedByteString extends okio.ByteString {
    private final transient int[] directory;
    private final transient byte[][] segments;

    public C0004SegmentedByteString(byte[][] r2, int[] r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            okio.ByteString r0 = okio.ByteString.EMPTY
            byte[] r0 = r0.getData$okio()
            r1.<init>(r0)
            r1.segments = r2
            r1.directory = r3
            return
    }

    private final okio.ByteString toByteString() {
            r2 = this;
            okio.ByteString r0 = new okio.ByteString
            byte[] r1 = r2.toByteArray()
            r0.<init>(r1)
            return r0
    }

    private final java.lang.Object writeReplace() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            r0.getClass()
            return r0
    }

    @Override // okio.ByteString
    public java.nio.ByteBuffer asByteBuffer() {
            r1 = this;
            byte[] r0 = r1.toByteArray()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            r0.getClass()
            return r0
    }

    @Override // okio.ByteString
    public java.lang.String base64() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            java.lang.String r0 = r0.base64()
            return r0
    }

    @Override // okio.ByteString
    public java.lang.String base64Url() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            java.lang.String r0 = r0.base64Url()
            return r0
    }

    @Override // okio.ByteString
    public void copyInto(int r12, byte[] r13, int r14, int r15) {
            r11 = this;
            r13.getClass()
            int r0 = r11.size()
            long r1 = (long) r0
            long r3 = (long) r12
            long r5 = (long) r15
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            int r0 = r13.length
            long r0 = (long) r0
            long r7 = (long) r14
            r9 = r5
            r5 = r0
            okio.SegmentedByteString.checkOffsetAndCount(r5, r7, r9)
            int r15 = r15 + r12
            int r0 = okio.internal.SegmentedByteString.segment(r11, r12)
        L1a:
            if (r12 >= r15) goto L54
            if (r0 != 0) goto L20
            r1 = 0
            goto L28
        L20:
            int[] r1 = r11.getDirectory$okio()
            int r2 = r0 + (-1)
            r1 = r1[r2]
        L28:
            int[] r2 = r11.getDirectory$okio()
            r2 = r2[r0]
            int r2 = r2 - r1
            int[] r3 = r11.getDirectory$okio()
            byte[][] r4 = r11.getSegments$okio()
            int r4 = r4.length
            int r4 = r4 + r0
            r3 = r3[r4]
            int r2 = r2 + r1
            int r2 = java.lang.Math.min(r15, r2)
            int r2 = r2 - r12
            int r1 = r12 - r1
            int r1 = r1 + r3
            byte[][] r3 = r11.getSegments$okio()
            r3 = r3[r0]
            int r4 = r1 + r2
            tf.l.o0(r3, r14, r1, r13, r4)
            int r14 = r14 + r2
            int r12 = r12 + r2
            int r0 = r0 + 1
            goto L1a
        L54:
            return
    }

    @Override // okio.ByteString
    public okio.ByteString digest$okio(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            java.security.MessageDigest r7 = java.security.MessageDigest.getInstance(r7)
            byte[][] r0 = r6.getSegments$okio()
            int r0 = r0.length
            r1 = 0
            r2 = r1
        Le:
            if (r1 >= r0) goto L2d
            int[] r3 = r6.getDirectory$okio()
            int r4 = r0 + r1
            r3 = r3[r4]
            int[] r4 = r6.getDirectory$okio()
            r4 = r4[r1]
            byte[][] r5 = r6.getSegments$okio()
            r5 = r5[r1]
            int r2 = r4 - r2
            r7.update(r5, r3, r2)
            int r1 = r1 + 1
            r2 = r4
            goto Le
        L2d:
            byte[] r7 = r7.digest()
            okio.ByteString r0 = new okio.ByteString
            r7.getClass()
            r0.<init>(r7)
            return r0
    }

    @Override // okio.ByteString
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof okio.ByteString
            r2 = 0
            if (r1 == 0) goto L20
            okio.ByteString r5 = (okio.ByteString) r5
            int r1 = r5.size()
            int r3 = r4.size()
            if (r1 != r3) goto L20
            int r1 = r4.size()
            boolean r5 = r4.rangeEquals(r2, r5, r2, r1)
            if (r5 == 0) goto L20
            return r0
        L20:
            return r2
    }

    public final int[] getDirectory$okio() {
            r1 = this;
            int[] r0 = r1.directory
            return r0
    }

    public final byte[][] getSegments$okio() {
            r1 = this;
            byte[][] r0 = r1.segments
            return r0
    }

    @Override // okio.ByteString
    public int getSize$okio() {
            r2 = this;
            int[] r0 = r2.getDirectory$okio()
            byte[][] r1 = r2.getSegments$okio()
            int r1 = r1.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            return r0
    }

    @Override // okio.ByteString
    public int hashCode() {
            r8 = this;
            int r0 = r8.getHashCode$okio()
            if (r0 == 0) goto L7
            return r0
        L7:
            byte[][] r0 = r8.getSegments$okio()
            int r0 = r0.length
            r1 = 0
            r2 = 1
            r3 = r2
            r2 = r1
        L10:
            if (r1 >= r0) goto L37
            int[] r4 = r8.getDirectory$okio()
            int r5 = r0 + r1
            r4 = r4[r5]
            int[] r5 = r8.getDirectory$okio()
            r5 = r5[r1]
            byte[][] r6 = r8.getSegments$okio()
            r6 = r6[r1]
            int r2 = r5 - r2
            int r2 = r2 + r4
        L29:
            if (r4 >= r2) goto L33
            int r3 = r3 * 31
            r7 = r6[r4]
            int r3 = r3 + r7
            int r4 = r4 + 1
            goto L29
        L33:
            int r1 = r1 + 1
            r2 = r5
            goto L10
        L37:
            r8.setHashCode$okio(r3)
            return r3
    }

    @Override // okio.ByteString
    public java.lang.String hex() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            java.lang.String r0 = r0.hex()
            return r0
    }

    @Override // okio.ByteString
    public okio.ByteString hmac$okio(java.lang.String r6, okio.ByteString r7) {
            r5 = this;
            r6.getClass()
            r7.getClass()
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r6)     // Catch: java.security.InvalidKeyException -> L3c
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidKeyException -> L3c
            byte[] r7 = r7.toByteArray()     // Catch: java.security.InvalidKeyException -> L3c
            r1.<init>(r7, r6)     // Catch: java.security.InvalidKeyException -> L3c
            r0.init(r1)     // Catch: java.security.InvalidKeyException -> L3c
            byte[][] r6 = r5.getSegments$okio()     // Catch: java.security.InvalidKeyException -> L3c
            int r6 = r6.length     // Catch: java.security.InvalidKeyException -> L3c
            r7 = 0
            r1 = r7
        L1d:
            if (r7 >= r6) goto L3e
            int[] r2 = r5.getDirectory$okio()     // Catch: java.security.InvalidKeyException -> L3c
            int r3 = r6 + r7
            r2 = r2[r3]     // Catch: java.security.InvalidKeyException -> L3c
            int[] r3 = r5.getDirectory$okio()     // Catch: java.security.InvalidKeyException -> L3c
            r3 = r3[r7]     // Catch: java.security.InvalidKeyException -> L3c
            byte[][] r4 = r5.getSegments$okio()     // Catch: java.security.InvalidKeyException -> L3c
            r4 = r4[r7]     // Catch: java.security.InvalidKeyException -> L3c
            int r1 = r3 - r1
            r0.update(r4, r2, r1)     // Catch: java.security.InvalidKeyException -> L3c
            int r7 = r7 + 1
            r1 = r3
            goto L1d
        L3c:
            r6 = move-exception
            goto L4b
        L3e:
            okio.ByteString r6 = new okio.ByteString     // Catch: java.security.InvalidKeyException -> L3c
            byte[] r7 = r0.doFinal()     // Catch: java.security.InvalidKeyException -> L3c
            r7.getClass()     // Catch: java.security.InvalidKeyException -> L3c
            r6.<init>(r7)     // Catch: java.security.InvalidKeyException -> L3c
            return r6
        L4b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r6)
            throw r7
    }

    @Override // okio.ByteString
    public int indexOf(byte[] r2, int r3) {
            r1 = this;
            r2.getClass()
            okio.ByteString r0 = r1.toByteString()
            int r2 = r0.indexOf(r2, r3)
            return r2
    }

    @Override // okio.ByteString
    public byte[] internalArray$okio() {
            r1 = this;
            byte[] r0 = r1.toByteArray()
            return r0
    }

    @Override // okio.ByteString
    public byte internalGet$okio(int r8) {
            r7 = this;
            int[] r0 = r7.getDirectory$okio()
            byte[][] r1 = r7.getSegments$okio()
            int r1 = r1.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            long r1 = (long) r0
            long r3 = (long) r8
            r5 = 1
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            int r0 = okio.internal.SegmentedByteString.segment(r7, r8)
            if (r0 != 0) goto L1c
            r1 = 0
            goto L24
        L1c:
            int[] r1 = r7.getDirectory$okio()
            int r2 = r0 + (-1)
            r1 = r1[r2]
        L24:
            int[] r2 = r7.getDirectory$okio()
            byte[][] r3 = r7.getSegments$okio()
            int r3 = r3.length
            int r3 = r3 + r0
            r2 = r2[r3]
            byte[][] r3 = r7.getSegments$okio()
            r0 = r3[r0]
            int r8 = r8 - r1
            int r8 = r8 + r2
            r8 = r0[r8]
            return r8
    }

    @Override // okio.ByteString
    public int lastIndexOf(byte[] r2, int r3) {
            r1 = this;
            r2.getClass()
            okio.ByteString r0 = r1.toByteString()
            int r2 = r0.lastIndexOf(r2, r3)
            return r2
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int r7, okio.ByteString r8, int r9, int r10) {
            r6 = this;
            r8.getClass()
            r0 = 0
            if (r7 < 0) goto L51
            int r1 = r6.size()
            int r1 = r1 - r10
            if (r7 <= r1) goto Le
            goto L51
        Le:
            int r10 = r10 + r7
            int r1 = okio.internal.SegmentedByteString.segment(r6, r7)
        L13:
            if (r7 >= r10) goto L4f
            if (r1 != 0) goto L19
            r2 = r0
            goto L21
        L19:
            int[] r2 = r6.getDirectory$okio()
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L21:
            int[] r3 = r6.getDirectory$okio()
            r3 = r3[r1]
            int r3 = r3 - r2
            int[] r4 = r6.getDirectory$okio()
            byte[][] r5 = r6.getSegments$okio()
            int r5 = r5.length
            int r5 = r5 + r1
            r4 = r4[r5]
            int r3 = r3 + r2
            int r3 = java.lang.Math.min(r10, r3)
            int r3 = r3 - r7
            int r2 = r7 - r2
            int r2 = r2 + r4
            byte[][] r4 = r6.getSegments$okio()
            r4 = r4[r1]
            boolean r2 = r8.rangeEquals(r9, r4, r2, r3)
            if (r2 != 0) goto L4a
            return r0
        L4a:
            int r9 = r9 + r3
            int r7 = r7 + r3
            int r1 = r1 + 1
            goto L13
        L4f:
            r7 = 1
            return r7
        L51:
            return r0
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int r7, byte[] r8, int r9, int r10) {
            r6 = this;
            r8.getClass()
            r0 = 0
            if (r7 < 0) goto L57
            int r1 = r6.size()
            int r1 = r1 - r10
            if (r7 > r1) goto L57
            if (r9 < 0) goto L57
            int r1 = r8.length
            int r1 = r1 - r10
            if (r9 <= r1) goto L14
            goto L57
        L14:
            int r10 = r10 + r7
            int r1 = okio.internal.SegmentedByteString.segment(r6, r7)
        L19:
            if (r7 >= r10) goto L55
            if (r1 != 0) goto L1f
            r2 = r0
            goto L27
        L1f:
            int[] r2 = r6.getDirectory$okio()
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L27:
            int[] r3 = r6.getDirectory$okio()
            r3 = r3[r1]
            int r3 = r3 - r2
            int[] r4 = r6.getDirectory$okio()
            byte[][] r5 = r6.getSegments$okio()
            int r5 = r5.length
            int r5 = r5 + r1
            r4 = r4[r5]
            int r3 = r3 + r2
            int r3 = java.lang.Math.min(r10, r3)
            int r3 = r3 - r7
            int r2 = r7 - r2
            int r2 = r2 + r4
            byte[][] r4 = r6.getSegments$okio()
            r4 = r4[r1]
            boolean r2 = okio.SegmentedByteString.arrayRangeEquals(r4, r2, r8, r9, r3)
            if (r2 != 0) goto L50
            return r0
        L50:
            int r9 = r9 + r3
            int r7 = r7 + r3
            int r1 = r1 + 1
            goto L19
        L55:
            r7 = 1
            return r7
        L57:
            return r0
    }

    @Override // okio.ByteString
    public java.lang.String string(java.nio.charset.Charset r2) {
            r1 = this;
            r2.getClass()
            okio.ByteString r0 = r1.toByteString()
            java.lang.String r2 = r0.string(r2)
            return r2
    }

    @Override // okio.ByteString
    public okio.ByteString substring(int r11, int r12) {
            r10 = this;
            int r12 = okio.SegmentedByteString.resolveDefaultParameter(r10, r12)
            if (r11 < 0) goto La8
            int r0 = r10.size()
            java.lang.String r1 = "endIndex="
            if (r12 > r0) goto L88
            int r0 = r12 - r11
            if (r0 < 0) goto L7d
            if (r11 != 0) goto L1b
            int r1 = r10.size()
            if (r12 != r1) goto L1b
            return r10
        L1b:
            if (r11 != r12) goto L20
            okio.ByteString r11 = okio.ByteString.EMPTY
            return r11
        L20:
            int r1 = okio.internal.SegmentedByteString.segment(r10, r11)
            int r12 = r12 + (-1)
            int r12 = okio.internal.SegmentedByteString.segment(r10, r12)
            byte[][] r2 = r10.getSegments$okio()
            int r3 = r12 + 1
            java.lang.Object[] r2 = tf.l.u0(r2, r1, r3)
            byte[][] r2 = (byte[][]) r2
            int r3 = r2.length
            int r3 = r3 * 2
            int[] r3 = new int[r3]
            r4 = 0
            if (r1 > r12) goto L65
            r6 = r1
            r5 = r4
        L40:
            int[] r7 = r10.getDirectory$okio()
            r7 = r7[r6]
            int r7 = r7 - r11
            int r7 = java.lang.Math.min(r7, r0)
            r3[r5] = r7
            int r7 = r5 + 1
            int r8 = r2.length
            int r5 = r5 + r8
            int[] r8 = r10.getDirectory$okio()
            byte[][] r9 = r10.getSegments$okio()
            int r9 = r9.length
            int r9 = r9 + r6
            r8 = r8[r9]
            r3[r5] = r8
            if (r6 == r12) goto L65
            int r6 = r6 + 1
            r5 = r7
            goto L40
        L65:
            if (r1 != 0) goto L68
            goto L70
        L68:
            int[] r12 = r10.getDirectory$okio()
            int r1 = r1 + (-1)
            r4 = r12[r1]
        L70:
            int r12 = r2.length
            r0 = r3[r12]
            int r11 = r11 - r4
            int r11 = r11 + r0
            r3[r12] = r11
            okio.SegmentedByteString r11 = new okio.SegmentedByteString
            r11.<init>(r2, r3)
            return r11
        L7d:
            java.lang.String r0 = " < beginIndex="
            java.lang.String r11 = p.a.j(r12, r1, r0, r11)
            j8.o.q(r11)
            r11 = 0
            return r11
        L88:
            java.lang.String r11 = " > length("
            java.lang.StringBuilder r11 = eh.a.t(r12, r1, r11)
            int r12 = r10.size()
            r11.append(r12)
            r12 = 41
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        La8:
            java.lang.String r12 = "beginIndex="
            java.lang.String r0 = " < 0"
            java.lang.String r11 = eh.a.m(r11, r12, r0)
            j8.o.q(r11)
            r11 = 0
            return r11
    }

    @Override // okio.ByteString
    public okio.ByteString toAsciiLowercase() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            okio.ByteString r0 = r0.toAsciiLowercase()
            return r0
    }

    @Override // okio.ByteString
    public okio.ByteString toAsciiUppercase() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            okio.ByteString r0 = r0.toAsciiUppercase()
            return r0
    }

    @Override // okio.ByteString
    public byte[] toByteArray() {
            r9 = this;
            int r0 = r9.size()
            byte[] r0 = new byte[r0]
            byte[][] r1 = r9.getSegments$okio()
            int r1 = r1.length
            r2 = 0
            r3 = r2
            r4 = r3
        Le:
            if (r2 >= r1) goto L30
            int[] r5 = r9.getDirectory$okio()
            int r6 = r1 + r2
            r5 = r5[r6]
            int[] r6 = r9.getDirectory$okio()
            r6 = r6[r2]
            byte[][] r7 = r9.getSegments$okio()
            r7 = r7[r2]
            int r3 = r6 - r3
            int r8 = r5 + r3
            tf.l.o0(r7, r4, r5, r0, r8)
            int r4 = r4 + r3
            int r2 = r2 + 1
            r3 = r6
            goto Le
        L30:
            return r0
    }

    @Override // okio.ByteString
    public java.lang.String toString() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // okio.ByteString
    public void write(java.io.OutputStream r7) {
            r6 = this;
            r7.getClass()
            byte[][] r0 = r6.getSegments$okio()
            int r0 = r0.length
            r1 = 0
            r2 = r1
        La:
            if (r1 >= r0) goto L29
            int[] r3 = r6.getDirectory$okio()
            int r4 = r0 + r1
            r3 = r3[r4]
            int[] r4 = r6.getDirectory$okio()
            r4 = r4[r1]
            byte[][] r5 = r6.getSegments$okio()
            r5 = r5[r1]
            int r2 = r4 - r2
            r7.write(r5, r3, r2)
            int r1 = r1 + 1
            r2 = r4
            goto La
        L29:
            return
    }

    @Override // okio.ByteString
    public void write$okio(okio.Buffer r12, int r13, int r14) {
            r11 = this;
            r12.getClass()
            int r0 = r13 + r14
            int r1 = okio.internal.SegmentedByteString.segment(r11, r13)
        L9:
            if (r13 >= r0) goto L5d
            if (r1 != 0) goto Lf
            r2 = 0
            goto L17
        Lf:
            int[] r2 = r11.getDirectory$okio()
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L17:
            int[] r3 = r11.getDirectory$okio()
            r3 = r3[r1]
            int r3 = r3 - r2
            int[] r4 = r11.getDirectory$okio()
            byte[][] r5 = r11.getSegments$okio()
            int r5 = r5.length
            int r5 = r5 + r1
            r4 = r4[r5]
            int r3 = r3 + r2
            int r3 = java.lang.Math.min(r0, r3)
            int r3 = r3 - r13
            int r2 = r13 - r2
            int r7 = r2 + r4
            byte[][] r2 = r11.getSegments$okio()
            r6 = r2[r1]
            okio.Segment r5 = new okio.Segment
            int r8 = r7 + r3
            r9 = 1
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            okio.Segment r2 = r12.head
            if (r2 != 0) goto L4e
            r5.prev = r5
            r5.next = r5
            r12.head = r5
            goto L59
        L4e:
            r2.getClass()
            okio.Segment r2 = r2.prev
            r2.getClass()
            r2.push(r5)
        L59:
            int r13 = r13 + r3
            int r1 = r1 + 1
            goto L9
        L5d:
            long r0 = r12.size()
            long r13 = (long) r14
            long r0 = r0 + r13
            r12.setSize$okio(r0)
            return
    }
}
