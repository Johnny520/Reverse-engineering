package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: StringMatchersGroup.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ$\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0007J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0014J\u001f\u0010\u0012\u001a\u00020\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\"\"\u00020\u0004¢\u0006\u0002\u0010#J*\u0010\u0012\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020$J%\u0010\u0012\u001a\u00020\u00002\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020'0&¢\u0006\u0002\b(H\u0087\bø\u0001\u0000R(\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R0\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006*"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "Lorg/luckypray/dexkit/query/base/BaseQuery;", "()V", "groupName", "", "stringMatchers", "", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "(Ljava/lang/String;Ljava/util/Collection;)V", "<set-?>", "getGroupName", "()Ljava/lang/String;", "setGroupName", "(Ljava/lang/String;)V", "", "getStringMatchers", "()Ljava/util/List;", "value", "usingStrings", "getUsingStrings", "()Ljava/util/Collection;", "setUsingStrings", "(Ljava/util/Collection;)V", "add", "usingString", "matchType", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "ignoreCase", "", "matcher", "innerBuild", "", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "Lorg/luckypray/dexkit/query/StringMatcherList;", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class StringMatchersGroup extends org.luckypray.dexkit.query.base.BaseQuery {
    public static final org.luckypray.dexkit.query.matchers.StringMatchersGroup.Companion Companion = null;
    private java.lang.String groupName;
    private java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> stringMatchers;

    /* JADX INFO: compiled from: StringMatchersGroup.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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
        public final org.luckypray.dexkit.query.matchers.StringMatchersGroup create() {
                r1 = this;
                org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = new org.luckypray.dexkit.query.matchers.StringMatchersGroup
                r0.<init>()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.StringMatchersGroup$Companion r0 = new org.luckypray.dexkit.query.matchers.StringMatchersGroup$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.StringMatchersGroup.Companion = r0
            return
    }

    public StringMatchersGroup() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r1.stringMatchers = r0
            return
    }

    public StringMatchersGroup(java.lang.String r2, java.util.Collection<org.luckypray.dexkit.query.matchers.base.StringMatcher> r3) {
            r1 = this;
            java.lang.String r0 = "groupName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "stringMatchers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r1.stringMatchers = r0
            r1.groupName = r2
            java.util.List r0 = kotlin.collections.CollectionsKt.toMutableList(r3)
            r1.stringMatchers = r0
            return
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.StringMatchersGroup add$default(org.luckypray.dexkit.query.matchers.StringMatchersGroup r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = r0.add(r1, r2, r3)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.StringMatchersGroup create() {
            org.luckypray.dexkit.query.matchers.StringMatchersGroup$Companion r0 = org.luckypray.dexkit.query.matchers.StringMatchersGroup.Companion
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = r0.create()
            return r0
    }

    private final org.luckypray.dexkit.query.matchers.StringMatchersGroup usingStrings(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.StringMatcherList, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r0
            r1 = 0
            org.luckypray.dexkit.query.StringMatcherList r2 = new org.luckypray.dexkit.query.StringMatcherList
            r2.<init>()
            r4.invoke(r2)
            r3.usingStrings(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.StringMatchersGroup usingStrings$default(org.luckypray.dexkit.query.matchers.StringMatchersGroup r0, java.util.Collection r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = r0.usingStrings(r1, r2, r3)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup add(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "usingString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = add$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup add(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "usingString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = add$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup add(java.lang.String r4, org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "usingString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r2.<init>(r4, r5, r6)
            r3.add(r2)
            r0 = r3
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup add(org.luckypray.dexkit.query.matchers.base.StringMatcher r4) {
            r3 = this;
            java.lang.String r0 = "matcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r0
            r1 = 0
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r2 = r3.stringMatchers
            r2.add(r4)
            r0 = r3
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r0
            return r0
    }

    public final java.lang.String getGroupName() {
            r1 = this;
            java.lang.String r0 = r1.groupName
            return r0
    }

    public final java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> getStringMatchers() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r0 = r1.stringMatchers
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Property can only be written.")
    public final /* synthetic */ java.util.Collection getUsingStrings() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup groupName(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "groupName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r0
            r1 = 0
            r2.groupName = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r0
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    protected int innerBuild(com.google.flatbuffers.FlatBufferBuilder r13) {
            r12 = this;
            java.lang.String r0 = "fbb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = r12.groupName
            if (r0 == 0) goto L72
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r0 = r12.stringMatchers
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L6a
            org.luckypray.dexkit.schema.-BatchUsingStringsMatcher$Companion r0 = org.luckypray.dexkit.schema.BatchUsingStringsMatcher.Companion
            java.lang.String r1 = r12.groupName
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r13.createString(r1)
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r2 = r12.stringMatchers
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r5)
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r2
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L34:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L51
            java.lang.Object r8 = r7.next()
            r9 = r8
            org.luckypray.dexkit.query.matchers.base.StringMatcher r9 = (org.luckypray.dexkit.query.matchers.base.StringMatcher) r9
            r10 = 0
            r11 = r9
            org.luckypray.dexkit.query.base.BaseQuery r11 = (org.luckypray.dexkit.query.base.BaseQuery) r11
            int r11 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r11, r13)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            r4.add(r9)
            goto L34
        L51:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r4 = (java.util.Collection) r4
            int[] r2 = kotlin.collections.CollectionsKt.toIntArray(r4)
            r3 = 0
            int r2 = r13.createVectorOfTables(r2)
            int r0 = r0.createBatchUsingStringsMatcher(r13, r1, r2)
            r13.finish(r0)
            return r0
        L6a:
            java.lang.IllegalAccessException r0 = new java.lang.IllegalAccessException
            java.lang.String r1 = "matchers not be empty"
            r0.<init>(r1)
            throw r0
        L72:
            java.lang.IllegalAccessException r0 = new java.lang.IllegalAccessException
            java.lang.String r1 = "groupName not be null"
            r0.<init>(r1)
            throw r0
    }

    public final /* synthetic */ void setGroupName(java.lang.String r1) {
            r0 = this;
            r0.groupName = r1
            return
    }

    public final /* synthetic */ void setUsingStrings(java.util.Collection r8) {
            r7 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            usingStrings$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup usingStrings(java.util.Collection<java.lang.String> r8) {
            r7 = this;
            java.lang.String r0 = "usingStrings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = usingStrings$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup usingStrings(java.util.Collection<java.lang.String> r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "usingStrings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = usingStrings$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup usingStrings(java.util.Collection<java.lang.String> r13, org.luckypray.dexkit.query.enums.StringMatchType r14, boolean r15) {
            r12 = this;
            java.lang.String r0 = "usingStrings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = r12
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r0
            r1 = 0
            r2 = r13
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r5)
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r2
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L25:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L3c
            java.lang.Object r8 = r7.next()
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            r10 = 0
            org.luckypray.dexkit.query.matchers.base.StringMatcher r11 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r11.<init>(r9, r14, r15)
            r4.add(r11)
            goto L25
        L3c:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.List r2 = kotlin.collections.CollectionsKt.toMutableList(r4)
            r12.stringMatchers = r2
            r0 = r12
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup usingStrings(org.luckypray.dexkit.query.StringMatcherList r4) {
            r3 = this;
            java.lang.String r0 = "usingStrings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r0
            r1 = 0
            r2 = r4
            java.util.List r2 = (java.util.List) r2
            r3.stringMatchers = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup usingStrings(java.lang.String... r22) {
            r21 = this;
            r0 = r21
            java.lang.String r1 = "usingStrings"
            r2 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            r1 = r0
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r1 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r1
            r3 = 0
            r4 = r22
            r5 = 0
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = r4.length
            r6.<init>(r7)
            java.util.Collection r6 = (java.util.Collection) r6
            r7 = r4
            r8 = 0
            int r9 = r7.length
            r10 = 0
        L1c:
            if (r10 >= r9) goto L3f
            r17 = r7[r10]
            r12 = r17
            r18 = 0
            org.luckypray.dexkit.query.matchers.base.StringMatcher r15 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r16 = 6
            r19 = 0
            r13 = 0
            r14 = 0
            r11 = r15
            r20 = r15
            r15 = r16
            r16 = r19
            r11.<init>(r12, r13, r14, r15, r16)
            r11 = r20
            r6.add(r11)
            int r10 = r10 + 1
            goto L1c
        L3f:
            java.util.List r6 = (java.util.List) r6
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.List r4 = kotlin.collections.CollectionsKt.toMutableList(r6)
            r0.stringMatchers = r4
            r1 = r0
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r1 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r1
            return r1
    }
}
