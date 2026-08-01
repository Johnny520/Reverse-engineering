package org.luckypray.dexkit.query.matchers.base;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class AccessFlagsMatcher extends org.luckypray.dexkit.query.base.BaseMatcher {
    public static final org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher.Companion Companion = null;
    private org.luckypray.dexkit.query.enums.MatchType matchType;
    private int modifiers;

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(p000.AbstractC1067zq r1) {
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

        public final org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher create(int r3) {
                r2 = this;
                r0 = 0
                r1 = 2
                org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r2 = create$default(r2, r3, r0, r1, r0)
                return r2
        }

        public final org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher create(int r1, org.luckypray.dexkit.query.enums.MatchType r2) {
                r0 = this;
                r2.getClass()
                org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher
                r0.<init>(r1, r2)
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

    public AccessFlagsMatcher(int r3) {
            r2 = this;
            r0 = 0
            r1 = 2
            r2.<init>(r3, r0, r1, r0)
            return
    }

    public AccessFlagsMatcher(int r2, org.luckypray.dexkit.query.enums.MatchType r3) {
            r1 = this;
            r3.getClass()
            r1.<init>()
            org.luckypray.dexkit.query.enums.MatchType r0 = org.luckypray.dexkit.query.enums.MatchType.Contains
            r1.modifiers = r2
            r1.matchType = r3
            return
    }

    public /* synthetic */ AccessFlagsMatcher(int r1, org.luckypray.dexkit.query.enums.MatchType r2, int r3, p000.AbstractC1067zq r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.MatchType r2 = org.luckypray.dexkit.query.enums.MatchType.Contains
        L6:
            r0.<init>(r1, r2)
            return
    }

    public final org.luckypray.dexkit.query.enums.MatchType getMatchType() {
            r0 = this;
            org.luckypray.dexkit.query.enums.MatchType r0 = r0.matchType
            return r0
    }

    public final int getModifiers() {
            r0 = this;
            int r0 = r0.modifiers
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(p000.b40 r3) {
            r2 = this;
            r3.getClass()
            int r0 = r2.modifiers
            if (r0 == 0) goto L17
            org.luckypray.dexkit.schema.-AccessFlagsMatcher$Companion r1 = org.luckypray.dexkit.schema.AccessFlagsMatcher.Companion
            org.luckypray.dexkit.query.enums.MatchType r2 = r2.matchType
            byte r2 = r2.getValue()
            int r2 = r1.m7402createAccessFlagsMatcherOsBMiQA(r3, r0, r2)
            r3.m733(r2)
            return r2
        L17:
            java.lang.String r2 = "modifiers must not be 0"
            p000.C1080.m7275(r2)
            r2 = 0
            return r2
    }

    public final /* synthetic */ void setMatchType(org.luckypray.dexkit.query.enums.MatchType r1) {
            r0 = this;
            r1.getClass()
            r0.matchType = r1
            return
    }

    public final /* synthetic */ void setModifiers(int r1) {
            r0 = this;
            r0.modifiers = r1
            return
    }
}
