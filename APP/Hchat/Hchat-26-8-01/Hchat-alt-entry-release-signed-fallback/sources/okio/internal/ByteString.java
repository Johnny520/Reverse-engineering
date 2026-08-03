package okio.internal;

/* JADX INFO: renamed from: okio.internal.-ByteString, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ByteString {
    private static final char[] HEX_DIGIT_CHARS = null;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            okio.internal.ByteString.HEX_DIGIT_CHARS = r0
            return
    }

    public static final /* synthetic */ int access$codePointIndexToCharIndex(byte[] r0, int r1) {
            int r0 = codePointIndexToCharIndex(r0, r1)
            return r0
    }

    public static final /* synthetic */ int access$decodeHexDigit(char r0) {
            int r0 = decodeHexDigit(r0)
            return r0
    }

    private static final int codePointIndexToCharIndex(byte[] r18, int r19) {
            r0 = r18
            r1 = r19
            int r2 = r0.length
            r3 = 0
            r4 = r3
            r5 = r4
        L8:
            if (r3 >= r2) goto L1a5
            r6 = r0[r3]
            r7 = 65533(0xfffd, float:9.1831E-41)
            r8 = 160(0xa0, float:2.24E-43)
            r9 = 127(0x7f, float:1.78E-43)
            r10 = 32
            r11 = 13
            r12 = 10
            r13 = 65536(0x10000, float:9.1835E-41)
            r16 = -1
            if (r6 < 0) goto L65
            int r17 = r5 + 1
            if (r5 != r1) goto L25
            goto L1a5
        L25:
            if (r6 == r12) goto L33
            if (r6 == r11) goto L33
            if (r6 < 0) goto L2e
            if (r6 >= r10) goto L2e
            goto L35
        L2e:
            if (r9 > r6) goto L33
            if (r6 >= r8) goto L33
            goto L35
        L33:
            if (r6 != r7) goto L36
        L35:
            return r16
        L36:
            if (r6 >= r13) goto L3a
            r5 = 1
            goto L3b
        L3a:
            r5 = 2
        L3b:
            int r4 = r4 + r5
            int r3 = r3 + 1
        L3e:
            r5 = r17
            if (r3 >= r2) goto L8
            r6 = r0[r3]
            if (r6 < 0) goto L8
            int r3 = r3 + 1
            int r17 = r5 + 1
            if (r5 != r1) goto L4d
            return r4
        L4d:
            if (r6 == r12) goto L5b
            if (r6 == r11) goto L5b
            if (r6 < 0) goto L56
            if (r6 >= r10) goto L56
            goto L5d
        L56:
            if (r9 > r6) goto L5b
            if (r6 >= r8) goto L5b
            goto L5d
        L5b:
            if (r6 != r7) goto L5e
        L5d:
            return r16
        L5e:
            if (r6 >= r13) goto L62
            r5 = 1
            goto L63
        L62:
            r5 = 2
        L63:
            int r4 = r4 + r5
            goto L3e
        L65:
            int r14 = r6 >> 5
            r15 = -2
            r13 = 128(0x80, float:1.8E-43)
            if (r14 != r15) goto Lb0
            int r14 = r3 + 1
            if (r2 > r14) goto L75
            if (r5 != r1) goto L74
            goto L1a5
        L74:
            return r16
        L75:
            r14 = r0[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto Lab
            r14 = r14 ^ 3968(0xf80, float:5.56E-42)
            int r6 = r6 << 6
            r6 = r6 ^ r14
            if (r6 >= r13) goto L87
            if (r5 != r1) goto L86
            goto L1a5
        L86:
            return r16
        L87:
            int r13 = r5 + 1
            if (r5 != r1) goto L8d
            goto L1a5
        L8d:
            if (r6 == r12) goto L9b
            if (r6 == r11) goto L9b
            if (r6 < 0) goto L96
            if (r6 >= r10) goto L96
            goto L9d
        L96:
            if (r9 > r6) goto L9b
            if (r6 >= r8) goto L9b
            goto L9d
        L9b:
            if (r6 != r7) goto L9e
        L9d:
            return r16
        L9e:
            r5 = 65536(0x10000, float:9.1835E-41)
            if (r6 >= r5) goto La4
            r14 = 1
            goto La5
        La4:
            r14 = 2
        La5:
            int r4 = r4 + r14
            int r3 = r3 + 2
            r5 = r13
            goto L8
        Lab:
            if (r5 != r1) goto Laf
            goto L1a5
        Laf:
            return r16
        Lb0:
            int r14 = r6 >> 4
            r7 = 57344(0xe000, float:8.0356E-41)
            r8 = 55296(0xd800, float:7.7486E-41)
            if (r14 != r15) goto L122
            int r14 = r3 + 2
            if (r2 > r14) goto Lc3
            if (r5 != r1) goto Lc2
            goto L1a5
        Lc2:
            return r16
        Lc3:
            int r15 = r3 + 1
            r15 = r0[r15]
            r9 = r15 & 192(0xc0, float:2.69E-43)
            if (r9 != r13) goto L11d
            r9 = r0[r14]
            r14 = r9 & 192(0xc0, float:2.69E-43)
            if (r14 != r13) goto L118
            r13 = -123008(0xfffffffffffe1f80, float:NaN)
            r9 = r9 ^ r13
            int r13 = r15 << 6
            r9 = r9 ^ r13
            int r6 = r6 << 12
            r6 = r6 ^ r9
            r9 = 2048(0x800, float:2.87E-42)
            if (r6 >= r9) goto Le4
            if (r5 != r1) goto Le3
            goto L1a5
        Le3:
            return r16
        Le4:
            if (r8 > r6) goto Led
            if (r6 >= r7) goto Led
            if (r5 != r1) goto Lec
            goto L1a5
        Lec:
            return r16
        Led:
            int r7 = r5 + 1
            if (r5 != r1) goto Lf3
            goto L1a5
        Lf3:
            if (r6 == r12) goto L105
            if (r6 == r11) goto L105
            if (r6 < 0) goto Lfc
            if (r6 >= r10) goto Lfc
            goto L10a
        Lfc:
            r5 = 127(0x7f, float:1.78E-43)
            if (r5 > r6) goto L105
            r5 = 160(0xa0, float:2.24E-43)
            if (r6 >= r5) goto L105
            goto L10a
        L105:
            r5 = 65533(0xfffd, float:9.1831E-41)
            if (r6 != r5) goto L10b
        L10a:
            return r16
        L10b:
            r5 = 65536(0x10000, float:9.1835E-41)
            if (r6 >= r5) goto L111
            r14 = 1
            goto L112
        L111:
            r14 = 2
        L112:
            int r4 = r4 + r14
            int r3 = r3 + 3
        L115:
            r5 = r7
            goto L8
        L118:
            if (r5 != r1) goto L11c
            goto L1a5
        L11c:
            return r16
        L11d:
            if (r5 != r1) goto L121
            goto L1a5
        L121:
            return r16
        L122:
            int r9 = r6 >> 3
            if (r9 != r15) goto L1a1
            int r9 = r3 + 3
            if (r2 > r9) goto L12f
            if (r5 != r1) goto L12e
            goto L1a5
        L12e:
            return r16
        L12f:
            int r14 = r3 + 1
            r14 = r0[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L19d
            int r15 = r3 + 2
            r15 = r0[r15]
            r10 = r15 & 192(0xc0, float:2.69E-43)
            if (r10 != r13) goto L199
            r9 = r0[r9]
            r10 = r9 & 192(0xc0, float:2.69E-43)
            if (r10 != r13) goto L195
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r9 = r9 ^ r10
            int r10 = r15 << 6
            r9 = r9 ^ r10
            int r10 = r14 << 12
            r9 = r9 ^ r10
            int r6 = r6 << 18
            r6 = r6 ^ r9
            r9 = 1114111(0x10ffff, float:1.561202E-39)
            if (r6 <= r9) goto L15b
            if (r5 != r1) goto L15a
            goto L1a5
        L15a:
            return r16
        L15b:
            if (r8 > r6) goto L163
            if (r6 >= r7) goto L163
            if (r5 != r1) goto L162
            goto L1a5
        L162:
            return r16
        L163:
            r7 = 65536(0x10000, float:9.1835E-41)
            if (r6 >= r7) goto L16b
            if (r5 != r1) goto L16a
            goto L1a5
        L16a:
            return r16
        L16b:
            int r7 = r5 + 1
            if (r5 != r1) goto L170
            goto L1a5
        L170:
            if (r6 == r12) goto L184
            if (r6 == r11) goto L184
            if (r6 < 0) goto L17b
            r5 = 32
            if (r6 >= r5) goto L17b
            goto L189
        L17b:
            r5 = 127(0x7f, float:1.78E-43)
            if (r5 > r6) goto L184
            r5 = 160(0xa0, float:2.24E-43)
            if (r6 >= r5) goto L184
            goto L189
        L184:
            r5 = 65533(0xfffd, float:9.1831E-41)
            if (r6 != r5) goto L18a
        L189:
            return r16
        L18a:
            r5 = 65536(0x10000, float:9.1835E-41)
            if (r6 >= r5) goto L190
            r14 = 1
            goto L191
        L190:
            r14 = 2
        L191:
            int r4 = r4 + r14
            int r3 = r3 + 4
            goto L115
        L195:
            if (r5 != r1) goto L198
            goto L1a5
        L198:
            return r16
        L199:
            if (r5 != r1) goto L19c
            goto L1a5
        L19c:
            return r16
        L19d:
            if (r5 != r1) goto L1a0
            goto L1a5
        L1a0:
            return r16
        L1a1:
            if (r5 != r1) goto L1a4
            goto L1a5
        L1a4:
            return r16
        L1a5:
            return r4
    }

    public static final java.lang.String commonBase64(okio.ByteString r2) {
            r2.getClass()
            byte[] r2 = r2.getData$okio()
            r0 = 0
            r1 = 1
            java.lang.String r2 = okio.Base64.encodeBase64$default(r2, r0, r1, r0)
            return r2
    }

    public static final java.lang.String commonBase64Url(okio.ByteString r1) {
            r1.getClass()
            byte[] r1 = r1.getData$okio()
            byte[] r0 = okio.Base64.getBASE64_URL_SAFE()
            java.lang.String r1 = okio.Base64.encodeBase64(r1, r0)
            return r1
    }

    public static final int commonCompareTo(okio.ByteString r9, okio.ByteString r10) {
            r9.getClass()
            r10.getClass()
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L14:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2d
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L29
            int r4 = r4 + 1
            goto L14
        L29:
            if (r7 >= r8) goto L2c
            return r5
        L2c:
            return r6
        L2d:
            if (r0 != r1) goto L30
            return r3
        L30:
            if (r0 >= r1) goto L33
            return r5
        L33:
            return r6
    }

    public static final void commonCopyInto(okio.ByteString r0, int r1, byte[] r2, int r3, int r4) {
            r0.getClass()
            r2.getClass()
            byte[] r0 = r0.getData$okio()
            int r4 = r4 + r1
            tf.l.o0(r0, r3, r1, r2, r4)
            return
    }

    public static final okio.ByteString commonDecodeBase64(java.lang.String r1) {
            r1.getClass()
            byte[] r1 = okio.Base64.decodeBase64ToArray(r1)
            if (r1 == 0) goto Lf
            okio.ByteString r0 = new okio.ByteString
            r0.<init>(r1)
            return r0
        Lf:
            r1 = 0
            return r1
    }

    public static final okio.ByteString commonDecodeHex(java.lang.String r5) {
            r5.getClass()
            int r0 = r5.length()
            int r0 = r0 % 2
            if (r0 != 0) goto L39
            int r0 = r5.length()
            int r0 = r0 / 2
            byte[] r1 = new byte[r0]
            r2 = 0
        L14:
            if (r2 >= r0) goto L33
            int r3 = r2 * 2
            char r4 = r5.charAt(r3)
            int r4 = access$decodeHexDigit(r4)
            int r4 = r4 << 4
            int r3 = r3 + 1
            char r3 = r5.charAt(r3)
            int r3 = access$decodeHexDigit(r3)
            int r3 = r3 + r4
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L14
        L33:
            okio.ByteString r5 = new okio.ByteString
            r5.<init>(r1)
            return r5
        L39:
            java.lang.String r0 = "Unexpected hex string: "
            java.lang.String r5 = r0.concat(r5)
            j8.o.q(r5)
            r5 = 0
            return r5
    }

    public static final okio.ByteString commonEncodeUtf8(java.lang.String r2) {
            r2.getClass()
            okio.ByteString r0 = new okio.ByteString
            byte[] r1 = okio._JvmPlatformKt.asUtf8ToByteArray(r2)
            r0.<init>(r1)
            r0.setUtf8$okio(r2)
            return r0
    }

    public static final boolean commonEndsWith(okio.ByteString r3, okio.ByteString r4) {
            r3.getClass()
            r4.getClass()
            int r0 = r3.size()
            int r1 = r4.size()
            int r0 = r0 - r1
            r1 = 0
            int r2 = r4.size()
            boolean r3 = r3.rangeEquals(r0, r4, r1, r2)
            return r3
    }

    public static final boolean commonEndsWith(okio.ByteString r3, byte[] r4) {
            r3.getClass()
            r4.getClass()
            int r0 = r3.size()
            int r1 = r4.length
            int r0 = r0 - r1
            r1 = 0
            int r2 = r4.length
            boolean r3 = r3.rangeEquals(r0, r4, r1, r2)
            return r3
    }

    public static final boolean commonEquals(okio.ByteString r4, java.lang.Object r5) {
            r4.getClass()
            r0 = 1
            if (r5 != r4) goto L7
            return r0
        L7:
            boolean r1 = r5 instanceof okio.ByteString
            r2 = 0
            if (r1 == 0) goto L29
            okio.ByteString r5 = (okio.ByteString) r5
            int r1 = r5.size()
            byte[] r3 = r4.getData$okio()
            int r3 = r3.length
            if (r1 != r3) goto L29
            byte[] r1 = r4.getData$okio()
            byte[] r4 = r4.getData$okio()
            int r4 = r4.length
            boolean r4 = r5.rangeEquals(r2, r1, r2, r4)
            if (r4 == 0) goto L29
            return r0
        L29:
            return r2
    }

    public static final byte commonGetByte(okio.ByteString r0, int r1) {
            r0.getClass()
            byte[] r0 = r0.getData$okio()
            r0 = r0[r1]
            return r0
    }

    public static final int commonGetSize(okio.ByteString r0) {
            r0.getClass()
            byte[] r0 = r0.getData$okio()
            int r0 = r0.length
            return r0
    }

    public static final int commonHashCode(okio.ByteString r1) {
            r1.getClass()
            int r0 = r1.getHashCode$okio()
            if (r0 == 0) goto La
            return r0
        La:
            byte[] r0 = r1.getData$okio()
            int r0 = java.util.Arrays.hashCode(r0)
            r1.setHashCode$okio(r0)
            return r0
    }

    public static final java.lang.String commonHex(okio.ByteString r8) {
            r8.getClass()
            byte[] r0 = r8.getData$okio()
            int r0 = r0.length
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            byte[] r8 = r8.getData$okio()
            int r1 = r8.length
            r2 = 0
            r3 = r2
        L13:
            if (r2 >= r1) goto L34
            r4 = r8[r2]
            int r5 = r3 + 1
            char[] r6 = getHEX_DIGIT_CHARS()
            int r7 = r4 >> 4
            r7 = r7 & 15
            char r6 = r6[r7]
            r0[r3] = r6
            int r3 = r3 + 2
            char[] r6 = getHEX_DIGIT_CHARS()
            r4 = r4 & 15
            char r4 = r6[r4]
            r0[r5] = r4
            int r2 = r2 + 1
            goto L13
        L34:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r0)
            return r8
    }

    public static final int commonIndexOf(okio.ByteString r4, byte[] r5, int r6) {
            r4.getClass()
            r5.getClass()
            byte[] r0 = r4.getData$okio()
            int r0 = r0.length
            int r1 = r5.length
            int r0 = r0 - r1
            r1 = 0
            int r6 = java.lang.Math.max(r6, r1)
            if (r6 > r0) goto L25
        L14:
            byte[] r2 = r4.getData$okio()
            int r3 = r5.length
            boolean r2 = okio.SegmentedByteString.arrayRangeEquals(r2, r6, r5, r1, r3)
            if (r2 == 0) goto L20
            return r6
        L20:
            if (r6 == r0) goto L25
            int r6 = r6 + 1
            goto L14
        L25:
            r4 = -1
            return r4
    }

    public static final byte[] commonInternalArray(okio.ByteString r0) {
            r0.getClass()
            byte[] r0 = r0.getData$okio()
            return r0
    }

    public static final int commonLastIndexOf(okio.ByteString r0, okio.ByteString r1, int r2) {
            r0.getClass()
            r1.getClass()
            byte[] r1 = r1.internalArray$okio()
            int r0 = r0.lastIndexOf(r1, r2)
            return r0
    }

    public static final int commonLastIndexOf(okio.ByteString r3, byte[] r4, int r5) {
            r3.getClass()
            r4.getClass()
            int r5 = okio.SegmentedByteString.resolveDefaultParameter(r3, r5)
            byte[] r0 = r3.getData$okio()
            int r0 = r0.length
            int r1 = r4.length
            int r0 = r0 - r1
            int r5 = java.lang.Math.min(r5, r0)
        L15:
            r0 = -1
            if (r0 >= r5) goto L28
            byte[] r0 = r3.getData$okio()
            r1 = 0
            int r2 = r4.length
            boolean r0 = okio.SegmentedByteString.arrayRangeEquals(r0, r5, r4, r1, r2)
            if (r0 == 0) goto L25
            return r5
        L25:
            int r5 = r5 + (-1)
            goto L15
        L28:
            return r0
    }

    public static final okio.ByteString commonOf(byte[] r2) {
            r2.getClass()
            okio.ByteString r0 = new okio.ByteString
            int r1 = r2.length
            byte[] r2 = java.util.Arrays.copyOf(r2, r1)
            r0.<init>(r2)
            return r0
    }

    public static final boolean commonRangeEquals(okio.ByteString r0, int r1, okio.ByteString r2, int r3, int r4) {
            r0.getClass()
            r2.getClass()
            byte[] r0 = r0.getData$okio()
            boolean r0 = r2.rangeEquals(r3, r0, r1, r4)
            return r0
    }

    public static final boolean commonRangeEquals(okio.ByteString r1, int r2, byte[] r3, int r4, int r5) {
            r1.getClass()
            r3.getClass()
            if (r2 < 0) goto L22
            byte[] r0 = r1.getData$okio()
            int r0 = r0.length
            int r0 = r0 - r5
            if (r2 > r0) goto L22
            if (r4 < 0) goto L22
            int r0 = r3.length
            int r0 = r0 - r5
            if (r4 > r0) goto L22
            byte[] r1 = r1.getData$okio()
            boolean r1 = okio.SegmentedByteString.arrayRangeEquals(r1, r2, r3, r4, r5)
            if (r1 == 0) goto L22
            r1 = 1
            return r1
        L22:
            r1 = 0
            return r1
    }

    public static final boolean commonStartsWith(okio.ByteString r2, okio.ByteString r3) {
            r2.getClass()
            r3.getClass()
            r0 = 0
            int r1 = r3.size()
            boolean r2 = r2.rangeEquals(r0, r3, r0, r1)
            return r2
    }

    public static final boolean commonStartsWith(okio.ByteString r2, byte[] r3) {
            r2.getClass()
            r3.getClass()
            r0 = 0
            int r1 = r3.length
            boolean r2 = r2.rangeEquals(r0, r3, r0, r1)
            return r2
    }

    public static final okio.ByteString commonSubstring(okio.ByteString r1, int r2, int r3) {
            r1.getClass()
            int r3 = okio.SegmentedByteString.resolveDefaultParameter(r1, r3)
            if (r2 < 0) goto L49
            byte[] r0 = r1.getData$okio()
            int r0 = r0.length
            if (r3 > r0) goto L33
            int r0 = r3 - r2
            if (r0 < 0) goto L2c
            if (r2 != 0) goto L1e
            byte[] r0 = r1.getData$okio()
            int r0 = r0.length
            if (r3 != r0) goto L1e
            return r1
        L1e:
            okio.ByteString r0 = new okio.ByteString
            byte[] r1 = r1.getData$okio()
            byte[] r1 = tf.l.t0(r1, r2, r3)
            r0.<init>(r1)
            return r0
        L2c:
            java.lang.String r1 = "endIndex < beginIndex"
            j8.o.t(r1)
        L31:
            r1 = 0
            return r1
        L33:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "endIndex > length("
            r2.<init>(r3)
            byte[] r1 = r1.getData$okio()
            int r1 = r1.length
            r3 = 41
            java.lang.String r1 = p.a.n(r2, r1, r3)
            j8.o.q(r1)
            goto L31
        L49:
            java.lang.String r1 = "beginIndex < 0"
            j8.o.t(r1)
            goto L31
    }

    public static final okio.ByteString commonToAsciiLowercase(okio.ByteString r5) {
            r5.getClass()
            r0 = 0
        L4:
            byte[] r1 = r5.getData$okio()
            int r1 = r1.length
            if (r0 >= r1) goto L45
            byte[] r1 = r5.getData$okio()
            r1 = r1[r0]
            r2 = 65
            if (r1 < r2) goto L42
            r3 = 90
            if (r1 <= r3) goto L1a
            goto L42
        L1a:
            byte[] r5 = r5.getData$okio()
            int r4 = r5.length
            byte[] r5 = java.util.Arrays.copyOf(r5, r4)
            int r4 = r0 + 1
            int r1 = r1 + 32
            byte r1 = (byte) r1
            r5[r0] = r1
        L2a:
            int r0 = r5.length
            if (r4 >= r0) goto L3c
            r0 = r5[r4]
            if (r0 < r2) goto L39
            if (r0 <= r3) goto L34
            goto L39
        L34:
            int r0 = r0 + 32
            byte r0 = (byte) r0
            r5[r4] = r0
        L39:
            int r4 = r4 + 1
            goto L2a
        L3c:
            okio.ByteString r0 = new okio.ByteString
            r0.<init>(r5)
            return r0
        L42:
            int r0 = r0 + 1
            goto L4
        L45:
            return r5
    }

    public static final okio.ByteString commonToAsciiUppercase(okio.ByteString r5) {
            r5.getClass()
            r0 = 0
        L4:
            byte[] r1 = r5.getData$okio()
            int r1 = r1.length
            if (r0 >= r1) goto L45
            byte[] r1 = r5.getData$okio()
            r1 = r1[r0]
            r2 = 97
            if (r1 < r2) goto L42
            r3 = 122(0x7a, float:1.71E-43)
            if (r1 <= r3) goto L1a
            goto L42
        L1a:
            byte[] r5 = r5.getData$okio()
            int r4 = r5.length
            byte[] r5 = java.util.Arrays.copyOf(r5, r4)
            int r4 = r0 + 1
            int r1 = r1 + (-32)
            byte r1 = (byte) r1
            r5[r0] = r1
        L2a:
            int r0 = r5.length
            if (r4 >= r0) goto L3c
            r0 = r5[r4]
            if (r0 < r2) goto L39
            if (r0 <= r3) goto L34
            goto L39
        L34:
            int r0 = r0 + (-32)
            byte r0 = (byte) r0
            r5[r4] = r0
        L39:
            int r4 = r4 + 1
            goto L2a
        L3c:
            okio.ByteString r0 = new okio.ByteString
            r0.<init>(r5)
            return r0
        L42:
            int r0 = r0 + 1
            goto L4
        L45:
            return r5
    }

    public static final byte[] commonToByteArray(okio.ByteString r1) {
            r1.getClass()
            byte[] r1 = r1.getData$okio()
            int r0 = r1.length
            byte[] r1 = java.util.Arrays.copyOf(r1, r0)
            return r1
    }

    public static final okio.ByteString commonToByteString(byte[] r7, int r8, int r9) {
            r7.getClass()
            int r9 = okio.SegmentedByteString.resolveDefaultParameter(r7, r9)
            int r0 = r7.length
            long r1 = (long) r0
            long r3 = (long) r8
            long r5 = (long) r9
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            okio.ByteString r0 = new okio.ByteString
            int r9 = r9 + r8
            byte[] r7 = tf.l.t0(r7, r8, r9)
            r0.<init>(r7)
            return r0
    }

    public static final java.lang.String commonToString(okio.ByteString r9) {
            r9.getClass()
            byte[] r0 = r9.getData$okio()
            int r0 = r0.length
            if (r0 != 0) goto Ld
            java.lang.String r9 = "[size=0]"
            return r9
        Ld:
            byte[] r0 = r9.getData$okio()
            r1 = 64
            int r0 = access$codePointIndexToCharIndex(r0, r1)
            r2 = -1
            java.lang.String r3 = "…]"
            r4 = 0
            java.lang.String r5 = "[size="
            r6 = 93
            if (r0 != r2) goto La0
            byte[] r0 = r9.getData$okio()
            int r0 = r0.length
            if (r0 > r1) goto L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[hex="
            r0.<init>(r1)
            java.lang.String r9 = r9.hex()
            r0.append(r9)
            r0.append(r6)
            java.lang.String r9 = r0.toString()
            return r9
        L3e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            byte[] r2 = r9.getData$okio()
            int r2 = r2.length
            r0.append(r2)
            java.lang.String r2 = " hex="
            r0.append(r2)
            int r1 = okio.SegmentedByteString.resolveDefaultParameter(r9, r1)
            byte[] r2 = r9.getData$okio()
            int r2 = r2.length
            if (r1 > r2) goto L89
            if (r1 < 0) goto L82
            byte[] r2 = r9.getData$okio()
            int r2 = r2.length
            if (r1 != r2) goto L65
            goto L73
        L65:
            okio.ByteString r2 = new okio.ByteString
            byte[] r9 = r9.getData$okio()
            byte[] r9 = tf.l.t0(r9, r4, r1)
            r2.<init>(r9)
            r9 = r2
        L73:
            java.lang.String r9 = r9.hex()
            r0.append(r9)
            r0.append(r3)
            java.lang.String r9 = r0.toString()
            return r9
        L82:
            java.lang.String r9 = "endIndex < beginIndex"
            j8.o.t(r9)
            r9 = 0
            return r9
        L89:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "endIndex > length("
            r0.<init>(r1)
            byte[] r9 = r9.getData$okio()
            int r9 = r9.length
            r1 = 41
            java.lang.String r9 = p.a.n(r0, r9, r1)
            j8.o.q(r9)
            r9 = 0
            return r9
        La0:
            java.lang.String r1 = r9.utf8()
            java.lang.String r2 = r1.substring(r4, r0)
            java.lang.String r7 = "\\"
            java.lang.String r8 = "\\\\"
            java.lang.String r2 = og.t.a0(r2, r7, r8, r4)
            java.lang.String r7 = "\n"
            java.lang.String r8 = "\\n"
            java.lang.String r2 = og.t.a0(r2, r7, r8, r4)
            java.lang.String r7 = "\r"
            java.lang.String r8 = "\\r"
            java.lang.String r2 = og.t.a0(r2, r7, r8, r4)
            int r1 = r1.length()
            if (r0 >= r1) goto Le3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            byte[] r9 = r9.getData$okio()
            int r9 = r9.length
            r0.append(r9)
            java.lang.String r9 = " text="
            r0.append(r9)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r9 = r0.toString()
            return r9
        Le3:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "[text="
            r9.<init>(r0)
            r9.append(r2)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            return r9
    }

    public static final java.lang.String commonUtf8(okio.ByteString r1) {
            r1.getClass()
            java.lang.String r0 = r1.getUtf8$okio()
            if (r0 != 0) goto L14
            byte[] r0 = r1.internalArray$okio()
            java.lang.String r0 = okio._JvmPlatformKt.toUtf8String(r0)
            r1.setUtf8$okio(r0)
        L14:
            return r0
    }

    public static final void commonWrite(okio.ByteString r0, okio.Buffer r1, int r2, int r3) {
            r0.getClass()
            r1.getClass()
            byte[] r0 = r0.getData$okio()
            r1.write(r0, r2, r3)
            return
    }

    private static final int decodeHexDigit(char r3) {
            r0 = 48
            if (r0 > r3) goto La
            r1 = 58
            if (r3 >= r1) goto La
            int r3 = r3 - r0
            return r3
        La:
            r0 = 97
            if (r0 > r3) goto L15
            r0 = 103(0x67, float:1.44E-43)
            if (r3 >= r0) goto L15
            int r3 = r3 + (-87)
            return r3
        L15:
            r0 = 65
            if (r0 > r3) goto L20
            r0 = 71
            if (r3 >= r0) goto L20
            int r3 = r3 + (-55)
            return r3
        L20:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected hex digit: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static final char[] getHEX_DIGIT_CHARS() {
            char[] r0 = okio.internal.ByteString.HEX_DIGIT_CHARS
            return r0
    }

    public static /* synthetic */ void getHEX_DIGIT_CHARS$annotations() {
            return
    }
}
