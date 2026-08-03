package net.bytebuddy.implementation.bind.annotation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface StubValue {

    public enum Binder extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.StubValue.Binder> implements net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.StubValue> {
        private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.StubValue.Binder[] $VALUES = null;
        public static final net.bytebuddy.implementation.bind.annotation.StubValue.Binder INSTANCE = null;

        static {
                net.bytebuddy.implementation.bind.annotation.StubValue$Binder r0 = new net.bytebuddy.implementation.bind.annotation.StubValue$Binder
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.bind.annotation.StubValue.Binder.INSTANCE = r0
                net.bytebuddy.implementation.bind.annotation.StubValue$Binder[] r0 = new net.bytebuddy.implementation.bind.annotation.StubValue.Binder[]{r0}
                net.bytebuddy.implementation.bind.annotation.StubValue.Binder.$VALUES = r0
                return
        }

        Binder(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.bind.annotation.StubValue.Binder valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.StubValue$Binder> r0 = net.bytebuddy.implementation.bind.annotation.StubValue.Binder.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bind.annotation.StubValue$Binder r1 = (net.bytebuddy.implementation.bind.annotation.StubValue.Binder) r1
                return r1
        }

        public static net.bytebuddy.implementation.bind.annotation.StubValue.Binder[] values() {
                net.bytebuddy.implementation.bind.annotation.StubValue$Binder[] r0 = net.bytebuddy.implementation.bind.annotation.StubValue.Binder.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bind.annotation.StubValue$Binder[] r0 = (net.bytebuddy.implementation.bind.annotation.StubValue.Binder[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.StubValue> r2, net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.description.method.ParameterDescription r4, net.bytebuddy.implementation.Implementation.Target r5, net.bytebuddy.implementation.bytecode.assign.Assigner r6, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r7) {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.getType()
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                boolean r2 = r2.represents(r5)
                if (r2 == 0) goto L48
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r2 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r3.getReturnType()
                java.lang.Class r0 = java.lang.Void.TYPE
                boolean r4 = r4.represents(r0)
                if (r4 == 0) goto L1d
                net.bytebuddy.implementation.bytecode.constant.NullConstant r3 = net.bytebuddy.implementation.bytecode.constant.NullConstant.INSTANCE
                goto L44
            L1d:
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r4 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.getReturnType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = net.bytebuddy.implementation.bytecode.constant.DefaultValue.of(r0)
                net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getReturnType()
                net.bytebuddy.description.type.TypeDescription$Generic r5 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r5)
                net.bytebuddy.implementation.bytecode.StackManipulation r3 = r6.assign(r3, r5, r7)
                r5 = 2
                net.bytebuddy.implementation.bytecode.StackManipulation[] r5 = new net.bytebuddy.implementation.bytecode.StackManipulation[r5]
                r6 = 0
                r5[r6] = r0
                r6 = 1
                r5[r6] = r3
                r4.<init>(r5)
                r3 = r4
            L44:
                r2.<init>(r3)
                return r2
            L48:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r4)
                java.lang.String r4 = " uses StubValue annotation on non-Object type"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public java.lang.Class<net.bytebuddy.implementation.bind.annotation.StubValue> getHandledType() {
                r1 = this;
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.StubValue> r0 = net.bytebuddy.implementation.bind.annotation.StubValue.class
                return r0
        }
    }
}
