package org.luckypray.dexkit.query;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nFindClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindClass.kt\norg/luckypray/dexkit/query/FindClass\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1547#2:205\n1618#2,3:206\n1547#2:210\n1618#2,3:211\n1547#2:214\n1618#2,3:215\n1#3:209\n*S KotlinDebug\n*F\n+ 1 FindClass.kt\norg/luckypray/dexkit/query/FindClass\n*L\n191#1:205\n191#1:206,3\n193#1:210\n193#1:211,3\n196#1:214\n196#1:215,3\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\u0018\u0000 42\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0006\u001a\u00020\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u0006\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u0006\u0010\tJ!\u0010\n\u001a\u00020\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\n\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0010\u0010\tJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0012\u001a\u00020\u00002\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001dR:\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R:\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R*\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R:\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010!\"\u0004\b-\u0010#R*\u0010.\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010&\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R(\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u00101\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lorg/luckypray/dexkit/query/FindClass;", "Lorg/luckypray/dexkit/query/base/BaseFinder;", "<init>", "()V", "", "", "searchPackages", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/FindClass;", "", "(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindClass;", "excludePackages", "", "ignorePackagesCase", "(Z)Lorg/luckypray/dexkit/query/FindClass;", "Lorg/luckypray/dexkit/result/ClassData;", "classes", "searchIn", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "matcher", "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/FindClass;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/FindClass;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "<set-?>", "Ljava/util/Collection;", "getSearchPackages", "()Ljava/util/Collection;", "setSearchPackages", "(Ljava/util/Collection;)V", "getExcludePackages", "setExcludePackages", "Z", "getIgnorePackagesCase", "()Z", "setIgnorePackagesCase", "(Z)V", "searchClasses", "getSearchClasses", "setSearchClasses", "findFirst", "getFindFirst", "setFindFirst", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "getMatcher", "()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class FindClass extends org.luckypray.dexkit.query.base.BaseFinder {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.query.FindClass.Companion Companion = null;

    @Yue.InterfaceC4543
    private java.util.Collection<java.lang.String> excludePackages;
    private boolean findFirst;
    private boolean ignorePackagesCase;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.ClassMatcher matcher;

    @Yue.InterfaceC4543
    private java.util.Collection<org.luckypray.dexkit.result.ClassData> searchClasses;

    @Yue.InterfaceC4543
    private java.util.Collection<java.lang.String> searchPackages;

    @Yue.InterfaceC4201(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lorg/luckypray/dexkit/query/FindClass$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/FindClass;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.FindClass create() {
            org.luckypray.dexkit.query.FindClass$Companion r0 = org.luckypray.dexkit.query.FindClass.Companion
            org.luckypray.dexkit.query.FindClass r0 = r0.create()
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.FindClass excludePackages(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r2) {
            r1 = this;
            java.lang.String r0 = "excludePackages"
            Yue.C3329.m13906(r2, r0)
            r1.excludePackages = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.FindClass excludePackages(@Yue.InterfaceC4418 java.lang.String... r2) {
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
    public final org.luckypray.dexkit.query.matchers.ClassMatcher getMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r1.matcher
            return r0
    }

    @Yue.InterfaceC4543
    public final java.util.Collection<org.luckypray.dexkit.result.ClassData> getSearchClasses() {
            r1 = this;
            java.util.Collection<org.luckypray.dexkit.result.ClassData> r0 = r1.searchClasses
            return r0
    }

    @Yue.InterfaceC4543
    public final java.util.Collection<java.lang.String> getSearchPackages() {
            r1 = this;
            java.util.Collection<java.lang.String> r0 = r1.searchPackages
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.FindClass ignorePackagesCase(boolean r1) {
            r0 = this;
            r0.ignorePackagesCase = r1
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r11) {
            r10 = this;
            java.lang.String r0 = "fbb"
            Yue.C3329.m13906(r11, r0)
            org.luckypray.dexkit.schema.-FindClass$Companion r1 = org.luckypray.dexkit.schema.FindClass.Companion
            java.util.Collection<java.lang.String> r0 = r10.searchPackages
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
            int r5 = r11.createString(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.add(r5)
            goto L1b
        L33:
            int[] r0 = Yue.C1219.m6536(r4)
            if (r0 == 0) goto L3e
            int r0 = r11.createVectorOfTables(r0)
            goto L3f
        L3e:
            r0 = r3
        L3f:
            java.util.Collection<java.lang.String> r4 = r10.excludePackages
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
            int r6 = r11.createString(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.add(r6)
            goto L50
        L68:
            int[] r4 = Yue.C1219.m6536(r5)
            if (r4 == 0) goto L73
            int r4 = r11.createVectorOfTables(r4)
            goto L74
        L73:
            r4 = r3
        L74:
            boolean r5 = r10.ignorePackagesCase
            java.util.Collection<org.luckypray.dexkit.result.ClassData> r6 = r10.searchClasses
            if (r6 == 0) goto Lad
            java.util.ArrayList r7 = new java.util.ArrayList
            int r2 = Yue.C1210.m6231(r6, r2)
            r7.<init>(r2)
            java.util.Iterator r2 = r6.iterator()
        L87:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L9f
            java.lang.Object r6 = r2.next()
            org.luckypray.dexkit.result.ClassData r6 = (org.luckypray.dexkit.result.ClassData) r6
            long r8 = r6.getEncodeId()
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            r7.add(r6)
            goto L87
        L9f:
            long[] r2 = Yue.C1219.m6538(r7)
            if (r2 == 0) goto Lad
            org.luckypray.dexkit.schema.-FindClass$Companion r6 = org.luckypray.dexkit.schema.FindClass.Companion
            int r2 = r6.createInClassesVector(r11, r2)
            r6 = r2
            goto Lae
        Lad:
            r6 = r3
        Lae:
            boolean r7 = r10.findFirst
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r10.matcher
            if (r2 == 0) goto Lba
            int r2 = r2.build$dexkit_android_release(r11)
            r8 = r2
            goto Lbb
        Lba:
            r8 = r3
        Lbb:
            r2 = r11
            r3 = r0
            int r0 = r1.createFindClass(r2, r3, r4, r5, r6, r7, r8)
            r11.finish(r0)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.FindClass matcher(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.matcher(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.FindClass matcher(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            java.lang.String r0 = "matcher"
            Yue.C3329.m13906(r2, r0)
            r1.matcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.FindClass searchIn(@Yue.InterfaceC4418 java.util.Collection<org.luckypray.dexkit.result.ClassData> r2) {
            r1 = this;
            java.lang.String r0 = "classes"
            Yue.C3329.m13906(r2, r0)
            r1.searchClasses = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.FindClass searchPackages(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r2) {
            r1 = this;
            java.lang.String r0 = "searchPackages"
            Yue.C3329.m13906(r2, r0)
            r1.searchPackages = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.FindClass searchPackages(@Yue.InterfaceC4418 java.lang.String... r2) {
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

    public final /* synthetic */ void setSearchPackages(java.util.Collection r1) {
            r0 = this;
            r0.searchPackages = r1
            return
    }
}
