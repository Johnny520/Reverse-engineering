package org.luckypray.dexkit.query;

/* JADX INFO: compiled from: BatchFindClassUsingStrings.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 52\u00020\u0001:\u00015B\u0005¢\u0006\u0002\u0010\u0002J2\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000bH\u0007J-\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00052\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$¢\u0006\u0002\b'H\u0087\bø\u0001\u0000J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0016J%\u0010\u001d\u001a\u00020\u00002\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020&0$¢\u0006\u0002\b'H\u0087\bø\u0001\u0000J\u001f\u0010\u0006\u001a\u00020\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050)\"\u00020\u0005¢\u0006\u0002\u0010*J\u0014\u0010\u0006\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0014\u0010+\u001a\u00020\u00002\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004J6\u0010+\u001a\u00020\u00002\u0018\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040-2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000bH\u0007J%\u0010+\u001a\u00020\u00002\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020&0$¢\u0006\u0002\b'H\u0087\bø\u0001\u0000J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0014J\u0014\u00103\u001a\u00020\u00002\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004J\u001f\u0010\u001a\u001a\u00020\u00002\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050)\"\u00020\u0005¢\u0006\u0002\u0010*J\u0014\u0010\u001a\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R4\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R4\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\nR.\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R4\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00066"}, m115d2 = {"Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;", "Lorg/luckypray/dexkit/query/base/BaseQuery;", "()V", "<set-?>", "", "", "excludePackages", "getExcludePackages", "()Ljava/util/Collection;", "setExcludePackages", "(Ljava/util/Collection;)V", "", "ignorePackagesCase", "getIgnorePackagesCase", "()Z", "setIgnorePackagesCase", "(Z)V", "Lorg/luckypray/dexkit/result/ClassData;", "searchClasses", "getSearchClasses", "setSearchClasses", "", "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "searchGroups", "getSearchGroups", "()Ljava/util/List;", "searchPackages", "getSearchPackages", "setSearchPackages", "addSearchGroup", "groupName", "usingStrings", "matchType", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "ignoreCase", "init", "Lkotlin/Function1;", "Lorg/luckypray/dexkit/query/StringMatcherList;", "", "Lkotlin/ExtensionFunctionType;", "matcher", "", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;", "groups", "keywordsMap", "", "Lorg/luckypray/dexkit/query/StringMatchersGroupList;", "innerBuild", "", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "searchIn", "classes", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class BatchFindClassUsingStrings extends org.luckypray.dexkit.query.base.BaseQuery {
    public static final org.luckypray.dexkit.query.BatchFindClassUsingStrings.Companion Companion = null;
    private java.util.Collection<java.lang.String> excludePackages;
    private boolean ignorePackagesCase;
    private java.util.Collection<org.luckypray.dexkit.result.ClassData> searchClasses;
    private java.util.List<org.luckypray.dexkit.query.matchers.StringMatchersGroup> searchGroups;
    private java.util.Collection<java.lang.String> searchPackages;

    /* JADX INFO: compiled from: BatchFindClassUsingStrings.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m115d2 = {"Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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
        public final org.luckypray.dexkit.query.BatchFindClassUsingStrings create() {
                r1 = this;
                org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = new org.luckypray.dexkit.query.BatchFindClassUsingStrings
                r0.<init>()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.BatchFindClassUsingStrings$Companion r0 = new org.luckypray.dexkit.query.BatchFindClassUsingStrings$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.BatchFindClassUsingStrings.Companion = r0
            return
    }

    public BatchFindClassUsingStrings() {
            r0 = this;
            r0.<init>()
            return
    }

    private final org.luckypray.dexkit.query.BatchFindClassUsingStrings addSearchGroup(java.lang.String r5, kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.StringMatcherList, kotlin.Unit> r6) {
            r4 = this;
            java.lang.String r0 = "groupName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r4
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r2 = new org.luckypray.dexkit.query.matchers.StringMatchersGroup
            org.luckypray.dexkit.query.StringMatcherList r3 = new org.luckypray.dexkit.query.StringMatcherList
            r3.<init>()
            r6.invoke(r3)
            java.util.Collection r3 = (java.util.Collection) r3
            r2.<init>(r5, r3)
            r4.addSearchGroup(r2)
            r0 = r4
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r0
            return r0
    }

    private final org.luckypray.dexkit.query.BatchFindClassUsingStrings addSearchGroup(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.StringMatchersGroup, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r2 = new org.luckypray.dexkit.query.matchers.StringMatchersGroup
            r2.<init>()
            r4.invoke(r2)
            r3.addSearchGroup(r2)
            r0 = r3
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.BatchFindClassUsingStrings addSearchGroup$default(org.luckypray.dexkit.query.BatchFindClassUsingStrings r0, java.lang.String r1, java.util.Collection r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 4
            if (r6 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r3 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r5 = r5 & 8
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = r0.addSearchGroup(r1, r2, r3, r4)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.BatchFindClassUsingStrings create() {
            org.luckypray.dexkit.query.BatchFindClassUsingStrings$Companion r0 = org.luckypray.dexkit.query.BatchFindClassUsingStrings.Companion
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = r0.create()
            return r0
    }

    private final org.luckypray.dexkit.query.BatchFindClassUsingStrings groups(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.StringMatchersGroupList, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r0
            r1 = 0
            org.luckypray.dexkit.query.StringMatchersGroupList r2 = new org.luckypray.dexkit.query.StringMatchersGroupList
            r2.<init>()
            r4.invoke(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            r3.groups(r2)
            r0 = r3
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r0
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.BatchFindClassUsingStrings groups$default(org.luckypray.dexkit.query.BatchFindClassUsingStrings r0, java.util.Map r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = r0.groups(r1, r2, r3)
            return r0
    }

    public final org.luckypray.dexkit.query.BatchFindClassUsingStrings addSearchGroup(java.lang.String r9, java.util.Collection<java.lang.String> r10) {
            r8 = this;
            java.lang.String r0 = "groupName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "usingStrings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r6 = 12
            r7 = 0
            r4 = 0
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = addSearchGroup$default(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public final org.luckypray.dexkit.query.BatchFindClassUsingStrings addSearchGroup(java.lang.String r9, java.util.Collection<java.lang.String> r10, org.luckypray.dexkit.query.enums.StringMatchType r11) {
            r8 = this;
            java.lang.String r0 = "groupName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "usingStrings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r6 = 8
            r7 = 0
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = addSearchGroup$default(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public final org.luckypray.dexkit.query.BatchFindClassUsingStrings addSearchGroup(java.lang.String r17, java.util.Collection<java.lang.String> r18, org.luckypray.dexkit.query.enums.StringMatchType r19, boolean r20) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            java.lang.String r4 = "groupName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "usingStrings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.String r4 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            r4 = r0
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r4 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r4
            r5 = 0
            r6 = r2
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r7 = 0
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r6, r9)
            r8.<init>(r9)
            java.util.Collection r8 = (java.util.Collection) r8
            r9 = r6
            r10 = 0
            java.util.Iterator r11 = r9.iterator()
        L32:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L4d
            java.lang.Object r12 = r11.next()
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13
            r14 = 0
            org.luckypray.dexkit.query.matchers.base.StringMatcher r15 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r2 = r20
            r15.<init>(r13, r3, r2)
            r8.add(r15)
            r2 = r18
            goto L32
        L4d:
            r2 = r20
            java.util.List r8 = (java.util.List) r8
            java.util.Collection r8 = (java.util.Collection) r8
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r6 = new org.luckypray.dexkit.query.matchers.StringMatchersGroup
            r6.<init>(r1, r8)
            r0.addSearchGroup(r6)
            r4 = r0
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r4 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r4
            return r4
    }

    public final org.luckypray.dexkit.query.BatchFindClassUsingStrings addSearchGroup(org.luckypray.dexkit.query.matchers.StringMatchersGroup r4) {
            r3 = this;
            java.lang.String r0 = "matcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r0
            r1 = 0
            java.util.List<org.luckypray.dexkit.query.matchers.StringMatchersGroup> r2 = r3.searchGroups
            if (r2 != 0) goto L14
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
        L14:
            r3.searchGroups = r2
            java.util.List<org.luckypray.dexkit.query.matchers.StringMatchersGroup> r2 = r3.searchGroups
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.add(r4)
            r0 = r3
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r0
            return r0
    }

    public final org.luckypray.dexkit.query.BatchFindClassUsingStrings excludePackages(java.util.Collection<java.lang.String> r3) {
            r2 = this;
            java.lang.String r0 = "excludePackages"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r0
            r1 = 0
            r2.excludePackages = r3
            r0 = r2
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r0
            return r0
    }

    public final org.luckypray.dexkit.query.BatchFindClassUsingStrings excludePackages(java.lang.String... r4) {
            r3 = this;
            java.lang.String r0 = "excludePackages"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r0
            r1 = 0
            java.util.List r2 = kotlin.collections.ArraysKt.toList(r4)
            java.util.Collection r2 = (java.util.Collection) r2
            r3.excludePackages = r2
            r0 = r3
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r0
            return r0
    }

    public final java.util.Collection<java.lang.String> getExcludePackages() {
            r1 = this;
            java.util.Collection<java.lang.String> r0 = r1.excludePackages
            return r0
    }

    public final boolean getIgnorePackagesCase() {
            r1 = this;
            boolean r0 = r1.ignorePackagesCase
            return r0
    }

    public final java.util.Collection<org.luckypray.dexkit.result.ClassData> getSearchClasses() {
            r1 = this;
            java.util.Collection<org.luckypray.dexkit.result.ClassData> r0 = r1.searchClasses
            return r0
    }

    public final java.util.List<org.luckypray.dexkit.query.matchers.StringMatchersGroup> getSearchGroups() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.StringMatchersGroup> r0 = r1.searchGroups
            return r0
    }

    public final java.util.Collection<java.lang.String> getSearchPackages() {
            r1 = this;
            java.util.Collection<java.lang.String> r0 = r1.searchPackages
            return r0
    }

    public final org.luckypray.dexkit.query.BatchFindClassUsingStrings groups(java.util.Collection<org.luckypray.dexkit.query.matchers.StringMatchersGroup> r4) {
            r3 = this;
            java.lang.String r0 = "groups"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r0
            r1 = 0
            java.util.List r2 = kotlin.collections.CollectionsKt.toMutableList(r4)
            r3.searchGroups = r2
            r0 = r3
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r0
            return r0
    }

    public final org.luckypray.dexkit.query.BatchFindClassUsingStrings groups(java.util.Map<java.lang.String, ? extends java.util.Collection<java.lang.String>> r8) {
            r7 = this;
            java.lang.String r0 = "keywordsMap"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = groups$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.BatchFindClassUsingStrings groups(java.util.Map<java.lang.String, ? extends java.util.Collection<java.lang.String>> r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "keywordsMap"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = groups$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.BatchFindClassUsingStrings groups(java.util.Map<java.lang.String, ? extends java.util.Collection<java.lang.String>> r26, org.luckypray.dexkit.query.enums.StringMatchType r27, boolean r28) {
            r25 = this;
            r0 = r25
            r1 = r27
            java.lang.String r2 = "keywordsMap"
            r3 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.String r2 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = r0
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r2 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r2
            r4 = 0
            r5 = r26
            r6 = 0
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = r5.size()
            r7.<init>(r8)
            java.util.Collection r7 = (java.util.Collection) r7
            r8 = r5
            r9 = 0
            java.util.Set r10 = r8.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L2c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto La3
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r12 = 0
            java.lang.Object r13 = r11.getKey()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r11.getValue()
            java.util.Collection r14 = (java.util.Collection) r14
            r15 = r14
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            r16 = 0
            r17 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r15, r3)
            r2.<init>(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = r15
            r18 = 0
            java.util.Iterator r19 = r3.iterator()
        L60:
            boolean r20 = r19.hasNext()
            if (r20 == 0) goto L87
            java.lang.Object r20 = r19.next()
            r21 = r3
            r3 = r20
            java.lang.String r3 = (java.lang.String) r3
            r22 = 0
            r23 = r4
            org.luckypray.dexkit.query.matchers.base.StringMatcher r4 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r24 = r5
            r5 = r28
            r4.<init>(r3, r1, r5)
            r2.add(r4)
            r3 = r21
            r4 = r23
            r5 = r24
            goto L60
        L87:
            r21 = r3
            r23 = r4
            r24 = r5
            r5 = r28
            java.util.List r2 = (java.util.List) r2
            java.util.Collection r2 = (java.util.Collection) r2
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r3 = new org.luckypray.dexkit.query.matchers.StringMatchersGroup
            r3.<init>(r13, r2)
            r7.add(r3)
            r3 = r26
            r2 = r17
            r5 = r24
            goto L2c
        La3:
            r17 = r2
            r2 = r7
            java.util.List r2 = (java.util.List) r2
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.List r2 = kotlin.collections.CollectionsKt.toMutableList(r2)
            r0.searchGroups = r2
            r2 = r0
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r2 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r2
            return r2
    }

    public final org.luckypray.dexkit.query.BatchFindClassUsingStrings ignorePackagesCase(boolean r3) {
            r2 = this;
            r0 = r2
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r0
            r1 = 0
            r2.ignorePackagesCase = r3
            r0 = r2
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r0
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    protected int innerBuild(com.google.flatbuffers.FlatBufferBuilder r18) {
            r17 = this;
            r0 = r17
            r8 = r18
            java.lang.String r1 = "fbb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            java.util.List<org.luckypray.dexkit.query.matchers.StringMatchersGroup> r1 = r0.searchGroups
            if (r1 == 0) goto L1a0
            java.util.List<org.luckypray.dexkit.query.matchers.StringMatchersGroup> r1 = r0.searchGroups
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 0
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r4)
            r3.<init>(r5)
            java.util.Collection r3 = (java.util.Collection) r3
            r5 = r1
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L28:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L3e
            java.lang.Object r9 = r7.next()
            r10 = r9
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r10 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r10
            r11 = 0
            java.lang.String r10 = r10.getGroupName()
            r3.add(r10)
            goto L28
        L3e:
            java.util.List r3 = (java.util.List) r3
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Set r1 = kotlin.collections.CollectionsKt.toSet(r3)
            int r1 = r1.size()
            java.util.List<org.luckypray.dexkit.query.matchers.StringMatchersGroup> r2 = r0.searchGroups
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r2 = r2.size()
            if (r1 < r2) goto L198
            org.luckypray.dexkit.schema.-BatchFindClassUsingStrings$Companion r1 = org.luckypray.dexkit.schema.BatchFindClassUsingStrings.Companion
            java.util.Collection<java.lang.String> r2 = r0.searchPackages
            r3 = 0
            if (r2 == 0) goto La6
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r5 = 0
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r4)
            r6.<init>(r7)
            java.util.Collection r6 = (java.util.Collection) r6
            r7 = r2
            r9 = 0
            java.util.Iterator r10 = r7.iterator()
        L73:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L90
            java.lang.Object r11 = r10.next()
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            r13 = 0
            r14 = r12
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            int r12 = r8.createString(r14)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r6.add(r12)
            goto L73
        L90:
            java.util.List r6 = (java.util.List) r6
            java.util.Collection r6 = (java.util.Collection) r6
            int[] r2 = kotlin.collections.CollectionsKt.toIntArray(r6)
            if (r2 == 0) goto La6
        L9f:
            r5 = 0
            int r2 = r8.createVectorOfTables(r2)
            r5 = r2
            goto La7
        La6:
            r5 = r3
        La7:
            java.util.Collection<java.lang.String> r2 = r0.excludePackages
            if (r2 == 0) goto Lf2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r6 = 0
            java.util.ArrayList r7 = new java.util.ArrayList
            int r9 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r4)
            r7.<init>(r9)
            java.util.Collection r7 = (java.util.Collection) r7
            r9 = r2
            r10 = 0
            java.util.Iterator r11 = r9.iterator()
        Lbf:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Ldc
            java.lang.Object r12 = r11.next()
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13
            r14 = 0
            r15 = r13
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            int r13 = r8.createString(r15)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r7.add(r13)
            goto Lbf
        Ldc:
            java.util.List r7 = (java.util.List) r7
            java.util.Collection r7 = (java.util.Collection) r7
            int[] r2 = kotlin.collections.CollectionsKt.toIntArray(r7)
            if (r2 == 0) goto Lf2
        Leb:
            r6 = 0
            int r2 = r8.createVectorOfTables(r2)
            r6 = r2
            goto Lf3
        Lf2:
            r6 = r3
        Lf3:
            boolean r7 = r0.ignorePackagesCase
            java.util.Collection<org.luckypray.dexkit.result.ClassData> r2 = r0.searchClasses
            if (r2 == 0) goto L140
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r9 = 0
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r4)
            r10.<init>(r11)
            java.util.Collection r10 = (java.util.Collection) r10
            r11 = r2
            r12 = 0
            java.util.Iterator r13 = r11.iterator()
        L10d:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L128
            java.lang.Object r14 = r13.next()
            r15 = r14
            org.luckypray.dexkit.result.ClassData r15 = (org.luckypray.dexkit.result.ClassData) r15
            r16 = 0
            long r15 = r15.getEncodeId()
            java.lang.Long r15 = java.lang.Long.valueOf(r15)
            r10.add(r15)
            goto L10d
        L128:
            java.util.List r10 = (java.util.List) r10
            java.util.Collection r10 = (java.util.Collection) r10
            long[] r2 = kotlin.collections.CollectionsKt.toLongArray(r10)
            if (r2 == 0) goto L140
        L137:
            r3 = 0
            org.luckypray.dexkit.schema.-BatchFindClassUsingStrings$Companion r9 = org.luckypray.dexkit.schema.BatchFindClassUsingStrings.Companion
            int r2 = r9.createInClassesVector(r8, r2)
            r9 = r2
            goto L141
        L140:
            r9 = r3
        L141:
            java.util.List<org.luckypray.dexkit.query.matchers.StringMatchersGroup> r2 = r0.searchGroups
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.ArrayList r10 = new java.util.ArrayList
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r4)
            r10.<init>(r4)
            r4 = r10
            java.util.Collection r4 = (java.util.Collection) r4
            r10 = r2
            r11 = 0
            java.util.Iterator r12 = r10.iterator()
        L15b:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L17a
            java.lang.Object r13 = r12.next()
            r14 = r13
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r14 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r14
            r15 = 0
            r0 = r14
            org.luckypray.dexkit.query.base.BaseQuery r0 = (org.luckypray.dexkit.query.base.BaseQuery) r0
            int r0 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r0, r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.add(r0)
            r0 = r17
            goto L15b
        L17a:
            r0 = r4
            java.util.List r0 = (java.util.List) r0
            java.util.Collection r0 = (java.util.Collection) r0
            int[] r0 = kotlin.collections.CollectionsKt.toIntArray(r0)
            int r0 = r8.createVectorOfTables(r0)
            r2 = r18
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r9
            r7 = r0
            int r0 = r1.createBatchFindClassUsingStrings(r2, r3, r4, r5, r6, r7)
            r8.finish(r0)
            return r0
        L198:
            java.lang.IllegalAccessException r0 = new java.lang.IllegalAccessException
            java.lang.String r1 = "groupName must be unique"
            r0.<init>(r1)
            throw r0
        L1a0:
            java.lang.IllegalAccessException r0 = new java.lang.IllegalAccessException
            java.lang.String r1 = "searchGroups not be empty"
            r0.<init>(r1)
            throw r0
    }

    public final org.luckypray.dexkit.query.BatchFindClassUsingStrings searchIn(java.util.Collection<org.luckypray.dexkit.result.ClassData> r3) {
            r2 = this;
            java.lang.String r0 = "classes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r0
            r1 = 0
            r2.searchClasses = r3
            r0 = r2
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r0
            return r0
    }

    public final org.luckypray.dexkit.query.BatchFindClassUsingStrings searchPackages(java.util.Collection<java.lang.String> r3) {
            r2 = this;
            java.lang.String r0 = "searchPackages"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r0
            r1 = 0
            r2.searchPackages = r3
            r0 = r2
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r0
            return r0
    }

    public final org.luckypray.dexkit.query.BatchFindClassUsingStrings searchPackages(java.lang.String... r4) {
            r3 = this;
            java.lang.String r0 = "searchPackages"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r0
            r1 = 0
            java.util.List r2 = kotlin.collections.ArraysKt.toList(r4)
            java.util.Collection r2 = (java.util.Collection) r2
            r3.searchPackages = r2
            r0 = r3
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = (org.luckypray.dexkit.query.BatchFindClassUsingStrings) r0
            return r0
    }

    public final /* synthetic */ void setExcludePackages(java.util.Collection r1) {
            r0 = this;
            r0.excludePackages = r1
            return
    }

    public final /* synthetic */ void setIgnorePackagesCase(boolean r1) {
            r0 = this;
            r0.ignorePackagesCase = r1
            return
    }

    public final /* synthetic */ void setSearchClasses(java.util.Collection r1) {
            r0 = this;
            r0.searchClasses = r1
            return
    }

    public final /* synthetic */ void setSearchPackages(java.util.Collection r1) {
            r0 = this;
            r0.searchPackages = r1
            return
    }
}
