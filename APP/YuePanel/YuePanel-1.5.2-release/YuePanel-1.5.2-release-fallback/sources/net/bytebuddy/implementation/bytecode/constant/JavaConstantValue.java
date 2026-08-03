package net.bytebuddy.implementation.bytecode.constant;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class JavaConstantValue extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
    private final net.bytebuddy.utility.JavaConstant constant;

    public enum Visitor extends java.lang.Enum<net.bytebuddy.implementation.bytecode.constant.JavaConstantValue.Visitor> implements net.bytebuddy.utility.JavaConstant.Visitor<java.lang.Object> {
        private static final /* synthetic */ net.bytebuddy.implementation.bytecode.constant.JavaConstantValue.Visitor[] $VALUES = null;
        public static final net.bytebuddy.implementation.bytecode.constant.JavaConstantValue.Visitor INSTANCE = null;

        static {
                net.bytebuddy.implementation.bytecode.constant.JavaConstantValue$Visitor r0 = new net.bytebuddy.implementation.bytecode.constant.JavaConstantValue$Visitor
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.bytecode.constant.JavaConstantValue.Visitor.INSTANCE = r0
                net.bytebuddy.implementation.bytecode.constant.JavaConstantValue$Visitor[] r0 = new net.bytebuddy.implementation.bytecode.constant.JavaConstantValue.Visitor[]{r0}
                net.bytebuddy.implementation.bytecode.constant.JavaConstantValue.Visitor.$VALUES = r0
                return
        }

        Visitor(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.bytecode.constant.JavaConstantValue.Visitor valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bytecode.constant.JavaConstantValue$Visitor> r0 = net.bytebuddy.implementation.bytecode.constant.JavaConstantValue.Visitor.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bytecode.constant.JavaConstantValue$Visitor r1 = (net.bytebuddy.implementation.bytecode.constant.JavaConstantValue.Visitor) r1
                return r1
        }

        public static net.bytebuddy.implementation.bytecode.constant.JavaConstantValue.Visitor[] values() {
                net.bytebuddy.implementation.bytecode.constant.JavaConstantValue$Visitor[] r0 = net.bytebuddy.implementation.bytecode.constant.JavaConstantValue.Visitor.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bytecode.constant.JavaConstantValue$Visitor[] r0 = (net.bytebuddy.implementation.bytecode.constant.JavaConstantValue.Visitor[]) r0
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.bytebuddy.utility.JavaConstant.Visitor
        public /* bridge */ /* synthetic */ java.lang.Object onDynamic(net.bytebuddy.utility.JavaConstant.Dynamic r1) {
                r0 = this;
                net.bytebuddy.jar.asm.ConstantDynamic r1 = r0.onDynamic(r1)
                return r1
        }

        @Override // net.bytebuddy.utility.JavaConstant.Visitor
        public java.lang.Object onDynamic(net.bytebuddy.utility.JavaConstant.Dynamic r5) {
                r4 = this;
                java.util.List r0 = r5.getArguments()
                int r0 = r0.size()
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r2 = 0
            Lb:
                if (r2 >= r0) goto L20
                java.util.List r3 = r5.getArguments()
                java.lang.Object r3 = r3.get(r2)
                net.bytebuddy.utility.JavaConstant r3 = (net.bytebuddy.utility.JavaConstant) r3
                java.lang.Object r3 = r3.accept(r4)
                r1[r2] = r3
                int r2 = r2 + 1
                goto Lb
            L20:
                net.bytebuddy.jar.asm.ConstantDynamic r0 = new net.bytebuddy.jar.asm.ConstantDynamic
                java.lang.String r2 = r5.getName()
                net.bytebuddy.description.type.TypeDescription r3 = r5.getTypeDescription()
                java.lang.String r3 = r3.getDescriptor()
                net.bytebuddy.utility.JavaConstant$MethodHandle r5 = r5.getBootstrap()
                net.bytebuddy.jar.asm.Handle r5 = r4.onMethodHandle(r5)
                r0.<init>(r2, r3, r5, r1)
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.bytebuddy.utility.JavaConstant.Visitor
        public /* bridge */ /* synthetic */ java.lang.Object onMethodHandle(net.bytebuddy.utility.JavaConstant.MethodHandle r1) {
                r0 = this;
                net.bytebuddy.jar.asm.Handle r1 = r0.onMethodHandle(r1)
                return r1
        }

        @Override // net.bytebuddy.utility.JavaConstant.Visitor
        public java.lang.Object onMethodHandle(net.bytebuddy.utility.JavaConstant.MethodHandle r8) {
                r7 = this;
                net.bytebuddy.jar.asm.Handle r6 = new net.bytebuddy.jar.asm.Handle
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r0 = r8.getHandleType()
                int r1 = r0.getIdentifier()
                net.bytebuddy.description.type.TypeDescription r0 = r8.getOwnerType()
                java.lang.String r2 = r0.getInternalName()
                java.lang.String r3 = r8.getName()
                java.lang.String r4 = r8.getDescriptor()
                net.bytebuddy.description.type.TypeDescription r8 = r8.getOwnerType()
                boolean r5 = r8.isInterface()
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.bytebuddy.utility.JavaConstant.Visitor
        public /* bridge */ /* synthetic */ java.lang.Object onMethodType(net.bytebuddy.utility.JavaConstant.MethodType r1) {
                r0 = this;
                net.bytebuddy.jar.asm.Type r1 = r0.onMethodType(r1)
                return r1
        }

        @Override // net.bytebuddy.utility.JavaConstant.Visitor
        public java.lang.Object onMethodType(net.bytebuddy.utility.JavaConstant.MethodType r4) {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 40
                r0.append(r1)
                net.bytebuddy.description.type.TypeList r1 = r4.getParameterTypes()
                java.util.Iterator r1 = r1.iterator()
            L12:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L26
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.type.TypeDescription r2 = (net.bytebuddy.description.type.TypeDescription) r2
                java.lang.String r2 = r2.getDescriptor()
                r0.append(r2)
                goto L12
            L26:
                r1 = 41
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r4 = r4.getReturnType()
                java.lang.String r4 = r4.getDescriptor()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                net.bytebuddy.jar.asm.Type r4 = net.bytebuddy.jar.asm.Type.getMethodType(r4)
                return r4
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.bytebuddy.utility.JavaConstant.Visitor
        public /* bridge */ /* synthetic */ java.lang.Object onType(net.bytebuddy.utility.JavaConstant.Simple r1) {
                r0 = this;
                net.bytebuddy.jar.asm.Type r1 = r0.onType(r1)
                return r1
        }

        @Override // net.bytebuddy.utility.JavaConstant.Visitor
        public java.lang.Object onType(net.bytebuddy.utility.JavaConstant.Simple<net.bytebuddy.description.type.TypeDescription> r1) {
                r0 = this;
                java.lang.Object r1 = r1.getValue()
                net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
                java.lang.String r1 = r1.getDescriptor()
                net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r1)
                return r1
        }

        @Override // net.bytebuddy.utility.JavaConstant.Visitor
        public java.lang.Object onValue(net.bytebuddy.utility.JavaConstant.Simple<?> r1) {
                r0 = this;
                java.lang.Object r1 = r1.getValue()
                return r1
        }
    }

    public JavaConstantValue(net.bytebuddy.utility.JavaConstant r1) {
            r0 = this;
            r0.<init>()
            r0.constant = r1
            return
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
            r1 = this;
            net.bytebuddy.utility.JavaConstant r3 = r1.constant
            net.bytebuddy.implementation.bytecode.constant.JavaConstantValue$Visitor r0 = net.bytebuddy.implementation.bytecode.constant.JavaConstantValue.Visitor.INSTANCE
            java.lang.Object r3 = r3.accept(r0)
            r2.visitLdcInsn(r3)
            net.bytebuddy.utility.JavaConstant r2 = r1.constant
            net.bytebuddy.description.type.TypeDescription r2 = r2.getTypeDescription()
            net.bytebuddy.implementation.bytecode.StackSize r2 = r2.getStackSize()
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = r2.toIncreasingSize()
            return r2
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
            net.bytebuddy.utility.JavaConstant r2 = r4.constant
            net.bytebuddy.implementation.bytecode.constant.JavaConstantValue r5 = (net.bytebuddy.implementation.bytecode.constant.JavaConstantValue) r5
            net.bytebuddy.utility.JavaConstant r5 = r5.constant
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
            net.bytebuddy.utility.JavaConstant r1 = r2.constant
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }
}
