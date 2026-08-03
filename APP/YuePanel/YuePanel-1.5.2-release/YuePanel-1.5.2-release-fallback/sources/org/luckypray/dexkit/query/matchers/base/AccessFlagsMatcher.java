package org.luckypray.dexkit.query.matchers.base;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0014R$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "()V", "modifiers", "", "matchType", "Lorg/luckypray/dexkit/query/enums/MatchType;", "(ILorg/luckypray/dexkit/query/enums/MatchType;)V", "<set-?>", "getMatchType", "()Lorg/luckypray/dexkit/query/enums/MatchType;", "setMatchType", "(Lorg/luckypray/dexkit/query/enums/MatchType;)V", "getModifiers", "()I", "setModifiers", "(I)V", "innerBuild", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AccessFlagsMatcher extends org.luckypray.dexkit.query.base.BaseMatcher {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher.Companion Companion = null;

    @Yue.InterfaceC4418
    private org.luckypray.dexkit.query.enums.MatchType matchType;
    private int modifiers;

    @Yue.InterfaceC4201(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "modifiers", "", "matchType", "Lorg/luckypray/dexkit/query/enums/MatchType;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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

        public static /* synthetic */ org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher create$default(org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher.Companion r0, int r1, org.luckypray.dexkit.query.enums.MatchType r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L6
                org.luckypray.dexkit.query.enums.MatchType r2 = org.luckypray.dexkit.query.enums.MatchType.Contains
            L6:
                org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r0 = r0.create(r1, r2)
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3422
        public final org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher create(int r3) {
                r2 = this;
                r0 = 0
                r1 = 2
                org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r3 = create$default(r2, r3, r0, r1, r0)
                return r3
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3422
        public final org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher create(int r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.MatchType r3) {
                r1 = this;
                java.lang.String r0 = "matchType"
                Yue.C3329.m13906(r3, r0)
                org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher
                r0.<init>(r2, r3)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher.Companion = r0
            return
    }

    public AccessFlagsMatcher() {
            r1 = this;
            r1.<init>()
            org.luckypray.dexkit.query.enums.MatchType r0 = org.luckypray.dexkit.query.enums.MatchType.Contains
            r1.matchType = r0
            return
    }

    @Yue.InterfaceC3422
    public AccessFlagsMatcher(int r3) {
            r2 = this;
            r0 = 0
            r1 = 2
            r2.<init>(r3, r0, r1, r0)
            return
    }

    @Yue.InterfaceC3422
    public AccessFlagsMatcher(int r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.MatchType r3) {
            r1 = this;
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            org.luckypray.dexkit.query.enums.MatchType r0 = org.luckypray.dexkit.query.enums.MatchType.Contains
            r1.modifiers = r2
            r1.matchType = r3
            return
    }

    public /* synthetic */ AccessFlagsMatcher(int r1, org.luckypray.dexkit.query.enums.MatchType r2, int r3, Yue.C1769 r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.MatchType r2 = org.luckypray.dexkit.query.enums.MatchType.Contains
        L6:
            r0.<init>(r1, r2)
            return
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.enums.MatchType getMatchType() {
            r1 = this;
            org.luckypray.dexkit.query.enums.MatchType r0 = r1.matchType
            return r0
    }

    public final int getModifiers() {
            r1 = this;
            int r0 = r1.modifiers
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r4) {
            r3 = this;
            java.lang.String r0 = "fbb"
            Yue.C3329.m13906(r4, r0)
            int r0 = r3.modifiers
            if (r0 == 0) goto L1d
            org.luckypray.dexkit.schema.-AccessFlagsMatcher$Companion r1 = org.luckypray.dexkit.schema.AccessFlagsMatcher.Companion
            int r0 = Yue.C6528.m24937(r0)
            org.luckypray.dexkit.query.enums.MatchType r2 = r3.matchType
            byte r2 = r2.getValue()
            int r0 = r1.m30795createAccessFlagsMatcherOsBMiQA(r4, r0, r2)
            r4.finish(r0)
            return r0
        L1d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "modifiers must not be 0"
            r4.<init>(r0)
            throw r4
    }

    public final /* synthetic */ void setMatchType(org.luckypray.dexkit.query.enums.MatchType r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            Yue.C3329.m13906(r2, r0)
            r1.matchType = r2
            return
    }

    public final /* synthetic */ void setModifiers(int r1) {
            r0 = this;
            r0.modifiers = r1
            return
    }
}
