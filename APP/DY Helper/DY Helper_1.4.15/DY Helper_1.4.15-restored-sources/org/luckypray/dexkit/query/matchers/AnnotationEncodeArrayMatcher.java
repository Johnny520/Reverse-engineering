package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationEncodeArrayMatcher extends org.luckypray.dexkit.query.base.BaseMatcher implements org.luckypray.dexkit.query.base.IAnnotationEncodeValue {
    public static final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher.Companion Companion = null;
    private java.util.List<org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher> encodeValuesMatcher;
    private org.luckypray.dexkit.query.enums.MatchType matchType;
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

        public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher create() {
                r0 = this;
                org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher
                r0.<init>()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher.Companion = r0
            return
    }

    public AnnotationEncodeArrayMatcher() {
            r1 = this;
            r1.<init>()
            org.luckypray.dexkit.query.enums.MatchType r0 = org.luckypray.dexkit.query.enums.MatchType.Contains
            r1.matchType = r0
            return
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addClass$default(org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = r0.addClass(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addString$default(org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = r0.addString(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher count$default(org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = r0.count(r1, r2)
            return r0
    }

    public static final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher create() {
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher.Companion
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = r0.create()
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher add(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.add(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher add(org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r2) {
            r1 = this;
            r2.getClass()
            java.util.List<org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher> r0 = r1.encodeValuesMatcher
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lc:
            r1.encodeValuesMatcher = r0
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addAnnotation(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addAnnotation(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addAnnotation(org.luckypray.dexkit.query.matchers.AnnotationMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.annotationValue(r2)
            r1.add(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addBool(boolean r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.boolValue(r2)
            r1.add(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addByte(byte r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.byteValue(r2)
            r1.add(r0)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addClass(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addClass(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addClass(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r6 = addClass$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addClass(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r6 = addClass$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addClass(java.lang.String r3, org.luckypray.dexkit.query.enums.StringMatchType r4, boolean r5) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher$addClass$2$1$1 r1 = new org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher$addClass$2$1$1
            r1.<init>(r3, r4, r5)
            r0.classValue(r1)
            r2.add(r0)
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addClass(org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.classValue(r2)
            r1.add(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addDouble(double r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.doubleValue(r2)
            r1.add(r0)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addEnum(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addEnum(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addEnum(org.luckypray.dexkit.query.matchers.FieldMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.enumValue(r2)
            r1.add(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addFloat(float r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.floatValue(r2)
            r1.add(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addInt(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.intValue(r2)
            r1.add(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addLong(long r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.longValue(r2)
            r1.add(r0)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addMethod(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addMethod(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addMethod(org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.methodValue(r2)
            r1.add(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addNull() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.nullValue()
            r1.add(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addNumber(java.lang.Number r4) {
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
            r3.add(r0)
            return r3
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addShort(short r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.shortValue(r2)
            r1.add(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addString(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r6 = addString$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addString(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r6 = addString$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addString(java.lang.String r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.stringValue(r2, r3, r4)
            r1.add(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher addString(org.luckypray.dexkit.query.matchers.base.StringMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
            r0.<init>()
            r0.stringValue(r2)
            r1.add(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher count(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r0.<init>(r2)
            r1.rangeMatcher = r0
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher count(int r2, int r3) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r0.<init>(r2, r3)
            r1.rangeMatcher = r0
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher count(org.luckypray.dexkit.query.matchers.base.IntRange r1) {
            r0 = this;
            r1.getClass()
            r0.rangeMatcher = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher count(p000.xm0 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r0.<init>(r2)
            r1.rangeMatcher = r0
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher countMax(int r3) {
            r2 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = new org.luckypray.dexkit.query.matchers.base.IntRange
            r1 = 0
            r0.<init>(r1, r3)
            r2.rangeMatcher = r0
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher countMin(int r3) {
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

    public final java.util.List<org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher> getEncodeValuesMatcher() {
            r0 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher> r0 = r0.encodeValuesMatcher
            return r0
    }

    public final org.luckypray.dexkit.query.enums.MatchType getMatchType() {
            r0 = this;
            org.luckypray.dexkit.query.enums.MatchType r0 = r0.matchType
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.IntRange getRangeMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.base.IntRange r0 = r0.rangeMatcher
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(p000.b40 r8) {
            r7 = this;
            r8.getClass()
            org.luckypray.dexkit.schema.-AnnotationEncodeArrayMatcher$Companion r0 = org.luckypray.dexkit.schema.AnnotationEncodeArrayMatcher.Companion
            java.util.List<org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher> r1 = r7.encodeValuesMatcher
            r2 = 10
            r3 = 0
            if (r1 == 0) goto L44
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = p000.AbstractC1021yh.m6889(r1, r2)
            r4.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L39
            java.lang.Object r5 = r1.next()
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r5 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r5
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r5 = r5.getType()
            r5.getClass()
            byte r5 = r5.m7396getValuew2LRezQ()
            o62 r6 = new o62
            r6.<init>(r5)
            r4.add(r6)
            goto L19
        L39:
            byte[] r1 = p000.v81.m6135(r4)
            org.luckypray.dexkit.schema.-AnnotationEncodeArrayMatcher$Companion r4 = org.luckypray.dexkit.schema.AnnotationEncodeArrayMatcher.Companion
            int r1 = r4.m7409createValuesTypeVectorVUfvBY(r8, r1)
            goto L45
        L44:
            r1 = r3
        L45:
            java.util.List<org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher> r4 = r7.encodeValuesMatcher
            if (r4 == 0) goto L82
            java.util.ArrayList r5 = new java.util.ArrayList
            int r2 = p000.AbstractC1021yh.m6889(r4, r2)
            r5.<init>(r2)
            java.util.Iterator r2 = r4.iterator()
        L56:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L77
            java.lang.Object r4 = r2.next()
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r4 = (org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher) r4
            org.luckypray.dexkit.query.base.IAnnotationEncodeValue r4 = r4.getValue()
            r4.getClass()
            org.luckypray.dexkit.query.base.BaseMatcher r4 = (org.luckypray.dexkit.query.base.BaseMatcher) r4
            int r4 = r4.build$dexkit_android_release(r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.add(r4)
            goto L56
        L77:
            int[] r2 = p000.AbstractC0984xh.m6665(r5)
            org.luckypray.dexkit.schema.-AnnotationEncodeArrayMatcher$Companion r4 = org.luckypray.dexkit.schema.AnnotationEncodeArrayMatcher.Companion
            int r2 = r4.createValuesVector(r8, r2)
            goto L83
        L82:
            r2 = r3
        L83:
            org.luckypray.dexkit.query.enums.MatchType r4 = r7.matchType
            byte r4 = r4.getValue()
            org.luckypray.dexkit.query.matchers.base.IntRange r7 = r7.rangeMatcher
            if (r7 == 0) goto L91
            int r3 = r7.build$dexkit_android_release(r8)
        L91:
            r5 = r3
            r3 = r2
            r2 = r1
            r1 = r8
            int r7 = r0.createAnnotationEncodeArrayMatcher(r1, r2, r3, r4, r5)
            r1.m733(r7)
            return r7
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher matchType(org.luckypray.dexkit.query.enums.MatchType r1) {
            r0 = this;
            r1.getClass()
            r0.matchType = r1
            return r0
    }

    public final /* synthetic */ void setCount(int r1) {
            r0 = this;
            r0.count(r1)
            return
    }

    public final /* synthetic */ void setMatchType(org.luckypray.dexkit.query.enums.MatchType r1) {
            r0 = this;
            r1.getClass()
            r0.matchType = r1
            return
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher values(java.util.Collection<org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher> r2) {
            r1 = this;
            r2.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.encodeValuesMatcher = r0
            return r1
    }
}
