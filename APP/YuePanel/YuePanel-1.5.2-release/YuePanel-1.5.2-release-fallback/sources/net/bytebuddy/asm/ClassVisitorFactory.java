package net.bytebuddy.asm;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public abstract class ClassVisitorFactory<T> {
    private static final boolean ACCESS_CONTROLLER = false;
    private static final java.lang.String DELEGATE = "delegate";
    private static final java.lang.String LABELS = "labels";
    private static final java.lang.String WRAP = "wrap";
    private final java.lang.Class<?> type;

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class AttributeTranslator implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
        protected static final java.lang.String NAME = "attribute";
        private final java.lang.Class<?> sourceAttribute;
        private final net.bytebuddy.description.type.TypeDescription sourceWrapper;
        private final java.lang.Class<?> targetAttribute;
        private final net.bytebuddy.description.type.TypeDescription targetWrapper;

        public AttributeTranslator(java.lang.Class<?> r1, java.lang.Class<?> r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.type.TypeDescription r4) {
                r0 = this;
                r0.<init>()
                r0.sourceAttribute = r1
                r0.targetAttribute = r2
                r0.sourceWrapper = r3
                r0.targetWrapper = r4
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r13, net.bytebuddy.implementation.Implementation.Context r14, net.bytebuddy.description.method.MethodDescription r15) {
                r12 = this;
                net.bytebuddy.jar.asm.Label r0 = new net.bytebuddy.jar.asm.Label
                r0.<init>()
                net.bytebuddy.jar.asm.Label r1 = new net.bytebuddy.jar.asm.Label
                r1.<init>()
                r2 = 25
                r3 = 0
                r13.visitVarInsn(r2, r3)
                r4 = 199(0xc7, float:2.79E-43)
                r13.visitJumpInsn(r4, r0)
                r4 = 1
                r13.visitInsn(r4)
                r5 = 176(0xb0, float:2.47E-43)
                r13.visitInsn(r5)
                r13.visitLabel(r0)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r0 = r14.getFrameGeneration()
                net.bytebuddy.description.method.ParameterList r6 = r15.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r6 = r6.asTypeList()
                r0.same(r13, r6)
                r13.visitVarInsn(r2, r3)
                net.bytebuddy.description.type.TypeDescription r0 = r12.targetWrapper
                java.lang.String r0 = r0.getInternalName()
                r6 = 193(0xc1, float:2.7E-43)
                r13.visitTypeInsn(r6, r0)
                r0 = 153(0x99, float:2.14E-43)
                r13.visitJumpInsn(r0, r1)
                r13.visitVarInsn(r2, r3)
                net.bytebuddy.description.type.TypeDescription r0 = r12.targetWrapper
                java.lang.String r0 = r0.getInternalName()
                r6 = 192(0xc0, float:2.69E-43)
                r13.visitTypeInsn(r6, r0)
                net.bytebuddy.description.type.TypeDescription r0 = r12.targetWrapper
                java.lang.String r0 = r0.getInternalName()
                java.lang.Class<?> r6 = r12.sourceAttribute
                java.lang.String r6 = net.bytebuddy.jar.asm.Type.getDescriptor(r6)
                r7 = 180(0xb4, float:2.52E-43)
                java.lang.String r8 = "delegate"
                r13.visitFieldInsn(r7, r0, r8, r6)
                r13.visitInsn(r5)
                r13.visitLabel(r1)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r14 = r14.getFrameGeneration()
                net.bytebuddy.description.method.ParameterList r15 = r15.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r15 = r15.asTypeList()
                r14.same(r13, r15)
                net.bytebuddy.description.type.TypeDescription r14 = r12.sourceWrapper
                java.lang.String r14 = r14.getInternalName()
                r15 = 187(0xbb, float:2.62E-43)
                r13.visitTypeInsn(r15, r14)
                r14 = 89
                r13.visitInsn(r14)
                r13.visitVarInsn(r2, r3)
                net.bytebuddy.description.type.TypeDescription r14 = r12.sourceWrapper
                java.lang.String r8 = r14.getInternalName()
                net.bytebuddy.jar.asm.Type r14 = net.bytebuddy.jar.asm.Type.VOID_TYPE
                java.lang.Class<?> r15 = r12.targetAttribute
                net.bytebuddy.jar.asm.Type r15 = net.bytebuddy.jar.asm.Type.getType(r15)
                net.bytebuddy.jar.asm.Type[] r15 = new net.bytebuddy.jar.asm.Type[]{r15}
                java.lang.String r10 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r14, r15)
                r11 = 0
                r7 = 183(0xb7, float:2.56E-43)
                java.lang.String r9 = "<init>"
                r6 = r13
                r6.visitMethodInsn(r7, r8, r9, r10, r11)
                r13.visitInsn(r5)
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r13 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                r14 = 3
                r13.<init>(r14, r4)
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
                java.lang.Class<?> r2 = r4.sourceAttribute
                net.bytebuddy.asm.ClassVisitorFactory$AttributeTranslator r5 = (net.bytebuddy.asm.ClassVisitorFactory.AttributeTranslator) r5
                java.lang.Class<?> r3 = r5.sourceAttribute
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                java.lang.Class<?> r2 = r4.targetAttribute
                java.lang.Class<?> r3 = r5.targetAttribute
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L2b
                return r1
            L2b:
                net.bytebuddy.description.type.TypeDescription r2 = r4.sourceWrapper
                net.bytebuddy.description.type.TypeDescription r3 = r5.sourceWrapper
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L36
                return r1
            L36:
                net.bytebuddy.description.type.TypeDescription r2 = r4.targetWrapper
                net.bytebuddy.description.type.TypeDescription r5 = r5.targetWrapper
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L41
                return r1
            L41:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.Class<?> r1 = r2.sourceAttribute
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.Class<?> r1 = r2.targetAttribute
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription r1 = r2.sourceWrapper
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription r1 = r2.targetWrapper
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ConstantArrayTranslator implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
        protected static final java.lang.String NAME = "constants";

        public ConstantArrayTranslator() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r17, net.bytebuddy.implementation.Implementation.Context r18, net.bytebuddy.description.method.MethodDescription r19) {
                r16 = this;
                r6 = r17
                net.bytebuddy.jar.asm.Label r0 = new net.bytebuddy.jar.asm.Label
                r0.<init>()
                net.bytebuddy.jar.asm.Label r7 = new net.bytebuddy.jar.asm.Label
                r7.<init>()
                net.bytebuddy.jar.asm.Label r8 = new net.bytebuddy.jar.asm.Label
                r8.<init>()
                r9 = 25
                r1 = 0
                r6.visitVarInsn(r9, r1)
                r2 = 199(0xc7, float:2.79E-43)
                r6.visitJumpInsn(r2, r0)
                r10 = 1
                r6.visitInsn(r10)
                r11 = 176(0xb0, float:2.47E-43)
                r6.visitInsn(r11)
                r6.visitLabel(r0)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r0 = r18.getFrameGeneration()
                net.bytebuddy.description.method.ParameterList r2 = r19.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r2 = r2.asTypeList()
                r0.same(r6, r2)
                r6.visitVarInsn(r9, r1)
                r0 = 190(0xbe, float:2.66E-43)
                r6.visitInsn(r0)
                java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
                java.lang.String r3 = net.bytebuddy.jar.asm.Type.getInternalName(r2)
                r4 = 189(0xbd, float:2.65E-43)
                r6.visitTypeInsn(r4, r3)
                r3 = 58
                r6.visitVarInsn(r3, r10)
                r12 = 3
                r6.visitInsn(r12)
                r3 = 54
                r13 = 2
                r6.visitVarInsn(r3, r13)
                r6.visitLabel(r7)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r3 = r18.getFrameGeneration()
                java.lang.Class<java.lang.Object[]> r14 = java.lang.Object[].class
                net.bytebuddy.description.type.TypeDescription r4 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r14)
                java.lang.Class r5 = java.lang.Integer.TYPE
                net.bytebuddy.description.type.TypeDescription r5 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r5)
                net.bytebuddy.description.type.TypeDescription[] r15 = new net.bytebuddy.description.type.TypeDescription[r13]
                r15[r1] = r4
                r15[r10] = r5
                java.util.List r4 = java.util.Arrays.asList(r15)
                net.bytebuddy.description.method.ParameterList r5 = r19.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r5 = r5.asTypeList()
                r3.append(r6, r4, r5)
                r3 = 21
                r6.visitVarInsn(r3, r13)
                r6.visitVarInsn(r9, r10)
                r6.visitInsn(r0)
                r0 = 162(0xa2, float:2.27E-43)
                r6.visitJumpInsn(r0, r8)
                r6.visitVarInsn(r9, r10)
                r6.visitVarInsn(r3, r13)
                r6.visitVarInsn(r9, r1)
                r6.visitVarInsn(r3, r13)
                r0 = 50
                r6.visitInsn(r0)
                net.bytebuddy.description.type.TypeDescription r0 = r18.getInstrumentedType()
                java.lang.String r3 = r0.getInternalName()
                net.bytebuddy.jar.asm.Type r0 = net.bytebuddy.jar.asm.Type.getType(r2)
                net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r2)
                net.bytebuddy.jar.asm.Type[] r1 = new net.bytebuddy.jar.asm.Type[]{r1}
                java.lang.String r4 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r0, r1)
                r5 = 0
                r1 = 184(0xb8, float:2.58E-43)
                java.lang.String r15 = "constant"
                r0 = r17
                r2 = r3
                r3 = r15
                r0.visitMethodInsn(r1, r2, r3, r4, r5)
                r0 = 83
                r6.visitInsn(r0)
                r6.visitIincInsn(r13, r10)
                r0 = 167(0xa7, float:2.34E-43)
                r6.visitJumpInsn(r0, r7)
                r6.visitLabel(r8)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r0 = r18.getFrameGeneration()
                net.bytebuddy.description.method.ParameterList r1 = r19.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r1 = r1.asTypeList()
                net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r14)
                java.util.List r1 = net.bytebuddy.utility.CompoundList.of(r1, r2)
                r0.chop(r6, r10, r1)
                r6.visitVarInsn(r9, r10)
                r6.visitInsn(r11)
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r0 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                r1 = 4
                r0.<init>(r1, r12)
                return r0
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                r1 = 0
                if (r4 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r3.getClass()
                java.lang.Class r4 = r4.getClass()
                if (r2 == r4) goto L13
                return r1
            L13:
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.Class r0 = r1.getClass()
                int r0 = r0.hashCode()
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ConstantDynamicTranslator implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
        protected static final java.lang.String NAME = "constantDyanmic";
        private final java.lang.Class<?> sourceConstantDynamic;
        private final java.lang.Class<?> sourceHandle;
        private final java.lang.Class<?> targetConstantDynamic;
        private final java.lang.Class<?> targetHandle;

        public ConstantDynamicTranslator(java.lang.Class<?> r1, java.lang.Class<?> r2, java.lang.Class<?> r3, java.lang.Class<?> r4) {
                r0 = this;
                r0.<init>()
                r0.sourceConstantDynamic = r1
                r0.targetConstantDynamic = r2
                r0.sourceHandle = r3
                r0.targetHandle = r4
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r18, net.bytebuddy.implementation.Implementation.Context r19, net.bytebuddy.description.method.MethodDescription r20) {
                r17 = this;
                r0 = r17
                r7 = r18
                net.bytebuddy.jar.asm.Label r8 = new net.bytebuddy.jar.asm.Label
                r8.<init>()
                net.bytebuddy.jar.asm.Label r9 = new net.bytebuddy.jar.asm.Label
                r9.<init>()
                r10 = 25
                r11 = 0
                r7.visitVarInsn(r10, r11)
                java.lang.Class<?> r1 = r0.sourceConstantDynamic
                java.lang.String r3 = net.bytebuddy.jar.asm.Type.getInternalName(r1)
                net.bytebuddy.jar.asm.Type r12 = net.bytebuddy.jar.asm.Type.INT_TYPE
                net.bytebuddy.jar.asm.Type[] r1 = new net.bytebuddy.jar.asm.Type[r11]
                java.lang.String r5 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r12, r1)
                r6 = 0
                r2 = 182(0xb6, float:2.55E-43)
                java.lang.String r4 = "getBootstrapMethodArgumentCount"
                r1 = r18
                r1.visitMethodInsn(r2, r3, r4, r5, r6)
                java.lang.Class<java.lang.Object> r13 = java.lang.Object.class
                java.lang.String r1 = net.bytebuddy.jar.asm.Type.getInternalName(r13)
                r2 = 189(0xbd, float:2.65E-43)
                r7.visitTypeInsn(r2, r1)
                r1 = 58
                r14 = 1
                r7.visitVarInsn(r1, r14)
                r15 = 3
                r7.visitInsn(r15)
                r1 = 54
                r6 = 2
                r7.visitVarInsn(r1, r6)
                r7.visitLabel(r8)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r1 = r19.getFrameGeneration()
                java.lang.Class<java.lang.Object[]> r16 = java.lang.Object[].class
                net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r16)
                java.lang.Class r3 = java.lang.Integer.TYPE
                net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
                net.bytebuddy.description.type.TypeDescription[] r4 = new net.bytebuddy.description.type.TypeDescription[r6]
                r4[r11] = r2
                r4[r14] = r3
                java.util.List r2 = java.util.Arrays.asList(r4)
                net.bytebuddy.description.method.ParameterList r3 = r20.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r3 = r3.asTypeList()
                r1.append(r7, r2, r3)
                r1 = 21
                r7.visitVarInsn(r1, r6)
                r7.visitVarInsn(r10, r14)
                r2 = 190(0xbe, float:2.66E-43)
                r7.visitInsn(r2)
                r2 = 162(0xa2, float:2.27E-43)
                r7.visitJumpInsn(r2, r9)
                r7.visitVarInsn(r10, r14)
                r7.visitVarInsn(r1, r6)
                r7.visitVarInsn(r10, r11)
                r7.visitVarInsn(r1, r6)
                java.lang.Class<?> r1 = r0.sourceConstantDynamic
                java.lang.String r3 = net.bytebuddy.jar.asm.Type.getInternalName(r1)
                net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r13)
                net.bytebuddy.jar.asm.Type[] r2 = new net.bytebuddy.jar.asm.Type[]{r12}
                java.lang.String r5 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r1, r2)
                r12 = 0
                r2 = 182(0xb6, float:2.55E-43)
                java.lang.String r4 = "getBootstrapMethodArgument"
                r1 = r18
                r15 = r6
                r6 = r12
                r1.visitMethodInsn(r2, r3, r4, r5, r6)
                net.bytebuddy.description.type.TypeDescription r1 = r19.getInstrumentedType()
                java.lang.String r3 = r1.getInternalName()
                net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r13)
                net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getType(r13)
                net.bytebuddy.jar.asm.Type[] r2 = new net.bytebuddy.jar.asm.Type[]{r2}
                java.lang.String r5 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r1, r2)
                r6 = 0
                r2 = 184(0xb8, float:2.58E-43)
                java.lang.String r4 = "ldc"
                r1 = r18
                r1.visitMethodInsn(r2, r3, r4, r5, r6)
                r1 = 83
                r7.visitInsn(r1)
                r7.visitIincInsn(r15, r14)
                r1 = 167(0xa7, float:2.34E-43)
                r7.visitJumpInsn(r1, r8)
                r7.visitLabel(r9)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r1 = r19.getFrameGeneration()
                net.bytebuddy.description.method.ParameterList r2 = r20.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r2 = r2.asTypeList()
                net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r16)
                java.util.List r2 = net.bytebuddy.utility.CompoundList.of(r2, r3)
                r1.chop(r7, r14, r2)
                java.lang.Class<?> r1 = r0.targetConstantDynamic
                java.lang.String r1 = net.bytebuddy.jar.asm.Type.getInternalName(r1)
                r2 = 187(0xbb, float:2.62E-43)
                r7.visitTypeInsn(r2, r1)
                r1 = 89
                r7.visitInsn(r1)
                r7.visitVarInsn(r10, r11)
                java.lang.Class<?> r1 = r0.sourceConstantDynamic
                java.lang.String r3 = net.bytebuddy.jar.asm.Type.getInternalName(r1)
                java.lang.Class<java.lang.String> r8 = java.lang.String.class
                net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r8)
                net.bytebuddy.jar.asm.Type[] r2 = new net.bytebuddy.jar.asm.Type[r11]
                java.lang.String r5 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r1, r2)
                r2 = 182(0xb6, float:2.55E-43)
                java.lang.String r4 = "getName"
                r1 = r18
                r1.visitMethodInsn(r2, r3, r4, r5, r6)
                r7.visitVarInsn(r10, r11)
                java.lang.Class<?> r1 = r0.sourceConstantDynamic
                java.lang.String r3 = net.bytebuddy.jar.asm.Type.getInternalName(r1)
                net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r8)
                net.bytebuddy.jar.asm.Type[] r2 = new net.bytebuddy.jar.asm.Type[r11]
                java.lang.String r5 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r1, r2)
                r2 = 182(0xb6, float:2.55E-43)
                java.lang.String r4 = "getDescriptor"
                r1 = r18
                r1.visitMethodInsn(r2, r3, r4, r5, r6)
                r7.visitVarInsn(r10, r11)
                java.lang.Class<?> r1 = r0.sourceConstantDynamic
                java.lang.String r3 = net.bytebuddy.jar.asm.Type.getInternalName(r1)
                java.lang.Class<?> r1 = r0.sourceHandle
                net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r1)
                net.bytebuddy.jar.asm.Type[] r2 = new net.bytebuddy.jar.asm.Type[r11]
                java.lang.String r5 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r1, r2)
                r2 = 182(0xb6, float:2.55E-43)
                java.lang.String r4 = "getBootstrapMethod"
                r1 = r18
                r1.visitMethodInsn(r2, r3, r4, r5, r6)
                net.bytebuddy.description.type.TypeDescription r1 = r19.getInstrumentedType()
                java.lang.String r3 = r1.getInternalName()
                java.lang.Class<?> r1 = r0.targetHandle
                net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r1)
                java.lang.Class<?> r2 = r0.sourceHandle
                net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getType(r2)
                net.bytebuddy.jar.asm.Type[] r2 = new net.bytebuddy.jar.asm.Type[]{r2}
                java.lang.String r5 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r1, r2)
                r2 = 184(0xb8, float:2.58E-43)
                java.lang.String r4 = "handle"
                r1 = r18
                r1.visitMethodInsn(r2, r3, r4, r5, r6)
                r7.visitVarInsn(r10, r14)
                java.lang.Class<?> r1 = r0.targetConstantDynamic
                java.lang.String r3 = net.bytebuddy.jar.asm.Type.getInternalName(r1)
                net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.VOID_TYPE
                net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getType(r8)
                net.bytebuddy.jar.asm.Type r4 = net.bytebuddy.jar.asm.Type.getType(r8)
                java.lang.Class<?> r5 = r0.targetHandle
                net.bytebuddy.jar.asm.Type r5 = net.bytebuddy.jar.asm.Type.getType(r5)
                net.bytebuddy.jar.asm.Type r6 = net.bytebuddy.jar.asm.Type.getType(r16)
                net.bytebuddy.jar.asm.Type[] r2 = new net.bytebuddy.jar.asm.Type[]{r2, r4, r5, r6}
                java.lang.String r5 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r1, r2)
                r6 = 0
                r2 = 183(0xb7, float:2.56E-43)
                java.lang.String r4 = "<init>"
                r1 = r18
                r1.visitMethodInsn(r2, r3, r4, r5, r6)
                r1 = 176(0xb0, float:2.47E-43)
                r7.visitInsn(r1)
                r1 = 6
                r2 = 3
                r7.visitMaxs(r1, r2)
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r3 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                r3.<init>(r1, r2)
                return r3
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
                java.lang.Class<?> r2 = r4.sourceConstantDynamic
                net.bytebuddy.asm.ClassVisitorFactory$ConstantDynamicTranslator r5 = (net.bytebuddy.asm.ClassVisitorFactory.ConstantDynamicTranslator) r5
                java.lang.Class<?> r3 = r5.sourceConstantDynamic
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                java.lang.Class<?> r2 = r4.targetConstantDynamic
                java.lang.Class<?> r3 = r5.targetConstantDynamic
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L2b
                return r1
            L2b:
                java.lang.Class<?> r2 = r4.sourceHandle
                java.lang.Class<?> r3 = r5.sourceHandle
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L36
                return r1
            L36:
                java.lang.Class<?> r2 = r4.targetHandle
                java.lang.Class<?> r5 = r5.targetHandle
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L41
                return r1
            L41:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.Class<?> r1 = r2.sourceConstantDynamic
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.Class<?> r1 = r2.targetConstantDynamic
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.Class<?> r1 = r2.sourceHandle
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.Class<?> r1 = r2.targetHandle
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ConstantTranslator implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
        protected static final java.lang.String NAME = "constant";

        @net.bytebuddy.utility.nullability.MaybeNull
        @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final java.lang.Class<?> sourceConstantDynamic;

        @net.bytebuddy.utility.nullability.MaybeNull
        @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final java.lang.Class<?> sourceHandle;

        @net.bytebuddy.utility.nullability.MaybeNull
        @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final java.lang.Class<?> sourceType;

        @net.bytebuddy.utility.nullability.MaybeNull
        @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final java.lang.Class<?> targetConstantDynamic;

        @net.bytebuddy.utility.nullability.MaybeNull
        @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final java.lang.Class<?> targetHandle;

        @net.bytebuddy.utility.nullability.MaybeNull
        @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final java.lang.Class<?> targetType;

        public ConstantTranslator(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Class<?> r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Class<?> r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Class<?> r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Class<?> r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Class<?> r5, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Class<?> r6) {
                r0 = this;
                r0.<init>()
                r0.sourceHandle = r1
                r0.targetHandle = r2
                r0.sourceType = r3
                r0.targetType = r4
                r0.sourceConstantDynamic = r5
                r0.targetConstantDynamic = r6
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r19, net.bytebuddy.implementation.Implementation.Context r20, net.bytebuddy.description.method.MethodDescription r21) {
                r18 = this;
                r0 = r18
                r7 = r19
                net.bytebuddy.jar.asm.Label r8 = new net.bytebuddy.jar.asm.Label
                r8.<init>()
                net.bytebuddy.jar.asm.Label r9 = new net.bytebuddy.jar.asm.Label
                r9.<init>()
                net.bytebuddy.jar.asm.Label r10 = new net.bytebuddy.jar.asm.Label
                r10.<init>()
                java.lang.Class<?> r1 = r0.sourceType
                r11 = 192(0xc0, float:2.69E-43)
                r12 = 153(0x99, float:2.14E-43)
                r13 = 193(0xc1, float:2.7E-43)
                r14 = 176(0xb0, float:2.47E-43)
                r15 = 25
                r6 = 0
                if (r1 == 0) goto L99
                java.lang.Class<?> r1 = r0.targetType
                if (r1 == 0) goto L99
                r7.visitVarInsn(r15, r6)
                java.lang.Class<?> r1 = r0.sourceType
                java.lang.String r1 = net.bytebuddy.jar.asm.Type.getInternalName(r1)
                r7.visitTypeInsn(r13, r1)
                r7.visitJumpInsn(r12, r8)
                r7.visitVarInsn(r15, r6)
                java.lang.Class<?> r1 = r0.sourceType
                java.lang.String r1 = net.bytebuddy.jar.asm.Type.getInternalName(r1)
                r7.visitTypeInsn(r11, r1)
                java.lang.Class<?> r1 = r0.sourceType
                java.lang.String r3 = net.bytebuddy.jar.asm.Type.getInternalName(r1)
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r16)
                net.bytebuddy.jar.asm.Type[] r2 = new net.bytebuddy.jar.asm.Type[r6]
                java.lang.String r5 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r1, r2)
                r17 = 0
                r2 = 182(0xb6, float:2.55E-43)
                java.lang.String r4 = "getDescriptor"
                r1 = r19
                r11 = r6
                r6 = r17
                r1.visitMethodInsn(r2, r3, r4, r5, r6)
                java.lang.Class<?> r1 = r0.targetType
                java.lang.String r3 = net.bytebuddy.jar.asm.Type.getInternalName(r1)
                java.lang.Class<?> r1 = r0.targetType
                net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r1)
                net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getType(r16)
                net.bytebuddy.jar.asm.Type[] r2 = new net.bytebuddy.jar.asm.Type[]{r2}
                java.lang.String r5 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r1, r2)
                r6 = 0
                r2 = 184(0xb8, float:2.58E-43)
                java.lang.String r4 = "getType"
                r1 = r19
                r1.visitMethodInsn(r2, r3, r4, r5, r6)
                r7.visitInsn(r14)
                r7.visitLabel(r8)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r1 = r20.getFrameGeneration()
                net.bytebuddy.description.method.ParameterList r2 = r21.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r2 = r2.asTypeList()
                r1.same(r7, r2)
                goto L9a
            L99:
                r11 = r6
            L9a:
                java.lang.Class<?> r1 = r0.sourceHandle
                if (r1 == 0) goto Lfa
                java.lang.Class<?> r1 = r0.targetHandle
                if (r1 == 0) goto Lfa
                r7.visitVarInsn(r15, r11)
                java.lang.Class<?> r1 = r0.sourceHandle
                java.lang.String r1 = net.bytebuddy.jar.asm.Type.getInternalName(r1)
                r7.visitTypeInsn(r13, r1)
                r7.visitJumpInsn(r12, r9)
                r7.visitVarInsn(r15, r11)
                java.lang.Class<?> r1 = r0.sourceHandle
                java.lang.String r1 = net.bytebuddy.jar.asm.Type.getInternalName(r1)
                r2 = 192(0xc0, float:2.69E-43)
                r7.visitTypeInsn(r2, r1)
                net.bytebuddy.description.type.TypeDescription r1 = r20.getInstrumentedType()
                java.lang.String r3 = r1.getInternalName()
                java.lang.Class<?> r1 = r0.targetHandle
                net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r1)
                java.lang.Class<?> r2 = r0.sourceHandle
                net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getType(r2)
                net.bytebuddy.jar.asm.Type[] r2 = new net.bytebuddy.jar.asm.Type[]{r2}
                java.lang.String r5 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r1, r2)
                r6 = 0
                r2 = 184(0xb8, float:2.58E-43)
                java.lang.String r4 = "handle"
                r1 = r19
                r1.visitMethodInsn(r2, r3, r4, r5, r6)
                r7.visitInsn(r14)
                r7.visitLabel(r9)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r1 = r20.getFrameGeneration()
                net.bytebuddy.description.method.ParameterList r2 = r21.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r2 = r2.asTypeList()
                r1.same(r7, r2)
            Lfa:
                java.lang.Class<?> r1 = r0.sourceConstantDynamic
                if (r1 == 0) goto L15a
                java.lang.Class<?> r1 = r0.targetConstantDynamic
                if (r1 == 0) goto L15a
                r7.visitVarInsn(r15, r11)
                java.lang.Class<?> r1 = r0.sourceConstantDynamic
                java.lang.String r1 = net.bytebuddy.jar.asm.Type.getInternalName(r1)
                r7.visitTypeInsn(r13, r1)
                r7.visitJumpInsn(r12, r10)
                r7.visitVarInsn(r15, r11)
                java.lang.Class<?> r1 = r0.sourceConstantDynamic
                java.lang.String r1 = net.bytebuddy.jar.asm.Type.getInternalName(r1)
                r2 = 192(0xc0, float:2.69E-43)
                r7.visitTypeInsn(r2, r1)
                net.bytebuddy.description.type.TypeDescription r1 = r20.getInstrumentedType()
                java.lang.String r3 = r1.getInternalName()
                java.lang.Class<?> r1 = r0.targetConstantDynamic
                net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r1)
                java.lang.Class<?> r2 = r0.sourceConstantDynamic
                net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getType(r2)
                net.bytebuddy.jar.asm.Type[] r2 = new net.bytebuddy.jar.asm.Type[]{r2}
                java.lang.String r5 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r1, r2)
                r6 = 0
                r2 = 184(0xb8, float:2.58E-43)
                java.lang.String r4 = "constantDyanmic"
                r1 = r19
                r1.visitMethodInsn(r2, r3, r4, r5, r6)
                r7.visitInsn(r14)
                r7.visitLabel(r10)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r1 = r20.getFrameGeneration()
                net.bytebuddy.description.method.ParameterList r2 = r21.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r2 = r2.asTypeList()
                r1.same(r7, r2)
            L15a:
                r7.visitVarInsn(r15, r11)
                r7.visitInsn(r14)
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r1 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                r2 = 1
                r1.<init>(r2, r2)
                return r1
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
                java.lang.Class<?> r2 = r4.sourceHandle
                net.bytebuddy.asm.ClassVisitorFactory$ConstantTranslator r5 = (net.bytebuddy.asm.ClassVisitorFactory.ConstantTranslator) r5
                java.lang.Class<?> r3 = r5.sourceHandle
                if (r3 == 0) goto L24
                if (r2 == 0) goto L26
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L27
                return r1
            L24:
                if (r2 == 0) goto L27
            L26:
                return r1
            L27:
                java.lang.Class<?> r2 = r4.targetHandle
                java.lang.Class<?> r3 = r5.targetHandle
                if (r3 == 0) goto L36
                if (r2 == 0) goto L38
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L39
                return r1
            L36:
                if (r2 == 0) goto L39
            L38:
                return r1
            L39:
                java.lang.Class<?> r2 = r4.sourceType
                java.lang.Class<?> r3 = r5.sourceType
                if (r3 == 0) goto L48
                if (r2 == 0) goto L4a
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L4b
                return r1
            L48:
                if (r2 == 0) goto L4b
            L4a:
                return r1
            L4b:
                java.lang.Class<?> r2 = r4.targetType
                java.lang.Class<?> r3 = r5.targetType
                if (r3 == 0) goto L5a
                if (r2 == 0) goto L5c
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L5d
                return r1
            L5a:
                if (r2 == 0) goto L5d
            L5c:
                return r1
            L5d:
                java.lang.Class<?> r2 = r4.sourceConstantDynamic
                java.lang.Class<?> r3 = r5.sourceConstantDynamic
                if (r3 == 0) goto L6c
                if (r2 == 0) goto L6e
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L6f
                return r1
            L6c:
                if (r2 == 0) goto L6f
            L6e:
                return r1
            L6f:
                java.lang.Class<?> r2 = r4.targetConstantDynamic
                java.lang.Class<?> r5 = r5.targetConstantDynamic
                if (r5 == 0) goto L7e
                if (r2 == 0) goto L80
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L81
                return r1
            L7e:
                if (r2 == 0) goto L81
            L80:
                return r1
            L81:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.Class<?> r1 = r2.sourceHandle
                if (r1 == 0) goto L13
                int r1 = r1.hashCode()
                int r0 = r0 + r1
            L13:
                int r0 = r0 * 31
                java.lang.Class<?> r1 = r2.targetHandle
                if (r1 == 0) goto L1e
                int r1 = r1.hashCode()
                int r0 = r0 + r1
            L1e:
                int r0 = r0 * 31
                java.lang.Class<?> r1 = r2.sourceType
                if (r1 == 0) goto L29
                int r1 = r1.hashCode()
                int r0 = r0 + r1
            L29:
                int r0 = r0 * 31
                java.lang.Class<?> r1 = r2.targetType
                if (r1 == 0) goto L34
                int r1 = r1.hashCode()
                int r0 = r0 + r1
            L34:
                int r0 = r0 * 31
                java.lang.Class<?> r1 = r2.sourceConstantDynamic
                if (r1 == 0) goto L3f
                int r1 = r1.hashCode()
                int r0 = r0 + r1
            L3f:
                int r0 = r0 * 31
                java.lang.Class<?> r1 = r2.targetConstantDynamic
                if (r1 == 0) goto L4a
                int r1 = r1.hashCode()
                int r0 = r0 + r1
            L4a:
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class CreateClassVisitorFactory<S> implements java.security.PrivilegedAction<net.bytebuddy.asm.ClassVisitorFactory<S>> {
        private final net.bytebuddy.ByteBuddy byteBuddy;
        private final java.lang.Class<S> classVisitor;

        public CreateClassVisitorFactory(java.lang.Class<S> r1, net.bytebuddy.ByteBuddy r2) {
                r0 = this;
                r0.<init>()
                r0.classVisitor = r1
                r0.byteBuddy = r2
                return
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
                java.lang.Class<S> r2 = r4.classVisitor
                net.bytebuddy.asm.ClassVisitorFactory$CreateClassVisitorFactory r5 = (net.bytebuddy.asm.ClassVisitorFactory.CreateClassVisitorFactory) r5
                java.lang.Class<S> r3 = r5.classVisitor
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                net.bytebuddy.ByteBuddy r2 = r4.byteBuddy
                net.bytebuddy.ByteBuddy r5 = r5.byteBuddy
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
                java.lang.Class<S> r1 = r2.classVisitor
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.ByteBuddy r1 = r2.byteBuddy
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // java.security.PrivilegedAction
        public /* bridge */ /* synthetic */ java.lang.Object run() {
                r1 = this;
                net.bytebuddy.asm.ClassVisitorFactory r0 = r1.run()
                return r0
        }

        @Override // java.security.PrivilegedAction
        public net.bytebuddy.asm.ClassVisitorFactory<S> run() {
                r46 = this;
                r1 = r46
                java.lang.String r0 = "delegate"
                java.lang.Class<java.lang.UnsupportedOperationException> r2 = java.lang.UnsupportedOperationException.class
                java.lang.String r3 = "attribute"
                java.lang.String r4 = "constants"
                java.lang.String r7 = "frames"
                java.lang.String r8 = "constant"
                java.lang.String r9 = "handle"
                java.lang.String r10 = "typePath"
                java.lang.String r11 = "labels"
                java.lang.String r12 = "label"
                java.lang.Class<net.bytebuddy.jar.asm.ConstantDynamic> r13 = net.bytebuddy.jar.asm.ConstantDynamic.class
                java.lang.Class<net.bytebuddy.jar.asm.Type> r14 = net.bytebuddy.jar.asm.Type.class
                java.lang.Class<net.bytebuddy.jar.asm.Label> r15 = net.bytebuddy.jar.asm.Label.class
                java.lang.Class<net.bytebuddy.jar.asm.Attribute> r6 = net.bytebuddy.jar.asm.Attribute.class
                java.lang.Class<net.bytebuddy.jar.asm.ClassVisitor> r5 = net.bytebuddy.jar.asm.ClassVisitor.class
                r16 = r0
                java.lang.String r0 = r5.getSimpleName()
                r17 = r5
                java.lang.Class<S> r5 = r1.classVisitor
                java.lang.String r5 = r5.getSimpleName()
                boolean r0 = r0.equals(r5)
                if (r0 == 0) goto L8d0
                java.lang.Class<S> r0 = r1.classVisitor     // Catch: java.lang.Exception -> La0
                java.lang.Package r0 = r0.getPackage()     // Catch: java.lang.Exception -> La0
                java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> La0
                java.util.HashMap r5 = new java.util.HashMap     // Catch: java.lang.Exception -> La0
                r5.<init>()     // Catch: java.lang.Exception -> La0
                java.lang.Class<net.bytebuddy.jar.asm.Attribute> r18 = net.bytebuddy.jar.asm.Attribute.class
                java.lang.Class<net.bytebuddy.jar.asm.Label> r19 = net.bytebuddy.jar.asm.Label.class
                java.lang.Class<net.bytebuddy.jar.asm.Type> r20 = net.bytebuddy.jar.asm.Type.class
                java.lang.Class<net.bytebuddy.jar.asm.TypePath> r21 = net.bytebuddy.jar.asm.TypePath.class
                java.lang.Class<net.bytebuddy.jar.asm.Handle> r22 = net.bytebuddy.jar.asm.Handle.class
                java.lang.Class<net.bytebuddy.jar.asm.ConstantDynamic> r23 = net.bytebuddy.jar.asm.ConstantDynamic.class
                java.lang.Class[] r18 = new java.lang.Class[]{r18, r19, r20, r21, r22, r23}     // Catch: java.lang.Exception -> La0
                java.util.List r18 = java.util.Arrays.asList(r18)     // Catch: java.lang.Exception -> La0
                java.util.Iterator r18 = r18.iterator()     // Catch: java.lang.Exception -> La0
            L5b:
                boolean r19 = r18.hasNext()     // Catch: java.lang.Exception -> La0
                r20 = r2
                java.lang.String r2 = "."
                if (r19 == 0) goto La6
                java.lang.Object r19 = r18.next()     // Catch: java.lang.Exception -> La0
                r21 = r3
                r3 = r19
                java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Exception -> La0
                r19 = r4
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La0 java.lang.ClassNotFoundException -> La3
                r4.<init>()     // Catch: java.lang.Exception -> La0 java.lang.ClassNotFoundException -> La3
                r4.append(r0)     // Catch: java.lang.Exception -> La0 java.lang.ClassNotFoundException -> La3
                r4.append(r2)     // Catch: java.lang.Exception -> La0 java.lang.ClassNotFoundException -> La3
                java.lang.String r2 = r3.getSimpleName()     // Catch: java.lang.Exception -> La0 java.lang.ClassNotFoundException -> La3
                r4.append(r2)     // Catch: java.lang.Exception -> La0 java.lang.ClassNotFoundException -> La3
                java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> La0 java.lang.ClassNotFoundException -> La3
                java.lang.Class<S> r4 = r1.classVisitor     // Catch: java.lang.Exception -> La0 java.lang.ClassNotFoundException -> La3
                java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Exception -> La0 java.lang.ClassNotFoundException -> La3
                r22 = r7
                r7 = 0
                java.lang.Class r2 = java.lang.Class.forName(r2, r7, r4)     // Catch: java.lang.ClassNotFoundException -> L97 java.lang.Exception -> La0
                r5.put(r3, r2)     // Catch: java.lang.Exception -> La0
            L97:
                r4 = r19
                r2 = r20
                r3 = r21
                r7 = r22
                goto L5b
            La0:
                r0 = move-exception
                goto L8b3
            La3:
                r22 = r7
                goto L97
            La6:
                r21 = r3
                r19 = r4
                r22 = r7
                boolean r3 = r5.containsKey(r15)     // Catch: java.lang.Exception -> La0
                java.lang.Class<net.bytebuddy.jar.asm.Label[]> r4 = net.bytebuddy.jar.asm.Label[].class
                if (r3 == 0) goto Le5
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La0
                r3.<init>()     // Catch: java.lang.Exception -> La0
                java.lang.String r7 = "[L"
                r3.append(r7)     // Catch: java.lang.Exception -> La0
                java.lang.Object r7 = r5.get(r15)     // Catch: java.lang.Exception -> La0
                java.lang.Class r7 = (java.lang.Class) r7     // Catch: java.lang.Exception -> La0
                java.lang.String r7 = r7.getName()     // Catch: java.lang.Exception -> La0
                r3.append(r7)     // Catch: java.lang.Exception -> La0
                java.lang.String r7 = ";"
                r3.append(r7)     // Catch: java.lang.Exception -> La0
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> La0
                java.lang.Class<S> r7 = r1.classVisitor     // Catch: java.lang.Exception -> La0
                java.lang.ClassLoader r7 = r7.getClassLoader()     // Catch: java.lang.Exception -> La0
                r18 = r8
                r8 = 0
                java.lang.Class r3 = java.lang.Class.forName(r3, r8, r7)     // Catch: java.lang.Exception -> La0
                r5.put(r4, r3)     // Catch: java.lang.Exception -> La0
                goto Le7
            Le5:
                r18 = r8
            Le7:
                java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Exception -> La0
                r3.<init>()     // Catch: java.lang.Exception -> La0
                java.util.HashMap r7 = new java.util.HashMap     // Catch: java.lang.Exception -> La0
                r7.<init>()     // Catch: java.lang.Exception -> La0
                java.lang.Class<net.bytebuddy.jar.asm.ClassVisitor> r23 = net.bytebuddy.jar.asm.ClassVisitor.class
                java.lang.Class<net.bytebuddy.jar.asm.AnnotationVisitor> r24 = net.bytebuddy.jar.asm.AnnotationVisitor.class
                java.lang.Class<net.bytebuddy.jar.asm.ModuleVisitor> r25 = net.bytebuddy.jar.asm.ModuleVisitor.class
                java.lang.Class<net.bytebuddy.jar.asm.RecordComponentVisitor> r26 = net.bytebuddy.jar.asm.RecordComponentVisitor.class
                java.lang.Class<net.bytebuddy.jar.asm.FieldVisitor> r27 = net.bytebuddy.jar.asm.FieldVisitor.class
                java.lang.Class<net.bytebuddy.jar.asm.MethodVisitor> r28 = net.bytebuddy.jar.asm.MethodVisitor.class
                java.lang.Class[] r8 = new java.lang.Class[]{r23, r24, r25, r26, r27, r28}     // Catch: java.lang.Exception -> La0
                java.util.List r8 = java.util.Arrays.asList(r8)     // Catch: java.lang.Exception -> La0
                java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> La0
            L109:
                boolean r23 = r8.hasNext()     // Catch: java.lang.Exception -> La0
                r24 = r9
                java.lang.Class<net.bytebuddy.jar.asm.Handle> r9 = net.bytebuddy.jar.asm.Handle.class
                r25 = r10
                java.lang.Class<net.bytebuddy.jar.asm.TypePath> r10 = net.bytebuddy.jar.asm.TypePath.class
                r26 = r11
                java.lang.Class<net.bytebuddy.jar.asm.MethodVisitor> r11 = net.bytebuddy.jar.asm.MethodVisitor.class
                if (r23 == 0) goto L23b
                java.lang.Object r23 = r8.next()     // Catch: java.lang.Exception -> La0
                r40 = r8
                r8 = r23
                java.lang.Class r8 = (java.lang.Class) r8     // Catch: java.lang.Exception -> La0
                r23 = r4
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La0 java.lang.ClassNotFoundException -> L238
                r4.<init>()     // Catch: java.lang.Exception -> La0 java.lang.ClassNotFoundException -> L238
                r4.append(r0)     // Catch: java.lang.Exception -> La0 java.lang.ClassNotFoundException -> L238
                r4.append(r2)     // Catch: java.lang.Exception -> La0 java.lang.ClassNotFoundException -> L238
                r41 = r0
                java.lang.String r0 = r8.getSimpleName()     // Catch: java.lang.Exception -> La0 java.lang.ClassNotFoundException -> L235
                r4.append(r0)     // Catch: java.lang.Exception -> La0 java.lang.ClassNotFoundException -> L235
                java.lang.String r0 = r4.toString()     // Catch: java.lang.Exception -> La0 java.lang.ClassNotFoundException -> L235
                java.lang.Class<S> r4 = r1.classVisitor     // Catch: java.lang.Exception -> La0 java.lang.ClassNotFoundException -> L235
                java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Exception -> La0 java.lang.ClassNotFoundException -> L235
                r42 = r2
                r2 = 0
                java.lang.Class r0 = java.lang.Class.forName(r0, r2, r4)     // Catch: java.lang.Exception -> La0 java.lang.ClassNotFoundException -> L232
                if (r8 != r11) goto L1cd
                net.bytebuddy.ByteBuddy r2 = r1.byteBuddy     // Catch: java.lang.Exception -> La0
                java.lang.Class<net.bytebuddy.jar.asm.TypePath> r30 = net.bytebuddy.jar.asm.TypePath.class
                java.lang.Object r4 = r5.get(r10)     // Catch: java.lang.Exception -> La0
                r31 = r4
                java.lang.Class r31 = (java.lang.Class) r31     // Catch: java.lang.Exception -> La0
                java.lang.Class<net.bytebuddy.jar.asm.Label> r32 = net.bytebuddy.jar.asm.Label.class
                java.lang.Object r4 = r5.get(r15)     // Catch: java.lang.Exception -> La0
                r33 = r4
                java.lang.Class r33 = (java.lang.Class) r33     // Catch: java.lang.Exception -> La0
                java.lang.Class<net.bytebuddy.jar.asm.Type> r34 = net.bytebuddy.jar.asm.Type.class
                java.lang.Object r4 = r5.get(r14)     // Catch: java.lang.Exception -> La0
                r35 = r4
                java.lang.Class r35 = (java.lang.Class) r35     // Catch: java.lang.Exception -> La0
                java.lang.Class<net.bytebuddy.jar.asm.Handle> r36 = net.bytebuddy.jar.asm.Handle.class
                java.lang.Object r4 = r5.get(r9)     // Catch: java.lang.Exception -> La0
                r37 = r4
                java.lang.Class r37 = (java.lang.Class) r37     // Catch: java.lang.Exception -> La0
                java.lang.Class<net.bytebuddy.jar.asm.ConstantDynamic> r38 = net.bytebuddy.jar.asm.ConstantDynamic.class
                java.lang.Object r4 = r5.get(r13)     // Catch: java.lang.Exception -> La0
                r39 = r4
                java.lang.Class r39 = (java.lang.Class) r39     // Catch: java.lang.Exception -> La0
                r27 = r2
                r28 = r8
                r29 = r0
                net.bytebuddy.dynamic.DynamicType$Builder r2 = net.bytebuddy.asm.ClassVisitorFactory.access$000(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch: java.lang.Exception -> La0
                net.bytebuddy.ByteBuddy r4 = r1.byteBuddy     // Catch: java.lang.Exception -> La0
                java.lang.Object r10 = r5.get(r10)     // Catch: java.lang.Exception -> La0
                r30 = r10
                java.lang.Class r30 = (java.lang.Class) r30     // Catch: java.lang.Exception -> La0
                java.lang.Class<net.bytebuddy.jar.asm.TypePath> r31 = net.bytebuddy.jar.asm.TypePath.class
                java.lang.Object r10 = r5.get(r15)     // Catch: java.lang.Exception -> La0
                r32 = r10
                java.lang.Class r32 = (java.lang.Class) r32     // Catch: java.lang.Exception -> La0
                java.lang.Class<net.bytebuddy.jar.asm.Label> r33 = net.bytebuddy.jar.asm.Label.class
                java.lang.Object r10 = r5.get(r14)     // Catch: java.lang.Exception -> La0
                r34 = r10
                java.lang.Class r34 = (java.lang.Class) r34     // Catch: java.lang.Exception -> La0
                java.lang.Class<net.bytebuddy.jar.asm.Type> r35 = net.bytebuddy.jar.asm.Type.class
                java.lang.Object r9 = r5.get(r9)     // Catch: java.lang.Exception -> La0
                r36 = r9
                java.lang.Class r36 = (java.lang.Class) r36     // Catch: java.lang.Exception -> La0
                java.lang.Class<net.bytebuddy.jar.asm.Handle> r37 = net.bytebuddy.jar.asm.Handle.class
                java.lang.Object r9 = r5.get(r13)     // Catch: java.lang.Exception -> La0
                r38 = r9
                java.lang.Class r38 = (java.lang.Class) r38     // Catch: java.lang.Exception -> La0
                java.lang.Class<net.bytebuddy.jar.asm.ConstantDynamic> r39 = net.bytebuddy.jar.asm.ConstantDynamic.class
                r27 = r4
                r28 = r0
                r29 = r8
                net.bytebuddy.dynamic.DynamicType$Builder r4 = net.bytebuddy.asm.ClassVisitorFactory.access$000(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch: java.lang.Exception -> La0
                r33 = r13
                goto L217
            L1cd:
                net.bytebuddy.ByteBuddy r2 = r1.byteBuddy     // Catch: java.lang.Exception -> La0
                java.lang.Class<net.bytebuddy.jar.asm.TypePath> r30 = net.bytebuddy.jar.asm.TypePath.class
                java.lang.Object r4 = r5.get(r10)     // Catch: java.lang.Exception -> La0
                r31 = r4
                java.lang.Class r31 = (java.lang.Class) r31     // Catch: java.lang.Exception -> La0
                net.bytebuddy.implementation.Implementation$Simple r4 = new net.bytebuddy.implementation.Implementation$Simple     // Catch: java.lang.Exception -> La0
                net.bytebuddy.implementation.bytecode.member.MethodReturn r9 = net.bytebuddy.implementation.bytecode.member.MethodReturn.VOID     // Catch: java.lang.Exception -> La0
                r33 = r13
                r11 = 1
                net.bytebuddy.implementation.bytecode.StackManipulation[] r13 = new net.bytebuddy.implementation.bytecode.StackManipulation[r11]     // Catch: java.lang.Exception -> La0
                r11 = 0
                r13[r11] = r9     // Catch: java.lang.Exception -> La0
                r4.<init>(r13)     // Catch: java.lang.Exception -> La0
                r27 = r2
                r28 = r8
                r29 = r0
                r32 = r4
                net.bytebuddy.dynamic.DynamicType$Builder r2 = net.bytebuddy.asm.ClassVisitorFactory.access$100(r27, r28, r29, r30, r31, r32)     // Catch: java.lang.Exception -> La0
                net.bytebuddy.ByteBuddy r4 = r1.byteBuddy     // Catch: java.lang.Exception -> La0
                java.lang.Object r10 = r5.get(r10)     // Catch: java.lang.Exception -> La0
                r30 = r10
                java.lang.Class r30 = (java.lang.Class) r30     // Catch: java.lang.Exception -> La0
                java.lang.Class<net.bytebuddy.jar.asm.TypePath> r31 = net.bytebuddy.jar.asm.TypePath.class
                net.bytebuddy.implementation.Implementation$Simple r10 = new net.bytebuddy.implementation.Implementation$Simple     // Catch: java.lang.Exception -> La0
                r11 = 1
                net.bytebuddy.implementation.bytecode.StackManipulation[] r13 = new net.bytebuddy.implementation.bytecode.StackManipulation[r11]     // Catch: java.lang.Exception -> La0
                r11 = 0
                r13[r11] = r9     // Catch: java.lang.Exception -> La0
                r10.<init>(r13)     // Catch: java.lang.Exception -> La0
                r27 = r4
                r28 = r0
                r29 = r8
                r32 = r10
                net.bytebuddy.dynamic.DynamicType$Builder r4 = net.bytebuddy.asm.ClassVisitorFactory.access$100(r27, r28, r29, r30, r31, r32)     // Catch: java.lang.Exception -> La0
            L217:
                r3.put(r8, r0)     // Catch: java.lang.Exception -> La0
                r7.put(r8, r2)     // Catch: java.lang.Exception -> La0
                r7.put(r0, r4)     // Catch: java.lang.Exception -> La0
            L220:
                r4 = r23
                r9 = r24
                r10 = r25
                r11 = r26
                r13 = r33
                r8 = r40
                r0 = r41
                r2 = r42
                goto L109
            L232:
                r33 = r13
                goto L220
            L235:
                r42 = r2
                goto L232
            L238:
                r41 = r0
                goto L235
            L23b:
                r23 = r4
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> La0
                r0.<init>()     // Catch: java.lang.Exception -> La0
                java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Exception -> La0
                r2.<init>()     // Catch: java.lang.Exception -> La0
                boolean r4 = r5.containsKey(r6)     // Catch: java.lang.Exception -> La0
                if (r4 == 0) goto L293
                net.bytebuddy.ByteBuddy r4 = r1.byteBuddy     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default r13 = net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.NO_CONSTRUCTORS     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder r4 = r4.subclass(r6, r13)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.ByteBuddy r14 = r1.byteBuddy     // Catch: java.lang.Exception -> L28e
                java.lang.Object r27 = r5.get(r6)     // Catch: java.lang.Exception -> L28e
                r8 = r27
                java.lang.Class r8 = (java.lang.Class) r8     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder r8 = r14.subclass(r8, r13)     // Catch: java.lang.Exception -> L28e
                java.lang.Object r13 = r5.get(r6)     // Catch: java.lang.Exception -> L28e
                java.lang.Class r13 = (java.lang.Class) r13     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.type.TypeDescription r14 = r4.toTypeDescription()     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.type.TypeDescription r1 = r8.toTypeDescription()     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType r1 = net.bytebuddy.asm.ClassVisitorFactory.access$200(r4, r6, r13, r14, r1)     // Catch: java.lang.Exception -> L28e
                r0.add(r1)     // Catch: java.lang.Exception -> L28e
                java.lang.Object r13 = r5.get(r6)     // Catch: java.lang.Exception -> L28e
                java.lang.Class r13 = (java.lang.Class) r13     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.type.TypeDescription r14 = r8.toTypeDescription()     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.type.TypeDescription r4 = r4.toTypeDescription()     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType r4 = net.bytebuddy.asm.ClassVisitorFactory.access$200(r8, r13, r6, r14, r4)     // Catch: java.lang.Exception -> L28e
                r0.add(r4)     // Catch: java.lang.Exception -> L28e
                goto L295
            L28e:
                r0 = move-exception
                r1 = r46
                goto L8b3
            L293:
                r1 = 0
                r4 = 0
            L295:
                java.util.Set r8 = r3.entrySet()     // Catch: java.lang.Exception -> L28e
                java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> L28e
            L29d:
                boolean r13 = r8.hasNext()     // Catch: java.lang.Exception -> L28e
                java.lang.String r14 = "wrap"
                if (r13 == 0) goto L7c1
                java.lang.Object r13 = r8.next()     // Catch: java.lang.Exception -> L28e
                java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch: java.lang.Exception -> L28e
                r27 = r8
                java.lang.Object r8 = r13.getKey()     // Catch: java.lang.Exception -> L28e
                java.lang.Object r8 = r7.get(r8)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder r8 = (net.bytebuddy.dynamic.DynamicType.Builder) r8     // Catch: java.lang.Exception -> L28e
                r29 = r8
                java.lang.Object r8 = r13.getValue()     // Catch: java.lang.Exception -> L28e
                java.lang.Object r8 = r7.get(r8)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder r8 = (net.bytebuddy.dynamic.DynamicType.Builder) r8     // Catch: java.lang.Exception -> L28e
                java.lang.Object r30 = r13.getKey()     // Catch: java.lang.Exception -> L28e
                java.lang.Class r30 = (java.lang.Class) r30     // Catch: java.lang.Exception -> L28e
                r31 = r8
                java.lang.reflect.Method[] r8 = r30.getMethods()     // Catch: java.lang.Exception -> L28e
                r30 = r0
                int r0 = r8.length     // Catch: java.lang.Exception -> L28e
                r32 = r2
                r2 = r29
                r29 = r14
                r14 = r31
                r31 = r3
                r3 = 0
            L2dd:
                if (r3 >= r0) goto L753
                r33 = r8[r3]     // Catch: java.lang.Exception -> L28e
                r34 = r0
                java.lang.Class r0 = r33.getDeclaringClass()     // Catch: java.lang.Exception -> L28e
                r35 = r8
                java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
                if (r0 != r8) goto L311
                r40 = r1
                r36 = r3
                r39 = r4
                r42 = r5
                r43 = r15
                r8 = r21
                r15 = r25
                r25 = r26
                r0 = 1
                r26 = r12
                r21 = r19
                r19 = r22
                r12 = r24
                r24 = r9
                r22 = r18
                r9 = r6
                r18 = r10
                r10 = r31
                goto L72c
            L311:
                java.lang.Class[] r0 = r33.getParameterTypes()     // Catch: java.lang.Exception -> L28e
                r36 = r3
                int r3 = r0.length     // Catch: java.lang.Exception -> L28e
                r37 = r14
                java.lang.Class[] r14 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L28e
                r38 = r2
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L28e
                r39 = r4
                int r4 = r0.length     // Catch: java.lang.Exception -> L28e
                r2.<init>(r4)     // Catch: java.lang.Exception -> L28e
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> L28e
                r4.<init>(r3)     // Catch: java.lang.Exception -> L28e
                r40 = r1
                r42 = r6
                r1 = 0
                r3 = 1
                r41 = 0
            L333:
                int r6 = r0.length     // Catch: java.lang.Exception -> L28e
                if (r1 >= r6) goto L62c
                java.lang.Object r6 = r13.getKey()     // Catch: java.lang.Exception -> L28e
                if (r6 != r11) goto L396
                r6 = r0[r1]     // Catch: java.lang.Exception -> L28e
                if (r6 != r15) goto L396
                java.lang.Object r6 = r5.get(r15)     // Catch: java.lang.Exception -> L28e
                java.lang.Class r6 = (java.lang.Class) r6     // Catch: java.lang.Exception -> L28e
                r14[r1] = r6     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r13.getKey()     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder r6 = (net.bytebuddy.dynamic.DynamicType.Builder) r6     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.type.TypeDescription r6 = r6.toTypeDescription()     // Catch: java.lang.Exception -> L28e
                r43 = r15
                r15 = r14[r1]     // Catch: java.lang.Exception -> L28e
                r44 = r8
                r8 = 1
                net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory r6 = net.bytebuddy.asm.ClassVisitorFactory.access$300(r6, r15, r12, r3, r8)     // Catch: java.lang.Exception -> L28e
                r2.add(r6)     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r13.getValue()     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder r6 = (net.bytebuddy.dynamic.DynamicType.Builder) r6     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.type.TypeDescription r6 = r6.toTypeDescription()     // Catch: java.lang.Exception -> L28e
                r8 = r0[r1]     // Catch: java.lang.Exception -> L28e
                r15 = 1
                net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory r6 = net.bytebuddy.asm.ClassVisitorFactory.access$300(r6, r8, r12, r3, r15)     // Catch: java.lang.Exception -> L28e
                r4.add(r6)     // Catch: java.lang.Exception -> L28e
                r8 = r21
                r15 = r25
                r25 = r26
                r26 = r12
                r21 = r19
                r19 = r22
                r12 = r24
                r24 = r9
                r22 = r18
                r9 = r42
                r42 = r5
            L392:
                r18 = r10
                goto L5f7
            L396:
                r44 = r8
                r43 = r15
                java.lang.Object r6 = r13.getKey()     // Catch: java.lang.Exception -> L28e
                if (r6 != r11) goto L3fb
                r6 = r0[r1]     // Catch: java.lang.Exception -> L28e
                r8 = r23
                if (r6 != r8) goto L3f9
                java.lang.Object r6 = r5.get(r8)     // Catch: java.lang.Exception -> L28e
                java.lang.Class r6 = (java.lang.Class) r6     // Catch: java.lang.Exception -> L28e
                r14[r1] = r6     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r13.getKey()     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder r6 = (net.bytebuddy.dynamic.DynamicType.Builder) r6     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.type.TypeDescription r6 = r6.toTypeDescription()     // Catch: java.lang.Exception -> L28e
                r15 = r14[r1]     // Catch: java.lang.Exception -> L28e
                r23 = r8
                r8 = r26
                r26 = r12
                r12 = 1
                net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory r6 = net.bytebuddy.asm.ClassVisitorFactory.access$300(r6, r15, r8, r3, r12)     // Catch: java.lang.Exception -> L28e
                r2.add(r6)     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r13.getValue()     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder r6 = (net.bytebuddy.dynamic.DynamicType.Builder) r6     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.type.TypeDescription r6 = r6.toTypeDescription()     // Catch: java.lang.Exception -> L28e
                r12 = r0[r1]     // Catch: java.lang.Exception -> L28e
                r15 = 1
                net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory r6 = net.bytebuddy.asm.ClassVisitorFactory.access$300(r6, r12, r8, r3, r15)     // Catch: java.lang.Exception -> L28e
                r4.add(r6)     // Catch: java.lang.Exception -> L28e
                r12 = r24
                r15 = r25
                r25 = r8
                r24 = r9
            L3ec:
                r8 = r21
                r9 = r42
                r42 = r5
                r21 = r19
                r19 = r22
            L3f6:
                r22 = r18
                goto L392
            L3f9:
                r23 = r8
            L3fb:
                r8 = r26
                r26 = r12
                r6 = r0[r1]     // Catch: java.lang.Exception -> L28e
                if (r6 != r10) goto L44e
                java.lang.Object r6 = r5.get(r10)     // Catch: java.lang.Exception -> L28e
                java.lang.Class r6 = (java.lang.Class) r6     // Catch: java.lang.Exception -> L28e
                r14[r1] = r6     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r13.getKey()     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder r6 = (net.bytebuddy.dynamic.DynamicType.Builder) r6     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.type.TypeDescription r6 = r6.toTypeDescription()     // Catch: java.lang.Exception -> L28e
                r12 = r14[r1]     // Catch: java.lang.Exception -> L28e
                r15 = r25
                r25 = r8
                r8 = 0
                net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory r6 = net.bytebuddy.asm.ClassVisitorFactory.access$300(r6, r12, r15, r3, r8)     // Catch: java.lang.Exception -> L28e
                r2.add(r6)     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r13.getValue()     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder r6 = (net.bytebuddy.dynamic.DynamicType.Builder) r6     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.type.TypeDescription r6 = r6.toTypeDescription()     // Catch: java.lang.Exception -> L28e
                r8 = r0[r1]     // Catch: java.lang.Exception -> L28e
                r12 = 0
                net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory r6 = net.bytebuddy.asm.ClassVisitorFactory.access$300(r6, r8, r15, r3, r12)     // Catch: java.lang.Exception -> L28e
                r4.add(r6)     // Catch: java.lang.Exception -> L28e
                r8 = r21
                r12 = r24
                r24 = r9
                r21 = r19
                r19 = r22
                r9 = r42
                r42 = r5
                goto L3f6
            L44e:
                r15 = r25
                r25 = r8
                java.lang.Object r6 = r13.getKey()     // Catch: java.lang.Exception -> L28e
                if (r6 != r11) goto L49a
                r6 = r0[r1]     // Catch: java.lang.Exception -> L28e
                if (r6 != r9) goto L49a
                java.lang.Object r6 = r5.get(r9)     // Catch: java.lang.Exception -> L28e
                java.lang.Class r6 = (java.lang.Class) r6     // Catch: java.lang.Exception -> L28e
                r14[r1] = r6     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r13.getKey()     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder r6 = (net.bytebuddy.dynamic.DynamicType.Builder) r6     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.type.TypeDescription r6 = r6.toTypeDescription()     // Catch: java.lang.Exception -> L28e
                r8 = r14[r1]     // Catch: java.lang.Exception -> L28e
                r12 = r24
                r24 = r9
                r9 = 0
                net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory r6 = net.bytebuddy.asm.ClassVisitorFactory.access$300(r6, r8, r12, r3, r9)     // Catch: java.lang.Exception -> L28e
                r2.add(r6)     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r13.getValue()     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder r6 = (net.bytebuddy.dynamic.DynamicType.Builder) r6     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.type.TypeDescription r6 = r6.toTypeDescription()     // Catch: java.lang.Exception -> L28e
                r8 = r0[r1]     // Catch: java.lang.Exception -> L28e
                r9 = 0
                net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory r6 = net.bytebuddy.asm.ClassVisitorFactory.access$300(r6, r8, r12, r3, r9)     // Catch: java.lang.Exception -> L28e
                r4.add(r6)     // Catch: java.lang.Exception -> L28e
                goto L3ec
            L49a:
                r12 = r24
                r24 = r9
                java.lang.Object r6 = r13.getKey()     // Catch: java.lang.Exception -> L28e
                if (r6 != r11) goto L4f1
                r6 = r0[r1]     // Catch: java.lang.Exception -> L28e
                r8 = r44
                if (r6 != r8) goto L4ec
                r14[r1] = r8     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r13.getKey()     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder r6 = (net.bytebuddy.dynamic.DynamicType.Builder) r6     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.type.TypeDescription r6 = r6.toTypeDescription()     // Catch: java.lang.Exception -> L28e
                r9 = r18
                r18 = r10
                r10 = 0
                net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory r6 = net.bytebuddy.asm.ClassVisitorFactory.access$300(r6, r8, r9, r3, r10)     // Catch: java.lang.Exception -> L28e
                r2.add(r6)     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r13.getValue()     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder r6 = (net.bytebuddy.dynamic.DynamicType.Builder) r6     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.type.TypeDescription r6 = r6.toTypeDescription()     // Catch: java.lang.Exception -> L28e
                r10 = 0
                net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory r6 = net.bytebuddy.asm.ClassVisitorFactory.access$300(r6, r8, r9, r3, r10)     // Catch: java.lang.Exception -> L28e
                r4.add(r6)     // Catch: java.lang.Exception -> L28e
                r44 = r8
                r8 = r21
                r21 = r19
                r19 = r22
                r22 = r9
                r9 = r42
                r42 = r5
                goto L5f7
            L4ec:
                r9 = r18
            L4ee:
                r18 = r10
                goto L4f6
            L4f1:
                r9 = r18
                r8 = r44
                goto L4ee
            L4f6:
                java.lang.Object r6 = r13.getKey()     // Catch: java.lang.Exception -> L28e
                if (r6 != r11) goto L592
                r6 = r0[r1]     // Catch: java.lang.Exception -> L28e
                java.lang.Class<java.lang.Object[]> r10 = java.lang.Object[].class
                if (r6 != r10) goto L592
                r14[r1] = r10     // Catch: java.lang.Exception -> L28e
                java.lang.String r6 = r33.getName()     // Catch: java.lang.Exception -> L28e
                r44 = r8
                java.lang.String r8 = "visitFrame"
                boolean r6 = r6.equals(r8)     // Catch: java.lang.Exception -> L28e
                if (r6 == 0) goto L550
                java.lang.Object r6 = r13.getKey()     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder r6 = (net.bytebuddy.dynamic.DynamicType.Builder) r6     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.type.TypeDescription r6 = r6.toTypeDescription()     // Catch: java.lang.Exception -> L28e
                r8 = r22
                r22 = r9
                r9 = 1
                net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory r6 = net.bytebuddy.asm.ClassVisitorFactory.access$300(r6, r10, r8, r3, r9)     // Catch: java.lang.Exception -> L28e
                r2.add(r6)     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r13.getValue()     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder r6 = (net.bytebuddy.dynamic.DynamicType.Builder) r6     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.type.TypeDescription r6 = r6.toTypeDescription()     // Catch: java.lang.Exception -> L28e
                r9 = 1
                net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory r6 = net.bytebuddy.asm.ClassVisitorFactory.access$300(r6, r10, r8, r3, r9)     // Catch: java.lang.Exception -> L28e
                r4.add(r6)     // Catch: java.lang.Exception -> L28e
                r9 = r42
                r42 = r5
                r45 = r19
                r19 = r8
                r8 = r21
                r21 = r45
                goto L5f7
            L550:
                r8 = r22
                r22 = r9
                java.lang.Object r6 = r13.getKey()     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder r6 = (net.bytebuddy.dynamic.DynamicType.Builder) r6     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.type.TypeDescription r6 = r6.toTypeDescription()     // Catch: java.lang.Exception -> L28e
                r9 = 0
                r45 = r19
                r19 = r8
                r8 = r45
                net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory r6 = net.bytebuddy.asm.ClassVisitorFactory.access$300(r6, r10, r8, r3, r9)     // Catch: java.lang.Exception -> L28e
                r2.add(r6)     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r13.getValue()     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder r6 = (net.bytebuddy.dynamic.DynamicType.Builder) r6     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.type.TypeDescription r6 = r6.toTypeDescription()     // Catch: java.lang.Exception -> L28e
                r9 = 0
                net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory r6 = net.bytebuddy.asm.ClassVisitorFactory.access$300(r6, r10, r8, r3, r9)     // Catch: java.lang.Exception -> L28e
                r4.add(r6)     // Catch: java.lang.Exception -> L28e
                r9 = r42
                r42 = r5
                r45 = r21
                r21 = r8
                r8 = r45
                goto L5f7
            L592:
                r44 = r8
                r8 = r19
                r19 = r22
                r22 = r9
                r6 = r0[r1]     // Catch: java.lang.Exception -> L28e
                r9 = r42
                if (r6 != r9) goto L5dd
                java.lang.Object r6 = r5.get(r9)     // Catch: java.lang.Exception -> L28e
                java.lang.Class r6 = (java.lang.Class) r6     // Catch: java.lang.Exception -> L28e
                r14[r1] = r6     // Catch: java.lang.Exception -> L28e
                if (r40 == 0) goto L5d2
                if (r39 == 0) goto L5d2
                net.bytebuddy.description.type.TypeDescription r6 = r39.getTypeDescription()     // Catch: java.lang.Exception -> L28e
                java.lang.Object r10 = r5.get(r9)     // Catch: java.lang.Exception -> L28e
                java.lang.Class r10 = (java.lang.Class) r10     // Catch: java.lang.Exception -> L28e
                r42 = r5
                r5 = 0
                r45 = r21
                r21 = r8
                r8 = r45
                net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory r6 = net.bytebuddy.asm.ClassVisitorFactory.access$300(r6, r10, r8, r3, r5)     // Catch: java.lang.Exception -> L28e
                r2.add(r6)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.type.TypeDescription r6 = r40.getTypeDescription()     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory r6 = net.bytebuddy.asm.ClassVisitorFactory.access$300(r6, r9, r8, r3, r5)     // Catch: java.lang.Exception -> L28e
                r4.add(r6)     // Catch: java.lang.Exception -> L28e
                goto L5f7
            L5d2:
                r42 = r5
                r45 = r21
                r21 = r8
                r8 = r45
                r41 = 1
                goto L5f7
            L5dd:
                r42 = r5
                r45 = r21
                r21 = r8
                r8 = r45
                r14[r1] = r6     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameter$Factory r5 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameter$Factory     // Catch: java.lang.Exception -> L28e
                r5.<init>(r1)     // Catch: java.lang.Exception -> L28e
                r2.add(r5)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameter$Factory r5 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameter$Factory     // Catch: java.lang.Exception -> L28e
                r5.<init>(r1)     // Catch: java.lang.Exception -> L28e
                r4.add(r5)     // Catch: java.lang.Exception -> L28e
            L5f7:
                r5 = r14[r1]     // Catch: java.lang.Exception -> L28e
                if (r5 != 0) goto L5fd
                r0 = 1
                goto L647
            L5fd:
                r5 = r0[r1]     // Catch: java.lang.Exception -> L28e
                java.lang.Class r6 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L28e
                if (r5 == r6) goto L60a
                java.lang.Class r6 = java.lang.Double.TYPE     // Catch: java.lang.Exception -> L28e
                if (r5 != r6) goto L608
                goto L60a
            L608:
                r5 = 1
                goto L60b
            L60a:
                r5 = 2
            L60b:
                int r3 = r3 + r5
                r5 = 1
                int r1 = r1 + r5
                r10 = r18
                r18 = r22
                r5 = r42
                r42 = r9
                r22 = r19
                r19 = r21
                r9 = r24
                r21 = r8
                r24 = r12
                r12 = r26
                r8 = r44
                r26 = r25
                r25 = r15
                r15 = r43
                goto L333
            L62c:
                r43 = r15
                r8 = r21
                r15 = r25
                r25 = r26
                r26 = r12
                r21 = r19
                r19 = r22
                r12 = r24
                r24 = r9
                r22 = r18
                r9 = r42
                r42 = r5
                r18 = r10
                r0 = 0
            L647:
                if (r0 == 0) goto L64d
            L649:
                r0 = 0
                r41 = 1
                goto L65b
            L64d:
                java.lang.Object r0 = r13.getValue()     // Catch: java.lang.Exception -> L28e java.lang.NoSuchMethodException -> L649
                java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Exception -> L28e java.lang.NoSuchMethodException -> L649
                java.lang.String r1 = r33.getName()     // Catch: java.lang.Exception -> L28e java.lang.NoSuchMethodException -> L649
                java.lang.reflect.Method r0 = r0.getMethod(r1, r14)     // Catch: java.lang.Exception -> L28e java.lang.NoSuchMethodException -> L649
            L65b:
                if (r41 == 0) goto L68f
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.is(r33)     // Catch: java.lang.Exception -> L28e
                r3 = r38
                net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r1 = r3.method(r1)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.implementation.Implementation r2 = net.bytebuddy.implementation.ExceptionMethod.throwing(r20)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r1 = r1.intercept(r2)     // Catch: java.lang.Exception -> L28e
                if (r0 == 0) goto L68a
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.is(r0)     // Catch: java.lang.Exception -> L28e
                r5 = r37
                net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r0 = r5.method(r0)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.implementation.Implementation r2 = net.bytebuddy.implementation.ExceptionMethod.throwing(r20)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r0 = r0.intercept(r2)     // Catch: java.lang.Exception -> L28e
                r14 = r0
                r2 = r1
            L685:
                r10 = r31
            L687:
                r0 = 1
                goto L72c
            L68a:
                r5 = r37
                r2 = r1
                r14 = r5
                goto L685
            L68f:
                r5 = r37
                r3 = r38
                net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r1 = net.bytebuddy.implementation.MethodCall.invoke(r0)     // Catch: java.lang.Exception -> L28e
                r6 = r16
                net.bytebuddy.implementation.MethodCall r1 = r1.onField(r6)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.implementation.MethodCall r1 = r1.with(r2)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r2 = net.bytebuddy.implementation.MethodCall.invoke(r33)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.implementation.MethodCall r2 = r2.onField(r6)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.implementation.MethodCall r2 = r2.with(r4)     // Catch: java.lang.Exception -> L28e
                java.lang.Class r4 = r33.getReturnType()     // Catch: java.lang.Exception -> L28e
                r10 = r31
                java.lang.Object r4 = r10.get(r4)     // Catch: java.lang.Exception -> L28e
                java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.Exception -> L28e
                if (r4 == 0) goto L70e
                java.lang.Class r14 = r33.getReturnType()     // Catch: java.lang.Exception -> L28e
                java.lang.Object r14 = r7.get(r14)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder r14 = (net.bytebuddy.dynamic.DynamicType.Builder) r14     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.type.TypeDescription r14 = r14.toTypeDescription()     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.method.MethodList r14 = r14.getDeclaredMethods()     // Catch: java.lang.Exception -> L28e
                r16 = r6
                net.bytebuddy.matcher.ElementMatcher$Junction r6 = net.bytebuddy.matcher.ElementMatchers.named(r29)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.matcher.FilterableList r6 = r14.filter(r6)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.method.MethodList r6 = (net.bytebuddy.description.method.MethodList) r6     // Catch: java.lang.Exception -> L28e
                java.lang.Object r6 = r6.getOnly()     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.method.MethodDescription r6 = (net.bytebuddy.description.method.MethodDescription) r6     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r6 = net.bytebuddy.implementation.MethodCall.invoke(r6)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.implementation.MethodCall r1 = r6.withMethodCall(r1)     // Catch: java.lang.Exception -> L28e
                java.lang.Object r4 = r7.get(r4)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder r4 = (net.bytebuddy.dynamic.DynamicType.Builder) r4     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.type.TypeDescription r4 = r4.toTypeDescription()     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.method.MethodList r4 = r4.getDeclaredMethods()     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.matcher.ElementMatcher$Junction r6 = net.bytebuddy.matcher.ElementMatchers.named(r29)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.matcher.FilterableList r4 = r4.filter(r6)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.method.MethodList r4 = (net.bytebuddy.description.method.MethodList) r4     // Catch: java.lang.Exception -> L28e
                java.lang.Object r4 = r4.getOnly()     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.method.MethodDescription r4 = (net.bytebuddy.description.method.MethodDescription) r4     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r4 = net.bytebuddy.implementation.MethodCall.invoke(r4)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.implementation.MethodCall r2 = r4.withMethodCall(r2)     // Catch: java.lang.Exception -> L28e
                goto L710
            L70e:
                r16 = r6
            L710:
                net.bytebuddy.matcher.ElementMatcher$Junction r4 = net.bytebuddy.matcher.ElementMatchers.is(r33)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r3 = r3.method(r4)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r1 = r3.intercept(r1)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.is(r0)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r0 = r5.method(r0)     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r0 = r0.intercept(r2)     // Catch: java.lang.Exception -> L28e
                r14 = r0
                r2 = r1
                goto L687
            L72c:
                int r3 = r36 + 1
                r6 = r9
                r31 = r10
                r10 = r18
                r18 = r22
                r9 = r24
                r0 = r34
                r4 = r39
                r1 = r40
                r5 = r42
                r24 = r12
                r22 = r19
                r19 = r21
                r12 = r26
                r21 = r8
                r26 = r25
                r8 = r35
                r25 = r15
                r15 = r43
                goto L2dd
            L753:
                r40 = r1
                r3 = r2
                r39 = r4
                r42 = r5
                r5 = r14
                r43 = r15
                r8 = r21
                r15 = r25
                r25 = r26
                r0 = 1
                r26 = r12
                r21 = r19
                r19 = r22
                r12 = r24
                r24 = r9
                r22 = r18
                r9 = r6
                r18 = r10
                r10 = r31
                net.bytebuddy.dynamic.DynamicType$Unloaded r1 = r3.make()     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.dynamic.DynamicType$Unloaded r2 = r5.make()     // Catch: java.lang.Exception -> L28e
                java.lang.Object r3 = r13.getKey()     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.type.TypeDescription r4 = r1.getTypeDescription()     // Catch: java.lang.Exception -> L28e
                r5 = r32
                r5.put(r3, r4)     // Catch: java.lang.Exception -> L28e
                java.lang.Object r3 = r13.getValue()     // Catch: java.lang.Exception -> L28e
                net.bytebuddy.description.type.TypeDescription r4 = r2.getTypeDescription()     // Catch: java.lang.Exception -> L28e
                r5.put(r3, r4)     // Catch: java.lang.Exception -> L28e
                r3 = r30
                r3.add(r1)     // Catch: java.lang.Exception -> L28e
                r3.add(r2)     // Catch: java.lang.Exception -> L28e
                r0 = r3
                r2 = r5
                r6 = r9
                r3 = r10
                r10 = r18
                r18 = r22
                r9 = r24
                r4 = r39
                r1 = r40
                r5 = r42
                r24 = r12
                r22 = r19
                r19 = r21
                r12 = r26
                r21 = r8
                r26 = r25
                r8 = r27
                r25 = r15
                r15 = r43
                goto L29d
            L7c1:
                r3 = r0
                r5 = r2
                r29 = r14
                net.bytebuddy.dynamic.loading.MultipleParentClassLoader$Builder r0 = new net.bytebuddy.dynamic.loading.MultipleParentClassLoader$Builder     // Catch: java.lang.Exception -> L28e
                r1 = 0
                r0.<init>(r1)     // Catch: java.lang.Exception -> L28e
                r1 = r46
                java.lang.Class<S> r2 = r1.classVisitor     // Catch: java.lang.Exception -> La0
                r4 = r17
                java.lang.Class[] r2 = new java.lang.Class[]{r4, r2}     // Catch: java.lang.Exception -> La0
                net.bytebuddy.dynamic.loading.MultipleParentClassLoader$Builder r0 = r0.appendMostSpecific(r2)     // Catch: java.lang.Exception -> La0
                java.lang.ClassLoader r0 = r0.build()     // Catch: java.lang.Exception -> La0
                net.bytebuddy.ByteBuddy r2 = r1.byteBuddy     // Catch: java.lang.Exception -> La0
                java.lang.Class<net.bytebuddy.asm.ClassVisitorFactory> r6 = net.bytebuddy.asm.ClassVisitorFactory.class
                net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default r7 = net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.IMITATE_SUPER_CLASS_OPENING     // Catch: java.lang.Exception -> La0
                net.bytebuddy.dynamic.DynamicType$Builder r2 = r2.subclass(r6, r7)     // Catch: java.lang.Exception -> La0
                net.bytebuddy.matcher.ElementMatcher$Junction r6 = net.bytebuddy.matcher.ElementMatchers.named(r29)     // Catch: java.lang.Exception -> La0
                net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r2 = r2.method(r6)     // Catch: java.lang.Exception -> La0
                java.lang.Class<S> r6 = r1.classVisitor     // Catch: java.lang.Exception -> La0
                java.lang.Object r6 = r5.get(r6)     // Catch: java.lang.Exception -> La0
                net.bytebuddy.description.type.TypeDescription r6 = (net.bytebuddy.description.type.TypeDescription) r6     // Catch: java.lang.Exception -> La0
                net.bytebuddy.description.method.MethodList r6 = r6.getDeclaredMethods()     // Catch: java.lang.Exception -> La0
                net.bytebuddy.matcher.ElementMatcher$Junction r7 = net.bytebuddy.matcher.ElementMatchers.isConstructor()     // Catch: java.lang.Exception -> La0
                net.bytebuddy.matcher.FilterableList r6 = r6.filter(r7)     // Catch: java.lang.Exception -> La0
                net.bytebuddy.description.method.MethodList r6 = (net.bytebuddy.description.method.MethodList) r6     // Catch: java.lang.Exception -> La0
                java.lang.Object r6 = r6.getOnly()     // Catch: java.lang.Exception -> La0
                net.bytebuddy.description.method.MethodDescription r6 = (net.bytebuddy.description.method.MethodDescription) r6     // Catch: java.lang.Exception -> La0
                net.bytebuddy.implementation.MethodCall r6 = net.bytebuddy.implementation.MethodCall.construct(r6)     // Catch: java.lang.Exception -> La0
                r7 = 0
                int[] r8 = new int[]{r7}     // Catch: java.lang.Exception -> La0
                net.bytebuddy.implementation.MethodCall r6 = r6.withArgument(r8)     // Catch: java.lang.Exception -> La0
                net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r2 = r2.intercept(r6)     // Catch: java.lang.Exception -> La0
                java.lang.String r6 = "unwrap"
                net.bytebuddy.matcher.ElementMatcher$Junction r6 = net.bytebuddy.matcher.ElementMatchers.named(r6)     // Catch: java.lang.Exception -> La0
                net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r2 = r2.method(r6)     // Catch: java.lang.Exception -> La0
                java.lang.Object r5 = r5.get(r4)     // Catch: java.lang.Exception -> La0
                net.bytebuddy.description.type.TypeDescription r5 = (net.bytebuddy.description.type.TypeDescription) r5     // Catch: java.lang.Exception -> La0
                net.bytebuddy.description.method.MethodList r5 = r5.getDeclaredMethods()     // Catch: java.lang.Exception -> La0
                net.bytebuddy.matcher.ElementMatcher$Junction r6 = net.bytebuddy.matcher.ElementMatchers.isConstructor()     // Catch: java.lang.Exception -> La0
                net.bytebuddy.matcher.FilterableList r5 = r5.filter(r6)     // Catch: java.lang.Exception -> La0
                net.bytebuddy.description.method.MethodList r5 = (net.bytebuddy.description.method.MethodList) r5     // Catch: java.lang.Exception -> La0
                java.lang.Object r5 = r5.getOnly()     // Catch: java.lang.Exception -> La0
                net.bytebuddy.description.method.MethodDescription r5 = (net.bytebuddy.description.method.MethodDescription) r5     // Catch: java.lang.Exception -> La0
                net.bytebuddy.implementation.MethodCall r5 = net.bytebuddy.implementation.MethodCall.construct(r5)     // Catch: java.lang.Exception -> La0
                r6 = 0
                int[] r6 = new int[]{r6}     // Catch: java.lang.Exception -> La0
                net.bytebuddy.implementation.MethodCall r5 = r5.withArgument(r6)     // Catch: java.lang.Exception -> La0
                net.bytebuddy.implementation.bytecode.assign.Assigner r6 = net.bytebuddy.implementation.bytecode.assign.Assigner.DEFAULT     // Catch: java.lang.Exception -> La0
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r7 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.DYNAMIC     // Catch: java.lang.Exception -> La0
                net.bytebuddy.implementation.Implementation$Composable r5 = r5.withAssigner(r6, r7)     // Catch: java.lang.Exception -> La0
                net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r2 = r2.intercept(r5)     // Catch: java.lang.Exception -> La0
                net.bytebuddy.dynamic.DynamicType$Unloaded r2 = r2.make()     // Catch: java.lang.Exception -> La0
                net.bytebuddy.dynamic.DynamicType$Unloaded r2 = r2.include(r3)     // Catch: java.lang.Exception -> La0
                net.bytebuddy.dynamic.DynamicType$Loaded r2 = r2.load(r0)     // Catch: java.lang.Exception -> La0
                java.lang.Class r2 = r2.getLoaded()     // Catch: java.lang.Exception -> La0
                java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
                java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Exception -> La0
                java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch: java.lang.Exception -> La0
                java.lang.Class<S> r3 = r1.classVisitor     // Catch: java.lang.Exception -> La0
                java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Exception -> La0
                java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Exception -> La0
                net.bytebuddy.asm.ClassVisitorFactory r2 = (net.bytebuddy.asm.ClassVisitorFactory) r2     // Catch: java.lang.Exception -> La0
                boolean r3 = r0 instanceof net.bytebuddy.dynamic.loading.MultipleParentClassLoader     // Catch: java.lang.Exception -> La0
                if (r3 == 0) goto L8b2
                java.lang.ClassLoader r3 = r4.getClassLoader()     // Catch: java.lang.Exception -> La0
                if (r0 == r3) goto L8b2
                java.lang.Class<S> r3 = r1.classVisitor     // Catch: java.lang.Exception -> La0
                java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Exception -> La0
                if (r0 == r3) goto L8b2
                r3 = r0
                net.bytebuddy.dynamic.loading.MultipleParentClassLoader r3 = (net.bytebuddy.dynamic.loading.MultipleParentClassLoader) r3     // Catch: java.lang.Exception -> La0
                boolean r3 = r3.seal()     // Catch: java.lang.Exception -> La0
                if (r3 == 0) goto L89b
                goto L8b2
            L89b:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> La0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La0
                r3.<init>()     // Catch: java.lang.Exception -> La0
                java.lang.String r4 = "Failed to seal multiple parent class loader: "
                r3.append(r4)     // Catch: java.lang.Exception -> La0
                r3.append(r0)     // Catch: java.lang.Exception -> La0
                java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> La0
                r2.<init>(r0)     // Catch: java.lang.Exception -> La0
                throw r2     // Catch: java.lang.Exception -> La0
            L8b2:
                return r2
            L8b3:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Failed to generate factory for "
                r3.append(r4)
                java.lang.Class<S> r4 = r1.classVisitor
                java.lang.String r4 = r4.getName()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3, r0)
                throw r2
            L8d0:
                r4 = r17
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Expected a class named "
                r2.append(r3)
                java.lang.String r3 = r4.getSimpleName()
                r2.append(r3)
                java.lang.String r3 = ": "
                r2.append(r3)
                java.lang.Class<S> r3 = r1.classVisitor
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class FrameTranslator implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
        protected static final java.lang.String NAME = "frames";
        private final java.lang.Class<?> sourceLabel;
        private final java.lang.Class<?> targetLabel;

        public FrameTranslator(java.lang.Class<?> r1, java.lang.Class<?> r2) {
                r0 = this;
                r0.<init>()
                r0.sourceLabel = r1
                r0.targetLabel = r2
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r23, net.bytebuddy.implementation.Implementation.Context r24, net.bytebuddy.description.method.MethodDescription r25) {
                r22 = this;
                r0 = r22
                r7 = r23
                net.bytebuddy.jar.asm.Label r1 = new net.bytebuddy.jar.asm.Label
                r1.<init>()
                net.bytebuddy.jar.asm.Label r8 = new net.bytebuddy.jar.asm.Label
                r8.<init>()
                net.bytebuddy.jar.asm.Label r9 = new net.bytebuddy.jar.asm.Label
                r9.<init>()
                net.bytebuddy.jar.asm.Label r10 = new net.bytebuddy.jar.asm.Label
                r10.<init>()
                net.bytebuddy.jar.asm.Label r11 = new net.bytebuddy.jar.asm.Label
                r11.<init>()
                r12 = 25
                r13 = 1
                r7.visitVarInsn(r12, r13)
                r2 = 199(0xc7, float:2.79E-43)
                r7.visitJumpInsn(r2, r1)
                r7.visitInsn(r13)
                r14 = 176(0xb0, float:2.47E-43)
                r7.visitInsn(r14)
                r7.visitLabel(r1)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r1 = r24.getFrameGeneration()
                net.bytebuddy.description.type.TypeDescription r2 = r24.getInstrumentedType()
                net.bytebuddy.description.method.ParameterList r3 = r25.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r3 = r3.asTypeList()
                java.util.List r2 = net.bytebuddy.utility.CompoundList.of(r2, r3)
                r1.same(r7, r2)
                r7.visitVarInsn(r12, r13)
                r1 = 190(0xbe, float:2.66E-43)
                r7.visitInsn(r1)
                java.lang.Class<java.lang.Object> r15 = java.lang.Object.class
                java.lang.String r2 = net.bytebuddy.jar.asm.Type.getInternalName(r15)
                r3 = 189(0xbd, float:2.65E-43)
                r7.visitTypeInsn(r3, r2)
                r2 = 58
                r6 = 2
                r7.visitVarInsn(r2, r6)
                r5 = 3
                r7.visitInsn(r5)
                r2 = 54
                r7.visitVarInsn(r2, r5)
                r7.visitLabel(r8)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r2 = r24.getFrameGeneration()
                java.lang.Class<java.lang.Object[]> r16 = java.lang.Object[].class
                net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r16)
                java.lang.Class r17 = java.lang.Integer.TYPE
                net.bytebuddy.description.type.TypeDescription r4 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r17)
                net.bytebuddy.description.type.TypeDescription[] r14 = new net.bytebuddy.description.type.TypeDescription[r6]
                r6 = 0
                r14[r6] = r3
                r14[r13] = r4
                java.util.List r3 = java.util.Arrays.asList(r14)
                net.bytebuddy.description.type.TypeDescription r4 = r24.getInstrumentedType()
                net.bytebuddy.description.method.ParameterList r14 = r25.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r14 = r14.asTypeList()
                java.util.List r4 = net.bytebuddy.utility.CompoundList.of(r4, r14)
                r2.append(r7, r3, r4)
                r14 = 21
                r7.visitVarInsn(r14, r5)
                r7.visitVarInsn(r12, r13)
                r7.visitInsn(r1)
                r1 = 162(0xa2, float:2.27E-43)
                r7.visitJumpInsn(r1, r10)
                r4 = 2
                r7.visitVarInsn(r12, r4)
                r7.visitVarInsn(r14, r5)
                r7.visitVarInsn(r12, r13)
                r7.visitVarInsn(r14, r5)
                r3 = 50
                r7.visitInsn(r3)
                java.lang.Class<?> r1 = r0.sourceLabel
                java.lang.String r1 = net.bytebuddy.jar.asm.Type.getInternalName(r1)
                r2 = 193(0xc1, float:2.7E-43)
                r7.visitTypeInsn(r2, r1)
                r1 = 153(0x99, float:2.14E-43)
                r7.visitJumpInsn(r1, r11)
                r7.visitVarInsn(r12, r6)
                r7.visitVarInsn(r12, r13)
                r7.visitVarInsn(r14, r5)
                r7.visitInsn(r3)
                java.lang.Class<?> r1 = r0.sourceLabel
                java.lang.String r1 = net.bytebuddy.jar.asm.Type.getInternalName(r1)
                r2 = 192(0xc0, float:2.69E-43)
                r7.visitTypeInsn(r2, r1)
                net.bytebuddy.description.type.TypeDescription r1 = r24.getInstrumentedType()
                java.lang.String r18 = r1.getInternalName()
                java.lang.Class<?> r1 = r0.targetLabel
                net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r1)
                java.lang.Class<?> r2 = r0.sourceLabel
                net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getType(r2)
                net.bytebuddy.jar.asm.Type[] r2 = new net.bytebuddy.jar.asm.Type[]{r2}
                java.lang.String r19 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r1, r2)
                r20 = 0
                r2 = 183(0xb7, float:2.56E-43)
                java.lang.String r21 = "label"
                r1 = r23
                r3 = r18
                r18 = r4
                r4 = r21
                r5 = r19
                r14 = r18
                r18 = r6
                r6 = r20
                r1.visitMethodInsn(r2, r3, r4, r5, r6)
                r1 = 167(0xa7, float:2.34E-43)
                r7.visitJumpInsn(r1, r9)
                r7.visitLabel(r11)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r2 = r24.getFrameGeneration()
                net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r16)
                net.bytebuddy.description.type.TypeDescription r4 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r17)
                net.bytebuddy.description.type.TypeDescription[] r5 = new net.bytebuddy.description.type.TypeDescription[r14]
                r5[r18] = r3
                r5[r13] = r4
                java.util.List r3 = java.util.Arrays.asList(r5)
                net.bytebuddy.description.type.TypeDescription r4 = r24.getInstrumentedType()
                java.util.List r4 = java.util.Collections.singletonList(r4)
                net.bytebuddy.description.method.ParameterList r5 = r25.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r5 = r5.asTypeList()
                net.bytebuddy.description.type.TypeDescription r6 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r16)
                net.bytebuddy.description.type.TypeDescription r11 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r17)
                net.bytebuddy.description.type.TypeDescription[] r1 = new net.bytebuddy.description.type.TypeDescription[r14]
                r1[r18] = r6
                r1[r13] = r11
                java.util.List r1 = java.util.Arrays.asList(r1)
                java.util.List r1 = net.bytebuddy.utility.CompoundList.of(r4, r5, r1)
                r2.full(r7, r3, r1)
                r7.visitVarInsn(r12, r13)
                r1 = 3
                r2 = 21
                r7.visitVarInsn(r2, r1)
                r2 = 50
                r7.visitInsn(r2)
                r7.visitLabel(r9)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r2 = r24.getFrameGeneration()
                net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r16)
                net.bytebuddy.description.type.TypeDescription r4 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r17)
                net.bytebuddy.description.type.TypeDescription r5 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r15)
                net.bytebuddy.description.type.TypeDescription[] r6 = new net.bytebuddy.description.type.TypeDescription[r1]
                r6[r18] = r3
                r6[r13] = r4
                r6[r14] = r5
                java.util.List r3 = java.util.Arrays.asList(r6)
                net.bytebuddy.description.type.TypeDescription r4 = r24.getInstrumentedType()
                java.util.List r4 = java.util.Collections.singletonList(r4)
                net.bytebuddy.description.method.ParameterList r5 = r25.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r5 = r5.asTypeList()
                net.bytebuddy.description.type.TypeDescription r6 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r16)
                net.bytebuddy.description.type.TypeDescription r9 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r17)
                net.bytebuddy.description.type.TypeDescription[] r11 = new net.bytebuddy.description.type.TypeDescription[r14]
                r11[r18] = r6
                r11[r13] = r9
                java.util.List r6 = java.util.Arrays.asList(r11)
                java.util.List r4 = net.bytebuddy.utility.CompoundList.of(r4, r5, r6)
                r2.full(r7, r3, r4)
                r2 = 83
                r7.visitInsn(r2)
                r7.visitIincInsn(r1, r13)
                r1 = 167(0xa7, float:2.34E-43)
                r7.visitJumpInsn(r1, r8)
                r7.visitLabel(r10)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r1 = r24.getFrameGeneration()
                net.bytebuddy.description.type.TypeDescription r2 = r24.getInstrumentedType()
                java.util.List r2 = java.util.Collections.singletonList(r2)
                net.bytebuddy.description.method.ParameterList r3 = r25.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r3 = r3.asTypeList()
                net.bytebuddy.description.type.TypeDescription r4 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r16)
                java.util.List r4 = java.util.Collections.singletonList(r4)
                java.util.List r2 = net.bytebuddy.utility.CompoundList.of(r2, r3, r4)
                r1.chop(r7, r13, r2)
                r7.visitVarInsn(r12, r14)
                r1 = 176(0xb0, float:2.47E-43)
                r7.visitInsn(r1)
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r1 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                r2 = 5
                r3 = 4
                r1.<init>(r2, r3)
                return r1
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
                java.lang.Class<?> r2 = r4.sourceLabel
                net.bytebuddy.asm.ClassVisitorFactory$FrameTranslator r5 = (net.bytebuddy.asm.ClassVisitorFactory.FrameTranslator) r5
                java.lang.Class<?> r3 = r5.sourceLabel
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                java.lang.Class<?> r2 = r4.targetLabel
                java.lang.Class<?> r5 = r5.targetLabel
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
                java.lang.Class<?> r1 = r2.sourceLabel
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.Class<?> r1 = r2.targetLabel
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class HandleTranslator implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
        protected static final java.lang.String NAME = "handle";
        private final java.lang.Class<?> sourceHandle;
        private final java.lang.Class<?> targetHandle;

        public HandleTranslator(java.lang.Class<?> r1, java.lang.Class<?> r2) {
                r0 = this;
                r0.<init>()
                r0.sourceHandle = r1
                r0.targetHandle = r2
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r12, net.bytebuddy.implementation.Implementation.Context r13, net.bytebuddy.description.method.MethodDescription r14) {
                r11 = this;
                net.bytebuddy.jar.asm.Label r0 = new net.bytebuddy.jar.asm.Label
                r0.<init>()
                r1 = 25
                r2 = 0
                r12.visitVarInsn(r1, r2)
                r3 = 199(0xc7, float:2.79E-43)
                r12.visitJumpInsn(r3, r0)
                r3 = 1
                r12.visitInsn(r3)
                r4 = 176(0xb0, float:2.47E-43)
                r12.visitInsn(r4)
                r12.visitLabel(r0)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r13 = r13.getFrameGeneration()
                net.bytebuddy.description.method.ParameterList r14 = r14.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r14 = r14.asTypeList()
                r13.same(r12, r14)
                java.lang.Class<?> r13 = r11.targetHandle
                java.lang.String r13 = net.bytebuddy.jar.asm.Type.getInternalName(r13)
                r14 = 187(0xbb, float:2.62E-43)
                r12.visitTypeInsn(r14, r13)
                r13 = 89
                r12.visitInsn(r13)
                r12.visitVarInsn(r1, r2)
                java.lang.Class<?> r13 = r11.sourceHandle
                java.lang.String r7 = net.bytebuddy.jar.asm.Type.getInternalName(r13)
                net.bytebuddy.jar.asm.Type r13 = net.bytebuddy.jar.asm.Type.INT_TYPE
                net.bytebuddy.jar.asm.Type[] r14 = new net.bytebuddy.jar.asm.Type[r2]
                java.lang.String r9 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r13, r14)
                r10 = 0
                r6 = 182(0xb6, float:2.55E-43)
                java.lang.String r8 = "getTag"
                r5 = r12
                r5.visitMethodInsn(r6, r7, r8, r9, r10)
                r12.visitVarInsn(r1, r2)
                java.lang.Class<?> r14 = r11.sourceHandle
                java.lang.String r7 = net.bytebuddy.jar.asm.Type.getInternalName(r14)
                java.lang.Class<java.lang.String> r14 = java.lang.String.class
                net.bytebuddy.jar.asm.Type r0 = net.bytebuddy.jar.asm.Type.getType(r14)
                net.bytebuddy.jar.asm.Type[] r5 = new net.bytebuddy.jar.asm.Type[r2]
                java.lang.String r9 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r0, r5)
                java.lang.String r8 = "getOwner"
                r5 = r12
                r5.visitMethodInsn(r6, r7, r8, r9, r10)
                r12.visitVarInsn(r1, r2)
                java.lang.Class<?> r0 = r11.sourceHandle
                java.lang.String r7 = net.bytebuddy.jar.asm.Type.getInternalName(r0)
                net.bytebuddy.jar.asm.Type r0 = net.bytebuddy.jar.asm.Type.getType(r14)
                net.bytebuddy.jar.asm.Type[] r5 = new net.bytebuddy.jar.asm.Type[r2]
                java.lang.String r9 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r0, r5)
                java.lang.String r8 = "getName"
                r5 = r12
                r5.visitMethodInsn(r6, r7, r8, r9, r10)
                r12.visitVarInsn(r1, r2)
                java.lang.Class<?> r0 = r11.sourceHandle
                java.lang.String r7 = net.bytebuddy.jar.asm.Type.getInternalName(r0)
                net.bytebuddy.jar.asm.Type r0 = net.bytebuddy.jar.asm.Type.getType(r14)
                net.bytebuddy.jar.asm.Type[] r5 = new net.bytebuddy.jar.asm.Type[r2]
                java.lang.String r9 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r0, r5)
                java.lang.String r8 = "getDesc"
                r5 = r12
                r5.visitMethodInsn(r6, r7, r8, r9, r10)
                r12.visitVarInsn(r1, r2)
                java.lang.Class<?> r0 = r11.sourceHandle
                java.lang.String r7 = net.bytebuddy.jar.asm.Type.getInternalName(r0)
                net.bytebuddy.jar.asm.Type r0 = net.bytebuddy.jar.asm.Type.BOOLEAN_TYPE
                net.bytebuddy.jar.asm.Type[] r1 = new net.bytebuddy.jar.asm.Type[r2]
                java.lang.String r9 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r0, r1)
                java.lang.String r8 = "isInterface"
                r5.visitMethodInsn(r6, r7, r8, r9, r10)
                java.lang.Class<?> r1 = r11.targetHandle
                java.lang.String r7 = net.bytebuddy.jar.asm.Type.getInternalName(r1)
                net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.VOID_TYPE
                net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getType(r14)
                net.bytebuddy.jar.asm.Type r5 = net.bytebuddy.jar.asm.Type.getType(r14)
                net.bytebuddy.jar.asm.Type r14 = net.bytebuddy.jar.asm.Type.getType(r14)
                net.bytebuddy.jar.asm.Type[] r13 = new net.bytebuddy.jar.asm.Type[]{r13, r2, r5, r14, r0}
                java.lang.String r9 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r1, r13)
                r6 = 183(0xb7, float:2.56E-43)
                java.lang.String r8 = "<init>"
                r5 = r12
                r5.visitMethodInsn(r6, r7, r8, r9, r10)
                r12.visitInsn(r4)
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r12 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                r13 = 7
                r12.<init>(r13, r3)
                return r12
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
                java.lang.Class<?> r2 = r4.sourceHandle
                net.bytebuddy.asm.ClassVisitorFactory$HandleTranslator r5 = (net.bytebuddy.asm.ClassVisitorFactory.HandleTranslator) r5
                java.lang.Class<?> r3 = r5.sourceHandle
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                java.lang.Class<?> r2 = r4.targetHandle
                java.lang.Class<?> r5 = r5.targetHandle
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
                java.lang.Class<?> r1 = r2.sourceHandle
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.Class<?> r1 = r2.targetHandle
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class LabelArrayTranslator implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
        protected static final java.lang.String NAME = "labels";
        private final java.lang.Class<?> sourceLabel;
        private final java.lang.Class<?> targetLabel;

        public LabelArrayTranslator(java.lang.Class<?> r1, java.lang.Class<?> r2) {
                r0 = this;
                r0.<init>()
                r0.sourceLabel = r1
                r0.targetLabel = r2
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r16, net.bytebuddy.implementation.Implementation.Context r17, net.bytebuddy.description.method.MethodDescription r18) {
                r15 = this;
                r0 = r15
                r7 = r16
                net.bytebuddy.jar.asm.Label r1 = new net.bytebuddy.jar.asm.Label
                r1.<init>()
                net.bytebuddy.jar.asm.Label r8 = new net.bytebuddy.jar.asm.Label
                r8.<init>()
                net.bytebuddy.jar.asm.Label r9 = new net.bytebuddy.jar.asm.Label
                r9.<init>()
                r10 = 25
                r11 = 1
                r7.visitVarInsn(r10, r11)
                r2 = 199(0xc7, float:2.79E-43)
                r7.visitJumpInsn(r2, r1)
                r7.visitInsn(r11)
                r12 = 176(0xb0, float:2.47E-43)
                r7.visitInsn(r12)
                r7.visitLabel(r1)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r1 = r17.getFrameGeneration()
                net.bytebuddy.description.type.TypeDescription r2 = r17.getInstrumentedType()
                net.bytebuddy.description.method.ParameterList r3 = r18.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r3 = r3.asTypeList()
                java.util.List r2 = net.bytebuddy.utility.CompoundList.of(r2, r3)
                r1.same(r7, r2)
                r7.visitVarInsn(r10, r11)
                r1 = 190(0xbe, float:2.66E-43)
                r7.visitInsn(r1)
                java.lang.Class<?> r2 = r0.targetLabel
                java.lang.String r2 = net.bytebuddy.jar.asm.Type.getInternalName(r2)
                r3 = 189(0xbd, float:2.65E-43)
                r7.visitTypeInsn(r3, r2)
                r2 = 58
                r13 = 2
                r7.visitVarInsn(r2, r13)
                r14 = 3
                r7.visitInsn(r14)
                r2 = 54
                r7.visitVarInsn(r2, r14)
                r7.visitLabel(r8)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r2 = r17.getFrameGeneration()
                java.lang.Class<?> r3 = r0.targetLabel
                net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
                net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ArrayProjection.of(r3)
                java.lang.Class r4 = java.lang.Integer.TYPE
                net.bytebuddy.description.type.TypeDescription r4 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r4)
                net.bytebuddy.description.type.TypeDescription[] r5 = new net.bytebuddy.description.type.TypeDescription[r13]
                r6 = 0
                r5[r6] = r3
                r5[r11] = r4
                java.util.List r3 = java.util.Arrays.asList(r5)
                net.bytebuddy.description.type.TypeDescription r4 = r17.getInstrumentedType()
                net.bytebuddy.description.method.ParameterList r5 = r18.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r5 = r5.asTypeList()
                java.util.List r4 = net.bytebuddy.utility.CompoundList.of(r4, r5)
                r2.append(r7, r3, r4)
                r2 = 21
                r7.visitVarInsn(r2, r14)
                r7.visitVarInsn(r10, r11)
                r7.visitInsn(r1)
                r1 = 162(0xa2, float:2.27E-43)
                r7.visitJumpInsn(r1, r9)
                r7.visitVarInsn(r10, r13)
                r7.visitVarInsn(r2, r14)
                r7.visitVarInsn(r10, r6)
                r7.visitVarInsn(r10, r11)
                r7.visitVarInsn(r2, r14)
                r1 = 50
                r7.visitInsn(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r17.getInstrumentedType()
                java.lang.String r3 = r1.getInternalName()
                java.lang.Class<?> r1 = r0.targetLabel
                net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r1)
                java.lang.Class<?> r2 = r0.sourceLabel
                net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getType(r2)
                net.bytebuddy.jar.asm.Type[] r2 = new net.bytebuddy.jar.asm.Type[]{r2}
                java.lang.String r5 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r1, r2)
                r2 = 183(0xb7, float:2.56E-43)
                java.lang.String r4 = "label"
                r1 = r16
                r1.visitMethodInsn(r2, r3, r4, r5, r6)
                r1 = 83
                r7.visitInsn(r1)
                r7.visitIincInsn(r14, r11)
                r1 = 167(0xa7, float:2.34E-43)
                r7.visitJumpInsn(r1, r8)
                r7.visitLabel(r9)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r1 = r17.getFrameGeneration()
                net.bytebuddy.description.type.TypeDescription r2 = r17.getInstrumentedType()
                java.util.List r2 = java.util.Collections.singletonList(r2)
                net.bytebuddy.description.method.ParameterList r3 = r18.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r3 = r3.asTypeList()
                java.lang.Class<?> r4 = r0.targetLabel
                net.bytebuddy.description.type.TypeDescription r4 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r4)
                net.bytebuddy.description.type.TypeDescription r4 = net.bytebuddy.description.type.TypeDescription.ArrayProjection.of(r4)
                java.util.List r4 = java.util.Collections.singletonList(r4)
                java.util.List r2 = net.bytebuddy.utility.CompoundList.of(r2, r3, r4)
                r1.chop(r7, r11, r2)
                r7.visitVarInsn(r10, r13)
                r7.visitInsn(r12)
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r1 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                r2 = 5
                r3 = 4
                r1.<init>(r2, r3)
                return r1
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
                java.lang.Class<?> r2 = r4.sourceLabel
                net.bytebuddy.asm.ClassVisitorFactory$LabelArrayTranslator r5 = (net.bytebuddy.asm.ClassVisitorFactory.LabelArrayTranslator) r5
                java.lang.Class<?> r3 = r5.sourceLabel
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                java.lang.Class<?> r2 = r4.targetLabel
                java.lang.Class<?> r5 = r5.targetLabel
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
                java.lang.Class<?> r1 = r2.sourceLabel
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.Class<?> r1 = r2.targetLabel
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class LabelTranslator implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
        protected static final java.lang.String NAME = "label";
        private final java.lang.Class<?> target;

        public LabelTranslator(java.lang.Class<?> r1) {
                r0 = this;
                r0.<init>()
                r0.target = r1
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r19, net.bytebuddy.implementation.Implementation.Context r20, net.bytebuddy.description.method.MethodDescription r21) {
                r18 = this;
                r0 = r18
                r7 = r19
                net.bytebuddy.jar.asm.Label r1 = new net.bytebuddy.jar.asm.Label
                r1.<init>()
                net.bytebuddy.jar.asm.Label r8 = new net.bytebuddy.jar.asm.Label
                r8.<init>()
                r9 = 25
                r10 = 1
                r7.visitVarInsn(r9, r10)
                r11 = 199(0xc7, float:2.79E-43)
                r7.visitJumpInsn(r11, r1)
                r7.visitInsn(r10)
                r12 = 176(0xb0, float:2.47E-43)
                r7.visitInsn(r12)
                r7.visitLabel(r1)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r1 = r20.getFrameGeneration()
                net.bytebuddy.description.type.TypeDescription r2 = r20.getInstrumentedType()
                net.bytebuddy.description.method.ParameterList r3 = r21.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r3 = r3.asTypeList()
                java.util.List r2 = net.bytebuddy.utility.CompoundList.of(r2, r3)
                r1.same(r7, r2)
                r13 = 0
                r7.visitVarInsn(r9, r13)
                net.bytebuddy.description.type.TypeDescription r1 = r20.getInstrumentedType()
                java.lang.String r1 = r1.getInternalName()
                java.lang.Class<java.util.Map> r14 = java.util.Map.class
                java.lang.String r2 = net.bytebuddy.jar.asm.Type.getDescriptor(r14)
                r15 = 180(0xb4, float:2.52E-43)
                java.lang.String r6 = "labels"
                r7.visitFieldInsn(r15, r1, r6, r2)
                r7.visitVarInsn(r9, r10)
                java.lang.String r3 = net.bytebuddy.jar.asm.Type.getInternalName(r14)
                java.lang.Class<java.lang.Object> r16 = java.lang.Object.class
                net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r16)
                net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getType(r16)
                net.bytebuddy.jar.asm.Type[] r2 = new net.bytebuddy.jar.asm.Type[]{r2}
                java.lang.String r5 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r1, r2)
                r17 = 1
                r2 = 185(0xb9, float:2.59E-43)
                java.lang.String r4 = "get"
                r1 = r19
                r12 = r6
                r6 = r17
                r1.visitMethodInsn(r2, r3, r4, r5, r6)
                java.lang.Class<?> r1 = r0.target
                java.lang.String r1 = net.bytebuddy.jar.asm.Type.getInternalName(r1)
                r2 = 192(0xc0, float:2.69E-43)
                r7.visitTypeInsn(r2, r1)
                r6 = 58
                r5 = 2
                r7.visitVarInsn(r6, r5)
                r7.visitVarInsn(r9, r5)
                r7.visitJumpInsn(r11, r8)
                java.lang.Class<?> r1 = r0.target
                java.lang.String r1 = net.bytebuddy.jar.asm.Type.getInternalName(r1)
                r2 = 187(0xbb, float:2.62E-43)
                r7.visitTypeInsn(r2, r1)
                r1 = 89
                r7.visitInsn(r1)
                java.lang.Class<?> r1 = r0.target
                java.lang.String r3 = net.bytebuddy.jar.asm.Type.getInternalName(r1)
                java.lang.String r11 = "()V"
                r17 = 0
                r2 = 183(0xb7, float:2.56E-43)
                java.lang.String r4 = "<init>"
                r1 = r19
                r10 = r5
                r5 = r11
                r11 = r6
                r6 = r17
                r1.visitMethodInsn(r2, r3, r4, r5, r6)
                r7.visitVarInsn(r11, r10)
                r7.visitVarInsn(r9, r13)
                net.bytebuddy.description.type.TypeDescription r1 = r20.getInstrumentedType()
                java.lang.String r1 = r1.getInternalName()
                java.lang.String r2 = net.bytebuddy.jar.asm.Type.getDescriptor(r14)
                r7.visitFieldInsn(r15, r1, r12, r2)
                r1 = 1
                r7.visitVarInsn(r9, r1)
                r7.visitVarInsn(r9, r10)
                java.lang.String r3 = net.bytebuddy.jar.asm.Type.getInternalName(r14)
                net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r16)
                net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getType(r16)
                net.bytebuddy.jar.asm.Type r4 = net.bytebuddy.jar.asm.Type.getType(r16)
                net.bytebuddy.jar.asm.Type[] r2 = new net.bytebuddy.jar.asm.Type[]{r2, r4}
                java.lang.String r5 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r1, r2)
                r6 = 1
                r2 = 185(0xb9, float:2.59E-43)
                java.lang.String r4 = "put"
                r1 = r19
                r1.visitMethodInsn(r2, r3, r4, r5, r6)
                r1 = 87
                r7.visitInsn(r1)
                r7.visitLabel(r8)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r1 = r20.getFrameGeneration()
                java.lang.Class<?> r2 = r0.target
                net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r2)
                java.util.List r2 = java.util.Collections.singletonList(r2)
                net.bytebuddy.description.type.TypeDescription r3 = r20.getInstrumentedType()
                net.bytebuddy.description.method.ParameterList r4 = r21.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r4 = r4.asTypeList()
                java.util.List r3 = net.bytebuddy.utility.CompoundList.of(r3, r4)
                r1.append(r7, r2, r3)
                r7.visitVarInsn(r9, r10)
                r1 = 176(0xb0, float:2.47E-43)
                r7.visitInsn(r1)
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r1 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                r2 = 3
                r1.<init>(r2, r2)
                return r1
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
                java.lang.Class<?> r2 = r4.target
                net.bytebuddy.asm.ClassVisitorFactory$LabelTranslator r5 = (net.bytebuddy.asm.ClassVisitorFactory.LabelTranslator) r5
                java.lang.Class<?> r5 = r5.target
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
                java.lang.Class<?> r1 = r2.target
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class NullCheckedConstruction implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
        private final java.lang.Class<?> type;

        public NullCheckedConstruction(java.lang.Class<?> r1) {
                r0 = this;
                r0.<init>()
                r0.type = r1
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r10, net.bytebuddy.implementation.Implementation.Context r11, net.bytebuddy.description.method.MethodDescription r12) {
                r9 = this;
                r0 = 25
                r1 = 0
                r10.visitVarInsn(r0, r1)
                net.bytebuddy.jar.asm.Label r2 = new net.bytebuddy.jar.asm.Label
                r2.<init>()
                r3 = 198(0xc6, float:2.77E-43)
                r10.visitJumpInsn(r3, r2)
                net.bytebuddy.description.type.TypeDescription r3 = r11.getInstrumentedType()
                java.lang.String r3 = r3.getInternalName()
                r4 = 187(0xbb, float:2.62E-43)
                r10.visitTypeInsn(r4, r3)
                r3 = 89
                r10.visitInsn(r3)
                r10.visitVarInsn(r0, r1)
                net.bytebuddy.description.type.TypeDescription r0 = r11.getInstrumentedType()
                java.lang.String r5 = r0.getInternalName()
                net.bytebuddy.jar.asm.Type r0 = net.bytebuddy.jar.asm.Type.VOID_TYPE
                java.lang.Class<?> r1 = r9.type
                net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r1)
                net.bytebuddy.jar.asm.Type[] r1 = new net.bytebuddy.jar.asm.Type[]{r1}
                java.lang.String r7 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r0, r1)
                r8 = 0
                r4 = 183(0xb7, float:2.56E-43)
                java.lang.String r6 = "<init>"
                r3 = r10
                r3.visitMethodInsn(r4, r5, r6, r7, r8)
                r0 = 176(0xb0, float:2.47E-43)
                r10.visitInsn(r0)
                r10.visitLabel(r2)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r11 = r11.getFrameGeneration()
                net.bytebuddy.description.method.ParameterList r12 = r12.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r12 = r12.asTypeList()
                r11.same(r10, r12)
                r11 = 1
                r10.visitInsn(r11)
                r10.visitInsn(r0)
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r10 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                r12 = 3
                r10.<init>(r12, r11)
                return r10
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
                java.lang.Class<?> r2 = r4.type
                net.bytebuddy.asm.ClassVisitorFactory$NullCheckedConstruction r5 = (net.bytebuddy.asm.ClassVisitorFactory.NullCheckedConstruction) r5
                java.lang.Class<?> r5 = r5.type
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
                java.lang.Class<?> r1 = r2.type
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class TypePathTranslator implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
        protected static final java.lang.String NAME = "typePath";
        private final java.lang.Class<?> sourceTypePath;
        private final java.lang.Class<?> targetTypePath;

        public TypePathTranslator(java.lang.Class<?> r1, java.lang.Class<?> r2) {
                r0 = this;
                r0.<init>()
                r0.sourceTypePath = r1
                r0.targetTypePath = r2
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r12, net.bytebuddy.implementation.Implementation.Context r13, net.bytebuddy.description.method.MethodDescription r14) {
                r11 = this;
                net.bytebuddy.jar.asm.Label r0 = new net.bytebuddy.jar.asm.Label
                r0.<init>()
                net.bytebuddy.jar.asm.Label r1 = new net.bytebuddy.jar.asm.Label
                r1.<init>()
                r2 = 25
                r3 = 0
                r12.visitVarInsn(r2, r3)
                r4 = 199(0xc7, float:2.79E-43)
                r12.visitJumpInsn(r4, r0)
                r4 = 1
                r12.visitInsn(r4)
                r5 = 167(0xa7, float:2.34E-43)
                r12.visitJumpInsn(r5, r1)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r5 = r13.getFrameGeneration()
                net.bytebuddy.description.method.ParameterList r6 = r14.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r6 = r6.asTypeList()
                r5.same(r12, r6)
                r12.visitLabel(r0)
                r12.visitVarInsn(r2, r3)
                java.lang.Class<?> r0 = r11.sourceTypePath
                java.lang.String r7 = net.bytebuddy.jar.asm.Type.getInternalName(r0)
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getType(r0)
                net.bytebuddy.jar.asm.Type[] r3 = new net.bytebuddy.jar.asm.Type[r3]
                java.lang.String r9 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r2, r3)
                r10 = 0
                r6 = 182(0xb6, float:2.55E-43)
                java.lang.String r8 = "toString"
                r5 = r12
                r5.visitMethodInsn(r6, r7, r8, r9, r10)
                java.lang.Class<?> r2 = r11.targetTypePath
                java.lang.String r7 = net.bytebuddy.jar.asm.Type.getInternalName(r2)
                java.lang.Class<?> r2 = r11.targetTypePath
                net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getType(r2)
                net.bytebuddy.jar.asm.Type r0 = net.bytebuddy.jar.asm.Type.getType(r0)
                net.bytebuddy.jar.asm.Type[] r0 = new net.bytebuddy.jar.asm.Type[]{r0}
                java.lang.String r9 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r2, r0)
                r6 = 184(0xb8, float:2.58E-43)
                java.lang.String r8 = "fromString"
                r5.visitMethodInsn(r6, r7, r8, r9, r10)
                r12.visitLabel(r1)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r13 = r13.getFrameGeneration()
                java.lang.Class<?> r0 = r11.targetTypePath
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.method.ParameterList r14 = r14.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r14 = r14.asTypeList()
                r13.same1(r12, r0, r14)
                r13 = 176(0xb0, float:2.47E-43)
                r12.visitInsn(r13)
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r12 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                r13 = 2
                r12.<init>(r4, r13)
                return r12
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
                java.lang.Class<?> r2 = r4.sourceTypePath
                net.bytebuddy.asm.ClassVisitorFactory$TypePathTranslator r5 = (net.bytebuddy.asm.ClassVisitorFactory.TypePathTranslator) r5
                java.lang.Class<?> r3 = r5.sourceTypePath
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                java.lang.Class<?> r2 = r4.targetTypePath
                java.lang.Class<?> r5 = r5.targetTypePath
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
                java.lang.Class<?> r1 = r2.sourceTypePath
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.Class<?> r1 = r2.targetTypePath
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    static {
            r0 = 0
            java.lang.String r1 = "java.security.AccessController"
            r2 = 0
            java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            java.lang.String r1 = "net.bytebuddy.securitymanager"
            java.lang.String r2 = "true"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            net.bytebuddy.asm.ClassVisitorFactory.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            goto L19
        L16:
            r0 = 1
        L17:
            net.bytebuddy.asm.ClassVisitorFactory.ACCESS_CONTROLLER = r0
        L19:
            return
    }

    public ClassVisitorFactory(java.lang.Class<?> r1) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            return
    }

    public static /* synthetic */ net.bytebuddy.dynamic.DynamicType.Builder access$000(net.bytebuddy.ByteBuddy r0, java.lang.Class r1, java.lang.Class r2, java.lang.Class r3, java.lang.Class r4, java.lang.Class r5, java.lang.Class r6, java.lang.Class r7, java.lang.Class r8, java.lang.Class r9, java.lang.Class r10, java.lang.Class r11, java.lang.Class r12) throws java.lang.Exception {
            net.bytebuddy.dynamic.DynamicType$Builder r0 = toMethodVisitorBuilder(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
    }

    public static /* synthetic */ net.bytebuddy.dynamic.DynamicType.Builder access$100(net.bytebuddy.ByteBuddy r0, java.lang.Class r1, java.lang.Class r2, java.lang.Class r3, java.lang.Class r4, net.bytebuddy.implementation.Implementation r5) throws java.lang.Exception {
            net.bytebuddy.dynamic.DynamicType$Builder r0 = toVisitorBuilder(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static /* synthetic */ net.bytebuddy.dynamic.DynamicType access$200(net.bytebuddy.dynamic.DynamicType.Builder r0, java.lang.Class r1, java.lang.Class r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.type.TypeDescription r4) throws java.lang.Exception {
            net.bytebuddy.dynamic.DynamicType r0 = toAttributeWrapper(r0, r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory access$300(net.bytebuddy.description.type.TypeDescription r0, java.lang.Class r1, java.lang.String r2, int r3, boolean r4) {
            net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory r0 = toConvertedParameter(r0, r1, r2, r3, r4)
            return r0
    }

    @net.bytebuddy.build.AccessControllerPlugin.Enhance
    private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
            boolean r0 = net.bytebuddy.asm.ClassVisitorFactory.ACCESS_CONTROLLER
            if (r0 == 0) goto L9
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
            return r1
        L9:
            java.lang.Object r1 = r1.run()
            return r1
    }

    public static <S> net.bytebuddy.asm.ClassVisitorFactory<S> of(java.lang.Class<S> r2) {
            net.bytebuddy.ByteBuddy r0 = new net.bytebuddy.ByteBuddy
            r0.<init>()
            net.bytebuddy.dynamic.scaffold.TypeValidation r1 = net.bytebuddy.dynamic.scaffold.TypeValidation.DISABLED
            net.bytebuddy.ByteBuddy r0 = r0.with(r1)
            net.bytebuddy.asm.ClassVisitorFactory r2 = of(r2, r0)
            return r2
    }

    public static <S> net.bytebuddy.asm.ClassVisitorFactory<S> of(java.lang.Class<S> r1, net.bytebuddy.ByteBuddy r2) {
            net.bytebuddy.asm.ClassVisitorFactory$CreateClassVisitorFactory r0 = new net.bytebuddy.asm.ClassVisitorFactory$CreateClassVisitorFactory
            r0.<init>(r1, r2)
            java.lang.Object r1 = doPrivileged(r0)
            net.bytebuddy.asm.ClassVisitorFactory r1 = (net.bytebuddy.asm.ClassVisitorFactory) r1
            return r1
    }

    private static net.bytebuddy.dynamic.DynamicType toAttributeWrapper(net.bytebuddy.dynamic.DynamicType.Builder<?> r11, java.lang.Class<?> r12, java.lang.Class<?> r13, net.bytebuddy.description.type.TypeDescription r14, net.bytebuddy.description.type.TypeDescription r15) throws java.lang.Exception {
            net.bytebuddy.description.modifier.Visibility r0 = net.bytebuddy.description.modifier.Visibility.PUBLIC
            r1 = 2
            net.bytebuddy.description.modifier.ModifierContributor$ForField[] r2 = new net.bytebuddy.description.modifier.ModifierContributor.ForField[r1]
            r3 = 0
            r2[r3] = r0
            net.bytebuddy.description.modifier.FieldManifestation r4 = net.bytebuddy.description.modifier.FieldManifestation.FINAL
            r5 = 1
            r2[r5] = r4
            java.lang.String r4 = "delegate"
            net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional$Valuable r11 = r11.defineField(r4, r13, r2)
            net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r2 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r5]
            r2[r3] = r0
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r11 = r11.defineConstructor(r2)
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r5]
            r2[r3] = r13
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r11 = r11.withParameters(r2)
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Class[] r6 = new java.lang.Class[]{r2}
            java.lang.reflect.Constructor r6 = r12.getDeclaredConstructor(r6)
            net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r6 = net.bytebuddy.implementation.MethodCall.invoke(r6)
            net.bytebuddy.implementation.MethodCall r6 = r6.onSuper()
            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r7 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r8 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.REFERENCE
            net.bytebuddy.implementation.bytecode.StackManipulation r8 = r8.loadFrom(r5)
            net.bytebuddy.description.field.FieldDescription$ForLoadedField r9 = new net.bytebuddy.description.field.FieldDescription$ForLoadedField
            java.lang.String r10 = "type"
            java.lang.reflect.Field r10 = r13.getField(r10)
            r9.<init>(r10)
            net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r9 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r9)
            net.bytebuddy.implementation.bytecode.StackManipulation r9 = r9.read()
            net.bytebuddy.implementation.bytecode.StackManipulation[] r10 = new net.bytebuddy.implementation.bytecode.StackManipulation[r1]
            r10[r3] = r8
            r10[r5] = r9
            r7.<init>(r10)
            net.bytebuddy.implementation.MethodCall r2 = r6.with(r7, r2)
            net.bytebuddy.implementation.FieldAccessor$OwnerTypeLocatable r6 = net.bytebuddy.implementation.FieldAccessor.ofField(r4)
            net.bytebuddy.implementation.Implementation$Composable r6 = r6.setsArgumentAt(r3)
            net.bytebuddy.implementation.Implementation$Composable r2 = r2.andThen(r6)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r11 = r11.intercept(r2)
            net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r1 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r1]
            r1[r3] = r0
            net.bytebuddy.description.modifier.Ownership r0 = net.bytebuddy.description.modifier.Ownership.STATIC
            r1[r5] = r0
            java.lang.String r0 = "attribute"
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r11 = r11.defineMethod(r0, r12, r1)
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r5]
            r0[r3] = r13
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r11 = r11.withParameters(r0)
            net.bytebuddy.implementation.Implementation$Simple r0 = new net.bytebuddy.implementation.Implementation$Simple
            net.bytebuddy.asm.ClassVisitorFactory$AttributeTranslator r1 = new net.bytebuddy.asm.ClassVisitorFactory$AttributeTranslator
            r1.<init>(r12, r13, r14, r15)
            net.bytebuddy.implementation.bytecode.ByteCodeAppender[] r12 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender[r5]
            r12[r3] = r1
            r0.<init>(r12)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r11 = r11.intercept(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r12 = net.bytebuddy.matcher.ElementMatchers.isProtected()
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r11 = r11.method(r12)
            java.lang.Class<java.lang.UnsupportedOperationException> r12 = java.lang.UnsupportedOperationException.class
            net.bytebuddy.implementation.Implementation r12 = net.bytebuddy.implementation.ExceptionMethod.throwing(r12)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r11 = r11.intercept(r12)
            java.lang.String r12 = "isUnknown"
            net.bytebuddy.matcher.ElementMatcher$Junction r14 = net.bytebuddy.matcher.ElementMatchers.named(r12)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r11 = r11.method(r14)
            r14 = 0
            java.lang.reflect.Method r12 = r13.getMethod(r12, r14)
            net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r12 = net.bytebuddy.implementation.MethodCall.invoke(r12)
            net.bytebuddy.implementation.MethodCall r12 = r12.onField(r4)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r11 = r11.intercept(r12)
            java.lang.String r12 = "isCodeAttribute"
            net.bytebuddy.matcher.ElementMatcher$Junction r15 = net.bytebuddy.matcher.ElementMatchers.named(r12)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r11 = r11.method(r15)
            java.lang.reflect.Method r12 = r13.getMethod(r12, r14)
            net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r12 = net.bytebuddy.implementation.MethodCall.invoke(r12)
            net.bytebuddy.implementation.MethodCall r12 = r12.onField(r4)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r11 = r11.intercept(r12)
            net.bytebuddy.dynamic.DynamicType$Unloaded r11 = r11.make()
            return r11
    }

    private static net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory toConvertedParameter(net.bytebuddy.description.type.TypeDescription r3, java.lang.Class<?> r4, java.lang.String r5, int r6, boolean r7) {
            net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForStackManipulation r0 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForStackManipulation
            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r1 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
            if (r7 == 0) goto Lb
            net.bytebuddy.implementation.bytecode.StackManipulation r7 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
            goto Ld
        Lb:
            net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r7 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
        Ld:
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r2 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.REFERENCE
            net.bytebuddy.implementation.bytecode.StackManipulation r6 = r2.loadFrom(r6)
            net.bytebuddy.description.method.MethodList r3 = r3.getDeclaredMethods()
            net.bytebuddy.matcher.ElementMatcher$Junction r5 = net.bytebuddy.matcher.ElementMatchers.named(r5)
            net.bytebuddy.matcher.FilterableList r3 = r3.filter(r5)
            net.bytebuddy.description.method.MethodList r3 = (net.bytebuddy.description.method.MethodList) r3
            java.lang.Object r3 = r3.getOnly()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r3
            net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r3 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r3)
            r5 = 3
            net.bytebuddy.implementation.bytecode.StackManipulation[] r5 = new net.bytebuddy.implementation.bytecode.StackManipulation[r5]
            r2 = 0
            r5[r2] = r7
            r7 = 1
            r5[r7] = r6
            r6 = 2
            r5[r6] = r3
            r1.<init>(r5)
            r0.<init>(r1, r4)
            return r0
    }

    private static net.bytebuddy.dynamic.DynamicType.Builder<?> toMethodVisitorBuilder(net.bytebuddy.ByteBuddy r20, java.lang.Class<?> r21, java.lang.Class<?> r22, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Class<?> r23, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Class<?> r24, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Class<?> r25, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Class<?> r26, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Class<?> r27, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Class<?> r28, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Class<?> r29, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Class<?> r30, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Class<?> r31, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Class<?> r32) throws java.lang.Exception {
            r0 = r25
            r1 = r26
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            java.lang.String r6 = "labels"
            net.bytebuddy.implementation.FieldAccessor$OwnerTypeLocatable r7 = net.bytebuddy.implementation.FieldAccessor.ofField(r6)
            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r8 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
            java.lang.Class<java.util.HashMap> r9 = java.util.HashMap.class
            net.bytebuddy.description.type.TypeDescription r10 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r9)
            net.bytebuddy.implementation.bytecode.StackManipulation r10 = net.bytebuddy.implementation.bytecode.TypeCreation.of(r10)
            net.bytebuddy.description.type.TypeDescription r9 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r9)
            net.bytebuddy.description.method.MethodList r9 = r9.getDeclaredMethods()
            net.bytebuddy.matcher.ElementMatcher$Junction r11 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
            r12 = 0
            net.bytebuddy.matcher.ElementMatcher$Junction r13 = net.bytebuddy.matcher.ElementMatchers.takesArguments(r12)
            net.bytebuddy.matcher.ElementMatcher$Junction r11 = r11.and(r13)
            net.bytebuddy.matcher.FilterableList r9 = r9.filter(r11)
            net.bytebuddy.description.method.MethodList r9 = (net.bytebuddy.description.method.MethodList) r9
            java.lang.Object r9 = r9.getOnly()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r9 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r9
            net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r9 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r9)
            r11 = 3
            net.bytebuddy.implementation.bytecode.StackManipulation[] r11 = new net.bytebuddy.implementation.bytecode.StackManipulation[r11]
            r11[r12] = r10
            net.bytebuddy.implementation.bytecode.Duplication r10 = net.bytebuddy.implementation.bytecode.Duplication.SINGLE
            r13 = 1
            r11[r13] = r10
            r10 = 2
            r11[r10] = r9
            r8.<init>(r11)
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            net.bytebuddy.implementation.Implementation$Composable r19 = r7.setsValue(r8, r9)
            r14 = r20
            r15 = r21
            r16 = r22
            r17 = r23
            r18 = r24
            net.bytebuddy.dynamic.DynamicType$Builder r7 = toVisitorBuilder(r14, r15, r16, r17, r18, r19)
            java.lang.Class<java.lang.Object[]> r8 = java.lang.Object[].class
            if (r0 == 0) goto Lf5
            if (r1 == 0) goto Lf5
            net.bytebuddy.description.modifier.Visibility r11 = net.bytebuddy.description.modifier.Visibility.PRIVATE
            net.bytebuddy.description.modifier.ModifierContributor$ForField[] r14 = new net.bytebuddy.description.modifier.ModifierContributor.ForField[r10]
            r14[r12] = r11
            net.bytebuddy.description.modifier.FieldManifestation r15 = net.bytebuddy.description.modifier.FieldManifestation.FINAL
            r14[r13] = r15
            net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional$Valuable r7 = r7.defineField(r6, r9, r14)
            java.lang.String r9 = "label"
            net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r14 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r13]
            r14[r12] = r11
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r7 = r7.defineMethod(r9, r1, r14)
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r13]
            r9[r12] = r0
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r7 = r7.withParameters(r9)
            net.bytebuddy.implementation.Implementation$Simple r9 = new net.bytebuddy.implementation.Implementation$Simple
            net.bytebuddy.asm.ClassVisitorFactory$LabelTranslator r14 = new net.bytebuddy.asm.ClassVisitorFactory$LabelTranslator
            r14.<init>(r1)
            net.bytebuddy.implementation.bytecode.ByteCodeAppender[] r15 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender[r13]
            r15[r12] = r14
            r9.<init>(r15)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r7 = r7.intercept(r9)
            net.bytebuddy.description.type.TypeDescription r9 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r26)
            net.bytebuddy.description.type.TypeDescription r9 = net.bytebuddy.description.type.TypeDescription.ArrayProjection.of(r9)
            net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r14 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r13]
            r14[r12] = r11
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r6 = r7.defineMethod(r6, r9, r14)
            net.bytebuddy.description.type.TypeDescription r7 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r25)
            net.bytebuddy.description.type.TypeDescription r7 = net.bytebuddy.description.type.TypeDescription.ArrayProjection.of(r7)
            net.bytebuddy.description.type.TypeDefinition[] r9 = new net.bytebuddy.description.type.TypeDefinition[r13]
            r9[r12] = r7
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r6 = r6.withParameters(r9)
            net.bytebuddy.implementation.Implementation$Simple r7 = new net.bytebuddy.implementation.Implementation$Simple
            net.bytebuddy.asm.ClassVisitorFactory$LabelArrayTranslator r9 = new net.bytebuddy.asm.ClassVisitorFactory$LabelArrayTranslator
            r9.<init>(r0, r1)
            net.bytebuddy.implementation.bytecode.ByteCodeAppender[] r14 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender[r13]
            r14[r12] = r9
            r7.<init>(r14)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r6 = r6.intercept(r7)
            java.lang.String r7 = "frames"
            net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r9 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r13]
            r9[r12] = r11
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r6 = r6.defineMethod(r7, r8, r9)
            java.lang.reflect.Type[] r7 = new java.lang.reflect.Type[r13]
            r7[r12] = r8
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r6 = r6.withParameters(r7)
            net.bytebuddy.implementation.Implementation$Simple r7 = new net.bytebuddy.implementation.Implementation$Simple
            net.bytebuddy.asm.ClassVisitorFactory$FrameTranslator r9 = new net.bytebuddy.asm.ClassVisitorFactory$FrameTranslator
            r9.<init>(r0, r1)
            net.bytebuddy.implementation.bytecode.ByteCodeAppender[] r0 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender[r13]
            r0[r12] = r9
            r7.<init>(r0)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r7 = r6.intercept(r7)
        Lf5:
            if (r2 == 0) goto L123
            if (r3 == 0) goto L123
            net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r0 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r10]
            net.bytebuddy.description.modifier.Visibility r1 = net.bytebuddy.description.modifier.Visibility.PRIVATE
            r0[r12] = r1
            net.bytebuddy.description.modifier.Ownership r1 = net.bytebuddy.description.modifier.Ownership.STATIC
            r0[r13] = r1
            java.lang.String r1 = "handle"
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r0 = r7.defineMethod(r1, r3, r0)
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r13]
            r1[r12] = r2
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r0 = r0.withParameters(r1)
            net.bytebuddy.implementation.Implementation$Simple r1 = new net.bytebuddy.implementation.Implementation$Simple
            net.bytebuddy.asm.ClassVisitorFactory$HandleTranslator r6 = new net.bytebuddy.asm.ClassVisitorFactory$HandleTranslator
            r6.<init>(r2, r3)
            net.bytebuddy.implementation.bytecode.ByteCodeAppender[] r7 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender[r13]
            r7[r12] = r6
            r1.<init>(r7)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r7 = r0.intercept(r1)
        L123:
            if (r4 == 0) goto L155
            if (r5 == 0) goto L155
            if (r2 == 0) goto L155
            if (r3 == 0) goto L155
            net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r0 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r10]
            net.bytebuddy.description.modifier.Visibility r1 = net.bytebuddy.description.modifier.Visibility.PRIVATE
            r0[r12] = r1
            net.bytebuddy.description.modifier.Ownership r1 = net.bytebuddy.description.modifier.Ownership.STATIC
            r0[r13] = r1
            java.lang.String r1 = "constantDyanmic"
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r0 = r7.defineMethod(r1, r5, r0)
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r13]
            r1[r12] = r4
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r0 = r0.withParameters(r1)
            net.bytebuddy.implementation.Implementation$Simple r1 = new net.bytebuddy.implementation.Implementation$Simple
            net.bytebuddy.asm.ClassVisitorFactory$ConstantDynamicTranslator r6 = new net.bytebuddy.asm.ClassVisitorFactory$ConstantDynamicTranslator
            r6.<init>(r4, r5, r2, r3)
            net.bytebuddy.implementation.bytecode.ByteCodeAppender[] r7 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender[r13]
            r7[r12] = r6
            r1.<init>(r7)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r7 = r0.intercept(r1)
        L155:
            net.bytebuddy.description.modifier.Visibility r0 = net.bytebuddy.description.modifier.Visibility.PRIVATE
            net.bytebuddy.description.modifier.Ownership r1 = net.bytebuddy.description.modifier.Ownership.STATIC
            net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r6 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r10]
            r6[r12] = r0
            r6[r13] = r1
            java.lang.String r9 = "constant"
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r6 = r7.defineMethod(r9, r11, r6)
            java.lang.reflect.Type[] r7 = new java.lang.reflect.Type[r13]
            r7[r12] = r11
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r6 = r6.withParameters(r7)
            net.bytebuddy.implementation.Implementation$Simple r7 = new net.bytebuddy.implementation.Implementation$Simple
            net.bytebuddy.asm.ClassVisitorFactory$ConstantTranslator r9 = new net.bytebuddy.asm.ClassVisitorFactory$ConstantTranslator
            r20 = r9
            r21 = r29
            r22 = r30
            r23 = r27
            r24 = r28
            r25 = r31
            r26 = r32
            r20.<init>(r21, r22, r23, r24, r25, r26)
            net.bytebuddy.implementation.bytecode.ByteCodeAppender[] r2 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender[r13]
            r2[r12] = r9
            r7.<init>(r2)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r2 = r6.intercept(r7)
            java.lang.String r3 = "constants"
            net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r4 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r10]
            r4[r12] = r0
            r4[r13] = r1
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r0 = r2.defineMethod(r3, r8, r4)
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r13]
            r1[r12] = r8
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r0 = r0.withParameters(r1)
            net.bytebuddy.implementation.Implementation$Simple r1 = new net.bytebuddy.implementation.Implementation$Simple
            net.bytebuddy.asm.ClassVisitorFactory$ConstantArrayTranslator r2 = new net.bytebuddy.asm.ClassVisitorFactory$ConstantArrayTranslator
            r2.<init>()
            net.bytebuddy.implementation.bytecode.ByteCodeAppender[] r3 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender[r13]
            r3[r12] = r2
            r1.<init>(r3)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r0 = r0.intercept(r1)
            return r0
    }

    private static net.bytebuddy.dynamic.DynamicType.Builder<?> toVisitorBuilder(net.bytebuddy.ByteBuddy r8, java.lang.Class<?> r9, java.lang.Class<?> r10, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Class<?> r11, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Class<?> r12, net.bytebuddy.implementation.Implementation r13) throws java.lang.Exception {
            net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default r0 = net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.NO_CONSTRUCTORS
            net.bytebuddy.dynamic.DynamicType$Builder r8 = r8.subclass(r9, r0)
            net.bytebuddy.description.modifier.Visibility r0 = net.bytebuddy.description.modifier.Visibility.PRIVATE
            r1 = 2
            net.bytebuddy.description.modifier.ModifierContributor$ForField[] r2 = new net.bytebuddy.description.modifier.ModifierContributor.ForField[r1]
            r3 = 0
            r2[r3] = r0
            net.bytebuddy.description.modifier.FieldManifestation r4 = net.bytebuddy.description.modifier.FieldManifestation.FINAL
            r5 = 1
            r2[r5] = r4
            java.lang.String r4 = "delegate"
            net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional$Valuable r8 = r8.defineField(r4, r10, r2)
            net.bytebuddy.description.modifier.Visibility r2 = net.bytebuddy.description.modifier.Visibility.PUBLIC
            net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r6 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r5]
            r6[r3] = r2
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r8 = r8.defineConstructor(r6)
            java.lang.reflect.Type[] r6 = new java.lang.reflect.Type[r5]
            r6[r3] = r10
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r8 = r8.withParameters(r6)
            java.lang.Class r6 = java.lang.Integer.TYPE
            java.lang.Class[] r6 = new java.lang.Class[]{r6}
            java.lang.reflect.Constructor r6 = r9.getDeclaredConstructor(r6)
            net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r6 = net.bytebuddy.implementation.MethodCall.invoke(r6)
            int r7 = net.bytebuddy.utility.OpenedClassReader.ASM_API
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            net.bytebuddy.implementation.MethodCall r6 = r6.with(r7)
            net.bytebuddy.implementation.FieldAccessor$OwnerTypeLocatable r4 = net.bytebuddy.implementation.FieldAccessor.ofField(r4)
            net.bytebuddy.implementation.Implementation$Composable r4 = r4.setsArgumentAt(r3)
            net.bytebuddy.implementation.Implementation$Composable r4 = r6.andThen(r4)
            net.bytebuddy.implementation.Implementation r13 = r4.andThen(r13)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r8 = r8.intercept(r13)
            net.bytebuddy.description.modifier.Ownership r13 = net.bytebuddy.description.modifier.Ownership.STATIC
            net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r4 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r1]
            r4[r3] = r2
            r4[r5] = r13
            java.lang.String r2 = "wrap"
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r8 = r8.defineMethod(r2, r9, r4)
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r5]
            r9[r3] = r10
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r8 = r8.withParameters(r9)
            net.bytebuddy.implementation.Implementation$Simple r9 = new net.bytebuddy.implementation.Implementation$Simple
            net.bytebuddy.asm.ClassVisitorFactory$NullCheckedConstruction r2 = new net.bytebuddy.asm.ClassVisitorFactory$NullCheckedConstruction
            r2.<init>(r10)
            net.bytebuddy.implementation.bytecode.ByteCodeAppender[] r10 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender[r5]
            r10[r3] = r2
            r9.<init>(r10)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r8 = r8.intercept(r9)
            if (r11 == 0) goto Lae
            if (r12 != 0) goto L88
            goto Lae
        L88:
            java.lang.String r9 = "typePath"
            net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r10 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r1]
            r10[r3] = r0
            r10[r5] = r13
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r8 = r8.defineMethod(r9, r12, r10)
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r5]
            r9[r3] = r11
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r8 = r8.withParameters(r9)
            net.bytebuddy.implementation.Implementation$Simple r9 = new net.bytebuddy.implementation.Implementation$Simple
            net.bytebuddy.asm.ClassVisitorFactory$TypePathTranslator r10 = new net.bytebuddy.asm.ClassVisitorFactory$TypePathTranslator
            r10.<init>(r11, r12)
            net.bytebuddy.implementation.bytecode.ByteCodeAppender[] r11 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender[r5]
            r11[r3] = r10
            r9.<init>(r11)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r8 = r8.intercept(r9)
        Lae:
            return r8
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
            java.lang.Class<?> r2 = r4.type
            net.bytebuddy.asm.ClassVisitorFactory r5 = (net.bytebuddy.asm.ClassVisitorFactory) r5
            java.lang.Class<?> r5 = r5.type
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L20
            return r1
        L20:
            return r0
    }

    public java.lang.Class<?> getType() {
            r1 = this;
            java.lang.Class<?> r0 = r1.type
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Class<?> r1 = r2.type
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public abstract net.bytebuddy.jar.asm.ClassVisitor unwrap(T r1);

    public abstract T wrap(net.bytebuddy.jar.asm.ClassVisitor r1);
}
