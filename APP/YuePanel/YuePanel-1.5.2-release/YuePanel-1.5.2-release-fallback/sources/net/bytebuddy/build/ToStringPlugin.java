package net.bytebuddy.build;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class ToStringPlugin implements net.bytebuddy.build.Plugin, net.bytebuddy.build.Plugin.Factory {
    private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape ENHANCE_INCLUDE_SYNTHETIC_FIELDS = null;
    private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape ENHANCE_PREFIX = null;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface Enhance {

        public enum Prefix extends java.lang.Enum<net.bytebuddy.build.ToStringPlugin.Enhance.Prefix> {
            private static final /* synthetic */ net.bytebuddy.build.ToStringPlugin.Enhance.Prefix[] $VALUES = null;
            public static final net.bytebuddy.build.ToStringPlugin.Enhance.Prefix CANONICAL = null;
            public static final net.bytebuddy.build.ToStringPlugin.Enhance.Prefix FULLY_QUALIFIED = null;
            public static final net.bytebuddy.build.ToStringPlugin.Enhance.Prefix SIMPLE = null;
            private final net.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default prefixResolver;

            static {
                    net.bytebuddy.build.ToStringPlugin$Enhance$Prefix r0 = new net.bytebuddy.build.ToStringPlugin$Enhance$Prefix
                    r1 = 0
                    net.bytebuddy.implementation.ToStringMethod$PrefixResolver$Default r2 = net.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default.FULLY_QUALIFIED_CLASS_NAME
                    java.lang.String r3 = "FULLY_QUALIFIED"
                    r0.<init>(r3, r1, r2)
                    net.bytebuddy.build.ToStringPlugin.Enhance.Prefix.FULLY_QUALIFIED = r0
                    net.bytebuddy.build.ToStringPlugin$Enhance$Prefix r1 = new net.bytebuddy.build.ToStringPlugin$Enhance$Prefix
                    r2 = 1
                    net.bytebuddy.implementation.ToStringMethod$PrefixResolver$Default r3 = net.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default.CANONICAL_CLASS_NAME
                    java.lang.String r4 = "CANONICAL"
                    r1.<init>(r4, r2, r3)
                    net.bytebuddy.build.ToStringPlugin.Enhance.Prefix.CANONICAL = r1
                    net.bytebuddy.build.ToStringPlugin$Enhance$Prefix r2 = new net.bytebuddy.build.ToStringPlugin$Enhance$Prefix
                    r3 = 2
                    net.bytebuddy.implementation.ToStringMethod$PrefixResolver$Default r4 = net.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default.SIMPLE_CLASS_NAME
                    java.lang.String r5 = "SIMPLE"
                    r2.<init>(r5, r3, r4)
                    net.bytebuddy.build.ToStringPlugin.Enhance.Prefix.SIMPLE = r2
                    net.bytebuddy.build.ToStringPlugin$Enhance$Prefix[] r0 = new net.bytebuddy.build.ToStringPlugin.Enhance.Prefix[]{r0, r1, r2}
                    net.bytebuddy.build.ToStringPlugin.Enhance.Prefix.$VALUES = r0
                    return
            }

            Prefix(java.lang.String r1, int r2, net.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    r0.prefixResolver = r3
                    return
            }

            public static net.bytebuddy.build.ToStringPlugin.Enhance.Prefix valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.build.ToStringPlugin$Enhance$Prefix> r0 = net.bytebuddy.build.ToStringPlugin.Enhance.Prefix.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.build.ToStringPlugin$Enhance$Prefix r1 = (net.bytebuddy.build.ToStringPlugin.Enhance.Prefix) r1
                    return r1
            }

            public static net.bytebuddy.build.ToStringPlugin.Enhance.Prefix[] values() {
                    net.bytebuddy.build.ToStringPlugin$Enhance$Prefix[] r0 = net.bytebuddy.build.ToStringPlugin.Enhance.Prefix.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.build.ToStringPlugin$Enhance$Prefix[] r0 = (net.bytebuddy.build.ToStringPlugin.Enhance.Prefix[]) r0
                    return r0
            }

            public net.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default getPrefixResolver() {
                    r1 = this;
                    net.bytebuddy.implementation.ToStringMethod$PrefixResolver$Default r0 = r1.prefixResolver
                    return r0
            }
        }

        boolean includeSyntheticFields() default false;

        net.bytebuddy.build.ToStringPlugin.Enhance.Prefix prefix() default net.bytebuddy.build.ToStringPlugin.Enhance.Prefix.SIMPLE;
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface Exclude {
    }

    static {
            java.lang.Class<net.bytebuddy.build.ToStringPlugin$Enhance> r0 = net.bytebuddy.build.ToStringPlugin.Enhance.class
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
            java.lang.String r1 = "prefix"
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
            net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
            net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
            java.lang.Object r1 = r1.getOnly()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
            net.bytebuddy.build.ToStringPlugin.ENHANCE_PREFIX = r1
            java.lang.String r1 = "includeSyntheticFields"
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
            net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
            net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
            java.lang.Object r0 = r0.getOnly()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
            net.bytebuddy.build.ToStringPlugin.ENHANCE_INCLUDE_SYNTHETIC_FIELDS = r0
            return
    }

    public ToStringPlugin() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // net.bytebuddy.build.Plugin
    public net.bytebuddy.dynamic.DynamicType.Builder<?> apply(net.bytebuddy.dynamic.DynamicType.Builder<?> r3, net.bytebuddy.description.type.TypeDescription r4, net.bytebuddy.dynamic.ClassFileLocator r5) {
            r2 = this;
            net.bytebuddy.description.annotation.AnnotationList r5 = r4.getDeclaredAnnotations()
            java.lang.Class<net.bytebuddy.build.ToStringPlugin$Enhance> r0 = net.bytebuddy.build.ToStringPlugin.Enhance.class
            net.bytebuddy.description.annotation.AnnotationDescription$Loadable r5 = r5.ofType(r0)
            net.bytebuddy.description.method.MethodList r4 = r4.getDeclaredMethods()
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isToString()
            net.bytebuddy.matcher.FilterableList r4 = r4.filter(r1)
            net.bytebuddy.description.method.MethodList r4 = (net.bytebuddy.description.method.MethodList) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L73
            net.bytebuddy.matcher.ElementMatcher$Junction r4 = net.bytebuddy.matcher.ElementMatchers.isToString()
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r3 = r3.method(r4)
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = net.bytebuddy.build.ToStringPlugin.ENHANCE_PREFIX
            net.bytebuddy.description.annotation.AnnotationValue r4 = r5.getValue(r4)
            java.lang.ClassLoader r0 = r0.getClassLoader()
            net.bytebuddy.description.annotation.AnnotationValue$Loaded r4 = r4.load(r0)
            java.lang.Class<net.bytebuddy.build.ToStringPlugin$Enhance$Prefix> r0 = net.bytebuddy.build.ToStringPlugin.Enhance.Prefix.class
            java.lang.Object r4 = r4.resolve(r0)
            net.bytebuddy.build.ToStringPlugin$Enhance$Prefix r4 = (net.bytebuddy.build.ToStringPlugin.Enhance.Prefix) r4
            net.bytebuddy.implementation.ToStringMethod$PrefixResolver$Default r4 = r4.getPrefixResolver()
            net.bytebuddy.implementation.ToStringMethod r4 = net.bytebuddy.implementation.ToStringMethod.prefixedBy(r4)
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.build.ToStringPlugin.ENHANCE_INCLUDE_SYNTHETIC_FIELDS
            net.bytebuddy.description.annotation.AnnotationValue r5 = r5.getValue(r0)
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            java.lang.Object r5 = r5.resolve(r0)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L5d
            net.bytebuddy.matcher.ElementMatcher$Junction r5 = net.bytebuddy.matcher.ElementMatchers.none()
            goto L61
        L5d:
            net.bytebuddy.matcher.ElementMatcher$Junction r5 = net.bytebuddy.matcher.ElementMatchers.isSynthetic()
        L61:
            net.bytebuddy.implementation.ToStringMethod r4 = r4.withIgnoredFields(r5)
            java.lang.Class<net.bytebuddy.build.ToStringPlugin$Exclude> r5 = net.bytebuddy.build.ToStringPlugin.Exclude.class
            net.bytebuddy.matcher.ElementMatcher$Junction r5 = net.bytebuddy.matcher.ElementMatchers.isAnnotatedWith(r5)
            net.bytebuddy.implementation.ToStringMethod r4 = r4.withIgnoredFields(r5)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r3 = r3.intercept(r4)
        L73:
            return r3
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            r1 = 0
            if (r4 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r3.getClass()
            java.lang.Class r4 = r4.getClass()
            if (r2 == r4) goto L13
            return r1
        L13:
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // net.bytebuddy.build.Plugin.Factory
    public net.bytebuddy.build.Plugin make() {
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
            java.lang.Class<net.bytebuddy.build.ToStringPlugin$Enhance> r0 = net.bytebuddy.build.ToStringPlugin.Enhance.class
            boolean r2 = r2.isAnnotationPresent(r0)
            if (r2 == 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }
}
