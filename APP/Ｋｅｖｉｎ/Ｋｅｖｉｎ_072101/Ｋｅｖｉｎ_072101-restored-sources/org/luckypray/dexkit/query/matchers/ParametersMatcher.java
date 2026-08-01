package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: ParametersMatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0014\u001a\u00020\u00002\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0016J$\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007J%\u0010\u0014\u001a\u00020\u00002\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0002\b H\u0087\bø\u0001\u0000J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0010J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0004J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0004J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*H\u0014J\u0016\u0010+\u001a\u00020\u00002\u000e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0,R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR2\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b2\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\n\u001a\u0004\u0018\u00010\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006."}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;", "Lorg/luckypray/dexkit/query/base/BaseQuery;", "()V", "value", "", "count", "getCount", "()I", "setCount", "(I)V", "<set-?>", "", "Lorg/luckypray/dexkit/query/matchers/ParameterMatcher;", "paramsMatcher", "getParamsMatcher", "()Ljava/util/List;", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "rangeMatcher", "getRangeMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "add", "clazz", "Ljava/lang/Class;", "typeName", "", "matchType", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "ignoreCase", "", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "matcher", "min", "max", "range", "Lkotlin/ranges/IntRange;", "countMax", "countMin", "innerBuild", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "params", "", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class ParametersMatcher extends org.luckypray.dexkit.query.base.BaseQuery {
    public static final org.luckypray.dexkit.query.matchers.ParametersMatcher.Companion Companion = null;
    private java.util.List<org.luckypray.dexkit.query.matchers.ParameterMatcher> paramsMatcher;
    private org.luckypray.dexkit.query.matchers.base.IntRange rangeMatcher;

    /* JADX INFO: compiled from: ParametersMatcher.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/ParametersMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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
        public final org.luckypray.dexkit.query.matchers.ParametersMatcher create() {
                r1 = this;
                org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
                r0.<init>()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.ParametersMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.ParametersMatcher.Companion = r0
            return
    }

    public ParametersMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    private final org.luckypray.dexkit.query.matchers.ParametersMatcher add(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.ParameterMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = (org.luckypray.dexkit.query.matchers.ParametersMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ParameterMatcher r2 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.add(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = (org.luckypray.dexkit.query.matchers.ParametersMatcher) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ParametersMatcher add$default(org.luckypray.dexkit.query.matchers.ParametersMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r0.add(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ParametersMatcher count$default(org.luckypray.dexkit.query.matchers.ParametersMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r0.count(r1, r2)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.ParametersMatcher create() {
            org.luckypray.dexkit.query.matchers.ParametersMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.ParametersMatcher.Companion
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r0.create()
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher add(java.lang.Class<?> r4) {
            r3 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = (org.luckypray.dexkit.query.matchers.ParametersMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ParameterMatcher r2 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r2.<init>()
            org.luckypray.dexkit.query.matchers.ParameterMatcher r2 = r2.type(r4)
            r3.add(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = (org.luckypray.dexkit.query.matchers.ParametersMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher add(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "typeName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = add$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher add(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "typeName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = add$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher add(java.lang.String r4, org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "typeName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = (org.luckypray.dexkit.query.matchers.ParametersMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ParameterMatcher r2 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r2.<init>()
            org.luckypray.dexkit.query.matchers.ParameterMatcher r2 = r2.type(r4, r5, r6)
            r3.add(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = (org.luckypray.dexkit.query.matchers.ParametersMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher add(org.luckypray.dexkit.query.matchers.ParameterMatcher r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = (org.luckypray.dexkit.query.matchers.ParametersMatcher) r0
            r1 = 0
            java.util.List<org.luckypray.dexkit.query.matchers.ParameterMatcher> r2 = r3.paramsMatcher
            if (r2 != 0) goto Lf
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
        Lf:
            r3.paramsMatcher = r2
            java.util.List<org.luckypray.dexkit.query.matchers.ParameterMatcher> r2 = r3.paramsMatcher
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.add(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = (org.luckypray.dexkit.query.matchers.ParametersMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher count(int r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = (org.luckypray.dexkit.query.matchers.ParametersMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.IntRange r2 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r2.<init>(r4)
            r3.rangeMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = (org.luckypray.dexkit.query.matchers.ParametersMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher count(int r4, int r5) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = (org.luckypray.dexkit.query.matchers.ParametersMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.IntRange r2 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r2.<init>(r4, r5)
            r3.rangeMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = (org.luckypray.dexkit.query.matchers.ParametersMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher count(kotlin.ranges.IntRange r4) {
            r3 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = (org.luckypray.dexkit.query.matchers.ParametersMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.IntRange r2 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r2.<init>(r4)
            r3.rangeMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = (org.luckypray.dexkit.query.matchers.ParametersMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher count(org.luckypray.dexkit.query.matchers.base.IntRange r3) {
            r2 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = (org.luckypray.dexkit.query.matchers.ParametersMatcher) r0
            r1 = 0
            r2.rangeMatcher = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = (org.luckypray.dexkit.query.matchers.ParametersMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher countMax(int r5) {
            r4 = this;
            r0 = r4
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = (org.luckypray.dexkit.query.matchers.ParametersMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.IntRange r2 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r3 = 0
            r2.<init>(r3, r5)
            r4.rangeMatcher = r2
            r0 = r4
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = (org.luckypray.dexkit.query.matchers.ParametersMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher countMin(int r5) {
            r4 = this;
            r0 = r4
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = (org.luckypray.dexkit.query.matchers.ParametersMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.IntRange r2 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2.<init>(r5, r3)
            r4.rangeMatcher = r2
            r0 = r4
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = (org.luckypray.dexkit.query.matchers.ParametersMatcher) r0
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

    public final java.util.List<org.luckypray.dexkit.query.matchers.ParameterMatcher> getParamsMatcher() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.ParameterMatcher> r0 = r1.paramsMatcher
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
            org.luckypray.dexkit.schema.-ParametersMatcher$Companion r0 = org.luckypray.dexkit.schema.ParametersMatcher.Companion
            java.util.List<org.luckypray.dexkit.query.matchers.ParameterMatcher> r1 = r12.paramsMatcher
            r2 = 0
            if (r1 == 0) goto L5f
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
            if (r8 == 0) goto L4a
            java.lang.Object r8 = r7.next()
            r9 = r8
            org.luckypray.dexkit.query.matchers.ParameterMatcher r9 = (org.luckypray.dexkit.query.matchers.ParameterMatcher) r9
            r10 = 0
            if (r9 == 0) goto L37
            r11 = r9
            org.luckypray.dexkit.query.base.BaseQuery r11 = (org.luckypray.dexkit.query.base.BaseQuery) r11
            goto L3e
        L37:
            org.luckypray.dexkit.query.matchers.ParameterMatcher r11 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r11.<init>()
            org.luckypray.dexkit.query.base.BaseQuery r11 = (org.luckypray.dexkit.query.base.BaseQuery) r11
        L3e:
            int r11 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r11, r13)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            r4.add(r9)
            goto L23
        L4a:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r4 = (java.util.Collection) r4
            int[] r1 = kotlin.collections.CollectionsKt.toIntArray(r4)
            if (r1 == 0) goto L5f
        L59:
            r3 = 0
            int r1 = r13.createVectorOfTables(r1)
            goto L60
        L5f:
            r1 = r2
        L60:
            org.luckypray.dexkit.query.matchers.base.IntRange r3 = r12.rangeMatcher
            if (r3 == 0) goto L6a
            org.luckypray.dexkit.query.base.BaseQuery r3 = (org.luckypray.dexkit.query.base.BaseQuery) r3
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r3, r13)
        L6a:
            int r0 = r0.createParametersMatcher(r13, r1, r2)
            r13.finish(r0)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher params(java.util.Collection<org.luckypray.dexkit.query.matchers.ParameterMatcher> r4) {
            r3 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = (org.luckypray.dexkit.query.matchers.ParametersMatcher) r0
            r1 = 0
            java.util.List r2 = kotlin.collections.CollectionsKt.toMutableList(r4)
            r3.paramsMatcher = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = (org.luckypray.dexkit.query.matchers.ParametersMatcher) r0
            return r0
    }

    public final /* synthetic */ void setCount(int r1) {
            r0 = this;
            r0.count(r1)
            return
    }
}
