package org.luckypray.dexkit.query.matchers;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nInterfacesMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterfacesMatcher.kt\norg/luckypray/dexkit/query/matchers/InterfacesMatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,218:1\n1#2:219\n1547#3:220\n1618#3,3:221\n*S KotlinDebug\n*F\n+ 1 InterfacesMatcher.kt\norg/luckypray/dexkit/query/matchers/InterfacesMatcher\n*L\n210#1:220\n210#1:221,3\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0015\u0018\u0000 >2\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0012J!\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\rJ\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\rJ\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\t\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u0019\u0010 J&\u0010\u0019\u001a\u00020\u00002\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\"0!¢\u0006\u0002\b#¢\u0006\u0004\b\u0019\u0010%J\u0017\u0010(\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b(\u0010)R4\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010*2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010*8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R*\u0010\t\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R(\u00105\u001a\u0004\u0018\u00010\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R$\u0010\f\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "<init>", "()V", "", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "interfaces", "(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;", "Lorg/luckypray/dexkit/query/enums/MatchType;", "matchType", "(Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;", "", "count", "(I)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "range", "(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;", "LYue/ۥ۠ۥۣۨ;", "(LYue/ۥ۠ۥۣۨ;)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;", "min", "max", "(II)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;", "countMin", "countMax", "interfaceMatcher", "add", "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;", "", "className", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "", "ignoreCase", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "", "<set-?>", "interfacesMatcher", "Ljava/util/List;", "getInterfacesMatcher", "()Ljava/util/List;", "Lorg/luckypray/dexkit/query/enums/MatchType;", "getMatchType", "()Lorg/luckypray/dexkit/query/enums/MatchType;", "setMatchType", "(Lorg/luckypray/dexkit/query/enums/MatchType;)V", "rangeMatcher", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "getRangeMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "value", "getCount", "()I", "setCount", "(I)V", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class InterfacesMatcher extends org.luckypray.dexkit.query.base.BaseMatcher {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.query.matchers.InterfacesMatcher.Companion Companion = null;

    @Yue.InterfaceC4543
    private java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> interfacesMatcher;

    @Yue.InterfaceC4418
    private org.luckypray.dexkit.query.enums.MatchType matchType;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.base.IntRange rangeMatcher;

    @Yue.InterfaceC4201(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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
        public final org.luckypray.dexkit.query.matchers.InterfacesMatcher create() {
                r1 = this;
                org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = new org.luckypray.dexkit.query.matchers.InterfacesMatcher
                r0.<init>()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.InterfacesMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.InterfacesMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.InterfacesMatcher.Companion = r0
            return
    }

    public InterfacesMatcher() {
            r1 = this;
            r1.<init>()
            org.luckypray.dexkit.query.enums.MatchType r0 = org.luckypray.dexkit.query.enums.MatchType.Contains
            r1.matchType = r0
            return
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.InterfacesMatcher add$default(org.luckypray.dexkit.query.matchers.InterfacesMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = r0.add(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.InterfacesMatcher count$default(org.luckypray.dexkit.query.matchers.InterfacesMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = r0.count(r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.InterfacesMatcher create() {
            org.luckypray.dexkit.query.matchers.InterfacesMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.InterfacesMatcher.Companion
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = r0.create()
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.InterfacesMatcher add(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.add(r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.InterfacesMatcher add(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "className"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r8 = add$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.InterfacesMatcher add(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "className"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r8 = add$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.InterfacesMatcher add(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "className"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r0.className(r2, r3, r4)
            r1.add(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.InterfacesMatcher add(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            java.lang.String r0 = "interfaceMatcher"
            Yue.C3329.m13906(r2, r0)
            java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> r0 = r1.interfacesMatcher
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Le:
            r1.interfacesMatcher = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.InterfacesMatcher count(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r0.<init>(r2)
            r1.rangeMatcher = r0
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.InterfacesMatcher count(int r2, int r3) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r0.<init>(r2, r3)
            r1.rangeMatcher = r0
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.InterfacesMatcher count(@Yue.InterfaceC4418 Yue.C3279 r2) {
            r1 = this;
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r0.<init>(r2)
            r1.rangeMatcher = r0
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.InterfacesMatcher count(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.IntRange r2) {
            r1 = this;
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            r1.rangeMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.InterfacesMatcher countMax(int r3) {
            r2 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r1 = 0
            r0.<init>(r1, r3)
            r2.rangeMatcher = r0
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.InterfacesMatcher countMin(int r3) {
            r2 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.<init>(r3, r1)
            r2.rangeMatcher = r0
            return r2
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ int getCount() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4543
    public final java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> getInterfacesMatcher() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> r0 = r1.interfacesMatcher
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.enums.MatchType getMatchType() {
            r1 = this;
            org.luckypray.dexkit.query.enums.MatchType r0 = r1.matchType
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.base.IntRange getRangeMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = r1.rangeMatcher
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r6) {
            r5 = this;
            java.lang.String r0 = "fbb"
            Yue.C3329.m13906(r6, r0)
            org.luckypray.dexkit.schema.-InterfacesMatcher$Companion r0 = org.luckypray.dexkit.schema.InterfacesMatcher.Companion
            java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> r1 = r5.interfacesMatcher
            r2 = 0
            if (r1 == 0) goto L3e
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = Yue.C1210.m6231(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L33
            java.lang.Object r4 = r1.next()
            org.luckypray.dexkit.query.matchers.ClassMatcher r4 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r4
            int r4 = r4.build$dexkit_android_release(r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            goto L1b
        L33:
            int[] r1 = Yue.C1219.m6536(r3)
            if (r1 == 0) goto L3e
            int r1 = r6.createVectorOfTables(r1)
            goto L3f
        L3e:
            r1 = r2
        L3f:
            org.luckypray.dexkit.query.enums.MatchType r3 = r5.matchType
            byte r3 = r3.getValue()
            org.luckypray.dexkit.query.matchers.base.IntRange r4 = r5.rangeMatcher
            if (r4 == 0) goto L4d
            int r2 = r4.build$dexkit_android_release(r6)
        L4d:
            int r0 = r0.createInterfacesMatcher(r6, r1, r3, r2)
            r6.finish(r0)
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.InterfacesMatcher interfaces(@Yue.InterfaceC4418 java.util.Collection<org.luckypray.dexkit.query.matchers.ClassMatcher> r2) {
            r1 = this;
            java.lang.String r0 = "interfaces"
            Yue.C3329.m13906(r2, r0)
            java.util.List r2 = Yue.C1219.m6540(r2)
            r1.interfacesMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.InterfacesMatcher matchType(@Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.MatchType r2) {
            r1 = this;
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r2, r0)
            r1.matchType = r2
            return r1
    }

    public final /* synthetic */ void setCount(int r1) {
            r0 = this;
            r0.count(r1)
            return
    }

    public final /* synthetic */ void setMatchType(org.luckypray.dexkit.query.enums.MatchType r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            Yue.C3329.m13906(r2, r0)
            r1.matchType = r2
            return
    }
}
