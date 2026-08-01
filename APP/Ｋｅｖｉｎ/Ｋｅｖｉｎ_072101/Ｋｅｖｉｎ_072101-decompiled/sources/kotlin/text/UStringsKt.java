package kotlin.text;

/* JADX INFO: compiled from: UStrings.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0010\u001a\u00020\u0002*\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a\u001c\u0010\u0010\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0007ø\u0001\u0000\u001a\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000\u001a\u0014\u0010\u0014\u001a\u00020\u0007*\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\u001c\u0010\u0014\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0007*\u00020\u0001H\u0007ø\u0001\u0000\u001a\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000\u001a\u0014\u0010\u0018\u001a\u00020\n*\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001a\u001c\u0010\u0018\u001a\u00020\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001a\u0011\u0010\u001b\u001a\u0004\u0018\u00010\n*\u00020\u0001H\u0007ø\u0001\u0000\u001a\u0019\u0010\u001b\u001a\u0004\u0018\u00010\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000\u001a\u0014\u0010\u001c\u001a\u00020\r*\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001d\u001a\u001c\u0010\u001c\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a\u0011\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u0001H\u0007ø\u0001\u0000\u001a\u0019\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, m115d2 = {"toString", "", "Lkotlin/UByte;", "radix", "", "toString-LxnNnR4", "(BI)Ljava/lang/String;", "Lkotlin/UInt;", "toString-V7xB4Y4", "(II)Ljava/lang/String;", "Lkotlin/ULong;", "toString-JSWoG40", "(JI)Ljava/lang/String;", "Lkotlin/UShort;", "toString-olVBNx4", "(SI)Ljava/lang/String;", "toUByte", "(Ljava/lang/String;)B", "(Ljava/lang/String;I)B", "toUByteOrNull", "toUInt", "(Ljava/lang/String;)I", "(Ljava/lang/String;I)I", "toUIntOrNull", "toULong", "(Ljava/lang/String;)J", "(Ljava/lang/String;I)J", "toULongOrNull", "toUShort", "(Ljava/lang/String;)S", "(Ljava/lang/String;I)S", "toUShortOrNull", "kotlin-stdlib"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class UStringsKt {
    /* JADX INFO: renamed from: toString-JSWoG40, reason: not valid java name */
    public static final java.lang.String m9980toStringJSWoG40(long r1, int r3) {
            int r0 = kotlin.text.CharsKt.checkRadix(r3)
            java.lang.String r0 = kotlin.UnsignedKt.ulongToString(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: toString-LxnNnR4, reason: not valid java name */
    public static final java.lang.String m9981toStringLxnNnR4(byte r2, int r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.text.CharsKt.checkRadix(r3)
            java.lang.String r0 = java.lang.Integer.toString(r0, r1)
            java.lang.String r1 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: toString-V7xB4Y4, reason: not valid java name */
    public static final java.lang.String m9982toStringV7xB4Y4(int r4, int r5) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r2 = kotlin.text.CharsKt.checkRadix(r5)
            java.lang.String r0 = java.lang.Long.toString(r0, r2)
            java.lang.String r1 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: toString-olVBNx4, reason: not valid java name */
    public static final java.lang.String m9983toStringolVBNx4(short r2, int r3) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r2
            int r1 = kotlin.text.CharsKt.checkRadix(r3)
            java.lang.String r0 = java.lang.Integer.toString(r0, r1)
            java.lang.String r1 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static final byte toUByte(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UByte r0 = toUByteOrNull(r1)
            if (r0 == 0) goto L10
            byte r0 = r0.m8737unboximpl()
            return r0
        L10:
            kotlin.text.StringsKt.numberFormatError(r1)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    public static final byte toUByte(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UByte r0 = toUByteOrNull(r1, r2)
            if (r0 == 0) goto L10
            byte r0 = r0.m8737unboximpl()
            return r0
        L10:
            kotlin.text.StringsKt.numberFormatError(r1)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    public static final kotlin.UByte toUByteOrNull(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 10
            kotlin.UByte r0 = toUByteOrNull(r1, r0)
            return r0
    }

    public static final kotlin.UByte toUByteOrNull(java.lang.String r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.UInt r0 = toUIntOrNull(r3, r4)
            r1 = 0
            if (r0 == 0) goto L27
            int r0 = r0.m8816unboximpl()
            r2 = 255(0xff, float:3.57E-43)
            int r2 = kotlin.UInt.m8764constructorimpl(r2)
            int r2 = java.lang.Integer.compareUnsigned(r0, r2)
            if (r2 <= 0) goto L1d
            return r1
        L1d:
            byte r1 = (byte) r0
            byte r1 = kotlin.UByte.m8687constructorimpl(r1)
            kotlin.UByte r1 = kotlin.UByte.m8681boximpl(r1)
            return r1
        L27:
            return r1
    }

    public static final int toUInt(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UInt r0 = toUIntOrNull(r1)
            if (r0 == 0) goto L10
            int r0 = r0.m8816unboximpl()
            return r0
        L10:
            kotlin.text.StringsKt.numberFormatError(r1)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    public static final int toUInt(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UInt r0 = toUIntOrNull(r1, r2)
            if (r0 == 0) goto L10
            int r0 = r0.m8816unboximpl()
            return r0
        L10:
            kotlin.text.StringsKt.numberFormatError(r1)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    public static final kotlin.UInt toUIntOrNull(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 10
            kotlin.UInt r0 = toUIntOrNull(r1, r0)
            return r0
    }

    public static final kotlin.UInt toUIntOrNull(java.lang.String r13, int r14) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            kotlin.text.CharsKt.checkRadix(r14)
            int r0 = r13.length()
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            r2 = -1
            r3 = 0
            r4 = 0
            char r4 = r13.charAt(r4)
            r5 = 48
            int r5 = kotlin.jvm.internal.Intrinsics.compare(r4, r5)
            if (r5 >= 0) goto L2a
            r5 = 1
            if (r0 == r5) goto L29
            r5 = 43
            if (r4 == r5) goto L27
            goto L29
        L27:
            r3 = 1
            goto L2b
        L29:
            return r1
        L2a:
            r3 = 0
        L2b:
            r5 = 119304647(0x71c71c7, float:1.1769572E-34)
            r6 = r5
            int r7 = kotlin.UInt.m8764constructorimpl(r14)
            r8 = 0
            r9 = r3
        L35:
            if (r9 >= r0) goto L70
            char r10 = r13.charAt(r9)
            int r10 = kotlin.text.CharsKt.digitOf(r10, r14)
            if (r10 >= 0) goto L42
            return r1
        L42:
            int r11 = java.lang.Integer.compareUnsigned(r8, r6)
            if (r11 <= 0) goto L56
            if (r6 != r5) goto L55
            int r6 = java.lang.Integer.divideUnsigned(r2, r7)
            int r11 = java.lang.Integer.compareUnsigned(r8, r6)
            if (r11 <= 0) goto L56
            return r1
        L55:
            return r1
        L56:
            int r11 = r8 * r7
            int r8 = kotlin.UInt.m8764constructorimpl(r11)
            r11 = r8
            int r12 = kotlin.UInt.m8764constructorimpl(r10)
            int r12 = r12 + r8
            int r8 = kotlin.UInt.m8764constructorimpl(r12)
            int r12 = java.lang.Integer.compareUnsigned(r8, r11)
            if (r12 >= 0) goto L6d
            return r1
        L6d:
            int r9 = r9 + 1
            goto L35
        L70:
            kotlin.UInt r1 = kotlin.UInt.m8758boximpl(r8)
            return r1
    }

    public static final long toULong(java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.ULong r0 = toULongOrNull(r2)
            if (r0 == 0) goto L10
            long r0 = r0.m8895unboximpl()
            return r0
        L10:
            kotlin.text.StringsKt.numberFormatError(r2)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    public static final long toULong(java.lang.String r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.ULong r0 = toULongOrNull(r2, r3)
            if (r0 == 0) goto L10
            long r0 = r0.m8895unboximpl()
            return r0
        L10:
            kotlin.text.StringsKt.numberFormatError(r2)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    public static final kotlin.ULong toULongOrNull(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 10
            kotlin.ULong r0 = toULongOrNull(r1, r0)
            return r0
    }

    public static final kotlin.ULong toULongOrNull(java.lang.String r22, int r23) {
            r0 = r22
            r1 = r23
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            kotlin.text.CharsKt.checkRadix(r23)
            int r2 = r22.length()
            r3 = 0
            if (r2 != 0) goto L14
            return r3
        L14:
            r4 = -1
            r6 = 0
            r7 = 0
            char r7 = r0.charAt(r7)
            r8 = 48
            int r8 = kotlin.jvm.internal.Intrinsics.compare(r7, r8)
            if (r8 >= 0) goto L2f
            r8 = 1
            if (r2 == r8) goto L2e
            r8 = 43
            if (r7 == r8) goto L2c
            goto L2e
        L2c:
            r6 = 1
            goto L30
        L2e:
            return r3
        L2f:
            r6 = 0
        L30:
            r8 = 512409557603043100(0x71c71c71c71c71c, double:2.0539100454284282E-274)
            r10 = r8
            long r12 = (long) r1
            long r12 = kotlin.ULong.m8843constructorimpl(r12)
            r14 = 0
            r16 = r6
            r3 = r16
        L41:
            if (r3 >= r2) goto La2
            r17 = r2
            char r2 = r0.charAt(r3)
            int r2 = kotlin.text.CharsKt.digitOf(r2, r1)
            if (r2 >= 0) goto L52
            r16 = 0
            return r16
        L52:
            int r18 = java.lang.Long.compareUnsigned(r14, r10)
            if (r18 <= 0) goto L6f
            int r18 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r18 != 0) goto L6c
            long r10 = java.lang.Long.divideUnsigned(r4, r12)
            int r18 = java.lang.Long.compareUnsigned(r14, r10)
            if (r18 <= 0) goto L69
            r16 = 0
            return r16
        L69:
            r16 = 0
            goto L6f
        L6c:
            r16 = 0
            return r16
        L6f:
            long r18 = r14 * r12
            long r14 = kotlin.ULong.m8843constructorimpl(r18)
            r18 = r14
            int r0 = kotlin.UInt.m8764constructorimpl(r2)
            long r0 = (long) r0
            r20 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r20
            long r0 = kotlin.ULong.m8843constructorimpl(r0)
            long r0 = r0 + r14
            long r14 = kotlin.ULong.m8843constructorimpl(r0)
            r0 = r18
            int r18 = java.lang.Long.compareUnsigned(r14, r0)
            if (r18 >= 0) goto L97
            r16 = 0
            return r16
        L97:
            r16 = 0
            int r3 = r3 + 1
            r0 = r22
            r1 = r23
            r2 = r17
            goto L41
        La2:
            kotlin.ULong r0 = kotlin.ULong.m8837boximpl(r14)
            return r0
    }

    public static final short toUShort(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UShort r0 = toUShortOrNull(r1)
            if (r0 == 0) goto L10
            short r0 = r0.m9000unboximpl()
            return r0
        L10:
            kotlin.text.StringsKt.numberFormatError(r1)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    public static final short toUShort(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UShort r0 = toUShortOrNull(r1, r2)
            if (r0 == 0) goto L10
            short r0 = r0.m9000unboximpl()
            return r0
        L10:
            kotlin.text.StringsKt.numberFormatError(r1)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    public static final kotlin.UShort toUShortOrNull(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 10
            kotlin.UShort r0 = toUShortOrNull(r1, r0)
            return r0
    }

    public static final kotlin.UShort toUShortOrNull(java.lang.String r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.UInt r0 = toUIntOrNull(r3, r4)
            r1 = 0
            if (r0 == 0) goto L28
            int r0 = r0.m8816unboximpl()
            r2 = 65535(0xffff, float:9.1834E-41)
            int r2 = kotlin.UInt.m8764constructorimpl(r2)
            int r2 = java.lang.Integer.compareUnsigned(r0, r2)
            if (r2 <= 0) goto L1e
            return r1
        L1e:
            short r1 = (short) r0
            short r1 = kotlin.UShort.m8950constructorimpl(r1)
            kotlin.UShort r1 = kotlin.UShort.m8944boximpl(r1)
            return r1
        L28:
            return r1
    }
}
