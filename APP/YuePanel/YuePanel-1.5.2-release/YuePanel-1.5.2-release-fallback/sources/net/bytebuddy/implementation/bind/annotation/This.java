package net.bytebuddy.implementation.bind.annotation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface This {

    public enum Binder extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.This.Binder> implements net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.This> {
        private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.This.Binder[] $VALUES = null;
        public static final net.bytebuddy.implementation.bind.annotation.This.Binder INSTANCE = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape OPTIONAL = null;

        static {
                net.bytebuddy.implementation.bind.annotation.This$Binder r0 = new net.bytebuddy.implementation.bind.annotation.This$Binder
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.bind.annotation.This.Binder.INSTANCE = r0
                net.bytebuddy.implementation.bind.annotation.This$Binder[] r0 = new net.bytebuddy.implementation.bind.annotation.This.Binder[]{r0}
                net.bytebuddy.implementation.bind.annotation.This.Binder.$VALUES = r0
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.This> r0 = net.bytebuddy.implementation.bind.annotation.This.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                java.lang.String r1 = "optional"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                net.bytebuddy.implementation.bind.annotation.This.Binder.OPTIONAL = r0
                return
        }

        Binder(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.bind.annotation.This.Binder valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.This$Binder> r0 = net.bytebuddy.implementation.bind.annotation.This.Binder.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bind.annotation.This$Binder r1 = (net.bytebuddy.implementation.bind.annotation.This.Binder) r1
                return r1
        }

        public static net.bytebuddy.implementation.bind.annotation.This.Binder[] values() {
                net.bytebuddy.implementation.bind.annotation.This$Binder[] r0 = net.bytebuddy.implementation.bind.annotation.This.Binder.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bind.annotation.This$Binder[] r0 = (net.bytebuddy.implementation.bind.annotation.This.Binder[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.This> r2, net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.description.method.ParameterDescription r4, net.bytebuddy.implementation.Implementation.Target r5, net.bytebuddy.implementation.bytecode.assign.Assigner r6, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r7) {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r4.getType()
                boolean r0 = r0.isPrimitive()
                if (r0 != 0) goto L79
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r4.getType()
                boolean r0 = r0.isArray()
                if (r0 != 0) goto L62
                boolean r0 = r3.isStatic()
                if (r0 == 0) goto L31
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bind.annotation.This.Binder.OPTIONAL
                net.bytebuddy.description.annotation.AnnotationValue r2 = r2.getValue(r0)
                java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
                java.lang.Object r2 = r2.resolve(r0)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L31
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal r2 = net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE
                return r2
            L31:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r2 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                boolean r3 = r3.isStatic()
                if (r3 == 0) goto L3c
                net.bytebuddy.implementation.bytecode.constant.NullConstant r3 = net.bytebuddy.implementation.bytecode.constant.NullConstant.INSTANCE
                goto L5e
            L3c:
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r3 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                net.bytebuddy.description.type.TypeDescription r5 = r5.getInstrumentedType()
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.asGenericType()
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.getType()
                net.bytebuddy.implementation.bytecode.StackManipulation r4 = r6.assign(r5, r4, r7)
                r5 = 2
                net.bytebuddy.implementation.bytecode.StackManipulation[] r5 = new net.bytebuddy.implementation.bytecode.StackManipulation[r5]
                r6 = 0
                r5[r6] = r0
                r6 = 1
                r5[r6] = r4
                r3.<init>(r5)
            L5e:
                r2.<init>(r3)
                return r2
            L62:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r4)
                java.lang.String r4 = " uses an array type with a @This annotation"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L79:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r4)
                java.lang.String r4 = " uses a primitive type with a @This annotation"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public java.lang.Class<net.bytebuddy.implementation.bind.annotation.This> getHandledType() {
                r1 = this;
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.This> r0 = net.bytebuddy.implementation.bind.annotation.This.class
                return r0
        }
    }

    boolean optional() default false;
}
