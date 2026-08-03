package net.bytebuddy.build;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class CachedReturnPlugin extends net.bytebuddy.build.Plugin.ForElementMatcher implements net.bytebuddy.build.Plugin.Factory {
    private static final java.lang.String ADVICE_INFIX = "$Advice$";
    private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape ENHANCE_VALUE = null;
    private static final java.lang.String NAME_INFIX = "_";

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
    private final java.util.Map<net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDescription> adviceByType;
    private final net.bytebuddy.dynamic.ClassFileLocator classFileLocator;
    private final boolean ignoreExistingFields;

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
    private final net.bytebuddy.utility.RandomString randomString;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface CacheField {
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class CacheFieldOffsetMapping implements net.bytebuddy.asm.Advice.OffsetMapping {
        private final java.lang.String name;

        public CacheFieldOffsetMapping(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.name = r1
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
                java.lang.String r2 = r4.name
                net.bytebuddy.build.CachedReturnPlugin$CacheFieldOffsetMapping r5 = (net.bytebuddy.build.CachedReturnPlugin.CacheFieldOffsetMapping) r5
                java.lang.String r5 = r5.name
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L20
                return r1
            L20:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r2.name
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.asm.Advice.OffsetMapping
        public net.bytebuddy.asm.Advice.OffsetMapping.Target resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.asm.Advice.ArgumentHandler r4, net.bytebuddy.asm.Advice.OffsetMapping.Sort r5) {
                r0 = this;
                net.bytebuddy.asm.Advice$OffsetMapping$Target$ForField$ReadWrite r2 = new net.bytebuddy.asm.Advice$OffsetMapping$Target$ForField$ReadWrite
                net.bytebuddy.description.field.FieldList r1 = r1.getDeclaredFields()
                java.lang.String r3 = r0.name
                net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.named(r3)
                net.bytebuddy.matcher.FilterableList r1 = r1.filter(r3)
                net.bytebuddy.description.field.FieldList r1 = (net.bytebuddy.description.field.FieldList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.field.FieldDescription r1 = (net.bytebuddy.description.field.FieldDescription) r1
                r2.<init>(r1)
                return r2
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface Enhance {
        java.lang.String value() default "";
    }

    static {
            java.lang.Class<net.bytebuddy.build.CachedReturnPlugin$Enhance> r0 = net.bytebuddy.build.CachedReturnPlugin.Enhance.class
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
            java.lang.String r1 = "value"
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
            net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
            net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
            java.lang.Object r0 = r0.getOnly()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
            net.bytebuddy.build.CachedReturnPlugin.ENHANCE_VALUE = r0
            return
    }

    public CachedReturnPlugin() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public CachedReturnPlugin(boolean r12) {
            r11 = this;
            java.lang.Class<net.bytebuddy.build.CachedReturnPlugin$Enhance> r0 = net.bytebuddy.build.CachedReturnPlugin.Enhance.class
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isAnnotatedWith(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.declaresMethod(r0)
            r11.<init>(r0)
            r11.ignoreExistingFields = r12
            net.bytebuddy.utility.RandomString r12 = new net.bytebuddy.utility.RandomString
            r12.<init>()
            r11.randomString = r12
            java.lang.Class<net.bytebuddy.build.CachedReturnPlugin> r12 = net.bytebuddy.build.CachedReturnPlugin.class
            java.lang.ClassLoader r0 = r12.getClassLoader()
            net.bytebuddy.dynamic.ClassFileLocator r0 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.of(r0)
            r11.classFileLocator = r0
            net.bytebuddy.pool.TypePool r0 = net.bytebuddy.pool.TypePool.Default.of(r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r11.adviceByType = r1
            java.lang.Class r2 = java.lang.Boolean.TYPE
            java.lang.Class r3 = java.lang.Byte.TYPE
            java.lang.Class r4 = java.lang.Short.TYPE
            java.lang.Class r5 = java.lang.Character.TYPE
            java.lang.Class r6 = java.lang.Integer.TYPE
            java.lang.Class r7 = java.lang.Long.TYPE
            java.lang.Class r8 = java.lang.Float.TYPE
            java.lang.Class r9 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            java.lang.Class[] r1 = new java.lang.Class[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            r2 = 0
        L44:
            r3 = 9
            if (r2 >= r3) goto L7a
            r3 = r1[r2]
            java.util.Map<net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDescription> r4 = r11.adviceByType
            net.bytebuddy.description.type.TypeDescription r5 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r12.getName()
            r6.append(r7)
            java.lang.String r7 = "$Advice$"
            r6.append(r7)
            java.lang.String r3 = r3.getSimpleName()
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            net.bytebuddy.pool.TypePool$Resolution r3 = r0.describe(r3)
            net.bytebuddy.description.type.TypeDescription r3 = r3.resolve()
            r4.put(r5, r3)
            int r2 = r2 + 1
            goto L44
        L7a:
            return
    }

    @Override // net.bytebuddy.build.Plugin
    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Annotation presence is required by matcher.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
    public net.bytebuddy.dynamic.DynamicType.Builder<?> apply(net.bytebuddy.dynamic.DynamicType.Builder<?> r9, net.bytebuddy.description.type.TypeDescription r10, net.bytebuddy.dynamic.ClassFileLocator r11) {
            r8 = this;
            net.bytebuddy.description.method.MethodList r11 = r10.getDeclaredMethods()
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isBridge()
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.not(r0)
            java.lang.Class<net.bytebuddy.build.CachedReturnPlugin$Enhance> r1 = net.bytebuddy.build.CachedReturnPlugin.Enhance.class
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isAnnotatedWith(r1)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r2)
            net.bytebuddy.matcher.FilterableList r11 = r11.filter(r0)
            net.bytebuddy.description.method.MethodList r11 = (net.bytebuddy.description.method.MethodList) r11
            java.util.Iterator r11 = r11.iterator()
        L20:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L15a
            java.lang.Object r0 = r11.next()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
            boolean r2 = r0.isAbstract()
            if (r2 != 0) goto L143
            net.bytebuddy.description.method.ParameterList r2 = r0.getParameters()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L12c
            net.bytebuddy.description.type.TypeDescription$Generic r2 = r0.getReturnType()
            java.lang.Class r3 = java.lang.Void.TYPE
            boolean r2 = r2.represents(r3)
            if (r2 != 0) goto L115
            net.bytebuddy.description.annotation.AnnotationList r2 = r0.getDeclaredAnnotations()
            net.bytebuddy.description.annotation.AnnotationDescription$Loadable r2 = r2.ofType(r1)
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = net.bytebuddy.build.CachedReturnPlugin.ENHANCE_VALUE
            net.bytebuddy.description.annotation.AnnotationValue r2 = r2.getValue(r3)
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Object r2 = r2.resolve(r3)
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.length()
            if (r3 != 0) goto L83
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.getName()
            r2.append(r3)
            java.lang.String r3 = "_"
            r2.append(r3)
            net.bytebuddy.utility.RandomString r3 = r8.randomString
            java.lang.String r3 = r3.nextString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L9c
        L83:
            boolean r3 = r8.ignoreExistingFields
            if (r3 == 0) goto L9c
            net.bytebuddy.description.field.FieldList r3 = r10.getDeclaredFields()
            net.bytebuddy.matcher.ElementMatcher$Junction r4 = net.bytebuddy.matcher.ElementMatchers.named(r2)
            net.bytebuddy.matcher.FilterableList r3 = r3.filter(r4)
            net.bytebuddy.description.field.FieldList r3 = (net.bytebuddy.description.field.FieldList) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L9c
            return r9
        L9c:
            net.bytebuddy.description.type.TypeDescription$Generic r3 = r0.getReturnType()
            net.bytebuddy.description.type.TypeDescription r3 = r3.asErasure()
            boolean r4 = r0.isStatic()
            if (r4 == 0) goto Lad
            net.bytebuddy.description.modifier.Ownership r4 = net.bytebuddy.description.modifier.Ownership.STATIC
            goto Laf
        Lad:
            net.bytebuddy.description.modifier.Ownership r4 = net.bytebuddy.description.modifier.Ownership.MEMBER
        Laf:
            boolean r5 = r0.isStatic()
            if (r5 == 0) goto Lb8
            net.bytebuddy.description.modifier.FieldPersistence r5 = net.bytebuddy.description.modifier.FieldPersistence.PLAIN
            goto Lba
        Lb8:
            net.bytebuddy.description.modifier.FieldPersistence r5 = net.bytebuddy.description.modifier.FieldPersistence.TRANSIENT
        Lba:
            r6 = 4
            net.bytebuddy.description.modifier.ModifierContributor$ForField[] r6 = new net.bytebuddy.description.modifier.ModifierContributor.ForField[r6]
            r7 = 0
            r6[r7] = r4
            r4 = 1
            r6[r4] = r5
            net.bytebuddy.description.modifier.Visibility r4 = net.bytebuddy.description.modifier.Visibility.PRIVATE
            r5 = 2
            r6[r5] = r4
            net.bytebuddy.description.modifier.SyntheticState r4 = net.bytebuddy.description.modifier.SyntheticState.SYNTHETIC
            r5 = 3
            r6[r5] = r4
            net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional$Valuable r9 = r9.defineField(r2, r3, r6)
            net.bytebuddy.asm.Advice$WithCustomMapping r3 = net.bytebuddy.asm.Advice.withCustomMapping()
            net.bytebuddy.build.CachedReturnPlugin$CacheFieldOffsetMapping r4 = new net.bytebuddy.build.CachedReturnPlugin$CacheFieldOffsetMapping
            r4.<init>(r2)
            java.lang.Class<net.bytebuddy.build.CachedReturnPlugin$CacheField> r2 = net.bytebuddy.build.CachedReturnPlugin.CacheField.class
            net.bytebuddy.asm.Advice$WithCustomMapping r2 = r3.bind(r2, r4)
            java.util.Map<net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDescription> r3 = r8.adviceByType
            net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.getReturnType()
            boolean r4 = r4.isPrimitive()
            if (r4 == 0) goto Lf5
            net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.getReturnType()
            net.bytebuddy.description.type.TypeDescription r4 = r4.asErasure()
            goto Lfb
        Lf5:
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            net.bytebuddy.description.type.TypeDescription r4 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r4)
        Lfb:
            java.lang.Object r3 = r3.get(r4)
            net.bytebuddy.description.type.TypeDescription r3 = (net.bytebuddy.description.type.TypeDescription) r3
            net.bytebuddy.dynamic.ClassFileLocator r4 = r8.classFileLocator
            net.bytebuddy.asm.Advice r2 = r2.to(r3, r4)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.is(r0)
            net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods r0 = r2.on(r0)
            net.bytebuddy.dynamic.DynamicType$Builder r9 = r9.visit(r0)
            goto L20
        L115:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Cannot cache void result for "
            r10.append(r11)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L12c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Cannot cache the value of a method with parameters: "
            r10.append(r11)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L143:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Cannot cache the value of an abstract method: "
            r10.append(r11)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L15a:
            return r9
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    @Override // net.bytebuddy.build.Plugin.ForElementMatcher
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
            boolean r2 = r4.ignoreExistingFields
            net.bytebuddy.build.CachedReturnPlugin r5 = (net.bytebuddy.build.CachedReturnPlugin) r5
            boolean r3 = r5.ignoreExistingFields
            if (r2 == r3) goto L23
            return r1
        L23:
            net.bytebuddy.dynamic.ClassFileLocator r2 = r4.classFileLocator
            net.bytebuddy.dynamic.ClassFileLocator r5 = r5.classFileLocator
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L2e
            return r1
        L2e:
            return r0
    }

    @Override // net.bytebuddy.build.Plugin.ForElementMatcher
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            boolean r1 = r2.ignoreExistingFields
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.dynamic.ClassFileLocator r1 = r2.classFileLocator
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // net.bytebuddy.build.Plugin.Factory
    public net.bytebuddy.build.Plugin make() {
            r0 = this;
            return r0
    }
}
