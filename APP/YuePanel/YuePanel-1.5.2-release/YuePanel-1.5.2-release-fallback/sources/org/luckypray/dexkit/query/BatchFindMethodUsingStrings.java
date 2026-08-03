package org.luckypray.dexkit.query;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nBatchFindMethodUsingStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BatchFindMethodUsingStrings.kt\norg/luckypray/dexkit/query/BatchFindMethodUsingStrings\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,291:1\n125#2:292\n152#2,2:293\n154#2:299\n1547#3:295\n1618#3,3:296\n1547#3:300\n1618#3,3:301\n1547#3:304\n1618#3,3:305\n1547#3:308\n1618#3,3:309\n1547#3:313\n1618#3,3:314\n1547#3:317\n1618#3,3:318\n1547#3:321\n1618#3,3:322\n1547#3:325\n1618#3,3:326\n1#4:312\n*S KotlinDebug\n*F\n+ 1 BatchFindMethodUsingStrings.kt\norg/luckypray/dexkit/query/BatchFindMethodUsingStrings\n*L\n204#1:292\n204#1:293,2\n204#1:299\n205#1:295\n205#1:296,3\n240#1:300\n240#1:301,3\n272#1:304\n272#1:305,3\n277#1:308\n277#1:309,3\n279#1:313\n279#1:314,3\n282#1:317\n282#1:318,3\n284#1:321\n284#1:322,3\n286#1:325\n286#1:326,3\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b\u0006\u0018\u0000 G2\u00020\u0001:\u0001GB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0006\u001a\u00020\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u0006\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u0006\u0010\tJ!\u0010\n\u001a\u00020\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\n\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0010\u0010\tJ\u001b\u0010\u0013\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\b¢\u0006\u0004\b\u0013\u0010\tJ\u001b\u0010\u0015\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\b¢\u0006\u0004\b\u0015\u0010\tJ=\u0010\u0015\u001a\u00020\u00002\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ9\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00052\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001d\u0010!J&\u0010\u0015\u001a\u00020\u00002\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"¢\u0006\u0002\b%¢\u0006\u0004\b\u0015\u0010'J&\u0010\u001d\u001a\u00020\u00002\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020$0\"¢\u0006\u0002\b%¢\u0006\u0004\b\u001d\u0010'J.\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00052\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020$0\"¢\u0006\u0002\b%¢\u0006\u0004\b\u001d\u0010)J\u0017\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b-\u0010.R:\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R:\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00100\u001a\u0004\b5\u00102\"\u0004\b6\u00104R*\u0010\f\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R:\u0010<\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00100\u001a\u0004\b=\u00102\"\u0004\b>\u00104R:\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00100\u001a\u0004\b@\u00102\"\u0004\bA\u00104R4\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010B2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010B8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "Lorg/luckypray/dexkit/query/base/BaseFinder;", "<init>", "()V", "", "", "searchPackages", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "", "(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "excludePackages", "", "ignorePackagesCase", "(Z)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "Lorg/luckypray/dexkit/result/ClassData;", "classes", "searchInClasses", "Lorg/luckypray/dexkit/result/MethodData;", "methods", "searchInMethods", "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "groups", "", "keywordsMap", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "ignoreCase", "(Ljava/util/Map;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "matcher", "addSearchGroup", "(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "groupName", "usingStrings", "(Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "Lkotlin/Function1;", "Lorg/luckypray/dexkit/query/StringMatchersGroupList;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "Lorg/luckypray/dexkit/query/StringMatcherList;", "(Ljava/lang/String;LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "<set-?>", "Ljava/util/Collection;", "getSearchPackages", "()Ljava/util/Collection;", "setSearchPackages", "(Ljava/util/Collection;)V", "getExcludePackages", "setExcludePackages", "Z", "getIgnorePackagesCase", "()Z", "setIgnorePackagesCase", "(Z)V", "searchClasses", "getSearchClasses", "setSearchClasses", "searchMethods", "getSearchMethods", "setSearchMethods", "", "searchGroups", "Ljava/util/List;", "getSearchGroups", "()Ljava/util/List;", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class BatchFindMethodUsingStrings extends org.luckypray.dexkit.query.base.BaseFinder {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.query.BatchFindMethodUsingStrings.Companion Companion = null;

    @Yue.InterfaceC4543
    private java.util.Collection<java.lang.String> excludePackages;
    private boolean ignorePackagesCase;

    @Yue.InterfaceC4543
    private java.util.Collection<org.luckypray.dexkit.result.ClassData> searchClasses;

    @Yue.InterfaceC4543
    private java.util.List<org.luckypray.dexkit.query.matchers.StringMatchersGroup> searchGroups;

    @Yue.InterfaceC4543
    private java.util.Collection<org.luckypray.dexkit.result.MethodData> searchMethods;

    @Yue.InterfaceC4543
    private java.util.Collection<java.lang.String> searchPackages;

    @Yue.InterfaceC4201(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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
        public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings create() {
                r1 = this;
                org.luckypray.dexkit.query.BatchFindMethodUsingStrings r0 = new org.luckypray.dexkit.query.BatchFindMethodUsingStrings
                r0.<init>()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.BatchFindMethodUsingStrings$Companion r0 = new org.luckypray.dexkit.query.BatchFindMethodUsingStrings$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.BatchFindMethodUsingStrings.Companion = r0
            return
    }

    public BatchFindMethodUsingStrings() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ org.luckypray.dexkit.query.BatchFindMethodUsingStrings addSearchGroup$default(org.luckypray.dexkit.query.BatchFindMethodUsingStrings r0, java.lang.String r1, java.util.Collection r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 4
            if (r6 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r3 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r5 = r5 & 8
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            org.luckypray.dexkit.query.BatchFindMethodUsingStrings r0 = r0.addSearchGroup(r1, r2, r3, r4)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.BatchFindMethodUsingStrings create() {
            org.luckypray.dexkit.query.BatchFindMethodUsingStrings$Companion r0 = org.luckypray.dexkit.query.BatchFindMethodUsingStrings.Companion
            org.luckypray.dexkit.query.BatchFindMethodUsingStrings r0 = r0.create()
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.BatchFindMethodUsingStrings groups$default(org.luckypray.dexkit.query.BatchFindMethodUsingStrings r0, java.util.Map r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.BatchFindMethodUsingStrings r0 = r0.groups(r1, r2, r3)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.BatchFindMethodUsingStrings addSearchGroup(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = new org.luckypray.dexkit.query.matchers.StringMatchersGroup
            r0.<init>()
            r2.invoke(r0)
            r1.addSearchGroup(r0)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.BatchFindMethodUsingStrings addSearchGroup(java.lang.String r3, Yue.InterfaceC2825 r4) {
            r2 = this;
            java.lang.String r0 = "groupName"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r4, r0)
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = new org.luckypray.dexkit.query.matchers.StringMatchersGroup
            org.luckypray.dexkit.query.StringMatcherList r1 = new org.luckypray.dexkit.query.StringMatcherList
            r1.<init>()
            r4.invoke(r1)
            r0.<init>(r3, r1)
            r2.addSearchGroup(r0)
            return r2
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings addSearchGroup(@Yue.InterfaceC4418 java.lang.String r9, @Yue.InterfaceC4418 java.util.Collection<java.lang.String> r10) {
            r8 = this;
            java.lang.String r0 = "groupName"
            Yue.C3329.m13906(r9, r0)
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r10, r0)
            r6 = 12
            r7 = 0
            r4 = 0
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            org.luckypray.dexkit.query.BatchFindMethodUsingStrings r9 = addSearchGroup$default(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings addSearchGroup(@Yue.InterfaceC4418 java.lang.String r9, @Yue.InterfaceC4418 java.util.Collection<java.lang.String> r10, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r11) {
            r8 = this;
            java.lang.String r0 = "groupName"
            Yue.C3329.m13906(r9, r0)
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r10, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r11, r0)
            r6 = 8
            r7 = 0
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.luckypray.dexkit.query.BatchFindMethodUsingStrings r9 = addSearchGroup$default(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings addSearchGroup(@Yue.InterfaceC4418 java.lang.String r4, @Yue.InterfaceC4418 java.util.Collection<java.lang.String> r5, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r6, boolean r7) {
            r3 = this;
            java.lang.String r0 = "groupName"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = Yue.C1210.m6231(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L1e:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r2.<init>(r1, r6, r7)
            r0.add(r2)
            goto L1e
        L33:
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r5 = new org.luckypray.dexkit.query.matchers.StringMatchersGroup
            r5.<init>(r4, r0)
            r3.addSearchGroup(r5)
            return r3
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings addSearchGroup(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.StringMatchersGroup r2) {
            r1 = this;
            java.lang.String r0 = "matcher"
            Yue.C3329.m13906(r2, r0)
            java.util.List<org.luckypray.dexkit.query.matchers.StringMatchersGroup> r0 = r1.searchGroups
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Le:
            r1.searchGroups = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings excludePackages(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r2) {
            r1 = this;
            java.lang.String r0 = "excludePackages"
            Yue.C3329.m13906(r2, r0)
            r1.excludePackages = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings excludePackages(@Yue.InterfaceC4418 java.lang.String... r2) {
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

    public final boolean getIgnorePackagesCase() {
            r1 = this;
            boolean r0 = r1.ignorePackagesCase
            return r0
    }

    @Yue.InterfaceC4543
    public final java.util.Collection<org.luckypray.dexkit.result.ClassData> getSearchClasses() {
            r1 = this;
            java.util.Collection<org.luckypray.dexkit.result.ClassData> r0 = r1.searchClasses
            return r0
    }

    @Yue.InterfaceC4543
    public final java.util.List<org.luckypray.dexkit.query.matchers.StringMatchersGroup> getSearchGroups() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.StringMatchersGroup> r0 = r1.searchGroups
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

    public final /* synthetic */ org.luckypray.dexkit.query.BatchFindMethodUsingStrings groups(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.StringMatchersGroupList r0 = new org.luckypray.dexkit.query.StringMatchersGroupList
            r0.<init>()
            r2.invoke(r0)
            r1.groups(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings groups(@Yue.InterfaceC4418 java.util.Collection<org.luckypray.dexkit.query.matchers.StringMatchersGroup> r2) {
            r1 = this;
            java.lang.String r0 = "groups"
            Yue.C3329.m13906(r2, r0)
            java.util.List r2 = Yue.C1219.m6540(r2)
            r1.searchGroups = r2
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings groups(@Yue.InterfaceC4418 java.util.Map<java.lang.String, ? extends java.util.Collection<java.lang.String>> r8) {
            r7 = this;
            java.lang.String r0 = "keywordsMap"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.BatchFindMethodUsingStrings r8 = groups$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings groups(@Yue.InterfaceC4418 java.util.Map<java.lang.String, ? extends java.util.Collection<java.lang.String>> r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "keywordsMap"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.BatchFindMethodUsingStrings r8 = groups$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings groups(@Yue.InterfaceC4418 java.util.Map<java.lang.String, ? extends java.util.Collection<java.lang.String>> r7, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r8, boolean r9) {
            r6 = this;
            java.lang.String r0 = "keywordsMap"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r8, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.size()
            r0.<init>(r1)
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L60
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = Yue.C1210.m6231(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L42:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L57
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            org.luckypray.dexkit.query.matchers.base.StringMatcher r5 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r5.<init>(r4, r8, r9)
            r3.add(r5)
            goto L42
        L57:
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r1 = new org.luckypray.dexkit.query.matchers.StringMatchersGroup
            r1.<init>(r2, r3)
            r0.add(r1)
            goto L1b
        L60:
            java.util.List r7 = Yue.C1219.m6540(r0)
            r6.searchGroups = r7
            return r6
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings ignorePackagesCase(boolean r1) {
            r0 = this;
            r0.ignorePackagesCase = r1
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r12) {
            r11 = this;
            java.lang.String r0 = "fbb"
            Yue.C3329.m13906(r12, r0)
            java.util.List<org.luckypray.dexkit.query.matchers.StringMatchersGroup> r0 = r11.searchGroups
            if (r0 == 0) goto L166
            Yue.C3329.m13903(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r3 = Yue.C1210.m6231(r0, r2)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r0.next()
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r3 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r3
            java.lang.String r3 = r3.getGroupName()
            r1.add(r3)
            goto L1b
        L2f:
            java.util.Set r0 = Yue.C1219.m6542(r1)
            int r0 = r0.size()
            java.util.List<org.luckypray.dexkit.query.matchers.StringMatchersGroup> r1 = r11.searchGroups
            Yue.C3329.m13903(r1)
            int r1 = r1.size()
            if (r0 < r1) goto L15e
            org.luckypray.dexkit.schema.-BatchFindMethodUsingStrings$Companion r3 = org.luckypray.dexkit.schema.BatchFindMethodUsingStrings.Companion
            java.util.Collection<java.lang.String> r0 = r11.searchPackages
            r1 = 0
            if (r0 == 0) goto L7a
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = Yue.C1210.m6231(r0, r2)
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L56:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L6e
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            int r5 = r12.createString(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.add(r5)
            goto L56
        L6e:
            int[] r0 = Yue.C1219.m6536(r4)
            if (r0 == 0) goto L7a
            int r0 = r12.createVectorOfTables(r0)
            r5 = r0
            goto L7b
        L7a:
            r5 = r1
        L7b:
            java.util.Collection<java.lang.String> r0 = r11.excludePackages
            if (r0 == 0) goto Lb0
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = Yue.C1210.m6231(r0, r2)
            r4.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L8c:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto La4
            java.lang.Object r6 = r0.next()
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r12.createString(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.add(r6)
            goto L8c
        La4:
            int[] r0 = Yue.C1219.m6536(r4)
            if (r0 == 0) goto Lb0
            int r0 = r12.createVectorOfTables(r0)
            r6 = r0
            goto Lb1
        Lb0:
            r6 = r1
        Lb1:
            boolean r7 = r11.ignorePackagesCase
            java.util.Collection<org.luckypray.dexkit.result.ClassData> r0 = r11.searchClasses
            if (r0 == 0) goto Lea
            java.util.ArrayList r4 = new java.util.ArrayList
            int r8 = Yue.C1210.m6231(r0, r2)
            r4.<init>(r8)
            java.util.Iterator r0 = r0.iterator()
        Lc4:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto Ldc
            java.lang.Object r8 = r0.next()
            org.luckypray.dexkit.result.ClassData r8 = (org.luckypray.dexkit.result.ClassData) r8
            long r8 = r8.getEncodeId()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r4.add(r8)
            goto Lc4
        Ldc:
            long[] r0 = Yue.C1219.m6538(r4)
            if (r0 == 0) goto Lea
            org.luckypray.dexkit.schema.-BatchFindMethodUsingStrings$Companion r4 = org.luckypray.dexkit.schema.BatchFindMethodUsingStrings.Companion
            int r0 = r4.createInClassesVector(r12, r0)
            r8 = r0
            goto Leb
        Lea:
            r8 = r1
        Leb:
            java.util.Collection<org.luckypray.dexkit.result.MethodData> r0 = r11.searchMethods
            if (r0 == 0) goto L122
            java.util.ArrayList r4 = new java.util.ArrayList
            int r9 = Yue.C1210.m6231(r0, r2)
            r4.<init>(r9)
            java.util.Iterator r0 = r0.iterator()
        Lfc:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L114
            java.lang.Object r9 = r0.next()
            org.luckypray.dexkit.result.MethodData r9 = (org.luckypray.dexkit.result.MethodData) r9
            long r9 = r9.getEncodeId()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r4.add(r9)
            goto Lfc
        L114:
            long[] r0 = Yue.C1219.m6538(r4)
            if (r0 == 0) goto L122
            org.luckypray.dexkit.schema.-BatchFindMethodUsingStrings$Companion r1 = org.luckypray.dexkit.schema.BatchFindMethodUsingStrings.Companion
            int r0 = r1.createInMethodsVector(r12, r0)
            r9 = r0
            goto L123
        L122:
            r9 = r1
        L123:
            java.util.List<org.luckypray.dexkit.query.matchers.StringMatchersGroup> r0 = r11.searchGroups
            Yue.C3329.m13903(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = Yue.C1210.m6231(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L135:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L14d
            java.lang.Object r2 = r0.next()
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r2 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r2
            int r2 = r2.build$dexkit_android_release(r12)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.add(r2)
            goto L135
        L14d:
            int[] r0 = Yue.C1219.m6536(r1)
            int r10 = r12.createVectorOfTables(r0)
            r4 = r12
            int r0 = r3.createBatchFindMethodUsingStrings(r4, r5, r6, r7, r8, r9, r10)
            r12.finish(r0)
            return r0
        L15e:
            java.lang.IllegalAccessException r12 = new java.lang.IllegalAccessException
            java.lang.String r0 = "groupName must be unique"
            r12.<init>(r0)
            throw r12
        L166:
            java.lang.IllegalAccessException r12 = new java.lang.IllegalAccessException
            java.lang.String r0 = "searchGroups not be empty"
            r12.<init>(r0)
            throw r12
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings searchInClasses(@Yue.InterfaceC4418 java.util.Collection<org.luckypray.dexkit.result.ClassData> r2) {
            r1 = this;
            java.lang.String r0 = "classes"
            Yue.C3329.m13906(r2, r0)
            r1.searchClasses = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings searchInMethods(@Yue.InterfaceC4418 java.util.Collection<org.luckypray.dexkit.result.MethodData> r2) {
            r1 = this;
            java.lang.String r0 = "methods"
            Yue.C3329.m13906(r2, r0)
            r1.searchMethods = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings searchPackages(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r2) {
            r1 = this;
            java.lang.String r0 = "searchPackages"
            Yue.C3329.m13906(r2, r0)
            r1.searchPackages = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings searchPackages(@Yue.InterfaceC4418 java.lang.String... r2) {
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
