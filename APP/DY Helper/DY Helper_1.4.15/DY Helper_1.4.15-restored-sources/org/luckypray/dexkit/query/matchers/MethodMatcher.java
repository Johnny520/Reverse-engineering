package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class MethodMatcher extends org.luckypray.dexkit.query.base.BaseMatcher implements org.luckypray.dexkit.query.base.IAnnotationEncodeValue {
    public static final org.luckypray.dexkit.query.matchers.MethodMatcher.Companion Companion = null;
    private java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> allOfMatchers;
    private org.luckypray.dexkit.query.matchers.AnnotationsMatcher annotationsMatcher;
    private java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> anyOfMatchers;
    private org.luckypray.dexkit.query.matchers.MethodsMatcher callerMethodsMatcher;
    private org.luckypray.dexkit.query.matchers.ClassMatcher classMatcher;
    private org.luckypray.dexkit.query.matchers.MethodsMatcher invokeMethodsMatcher;
    private org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher modifiersMatcher;
    private org.luckypray.dexkit.query.matchers.base.StringMatcher nameMatcher;
    private java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> noneOfMatchers;
    private org.luckypray.dexkit.query.matchers.base.OpCodesMatcher opCodesMatcher;
    private org.luckypray.dexkit.query.matchers.ParametersMatcher paramsMatcher;
    private java.lang.String protoShortyMatcher;
    private org.luckypray.dexkit.query.matchers.ClassMatcher returnTypeMatcher;
    private java.util.List<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> usingFieldsMatcher;
    private java.util.List<org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher> usingNumbersMatcher;
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

        public final org.luckypray.dexkit.query.matchers.MethodMatcher create() {
                r0 = this;
                org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
                r0.<init>()
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.MethodMatcher create(java.lang.String r1) {
                r0 = this;
                r1.getClass()
                org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
                r0.<init>(r1)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.MethodMatcher create(java.lang.reflect.Constructor<?> r1) {
                r0 = this;
                r1.getClass()
                org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
                r0.<init>(r1)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.MethodMatcher create(java.lang.reflect.Method r1) {
                r0 = this;
                r1.getClass()
                org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
                r0.<init>(r1)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.MethodMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.MethodMatcher.Companion = r0
            return
    }

    public MethodMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public MethodMatcher(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.descriptor(r1)
            return
    }

    public MethodMatcher(java.lang.reflect.Constructor<?> r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            java.lang.String r1 = org.luckypray.dexkit.util.DexSignUtil.getDescriptor(r1)
            r0.descriptor(r1)
            return
    }

    public MethodMatcher(java.lang.reflect.Method r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            java.lang.String r1 = org.luckypray.dexkit.util.DexSignUtil.getDescriptor(r1)
            r0.descriptor(r1)
            return
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addParamType$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.addParamType(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addUsingField$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.UsingType r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.UsingType r2 = org.luckypray.dexkit.query.enums.UsingType.Any
        L6:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.addUsingField(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addUsingField$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, org.luckypray.dexkit.query.matchers.FieldMatcher r1, org.luckypray.dexkit.query.enums.UsingType r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.UsingType r2 = org.luckypray.dexkit.query.enums.UsingType.Any
        L6:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.addUsingField(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addUsingString$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.addUsingString(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher annotationCount$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.annotationCount(r1, r2)
            return r0
    }

    public static final org.luckypray.dexkit.query.matchers.MethodMatcher create() {
            org.luckypray.dexkit.query.matchers.MethodMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.MethodMatcher.Companion
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.create()
            return r0
    }

    public static final org.luckypray.dexkit.query.matchers.MethodMatcher create(java.lang.String r1) {
            org.luckypray.dexkit.query.matchers.MethodMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.MethodMatcher.Companion
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = r0.create(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.MethodMatcher create(java.lang.reflect.Constructor<?> r1) {
            org.luckypray.dexkit.query.matchers.MethodMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.MethodMatcher.Companion
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = r0.create(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.MethodMatcher create(java.lang.reflect.Method r1) {
            org.luckypray.dexkit.query.matchers.MethodMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.MethodMatcher.Companion
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = r0.create(r1)
            return r1
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher declaredClass$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.declaredClass(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher modifiers$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, int r1, org.luckypray.dexkit.query.enums.MatchType r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.MatchType r2 = org.luckypray.dexkit.query.enums.MatchType.Contains
        L6:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.modifiers(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher name$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.name(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher opCodes$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.util.Collection r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.OpCodeMatchType r2 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.opCodes(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher opNames$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.util.Collection r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.OpCodeMatchType r2 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.opNames(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher paramCount$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.paramCount(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher returnType$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.returnType(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher usingStrings$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.util.Collection r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.usingStrings(r1, r2, r3)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addAllOf(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addAllOf(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addAllOf(org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            r2.getClass()
            java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> r0 = r1.allOfMatchers
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lc:
            r1.allOfMatchers = r0
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addAnnotation(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addAnnotation(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addAnnotation(org.luckypray.dexkit.query.matchers.AnnotationMatcher r2) {
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

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addAnyOf(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addAnyOf(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addAnyOf(org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            r2.getClass()
            java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> r0 = r1.anyOfMatchers
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lc:
            r1.anyOfMatchers = r0
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addCaller(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addCaller(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addCaller(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r2.callerMethodsMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        Lc:
            r2.callerMethodsMatcher = r0
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r1.<init>(r3)
            r0.add(r1)
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addCaller(org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.callerMethodsMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        Lc:
            r1.callerMethodsMatcher = r0
            r0.add(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addEqString(java.lang.String r5) {
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

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addInvoke(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addInvoke(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addInvoke(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r2.invokeMethodsMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        Lc:
            r2.invokeMethodsMatcher = r0
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r1.<init>(r3)
            r0.add(r1)
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addInvoke(org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.invokeMethodsMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        Lc:
            r1.invokeMethodsMatcher = r0
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addNoneOf(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addNoneOf(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addNoneOf(org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            r2.getClass()
            java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> r0 = r1.noneOfMatchers
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lc:
            r1.noneOfMatchers = r0
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addParamType(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addParamType(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addParamType(java.lang.Class<?> r3) {
            r2 = this;
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r2.paramsMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r0.<init>()
        L9:
            r2.paramsMatcher = r0
            if (r3 == 0) goto L17
            org.luckypray.dexkit.query.matchers.ParameterMatcher r1 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r1.<init>()
            org.luckypray.dexkit.query.matchers.ParameterMatcher r3 = r1.type(r3)
            goto L18
        L17:
            r3 = 0
        L18:
            r0.add(r3)
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addParamType(java.lang.String r7) {
            r6 = this;
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.MethodMatcher r6 = addParamType$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addParamType(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r6 = addParamType$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addParamType(java.lang.String r3, org.luckypray.dexkit.query.enums.StringMatchType r4, boolean r5) {
            r2 = this;
            r4.getClass()
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r2.paramsMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r0.<init>()
        Lc:
            r2.paramsMatcher = r0
            if (r3 == 0) goto L1a
            org.luckypray.dexkit.query.matchers.ParameterMatcher r1 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r1.<init>()
            org.luckypray.dexkit.query.matchers.ParameterMatcher r3 = r1.type(r3, r4, r5)
            goto L1b
        L1a:
            r3 = 0
        L1b:
            r0.add(r3)
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addParamType(org.luckypray.dexkit.query.matchers.ClassMatcher r3) {
            r2 = this;
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r2.paramsMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r0.<init>()
        L9:
            r2.paramsMatcher = r0
            if (r3 == 0) goto L17
            org.luckypray.dexkit.query.matchers.ParameterMatcher r1 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r1.<init>()
            org.luckypray.dexkit.query.matchers.ParameterMatcher r3 = r1.type(r3)
            goto L18
        L17:
            r3 = 0
        L18:
            r0.add(r3)
            return r2
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addUsingField(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = new org.luckypray.dexkit.query.matchers.UsingFieldMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addUsingField(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingField(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            r1 = 2
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = addUsingField$default(r2, r3, r0, r1, r0)
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingField(java.lang.String r4, org.luckypray.dexkit.query.enums.UsingType r5) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            java.util.List<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> r0 = r3.usingFieldsMatcher
            if (r0 != 0) goto Lf
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lf:
            r3.usingFieldsMatcher = r0
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r1 = new org.luckypray.dexkit.query.matchers.UsingFieldMatcher
            r1.<init>()
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>(r4)
            r1.field(r2)
            r1.usingType(r5)
            r0.add(r1)
            return r3
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingField(org.luckypray.dexkit.query.matchers.FieldMatcher r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            r1 = 2
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = addUsingField$default(r2, r3, r0, r1, r0)
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingField(org.luckypray.dexkit.query.matchers.FieldMatcher r3, org.luckypray.dexkit.query.enums.UsingType r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            java.util.List<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> r0 = r2.usingFieldsMatcher
            if (r0 != 0) goto Lf
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lf:
            r2.usingFieldsMatcher = r0
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r1 = new org.luckypray.dexkit.query.matchers.UsingFieldMatcher
            r1.<init>()
            r1.field(r3)
            r1.usingType(r4)
            r0.add(r1)
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingField(org.luckypray.dexkit.query.matchers.UsingFieldMatcher r2) {
            r1 = this;
            r2.getClass()
            java.util.List<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> r0 = r1.usingFieldsMatcher
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lc:
            r1.usingFieldsMatcher = r0
            r0.add(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingNumber(java.lang.Number r3) {
            r2 = this;
            r3.getClass()
            java.util.List<org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher> r0 = r2.usingNumbersMatcher
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lc:
            r2.usingNumbersMatcher = r0
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
            r1.<init>()
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r3 = r1.value(r3)
            r0.add(r3)
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingString(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.MethodMatcher r6 = addUsingString$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingString(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r6 = addUsingString$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingString(java.lang.String r3, org.luckypray.dexkit.query.enums.StringMatchType r4, boolean r5) {
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

    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingString(org.luckypray.dexkit.query.matchers.base.StringMatcher r2) {
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

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher allOf(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.MethodMatcherList r0 = new org.luckypray.dexkit.query.MethodMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.allOf(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher allOf(java.util.Collection<org.luckypray.dexkit.query.matchers.MethodMatcher> r3) {
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

    public final org.luckypray.dexkit.query.matchers.MethodMatcher allOf(org.luckypray.dexkit.query.matchers.MethodMatcher... r1) {
            r0 = this;
            r1.getClass()
            java.util.List r1 = java.util.Arrays.asList(r1)
            r1.getClass()
            r0.allOf(r1)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher annotationCount(int r2) {
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

    public final org.luckypray.dexkit.query.matchers.MethodMatcher annotationCount(int r2, int r3) {
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

    public final org.luckypray.dexkit.query.matchers.MethodMatcher annotationCount(org.luckypray.dexkit.query.matchers.base.IntRange r2) {
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

    public final org.luckypray.dexkit.query.matchers.MethodMatcher annotationCount(p000.xm0 r2) {
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

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher annotations(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.annotations(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher annotations(org.luckypray.dexkit.query.matchers.AnnotationsMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.annotationsMatcher = r1
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher anyOf(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.MethodMatcherList r0 = new org.luckypray.dexkit.query.MethodMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.anyOf(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher anyOf(java.util.Collection<org.luckypray.dexkit.query.matchers.MethodMatcher> r3) {
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

    public final org.luckypray.dexkit.query.matchers.MethodMatcher anyOf(org.luckypray.dexkit.query.matchers.MethodMatcher... r1) {
            r0 = this;
            r1.getClass()
            java.util.List r1 = java.util.Arrays.asList(r1)
            r1.getClass()
            r0.anyOf(r1)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher callerMethods(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.callerMethods(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher callerMethods(org.luckypray.dexkit.query.matchers.MethodsMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.callerMethodsMatcher = r1
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher declaredClass(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.declaredClass(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher declaredClass(java.lang.Class<?> r7) {
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

    public final org.luckypray.dexkit.query.matchers.MethodMatcher declaredClass(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.MethodMatcher r6 = declaredClass$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher declaredClass(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r6 = declaredClass$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher declaredClass(java.lang.String r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r0.className(r2, r3, r4)
            r1.classMatcher = r2
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher declaredClass(org.luckypray.dexkit.query.matchers.ClassMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.classMatcher = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher descriptor(java.lang.String r14) {
            r13 = this;
            r14.getClass()
            org.luckypray.dexkit.wrap.DexMethod r0 = new org.luckypray.dexkit.wrap.DexMethod
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
            java.lang.String r8 = r0.getReturnTypeName()
            returnType$default(r7, r8, r9, r10, r11, r12)
            java.util.List r13 = r0.getParamTypeNames()
            r7.paramTypes(r13)
            return r7
    }

    public final java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> getAllOfMatchers() {
            r0 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> r0 = r0.allOfMatchers
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationsMatcher getAnnotationsMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r0.annotationsMatcher
            return r0
    }

    public final java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> getAnyOfMatchers() {
            r0 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> r0 = r0.anyOfMatchers
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodsMatcher getCallerMethodsMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r0.callerMethodsMatcher
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

    public final org.luckypray.dexkit.query.matchers.MethodsMatcher getInvokeMethodsMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r0.invokeMethodsMatcher
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

    public final java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> getNoneOfMatchers() {
            r0 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> r0 = r0.noneOfMatchers
            return r0
    }

    @p000.InterfaceC0088bs
    public final /* synthetic */ java.util.Collection getOpCodes() {
            r1 = this;
            fq r1 = new fq
            r0 = 0
            r1.<init>(r0)
            throw r1
    }

    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher getOpCodesMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = r0.opCodesMatcher
            return r0
    }

    @p000.InterfaceC0088bs
    public final /* synthetic */ java.util.Collection getOpNames() {
            r1 = this;
            fq r1 = new fq
            r0 = 0
            r1.<init>(r0)
            throw r1
    }

    @p000.InterfaceC0088bs
    public final /* synthetic */ int getParamCount() {
            r1 = this;
            fq r1 = new fq
            r0 = 0
            r1.<init>(r0)
            throw r1
    }

    @p000.InterfaceC0088bs
    public final /* synthetic */ java.util.Collection getParamTypes() {
            r1 = this;
            fq r1 = new fq
            r0 = 0
            r1.<init>(r0)
            throw r1
    }

    public final org.luckypray.dexkit.query.matchers.ParametersMatcher getParamsMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r0.paramsMatcher
            return r0
    }

    @p000.InterfaceC0088bs
    public final /* synthetic */ java.lang.String getProtoShorty() {
            r1 = this;
            fq r1 = new fq
            r0 = 0
            r1.<init>(r0)
            throw r1
    }

    public final java.lang.String getProtoShortyMatcher() {
            r0 = this;
            java.lang.String r0 = r0.protoShortyMatcher
            return r0
    }

    @p000.InterfaceC0088bs
    public final /* synthetic */ java.lang.String getReturnType() {
            r1 = this;
            fq r1 = new fq
            r0 = 0
            r1.<init>(r0)
            throw r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher getReturnTypeMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.returnTypeMatcher
            return r0
    }

    public final java.util.List<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> getUsingFieldsMatcher() {
            r0 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> r0 = r0.usingFieldsMatcher
            return r0
    }

    @p000.InterfaceC0088bs
    public final /* synthetic */ java.util.Collection getUsingNumbers() {
            r1 = this;
            fq r1 = new fq
            r0 = 0
            r1.<init>(r0)
            throw r1
    }

    public final java.util.List<org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher> getUsingNumbersMatcher() {
            r0 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher> r0 = r0.usingNumbersMatcher
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
    public int innerBuild(p000.b40 r25) {
            r24 = this;
            r0 = r24
            r2 = r25
            r2.getClass()
            org.luckypray.dexkit.schema.-MethodMatcher$Companion r1 = org.luckypray.dexkit.schema.MethodMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.StringMatcher r3 = r0.nameMatcher
            if (r3 == 0) goto L12
            int r3 = r3.build$dexkit_android_release(r2)
            goto L13
        L12:
            r3 = 0
        L13:
            org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r5 = r0.modifiersMatcher
            if (r5 == 0) goto L1c
            int r5 = r5.build$dexkit_android_release(r2)
            goto L1d
        L1c:
            r5 = 0
        L1d:
            org.luckypray.dexkit.query.matchers.ClassMatcher r6 = r0.classMatcher
            if (r6 == 0) goto L26
            int r6 = r6.build$dexkit_android_release(r2)
            goto L27
        L26:
            r6 = 0
        L27:
            org.luckypray.dexkit.query.matchers.ClassMatcher r7 = r0.returnTypeMatcher
            if (r7 == 0) goto L30
            int r7 = r7.build$dexkit_android_release(r2)
            goto L31
        L30:
            r7 = 0
        L31:
            org.luckypray.dexkit.query.matchers.ParametersMatcher r8 = r0.paramsMatcher
            if (r8 == 0) goto L3a
            int r8 = r8.build$dexkit_android_release(r2)
            goto L3b
        L3a:
            r8 = 0
        L3b:
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r9 = r0.annotationsMatcher
            if (r9 == 0) goto L44
            int r9 = r9.build$dexkit_android_release(r2)
            goto L45
        L44:
            r9 = 0
        L45:
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r10 = r0.opCodesMatcher
            if (r10 == 0) goto L4e
            int r10 = r10.build$dexkit_android_release(r2)
            goto L4f
        L4e:
            r10 = 0
        L4f:
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r11 = r0.usingStringsMatcher
            r12 = 10
            if (r11 == 0) goto L83
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = p000.AbstractC1021yh.m6889(r11, r12)
            r13.<init>(r14)
            java.util.Iterator r11 = r11.iterator()
        L62:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L7a
            java.lang.Object r14 = r11.next()
            org.luckypray.dexkit.query.matchers.base.StringMatcher r14 = (org.luckypray.dexkit.query.matchers.base.StringMatcher) r14
            int r14 = r14.build$dexkit_android_release(r2)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13.add(r14)
            goto L62
        L7a:
            int[] r11 = p000.AbstractC0984xh.m6665(r13)
            int r11 = r2.m730(r11)
            goto L84
        L83:
            r11 = 0
        L84:
            java.util.List<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> r13 = r0.usingFieldsMatcher
            if (r13 == 0) goto Lb6
            java.util.ArrayList r14 = new java.util.ArrayList
            int r15 = p000.AbstractC1021yh.m6889(r13, r12)
            r14.<init>(r15)
            java.util.Iterator r13 = r13.iterator()
        L95:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto Lad
            java.lang.Object r15 = r13.next()
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r15 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r15
            int r15 = r15.build$dexkit_android_release(r2)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14.add(r15)
            goto L95
        Lad:
            int[] r13 = p000.AbstractC0984xh.m6665(r14)
            int r13 = r2.m730(r13)
            goto Lb7
        Lb6:
            r13 = 0
        Lb7:
            java.util.List<org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher> r14 = r0.usingNumbersMatcher
            if (r14 == 0) goto Lf6
            java.util.ArrayList r15 = new java.util.ArrayList
            int r4 = p000.AbstractC1021yh.m6889(r14, r12)
            r15.<init>(r4)
            java.util.Iterator r4 = r14.iterator()
        Lc8:
            boolean r14 = r4.hasNext()
            if (r14 == 0) goto Lea
            java.lang.Object r14 = r4.next()
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r14 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r14
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r14 = r14.getType()
            r14.getClass()
            byte r14 = r14.m7398getValuew2LRezQ()
            o62 r12 = new o62
            r12.<init>(r14)
            r15.add(r12)
            r12 = 10
            goto Lc8
        Lea:
            byte[] r4 = p000.v81.m6135(r15)
            org.luckypray.dexkit.schema.-MethodMatcher$Companion r12 = org.luckypray.dexkit.schema.MethodMatcher.Companion
            int r4 = r12.m7452createUsingNumbersTypeVectorVUfvBY(r2, r4)
            r12 = r4
            goto Lf7
        Lf6:
            r12 = 0
        Lf7:
            java.util.List<org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher> r4 = r0.usingNumbersMatcher
            if (r4 == 0) goto L138
            java.util.ArrayList r14 = new java.util.ArrayList
            r18 = r1
            r15 = 10
            int r1 = p000.AbstractC1021yh.m6889(r4, r15)
            r14.<init>(r1)
            java.util.Iterator r1 = r4.iterator()
        L10c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L12d
            java.lang.Object r4 = r1.next()
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r4 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r4
            org.luckypray.dexkit.query.base.INumberEncodeValue r4 = r4.getValue()
            r4.getClass()
            org.luckypray.dexkit.query.base.BaseMatcher r4 = (org.luckypray.dexkit.query.base.BaseMatcher) r4
            int r4 = r4.build$dexkit_android_release(r2)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r14.add(r4)
            goto L10c
        L12d:
            int[] r1 = p000.AbstractC0984xh.m6665(r14)
            org.luckypray.dexkit.schema.-MethodMatcher$Companion r4 = org.luckypray.dexkit.schema.MethodMatcher.Companion
            int r1 = r4.createUsingNumbersVector(r2, r1)
            goto L13b
        L138:
            r18 = r1
            r1 = 0
        L13b:
            org.luckypray.dexkit.query.matchers.MethodsMatcher r4 = r0.invokeMethodsMatcher
            if (r4 == 0) goto L145
            int r4 = r4.build$dexkit_android_release(r2)
            r14 = r4
            goto L146
        L145:
            r14 = 0
        L146:
            org.luckypray.dexkit.query.matchers.MethodsMatcher r4 = r0.callerMethodsMatcher
            if (r4 == 0) goto L150
            int r4 = r4.build$dexkit_android_release(r2)
            r15 = r4
            goto L151
        L150:
            r15 = 0
        L151:
            java.lang.String r4 = r0.protoShortyMatcher
            if (r4 == 0) goto L15c
            int r4 = r2.m729(r4)
        L159:
            r19 = r1
            goto L15e
        L15c:
            r4 = 0
            goto L159
        L15e:
            java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> r1 = r0.allOfMatchers
            if (r1 == 0) goto L198
            r20 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r21 = r4
            r22 = r5
            r4 = 10
            int r5 = p000.AbstractC1021yh.m6889(r1, r4)
            r3.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L177:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L18f
            java.lang.Object r4 = r1.next()
            org.luckypray.dexkit.query.matchers.MethodMatcher r4 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r4
            int r4 = r4.build$dexkit_android_release(r2)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            goto L177
        L18f:
            int[] r1 = p000.AbstractC0984xh.m6665(r3)
            int r1 = r2.m730(r1)
            goto L19f
        L198:
            r20 = r3
            r21 = r4
            r22 = r5
            r1 = 0
        L19f:
            java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> r3 = r0.anyOfMatchers
            if (r3 == 0) goto L1d5
            java.util.ArrayList r4 = new java.util.ArrayList
            r23 = r1
            r5 = 10
            int r1 = p000.AbstractC1021yh.m6889(r3, r5)
            r4.<init>(r1)
            java.util.Iterator r1 = r3.iterator()
        L1b4:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L1cc
            java.lang.Object r3 = r1.next()
            org.luckypray.dexkit.query.matchers.MethodMatcher r3 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r3
            int r3 = r3.build$dexkit_android_release(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.add(r3)
            goto L1b4
        L1cc:
            int[] r1 = p000.AbstractC0984xh.m6665(r4)
            int r1 = r2.m730(r1)
            goto L1d8
        L1d5:
            r23 = r1
            r1 = 0
        L1d8:
            java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> r0 = r0.noneOfMatchers
            if (r0 == 0) goto L224
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = p000.AbstractC1021yh.m6889(r0, r4)
            r3.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L1eb:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L203
            java.lang.Object r4 = r0.next()
            org.luckypray.dexkit.query.matchers.MethodMatcher r4 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r4
            int r4 = r4.build$dexkit_android_release(r2)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            goto L1eb
        L203:
            int[] r0 = p000.AbstractC0984xh.m6665(r3)
            int r4 = r2.m730(r0)
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r13
            r13 = r19
            r19 = r4
            r3 = r18
            r18 = r1
            r1 = r3
            r3 = r20
            r16 = r21
            r17 = r23
            r4 = r22
            goto L23c
        L224:
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r13
            r13 = r19
            r19 = 0
            r3 = r18
            r18 = r1
            r1 = r3
            r3 = r20
            r16 = r21
            r4 = r22
            r17 = r23
        L23c:
            int r0 = r1.createMethodMatcher(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2.m733(r0)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher invokeMethods(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.invokeMethods(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher invokeMethods(org.luckypray.dexkit.query.matchers.MethodsMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.invokeMethodsMatcher = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher modifiers(int r3) {
            r2 = this;
            r0 = 0
            r1 = 2
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = modifiers$default(r2, r3, r0, r1, r0)
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher modifiers(int r2, org.luckypray.dexkit.query.enums.MatchType r3) {
            r1 = this;
            r3.getClass()
            org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher
            r0.<init>(r2, r3)
            r1.modifiersMatcher = r0
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher modifiers(org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.modifiersMatcher = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher name(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.MethodMatcher r6 = name$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher name(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r6 = name$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher name(java.lang.String r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r0.<init>(r2, r3, r4)
            r1.nameMatcher = r0
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher name(org.luckypray.dexkit.query.matchers.base.StringMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.nameMatcher = r1
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher noneOf(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.MethodMatcherList r0 = new org.luckypray.dexkit.query.MethodMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.noneOf(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher noneOf(java.util.Collection<org.luckypray.dexkit.query.matchers.MethodMatcher> r3) {
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

    public final org.luckypray.dexkit.query.matchers.MethodMatcher noneOf(org.luckypray.dexkit.query.matchers.MethodMatcher... r1) {
            r0 = this;
            r1.getClass()
            java.util.List r1 = java.util.Arrays.asList(r1)
            r1.getClass()
            r0.noneOf(r1)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher not(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.not(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher not(org.luckypray.dexkit.query.matchers.MethodMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.addNoneOf(r1)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher opCodes(java.util.Collection<java.lang.Integer> r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.MethodMatcher r6 = opCodes$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher opCodes(java.util.Collection<java.lang.Integer> r7, org.luckypray.dexkit.query.enums.OpCodeMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r6 = opCodes$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher opCodes(java.util.Collection<java.lang.Integer> r2, org.luckypray.dexkit.query.enums.OpCodeMatchType r3, org.luckypray.dexkit.query.matchers.base.IntRange r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = new org.luckypray.dexkit.query.matchers.base.OpCodesMatcher
            r0.<init>(r2, r3, r4)
            r1.opCodesMatcher = r0
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher opCodes(org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.opCodesMatcher = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher opNames(java.util.Collection<java.lang.String> r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.MethodMatcher r6 = opNames$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher opNames(java.util.Collection<java.lang.String> r7, org.luckypray.dexkit.query.enums.OpCodeMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r6 = opNames$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher opNames(java.util.Collection<java.lang.String> r2, org.luckypray.dexkit.query.enums.OpCodeMatchType r3, org.luckypray.dexkit.query.matchers.base.IntRange r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r2 = r0.createForOpNames(r2, r3, r4)
            r1.opCodesMatcher = r2
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher paramCount(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r1.paramsMatcher
            if (r0 != 0) goto Lb
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r0.<init>()
            r1.paramsMatcher = r0
        Lb:
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r1.paramsMatcher
            r0.getClass()
            r0.count(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher paramCount(int r2, int r3) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r1.paramsMatcher
            if (r0 != 0) goto Lb
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r0.<init>()
            r1.paramsMatcher = r0
        Lb:
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r1.paramsMatcher
            r0.getClass()
            r0.count(r2, r3)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher paramCount(org.luckypray.dexkit.query.matchers.base.IntRange r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r1.paramsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r0.<init>()
            r1.paramsMatcher = r0
        Le:
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r1.paramsMatcher
            r0.getClass()
            r0.count(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher paramCount(p000.xm0 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r1.paramsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r0.<init>()
            r1.paramsMatcher = r0
        Le:
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r1.paramsMatcher
            r0.getClass()
            r0.count(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher paramTypes() {
            r2 = this;
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r0.<init>()
            jz r1 = p000.C0450jz.f5672
            r0.params(r1)
            r2.paramsMatcher = r0
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher paramTypes(java.util.Collection<java.lang.String> r9) {
            r8 = this;
            r9.getClass()
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r0.<init>()
            jz r1 = p000.C0450jz.f5672
            r0.params(r1)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L13:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r9.next()
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L30
            org.luckypray.dexkit.query.matchers.ParameterMatcher r2 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r2.<init>()
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            org.luckypray.dexkit.query.matchers.ParameterMatcher r1 = org.luckypray.dexkit.query.matchers.ParameterMatcher.type$default(r2, r3, r4, r5, r6, r7)
            goto L31
        L30:
            r1 = 0
        L31:
            r0.add(r1)
            goto L13
        L35:
            r8.paramsMatcher = r0
            return r8
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher paramTypes(java.lang.Class<?>... r6) {
            r5 = this;
            r6.getClass()
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r0.<init>()
            jz r1 = p000.C0450jz.f5672
            r0.params(r1)
            int r1 = r6.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L26
            r3 = r6[r2]
            if (r3 == 0) goto L1f
            org.luckypray.dexkit.query.matchers.ParameterMatcher r4 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r4.<init>()
            org.luckypray.dexkit.query.matchers.ParameterMatcher r3 = r4.type(r3)
            goto L20
        L1f:
            r3 = 0
        L20:
            r0.add(r3)
            int r2 = r2 + 1
            goto Lf
        L26:
            r5.paramsMatcher = r0
            return r5
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher paramTypes(java.lang.String... r10) {
            r9 = this;
            r10.getClass()
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r0.<init>()
            jz r1 = p000.C0450jz.f5672
            r0.params(r1)
            int r1 = r10.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L2a
            r4 = r10[r2]
            if (r4 == 0) goto L23
            org.luckypray.dexkit.query.matchers.ParameterMatcher r3 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r3.<init>()
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            org.luckypray.dexkit.query.matchers.ParameterMatcher r3 = org.luckypray.dexkit.query.matchers.ParameterMatcher.type$default(r3, r4, r5, r6, r7, r8)
            goto L24
        L23:
            r3 = 0
        L24:
            r0.add(r3)
            int r2 = r2 + 1
            goto Lf
        L2a:
            r9.paramsMatcher = r0
            return r9
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher params(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.params(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher params(org.luckypray.dexkit.query.matchers.ParametersMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.paramsMatcher = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher protoShorty(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            r0.protoShortyMatcher = r1
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher returnType(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.returnType(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher returnType(java.lang.Class<?> r7) {
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
            r6.returnTypeMatcher = r7
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher returnType(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.MethodMatcher r6 = returnType$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher returnType(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r6 = returnType$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher returnType(java.lang.String r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r0.className(r2, r3, r4)
            r1.returnTypeMatcher = r2
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher returnType(org.luckypray.dexkit.query.matchers.ClassMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.returnTypeMatcher = r1
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

    public final void setOpCodes(java.util.Collection<java.lang.Integer> r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            opCodes$default(r0, r1, r2, r3, r4, r5)
            return
    }

    public final void setOpNames(java.util.Collection<java.lang.String> r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            opNames$default(r0, r1, r2, r3, r4, r5)
            return
    }

    public final /* synthetic */ void setParamCount(int r1) {
            r0 = this;
            r0.paramCount(r1)
            return
    }

    public final /* synthetic */ void setParamTypes(java.util.Collection r1) {
            r0 = this;
            r1.getClass()
            r0.paramTypes(r1)
            return
    }

    public final /* synthetic */ void setProtoShorty(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            r0.protoShorty(r1)
            return
    }

    public final /* synthetic */ void setReturnType(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            returnType$default(r0, r1, r2, r3, r4, r5)
            return
    }

    public final void setUsingNumbers(java.util.Collection<? extends java.lang.Number> r1) {
            r0 = this;
            r1.getClass()
            r0.usingNumbers(r1)
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

    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingEqStrings(java.util.Collection<java.lang.String> r6) {
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

    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingEqStrings(java.lang.String... r8) {
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

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher usingFields(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.UsingFieldMatcherList r0 = new org.luckypray.dexkit.query.UsingFieldMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.usingFields(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingFields(java.util.Collection<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> r2) {
            r1 = this;
            r2.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.usingFieldsMatcher = r0
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher usingNumbers(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.NumberEncodeValueMatcherList r0 = new org.luckypray.dexkit.query.NumberEncodeValueMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.usingNumbers(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingNumbers(java.util.Collection<? extends java.lang.Number> r4) {
            r3 = this;
            r4.getClass()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r4, r1)
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r4.next()
            java.lang.Number r1 = (java.lang.Number) r1
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
            r2.<init>()
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1 = r2.value(r1)
            r0.add(r1)
            goto L14
        L2d:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            r3.usingNumbersMatcher = r4
            return r3
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingNumbers(org.luckypray.dexkit.query.NumberEncodeValueMatcherList r1) {
            r0 = this;
            r1.getClass()
            r0.usingNumbersMatcher = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingNumbers(java.lang.Number... r6) {
            r5 = this;
            r6.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L1e
            r3 = r6[r2]
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r4 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
            r4.<init>()
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r3 = r4.value(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto Lb
        L1e:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            r5.usingNumbersMatcher = r6
            return r5
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher usingStrings(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.StringMatcherList r0 = new org.luckypray.dexkit.query.StringMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.usingStrings(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingStrings(java.util.Collection<java.lang.String> r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.MethodMatcher r6 = usingStrings$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingStrings(java.util.Collection<java.lang.String> r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r6 = usingStrings$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingStrings(java.util.Collection<java.lang.String> r4, org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
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

    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingStrings(org.luckypray.dexkit.query.StringMatcherList r1) {
            r0 = this;
            r1.getClass()
            r0.usingStringsMatcher = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingStrings(java.lang.String... r10) {
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
