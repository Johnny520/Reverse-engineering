package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int r1) {
            if (r1 < 0) goto L7
            r0 = 32
            if (r1 >= r0) goto L7
            goto Lf
        L7:
            r0 = 127(0x7f, float:1.78E-43)
            if (r0 > r1) goto L11
            r0 = 160(0xa0, float:2.24E-43)
            if (r1 >= r0) goto L11
        Lf:
            r1 = 1
            return r1
        L11:
            r1 = 0
            return r1
    }

    public static final boolean isUtf8Continuation(byte r1) {
            r1 = r1 & 192(0xc0, float:2.69E-43)
            r0 = 128(0x80, float:1.8E-43)
            if (r1 != r0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public static final int process2Utf8Bytes(byte[] r3, int r4, int r5, fg.l r6) {
            r0 = 65533(0xfffd, float:9.1831E-41)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.getClass()
            r6.getClass()
            int r1 = r4 + 1
            r2 = 1
            if (r5 > r1) goto L16
            r6.invoke(r0)
            return r2
        L16:
            r4 = r3[r4]
            r3 = r3[r1]
            r5 = r3 & 192(0xc0, float:2.69E-43)
            r1 = 128(0x80, float:1.8E-43)
            if (r5 != r1) goto L34
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r4 = r4 << 6
            r3 = r3 ^ r4
            if (r3 >= r1) goto L2b
            r6.invoke(r0)
            goto L32
        L2b:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.invoke(r3)
        L32:
            r3 = 2
            return r3
        L34:
            r6.invoke(r0)
            return r2
    }

    public static final int process3Utf8Bytes(byte[] r6, int r7, int r8, fg.l r9) {
            r0 = 65533(0xfffd, float:9.1831E-41)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.getClass()
            r9.getClass()
            int r1 = r7 + 2
            r2 = 128(0x80, float:1.8E-43)
            r3 = 1
            r4 = 2
            if (r8 > r1) goto L23
            r9.invoke(r0)
            int r7 = r7 + r3
            if (r8 <= r7) goto L22
            r6 = r6[r7]
            r6 = r6 & 192(0xc0, float:2.69E-43)
            if (r6 != r2) goto L22
            return r4
        L22:
            return r3
        L23:
            r8 = r6[r7]
            int r7 = r7 + r3
            r7 = r6[r7]
            r5 = r7 & 192(0xc0, float:2.69E-43)
            if (r5 != r2) goto L5f
            r6 = r6[r1]
            r1 = r6 & 192(0xc0, float:2.69E-43)
            if (r1 != r2) goto L5b
            r1 = -123008(0xfffffffffffe1f80, float:NaN)
            r6 = r6 ^ r1
            int r7 = r7 << 6
            r6 = r6 ^ r7
            int r7 = r8 << 12
            r6 = r6 ^ r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r6 >= r7) goto L44
            r9.invoke(r0)
            goto L59
        L44:
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r7 > r6) goto L52
            r7 = 57344(0xe000, float:8.0356E-41)
            if (r6 >= r7) goto L52
            r9.invoke(r0)
            goto L59
        L52:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.invoke(r6)
        L59:
            r6 = 3
            return r6
        L5b:
            r9.invoke(r0)
            return r4
        L5f:
            r9.invoke(r0)
            return r3
    }

    public static final int process4Utf8Bytes(byte[] r8, int r9, int r10, fg.l r11) {
            r0 = 65533(0xfffd, float:9.1831E-41)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.getClass()
            r11.getClass()
            int r1 = r9 + 3
            r2 = 2
            r3 = 1
            r4 = 128(0x80, float:1.8E-43)
            r5 = 3
            if (r10 > r1) goto L2f
            r11.invoke(r0)
            int r11 = r9 + 1
            if (r10 <= r11) goto L2e
            r11 = r8[r11]
            r11 = r11 & 192(0xc0, float:2.69E-43)
            if (r11 != r4) goto L2e
            int r9 = r9 + r2
            if (r10 <= r9) goto L2d
            r8 = r8[r9]
            r8 = r8 & 192(0xc0, float:2.69E-43)
            if (r8 != r4) goto L2d
            return r5
        L2d:
            return r2
        L2e:
            return r3
        L2f:
            r10 = r8[r9]
            int r6 = r9 + 1
            r6 = r8[r6]
            r7 = r6 & 192(0xc0, float:2.69E-43)
            if (r7 != r4) goto L83
            int r9 = r9 + r2
            r9 = r8[r9]
            r3 = r9 & 192(0xc0, float:2.69E-43)
            if (r3 != r4) goto L7f
            r8 = r8[r1]
            r1 = r8 & 192(0xc0, float:2.69E-43)
            if (r1 != r4) goto L7b
            r1 = 3678080(0x381f80, float:5.154088E-39)
            r8 = r8 ^ r1
            int r9 = r9 << 6
            r8 = r8 ^ r9
            int r9 = r6 << 12
            r8 = r8 ^ r9
            int r9 = r10 << 18
            r8 = r8 ^ r9
            r9 = 1114111(0x10ffff, float:1.561202E-39)
            if (r8 <= r9) goto L5c
            r11.invoke(r0)
            goto L79
        L5c:
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r9 > r8) goto L6a
            r9 = 57344(0xe000, float:8.0356E-41)
            if (r8 >= r9) goto L6a
            r11.invoke(r0)
            goto L79
        L6a:
            r9 = 65536(0x10000, float:9.1835E-41)
            if (r8 >= r9) goto L72
            r11.invoke(r0)
            goto L79
        L72:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11.invoke(r8)
        L79:
            r8 = 4
            return r8
        L7b:
            r11.invoke(r0)
            return r5
        L7f:
            r11.invoke(r0)
            return r2
        L83:
            r11.invoke(r0)
            return r3
    }

    public static final void processUtf16Chars(byte[] r12, int r13, int r14, fg.l r15) {
            r0 = 65533(0xfffd, float:9.1831E-41)
            java.lang.Character r1 = java.lang.Character.valueOf(r0)
            r12.getClass()
            r15.getClass()
        Ld:
            if (r13 >= r14) goto L14d
            r2 = r12[r13]
            if (r2 < 0) goto L2e
            char r2 = (char) r2
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r15.invoke(r2)
            int r13 = r13 + 1
        L1d:
            if (r13 >= r14) goto Ld
            r2 = r12[r13]
            if (r2 < 0) goto Ld
            int r13 = r13 + 1
            char r2 = (char) r2
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r15.invoke(r2)
            goto L1d
        L2e:
            int r3 = r2 >> 5
            r4 = -2
            r5 = 2
            r6 = 128(0x80, float:1.8E-43)
            r7 = 1
            if (r3 != r4) goto L5f
            int r3 = r13 + 1
            if (r14 > r3) goto L45
        L3b:
            char r2 = (char) r0
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r15.invoke(r2)
        L43:
            r5 = r7
            goto L5d
        L45:
            r3 = r12[r3]
            r4 = r3 & 192(0xc0, float:2.69E-43)
            if (r4 != r6) goto L3b
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r2 = r2 << 6
            r2 = r2 ^ r3
            if (r2 >= r6) goto L5b
            char r2 = (char) r0
        L53:
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r15.invoke(r2)
            goto L5d
        L5b:
            char r2 = (char) r2
            goto L53
        L5d:
            int r13 = r13 + r5
            goto Ld
        L5f:
            int r3 = r2 >> 4
            r8 = 57344(0xe000, float:8.0356E-41)
            r9 = 55296(0xd800, float:7.7486E-41)
            r10 = 3
            if (r3 != r4) goto Lc1
            int r3 = r13 + 2
            if (r14 > r3) goto L81
            char r2 = (char) r0
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r15.invoke(r2)
            int r2 = r13 + 1
            if (r14 <= r2) goto L43
            r2 = r12[r2]
            r2 = r2 & 192(0xc0, float:2.69E-43)
            if (r2 != r6) goto L43
            goto L5d
        L81:
            int r4 = r13 + 1
            r4 = r12[r4]
            r11 = r4 & 192(0xc0, float:2.69E-43)
            if (r11 != r6) goto Lb8
            r3 = r12[r3]
            r7 = r3 & 192(0xc0, float:2.69E-43)
            if (r7 != r6) goto Laf
            r5 = -123008(0xfffffffffffe1f80, float:NaN)
            r3 = r3 ^ r5
            int r4 = r4 << 6
            r3 = r3 ^ r4
            int r2 = r2 << 12
            r2 = r2 ^ r3
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 >= r3) goto La6
        L9d:
            char r2 = (char) r0
        L9e:
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r15.invoke(r2)
            goto Lad
        La6:
            if (r9 > r2) goto Lab
            if (r2 >= r8) goto Lab
            goto L9d
        Lab:
            char r2 = (char) r2
            goto L9e
        Lad:
            r5 = r10
            goto L5d
        Laf:
            char r2 = (char) r0
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r15.invoke(r2)
            goto L5d
        Lb8:
            char r2 = (char) r0
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r15.invoke(r2)
            goto L43
        Lc1:
            int r3 = r2 >> 3
            if (r3 != r4) goto L146
            int r3 = r13 + 3
            if (r14 > r3) goto Le1
            r15.invoke(r1)
            int r2 = r13 + 1
            if (r14 <= r2) goto L43
            r2 = r12[r2]
            r2 = r2 & 192(0xc0, float:2.69E-43)
            if (r2 != r6) goto L43
            int r2 = r13 + 2
            if (r14 <= r2) goto L5d
            r2 = r12[r2]
            r2 = r2 & 192(0xc0, float:2.69E-43)
            if (r2 != r6) goto L5d
        Le0:
            goto Lad
        Le1:
            int r4 = r13 + 1
            r4 = r12[r4]
            r11 = r4 & 192(0xc0, float:2.69E-43)
            if (r11 != r6) goto L141
            int r7 = r13 + 2
            r7 = r12[r7]
            r11 = r7 & 192(0xc0, float:2.69E-43)
            if (r11 != r6) goto L13c
            r3 = r12[r3]
            r5 = r3 & 192(0xc0, float:2.69E-43)
            if (r5 != r6) goto L138
            r5 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r5
            int r5 = r7 << 6
            r3 = r3 ^ r5
            int r4 = r4 << 12
            r3 = r3 ^ r4
            int r2 = r2 << 18
            r2 = r2 ^ r3
            r3 = 1114111(0x10ffff, float:1.561202E-39)
            if (r2 <= r3) goto L10d
        L109:
            r15.invoke(r1)
            goto L135
        L10d:
            if (r9 > r2) goto L112
            if (r2 >= r8) goto L112
            goto L109
        L112:
            r3 = 65536(0x10000, float:9.1835E-41)
            if (r2 >= r3) goto L117
            goto L109
        L117:
            if (r2 == r0) goto L109
            int r3 = r2 >>> 10
            r4 = 55232(0xd7c0, float:7.7397E-41)
            int r3 = r3 + r4
            char r3 = (char) r3
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r15.invoke(r3)
            r2 = r2 & 1023(0x3ff, float:1.434E-42)
            r3 = 56320(0xdc00, float:7.8921E-41)
            int r2 = r2 + r3
            char r2 = (char) r2
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r15.invoke(r2)
        L135:
            r5 = 4
            goto L5d
        L138:
            r15.invoke(r1)
            goto Le0
        L13c:
            r15.invoke(r1)
            goto L5d
        L141:
            r15.invoke(r1)
            goto L43
        L146:
            r15.invoke(r1)
            int r13 = r13 + 1
            goto Ld
        L14d:
            return
    }

    public static final void processUtf8Bytes(java.lang.String r7, int r8, int r9, fg.l r10) {
            r7.getClass()
            r10.getClass()
        L6:
            if (r8 >= r9) goto Leb
            char r0 = r7.charAt(r8)
            r1 = 128(0x80, float:1.8E-43)
            int r2 = gg.l.c(r0, r1)
            if (r2 >= 0) goto L3a
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r10.invoke(r0)
            int r8 = r8 + 1
        L1e:
            if (r8 >= r9) goto L6
            char r0 = r7.charAt(r8)
            int r0 = gg.l.c(r0, r1)
            if (r0 >= 0) goto L6
            int r0 = r8 + 1
            char r8 = r7.charAt(r8)
            byte r8 = (byte) r8
            java.lang.Byte r8 = java.lang.Byte.valueOf(r8)
            r10.invoke(r8)
            r8 = r0
            goto L1e
        L3a:
            r2 = 2048(0x800, float:2.87E-42)
            int r2 = gg.l.c(r0, r2)
            if (r2 >= 0) goto L5c
            int r2 = r0 >> 6
            r2 = r2 | 192(0xc0, float:2.69E-43)
            byte r2 = (byte) r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r10.invoke(r2)
            r0 = r0 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r10.invoke(r0)
        L59:
            int r8 = r8 + 1
            goto L6
        L5c:
            r2 = 55296(0xd800, float:7.7486E-41)
            r3 = 63
            if (r2 > r0) goto Lc6
            r2 = 57344(0xe000, float:8.0356E-41)
            if (r0 >= r2) goto Lc6
            r4 = 56319(0xdbff, float:7.892E-41)
            int r4 = gg.l.c(r0, r4)
            if (r4 > 0) goto Lbe
            int r4 = r8 + 1
            if (r9 <= r4) goto Lbe
            char r5 = r7.charAt(r4)
            r6 = 56320(0xdc00, float:7.8921E-41)
            if (r6 > r5) goto Lbe
            if (r5 >= r2) goto Lbe
            int r0 = r0 << 10
            char r2 = r7.charAt(r4)
            int r2 = r2 + r0
            r0 = -56613888(0xfffffffffca02400, float:-6.651981E36)
            int r2 = r2 + r0
            int r0 = r2 >> 18
            r0 = r0 | 240(0xf0, float:3.36E-43)
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r10.invoke(r0)
            int r0 = r2 >> 12
            r0 = r0 & r3
            r0 = r0 | r1
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r10.invoke(r0)
            int r0 = r2 >> 6
            r0 = r0 & r3
            r0 = r0 | r1
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r10.invoke(r0)
            r0 = r2 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r10.invoke(r0)
            int r8 = r8 + 2
            goto L6
        Lbe:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r3)
            r10.invoke(r0)
            goto L59
        Lc6:
            int r2 = r0 >> 12
            r2 = r2 | 224(0xe0, float:3.14E-43)
            byte r2 = (byte) r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r10.invoke(r2)
            int r2 = r0 >> 6
            r2 = r2 & r3
            r2 = r2 | r1
            byte r2 = (byte) r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r10.invoke(r2)
            r0 = r0 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r10.invoke(r0)
            goto L59
        Leb:
            return
    }

    public static final void processUtf8CodePoints(byte[] r11, int r12, int r13, fg.l r14) {
            r0 = 65533(0xfffd, float:9.1831E-41)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.getClass()
            r14.getClass()
        Ld:
            if (r12 >= r13) goto L120
            r1 = r11[r12]
            if (r1 < 0) goto L2c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r14.invoke(r1)
            int r12 = r12 + 1
        L1c:
            if (r12 >= r13) goto Ld
            r1 = r11[r12]
            if (r1 < 0) goto Ld
            int r12 = r12 + 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r14.invoke(r1)
            goto L1c
        L2c:
            int r2 = r1 >> 5
            r3 = -2
            r4 = 2
            r5 = 128(0x80, float:1.8E-43)
            r6 = 1
            if (r2 != r3) goto L58
            int r2 = r12 + 1
            if (r13 > r2) goto L3e
        L39:
            r14.invoke(r0)
        L3c:
            r4 = r6
            goto L56
        L3e:
            r2 = r11[r2]
            r3 = r2 & 192(0xc0, float:2.69E-43)
            if (r3 != r5) goto L39
            r2 = r2 ^ 3968(0xf80, float:5.56E-42)
            int r1 = r1 << 6
            r1 = r1 ^ r2
            if (r1 >= r5) goto L4f
            r14.invoke(r0)
            goto L56
        L4f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r14.invoke(r1)
        L56:
            int r12 = r12 + r4
            goto Ld
        L58:
            int r2 = r1 >> 4
            r7 = 57344(0xe000, float:8.0356E-41)
            r8 = 55296(0xd800, float:7.7486E-41)
            r9 = 3
            if (r2 != r3) goto Lab
            int r2 = r12 + 2
            if (r13 > r2) goto L75
            r14.invoke(r0)
            int r1 = r12 + 1
            if (r13 <= r1) goto L3c
            r1 = r11[r1]
            r1 = r1 & 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L3c
            goto L56
        L75:
            int r3 = r12 + 1
            r3 = r11[r3]
            r10 = r3 & 192(0xc0, float:2.69E-43)
            if (r10 != r5) goto La7
            r2 = r11[r2]
            r6 = r2 & 192(0xc0, float:2.69E-43)
            if (r6 != r5) goto La3
            r4 = -123008(0xfffffffffffe1f80, float:NaN)
            r2 = r2 ^ r4
            int r3 = r3 << 6
            r2 = r2 ^ r3
            int r1 = r1 << 12
            r1 = r1 ^ r2
            r2 = 2048(0x800, float:2.87E-42)
            if (r1 >= r2) goto L95
        L91:
            r14.invoke(r0)
            goto La1
        L95:
            if (r8 > r1) goto L9a
            if (r1 >= r7) goto L9a
            goto L91
        L9a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r14.invoke(r1)
        La1:
            r4 = r9
            goto L56
        La3:
            r14.invoke(r0)
            goto L56
        La7:
            r14.invoke(r0)
            goto L3c
        Lab:
            int r2 = r1 >> 3
            if (r2 != r3) goto L119
            int r2 = r12 + 3
            if (r13 > r2) goto Lcb
            r14.invoke(r0)
            int r1 = r12 + 1
            if (r13 <= r1) goto L3c
            r1 = r11[r1]
            r1 = r1 & 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L3c
            int r1 = r12 + 2
            if (r13 <= r1) goto L56
            r1 = r11[r1]
            r1 = r1 & 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L56
        Lca:
            goto La1
        Lcb:
            int r3 = r12 + 1
            r3 = r11[r3]
            r10 = r3 & 192(0xc0, float:2.69E-43)
            if (r10 != r5) goto L114
            int r6 = r12 + 2
            r6 = r11[r6]
            r10 = r6 & 192(0xc0, float:2.69E-43)
            if (r10 != r5) goto L10f
            r2 = r11[r2]
            r4 = r2 & 192(0xc0, float:2.69E-43)
            if (r4 != r5) goto L10b
            r4 = 3678080(0x381f80, float:5.154088E-39)
            r2 = r2 ^ r4
            int r4 = r6 << 6
            r2 = r2 ^ r4
            int r3 = r3 << 12
            r2 = r2 ^ r3
            int r1 = r1 << 18
            r1 = r1 ^ r2
            r2 = 1114111(0x10ffff, float:1.561202E-39)
            if (r1 <= r2) goto Lf7
        Lf3:
            r14.invoke(r0)
            goto L108
        Lf7:
            if (r8 > r1) goto Lfc
            if (r1 >= r7) goto Lfc
            goto Lf3
        Lfc:
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r1 >= r2) goto L101
            goto Lf3
        L101:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r14.invoke(r1)
        L108:
            r4 = 4
            goto L56
        L10b:
            r14.invoke(r0)
            goto Lca
        L10f:
            r14.invoke(r0)
            goto L56
        L114:
            r14.invoke(r0)
            goto L3c
        L119:
            r14.invoke(r0)
            int r12 = r12 + 1
            goto Ld
        L120:
            return
    }

    public static final long size(java.lang.String r3) {
            r3.getClass()
            r0 = 3
            r1 = 0
            r2 = 0
            long r0 = size$default(r3, r2, r2, r0, r1)
            return r0
    }

    public static final long size(java.lang.String r3, int r4) {
            r3.getClass()
            r0 = 2
            r1 = 0
            r2 = 0
            long r3 = size$default(r3, r4, r2, r0, r1)
            return r3
    }

    public static final long size(java.lang.String r9, int r10, int r11) {
            r9.getClass()
            if (r10 < 0) goto L73
            if (r11 < r10) goto L67
            int r0 = r9.length()
            if (r11 > r0) goto L55
            r0 = 0
        Lf:
            if (r10 >= r11) goto L54
            char r2 = r9.charAt(r10)
            r3 = 128(0x80, float:1.8E-43)
            r4 = 1
            if (r2 >= r3) goto L1f
            long r0 = r0 + r4
        L1c:
            int r10 = r10 + 1
            goto Lf
        L1f:
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 >= r3) goto L27
            r2 = 2
        L24:
            long r2 = (long) r2
            long r0 = r0 + r2
            goto L1c
        L27:
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r3) goto L52
            r3 = 57343(0xdfff, float:8.0355E-41)
            if (r2 <= r3) goto L32
            goto L52
        L32:
            int r6 = r10 + 1
            if (r6 >= r11) goto L3b
            char r7 = r9.charAt(r6)
            goto L3c
        L3b:
            r7 = 0
        L3c:
            r8 = 56319(0xdbff, float:7.892E-41)
            if (r2 > r8) goto L4f
            r2 = 56320(0xdc00, float:7.8921E-41)
            if (r7 < r2) goto L4f
            if (r7 <= r3) goto L49
            goto L4f
        L49:
            r2 = 4
            long r2 = (long) r2
            long r0 = r0 + r2
            int r10 = r10 + 2
            goto Lf
        L4f:
            long r0 = r0 + r4
            r10 = r6
            goto Lf
        L52:
            r2 = 3
            goto L24
        L54:
            return r0
        L55:
            java.lang.String r10 = "endIndex > string.length: "
            java.lang.String r0 = " > "
            java.lang.StringBuilder r10 = eh.a.t(r11, r10, r0)
            int r9 = r9.length()
            okio.a.e(r9, r10)
        L64:
            r9 = 0
            return r9
        L67:
            java.lang.String r9 = "endIndex < beginIndex: "
            java.lang.String r0 = " < "
            java.lang.String r9 = p.a.j(r11, r9, r0, r10)
            j8.o.q(r9)
            goto L64
        L73:
            java.lang.String r9 = "beginIndex < 0: "
            java.lang.String r9 = eh.a.l(r10, r9)
            j8.o.q(r9)
            goto L64
    }

    public static /* synthetic */ long size$default(java.lang.String r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            long r0 = size(r0, r1, r2)
            return r0
    }
}
