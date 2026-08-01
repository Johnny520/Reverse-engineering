package org.luckypray.dexkit.query;

/* JADX INFO: compiled from: FindMethod.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 12\u00020\u0001:\u00011B\u0005¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0006\u001a\u00020\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050#\"\u00020\u0005¢\u0006\u0002\u0010$J\u0014\u0010\u0006\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000bJ\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014J%\u0010\u0015\u001a\u00020\u00002\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020+0*¢\u0006\u0002\b,H\u0087\bø\u0001\u0000J\u0014\u0010-\u001a\u00020\u00002\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004J\u0014\u0010/\u001a\u00020\u00002\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004J\u001f\u0010 \u001a\u00020\u00002\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050#\"\u00020\u0005¢\u0006\u0002\u0010$J\u0014\u0010 \u001a\u00020\u00002\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R4\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0014@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R4\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001b\u0010\nR4\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR4\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00062"}, m115d2 = {"Lorg/luckypray/dexkit/query/FindMethod;", "Lorg/luckypray/dexkit/query/base/BaseQuery;", "()V", "<set-?>", "", "", "excludePackages", "getExcludePackages", "()Ljava/util/Collection;", "setExcludePackages", "(Ljava/util/Collection;)V", "", "findFirst", "getFindFirst", "()Z", "setFindFirst", "(Z)V", "ignorePackagesCase", "getIgnorePackagesCase", "setIgnorePackagesCase", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "matcher", "getMatcher", "()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/result/ClassData;", "searchClasses", "getSearchClasses", "setSearchClasses", "Lorg/luckypray/dexkit/result/MethodData;", "searchMethods", "getSearchMethods", "setSearchMethods", "searchPackages", "getSearchPackages", "setSearchPackages", "", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/FindMethod;", "innerBuild", "", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "searchInClass", "classes", "searchInMethod", "methods", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class FindMethod extends org.luckypray.dexkit.query.base.BaseQuery {
    public static final org.luckypray.dexkit.query.FindMethod.Companion Companion = null;
    private java.util.Collection<java.lang.String> excludePackages;
    private boolean findFirst;
    private boolean ignorePackagesCase;
    private org.luckypray.dexkit.query.matchers.MethodMatcher matcher;
    private java.util.Collection<org.luckypray.dexkit.result.ClassData> searchClasses;
    private java.util.Collection<org.luckypray.dexkit.result.MethodData> searchMethods;
    private java.util.Collection<java.lang.String> searchPackages;

    /* JADX INFO: compiled from: FindMethod.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m115d2 = {"Lorg/luckypray/dexkit/query/FindMethod$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/FindMethod;", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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
        public final org.luckypray.dexkit.query.FindMethod create() {
                r1 = this;
                org.luckypray.dexkit.query.FindMethod r0 = new org.luckypray.dexkit.query.FindMethod
                r0.<init>()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.FindMethod$Companion r0 = new org.luckypray.dexkit.query.FindMethod$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.FindMethod.Companion = r0
            return
    }

    public FindMethod() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.FindMethod create() {
            org.luckypray.dexkit.query.FindMethod$Companion r0 = org.luckypray.dexkit.query.FindMethod.Companion
            org.luckypray.dexkit.query.FindMethod r0 = r0.create()
            return r0
    }

    private final org.luckypray.dexkit.query.FindMethod matcher(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.MethodMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.matcher(r2)
            r0 = r3
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            return r0
    }

    public final org.luckypray.dexkit.query.FindMethod excludePackages(java.util.Collection<java.lang.String> r3) {
            r2 = this;
            java.lang.String r0 = "excludePackages"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            r1 = 0
            r2.excludePackages = r3
            r0 = r2
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            return r0
    }

    public final org.luckypray.dexkit.query.FindMethod excludePackages(java.lang.String... r4) {
            r3 = this;
            java.lang.String r0 = "excludePackages"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            r1 = 0
            java.util.List r2 = kotlin.collections.ArraysKt.toList(r4)
            java.util.Collection r2 = (java.util.Collection) r2
            r3.excludePackages = r2
            r0 = r3
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            return r0
    }

    public final java.util.Collection<java.lang.String> getExcludePackages() {
            r1 = this;
            java.util.Collection<java.lang.String> r0 = r1.excludePackages
            return r0
    }

    public final boolean getFindFirst() {
            r1 = this;
            boolean r0 = r1.findFirst
            return r0
    }

    public final boolean getIgnorePackagesCase() {
            r1 = this;
            boolean r0 = r1.ignorePackagesCase
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher getMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r1.matcher
            return r0
    }

    public final java.util.Collection<org.luckypray.dexkit.result.ClassData> getSearchClasses() {
            r1 = this;
            java.util.Collection<org.luckypray.dexkit.result.ClassData> r0 = r1.searchClasses
            return r0
    }

    public final java.util.Collection<org.luckypray.dexkit.result.MethodData> getSearchMethods() {
            r1 = this;
            java.util.Collection<org.luckypray.dexkit.result.MethodData> r0 = r1.searchMethods
            return r0
    }

    public final java.util.Collection<java.lang.String> getSearchPackages() {
            r1 = this;
            java.util.Collection<java.lang.String> r0 = r1.searchPackages
            return r0
    }

    public final org.luckypray.dexkit.query.FindMethod ignorePackagesCase(boolean r3) {
            r2 = this;
            r0 = r2
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            r1 = 0
            r2.ignorePackagesCase = r3
            r0 = r2
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    protected int innerBuild(com.google.flatbuffers.FlatBufferBuilder r18) {
            r17 = this;
            r0 = r17
            r10 = r18
            java.lang.String r1 = "fbb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            org.luckypray.dexkit.schema.-FindMethod$Companion r1 = org.luckypray.dexkit.schema.FindMethod.Companion
            java.util.Collection<java.lang.String> r2 = r0.searchPackages
            r3 = 10
            r4 = 0
            if (r2 == 0) goto L5a
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r5 = 0
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r3)
            r6.<init>(r7)
            java.util.Collection r6 = (java.util.Collection) r6
            r7 = r2
            r8 = 0
            java.util.Iterator r9 = r7.iterator()
        L27:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L44
            java.lang.Object r11 = r9.next()
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            r13 = 0
            r14 = r12
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            int r12 = r10.createString(r14)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r6.add(r12)
            goto L27
        L44:
            java.util.List r6 = (java.util.List) r6
            java.util.Collection r6 = (java.util.Collection) r6
            int[] r2 = kotlin.collections.CollectionsKt.toIntArray(r6)
            if (r2 == 0) goto L5a
        L53:
            r5 = 0
            int r2 = r10.createVectorOfTables(r2)
            r5 = r2
            goto L5b
        L5a:
            r5 = r4
        L5b:
            java.util.Collection<java.lang.String> r2 = r0.excludePackages
            if (r2 == 0) goto La6
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r6 = 0
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r3)
            r7.<init>(r8)
            java.util.Collection r7 = (java.util.Collection) r7
            r8 = r2
            r9 = 0
            java.util.Iterator r11 = r8.iterator()
        L73:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L90
            java.lang.Object r12 = r11.next()
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13
            r14 = 0
            r15 = r13
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            int r13 = r10.createString(r15)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r7.add(r13)
            goto L73
        L90:
            java.util.List r7 = (java.util.List) r7
            java.util.Collection r7 = (java.util.Collection) r7
            int[] r2 = kotlin.collections.CollectionsKt.toIntArray(r7)
            if (r2 == 0) goto La6
        L9f:
            r6 = 0
            int r2 = r10.createVectorOfTables(r2)
            r6 = r2
            goto La7
        La6:
            r6 = r4
        La7:
            boolean r7 = r0.ignorePackagesCase
            java.util.Collection<org.luckypray.dexkit.result.ClassData> r2 = r0.searchClasses
            if (r2 == 0) goto Lf4
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r8 = 0
            java.util.ArrayList r9 = new java.util.ArrayList
            int r11 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r3)
            r9.<init>(r11)
            java.util.Collection r9 = (java.util.Collection) r9
            r11 = r2
            r12 = 0
            java.util.Iterator r13 = r11.iterator()
        Lc1:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto Ldc
            java.lang.Object r14 = r13.next()
            r15 = r14
            org.luckypray.dexkit.result.ClassData r15 = (org.luckypray.dexkit.result.ClassData) r15
            r16 = 0
            long r15 = r15.getEncodeId()
            java.lang.Long r15 = java.lang.Long.valueOf(r15)
            r9.add(r15)
            goto Lc1
        Ldc:
            java.util.List r9 = (java.util.List) r9
            java.util.Collection r9 = (java.util.Collection) r9
            long[] r2 = kotlin.collections.CollectionsKt.toLongArray(r9)
            if (r2 == 0) goto Lf4
        Leb:
            r8 = 0
            org.luckypray.dexkit.schema.-FindMethod$Companion r9 = org.luckypray.dexkit.schema.FindMethod.Companion
            int r2 = r9.createInClassesVector(r10, r2)
            r8 = r2
            goto Lf5
        Lf4:
            r8 = r4
        Lf5:
            java.util.Collection<org.luckypray.dexkit.result.MethodData> r2 = r0.searchMethods
            if (r2 == 0) goto L141
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r9 = 0
            java.util.ArrayList r11 = new java.util.ArrayList
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r3)
            r11.<init>(r3)
            r3 = r11
            java.util.Collection r3 = (java.util.Collection) r3
            r11 = r2
            r12 = 0
            java.util.Iterator r13 = r11.iterator()
        L10e:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L129
            java.lang.Object r14 = r13.next()
            r15 = r14
            org.luckypray.dexkit.result.MethodData r15 = (org.luckypray.dexkit.result.MethodData) r15
            r16 = 0
            long r15 = r15.getEncodeId()
            java.lang.Long r15 = java.lang.Long.valueOf(r15)
            r3.add(r15)
            goto L10e
        L129:
            java.util.List r3 = (java.util.List) r3
            java.util.Collection r3 = (java.util.Collection) r3
            long[] r2 = kotlin.collections.CollectionsKt.toLongArray(r3)
            if (r2 == 0) goto L141
        L138:
            r3 = 0
            org.luckypray.dexkit.schema.-FindMethod$Companion r9 = org.luckypray.dexkit.schema.FindMethod.Companion
            int r2 = r9.createInMethodsVector(r10, r2)
            r9 = r2
            goto L142
        L141:
            r9 = r4
        L142:
            boolean r11 = r0.findFirst
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = r0.matcher
            if (r2 == 0) goto L150
            org.luckypray.dexkit.query.base.BaseQuery r2 = (org.luckypray.dexkit.query.base.BaseQuery) r2
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r2, r10)
            r12 = r2
            goto L151
        L150:
            r12 = r4
        L151:
            r2 = r18
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r11
            r9 = r12
            int r1 = r1.createFindMethod(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.finish(r1)
            return r1
    }

    public final org.luckypray.dexkit.query.FindMethod matcher(org.luckypray.dexkit.query.matchers.MethodMatcher r3) {
            r2 = this;
            java.lang.String r0 = "matcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            r1 = 0
            r2.matcher = r3
            r0 = r2
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            return r0
    }

    public final org.luckypray.dexkit.query.FindMethod searchInClass(java.util.Collection<org.luckypray.dexkit.result.ClassData> r3) {
            r2 = this;
            java.lang.String r0 = "classes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            r1 = 0
            r2.searchClasses = r3
            r0 = r2
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            return r0
    }

    public final org.luckypray.dexkit.query.FindMethod searchInMethod(java.util.Collection<org.luckypray.dexkit.result.MethodData> r3) {
            r2 = this;
            java.lang.String r0 = "methods"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            r1 = 0
            r2.searchMethods = r3
            r0 = r2
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            return r0
    }

    public final org.luckypray.dexkit.query.FindMethod searchPackages(java.util.Collection<java.lang.String> r3) {
            r2 = this;
            java.lang.String r0 = "searchPackages"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            r1 = 0
            r2.searchPackages = r3
            r0 = r2
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            return r0
    }

    public final org.luckypray.dexkit.query.FindMethod searchPackages(java.lang.String... r4) {
            r3 = this;
            java.lang.String r0 = "searchPackages"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            r1 = 0
            java.util.List r2 = kotlin.collections.ArraysKt.toList(r4)
            java.util.Collection r2 = (java.util.Collection) r2
            r3.searchPackages = r2
            r0 = r3
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            return r0
    }

    public final /* synthetic */ void setExcludePackages(java.util.Collection r1) {
            r0 = this;
            r0.excludePackages = r1
            return
    }

    public final /* synthetic */ void setFindFirst(boolean r1) {
            r0 = this;
            r0.findFirst = r1
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

    public final /* synthetic */ void setSearchMethods(java.util.Collection r1) {
            r0 = this;
            r0.searchMethods = r1
            return
    }

    public final /* synthetic */ void setSearchPackages(java.util.Collection r1) {
            r0 = this;
            r0.searchPackages = r1
            return
    }
}
