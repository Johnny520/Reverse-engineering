package org.luckypray.dexkit.query.matchers.base;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class TargetElementTypesMatcher extends org.luckypray.dexkit.query.base.BaseMatcher {
    public static final org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher.Companion Companion = null;
    private org.luckypray.dexkit.query.enums.MatchType matchType;
    private java.util.Collection<? extends org.luckypray.dexkit.query.enums.TargetElementType> types;

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

        public static /* synthetic */ org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher create$default(org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher.Companion r0, java.util.Collection r1, org.luckypray.dexkit.query.enums.MatchType r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L6
                org.luckypray.dexkit.query.enums.MatchType r2 = org.luckypray.dexkit.query.enums.MatchType.Contains
            L6:
                org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher r0 = r0.create(r1, r2)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher create(java.util.Collection<? extends org.luckypray.dexkit.query.enums.TargetElementType> r1, org.luckypray.dexkit.query.enums.MatchType r2) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher r0 = new org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher
                r0.<init>(r1, r2)
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

    public TargetElementTypesMatcher(java.util.Collection<? extends org.luckypray.dexkit.query.enums.TargetElementType> r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            r1 = 2
            r2.<init>(r3, r0, r1, r0)
            return
    }

    public TargetElementTypesMatcher(java.util.Collection<? extends org.luckypray.dexkit.query.enums.TargetElementType> r2, org.luckypray.dexkit.query.enums.MatchType r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            r1.<init>()
            org.luckypray.dexkit.query.enums.MatchType r0 = org.luckypray.dexkit.query.enums.MatchType.Contains
            r1.types = r2
            r1.matchType = r3
            return
    }

    public /* synthetic */ TargetElementTypesMatcher(java.util.Collection r1, org.luckypray.dexkit.query.enums.MatchType r2, int r3, p000.AbstractC1067zq r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.MatchType r2 = org.luckypray.dexkit.query.enums.MatchType.Contains
        L6:
            r0.<init>(r1, r2)
            return
    }

    public static final org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher create(java.util.Collection<? extends org.luckypray.dexkit.query.enums.TargetElementType> r1, org.luckypray.dexkit.query.enums.MatchType r2) {
            org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher r1 = r0.create(r1, r2)
            return r1
    }

    public final org.luckypray.dexkit.query.enums.MatchType getMatchType() {
            r0 = this;
            org.luckypray.dexkit.query.enums.MatchType r0 = r0.matchType
            return r0
    }

    public final java.util.Collection<org.luckypray.dexkit.query.enums.TargetElementType> getTypes() {
            r0 = this;
            java.util.Collection<? extends org.luckypray.dexkit.query.enums.TargetElementType> r0 = r0.types
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(p000.b40 r7) {
            r6 = this;
            r7.getClass()
            org.luckypray.dexkit.schema.-TargetElementTypesMatcher$Companion r0 = org.luckypray.dexkit.schema.TargetElementTypesMatcher.Companion
            java.util.Collection<? extends org.luckypray.dexkit.query.enums.TargetElementType> r1 = r6.types
            r2 = 0
            if (r1 == 0) goto L59
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = p000.AbstractC1021yh.m6889(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L33
            java.lang.Object r4 = r1.next()
            org.luckypray.dexkit.query.enums.TargetElementType r4 = (org.luckypray.dexkit.query.enums.TargetElementType) r4
            byte r4 = r4.getValue()
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            r3.add(r4)
            goto L1b
        L33:
            int r1 = r3.size()
            byte[] r1 = new byte[r1]
            java.util.Iterator r3 = r3.iterator()
        L3d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L53
            java.lang.Object r4 = r3.next()
            java.lang.Number r4 = (java.lang.Number) r4
            byte r4 = r4.byteValue()
            int r5 = r2 + 1
            r1[r2] = r4
            r2 = r5
            goto L3d
        L53:
            org.luckypray.dexkit.schema.-TargetElementTypesMatcher$Companion r2 = org.luckypray.dexkit.schema.TargetElementTypesMatcher.Companion
            int r2 = r2.createTypesVector(r7, r1)
        L59:
            org.luckypray.dexkit.query.enums.MatchType r6 = r6.matchType
            byte r6 = r6.getValue()
            int r6 = r0.createTargetElementTypesMatcher(r7, r2, r6)
            r7.m733(r6)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher matchType(org.luckypray.dexkit.query.enums.MatchType r1) {
            r0 = this;
            r1.getClass()
            r0.matchType = r1
            return r0
    }

    public final /* synthetic */ void setMatchType(org.luckypray.dexkit.query.enums.MatchType r1) {
            r0 = this;
            r1.getClass()
            r0.matchType = r1
            return
    }

    public final /* synthetic */ void setTypes(java.util.Collection r1) {
            r0 = this;
            r0.types = r1
            return
    }

    public final org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher types(java.util.Collection<? extends org.luckypray.dexkit.query.enums.TargetElementType> r1) {
            r0 = this;
            r1.getClass()
            r0.types = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher types(org.luckypray.dexkit.query.enums.TargetElementType... r1) {
            r0 = this;
            r1.getClass()
            java.util.List r1 = p000.AbstractC0312g7.m2262(r1)
            r0.types = r1
            return r0
    }
}
