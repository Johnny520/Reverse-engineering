package org.luckypray.dexkit.query;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class FindClass extends org.luckypray.dexkit.query.base.BaseFinder {
    public static final org.luckypray.dexkit.query.FindClass.Companion Companion = null;
    private java.util.Collection<java.lang.String> excludePackages;
    private boolean findFirst;
    private boolean ignorePackagesCase;
    private org.luckypray.dexkit.query.matchers.ClassMatcher matcher;
    private java.util.Collection<org.luckypray.dexkit.result.ClassData> searchClasses;
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

        public final org.luckypray.dexkit.query.FindClass create() {
                r0 = this;
                org.luckypray.dexkit.query.FindClass r0 = new org.luckypray.dexkit.query.FindClass
                r0.<init>()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.FindClass$Companion r0 = new org.luckypray.dexkit.query.FindClass$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.FindClass.Companion = r0
            return
    }

    public FindClass() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final org.luckypray.dexkit.query.FindClass create() {
            org.luckypray.dexkit.query.FindClass$Companion r0 = org.luckypray.dexkit.query.FindClass.Companion
            org.luckypray.dexkit.query.FindClass r0 = r0.create()
            return r0
    }

    public final org.luckypray.dexkit.query.FindClass excludePackages(java.util.Collection<java.lang.String> r1) {
            r0 = this;
            r1.getClass()
            r0.excludePackages = r1
            return r0
    }

    public final org.luckypray.dexkit.query.FindClass excludePackages(java.lang.String... r1) {
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

    public final boolean getFindFirst() {
            r0 = this;
            boolean r0 = r0.findFirst
            return r0
    }

    public final boolean getIgnorePackagesCase() {
            r0 = this;
            boolean r0 = r0.ignorePackagesCase
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher getMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.matcher
            return r0
    }

    public final java.util.Collection<org.luckypray.dexkit.result.ClassData> getSearchClasses() {
            r0 = this;
            java.util.Collection<org.luckypray.dexkit.result.ClassData> r0 = r0.searchClasses
            return r0
    }

    public final java.util.Collection<java.lang.String> getSearchPackages() {
            r0 = this;
            java.util.Collection<java.lang.String> r0 = r0.searchPackages
            return r0
    }

    public final org.luckypray.dexkit.query.FindClass ignorePackagesCase(boolean r1) {
            r0 = this;
            r0.ignorePackagesCase = r1
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(p000.b40 r11) {
            r10 = this;
            r11.getClass()
            org.luckypray.dexkit.schema.-FindClass$Companion r0 = org.luckypray.dexkit.schema.FindClass.Companion
            java.util.Collection<java.lang.String> r1 = r10.searchPackages
            r2 = 10
            r3 = 0
            if (r1 == 0) goto L3c
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = p000.AbstractC1021yh.m6889(r1, r2)
            r4.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L33
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            int r5 = r11.m729(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.add(r5)
            goto L1b
        L33:
            int[] r1 = p000.AbstractC0984xh.m6665(r4)
            int r1 = r11.m730(r1)
            goto L3d
        L3c:
            r1 = r3
        L3d:
            java.util.Collection<java.lang.String> r4 = r10.excludePackages
            if (r4 == 0) goto L71
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = p000.AbstractC1021yh.m6889(r4, r2)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L50:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L68
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r11.m729(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.add(r6)
            goto L50
        L68:
            int[] r4 = p000.AbstractC0984xh.m6665(r5)
            int r4 = r11.m730(r4)
            goto L72
        L71:
            r4 = r3
        L72:
            boolean r5 = r10.ignorePackagesCase
            java.util.Collection<org.luckypray.dexkit.result.ClassData> r6 = r10.searchClasses
            if (r6 == 0) goto Laa
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            int r2 = p000.AbstractC1021yh.m6889(r6, r2)
            r7.<init>(r2)
            java.util.Iterator r2 = r6.iterator()
        L87:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L9f
            java.lang.Object r6 = r2.next()
            org.luckypray.dexkit.result.ClassData r6 = (org.luckypray.dexkit.result.ClassData) r6
            long r8 = r6.getEncodeId()
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            r7.add(r6)
            goto L87
        L9f:
            long[] r2 = p000.AbstractC0984xh.m6667(r7)
            org.luckypray.dexkit.schema.-FindClass$Companion r6 = org.luckypray.dexkit.schema.FindClass.Companion
            int r2 = r6.createInClassesVector(r11, r2)
            goto Lab
        Laa:
            r2 = r3
        Lab:
            boolean r6 = r10.findFirst
            org.luckypray.dexkit.query.matchers.ClassMatcher r10 = r10.matcher
            if (r10 == 0) goto Lb5
            int r3 = r10.build$dexkit_android_release(r11)
        Lb5:
            r7 = r3
            r3 = r4
            r4 = r5
            r5 = r2
            r2 = r1
            r1 = r11
            int r10 = r0.createFindClass(r1, r2, r3, r4, r5, r6, r7)
            r1.m733(r10)
            return r10
    }

    public final /* synthetic */ org.luckypray.dexkit.query.FindClass matcher(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.matcher(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.FindClass matcher(org.luckypray.dexkit.query.matchers.ClassMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.matcher = r1
            return r0
    }

    public final org.luckypray.dexkit.query.FindClass searchIn(java.util.Collection<org.luckypray.dexkit.result.ClassData> r1) {
            r0 = this;
            r1.getClass()
            r0.searchClasses = r1
            return r0
    }

    public final org.luckypray.dexkit.query.FindClass searchPackages(java.util.Collection<java.lang.String> r1) {
            r0 = this;
            r1.getClass()
            r0.searchPackages = r1
            return r0
    }

    public final org.luckypray.dexkit.query.FindClass searchPackages(java.lang.String... r1) {
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

    public final /* synthetic */ void setFindFirst(boolean r1) {
            r0 = this;
            r0.findFirst = r1
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

    public final /* synthetic */ void setSearchPackages(java.util.Collection r1) {
            r0 = this;
            r0.searchPackages = r1
            return
    }
}
