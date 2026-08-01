package kotlin.comparisons;

/* JADX INFO: compiled from: _UComparisons.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\t\u001a\u00020\n\"\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\"\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a&\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\n\u0010\t\u001a\u00020\u0012\"\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\"\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a&\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\n\u0010\t\u001a\u00020\u001a\"\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\"\u0010\u0000\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010\u0000\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u001dH\u0087\bø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a&\u0010\u0000\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\n\u0010\t\u001a\u00020\"\"\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\"\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0005\u001a+\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010\b\u001a&\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\t\u001a\u00020\n\"\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010\f\u001a\"\u0010%\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010\u000f\u001a+\u0010%\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u0011\u001a&\u0010%\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\n\u0010\t\u001a\u00020\u0012\"\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010\u0014\u001a\"\u0010%\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010\u0017\u001a+\u0010%\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\bø\u0001\u0000¢\u0006\u0004\b-\u0010\u0019\u001a&\u0010%\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\n\u0010\t\u001a\u00020\u001a\"\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b.\u0010\u001c\u001a\"\u0010%\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u001f\u001a+\u0010%\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u001dH\u0087\bø\u0001\u0000¢\u0006\u0004\b0\u0010!\u001a&\u0010%\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\n\u0010\t\u001a\u00020\"\"\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, m115d2 = {"maxOf", "Lkotlin/UByte;", "a", "b", "maxOf-Kr8caGY", "(BB)B", "c", "maxOf-b33U2AM", "(BBB)B", "other", "Lkotlin/UByteArray;", "maxOf-Wr6uiD8", "(B[B)B", "Lkotlin/UInt;", "maxOf-J1ME1BU", "(II)I", "maxOf-WZ9TVnA", "(III)I", "Lkotlin/UIntArray;", "maxOf-Md2H83M", "(I[I)I", "Lkotlin/ULong;", "maxOf-eb3DHEI", "(JJ)J", "maxOf-sambcqE", "(JJJ)J", "Lkotlin/ULongArray;", "maxOf-R03FKyM", "(J[J)J", "Lkotlin/UShort;", "maxOf-5PvTz6A", "(SS)S", "maxOf-VKSA0NQ", "(SSS)S", "Lkotlin/UShortArray;", "maxOf-t1qELG4", "(S[S)S", "minOf", "minOf-Kr8caGY", "minOf-b33U2AM", "minOf-Wr6uiD8", "minOf-J1ME1BU", "minOf-WZ9TVnA", "minOf-Md2H83M", "minOf-eb3DHEI", "minOf-sambcqE", "minOf-R03FKyM", "minOf-5PvTz6A", "minOf-VKSA0NQ", "minOf-t1qELG4", "kotlin-stdlib"}, m116k = 5, m117mv = {1, 9, 0}, m119xi = 49, m120xs = "kotlin/comparisons/UComparisonsKt")
class UComparisonsKt___UComparisonsKt {
    public UComparisonsKt___UComparisonsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: maxOf-5PvTz6A, reason: not valid java name */
    public static final short m9849maxOf5PvTz6A(short r2, short r3) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r2 & r0
            r0 = r0 & r3
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r1, r0)
            if (r0 < 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r3
        Lf:
            return r0
    }

    /* JADX INFO: renamed from: maxOf-J1ME1BU, reason: not valid java name */
    public static final int m9850maxOfJ1ME1BU(int r1, int r2) {
            int r0 = java.lang.Integer.compareUnsigned(r1, r2)
            if (r0 < 0) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = r2
        L9:
            return r0
    }

    /* JADX INFO: renamed from: maxOf-Kr8caGY, reason: not valid java name */
    public static final byte m9851maxOfKr8caGY(byte r2, byte r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            r1 = r3 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r0, r1)
            if (r0 < 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r3
        Ld:
            return r0
    }

    /* JADX INFO: renamed from: maxOf-Md2H83M, reason: not valid java name */
    public static final int m9852maxOfMd2H83M(int r4, int... r5) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            int r1 = kotlin.UIntArray.m8825getSizeimpl(r5)
            r2 = 0
        Lb:
            if (r2 >= r1) goto L18
            int r3 = kotlin.UIntArray.m8824getpVg5ArA(r5, r2)
            int r0 = kotlin.comparisons.UComparisonsKt.m9850maxOfJ1ME1BU(r0, r3)
            int r2 = r2 + 1
            goto Lb
        L18:
            return r0
    }

    /* JADX INFO: renamed from: maxOf-R03FKyM, reason: not valid java name */
    public static final long m9853maxOfR03FKyM(long r6, long... r8) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r6
            int r2 = kotlin.ULongArray.m8904getSizeimpl(r8)
            r3 = 0
        Lb:
            if (r3 >= r2) goto L18
            long r4 = kotlin.ULongArray.m8903getsVKNKU(r8, r3)
            long r0 = kotlin.comparisons.UComparisonsKt.m9858maxOfeb3DHEI(r0, r4)
            int r3 = r3 + 1
            goto Lb
        L18:
            return r0
    }

    /* JADX INFO: renamed from: maxOf-VKSA0NQ, reason: not valid java name */
    private static final short m9854maxOfVKSA0NQ(short r1, short r2, short r3) {
            short r0 = kotlin.comparisons.UComparisonsKt.m9849maxOf5PvTz6A(r2, r3)
            short r0 = kotlin.comparisons.UComparisonsKt.m9849maxOf5PvTz6A(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: maxOf-WZ9TVnA, reason: not valid java name */
    private static final int m9855maxOfWZ9TVnA(int r1, int r2, int r3) {
            int r0 = kotlin.comparisons.UComparisonsKt.m9850maxOfJ1ME1BU(r2, r3)
            int r0 = kotlin.comparisons.UComparisonsKt.m9850maxOfJ1ME1BU(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: maxOf-Wr6uiD8, reason: not valid java name */
    public static final byte m9856maxOfWr6uiD8(byte r4, byte... r5) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            int r1 = kotlin.UByteArray.m8746getSizeimpl(r5)
            r2 = 0
        Lb:
            if (r2 >= r1) goto L18
            byte r3 = kotlin.UByteArray.m8745getw2LRezQ(r5, r2)
            byte r0 = kotlin.comparisons.UComparisonsKt.m9851maxOfKr8caGY(r0, r3)
            int r2 = r2 + 1
            goto Lb
        L18:
            return r0
    }

    /* JADX INFO: renamed from: maxOf-b33U2AM, reason: not valid java name */
    private static final byte m9857maxOfb33U2AM(byte r1, byte r2, byte r3) {
            byte r0 = kotlin.comparisons.UComparisonsKt.m9851maxOfKr8caGY(r2, r3)
            byte r0 = kotlin.comparisons.UComparisonsKt.m9851maxOfKr8caGY(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: maxOf-eb3DHEI, reason: not valid java name */
    public static final long m9858maxOfeb3DHEI(long r2, long r4) {
            int r0 = java.lang.Long.compareUnsigned(r2, r4)
            if (r0 < 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r4
        L9:
            return r0
    }

    /* JADX INFO: renamed from: maxOf-sambcqE, reason: not valid java name */
    private static final long m9859maxOfsambcqE(long r2, long r4, long r6) {
            long r0 = kotlin.comparisons.UComparisonsKt.m9858maxOfeb3DHEI(r4, r6)
            long r0 = kotlin.comparisons.UComparisonsKt.m9858maxOfeb3DHEI(r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: maxOf-t1qELG4, reason: not valid java name */
    public static final short m9860maxOft1qELG4(short r4, short... r5) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            int r1 = kotlin.UShortArray.m9009getSizeimpl(r5)
            r2 = 0
        Lb:
            if (r2 >= r1) goto L18
            short r3 = kotlin.UShortArray.m9008getMh2AYeg(r5, r2)
            short r0 = kotlin.comparisons.UComparisonsKt.m9849maxOf5PvTz6A(r0, r3)
            int r2 = r2 + 1
            goto Lb
        L18:
            return r0
    }

    /* JADX INFO: renamed from: minOf-5PvTz6A, reason: not valid java name */
    public static final short m9861minOf5PvTz6A(short r2, short r3) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r2 & r0
            r0 = r0 & r3
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r1, r0)
            if (r0 > 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r3
        Lf:
            return r0
    }

    /* JADX INFO: renamed from: minOf-J1ME1BU, reason: not valid java name */
    public static final int m9862minOfJ1ME1BU(int r1, int r2) {
            int r0 = java.lang.Integer.compareUnsigned(r1, r2)
            if (r0 > 0) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = r2
        L9:
            return r0
    }

    /* JADX INFO: renamed from: minOf-Kr8caGY, reason: not valid java name */
    public static final byte m9863minOfKr8caGY(byte r2, byte r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            r1 = r3 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r0, r1)
            if (r0 > 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r3
        Ld:
            return r0
    }

    /* JADX INFO: renamed from: minOf-Md2H83M, reason: not valid java name */
    public static final int m9864minOfMd2H83M(int r4, int... r5) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            int r1 = kotlin.UIntArray.m8825getSizeimpl(r5)
            r2 = 0
        Lb:
            if (r2 >= r1) goto L18
            int r3 = kotlin.UIntArray.m8824getpVg5ArA(r5, r2)
            int r0 = kotlin.comparisons.UComparisonsKt.m9862minOfJ1ME1BU(r0, r3)
            int r2 = r2 + 1
            goto Lb
        L18:
            return r0
    }

    /* JADX INFO: renamed from: minOf-R03FKyM, reason: not valid java name */
    public static final long m9865minOfR03FKyM(long r6, long... r8) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r6
            int r2 = kotlin.ULongArray.m8904getSizeimpl(r8)
            r3 = 0
        Lb:
            if (r3 >= r2) goto L18
            long r4 = kotlin.ULongArray.m8903getsVKNKU(r8, r3)
            long r0 = kotlin.comparisons.UComparisonsKt.m9870minOfeb3DHEI(r0, r4)
            int r3 = r3 + 1
            goto Lb
        L18:
            return r0
    }

    /* JADX INFO: renamed from: minOf-VKSA0NQ, reason: not valid java name */
    private static final short m9866minOfVKSA0NQ(short r1, short r2, short r3) {
            short r0 = kotlin.comparisons.UComparisonsKt.m9861minOf5PvTz6A(r2, r3)
            short r0 = kotlin.comparisons.UComparisonsKt.m9861minOf5PvTz6A(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: minOf-WZ9TVnA, reason: not valid java name */
    private static final int m9867minOfWZ9TVnA(int r1, int r2, int r3) {
            int r0 = kotlin.comparisons.UComparisonsKt.m9862minOfJ1ME1BU(r2, r3)
            int r0 = kotlin.comparisons.UComparisonsKt.m9862minOfJ1ME1BU(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: minOf-Wr6uiD8, reason: not valid java name */
    public static final byte m9868minOfWr6uiD8(byte r4, byte... r5) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            int r1 = kotlin.UByteArray.m8746getSizeimpl(r5)
            r2 = 0
        Lb:
            if (r2 >= r1) goto L18
            byte r3 = kotlin.UByteArray.m8745getw2LRezQ(r5, r2)
            byte r0 = kotlin.comparisons.UComparisonsKt.m9863minOfKr8caGY(r0, r3)
            int r2 = r2 + 1
            goto Lb
        L18:
            return r0
    }

    /* JADX INFO: renamed from: minOf-b33U2AM, reason: not valid java name */
    private static final byte m9869minOfb33U2AM(byte r1, byte r2, byte r3) {
            byte r0 = kotlin.comparisons.UComparisonsKt.m9863minOfKr8caGY(r2, r3)
            byte r0 = kotlin.comparisons.UComparisonsKt.m9863minOfKr8caGY(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: minOf-eb3DHEI, reason: not valid java name */
    public static final long m9870minOfeb3DHEI(long r2, long r4) {
            int r0 = java.lang.Long.compareUnsigned(r2, r4)
            if (r0 > 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r4
        L9:
            return r0
    }

    /* JADX INFO: renamed from: minOf-sambcqE, reason: not valid java name */
    private static final long m9871minOfsambcqE(long r2, long r4, long r6) {
            long r0 = kotlin.comparisons.UComparisonsKt.m9870minOfeb3DHEI(r4, r6)
            long r0 = kotlin.comparisons.UComparisonsKt.m9870minOfeb3DHEI(r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: minOf-t1qELG4, reason: not valid java name */
    public static final short m9872minOft1qELG4(short r4, short... r5) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            int r1 = kotlin.UShortArray.m9009getSizeimpl(r5)
            r2 = 0
        Lb:
            if (r2 >= r1) goto L18
            short r3 = kotlin.UShortArray.m9008getMh2AYeg(r5, r2)
            short r0 = kotlin.comparisons.UComparisonsKt.m9861minOf5PvTz6A(r0, r3)
            int r2 = r2 + 1
            goto Lb
        L18:
            return r0
    }
}
