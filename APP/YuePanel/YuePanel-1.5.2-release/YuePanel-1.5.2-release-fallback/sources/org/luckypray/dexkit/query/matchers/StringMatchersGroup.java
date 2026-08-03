package org.luckypray.dexkit.query.matchers;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nStringMatchersGroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringMatchersGroup.kt\norg/luckypray/dexkit/query/matchers/StringMatchersGroup\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n1547#2:185\n1618#2,3:186\n1547#2:193\n1618#2,3:194\n11328#3:189\n11663#3,3:190\n1#4:197\n*S KotlinDebug\n*F\n+ 1 StringMatchersGroup.kt\norg/luckypray/dexkit/query/matchers/StringMatchersGroup\n*L\n103#1:185\n103#1:186,3\n178#1:193\n178#1:194,3\n119#1:189\n119#1:190,3\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\n\u0018\u0000 32\u00020\u0001:\u00013B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u001f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0002\u0010\tJ\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ1\u0010\f\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\f\u0010\u0012J!\u0010\f\u001a\u00020\u00002\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0013\"\u00020\u0004¢\u0006\u0004\b\f\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0016\u0010\u0019J&\u0010\f\u001a\u00020\u00002\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001c¢\u0006\u0004\b\f\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b\"\u0010#R.\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R0\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070*2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070*8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010-R0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00064"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "<init>", "()V", "", "groupName", "", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "stringMatchers", "(Ljava/lang/String;Ljava/util/Collection;)V", "(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "Lorg/luckypray/dexkit/query/StringMatcherList;", "usingStrings", "(Lorg/luckypray/dexkit/query/StringMatcherList;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "matcher", "add", "(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "usingString", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "<set-?>", "Ljava/lang/String;", "getGroupName", "()Ljava/lang/String;", "setGroupName", "(Ljava/lang/String;)V", "", "Ljava/util/List;", "getStringMatchers", "()Ljava/util/List;", "value", "getUsingStrings", "()Ljava/util/Collection;", "setUsingStrings", "(Ljava/util/Collection;)V", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class StringMatchersGroup extends org.luckypray.dexkit.query.base.BaseMatcher {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.query.matchers.StringMatchersGroup.Companion Companion = null;

    @Yue.InterfaceC4543
    private java.lang.String groupName;

    @Yue.InterfaceC4418
    private java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> stringMatchers;

    @Yue.InterfaceC4201(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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
            r1.stringMatchers = r0
            return
    }

    public StringMatchersGroup(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 java.util.Collection<org.luckypray.dexkit.query.matchers.base.StringMatcher> r3) {
            r1 = this;
            java.lang.String r0 = "groupName"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "stringMatchers"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.stringMatchers = r0
            r1.groupName = r2
            java.util.List r2 = Yue.C1219.m6540(r3)
            r1.stringMatchers = r2
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

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.StringMatchersGroup create() {
            org.luckypray.dexkit.query.matchers.StringMatchersGroup$Companion r0 = org.luckypray.dexkit.query.matchers.StringMatchersGroup.Companion
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = r0.create()
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

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup add(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "usingString"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r8 = add$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup add(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "usingString"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r8 = add$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup add(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "usingString"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r0.<init>(r2, r3, r4)
            r1.add(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup add(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.StringMatcher r2) {
            r1 = this;
            java.lang.String r0 = "matcher"
            Yue.C3329.m13906(r2, r0)
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r0 = r1.stringMatchers
            r0.add(r2)
            return r1
    }

    @Yue.InterfaceC4543
    public final java.lang.String getGroupName() {
            r1 = this;
            java.lang.String r0 = r1.groupName
            return r0
    }

    @Yue.InterfaceC4418
    public final java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> getStringMatchers() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r0 = r1.stringMatchers
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ java.util.Collection getUsingStrings() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup groupName(@Yue.InterfaceC4418 java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "groupName"
            Yue.C3329.m13906(r2, r0)
            r1.groupName = r2
            return r1
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r6) {
            r5 = this;
            java.lang.String r0 = "fbb"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = r5.groupName
            if (r0 == 0) goto L5a
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r0 = r5.stringMatchers
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L52
            org.luckypray.dexkit.schema.-BatchUsingStringsMatcher$Companion r0 = org.luckypray.dexkit.schema.BatchUsingStringsMatcher.Companion
            java.lang.String r1 = r5.groupName
            int r1 = r6.createString(r1)
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r2 = r5.stringMatchers
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = Yue.C1210.m6231(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L42
            java.lang.Object r4 = r2.next()
            org.luckypray.dexkit.query.matchers.base.StringMatcher r4 = (org.luckypray.dexkit.query.matchers.base.StringMatcher) r4
            int r4 = r4.build$dexkit_android_release(r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            goto L2a
        L42:
            int[] r2 = Yue.C1219.m6536(r3)
            int r2 = r6.createVectorOfTables(r2)
            int r0 = r0.createBatchUsingStringsMatcher(r6, r1, r2)
            r6.finish(r0)
            return r0
        L52:
            java.lang.IllegalAccessException r6 = new java.lang.IllegalAccessException
            java.lang.String r0 = "matchers not be empty"
            r6.<init>(r0)
            throw r6
        L5a:
            java.lang.IllegalAccessException r6 = new java.lang.IllegalAccessException
            java.lang.String r0 = "groupName not be null"
            r6.<init>(r0)
            throw r6
    }

    public final /* synthetic */ void setGroupName(java.lang.String r1) {
            r0 = this;
            r0.groupName = r1
            return
    }

    public final /* synthetic */ void setUsingStrings(java.util.Collection r8) {
            r7 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            usingStrings$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.StringMatchersGroup usingStrings(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.StringMatcherList r0 = new org.luckypray.dexkit.query.StringMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.usingStrings(r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup usingStrings(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r8) {
            r7 = this;
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r8 = usingStrings$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup usingStrings(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r8 = usingStrings$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup usingStrings(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r4, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = Yue.C1210.m6231(r4, r1)
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L19:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r2.<init>(r1, r5, r6)
            r0.add(r2)
            goto L19
        L2e:
            java.util.List r4 = Yue.C1219.m6540(r0)
            r3.stringMatchers = r4
            return r3
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup usingStrings(@Yue.InterfaceC4418 org.luckypray.dexkit.query.StringMatcherList r2) {
            r1 = this;
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r2, r0)
            r1.stringMatchers = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup usingStrings(@Yue.InterfaceC4418 java.lang.String... r11) {
            r10 = this;
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r11, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.length
            r0.<init>(r1)
            int r1 = r11.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L21
            r4 = r11[r2]
            org.luckypray.dexkit.query.matchers.base.StringMatcher r9 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r0.add(r9)
            int r2 = r2 + 1
            goto Ld
        L21:
            java.util.List r11 = Yue.C1219.m6540(r0)
            r10.stringMatchers = r11
            return r10
    }
}
