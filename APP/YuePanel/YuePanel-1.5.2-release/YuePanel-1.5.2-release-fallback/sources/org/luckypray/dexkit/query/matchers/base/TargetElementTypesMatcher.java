package org.luckypray.dexkit.query.matchers.base;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001f\b\u0017\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u001f\u0010\u0003\u001a\u00020\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0016\"\u00020\u0005¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0003\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR4\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "()V", "types", "", "Lorg/luckypray/dexkit/query/enums/TargetElementType;", "matchType", "Lorg/luckypray/dexkit/query/enums/MatchType;", "(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/MatchType;)V", "<set-?>", "getMatchType", "()Lorg/luckypray/dexkit/query/enums/MatchType;", "setMatchType", "(Lorg/luckypray/dexkit/query/enums/MatchType;)V", "getTypes", "()Ljava/util/Collection;", "setTypes", "(Ljava/util/Collection;)V", "innerBuild", "", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "", "([Lorg/luckypray/dexkit/query/enums/TargetElementType;)Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@Yue.InterfaceC5840({"SMAP\nTargetElementTypesMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TargetElementTypesMatcher.kt\norg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1547#2:133\n1618#2,3:134\n1#3:137\n*S KotlinDebug\n*F\n+ 1 TargetElementTypesMatcher.kt\norg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher\n*L\n125#1:133\n125#1:134,3\n*E\n"})
public final class TargetElementTypesMatcher extends org.luckypray.dexkit.query.base.BaseMatcher {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher.Companion Companion = null;

    @Yue.InterfaceC4418
    private org.luckypray.dexkit.query.enums.MatchType matchType;

    @Yue.InterfaceC4543
    private java.util.Collection<? extends org.luckypray.dexkit.query.enums.TargetElementType> types;

    @Yue.InterfaceC4201(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;", "types", "", "Lorg/luckypray/dexkit/query/enums/TargetElementType;", "matchType", "Lorg/luckypray/dexkit/query/enums/MatchType;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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

        public static /* synthetic */ org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher create$default(org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher.Companion r0, java.util.Collection r1, org.luckypray.dexkit.query.enums.MatchType r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L6
                org.luckypray.dexkit.query.enums.MatchType r2 = org.luckypray.dexkit.query.enums.MatchType.Contains
            L6:
                org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher r0 = r0.create(r1, r2)
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher create(@Yue.InterfaceC4418 java.util.Collection<? extends org.luckypray.dexkit.query.enums.TargetElementType> r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.MatchType r3) {
                r1 = this;
                java.lang.String r0 = "types"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r0 = "matchType"
                Yue.C3329.m13906(r3, r0)
                org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher r0 = new org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher
                r0.<init>(r2, r3)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher.Companion = r0
            return
    }

    public TargetElementTypesMatcher() {
            r1 = this;
            r1.<init>()
            org.luckypray.dexkit.query.enums.MatchType r0 = org.luckypray.dexkit.query.enums.MatchType.Contains
            r1.matchType = r0
            return
    }

    @Yue.InterfaceC3422
    public TargetElementTypesMatcher(@Yue.InterfaceC4418 java.util.Collection<? extends org.luckypray.dexkit.query.enums.TargetElementType> r3) {
            r2 = this;
            java.lang.String r0 = "types"
            Yue.C3329.m13906(r3, r0)
            r0 = 0
            r1 = 2
            r2.<init>(r3, r0, r1, r0)
            return
    }

    @Yue.InterfaceC3422
    public TargetElementTypesMatcher(@Yue.InterfaceC4418 java.util.Collection<? extends org.luckypray.dexkit.query.enums.TargetElementType> r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.MatchType r3) {
            r1 = this;
            java.lang.String r0 = "types"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            org.luckypray.dexkit.query.enums.MatchType r0 = org.luckypray.dexkit.query.enums.MatchType.Contains
            r1.types = r2
            r1.matchType = r3
            return
    }

    public /* synthetic */ TargetElementTypesMatcher(java.util.Collection r1, org.luckypray.dexkit.query.enums.MatchType r2, int r3, Yue.C1769 r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.MatchType r2 = org.luckypray.dexkit.query.enums.MatchType.Contains
        L6:
            r0.<init>(r1, r2)
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher create(@Yue.InterfaceC4418 java.util.Collection<? extends org.luckypray.dexkit.query.enums.TargetElementType> r1, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.MatchType r2) {
            org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher r1 = r0.create(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.enums.MatchType getMatchType() {
            r1 = this;
            org.luckypray.dexkit.query.enums.MatchType r0 = r1.matchType
            return r0
    }

    @Yue.InterfaceC4543
    public final java.util.Collection<org.luckypray.dexkit.query.enums.TargetElementType> getTypes() {
            r1 = this;
            java.util.Collection<? extends org.luckypray.dexkit.query.enums.TargetElementType> r0 = r1.types
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r5) {
            r4 = this;
            java.lang.String r0 = "fbb"
            Yue.C3329.m13906(r5, r0)
            org.luckypray.dexkit.schema.-TargetElementTypesMatcher$Companion r0 = org.luckypray.dexkit.schema.TargetElementTypesMatcher.Companion
            java.util.Collection<? extends org.luckypray.dexkit.query.enums.TargetElementType> r1 = r4.types
            if (r1 == 0) goto L3f
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = Yue.C1210.m6231(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L32
            java.lang.Object r3 = r1.next()
            org.luckypray.dexkit.query.enums.TargetElementType r3 = (org.luckypray.dexkit.query.enums.TargetElementType) r3
            byte r3 = r3.getValue()
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2.add(r3)
            goto L1a
        L32:
            byte[] r1 = Yue.C1219.m6530(r2)
            if (r1 == 0) goto L3f
            org.luckypray.dexkit.schema.-TargetElementTypesMatcher$Companion r2 = org.luckypray.dexkit.schema.TargetElementTypesMatcher.Companion
            int r1 = r2.createTypesVector(r5, r1)
            goto L40
        L3f:
            r1 = 0
        L40:
            org.luckypray.dexkit.query.enums.MatchType r2 = r4.matchType
            byte r2 = r2.getValue()
            int r0 = r0.createTargetElementTypesMatcher(r5, r1, r2)
            r5.finish(r0)
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher matchType(@Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.MatchType r2) {
            r1 = this;
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r2, r0)
            r1.matchType = r2
            return r1
    }

    public final /* synthetic */ void setMatchType(org.luckypray.dexkit.query.enums.MatchType r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            Yue.C3329.m13906(r2, r0)
            r1.matchType = r2
            return
    }

    public final /* synthetic */ void setTypes(java.util.Collection r1) {
            r0 = this;
            r0.types = r1
            return
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher types(@Yue.InterfaceC4418 java.util.Collection<? extends org.luckypray.dexkit.query.enums.TargetElementType> r2) {
            r1 = this;
            java.lang.String r0 = "types"
            Yue.C3329.m13906(r2, r0)
            r1.types = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher types(@Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.TargetElementType... r2) {
            r1 = this;
            java.lang.String r0 = "types"
            Yue.C3329.m13906(r2, r0)
            java.util.List r2 = Yue.C0595.m3982(r2)
            r1.types = r2
            return r1
    }
}
