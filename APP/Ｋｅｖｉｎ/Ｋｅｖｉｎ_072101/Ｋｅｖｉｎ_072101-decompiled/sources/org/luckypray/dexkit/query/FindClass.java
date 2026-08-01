package org.luckypray.dexkit.query;

/* JADX INFO: compiled from: FindClass.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0006\u001a\u00020\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u001f\"\u00020\u0005¢\u0006\u0002\u0010 J\u0014\u0010\u0006\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000bJ\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014J%\u0010\u0015\u001a\u00020\u00002\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020'0&¢\u0006\u0002\b(H\u0087\bø\u0001\u0000J\u0014\u0010)\u001a\u00020\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004J\u001f\u0010\u001c\u001a\u00020\u00002\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u001f\"\u00020\u0005¢\u0006\u0002\u0010 J\u0014\u0010\u001c\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R4\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0014@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R4\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001b\u0010\nR4\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001e\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006,"}, m115d2 = {"Lorg/luckypray/dexkit/query/FindClass;", "Lorg/luckypray/dexkit/query/base/BaseQuery;", "()V", "<set-?>", "", "", "excludePackages", "getExcludePackages", "()Ljava/util/Collection;", "setExcludePackages", "(Ljava/util/Collection;)V", "", "findFirst", "getFindFirst", "()Z", "setFindFirst", "(Z)V", "ignorePackagesCase", "getIgnorePackagesCase", "setIgnorePackagesCase", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "matcher", "getMatcher", "()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Lorg/luckypray/dexkit/result/ClassData;", "searchClasses", "getSearchClasses", "setSearchClasses", "searchPackages", "getSearchPackages", "setSearchPackages", "", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/FindClass;", "innerBuild", "", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "searchIn", "classes", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class FindClass extends org.luckypray.dexkit.query.base.BaseQuery {
    public static final org.luckypray.dexkit.query.FindClass.Companion Companion = null;
    private java.util.Collection<java.lang.String> excludePackages;
    private boolean findFirst;
    private boolean ignorePackagesCase;
    private org.luckypray.dexkit.query.matchers.ClassMatcher matcher;
    private java.util.Collection<org.luckypray.dexkit.result.ClassData> searchClasses;
    private java.util.Collection<java.lang.String> searchPackages;

    /* JADX INFO: compiled from: FindClass.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m115d2 = {"Lorg/luckypray/dexkit/query/FindClass$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/FindClass;", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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
        public final org.luckypray.dexkit.query.FindClass create() {
                r1 = this;
                org.luckypray.dexkit.query.FindClass r0 = new org.luckypray.dexkit.query.FindClass
                r0.<init>()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.FindClass$Companion r0 = new org.luckypray.dexkit.query.FindClass$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.FindClass.Companion = r0
            return
    }

    public FindClass() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.FindClass create() {
            org.luckypray.dexkit.query.FindClass$Companion r0 = org.luckypray.dexkit.query.FindClass.Companion
            org.luckypray.dexkit.query.FindClass r0 = r0.create()
            return r0
    }

    private final org.luckypray.dexkit.query.FindClass matcher(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.ClassMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.FindClass r0 = (org.luckypray.dexkit.query.FindClass) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.matcher(r2)
            r0 = r3
            org.luckypray.dexkit.query.FindClass r0 = (org.luckypray.dexkit.query.FindClass) r0
            return r0
    }

    public final org.luckypray.dexkit.query.FindClass excludePackages(java.util.Collection<java.lang.String> r3) {
            r2 = this;
            java.lang.String r0 = "excludePackages"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.FindClass r0 = (org.luckypray.dexkit.query.FindClass) r0
            r1 = 0
            r2.excludePackages = r3
            r0 = r2
            org.luckypray.dexkit.query.FindClass r0 = (org.luckypray.dexkit.query.FindClass) r0
            return r0
    }

    public final org.luckypray.dexkit.query.FindClass excludePackages(java.lang.String... r4) {
            r3 = this;
            java.lang.String r0 = "excludePackages"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.FindClass r0 = (org.luckypray.dexkit.query.FindClass) r0
            r1 = 0
            java.util.List r2 = kotlin.collections.ArraysKt.toList(r4)
            java.util.Collection r2 = (java.util.Collection) r2
            r3.excludePackages = r2
            r0 = r3
            org.luckypray.dexkit.query.FindClass r0 = (org.luckypray.dexkit.query.FindClass) r0
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

    public final org.luckypray.dexkit.query.matchers.ClassMatcher getMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r1.matcher
            return r0
    }

    public final java.util.Collection<org.luckypray.dexkit.result.ClassData> getSearchClasses() {
            r1 = this;
            java.util.Collection<org.luckypray.dexkit.result.ClassData> r0 = r1.searchClasses
            return r0
    }

    public final java.util.Collection<java.lang.String> getSearchPackages() {
            r1 = this;
            java.util.Collection<java.lang.String> r0 = r1.searchPackages
            return r0
    }

    public final org.luckypray.dexkit.query.FindClass ignorePackagesCase(boolean r3) {
            r2 = this;
            r0 = r2
            org.luckypray.dexkit.query.FindClass r0 = (org.luckypray.dexkit.query.FindClass) r0
            r1 = 0
            r2.ignorePackagesCase = r3
            r0 = r2
            org.luckypray.dexkit.query.FindClass r0 = (org.luckypray.dexkit.query.FindClass) r0
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    protected int innerBuild(com.google.flatbuffers.FlatBufferBuilder r15) {
            r14 = this;
            java.lang.String r0 = "fbb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            org.luckypray.dexkit.schema.-FindClass$Companion r1 = org.luckypray.dexkit.schema.FindClass.Companion
            java.util.Collection<java.lang.String> r0 = r14.searchPackages
            r2 = 10
            r3 = 0
            if (r0 == 0) goto L55
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r4 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r2)
            r5.<init>(r6)
            java.util.Collection r5 = (java.util.Collection) r5
            r6 = r0
            r7 = 0
            java.util.Iterator r8 = r6.iterator()
        L23:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L40
            java.lang.Object r9 = r8.next()
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            r11 = 0
            r12 = r10
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            int r10 = r15.createString(r12)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r5.add(r10)
            goto L23
        L40:
            java.util.List r5 = (java.util.List) r5
            java.util.Collection r5 = (java.util.Collection) r5
            int[] r0 = kotlin.collections.CollectionsKt.toIntArray(r5)
            if (r0 == 0) goto L55
        L4f:
            r4 = 0
            int r0 = r15.createVectorOfTables(r0)
            goto L56
        L55:
            r0 = r3
        L56:
            java.util.Collection<java.lang.String> r4 = r14.excludePackages
            if (r4 == 0) goto La0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r5 = 0
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r4, r2)
            r6.<init>(r7)
            java.util.Collection r6 = (java.util.Collection) r6
            r7 = r4
            r8 = 0
            java.util.Iterator r9 = r7.iterator()
        L6e:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L8b
            java.lang.Object r10 = r9.next()
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
            r12 = 0
            r13 = r11
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            int r11 = r15.createString(r13)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r6.add(r11)
            goto L6e
        L8b:
            java.util.List r6 = (java.util.List) r6
            java.util.Collection r6 = (java.util.Collection) r6
            int[] r4 = kotlin.collections.CollectionsKt.toIntArray(r6)
            if (r4 == 0) goto La0
        L9a:
            r5 = 0
            int r4 = r15.createVectorOfTables(r4)
            goto La1
        La0:
            r4 = r3
        La1:
            boolean r5 = r14.ignorePackagesCase
            java.util.Collection<org.luckypray.dexkit.result.ClassData> r6 = r14.searchClasses
            if (r6 == 0) goto Lee
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r7 = 0
            java.util.ArrayList r8 = new java.util.ArrayList
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r6, r2)
            r8.<init>(r2)
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2
            r8 = r6
            r9 = 0
            java.util.Iterator r10 = r8.iterator()
        Lbc:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Ld6
            java.lang.Object r11 = r10.next()
            r12 = r11
            org.luckypray.dexkit.result.ClassData r12 = (org.luckypray.dexkit.result.ClassData) r12
            r13 = 0
            long r12 = r12.getEncodeId()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r2.add(r12)
            goto Lbc
        Ld6:
            java.util.List r2 = (java.util.List) r2
            java.util.Collection r2 = (java.util.Collection) r2
            long[] r2 = kotlin.collections.CollectionsKt.toLongArray(r2)
            if (r2 == 0) goto Lee
        Le5:
            r6 = 0
            org.luckypray.dexkit.schema.-FindClass$Companion r7 = org.luckypray.dexkit.schema.FindClass.Companion
            int r2 = r7.createInClassesVector(r15, r2)
            r6 = r2
            goto Lef
        Lee:
            r6 = r3
        Lef:
            boolean r7 = r14.findFirst
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r14.matcher
            if (r2 == 0) goto Lfd
            org.luckypray.dexkit.query.base.BaseQuery r2 = (org.luckypray.dexkit.query.base.BaseQuery) r2
            int r2 = org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r2, r15)
            r8 = r2
            goto Lfe
        Lfd:
            r8 = r3
        Lfe:
            r2 = r15
            r3 = r0
            int r0 = r1.createFindClass(r2, r3, r4, r5, r6, r7, r8)
            r15.finish(r0)
            return r0
    }

    public final org.luckypray.dexkit.query.FindClass matcher(org.luckypray.dexkit.query.matchers.ClassMatcher r3) {
            r2 = this;
            java.lang.String r0 = "matcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.FindClass r0 = (org.luckypray.dexkit.query.FindClass) r0
            r1 = 0
            r2.matcher = r3
            r0 = r2
            org.luckypray.dexkit.query.FindClass r0 = (org.luckypray.dexkit.query.FindClass) r0
            return r0
    }

    public final org.luckypray.dexkit.query.FindClass searchIn(java.util.Collection<org.luckypray.dexkit.result.ClassData> r3) {
            r2 = this;
            java.lang.String r0 = "classes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.FindClass r0 = (org.luckypray.dexkit.query.FindClass) r0
            r1 = 0
            r2.searchClasses = r3
            r0 = r2
            org.luckypray.dexkit.query.FindClass r0 = (org.luckypray.dexkit.query.FindClass) r0
            return r0
    }

    public final org.luckypray.dexkit.query.FindClass searchPackages(java.util.Collection<java.lang.String> r3) {
            r2 = this;
            java.lang.String r0 = "searchPackages"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.FindClass r0 = (org.luckypray.dexkit.query.FindClass) r0
            r1 = 0
            r2.searchPackages = r3
            r0 = r2
            org.luckypray.dexkit.query.FindClass r0 = (org.luckypray.dexkit.query.FindClass) r0
            return r0
    }

    public final org.luckypray.dexkit.query.FindClass searchPackages(java.lang.String... r4) {
            r3 = this;
            java.lang.String r0 = "searchPackages"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.FindClass r0 = (org.luckypray.dexkit.query.FindClass) r0
            r1 = 0
            java.util.List r2 = kotlin.collections.ArraysKt.toList(r4)
            java.util.Collection r2 = (java.util.Collection) r2
            r3.searchPackages = r2
            r0 = r3
            org.luckypray.dexkit.query.FindClass r0 = (org.luckypray.dexkit.query.FindClass) r0
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

    public final /* synthetic */ void setSearchPackages(java.util.Collection r1) {
            r0 = this;
            r0.searchPackages = r1
            return
    }
}
