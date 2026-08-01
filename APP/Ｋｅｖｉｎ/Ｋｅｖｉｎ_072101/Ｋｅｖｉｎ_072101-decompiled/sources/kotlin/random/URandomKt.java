package kotlin.random;

/* JADX INFO: compiled from: URandom.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u001e\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u0011\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a2\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0014\u0010\u0018\u001a\u00020\u0003*\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001a\u001e\u0010\u0018\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a&\u0010\u0018\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001c\u0010\u0018\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0002\u0010 \u001a\u0014\u0010!\u001a\u00020\b*\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\"\u001a\u001e\u0010!\u001a\u00020\b*\u00020\r2\u0006\u0010\u0004\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a&\u0010!\u001a\u00020\b*\u00020\r2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\u001c\u0010!\u001a\u00020\b*\u00020\r2\u0006\u0010\u001e\u001a\u00020'H\u0007ø\u0001\u0000¢\u0006\u0002\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, m115d2 = {"checkUIntRangeBounds", "", "from", "Lkotlin/UInt;", "until", "checkUIntRangeBounds-J1ME1BU", "(II)V", "checkULongRangeBounds", "Lkotlin/ULong;", "checkULongRangeBounds-eb3DHEI", "(JJ)V", "nextUBytes", "Lkotlin/UByteArray;", "Lkotlin/random/Random;", "size", "", "(Lkotlin/random/Random;I)[B", "array", "nextUBytes-EVgfTAA", "(Lkotlin/random/Random;[B)[B", "fromIndex", "toIndex", "nextUBytes-Wvrt4B4", "(Lkotlin/random/Random;[BII)[B", "nextUInt", "(Lkotlin/random/Random;)I", "nextUInt-qCasIEU", "(Lkotlin/random/Random;I)I", "nextUInt-a8DCA5k", "(Lkotlin/random/Random;II)I", "range", "Lkotlin/ranges/UIntRange;", "(Lkotlin/random/Random;Lkotlin/ranges/UIntRange;)I", "nextULong", "(Lkotlin/random/Random;)J", "nextULong-V1Xi4fY", "(Lkotlin/random/Random;J)J", "nextULong-jmpaW-c", "(Lkotlin/random/Random;JJ)J", "Lkotlin/ranges/ULongRange;", "(Lkotlin/random/Random;Lkotlin/ranges/ULongRange;)J", "kotlin-stdlib"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class URandomKt {
    /* JADX INFO: renamed from: checkUIntRangeBounds-J1ME1BU, reason: not valid java name */
    public static final void m9882checkUIntRangeBoundsJ1ME1BU(int r3, int r4) {
            int r0 = java.lang.Integer.compareUnsigned(r4, r3)
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Lc
            return
        Lc:
            r0 = 0
            kotlin.UInt r1 = kotlin.UInt.m8758boximpl(r3)
            kotlin.UInt r2 = kotlin.UInt.m8758boximpl(r4)
            java.lang.String r0 = kotlin.random.RandomKt.boundsErrorMessage(r1, r2)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: checkULongRangeBounds-eb3DHEI, reason: not valid java name */
    public static final void m9883checkULongRangeBoundseb3DHEI(long r3, long r5) {
            int r0 = java.lang.Long.compareUnsigned(r5, r3)
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Lc
            return
        Lc:
            r0 = 0
            kotlin.ULong r1 = kotlin.ULong.m8837boximpl(r3)
            kotlin.ULong r2 = kotlin.ULong.m8837boximpl(r5)
            java.lang.String r0 = kotlin.random.RandomKt.boundsErrorMessage(r1, r2)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static final byte[] nextUBytes(kotlin.random.Random r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            byte[] r0 = r1.nextBytes(r2)
            byte[] r0 = kotlin.UByteArray.m8740constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: nextUBytes-EVgfTAA, reason: not valid java name */
    public static final byte[] m9884nextUBytesEVgfTAA(kotlin.random.Random r1, byte[] r2) {
            java.lang.String r0 = "$this$nextUBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.nextBytes(r2)
            return r2
    }

    /* JADX INFO: renamed from: nextUBytes-Wvrt4B4, reason: not valid java name */
    public static final byte[] m9885nextUBytesWvrt4B4(kotlin.random.Random r1, byte[] r2, int r3, int r4) {
            java.lang.String r0 = "$this$nextUBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.nextBytes(r2, r3, r4)
            return r2
    }

    /* JADX INFO: renamed from: nextUBytes-Wvrt4B4$default, reason: not valid java name */
    public static /* synthetic */ byte[] m9886nextUBytesWvrt4B4$default(kotlin.random.Random r0, byte[] r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = kotlin.UByteArray.m8746getSizeimpl(r1)
        Ld:
            byte[] r0 = m9885nextUBytesWvrt4B4(r0, r1, r2, r3)
            return r0
    }

    public static final int nextUInt(kotlin.random.Random r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r1.nextInt()
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            return r0
    }

    public static final int nextUInt(kotlin.random.Random r3, kotlin.ranges.UIntRange r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L58
            int r0 = r4.m9892getLastpVg5ArA()
            r1 = -1
            int r0 = java.lang.Integer.compareUnsigned(r0, r1)
            if (r0 >= 0) goto L2f
            int r0 = r4.m9891getFirstpVg5ArA()
            int r1 = r4.m9892getLastpVg5ArA()
            int r1 = r1 + 1
            int r1 = kotlin.UInt.m8764constructorimpl(r1)
            int r0 = m9887nextUInta8DCA5k(r3, r0, r1)
            goto L57
        L2f:
            int r0 = r4.m9891getFirstpVg5ArA()
            r1 = 0
            int r0 = java.lang.Integer.compareUnsigned(r0, r1)
            if (r0 <= 0) goto L53
            int r0 = r4.m9891getFirstpVg5ArA()
            int r0 = r0 + (-1)
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            int r1 = r4.m9892getLastpVg5ArA()
            int r0 = m9887nextUInta8DCA5k(r3, r0, r1)
            int r0 = r0 + 1
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            goto L57
        L53:
            int r0 = nextUInt(r3)
        L57:
            return r0
        L58:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot get random in empty range: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: nextUInt-a8DCA5k, reason: not valid java name */
    public static final int m9887nextUInta8DCA5k(kotlin.random.Random r4, int r5, int r6) {
            java.lang.String r0 = "$this$nextUInt"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            m9882checkUIntRangeBoundsJ1ME1BU(r5, r6)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 ^ r0
            r2 = r6 ^ r0
            int r3 = r4.nextInt(r1, r2)
            r0 = r0 ^ r3
            int r3 = kotlin.UInt.m8764constructorimpl(r0)
            return r3
    }

    /* JADX INFO: renamed from: nextUInt-qCasIEU, reason: not valid java name */
    public static final int m9888nextUIntqCasIEU(kotlin.random.Random r1, int r2) {
            java.lang.String r0 = "$this$nextUInt"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 0
            int r0 = m9887nextUInta8DCA5k(r1, r0, r2)
            return r0
    }

    public static final long nextULong(kotlin.random.Random r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            long r0 = r2.nextLong()
            long r0 = kotlin.ULong.m8843constructorimpl(r0)
            return r0
    }

    public static final long nextULong(kotlin.random.Random r10, kotlin.ranges.ULongRange r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L6f
            long r0 = r11.m9901getLastsVKNKU()
            r2 = -1
            int r0 = java.lang.Long.compareUnsigned(r0, r2)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 1
            if (r0 >= 0) goto L3c
            long r4 = r11.m9900getFirstsVKNKU()
            long r6 = r11.m9901getLastsVKNKU()
            long r8 = (long) r3
            long r0 = r8 & r1
            long r0 = kotlin.ULong.m8843constructorimpl(r0)
            long r6 = r6 + r0
            long r0 = kotlin.ULong.m8843constructorimpl(r6)
            long r0 = m9890nextULongjmpaWc(r10, r4, r0)
            goto L6e
        L3c:
            long r4 = r11.m9900getFirstsVKNKU()
            r6 = 0
            int r0 = java.lang.Long.compareUnsigned(r4, r6)
            if (r0 <= 0) goto L6a
            long r4 = r11.m9900getFirstsVKNKU()
            long r6 = (long) r3
            long r0 = r6 & r1
            long r2 = kotlin.ULong.m8843constructorimpl(r0)
            long r4 = r4 - r2
            long r2 = kotlin.ULong.m8843constructorimpl(r4)
            long r4 = r11.m9901getLastsVKNKU()
            long r2 = m9890nextULongjmpaWc(r10, r2, r4)
            long r0 = kotlin.ULong.m8843constructorimpl(r0)
            long r2 = r2 + r0
            long r0 = kotlin.ULong.m8843constructorimpl(r2)
            goto L6e
        L6a:
            long r0 = nextULong(r10)
        L6e:
            return r0
        L6f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot get random in empty range: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: nextULong-V1Xi4fY, reason: not valid java name */
    public static final long m9889nextULongV1Xi4fY(kotlin.random.Random r2, long r3) {
            java.lang.String r0 = "$this$nextULong"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            long r0 = m9890nextULongjmpaWc(r2, r0, r3)
            return r0
    }

    /* JADX INFO: renamed from: nextULong-jmpaW-c, reason: not valid java name */
    public static final long m9890nextULongjmpaWc(kotlin.random.Random r8, long r9, long r11) {
            java.lang.String r0 = "$this$nextULong"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            m9883checkULongRangeBoundseb3DHEI(r9, r11)
            r0 = -9223372036854775808
            long r2 = r9 ^ r0
            long r4 = r11 ^ r0
            long r6 = r8.nextLong(r2, r4)
            long r0 = r0 ^ r6
            long r6 = kotlin.ULong.m8843constructorimpl(r0)
            return r6
    }
}
