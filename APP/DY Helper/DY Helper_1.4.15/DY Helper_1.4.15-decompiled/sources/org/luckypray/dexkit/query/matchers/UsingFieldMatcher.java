package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class UsingFieldMatcher extends org.luckypray.dexkit.query.base.BaseMatcher {
    public static final org.luckypray.dexkit.query.matchers.UsingFieldMatcher.Companion Companion = null;
    private org.luckypray.dexkit.query.matchers.FieldMatcher matcher;
    private org.luckypray.dexkit.query.enums.UsingType usingType;

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

        public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher create() {
                r0 = this;
                org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = new org.luckypray.dexkit.query.matchers.UsingFieldMatcher
                r0.<init>()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.UsingFieldMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher.Companion = r0
            return
    }

    public UsingFieldMatcher() {
            r1 = this;
            r1.<init>()
            org.luckypray.dexkit.query.enums.UsingType r0 = org.luckypray.dexkit.query.enums.UsingType.Any
            r1.usingType = r0
            return
    }

    public UsingFieldMatcher(java.lang.String r2, org.luckypray.dexkit.query.enums.UsingType r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            r1.<init>()
            org.luckypray.dexkit.query.enums.UsingType r0 = org.luckypray.dexkit.query.enums.UsingType.Any
            r1.usingType = r0
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>(r2)
            r1.matcher = r0
            r1.usingType = r3
            return
    }

    public /* synthetic */ UsingFieldMatcher(java.lang.String r1, org.luckypray.dexkit.query.enums.UsingType r2, int r3, p000.AbstractC1067zq r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.UsingType r2 = org.luckypray.dexkit.query.enums.UsingType.Any
        L6:
            r0.<init>(r1, r2)
            return
    }

    public UsingFieldMatcher(java.lang.reflect.Field r2, org.luckypray.dexkit.query.enums.UsingType r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            r1.<init>()
            org.luckypray.dexkit.query.enums.UsingType r0 = org.luckypray.dexkit.query.enums.UsingType.Any
            r1.usingType = r0
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>(r2)
            r1.matcher = r0
            r1.usingType = r3
            return
    }

    public /* synthetic */ UsingFieldMatcher(java.lang.reflect.Field r1, org.luckypray.dexkit.query.enums.UsingType r2, int r3, p000.AbstractC1067zq r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.UsingType r2 = org.luckypray.dexkit.query.enums.UsingType.Any
        L6:
            r0.<init>(r1, r2)
            return
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher annotationCount$default(org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = r0.annotationCount(r1, r2)
            return r0
    }

    public static final org.luckypray.dexkit.query.matchers.UsingFieldMatcher create() {
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.UsingFieldMatcher.Companion
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = r0.create()
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher declaredClass$default(org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = r0.declaredClass(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher modifiers$default(org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0, int r1, org.luckypray.dexkit.query.enums.MatchType r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.MatchType r2 = org.luckypray.dexkit.query.enums.MatchType.Contains
        L6:
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = r0.modifiers(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher name$default(org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = r0.name(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher type$default(org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = r0.type(r1, r2, r3)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher addAnnotation(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addAnnotation(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher addAnnotation(org.luckypray.dexkit.query.matchers.AnnotationMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Lc:
            r1.matcher = r0
            r0.addAnnotation(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher addReadMethods(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addReadMethods(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher addReadMethods(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r2.matcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Lc:
            r2.matcher = r0
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r1.<init>(r3)
            r0.addReadMethod(r1)
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher addReadMethods(org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Lc:
            r1.matcher = r0
            r0.addReadMethod(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher addWriteMethod(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addWriteMethod(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher addWriteMethod(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r2.matcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Lc:
            r2.matcher = r0
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r1.<init>(r3)
            r0.addWriteMethod(r1)
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher addWriteMethod(org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Lc:
            r1.matcher = r0
            r0.addWriteMethod(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher annotationCount(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        L9:
            r1.matcher = r0
            r0.annotationCount(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher annotationCount(int r2, int r3) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        L9:
            r1.matcher = r0
            r0.annotationCount(r2, r3)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher annotationCount(org.luckypray.dexkit.query.matchers.base.IntRange r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Lc:
            r1.matcher = r0
            r0.annotationCount(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher annotationCount(p000.xm0 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Lc:
            r1.matcher = r0
            r0.annotationCount(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher annotations(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.annotations(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher annotations(org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Lc:
            r1.matcher = r0
            r0.annotations(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher declaredClass(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.declaredClass(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher declaredClass(java.lang.Class<?> r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Lc:
            r1.matcher = r0
            r0.declaredClass(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher declaredClass(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r6 = declaredClass$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher declaredClass(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r6 = declaredClass$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher declaredClass(java.lang.String r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Lf
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Lf:
            r1.matcher = r0
            r0.declaredClass(r2, r3, r4)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher declaredClass(org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Lc:
            r1.matcher = r0
            r0.declaredClass(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher descriptor(java.lang.String r14) {
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

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher field(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.field(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher field(org.luckypray.dexkit.query.matchers.FieldMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.matcher = r1
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

    public final org.luckypray.dexkit.query.matchers.FieldMatcher getMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r0.matcher
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

    @p000.InterfaceC0088bs
    public final /* synthetic */ java.lang.String getName() {
            r1 = this;
            fq r1 = new fq
            r0 = 0
            r1.<init>(r0)
            throw r1
    }

    @p000.InterfaceC0088bs
    public final /* synthetic */ java.lang.String getType() {
            r1 = this;
            fq r1 = new fq
            r0 = 0
            r1.<init>(r0)
            throw r1
    }

    public final org.luckypray.dexkit.query.enums.UsingType getUsingType() {
            r0 = this;
            org.luckypray.dexkit.query.enums.UsingType r0 = r0.usingType
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(p000.b40 r3) {
            r2 = this;
            r3.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r2.matcher
            if (r0 == 0) goto L1e
            org.luckypray.dexkit.schema.-UsingFieldMatcher$Companion r1 = org.luckypray.dexkit.schema.UsingFieldMatcher.Companion
            r0.getClass()
            int r0 = r0.build$dexkit_android_release(r3)
            org.luckypray.dexkit.query.enums.UsingType r2 = r2.usingType
            byte r2 = r2.getValue()
            int r2 = r1.createUsingFieldMatcher(r3, r0, r2)
            r3.m733(r2)
            return r2
        L1e:
            java.lang.String r2 = "UsingFieldMatcher matcher not set"
            p000.C1080.m7275(r2)
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher modifiers(int r3) {
            r2 = this;
            r0 = 0
            r1 = 2
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r2 = modifiers$default(r2, r3, r0, r1, r0)
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher modifiers(int r2, org.luckypray.dexkit.query.enums.MatchType r3) {
            r1 = this;
            r3.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Lc:
            r1.matcher = r0
            r0.modifiers(r2, r3)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher modifiers(org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Lc:
            r1.matcher = r0
            r0.modifiers(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher name(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r6 = name$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher name(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r6 = name$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher name(java.lang.String r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Lf
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Lf:
            r1.matcher = r0
            r0.name(r2, r3, r4)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher name(org.luckypray.dexkit.query.matchers.base.StringMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Lc:
            r1.matcher = r0
            r0.name(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher readMethods(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.readMethods(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher readMethods(org.luckypray.dexkit.query.matchers.MethodsMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Lc:
            r1.matcher = r0
            r0.readMethods(r2)
            return r1
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

    public final /* synthetic */ void setUsingType(org.luckypray.dexkit.query.enums.UsingType r1) {
            r0 = this;
            r1.getClass()
            r0.usingType = r1
            return
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher type(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.type(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher type(java.lang.Class<?> r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Lc:
            r1.matcher = r0
            r0.type(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher type(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r6 = type$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher type(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r6 = type$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher type(java.lang.String r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Lf
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Lf:
            r1.matcher = r0
            r0.type(r2, r3, r4)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher type(org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Lc:
            r1.matcher = r0
            r0.type(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher usingType(org.luckypray.dexkit.query.enums.UsingType r1) {
            r0 = this;
            r1.getClass()
            r0.usingType = r1
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher writeMethods(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.writeMethods(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.UsingFieldMatcher writeMethods(org.luckypray.dexkit.query.matchers.MethodsMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r1.matcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
        Lc:
            r1.matcher = r0
            r0.writeMethods(r2)
            return r1
    }
}
