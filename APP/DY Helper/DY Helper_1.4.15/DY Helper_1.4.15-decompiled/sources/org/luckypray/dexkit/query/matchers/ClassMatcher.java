package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ClassMatcher extends org.luckypray.dexkit.query.base.BaseMatcher implements org.luckypray.dexkit.query.base.IAnnotationEncodeValue {
    public static final org.luckypray.dexkit.query.matchers.ClassMatcher.Companion Companion = null;
    private java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> allOfMatchers;
    private org.luckypray.dexkit.query.matchers.AnnotationsMatcher annotationsMatcher;
    private java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> anyOfMatchers;
    private org.luckypray.dexkit.query.matchers.base.StringMatcher classNameMatcher;
    private org.luckypray.dexkit.query.matchers.FieldsMatcher fieldsMatcher;
    private org.luckypray.dexkit.query.matchers.InterfacesMatcher interfacesMatcher;
    private org.luckypray.dexkit.query.matchers.MethodsMatcher methodsMatcher;
    private org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher modifiersMatcher;
    private java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> noneOfMatchers;
    private org.luckypray.dexkit.query.matchers.base.StringMatcher sourceMatcher;
    private org.luckypray.dexkit.query.matchers.ClassMatcher superClassMatcher;
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

        public final org.luckypray.dexkit.query.matchers.ClassMatcher create() {
                r0 = this;
                org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
                r0.<init>()
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.ClassMatcher create(java.lang.Class<?> r1) {
                r0 = this;
                r1.getClass()
                org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
                r0.<init>(r1)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.ClassMatcher create(java.lang.String r1) {
                r0 = this;
                r1.getClass()
                org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
                r0.<init>(r1)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.ClassMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.ClassMatcher.Companion = r0
            return
    }

    public ClassMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public ClassMatcher(java.lang.Class<?> r7) {
            r6 = this;
            r7.getClass()
            r6.<init>()
            java.lang.String r1 = org.luckypray.dexkit.util.DexSignUtil.getClassDescriptor(r7)
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            className$default(r0, r1, r2, r3, r4, r5)
            return
    }

    public ClassMatcher(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.descriptor(r1)
            return
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForName$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.addFieldForName(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForType$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.addFieldForType(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addInterface$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.addInterface(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addUsingString$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.addUsingString(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher annotationCount$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.annotationCount(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher className$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.className(r1, r2, r3)
            return r0
    }

    public static final org.luckypray.dexkit.query.matchers.ClassMatcher create() {
            org.luckypray.dexkit.query.matchers.ClassMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.ClassMatcher.Companion
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.create()
            return r0
    }

    public static final org.luckypray.dexkit.query.matchers.ClassMatcher create(java.lang.Class<?> r1) {
            org.luckypray.dexkit.query.matchers.ClassMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.ClassMatcher.Companion
            org.luckypray.dexkit.query.matchers.ClassMatcher r1 = r0.create(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.ClassMatcher create(java.lang.String r1) {
            org.luckypray.dexkit.query.matchers.ClassMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.ClassMatcher.Companion
            org.luckypray.dexkit.query.matchers.ClassMatcher r1 = r0.create(r1)
            return r1
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher fieldCount$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.fieldCount(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher interfaceCount$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.interfaceCount(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher methodCount$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.methodCount(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher modifiers$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, int r1, org.luckypray.dexkit.query.enums.MatchType r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.MatchType r2 = org.luckypray.dexkit.query.enums.MatchType.Contains
        L6:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.modifiers(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher source$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.source(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher superClass$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.superClass(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher usingStrings$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, java.util.Collection r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.usingStrings(r1, r2, r3)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addAllOf(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addAllOf(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addAllOf(org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            r2.getClass()
            java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> r0 = r1.allOfMatchers
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lc:
            r1.allOfMatchers = r0
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addAnnotation(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addAnnotation(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addAnnotation(org.luckypray.dexkit.query.matchers.AnnotationMatcher r2) {
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

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addAnyOf(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addAnyOf(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addAnyOf(org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            r2.getClass()
            java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> r0 = r1.anyOfMatchers
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lc:
            r1.anyOfMatchers = r0
            r0.add(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addEqString(java.lang.String r5) {
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

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addField(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addField(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addField(org.luckypray.dexkit.query.matchers.FieldMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = r1.fieldsMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r0.<init>()
        Lc:
            r1.fieldsMatcher = r0
            r0.add(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForName(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.ClassMatcher r6 = addFieldForName$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForName(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ClassMatcher r6 = addFieldForName$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForName(java.lang.String r3, org.luckypray.dexkit.query.enums.StringMatchType r4, boolean r5) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = r2.fieldsMatcher
            if (r0 != 0) goto Lf
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r0.<init>()
        Lf:
            r2.fieldsMatcher = r0
            org.luckypray.dexkit.query.matchers.FieldMatcher r1 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r1.<init>()
            org.luckypray.dexkit.query.matchers.FieldMatcher r3 = r1.name(r3, r4, r5)
            r0.add(r3)
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForType(java.lang.Class<?> r3) {
            r2 = this;
            r3.getClass()
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = r2.fieldsMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r0.<init>()
        Lc:
            r2.fieldsMatcher = r0
            org.luckypray.dexkit.query.matchers.FieldMatcher r1 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r1.<init>()
            org.luckypray.dexkit.query.matchers.FieldMatcher r3 = r1.type(r3)
            r0.add(r3)
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForType(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.ClassMatcher r6 = addFieldForType$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForType(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ClassMatcher r6 = addFieldForType$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForType(java.lang.String r3, org.luckypray.dexkit.query.enums.StringMatchType r4, boolean r5) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = r2.fieldsMatcher
            if (r0 != 0) goto Lf
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r0.<init>()
        Lf:
            r2.fieldsMatcher = r0
            org.luckypray.dexkit.query.matchers.FieldMatcher r1 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r1.<init>()
            org.luckypray.dexkit.query.matchers.FieldMatcher r3 = r1.type(r3, r4, r5)
            r0.add(r3)
            return r2
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addInterface(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addInterface(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addInterface(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.ClassMatcher r6 = addInterface$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addInterface(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ClassMatcher r6 = addInterface$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addInterface(java.lang.String r3, org.luckypray.dexkit.query.enums.StringMatchType r4, boolean r5) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = r2.interfacesMatcher
            if (r0 != 0) goto Lf
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = new org.luckypray.dexkit.query.matchers.InterfacesMatcher
            r0.<init>()
        Lf:
            r2.interfacesMatcher = r0
            org.luckypray.dexkit.query.matchers.ClassMatcher r1 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r1.<init>()
            org.luckypray.dexkit.query.matchers.ClassMatcher r3 = r1.className(r3, r4, r5)
            r0.add(r3)
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addInterface(org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = r1.interfacesMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = new org.luckypray.dexkit.query.matchers.InterfacesMatcher
            r0.<init>()
        Lc:
            r1.interfacesMatcher = r0
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addMethod(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addMethod(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addMethod(org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.methodsMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        Lc:
            r1.methodsMatcher = r0
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addNoneOf(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addNoneOf(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addNoneOf(org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            r2.getClass()
            java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> r0 = r1.noneOfMatchers
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lc:
            r1.noneOfMatchers = r0
            r0.add(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addUsingString(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.ClassMatcher r6 = addUsingString$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addUsingString(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ClassMatcher r6 = addUsingString$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addUsingString(java.lang.String r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r0.<init>(r2, r3, r4)
            r1.addUsingString(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher addUsingString(org.luckypray.dexkit.query.matchers.base.StringMatcher r2) {
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

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher allOf(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.ClassMatcherList r0 = new org.luckypray.dexkit.query.ClassMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.allOf(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher allOf(java.util.Collection<org.luckypray.dexkit.query.matchers.ClassMatcher> r3) {
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

    public final org.luckypray.dexkit.query.matchers.ClassMatcher allOf(org.luckypray.dexkit.query.matchers.ClassMatcher... r1) {
            r0 = this;
            r1.getClass()
            java.util.List r1 = java.util.Arrays.asList(r1)
            r1.getClass()
            r0.allOf(r1)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher annotationCount(int r2) {
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

    public final org.luckypray.dexkit.query.matchers.ClassMatcher annotationCount(int r2, int r3) {
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

    public final org.luckypray.dexkit.query.matchers.ClassMatcher annotationCount(org.luckypray.dexkit.query.matchers.base.IntRange r2) {
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

    public final org.luckypray.dexkit.query.matchers.ClassMatcher annotationCount(p000.xm0 r2) {
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

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher annotations(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.annotations(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher annotations(org.luckypray.dexkit.query.matchers.AnnotationsMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.annotationsMatcher = r1
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher anyOf(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.ClassMatcherList r0 = new org.luckypray.dexkit.query.ClassMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.anyOf(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher anyOf(java.util.Collection<org.luckypray.dexkit.query.matchers.ClassMatcher> r3) {
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

    public final org.luckypray.dexkit.query.matchers.ClassMatcher anyOf(org.luckypray.dexkit.query.matchers.ClassMatcher... r1) {
            r0 = this;
            r1.getClass()
            java.util.List r1 = java.util.Arrays.asList(r1)
            r1.getClass()
            r0.anyOf(r1)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher className(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.ClassMatcher r6 = className$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher className(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ClassMatcher r6 = className$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher className(java.lang.String r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r0.<init>(r2, r3, r4)
            r1.classNameMatcher = r0
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher className(org.luckypray.dexkit.query.matchers.base.StringMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.classNameMatcher = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher descriptor(java.lang.String r8) {
            r7 = this;
            r8.getClass()
            org.luckypray.dexkit.wrap.DexClass r0 = new org.luckypray.dexkit.wrap.DexClass
            r0.<init>(r8)
            java.lang.String r2 = r0.getTypeName()
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            className$default(r1, r2, r3, r4, r5, r6)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher fieldCount(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = r1.fieldsMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r0.<init>()
        L9:
            r1.fieldsMatcher = r0
            r0.count(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher fieldCount(int r2, int r3) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = r1.fieldsMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r0.<init>()
        L9:
            r1.fieldsMatcher = r0
            r0.count(r2, r3)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher fieldCount(org.luckypray.dexkit.query.matchers.base.IntRange r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = r1.fieldsMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r0.<init>()
        Lc:
            r1.fieldsMatcher = r0
            r0.count(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher fieldCount(p000.xm0 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = r1.fieldsMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r0.<init>()
        Lc:
            r1.fieldsMatcher = r0
            r0.count(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher fields(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.fields(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher fields(org.luckypray.dexkit.query.matchers.FieldsMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.fieldsMatcher = r1
            return r0
    }

    public final java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> getAllOfMatchers() {
            r0 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> r0 = r0.allOfMatchers
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.AnnotationsMatcher getAnnotationsMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r0.annotationsMatcher
            return r0
    }

    public final java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> getAnyOfMatchers() {
            r0 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> r0 = r0.anyOfMatchers
            return r0
    }

    @p000.InterfaceC0088bs
    public final /* synthetic */ java.lang.String getClassName() {
            r1 = this;
            fq r1 = new fq
            r0 = 0
            r1.<init>(r0)
            throw r1
    }

    public final org.luckypray.dexkit.query.matchers.base.StringMatcher getClassNameMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = r0.classNameMatcher
            return r0
    }

    @p000.InterfaceC0088bs
    public final /* synthetic */ java.lang.String getDescriptor() {
            r1 = this;
            fq r1 = new fq
            r0 = 0
            r1.<init>(r0)
            throw r1
    }

    public final org.luckypray.dexkit.query.matchers.FieldsMatcher getFieldsMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = r0.fieldsMatcher
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.InterfacesMatcher getInterfacesMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = r0.interfacesMatcher
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.MethodsMatcher getMethodsMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r0.methodsMatcher
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

    public final java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> getNoneOfMatchers() {
            r0 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> r0 = r0.noneOfMatchers
            return r0
    }

    @p000.InterfaceC0088bs
    public final /* synthetic */ java.lang.String getSource() {
            r1 = this;
            fq r1 = new fq
            r0 = 0
            r1.<init>(r0)
            throw r1
    }

    public final org.luckypray.dexkit.query.matchers.base.StringMatcher getSourceMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = r0.sourceMatcher
            return r0
    }

    @p000.InterfaceC0088bs
    public final /* synthetic */ java.lang.String getSuperClass() {
            r1 = this;
            fq r1 = new fq
            r0 = 0
            r1.<init>(r0)
            throw r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher getSuperClassMatcher() {
            r0 = this;
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.superClassMatcher
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
    public int innerBuild(p000.b40 r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r1.getClass()
            org.luckypray.dexkit.schema.-ClassMatcher$Companion r2 = org.luckypray.dexkit.schema.ClassMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.StringMatcher r3 = r0.sourceMatcher
            if (r3 == 0) goto L12
            int r3 = r3.build$dexkit_android_release(r1)
            goto L13
        L12:
            r3 = 0
        L13:
            org.luckypray.dexkit.query.matchers.base.StringMatcher r5 = r0.classNameMatcher
            if (r5 == 0) goto L1c
            int r5 = r5.build$dexkit_android_release(r1)
            goto L1d
        L1c:
            r5 = 0
        L1d:
            org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r6 = r0.modifiersMatcher
            if (r6 == 0) goto L26
            int r6 = r6.build$dexkit_android_release(r1)
            goto L27
        L26:
            r6 = 0
        L27:
            org.luckypray.dexkit.query.matchers.ClassMatcher r7 = r0.superClassMatcher
            if (r7 == 0) goto L30
            int r7 = r7.build$dexkit_android_release(r1)
            goto L31
        L30:
            r7 = 0
        L31:
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r8 = r0.interfacesMatcher
            if (r8 == 0) goto L3a
            int r8 = r8.build$dexkit_android_release(r1)
            goto L3b
        L3a:
            r8 = 0
        L3b:
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r9 = r0.annotationsMatcher
            if (r9 == 0) goto L44
            int r9 = r9.build$dexkit_android_release(r1)
            goto L45
        L44:
            r9 = 0
        L45:
            org.luckypray.dexkit.query.matchers.FieldsMatcher r10 = r0.fieldsMatcher
            if (r10 == 0) goto L4e
            int r10 = r10.build$dexkit_android_release(r1)
            goto L4f
        L4e:
            r10 = 0
        L4f:
            org.luckypray.dexkit.query.matchers.MethodsMatcher r11 = r0.methodsMatcher
            if (r11 == 0) goto L58
            int r11 = r11.build$dexkit_android_release(r1)
            goto L59
        L58:
            r11 = 0
        L59:
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r12 = r0.usingStringsMatcher
            r13 = 10
            if (r12 == 0) goto L8d
            java.util.ArrayList r14 = new java.util.ArrayList
            int r15 = p000.AbstractC1021yh.m6889(r12, r13)
            r14.<init>(r15)
            java.util.Iterator r12 = r12.iterator()
        L6c:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L84
            java.lang.Object r15 = r12.next()
            org.luckypray.dexkit.query.matchers.base.StringMatcher r15 = (org.luckypray.dexkit.query.matchers.base.StringMatcher) r15
            int r15 = r15.build$dexkit_android_release(r1)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14.add(r15)
            goto L6c
        L84:
            int[] r12 = p000.AbstractC0984xh.m6665(r14)
            int r12 = r1.m730(r12)
            goto L8e
        L8d:
            r12 = 0
        L8e:
            java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> r14 = r0.allOfMatchers
            if (r14 == 0) goto Lc0
            java.util.ArrayList r15 = new java.util.ArrayList
            int r4 = p000.AbstractC1021yh.m6889(r14, r13)
            r15.<init>(r4)
            java.util.Iterator r4 = r14.iterator()
        L9f:
            boolean r14 = r4.hasNext()
            if (r14 == 0) goto Lb7
            java.lang.Object r14 = r4.next()
            org.luckypray.dexkit.query.matchers.ClassMatcher r14 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r14
            int r14 = r14.build$dexkit_android_release(r1)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r15.add(r14)
            goto L9f
        Lb7:
            int[] r4 = p000.AbstractC0984xh.m6665(r15)
            int r4 = r1.m730(r4)
            goto Lc1
        Lc0:
            r4 = 0
        Lc1:
            java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> r14 = r0.anyOfMatchers
            if (r14 == 0) goto Lf5
            java.util.ArrayList r15 = new java.util.ArrayList
            r16 = r2
            int r2 = p000.AbstractC1021yh.m6889(r14, r13)
            r15.<init>(r2)
            java.util.Iterator r2 = r14.iterator()
        Ld4:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto Lec
            java.lang.Object r14 = r2.next()
            org.luckypray.dexkit.query.matchers.ClassMatcher r14 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r14
            int r14 = r14.build$dexkit_android_release(r1)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r15.add(r14)
            goto Ld4
        Lec:
            int[] r2 = p000.AbstractC0984xh.m6665(r15)
            int r2 = r1.m730(r2)
            goto Lf8
        Lf5:
            r16 = r2
            r2 = 0
        Lf8:
            java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> r0 = r0.noneOfMatchers
            if (r0 == 0) goto L139
            java.util.ArrayList r14 = new java.util.ArrayList
            int r13 = p000.AbstractC1021yh.m6889(r0, r13)
            r14.<init>(r13)
            java.util.Iterator r0 = r0.iterator()
        L109:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L121
            java.lang.Object r13 = r0.next()
            org.luckypray.dexkit.query.matchers.ClassMatcher r13 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r13
            int r13 = r13.build$dexkit_android_release(r1)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14.add(r13)
            goto L109
        L121:
            int[] r0 = p000.AbstractC0984xh.m6665(r14)
            int r0 = r1.m730(r0)
            r13 = r12
            r12 = r2
            r2 = r3
            r3 = r5
            r5 = r7
            r7 = r9
            r9 = r11
            r11 = r4
            r4 = r6
            r6 = r8
            r8 = r10
            r10 = r13
            r13 = r0
        L136:
            r0 = r16
            goto L147
        L139:
            r0 = r12
            r12 = r2
            r2 = r3
            r3 = r5
            r5 = r7
            r7 = r9
            r9 = r11
            r11 = r4
            r4 = r6
            r6 = r8
            r8 = r10
            r10 = r0
            r13 = 0
            goto L136
        L147:
            int r0 = r0.createClassMatcher(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1.m733(r0)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher interfaceCount(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = r1.interfacesMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = new org.luckypray.dexkit.query.matchers.InterfacesMatcher
            r0.<init>()
        L9:
            r1.interfacesMatcher = r0
            r0.count(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher interfaceCount(int r2, int r3) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = r1.interfacesMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = new org.luckypray.dexkit.query.matchers.InterfacesMatcher
            r0.<init>()
        L9:
            r1.interfacesMatcher = r0
            r0.count(r2, r3)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher interfaceCount(org.luckypray.dexkit.query.matchers.base.IntRange r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = r1.interfacesMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = new org.luckypray.dexkit.query.matchers.InterfacesMatcher
            r0.<init>()
        Lc:
            r1.interfacesMatcher = r0
            r0.count(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher interfaceCount(p000.xm0 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = r1.interfacesMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = new org.luckypray.dexkit.query.matchers.InterfacesMatcher
            r0.<init>()
        Lc:
            r1.interfacesMatcher = r0
            r0.count(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher interfaces(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = new org.luckypray.dexkit.query.matchers.InterfacesMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.interfaces(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher interfaces(org.luckypray.dexkit.query.matchers.InterfacesMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.interfacesMatcher = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher methodCount(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.methodsMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        L9:
            r1.methodsMatcher = r0
            r0.count(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher methodCount(int r2, int r3) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.methodsMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        L9:
            r1.methodsMatcher = r0
            r0.count(r2, r3)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher methodCount(org.luckypray.dexkit.query.matchers.base.IntRange r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.methodsMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        Lc:
            r1.methodsMatcher = r0
            r0.count(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher methodCount(p000.xm0 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.methodsMatcher
            if (r0 != 0) goto Lc
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        Lc:
            r1.methodsMatcher = r0
            r0.count(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher methods(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.methods(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher methods(org.luckypray.dexkit.query.matchers.MethodsMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.methodsMatcher = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher modifiers(int r3) {
            r2 = this;
            r0 = 0
            r1 = 2
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = modifiers$default(r2, r3, r0, r1, r0)
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher modifiers(int r2, org.luckypray.dexkit.query.enums.MatchType r3) {
            r1 = this;
            r3.getClass()
            org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher
            r0.<init>(r2, r3)
            r1.modifiersMatcher = r0
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher modifiers(org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.modifiersMatcher = r1
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher noneOf(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.ClassMatcherList r0 = new org.luckypray.dexkit.query.ClassMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.noneOf(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher noneOf(java.util.Collection<org.luckypray.dexkit.query.matchers.ClassMatcher> r3) {
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

    public final org.luckypray.dexkit.query.matchers.ClassMatcher noneOf(org.luckypray.dexkit.query.matchers.ClassMatcher... r1) {
            r0 = this;
            r1.getClass()
            java.util.List r1 = java.util.Arrays.asList(r1)
            r1.getClass()
            r0.noneOf(r1)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher not(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.not(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher not(org.luckypray.dexkit.query.matchers.ClassMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.addNoneOf(r1)
            return r0
    }

    public final /* synthetic */ void setClassName(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            className$default(r0, r1, r2, r3, r4, r5)
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

    public final /* synthetic */ void setSource(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            source$default(r0, r1, r2, r3, r4, r5)
            return
    }

    public final void setSuperClass(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            superClass$default(r0, r1, r2, r3, r4, r5)
            return
    }

    public final void setUsingStrings(java.util.Collection<java.lang.String> r7) {
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

    public final org.luckypray.dexkit.query.matchers.ClassMatcher source(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.ClassMatcher r6 = source$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher source(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ClassMatcher r6 = source$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher source(java.lang.String r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r0.<init>(r2, r3, r4)
            r1.sourceMatcher = r0
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher source(org.luckypray.dexkit.query.matchers.base.StringMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.sourceMatcher = r1
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher superClass(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.superClass(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher superClass(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.ClassMatcher r6 = superClass$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher superClass(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ClassMatcher r6 = superClass$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher superClass(java.lang.String r3, org.luckypray.dexkit.query.enums.StringMatchType r4, boolean r5) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.query.matchers.base.StringMatcher r1 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r1.<init>(r3, r4, r5)
            org.luckypray.dexkit.query.matchers.ClassMatcher r3 = r0.className(r1)
            r2.superClassMatcher = r3
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher superClass(org.luckypray.dexkit.query.matchers.ClassMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.superClassMatcher = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher usingEqStrings(java.util.Collection<java.lang.String> r6) {
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

    public final org.luckypray.dexkit.query.matchers.ClassMatcher usingEqStrings(java.lang.String... r8) {
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

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher usingStrings(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.StringMatcherList r0 = new org.luckypray.dexkit.query.StringMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.usingStrings(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher usingStrings(java.util.Collection<java.lang.String> r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.ClassMatcher r6 = usingStrings$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher usingStrings(java.util.Collection<java.lang.String> r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ClassMatcher r6 = usingStrings$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher usingStrings(java.util.Collection<java.lang.String> r4, org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
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

    public final org.luckypray.dexkit.query.matchers.ClassMatcher usingStrings(org.luckypray.dexkit.query.StringMatcherList r1) {
            r0 = this;
            r1.getClass()
            r0.usingStringsMatcher = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.ClassMatcher usingStrings(java.lang.String... r10) {
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
