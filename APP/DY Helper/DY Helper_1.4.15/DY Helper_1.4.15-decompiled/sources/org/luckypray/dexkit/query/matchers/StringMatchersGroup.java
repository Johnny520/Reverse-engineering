package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class StringMatchersGroup extends org.luckypray.dexkit.query.base.BaseMatcher {
    public static final org.luckypray.dexkit.query.matchers.StringMatchersGroup.Companion Companion = null;
    private java.lang.String groupName;
    private java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> stringMatchers;

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

        public final org.luckypray.dexkit.query.matchers.StringMatchersGroup create() {
                r0 = this;
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

    public StringMatchersGroup(java.lang.String r2, java.util.Collection<org.luckypray.dexkit.query.matchers.base.StringMatcher> r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.stringMatchers = r0
            r1.groupName = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
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

    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup add(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r6 = add$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup add(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r6 = add$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup add(java.lang.String r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r0.<init>(r2, r3, r4)
            r1.add(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup add(org.luckypray.dexkit.query.matchers.base.StringMatcher r2) {
            r1 = this;
            r2.getClass()
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r0 = r1.stringMatchers
            r0.add(r2)
            return r1
    }

    public final java.lang.String getGroupName() {
            r0 = this;
            java.lang.String r0 = r0.groupName
            return r0
    }

    public final java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> getStringMatchers() {
            r0 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r0 = r0.stringMatchers
            return r0
    }

    @p000.InterfaceC0088bs
    public final /* synthetic */ java.util.Collection getUsingStrings() {
            r1 = this;
            fq r1 = new fq
            r0 = 0
            r1.<init>(r0)
            throw r1
    }

    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup groupName(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            r0.groupName = r1
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(p000.b40 r5) {
            r4 = this;
            r5.getClass()
            java.lang.String r0 = r4.groupName
            if (r0 == 0) goto L58
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r0 = r4.stringMatchers
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L50
            org.luckypray.dexkit.schema.-BatchUsingStringsMatcher$Companion r0 = org.luckypray.dexkit.schema.BatchUsingStringsMatcher.Companion
            java.lang.String r1 = r4.groupName
            int r1 = r5.m729(r1)
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r4 = r4.stringMatchers
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = p000.AbstractC1021yh.m6889(r4, r3)
            r2.<init>(r3)
            java.util.Iterator r4 = r4.iterator()
        L28:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L40
            java.lang.Object r3 = r4.next()
            org.luckypray.dexkit.query.matchers.base.StringMatcher r3 = (org.luckypray.dexkit.query.matchers.base.StringMatcher) r3
            int r3 = r3.build$dexkit_android_release(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            goto L28
        L40:
            int[] r4 = p000.AbstractC0984xh.m6665(r2)
            int r4 = r5.m730(r4)
            int r4 = r0.createBatchUsingStringsMatcher(r5, r1, r4)
            r5.m733(r4)
            return r4
        L50:
            java.lang.IllegalAccessException r4 = new java.lang.IllegalAccessException
            java.lang.String r5 = "matchers not be empty"
            r4.<init>(r5)
            throw r4
        L58:
            java.lang.IllegalAccessException r4 = new java.lang.IllegalAccessException
            java.lang.String r5 = "groupName not be null"
            r4.<init>(r5)
            throw r4
    }

    public final /* synthetic */ void setGroupName(java.lang.String r1) {
            r0 = this;
            r0.groupName = r1
            return
    }

    public final /* synthetic */ void setUsingStrings(java.util.Collection r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            usingStrings$default(r0, r1, r2, r3, r4, r5)
            return
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.StringMatchersGroup usingStrings(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.StringMatcherList r0 = new org.luckypray.dexkit.query.StringMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.usingStrings(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup usingStrings(java.util.Collection<java.lang.String> r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r6 = usingStrings$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup usingStrings(java.util.Collection<java.lang.String> r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r6 = usingStrings$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup usingStrings(java.util.Collection<java.lang.String> r4, org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r4, r1)
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L17:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r2.<init>(r1, r5, r6)
            r0.add(r2)
            goto L17
        L2c:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            r3.stringMatchers = r4
            return r3
    }

    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup usingStrings(org.luckypray.dexkit.query.StringMatcherList r1) {
            r0 = this;
            r1.getClass()
            r0.stringMatchers = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.StringMatchersGroup usingStrings(java.lang.String... r10) {
            r9 = this;
            r10.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r10.length
            r0.<init>(r1)
            int r1 = r10.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L1e
            r4 = r10[r2]
            org.luckypray.dexkit.query.matchers.base.StringMatcher r3 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            r0.add(r3)
            int r2 = r2 + 1
            goto Lb
        L1e:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r0)
            r9.stringMatchers = r10
            return r9
    }
}
