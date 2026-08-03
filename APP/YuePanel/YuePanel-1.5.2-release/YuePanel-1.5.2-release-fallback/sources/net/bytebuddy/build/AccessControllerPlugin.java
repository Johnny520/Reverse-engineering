package net.bytebuddy.build;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class AccessControllerPlugin extends net.bytebuddy.build.Plugin.ForElementMatcher implements net.bytebuddy.build.Plugin.Factory {
    private static final java.lang.String ACCESS_CONTROLLER = "java.security.AccessController";
    private static final java.lang.Object[] EMPTY = null;
    private static final java.lang.String NAME = "ACCESS_CONTROLLER";
    private static final java.util.Map<net.bytebuddy.description.method.MethodDescription.SignatureToken, net.bytebuddy.description.method.MethodDescription.SignatureToken> SIGNATURES = null;

    @net.bytebuddy.utility.nullability.MaybeNull
    @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
    private final java.lang.String property;

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class AccessControlWrapper implements net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper {
        private final java.lang.String name;

        public static class PrefixingMethodVisitor extends net.bytebuddy.jar.asm.MethodVisitor {
            private final net.bytebuddy.implementation.Implementation.Context.FrameGeneration frameGeneration;
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;
            private final java.lang.String name;
            private final int offset;
            private final net.bytebuddy.description.method.MethodDescription.SignatureToken token;

            public PrefixingMethodVisitor(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription.SignatureToken r4, java.lang.String r5, int r6, net.bytebuddy.implementation.Implementation.Context.FrameGeneration r7) {
                    r1 = this;
                    int r0 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                    r1.<init>(r0, r2)
                    r1.instrumentedType = r3
                    r1.token = r4
                    r1.name = r5
                    r1.offset = r6
                    r1.frameGeneration = r7
                    return
            }

            @Override // net.bytebuddy.jar.asm.MethodVisitor
            public void visitCode() {
                    r9 = this;
                    net.bytebuddy.jar.asm.MethodVisitor r0 = r9.mv
                    r0.visitCode()
                    net.bytebuddy.jar.asm.MethodVisitor r0 = r9.mv
                    net.bytebuddy.description.type.TypeDescription r1 = r9.instrumentedType
                    java.lang.String r1 = r1.getInternalName()
                    java.lang.String r2 = r9.name
                    java.lang.Class r3 = java.lang.Boolean.TYPE
                    java.lang.String r3 = net.bytebuddy.jar.asm.Type.getDescriptor(r3)
                    r4 = 178(0xb2, float:2.5E-43)
                    r0.visitFieldInsn(r4, r1, r2, r3)
                    net.bytebuddy.jar.asm.Label r0 = new net.bytebuddy.jar.asm.Label
                    r0.<init>()
                    net.bytebuddy.jar.asm.MethodVisitor r1 = r9.mv
                    r2 = 153(0x99, float:2.14E-43)
                    r1.visitJumpInsn(r2, r0)
                    int r1 = r9.offset
                    net.bytebuddy.description.method.MethodDescription$SignatureToken r2 = r9.token
                    java.util.List r2 = r2.getParameterTypes()
                    java.util.Iterator r2 = r2.iterator()
                L32:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto L72
                    java.lang.Object r3 = r2.next()
                    net.bytebuddy.description.type.TypeDescription r3 = (net.bytebuddy.description.type.TypeDescription) r3
                    net.bytebuddy.jar.asm.MethodVisitor r4 = r9.mv
                    java.lang.String r5 = r3.getDescriptor()
                    net.bytebuddy.jar.asm.Type r5 = net.bytebuddy.jar.asm.Type.getType(r5)
                    r6 = 21
                    int r5 = r5.getOpcode(r6)
                    r4.visitVarInsn(r5, r1)
                    net.bytebuddy.utility.JavaType r4 = net.bytebuddy.utility.JavaType.ACCESS_CONTROL_CONTEXT
                    net.bytebuddy.description.type.TypeDescription r4 = r4.getTypeStub()
                    boolean r4 = r3.equals(r4)
                    if (r4 == 0) goto L68
                    net.bytebuddy.jar.asm.MethodVisitor r4 = r9.mv
                    r5 = 192(0xc0, float:2.69E-43)
                    java.lang.String r6 = r3.getInternalName()
                    r4.visitTypeInsn(r5, r6)
                L68:
                    net.bytebuddy.implementation.bytecode.StackSize r3 = r3.getStackSize()
                    int r3 = r3.getSize()
                    int r1 = r1 + r3
                    goto L32
                L72:
                    net.bytebuddy.jar.asm.MethodVisitor r3 = r9.mv
                    r1 = 46
                    r2 = 47
                    java.lang.String r4 = "java.security.AccessController"
                    java.lang.String r5 = r4.replace(r1, r2)
                    net.bytebuddy.description.method.MethodDescription$SignatureToken r1 = r9.token
                    java.lang.String r6 = r1.getName()
                    net.bytebuddy.description.method.MethodDescription$SignatureToken r1 = r9.token
                    java.lang.String r7 = r1.getDescriptor()
                    r8 = 0
                    r4 = 184(0xb8, float:2.58E-43)
                    r3.visitMethodInsn(r4, r5, r6, r7, r8)
                    net.bytebuddy.jar.asm.MethodVisitor r1 = r9.mv
                    net.bytebuddy.description.method.MethodDescription$SignatureToken r2 = r9.token
                    net.bytebuddy.description.type.TypeDescription r2 = r2.getReturnType()
                    java.lang.String r2 = r2.getDescriptor()
                    net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getType(r2)
                    r3 = 172(0xac, float:2.41E-43)
                    int r2 = r2.getOpcode(r3)
                    r1.visitInsn(r2)
                    net.bytebuddy.jar.asm.MethodVisitor r1 = r9.mv
                    r1.visitLabel(r0)
                    net.bytebuddy.implementation.Implementation$Context$FrameGeneration r0 = r9.frameGeneration
                    net.bytebuddy.jar.asm.MethodVisitor r1 = r9.mv
                    net.bytebuddy.description.method.MethodDescription$SignatureToken r2 = r9.token
                    java.util.List r2 = r2.getParameterTypes()
                    r0.same(r1, r2)
                    return
            }

            @Override // net.bytebuddy.jar.asm.MethodVisitor
            public void visitMaxs(int r4, int r5) {
                    r3 = this;
                    net.bytebuddy.jar.asm.MethodVisitor r0 = r3.mv
                    net.bytebuddy.description.method.MethodDescription$SignatureToken r1 = r3.token
                    java.util.List r1 = r1.getParameterTypes()
                    int r1 = net.bytebuddy.implementation.bytecode.StackSize.of(r1)
                    net.bytebuddy.description.method.MethodDescription$SignatureToken r2 = r3.token
                    net.bytebuddy.description.type.TypeDescription r2 = r2.getReturnType()
                    net.bytebuddy.implementation.bytecode.StackSize r2 = r2.getStackSize()
                    int r2 = r2.getSize()
                    int r1 = java.lang.Math.max(r1, r2)
                    int r4 = java.lang.Math.max(r1, r4)
                    r0.visitMaxs(r4, r5)
                    return
            }
        }

        public AccessControlWrapper(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.name = r1
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
                java.lang.String r2 = r4.name
                net.bytebuddy.build.AccessControllerPlugin$AccessControlWrapper r5 = (net.bytebuddy.build.AccessControllerPlugin.AccessControlWrapper) r5
                java.lang.String r5 = r5.name
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
                java.lang.String r1 = r2.name
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper
        public net.bytebuddy.jar.asm.MethodVisitor wrap(net.bytebuddy.description.type.TypeDescription r8, net.bytebuddy.description.method.MethodDescription r9, net.bytebuddy.jar.asm.MethodVisitor r10, net.bytebuddy.implementation.Implementation.Context r11, net.bytebuddy.pool.TypePool r12, int r13, int r14) {
                r7 = this;
                java.util.Map r12 = net.bytebuddy.build.AccessControllerPlugin.access$000()
                net.bytebuddy.description.ByteCodeElement$TypeDependant r13 = r9.asDefined()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r13 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r13
                net.bytebuddy.description.method.MethodDescription$SignatureToken r13 = r13.asSignatureToken()
                java.lang.Object r12 = r12.get(r13)
                r3 = r12
                net.bytebuddy.description.method.MethodDescription$SignatureToken r3 = (net.bytebuddy.description.method.MethodDescription.SignatureToken) r3
                if (r3 == 0) goto L4f
                boolean r12 = r9.isPublic()
                if (r12 != 0) goto L38
                boolean r12 = r9.isProtected()
                if (r12 != 0) goto L38
                net.bytebuddy.build.AccessControllerPlugin$AccessControlWrapper$PrefixingMethodVisitor r12 = new net.bytebuddy.build.AccessControllerPlugin$AccessControlWrapper$PrefixingMethodVisitor
                java.lang.String r4 = r7.name
                boolean r9 = r9.isStatic()
                r5 = r9 ^ 1
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r6 = r11.getFrameGeneration()
                r0 = r12
                r1 = r10
                r2 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r12
            L38:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r9)
                java.lang.String r9 = " is either public or protected what is not permitted to avoid context leaks"
                r10.append(r9)
                java.lang.String r9 = r10.toString()
                r8.<init>(r9)
                throw r8
            L4f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r9)
                java.lang.String r9 = " does not have a method with a matching signature in "
                r10.append(r9)
                java.lang.String r9 = "java.security.AccessController"
                r10.append(r9)
                java.lang.String r9 = r10.toString()
                r8.<init>(r9)
                throw r8
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface Enhance {
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static abstract class Initializer implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
        private final net.bytebuddy.description.type.TypeDescription instrumentedType;
        private final java.lang.String name;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class WithProperty extends net.bytebuddy.build.AccessControllerPlugin.Initializer {
            private final java.lang.String property;

            public WithProperty(net.bytebuddy.description.type.TypeDescription r1, java.lang.String r2, java.lang.String r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    r0.property = r3
                    return
            }

            @Override // net.bytebuddy.build.AccessControllerPlugin.Initializer
            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                    r4 = this;
                    boolean r0 = super.equals(r5)
                    r1 = 0
                    if (r0 != 0) goto L8
                    return r1
                L8:
                    r0 = 1
                    if (r4 != r5) goto Lc
                    return r0
                Lc:
                    if (r5 != 0) goto Lf
                    return r1
                Lf:
                    java.lang.Class r2 = r4.getClass()
                    java.lang.Class r3 = r5.getClass()
                    if (r2 == r3) goto L1a
                    return r1
                L1a:
                    java.lang.String r2 = r4.property
                    net.bytebuddy.build.AccessControllerPlugin$Initializer$WithProperty r5 = (net.bytebuddy.build.AccessControllerPlugin.Initializer.WithProperty) r5
                    java.lang.String r5 = r5.property
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L27
                    return r1
                L27:
                    return r0
            }

            @Override // net.bytebuddy.build.AccessControllerPlugin.Initializer
            public int hashCode() {
                    r2 = this;
                    int r0 = super.hashCode()
                    int r0 = r0 * 31
                    java.lang.String r1 = r2.property
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.build.AccessControllerPlugin.Initializer
            public int onAccessController(net.bytebuddy.jar.asm.MethodVisitor r9) {
                    r8 = this;
                    java.lang.String r0 = r8.property
                    r9.visitLdcInsn(r0)
                    java.lang.String r0 = "true"
                    r9.visitLdcInsn(r0)
                    java.lang.Class<java.lang.System> r0 = java.lang.System.class
                    java.lang.String r3 = net.bytebuddy.jar.asm.Type.getInternalName(r0)
                    java.lang.Class<java.lang.String> r0 = java.lang.String.class
                    net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r0)
                    net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getType(r0)
                    net.bytebuddy.jar.asm.Type r4 = net.bytebuddy.jar.asm.Type.getType(r0)
                    net.bytebuddy.jar.asm.Type[] r2 = new net.bytebuddy.jar.asm.Type[]{r2, r4}
                    java.lang.String r5 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r1, r2)
                    r6 = 0
                    r2 = 184(0xb8, float:2.58E-43)
                    java.lang.String r4 = "getProperty"
                    r1 = r9
                    r1.visitMethodInsn(r2, r3, r4, r5, r6)
                    java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
                    java.lang.String r4 = net.bytebuddy.jar.asm.Type.getInternalName(r1)
                    java.lang.Class r1 = java.lang.Boolean.TYPE
                    net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r1)
                    net.bytebuddy.jar.asm.Type r0 = net.bytebuddy.jar.asm.Type.getType(r0)
                    net.bytebuddy.jar.asm.Type[] r0 = new net.bytebuddy.jar.asm.Type[]{r0}
                    java.lang.String r6 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r1, r0)
                    r7 = 0
                    r3 = 184(0xb8, float:2.58E-43)
                    java.lang.String r5 = "parseBoolean"
                    r2 = r9
                    r2.visitMethodInsn(r3, r4, r5, r6, r7)
                    r9 = 2
                    return r9
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class WithoutProperty extends net.bytebuddy.build.AccessControllerPlugin.Initializer {
            public WithoutProperty(net.bytebuddy.description.type.TypeDescription r1, java.lang.String r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            @Override // net.bytebuddy.build.AccessControllerPlugin.Initializer
            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r4) {
                    r3 = this;
                    boolean r0 = super.equals(r4)
                    r1 = 0
                    if (r0 != 0) goto L8
                    return r1
                L8:
                    r0 = 1
                    if (r3 != r4) goto Lc
                    return r0
                Lc:
                    if (r4 != 0) goto Lf
                    return r1
                Lf:
                    java.lang.Class r2 = r3.getClass()
                    java.lang.Class r4 = r4.getClass()
                    if (r2 == r4) goto L1a
                    return r1
                L1a:
                    return r0
            }

            @Override // net.bytebuddy.build.AccessControllerPlugin.Initializer
            public int hashCode() {
                    r1 = this;
                    int r0 = super.hashCode()
                    return r0
            }

            @Override // net.bytebuddy.build.AccessControllerPlugin.Initializer
            public int onAccessController(net.bytebuddy.jar.asm.MethodVisitor r2) {
                    r1 = this;
                    r0 = 4
                    r2.visitInsn(r0)
                    r2 = 1
                    return r2
            }
        }

        public Initializer(net.bytebuddy.description.type.TypeDescription r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.instrumentedType = r1
                r0.name = r2
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r17, net.bytebuddy.implementation.Implementation.Context r18, net.bytebuddy.description.method.MethodDescription r19) {
                r16 = this;
                r0 = r16
                r7 = r17
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
                java.lang.Class<java.lang.ClassNotFoundException> r12 = java.lang.ClassNotFoundException.class
                java.lang.String r2 = net.bytebuddy.jar.asm.Type.getInternalName(r12)
                r7.visitTryCatchBlock(r1, r8, r9, r2)
                java.lang.Class<java.lang.SecurityException> r13 = java.lang.SecurityException.class
                java.lang.String r2 = net.bytebuddy.jar.asm.Type.getInternalName(r13)
                r7.visitTryCatchBlock(r1, r8, r10, r2)
                r7.visitLabel(r1)
                java.lang.String r1 = "java.security.AccessController"
                r7.visitLdcInsn(r1)
                r14 = 3
                r7.visitInsn(r14)
                r1 = 1
                r7.visitInsn(r1)
                java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
                java.lang.String r3 = net.bytebuddy.jar.asm.Type.getInternalName(r1)
                net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r1)
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getType(r2)
                java.lang.Class r15 = java.lang.Boolean.TYPE
                net.bytebuddy.jar.asm.Type r4 = net.bytebuddy.jar.asm.Type.getType(r15)
                java.lang.Class<java.lang.ClassLoader> r5 = java.lang.ClassLoader.class
                net.bytebuddy.jar.asm.Type r5 = net.bytebuddy.jar.asm.Type.getType(r5)
                net.bytebuddy.jar.asm.Type[] r2 = new net.bytebuddy.jar.asm.Type[]{r2, r4, r5}
                java.lang.String r5 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r1, r2)
                r6 = 0
                r2 = 184(0xb8, float:2.58E-43)
                java.lang.String r4 = "forName"
                r1 = r17
                r1.visitMethodInsn(r2, r3, r4, r5, r6)
                r1 = 87
                r7.visitInsn(r1)
                int r2 = r16.onAccessController(r17)
                net.bytebuddy.description.type.TypeDescription r3 = r0.instrumentedType
                java.lang.String r3 = r3.getInternalName()
                java.lang.String r4 = r0.name
                java.lang.String r5 = net.bytebuddy.jar.asm.Type.getDescriptor(r15)
                r6 = 179(0xb3, float:2.51E-43)
                r7.visitFieldInsn(r6, r3, r4, r5)
                r7.visitLabel(r8)
                r3 = 167(0xa7, float:2.34E-43)
                r7.visitJumpInsn(r3, r11)
                r7.visitLabel(r9)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r4 = r18.getFrameGeneration()
                net.bytebuddy.description.type.TypeDescription r5 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r12)
                java.util.List r8 = java.util.Collections.emptyList()
                r4.same1(r7, r5, r8)
                r7.visitInsn(r1)
                r7.visitInsn(r14)
                net.bytebuddy.description.type.TypeDescription r4 = r0.instrumentedType
                java.lang.String r4 = r4.getInternalName()
                java.lang.String r5 = r0.name
                java.lang.String r8 = net.bytebuddy.jar.asm.Type.getDescriptor(r15)
                r7.visitFieldInsn(r6, r4, r5, r8)
                r7.visitJumpInsn(r3, r11)
                r7.visitLabel(r10)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r3 = r18.getFrameGeneration()
                net.bytebuddy.description.type.TypeDescription r4 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r13)
                java.util.List r5 = java.util.Collections.emptyList()
                r3.same1(r7, r4, r5)
                r7.visitInsn(r1)
                r1 = 4
                r7.visitInsn(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r0.instrumentedType
                java.lang.String r1 = r1.getInternalName()
                java.lang.String r3 = r0.name
                java.lang.String r4 = net.bytebuddy.jar.asm.Type.getDescriptor(r15)
                r7.visitFieldInsn(r6, r1, r3, r4)
                r7.visitLabel(r11)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r1 = r18.getFrameGeneration()
                java.util.List r3 = java.util.Collections.emptyList()
                r1.same(r7, r3)
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r1 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                int r2 = java.lang.Math.max(r14, r2)
                r3 = 0
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
                java.lang.String r2 = r4.name
                net.bytebuddy.build.AccessControllerPlugin$Initializer r5 = (net.bytebuddy.build.AccessControllerPlugin.Initializer) r5
                java.lang.String r3 = r5.name
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                net.bytebuddy.description.type.TypeDescription r5 = r5.instrumentedType
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
                net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r2.name
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        public abstract int onAccessController(net.bytebuddy.jar.asm.MethodVisitor r1);
    }

    static {
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            net.bytebuddy.build.AccessControllerPlugin.EMPTY = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            net.bytebuddy.build.AccessControllerPlugin.SIGNATURES = r4
            net.bytebuddy.description.method.MethodDescription$SignatureToken r5 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            net.bytebuddy.description.type.TypeDescription r7 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            java.lang.Class<java.security.PrivilegedAction> r8 = java.security.PrivilegedAction.class
            net.bytebuddy.description.type.TypeDescription r9 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r8)
            net.bytebuddy.description.type.TypeDescription[] r10 = new net.bytebuddy.description.type.TypeDescription[r2]
            r10[r3] = r9
            java.lang.String r9 = "doPrivileged"
            r5.<init>(r9, r7, r10)
            net.bytebuddy.description.method.MethodDescription$SignatureToken r7 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
            net.bytebuddy.description.type.TypeDescription r10 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            net.bytebuddy.description.type.TypeDescription r11 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r8)
            net.bytebuddy.description.type.TypeDescription[] r12 = new net.bytebuddy.description.type.TypeDescription[r2]
            r12[r3] = r11
            r7.<init>(r9, r10, r12)
            r4.put(r5, r7)
            net.bytebuddy.description.method.MethodDescription$SignatureToken r5 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
            net.bytebuddy.description.type.TypeDescription r7 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            net.bytebuddy.description.type.TypeDescription r10 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r8)
            net.bytebuddy.description.type.TypeDescription[] r11 = new net.bytebuddy.description.type.TypeDescription[r2]
            r11[r3] = r10
            java.lang.String r10 = "doPrivilegedWithCombiner"
            r5.<init>(r10, r7, r11)
            net.bytebuddy.description.method.MethodDescription$SignatureToken r7 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
            net.bytebuddy.description.type.TypeDescription r11 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            net.bytebuddy.description.type.TypeDescription r12 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r8)
            net.bytebuddy.description.type.TypeDescription[] r13 = new net.bytebuddy.description.type.TypeDescription[r2]
            r13[r3] = r12
            r7.<init>(r10, r11, r13)
            r4.put(r5, r7)
            net.bytebuddy.description.method.MethodDescription$SignatureToken r5 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
            net.bytebuddy.description.type.TypeDescription r7 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            net.bytebuddy.description.type.TypeDescription r11 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r8)
            net.bytebuddy.description.type.TypeDescription r12 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            net.bytebuddy.description.type.TypeDescription[] r13 = new net.bytebuddy.description.type.TypeDescription[r1]
            r13[r3] = r11
            r13[r2] = r12
            r5.<init>(r9, r7, r13)
            net.bytebuddy.description.method.MethodDescription$SignatureToken r7 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
            net.bytebuddy.description.type.TypeDescription r11 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            net.bytebuddy.description.type.TypeDescription r12 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r8)
            net.bytebuddy.utility.JavaType r13 = net.bytebuddy.utility.JavaType.ACCESS_CONTROL_CONTEXT
            net.bytebuddy.description.type.TypeDescription r14 = r13.getTypeStub()
            net.bytebuddy.description.type.TypeDescription[] r15 = new net.bytebuddy.description.type.TypeDescription[r1]
            r15[r3] = r12
            r15[r2] = r14
            r7.<init>(r9, r11, r15)
            r4.put(r5, r7)
            net.bytebuddy.description.method.MethodDescription$SignatureToken r5 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
            net.bytebuddy.description.type.TypeDescription r7 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            net.bytebuddy.description.type.TypeDescription r11 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r8)
            net.bytebuddy.description.type.TypeDescription r12 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            java.lang.Class<java.security.Permission[]> r14 = java.security.Permission[].class
            net.bytebuddy.description.type.TypeDescription r15 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r14)
            net.bytebuddy.description.type.TypeDescription[] r1 = new net.bytebuddy.description.type.TypeDescription[r0]
            r1[r3] = r11
            r1[r2] = r12
            r11 = 2
            r1[r11] = r15
            r5.<init>(r9, r7, r1)
            net.bytebuddy.description.method.MethodDescription$SignatureToken r1 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
            net.bytebuddy.description.type.TypeDescription r7 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            net.bytebuddy.description.type.TypeDescription r12 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r8)
            net.bytebuddy.description.type.TypeDescription r15 = r13.getTypeStub()
            net.bytebuddy.description.type.TypeDescription r16 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r14)
            net.bytebuddy.description.type.TypeDescription[] r11 = new net.bytebuddy.description.type.TypeDescription[r0]
            r11[r3] = r12
            r11[r2] = r15
            r12 = 2
            r11[r12] = r16
            r1.<init>(r9, r7, r11)
            r4.put(r5, r1)
            net.bytebuddy.description.method.MethodDescription$SignatureToken r1 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
            net.bytebuddy.description.type.TypeDescription r5 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            net.bytebuddy.description.type.TypeDescription r7 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r8)
            net.bytebuddy.description.type.TypeDescription r11 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            net.bytebuddy.description.type.TypeDescription r15 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r14)
            net.bytebuddy.description.type.TypeDescription[] r12 = new net.bytebuddy.description.type.TypeDescription[r0]
            r12[r3] = r7
            r12[r2] = r11
            r7 = 2
            r12[r7] = r15
            r1.<init>(r10, r5, r12)
            net.bytebuddy.description.method.MethodDescription$SignatureToken r5 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
            net.bytebuddy.description.type.TypeDescription r11 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            net.bytebuddy.description.type.TypeDescription r8 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r8)
            net.bytebuddy.description.type.TypeDescription r12 = r13.getTypeStub()
            net.bytebuddy.description.type.TypeDescription r15 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r14)
            net.bytebuddy.description.type.TypeDescription[] r7 = new net.bytebuddy.description.type.TypeDescription[r0]
            r7[r3] = r8
            r7[r2] = r12
            r8 = 2
            r7[r8] = r15
            r5.<init>(r10, r11, r7)
            r4.put(r1, r5)
            net.bytebuddy.description.method.MethodDescription$SignatureToken r1 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
            net.bytebuddy.description.type.TypeDescription r5 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            java.lang.Class<java.security.PrivilegedExceptionAction> r7 = java.security.PrivilegedExceptionAction.class
            net.bytebuddy.description.type.TypeDescription r8 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r7)
            net.bytebuddy.description.type.TypeDescription[] r11 = new net.bytebuddy.description.type.TypeDescription[r2]
            r11[r3] = r8
            r1.<init>(r9, r5, r11)
            net.bytebuddy.description.method.MethodDescription$SignatureToken r5 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
            net.bytebuddy.description.type.TypeDescription r8 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            net.bytebuddy.description.type.TypeDescription r11 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r7)
            net.bytebuddy.description.type.TypeDescription[] r12 = new net.bytebuddy.description.type.TypeDescription[r2]
            r12[r3] = r11
            r5.<init>(r9, r8, r12)
            r4.put(r1, r5)
            net.bytebuddy.description.method.MethodDescription$SignatureToken r1 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
            net.bytebuddy.description.type.TypeDescription r5 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            net.bytebuddy.description.type.TypeDescription r8 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r7)
            net.bytebuddy.description.type.TypeDescription[] r11 = new net.bytebuddy.description.type.TypeDescription[r2]
            r11[r3] = r8
            r1.<init>(r10, r5, r11)
            net.bytebuddy.description.method.MethodDescription$SignatureToken r5 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
            net.bytebuddy.description.type.TypeDescription r8 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            net.bytebuddy.description.type.TypeDescription r11 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r7)
            net.bytebuddy.description.type.TypeDescription[] r12 = new net.bytebuddy.description.type.TypeDescription[r2]
            r12[r3] = r11
            r5.<init>(r10, r8, r12)
            r4.put(r1, r5)
            net.bytebuddy.description.method.MethodDescription$SignatureToken r1 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
            net.bytebuddy.description.type.TypeDescription r5 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            net.bytebuddy.description.type.TypeDescription r8 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r7)
            net.bytebuddy.description.type.TypeDescription r11 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            r12 = 2
            net.bytebuddy.description.type.TypeDescription[] r15 = new net.bytebuddy.description.type.TypeDescription[r12]
            r15[r3] = r8
            r15[r2] = r11
            r1.<init>(r9, r5, r15)
            net.bytebuddy.description.method.MethodDescription$SignatureToken r5 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
            net.bytebuddy.description.type.TypeDescription r8 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            net.bytebuddy.description.type.TypeDescription r11 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r7)
            net.bytebuddy.description.type.TypeDescription r15 = r13.getTypeStub()
            net.bytebuddy.description.type.TypeDescription[] r0 = new net.bytebuddy.description.type.TypeDescription[r12]
            r0[r3] = r11
            r0[r2] = r15
            r5.<init>(r9, r8, r0)
            r4.put(r1, r5)
            net.bytebuddy.description.method.MethodDescription$SignatureToken r0 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            net.bytebuddy.description.type.TypeDescription r5 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r7)
            net.bytebuddy.description.type.TypeDescription r8 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            net.bytebuddy.description.type.TypeDescription r11 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r14)
            r12 = 3
            net.bytebuddy.description.type.TypeDescription[] r15 = new net.bytebuddy.description.type.TypeDescription[r12]
            r15[r3] = r5
            r15[r2] = r8
            r5 = 2
            r15[r5] = r11
            r0.<init>(r9, r1, r15)
            net.bytebuddy.description.method.MethodDescription$SignatureToken r1 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
            net.bytebuddy.description.type.TypeDescription r8 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            net.bytebuddy.description.type.TypeDescription r11 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r7)
            net.bytebuddy.description.type.TypeDescription r15 = r13.getTypeStub()
            net.bytebuddy.description.type.TypeDescription r16 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r14)
            net.bytebuddy.description.type.TypeDescription[] r5 = new net.bytebuddy.description.type.TypeDescription[r12]
            r5[r3] = r11
            r5[r2] = r15
            r11 = 2
            r5[r11] = r16
            r1.<init>(r9, r8, r5)
            r4.put(r0, r1)
            net.bytebuddy.description.method.MethodDescription$SignatureToken r0 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            net.bytebuddy.description.type.TypeDescription r5 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r7)
            net.bytebuddy.description.type.TypeDescription r8 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            net.bytebuddy.description.type.TypeDescription r9 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r14)
            net.bytebuddy.description.type.TypeDescription[] r15 = new net.bytebuddy.description.type.TypeDescription[r12]
            r15[r3] = r5
            r15[r2] = r8
            r15[r11] = r9
            r0.<init>(r10, r1, r15)
            net.bytebuddy.description.method.MethodDescription$SignatureToken r1 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
            net.bytebuddy.description.type.TypeDescription r5 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            net.bytebuddy.description.type.TypeDescription r7 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r7)
            net.bytebuddy.description.type.TypeDescription r8 = r13.getTypeStub()
            net.bytebuddy.description.type.TypeDescription r9 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r14)
            net.bytebuddy.description.type.TypeDescription[] r12 = new net.bytebuddy.description.type.TypeDescription[r12]
            r12[r3] = r7
            r12[r2] = r8
            r12[r11] = r9
            r1.<init>(r10, r5, r12)
            r4.put(r0, r1)
            net.bytebuddy.description.method.MethodDescription$SignatureToken r0 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            net.bytebuddy.description.type.TypeDescription[] r5 = new net.bytebuddy.description.type.TypeDescription[r3]
            java.lang.String r6 = "getContext"
            r0.<init>(r6, r1, r5)
            net.bytebuddy.description.method.MethodDescription$SignatureToken r1 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
            net.bytebuddy.description.type.TypeDescription r5 = r13.getTypeStub()
            net.bytebuddy.description.type.TypeDescription[] r7 = new net.bytebuddy.description.type.TypeDescription[r3]
            r1.<init>(r6, r5, r7)
            r4.put(r0, r1)
            net.bytebuddy.description.method.MethodDescription$SignatureToken r0 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
            java.lang.Class r1 = java.lang.Void.TYPE
            net.bytebuddy.description.type.TypeDescription r5 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
            java.lang.Class<java.security.Permission> r6 = java.security.Permission.class
            net.bytebuddy.description.type.TypeDescription r7 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            net.bytebuddy.description.type.TypeDescription[] r8 = new net.bytebuddy.description.type.TypeDescription[r2]
            r8[r3] = r7
            java.lang.String r7 = "checkPermission"
            r0.<init>(r7, r5, r8)
            net.bytebuddy.description.method.MethodDescription$SignatureToken r5 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
            net.bytebuddy.description.type.TypeDescription r6 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            net.bytebuddy.description.type.TypeDescription[] r2 = new net.bytebuddy.description.type.TypeDescription[r2]
            r2[r3] = r6
            r5.<init>(r7, r1, r2)
            r4.put(r0, r5)
            return
    }

    public AccessControllerPlugin() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    @net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority(Integer.MAX_VALUE)
    public AccessControllerPlugin(@net.bytebuddy.utility.nullability.MaybeNull java.lang.String r2) {
            r1 = this;
            java.lang.Class<net.bytebuddy.build.AccessControllerPlugin$Enhance> r0 = net.bytebuddy.build.AccessControllerPlugin.Enhance.class
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isAnnotatedWith(r0)
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.declaresMethod(r0)
            r1.<init>(r0)
            r1.property = r2
            return
    }

    public static /* synthetic */ java.util.Map access$000() {
            java.util.Map<net.bytebuddy.description.method.MethodDescription$SignatureToken, net.bytebuddy.description.method.MethodDescription$SignatureToken> r0 = net.bytebuddy.build.AccessControllerPlugin.SIGNATURES
            return r0
    }

    @Override // net.bytebuddy.build.Plugin
    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Collision is unlikely and buffer overhead not justified.", value = {"SBSC_USE_STRINGBUFFER_CONCATENATION"})
    public net.bytebuddy.dynamic.DynamicType.Builder<?> apply(net.bytebuddy.dynamic.DynamicType.Builder<?> r7, net.bytebuddy.description.type.TypeDescription r8, net.bytebuddy.dynamic.ClassFileLocator r9) {
            r6 = this;
            r9 = 1
            r0 = 0
            java.lang.String r1 = "ACCESS_CONTROLLER"
        L4:
            net.bytebuddy.description.field.FieldList r2 = r8.getDeclaredFields()
            net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.named(r1)
            net.bytebuddy.matcher.FilterableList r2 = r2.filter(r3)
            net.bytebuddy.description.field.FieldList r2 = (net.bytebuddy.description.field.FieldList) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L2a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "$"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L4
        L2a:
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r3 = 3
            net.bytebuddy.description.modifier.ModifierContributor$ForField[] r3 = new net.bytebuddy.description.modifier.ModifierContributor.ForField[r3]
            net.bytebuddy.description.modifier.Visibility r4 = net.bytebuddy.description.modifier.Visibility.PRIVATE
            r3[r0] = r4
            net.bytebuddy.description.modifier.Ownership r4 = net.bytebuddy.description.modifier.Ownership.STATIC
            r3[r9] = r4
            net.bytebuddy.description.modifier.FieldManifestation r4 = net.bytebuddy.description.modifier.FieldManifestation.FINAL
            r5 = 2
            r3[r5] = r4
            net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional$Valuable r7 = r7.defineField(r1, r2, r3)
            net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods r2 = new net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods
            r2.<init>()
            java.lang.Class<net.bytebuddy.build.AccessControllerPlugin$Enhance> r3 = net.bytebuddy.build.AccessControllerPlugin.Enhance.class
            net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.isAnnotatedWith(r3)
            net.bytebuddy.build.AccessControllerPlugin$AccessControlWrapper r4 = new net.bytebuddy.build.AccessControllerPlugin$AccessControlWrapper
            r4.<init>(r1)
            net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper[] r9 = new net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper[r9]
            r9[r0] = r4
            net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods r9 = r2.method(r3, r9)
            net.bytebuddy.dynamic.DynamicType$Builder r7 = r7.visit(r9)
            java.lang.String r9 = r6.property
            if (r9 != 0) goto L66
            net.bytebuddy.build.AccessControllerPlugin$Initializer$WithoutProperty r9 = new net.bytebuddy.build.AccessControllerPlugin$Initializer$WithoutProperty
            r9.<init>(r8, r1)
            goto L6c
        L66:
            net.bytebuddy.build.AccessControllerPlugin$Initializer$WithProperty r0 = new net.bytebuddy.build.AccessControllerPlugin$Initializer$WithProperty
            r0.<init>(r8, r1, r9)
            r9 = r0
        L6c:
            net.bytebuddy.dynamic.DynamicType$Builder r7 = r7.initializer(r9)
            return r7
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    @Override // net.bytebuddy.build.Plugin.ForElementMatcher
    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
            r4 = this;
            boolean r0 = super.equals(r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = 1
            if (r4 != r5) goto Lc
            return r0
        Lc:
            if (r5 != 0) goto Lf
            return r1
        Lf:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L1a
            return r1
        L1a:
            java.lang.String r2 = r4.property
            net.bytebuddy.build.AccessControllerPlugin r5 = (net.bytebuddy.build.AccessControllerPlugin) r5
            java.lang.String r5 = r5.property
            if (r5 == 0) goto L2b
            if (r2 == 0) goto L2d
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L2e
            return r1
        L2b:
            if (r2 == 0) goto L2e
        L2d:
            return r1
        L2e:
            return r0
    }

    @Override // net.bytebuddy.build.Plugin.ForElementMatcher
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.property
            if (r1 == 0) goto Lf
            int r1 = r1.hashCode()
            int r0 = r0 + r1
        Lf:
            return r0
    }

    @Override // net.bytebuddy.build.Plugin.Factory
    public net.bytebuddy.build.Plugin make() {
            r0 = this;
            return r0
    }
}
