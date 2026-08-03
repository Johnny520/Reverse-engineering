package net.bytebuddy.build;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class HashCodeAndEqualsPlugin implements net.bytebuddy.build.Plugin, net.bytebuddy.build.Plugin.Factory, net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory, net.bytebuddy.implementation.attribute.MethodAttributeAppender {
    private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape ENHANCE_INCLUDE_SYNTHETIC_FIELDS = null;
    private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape ENHANCE_INVOKE_SUPER = null;
    private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape ENHANCE_PERMIT_SUBCLASS_EQUALITY = null;
    private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape ENHANCE_SIMPLE_COMPARISON_FIRST = null;
    private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape ENHANCE_USE_TYPE_HASH_CONSTANT = null;
    private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape SORTED_VALUE = null;
    private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape VALUE_HANDLING_VALUE = null;

    @net.bytebuddy.utility.nullability.MaybeNull
    @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
    private final java.lang.String annotationType;

    /* JADX INFO: renamed from: net.bytebuddy.build.HashCodeAndEqualsPlugin$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public enum AnnotationOrderComparator extends java.lang.Enum<net.bytebuddy.build.HashCodeAndEqualsPlugin.AnnotationOrderComparator> implements java.util.Comparator<net.bytebuddy.description.field.FieldDescription.InDefinedShape> {
        private static final /* synthetic */ net.bytebuddy.build.HashCodeAndEqualsPlugin.AnnotationOrderComparator[] $VALUES = null;
        public static final net.bytebuddy.build.HashCodeAndEqualsPlugin.AnnotationOrderComparator INSTANCE = null;

        static {
                net.bytebuddy.build.HashCodeAndEqualsPlugin$AnnotationOrderComparator r0 = new net.bytebuddy.build.HashCodeAndEqualsPlugin$AnnotationOrderComparator
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.build.HashCodeAndEqualsPlugin.AnnotationOrderComparator.INSTANCE = r0
                net.bytebuddy.build.HashCodeAndEqualsPlugin$AnnotationOrderComparator[] r0 = new net.bytebuddy.build.HashCodeAndEqualsPlugin.AnnotationOrderComparator[]{r0}
                net.bytebuddy.build.HashCodeAndEqualsPlugin.AnnotationOrderComparator.$VALUES = r0
                return
        }

        AnnotationOrderComparator(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.build.HashCodeAndEqualsPlugin.AnnotationOrderComparator valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.build.HashCodeAndEqualsPlugin$AnnotationOrderComparator> r0 = net.bytebuddy.build.HashCodeAndEqualsPlugin.AnnotationOrderComparator.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.build.HashCodeAndEqualsPlugin$AnnotationOrderComparator r1 = (net.bytebuddy.build.HashCodeAndEqualsPlugin.AnnotationOrderComparator) r1
                return r1
        }

        public static net.bytebuddy.build.HashCodeAndEqualsPlugin.AnnotationOrderComparator[] values() {
                net.bytebuddy.build.HashCodeAndEqualsPlugin$AnnotationOrderComparator[] r0 = net.bytebuddy.build.HashCodeAndEqualsPlugin.AnnotationOrderComparator.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.build.HashCodeAndEqualsPlugin$AnnotationOrderComparator[] r0 = (net.bytebuddy.build.HashCodeAndEqualsPlugin.AnnotationOrderComparator[]) r0
                return r0
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(net.bytebuddy.description.field.FieldDescription.InDefinedShape r1, net.bytebuddy.description.field.FieldDescription.InDefinedShape r2) {
                r0 = this;
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r1 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r1
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r2 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(net.bytebuddy.description.field.FieldDescription.InDefinedShape r4, net.bytebuddy.description.field.FieldDescription.InDefinedShape r5) {
                r3 = this;
                net.bytebuddy.description.annotation.AnnotationList r4 = r4.getDeclaredAnnotations()
                java.lang.Class<net.bytebuddy.build.HashCodeAndEqualsPlugin$Sorted> r0 = net.bytebuddy.build.HashCodeAndEqualsPlugin.Sorted.class
                net.bytebuddy.description.annotation.AnnotationDescription$Loadable r4 = r4.ofType(r0)
                net.bytebuddy.description.annotation.AnnotationList r5 = r5.getDeclaredAnnotations()
                net.bytebuddy.description.annotation.AnnotationDescription$Loadable r5 = r5.ofType(r0)
                java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
                r1 = 0
                if (r4 != 0) goto L19
                r4 = r1
                goto L2b
            L19:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = net.bytebuddy.build.HashCodeAndEqualsPlugin.access$100()
                net.bytebuddy.description.annotation.AnnotationValue r4 = r4.getValue(r2)
                java.lang.Object r4 = r4.resolve(r0)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
            L2b:
                if (r5 != 0) goto L2f
                r5 = r1
                goto L41
            L2f:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = net.bytebuddy.build.HashCodeAndEqualsPlugin.access$100()
                net.bytebuddy.description.annotation.AnnotationValue r5 = r5.getValue(r2)
                java.lang.Object r5 = r5.resolve(r0)
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r5 = r5.intValue()
            L41:
                if (r4 <= r5) goto L45
                r4 = -1
                return r4
            L45:
                if (r4 >= r5) goto L49
                r4 = 1
                return r4
            L49:
                return r1
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface Enhance {

        public enum InvokeSuper extends java.lang.Enum<net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper> {
            private static final /* synthetic */ net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper[] $VALUES = null;
            public static final net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper ALWAYS = null;
            public static final net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper IF_ANNOTATED = null;
            public static final net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper IF_DECLARED = null;
            public static final net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper NEVER = null;





            static {
                    net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper$1 r0 = new net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper$1
                    java.lang.String r1 = "IF_DECLARED"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper.IF_DECLARED = r0
                    net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper$2 r1 = new net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper$2
                    java.lang.String r3 = "IF_ANNOTATED"
                    r4 = 1
                    r1.<init>(r3, r4)
                    net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper.IF_ANNOTATED = r1
                    net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper$3 r3 = new net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper$3
                    java.lang.String r5 = "ALWAYS"
                    r6 = 2
                    r3.<init>(r5, r6)
                    net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper.ALWAYS = r3
                    net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper$4 r5 = new net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper$4
                    java.lang.String r7 = "NEVER"
                    r8 = 3
                    r5.<init>(r7, r8)
                    net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper.NEVER = r5
                    r7 = 4
                    net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper[] r7 = new net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper[r7]
                    r7[r2] = r0
                    r7[r4] = r1
                    r7[r6] = r3
                    r7[r8] = r5
                    net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper.$VALUES = r7
                    return
            }

            InvokeSuper(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            /* synthetic */ InvokeSuper(java.lang.String r1, int r2, net.bytebuddy.build.HashCodeAndEqualsPlugin.AnonymousClass1 r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper> r0 = net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper r1 = (net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper) r1
                    return r1
            }

            public static net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper[] values() {
                    net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper[] r0 = net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper[] r0 = (net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper[]) r0
                    return r0
            }

            public abstract net.bytebuddy.implementation.EqualsMethod equalsMethod(net.bytebuddy.description.type.TypeDescription r1);

            public abstract net.bytebuddy.implementation.HashCodeMethod hashCodeMethod(net.bytebuddy.description.type.TypeDescription r1, boolean r2, boolean r3);
        }

        boolean includeSyntheticFields() default false;

        net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper invokeSuper() default net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper.IF_DECLARED;

        boolean permitSubclassEquality() default false;

        boolean simpleComparisonsFirst() default true;

        boolean useTypeHashConstant() default true;
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface Sorted {
        public static final int DEFAULT = 0;

        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface ValueHandling {

        public enum Sort extends java.lang.Enum<net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort> {
            private static final /* synthetic */ net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort[] $VALUES = null;
            public static final net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort IGNORE = null;
            public static final net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort REVERSE_NULLABILITY = null;

            static {
                    net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueHandling$Sort r0 = new net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueHandling$Sort
                    java.lang.String r1 = "IGNORE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE = r0
                    net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueHandling$Sort r1 = new net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueHandling$Sort
                    java.lang.String r2 = "REVERSE_NULLABILITY"
                    r3 = 1
                    r1.<init>(r2, r3)
                    net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY = r1
                    net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueHandling$Sort[] r0 = new net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort[]{r0, r1}
                    net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.$VALUES = r0
                    return
            }

            Sort(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueHandling$Sort> r0 = net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueHandling$Sort r1 = (net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort) r1
                    return r1
            }

            public static net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort[] values() {
                    net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueHandling$Sort[] r0 = net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueHandling$Sort[] r0 = (net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort[]) r0
                    return r0
            }
        }

        net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort value();
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ValueMatcher extends net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues<net.bytebuddy.description.field.FieldDescription> {
        private final net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort sort;

        public ValueMatcher(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort r1) {
                r0 = this;
                r0.<init>()
                r0.sort = r1
                return
        }

        @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
        public /* bridge */ /* synthetic */ boolean doMatch(net.bytebuddy.description.field.FieldDescription r1) {
                r0 = this;
                net.bytebuddy.description.field.FieldDescription r1 = (net.bytebuddy.description.field.FieldDescription) r1
                boolean r1 = r0.doMatch2(r1)
                return r1
        }

        /* JADX INFO: renamed from: doMatch, reason: avoid collision after fix types in other method */
        public boolean doMatch2(net.bytebuddy.description.field.FieldDescription r3) {
                r2 = this;
                net.bytebuddy.description.annotation.AnnotationList r3 = r3.getDeclaredAnnotations()
                java.lang.Class<net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueHandling> r0 = net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.class
                net.bytebuddy.description.annotation.AnnotationDescription$Loadable r3 = r3.ofType(r0)
                if (r3 == 0) goto L28
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = net.bytebuddy.build.HashCodeAndEqualsPlugin.access$200()
                net.bytebuddy.description.annotation.AnnotationValue r3 = r3.getValue(r1)
                java.lang.ClassLoader r0 = r0.getClassLoader()
                net.bytebuddy.description.annotation.AnnotationValue$Loaded r3 = r3.load(r0)
                java.lang.Class<net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueHandling$Sort> r0 = net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.class
                java.lang.Object r3 = r3.resolve(r0)
                net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueHandling$Sort r0 = r2.sort
                if (r3 != r0) goto L28
                r3 = 1
                goto L29
            L28:
                r3 = 0
            L29:
                return r3
        }

        @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                boolean r0 = super.equals(r5)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                r0 = 1
                if (r4 != r5) goto Lc
                return r0
            Lc:
                if (r5 != 0) goto Lf
                return r1
            Lf:
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L1a
                return r1
            L1a:
                net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueHandling$Sort r2 = r4.sort
                net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueMatcher r5 = (net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueMatcher) r5
                net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueHandling$Sort r5 = r5.sort
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L27
                return r1
            L27:
                return r0
        }

        @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
        public int hashCode() {
                r2 = this;
                int r0 = super.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueHandling$Sort r1 = r2.sort
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class WithNonNullableFields extends net.bytebuddy.build.HashCodeAndEqualsPlugin {
        public WithNonNullableFields() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        public WithNonNullableFields(@net.bytebuddy.utility.nullability.MaybeNull java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // net.bytebuddy.build.HashCodeAndEqualsPlugin
        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = super.equals(r4)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                r0 = 1
                if (r3 != r4) goto Lc
                return r0
            Lc:
                if (r4 != 0) goto Lf
                return r1
            Lf:
                java.lang.Class r2 = r3.getClass()
                java.lang.Class r4 = r4.getClass()
                if (r2 == r4) goto L1a
                return r1
            L1a:
                return r0
        }

        @Override // net.bytebuddy.build.HashCodeAndEqualsPlugin
        public int hashCode() {
                r1 = this;
                int r0 = super.hashCode()
                return r0
        }

        @Override // net.bytebuddy.build.HashCodeAndEqualsPlugin, net.bytebuddy.matcher.ElementMatcher
        public /* bridge */ /* synthetic */ boolean matches(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
                boolean r1 = super.matches2(r1)
                return r1
        }

        @Override // net.bytebuddy.build.HashCodeAndEqualsPlugin
        public net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.description.field.FieldDescription> nonNullable(net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.description.field.FieldDescription> r1) {
                r0 = this;
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.not(r1)
                return r1
        }
    }

    static {
            java.lang.Class<net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance> r0 = net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.class
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
            java.lang.String r1 = "invokeSuper"
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
            net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
            net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
            java.lang.Object r1 = r1.getOnly()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
            net.bytebuddy.build.HashCodeAndEqualsPlugin.ENHANCE_INVOKE_SUPER = r1
            java.lang.String r1 = "simpleComparisonsFirst"
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
            net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
            net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
            java.lang.Object r1 = r1.getOnly()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
            net.bytebuddy.build.HashCodeAndEqualsPlugin.ENHANCE_SIMPLE_COMPARISON_FIRST = r1
            java.lang.String r1 = "includeSyntheticFields"
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
            net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
            net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
            java.lang.Object r1 = r1.getOnly()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
            net.bytebuddy.build.HashCodeAndEqualsPlugin.ENHANCE_INCLUDE_SYNTHETIC_FIELDS = r1
            java.lang.String r1 = "permitSubclassEquality"
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
            net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
            net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
            java.lang.Object r1 = r1.getOnly()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
            net.bytebuddy.build.HashCodeAndEqualsPlugin.ENHANCE_PERMIT_SUBCLASS_EQUALITY = r1
            java.lang.String r1 = "useTypeHashConstant"
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
            net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
            net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
            java.lang.Object r0 = r0.getOnly()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
            net.bytebuddy.build.HashCodeAndEqualsPlugin.ENHANCE_USE_TYPE_HASH_CONSTANT = r0
            java.lang.Class<net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueHandling> r0 = net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.class
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
            java.lang.String r1 = "value"
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.named(r1)
            net.bytebuddy.matcher.FilterableList r0 = r0.filter(r2)
            net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
            java.lang.Object r0 = r0.getOnly()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
            net.bytebuddy.build.HashCodeAndEqualsPlugin.VALUE_HANDLING_VALUE = r0
            java.lang.Class<net.bytebuddy.build.HashCodeAndEqualsPlugin$Sorted> r0 = net.bytebuddy.build.HashCodeAndEqualsPlugin.Sorted.class
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
            net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
            net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
            java.lang.Object r0 = r0.getOnly()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
            net.bytebuddy.build.HashCodeAndEqualsPlugin.SORTED_VALUE = r0
            return
    }

    public HashCodeAndEqualsPlugin() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public HashCodeAndEqualsPlugin(@net.bytebuddy.utility.nullability.MaybeNull java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.annotationType = r1
            return
    }

    public static /* synthetic */ net.bytebuddy.description.method.MethodDescription.InDefinedShape access$100() {
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.build.HashCodeAndEqualsPlugin.SORTED_VALUE
            return r0
    }

    public static /* synthetic */ net.bytebuddy.description.method.MethodDescription.InDefinedShape access$200() {
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.build.HashCodeAndEqualsPlugin.VALUE_HANDLING_VALUE
            return r0
    }

    @Override // net.bytebuddy.build.Plugin
    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Annotation presence is required by matcher.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
    public net.bytebuddy.dynamic.DynamicType.Builder<?> apply(net.bytebuddy.dynamic.DynamicType.Builder<?> r7, net.bytebuddy.description.type.TypeDescription r8, net.bytebuddy.dynamic.ClassFileLocator r9) {
            r6 = this;
            net.bytebuddy.description.annotation.AnnotationList r9 = r8.getDeclaredAnnotations()
            java.lang.Class<net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance> r0 = net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.class
            net.bytebuddy.description.annotation.AnnotationDescription$Loadable r9 = r9.ofType(r0)
            net.bytebuddy.description.method.MethodList r1 = r8.getDeclaredMethods()
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isHashCode()
            net.bytebuddy.matcher.FilterableList r1 = r1.filter(r2)
            net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
            boolean r1 = r1.isEmpty()
            java.lang.Class<net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper> r2 = net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper.class
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            if (r1 == 0) goto L9f
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isHashCode()
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r7 = r7.method(r1)
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = net.bytebuddy.build.HashCodeAndEqualsPlugin.ENHANCE_INVOKE_SUPER
            net.bytebuddy.description.annotation.AnnotationValue r1 = r9.getValue(r1)
            java.lang.ClassLoader r4 = r0.getClassLoader()
            net.bytebuddy.description.annotation.AnnotationValue$Loaded r1 = r1.load(r4)
            java.lang.Object r1 = r1.resolve(r2)
            net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper r1 = (net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper) r1
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = net.bytebuddy.build.HashCodeAndEqualsPlugin.ENHANCE_USE_TYPE_HASH_CONSTANT
            net.bytebuddy.description.annotation.AnnotationValue r4 = r9.getValue(r4)
            java.lang.Object r4 = r4.resolve(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r5 = net.bytebuddy.build.HashCodeAndEqualsPlugin.ENHANCE_PERMIT_SUBCLASS_EQUALITY
            net.bytebuddy.description.annotation.AnnotationValue r5 = r9.getValue(r5)
            java.lang.Object r5 = r5.resolve(r3)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            net.bytebuddy.implementation.HashCodeMethod r1 = r1.hashCodeMethod(r8, r4, r5)
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = net.bytebuddy.build.HashCodeAndEqualsPlugin.ENHANCE_INCLUDE_SYNTHETIC_FIELDS
            net.bytebuddy.description.annotation.AnnotationValue r4 = r9.getValue(r4)
            java.lang.Object r4 = r4.resolve(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L79
            net.bytebuddy.matcher.ElementMatcher$Junction r4 = net.bytebuddy.matcher.ElementMatchers.none()
            goto L7d
        L79:
            net.bytebuddy.matcher.ElementMatcher$Junction r4 = net.bytebuddy.matcher.ElementMatchers.isSynthetic()
        L7d:
            net.bytebuddy.implementation.HashCodeMethod r1 = r1.withIgnoredFields(r4)
            net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueMatcher r4 = new net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueMatcher
            net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueHandling$Sort r5 = net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE
            r4.<init>(r5)
            net.bytebuddy.implementation.HashCodeMethod r1 = r1.withIgnoredFields(r4)
            net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueMatcher r4 = new net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueMatcher
            net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueHandling$Sort r5 = net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY
            r4.<init>(r5)
            net.bytebuddy.matcher.ElementMatcher r4 = r6.nonNullable(r4)
            net.bytebuddy.implementation.HashCodeMethod r1 = r1.withNonNullableFields(r4)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r7 = r7.intercept(r1)
        L9f:
            net.bytebuddy.description.method.MethodList r1 = r8.getDeclaredMethods()
            net.bytebuddy.matcher.ElementMatcher$Junction r4 = net.bytebuddy.matcher.ElementMatchers.isEquals()
            net.bytebuddy.matcher.FilterableList r1 = r1.filter(r4)
            net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L152
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = net.bytebuddy.build.HashCodeAndEqualsPlugin.ENHANCE_INVOKE_SUPER
            net.bytebuddy.description.annotation.AnnotationValue r1 = r9.getValue(r1)
            java.lang.ClassLoader r0 = r0.getClassLoader()
            net.bytebuddy.description.annotation.AnnotationValue$Loaded r0 = r1.load(r0)
            java.lang.Object r0 = r0.resolve(r2)
            net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper r0 = (net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper) r0
            net.bytebuddy.implementation.EqualsMethod r8 = r0.equalsMethod(r8)
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.build.HashCodeAndEqualsPlugin.ENHANCE_INCLUDE_SYNTHETIC_FIELDS
            net.bytebuddy.description.annotation.AnnotationValue r0 = r9.getValue(r0)
            java.lang.Object r0 = r0.resolve(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Le2
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.none()
            goto Le6
        Le2:
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isSynthetic()
        Le6:
            net.bytebuddy.implementation.EqualsMethod r8 = r8.withIgnoredFields(r0)
            net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueMatcher r0 = new net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueMatcher
            net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueHandling$Sort r1 = net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE
            r0.<init>(r1)
            net.bytebuddy.implementation.EqualsMethod r8 = r8.withIgnoredFields(r0)
            net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueMatcher r0 = new net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueMatcher
            net.bytebuddy.build.HashCodeAndEqualsPlugin$ValueHandling$Sort r1 = net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY
            r0.<init>(r1)
            net.bytebuddy.matcher.ElementMatcher r0 = r6.nonNullable(r0)
            net.bytebuddy.implementation.EqualsMethod r8 = r8.withNonNullableFields(r0)
            net.bytebuddy.build.HashCodeAndEqualsPlugin$AnnotationOrderComparator r0 = net.bytebuddy.build.HashCodeAndEqualsPlugin.AnnotationOrderComparator.INSTANCE
            net.bytebuddy.implementation.EqualsMethod r8 = r8.withFieldOrder(r0)
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.build.HashCodeAndEqualsPlugin.ENHANCE_SIMPLE_COMPARISON_FIRST
            net.bytebuddy.description.annotation.AnnotationValue r0 = r9.getValue(r0)
            java.lang.Object r0 = r0.resolve(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L12c
            net.bytebuddy.implementation.EqualsMethod r8 = r8.withPrimitiveTypedFieldsFirst()
            net.bytebuddy.implementation.EqualsMethod r8 = r8.withEnumerationTypedFieldsFirst()
            net.bytebuddy.implementation.EqualsMethod r8 = r8.withPrimitiveWrapperTypedFieldsFirst()
            net.bytebuddy.implementation.EqualsMethod r8 = r8.withStringTypedFieldsFirst()
        L12c:
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isEquals()
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r7 = r7.method(r0)
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.build.HashCodeAndEqualsPlugin.ENHANCE_PERMIT_SUBCLASS_EQUALITY
            net.bytebuddy.description.annotation.AnnotationValue r9 = r9.getValue(r0)
            java.lang.Object r9 = r9.resolve(r3)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L14a
            net.bytebuddy.implementation.Implementation r8 = r8.withSubclassEquality()
        L14a:
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r7 = r7.intercept(r8)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition r7 = r7.attribute(r6)
        L152:
            return r7
    }

    @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender
    public void apply(net.bytebuddy.jar.asm.MethodVisitor r3, net.bytebuddy.description.method.MethodDescription r4, net.bytebuddy.implementation.attribute.AnnotationValueFilter r5) {
            r2 = this;
            java.lang.String r4 = r2.annotationType
            if (r4 == 0) goto L2f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "L"
            r4.append(r5)
            java.lang.String r5 = r2.annotationType
            r0 = 46
            r1 = 47
            java.lang.String r5 = r5.replace(r0, r1)
            r4.append(r5)
            java.lang.String r5 = ";"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 1
            r0 = 0
            net.bytebuddy.jar.asm.AnnotationVisitor r3 = r3.visitParameterAnnotation(r0, r4, r5)
            if (r3 == 0) goto L2f
            r3.visitEnd()
        L2f:
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L13
            return r1
        L13:
            java.lang.String r2 = r4.annotationType
            net.bytebuddy.build.HashCodeAndEqualsPlugin r5 = (net.bytebuddy.build.HashCodeAndEqualsPlugin) r5
            java.lang.String r5 = r5.annotationType
            if (r5 == 0) goto L24
            if (r2 == 0) goto L26
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L27
            return r1
        L24:
            if (r2 == 0) goto L27
        L26:
            return r1
        L27:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.annotationType
            if (r1 == 0) goto L13
            int r1 = r1.hashCode()
            int r0 = r0 + r1
        L13:
            return r0
    }

    @Override // net.bytebuddy.build.Plugin.Factory
    public net.bytebuddy.build.Plugin make() {
            r0 = this;
            return r0
    }

    @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory
    public net.bytebuddy.implementation.attribute.MethodAttributeAppender make(net.bytebuddy.description.type.TypeDescription r1) {
            r0 = this;
            return r0
    }

    @Override // net.bytebuddy.matcher.ElementMatcher
    public /* bridge */ /* synthetic */ boolean matches(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription r1) {
            r0 = this;
            net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
            boolean r1 = r0.matches2(r1)
            return r1
    }

    /* JADX INFO: renamed from: matches, reason: avoid collision after fix types in other method */
    public boolean matches2(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription r2) {
            r1 = this;
            if (r2 == 0) goto L10
            net.bytebuddy.description.annotation.AnnotationList r2 = r2.getDeclaredAnnotations()
            java.lang.Class<net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance> r0 = net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.class
            boolean r2 = r2.isAnnotationPresent(r0)
            if (r2 == 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    public net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.description.field.FieldDescription> nonNullable(net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.description.field.FieldDescription> r1) {
            r0 = this;
            return r1
    }
}
