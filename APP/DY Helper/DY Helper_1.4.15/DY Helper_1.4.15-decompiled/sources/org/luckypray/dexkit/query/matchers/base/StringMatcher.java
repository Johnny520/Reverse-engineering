package org.luckypray.dexkit.query.matchers.base;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class StringMatcher extends org.luckypray.dexkit.query.base.BaseMatcher implements org.luckypray.dexkit.query.base.IAnnotationEncodeValue {
    public static final org.luckypray.dexkit.query.matchers.base.StringMatcher.Companion Companion = null;
    private boolean ignoreCase;
    private org.luckypray.dexkit.query.enums.StringMatchType matchType;
    private java.lang.String value;

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

        public static /* synthetic */ org.luckypray.dexkit.query.matchers.base.StringMatcher create$default(org.luckypray.dexkit.query.matchers.base.StringMatcher.Companion r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
                r5 = r4 & 2
                if (r5 == 0) goto L6
                org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
            L6:
                r4 = r4 & 4
                if (r4 == 0) goto Lb
                r3 = 0
            Lb:
                org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = r0.create(r1, r2, r3)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.StringMatcher create() {
                r0 = this;
                org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
                r0.<init>()
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.StringMatcher create(java.lang.String r7) {
                r6 = this;
                r7.getClass()
                r4 = 6
                r5 = 0
                r2 = 0
                r3 = 0
                r0 = r6
                r1 = r7
                org.luckypray.dexkit.query.matchers.base.StringMatcher r6 = create$default(r0, r1, r2, r3, r4, r5)
                return r6
        }

        public final org.luckypray.dexkit.query.matchers.base.StringMatcher create(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
                r6 = this;
                r7.getClass()
                r8.getClass()
                r4 = 4
                r5 = 0
                r3 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                org.luckypray.dexkit.query.matchers.base.StringMatcher r6 = create$default(r0, r1, r2, r3, r4, r5)
                return r6
        }

        public final org.luckypray.dexkit.query.matchers.base.StringMatcher create(java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
                r0.<init>(r1, r2, r3)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.base.StringMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.base.StringMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.base.StringMatcher.Companion = r0
            return
    }

    public StringMatcher() {
            r1 = this;
            r1.<init>()
            org.luckypray.dexkit.query.enums.StringMatchType r0 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
            r1.matchType = r0
            return
    }

    public StringMatcher(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public StringMatcher(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public StringMatcher(java.lang.String r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            r1.<init>()
            org.luckypray.dexkit.query.enums.StringMatchType r0 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
            r1.value = r2
            r1.matchType = r3
            r1.ignoreCase = r4
            return
    }

    public /* synthetic */ StringMatcher(java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, p000.AbstractC1067zq r5) {
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            r0.<init>(r1, r2, r3)
            return
    }

    public static final org.luckypray.dexkit.query.matchers.base.StringMatcher create() {
            org.luckypray.dexkit.query.matchers.base.StringMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.StringMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = r0.create()
            return r0
    }

    public static final org.luckypray.dexkit.query.matchers.base.StringMatcher create(java.lang.String r1) {
            org.luckypray.dexkit.query.matchers.base.StringMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.StringMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.StringMatcher r1 = r0.create(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.StringMatcher create(java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2) {
            org.luckypray.dexkit.query.matchers.base.StringMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.StringMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.StringMatcher r1 = r0.create(r1, r2)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.StringMatcher create(java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3) {
            org.luckypray.dexkit.query.matchers.base.StringMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.StringMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.StringMatcher r1 = r0.create(r1, r2, r3)
            return r1
    }

    public final boolean getIgnoreCase() {
            r0 = this;
            boolean r0 = r0.ignoreCase
            return r0
    }

    public final org.luckypray.dexkit.query.enums.StringMatchType getMatchType() {
            r0 = this;
            org.luckypray.dexkit.query.enums.StringMatchType r0 = r0.matchType
            return r0
    }

    public final java.lang.String getValue() {
            r0 = this;
            java.lang.String r0 = r0.value
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.StringMatcher ignoreCase(boolean r1) {
            r0 = this;
            r0.ignoreCase = r1
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(p000.b40 r4) {
            r3 = this;
            r4.getClass()
            java.lang.String r0 = r3.value
            if (r0 == 0) goto L33
            r0.getClass()
            int r0 = r0.length()
            if (r0 != 0) goto L18
            org.luckypray.dexkit.query.enums.StringMatchType r0 = r3.matchType
            org.luckypray.dexkit.query.enums.StringMatchType r1 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
            if (r0 == r1) goto L18
            r3.matchType = r1
        L18:
            org.luckypray.dexkit.schema.-StringMatcher$Companion r0 = org.luckypray.dexkit.schema.StringMatcher.Companion
            java.lang.String r1 = r3.value
            r1.getClass()
            int r1 = r4.m729(r1)
            org.luckypray.dexkit.query.enums.StringMatchType r2 = r3.matchType
            byte r2 = r2.getValue()
            boolean r3 = r3.ignoreCase
            int r3 = r0.createStringMatcher(r4, r1, r2, r3)
            r4.m733(r3)
            return r3
        L33:
            java.lang.String r3 = "value must be specified"
            p000.C1080.m7275(r3)
            r3 = 0
            return r3
    }

    public final org.luckypray.dexkit.query.matchers.base.StringMatcher matchType(org.luckypray.dexkit.query.enums.StringMatchType r1) {
            r0 = this;
            r1.getClass()
            r0.matchType = r1
            return r0
    }

    public final /* synthetic */ void setIgnoreCase(boolean r1) {
            r0 = this;
            r0.ignoreCase = r1
            return
    }

    public final /* synthetic */ void setMatchType(org.luckypray.dexkit.query.enums.StringMatchType r1) {
            r0 = this;
            r1.getClass()
            r0.matchType = r1
            return
    }

    public final /* synthetic */ void setValue(java.lang.String r1) {
            r0 = this;
            r0.value = r1
            return
    }

    public final org.luckypray.dexkit.query.matchers.base.StringMatcher value(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            r0.value = r1
            return r0
    }
}
