package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class FieldMatcher extends org.luckypray.dexkit.query.base.BaseMatcher implements org.luckypray.dexkit.query.base.IAnnotationEncodeValue {
    public static final org.luckypray.dexkit.query.matchers.FieldMatcher.Companion Companion = null;
    private java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> allOfMatchers;
    private org.luckypray.dexkit.query.matchers.AnnotationsMatcher annotationsMatcher;
    private java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> anyOfMatchers;
    private org.luckypray.dexkit.query.matchers.ClassMatcher classMatcher;
    private org.luckypray.dexkit.query.matchers.MethodsMatcher getMethodsMatcher;
    private org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher modifiersMatcher;
    private org.luckypray.dexkit.query.matchers.base.StringMatcher nameMatcher;
    private java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> noneOfMatchers;
    private org.luckypray.dexkit.query.matchers.MethodsMatcher putMethodsMatcher;
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

        public final org.luckypray.dexkit.query.matchers.FieldMatcher create() {
                r0 = this;
                org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
                r0.<init>()
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.FieldMatcher create(java.lang.String r1) {
                r0 = this;
                r1.getClass()
                org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
                r0.<init>(r1)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.FieldMatcher create(java.lang.reflect.Field r1) {
                r0 = this;
                r1.getClass()
                org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
                r0.<init>(r1)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.FieldMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.FieldMatcher.Companion = r0
            return
    }

    public FieldMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public FieldMatcher(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.descriptor(r1)
            return
    }

    public FieldMatcher(java.lang.reflect.Field r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            java.lang.String r1 = org.luckypray.dexkit.util.DexSignUtil.getFieldDescriptor(r1)
            r0.descriptor(r1)
            return
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher annotationCount$default(org.luckypray.dexkit.query.matchers.FieldMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r0.annotationCount(r1, r2)
            return r0
    }

    public static final org.luckypray.dexkit.query.matchers.FieldMatcher create() {
            org.luckypray.dexkit.query.matchers.FieldMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.FieldMatcher.Companion
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r0.create()
            return r0
    }

    public static final org.luckypray.dexkit.query.matchers.FieldMatcher create(java.lang.String r1) {
            org.luckypray.dexkit.query.matchers.FieldMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.FieldMatcher.Companion
            org.luckypray.dexkit.query.matchers.FieldMatcher r1 = r0.create(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.FieldMatcher create(java.lang.reflect.Field r1) {
            org.luckypray.dexkit.query.matchers.FieldMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.FieldMatcher.Companion
            org.luckypray.dexkit.query.matchers.FieldMatcher r1 = r0.create(r1)
            return r1
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher declaredClass$default(org.luckypray.dexkit.query.matchers.FieldMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r0.declaredClass(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher modifiers$default(org.luckypray.dexkit.query.matchers.FieldMatcher r0, int r1, org.luckypray.dexkit.query.enums.MatchType r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.MatchType r2 = org.luckypray.dexkit.query.enums.MatchType.Contains
        L6:
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r0.modifiers(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher name$default(org.luckypray.dexkit.query.matchers.FieldMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r0.name(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher type$default(org.luckypray.dexkit.query.matchers.FieldMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r0.type(r1, r2, r3)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher addAllOf(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addAllOf(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher addAllOf(org.luckypray.dexkit.query.matchers.FieldMatcher r2) {
            r1 = this;
            r2.getClass()
            java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> r0 = r1.allOfMatchers
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lc:
            r1.allOfMatchers = r0
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher addAnnotation(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addAnnotation(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher addAnnotation(org.luckypray.dexkit.query.matchers.AnnotationMatcher r2) {
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

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher addAnyOf(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addAnyOf(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher addAnyOf(org.luckypray.dexkit.query.matchers.FieldMatcher r2) {
            r1 = this;
            r2.getClass()
            java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> r0 = r1.anyOfMatchers
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lc:
            r1.anyOfMatchers = r0
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher addNoneOf(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addNoneOf(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher addNoneOf(org.luckypray.dexkit.query.matchers.FieldMatcher r2) {
            r1 = this;
            r2.getClass()
            java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> r0 = r1.noneOfMatchers
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lc:
            r1.noneOfMatchers = r0
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher addReadMethod(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addReadMethod(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher addReadMethod(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r2.getMethodsMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        Lc:
            r2.getMethodsMatcher = r0
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r1.<init>(r3)
            r0.add(r1)
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher addReadMethod(org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.getMethodsMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        Lc:
            r1.getMethodsMatcher = r0
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher addWriteMethod(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addWriteMethod(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher addWriteMethod(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r2.putMethodsMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        Lc:
            r2.putMethodsMatcher = r0
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r1.<init>(r3)
            r0.add(r1)
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher addWriteMethod(org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.putMethodsMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        Lc:
            r1.putMethodsMatcher = r0
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher allOf(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.FieldMatcherList r0 = new org.luckypray.dexkit.query.FieldMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.allOf(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher allOf(java.util.Collection<org.luckypray.dexkit.query.matchers.FieldMatcher> r3) {
            r2 = this;
            r3.getClass()
            boolean r0 = r3.isEmpty()
            r1 = 0
            if (r0 != 0) goto Lb
            goto Lc
        Lb:
            r3 = r1
        Lc:
            if (r3 == 0) goto L13
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
        L13:
            r2.allOfMatchers = r1
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher allOf(org.luckypray.dexkit.query.matchers.FieldMatcher... r1) {
            r0 = this;
            r1.getClass()
            java.util.List r1 = java.util.Arrays.asList(r1)
            r1.getClass()
            r0.allOf(r1)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher annotationCount(int r2) {
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

    public final org.luckypray.dexkit.query.matchers.FieldMatcher annotationCount(int r2, int r3) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r1.annotationsMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r0.<init>()
        L9:
            r1.annotationsMatcher = r0
            r0.count(r2, r3)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher annotationCount(org.luckypray.dexkit.query.matchers.base.IntRange r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r1.annotationsMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r0.<init>()
        Lc:
            r1.annotationsMatcher = r0
            r0.count(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher annotationCount(p000.xm0 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r1.annotationsMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r0.<init>()
        Lc:
            r1.annotationsMatcher = r0
            r0.count(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher annotations(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.annotations(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher annotations(org.luckypray.dexkit.query.matchers.AnnotationsMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.annotationsMatcher = r1
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher anyOf(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.FieldMatcherList r0 = new org.luckypray.dexkit.query.FieldMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.anyOf(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher anyOf(java.util.Collection<org.luckypray.dexkit.query.matchers.FieldMatcher> r3) {
            r2 = this;
            r3.getClass()
            boolean r0 = r3.isEmpty()
            r1 = 0
            if (r0 != 0) goto Lb
            goto Lc
        Lb:
            r3 = r1
        Lc:
            if (r3 == 0) goto L13
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
        L13:
            r2.anyOfMatchers = r1
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher anyOf(org.luckypray.dexkit.query.matchers.FieldMatcher... r1) {
            r0 = this;
            r1.getClass()
            java.util.List r1 = java.util.Arrays.asList(r1)
            r1.getClass()
            r0.anyOf(r1)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher declaredClass(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.declaredClass(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher declaredClass(java.lang.Class<?> r7) {
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
            r6.classMatcher = r7
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher declaredClass(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.FieldMatcher r6 = declaredClass$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher declaredClass(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.FieldMatcher r6 = declaredClass$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher declaredClass(java.lang.String r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r0.className(r2, r3, r4)
            r1.classMatcher = r2
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher declaredClass(org.luckypray.dexkit.query.matchers.ClassMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.classMatcher = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher descriptor(java.lang.String r14) {
            r13 = this;
            r14.getClass()
            org.luckypray.dexkit.wrap.DexField r0 = new org.luckypray.dexkit.wrap.DexField
            r0.<init>(r14)
            java.lang.String r2 = r0.getName()
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r13
            name$default(r1, r2, r3, r4, r5, r6)
            r7 = r1
            java.lang.String r8 = r0.getClassName()
            r11 = 6
            r12 = 0
            r9 = 0
            r10 = 0
            declaredClass$default(r7, r8, r9, r10, r11, r12)
            java.lang.String r8 = r0.getTypeName()
            type$default(r7, r8, r9, r10, r11, r12)
            return r7
    }

    public final java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> getAllOfMatchers() {
            r0 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> r0 = r0.allOfMatchers
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationsMatcher getAnnotationsMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r0.annotationsMatcher
            return r0
    }

    public final java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> getAnyOfMatchers() {
            r0 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> r0 = r0.anyOfMatchers
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher getClassMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.classMatcher
            return r0
    }

    @p000.InterfaceC0088bs
    public final /* synthetic */ java.lang.String getDeclaredClass() {
            r1 = this;
            fq r1 = new fq
            r0 = 0
            r1.<init>(r0)
            throw r1
    }

    @p000.InterfaceC0088bs
    public final /* synthetic */ java.lang.String getDescriptor() {
            r1 = this;
            fq r1 = new fq
            r0 = 0
            r1.<init>(r0)
            throw r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodsMatcher getGetMethodsMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r0.getMethodsMatcher
            return r0
    }

    @p000.InterfaceC0088bs
    public final /* synthetic */ int getModifiers() {
            r1 = this;
            fq r1 = new fq
            r0 = 0
            r1.<init>(r0)
            throw r1
    }

    public final org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher getModifiersMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r0 = r0.modifiersMatcher
            return r0
    }

    @p000.InterfaceC0088bs
    public final /* synthetic */ java.lang.String getName() {
            r1 = this;
            fq r1 = new fq
            r0 = 0
            r1.<init>(r0)
            throw r1
    }

    public final org.luckypray.dexkit.query.matchers.base.StringMatcher getNameMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = r0.nameMatcher
            return r0
    }

    public final java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> getNoneOfMatchers() {
            r0 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> r0 = r0.noneOfMatchers
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodsMatcher getPutMethodsMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r0.putMethodsMatcher
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
    public int innerBuild(p000.b40 r15) {
            r14 = this;
            r15.getClass()
            org.luckypray.dexkit.schema.-FieldMatcher$Companion r0 = org.luckypray.dexkit.schema.FieldMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.StringMatcher r1 = r14.nameMatcher
            r2 = 0
            if (r1 == 0) goto Lf
            int r1 = r1.build$dexkit_android_release(r15)
            goto L10
        Lf:
            r1 = r2
        L10:
            org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r3 = r14.modifiersMatcher
            if (r3 == 0) goto L19
            int r3 = r3.build$dexkit_android_release(r15)
            goto L1a
        L19:
            r3 = r2
        L1a:
            org.luckypray.dexkit.query.matchers.ClassMatcher r4 = r14.classMatcher
            if (r4 == 0) goto L23
            int r4 = r4.build$dexkit_android_release(r15)
            goto L24
        L23:
            r4 = r2
        L24:
            org.luckypray.dexkit.query.matchers.ClassMatcher r5 = r14.typeMatcher
            if (r5 == 0) goto L2d
            int r5 = r5.build$dexkit_android_release(r15)
            goto L2e
        L2d:
            r5 = r2
        L2e:
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r6 = r14.annotationsMatcher
            if (r6 == 0) goto L37
            int r6 = r6.build$dexkit_android_release(r15)
            goto L38
        L37:
            r6 = r2
        L38:
            org.luckypray.dexkit.query.matchers.MethodsMatcher r7 = r14.getMethodsMatcher
            if (r7 == 0) goto L41
            int r7 = r7.build$dexkit_android_release(r15)
            goto L42
        L41:
            r7 = r2
        L42:
            org.luckypray.dexkit.query.matchers.MethodsMatcher r8 = r14.putMethodsMatcher
            if (r8 == 0) goto L4b
            int r8 = r8.build$dexkit_android_release(r15)
            goto L4c
        L4b:
            r8 = r2
        L4c:
            java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> r9 = r14.allOfMatchers
            r10 = 10
            if (r9 == 0) goto L80
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = p000.AbstractC1021yh.m6889(r9, r10)
            r11.<init>(r12)
            java.util.Iterator r9 = r9.iterator()
        L5f:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L77
            java.lang.Object r12 = r9.next()
            org.luckypray.dexkit.query.matchers.FieldMatcher r12 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r12
            int r12 = r12.build$dexkit_android_release(r15)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.add(r12)
            goto L5f
        L77:
            int[] r9 = p000.AbstractC0984xh.m6665(r11)
            int r9 = r15.m730(r9)
            goto L81
        L80:
            r9 = r2
        L81:
            java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> r11 = r14.anyOfMatchers
            if (r11 == 0) goto Lb3
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = p000.AbstractC1021yh.m6889(r11, r10)
            r12.<init>(r13)
            java.util.Iterator r11 = r11.iterator()
        L92:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto Laa
            java.lang.Object r13 = r11.next()
            org.luckypray.dexkit.query.matchers.FieldMatcher r13 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r13
            int r13 = r13.build$dexkit_android_release(r15)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.add(r13)
            goto L92
        Laa:
            int[] r11 = p000.AbstractC0984xh.m6665(r12)
            int r11 = r15.m730(r11)
            goto Lb4
        Lb3:
            r11 = r2
        Lb4:
            java.util.List<org.luckypray.dexkit.query.matchers.FieldMatcher> r14 = r14.noneOfMatchers
            if (r14 == 0) goto Le5
            java.util.ArrayList r2 = new java.util.ArrayList
            int r10 = p000.AbstractC1021yh.m6889(r14, r10)
            r2.<init>(r10)
            java.util.Iterator r14 = r14.iterator()
        Lc5:
            boolean r10 = r14.hasNext()
            if (r10 == 0) goto Ldd
            java.lang.Object r10 = r14.next()
            org.luckypray.dexkit.query.matchers.FieldMatcher r10 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r10
            int r10 = r10.build$dexkit_android_release(r15)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r2.add(r10)
            goto Lc5
        Ldd:
            int[] r14 = p000.AbstractC0984xh.m6665(r2)
            int r2 = r15.m730(r14)
        Le5:
            r10 = r11
            r11 = r2
            r2 = r1
            r1 = r15
            int r14 = r0.createFieldMatcher(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1.m733(r14)
            return r14
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher modifiers(int r3) {
            r2 = this;
            r0 = 0
            r1 = 2
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = modifiers$default(r2, r3, r0, r1, r0)
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher modifiers(int r2, org.luckypray.dexkit.query.enums.MatchType r3) {
            r1 = this;
            r3.getClass()
            org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher
            r0.<init>(r2, r3)
            r1.modifiersMatcher = r0
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher modifiers(org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.modifiersMatcher = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher name(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.FieldMatcher r6 = name$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher name(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.FieldMatcher r6 = name$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher name(java.lang.String r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r0.<init>(r2, r3, r4)
            r1.nameMatcher = r0
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher name(org.luckypray.dexkit.query.matchers.base.StringMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.nameMatcher = r1
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher noneOf(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.FieldMatcherList r0 = new org.luckypray.dexkit.query.FieldMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.noneOf(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher noneOf(java.util.Collection<org.luckypray.dexkit.query.matchers.FieldMatcher> r3) {
            r2 = this;
            r3.getClass()
            boolean r0 = r3.isEmpty()
            r1 = 0
            if (r0 != 0) goto Lb
            goto Lc
        Lb:
            r3 = r1
        Lc:
            if (r3 == 0) goto L13
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
        L13:
            r2.noneOfMatchers = r1
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher noneOf(org.luckypray.dexkit.query.matchers.FieldMatcher... r1) {
            r0 = this;
            r1.getClass()
            java.util.List r1 = java.util.Arrays.asList(r1)
            r1.getClass()
            r0.noneOf(r1)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher not(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.not(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher not(org.luckypray.dexkit.query.matchers.FieldMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.addNoneOf(r1)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher readMethods(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.readMethods(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher readMethods(org.luckypray.dexkit.query.matchers.MethodsMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.getMethodsMatcher = r1
            return r0
    }

    public final /* synthetic */ void setDeclaredClass(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            declaredClass$default(r0, r1, r2, r3, r4, r5)
            return
    }

    public final /* synthetic */ void setDescriptor(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            r0.descriptor(r1)
            return
    }

    public final /* synthetic */ void setModifiers(int r3) {
            r2 = this;
            r0 = 0
            r1 = 2
            modifiers$default(r2, r3, r0, r1, r0)
            return
    }

    public final /* synthetic */ void setName(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            name$default(r0, r1, r2, r3, r4, r5)
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

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher type(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.type(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher type(java.lang.Class<?> r7) {
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

    public final org.luckypray.dexkit.query.matchers.FieldMatcher type(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.FieldMatcher r6 = type$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher type(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.FieldMatcher r6 = type$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher type(java.lang.String r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r0.className(r2, r3, r4)
            r1.typeMatcher = r2
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher type(org.luckypray.dexkit.query.matchers.ClassMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.typeMatcher = r1
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.FieldMatcher writeMethods(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.writeMethods(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.FieldMatcher writeMethods(org.luckypray.dexkit.query.matchers.MethodsMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.putMethodsMatcher = r1
            return r0
    }
}
