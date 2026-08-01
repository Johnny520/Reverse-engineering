package okio;

/* JADX INFO: compiled from: Utf8.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000D\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a\u0011\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007H\u0080\b\u001a4\u0010\u0010\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0017\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0018\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0019\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u001a\u001a\u00020\u0016*\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u001c\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a%\u0010\u001d\u001a\u00020\u001e*\u00020\u001b2\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u001f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, m115d2 = {"HIGH_SURROGATE_HEADER", "", "LOG_SURROGATE_HEADER", "MASK_2BYTES", "MASK_3BYTES", "MASK_4BYTES", "REPLACEMENT_BYTE", "", "REPLACEMENT_CHARACTER", "", "REPLACEMENT_CODE_POINT", "isIsoControl", "", "codePoint", "isUtf8Continuation", "byte", "process2Utf8Bytes", "", "beginIndex", "endIndex", "yield", "Lkotlin/Function1;", "", "process3Utf8Bytes", "process4Utf8Bytes", "processUtf16Chars", "processUtf8Bytes", "", "processUtf8CodePoints", "utf8Size", "", "size", "okio"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int r4) {
            r0 = 0
            r1 = 1
            r2 = 0
            if (r4 < 0) goto Lb
            r3 = 32
            if (r4 >= r3) goto Lb
            r3 = r1
            goto Lc
        Lb:
            r3 = r2
        Lc:
            if (r3 != 0) goto L1d
            r3 = 127(0x7f, float:1.78E-43)
            if (r3 > r4) goto L18
            r3 = 160(0xa0, float:2.24E-43)
            if (r4 >= r3) goto L18
            r3 = r1
            goto L19
        L18:
            r3 = r2
        L19:
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r1 = r2
        L1d:
            return r1
    }

    public static final boolean isUtf8Continuation(byte r4) {
            r0 = 0
            r1 = 192(0xc0, float:2.69E-43)
            r2 = r4
            r3 = 0
            r1 = r1 & r2
            r2 = 128(0x80, float:1.8E-43)
            if (r1 != r2) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    public static final int process2Utf8Bytes(byte[] r9, int r10, int r11, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "yield"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            int r1 = r10 + 1
            r2 = 65533(0xfffd, float:9.1831E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            if (r11 > r1) goto L1b
            r12.invoke(r2)
            return r3
        L1b:
            r1 = r9[r10]
            int r4 = r10 + 1
            r4 = r9[r4]
            r5 = 0
            r6 = 192(0xc0, float:2.69E-43)
            r7 = r4
            r8 = 0
            r6 = r6 & r7
            r7 = 128(0x80, float:1.8E-43)
            if (r6 != r7) goto L2d
            r6 = r3
            goto L2e
        L2d:
            r6 = 0
        L2e:
            if (r6 != 0) goto L34
            r12.invoke(r2)
            return r3
        L34:
            r3 = r4 ^ 3968(0xf80, float:5.56E-42)
            int r5 = r1 << 6
            r3 = r3 ^ r5
            if (r3 >= r7) goto L43
            r12.invoke(r2)
            goto L4a
        L43:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r12.invoke(r2)
        L4a:
            r2 = 2
            return r2
    }

    public static final int process3Utf8Bytes(byte[] r16, int r17, int r18, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r19) {
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "yield"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            r3 = 0
            int r4 = r17 + 2
            r5 = 128(0x80, float:1.8E-43)
            r6 = 0
            r7 = 65533(0xfffd, float:9.1831E-41)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 1
            r9 = 2
            if (r1 > r4) goto L3a
            r2.invoke(r7)
            int r4 = r17 + 1
            if (r1 <= r4) goto L39
            int r4 = r17 + 1
            r4 = r0[r4]
            r7 = 0
            r10 = 192(0xc0, float:2.69E-43)
            r11 = r4
            r12 = 0
            r10 = r10 & r11
            if (r10 != r5) goto L35
            r6 = r8
        L35:
            if (r6 != 0) goto L38
            goto L39
        L38:
            return r9
        L39:
            return r8
        L3a:
            r4 = r0[r17]
            int r10 = r17 + 1
            r10 = r0[r10]
            r11 = 0
            r12 = 192(0xc0, float:2.69E-43)
            r13 = r10
            r14 = 0
            r12 = r12 & r13
            if (r12 != r5) goto L4a
            r11 = r8
            goto L4b
        L4a:
            r11 = r6
        L4b:
            if (r11 != 0) goto L51
            r2.invoke(r7)
            return r8
        L51:
            int r11 = r17 + 2
            r11 = r0[r11]
            r12 = 0
            r13 = 192(0xc0, float:2.69E-43)
            r14 = r11
            r15 = 0
            r13 = r13 & r14
            if (r13 != r5) goto L5f
            r5 = r8
            goto L60
        L5f:
            r5 = r6
        L60:
            if (r5 != 0) goto L66
            r2.invoke(r7)
            return r9
        L66:
            r5 = -123008(0xfffffffffffe1f80, float:NaN)
            r5 = r5 ^ r11
            int r9 = r10 << 6
            r5 = r5 ^ r9
            int r9 = r4 << 12
            r5 = r5 ^ r9
            r9 = 2048(0x800, float:2.87E-42)
            if (r5 >= r9) goto L7c
            r2.invoke(r7)
            goto L94
        L7c:
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r9 > r5) goto L87
            r9 = 57344(0xe000, float:8.0356E-41)
            if (r5 >= r9) goto L87
            r6 = r8
        L87:
            if (r6 == 0) goto L8d
            r2.invoke(r7)
            goto L94
        L8d:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r2.invoke(r6)
        L94:
            r6 = 3
            return r6
    }

    public static final int process4Utf8Bytes(byte[] r17, int r18, int r19, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r20) {
            r0 = r17
            r1 = r19
            r2 = r20
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "yield"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            r3 = 0
            int r4 = r18 + 3
            r5 = 2
            r6 = 128(0x80, float:1.8E-43)
            r7 = 0
            r8 = 65533(0xfffd, float:9.1831E-41)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 1
            r10 = 3
            if (r1 > r4) goto L52
            r2.invoke(r8)
            int r4 = r18 + 1
            if (r1 <= r4) goto L51
            int r4 = r18 + 1
            r4 = r0[r4]
            r8 = 0
            r11 = 192(0xc0, float:2.69E-43)
            r12 = r4
            r13 = 0
            r11 = r11 & r12
            if (r11 != r6) goto L37
            r4 = r9
            goto L38
        L37:
            r4 = r7
        L38:
            if (r4 != 0) goto L3b
            goto L51
        L3b:
            int r4 = r18 + 2
            if (r1 <= r4) goto L50
            int r4 = r18 + 2
            r4 = r0[r4]
            r8 = 0
            r11 = 192(0xc0, float:2.69E-43)
            r12 = r4
            r13 = 0
            r11 = r11 & r12
            if (r11 != r6) goto L4c
            r7 = r9
        L4c:
            if (r7 != 0) goto L4f
            goto L50
        L4f:
            return r10
        L50:
            return r5
        L51:
            return r9
        L52:
            r4 = r0[r18]
            int r11 = r18 + 1
            r11 = r0[r11]
            r12 = 0
            r13 = 192(0xc0, float:2.69E-43)
            r14 = r11
            r15 = 0
            r13 = r13 & r14
            if (r13 != r6) goto L62
            r12 = r9
            goto L63
        L62:
            r12 = r7
        L63:
            if (r12 != 0) goto L69
            r2.invoke(r8)
            return r9
        L69:
            int r12 = r18 + 2
            r12 = r0[r12]
            r13 = 0
            r14 = 192(0xc0, float:2.69E-43)
            r15 = r12
            r16 = 0
            r14 = r14 & r15
            if (r14 != r6) goto L78
            r13 = r9
            goto L79
        L78:
            r13 = r7
        L79:
            if (r13 != 0) goto L7f
            r2.invoke(r8)
            return r5
        L7f:
            int r5 = r18 + 3
            r5 = r0[r5]
            r13 = 0
            r14 = 192(0xc0, float:2.69E-43)
            r15 = r5
            r16 = 0
            r14 = r14 & r15
            if (r14 != r6) goto L8e
            r6 = r9
            goto L8f
        L8e:
            r6 = r7
        L8f:
            if (r6 != 0) goto L95
            r2.invoke(r8)
            return r10
        L95:
            r6 = 3678080(0x381f80, float:5.154088E-39)
            r6 = r6 ^ r5
            int r10 = r12 << 6
            r6 = r6 ^ r10
            int r10 = r11 << 12
            r6 = r6 ^ r10
            int r10 = r4 << 18
            r6 = r6 ^ r10
            r10 = 1114111(0x10ffff, float:1.561202E-39)
            if (r6 <= r10) goto Laf
            r2.invoke(r8)
            goto Lcf
        Laf:
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r10 > r6) goto Lba
            r10 = 57344(0xe000, float:8.0356E-41)
            if (r6 >= r10) goto Lba
            r7 = r9
        Lba:
            if (r7 == 0) goto Lc0
            r2.invoke(r8)
            goto Lcf
        Lc0:
            r7 = 65536(0x10000, float:9.1835E-41)
            if (r6 >= r7) goto Lc8
            r2.invoke(r8)
            goto Lcf
        Lc8:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r2.invoke(r7)
        Lcf:
            r7 = 4
            return r7
    }

    public static final void processUtf16Chars(byte[] r24, int r25, int r26, kotlin.jvm.functions.Function1<? super java.lang.Character, kotlin.Unit> r27) {
            r0 = r24
            r1 = r26
            r2 = r27
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "yield"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            r3 = 0
            r4 = r25
        L13:
            if (r4 >= r1) goto L39a
            r5 = r0[r4]
            if (r5 < 0) goto L38
            char r6 = (char) r5
            java.lang.Character r6 = java.lang.Character.valueOf(r6)
            r2.invoke(r6)
            int r4 = r4 + 1
        L24:
            if (r4 >= r1) goto L13
            r6 = r0[r4]
            if (r6 < 0) goto L13
            int r6 = r4 + 1
            r4 = r0[r4]
            char r4 = (char) r4
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.invoke(r4)
            r4 = r6
            goto L24
        L38:
            r6 = 5
            r7 = r5
            r8 = 0
            int r6 = r7 >> r6
            r7 = -2
            r8 = 128(0x80, float:1.8E-43)
            if (r6 != r7) goto Lac
            r6 = r24
            r7 = 0
            int r12 = r4 + 1
            if (r1 > r12) goto L5a
            r8 = 65533(0xfffd, float:9.1831E-41)
            r9 = 0
            char r10 = (char) r8
            java.lang.Character r10 = java.lang.Character.valueOf(r10)
            r2.invoke(r10)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            r9 = 1
            goto La9
        L5a:
            r12 = r6[r4]
            int r13 = r4 + 1
            r13 = r6[r13]
            r14 = 0
            r15 = 192(0xc0, float:2.69E-43)
            r16 = r13
            r17 = 0
            r15 = r16 & r15
            if (r15 != r8) goto L6d
            r10 = 1
            goto L6e
        L6d:
            r10 = 0
        L6e:
            if (r10 != 0) goto L81
            r8 = 65533(0xfffd, float:9.1831E-41)
            r9 = 0
            char r10 = (char) r8
            java.lang.Character r10 = java.lang.Character.valueOf(r10)
            r2.invoke(r10)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            r9 = 1
            goto La9
        L81:
            r10 = r13 ^ 3968(0xf80, float:5.56E-42)
            int r11 = r12 << 6
            r10 = r10 ^ r11
            if (r10 >= r8) goto L9b
            r8 = 65533(0xfffd, float:9.1831E-41)
            r11 = 0
            char r14 = (char) r8
            java.lang.Character r14 = java.lang.Character.valueOf(r14)
            r2.invoke(r14)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            goto La8
        L9b:
            r8 = r10
            r11 = 0
            char r14 = (char) r8
            java.lang.Character r14 = java.lang.Character.valueOf(r14)
            r2.invoke(r14)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
        La8:
            r9 = 2
        La9:
            int r4 = r4 + r9
            goto L13
        Lac:
            r6 = 4
            r12 = r5
            r13 = 0
            int r6 = r12 >> r6
            r12 = 57344(0xe000, float:8.0356E-41)
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r6 != r7) goto L185
            r6 = r24
            r7 = 0
            int r15 = r4 + 2
            if (r1 > r15) goto Lec
            r12 = 65533(0xfffd, float:9.1831E-41)
            r13 = 0
            char r14 = (char) r12
            java.lang.Character r14 = java.lang.Character.valueOf(r14)
            r2.invoke(r14)
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            int r12 = r4 + 1
            if (r1 <= r12) goto Le9
            int r12 = r4 + 1
            r12 = r6[r12]
            r13 = 0
            r14 = 192(0xc0, float:2.69E-43)
            r15 = r12
            r16 = 0
            r14 = r14 & r15
            if (r14 != r8) goto Le2
            r10 = 1
            goto Le3
        Le2:
            r10 = 0
        Le3:
            if (r10 != 0) goto Le6
            goto Le9
        Le6:
            r9 = 2
            goto L182
        Le9:
            r9 = 1
            goto L182
        Lec:
            r15 = r6[r4]
            int r16 = r4 + 1
            r16 = r6[r16]
            r17 = 0
            r18 = 192(0xc0, float:2.69E-43)
            r19 = r16
            r20 = 0
            r9 = r19 & r18
            if (r9 != r8) goto L100
            r9 = 1
            goto L101
        L100:
            r9 = 0
        L101:
            if (r9 != 0) goto L115
            r8 = 65533(0xfffd, float:9.1831E-41)
            r9 = 0
            char r10 = (char) r8
            java.lang.Character r10 = java.lang.Character.valueOf(r10)
            r2.invoke(r10)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            r9 = 1
            goto L182
        L115:
            int r9 = r4 + 2
            r9 = r6[r9]
            r17 = 0
            r18 = 192(0xc0, float:2.69E-43)
            r19 = r9
            r20 = 0
            r10 = r19 & r18
            if (r10 != r8) goto L127
            r8 = 1
            goto L128
        L127:
            r8 = 0
        L128:
            if (r8 != 0) goto L13b
            r8 = 65533(0xfffd, float:9.1831E-41)
            r10 = 0
            char r11 = (char) r8
            java.lang.Character r11 = java.lang.Character.valueOf(r11)
            r2.invoke(r11)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            r9 = 2
            goto L182
        L13b:
            r8 = -123008(0xfffffffffffe1f80, float:NaN)
            r8 = r8 ^ r9
            int r10 = r16 << 6
            r8 = r8 ^ r10
            int r10 = r15 << 12
            r8 = r8 ^ r10
            r10 = 2048(0x800, float:2.87E-42)
            if (r8 >= r10) goto L15c
            r10 = 65533(0xfffd, float:9.1831E-41)
            r11 = 0
            char r12 = (char) r10
            java.lang.Character r12 = java.lang.Character.valueOf(r12)
            r2.invoke(r12)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            goto L181
        L15c:
            if (r13 > r8) goto L162
            if (r8 >= r12) goto L162
            r10 = 1
            goto L163
        L162:
            r10 = 0
        L163:
            if (r10 == 0) goto L174
            r10 = 65533(0xfffd, float:9.1831E-41)
            r11 = 0
            char r12 = (char) r10
            java.lang.Character r12 = java.lang.Character.valueOf(r12)
            r2.invoke(r12)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            goto L181
        L174:
            r10 = r8
            r11 = 0
            char r12 = (char) r10
            java.lang.Character r12 = java.lang.Character.valueOf(r12)
            r2.invoke(r12)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
        L181:
            r9 = 3
        L182:
            int r4 = r4 + r9
            goto L13
        L185:
            r6 = 3
            r9 = r5
            r10 = 0
            int r6 = r9 >> r6
            r9 = 65533(0xfffd, float:9.1831E-41)
            if (r6 != r7) goto L38e
            r6 = r24
            r7 = 0
            int r10 = r4 + 3
            r15 = 56320(0xdc00, float:7.8921E-41)
            r16 = 55232(0xd7c0, float:7.7397E-41)
            if (r1 > r10) goto L1fa
            r10 = 65533(0xfffd, float:9.1831E-41)
            r12 = 0
            if (r10 == r9) goto L1ba
            int r9 = r10 >>> 10
            int r9 = r9 + r16
            char r9 = (char) r9
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            r2.invoke(r9)
            r9 = r10 & 1023(0x3ff, float:1.434E-42)
            int r9 = r9 + r15
            char r9 = (char) r9
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            r2.invoke(r9)
            goto L1c1
        L1ba:
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            r2.invoke(r9)
        L1c1:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            int r9 = r4 + 1
            if (r1 <= r9) goto L1f7
            int r9 = r4 + 1
            r9 = r6[r9]
            r10 = 0
            r12 = 192(0xc0, float:2.69E-43)
            r13 = r9
            r15 = 0
            r12 = r12 & r13
            if (r12 != r8) goto L1d7
            r9 = 1
            goto L1d8
        L1d7:
            r9 = 0
        L1d8:
            if (r9 != 0) goto L1db
            goto L1f7
        L1db:
            int r9 = r4 + 2
            if (r1 <= r9) goto L1f4
            int r9 = r4 + 2
            r9 = r6[r9]
            r10 = 0
            r12 = 192(0xc0, float:2.69E-43)
            r13 = r9
            r15 = 0
            r12 = r12 & r13
            if (r12 != r8) goto L1ed
            r10 = 1
            goto L1ee
        L1ed:
            r10 = 0
        L1ee:
            if (r10 != 0) goto L1f1
            goto L1f4
        L1f1:
            r9 = 3
            goto L38b
        L1f4:
            r9 = 2
            goto L38b
        L1f7:
            r9 = 1
            goto L38b
        L1fa:
            r10 = r6[r4]
            int r17 = r4 + 1
            r17 = r6[r17]
            r18 = 0
            r19 = 192(0xc0, float:2.69E-43)
            r20 = r17
            r23 = 0
            r11 = r20 & r19
            if (r11 != r8) goto L20e
            r11 = 1
            goto L20f
        L20e:
            r11 = 0
        L20f:
            if (r11 != 0) goto L23d
            r8 = 65533(0xfffd, float:9.1831E-41)
            r11 = 0
            if (r8 == r9) goto L22f
            int r9 = r8 >>> 10
            int r9 = r9 + r16
            char r9 = (char) r9
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            r2.invoke(r9)
            r9 = r8 & 1023(0x3ff, float:1.434E-42)
            int r9 = r9 + r15
            char r9 = (char) r9
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            r2.invoke(r9)
            goto L236
        L22f:
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            r2.invoke(r9)
        L236:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            r9 = 1
            goto L38b
        L23d:
            int r11 = r4 + 2
            r11 = r6[r11]
            r18 = 0
            r19 = 192(0xc0, float:2.69E-43)
            r20 = r11
            r23 = 0
            r14 = r20 & r19
            if (r14 != r8) goto L24f
            r14 = 1
            goto L250
        L24f:
            r14 = 0
        L250:
            if (r14 != 0) goto L27e
            r8 = 65533(0xfffd, float:9.1831E-41)
            r12 = 0
            if (r8 == r9) goto L270
            int r9 = r8 >>> 10
            int r9 = r9 + r16
            char r9 = (char) r9
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            r2.invoke(r9)
            r9 = r8 & 1023(0x3ff, float:1.434E-42)
            int r9 = r9 + r15
            char r9 = (char) r9
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            r2.invoke(r9)
            goto L277
        L270:
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            r2.invoke(r9)
        L277:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            r9 = 2
            goto L38b
        L27e:
            int r14 = r4 + 3
            r14 = r6[r14]
            r18 = 0
            r19 = 192(0xc0, float:2.69E-43)
            r20 = r14
            r21 = 0
            r12 = r20 & r19
            if (r12 != r8) goto L290
            r8 = 1
            goto L291
        L290:
            r8 = 0
        L291:
            if (r8 != 0) goto L2bf
            r8 = 65533(0xfffd, float:9.1831E-41)
            r12 = 0
            if (r8 == r9) goto L2b1
            int r9 = r8 >>> 10
            int r9 = r9 + r16
            char r9 = (char) r9
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            r2.invoke(r9)
            r9 = r8 & 1023(0x3ff, float:1.434E-42)
            int r9 = r9 + r15
            char r9 = (char) r9
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            r2.invoke(r9)
            goto L2b8
        L2b1:
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            r2.invoke(r9)
        L2b8:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            r9 = 3
            goto L38b
        L2bf:
            r8 = 3678080(0x381f80, float:5.154088E-39)
            r8 = r8 ^ r14
            int r12 = r11 << 6
            r8 = r8 ^ r12
            int r12 = r17 << 12
            r8 = r8 ^ r12
            int r12 = r10 << 18
            r8 = r8 ^ r12
            r12 = 1114111(0x10ffff, float:1.561202E-39)
            if (r8 <= r12) goto L2ff
            r12 = 65533(0xfffd, float:9.1831E-41)
            r13 = 0
            if (r12 == r9) goto L2f3
            int r9 = r12 >>> 10
            int r9 = r9 + r16
            char r9 = (char) r9
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            r2.invoke(r9)
            r9 = r12 & 1023(0x3ff, float:1.434E-42)
            int r9 = r9 + r15
            char r9 = (char) r9
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            r2.invoke(r9)
            goto L2fa
        L2f3:
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            r2.invoke(r9)
        L2fa:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            goto L38a
        L2ff:
            if (r13 > r8) goto L309
            r12 = 57344(0xe000, float:8.0356E-41)
            if (r8 >= r12) goto L309
            r22 = 1
            goto L30b
        L309:
            r22 = 0
        L30b:
            if (r22 == 0) goto L336
            r12 = 65533(0xfffd, float:9.1831E-41)
            r13 = 0
            if (r12 == r9) goto L32b
            int r9 = r12 >>> 10
            int r9 = r9 + r16
            char r9 = (char) r9
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            r2.invoke(r9)
            r9 = r12 & 1023(0x3ff, float:1.434E-42)
            int r9 = r9 + r15
            char r9 = (char) r9
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            r2.invoke(r9)
            goto L332
        L32b:
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            r2.invoke(r9)
        L332:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            goto L38a
        L336:
            r12 = 65536(0x10000, float:9.1835E-41)
            if (r8 >= r12) goto L363
            r12 = 65533(0xfffd, float:9.1831E-41)
            r13 = 0
            if (r12 == r9) goto L358
            int r9 = r12 >>> 10
            int r9 = r9 + r16
            char r9 = (char) r9
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            r2.invoke(r9)
            r9 = r12 & 1023(0x3ff, float:1.434E-42)
            int r9 = r9 + r15
            char r9 = (char) r9
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            r2.invoke(r9)
            goto L35f
        L358:
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            r2.invoke(r9)
        L35f:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            goto L38a
        L363:
            r12 = r8
            r13 = 0
            if (r12 == r9) goto L37f
            int r9 = r12 >>> 10
            int r9 = r9 + r16
            char r9 = (char) r9
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            r2.invoke(r9)
            r9 = r12 & 1023(0x3ff, float:1.434E-42)
            int r9 = r9 + r15
            char r9 = (char) r9
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            r2.invoke(r9)
            goto L386
        L37f:
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            r2.invoke(r9)
        L386:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
        L38a:
            r9 = 4
        L38b:
            int r4 = r4 + r9
            goto L13
        L38e:
            java.lang.Character r6 = java.lang.Character.valueOf(r9)
            r2.invoke(r6)
            int r4 = r4 + 1
            goto L13
        L39a:
            return
    }

    public static final void processUtf8Bytes(java.lang.String r10, int r11, int r12, kotlin.jvm.functions.Function1<? super java.lang.Byte, kotlin.Unit> r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "yield"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = 0
            r1 = r11
        Lc:
            if (r1 >= r12) goto L109
            char r2 = r10.charAt(r1)
            r3 = 128(0x80, float:1.8E-43)
            int r4 = kotlin.jvm.internal.Intrinsics.compare(r2, r3)
            if (r4 >= 0) goto L41
            byte r4 = (byte) r2
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            r13.invoke(r4)
            int r1 = r1 + 1
        L25:
            if (r1 >= r12) goto Lc
            char r4 = r10.charAt(r1)
            int r4 = kotlin.jvm.internal.Intrinsics.compare(r4, r3)
            if (r4 >= 0) goto Lc
            int r4 = r1 + 1
            char r1 = r10.charAt(r1)
            byte r1 = (byte) r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            r13.invoke(r1)
            r1 = r4
            goto L25
        L41:
            r4 = 2048(0x800, float:2.87E-42)
            int r4 = kotlin.jvm.internal.Intrinsics.compare(r2, r4)
            if (r4 >= 0) goto L63
            int r4 = r2 >> 6
            r4 = r4 | 192(0xc0, float:2.69E-43)
            byte r4 = (byte) r4
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            r13.invoke(r4)
            r4 = r2 & 63
            r3 = r3 | r4
            byte r3 = (byte) r3
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r13.invoke(r3)
            int r1 = r1 + 1
            goto Lc
        L63:
            r4 = 55296(0xd800, float:7.7486E-41)
            r5 = 57344(0xe000, float:8.0356E-41)
            r6 = 0
            r7 = 1
            if (r4 > r2) goto L71
            if (r2 >= r5) goto L71
            r4 = r7
            goto L72
        L71:
            r4 = r6
        L72:
            r8 = 63
            if (r4 != 0) goto L9d
            int r4 = r2 >> 12
            r4 = r4 | 224(0xe0, float:3.14E-43)
            byte r4 = (byte) r4
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            r13.invoke(r4)
            int r4 = r2 >> 6
            r4 = r4 & r8
            r4 = r4 | r3
            byte r4 = (byte) r4
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            r13.invoke(r4)
            r4 = r2 & 63
            r3 = r3 | r4
            byte r3 = (byte) r3
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r13.invoke(r3)
            int r1 = r1 + 1
            goto Lc
        L9d:
            r4 = 56319(0xdbff, float:7.892E-41)
            int r4 = kotlin.jvm.internal.Intrinsics.compare(r2, r4)
            if (r4 > 0) goto Lfe
            int r4 = r1 + 1
            if (r12 <= r4) goto Lfe
            int r4 = r1 + 1
            char r4 = r10.charAt(r4)
            r9 = 56320(0xdc00, float:7.8921E-41)
            if (r9 > r4) goto Lb8
            if (r4 >= r5) goto Lb8
            r6 = r7
        Lb8:
            if (r6 != 0) goto Lbb
            goto Lfe
        Lbb:
            int r4 = r2 << 10
            int r5 = r1 + 1
            char r5 = r10.charAt(r5)
            int r4 = r4 + r5
            r5 = -56613888(0xfffffffffca02400, float:-6.651981E36)
            int r4 = r4 + r5
            int r5 = r4 >> 18
            r5 = r5 | 240(0xf0, float:3.36E-43)
            byte r5 = (byte) r5
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            r13.invoke(r5)
            int r5 = r4 >> 12
            r5 = r5 & r8
            r5 = r5 | r3
            byte r5 = (byte) r5
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            r13.invoke(r5)
            int r5 = r4 >> 6
            r5 = r5 & r8
            r5 = r5 | r3
            byte r5 = (byte) r5
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            r13.invoke(r5)
            r5 = r4 & 63
            r3 = r3 | r5
            byte r3 = (byte) r3
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r13.invoke(r3)
            int r1 = r1 + 2
            goto Lc
        Lfe:
            java.lang.Byte r3 = java.lang.Byte.valueOf(r8)
            r13.invoke(r3)
            int r1 = r1 + 1
            goto Lc
        L109:
            return
    }

    public static final void processUtf8CodePoints(byte[] r22, int r23, int r24, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r25) {
            r0 = r22
            r1 = r24
            r2 = r25
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "yield"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            r3 = 0
            r4 = r23
        L13:
            if (r4 >= r1) goto L2ab
            r5 = r0[r4]
            if (r5 < 0) goto L36
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r2.invoke(r6)
            int r4 = r4 + 1
        L23:
            if (r4 >= r1) goto L13
            r6 = r0[r4]
            if (r6 < 0) goto L13
            int r6 = r4 + 1
            r4 = r0[r4]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.invoke(r4)
            r4 = r6
            goto L23
        L36:
            r6 = 5
            r7 = r5
            r8 = 0
            int r6 = r7 >> r6
            r7 = -2
            r8 = 128(0x80, float:1.8E-43)
            if (r6 != r7) goto La6
            r6 = r22
            r7 = 0
            int r12 = r4 + 1
            if (r1 > r12) goto L57
            r8 = 65533(0xfffd, float:9.1831E-41)
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r2.invoke(r10)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            r9 = 1
            goto La3
        L57:
            r12 = r6[r4]
            int r13 = r4 + 1
            r13 = r6[r13]
            r14 = 0
            r15 = 192(0xc0, float:2.69E-43)
            r16 = r13
            r17 = 0
            r15 = r16 & r15
            if (r15 != r8) goto L6a
            r10 = 1
            goto L6b
        L6a:
            r10 = 0
        L6b:
            if (r10 != 0) goto L7d
            r8 = 65533(0xfffd, float:9.1831E-41)
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r2.invoke(r10)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            r9 = 1
            goto La3
        L7d:
            r10 = r13 ^ 3968(0xf80, float:5.56E-42)
            int r11 = r12 << 6
            r10 = r10 ^ r11
            if (r10 >= r8) goto L96
            r8 = 65533(0xfffd, float:9.1831E-41)
            r11 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            r2.invoke(r14)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            goto La2
        L96:
            r8 = r10
            r11 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            r2.invoke(r14)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
        La2:
            r9 = 2
        La3:
            int r4 = r4 + r9
            goto L13
        La6:
            r6 = 4
            r12 = r5
            r13 = 0
            int r6 = r12 >> r6
            r12 = 57344(0xe000, float:8.0356E-41)
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r6 != r7) goto L178
            r6 = r22
            r7 = 0
            int r15 = r4 + 2
            if (r1 > r15) goto Le5
            r12 = 65533(0xfffd, float:9.1831E-41)
            r13 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            r2.invoke(r14)
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            int r12 = r4 + 1
            if (r1 <= r12) goto Le2
            int r12 = r4 + 1
            r12 = r6[r12]
            r13 = 0
            r14 = 192(0xc0, float:2.69E-43)
            r15 = r12
            r16 = 0
            r14 = r14 & r15
            if (r14 != r8) goto Ldb
            r10 = 1
            goto Ldc
        Ldb:
            r10 = 0
        Ldc:
            if (r10 != 0) goto Ldf
            goto Le2
        Ldf:
            r9 = 2
            goto L175
        Le2:
            r9 = 1
            goto L175
        Le5:
            r15 = r6[r4]
            int r16 = r4 + 1
            r16 = r6[r16]
            r17 = 0
            r18 = 192(0xc0, float:2.69E-43)
            r19 = r16
            r20 = 0
            r9 = r19 & r18
            if (r9 != r8) goto Lf9
            r9 = 1
            goto Lfa
        Lf9:
            r9 = 0
        Lfa:
            if (r9 != 0) goto L10c
            r8 = 65533(0xfffd, float:9.1831E-41)
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r2.invoke(r10)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            r9 = 1
            goto L175
        L10c:
            int r9 = r4 + 2
            r9 = r6[r9]
            r17 = 0
            r18 = 192(0xc0, float:2.69E-43)
            r19 = r9
            r20 = 0
            r10 = r19 & r18
            if (r10 != r8) goto L11e
            r8 = 1
            goto L11f
        L11e:
            r8 = 0
        L11f:
            if (r8 != 0) goto L131
            r8 = 65533(0xfffd, float:9.1831E-41)
            r10 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r2.invoke(r11)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            r9 = 2
            goto L175
        L131:
            r8 = -123008(0xfffffffffffe1f80, float:NaN)
            r8 = r8 ^ r9
            int r10 = r16 << 6
            r8 = r8 ^ r10
            int r10 = r15 << 12
            r8 = r8 ^ r10
            r10 = 2048(0x800, float:2.87E-42)
            if (r8 >= r10) goto L151
            r10 = 65533(0xfffd, float:9.1831E-41)
            r11 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            r2.invoke(r12)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            goto L174
        L151:
            if (r13 > r8) goto L157
            if (r8 >= r12) goto L157
            r10 = 1
            goto L158
        L157:
            r10 = 0
        L158:
            if (r10 == 0) goto L168
            r10 = 65533(0xfffd, float:9.1831E-41)
            r11 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            r2.invoke(r12)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            goto L174
        L168:
            r10 = r8
            r11 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            r2.invoke(r12)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
        L174:
            r9 = 3
        L175:
            int r4 = r4 + r9
            goto L13
        L178:
            r6 = 3
            r9 = r5
            r10 = 0
            int r6 = r9 >> r6
            if (r6 != r7) goto L29c
            r6 = r22
            r7 = 0
            int r9 = r4 + 3
            if (r1 > r9) goto L1c9
            r9 = 65533(0xfffd, float:9.1831E-41)
            r10 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            r2.invoke(r12)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            int r9 = r4 + 1
            if (r1 <= r9) goto L1c6
            int r9 = r4 + 1
            r9 = r6[r9]
            r10 = 0
            r12 = 192(0xc0, float:2.69E-43)
            r13 = r9
            r15 = 0
            r12 = r12 & r13
            if (r12 != r8) goto L1a6
            r9 = 1
            goto L1a7
        L1a6:
            r9 = 0
        L1a7:
            if (r9 != 0) goto L1aa
            goto L1c6
        L1aa:
            int r9 = r4 + 2
            if (r1 <= r9) goto L1c3
            int r9 = r4 + 2
            r9 = r6[r9]
            r10 = 0
            r12 = 192(0xc0, float:2.69E-43)
            r13 = r9
            r15 = 0
            r12 = r12 & r13
            if (r12 != r8) goto L1bc
            r10 = 1
            goto L1bd
        L1bc:
            r10 = 0
        L1bd:
            if (r10 != 0) goto L1c0
            goto L1c3
        L1c0:
            r9 = 3
            goto L299
        L1c3:
            r9 = 2
            goto L299
        L1c6:
            r9 = 1
            goto L299
        L1c9:
            r9 = r6[r4]
            int r10 = r4 + 1
            r10 = r6[r10]
            r15 = 0
            r16 = 192(0xc0, float:2.69E-43)
            r17 = r10
            r18 = 0
            r11 = r17 & r16
            if (r11 != r8) goto L1dc
            r11 = 1
            goto L1dd
        L1dc:
            r11 = 0
        L1dd:
            if (r11 != 0) goto L1f0
            r8 = 65533(0xfffd, float:9.1831E-41)
            r11 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            r2.invoke(r12)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            r9 = 1
            goto L299
        L1f0:
            int r11 = r4 + 2
            r11 = r6[r11]
            r15 = 0
            r16 = 192(0xc0, float:2.69E-43)
            r17 = r11
            r18 = 0
            r14 = r17 & r16
            if (r14 != r8) goto L201
            r14 = 1
            goto L202
        L201:
            r14 = 0
        L202:
            if (r14 != 0) goto L215
            r8 = 65533(0xfffd, float:9.1831E-41)
            r12 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r2.invoke(r13)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            r9 = 2
            goto L299
        L215:
            int r14 = r4 + 3
            r14 = r6[r14]
            r15 = 0
            r16 = 192(0xc0, float:2.69E-43)
            r17 = r14
            r18 = 0
            r12 = r17 & r16
            if (r12 != r8) goto L226
            r8 = 1
            goto L227
        L226:
            r8 = 0
        L227:
            if (r8 != 0) goto L239
            r8 = 65533(0xfffd, float:9.1831E-41)
            r12 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r2.invoke(r13)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            r9 = 3
            goto L299
        L239:
            r8 = 3678080(0x381f80, float:5.154088E-39)
            r8 = r8 ^ r14
            int r12 = r11 << 6
            r8 = r8 ^ r12
            int r12 = r10 << 12
            r8 = r8 ^ r12
            int r12 = r9 << 18
            r8 = r8 ^ r12
            r12 = 1114111(0x10ffff, float:1.561202E-39)
            if (r8 <= r12) goto L25d
            r12 = 65533(0xfffd, float:9.1831E-41)
            r13 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            r2.invoke(r15)
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            goto L297
        L25d:
            if (r13 > r8) goto L267
            r12 = 57344(0xe000, float:8.0356E-41)
            if (r8 >= r12) goto L267
            r21 = 1
            goto L269
        L267:
            r21 = 0
        L269:
            if (r21 == 0) goto L279
            r12 = 65533(0xfffd, float:9.1831E-41)
            r13 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            r2.invoke(r15)
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            goto L297
        L279:
            r12 = 65536(0x10000, float:9.1835E-41)
            if (r8 >= r12) goto L28b
            r12 = 65533(0xfffd, float:9.1831E-41)
            r13 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            r2.invoke(r15)
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            goto L297
        L28b:
            r12 = r8
            r13 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            r2.invoke(r15)
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
        L297:
            r12 = 4
            r9 = r12
        L299:
            int r4 = r4 + r9
            goto L13
        L29c:
            r6 = 65533(0xfffd, float:9.1831E-41)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2.invoke(r6)
            int r4 = r4 + 1
            goto L13
        L2ab:
            return
    }

    public static final long size(java.lang.String r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 3
            r1 = 0
            r2 = 0
            long r0 = size$default(r3, r2, r2, r0, r1)
            return r0
    }

    public static final long size(java.lang.String r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            long r0 = size$default(r3, r4, r2, r0, r1)
            return r0
    }

    public static final long size(java.lang.String r10, int r11, int r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            r1 = 1
            if (r11 < 0) goto Lb
            r2 = r1
            goto Lc
        Lb:
            r2 = r0
        Lc:
            if (r2 == 0) goto Lc6
            if (r12 < r11) goto L12
            r2 = r1
            goto L13
        L12:
            r2 = r0
        L13:
            if (r2 == 0) goto L9e
            int r2 = r10.length()
            if (r12 > r2) goto L1c
            goto L1d
        L1c:
            r1 = r0
        L1d:
            if (r1 == 0) goto L72
            r1 = 0
            r3 = r11
        L22:
            if (r3 >= r12) goto L71
            char r4 = r10.charAt(r3)
            r5 = 128(0x80, float:1.8E-43)
            r6 = 1
            if (r4 >= r5) goto L32
            long r1 = r1 + r6
            int r3 = r3 + 1
            goto L22
        L32:
            r5 = 2048(0x800, float:2.87E-42)
            if (r4 >= r5) goto L3c
            r5 = 2
            long r5 = (long) r5
            long r1 = r1 + r5
            int r3 = r3 + 1
            goto L22
        L3c:
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L6b
            r5 = 57343(0xdfff, float:8.0355E-41)
            if (r4 <= r5) goto L47
            goto L6b
        L47:
            int r8 = r3 + 1
            if (r8 >= r12) goto L52
            int r8 = r3 + 1
            char r8 = r10.charAt(r8)
            goto L53
        L52:
            r8 = r0
        L53:
            r9 = 56319(0xdbff, float:7.892E-41)
            if (r4 > r9) goto L67
            r9 = 56320(0xdc00, float:7.8921E-41)
            if (r8 < r9) goto L67
            if (r8 <= r5) goto L60
            goto L67
        L60:
            r5 = 4
            long r5 = (long) r5
            long r1 = r1 + r5
            int r3 = r3 + 2
            goto L22
        L67:
            long r1 = r1 + r6
            int r3 = r3 + 1
            goto L22
        L6b:
            r5 = 3
            long r5 = (long) r5
            long r1 = r1 + r5
            int r3 = r3 + 1
            goto L22
        L71:
            return r1
        L72:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "endIndex > string.length: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r2 = " > "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r10.length()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L9e:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "endIndex < beginIndex: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r2 = " < "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        Lc6:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "beginIndex < 0: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
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
