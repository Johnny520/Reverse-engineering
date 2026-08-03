package net.bytebuddy.build;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class RepeatedAnnotationPlugin extends net.bytebuddy.build.Plugin.ForElementMatcher {
    private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape VALUE = null;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface Enhance {
        java.lang.Class<? extends java.lang.annotation.Annotation> value();
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class RepeatedAnnotationAppender implements net.bytebuddy.implementation.attribute.TypeAttributeAppender {
        private final net.bytebuddy.description.type.TypeDescription target;

        public RepeatedAnnotationAppender(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                r0.<init>()
                r0.target = r1
                return
        }

        @Override // net.bytebuddy.implementation.attribute.TypeAttributeAppender
        public void apply(net.bytebuddy.jar.asm.ClassVisitor r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter r3) {
                r0 = this;
                java.lang.String r2 = "Ljava/lang/annotation/Repeatable;"
                r3 = 1
                net.bytebuddy.jar.asm.AnnotationVisitor r1 = r1.visitAnnotation(r2, r3)
                if (r1 == 0) goto L1b
                net.bytebuddy.description.type.TypeDescription r2 = r0.target
                java.lang.String r2 = r2.getDescriptor()
                net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getType(r2)
                java.lang.String r3 = "value"
                r1.visit(r3, r2)
                r1.visitEnd()
            L1b:
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
                net.bytebuddy.description.type.TypeDescription r2 = r4.target
                net.bytebuddy.build.RepeatedAnnotationPlugin$RepeatedAnnotationAppender r5 = (net.bytebuddy.build.RepeatedAnnotationPlugin.RepeatedAnnotationAppender) r5
                net.bytebuddy.description.type.TypeDescription r5 = r5.target
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
                net.bytebuddy.description.type.TypeDescription r1 = r2.target
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    static {
            java.lang.Class<net.bytebuddy.build.RepeatedAnnotationPlugin$Enhance> r0 = net.bytebuddy.build.RepeatedAnnotationPlugin.Enhance.class
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
            java.lang.String r1 = "value"
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
            net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
            net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
            java.lang.Object r0 = r0.getOnly()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
            net.bytebuddy.build.RepeatedAnnotationPlugin.VALUE = r0
            return
    }

    public RepeatedAnnotationPlugin() {
            r1 = this;
            java.lang.Class<net.bytebuddy.build.RepeatedAnnotationPlugin$Enhance> r0 = net.bytebuddy.build.RepeatedAnnotationPlugin.Enhance.class
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isAnnotatedWith(r0)
            r1.<init>(r0)
            return
    }

    @Override // net.bytebuddy.build.Plugin
    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
    public net.bytebuddy.dynamic.DynamicType.Builder<?> apply(net.bytebuddy.dynamic.DynamicType.Builder<?> r6, net.bytebuddy.description.type.TypeDescription r7, net.bytebuddy.dynamic.ClassFileLocator r8) {
            r5 = this;
            net.bytebuddy.description.annotation.AnnotationList r8 = r7.getDeclaredAnnotations()
            java.lang.Class<net.bytebuddy.build.RepeatedAnnotationPlugin$Enhance> r0 = net.bytebuddy.build.RepeatedAnnotationPlugin.Enhance.class
            net.bytebuddy.description.annotation.AnnotationDescription$Loadable r8 = r8.ofType(r0)
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.build.RepeatedAnnotationPlugin.VALUE
            net.bytebuddy.description.annotation.AnnotationValue r8 = r8.getValue(r0)
            java.lang.Class<net.bytebuddy.description.type.TypeDescription> r0 = net.bytebuddy.description.type.TypeDescription.class
            java.lang.Object r8 = r8.resolve(r0)
            net.bytebuddy.description.type.TypeDescription r8 = (net.bytebuddy.description.type.TypeDescription) r8
            boolean r0 = r8.isAnnotation()
            java.lang.String r1 = "Expected "
            if (r0 == 0) goto La9
            net.bytebuddy.description.method.MethodList r0 = r8.getDeclaredMethods()
            int r0 = r0.size()
            r2 = 1
            if (r0 != r2) goto L8f
            net.bytebuddy.description.method.MethodList r0 = r8.getDeclaredMethods()
            java.lang.String r3 = "value"
            net.bytebuddy.matcher.ElementMatcher$Junction r4 = net.bytebuddy.matcher.ElementMatchers.named(r3)
            net.bytebuddy.matcher.FilterableList r0 = r0.filter(r4)
            net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
            int r0 = r0.size()
            if (r0 != r2) goto L8f
            net.bytebuddy.description.method.MethodList r0 = r8.getDeclaredMethods()
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.named(r3)
            net.bytebuddy.matcher.FilterableList r0 = r0.filter(r2)
            net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
            java.lang.Object r0 = r0.getOnly()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
            net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getReturnType()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L8f
            net.bytebuddy.description.method.MethodList r0 = r8.getDeclaredMethods()
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.named(r3)
            net.bytebuddy.matcher.FilterableList r0 = r0.filter(r2)
            net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
            java.lang.Object r0 = r0.getOnly()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
            net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getReturnType()
            net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getComponentType()
            net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L8f
            net.bytebuddy.build.RepeatedAnnotationPlugin$RepeatedAnnotationAppender r7 = new net.bytebuddy.build.RepeatedAnnotationPlugin$RepeatedAnnotationAppender
            r7.<init>(r8)
            net.bytebuddy.dynamic.DynamicType$Builder r6 = r6.attribute(r7)
            return r6
        L8f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            r7.append(r8)
            java.lang.String r8 = " to declare exactly one property named value of an array type"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        La9:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            r7.append(r8)
            java.lang.String r8 = " to be an annotation type"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    @Override // net.bytebuddy.build.Plugin.ForElementMatcher
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

    @Override // net.bytebuddy.build.Plugin.ForElementMatcher
    public int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }
}
