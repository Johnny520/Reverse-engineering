package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: AnnotationsMatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0005J%\u0010\u001a\u001a\u00020\u00002\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0002\b\u001fH\u0087\bø\u0001\u0000J\u0014\u0010 \u001a\u00020\u00002\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050!J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0016J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\nJ\u000e\u0010'\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\nJ\u0010\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020*H\u0014J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010R.\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006,"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "Lorg/luckypray/dexkit/query/base/BaseQuery;", "()V", "<set-?>", "", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "annotationsMatcher", "getAnnotationsMatcher", "()Ljava/util/List;", "value", "", "count", "getCount", "()I", "setCount", "(I)V", "Lorg/luckypray/dexkit/query/enums/MatchType;", "matchType", "getMatchType", "()Lorg/luckypray/dexkit/query/enums/MatchType;", "setMatchType", "(Lorg/luckypray/dexkit/query/enums/MatchType;)V", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "rangeMatcher", "getRangeMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "add", "annotation", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "annotations", "", "min", "max", "range", "Lkotlin/ranges/IntRange;", "countMax", "countMin", "innerBuild", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class AnnotationsMatcher extends org.luckypray.dexkit.query.base.BaseQuery {
    public static final org.luckypray.dexkit.query.matchers.AnnotationsMatcher.Companion Companion = null;
    private java.util.List<org.luckypray.dexkit.query.matchers.AnnotationMatcher> annotationsMatcher;
    private org.luckypray.dexkit.query.enums.MatchType matchType;
    private org.luckypray.dexkit.query.matchers.base.IntRange rangeMatcher;

    /* JADX INFO: compiled from: AnnotationsMatcher.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.AnnotationsMatcher create() {
                r1 = this;
                org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
                r0.<init>()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher.Companion = r0
            return
    }

    public AnnotationsMatcher() {
            r1 = this;
            r1.<init>()
            org.luckypray.dexkit.query.enums.MatchType r0 = org.luckypray.dexkit.query.enums.MatchType.Contains
            r1.matchType = r0
            return
    }

    private final org.luckypray.dexkit.query.matchers.AnnotationsMatcher add(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.AnnotationMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationsMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r2 = new org.luckypray.dexkit.query.matchers.AnnotationMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.add(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationsMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationsMatcher count$default(org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r0.count(r1, r2)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.AnnotationsMatcher create() {
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.AnnotationsMatcher.Companion
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r0.create()
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationsMatcher add(org.luckypray.dexkit.query.matchers.AnnotationMatcher r4) {
            r3 = this;
            java.lang.String r0 = "annotation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationsMatcher) r0
            r1 = 0
            java.util.List<org.luckypray.dexkit.query.matchers.AnnotationMatcher> r2 = r3.annotationsMatcher
            if (r2 != 0) goto L14
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
        L14:
            r3.annotationsMatcher = r2
            java.util.List<org.luckypray.dexkit.query.matchers.AnnotationMatcher> r2 = r3.annotationsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.add(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationsMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationsMatcher annotations(java.util.Collection<org.luckypray.dexkit.query.matchers.AnnotationMatcher> r4) {
            r3 = this;
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationsMatcher) r0
            r1 = 0
            java.util.List r2 = kotlin.collections.CollectionsKt.toMutableList(r4)
            r3.annotationsMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationsMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationsMatcher count(int r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationsMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.IntRange r2 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r2.<init>(r4)
            r3.rangeMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationsMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationsMatcher count(int r4, int r5) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationsMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.IntRange r2 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r2.<init>(r4, r5)
            r3.rangeMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationsMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationsMatcher count(kotlin.ranges.IntRange r4) {
            r3 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationsMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.IntRange r2 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r2.<init>(r4)
            r3.rangeMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationsMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationsMatcher count(org.luckypray.dexkit.query.matchers.base.IntRange r3) {
            r2 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationsMatcher) r0
            r1 = 0
            r2.rangeMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationsMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationsMatcher countMax(int r5) {
            r4 = this;
            r0 = r4
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationsMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.IntRange r2 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r3 = 0
            r2.<init>(r3, r5)
            r4.rangeMatcher = r2
            r0 = r4
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationsMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationsMatcher countMin(int r5) {
            r4 = this;
            r0 = r4
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationsMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.IntRange r2 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2.<init>(r5, r3)
            r4.rangeMatcher = r2
            r0 = r4
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationsMatcher) r0
            return r0
    }

    public final java.util.List<org.luckypray.dexkit.query.matchers.AnnotationMatcher> getAnnotationsMatcher() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.AnnotationMatcher> r0 = r1.annotationsMatcher
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ int getCount() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    public final org.luckypray.dexkit.query.enums.MatchType getMatchType() {
            r1 = this;
            org.luckypray.dexkit.query.enums.MatchType r0 = r1.matchType
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.IntRange getRangeMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = r1.rangeMatcher
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    protected int innerBuild(com.google.flatbuffers.FlatBufferBuilder r13) {
            r12 = this;
            java.lang.String r0 = "fbb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            org.luckypray.dexkit.schema.-AnnotationsMatcher$Companion r0 = org.luckypray.dexkit.schema.AnnotationsMatcher.Companion
            java.util.List<org.luckypray.dexkit.query.matchers.AnnotationMatcher> r1 = r12.annotationsMatcher
            r2 = 0
            if (r1 == 0) goto L55
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r5)
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r1
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L23:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L40
            java.lang.Object r8 = r7.next()
            r9 = r8
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r9 = (org.luckypray.dexkit.query.matchers.AnnotationMatcher) r9
            r10 = 0
            r11 = r9
            org.luckypray.dexkit.query.base.BaseQuery r11 = (org.luckypray.dexkit.query.base.BaseQuery) r11
            int r11 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r11, r13)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            r4.add(r9)
            goto L23
        L40:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r4 = (java.util.Collection) r4
            int[] r1 = kotlin.collections.CollectionsKt.toIntArray(r4)
            if (r1 == 0) goto L55
        L4f:
            r3 = 0
            int r1 = r13.createVectorOfTables(r1)
            goto L56
        L55:
            r1 = r2
        L56:
            org.luckypray.dexkit.query.enums.MatchType r3 = r12.matchType
            byte r3 = r3.getValue()
            org.luckypray.dexkit.query.matchers.base.IntRange r4 = r12.rangeMatcher
            if (r4 == 0) goto L66
            org.luckypray.dexkit.query.base.BaseQuery r4 = (org.luckypray.dexkit.query.base.BaseQuery) r4
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r4, r13)
        L66:
            int r0 = r0.createAnnotationsMatcher(r13, r1, r3, r2)
            r13.finish(r0)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationsMatcher matchType(org.luckypray.dexkit.query.enums.MatchType r3) {
            r2 = this;
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationsMatcher) r0
            r1 = 0
            r2.matchType = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = (org.luckypray.dexkit.query.matchers.AnnotationsMatcher) r0
            return r0
    }

    public final /* synthetic */ void setCount(int r1) {
            r0 = this;
            r0.count(r1)
            return
    }

    public final /* synthetic */ void setMatchType(org.luckypray.dexkit.query.enums.MatchType r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.matchType = r2
            return
    }
}
