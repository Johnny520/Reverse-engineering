package okio;

/* JADX INFO: renamed from: okio.SegmentedByteString, reason: case insensitive filesystem */
/* JADX INFO: compiled from: SegmentedByteString.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0015\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\r\u0010 \u001a\u00020\u0015H\u0010¢\u0006\u0002\b!J\b\u0010\"\u001a\u00020\u0015H\u0016J\b\u0010#\u001a\u00020\u0010H\u0016J\u001d\u0010$\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0001H\u0010¢\u0006\u0002\b&J\u0018\u0010'\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0015H\u0016J\r\u0010)\u001a\u00020\u0004H\u0010¢\u0006\u0002\b*J\u0015\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0015H\u0010¢\u0006\u0002\b.J\u0018\u0010/\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0015H\u0016J(\u00100\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J(\u00100\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0010\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u000204H\u0016J\u0018\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u0015H\u0016J\b\u00108\u001a\u00020\u0001H\u0016J\b\u00109\u001a\u00020\u0001H\u0016J\b\u0010:\u001a\u00020\u0004H\u0016J\b\u0010;\u001a\u00020\u0001H\u0002J\b\u0010<\u001a\u00020\u0010H\u0016J\u0010\u0010=\u001a\u00020\u00132\u0006\u0010>\u001a\u00020?H\u0016J%\u0010=\u001a\u00020\u00132\u0006\u0010@\u001a\u00020A2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0010¢\u0006\u0002\bBJ\b\u0010C\u001a\u00020DH\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006E"}, m115d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "segments", "", "", "directory", "", "([[B[I)V", "getDirectory$okio", "()[I", "getSegments$okio", "()[[B", "[[B", "asByteBuffer", "Ljava/nio/ByteBuffer;", "base64", "", "base64Url", "copyInto", "", "offset", "", "target", "targetOffset", "byteCount", "digest", "algorithm", "digest$okio", "equals", "", "other", "", "getSize", "getSize$okio", "hashCode", "hex", "hmac", "key", "hmac$okio", "indexOf", "fromIndex", "internalArray", "internalArray$okio", "internalGet", "", "pos", "internalGet$okio", "lastIndexOf", "rangeEquals", "otherOffset", "string", "charset", "Ljava/nio/charset/Charset;", "substring", "beginIndex", "endIndex", "toAsciiLowercase", "toAsciiUppercase", "toByteArray", "toByteString", "toString", "write", "out", "Ljava/io/OutputStream;", "buffer", "Lokio/Buffer;", "write$okio", "writeReplace", "Ljava/lang/Object;", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public final class C1126SegmentedByteString extends okio.ByteString {
    private final transient int[] directory;
    private final transient byte[][] segments;

    public C1126SegmentedByteString(byte[][] r2, int[] r3) {
            r1 = this;
            java.lang.String r0 = "segments"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "directory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
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
            r2 = this;
            okio.ByteString r0 = r2.toByteString()
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
    }

    @Override // okio.ByteString
    public java.nio.ByteBuffer asByteBuffer() {
            r2 = this;
            byte[] r0 = r2.toByteArray()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            java.lang.String r1 = "asReadOnlyBuffer(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
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
    public void copyInto(int r22, byte[] r23, int r24, int r25) {
            r21 = this;
            r0 = r22
            r1 = r23
            r2 = r25
            java.lang.String r3 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            r3 = r21
            r4 = 0
            int r5 = r3.size()
            long r6 = (long) r5
            long r8 = (long) r0
            long r10 = (long) r2
            okio.SegmentedByteString.checkOffsetAndCount(r6, r8, r10)
            int r5 = r1.length
            long r6 = (long) r5
            r5 = r24
            long r8 = (long) r5
            long r10 = (long) r2
            okio.SegmentedByteString.checkOffsetAndCount(r6, r8, r10)
            r6 = 0
            r6 = r24
            int r7 = r0 + r2
            r8 = r3
            r9 = 0
            int r10 = okio.internal.SegmentedByteString.segment(r8, r0)
            r11 = r22
        L2e:
            if (r11 >= r7) goto L84
            if (r10 != 0) goto L34
            r12 = 0
            goto L3c
        L34:
            int[] r12 = r8.getDirectory$okio()
            int r13 = r10 + (-1)
            r12 = r12[r13]
        L3c:
            int[] r13 = r8.getDirectory$okio()
            r13 = r13[r10]
            int r13 = r13 - r12
            int[] r14 = r8.getDirectory$okio()
            byte[][] r15 = r8.getSegments$okio()
            java.lang.Object[] r15 = (java.lang.Object[]) r15
            int r15 = r15.length
            int r15 = r15 + r10
            r14 = r14[r15]
            int r15 = r12 + r13
            int r15 = java.lang.Math.min(r7, r15)
            int r15 = r15 - r11
            int r16 = r11 - r12
            int r16 = r14 + r16
            byte[][] r17 = r8.getSegments$okio()
            r17 = r17[r10]
            r18 = r16
            r19 = r15
            r20 = r17
            r17 = 0
            r0 = r18
            int r2 = r0 + r19
            r18 = r3
            r3 = r20
            kotlin.collections.ArraysKt.copyInto(r3, r1, r6, r0, r2)
            int r6 = r6 + r19
            int r11 = r11 + r15
            int r10 = r10 + 1
            r0 = r22
            r2 = r25
            r3 = r18
            goto L2e
        L84:
            return
    }

    @Override // okio.ByteString
    public okio.ByteString digest$okio(java.lang.String r14) {
            r13 = this;
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r14)
            r1 = 0
            r2 = r13
            r3 = 0
            byte[][] r4 = r2.getSegments$okio()
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r4 = r4.length
            r5 = 0
            r6 = 0
        L15:
            if (r5 >= r4) goto L39
            int[] r7 = r2.getDirectory$okio()
            int r8 = r4 + r5
            r7 = r7[r8]
            int[] r8 = r2.getDirectory$okio()
            r8 = r8[r5]
            byte[][] r9 = r2.getSegments$okio()
            r9 = r9[r5]
            int r10 = r8 - r6
            r11 = r7
            r12 = 0
            r0.update(r9, r11, r10)
            r6 = r8
            int r5 = r5 + 1
            goto L15
        L39:
            byte[] r0 = r0.digest()
            okio.ByteString r1 = new okio.ByteString
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1.<init>(r0)
            return r1
    }

    @Override // okio.ByteString
    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = r6
            r1 = 0
            r2 = 1
            if (r7 != r0) goto L7
            goto L2a
        L7:
            boolean r3 = r7 instanceof okio.ByteString
            r4 = 0
            if (r3 == 0) goto L29
            r3 = r7
            okio.ByteString r3 = (okio.ByteString) r3
            int r3 = r3.size()
            int r5 = r0.size()
            if (r3 != r5) goto L27
            r3 = r7
            okio.ByteString r3 = (okio.ByteString) r3
            int r5 = r0.size()
            boolean r3 = r0.rangeEquals(r4, r3, r4, r5)
            if (r3 == 0) goto L27
            goto L2a
        L27:
            r2 = r4
            goto L2a
        L29:
            r2 = r4
        L2a:
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
            r4 = this;
            r0 = r4
            r1 = 0
            int[] r2 = r0.getDirectory$okio()
            byte[][] r3 = r0.getSegments$okio()
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r3 = r3.length
            int r3 = r3 + (-1)
            r0 = r2[r3]
            return r0
    }

    @Override // okio.ByteString
    public int hashCode() {
            r18 = this;
            r0 = r18
            r1 = 0
            r2 = 0
            int r2 = r0.getHashCode$okio()
            if (r2 == 0) goto Lb
            goto L4b
        Lb:
            r2 = 1
            r3 = r0
            r4 = 0
            byte[][] r5 = r3.getSegments$okio()
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            int r5 = r5.length
            r6 = 0
            r7 = 0
        L17:
            if (r6 >= r5) goto L46
            int[] r8 = r3.getDirectory$okio()
            int r9 = r5 + r6
            r8 = r8[r9]
            int[] r9 = r3.getDirectory$okio()
            r9 = r9[r6]
            byte[][] r10 = r3.getSegments$okio()
            r10 = r10[r6]
            int r11 = r9 - r7
            r12 = r8
            r13 = 0
            r14 = r12
            int r15 = r12 + r11
        L34:
            if (r14 >= r15) goto L3f
            int r16 = r2 * 31
            r17 = r10[r14]
            int r2 = r16 + r17
            int r14 = r14 + 1
            goto L34
        L3f:
            r7 = r9
            int r6 = r6 + 1
            goto L17
        L46:
            r0.setHashCode$okio(r2)
        L4b:
            return r2
    }

    @Override // okio.ByteString
    public java.lang.String hex() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            java.lang.String r0 = r0.hex()
            return r0
    }

    @Override // okio.ByteString
    public okio.ByteString hmac$okio(java.lang.String r13, okio.ByteString r14) {
            r12 = this;
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r13)     // Catch: java.security.InvalidKeyException -> L5c
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidKeyException -> L5c
            byte[] r2 = r14.toByteArray()     // Catch: java.security.InvalidKeyException -> L5c
            r1.<init>(r2, r13)     // Catch: java.security.InvalidKeyException -> L5c
            java.security.Key r1 = (java.security.Key) r1     // Catch: java.security.InvalidKeyException -> L5c
            r0.init(r1)     // Catch: java.security.InvalidKeyException -> L5c
            r1 = r12
            r2 = 0
            byte[][] r3 = r1.getSegments$okio()     // Catch: java.security.InvalidKeyException -> L5c
            java.lang.Object[] r3 = (java.lang.Object[]) r3     // Catch: java.security.InvalidKeyException -> L5c
            int r3 = r3.length     // Catch: java.security.InvalidKeyException -> L5c
            r4 = 0
            r5 = 0
        L28:
            if (r4 >= r3) goto L4c
            int[] r6 = r1.getDirectory$okio()     // Catch: java.security.InvalidKeyException -> L5c
            int r7 = r3 + r4
            r6 = r6[r7]     // Catch: java.security.InvalidKeyException -> L5c
            int[] r7 = r1.getDirectory$okio()     // Catch: java.security.InvalidKeyException -> L5c
            r7 = r7[r4]     // Catch: java.security.InvalidKeyException -> L5c
            byte[][] r8 = r1.getSegments$okio()     // Catch: java.security.InvalidKeyException -> L5c
            r8 = r8[r4]     // Catch: java.security.InvalidKeyException -> L5c
            int r9 = r7 - r5
            r10 = r6
            r11 = 0
            r0.update(r8, r10, r9)     // Catch: java.security.InvalidKeyException -> L5c
            r5 = r7
            int r4 = r4 + 1
            goto L28
        L4c:
            okio.ByteString r1 = new okio.ByteString     // Catch: java.security.InvalidKeyException -> L5c
            byte[] r2 = r0.doFinal()     // Catch: java.security.InvalidKeyException -> L5c
            java.lang.String r3 = "doFinal(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.security.InvalidKeyException -> L5c
            r1.<init>(r2)     // Catch: java.security.InvalidKeyException -> L5c
            return r1
        L5c:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.ByteString
    public int indexOf(byte[] r2, int r3) {
            r1 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.ByteString r0 = r1.toByteString()
            int r0 = r0.indexOf(r2, r3)
            return r0
    }

    @Override // okio.ByteString
    public byte[] internalArray$okio() {
            r1 = this;
            byte[] r0 = r1.toByteArray()
            return r0
    }

    @Override // okio.ByteString
    public byte internalGet$okio(int r10) {
            r9 = this;
            r0 = r9
            r1 = 0
            int[] r2 = r0.getDirectory$okio()
            byte[][] r3 = r0.getSegments$okio()
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r3 = r3.length
            int r3 = r3 + (-1)
            r2 = r2[r3]
            long r3 = (long) r2
            long r5 = (long) r10
            r7 = 1
            okio.SegmentedByteString.checkOffsetAndCount(r3, r5, r7)
            int r2 = okio.internal.SegmentedByteString.segment(r0, r10)
            if (r2 != 0) goto L20
            r3 = 0
            goto L28
        L20:
            int[] r3 = r0.getDirectory$okio()
            int r4 = r2 + (-1)
            r3 = r3[r4]
        L28:
            int[] r4 = r0.getDirectory$okio()
            byte[][] r5 = r0.getSegments$okio()
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            int r5 = r5.length
            int r5 = r5 + r2
            r4 = r4[r5]
            byte[][] r5 = r0.getSegments$okio()
            r5 = r5[r2]
            int r6 = r10 - r3
            int r6 = r6 + r4
            r0 = r5[r6]
            return r0
    }

    @Override // okio.ByteString
    public int lastIndexOf(byte[] r2, int r3) {
            r1 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.ByteString r0 = r1.toByteString()
            int r0 = r0.lastIndexOf(r2, r3)
            return r0
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int r21, okio.ByteString r22, int r23, int r24) {
            r20 = this;
            r0 = r21
            r1 = r22
            java.lang.String r2 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = r20
            r3 = 0
            if (r0 < 0) goto L82
            int r5 = r2.size()
            int r5 = r5 - r24
            if (r0 <= r5) goto L1a
            r17 = r2
            goto L84
        L1a:
            r5 = 0
            r5 = r23
            int r6 = r0 + r24
            r7 = r2
            r8 = 0
            int r9 = okio.internal.SegmentedByteString.segment(r7, r0)
            r10 = r21
        L27:
            if (r10 >= r6) goto L7e
            if (r9 != 0) goto L2d
            r11 = 0
            goto L35
        L2d:
            int[] r11 = r7.getDirectory$okio()
            int r12 = r9 + (-1)
            r11 = r11[r12]
        L35:
            int[] r12 = r7.getDirectory$okio()
            r12 = r12[r9]
            int r12 = r12 - r11
            int[] r13 = r7.getDirectory$okio()
            byte[][] r14 = r7.getSegments$okio()
            java.lang.Object[] r14 = (java.lang.Object[]) r14
            int r14 = r14.length
            int r14 = r14 + r9
            r13 = r13[r14]
            int r14 = r11 + r12
            int r14 = java.lang.Math.min(r6, r14)
            int r14 = r14 - r10
            int r15 = r10 - r11
            int r15 = r15 + r13
            byte[][] r16 = r7.getSegments$okio()
            r16 = r16[r9]
            r17 = r15
            r18 = r14
            r19 = r16
            r16 = 0
            r4 = r17
            r0 = r18
            r17 = r2
            r2 = r19
            boolean r18 = r1.rangeEquals(r5, r2, r4, r0)
            if (r18 != 0) goto L72
            r4 = 0
            goto L85
        L72:
            int r5 = r5 + r0
            int r10 = r10 + r14
            int r9 = r9 + 1
            r0 = r21
            r2 = r17
            goto L27
        L7e:
            r17 = r2
            r4 = 1
            goto L85
        L82:
            r17 = r2
        L84:
            r4 = 0
        L85:
            return r4
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int r22, byte[] r23, int r24, int r25) {
            r21 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            java.lang.String r3 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            r3 = r21
            r4 = 0
            if (r0 < 0) goto L87
            int r6 = r3.size()
            int r6 = r6 - r25
            if (r0 > r6) goto L87
            if (r2 < 0) goto L87
            int r6 = r1.length
            int r6 = r6 - r25
            if (r2 <= r6) goto L21
            goto L87
        L21:
            r6 = 0
            r6 = r24
            int r7 = r0 + r25
            r8 = r3
            r9 = 0
            int r10 = okio.internal.SegmentedByteString.segment(r8, r0)
            r11 = r22
        L2e:
            if (r11 >= r7) goto L84
            if (r10 != 0) goto L34
            r12 = 0
            goto L3c
        L34:
            int[] r12 = r8.getDirectory$okio()
            int r13 = r10 + (-1)
            r12 = r12[r13]
        L3c:
            int[] r13 = r8.getDirectory$okio()
            r13 = r13[r10]
            int r13 = r13 - r12
            int[] r14 = r8.getDirectory$okio()
            byte[][] r15 = r8.getSegments$okio()
            java.lang.Object[] r15 = (java.lang.Object[]) r15
            int r15 = r15.length
            int r15 = r15 + r10
            r14 = r14[r15]
            int r15 = r12 + r13
            int r15 = java.lang.Math.min(r7, r15)
            int r15 = r15 - r11
            int r16 = r11 - r12
            int r16 = r14 + r16
            byte[][] r17 = r8.getSegments$okio()
            r17 = r17[r10]
            r18 = r16
            r19 = r15
            r20 = r17
            r17 = 0
            r5 = r18
            r0 = r19
            r2 = r20
            boolean r18 = okio.SegmentedByteString.arrayRangeEquals(r2, r5, r1, r6, r0)
            if (r18 != 0) goto L78
            r5 = 0
            goto L88
        L78:
            int r6 = r6 + r0
            int r11 = r11 + r15
            int r10 = r10 + 1
            r0 = r22
            r2 = r24
            goto L2e
        L84:
            r5 = 1
            goto L88
        L87:
            r5 = 0
        L88:
            return r5
    }

    @Override // okio.ByteString
    public java.lang.String string(java.nio.charset.Charset r2) {
            r1 = this;
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.ByteString r0 = r1.toByteString()
            java.lang.String r0 = r0.string(r2)
            return r0
    }

    @Override // okio.ByteString
    public okio.ByteString substring(int r17, int r18) {
            r16 = this;
            r0 = r17
            r1 = r16
            r2 = 0
            r3 = r1
            okio.ByteString r3 = (okio.ByteString) r3
            r4 = r18
            int r3 = okio.SegmentedByteString.resolveDefaultParameter(r3, r4)
            r5 = 0
            r6 = 1
            if (r0 < 0) goto L14
            r7 = r6
            goto L15
        L14:
            r7 = r5
        L15:
            if (r7 == 0) goto L103
            int r7 = r1.size()
            if (r3 > r7) goto L1f
            r7 = r6
            goto L20
        L1f:
            r7 = r5
        L20:
            java.lang.String r8 = "endIndex="
            if (r7 == 0) goto Ld3
            int r7 = r3 - r0
            if (r7 < 0) goto L29
            goto L2a
        L29:
            r6 = r5
        L2a:
            if (r6 == 0) goto Lad
        L2d:
            if (r0 != 0) goto L3a
            int r6 = r1.size()
            if (r3 != r6) goto L3a
            r5 = r1
            okio.ByteString r5 = (okio.ByteString) r5
            goto Lac
        L3a:
            if (r0 != r3) goto L3f
            okio.ByteString r5 = okio.ByteString.EMPTY
            goto Lac
        L3f:
            int r6 = okio.internal.SegmentedByteString.segment(r1, r0)
            int r8 = r3 + (-1)
            int r8 = okio.internal.SegmentedByteString.segment(r1, r8)
            byte[][] r9 = r1.getSegments$okio()
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            int r10 = r8 + 1
            java.lang.Object[] r9 = kotlin.collections.ArraysKt.copyOfRange(r9, r6, r10)
            byte[][] r9 = (byte[][]) r9
            r10 = r9
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            int r10 = r10.length
            int r10 = r10 * 2
            int[] r10 = new int[r10]
            r11 = 0
            r12 = r6
            if (r12 > r8) goto L8e
        L63:
            int[] r13 = r1.getDirectory$okio()
            r13 = r13[r12]
            int r13 = r13 - r0
            int r13 = java.lang.Math.min(r13, r7)
            r10[r11] = r13
            int r13 = r11 + 1
            r14 = r9
            java.lang.Object[] r14 = (java.lang.Object[]) r14
            int r14 = r14.length
            int r11 = r11 + r14
            int[] r14 = r1.getDirectory$okio()
            byte[][] r15 = r1.getSegments$okio()
            java.lang.Object[] r15 = (java.lang.Object[]) r15
            int r15 = r15.length
            int r15 = r15 + r12
            r14 = r14[r15]
            r10[r11] = r14
            if (r12 == r8) goto L8d
            int r12 = r12 + 1
            r11 = r13
            goto L63
        L8d:
            r11 = r13
        L8e:
            if (r6 != 0) goto L91
            goto L99
        L91:
            int[] r5 = r1.getDirectory$okio()
            int r12 = r6 + (-1)
            r5 = r5[r12]
        L99:
            r12 = r9
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            int r12 = r12.length
            r13 = r10[r12]
            int r14 = r0 - r5
            int r13 = r13 + r14
            r10[r12] = r13
            okio.SegmentedByteString r12 = new okio.SegmentedByteString
            r12.<init>(r9, r10)
            okio.ByteString r12 = (okio.ByteString) r12
            r5 = r12
        Lac:
            return r5
        Lad:
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r8 = " < beginIndex="
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        Ld3:
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r7 = " > length("
            java.lang.StringBuilder r6 = r6.append(r7)
            int r7 = r1.size()
            java.lang.StringBuilder r6 = r6.append(r7)
            r7 = 41
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L103:
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "beginIndex="
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r7 = " < 0"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
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
            r16 = this;
            r0 = r16
            r1 = 0
            int r2 = r0.size()
            byte[] r2 = new byte[r2]
            r3 = 0
            r4 = r0
            r5 = 0
            byte[][] r6 = r4.getSegments$okio()
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            int r6 = r6.length
            r7 = 0
            r8 = 0
        L15:
            if (r7 >= r6) goto L40
            int[] r9 = r4.getDirectory$okio()
            int r10 = r6 + r7
            r9 = r9[r10]
            int[] r10 = r4.getDirectory$okio()
            r10 = r10[r7]
            byte[][] r11 = r4.getSegments$okio()
            r11 = r11[r7]
            int r12 = r10 - r8
            r13 = r9
            r14 = 0
            int r15 = r13 + r12
            kotlin.collections.ArraysKt.copyInto(r11, r2, r3, r13, r15)
            int r3 = r3 + r12
            r8 = r10
            int r7 = r7 + 1
            goto L15
        L40:
            return r2
    }

    @Override // okio.ByteString
    public java.lang.String toString() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // okio.ByteString
    public void write(java.io.OutputStream r12) throws java.io.IOException {
            r11 = this;
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = r11
            r1 = 0
            byte[][] r2 = r0.getSegments$okio()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r2 = r2.length
            r3 = 0
            r4 = 0
        L10:
            if (r3 >= r2) goto L34
            int[] r5 = r0.getDirectory$okio()
            int r6 = r2 + r3
            r5 = r5[r6]
            int[] r6 = r0.getDirectory$okio()
            r6 = r6[r3]
            byte[][] r7 = r0.getSegments$okio()
            r7 = r7[r3]
            int r8 = r6 - r4
            r9 = r5
            r10 = 0
            r12.write(r7, r9, r8)
            r4 = r6
            int r3 = r3 + 1
            goto L10
        L34:
            return
    }

    @Override // okio.ByteString
    public void write$okio(okio.Buffer r26, int r27, int r28) {
            r25 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            java.lang.String r3 = "buffer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            r3 = r25
            r4 = 0
            int r5 = r1 + r2
            r6 = r3
            r7 = 0
            int r8 = okio.internal.SegmentedByteString.segment(r6, r1)
            r9 = r27
        L18:
            if (r9 >= r5) goto L8e
            if (r8 != 0) goto L1e
            r10 = 0
            goto L26
        L1e:
            int[] r10 = r6.getDirectory$okio()
            int r11 = r8 + (-1)
            r10 = r10[r11]
        L26:
            int[] r11 = r6.getDirectory$okio()
            r11 = r11[r8]
            int r11 = r11 - r10
            int[] r12 = r6.getDirectory$okio()
            byte[][] r13 = r6.getSegments$okio()
            java.lang.Object[] r13 = (java.lang.Object[]) r13
            int r13 = r13.length
            int r13 = r13 + r8
            r12 = r12[r13]
            int r13 = r10 + r11
            int r13 = java.lang.Math.min(r5, r13)
            int r13 = r13 - r9
            int r14 = r9 - r10
            int r14 = r14 + r12
            byte[][] r15 = r6.getSegments$okio()
            r17 = r15[r8]
            r15 = r13
            r22 = r14
            r23 = 0
            okio.Segment r24 = new okio.Segment
            int r19 = r22 + r15
            r20 = 1
            r21 = 0
            r16 = r24
            r18 = r22
            r16.<init>(r17, r18, r19, r20, r21)
            okio.Segment r1 = r0.head
            if (r1 != 0) goto L72
            r1 = r16
            r1.prev = r1
            r16 = r3
            okio.Segment r3 = r1.prev
            r1.next = r3
            okio.Segment r3 = r1.next
            r0.head = r3
            goto L83
        L72:
            r1 = r16
            r16 = r3
            okio.Segment r3 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            okio.Segment r3 = r3.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r3.push(r1)
        L83:
            int r9 = r9 + r13
            int r8 = r8 + 1
            r1 = r27
            r3 = r16
            goto L18
        L8e:
            long r5 = r26.size()
            long r7 = (long) r2
            long r5 = r5 + r7
            r0.setSize$okio(r5)
            return
    }
}
