package net.bytebuddy.implementation.bind.annotation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface BindingPriority {
    public static final int DEFAULT = 1;

    public enum Resolver extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.BindingPriority.Resolver> implements net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver {
        private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.BindingPriority.Resolver[] $VALUES = null;
        public static final net.bytebuddy.implementation.bind.annotation.BindingPriority.Resolver INSTANCE = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape VALUE = null;

        static {
                net.bytebuddy.implementation.bind.annotation.BindingPriority$Resolver r0 = new net.bytebuddy.implementation.bind.annotation.BindingPriority$Resolver
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.bind.annotation.BindingPriority.Resolver.INSTANCE = r0
                net.bytebuddy.implementation.bind.annotation.BindingPriority$Resolver[] r0 = new net.bytebuddy.implementation.bind.annotation.BindingPriority.Resolver[]{r0}
                net.bytebuddy.implementation.bind.annotation.BindingPriority.Resolver.$VALUES = r0
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.BindingPriority> r0 = net.bytebuddy.implementation.bind.annotation.BindingPriority.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                java.lang.String r1 = "value"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                net.bytebuddy.implementation.bind.annotation.BindingPriority.Resolver.VALUE = r0
                return
        }

        Resolver(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private static int resolve(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.BindingPriority> r1) {
                if (r1 != 0) goto L4
                r1 = 1
                goto L16
            L4:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bind.annotation.BindingPriority.Resolver.VALUE
                net.bytebuddy.description.annotation.AnnotationValue r1 = r1.getValue(r0)
                java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
                java.lang.Object r1 = r1.resolve(r0)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
            L16:
                return r1
        }

        public static net.bytebuddy.implementation.bind.annotation.BindingPriority.Resolver valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.BindingPriority$Resolver> r0 = net.bytebuddy.implementation.bind.annotation.BindingPriority.Resolver.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bind.annotation.BindingPriority$Resolver r1 = (net.bytebuddy.implementation.bind.annotation.BindingPriority.Resolver) r1
                return r1
        }

        public static net.bytebuddy.implementation.bind.annotation.BindingPriority.Resolver[] values() {
                net.bytebuddy.implementation.bind.annotation.BindingPriority$Resolver[] r0 = net.bytebuddy.implementation.bind.annotation.BindingPriority.Resolver.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bind.annotation.BindingPriority$Resolver[] r0 = (net.bytebuddy.implementation.bind.annotation.BindingPriority.Resolver[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
        public net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution resolve(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding r2, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding r3) {
                r0 = this;
                net.bytebuddy.description.method.MethodDescription r1 = r2.getTarget()
                net.bytebuddy.description.annotation.AnnotationList r1 = r1.getDeclaredAnnotations()
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.BindingPriority> r2 = net.bytebuddy.implementation.bind.annotation.BindingPriority.class
                net.bytebuddy.description.annotation.AnnotationDescription$Loadable r1 = r1.ofType(r2)
                int r1 = resolve(r1)
                net.bytebuddy.description.method.MethodDescription r3 = r3.getTarget()
                net.bytebuddy.description.annotation.AnnotationList r3 = r3.getDeclaredAnnotations()
                net.bytebuddy.description.annotation.AnnotationDescription$Loadable r2 = r3.ofType(r2)
                int r2 = resolve(r2)
                if (r1 != r2) goto L27
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.AMBIGUOUS
                return r1
            L27:
                if (r1 >= r2) goto L2c
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.RIGHT
                return r1
            L2c:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.LEFT
                return r1
        }
    }

    int value();
}
