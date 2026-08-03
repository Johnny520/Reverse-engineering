package net.bytebuddy.implementation.bytecode.member;

/* JADX INFO: loaded from: classes2.dex */
public enum MethodInvocation extends java.lang.Enum<net.bytebuddy.implementation.bytecode.member.MethodInvocation> {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.member.MethodInvocation[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.member.MethodInvocation INTERFACE = null;
    public static final net.bytebuddy.implementation.bytecode.member.MethodInvocation INTERFACE_PRIVATE = null;
    public static final net.bytebuddy.implementation.bytecode.member.MethodInvocation SPECIAL = null;
    public static final net.bytebuddy.implementation.bytecode.member.MethodInvocation SPECIAL_CONSTRUCTOR = null;
    public static final net.bytebuddy.implementation.bytecode.member.MethodInvocation STATIC = null;
    public static final net.bytebuddy.implementation.bytecode.member.MethodInvocation VIRTUAL = null;
    public static final net.bytebuddy.implementation.bytecode.member.MethodInvocation VIRTUAL_PRIVATE = null;
    private final int handle;
    private final int legacyHandle;
    private final int legacyOpcode;
    private final int opcode;

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
    public class DynamicInvocation extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
        private final java.util.List<? extends net.bytebuddy.utility.JavaConstant> arguments;
        private final net.bytebuddy.description.method.MethodDescription.InDefinedShape bootstrapMethod;
        private final java.lang.String methodName;
        private final java.util.List<? extends net.bytebuddy.description.type.TypeDescription> parameterTypes;
        private final net.bytebuddy.description.type.TypeDescription returnType;
        final /* synthetic */ net.bytebuddy.implementation.bytecode.member.MethodInvocation this$0;

        public DynamicInvocation(net.bytebuddy.implementation.bytecode.member.MethodInvocation r1, java.lang.String r2, net.bytebuddy.description.type.TypeDescription r3, java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r4, net.bytebuddy.description.method.MethodDescription.InDefinedShape r5, java.util.List<? extends net.bytebuddy.utility.JavaConstant> r6) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.methodName = r2
                r0.returnType = r3
                r0.parameterTypes = r4
                r0.bootstrapMethod = r5
                r0.arguments = r6
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r12, net.bytebuddy.implementation.Implementation.Context r13) {
                r11 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "("
                r0.<init>(r1)
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r11.parameterTypes
                java.util.Iterator r1 = r1.iterator()
            Ld:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L21
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.type.TypeDescription r2 = (net.bytebuddy.description.type.TypeDescription) r2
                java.lang.String r2 = r2.getDescriptor()
                r0.append(r2)
                goto Ld
            L21:
                r1 = 41
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r11.returnType
                java.lang.String r1 = r1.getDescriptor()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.util.List<? extends net.bytebuddy.utility.JavaConstant> r1 = r11.arguments
                int r1 = r1.size()
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2 = r11.arguments
                java.util.Iterator r2 = r2.iterator()
                r3 = 0
                r4 = r3
            L43:
                boolean r5 = r2.hasNext()
                if (r5 == 0) goto L5b
                java.lang.Object r5 = r2.next()
                net.bytebuddy.utility.JavaConstant r5 = (net.bytebuddy.utility.JavaConstant) r5
                int r6 = r4 + 1
                net.bytebuddy.implementation.bytecode.constant.JavaConstantValue$Visitor r7 = net.bytebuddy.implementation.bytecode.constant.JavaConstantValue.Visitor.INSTANCE
                java.lang.Object r5 = r5.accept(r7)
                r1[r4] = r5
                r4 = r6
                goto L43
            L5b:
                java.lang.String r2 = r11.methodName
                net.bytebuddy.jar.asm.Handle r10 = new net.bytebuddy.jar.asm.Handle
                net.bytebuddy.implementation.bytecode.member.MethodInvocation r4 = r11.this$0
                int r4 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.access$200(r4)
                net.bytebuddy.implementation.bytecode.member.MethodInvocation r5 = r11.this$0
                int r5 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.access$300(r5)
                if (r4 == r5) goto L82
                net.bytebuddy.ClassFileVersion r13 = r13.getClassFileVersion()
                net.bytebuddy.ClassFileVersion r4 = net.bytebuddy.ClassFileVersion.JAVA_V11
                boolean r13 = r13.isAtLeast(r4)
                if (r13 == 0) goto L7a
                goto L82
            L7a:
                net.bytebuddy.implementation.bytecode.member.MethodInvocation r13 = r11.this$0
                int r13 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.access$300(r13)
            L80:
                r5 = r13
                goto L89
            L82:
                net.bytebuddy.implementation.bytecode.member.MethodInvocation r13 = r11.this$0
                int r13 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.access$200(r13)
                goto L80
            L89:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r13 = r11.bootstrapMethod
                net.bytebuddy.description.type.TypeDescription r13 = r13.getDeclaringType()
                java.lang.String r6 = r13.getInternalName()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r13 = r11.bootstrapMethod
                java.lang.String r7 = r13.getInternalName()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r13 = r11.bootstrapMethod
                java.lang.String r8 = r13.getDescriptor()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r13 = r11.bootstrapMethod
                net.bytebuddy.description.type.TypeDescription r13 = r13.getDeclaringType()
                boolean r9 = r13.isInterface()
                r4 = r10
                r4.<init>(r5, r6, r7, r8, r9)
                r12.visitInvokeDynamicInsn(r2, r0, r10, r1)
                net.bytebuddy.description.type.TypeDescription r12 = r11.returnType
                net.bytebuddy.implementation.bytecode.StackSize r12 = r12.getStackSize()
                int r12 = r12.getSize()
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r13 = r11.parameterTypes
                int r13 = net.bytebuddy.implementation.bytecode.StackSize.of(r13)
                int r12 = r12 - r13
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r13 = new net.bytebuddy.implementation.bytecode.StackManipulation$Size
                int r0 = java.lang.Math.max(r12, r3)
                r13.<init>(r12, r0)
                return r13
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
                net.bytebuddy.implementation.bytecode.member.MethodInvocation r2 = r4.this$0
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$DynamicInvocation r5 = (net.bytebuddy.implementation.bytecode.member.MethodInvocation.DynamicInvocation) r5
                net.bytebuddy.implementation.bytecode.member.MethodInvocation r3 = r5.this$0
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                java.lang.String r2 = r4.methodName
                java.lang.String r3 = r5.methodName
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L2b
                return r1
            L2b:
                net.bytebuddy.description.type.TypeDescription r2 = r4.returnType
                net.bytebuddy.description.type.TypeDescription r3 = r5.returnType
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L36
                return r1
            L36:
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r2 = r4.parameterTypes
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r3 = r5.parameterTypes
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L41
                return r1
            L41:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.bootstrapMethod
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = r5.bootstrapMethod
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L4c
                return r1
            L4c:
                java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2 = r4.arguments
                java.util.List<? extends net.bytebuddy.utility.JavaConstant> r5 = r5.arguments
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L57
                return r1
            L57:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r2.methodName
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription r1 = r2.returnType
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r2.parameterTypes
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.bootstrapMethod
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<? extends net.bytebuddy.utility.JavaConstant> r1 = r2.arguments
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.bytecode.member.MethodInvocation r1 = r2.this$0
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class HandleInvocation extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
        private static final java.lang.String METHOD_HANDLE = "java/lang/invoke/MethodHandle";
        private final net.bytebuddy.description.method.MethodDescription.InDefinedShape methodDescription;
        private final net.bytebuddy.implementation.bytecode.member.MethodInvocation.HandleType type;

        public HandleInvocation(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.implementation.bytecode.member.MethodInvocation.HandleType r2) {
                r0 = this;
                r0.<init>()
                r0.methodDescription = r1
                r0.type = r2
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r8, net.bytebuddy.implementation.Implementation.Context r9) {
                r7 = this;
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$HandleType r9 = r7.type
                java.lang.String r3 = r9.getMethodName()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r9 = r7.methodDescription
                boolean r9 = r9.isStatic()
                r6 = 1
                if (r9 != 0) goto L42
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r9 = r7.methodDescription
                boolean r9 = r9.isConstructor()
                if (r9 == 0) goto L18
                goto L42
            L18:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r0 = "("
                r9.append(r0)
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r7.methodDescription
                net.bytebuddy.description.type.TypeDescription r0 = r0.getDeclaringType()
                java.lang.String r0 = r0.getDescriptor()
                r9.append(r0)
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r7.methodDescription
                java.lang.String r0 = r0.getDescriptor()
                java.lang.String r0 = r0.substring(r6)
                r9.append(r0)
                java.lang.String r9 = r9.toString()
            L40:
                r4 = r9
                goto L49
            L42:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r9 = r7.methodDescription
                java.lang.String r9 = r9.getDescriptor()
                goto L40
            L49:
                r5 = 0
                r1 = 182(0xb6, float:2.55E-43)
                java.lang.String r2 = "java/lang/invoke/MethodHandle"
                r0 = r8
                r0.visitMethodInsn(r1, r2, r3, r4, r5)
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r8 = r7.methodDescription
                int r8 = r8.getStackSize()
                int r8 = r8 + r6
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r9 = r7.methodDescription
                net.bytebuddy.description.type.TypeDescription$Generic r9 = r9.getReturnType()
                net.bytebuddy.implementation.bytecode.StackSize r9 = r9.getStackSize()
                int r9 = r9.getSize()
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Size
                int r9 = r9 - r8
                r8 = 0
                int r8 = java.lang.Math.max(r8, r9)
                r0.<init>(r9, r8)
                return r0
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
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$HandleType r2 = r4.type
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$HandleInvocation r5 = (net.bytebuddy.implementation.bytecode.member.MethodInvocation.HandleInvocation) r5
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$HandleType r3 = r5.type
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.methodDescription
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r5 = r5.methodDescription
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L2b
                return r1
            L2b:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.methodDescription
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$HandleType r1 = r2.type
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    public enum HandleType extends java.lang.Enum<net.bytebuddy.implementation.bytecode.member.MethodInvocation.HandleType> {
        private static final /* synthetic */ net.bytebuddy.implementation.bytecode.member.MethodInvocation.HandleType[] $VALUES = null;
        public static final net.bytebuddy.implementation.bytecode.member.MethodInvocation.HandleType EXACT = null;
        public static final net.bytebuddy.implementation.bytecode.member.MethodInvocation.HandleType REGULAR = null;
        private final java.lang.String methodName;

        static {
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$HandleType r0 = new net.bytebuddy.implementation.bytecode.member.MethodInvocation$HandleType
                r1 = 0
                java.lang.String r2 = "invokeExact"
                java.lang.String r3 = "EXACT"
                r0.<init>(r3, r1, r2)
                net.bytebuddy.implementation.bytecode.member.MethodInvocation.HandleType.EXACT = r0
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$HandleType r1 = new net.bytebuddy.implementation.bytecode.member.MethodInvocation$HandleType
                r2 = 1
                java.lang.String r3 = "invoke"
                java.lang.String r4 = "REGULAR"
                r1.<init>(r4, r2, r3)
                net.bytebuddy.implementation.bytecode.member.MethodInvocation.HandleType.REGULAR = r1
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$HandleType[] r0 = new net.bytebuddy.implementation.bytecode.member.MethodInvocation.HandleType[]{r0, r1}
                net.bytebuddy.implementation.bytecode.member.MethodInvocation.HandleType.$VALUES = r0
                return
        }

        HandleType(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.methodName = r3
                return
        }

        public static net.bytebuddy.implementation.bytecode.member.MethodInvocation.HandleType valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bytecode.member.MethodInvocation$HandleType> r0 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.HandleType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$HandleType r1 = (net.bytebuddy.implementation.bytecode.member.MethodInvocation.HandleType) r1
                return r1
        }

        public static net.bytebuddy.implementation.bytecode.member.MethodInvocation.HandleType[] values() {
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$HandleType[] r0 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.HandleType.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$HandleType[] r0 = (net.bytebuddy.implementation.bytecode.member.MethodInvocation.HandleType[]) r0
                return r0
        }

        public java.lang.String getMethodName() {
                r1 = this;
                java.lang.String r0 = r1.methodName
                return r0
        }
    }

    public enum IllegalInvocation extends java.lang.Enum<net.bytebuddy.implementation.bytecode.member.MethodInvocation.IllegalInvocation> implements net.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType {
        private static final /* synthetic */ net.bytebuddy.implementation.bytecode.member.MethodInvocation.IllegalInvocation[] $VALUES = null;
        public static final net.bytebuddy.implementation.bytecode.member.MethodInvocation.IllegalInvocation INSTANCE = null;

        static {
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$IllegalInvocation r0 = new net.bytebuddy.implementation.bytecode.member.MethodInvocation$IllegalInvocation
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.bytecode.member.MethodInvocation.IllegalInvocation.INSTANCE = r0
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$IllegalInvocation[] r0 = new net.bytebuddy.implementation.bytecode.member.MethodInvocation.IllegalInvocation[]{r0}
                net.bytebuddy.implementation.bytecode.member.MethodInvocation.IllegalInvocation.$VALUES = r0
                return
        }

        IllegalInvocation(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.bytecode.member.MethodInvocation.IllegalInvocation valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bytecode.member.MethodInvocation$IllegalInvocation> r0 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.IllegalInvocation.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$IllegalInvocation r1 = (net.bytebuddy.implementation.bytecode.member.MethodInvocation.IllegalInvocation) r1
                return r1
        }

        public static net.bytebuddy.implementation.bytecode.member.MethodInvocation.IllegalInvocation[] values() {
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$IllegalInvocation[] r0 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.IllegalInvocation.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$IllegalInvocation[] r0 = (net.bytebuddy.implementation.bytecode.member.MethodInvocation.IllegalInvocation[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
                r1 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation$Illegal r0 = net.bytebuddy.implementation.bytecode.StackManipulation.Illegal.INSTANCE
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = r0.apply(r2, r3)
                return r2
        }

        @Override // net.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType
        public net.bytebuddy.implementation.bytecode.StackManipulation dynamic(java.lang.String r1, net.bytebuddy.description.type.TypeDescription r2, java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r3, java.util.List<? extends net.bytebuddy.utility.JavaConstant> r4) {
                r0 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation$Illegal r1 = net.bytebuddy.implementation.bytecode.StackManipulation.Illegal.INSTANCE
                return r1
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType
        public net.bytebuddy.implementation.bytecode.StackManipulation onHandle(net.bytebuddy.implementation.bytecode.member.MethodInvocation.HandleType r1) {
                r0 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation$Illegal r1 = net.bytebuddy.implementation.bytecode.StackManipulation.Illegal.INSTANCE
                return r1
        }

        @Override // net.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType
        public net.bytebuddy.implementation.bytecode.StackManipulation special(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation$Illegal r1 = net.bytebuddy.implementation.bytecode.StackManipulation.Illegal.INSTANCE
                return r1
        }

        @Override // net.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType
        public net.bytebuddy.implementation.bytecode.StackManipulation virtual(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation$Illegal r1 = net.bytebuddy.implementation.bytecode.StackManipulation.Illegal.INSTANCE
                return r1
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
    public class Invocation extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase implements net.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType {
        private final net.bytebuddy.description.method.MethodDescription.InDefinedShape methodDescription;
        final /* synthetic */ net.bytebuddy.implementation.bytecode.member.MethodInvocation this$0;
        private final net.bytebuddy.description.type.TypeDescription typeDescription;

        public Invocation(net.bytebuddy.implementation.bytecode.member.MethodInvocation r2, net.bytebuddy.description.method.MethodDescription.InDefinedShape r3) {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r3.getDeclaringType()
                r1.<init>(r2, r3, r0)
                return
        }

        public Invocation(net.bytebuddy.implementation.bytecode.member.MethodInvocation r1, net.bytebuddy.description.method.MethodDescription.InDefinedShape r2, net.bytebuddy.description.type.TypeDescription r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.typeDescription = r3
                r0.methodDescription = r2
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r7, net.bytebuddy.implementation.Implementation.Context r8) {
                r6 = this;
                net.bytebuddy.implementation.bytecode.member.MethodInvocation r0 = r6.this$0
                int r0 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.access$000(r0)
                net.bytebuddy.implementation.bytecode.member.MethodInvocation r1 = r6.this$0
                int r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.access$100(r1)
                if (r0 == r1) goto L23
                net.bytebuddy.ClassFileVersion r8 = r8.getClassFileVersion()
                net.bytebuddy.ClassFileVersion r0 = net.bytebuddy.ClassFileVersion.JAVA_V11
                boolean r8 = r8.isAtLeast(r0)
                if (r8 == 0) goto L1b
                goto L23
            L1b:
                net.bytebuddy.implementation.bytecode.member.MethodInvocation r8 = r6.this$0
                int r8 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.access$100(r8)
            L21:
                r1 = r8
                goto L2a
            L23:
                net.bytebuddy.implementation.bytecode.member.MethodInvocation r8 = r6.this$0
                int r8 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.access$000(r8)
                goto L21
            L2a:
                net.bytebuddy.description.type.TypeDescription r8 = r6.typeDescription
                java.lang.String r2 = r8.getInternalName()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r8 = r6.methodDescription
                java.lang.String r3 = r8.getInternalName()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r8 = r6.methodDescription
                java.lang.String r4 = r8.getDescriptor()
                net.bytebuddy.description.type.TypeDescription r8 = r6.typeDescription
                boolean r5 = r8.isInterface()
                r0 = r7
                r0.visitMethodInsn(r1, r2, r3, r4, r5)
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r7 = r6.methodDescription
                int r7 = r7.getStackSize()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r8 = r6.methodDescription
                net.bytebuddy.description.type.TypeDescription$Generic r8 = r8.getReturnType()
                net.bytebuddy.implementation.bytecode.StackSize r8 = r8.getStackSize()
                int r8 = r8.getSize()
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Size
                int r8 = r8 - r7
                r7 = 0
                int r7 = java.lang.Math.max(r7, r8)
                r0.<init>(r8, r7)
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType
        public net.bytebuddy.implementation.bytecode.StackManipulation dynamic(java.lang.String r9, net.bytebuddy.description.type.TypeDescription r10, java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r11, java.util.List<? extends net.bytebuddy.utility.JavaConstant> r12) {
                r8 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r8.methodDescription
                net.bytebuddy.description.type.TypeList r1 = net.bytebuddy.description.type.TypeList.Explicit.of(r12)
                boolean r0 = r0.isInvokeBootstrap(r1)
                if (r0 == 0) goto L26
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$DynamicInvocation r0 = new net.bytebuddy.implementation.bytecode.member.MethodInvocation$DynamicInvocation
                net.bytebuddy.implementation.bytecode.member.MethodInvocation r2 = r8.this$0
                net.bytebuddy.description.type.TypeList$Explicit r5 = new net.bytebuddy.description.type.TypeList$Explicit
                r5.<init>(r11)
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r11 = r8.methodDescription
                net.bytebuddy.description.ByteCodeElement$TypeDependant r11 = r11.asDefined()
                r6 = r11
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r6 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r6
                r1 = r0
                r3 = r9
                r4 = r10
                r7 = r12
                r1.<init>(r2, r3, r4, r5, r6, r7)
                goto L28
            L26:
                net.bytebuddy.implementation.bytecode.StackManipulation$Illegal r0 = net.bytebuddy.implementation.bytecode.StackManipulation.Illegal.INSTANCE
            L28:
                return r0
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
                net.bytebuddy.implementation.bytecode.member.MethodInvocation r2 = r4.this$0
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$Invocation r5 = (net.bytebuddy.implementation.bytecode.member.MethodInvocation.Invocation) r5
                net.bytebuddy.implementation.bytecode.member.MethodInvocation r3 = r5.this$0
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                net.bytebuddy.description.type.TypeDescription r2 = r4.typeDescription
                net.bytebuddy.description.type.TypeDescription r3 = r5.typeDescription
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L2b
                return r1
            L2b:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.methodDescription
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r5 = r5.methodDescription
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L36
                return r1
            L36:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.methodDescription
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.bytecode.member.MethodInvocation r1 = r2.this$0
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType
        public net.bytebuddy.implementation.bytecode.StackManipulation onHandle(net.bytebuddy.implementation.bytecode.member.MethodInvocation.HandleType r3) {
                r2 = this;
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$HandleInvocation r0 = new net.bytebuddy.implementation.bytecode.member.MethodInvocation$HandleInvocation
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.methodDescription
                r0.<init>(r1, r3)
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType
        public net.bytebuddy.implementation.bytecode.StackManipulation special(net.bytebuddy.description.type.TypeDescription r4) {
                r3 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r3.methodDescription
                boolean r0 = r0.isSpecializableFor(r4)
                if (r0 == 0) goto L15
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$Invocation r0 = new net.bytebuddy.implementation.bytecode.member.MethodInvocation$Invocation
                net.bytebuddy.implementation.bytecode.member.MethodInvocation r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.SPECIAL
                r1.getClass()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r3.methodDescription
                r0.<init>(r1, r2, r4)
                goto L17
            L15:
                net.bytebuddy.implementation.bytecode.StackManipulation$Illegal r0 = net.bytebuddy.implementation.bytecode.StackManipulation.Illegal.INSTANCE
            L17:
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType
        public net.bytebuddy.implementation.bytecode.StackManipulation virtual(net.bytebuddy.description.type.TypeDescription r4) {
                r3 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r3.methodDescription
                boolean r0 = r0.isConstructor()
                if (r0 != 0) goto L5a
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r3.methodDescription
                boolean r0 = r0.isStatic()
                if (r0 == 0) goto L11
                goto L5a
            L11:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r3.methodDescription
                boolean r0 = r0.isPrivate()
                if (r0 == 0) goto L2a
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r3.methodDescription
                net.bytebuddy.description.type.TypeDescription r0 = r0.getDeclaringType()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L27
                r4 = r3
                goto L29
            L27:
                net.bytebuddy.implementation.bytecode.StackManipulation$Illegal r4 = net.bytebuddy.implementation.bytecode.StackManipulation.Illegal.INSTANCE
            L29:
                return r4
            L2a:
                boolean r0 = r4.isInterface()
                if (r0 == 0) goto L4d
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r3.methodDescription
                net.bytebuddy.description.type.TypeDescription r0 = r0.getDeclaringType()
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                boolean r0 = r0.represents(r1)
                if (r0 == 0) goto L40
                r0 = r3
                goto L4c
            L40:
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$Invocation r0 = new net.bytebuddy.implementation.bytecode.member.MethodInvocation$Invocation
                net.bytebuddy.implementation.bytecode.member.MethodInvocation r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.INTERFACE
                r1.getClass()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r3.methodDescription
                r0.<init>(r1, r2, r4)
            L4c:
                return r0
            L4d:
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$Invocation r0 = new net.bytebuddy.implementation.bytecode.member.MethodInvocation$Invocation
                net.bytebuddy.implementation.bytecode.member.MethodInvocation r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.VIRTUAL
                r1.getClass()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r3.methodDescription
                r0.<init>(r1, r2, r4)
                return r0
            L5a:
                net.bytebuddy.implementation.bytecode.StackManipulation$Illegal r4 = net.bytebuddy.implementation.bytecode.StackManipulation.Illegal.INSTANCE
                return r4
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class OfGenericMethod implements net.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType {
        private final net.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType invocation;
        private final net.bytebuddy.description.type.TypeDescription targetType;

        public OfGenericMethod(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType r2) {
                r0 = this;
                r0.<init>()
                r0.targetType = r1
                r0.invocation = r2
                return
        }

        public static net.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType of(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType r2) {
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$OfGenericMethod r0 = new net.bytebuddy.implementation.bytecode.member.MethodInvocation$OfGenericMethod
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.getReturnType()
                net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                r0.<init>(r1, r2)
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r6, net.bytebuddy.implementation.Implementation.Context r7) {
                r5 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r1 = r5.invocation
                net.bytebuddy.description.type.TypeDescription r2 = r5.targetType
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.assign.TypeCasting.to(r2)
                r3 = 2
                net.bytebuddy.implementation.bytecode.StackManipulation[] r3 = new net.bytebuddy.implementation.bytecode.StackManipulation[r3]
                r4 = 0
                r3[r4] = r1
                r1 = 1
                r3[r1] = r2
                r0.<init>(r3)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r6 = r0.apply(r6, r7)
                return r6
        }

        @Override // net.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType
        public net.bytebuddy.implementation.bytecode.StackManipulation dynamic(java.lang.String r2, net.bytebuddy.description.type.TypeDescription r3, java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r4, java.util.List<? extends net.bytebuddy.utility.JavaConstant> r5) {
                r1 = this;
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r0 = r1.invocation
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = r0.dynamic(r2, r3, r4, r5)
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
                net.bytebuddy.description.type.TypeDescription r2 = r4.targetType
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$OfGenericMethod r5 = (net.bytebuddy.implementation.bytecode.member.MethodInvocation.OfGenericMethod) r5
                net.bytebuddy.description.type.TypeDescription r3 = r5.targetType
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r2 = r4.invocation
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r5 = r5.invocation
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L2b
                return r1
            L2b:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription r1 = r2.targetType
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r1 = r2.invocation
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
                r1 = this;
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r0 = r1.invocation
                boolean r0 = r0.isValid()
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType
        public net.bytebuddy.implementation.bytecode.StackManipulation onHandle(net.bytebuddy.implementation.bytecode.member.MethodInvocation.HandleType r5) {
                r4 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r1 = r4.invocation
                net.bytebuddy.implementation.bytecode.StackManipulation r5 = r1.onHandle(r5)
                net.bytebuddy.description.type.TypeDescription r1 = r4.targetType
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.assign.TypeCasting.to(r1)
                r2 = 2
                net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                r3 = 0
                r2[r3] = r5
                r5 = 1
                r2[r5] = r1
                r0.<init>(r2)
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType
        public net.bytebuddy.implementation.bytecode.StackManipulation special(net.bytebuddy.description.type.TypeDescription r5) {
                r4 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r1 = r4.invocation
                net.bytebuddy.implementation.bytecode.StackManipulation r5 = r1.special(r5)
                net.bytebuddy.description.type.TypeDescription r1 = r4.targetType
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.assign.TypeCasting.to(r1)
                r2 = 2
                net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                r3 = 0
                r2[r3] = r5
                r5 = 1
                r2[r5] = r1
                r0.<init>(r2)
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType
        public net.bytebuddy.implementation.bytecode.StackManipulation virtual(net.bytebuddy.description.type.TypeDescription r5) {
                r4 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r1 = r4.invocation
                net.bytebuddy.implementation.bytecode.StackManipulation r5 = r1.virtual(r5)
                net.bytebuddy.description.type.TypeDescription r1 = r4.targetType
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.assign.TypeCasting.to(r1)
                r2 = 2
                net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                r3 = 0
                r2[r3] = r5
                r5 = 1
                r2[r5] = r1
                r0.<init>(r2)
                return r0
        }
    }

    public interface WithImplicitInvocationTargetType extends net.bytebuddy.implementation.bytecode.StackManipulation {
        net.bytebuddy.implementation.bytecode.StackManipulation dynamic(java.lang.String r1, net.bytebuddy.description.type.TypeDescription r2, java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r3, java.util.List<? extends net.bytebuddy.utility.JavaConstant> r4);

        net.bytebuddy.implementation.bytecode.StackManipulation onHandle(net.bytebuddy.implementation.bytecode.member.MethodInvocation.HandleType r1);

        net.bytebuddy.implementation.bytecode.StackManipulation special(net.bytebuddy.description.type.TypeDescription r1);

        net.bytebuddy.implementation.bytecode.StackManipulation virtual(net.bytebuddy.description.type.TypeDescription r1);
    }

    static {
            net.bytebuddy.implementation.bytecode.member.MethodInvocation r7 = new net.bytebuddy.implementation.bytecode.member.MethodInvocation
            r5 = 182(0xb6, float:2.55E-43)
            r6 = 5
            java.lang.String r1 = "VIRTUAL"
            r2 = 0
            r3 = 182(0xb6, float:2.55E-43)
            r4 = 5
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            net.bytebuddy.implementation.bytecode.member.MethodInvocation.VIRTUAL = r7
            net.bytebuddy.implementation.bytecode.member.MethodInvocation r1 = new net.bytebuddy.implementation.bytecode.member.MethodInvocation
            r13 = 185(0xb9, float:2.59E-43)
            r14 = 9
            java.lang.String r9 = "INTERFACE"
            r10 = 1
            r11 = 185(0xb9, float:2.59E-43)
            r12 = 9
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            net.bytebuddy.implementation.bytecode.member.MethodInvocation.INTERFACE = r1
            net.bytebuddy.implementation.bytecode.member.MethodInvocation r2 = new net.bytebuddy.implementation.bytecode.member.MethodInvocation
            r20 = 184(0xb8, float:2.58E-43)
            r21 = 6
            java.lang.String r16 = "STATIC"
            r17 = 2
            r18 = 184(0xb8, float:2.58E-43)
            r19 = 6
            r15 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21)
            net.bytebuddy.implementation.bytecode.member.MethodInvocation.STATIC = r2
            net.bytebuddy.implementation.bytecode.member.MethodInvocation r3 = new net.bytebuddy.implementation.bytecode.member.MethodInvocation
            r13 = 183(0xb7, float:2.56E-43)
            r14 = 7
            java.lang.String r9 = "SPECIAL"
            r10 = 3
            r11 = 183(0xb7, float:2.56E-43)
            r12 = 7
            r8 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
            net.bytebuddy.implementation.bytecode.member.MethodInvocation.SPECIAL = r3
            net.bytebuddy.implementation.bytecode.member.MethodInvocation r4 = new net.bytebuddy.implementation.bytecode.member.MethodInvocation
            r20 = 183(0xb7, float:2.56E-43)
            r21 = 8
            java.lang.String r16 = "SPECIAL_CONSTRUCTOR"
            r17 = 4
            r18 = 183(0xb7, float:2.56E-43)
            r19 = 8
            r15 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21)
            net.bytebuddy.implementation.bytecode.member.MethodInvocation.SPECIAL_CONSTRUCTOR = r4
            net.bytebuddy.implementation.bytecode.member.MethodInvocation r5 = new net.bytebuddy.implementation.bytecode.member.MethodInvocation
            java.lang.String r9 = "VIRTUAL_PRIVATE"
            r10 = 5
            r11 = 182(0xb6, float:2.55E-43)
            r12 = 5
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14)
            net.bytebuddy.implementation.bytecode.member.MethodInvocation.VIRTUAL_PRIVATE = r5
            net.bytebuddy.implementation.bytecode.member.MethodInvocation r6 = new net.bytebuddy.implementation.bytecode.member.MethodInvocation
            r21 = 7
            java.lang.String r16 = "INTERFACE_PRIVATE"
            r17 = 6
            r18 = 185(0xb9, float:2.59E-43)
            r19 = 9
            r15 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21)
            net.bytebuddy.implementation.bytecode.member.MethodInvocation.INTERFACE_PRIVATE = r6
            net.bytebuddy.implementation.bytecode.member.MethodInvocation[] r0 = new net.bytebuddy.implementation.bytecode.member.MethodInvocation[]{r0, r1, r2, r3, r4, r5, r6}
            net.bytebuddy.implementation.bytecode.member.MethodInvocation.$VALUES = r0
            return
    }

    MethodInvocation(java.lang.String r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.opcode = r3
            r0.handle = r4
            r0.legacyOpcode = r5
            r0.legacyHandle = r6
            return
    }

    public static /* synthetic */ int access$000(net.bytebuddy.implementation.bytecode.member.MethodInvocation r0) {
            int r0 = r0.opcode
            return r0
    }

    public static /* synthetic */ int access$100(net.bytebuddy.implementation.bytecode.member.MethodInvocation r0) {
            int r0 = r0.legacyOpcode
            return r0
    }

    public static /* synthetic */ int access$200(net.bytebuddy.implementation.bytecode.member.MethodInvocation r0) {
            int r0 = r0.handle
            return r0
    }

    public static /* synthetic */ int access$300(net.bytebuddy.implementation.bytecode.member.MethodInvocation r0) {
            int r0 = r0.legacyHandle
            return r0
    }

    public static net.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType invoke(net.bytebuddy.description.method.MethodDescription.InDefinedShape r2) {
            boolean r0 = r2.isTypeInitializer()
            if (r0 == 0) goto L9
            net.bytebuddy.implementation.bytecode.member.MethodInvocation$IllegalInvocation r2 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.IllegalInvocation.INSTANCE
            return r2
        L9:
            boolean r0 = r2.isStatic()
            if (r0 == 0) goto L1a
            net.bytebuddy.implementation.bytecode.member.MethodInvocation$Invocation r0 = new net.bytebuddy.implementation.bytecode.member.MethodInvocation$Invocation
            net.bytebuddy.implementation.bytecode.member.MethodInvocation r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.STATIC
            r1.getClass()
            r0.<init>(r1, r2)
            return r0
        L1a:
            boolean r0 = r2.isConstructor()
            if (r0 == 0) goto L2b
            net.bytebuddy.implementation.bytecode.member.MethodInvocation$Invocation r0 = new net.bytebuddy.implementation.bytecode.member.MethodInvocation$Invocation
            net.bytebuddy.implementation.bytecode.member.MethodInvocation r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.SPECIAL_CONSTRUCTOR
            r1.getClass()
            r0.<init>(r1, r2)
            return r0
        L2b:
            boolean r0 = r2.isPrivate()
            if (r0 == 0) goto L49
            net.bytebuddy.implementation.bytecode.member.MethodInvocation$Invocation r0 = new net.bytebuddy.implementation.bytecode.member.MethodInvocation$Invocation
            net.bytebuddy.description.type.TypeDescription r1 = r2.getDeclaringType()
            boolean r1 = r1.isInterface()
            if (r1 == 0) goto L40
            net.bytebuddy.implementation.bytecode.member.MethodInvocation r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.INTERFACE_PRIVATE
            goto L42
        L40:
            net.bytebuddy.implementation.bytecode.member.MethodInvocation r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.VIRTUAL_PRIVATE
        L42:
            r1.getClass()
            r0.<init>(r1, r2)
            return r0
        L49:
            net.bytebuddy.description.type.TypeDescription r0 = r2.getDeclaringType()
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L5e
            net.bytebuddy.implementation.bytecode.member.MethodInvocation$Invocation r0 = new net.bytebuddy.implementation.bytecode.member.MethodInvocation$Invocation
            net.bytebuddy.implementation.bytecode.member.MethodInvocation r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.INTERFACE
            r1.getClass()
            r0.<init>(r1, r2)
            return r0
        L5e:
            net.bytebuddy.implementation.bytecode.member.MethodInvocation$Invocation r0 = new net.bytebuddy.implementation.bytecode.member.MethodInvocation$Invocation
            net.bytebuddy.implementation.bytecode.member.MethodInvocation r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.VIRTUAL
            r1.getClass()
            r0.<init>(r1, r2)
            return r0
    }

    public static net.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType invoke(net.bytebuddy.description.method.MethodDescription r3) {
            net.bytebuddy.description.ByteCodeElement$TypeDependant r0 = r3.asDefined()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
            net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.getReturnType()
            net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
            net.bytebuddy.description.type.TypeDescription$Generic r2 = r3.getReturnType()
            net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L21
            net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r3 = invoke(r0)
            goto L29
        L21:
            net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r0 = invoke(r0)
            net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r3 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.OfGenericMethod.of(r3, r0)
        L29:
            return r3
    }

    public static net.bytebuddy.implementation.bytecode.StackManipulation lookup() {
            net.bytebuddy.description.method.MethodDescription$Latent r0 = new net.bytebuddy.description.method.MethodDescription$Latent
            net.bytebuddy.utility.JavaType r1 = net.bytebuddy.utility.JavaType.METHOD_HANDLES
            net.bytebuddy.description.type.TypeDescription r1 = r1.getTypeStub()
            net.bytebuddy.description.method.MethodDescription$Token r2 = new net.bytebuddy.description.method.MethodDescription$Token
            net.bytebuddy.utility.JavaType r3 = net.bytebuddy.utility.JavaType.METHOD_HANDLES_LOOKUP
            net.bytebuddy.description.type.TypeDescription r3 = r3.getTypeStub()
            net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.asGenericType()
            java.lang.String r4 = "lookup"
            r5 = 9
            r2.<init>(r4, r5, r3)
            r0.<init>(r1, r2)
            net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r0 = invoke(r0)
            return r0
    }

    public static net.bytebuddy.implementation.bytecode.member.MethodInvocation valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.member.MethodInvocation> r0 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.member.MethodInvocation r1 = (net.bytebuddy.implementation.bytecode.member.MethodInvocation) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.member.MethodInvocation[] values() {
            net.bytebuddy.implementation.bytecode.member.MethodInvocation[] r0 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.member.MethodInvocation[] r0 = (net.bytebuddy.implementation.bytecode.member.MethodInvocation[]) r0
            return r0
    }
}
