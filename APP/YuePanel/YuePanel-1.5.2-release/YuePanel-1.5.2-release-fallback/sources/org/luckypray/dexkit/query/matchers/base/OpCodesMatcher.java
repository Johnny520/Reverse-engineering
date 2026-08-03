package org.luckypray.dexkit.query.matchers.base;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nOpCodesMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpCodesMatcher.kt\norg/luckypray/dexkit/query/matchers/base/OpCodesMatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,349:1\n1547#2:350\n1618#2,3:351\n1547#2:358\n1618#2,3:359\n11328#3:354\n11663#3,3:355\n1#4:362\n*S KotlinDebug\n*F\n+ 1 OpCodesMatcher.kt\norg/luckypray/dexkit/query/matchers/base/OpCodesMatcher\n*L\n137#1:350\n137#1:351,3\n341#1:358\n341#1:359,3\n149#1:354\n149#1:355,3\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 82\u00020\u0001:\u00018B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B-\b\u0017\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0002\u0010\u000bB'\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\f\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0002\u0010\rJ\u001b\u0010\u0006\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u000eJ\u001b\u0010\u0006\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\u0004\b\u0006\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0018J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0019¢\u0006\u0004\b\u0015\u0010\u001aJ!\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u0016J\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010\u0016J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#R:\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u0010\b\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u0010/\u001a\u0004\u0018\u00010\t2\b\u0010$\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R$\u0010\u0015\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u00058G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u00069"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "<init>", "()V", "", "", "opCodes", "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;", "matchType", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "opCodeSize", "(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)V", "", "([ILorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)V", "(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "", "([Ljava/lang/Integer;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "", "opNames", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "(Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "size", "(I)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "range", "(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "LYue/ۥ۠ۥۣۨ;", "(LYue/ۥ۠ۥۣۨ;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "min", "max", "(II)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "sizeMin", "sizeMax", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "<set-?>", "Ljava/util/Collection;", "getOpCodes", "()Ljava/util/Collection;", "setOpCodes", "(Ljava/util/Collection;)V", "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;", "getMatchType", "()Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;", "setMatchType", "(Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;)V", "rangeMatcher", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "getRangeMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "value", "getSize", "()I", "setSize", "(I)V", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class OpCodesMatcher extends org.luckypray.dexkit.query.base.BaseMatcher {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion Companion = null;

    @Yue.InterfaceC4418
    private org.luckypray.dexkit.query.enums.OpCodeMatchType matchType;

    @Yue.InterfaceC4543
    private java.util.Collection<java.lang.Integer> opCodes;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.base.IntRange rangeMatcher;

    @Yue.InterfaceC4201(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00020\u0006\"\u00020\u0007H\u0007J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J,\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J1\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\u0011J!\u0010\r\u001a\u00020\u00042\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\"\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0012J,\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¨\u0006\u0013"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "opCodes", "", "", "matchType", "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;", "opCodeSize", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "", "createForOpNames", "opNames", "", "", "([Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @Yue.InterfaceC5840({"SMAP\nOpCodesMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpCodesMatcher.kt\norg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,349:1\n1547#2:350\n1618#2,3:351\n11328#3:354\n11663#3,3:355\n11328#3:358\n11663#3,3:359\n*S KotlinDebug\n*F\n+ 1 OpCodesMatcher.kt\norg/luckypray/dexkit/query/matchers/base/OpCodesMatcher$Companion\n*L\n302#1:350\n302#1:351,3\n321#1:354\n321#1:355,3\n334#1:358\n334#1:359,3\n*E\n"})
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

        public static /* synthetic */ org.luckypray.dexkit.query.matchers.base.OpCodesMatcher create$default(org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion r0, java.util.Collection r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3, int r4, java.lang.Object r5) {
                r5 = r4 & 2
                if (r5 == 0) goto L6
                org.luckypray.dexkit.query.enums.OpCodeMatchType r2 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
            L6:
                r4 = r4 & 4
                if (r4 == 0) goto Lb
                r3 = 0
            Lb:
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = r0.create(r1, r2, r3)
                return r0
        }

        public static /* synthetic */ org.luckypray.dexkit.query.matchers.base.OpCodesMatcher create$default(org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion r0, int[] r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3, int r4, java.lang.Object r5) {
                r5 = r4 & 2
                if (r5 == 0) goto L6
                org.luckypray.dexkit.query.enums.OpCodeMatchType r2 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
            L6:
                r4 = r4 & 4
                if (r4 == 0) goto Lb
                r3 = 0
            Lb:
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = r0.create(r1, r2, r3)
                return r0
        }

        public static /* synthetic */ org.luckypray.dexkit.query.matchers.base.OpCodesMatcher createForOpNames$default(org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion r0, java.util.Collection r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3, int r4, java.lang.Object r5) {
                r5 = r4 & 2
                if (r5 == 0) goto L6
                org.luckypray.dexkit.query.enums.OpCodeMatchType r2 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
            L6:
                r4 = r4 & 4
                if (r4 == 0) goto Lb
                r3 = 0
            Lb:
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = r0.createForOpNames(r1, r2, r3)
                return r0
        }

        public static /* synthetic */ org.luckypray.dexkit.query.matchers.base.OpCodesMatcher createForOpNames$default(org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion r0, java.lang.String[] r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3, int r4, java.lang.Object r5) {
                r5 = r4 & 2
                if (r5 == 0) goto L6
                org.luckypray.dexkit.query.enums.OpCodeMatchType r2 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
            L6:
                r4 = r4 & 4
                if (r4 == 0) goto Lb
                r3 = 0
            Lb:
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = r0.createForOpNames(r1, r2, r3)
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher create(@Yue.InterfaceC4418 java.util.Collection<java.lang.Integer> r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.OpCodeMatchType r3, @Yue.InterfaceC4543 org.luckypray.dexkit.query.matchers.base.IntRange r4) {
                r1 = this;
                java.lang.String r0 = "opCodes"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r0 = "matchType"
                Yue.C3329.m13906(r3, r0)
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = new org.luckypray.dexkit.query.matchers.base.OpCodesMatcher
                r0.<init>(r2, r3, r4)
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher create(@Yue.InterfaceC4418 int... r8) {
                r7 = this;
                java.lang.String r0 = "opCodes"
                Yue.C3329.m13906(r8, r0)
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = new org.luckypray.dexkit.query.matchers.base.OpCodesMatcher
                java.util.List r2 = Yue.C0595.m3980(r8)
                r5 = 6
                r6 = 0
                r3 = 0
                r4 = 0
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher create(@Yue.InterfaceC4418 int[] r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.OpCodeMatchType r3, @Yue.InterfaceC4543 org.luckypray.dexkit.query.matchers.base.IntRange r4) {
                r1 = this;
                java.lang.String r0 = "opCodes"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r0 = "matchType"
                Yue.C3329.m13906(r3, r0)
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = new org.luckypray.dexkit.query.matchers.base.OpCodesMatcher
                r0.<init>(r2, r3, r4)
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher createForOpNames(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r3, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.OpCodeMatchType r4, @Yue.InterfaceC4543 org.luckypray.dexkit.query.matchers.base.IntRange r5) {
                r2 = this;
                java.lang.String r0 = "opNames"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = "matchType"
                Yue.C3329.m13906(r4, r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                int r1 = Yue.C1210.m6231(r3, r1)
                r0.<init>(r1)
                java.util.Iterator r3 = r3.iterator()
            L19:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L31
                java.lang.Object r1 = r3.next()
                java.lang.String r1 = (java.lang.String) r1
                int r1 = org.luckypray.dexkit.util.OpCodeUtil.getOpCode(r1)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.add(r1)
                goto L19
            L31:
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r3 = new org.luckypray.dexkit.query.matchers.base.OpCodesMatcher
                r3.<init>(r0, r4, r5)
                return r3
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher createForOpNames(@Yue.InterfaceC4418 java.lang.String... r8) {
                r7 = this;
                java.lang.String r0 = "opNames"
                Yue.C3329.m13906(r8, r0)
                java.util.ArrayList r2 = new java.util.ArrayList
                int r0 = r8.length
                r2.<init>(r0)
                int r0 = r8.length
                r1 = 0
            Ld:
                if (r1 >= r0) goto L1f
                r3 = r8[r1]
                int r3 = org.luckypray.dexkit.util.OpCodeUtil.getOpCode(r3)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.add(r3)
                int r1 = r1 + 1
                goto Ld
            L1f:
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r8 = new org.luckypray.dexkit.query.matchers.base.OpCodesMatcher
                r3 = 0
                r4 = 0
                r5 = 6
                r6 = 0
                r1 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return r8
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher createForOpNames(@Yue.InterfaceC4418 java.lang.String[] r5, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.OpCodeMatchType r6, @Yue.InterfaceC4543 org.luckypray.dexkit.query.matchers.base.IntRange r7) {
                r4 = this;
                java.lang.String r0 = "opNames"
                Yue.C3329.m13906(r5, r0)
                java.lang.String r0 = "matchType"
                Yue.C3329.m13906(r6, r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r5.length
                r0.<init>(r1)
                int r1 = r5.length
                r2 = 0
            L12:
                if (r2 >= r1) goto L24
                r3 = r5[r2]
                int r3 = org.luckypray.dexkit.util.OpCodeUtil.getOpCode(r3)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.add(r3)
                int r2 = r2 + 1
                goto L12
            L24:
                org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r5 = new org.luckypray.dexkit.query.matchers.base.OpCodesMatcher
                r5.<init>(r0, r6, r7)
                return r5
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion = r0
            return
    }

    public OpCodesMatcher() {
            r1 = this;
            r1.<init>()
            org.luckypray.dexkit.query.enums.OpCodeMatchType r0 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
            r1.matchType = r0
            return
    }

    @Yue.InterfaceC3422
    public OpCodesMatcher(@Yue.InterfaceC4418 java.util.Collection<java.lang.Integer> r8) {
            r7 = this;
            java.lang.String r0 = "opCodes"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    @Yue.InterfaceC3422
    public OpCodesMatcher(@Yue.InterfaceC4418 java.util.Collection<java.lang.Integer> r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.OpCodeMatchType r9) {
            r7 = this;
            java.lang.String r0 = "opCodes"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    @Yue.InterfaceC3422
    public OpCodesMatcher(@Yue.InterfaceC4418 java.util.Collection<java.lang.Integer> r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.OpCodeMatchType r3, @Yue.InterfaceC4543 org.luckypray.dexkit.query.matchers.base.IntRange r4) {
            r1 = this;
            java.lang.String r0 = "opCodes"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            org.luckypray.dexkit.query.enums.OpCodeMatchType r0 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
            r1.opCodes = r2
            r1.matchType = r3
            r1.rangeMatcher = r4
            return
    }

    public /* synthetic */ OpCodesMatcher(java.util.Collection r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3, int r4, Yue.C1769 r5) {
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.OpCodeMatchType r2 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            r0.<init>(r1, r2, r3)
            return
    }

    @Yue.InterfaceC3422
    public OpCodesMatcher(@Yue.InterfaceC4418 int[] r8) {
            r7 = this;
            java.lang.String r0 = "opCodes"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    @Yue.InterfaceC3422
    public OpCodesMatcher(@Yue.InterfaceC4418 int[] r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.OpCodeMatchType r9) {
            r7 = this;
            java.lang.String r0 = "opCodes"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    @Yue.InterfaceC3422
    public OpCodesMatcher(@Yue.InterfaceC4418 int[] r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.OpCodeMatchType r3, @Yue.InterfaceC4543 org.luckypray.dexkit.query.matchers.base.IntRange r4) {
            r1 = this;
            java.lang.String r0 = "opCodes"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            org.luckypray.dexkit.query.enums.OpCodeMatchType r0 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
            r1.matchType = r0
            java.util.List r2 = Yue.C0595.m3980(r2)
            r1.opCodes = r2
            r1.matchType = r3
            r1.rangeMatcher = r4
            return
    }

    public /* synthetic */ OpCodesMatcher(int[] r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3, int r4, Yue.C1769 r5) {
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.OpCodeMatchType r2 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            r0.<init>(r1, r2, r3)
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher create(@Yue.InterfaceC4418 java.util.Collection<java.lang.Integer> r1, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.OpCodeMatchType r2, @Yue.InterfaceC4543 org.luckypray.dexkit.query.matchers.base.IntRange r3) {
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r1 = r0.create(r1, r2, r3)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher create(@Yue.InterfaceC4418 int... r1) {
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r1 = r0.create(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher create(@Yue.InterfaceC4418 int[] r1, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.OpCodeMatchType r2, @Yue.InterfaceC4543 org.luckypray.dexkit.query.matchers.base.IntRange r3) {
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r1 = r0.create(r1, r2, r3)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher createForOpNames(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r1, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.OpCodeMatchType r2, @Yue.InterfaceC4543 org.luckypray.dexkit.query.matchers.base.IntRange r3) {
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r1 = r0.createForOpNames(r1, r2, r3)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher createForOpNames(@Yue.InterfaceC4418 java.lang.String... r1) {
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r1 = r0.createForOpNames(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher createForOpNames(@Yue.InterfaceC4418 java.lang.String[] r1, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.OpCodeMatchType r2, @Yue.InterfaceC4543 org.luckypray.dexkit.query.matchers.base.IntRange r3) {
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r1 = r0.createForOpNames(r1, r2, r3)
            return r1
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.base.OpCodesMatcher size$default(org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = r0.size(r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.enums.OpCodeMatchType getMatchType() {
            r1 = this;
            org.luckypray.dexkit.query.enums.OpCodeMatchType r0 = r1.matchType
            return r0
    }

    @Yue.InterfaceC4543
    public final java.util.Collection<java.lang.Integer> getOpCodes() {
            r1 = this;
            java.util.Collection<java.lang.Integer> r0 = r1.opCodes
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.base.IntRange getRangeMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = r1.rangeMatcher
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ int getSize() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r6) {
            r5 = this;
            java.lang.String r0 = "fbb"
            Yue.C3329.m13906(r6, r0)
            org.luckypray.dexkit.schema.-OpCodesMatcher$Companion r0 = org.luckypray.dexkit.schema.OpCodesMatcher.Companion
            java.util.Collection<java.lang.Integer> r1 = r5.opCodes
            r2 = 0
            if (r1 == 0) goto L41
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = Yue.C1210.m6231(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L34
            java.lang.Object r4 = r1.next()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            short r4 = (short) r4
            java.lang.Short r4 = java.lang.Short.valueOf(r4)
            r3.add(r4)
            goto L1b
        L34:
            short[] r1 = Yue.C1219.m6543(r3)
            if (r1 == 0) goto L41
            org.luckypray.dexkit.schema.-OpCodesMatcher$Companion r3 = org.luckypray.dexkit.schema.OpCodesMatcher.Companion
            int r1 = r3.createOpCodesVector(r6, r1)
            goto L42
        L41:
            r1 = r2
        L42:
            org.luckypray.dexkit.query.enums.OpCodeMatchType r3 = r5.matchType
            byte r3 = r3.getValue()
            org.luckypray.dexkit.query.matchers.base.IntRange r4 = r5.rangeMatcher
            if (r4 == 0) goto L50
            int r2 = r4.build$dexkit_android_release(r6)
        L50:
            int r0 = r0.createOpCodesMatcher(r6, r1, r3, r2)
            r6.finish(r0)
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher matchType(@Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.OpCodeMatchType r2) {
            r1 = this;
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r2, r0)
            r1.matchType = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher opCodes(@Yue.InterfaceC4418 java.util.Collection<java.lang.Integer> r2) {
            r1 = this;
            java.lang.String r0 = "opCodes"
            Yue.C3329.m13906(r2, r0)
            r1.opCodes = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher opCodes(@Yue.InterfaceC4418 java.lang.Integer[] r2) {
            r1 = this;
            java.lang.String r0 = "opCodes"
            Yue.C3329.m13906(r2, r0)
            java.util.List r2 = Yue.C0595.m3982(r2)
            r1.opCodes = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher opNames(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r3) {
            r2 = this;
            java.lang.String r0 = "opNames"
            Yue.C3329.m13906(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = Yue.C1210.m6231(r3, r1)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L14:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            int r1 = org.luckypray.dexkit.util.OpCodeUtil.getOpCode(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L14
        L2c:
            r2.opCodes = r0
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher opNames(@Yue.InterfaceC4418 java.lang.String[] r5) {
            r4 = this;
            java.lang.String r0 = "opNames"
            Yue.C3329.m13906(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.length
            r0.<init>(r1)
            int r1 = r5.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L1f
            r3 = r5[r2]
            int r3 = org.luckypray.dexkit.util.OpCodeUtil.getOpCode(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto Ld
        L1f:
            r4.opCodes = r0
            return r4
    }

    public final /* synthetic */ void setMatchType(org.luckypray.dexkit.query.enums.OpCodeMatchType r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            Yue.C3329.m13906(r2, r0)
            r1.matchType = r2
            return
    }

    public final /* synthetic */ void setOpCodes(java.util.Collection r1) {
            r0 = this;
            r0.opCodes = r1
            return
    }

    public final /* synthetic */ void setSize(int r1) {
            r0 = this;
            r0.size(r1)
            return
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher size(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r0.<init>(r2)
            r1.rangeMatcher = r0
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher size(int r2, int r3) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r0.<init>(r2, r3)
            r1.rangeMatcher = r0
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher size(@Yue.InterfaceC4418 Yue.C3279 r2) {
            r1 = this;
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r0.<init>(r2)
            r1.rangeMatcher = r0
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher size(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.IntRange r2) {
            r1 = this;
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            r1.rangeMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher sizeMax(int r3) {
            r2 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r1 = 0
            r0.<init>(r1, r3)
            r2.rangeMatcher = r0
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher sizeMin(int r3) {
            r2 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.<init>(r3, r1)
            r2.rangeMatcher = r0
            return r2
    }
}
