package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationElementMatcher extends org.luckypray.dexkit.query.base.BaseMatcher {
    public static final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher.Companion Companion = null;
    private org.luckypray.dexkit.query.matchers.base.StringMatcher nameMatcher;
    private org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher valueMatcher;

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

        public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher create() {
                r0 = this;
                org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationElementMatcher
                r0.<init>()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.AnnotationElementMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher.Companion = r0
            return
    }

    public AnnotationElementMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationElementMatcher classValue$default(org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = r0.classValue(r1, r2, r3)
            return r0
    }

    public static final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher create() {
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.AnnotationElementMatcher.Companion
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = r0.create()
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationElementMatcher name$default(org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = r0.name(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationElementMatcher stringValue$default(org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r0 = r0.stringValue(r1, r2, r3)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationElementMatcher annotationValue(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.annotationValue(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher annotationValue(org.luckypray.dexkit.query.matchers.AnnotationMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.annotationValue(r2)
            r1.value(r0)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationElementMatcher arrayValue(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.arrayValue(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher arrayValue(org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.arrayValue(r2)
            r1.value(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher boolValue(boolean r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.boolValue(r2)
            r1.value(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher byteValue(byte r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.byteValue(r2)
            r1.value(r0)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationElementMatcher classValue(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.classValue(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher classValue(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r6 = classValue$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher classValue(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r6 = classValue$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher classValue(java.lang.String r3, org.luckypray.dexkit.query.enums.StringMatchType r4, boolean r5) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher$classValue$2$1$1 r1 = new org.luckypray.dexkit.query.matchers.AnnotationElementMatcher$classValue$2$1$1
            r1.<init>(r3, r4, r5)
            r0.classValue(r1)
            r2.value(r0)
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher classValue(org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.classValue(r2)
            r1.value(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher doubleValue(double r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.doubleValue(r2)
            r1.value(r0)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationElementMatcher enumValue(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.enumValue(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher enumValue(org.luckypray.dexkit.query.matchers.FieldMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.enumValue(r2)
            r1.value(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher floatValue(float r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.floatValue(r2)
            r1.value(r0)
            return r1
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

    @p000.InterfaceC0088bs
    public final /* synthetic */ org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher getValue() {
            r1 = this;
            fq r1 = new fq
            r0 = 0
            r1.<init>(r0)
            throw r1
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher getValueMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.valueMatcher
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(p000.b40 r5) {
            r4 = this;
            r5.getClass()
            org.luckypray.dexkit.schema.-AnnotationElementMatcher$Companion r0 = org.luckypray.dexkit.schema.AnnotationElementMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.StringMatcher r1 = r4.nameMatcher
            r2 = 0
            if (r1 == 0) goto Lf
            int r1 = r1.build$dexkit_android_release(r5)
            goto L10
        Lf:
            r1 = r2
        L10:
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r3 = r4.valueMatcher
            if (r3 == 0) goto L1f
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r3 = r3.getType()
            if (r3 == 0) goto L1f
            byte r3 = r3.m7396getValuew2LRezQ()
            goto L20
        L1f:
            r3 = r2
        L20:
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r4 = r4.valueMatcher
            if (r4 == 0) goto L29
            org.luckypray.dexkit.query.base.IAnnotationEncodeValue r4 = r4.getValue()
            goto L2a
        L29:
            r4 = 0
        L2a:
            org.luckypray.dexkit.query.base.BaseMatcher r4 = (org.luckypray.dexkit.query.base.BaseMatcher) r4
            if (r4 == 0) goto L32
            int r2 = r4.build$dexkit_android_release(r5)
        L32:
            int r4 = r0.m7406createAnnotationElementMatcherSpDDLgk(r5, r1, r3, r2)
            r5.m733(r4)
            return r4
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher intValue(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.intValue(r2)
            r1.value(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher longValue(long r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.longValue(r2)
            r1.value(r0)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationElementMatcher methodValue(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.methodValue(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher methodValue(org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.methodValue(r2)
            r1.value(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher name(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r6 = name$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher name(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r6 = name$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher name(java.lang.String r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r0.<init>(r2, r3, r4)
            r1.nameMatcher = r0
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher nullValue() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.nullValue()
            r1.value(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher numberValue(java.lang.Number r4) {
            r3 = this;
            r4.getClass()
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            boolean r1 = r4 instanceof java.lang.Byte
            if (r1 == 0) goto L14
            byte r4 = r4.byteValue()
            r0.byteValue(r4)
            goto L4f
        L14:
            boolean r1 = r4 instanceof java.lang.Short
            if (r1 == 0) goto L20
            short r4 = r4.shortValue()
            r0.shortValue(r4)
            goto L4f
        L20:
            boolean r1 = r4 instanceof java.lang.Integer
            if (r1 == 0) goto L2c
            int r4 = r4.intValue()
            r0.intValue(r4)
            goto L4f
        L2c:
            boolean r1 = r4 instanceof java.lang.Long
            if (r1 == 0) goto L38
            long r1 = r4.longValue()
            r0.longValue(r1)
            goto L4f
        L38:
            boolean r1 = r4 instanceof java.lang.Float
            if (r1 == 0) goto L44
            float r4 = r4.floatValue()
            r0.floatValue(r4)
            goto L4f
        L44:
            boolean r1 = r4 instanceof java.lang.Double
            if (r1 == 0) goto L4f
            double r1 = r4.doubleValue()
            r0.doubleValue(r1)
        L4f:
            r3.value(r0)
            return r3
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

    public final /* synthetic */ void setValue(org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.value(r1)
            return
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher shortValue(short r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.shortValue(r2)
            r1.value(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher stringValue(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r6 = stringValue$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher stringValue(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.AnnotationElementMatcher r6 = stringValue$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher stringValue(java.lang.String r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.stringValue(r2, r3, r4)
            r1.value(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher stringValue(org.luckypray.dexkit.query.matchers.base.StringMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.stringValue(r2)
            r1.value(r0)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationElementMatcher value(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.value(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationElementMatcher value(org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.valueMatcher = r1
            return r0
    }
}
