package okio.internal;

/* JADX INFO: compiled from: -Utf8.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, m115d2 = {"commonAsUtf8ToByteArray", "", "", "commonToUtf8String", "beginIndex", "", "endIndex", "okio"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class _Utf8Kt {
    public static final byte[] commonAsUtf8ToByteArray(java.lang.String r16) {
            r0 = r16
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            int r1 = r16.length()
            int r1 = r1 * 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r3 = r16.length()
        L14:
            java.lang.String r4 = "copyOf(this, newSize)"
            if (r2 >= r3) goto L140
            char r5 = r0.charAt(r2)
            r6 = 128(0x80, float:1.8E-43)
            int r7 = kotlin.jvm.internal.Intrinsics.compare(r5, r6)
            if (r7 < 0) goto L139
            r3 = 0
            r3 = r2
            int r7 = r16.length()
            r8 = r16
            r9 = 0
            r10 = r2
        L2e:
            if (r10 >= r7) goto L130
            char r11 = r8.charAt(r10)
            int r12 = kotlin.jvm.internal.Intrinsics.compare(r11, r6)
            if (r12 >= 0) goto L62
            byte r12 = (byte) r11
            r13 = 0
            int r14 = r3 + 1
            r1[r3] = r12
            int r10 = r10 + 1
            r3 = r14
        L46:
            if (r10 >= r7) goto L2e
            char r12 = r8.charAt(r10)
            int r12 = kotlin.jvm.internal.Intrinsics.compare(r12, r6)
            if (r12 >= 0) goto L2e
            int r12 = r10 + 1
            char r10 = r8.charAt(r10)
            byte r10 = (byte) r10
            r13 = 0
            int r14 = r3 + 1
            r1[r3] = r10
            r10 = r12
            r3 = r14
            goto L46
        L62:
            r12 = 2048(0x800, float:2.87E-42)
            int r12 = kotlin.jvm.internal.Intrinsics.compare(r11, r12)
            if (r12 >= 0) goto L85
            int r12 = r11 >> 6
            r12 = r12 | 192(0xc0, float:2.69E-43)
            byte r12 = (byte) r12
            r13 = 0
            int r14 = r3 + 1
            r1[r3] = r12
            r3 = r11 & 63
            r3 = r3 | r6
            byte r3 = (byte) r3
            r12 = 0
            int r13 = r14 + 1
            r1[r14] = r3
            int r10 = r10 + 1
            r3 = r13
            goto L2e
        L85:
            r12 = 55296(0xd800, float:7.7486E-41)
            r13 = 57344(0xe000, float:8.0356E-41)
            r15 = 1
            if (r12 > r11) goto L92
            if (r11 >= r13) goto L92
            r12 = r15
            goto L93
        L92:
            r12 = 0
        L93:
            if (r12 != 0) goto Lbe
            int r12 = r11 >> 12
            r12 = r12 | 224(0xe0, float:3.14E-43)
            byte r12 = (byte) r12
            r13 = 0
            int r14 = r3 + 1
            r1[r3] = r12
            int r3 = r11 >> 6
            r3 = r3 & 63
            r3 = r3 | r6
            byte r3 = (byte) r3
            r12 = 0
            int r13 = r14 + 1
            r1[r14] = r3
            r3 = r11 & 63
            r3 = r3 | r6
            byte r3 = (byte) r3
            r12 = 0
            int r14 = r13 + 1
            r1[r13] = r3
            int r10 = r10 + 1
            r3 = r14
            goto L2e
        Lbe:
            r12 = 56319(0xdbff, float:7.892E-41)
            int r12 = kotlin.jvm.internal.Intrinsics.compare(r11, r12)
            if (r12 > 0) goto L122
            int r12 = r10 + 1
            if (r7 <= r12) goto L122
            int r12 = r10 + 1
            char r12 = r8.charAt(r12)
            r14 = 56320(0xdc00, float:7.8921E-41)
            if (r14 > r12) goto Lda
            if (r12 >= r13) goto Lda
            r14 = r15
            goto Ldb
        Lda:
            r14 = 0
        Ldb:
            if (r14 != 0) goto Lde
            goto L122
        Lde:
            int r12 = r11 << 10
            int r13 = r10 + 1
            char r13 = r8.charAt(r13)
            int r12 = r12 + r13
            r13 = -56613888(0xfffffffffca02400, float:-6.651981E36)
            int r12 = r12 + r13
            int r13 = r12 >> 18
            r13 = r13 | 240(0xf0, float:3.36E-43)
            byte r13 = (byte) r13
            r14 = 0
            int r15 = r3 + 1
            r1[r3] = r13
            int r3 = r12 >> 12
            r3 = r3 & 63
            r3 = r3 | r6
            byte r3 = (byte) r3
            r13 = 0
            int r14 = r15 + 1
            r1[r15] = r3
            int r3 = r12 >> 6
            r3 = r3 & 63
            r3 = r3 | r6
            byte r3 = (byte) r3
            r13 = 0
            int r15 = r14 + 1
            r1[r14] = r3
            r3 = r12 & 63
            r3 = r3 | r6
            byte r3 = (byte) r3
            r13 = 0
            int r14 = r15 + 1
            r1[r15] = r3
            int r10 = r10 + 2
            r3 = r14
            goto L2e
        L122:
            r12 = 63
            r13 = 0
            int r14 = r3 + 1
            r1[r3] = r12
            int r10 = r10 + 1
            r3 = r14
            goto L2e
        L130:
            byte[] r6 = java.util.Arrays.copyOf(r1, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            return r6
        L139:
            byte r4 = (byte) r5
            r1[r2] = r4
            int r2 = r2 + 1
            goto L14
        L140:
            int r2 = r16.length()
            byte[] r2 = java.util.Arrays.copyOf(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            return r2
    }

    public static final java.lang.String commonToUtf8String(byte[] r26, int r27, int r28) {
            r0 = r26
            r1 = r27
            r2 = r28
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            if (r1 < 0) goto L425
            int r3 = r0.length
            if (r2 > r3) goto L425
            if (r1 > r2) goto L425
            int r3 = r2 - r1
            char[] r3 = new char[r3]
            r4 = 0
            r5 = r26
            r6 = 0
            r7 = r27
        L1c:
            if (r7 >= r2) goto L41e
            r9 = r5[r7]
            if (r9 < 0) goto L42
            char r8 = (char) r9
            r10 = 0
            int r11 = r4 + 1
            r3[r4] = r8
            int r7 = r7 + 1
            r4 = r11
        L2e:
            if (r7 >= r2) goto L1c
            r8 = r5[r7]
            if (r8 < 0) goto L1c
            int r8 = r7 + 1
            r7 = r5[r7]
            char r7 = (char) r7
            r10 = 0
            int r11 = r4 + 1
            r3[r4] = r7
            r7 = r8
            r4 = r11
            goto L2e
        L42:
            r10 = 5
            r11 = r9
            r12 = 0
            int r10 = r11 >> r10
            r11 = -2
            r12 = 128(0x80, float:1.8E-43)
            if (r10 != r11) goto Lc9
            r10 = r5
            r11 = 0
            int r15 = r7 + 1
            if (r2 > r15) goto L67
            r8 = 65533(0xfffd, float:9.1831E-41)
            r12 = 0
            char r13 = (char) r8
            r15 = 0
            int r16 = r4 + 1
            r3[r4] = r13
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            r4 = r16
            r13 = 1
            r16 = r6
            goto Lc4
        L67:
            r15 = r10[r7]
            int r16 = r7 + 1
            r13 = r10[r16]
            r16 = 0
            r18 = 192(0xc0, float:2.69E-43)
            r19 = r13
            r20 = 0
            r14 = r19 & r18
            if (r14 != r12) goto L7b
            r8 = 1
            goto L7c
        L7b:
            r8 = 0
        L7c:
            if (r8 != 0) goto L94
            r8 = 65533(0xfffd, float:9.1831E-41)
            r12 = 0
            char r14 = (char) r8
            r16 = 0
            int r17 = r4 + 1
            r3[r4] = r14
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            r16 = r6
            r4 = r17
            r13 = 1
            goto Lc4
        L94:
            r8 = r13 ^ 3968(0xf80, float:5.56E-42)
            int r14 = r15 << 6
            r8 = r8 ^ r14
            if (r8 >= r12) goto Lb1
            r12 = 65533(0xfffd, float:9.1831E-41)
            r14 = 0
            r16 = r6
            char r6 = (char) r12
            r18 = 0
            int r19 = r4 + 1
            r3[r4] = r6
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            goto Lc1
        Lb1:
            r16 = r6
            r6 = r8
            r12 = 0
            char r14 = (char) r6
            r18 = 0
            int r19 = r4 + 1
            r3[r4] = r14
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        Lc1:
            r4 = r19
            r13 = 2
        Lc4:
            int r7 = r7 + r13
            r6 = r16
            goto L1c
        Lc9:
            r16 = r6
            r6 = 4
            r10 = r9
            r13 = 0
            int r6 = r10 >> r6
            r10 = 57344(0xe000, float:8.0356E-41)
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r6 != r11) goto L1b2
            r6 = r5
            r11 = 0
            int r15 = r7 + 2
            if (r2 > r15) goto L10d
            r10 = 65533(0xfffd, float:9.1831E-41)
            r13 = 0
            char r14 = (char) r10
            r15 = 0
            int r18 = r4 + 1
            r3[r4] = r14
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            int r4 = r7 + 1
            if (r2 <= r4) goto L108
            int r4 = r7 + 1
            r4 = r6[r4]
            r10 = 0
            r13 = 192(0xc0, float:2.69E-43)
            r14 = r4
            r15 = 0
            r13 = r13 & r14
            if (r13 != r12) goto Lff
            r8 = 1
            goto L100
        Lff:
            r8 = 0
        L100:
            if (r8 != 0) goto L103
            goto L108
        L103:
            r4 = r18
            r13 = 2
            goto L1ad
        L108:
            r4 = r18
            r13 = 1
            goto L1ad
        L10d:
            r15 = r6[r7]
            int r18 = r7 + 1
            r18 = r6[r18]
            r19 = 0
            r20 = 192(0xc0, float:2.69E-43)
            r22 = r18
            r23 = 0
            r14 = r22 & r20
            if (r14 != r12) goto L121
            r14 = 1
            goto L122
        L121:
            r14 = 0
        L122:
            if (r14 != 0) goto L137
            r8 = 65533(0xfffd, float:9.1831E-41)
            r10 = 0
            char r12 = (char) r8
            r13 = 0
            int r14 = r4 + 1
            r3[r4] = r12
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            r4 = r14
            r13 = 1
            goto L1ad
        L137:
            int r14 = r7 + 2
            r14 = r6[r14]
            r19 = 0
            r20 = 192(0xc0, float:2.69E-43)
            r22 = r14
            r23 = 0
            r8 = r22 & r20
            if (r8 != r12) goto L149
            r8 = 1
            goto L14a
        L149:
            r8 = 0
        L14a:
            if (r8 != 0) goto L15f
            r8 = 65533(0xfffd, float:9.1831E-41)
            r10 = 0
            char r12 = (char) r8
            r13 = 0
            int r19 = r4 + 1
            r3[r4] = r12
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            r4 = r19
            r13 = 2
            goto L1ad
        L15f:
            r8 = -123008(0xfffffffffffe1f80, float:NaN)
            r8 = r8 ^ r14
            int r12 = r18 << 6
            r8 = r8 ^ r12
            int r12 = r15 << 12
            r8 = r8 ^ r12
            r12 = 2048(0x800, float:2.87E-42)
            if (r8 >= r12) goto L181
            r10 = 65533(0xfffd, float:9.1831E-41)
            r12 = 0
            char r13 = (char) r10
            r17 = 0
            int r19 = r4 + 1
            r3[r4] = r13
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            goto L1aa
        L181:
            if (r13 > r8) goto L188
            if (r8 >= r10) goto L188
            r24 = 1
            goto L18a
        L188:
            r24 = 0
        L18a:
            if (r24 == 0) goto L19c
            r10 = 65533(0xfffd, float:9.1831E-41)
            r12 = 0
            char r13 = (char) r10
            r17 = 0
            int r19 = r4 + 1
            r3[r4] = r13
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            goto L1aa
        L19c:
            r10 = r8
            r12 = 0
            char r13 = (char) r10
            r17 = 0
            int r19 = r4 + 1
            r3[r4] = r13
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L1aa:
            r4 = r19
            r13 = 3
        L1ad:
            int r7 = r7 + r13
            r6 = r16
            goto L1c
        L1b2:
            r6 = 3
            r8 = r9
            r14 = 0
            int r6 = r8 >> r6
            if (r6 != r11) goto L40d
            r6 = r5
            r8 = 0
            int r11 = r7 + 3
            r14 = 56320(0xdc00, float:7.8921E-41)
            r15 = 55232(0xd7c0, float:7.7397E-41)
            r10 = 65533(0xfffd, float:9.1831E-41)
            if (r2 > r11) goto L22c
            r11 = 65533(0xfffd, float:9.1831E-41)
            r13 = 0
            if (r11 == r10) goto L1e4
            int r10 = r11 >>> 10
            int r10 = r10 + r15
            char r10 = (char) r10
            r15 = 0
            int r18 = r4 + 1
            r3[r4] = r10
            r4 = r11 & 1023(0x3ff, float:1.434E-42)
            int r4 = r4 + r14
            char r4 = (char) r4
            r10 = 0
            int r14 = r18 + 1
            r3[r18] = r4
            goto L1ee
        L1e4:
            r10 = 65533(0xfffd, float:9.1831E-41)
            r14 = 0
            int r15 = r4 + 1
            r3[r4] = r10
            r14 = r15
        L1ee:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            int r4 = r7 + 1
            if (r2 <= r4) goto L228
            int r4 = r7 + 1
            r4 = r6[r4]
            r10 = 0
            r11 = 192(0xc0, float:2.69E-43)
            r13 = r4
            r15 = 0
            r11 = r11 & r13
            if (r11 != r12) goto L204
            r4 = 1
            goto L205
        L204:
            r4 = 0
        L205:
            if (r4 != 0) goto L208
            goto L228
        L208:
            int r4 = r7 + 2
            if (r2 <= r4) goto L224
            int r4 = r7 + 2
            r4 = r6[r4]
            r10 = 0
            r11 = 192(0xc0, float:2.69E-43)
            r13 = r4
            r15 = 0
            r11 = r11 & r13
            if (r11 != r12) goto L21b
            r21 = 1
            goto L21d
        L21b:
            r21 = 0
        L21d:
            if (r21 != 0) goto L220
            goto L224
        L220:
            r4 = r14
            r13 = 3
            goto L408
        L224:
            r4 = r14
            r13 = 2
            goto L408
        L228:
            r4 = r14
            r13 = 1
            goto L408
        L22c:
            r11 = r6[r7]
            int r19 = r7 + 1
            r19 = r6[r19]
            r20 = 0
            r22 = 192(0xc0, float:2.69E-43)
            r23 = r19
            r25 = 0
            r13 = r23 & r22
            if (r13 != r12) goto L240
            r13 = 1
            goto L241
        L240:
            r13 = 0
        L241:
            if (r13 != 0) goto L271
            r12 = 65533(0xfffd, float:9.1831E-41)
            r13 = 0
            if (r12 == r10) goto L25f
            int r10 = r12 >>> 10
            int r10 = r10 + r15
            char r10 = (char) r10
            r15 = 0
            int r17 = r4 + 1
            r3[r4] = r10
            r4 = r12 & 1023(0x3ff, float:1.434E-42)
            int r4 = r4 + r14
            char r4 = (char) r4
            r10 = 0
            int r14 = r17 + 1
            r3[r17] = r4
            goto L269
        L25f:
            r10 = 65533(0xfffd, float:9.1831E-41)
            r14 = 0
            int r15 = r4 + 1
            r3[r4] = r10
            r14 = r15
        L269:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            r4 = r14
            r13 = 1
            goto L408
        L271:
            int r13 = r7 + 2
            r13 = r6[r13]
            r20 = 0
            r22 = 192(0xc0, float:2.69E-43)
            r23 = r13
            r25 = 0
            r14 = r23 & r22
            if (r14 != r12) goto L283
            r14 = 1
            goto L284
        L283:
            r14 = 0
        L284:
            if (r14 != 0) goto L2b8
            r12 = 65533(0xfffd, float:9.1831E-41)
            r14 = 0
            if (r12 == r10) goto L2a5
            int r10 = r12 >>> 10
            int r10 = r10 + r15
            char r10 = (char) r10
            r15 = 0
            int r18 = r4 + 1
            r3[r4] = r10
            r4 = r12 & 1023(0x3ff, float:1.434E-42)
            r10 = 56320(0xdc00, float:7.8921E-41)
            int r4 = r4 + r10
            char r4 = (char) r4
            r10 = 0
            int r15 = r18 + 1
            r3[r18] = r4
            goto L2b0
        L2a5:
            r10 = 65533(0xfffd, float:9.1831E-41)
            r15 = 0
            int r18 = r4 + 1
            r3[r4] = r10
            r15 = r18
        L2b0:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            r4 = r15
            r13 = 2
            goto L408
        L2b8:
            int r14 = r7 + 3
            r14 = r6[r14]
            r17 = 0
            r20 = 192(0xc0, float:2.69E-43)
            r22 = r14
            r23 = 0
            r15 = r22 & r20
            if (r15 != r12) goto L2ca
            r12 = 1
            goto L2cb
        L2ca:
            r12 = 0
        L2cb:
            if (r12 != 0) goto L306
            r12 = 65533(0xfffd, float:9.1831E-41)
            r15 = 0
            if (r12 == r10) goto L2f1
            int r10 = r12 >>> 10
            r17 = 55232(0xd7c0, float:7.7397E-41)
            int r10 = r10 + r17
            char r10 = (char) r10
            r17 = 0
            int r18 = r4 + 1
            r3[r4] = r10
            r4 = r12 & 1023(0x3ff, float:1.434E-42)
            r10 = 56320(0xdc00, float:7.8921E-41)
            int r4 = r4 + r10
            char r4 = (char) r4
            r10 = 0
            int r17 = r18 + 1
            r3[r18] = r4
            goto L2fd
        L2f1:
            r10 = 65533(0xfffd, float:9.1831E-41)
            r17 = 0
            int r18 = r4 + 1
            r3[r4] = r10
            r17 = r18
        L2fd:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            r4 = r17
            r13 = 3
            goto L408
        L306:
            r12 = 3678080(0x381f80, float:5.154088E-39)
            r12 = r12 ^ r14
            int r15 = r13 << 6
            r12 = r12 ^ r15
            int r15 = r19 << 12
            r12 = r12 ^ r15
            int r15 = r11 << 18
            r12 = r12 ^ r15
            r15 = 1114111(0x10ffff, float:1.561202E-39)
            if (r12 <= r15) goto L352
            r15 = 65533(0xfffd, float:9.1831E-41)
            r17 = 0
            if (r15 == r10) goto L341
            int r10 = r15 >>> 10
            r18 = 55232(0xd7c0, float:7.7397E-41)
            int r10 = r10 + r18
            char r10 = (char) r10
            r18 = 0
            int r20 = r4 + 1
            r3[r4] = r10
            r4 = r15 & 1023(0x3ff, float:1.434E-42)
            r10 = 56320(0xdc00, float:7.8921E-41)
            int r4 = r4 + r10
            char r4 = (char) r4
            r10 = 0
            int r18 = r20 + 1
            r3[r20] = r4
            goto L34d
        L341:
            r10 = 65533(0xfffd, float:9.1831E-41)
            r18 = 0
            int r20 = r4 + 1
            r3[r4] = r10
            r18 = r20
        L34d:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            goto L404
        L352:
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r15 > r12) goto L35f
            r15 = 57344(0xe000, float:8.0356E-41)
            if (r12 >= r15) goto L35f
            r24 = 1
            goto L361
        L35f:
            r24 = 0
        L361:
            if (r24 == 0) goto L398
            r15 = 65533(0xfffd, float:9.1831E-41)
            r17 = 0
            if (r15 == r10) goto L388
            int r10 = r15 >>> 10
            r18 = 55232(0xd7c0, float:7.7397E-41)
            int r10 = r10 + r18
            char r10 = (char) r10
            r18 = 0
            int r20 = r4 + 1
            r3[r4] = r10
            r4 = r15 & 1023(0x3ff, float:1.434E-42)
            r10 = 56320(0xdc00, float:7.8921E-41)
            int r4 = r4 + r10
            char r4 = (char) r4
            r10 = 0
            int r18 = r20 + 1
            r3[r20] = r4
            goto L394
        L388:
            r10 = 65533(0xfffd, float:9.1831E-41)
            r18 = 0
            int r20 = r4 + 1
            r3[r4] = r10
            r18 = r20
        L394:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            goto L404
        L398:
            r15 = 65536(0x10000, float:9.1835E-41)
            if (r12 >= r15) goto L3d1
            r15 = 65533(0xfffd, float:9.1831E-41)
            r17 = 0
            if (r15 == r10) goto L3c1
            int r10 = r15 >>> 10
            r18 = 55232(0xd7c0, float:7.7397E-41)
            int r10 = r10 + r18
            char r10 = (char) r10
            r18 = 0
            int r20 = r4 + 1
            r3[r4] = r10
            r4 = r15 & 1023(0x3ff, float:1.434E-42)
            r10 = 56320(0xdc00, float:7.8921E-41)
            int r4 = r4 + r10
            char r4 = (char) r4
            r10 = 0
            int r18 = r20 + 1
            r3[r20] = r4
            goto L3cd
        L3c1:
            r10 = 65533(0xfffd, float:9.1831E-41)
            r18 = 0
            int r20 = r4 + 1
            r3[r4] = r10
            r18 = r20
        L3cd:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            goto L404
        L3d1:
            r15 = r12
            r17 = 0
            if (r15 == r10) goto L3f4
            int r10 = r15 >>> 10
            r18 = 55232(0xd7c0, float:7.7397E-41)
            int r10 = r10 + r18
            char r10 = (char) r10
            r18 = 0
            int r20 = r4 + 1
            r3[r4] = r10
            r4 = r15 & 1023(0x3ff, float:1.434E-42)
            r10 = 56320(0xdc00, float:7.8921E-41)
            int r4 = r4 + r10
            char r4 = (char) r4
            r10 = 0
            int r18 = r20 + 1
            r3[r20] = r4
            goto L400
        L3f4:
            r10 = 65533(0xfffd, float:9.1831E-41)
            r18 = 0
            int r20 = r4 + 1
            r3[r4] = r10
            r18 = r20
        L400:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L404:
            r4 = 4
            r13 = r4
            r4 = r18
        L408:
            int r7 = r7 + r13
            r6 = r16
            goto L1c
        L40d:
            r6 = 65533(0xfffd, float:9.1831E-41)
            r8 = 0
            int r10 = r4 + 1
            r3[r4] = r6
            int r7 = r7 + 1
            r4 = r10
            r6 = r16
            goto L1c
        L41e:
            r5 = 0
            java.lang.String r5 = kotlin.text.StringsKt.concatToString(r3, r5, r4)
            return r5
        L425:
            java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "size="
            java.lang.StringBuilder r4 = r4.append(r5)
            int r5 = r0.length
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = " beginIndex="
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r5 = " endIndex="
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
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
