package net.bytebuddy.implementation.bind.annotation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Empty {

    public enum Binder extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.Empty.Binder> implements net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.Empty> {
        private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.Empty.Binder[] $VALUES = null;
        public static final net.bytebuddy.implementation.bind.annotation.Empty.Binder INSTANCE = null;

        static {
                net.bytebuddy.implementation.bind.annotation.Empty$Binder r0 = new net.bytebuddy.implementation.bind.annotation.Empty$Binder
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.bind.annotation.Empty.Binder.INSTANCE = r0
                net.bytebuddy.implementation.bind.annotation.Empty$Binder[] r0 = new net.bytebuddy.implementation.bind.annotation.Empty.Binder[]{r0}
                net.bytebuddy.implementation.bind.annotation.Empty.Binder.$VALUES = r0
                return
        }

        Binder(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.bind.annotation.Empty.Binder valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.Empty$Binder> r0 = net.bytebuddy.implementation.bind.annotation.Empty.Binder.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bind.annotation.Empty$Binder r1 = (net.bytebuddy.implementation.bind.annotation.Empty.Binder) r1
                return r1
        }

        public static net.bytebuddy.implementation.bind.annotation.Empty.Binder[] values() {
                net.bytebuddy.implementation.bind.annotation.Empty$Binder[] r0 = net.bytebuddy.implementation.bind.annotation.Empty.Binder.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bind.annotation.Empty$Binder[] r0 = (net.bytebuddy.implementation.bind.annotation.Empty.Binder[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.Empty> r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.method.ParameterDescription r3, net.bytebuddy.implementation.Implementation.Target r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r6) {
                r0 = this;
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r1 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r3.getType()
                net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.constant.DefaultValue.of(r2)
                r1.<init>(r2)
                return r1
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public java.lang.Class<net.bytebuddy.implementation.bind.annotation.Empty> getHandledType() {
                r1 = this;
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.Empty> r0 = net.bytebuddy.implementation.bind.annotation.Empty.class
                return r0
        }
    }
}
