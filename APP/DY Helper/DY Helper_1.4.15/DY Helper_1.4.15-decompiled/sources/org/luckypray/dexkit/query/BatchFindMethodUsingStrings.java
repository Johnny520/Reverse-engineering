package org.luckypray.dexkit.query;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class BatchFindMethodUsingStrings extends org.luckypray.dexkit.query.base.BaseFinder {
    public static final org.luckypray.dexkit.query.BatchFindMethodUsingStrings.Companion Companion = null;
    private java.util.Collection<java.lang.String> excludePackages;
    private boolean ignorePackagesCase;
    private java.util.Collection<org.luckypray.dexkit.result.ClassData> searchClasses;
    private java.util.List<org.luckypray.dexkit.query.matchers.StringMatchersGroup> searchGroups;
    private java.util.Collection<org.luckypray.dexkit.result.MethodData> searchMethods;
    private java.util.Collection<java.lang.String> searchPackages;

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

        public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings create() {
                r0 = this;
                org.luckypray.dexkit.query.BatchFindMethodUsingStrings r0 = new org.luckypray.dexkit.query.BatchFindMethodUsingStrings
                r0.<init>()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.BatchFindMethodUsingStrings$Companion r0 = new org.luckypray.dexkit.query.BatchFindMethodUsingStrings$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.BatchFindMethodUsingStrings.Companion = r0
            return
    }

    public BatchFindMethodUsingStrings() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ org.luckypray.dexkit.query.BatchFindMethodUsingStrings addSearchGroup$default(org.luckypray.dexkit.query.BatchFindMethodUsingStrings r0, java.lang.String r1, java.util.Collection r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 4
            if (r6 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r3 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r5 = r5 & 8
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            org.luckypray.dexkit.query.BatchFindMethodUsingStrings r0 = r0.addSearchGroup(r1, r2, r3, r4)
            return r0
    }

    public static final org.luckypray.dexkit.query.BatchFindMethodUsingStrings create() {
            org.luckypray.dexkit.query.BatchFindMethodUsingStrings$Companion r0 = org.luckypray.dexkit.query.BatchFindMethodUsingStrings.Companion
            org.luckypray.dexkit.query.BatchFindMethodUsingStrings r0 = r0.create()
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.BatchFindMethodUsingStrings groups$default(org.luckypray.dexkit.query.BatchFindMethodUsingStrings r0, java.util.Map r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.BatchFindMethodUsingStrings r0 = r0.groups(r1, r2, r3)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.BatchFindMethodUsingStrings addSearchGroup(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = new org.luckypray.dexkit.query.matchers.StringMatchersGroup
            r0.<init>()
            r2.invoke(r0)
            r1.addSearchGroup(r0)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.BatchFindMethodUsingStrings addSearchGroup(java.lang.String r3, p000.a80 r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = new org.luckypray.dexkit.query.matchers.StringMatchersGroup
            org.luckypray.dexkit.query.StringMatcherList r1 = new org.luckypray.dexkit.query.StringMatcherList
            r1.<init>()
            r4.invoke(r1)
            r0.<init>(r3, r1)
            r2.addSearchGroup(r0)
            return r2
    }

    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings addSearchGroup(java.lang.String r8, java.util.Collection<java.lang.String> r9) {
            r7 = this;
            r8.getClass()
            r9.getClass()
            r5 = 12
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            org.luckypray.dexkit.query.BatchFindMethodUsingStrings r7 = addSearchGroup$default(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings addSearchGroup(java.lang.String r8, java.util.Collection<java.lang.String> r9, org.luckypray.dexkit.query.enums.StringMatchType r10) {
            r7 = this;
            r8.getClass()
            r9.getClass()
            r10.getClass()
            r5 = 8
            r6 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            org.luckypray.dexkit.query.BatchFindMethodUsingStrings r7 = addSearchGroup$default(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings addSearchGroup(java.lang.String r4, java.util.Collection<java.lang.String> r5, org.luckypray.dexkit.query.enums.StringMatchType r6, boolean r7) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            r6.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L1a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r2.<init>(r1, r6, r7)
            r0.add(r2)
            goto L1a
        L2f:
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r5 = new org.luckypray.dexkit.query.matchers.StringMatchersGroup
            r5.<init>(r4, r0)
            r3.addSearchGroup(r5)
            return r3
    }

    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings addSearchGroup(org.luckypray.dexkit.query.matchers.StringMatchersGroup r2) {
            r1 = this;
            r2.getClass()
            java.util.List<org.luckypray.dexkit.query.matchers.StringMatchersGroup> r0 = r1.searchGroups
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lc:
            r1.searchGroups = r0
            r0.add(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings excludePackages(java.util.Collection<java.lang.String> r1) {
            r0 = this;
            r1.getClass()
            r0.excludePackages = r1
            return r0
    }

    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings excludePackages(java.lang.String... r1) {
            r0 = this;
            r1.getClass()
            java.util.List r1 = p000.AbstractC0312g7.m2262(r1)
            r0.excludePackages = r1
            return r0
    }

    public final java.util.Collection<java.lang.String> getExcludePackages() {
            r0 = this;
            java.util.Collection<java.lang.String> r0 = r0.excludePackages
            return r0
    }

    public final boolean getIgnorePackagesCase() {
            r0 = this;
            boolean r0 = r0.ignorePackagesCase
            return r0
    }

    public final java.util.Collection<org.luckypray.dexkit.result.ClassData> getSearchClasses() {
            r0 = this;
            java.util.Collection<org.luckypray.dexkit.result.ClassData> r0 = r0.searchClasses
            return r0
    }

    public final java.util.List<org.luckypray.dexkit.query.matchers.StringMatchersGroup> getSearchGroups() {
            r0 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.StringMatchersGroup> r0 = r0.searchGroups
            return r0
    }

    public final java.util.Collection<org.luckypray.dexkit.result.MethodData> getSearchMethods() {
            r0 = this;
            java.util.Collection<org.luckypray.dexkit.result.MethodData> r0 = r0.searchMethods
            return r0
    }

    public final java.util.Collection<java.lang.String> getSearchPackages() {
            r0 = this;
            java.util.Collection<java.lang.String> r0 = r0.searchPackages
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.BatchFindMethodUsingStrings groups(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.StringMatchersGroupList r0 = new org.luckypray.dexkit.query.StringMatchersGroupList
            r0.<init>()
            r2.invoke(r0)
            r1.groups(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings groups(java.util.Collection<org.luckypray.dexkit.query.matchers.StringMatchersGroup> r2) {
            r1 = this;
            r2.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.searchGroups = r0
            return r1
    }

    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings groups(java.util.Map<java.lang.String, ? extends java.util.Collection<java.lang.String>> r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.BatchFindMethodUsingStrings r6 = groups$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings groups(java.util.Map<java.lang.String, ? extends java.util.Collection<java.lang.String>> r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.BatchFindMethodUsingStrings r6 = groups$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings groups(java.util.Map<java.lang.String, ? extends java.util.Collection<java.lang.String>> r7, org.luckypray.dexkit.query.enums.StringMatchType r8, boolean r9) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.size()
            r0.<init>(r1)
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L17:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = p000.AbstractC1021yh.m6889(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L40:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L55
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            org.luckypray.dexkit.query.matchers.base.StringMatcher r5 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r5.<init>(r4, r8, r9)
            r3.add(r5)
            goto L40
        L55:
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r1 = new org.luckypray.dexkit.query.matchers.StringMatchersGroup
            r1.<init>(r2, r3)
            r0.add(r1)
            goto L17
        L5e:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            r6.searchGroups = r7
            return r6
    }

    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings ignorePackagesCase(boolean r1) {
            r0 = this;
            r0.ignorePackagesCase = r1
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(p000.b40 r12) {
            r11 = this;
            r12.getClass()
            java.util.List<org.luckypray.dexkit.query.matchers.StringMatchersGroup> r0 = r11.searchGroups
            if (r0 == 0) goto L15f
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r3 = p000.AbstractC1021yh.m6889(r0, r2)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r0.next()
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r3 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r3
            java.lang.String r3 = r3.getGroupName()
            r1.add(r3)
            goto L16
        L2a:
            java.util.Set r0 = p000.AbstractC0984xh.m6671(r1)
            int r0 = r0.size()
            java.util.List<org.luckypray.dexkit.query.matchers.StringMatchersGroup> r1 = r11.searchGroups
            r1.getClass()
            int r1 = r1.size()
            if (r0 < r1) goto L157
            org.luckypray.dexkit.schema.-BatchFindMethodUsingStrings$Companion r3 = org.luckypray.dexkit.schema.BatchFindMethodUsingStrings.Companion
            java.util.Collection<java.lang.String> r0 = r11.searchPackages
            r1 = 0
            if (r0 == 0) goto L75
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = p000.AbstractC1021yh.m6889(r0, r2)
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L53:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L6b
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            int r5 = r12.m729(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.add(r5)
            goto L53
        L6b:
            int[] r0 = p000.AbstractC0984xh.m6665(r4)
            int r0 = r12.m730(r0)
            r5 = r0
            goto L76
        L75:
            r5 = r1
        L76:
            java.util.Collection<java.lang.String> r0 = r11.excludePackages
            if (r0 == 0) goto Lab
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = p000.AbstractC1021yh.m6889(r0, r2)
            r4.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L89:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto La1
            java.lang.Object r6 = r0.next()
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r12.m729(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.add(r6)
            goto L89
        La1:
            int[] r0 = p000.AbstractC0984xh.m6665(r4)
            int r0 = r12.m730(r0)
            r6 = r0
            goto Lac
        Lab:
            r6 = r1
        Lac:
            boolean r7 = r11.ignorePackagesCase
            java.util.Collection<org.luckypray.dexkit.result.ClassData> r0 = r11.searchClasses
            if (r0 == 0) goto Le5
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            int r8 = p000.AbstractC1021yh.m6889(r0, r2)
            r4.<init>(r8)
            java.util.Iterator r0 = r0.iterator()
        Lc1:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto Ld9
            java.lang.Object r8 = r0.next()
            org.luckypray.dexkit.result.ClassData r8 = (org.luckypray.dexkit.result.ClassData) r8
            long r8 = r8.getEncodeId()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r4.add(r8)
            goto Lc1
        Ld9:
            long[] r0 = p000.AbstractC0984xh.m6667(r4)
            org.luckypray.dexkit.schema.-BatchFindMethodUsingStrings$Companion r4 = org.luckypray.dexkit.schema.BatchFindMethodUsingStrings.Companion
            int r0 = r4.createInClassesVector(r12, r0)
            r8 = r0
            goto Le6
        Le5:
            r8 = r1
        Le6:
            java.util.Collection<org.luckypray.dexkit.result.MethodData> r0 = r11.searchMethods
            if (r0 == 0) goto L11b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = p000.AbstractC1021yh.m6889(r0, r2)
            r1.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        Lf9:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L111
            java.lang.Object r4 = r0.next()
            org.luckypray.dexkit.result.MethodData r4 = (org.luckypray.dexkit.result.MethodData) r4
            long r9 = r4.getEncodeId()
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            r1.add(r4)
            goto Lf9
        L111:
            long[] r0 = p000.AbstractC0984xh.m6667(r1)
            org.luckypray.dexkit.schema.-BatchFindMethodUsingStrings$Companion r1 = org.luckypray.dexkit.schema.BatchFindMethodUsingStrings.Companion
            int r1 = r1.createInMethodsVector(r12, r0)
        L11b:
            r9 = r1
            java.util.List<org.luckypray.dexkit.query.matchers.StringMatchersGroup> r11 = r11.searchGroups
            r11.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = p000.AbstractC1021yh.m6889(r11, r2)
            r0.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
        L12e:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L146
            java.lang.Object r1 = r11.next()
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r1 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r1
            int r1 = r1.build$dexkit_android_release(r12)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L12e
        L146:
            int[] r11 = p000.AbstractC0984xh.m6665(r0)
            int r10 = r12.m730(r11)
            r4 = r12
            int r11 = r3.createBatchFindMethodUsingStrings(r4, r5, r6, r7, r8, r9, r10)
            r4.m733(r11)
            return r11
        L157:
            java.lang.IllegalAccessException r11 = new java.lang.IllegalAccessException
            java.lang.String r12 = "groupName must be unique"
            r11.<init>(r12)
            throw r11
        L15f:
            java.lang.IllegalAccessException r11 = new java.lang.IllegalAccessException
            java.lang.String r12 = "searchGroups not be empty"
            r11.<init>(r12)
            throw r11
    }

    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings searchInClasses(java.util.Collection<org.luckypray.dexkit.result.ClassData> r1) {
            r0 = this;
            r1.getClass()
            r0.searchClasses = r1
            return r0
    }

    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings searchInMethods(java.util.Collection<org.luckypray.dexkit.result.MethodData> r1) {
            r0 = this;
            r1.getClass()
            r0.searchMethods = r1
            return r0
    }

    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings searchPackages(java.util.Collection<java.lang.String> r1) {
            r0 = this;
            r1.getClass()
            r0.searchPackages = r1
            return r0
    }

    public final org.luckypray.dexkit.query.BatchFindMethodUsingStrings searchPackages(java.lang.String... r1) {
            r0 = this;
            r1.getClass()
            java.util.List r1 = p000.AbstractC0312g7.m2262(r1)
            r0.searchPackages = r1
            return r0
    }

    public final /* synthetic */ void setExcludePackages(java.util.Collection r1) {
            r0 = this;
            r0.excludePackages = r1
            return
    }

    public final /* synthetic */ void setIgnorePackagesCase(boolean r1) {
            r0 = this;
            r0.ignorePackagesCase = r1
            return
    }

    public final /* synthetic */ void setSearchClasses(java.util.Collection r1) {
            r0 = this;
            r0.searchClasses = r1
            return
    }

    public final /* synthetic */ void setSearchMethods(java.util.Collection r1) {
            r0 = this;
            r0.searchMethods = r1
            return
    }

    public final /* synthetic */ void setSearchPackages(java.util.Collection r1) {
            r0 = this;
            r0.searchPackages = r1
            return
    }
}
