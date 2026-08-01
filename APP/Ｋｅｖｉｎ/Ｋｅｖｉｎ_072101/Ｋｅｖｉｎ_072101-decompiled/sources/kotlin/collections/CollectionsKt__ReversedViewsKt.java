package kotlin.collections;

/* JADX INFO: compiled from: ReversedViews.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007¢\u0006\u0002\b\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\b\u001a\u001d\u0010\t\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\n\u001a\u001d\u0010\u000b\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\f¨\u0006\r"}, m115d2 = {"asReversed", "", "T", "", "asReversedMutable", "reverseElementIndex", "", "index", "reverseElementIndex$CollectionsKt__ReversedViewsKt", "reverseIteratorIndex", "reverseIteratorIndex$CollectionsKt__ReversedViewsKt", "reversePositionIndex", "reversePositionIndex$CollectionsKt__ReversedViewsKt", "kotlin-stdlib"}, m116k = 5, m117mv = {1, 9, 0}, m119xi = 49, m120xs = "kotlin/collections/CollectionsKt")
class CollectionsKt__ReversedViewsKt extends kotlin.collections.CollectionsKt__MutableCollectionsKt {
    public CollectionsKt__ReversedViewsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ int access$reverseElementIndex(java.util.List r1, int r2) {
            int r0 = reverseElementIndex$CollectionsKt__ReversedViewsKt(r1, r2)
            return r0
    }

    public static final /* synthetic */ int access$reverseIteratorIndex(java.util.List r1, int r2) {
            int r0 = reverseIteratorIndex$CollectionsKt__ReversedViewsKt(r1, r2)
            return r0
    }

    public static final /* synthetic */ int access$reversePositionIndex(java.util.List r1, int r2) {
            int r0 = reversePositionIndex$CollectionsKt__ReversedViewsKt(r1, r2)
            return r0
    }

    public static final <T> java.util.List<T> asReversed(java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.collections.ReversedListReadOnly r0 = new kotlin.collections.ReversedListReadOnly
            r0.<init>(r1)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public static final <T> java.util.List<T> asReversedMutable(java.util.List<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.collections.ReversedList r0 = new kotlin.collections.ReversedList
            r0.<init>(r1)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    private static final int reverseElementIndex$CollectionsKt__ReversedViewsKt(java.util.List<?> r5, int r6) {
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = kotlin.collections.CollectionsKt.getLastIndex(r5)
            r2 = 0
            r0.<init>(r2, r1)
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L16
            int r0 = kotlin.collections.CollectionsKt.getLastIndex(r5)
            int r0 = r0 - r6
            return r0
        L16:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Element index "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r3 = " must be in range ["
            java.lang.StringBuilder r1 = r1.append(r3)
            kotlin.ranges.IntRange r3 = new kotlin.ranges.IntRange
            int r4 = kotlin.collections.CollectionsKt.getLastIndex(r5)
            r3.<init>(r2, r4)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = "]."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static final int reverseIteratorIndex$CollectionsKt__ReversedViewsKt(java.util.List<?> r1, int r2) {
            int r0 = kotlin.collections.CollectionsKt.getLastIndex(r1)
            int r0 = r0 - r2
            return r0
    }

    private static final int reversePositionIndex$CollectionsKt__ReversedViewsKt(java.util.List<?> r5, int r6) {
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = r5.size()
            r2 = 0
            r0.<init>(r2, r1)
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L16
            int r0 = r5.size()
            int r0 = r0 - r6
            return r0
        L16:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Position index "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r3 = " must be in range ["
            java.lang.StringBuilder r1 = r1.append(r3)
            kotlin.ranges.IntRange r3 = new kotlin.ranges.IntRange
            int r4 = r5.size()
            r3.<init>(r2, r4)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = "]."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
