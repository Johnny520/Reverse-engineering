package okio.internal;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class _Utf8Kt {
    public static final byte[] commonAsUtf8ToByteArray(java.lang.String r11) {
            r11.getClass()
            int r0 = r11.length()
            int r0 = r0 * 4
            byte[] r0 = new byte[r0]
            int r1 = r11.length()
            r2 = 0
        L10:
            if (r2 >= r1) goto Lf2
            char r3 = r11.charAt(r2)
            r4 = 128(0x80, float:1.8E-43)
            int r5 = gg.l.c(r3, r4)
            if (r5 < 0) goto Leb
            int r1 = r11.length()
            r3 = r2
        L23:
            if (r2 >= r1) goto Le6
            char r5 = r11.charAt(r2)
            int r6 = gg.l.c(r5, r4)
            if (r6 >= 0) goto L50
            byte r5 = (byte) r5
            int r6 = r3 + 1
            r0[r3] = r5
            int r2 = r2 + 1
        L36:
            r3 = r6
            if (r2 >= r1) goto L23
            char r5 = r11.charAt(r2)
            int r5 = gg.l.c(r5, r4)
            if (r5 >= 0) goto L23
            int r5 = r2 + 1
            char r2 = r11.charAt(r2)
            byte r2 = (byte) r2
            int r6 = r3 + 1
            r0[r3] = r2
            r2 = r5
            goto L36
        L50:
            r6 = 2048(0x800, float:2.87E-42)
            int r6 = gg.l.c(r5, r6)
            if (r6 >= 0) goto L6c
            int r6 = r5 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            int r7 = r3 + 1
            r0[r3] = r6
            r5 = r5 & 63
            r5 = r5 | r4
            byte r5 = (byte) r5
            int r3 = r3 + 2
            r0[r7] = r5
        L69:
            int r2 = r2 + 1
            goto L23
        L6c:
            r6 = 55296(0xd800, float:7.7486E-41)
            r7 = 63
            if (r6 > r5) goto Lcb
            r6 = 57344(0xe000, float:8.0356E-41)
            if (r5 >= r6) goto Lcb
            r8 = 56319(0xdbff, float:7.892E-41)
            int r8 = gg.l.c(r5, r8)
            if (r8 > 0) goto Lc2
            int r8 = r2 + 1
            if (r1 <= r8) goto Lc2
            char r9 = r11.charAt(r8)
            r10 = 56320(0xdc00, float:7.8921E-41)
            if (r10 > r9) goto Lc2
            if (r9 >= r6) goto Lc2
            int r5 = r5 << 10
            char r6 = r11.charAt(r8)
            int r6 = r6 + r5
            r5 = -56613888(0xfffffffffca02400, float:-6.651981E36)
            int r6 = r6 + r5
            int r5 = r6 >> 18
            r5 = r5 | 240(0xf0, float:3.36E-43)
            byte r5 = (byte) r5
            int r8 = r3 + 1
            r0[r3] = r5
            int r5 = r6 >> 12
            r5 = r5 & r7
            r5 = r5 | r4
            byte r5 = (byte) r5
            int r9 = r3 + 2
            r0[r8] = r5
            int r5 = r6 >> 6
            r5 = r5 & r7
            r5 = r5 | r4
            byte r5 = (byte) r5
            int r8 = r3 + 3
            r0[r9] = r5
            r5 = r6 & 63
            r5 = r5 | r4
            byte r5 = (byte) r5
            int r3 = r3 + 4
            r0[r8] = r5
            int r2 = r2 + 2
            goto L23
        Lc2:
            int r5 = r3 + 1
            r0[r3] = r7
            int r2 = r2 + 1
            r3 = r5
            goto L23
        Lcb:
            int r6 = r5 >> 12
            r6 = r6 | 224(0xe0, float:3.14E-43)
            byte r6 = (byte) r6
            int r8 = r3 + 1
            r0[r3] = r6
            int r6 = r5 >> 6
            r6 = r6 & r7
            r6 = r6 | r4
            byte r6 = (byte) r6
            int r7 = r3 + 2
            r0[r8] = r6
            r5 = r5 & 63
            r5 = r5 | r4
            byte r5 = (byte) r5
            int r3 = r3 + 3
            r0[r7] = r5
            goto L69
        Le6:
            byte[] r11 = java.util.Arrays.copyOf(r0, r3)
            return r11
        Leb:
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r2 + 1
            goto L10
        Lf2:
            int r11 = r11.length()
            byte[] r11 = java.util.Arrays.copyOf(r0, r11)
            return r11
    }

    public static final java.lang.String commonToUtf8String(byte[] r16, int r17, int r18) {
            r0 = r16
            r1 = r17
            r2 = r18
            r0.getClass()
            if (r1 < 0) goto L172
            int r3 = r0.length
            if (r2 > r3) goto L172
            if (r1 > r2) goto L172
            int r3 = r2 - r1
            char[] r3 = new char[r3]
            r4 = 0
            r5 = r4
        L16:
            if (r1 >= r2) goto L16d
            r6 = r0[r1]
            if (r6 < 0) goto L32
            char r6 = (char) r6
            int r7 = r5 + 1
            r3[r5] = r6
            int r1 = r1 + 1
        L23:
            r5 = r7
            if (r1 >= r2) goto L16
            r6 = r0[r1]
            if (r6 < 0) goto L16
            int r1 = r1 + 1
            char r6 = (char) r6
            int r7 = r5 + 1
            r3[r5] = r6
            goto L23
        L32:
            int r7 = r6 >> 5
            r8 = -2
            r10 = 128(0x80, float:1.8E-43)
            r11 = 65533(0xfffd, float:9.1831E-41)
            r12 = 1
            if (r7 != r8) goto L6c
            int r7 = r1 + 1
            if (r2 > r7) goto L49
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
        L46:
            r5 = r7
        L47:
            r9 = r12
            goto L6a
        L49:
            r7 = r0[r7]
            r8 = r7 & 192(0xc0, float:2.69E-43)
            if (r8 != r10) goto L64
            r7 = r7 ^ 3968(0xf80, float:5.56E-42)
            int r6 = r6 << 6
            r6 = r6 ^ r7
            if (r6 >= r10) goto L5c
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            goto L61
        L5c:
            char r6 = (char) r6
            int r7 = r5 + 1
            r3[r5] = r6
        L61:
            r5 = r7
        L62:
            r9 = 2
            goto L6a
        L64:
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            goto L46
        L6a:
            int r1 = r1 + r9
            goto L16
        L6c:
            int r7 = r6 >> 4
            r13 = 57344(0xe000, float:8.0356E-41)
            r14 = 55296(0xd800, float:7.7486E-41)
            r15 = 3
            if (r7 != r8) goto Lcc
            int r7 = r1 + 2
            if (r2 > r7) goto L8b
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            int r5 = r1 + 1
            if (r2 <= r5) goto L46
            r5 = r0[r5]
            r5 = r5 & 192(0xc0, float:2.69E-43)
            if (r5 != r10) goto L46
        L8a:
            goto L61
        L8b:
            int r8 = r1 + 1
            r8 = r0[r8]
            r9 = r8 & 192(0xc0, float:2.69E-43)
            if (r9 != r10) goto Lc5
            r7 = r0[r7]
            r9 = r7 & 192(0xc0, float:2.69E-43)
            if (r9 != r10) goto Lbf
            r9 = -123008(0xfffffffffffe1f80, float:NaN)
            r7 = r7 ^ r9
            int r8 = r8 << 6
            r7 = r7 ^ r8
            int r6 = r6 << 12
            r6 = r6 ^ r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r6 >= r7) goto Lad
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            goto Lbc
        Lad:
            if (r14 > r6) goto Lb7
            if (r6 >= r13) goto Lb7
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            goto Lbc
        Lb7:
            char r6 = (char) r6
            int r7 = r5 + 1
            r3[r5] = r6
        Lbc:
            r5 = r7
        Lbd:
            r9 = r15
            goto L6a
        Lbf:
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            goto L8a
        Lc5:
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            goto L46
        Lcc:
            int r7 = r6 >> 3
            if (r7 != r8) goto L164
            int r7 = r1 + 3
            if (r2 > r7) goto Lf4
            int r6 = r5 + 1
            r3[r5] = r11
            int r5 = r1 + 1
            if (r2 <= r5) goto Lf1
            r5 = r0[r5]
            r5 = r5 & 192(0xc0, float:2.69E-43)
            if (r5 != r10) goto Lf1
            int r5 = r1 + 2
            if (r2 <= r5) goto Lee
            r5 = r0[r5]
            r5 = r5 & 192(0xc0, float:2.69E-43)
            if (r5 != r10) goto Lee
        Lec:
            r5 = r6
            goto Lbd
        Lee:
            r5 = r6
            goto L62
        Lf1:
            r5 = r6
            goto L47
        Lf4:
            int r8 = r1 + 1
            r8 = r0[r8]
            r9 = r8 & 192(0xc0, float:2.69E-43)
            if (r9 != r10) goto L15f
            int r9 = r1 + 2
            r9 = r0[r9]
            r12 = r9 & 192(0xc0, float:2.69E-43)
            if (r12 != r10) goto L15a
            r7 = r0[r7]
            r12 = r7 & 192(0xc0, float:2.69E-43)
            if (r12 != r10) goto L155
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r7 = r7 ^ r10
            int r9 = r9 << 6
            r7 = r7 ^ r9
            int r8 = r8 << 12
            r7 = r7 ^ r8
            int r6 = r6 << 18
            r6 = r6 ^ r7
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r6 <= r7) goto L121
            int r6 = r5 + 1
            r3[r5] = r11
            goto L151
        L121:
            if (r14 > r6) goto L12a
            if (r6 >= r13) goto L12a
            int r6 = r5 + 1
            r3[r5] = r11
            goto L151
        L12a:
            r7 = 65536(0x10000, float:9.1835E-41)
            if (r6 >= r7) goto L133
            int r6 = r5 + 1
            r3[r5] = r11
            goto L151
        L133:
            if (r6 == r11) goto L14d
            int r7 = r6 >>> 10
            r8 = 55232(0xd7c0, float:7.7397E-41)
            int r7 = r7 + r8
            char r7 = (char) r7
            int r8 = r5 + 1
            r3[r5] = r7
            r6 = r6 & 1023(0x3ff, float:1.434E-42)
            r7 = 56320(0xdc00, float:7.8921E-41)
            int r6 = r6 + r7
            char r6 = (char) r6
            int r5 = r5 + 2
            r3[r8] = r6
            r6 = r5
            goto L151
        L14d:
            int r6 = r5 + 1
            r3[r5] = r11
        L151:
            r9 = 4
            r5 = r6
            goto L6a
        L155:
            int r6 = r5 + 1
            r3[r5] = r11
            goto Lec
        L15a:
            int r6 = r5 + 1
            r3[r5] = r11
            goto Lee
        L15f:
            int r6 = r5 + 1
            r3[r5] = r11
            goto Lf1
        L164:
            int r6 = r5 + 1
            r3[r5] = r11
            int r1 = r1 + 1
            r5 = r6
            goto L16
        L16d:
            java.lang.String r0 = og.t.V(r3, r4, r5)
            return r0
        L172:
            java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "size="
            r4.<init>(r5)
            int r0 = r0.length
            java.lang.String r5 = " beginIndex="
            java.lang.String r6 = " endIndex="
            wb.en.p(r4, r0, r5, r1, r6)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
    }

    public static /* synthetic */ java.lang.String commonToUtf8String$default(byte[] r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto La
            int r2 = r0.length
        La:
            java.lang.String r0 = commonToUtf8String(r0, r1, r2)
            return r0
    }
}
