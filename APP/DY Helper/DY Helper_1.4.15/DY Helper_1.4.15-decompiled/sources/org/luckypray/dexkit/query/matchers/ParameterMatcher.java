package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ParameterMatcher extends org.luckypray.dexkit.query.base.BaseMatcher {
    public static final org.luckypray.dexkit.query.matchers.ParameterMatcher.Companion Companion = null;
    private org.luckypray.dexkit.query.matchers.AnnotationsMatcher annotationsMatcher;
    private org.luckypray.dexkit.query.matchers.ClassMatcher typeMatcher;

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

        public final org.luckypray.dexkit.query.matchers.ParameterMatcher create() {
                r0 = this;
                org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
                r0.<init>()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.ParameterMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.ParameterMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.ParameterMatcher.Companion = r0
            return
    }

    public ParameterMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final org.luckypray.dexkit.query.matchers.ParameterMatcher create() {
            org.luckypray.dexkit.query.matchers.ParameterMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.ParameterMatcher.Companion
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = r0.create()
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ParameterMatcher type$default(org.luckypray.dexkit.query.matchers.ParameterMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ParameterMatcher r0 = r0.type(r1, r2, r3)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ParameterMatcher addAnnotation(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addAnnotation(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ParameterMatcher addAnnotation(org.luckypray.dexkit.query.matchers.AnnotationMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r1.annotationsMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r0.<init>()
        Lc:
            r1.annotationsMatcher = r0
            r0.add(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ParameterMatcher annotationCount(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r1.annotationsMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r0.<init>()
        L9:
            r1.annotationsMatcher = r0
            r0.count(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ParameterMatcher annotations(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.annotations(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ParameterMatcher annotations(org.luckypray.dexkit.query.matchers.AnnotationsMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.annotationsMatcher = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationsMatcher getAnnotationsMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r0.annotationsMatcher
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

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(p000.b40 r4) {
            r3 = this;
            r4.getClass()
            org.luckypray.dexkit.schema.-ParameterMatcher$Companion r0 = org.luckypray.dexkit.schema.ParameterMatcher.Companion
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r1 = r3.annotationsMatcher
            r2 = 0
            if (r1 == 0) goto Lf
            int r1 = r1.build$dexkit_android_release(r4)
            goto L10
        Lf:
            r1 = r2
        L10:
            org.luckypray.dexkit.query.matchers.ClassMatcher r3 = r3.typeMatcher
            if (r3 == 0) goto L18
            int r2 = r3.build$dexkit_android_release(r4)
        L18:
            int r3 = r0.createParameterMatcher(r4, r1, r2)
            r4.m733(r3)
            return r3
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

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ParameterMatcher type(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.type(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ParameterMatcher type(java.lang.Class<?> r7) {
            r6 = this;
            r7.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            java.lang.String r1 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r7)
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r7 = org.luckypray.dexkit.query.matchers.ClassMatcher.className$default(r0, r1, r2, r3, r4, r5)
            r6.typeMatcher = r7
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.ParameterMatcher type(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.ParameterMatcher r6 = type$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.ParameterMatcher type(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ParameterMatcher r6 = type$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.ParameterMatcher type(java.lang.String r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r0.className(r2, r3, r4)
            r1.typeMatcher = r2
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ParameterMatcher type(org.luckypray.dexkit.query.matchers.ClassMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.typeMatcher = r1
            return r0
    }
}
