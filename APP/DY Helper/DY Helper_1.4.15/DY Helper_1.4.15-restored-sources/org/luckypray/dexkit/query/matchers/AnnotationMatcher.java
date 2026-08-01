package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationMatcher extends org.luckypray.dexkit.query.base.BaseMatcher implements org.luckypray.dexkit.query.base.IAnnotationEncodeValue {
    public static final org.luckypray.dexkit.query.matchers.AnnotationMatcher.Companion Companion = null;
    private org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher elementsMatcher;
    private org.luckypray.dexkit.query.enums.RetentionPolicyType policy;
    private org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher targetElementTypesMatcher;
    private org.luckypray.dexkit.query.matchers.ClassMatcher typeMatcher;
    private java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> usingStringsMatcher;

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

        public final org.luckypray.dexkit.query.matchers.AnnotationMatcher create() {
                r0 = this;
                org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationMatcher
                r0.<init>()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.AnnotationMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.AnnotationMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.AnnotationMatcher.Companion = r0
            return
    }

    public AnnotationMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationMatcher addUsingString$default(org.luckypray.dexkit.query.matchers.AnnotationMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = r0.addUsingString(r1, r2, r3)
            return r0
    }

    public static final org.luckypray.dexkit.query.matchers.AnnotationMatcher create() {
            org.luckypray.dexkit.query.matchers.AnnotationMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.AnnotationMatcher.Companion
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = r0.create()
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationMatcher elementCount$default(org.luckypray.dexkit.query.matchers.AnnotationMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = r0.elementCount(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationMatcher targetElementTypes$default(org.luckypray.dexkit.query.matchers.AnnotationMatcher r0, java.util.Collection r1, org.luckypray.dexkit.query.enums.MatchType r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.MatchType r2 = org.luckypray.dexkit.query.enums.MatchType.Contains
        L6:
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = r0.targetElementTypes(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationMatcher type$default(org.luckypray.dexkit.query.matchers.AnnotationMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = r0.type(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationMatcher usingStrings$default(org.luckypray.dexkit.query.matchers.AnnotationMatcher r0, java.util.Collection r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = r0.usingStrings(r1, r2, r3)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationMatcher addElement(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationElementMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addElement(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher addElement(org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = r1.elementsMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher
            r0.<init>()
        Lc:
            r1.elementsMatcher = r0
            r0.add(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher addEqString(java.lang.String r5) {
            r4 = this;
            r5.getClass()
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r0 = r4.usingStringsMatcher
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lc:
            r4.usingStringsMatcher = r0
            org.luckypray.dexkit.query.matchers.base.StringMatcher r1 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
            r3 = 0
            r1.<init>(r5, r2, r3)
            r0.add(r1)
            return r4
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher addUsingString(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r6 = addUsingString$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher addUsingString(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r6 = addUsingString$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher addUsingString(java.lang.String r3, org.luckypray.dexkit.query.enums.StringMatchType r4, boolean r5) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r0 = r2.usingStringsMatcher
            if (r0 != 0) goto Lf
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lf:
            r2.usingStringsMatcher = r0
            org.luckypray.dexkit.query.matchers.base.StringMatcher r1 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r1.<init>(r3, r4, r5)
            r0.add(r1)
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher addUsingString(org.luckypray.dexkit.query.matchers.base.StringMatcher r2) {
            r1 = this;
            r2.getClass()
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r0 = r1.usingStringsMatcher
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lc:
            r1.usingStringsMatcher = r0
            r0.add(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher elementCount(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = r1.elementsMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher
            r0.<init>()
        L9:
            r1.elementsMatcher = r0
            r0.count(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher elementCount(int r2, int r3) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = r1.elementsMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher
            r0.<init>()
        L9:
            r1.elementsMatcher = r0
            r0.count(r2, r3)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher elementCount(org.luckypray.dexkit.query.matchers.base.IntRange r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = r1.elementsMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher
            r0.<init>()
        Lc:
            r1.elementsMatcher = r0
            r0.count(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher elementCount(p000.xm0 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = r1.elementsMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher
            r0.<init>()
        Lc:
            r1.elementsMatcher = r0
            r0.count(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher elementMatchType(org.luckypray.dexkit.query.enums.MatchType r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = r1.elementsMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher
            r0.<init>()
        Lc:
            r1.elementsMatcher = r0
            r0.matchType(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationMatcher elements(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.elements(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher elements(org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.elementsMatcher = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher getElementsMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r0 = r0.elementsMatcher
            return r0
    }

    public final org.luckypray.dexkit.query.enums.RetentionPolicyType getPolicy() {
            r0 = this;
            org.luckypray.dexkit.query.enums.RetentionPolicyType r0 = r0.policy
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher getTargetElementTypesMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher r0 = r0.targetElementTypesMatcher
            return r0
    }

    @p000.InterfaceC0088bs
    public final /* synthetic */ java.lang.String getType() {
            r1 = this;
            fq r1 = new fq
            r0 = 0
            r1.<init>(r0)
            throw r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher getTypeMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.typeMatcher
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

    public final java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> getUsingStringsMatcher() {
            r0 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r0 = r0.usingStringsMatcher
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(p000.b40 r8) {
            r7 = this;
            r8.getClass()
            org.luckypray.dexkit.schema.-AnnotationMatcher$Companion r0 = org.luckypray.dexkit.schema.AnnotationMatcher.Companion
            org.luckypray.dexkit.query.matchers.ClassMatcher r1 = r7.typeMatcher
            r2 = 0
            if (r1 == 0) goto Lf
            int r1 = r1.build$dexkit_android_release(r8)
            goto L10
        Lf:
            r1 = r2
        L10:
            org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher r3 = r7.targetElementTypesMatcher
            if (r3 == 0) goto L19
            int r3 = r3.build$dexkit_android_release(r8)
            goto L1a
        L19:
            r3 = r2
        L1a:
            org.luckypray.dexkit.query.enums.RetentionPolicyType r4 = r7.policy
            if (r4 == 0) goto L23
            byte r4 = r4.getValue()
            goto L24
        L23:
            r4 = r2
        L24:
            org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher r5 = r7.elementsMatcher
            if (r5 == 0) goto L2d
            int r5 = r5.build$dexkit_android_release(r8)
            goto L2e
        L2d:
            r5 = r2
        L2e:
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r7 = r7.usingStringsMatcher
            if (r7 == 0) goto L61
            java.util.ArrayList r2 = new java.util.ArrayList
            r6 = 10
            int r6 = p000.AbstractC1021yh.m6889(r7, r6)
            r2.<init>(r6)
            java.util.Iterator r7 = r7.iterator()
        L41:
            boolean r6 = r7.hasNext()
            if (r6 == 0) goto L59
            java.lang.Object r6 = r7.next()
            org.luckypray.dexkit.query.matchers.base.StringMatcher r6 = (org.luckypray.dexkit.query.matchers.base.StringMatcher) r6
            int r6 = r6.build$dexkit_android_release(r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2.add(r6)
            goto L41
        L59:
            int[] r7 = p000.AbstractC0984xh.m6665(r2)
            int r2 = r8.m730(r7)
        L61:
            r6 = r2
            r2 = r1
            r1 = r8
            int r7 = r0.createAnnotationMatcher(r1, r2, r3, r4, r5, r6)
            r1.m733(r7)
            return r7
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher policy(org.luckypray.dexkit.query.enums.RetentionPolicyType r1) {
            r0 = this;
            r1.getClass()
            r0.policy = r1
            return r0
    }

    public final /* synthetic */ void setPolicy(org.luckypray.dexkit.query.enums.RetentionPolicyType r1) {
            r0 = this;
            r0.policy = r1
            return
    }

    public final /* synthetic */ void setType(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            type$default(r0, r1, r2, r3, r4, r5)
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

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationMatcher targetElementTypes(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher r0 = new org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.targetElementTypes(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher targetElementTypes(java.util.Collection<? extends org.luckypray.dexkit.query.enums.TargetElementType> r2, org.luckypray.dexkit.query.enums.MatchType r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher r0 = new org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher
            r0.<init>()
            r0.types(r2)
            r0.matchType(r3)
            r1.targetElementTypesMatcher = r0
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher targetElementTypes(org.luckypray.dexkit.query.matchers.base.TargetElementTypesMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.targetElementTypesMatcher = r1
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationMatcher type(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.type(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher type(java.lang.Class<?> r7) {
            r6 = this;
            r7.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            java.lang.String r1 = r7.getName()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r7 = org.luckypray.dexkit.query.matchers.ClassMatcher.className$default(r0, r1, r2, r3, r4, r5)
            r6.typeMatcher = r7
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher type(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r6 = type$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher type(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r6 = type$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher type(java.lang.String r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r0.className(r2, r3, r4)
            r1.typeMatcher = r2
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher type(org.luckypray.dexkit.query.matchers.ClassMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.typeMatcher = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher usingEqStrings(java.util.Collection<java.lang.String> r6) {
            r5 = this;
            r6.getClass()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L14:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            org.luckypray.dexkit.query.enums.StringMatchType r3 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
            r4 = 0
            r2.<init>(r1, r3, r4)
            r0.add(r2)
            goto L14
        L2c:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            r5.usingStringsMatcher = r6
            return r5
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher usingEqStrings(java.lang.String... r8) {
            r7 = this;
            r8.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r8.length
            r0.<init>(r1)
            int r1 = r8.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L1d
            r4 = r8[r3]
            org.luckypray.dexkit.query.matchers.base.StringMatcher r5 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            org.luckypray.dexkit.query.enums.StringMatchType r6 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
            r5.<init>(r4, r6, r2)
            r0.add(r5)
            int r3 = r3 + 1
            goto Lc
        L1d:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            r7.usingStringsMatcher = r8
            return r7
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher usingStrings(java.util.Collection<java.lang.String> r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r6 = usingStrings$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher usingStrings(java.util.Collection<java.lang.String> r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r6 = usingStrings$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher usingStrings(java.util.Collection<java.lang.String> r4, org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
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
            r3.usingStringsMatcher = r4
            return r3
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher usingStrings(org.luckypray.dexkit.query.StringMatcherList r1) {
            r0 = this;
            r1.getClass()
            r0.usingStringsMatcher = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationMatcher usingStrings(java.lang.String... r10) {
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
            r9.usingStringsMatcher = r10
            return r9
    }
}
