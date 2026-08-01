package kotlin.text;

/* JADX INFO: compiled from: HexExtensions.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0004\u001a \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a@\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0000\u001a@\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0000\u001a \u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a,\u0010\u0018\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0005H\u0002\u001a,\u0010\u001d\u001a\u00020\u001e*\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\"H\u0002\u001a\u001c\u0010#\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002\u001a\u0014\u0010$\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000bH\u0002\u001a*\u0010%\u001a\u00020&*\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0003\u001a\u0016\u0010%\u001a\u00020&*\u00020\u00052\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a*\u0010)\u001a\u00020**\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0003\u001a\u0016\u0010)\u001a\u00020**\u00020\u00052\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a*\u0010+\u001a\u00020\u000b*\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0003\u001a\u0016\u0010+\u001a\u00020\u000b*\u00020\u00052\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a*\u0010,\u001a\u00020\b*\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0003\u001a\u0016\u0010,\u001a\u00020\b*\u00020\u00052\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a0\u0010-\u001a\u00020\b*\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020(2\u0006\u0010 \u001a\u00020\u000bH\u0003\u001a*\u0010.\u001a\u00020/*\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0003\u001a\u0016\u0010.\u001a\u00020/*\u00020\u00052\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a\u0016\u00100\u001a\u00020\u0005*\u00020&2\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a*\u00100\u001a\u00020\u0005*\u00020*2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a\u0016\u00100\u001a\u00020\u0005*\u00020*2\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a\u0016\u00100\u001a\u00020\u0005*\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a\u0016\u00100\u001a\u00020\u0005*\u00020\b2\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a\u0016\u00100\u001a\u00020\u0005*\u00020/2\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a\u001c\u00101\u001a\u00020\u0005*\u00020\b2\u0006\u0010'\u001a\u00020(2\u0006\u00102\u001a\u00020\u000bH\u0003\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u00063"}, m115d2 = {"HEX_DIGITS_TO_DECIMAL", "", "getHEX_DIGITS_TO_DECIMAL$annotations", "()V", "LOWER_CASE_HEX_DIGITS", "", "UPPER_CASE_HEX_DIGITS", "charsPerSet", "", "charsPerElement", "elementsPerSet", "", "elementSeparatorLength", "formattedStringLength", "totalBytes", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "parsedByteArrayMaxSize", "stringLength", "wholeElementsPerSet", "checkContainsAt", "part", "index", "endIndex", "partName", "checkHexLength", "", "startIndex", "maxDigits", "requireMaxLength", "", "checkNewLineAt", "decimalFromHexDigitAt", "hexToByte", "", "format", "Lkotlin/text/HexFormat;", "hexToByteArray", "", "hexToInt", "hexToLong", "hexToLongImpl", "hexToShort", "", "toHexString", "toHexStringImpl", "bits", "kotlin-stdlib"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class HexExtensionsKt {
    private static final int[] HEX_DIGITS_TO_DECIMAL = null;
    private static final java.lang.String LOWER_CASE_HEX_DIGITS = "0123456789abcdef";
    private static final java.lang.String UPPER_CASE_HEX_DIGITS = "0123456789ABCDEF";

    static {
            r0 = 128(0x80, float:1.8E-43)
            int[] r1 = new int[r0]
            r2 = 0
            r3 = r2
        L6:
            if (r3 >= r0) goto Le
            r4 = -1
            r1[r3] = r4
            int r3 = r3 + 1
            goto L6
        Le:
            r0 = r1
            r3 = 0
            java.lang.String r4 = "0123456789abcdef"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5 = 0
            r6 = 0
            r7 = r2
        L17:
            int r8 = r4.length()
            if (r7 >= r8) goto L2c
            char r8 = r4.charAt(r7)
            int r9 = r6 + 1
            r10 = r8
            r11 = 0
            r0[r10] = r6
            int r7 = r7 + 1
            r6 = r9
            goto L17
        L2c:
            java.lang.String r4 = "0123456789ABCDEF"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5 = 0
            r6 = 0
        L34:
            int r7 = r4.length()
            if (r2 >= r7) goto L49
            char r7 = r4.charAt(r2)
            int r8 = r6 + 1
            r9 = r7
            r10 = 0
            r0[r9] = r6
            int r2 = r2 + 1
            r6 = r8
            goto L34
        L49:
            kotlin.text.HexExtensionsKt.HEX_DIGITS_TO_DECIMAL = r1
            return
    }

    private static final long charsPerSet(long r8, int r10, int r11) {
            if (r10 <= 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 == 0) goto L11
            long r0 = (long) r10
            long r0 = r0 * r8
            long r2 = (long) r11
            long r4 = (long) r10
            r6 = 1
            long r4 = r4 - r6
            long r2 = r2 * r4
            long r0 = r0 + r2
            return r0
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static final int checkContainsAt(java.lang.String r7, java.lang.String r8, int r9, int r10, java.lang.String r11) {
            int r0 = r8.length()
            int r0 = r0 + r9
            if (r0 > r10) goto L17
            int r5 = r8.length()
            r6 = 1
            r4 = 0
            r1 = r7
            r2 = r9
            r3 = r8
            boolean r1 = kotlin.text.StringsKt.regionMatches(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L17
            return r0
        L17:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r11)
            java.lang.String r3 = " \""
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r8)
            java.lang.String r3 = "\" at index "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r9)
            java.lang.String r3 = ", but was "
            java.lang.StringBuilder r2 = r2.append(r3)
            int r3 = kotlin.ranges.RangesKt.coerceAtMost(r0, r10)
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7, r4)
            java.lang.String r3 = r7.substring(r9, r3)
            java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private static final void checkHexLength(java.lang.String r7, int r8, int r9, int r10, boolean r11) {
            int r0 = r9 - r8
            r1 = 1
            r2 = 0
            if (r11 == 0) goto L9
            if (r0 != r10) goto Lc
            goto Lb
        L9:
            if (r0 > r10) goto Lc
        Lb:
            goto Ld
        Lc:
            r1 = r2
        Ld:
            if (r1 != 0) goto L65
            if (r11 == 0) goto L14
            java.lang.String r2 = "exactly"
            goto L16
        L14:
            java.lang.String r2 = "at most"
        L16:
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7, r3)
            java.lang.String r3 = r7.substring(r8, r9)
            java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.NumberFormatException r4 = new java.lang.NumberFormatException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Expected "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r2)
            r6 = 32
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r10)
            java.lang.String r6 = " hexadecimal digits at index "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.String r6 = ", but was "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r3)
            java.lang.String r6 = " of length "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L65:
            return
    }

    private static final int checkNewLineAt(java.lang.String r3, int r4, int r5) {
            char r0 = r3.charAt(r4)
            r1 = 13
            r2 = 10
            if (r0 != r1) goto L1c
            int r0 = r4 + 1
            if (r0 >= r5) goto L19
            int r0 = r4 + 1
            char r0 = r3.charAt(r0)
            if (r0 != r2) goto L19
            int r0 = r4 + 2
            goto L24
        L19:
            int r0 = r4 + 1
            goto L24
        L1c:
            char r0 = r3.charAt(r4)
            if (r0 != r2) goto L25
            int r0 = r4 + 1
        L24:
            return r0
        L25:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected a new line at index "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = ", but was "
            java.lang.StringBuilder r1 = r1.append(r2)
            char r2 = r3.charAt(r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static final int decimalFromHexDigitAt(java.lang.String r4, int r5) {
            char r0 = r4.charAt(r5)
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 > r1) goto L13
            int[] r1 = kotlin.text.HexExtensionsKt.HEX_DIGITS_TO_DECIMAL
            r1 = r1[r0]
            if (r1 < 0) goto L13
            int[] r1 = kotlin.text.HexExtensionsKt.HEX_DIGITS_TO_DECIMAL
            r1 = r1[r0]
            return r1
        L13:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected a hexadecimal digit at index "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = ", but was "
            java.lang.StringBuilder r2 = r2.append(r3)
            char r3 = r4.charAt(r5)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final int formattedStringLength(int r17, int r18, int r19, int r20, int r21, int r22, int r23) {
            r0 = r17
            if (r0 <= 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            if (r2 == 0) goto L75
            int r2 = r0 + (-1)
            int r2 = r2 / r18
            r3 = 0
            int r4 = r18 + (-1)
            int r4 = r4 / r19
            int r5 = r0 % r18
            r6 = 0
            if (r5 != 0) goto L19
            r5 = r18
        L19:
            int r6 = r5 + (-1)
            int r6 = r6 / r19
            int r7 = r2 * r4
            int r7 = r7 + r6
            r3 = r7
            int r4 = r0 + (-1)
            int r4 = r4 - r2
            int r4 = r4 - r3
            long r5 = (long) r2
            long r7 = (long) r3
            r9 = r20
            long r10 = (long) r9
            long r7 = r7 * r10
            long r5 = r5 + r7
            long r7 = (long) r4
            r10 = r21
            long r11 = (long) r10
            long r7 = r7 * r11
            long r5 = r5 + r7
            long r7 = (long) r0
            r11 = r22
            long r12 = (long) r11
            r14 = 2
            long r12 = r12 + r14
            r14 = r23
            r16 = r2
            long r1 = (long) r14
            long r12 = r12 + r1
            long r7 = r7 * r12
            long r5 = r5 + r7
            kotlin.ranges.IntRange r1 = new kotlin.ranges.IntRange
            r2 = 2147483647(0x7fffffff, float:NaN)
            r7 = 0
            r1.<init>(r7, r2)
            kotlin.ranges.ClosedRange r1 = (kotlin.ranges.ClosedRange) r1
            boolean r1 = kotlin.ranges.RangesKt.intRangeContains(r1, r5)
            if (r1 == 0) goto L54
            int r1 = (int) r5
            return r1
        L54:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "The resulting string length is too big: "
            java.lang.StringBuilder r2 = r2.append(r7)
            long r7 = kotlin.ULong.m8843constructorimpl(r5)
            java.lang.String r7 = kotlin.ULong.m8889toStringimpl(r7)
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L75:
            r9 = r20
            r10 = r21
            r11 = r22
            r14 = r23
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Failed requirement."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private static /* synthetic */ void getHEX_DIGITS_TO_DECIMAL$annotations() {
            return
    }

    private static final byte hexToByte(java.lang.String r2, int r3, int r4, kotlin.text.HexFormat r5) {
            r0 = 2
            long r0 = hexToLongImpl(r2, r3, r4, r5, r0)
            int r0 = (int) r0
            byte r0 = (byte) r0
            return r0
    }

    public static final byte hexToByte(java.lang.String r2, kotlin.text.HexFormat r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r2.length()
            byte r0 = hexToByte(r2, r0, r1, r3)
            return r0
    }

    static /* synthetic */ byte hexToByte$default(java.lang.String r0, int r1, int r2, kotlin.text.HexFormat r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            kotlin.text.HexFormat$Companion r3 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r3 = r3.getDefault()
        L17:
            byte r0 = hexToByte(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ byte hexToByte$default(java.lang.String r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            byte r0 = hexToByte(r0, r1)
            return r0
    }

    private static final byte[] hexToByteArray(java.lang.String r19, int r20, int r21, kotlin.text.HexFormat r22) {
            r0 = r19
            r1 = r20
            r2 = r21
            kotlin.collections.AbstractList$Companion r3 = kotlin.collections.AbstractList.Companion
            int r4 = r19.length()
            r3.checkBoundsIndexes$kotlin_stdlib(r1, r2, r4)
            if (r1 != r2) goto L15
            r3 = 0
            byte[] r3 = new byte[r3]
            return r3
        L15:
            kotlin.text.HexFormat$BytesHexFormat r3 = r22.getBytes()
            int r11 = r3.getBytesPerLine()
            int r12 = r3.getBytesPerGroup()
            java.lang.String r13 = r3.getBytePrefix()
            java.lang.String r14 = r3.getByteSuffix()
            java.lang.String r15 = r3.getByteSeparator()
            java.lang.String r10 = r3.getGroupSeparator()
            int r4 = r2 - r1
            int r7 = r10.length()
            int r8 = r15.length()
            int r9 = r13.length()
            int r16 = r14.length()
            r5 = r11
            r6 = r12
            r1 = r10
            r10 = r16
            int r4 = parsedByteArrayMaxSize(r4, r5, r6, r7, r8, r9, r10)
            byte[] r5 = new byte[r4]
            r6 = r20
            r7 = 0
            r8 = 0
            r9 = 0
        L55:
            if (r6 >= r2) goto Lab
            if (r8 != r11) goto L60
            int r6 = checkNewLineAt(r0, r6, r2)
            r8 = 0
            r9 = 0
            goto L72
        L60:
            if (r9 != r12) goto L6a
            java.lang.String r10 = "group separator"
            int r6 = checkContainsAt(r0, r1, r6, r2, r10)
            r9 = 0
            goto L72
        L6a:
            if (r9 == 0) goto L72
            java.lang.String r10 = "byte separator"
            int r6 = checkContainsAt(r0, r15, r6, r2, r10)
        L72:
            r10 = 1
            int r8 = r8 + r10
            int r9 = r9 + r10
            java.lang.String r10 = "byte prefix"
            int r6 = checkContainsAt(r0, r13, r6, r2, r10)
            int r10 = r6 + 2
            int r10 = kotlin.ranges.RangesKt.coerceAtMost(r10, r2)
            r17 = r1
            r1 = 2
            r18 = r3
            r3 = 1
            checkHexLength(r0, r6, r10, r1, r3)
            int r1 = r7 + 1
            int r3 = r6 + 1
            int r6 = decimalFromHexDigitAt(r0, r6)
            int r6 = r6 << 4
            int r10 = r3 + 1
            int r3 = decimalFromHexDigitAt(r0, r3)
            r3 = r3 | r6
            byte r3 = (byte) r3
            r5[r7] = r3
            java.lang.String r3 = "byte suffix"
            int r6 = checkContainsAt(r0, r14, r10, r2, r3)
            r7 = r1
            r1 = r17
            r3 = r18
            goto L55
        Lab:
            r17 = r1
            r18 = r3
            int r1 = r5.length
            if (r7 != r1) goto Lb4
            r1 = r5
            goto Lbd
        Lb4:
            byte[] r1 = java.util.Arrays.copyOf(r5, r7)
            java.lang.String r3 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
        Lbd:
            return r1
    }

    public static final byte[] hexToByteArray(java.lang.String r2, kotlin.text.HexFormat r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r2.length()
            byte[] r0 = hexToByteArray(r2, r0, r1, r3)
            return r0
    }

    static /* synthetic */ byte[] hexToByteArray$default(java.lang.String r0, int r1, int r2, kotlin.text.HexFormat r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            kotlin.text.HexFormat$Companion r3 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r3 = r3.getDefault()
        L17:
            byte[] r0 = hexToByteArray(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ byte[] hexToByteArray$default(java.lang.String r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            byte[] r0 = hexToByteArray(r0, r1)
            return r0
    }

    private static final int hexToInt(java.lang.String r2, int r3, int r4, kotlin.text.HexFormat r5) {
            r0 = 8
            long r0 = hexToLongImpl(r2, r3, r4, r5, r0)
            int r0 = (int) r0
            return r0
    }

    public static final int hexToInt(java.lang.String r2, kotlin.text.HexFormat r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r2.length()
            int r0 = hexToInt(r2, r0, r1, r3)
            return r0
    }

    static /* synthetic */ int hexToInt$default(java.lang.String r0, int r1, int r2, kotlin.text.HexFormat r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            kotlin.text.HexFormat$Companion r3 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r3 = r3.getDefault()
        L17:
            int r0 = hexToInt(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int hexToInt$default(java.lang.String r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            int r0 = hexToInt(r0, r1)
            return r0
    }

    private static final long hexToLong(java.lang.String r2, int r3, int r4, kotlin.text.HexFormat r5) {
            r0 = 16
            long r0 = hexToLongImpl(r2, r3, r4, r5, r0)
            return r0
    }

    public static final long hexToLong(java.lang.String r2, kotlin.text.HexFormat r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r2.length()
            long r0 = hexToLong(r2, r0, r1, r3)
            return r0
    }

    static /* synthetic */ long hexToLong$default(java.lang.String r0, int r1, int r2, kotlin.text.HexFormat r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            kotlin.text.HexFormat$Companion r3 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r3 = r3.getDefault()
        L17:
            long r0 = hexToLong(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ long hexToLong$default(java.lang.String r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            long r0 = hexToLong(r0, r1)
            return r0
    }

    private static final long hexToLongImpl(java.lang.String r11, int r12, int r13, kotlin.text.HexFormat r14, int r15) {
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r11.length()
            r0.checkBoundsIndexes$kotlin_stdlib(r12, r13, r1)
            kotlin.text.HexFormat$NumberHexFormat r0 = r14.getNumber()
            java.lang.String r0 = r0.getPrefix()
            kotlin.text.HexFormat$NumberHexFormat r1 = r14.getNumber()
            java.lang.String r1 = r1.getSuffix()
            int r2 = r0.length()
            int r3 = r1.length()
            int r2 = r2 + r3
            int r3 = r13 - r12
            if (r2 >= r3) goto L4e
            java.lang.String r2 = "prefix"
            int r2 = checkContainsAt(r11, r0, r12, r13, r2)
            int r3 = r1.length()
            int r3 = r13 - r3
            java.lang.String r4 = "suffix"
            checkContainsAt(r11, r1, r3, r13, r4)
            r4 = 0
            checkHexLength(r11, r2, r3, r15, r4)
            r4 = 0
            r6 = r2
        L3e:
            if (r6 >= r3) goto L4d
            r7 = 4
            long r7 = r4 << r7
            int r9 = decimalFromHexDigitAt(r11, r6)
            long r9 = (long) r9
            long r4 = r7 | r9
            int r6 = r6 + 1
            goto L3e
        L4d:
            return r4
        L4e:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Expected a hexadecimal number with prefix \""
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r4 = "\" and suffix \""
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r4 = "\", but was "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11, r4)
            java.lang.String r4 = r11.substring(r12, r13)
            java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    static /* synthetic */ long hexToLongImpl$default(java.lang.String r0, int r1, int r2, kotlin.text.HexFormat r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L5
            r1 = 0
        L5:
            r5 = r5 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            long r0 = hexToLongImpl(r0, r1, r2, r3, r4)
            return r0
    }

    private static final short hexToShort(java.lang.String r2, int r3, int r4, kotlin.text.HexFormat r5) {
            r0 = 4
            long r0 = hexToLongImpl(r2, r3, r4, r5, r0)
            int r0 = (int) r0
            short r0 = (short) r0
            return r0
    }

    public static final short hexToShort(java.lang.String r2, kotlin.text.HexFormat r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r2.length()
            short r0 = hexToShort(r2, r0, r1, r3)
            return r0
    }

    static /* synthetic */ short hexToShort$default(java.lang.String r0, int r1, int r2, kotlin.text.HexFormat r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            kotlin.text.HexFormat$Companion r3 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r3 = r3.getDefault()
        L17:
            short r0 = hexToShort(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ short hexToShort$default(java.lang.String r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            short r0 = hexToShort(r0, r1)
            return r0
    }

    public static final int parsedByteArrayMaxSize(int r22, int r23, int r24, int r25, int r26, int r27, int r28) {
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            if (r0 <= 0) goto Le
            r7 = 1
            goto Lf
        Le:
            r7 = 0
        Lf:
            if (r7 == 0) goto L74
            r7 = r27
            long r8 = (long) r7
            r10 = 2
            long r8 = r8 + r10
            r10 = r28
            long r11 = (long) r10
            long r8 = r8 + r11
            long r11 = charsPerSet(r8, r2, r4)
            if (r1 > r2) goto L26
            long r13 = charsPerSet(r8, r1, r4)
            goto L38
        L26:
            int r13 = r1 / r2
            long r14 = charsPerSet(r11, r13, r3)
            int r5 = r1 % r2
            if (r5 == 0) goto L37
            long r6 = (long) r3
            long r14 = r14 + r6
            long r6 = charsPerSet(r8, r5, r4)
            long r14 = r14 + r6
        L37:
            r13 = r14
        L38:
            r5 = r13
            long r13 = (long) r0
            r7 = 1
            long r16 = wholeElementsPerSet(r13, r5, r7)
            r18 = 1
            long r18 = r5 + r18
            long r18 = r18 * r16
            long r13 = r13 - r18
            long r18 = wholeElementsPerSet(r13, r11, r3)
            r20 = r8
            long r7 = (long) r3
            long r7 = r7 + r11
            long r7 = r7 * r18
            long r13 = r13 - r7
            r7 = r20
            long r20 = wholeElementsPerSet(r13, r7, r4)
            long r9 = (long) r4
            long r9 = r9 + r7
            long r9 = r9 * r20
            long r13 = r13 - r9
            r9 = 0
            int r9 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r9 <= 0) goto L65
            r15 = 1
            goto L66
        L65:
            r15 = 0
        L66:
            r9 = r15
            long r3 = (long) r1
            long r3 = r3 * r16
            long r0 = (long) r2
            long r0 = r0 * r18
            long r3 = r3 + r0
            long r3 = r3 + r20
            long r0 = (long) r9
            long r3 = r3 + r0
            int r0 = (int) r3
            return r0
        L74:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final java.lang.String toHexString(byte r3, kotlin.text.HexFormat r4) {
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r0 = (long) r3
            r2 = 8
            java.lang.String r0 = toHexStringImpl(r0, r4, r2)
            return r0
    }

    public static final java.lang.String toHexString(int r3, kotlin.text.HexFormat r4) {
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r0 = (long) r3
            r2 = 32
            java.lang.String r0 = toHexStringImpl(r0, r4, r2)
            return r0
    }

    public static final java.lang.String toHexString(long r1, kotlin.text.HexFormat r3) {
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 64
            java.lang.String r0 = toHexStringImpl(r1, r3, r0)
            return r0
    }

    public static final java.lang.String toHexString(short r3, kotlin.text.HexFormat r4) {
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r0 = (long) r3
            r2 = 16
            java.lang.String r0 = toHexStringImpl(r0, r4, r2)
            return r0
    }

    public static final java.lang.String toHexString(byte[] r19, int r20, int r21, kotlin.text.HexFormat r22) {
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "format"
            r4 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            kotlin.collections.AbstractList$Companion r3 = kotlin.collections.AbstractList.Companion
            int r5 = r0.length
            r3.checkBoundsIndexes$kotlin_stdlib(r1, r2, r5)
            if (r1 != r2) goto L1d
            java.lang.String r3 = ""
            return r3
        L1d:
            boolean r3 = r22.getUpperCase()
            if (r3 == 0) goto L26
            java.lang.String r3 = "0123456789ABCDEF"
            goto L28
        L26:
            java.lang.String r3 = "0123456789abcdef"
        L28:
            kotlin.text.HexFormat$BytesHexFormat r5 = r22.getBytes()
            int r13 = r5.getBytesPerLine()
            int r14 = r5.getBytesPerGroup()
            java.lang.String r15 = r5.getBytePrefix()
            java.lang.String r12 = r5.getByteSuffix()
            java.lang.String r11 = r5.getByteSeparator()
            java.lang.String r10 = r5.getGroupSeparator()
            int r6 = r2 - r1
            int r9 = r10.length()
            int r16 = r11.length()
            int r17 = r15.length()
            int r18 = r12.length()
            r7 = r13
            r8 = r14
            r1 = r10
            r10 = r16
            r4 = r11
            r11 = r17
            r16 = r5
            r5 = r12
            r12 = r18
            int r6 = formattedStringLength(r6, r7, r8, r9, r10, r11, r12)
            r7 = 0
            r8 = 0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r6)
            r10 = r9
            r11 = 0
            r12 = r20
        L74:
            r17 = 1
            if (r12 >= r2) goto Lb4
            r2 = r0[r12]
            r2 = r2 & 255(0xff, float:3.57E-43)
            if (r7 != r13) goto L86
            r0 = 10
            r10.append(r0)
            r7 = 0
            r8 = 0
            goto L8c
        L86:
            if (r8 != r14) goto L8c
            r10.append(r1)
            r8 = 0
        L8c:
            if (r8 == 0) goto L91
            r10.append(r4)
        L91:
            r10.append(r15)
            int r0 = r2 >> 4
            char r0 = r3.charAt(r0)
            r10.append(r0)
            r0 = r2 & 15
            char r0 = r3.charAt(r0)
            r10.append(r0)
            r10.append(r5)
            int r8 = r8 + 1
            int r7 = r7 + 1
            int r12 = r12 + 1
            r0 = r19
            r2 = r21
            goto L74
        Lb4:
            int r0 = r10.length()
            if (r6 != r0) goto Lbb
            goto Lbd
        Lbb:
            r17 = 0
        Lbd:
            if (r17 == 0) goto Lca
        Lc0:
            java.lang.String r0 = r9.toString()
            java.lang.String r2 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            return r0
        Lca:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Check failed."
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    public static final java.lang.String toHexString(byte[] r2, kotlin.text.HexFormat r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r2.length
            java.lang.String r0 = toHexString(r2, r0, r1, r3)
            return r0
    }

    public static /* synthetic */ java.lang.String toHexString$default(byte r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            java.lang.String r0 = toHexString(r0, r1)
            return r0
    }

    public static /* synthetic */ java.lang.String toHexString$default(int r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            java.lang.String r0 = toHexString(r0, r1)
            return r0
    }

    public static /* synthetic */ java.lang.String toHexString$default(long r0, kotlin.text.HexFormat r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlin.text.HexFormat$Companion r2 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r2 = r2.getDefault()
        La:
            java.lang.String r0 = toHexString(r0, r2)
            return r0
    }

    public static /* synthetic */ java.lang.String toHexString$default(short r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            java.lang.String r0 = toHexString(r0, r1)
            return r0
    }

    public static /* synthetic */ java.lang.String toHexString$default(byte[] r0, int r1, int r2, kotlin.text.HexFormat r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto La
            int r2 = r0.length
        La:
            r4 = r4 & 4
            if (r4 == 0) goto L14
            kotlin.text.HexFormat$Companion r3 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r3 = r3.getDefault()
        L14:
            java.lang.String r0 = toHexString(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.String toHexString$default(byte[] r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            java.lang.String r0 = toHexString(r0, r1)
            return r0
    }

    private static final java.lang.String toHexStringImpl(long r17, kotlin.text.HexFormat r19, int r20) {
            r0 = r20 & 3
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = r2
        L9:
            if (r0 == 0) goto L76
            boolean r0 = r19.getUpperCase()
            if (r0 == 0) goto L14
            java.lang.String r0 = "0123456789ABCDEF"
            goto L16
        L14:
            java.lang.String r0 = "0123456789abcdef"
        L16:
            r3 = r17
            kotlin.text.HexFormat$NumberHexFormat r5 = r19.getNumber()
            java.lang.String r5 = r5.getPrefix()
            kotlin.text.HexFormat$NumberHexFormat r6 = r19.getNumber()
            java.lang.String r6 = r6.getSuffix()
            int r7 = r5.length()
            int r8 = r20 >> 2
            int r7 = r7 + r8
            int r8 = r6.length()
            int r7 = r7 + r8
            r8 = 0
            kotlin.text.HexFormat$NumberHexFormat r9 = r19.getNumber()
            boolean r8 = r9.getRemoveLeadingZeros()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r7)
            r10 = r9
            r11 = 0
            r10.append(r5)
            r12 = r20
        L49:
            if (r12 <= 0) goto L68
            int r12 = r12 + (-4)
            long r13 = r3 >> r12
            r15 = 15
            long r13 = r13 & r15
            int r13 = (int) r13
            if (r8 == 0) goto L5c
            if (r13 != 0) goto L5c
            if (r12 <= 0) goto L5c
            r14 = r1
            goto L5d
        L5c:
            r14 = r2
        L5d:
            r8 = r14
            if (r8 != 0) goto L49
            char r14 = r0.charAt(r13)
            r10.append(r14)
            goto L49
        L68:
            r10.append(r6)
            java.lang.String r1 = r9.toString()
            java.lang.String r2 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        L76:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static final long wholeElementsPerSet(long r4, long r6, int r8) {
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L10
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto Lb
            goto L10
        Lb:
            long r0 = (long) r8
            long r0 = r0 + r4
            long r2 = (long) r8
            long r2 = r2 + r6
            long r0 = r0 / r2
        L10:
            return r0
    }
}
