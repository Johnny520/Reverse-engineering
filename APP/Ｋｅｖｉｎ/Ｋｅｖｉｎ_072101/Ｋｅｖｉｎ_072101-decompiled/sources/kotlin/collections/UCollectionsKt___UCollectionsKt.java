package kotlin.collections;

/* JADX INFO: compiled from: _UCollections.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005\u001a\u001a\u0010\f\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a\u001a\u0010\u0010\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a\u001a\u0010\u0013\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\u001a\u0010\u0016\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\n0\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m115d2 = {"sum", "Lkotlin/UInt;", "", "Lkotlin/UByte;", "sumOfUByte", "(Ljava/lang/Iterable;)I", "sumOfUInt", "Lkotlin/ULong;", "sumOfULong", "(Ljava/lang/Iterable;)J", "Lkotlin/UShort;", "sumOfUShort", "toUByteArray", "Lkotlin/UByteArray;", "", "(Ljava/util/Collection;)[B", "toUIntArray", "Lkotlin/UIntArray;", "(Ljava/util/Collection;)[I", "toULongArray", "Lkotlin/ULongArray;", "(Ljava/util/Collection;)[J", "toUShortArray", "Lkotlin/UShortArray;", "(Ljava/util/Collection;)[S", "kotlin-stdlib"}, m116k = 5, m117mv = {1, 9, 0}, m119xi = 49, m120xs = "kotlin/collections/UCollectionsKt")
class UCollectionsKt___UCollectionsKt {
    public UCollectionsKt___UCollectionsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final int sumOfUByte(java.lang.Iterable<kotlin.UByte> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            java.util.Iterator r1 = r4.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r1.next()
            kotlin.UByte r2 = (kotlin.UByte) r2
            byte r2 = r2.m8737unboximpl()
            r3 = r2 & 255(0xff, float:3.57E-43)
            int r3 = kotlin.UInt.m8764constructorimpl(r3)
            int r3 = r3 + r0
            int r0 = kotlin.UInt.m8764constructorimpl(r3)
            goto La
        L26:
            return r0
    }

    public static final int sumOfUInt(java.lang.Iterable<kotlin.UInt> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            java.util.Iterator r1 = r4.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            kotlin.UInt r2 = (kotlin.UInt) r2
            int r2 = r2.m8816unboximpl()
            int r3 = r0 + r2
            int r0 = kotlin.UInt.m8764constructorimpl(r3)
            goto La
        L21:
            return r0
    }

    public static final long sumOfULong(java.lang.Iterable<kotlin.ULong> r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            java.util.Iterator r2 = r7.iterator()
        Lb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L22
            java.lang.Object r3 = r2.next()
            kotlin.ULong r3 = (kotlin.ULong) r3
            long r3 = r3.m8895unboximpl()
            long r5 = r0 + r3
            long r0 = kotlin.ULong.m8843constructorimpl(r5)
            goto Lb
        L22:
            return r0
    }

    public static final int sumOfUShort(java.lang.Iterable<kotlin.UShort> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            java.util.Iterator r1 = r4.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r1.next()
            kotlin.UShort r2 = (kotlin.UShort) r2
            short r2 = r2.m9000unboximpl()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            int r3 = kotlin.UInt.m8764constructorimpl(r3)
            int r3 = r3 + r0
            int r0 = kotlin.UInt.m8764constructorimpl(r3)
            goto La
        L28:
            return r0
    }

    public static final byte[] toUByteArray(java.util.Collection<kotlin.UByte> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r5.size()
            byte[] r0 = kotlin.UByteArray.m8739constructorimpl(r0)
            r1 = 0
            java.util.Iterator r2 = r5.iterator()
        L12:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L29
            java.lang.Object r3 = r2.next()
            kotlin.UByte r3 = (kotlin.UByte) r3
            byte r3 = r3.m8737unboximpl()
            int r4 = r1 + 1
            kotlin.UByteArray.m8750setVurrAj0(r0, r1, r3)
            r1 = r4
            goto L12
        L29:
            return r0
    }

    public static final int[] toUIntArray(java.util.Collection<kotlin.UInt> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r5.size()
            int[] r0 = kotlin.UIntArray.m8818constructorimpl(r0)
            r1 = 0
            java.util.Iterator r2 = r5.iterator()
        L12:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L29
            java.lang.Object r3 = r2.next()
            kotlin.UInt r3 = (kotlin.UInt) r3
            int r3 = r3.m8816unboximpl()
            int r4 = r1 + 1
            kotlin.UIntArray.m8829setVXSXFK8(r0, r1, r3)
            r1 = r4
            goto L12
        L29:
            return r0
    }

    public static final long[] toULongArray(java.util.Collection<kotlin.ULong> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r6.size()
            long[] r0 = kotlin.ULongArray.m8897constructorimpl(r0)
            r1 = 0
            java.util.Iterator r2 = r6.iterator()
        L12:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L29
            java.lang.Object r3 = r2.next()
            kotlin.ULong r3 = (kotlin.ULong) r3
            long r3 = r3.m8895unboximpl()
            int r5 = r1 + 1
            kotlin.ULongArray.m8908setk8EXiF4(r0, r1, r3)
            r1 = r5
            goto L12
        L29:
            return r0
    }

    public static final short[] toUShortArray(java.util.Collection<kotlin.UShort> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r5.size()
            short[] r0 = kotlin.UShortArray.m9002constructorimpl(r0)
            r1 = 0
            java.util.Iterator r2 = r5.iterator()
        L12:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L29
            java.lang.Object r3 = r2.next()
            kotlin.UShort r3 = (kotlin.UShort) r3
            short r3 = r3.m9000unboximpl()
            int r4 = r1 + 1
            kotlin.UShortArray.m9013set01HTLdE(r0, r1, r3)
            r1 = r4
            goto L12
        L29:
            return r0
    }
}
