package net.bytebuddy.implementation.bind.annotation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface AllArguments {

    public enum Assignment extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.AllArguments.Assignment> {
        private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.AllArguments.Assignment[] $VALUES = null;
        public static final net.bytebuddy.implementation.bind.annotation.AllArguments.Assignment SLACK = null;
        public static final net.bytebuddy.implementation.bind.annotation.AllArguments.Assignment STRICT = null;
        private final boolean strict;

        static {
                net.bytebuddy.implementation.bind.annotation.AllArguments$Assignment r0 = new net.bytebuddy.implementation.bind.annotation.AllArguments$Assignment
                java.lang.String r1 = "STRICT"
                r2 = 0
                r3 = 1
                r0.<init>(r1, r2, r3)
                net.bytebuddy.implementation.bind.annotation.AllArguments.Assignment.STRICT = r0
                net.bytebuddy.implementation.bind.annotation.AllArguments$Assignment r1 = new net.bytebuddy.implementation.bind.annotation.AllArguments$Assignment
                java.lang.String r4 = "SLACK"
                r1.<init>(r4, r3, r2)
                net.bytebuddy.implementation.bind.annotation.AllArguments.Assignment.SLACK = r1
                net.bytebuddy.implementation.bind.annotation.AllArguments$Assignment[] r0 = new net.bytebuddy.implementation.bind.annotation.AllArguments.Assignment[]{r0, r1}
                net.bytebuddy.implementation.bind.annotation.AllArguments.Assignment.$VALUES = r0
                return
        }

        Assignment(java.lang.String r1, int r2, boolean r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.strict = r3
                return
        }

        public static net.bytebuddy.implementation.bind.annotation.AllArguments.Assignment valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.AllArguments$Assignment> r0 = net.bytebuddy.implementation.bind.annotation.AllArguments.Assignment.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bind.annotation.AllArguments$Assignment r1 = (net.bytebuddy.implementation.bind.annotation.AllArguments.Assignment) r1
                return r1
        }

        public static net.bytebuddy.implementation.bind.annotation.AllArguments.Assignment[] values() {
                net.bytebuddy.implementation.bind.annotation.AllArguments$Assignment[] r0 = net.bytebuddy.implementation.bind.annotation.AllArguments.Assignment.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bind.annotation.AllArguments$Assignment[] r0 = (net.bytebuddy.implementation.bind.annotation.AllArguments.Assignment[]) r0
                return r0
        }

        public boolean isStrict() {
                r1 = this;
                boolean r0 = r1.strict
                return r0
        }
    }

    public enum Binder extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.AllArguments.Binder> implements net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.AllArguments> {
        private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.AllArguments.Binder[] $VALUES = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape INCLUDE_SELF = null;
        public static final net.bytebuddy.implementation.bind.annotation.AllArguments.Binder INSTANCE = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape NULL_IF_EMPTY = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape VALUE = null;

        static {
                net.bytebuddy.implementation.bind.annotation.AllArguments$Binder r0 = new net.bytebuddy.implementation.bind.annotation.AllArguments$Binder
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.bind.annotation.AllArguments.Binder.INSTANCE = r0
                net.bytebuddy.implementation.bind.annotation.AllArguments$Binder[] r0 = new net.bytebuddy.implementation.bind.annotation.AllArguments.Binder[]{r0}
                net.bytebuddy.implementation.bind.annotation.AllArguments.Binder.$VALUES = r0
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.AllArguments> r0 = net.bytebuddy.implementation.bind.annotation.AllArguments.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                java.lang.String r1 = "value"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bind.annotation.AllArguments.Binder.VALUE = r1
                java.lang.String r1 = "includeSelf"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bind.annotation.AllArguments.Binder.INCLUDE_SELF = r1
                java.lang.String r1 = "nullIfEmpty"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                net.bytebuddy.implementation.bind.annotation.AllArguments.Binder.NULL_IF_EMPTY = r0
                return
        }

        Binder(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.bind.annotation.AllArguments.Binder valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.AllArguments$Binder> r0 = net.bytebuddy.implementation.bind.annotation.AllArguments.Binder.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bind.annotation.AllArguments$Binder r1 = (net.bytebuddy.implementation.bind.annotation.AllArguments.Binder) r1
                return r1
        }

        public static net.bytebuddy.implementation.bind.annotation.AllArguments.Binder[] values() {
                net.bytebuddy.implementation.bind.annotation.AllArguments$Binder[] r0 = net.bytebuddy.implementation.bind.annotation.AllArguments.Binder.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bind.annotation.AllArguments$Binder[] r0 = (net.bytebuddy.implementation.bind.annotation.AllArguments.Binder[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.AllArguments> r9, net.bytebuddy.description.method.MethodDescription r10, net.bytebuddy.description.method.ParameterDescription r11, net.bytebuddy.implementation.Implementation.Target r12, net.bytebuddy.implementation.bytecode.assign.Assigner r13, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r14) {
                r8 = this;
                r0 = 1
                r1 = 0
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r11.getType()
                java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
                boolean r2 = r2.represents(r3)
                if (r2 == 0) goto L13
                net.bytebuddy.description.type.TypeDescription$Generic r11 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r3)
                goto L25
            L13:
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r11.getType()
                boolean r2 = r2.isArray()
                if (r2 == 0) goto L10c
                net.bytebuddy.description.type.TypeDescription$Generic r11 = r11.getType()
                net.bytebuddy.description.type.TypeDescription$Generic r11 = r11.getComponentType()
            L25:
                boolean r2 = r10.isStatic()
                java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
                if (r2 != 0) goto L41
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = net.bytebuddy.implementation.bind.annotation.AllArguments.Binder.INCLUDE_SELF
                net.bytebuddy.description.annotation.AnnotationValue r2 = r9.getValue(r2)
                java.lang.Object r2 = r2.resolve(r3)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L41
                r2 = r0
                goto L42
            L41:
                r2 = r1
            L42:
                if (r2 != 0) goto L68
                net.bytebuddy.description.method.ParameterList r4 = r10.getParameters()
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L68
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = net.bytebuddy.implementation.bind.annotation.AllArguments.Binder.NULL_IF_EMPTY
                net.bytebuddy.description.annotation.AnnotationValue r4 = r9.getValue(r4)
                java.lang.Object r3 = r4.resolve(r3)
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto L68
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r9 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.implementation.bytecode.constant.NullConstant r10 = net.bytebuddy.implementation.bytecode.constant.NullConstant.INSTANCE
                r9.<init>(r10)
                return r9
            L68:
                java.util.ArrayList r3 = new java.util.ArrayList
                net.bytebuddy.description.method.ParameterList r4 = r10.getParameters()
                int r4 = r4.size()
                int r4 = r4 + r2
                r3.<init>(r4)
                boolean r4 = r10.isStatic()
                if (r4 != 0) goto L81
                if (r2 == 0) goto L7f
                goto L81
            L7f:
                r4 = r0
                goto L82
            L81:
                r4 = r1
            L82:
                if (r2 == 0) goto L99
                net.bytebuddy.description.type.TypeDescription r12 = r12.getInstrumentedType()
                net.bytebuddy.description.type.TypeDescription$Generic r12 = r12.asGenericType()
                net.bytebuddy.description.method.ParameterList r10 = r10.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r10 = r10.asTypeList()
                java.util.List r10 = net.bytebuddy.utility.CompoundList.of(r12, r10)
                goto La1
            L99:
                net.bytebuddy.description.method.ParameterList r10 = r10.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r10 = r10.asTypeList()
            La1:
                java.util.Iterator r10 = r10.iterator()
            La5:
                boolean r12 = r10.hasNext()
                if (r12 == 0) goto Lfe
                java.lang.Object r12 = r10.next()
                net.bytebuddy.description.type.TypeDescription$Generic r12 = (net.bytebuddy.description.type.TypeDescription.Generic) r12
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r2 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r5 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.of(r12)
                net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.loadFrom(r4)
                net.bytebuddy.implementation.bytecode.StackManipulation r6 = r13.assign(r12, r11, r14)
                r7 = 2
                net.bytebuddy.implementation.bytecode.StackManipulation[] r7 = new net.bytebuddy.implementation.bytecode.StackManipulation[r7]
                r7[r1] = r5
                r7[r0] = r6
                r2.<init>(r7)
                boolean r5 = r2.isValid()
                if (r5 == 0) goto Ld3
                r3.add(r2)
                goto Lf4
            Ld3:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = net.bytebuddy.implementation.bind.annotation.AllArguments.Binder.VALUE
                net.bytebuddy.description.annotation.AnnotationValue r2 = r9.getValue(r2)
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.AllArguments> r5 = net.bytebuddy.implementation.bind.annotation.AllArguments.class
                java.lang.ClassLoader r5 = r5.getClassLoader()
                net.bytebuddy.description.annotation.AnnotationValue$Loaded r2 = r2.load(r5)
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.AllArguments$Assignment> r5 = net.bytebuddy.implementation.bind.annotation.AllArguments.Assignment.class
                java.lang.Object r2 = r2.resolve(r5)
                net.bytebuddy.implementation.bind.annotation.AllArguments$Assignment r2 = (net.bytebuddy.implementation.bind.annotation.AllArguments.Assignment) r2
                boolean r2 = r2.isStrict()
                if (r2 == 0) goto Lf4
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal r9 = net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE
                return r9
            Lf4:
                net.bytebuddy.implementation.bytecode.StackSize r12 = r12.getStackSize()
                int r12 = r12.getSize()
                int r4 = r4 + r12
                goto La5
            Lfe:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r9 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.implementation.bytecode.collection.ArrayFactory r10 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.forType(r11)
                net.bytebuddy.implementation.bytecode.StackManipulation r10 = r10.withValues(r3)
                r9.<init>(r10)
                return r9
            L10c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "Expected an array type for all argument annotation on "
                r11.append(r12)
                r11.append(r10)
                java.lang.String r10 = r11.toString()
                r9.<init>(r10)
                throw r9
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public java.lang.Class<net.bytebuddy.implementation.bind.annotation.AllArguments> getHandledType() {
                r1 = this;
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.AllArguments> r0 = net.bytebuddy.implementation.bind.annotation.AllArguments.class
                return r0
        }
    }

    boolean includeSelf() default false;

    boolean nullIfEmpty() default false;

    net.bytebuddy.implementation.bind.annotation.AllArguments.Assignment value() default net.bytebuddy.implementation.bind.annotation.AllArguments.Assignment.STRICT;
}
