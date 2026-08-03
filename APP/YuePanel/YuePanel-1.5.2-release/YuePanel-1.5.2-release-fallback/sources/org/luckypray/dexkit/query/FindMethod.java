package org.luckypray.dexkit.query;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nFindMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindMethod.kt\norg/luckypray/dexkit/query/FindMethod\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n1547#2:227\n1618#2,3:228\n1547#2:232\n1618#2,3:233\n1547#2:236\n1618#2,3:237\n1547#2:240\n1618#2,3:241\n1#3:231\n*S KotlinDebug\n*F\n+ 1 FindMethod.kt\norg/luckypray/dexkit/query/FindMethod\n*L\n210#1:227\n210#1:228,3\n212#1:232\n212#1:233,3\n215#1:236\n215#1:237,3\n217#1:240\n217#1:241,3\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\u0018\u0000 :2\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0006\u001a\u00020\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u0006\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u0006\u0010\tJ!\u0010\n\u001a\u00020\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\n\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0010\u0010\tJ\u001b\u0010\u0013\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\b¢\u0006\u0004\b\u0013\u0010\tJ\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u0015\u001a\u00020\u00002\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\b\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001f\u0010 R:\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R:\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\"\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R*\u0010\f\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R:\u0010.\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\"\u001a\u0004\b/\u0010$\"\u0004\b0\u0010&R:\u00101\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\"\u001a\u0004\b2\u0010$\"\u0004\b3\u0010&R*\u00104\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010)\u001a\u0004\b5\u0010+\"\u0004\b6\u0010-R(\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010!\u001a\u0004\u0018\u00010\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u00107\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lorg/luckypray/dexkit/query/FindMethod;", "Lorg/luckypray/dexkit/query/base/BaseFinder;", "<init>", "()V", "", "", "searchPackages", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/FindMethod;", "", "(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindMethod;", "excludePackages", "", "ignorePackagesCase", "(Z)Lorg/luckypray/dexkit/query/FindMethod;", "Lorg/luckypray/dexkit/result/ClassData;", "classes", "searchInClass", "Lorg/luckypray/dexkit/result/MethodData;", "methods", "searchInMethod", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "matcher", "(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/FindMethod;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/FindMethod;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "<set-?>", "Ljava/util/Collection;", "getSearchPackages", "()Ljava/util/Collection;", "setSearchPackages", "(Ljava/util/Collection;)V", "getExcludePackages", "setExcludePackages", "Z", "getIgnorePackagesCase", "()Z", "setIgnorePackagesCase", "(Z)V", "searchClasses", "getSearchClasses", "setSearchClasses", "searchMethods", "getSearchMethods", "setSearchMethods", "findFirst", "getFindFirst", "setFindFirst", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "getMatcher", "()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class FindMethod extends org.luckypray.dexkit.query.base.BaseFinder {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.query.FindMethod.Companion Companion = null;

    @Yue.InterfaceC4543
    private java.util.Collection<java.lang.String> excludePackages;
    private boolean findFirst;
    private boolean ignorePackagesCase;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.MethodMatcher matcher;

    @Yue.InterfaceC4543
    private java.util.Collection<org.luckypray.dexkit.result.ClassData> searchClasses;

    @Yue.InterfaceC4543
    private java.util.Collection<org.luckypray.dexkit.result.MethodData> searchMethods;

    @Yue.InterfaceC4543
    private java.util.Collection<java.lang.String> searchPackages;

    @Yue.InterfaceC4201(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lorg/luckypray/dexkit/query/FindMethod$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/FindMethod;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
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

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.FindMethod create() {
            org.luckypray.dexkit.query.FindMethod$Companion r0 = org.luckypray.dexkit.query.FindMethod.Companion
            org.luckypray.dexkit.query.FindMethod r0 = r0.create()
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.FindMethod excludePackages(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r2) {
            r1 = this;
            java.lang.String r0 = "excludePackages"
            Yue.C3329.m13906(r2, r0)
            r1.excludePackages = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.FindMethod excludePackages(@Yue.InterfaceC4418 java.lang.String... r2) {
            r1 = this;
            java.lang.String r0 = "excludePackages"
            Yue.C3329.m13906(r2, r0)
            java.util.List r2 = Yue.C0595.m3982(r2)
            r1.excludePackages = r2
            return r1
    }

    @Yue.InterfaceC4543
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

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.MethodMatcher getMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r1.matcher
            return r0
    }

    @Yue.InterfaceC4543
    public final java.util.Collection<org.luckypray.dexkit.result.ClassData> getSearchClasses() {
            r1 = this;
            java.util.Collection<org.luckypray.dexkit.result.ClassData> r0 = r1.searchClasses
            return r0
    }

    @Yue.InterfaceC4543
    public final java.util.Collection<org.luckypray.dexkit.result.MethodData> getSearchMethods() {
            r1 = this;
            java.util.Collection<org.luckypray.dexkit.result.MethodData> r0 = r1.searchMethods
            return r0
    }

    @Yue.InterfaceC4543
    public final java.util.Collection<java.lang.String> getSearchPackages() {
            r1 = this;
            java.util.Collection<java.lang.String> r0 = r1.searchPackages
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.FindMethod ignorePackagesCase(boolean r1) {
            r0 = this;
            r0.ignorePackagesCase = r1
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r12) {
            r11 = this;
            java.lang.String r0 = "fbb"
            Yue.C3329.m13906(r12, r0)
            org.luckypray.dexkit.schema.-FindMethod$Companion r1 = org.luckypray.dexkit.schema.FindMethod.Companion
            java.util.Collection<java.lang.String> r0 = r11.searchPackages
            r2 = 10
            r3 = 0
            if (r0 == 0) goto L3e
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = Yue.C1210.m6231(r0, r2)
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L33
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            int r5 = r12.createString(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.add(r5)
            goto L1b
        L33:
            int[] r0 = Yue.C1219.m6536(r4)
            if (r0 == 0) goto L3e
            int r0 = r12.createVectorOfTables(r0)
            goto L3f
        L3e:
            r0 = r3
        L3f:
            java.util.Collection<java.lang.String> r4 = r11.excludePackages
            if (r4 == 0) goto L73
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = Yue.C1210.m6231(r4, r2)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L50:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L68
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r12.createString(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.add(r6)
            goto L50
        L68:
            int[] r4 = Yue.C1219.m6536(r5)
            if (r4 == 0) goto L73
            int r4 = r12.createVectorOfTables(r4)
            goto L74
        L73:
            r4 = r3
        L74:
            boolean r5 = r11.ignorePackagesCase
            java.util.Collection<org.luckypray.dexkit.result.ClassData> r6 = r11.searchClasses
            if (r6 == 0) goto Lac
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = Yue.C1210.m6231(r6, r2)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L87:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L9f
            java.lang.Object r8 = r6.next()
            org.luckypray.dexkit.result.ClassData r8 = (org.luckypray.dexkit.result.ClassData) r8
            long r8 = r8.getEncodeId()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r7.add(r8)
            goto L87
        L9f:
            long[] r6 = Yue.C1219.m6538(r7)
            if (r6 == 0) goto Lac
            org.luckypray.dexkit.schema.-FindMethod$Companion r7 = org.luckypray.dexkit.schema.FindMethod.Companion
            int r6 = r7.createInClassesVector(r12, r6)
            goto Lad
        Lac:
            r6 = r3
        Lad:
            java.util.Collection<org.luckypray.dexkit.result.MethodData> r7 = r11.searchMethods
            if (r7 == 0) goto Le4
            java.util.ArrayList r8 = new java.util.ArrayList
            int r2 = Yue.C1210.m6231(r7, r2)
            r8.<init>(r2)
            java.util.Iterator r2 = r7.iterator()
        Lbe:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto Ld6
            java.lang.Object r7 = r2.next()
            org.luckypray.dexkit.result.MethodData r7 = (org.luckypray.dexkit.result.MethodData) r7
            long r9 = r7.getEncodeId()
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r8.add(r7)
            goto Lbe
        Ld6:
            long[] r2 = Yue.C1219.m6538(r8)
            if (r2 == 0) goto Le4
            org.luckypray.dexkit.schema.-FindMethod$Companion r7 = org.luckypray.dexkit.schema.FindMethod.Companion
            int r2 = r7.createInMethodsVector(r12, r2)
            r7 = r2
            goto Le5
        Le4:
            r7 = r3
        Le5:
            boolean r8 = r11.findFirst
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = r11.matcher
            if (r2 == 0) goto Lf1
            int r2 = r2.build$dexkit_android_release(r12)
            r9 = r2
            goto Lf2
        Lf1:
            r9 = r3
        Lf2:
            r2 = r12
            r3 = r0
            int r0 = r1.createFindMethod(r2, r3, r4, r5, r6, r7, r8, r9)
            r12.finish(r0)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.FindMethod matcher(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.matcher(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.FindMethod matcher(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            java.lang.String r0 = "matcher"
            Yue.C3329.m13906(r2, r0)
            r1.matcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.FindMethod searchInClass(@Yue.InterfaceC4418 java.util.Collection<org.luckypray.dexkit.result.ClassData> r2) {
            r1 = this;
            java.lang.String r0 = "classes"
            Yue.C3329.m13906(r2, r0)
            r1.searchClasses = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.FindMethod searchInMethod(@Yue.InterfaceC4418 java.util.Collection<org.luckypray.dexkit.result.MethodData> r2) {
            r1 = this;
            java.lang.String r0 = "methods"
            Yue.C3329.m13906(r2, r0)
            r1.searchMethods = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.FindMethod searchPackages(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r2) {
            r1 = this;
            java.lang.String r0 = "searchPackages"
            Yue.C3329.m13906(r2, r0)
            r1.searchPackages = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.FindMethod searchPackages(@Yue.InterfaceC4418 java.lang.String... r2) {
            r1 = this;
            java.lang.String r0 = "searchPackages"
            Yue.C3329.m13906(r2, r0)
            java.util.List r2 = Yue.C0595.m3982(r2)
            r1.searchPackages = r2
            return r1
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
