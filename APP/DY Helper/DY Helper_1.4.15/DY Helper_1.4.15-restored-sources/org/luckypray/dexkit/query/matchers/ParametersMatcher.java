package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ParametersMatcher extends org.luckypray.dexkit.query.base.BaseMatcher {
    public static final org.luckypray.dexkit.query.matchers.ParametersMatcher.Companion Companion = null;
    private java.util.List<org.luckypray.dexkit.query.matchers.ParameterMatcher> paramsMatcher;
    private org.luckypray.dexkit.query.matchers.base.IntRange rangeMatcher;

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

        public final org.luckypray.dexkit.query.matchers.ParametersMatcher create() {
                r0 = this;
                org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
                r0.<init>()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.ParametersMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.ParametersMatcher.Companion = r0
            return
    }

    public ParametersMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ParametersMatcher add$default(org.luckypray.dexkit.query.matchers.ParametersMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r0.add(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ParametersMatcher count$default(org.luckypray.dexkit.query.matchers.ParametersMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r0.count(r1, r2)
            return r0
    }

    public static final org.luckypray.dexkit.query.matchers.ParametersMatcher create() {
            org.luckypray.dexkit.query.matchers.ParametersMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.ParametersMatcher.Companion
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r0.create()
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ParametersMatcher add(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.add(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher add(java.lang.Class<?> r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r0.<init>()
            org.luckypray.dexkit.query.matchers.ParameterMatcher r2 = r0.type(r2)
            r1.add(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher add(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.ParametersMatcher r6 = add$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher add(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ParametersMatcher r6 = add$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher add(java.lang.String r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r0.<init>()
            org.luckypray.dexkit.query.matchers.ParameterMatcher r2 = r0.type(r2, r3, r4)
            r1.add(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher add(org.luckypray.dexkit.query.matchers.ParameterMatcher r2) {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.ParameterMatcher> r0 = r1.paramsMatcher
            if (r0 != 0) goto L9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L9:
            r1.paramsMatcher = r0
            r0.add(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher count(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r0.<init>(r2)
            r1.rangeMatcher = r0
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher count(int r2, int r3) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r0.<init>(r2, r3)
            r1.rangeMatcher = r0
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher count(org.luckypray.dexkit.query.matchers.base.IntRange r1) {
            r0 = this;
            r1.getClass()
            r0.rangeMatcher = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher count(p000.xm0 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r0.<init>(r2)
            r1.rangeMatcher = r0
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher countMax(int r3) {
            r2 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r1 = 0
            r0.<init>(r1, r3)
            r2.rangeMatcher = r0
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher countMin(int r3) {
            r2 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.<init>(r3, r1)
            r2.rangeMatcher = r0
            return r2
    }

    @p000.InterfaceC0088bs
    public final /* synthetic */ int getCount() {
            r1 = this;
            fq r1 = new fq
            r0 = 0
            r1.<init>(r0)
            throw r1
    }

    public final java.util.List<org.luckypray.dexkit.query.matchers.ParameterMatcher> getParamsMatcher() {
            r0 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.ParameterMatcher> r0 = r0.paramsMatcher
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.IntRange getRangeMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = r0.rangeMatcher
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(p000.b40 r6) {
            r5 = this;
            r6.getClass()
            org.luckypray.dexkit.schema.-ParametersMatcher$Companion r0 = org.luckypray.dexkit.schema.ParametersMatcher.Companion
            java.util.List<org.luckypray.dexkit.query.matchers.ParameterMatcher> r1 = r5.paramsMatcher
            r2 = 0
            if (r1 == 0) goto L43
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = p000.AbstractC1021yh.m6889(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.next()
            org.luckypray.dexkit.query.matchers.ParameterMatcher r4 = (org.luckypray.dexkit.query.matchers.ParameterMatcher) r4
            if (r4 == 0) goto L2c
        L27:
            int r4 = r4.build$dexkit_android_release(r6)
            goto L32
        L2c:
            org.luckypray.dexkit.query.matchers.ParameterMatcher r4 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r4.<init>()
            goto L27
        L32:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            goto L19
        L3a:
            int[] r1 = p000.AbstractC0984xh.m6665(r3)
            int r1 = r6.m730(r1)
            goto L44
        L43:
            r1 = r2
        L44:
            org.luckypray.dexkit.query.matchers.base.IntRange r5 = r5.rangeMatcher
            if (r5 == 0) goto L4c
            int r2 = r5.build$dexkit_android_release(r6)
        L4c:
            int r5 = r0.createParametersMatcher(r6, r1, r2)
            r6.m733(r5)
            return r5
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher params(java.util.Collection<org.luckypray.dexkit.query.matchers.ParameterMatcher> r2) {
            r1 = this;
            r2.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.paramsMatcher = r0
            return r1
    }

    public final /* synthetic */ void setCount(int r1) {
            r0 = this;
            r0.count(r1)
            return
    }
}
