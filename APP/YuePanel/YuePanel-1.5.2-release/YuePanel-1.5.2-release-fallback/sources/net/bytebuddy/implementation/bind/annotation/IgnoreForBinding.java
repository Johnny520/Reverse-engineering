package net.bytebuddy.implementation.bind.annotation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface IgnoreForBinding {

    public static final class Verifier {
        private Verifier() {
                r1 = this;
                r1.<init>()
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        public static boolean check(net.bytebuddy.description.method.MethodDescription r1) {
                net.bytebuddy.description.annotation.AnnotationList r1 = r1.getDeclaredAnnotations()
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.IgnoreForBinding> r0 = net.bytebuddy.implementation.bind.annotation.IgnoreForBinding.class
                boolean r1 = r1.isAnnotationPresent(r0)
                return r1
        }
    }
}
