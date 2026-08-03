package net.bytebuddy.build;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class DispatcherAnnotationPlugin extends net.bytebuddy.build.Plugin.ForElementMatcher implements net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory, net.bytebuddy.implementation.attribute.MethodAttributeAppender {
    public DispatcherAnnotationPlugin() {
            r1 = this;
            java.lang.Class<net.bytebuddy.utility.dispatcher.JavaDispatcher$Proxied> r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied.class
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isAnnotatedWith(r0)
            r1.<init>(r0)
            return
    }

    @Override // net.bytebuddy.build.Plugin
    public net.bytebuddy.dynamic.DynamicType.Builder<?> apply(net.bytebuddy.dynamic.DynamicType.Builder<?> r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.dynamic.ClassFileLocator r4) {
            r1 = this;
            net.bytebuddy.asm.MemberAttributeExtension$ForMethod r3 = new net.bytebuddy.asm.MemberAttributeExtension$ForMethod
            r3.<init>()
            net.bytebuddy.asm.MemberAttributeExtension$ForMethod r3 = r3.attribute(r1)
            java.lang.Class<net.bytebuddy.utility.dispatcher.JavaDispatcher$Proxied> r4 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied.class
            net.bytebuddy.matcher.ElementMatcher$Junction r4 = net.bytebuddy.matcher.ElementMatchers.isAnnotatedWith(r4)
            net.bytebuddy.matcher.ElementMatcher$Junction r4 = net.bytebuddy.matcher.ElementMatchers.not(r4)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isAbstract()
            net.bytebuddy.matcher.ElementMatcher$Junction r4 = r4.and(r0)
            net.bytebuddy.asm.AsmVisitorWrapper r3 = r3.on(r4)
            net.bytebuddy.dynamic.DynamicType$Builder r2 = r2.visit(r3)
            return r2
    }

    @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender
    public void apply(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.implementation.attribute.AnnotationValueFilter r4) {
            r1 = this;
            java.lang.Class<net.bytebuddy.utility.dispatcher.JavaDispatcher$Proxied> r4 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied.class
            java.lang.String r4 = net.bytebuddy.jar.asm.Type.getDescriptor(r4)
            r0 = 1
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = r2.visitAnnotation(r4, r0)
            if (r2 == 0) goto L19
            java.lang.String r4 = "value"
            java.lang.String r3 = r3.getName()
            r2.visit(r4, r3)
            r2.visitEnd()
        L19:
            return
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

    @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory
    public net.bytebuddy.implementation.attribute.MethodAttributeAppender make(net.bytebuddy.description.type.TypeDescription r1) {
            r0 = this;
            return r0
    }
}
