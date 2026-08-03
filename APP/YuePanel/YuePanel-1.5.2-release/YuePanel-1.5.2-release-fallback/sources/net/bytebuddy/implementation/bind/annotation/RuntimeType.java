package net.bytebuddy.implementation.bind.annotation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface RuntimeType {

    public static final class Verifier {
        private Verifier() {
                r1 = this;
                r1.<init>()
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        public static net.bytebuddy.implementation.bytecode.assign.Assigner.Typing check(net.bytebuddy.description.annotation.AnnotationSource r1) {
                net.bytebuddy.description.annotation.AnnotationList r1 = r1.getDeclaredAnnotations()
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.RuntimeType> r0 = net.bytebuddy.implementation.bind.annotation.RuntimeType.class
                boolean r1 = r1.isAnnotationPresent(r0)
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.of(r1)
                return r1
        }
    }
}
