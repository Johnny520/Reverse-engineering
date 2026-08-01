package org.luckypray.dexkit.query;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class FindMethod extends org.luckypray.dexkit.query.base.BaseFinder {
    public static final org.luckypray.dexkit.query.FindMethod.Companion Companion = null;
    private java.util.Collection<java.lang.String> excludePackages;
    private boolean findFirst;
    private boolean ignorePackagesCase;
    private org.luckypray.dexkit.query.matchers.MethodMatcher matcher;
    private java.util.Collection<org.luckypray.dexkit.result.ClassData> searchClasses;
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

        public final org.luckypray.dexkit.query.FindMethod create() {
                r0 = this;
                org.luckypray.dexkit.query.FindMethod r0 = new org.luckypray.dexkit.query.FindMethod
                r0.<init>()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.FindMethod$Companion r0 = new org.luckypray.dexkit.query.FindMethod$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.FindMethod.Companion = r0
            return
    }

    public FindMethod() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final org.luckypray.dexkit.query.FindMethod create() {
            org.luckypray.dexkit.query.FindMethod$Companion r0 = org.luckypray.dexkit.query.FindMethod.Companion
            org.luckypray.dexkit.query.FindMethod r0 = r0.create()
            return r0
    }

    public final org.luckypray.dexkit.query.FindMethod excludePackages(java.util.Collection<java.lang.String> r1) {
            r0 = this;
            r1.getClass()
            r0.excludePackages = r1
            return r0
    }

    public final org.luckypray.dexkit.query.FindMethod excludePackages(java.lang.String... r1) {
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

    public final org.luckypray.dexkit.query.matchers.MethodMatcher getMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.matcher
            return r0
    }

    public final java.util.Collection<org.luckypray.dexkit.result.ClassData> getSearchClasses() {
            r0 = this;
            java.util.Collection<org.luckypray.dexkit.result.ClassData> r0 = r0.searchClasses
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

    public final org.luckypray.dexkit.query.FindMethod ignorePackagesCase(boolean r1) {
            r0 = this;
            r0.ignorePackagesCase = r1
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(p000.b40 r12) {
            r11 = this;
            r12.getClass()
            org.luckypray.dexkit.schema.-FindMethod$Companion r0 = org.luckypray.dexkit.schema.FindMethod.Companion
            java.util.Collection<java.lang.String> r1 = r11.searchPackages
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
            int r5 = r12.m729(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.add(r5)
            goto L1b
        L33:
            int[] r1 = p000.AbstractC0984xh.m6665(r4)
            int r1 = r12.m730(r1)
            goto L3d
        L3c:
            r1 = r3
        L3d:
            java.util.Collection<java.lang.String> r4 = r11.excludePackages
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
            int r6 = r12.m729(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.add(r6)
            goto L50
        L68:
            int[] r4 = p000.AbstractC0984xh.m6665(r5)
            int r4 = r12.m730(r4)
            goto L72
        L71:
            r4 = r3
        L72:
            boolean r5 = r11.ignorePackagesCase
            java.util.Collection<org.luckypray.dexkit.result.ClassData> r6 = r11.searchClasses
            if (r6 == 0) goto Laa
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = p000.AbstractC1021yh.m6889(r6, r2)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L87:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L9f
            java.lang.Object r8 = r6.next()
            org.luckypray.dexkit.result.ClassData r8 = (org.luckypray.dexkit.result.ClassData) r8
            long r8 = r8.getEncodeId()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r7.add(r8)
            goto L87
        L9f:
            long[] r6 = p000.AbstractC0984xh.m6667(r7)
            org.luckypray.dexkit.schema.-FindMethod$Companion r7 = org.luckypray.dexkit.schema.FindMethod.Companion
            int r6 = r7.createInClassesVector(r12, r6)
            goto Lab
        Laa:
            r6 = r3
        Lab:
            java.util.Collection<org.luckypray.dexkit.result.MethodData> r7 = r11.searchMethods
            if (r7 == 0) goto Le1
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            int r2 = p000.AbstractC1021yh.m6889(r7, r2)
            r8.<init>(r2)
            java.util.Iterator r2 = r7.iterator()
        Lbe:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto Ld6
            java.lang.Object r7 = r2.next()
            org.luckypray.dexkit.result.MethodData r7 = (org.luckypray.dexkit.result.MethodData) r7
            long r9 = r7.getEncodeId()
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r8.add(r7)
            goto Lbe
        Ld6:
            long[] r2 = p000.AbstractC0984xh.m6667(r8)
            org.luckypray.dexkit.schema.-FindMethod$Companion r7 = org.luckypray.dexkit.schema.FindMethod.Companion
            int r2 = r7.createInMethodsVector(r12, r2)
            goto Le2
        Le1:
            r2 = r3
        Le2:
            boolean r7 = r11.findFirst
            org.luckypray.dexkit.query.matchers.MethodMatcher r11 = r11.matcher
            if (r11 == 0) goto Lec
            int r3 = r11.build$dexkit_android_release(r12)
        Lec:
            r8 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r2
            r2 = r1
            r1 = r12
            int r11 = r0.createFindMethod(r1, r2, r3, r4, r5, r6, r7, r8)
            r1.m733(r11)
            return r11
    }

    public final /* synthetic */ org.luckypray.dexkit.query.FindMethod matcher(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.matcher(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.FindMethod matcher(org.luckypray.dexkit.query.matchers.MethodMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.matcher = r1
            return r0
    }

    public final org.luckypray.dexkit.query.FindMethod searchInClass(java.util.Collection<org.luckypray.dexkit.result.ClassData> r1) {
            r0 = this;
            r1.getClass()
            r0.searchClasses = r1
            return r0
    }

    public final org.luckypray.dexkit.query.FindMethod searchInMethod(java.util.Collection<org.luckypray.dexkit.result.MethodData> r1) {
            r0 = this;
            r1.getClass()
            r0.searchMethods = r1
            return r0
    }

    public final org.luckypray.dexkit.query.FindMethod searchPackages(java.util.Collection<java.lang.String> r1) {
            r0 = this;
            r1.getClass()
            r0.searchPackages = r1
            return r0
    }

    public final org.luckypray.dexkit.query.FindMethod searchPackages(java.lang.String... r1) {
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
