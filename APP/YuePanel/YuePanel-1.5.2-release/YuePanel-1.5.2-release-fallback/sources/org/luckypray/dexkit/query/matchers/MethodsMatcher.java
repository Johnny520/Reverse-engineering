package org.luckypray.dexkit.query.matchers;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nMethodsMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MethodsMatcher.kt\norg/luckypray/dexkit/query/matchers/MethodsMatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n1547#2:199\n1618#2,3:200\n1#3:203\n*S KotlinDebug\n*F\n+ 1 MethodsMatcher.kt\norg/luckypray/dexkit/query/matchers/MethodsMatcher\n*L\n190#1:199\n190#1:200,3\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0015\u0018\u0000 82\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0012J!\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\rJ\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\rJ\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u0019\u001a\u00020\u00002\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0002\b\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#R4\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010$2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010$8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R*\u0010\t\u001a\u00020\b2\u0006\u0010%\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u0010/\u001a\u0004\u0018\u00010\u000e2\b\u0010%\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R$\u0010\f\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u00069"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "<init>", "()V", "", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "methods", "(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "Lorg/luckypray/dexkit/query/enums/MatchType;", "matchType", "(Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "", "count", "(I)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "range", "(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "LYue/ۥ۠ۥۣۨ;", "(LYue/ۥ۠ۥۣۨ;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "min", "max", "(II)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "countMin", "countMax", "method", "add", "(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "", "<set-?>", "methodsMatcher", "Ljava/util/List;", "getMethodsMatcher", "()Ljava/util/List;", "Lorg/luckypray/dexkit/query/enums/MatchType;", "getMatchType", "()Lorg/luckypray/dexkit/query/enums/MatchType;", "setMatchType", "(Lorg/luckypray/dexkit/query/enums/MatchType;)V", "rangeMatcher", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "getRangeMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "value", "getCount", "()I", "setCount", "(I)V", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class MethodsMatcher extends org.luckypray.dexkit.query.base.BaseMatcher {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.query.matchers.MethodsMatcher.Companion Companion = null;

    @Yue.InterfaceC4418
    private org.luckypray.dexkit.query.enums.MatchType matchType;

    @Yue.InterfaceC4543
    private java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> methodsMatcher;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.base.IntRange rangeMatcher;

    @Yue.InterfaceC4201(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/MethodsMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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
        public final org.luckypray.dexkit.query.matchers.MethodsMatcher create() {
                r1 = this;
                org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
                r0.<init>()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.MethodsMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.MethodsMatcher.Companion = r0
            return
    }

    public MethodsMatcher() {
            r1 = this;
            r1.<init>()
            org.luckypray.dexkit.query.enums.MatchType r0 = org.luckypray.dexkit.query.enums.MatchType.Contains
            r1.matchType = r0
            return
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodsMatcher count$default(org.luckypray.dexkit.query.matchers.MethodsMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r0.count(r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.MethodsMatcher create() {
            org.luckypray.dexkit.query.matchers.MethodsMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.MethodsMatcher.Companion
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r0.create()
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodsMatcher add(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.add(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodsMatcher add(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            java.lang.String r0 = "method"
            Yue.C3329.m13906(r2, r0)
            java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> r0 = r1.methodsMatcher
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Le:
            r1.methodsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodsMatcher count(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r0.<init>(r2)
            r1.rangeMatcher = r0
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodsMatcher count(int r2, int r3) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r0.<init>(r2, r3)
            r1.rangeMatcher = r0
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodsMatcher count(@Yue.InterfaceC4418 Yue.C3279 r2) {
            r1 = this;
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r0.<init>(r2)
            r1.rangeMatcher = r0
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodsMatcher count(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.IntRange r2) {
            r1 = this;
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            r1.rangeMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodsMatcher countMax(int r3) {
            r2 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r1 = 0
            r0.<init>(r1, r3)
            r2.rangeMatcher = r0
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodsMatcher countMin(int r3) {
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

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.enums.MatchType getMatchType() {
            r1 = this;
            org.luckypray.dexkit.query.enums.MatchType r0 = r1.matchType
            return r0
    }

    @Yue.InterfaceC4543
    public final java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> getMethodsMatcher() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> r0 = r1.methodsMatcher
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
            org.luckypray.dexkit.schema.-MethodsMatcher$Companion r0 = org.luckypray.dexkit.schema.MethodsMatcher.Companion
            java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> r1 = r5.methodsMatcher
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
            org.luckypray.dexkit.query.matchers.MethodMatcher r4 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r4
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
            int r0 = r0.createMethodsMatcher(r6, r1, r3, r2)
            r6.finish(r0)
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodsMatcher matchType(@Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.MatchType r2) {
            r1 = this;
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r2, r0)
            r1.matchType = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodsMatcher methods(@Yue.InterfaceC4418 java.util.Collection<org.luckypray.dexkit.query.matchers.MethodMatcher> r2) {
            r1 = this;
            java.lang.String r0 = "methods"
            Yue.C3329.m13906(r2, r0)
            java.util.List r2 = Yue.C1219.m6540(r2)
            r1.methodsMatcher = r2
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
