package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ClassGeneratorUtil implements bsh.org.objectweb.asm.Opcodes {
    static final int ACCESS_MODIFIERS = 7;
    static final int DEFAULTCONSTRUCTOR = -1;
    private static final java.lang.String GENERATED_CLASS_DESC = null;
    private static final java.lang.String OBJECT = "Ljava/lang/Object;";
    private static final java.lang.String PRIMITIVE_DESC = null;
    private static final java.lang.String PRIMITIVE_NAME = null;
    private final java.lang.String classDescript;
    private final bsh.Modifiers classModifiers;
    private final java.lang.String className;
    private final bsh.DelayedEvalBshMethod[] constructors;
    private final java.lang.String fqClassName;
    private final java.lang.Class<?>[] interfaces;
    private final bsh.DelayedEvalBshMethod[] methods;
    private final java.lang.Class<?> superClass;
    private final java.lang.String superClassName;
    private final bsh.ClassGenerator.Type type;
    private final java.lang.String uuid;
    private final bsh.Variable[] vars;


    static {
            java.lang.Class<bsh.GeneratedClass> r0 = bsh.GeneratedClass.class
            java.lang.String r0 = bsh.org.objectweb.asm.Type.getDescriptor(r0)
            bsh.ClassGeneratorUtil.GENERATED_CLASS_DESC = r0
            java.lang.Class<bsh.Primitive> r0 = bsh.Primitive.class
            java.lang.String r1 = bsh.org.objectweb.asm.Type.getInternalName(r0)
            bsh.ClassGeneratorUtil.PRIMITIVE_NAME = r1
            java.lang.String r0 = bsh.org.objectweb.asm.Type.getDescriptor(r0)
            bsh.ClassGeneratorUtil.PRIMITIVE_DESC = r0
            return
    }

    public ClassGeneratorUtil(bsh.Modifiers r11, java.lang.String r12, java.lang.String r13, java.lang.Class<?> r14, java.lang.Class<?>[] r15, bsh.Variable[] r16, bsh.DelayedEvalBshMethod[] r17, bsh.NameSpace r18, bsh.ClassGenerator.Type r19) {
            r10 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r10.<init>()
            r10.classModifiers = r11
            r10.className = r12
            r10.type = r3
            r4 = 47
            r5 = 46
            if (r13 == 0) goto L32
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r13 = r13.replace(r5, r4)
            r6.append(r13)
            java.lang.String r13 = "/"
            r6.append(r13)
            r6.append(r12)
            java.lang.String r13 = r6.toString()
            r10.fqClassName = r13
            goto L34
        L32:
            r10.fqClassName = r12
        L34:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r6 = "L"
            r13.<init>(r6)
            java.lang.String r6 = r10.fqClassName
            java.lang.String r4 = r6.replace(r5, r4)
            r13.append(r4)
            java.lang.String r4 = ";"
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            r10.classDescript = r13
            if (r14 != 0) goto L5a
            bsh.ClassGenerator$Type r13 = bsh.ClassGenerator.Type.ENUM
            if (r3 != r13) goto L58
            java.lang.Class<java.lang.Enum> r14 = java.lang.Enum.class
            goto L5a
        L58:
            java.lang.Class<java.lang.Object> r14 = java.lang.Object.class
        L5a:
            r10.superClass = r14
            java.lang.String r13 = bsh.org.objectweb.asm.Type.getInternalName(r14)
            r10.superClassName = r13
            if (r15 != 0) goto L67
            java.lang.Class<?>[] r13 = bsh.Reflect.ZERO_TYPES
            goto L68
        L67:
            r13 = r15
        L68:
            r10.interfaces = r13
            r10.vars = r0
            bsh.ClassGenerator$Type r13 = bsh.ClassGenerator.Type.INTERFACE
            r14 = 0
            r4 = 1
            if (r3 != r13) goto L74
            r13 = r4
            goto L75
        L74:
            r13 = r14
        L75:
            r2.isInterface = r13
            bsh.ClassGenerator$Type r13 = bsh.ClassGenerator.Type.ENUM
            if (r3 != r13) goto L7c
            goto L7d
        L7c:
            r4 = r14
        L7d:
            r2.isEnum = r4
            java.util.Map<java.lang.String, bsh.NameSpace> r13 = bsh.This.contextStore
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            r10.uuid = r4
            r13.put(r4, r2)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r12 = bsh.Types.getBaseName(r12)
            int r4 = r1.length
        L9d:
            if (r14 >= r4) goto Lc3
            r5 = r1[r14]
            java.lang.String r6 = r5.getName()
            boolean r6 = r6.equals(r12)
            if (r6 == 0) goto Lbd
            bsh.Modifiers r6 = r5.modifiers
            r7 = 5
            boolean r6 = r6.isAppliedContext(r7)
            if (r6 != 0) goto Lb9
            bsh.Modifiers r6 = r5.modifiers
            r6.changeContext(r7)
        Lb9:
            r13.add(r5)
            goto Lc0
        Lbd:
            r2.add(r5)
        Lc0:
            int r14 = r14 + 1
            goto L9d
        Lc3:
            int r12 = r13.size()
            bsh.DelayedEvalBshMethod[] r12 = new bsh.DelayedEvalBshMethod[r12]
            java.lang.Object[] r12 = r13.toArray(r12)
            bsh.DelayedEvalBshMethod[] r12 = (bsh.DelayedEvalBshMethod[]) r12
            r10.constructors = r12
            int r12 = r2.size()
            bsh.DelayedEvalBshMethod[] r12 = new bsh.DelayedEvalBshMethod[r12]
            java.lang.Object[] r12 = r2.toArray(r12)
            bsh.DelayedEvalBshMethod[] r12 = (bsh.DelayedEvalBshMethod[]) r12
            r10.methods = r12
            java.lang.String r3 = r10.fqClassName
            int r12 = r13.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            int r12 = r2.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            int r12 = r0.length
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            java.lang.String r0 = "Generate class "
            java.lang.String r2 = " "
            java.lang.String r4 = " cons:"
            java.lang.String r6 = " meths:"
            java.lang.String r8 = " vars:"
            r1 = r19
            java.lang.Object[] r12 = new java.lang.Object[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
            bsh.Interpreter.debug(r12)
            bsh.ClassGenerator$Type r12 = bsh.ClassGenerator.Type.INTERFACE
            if (r1 != r12) goto L118
            java.lang.String r12 = "abstract"
            boolean r13 = r11.hasModifier(r12)
            if (r13 != 0) goto L118
            r11.addModifier(r12)
        L118:
            bsh.ClassGenerator$Type r12 = bsh.ClassGenerator.Type.ENUM
            if (r1 != r12) goto L127
            java.lang.String r12 = "static"
            boolean r13 = r11.hasModifier(r12)
            if (r13 != 0) goto L127
            r11.addModifier(r12)
        L127:
            return
    }

    public static /* synthetic */ java.lang.reflect.Method[] a(int r0) {
            java.lang.reflect.Method[] r0 = lambda$checkAbstractMethodImplementation$3(r0)
            return r0
    }

    public static /* synthetic */ int b(java.lang.reflect.Method r0, java.lang.reflect.Method r1) {
            int r0 = lambda$checkAbstractMethodImplementation$2(r0, r1)
            return r0
    }

    public static /* synthetic */ boolean c(java.lang.reflect.Method r0, java.lang.reflect.Method r1) {
            boolean r0 = lambda$checkAbstractMethodImplementation$1(r0, r1)
            return r0
    }

    public static void checkAbstractMethodImplementation(java.lang.Class<?> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            bsh.ClassGeneratorUtil$1Reflector r1 = new bsh.ClassGeneratorUtil$1Reflector
            r1.<init>(r0)
            r1.gatherMethods(r4)
            java.util.stream.Stream r1 = r0.stream()
            bsh.a r2 = new bsh.a
            r3 = 3
            r2.<init>(r3)
            java.util.stream.Stream r1 = r1.filter(r2)
            be.w r2 = new be.w
            r3 = 2
            r2.<init>(r0, r3, r4)
            r1.forEach(r2)
            return
    }

    public static boolean checkInheritanceRules(int r2, int r3, java.lang.Class<?> r4) {
            r2 = r2 & 7
            r3 = r3 & 7
            r0 = 1
            if (r3 == r2) goto L20
            r1 = 2
            if (r2 == r1) goto L20
            if (r3 == r0) goto L20
            if (r2 != 0) goto L11
            if (r3 == r1) goto L11
            goto L20
        L11:
            java.lang.String r2 = r4.getName()
            java.lang.String r3 = "Cannot reduce the visibility of the inherited method from "
            java.lang.String r2 = r3.concat(r2)
            bsh.j.g(r2)
            r2 = 0
            return r2
        L20:
            return r0
    }

    public static java.lang.reflect.Method classContainsMethod(java.lang.Class<?> r9, java.lang.String r10, java.lang.String[] r11) {
        L0:
            if (r9 == 0) goto L44
            java.lang.reflect.Method[] r0 = r9.getDeclaredMethods()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L9:
            if (r3 >= r1) goto L3f
            r4 = r0[r3]
            java.lang.String r5 = r4.getName()
            boolean r5 = r5.equals(r10)
            if (r5 == 0) goto L3c
            int r5 = r11.length
            int r6 = r4.getParameterCount()
            if (r5 != r6) goto L3c
            java.lang.Class[] r5 = r4.getParameterTypes()
            java.lang.String[] r5 = getTypeDescriptors(r5)
            r6 = 1
            r7 = r2
        L28:
            int r8 = r11.length
            if (r7 >= r8) goto L39
            r6 = r11[r7]
            r8 = r5[r7]
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L36
            goto L39
        L36:
            int r7 = r7 + 1
            goto L28
        L39:
            if (r6 == 0) goto L3c
            return r4
        L3c:
            int r3 = r3 + 1
            goto L9
        L3f:
            java.lang.Class r9 = r9.getSuperclass()
            goto L0
        L44:
            r9 = 0
            return r9
    }

    public static /* synthetic */ void d(java.util.ArrayList r0, java.lang.Class r1, java.lang.reflect.Method r2) {
            lambda$checkAbstractMethodImplementation$4(r0, r1, r2)
            return
    }

    private static java.lang.String descriptorToClassName(java.lang.String r1) {
            java.lang.String r0 = "["
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L16
            java.lang.String r0 = "L"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L11
            goto L16
        L11:
            r0 = 1
            java.lang.String r1 = wb.en.f(r0, r0, r1)
        L16:
            return r1
    }

    private void doSwitchBranch(int r13, java.lang.String r14, java.lang.String[] r15, bsh.org.objectweb.asm.Label r16, bsh.org.objectweb.asm.Label[] r17, int r18, bsh.org.objectweb.asm.MethodVisitor r19) {
            r12 = this;
            r1 = r19
            r13 = r17[r13]
            r1.visitLabel(r13)
            r13 = 25
            r2 = 0
            r1.visitVarInsn(r13, r2)
            int r7 = r15.length
            r8 = r2
        Lf:
            if (r8 >= r7) goto La1
            r9 = r15[r8]
            java.lang.String r2 = "Z"
            boolean r2 = r9.equals(r2)
            java.lang.String r10 = "getObject"
            if (r2 == 0) goto L23
            java.lang.String r2 = "getBoolean"
        L1f:
            r11 = r18
            r4 = r2
            goto L73
        L23:
            java.lang.String r2 = "B"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L2e
            java.lang.String r2 = "getByte"
            goto L1f
        L2e:
            java.lang.String r2 = "C"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L39
            java.lang.String r2 = "getChar"
            goto L1f
        L39:
            java.lang.String r2 = "S"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L44
            java.lang.String r2 = "getShort"
            goto L1f
        L44:
            java.lang.String r2 = "I"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L4f
            java.lang.String r2 = "getInt"
            goto L1f
        L4f:
            java.lang.String r2 = "J"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L5a
            java.lang.String r2 = "getLong"
            goto L1f
        L5a:
            java.lang.String r2 = "D"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L65
            java.lang.String r2 = "getDouble"
            goto L1f
        L65:
            java.lang.String r2 = "F"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L70
            java.lang.String r2 = "getFloat"
            goto L1f
        L70:
            r11 = r18
            r4 = r10
        L73:
            r1.visitVarInsn(r13, r11)
            boolean r2 = r4.equals(r10)
            if (r2 == 0) goto L7f
            java.lang.String r2 = "Ljava/lang/Object;"
            goto L80
        L7f:
            r2 = r9
        L80:
            java.lang.String r3 = "()"
            java.lang.String r5 = r3.concat(r2)
            r6 = 0
            r2 = 182(0xb6, float:2.55E-43)
            java.lang.String r3 = "bsh/This$ConstructorArgs"
            r1.visitMethodInsn(r2, r3, r4, r5, r6)
            boolean r2 = r4.equals(r10)
            if (r2 == 0) goto L9d
            r2 = 192(0xc0, float:2.69E-43)
            java.lang.String r3 = descriptorToClassName(r9)
            r1.visitTypeInsn(r2, r3)
        L9d:
            int r8 = r8 + 1
            goto Lf
        La1:
            java.lang.String r13 = "V"
            java.lang.String r4 = getMethodDescriptor(r13, r15)
            java.lang.String r3 = "<init>"
            r5 = 0
            r1 = 183(0xb7, float:2.56E-43)
            r2 = r14
            r0 = r19
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            r1 = r0
            r13 = 167(0xa7, float:2.34E-43)
            r14 = r16
            r1.visitJumpInsn(r13, r14)
            return
    }

    public static /* synthetic */ boolean e(java.lang.reflect.Method r0) {
            boolean r0 = lambda$checkAbstractMethodImplementation$0(r0)
            return r0
    }

    private void generateEnumStaticInit(java.lang.String r13, java.lang.String r14, bsh.org.objectweb.asm.MethodVisitor r15) {
            r12 = this;
            bsh.Variable[] r0 = r12.vars
            int r1 = r0.length
            r2 = 3
            r3 = 0
        L5:
            if (r3 >= r1) goto L53
            r4 = r0[r3]
            java.lang.String r5 = "enum"
            boolean r5 = r4.hasModifier(r5)
            if (r5 == 0) goto L4c
            r5 = 187(0xbb, float:2.62E-43)
            r15.visitTypeInsn(r5, r13)
            r5 = 89
            r15.visitInsn(r5)
            java.lang.String r5 = r4.getName()
            r15.visitLdcInsn(r5)
            r5 = 8
            if (r5 < r2) goto L2c
            int r5 = r2 + 1
            r15.visitInsn(r2)
            goto L35
        L2c:
            int r5 = r2 + 1
            int r2 = r2 + (-3)
            r6 = 16
            r15.visitIntInsn(r6, r2)
        L35:
            java.lang.String r10 = "(Ljava/lang/String;I)V"
            r11 = 0
            r7 = 183(0xb7, float:2.56E-43)
            java.lang.String r9 = "<init>"
            r8 = r13
            r6 = r15
            r6.visitMethodInsn(r7, r8, r9, r10, r11)
            r13 = 179(0xb3, float:2.51E-43)
            java.lang.String r15 = r4.getName()
            r6.visitFieldInsn(r13, r8, r15, r14)
            r2 = r5
            goto L4e
        L4c:
            r8 = r13
            r6 = r15
        L4e:
            int r3 = r3 + 1
            r15 = r6
            r13 = r8
            goto L5
        L53:
            return
    }

    private void generateEnumSupport(java.lang.String r16, java.lang.String r17, java.lang.String r18, bsh.org.objectweb.asm.ClassWriter r19) {
            r15 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "()["
            java.lang.String r6 = wb.en.g(r2, r1)
            r7 = 0
            r8 = 0
            r4 = 9
            java.lang.String r5 = "values"
            r3 = r19
            bsh.org.objectweb.asm.MethodVisitor r9 = r3.visitMethod(r4, r5, r6, r7, r8)
            r2 = r16
            pushBshStatic(r2, r0, r9)
            java.lang.String r13 = "()[Ljava/lang/Object;"
            r14 = 0
            r10 = 182(0xb6, float:2.55E-43)
            java.lang.String r11 = "bsh/This"
            java.lang.String r12 = "enumValues"
            r9.visitMethodInsn(r10, r11, r12, r13, r14)
            java.lang.String r2 = "["
            java.lang.String r2 = wb.en.g(r2, r1)
            generatePlainReturnCode(r2, r9)
            r8 = 0
            r9.visitMaxs(r8, r8)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "(Ljava/lang/String;)"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r5 = r2.toString()
            r6 = 0
            r3 = 9
            java.lang.String r4 = "valueOf"
            r2 = r19
            bsh.org.objectweb.asm.MethodVisitor r9 = r2.visitMethod(r3, r4, r5, r6, r7)
            bsh.org.objectweb.asm.Type r2 = bsh.org.objectweb.asm.Type.getType(r1)
            r9.visitLdcInsn(r2)
            r7 = 25
            r9.visitVarInsn(r7, r8)
            java.lang.String r13 = "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;"
            r10 = 184(0xb8, float:2.58E-43)
            java.lang.String r11 = "java/lang/Enum"
            java.lang.String r12 = "valueOf"
            r9.visitMethodInsn(r10, r11, r12, r13, r14)
            generatePlainReturnCode(r1, r9)
            r9.visitMaxs(r8, r8)
            r5 = 0
            r2 = 2
            java.lang.String r3 = "<init>"
            java.lang.String r4 = "(Ljava/lang/String;I)V"
            r1 = r19
            bsh.org.objectweb.asm.MethodVisitor r9 = r1.visitMethod(r2, r3, r4, r5, r6)
            r9.visitVarInsn(r7, r8)
            r1 = 1
            r9.visitVarInsn(r7, r1)
            r1 = 21
            r9.visitVarInsn(r1, r2)
            java.lang.String r13 = "(Ljava/lang/String;I)V"
            r10 = 183(0xb7, float:2.56E-43)
            java.lang.String r11 = "java/lang/Enum"
            java.lang.String r12 = "<init>"
            r9.visitMethodInsn(r10, r11, r12, r13, r14)
            r9.visitVarInsn(r7, r8)
            r9.visitLdcInsn(r0)
            java.lang.String[] r0 = new java.lang.String[r8]
            r15.generateParameterReifierCode(r0, r8, r9)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.lang.String r1 = bsh.ClassGeneratorUtil.GENERATED_CLASS_DESC
            java.lang.String r2 = "Ljava/lang/String;[Ljava/lang/Object;)V"
            java.lang.String r13 = eh.a.r(r0, r1, r2)
            r10 = 184(0xb8, float:2.58E-43)
            java.lang.String r11 = "bsh/This"
            java.lang.String r12 = "initInstance"
            r9.visitMethodInsn(r10, r11, r12, r13, r14)
            r0 = 177(0xb1, float:2.48E-43)
            r9.visitInsn(r0)
            r9.visitMaxs(r8, r8)
            return
    }

    private static void generateField(java.lang.String r1, java.lang.String r2, int r3, bsh.org.objectweb.asm.ClassWriter r4) {
            r0 = 0
            generateField(r1, r2, r3, r0, r4)
            return
    }

    private static void generateField(java.lang.String r6, java.lang.String r7, int r8, java.lang.Object r9, bsh.org.objectweb.asm.ClassWriter r10) {
            r4 = 0
            r2 = r6
            r3 = r7
            r1 = r8
            r5 = r9
            r0 = r10
            r0.visitField(r1, r2, r3, r4, r5)
            return
    }

    private void generateMethod(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String[] r15, int r16, bsh.org.objectweb.asm.ClassWriter r17) {
            r10 = this;
            r1 = r16 & 8
            r7 = 0
            if (r1 == 0) goto L8
            r1 = 1
            r8 = r1
            goto L9
        L8:
            r8 = r7
        L9:
            if (r14 != 0) goto Lf
            java.lang.String r1 = "Ljava/lang/Object;"
            r9 = r1
            goto L10
        Lf:
            r9 = r14
        L10:
            java.lang.String r4 = getMethodDescriptor(r9, r15)
            java.lang.String r5 = getTypeParameterSignature(r15)
            r6 = 0
            r3 = r13
            r2 = r16
            r1 = r17
            bsh.org.objectweb.asm.MethodVisitor r1 = r1.visitMethod(r2, r3, r4, r5, r6)
            r2 = r2 & 1280(0x500, float:1.794E-42)
            if (r2 == 0) goto L27
            return
        L27:
            if (r8 != 0) goto L34
            bsh.ClassGenerator$Type r2 = r10.type
            bsh.ClassGenerator$Type r4 = bsh.ClassGenerator.Type.INTERFACE
            if (r2 != r4) goto L30
            goto L34
        L30:
            pushBshThis(r12, r11, r1)
            goto L37
        L34:
            pushBshStatic(r12, r11, r1)
        L37:
            r1.visitLdcInsn(r13)
            r10.generateParameterReifierCode(r15, r8, r1)
            r11 = 4
            r1.visitInsn(r11)
            java.lang.String r11 = "(Ljava/lang/String;[Ljava/lang/Object;Z)Ljava/lang/Object;"
            r12 = 0
            r13 = 182(0xb6, float:2.55E-43)
            java.lang.String r0 = "bsh/This"
            java.lang.String r2 = "invokeMethod"
            r15 = r11
            r16 = r12
            r12 = r13
            r13 = r0
            r11 = r1
            r14 = r2
            r11.visitMethodInsn(r12, r13, r14, r15, r16)
            r10.generateReturnCode(r9, r11)
            r11.visitMaxs(r7, r7)
            return
    }

    private void generateParameterReifierCode(java.lang.String[] r17, boolean r18, bsh.org.objectweb.asm.MethodVisitor r19) {
            r16 = this;
            r0 = r17
            r1 = r19
            int r2 = r0.length
            r7 = 17
            r1.visitIntInsn(r7, r2)
            r2 = 189(0xbd, float:2.65E-43)
            java.lang.String r3 = "java/lang/Object"
            r1.visitTypeInsn(r2, r3)
            r8 = 1
            r2 = r18 ^ 1
            r3 = 0
            r9 = r2
            r10 = r3
        L17:
            int r2 = r0.length
            if (r10 >= r2) goto Lbe
            r11 = r0[r10]
            r2 = 89
            r1.visitInsn(r2)
            r1.visitIntInsn(r7, r10)
            boolean r3 = isPrimitive(r11)
            java.lang.String r12 = "J"
            java.lang.String r13 = "D"
            r14 = 83
            if (r3 == 0) goto L76
            java.lang.String r3 = "F"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L3b
            r3 = 23
            goto L4f
        L3b:
            boolean r3 = r11.equals(r13)
            if (r3 == 0) goto L44
            r3 = 24
            goto L4f
        L44:
            boolean r3 = r11.equals(r12)
            if (r3 == 0) goto L4d
            r3 = 22
            goto L4f
        L4d:
            r3 = 21
        L4f:
            java.lang.String r4 = bsh.ClassGeneratorUtil.PRIMITIVE_NAME
            r5 = 187(0xbb, float:2.62E-43)
            r1.visitTypeInsn(r5, r4)
            r1.visitInsn(r2)
            r1.visitVarInsn(r3, r9)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "("
            r2.<init>(r3)
            java.lang.String r3 = ")V"
            java.lang.String r5 = eh.a.r(r2, r11, r3)
            r6 = 0
            r2 = 183(0xb7, float:2.56E-43)
            r3 = r4
            java.lang.String r4 = "<init>"
            r1.visitMethodInsn(r2, r3, r4, r5, r6)
            r1.visitInsn(r14)
            goto La9
        L76:
            r2 = 25
            r1.visitVarInsn(r2, r9)
            bsh.org.objectweb.asm.Label r3 = new bsh.org.objectweb.asm.Label
            r3.<init>()
            r4 = 199(0xc7, float:2.79E-43)
            r1.visitJumpInsn(r4, r3)
            java.lang.String r4 = bsh.ClassGeneratorUtil.PRIMITIVE_NAME
            java.lang.String r5 = "NULL"
            java.lang.String r6 = bsh.ClassGeneratorUtil.PRIMITIVE_DESC
            r15 = 178(0xb2, float:2.5E-43)
            r1.visitFieldInsn(r15, r4, r5, r6)
            r1.visitInsn(r14)
            bsh.org.objectweb.asm.Label r4 = new bsh.org.objectweb.asm.Label
            r4.<init>()
            r5 = 167(0xa7, float:2.34E-43)
            r1.visitJumpInsn(r5, r4)
            r1.visitLabel(r3)
            r1.visitVarInsn(r2, r9)
            r1.visitInsn(r14)
            r1.visitLabel(r4)
        La9:
            boolean r2 = r11.equals(r13)
            if (r2 != 0) goto Lb8
            boolean r2 = r11.equals(r12)
            if (r2 == 0) goto Lb6
            goto Lb8
        Lb6:
            r2 = r8
            goto Lb9
        Lb8:
            r2 = 2
        Lb9:
            int r9 = r9 + r2
            int r10 = r10 + 1
            goto L17
        Lbe:
            return
    }

    private static void generatePlainReturnCode(java.lang.String r1, bsh.org.objectweb.asm.MethodVisitor r2) {
            java.lang.String r0 = "V"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Le
            r1 = 177(0xb1, float:2.48E-43)
            r2.visitInsn(r1)
            return
        Le:
            boolean r0 = isPrimitive(r1)
            if (r0 == 0) goto L3b
            java.lang.String r0 = "D"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1f
            r1 = 175(0xaf, float:2.45E-43)
            goto L37
        L1f:
            java.lang.String r0 = "F"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2a
            r1 = 174(0xae, float:2.44E-43)
            goto L37
        L2a:
            java.lang.String r0 = "J"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L35
            r1 = 173(0xad, float:2.42E-43)
            goto L37
        L35:
            r1 = 172(0xac, float:2.41E-43)
        L37:
            r2.visitInsn(r1)
            return
        L3b:
            r0 = 192(0xc0, float:2.69E-43)
            java.lang.String r1 = descriptorToClassName(r1)
            r2.visitTypeInsn(r0, r1)
            r1 = 176(0xb0, float:2.47E-43)
            r2.visitInsn(r1)
            return
    }

    private void generateReturnCode(java.lang.String r11, bsh.org.objectweb.asm.MethodVisitor r12) {
            r10 = this;
            java.lang.String r0 = "V"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L13
            r11 = 87
            r12.visitInsn(r11)
            r11 = 177(0xb1, float:2.48E-43)
            r12.visitInsn(r11)
            return
        L13:
            boolean r0 = isPrimitive(r11)
            r1 = 192(0xc0, float:2.69E-43)
            if (r0 == 0) goto L99
            java.lang.String r0 = "Z"
            boolean r0 = r11.equals(r0)
            r2 = 172(0xac, float:2.41E-43)
            if (r0 == 0) goto L2c
            java.lang.String r0 = "java/lang/Boolean"
            java.lang.String r3 = "booleanValue"
        L29:
            r6 = r0
            r7 = r3
            goto L85
        L2c:
            java.lang.String r0 = "C"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L39
            java.lang.String r0 = "java/lang/Character"
            java.lang.String r3 = "charValue"
            goto L29
        L39:
            java.lang.String r0 = "B"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L46
            java.lang.String r0 = "java/lang/Byte"
            java.lang.String r3 = "byteValue"
            goto L29
        L46:
            java.lang.String r0 = "S"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L53
            java.lang.String r0 = "java/lang/Short"
            java.lang.String r3 = "shortValue"
            goto L29
        L53:
            java.lang.String r0 = "F"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L62
            r2 = 174(0xae, float:2.44E-43)
            java.lang.String r0 = "java/lang/Float"
            java.lang.String r3 = "floatValue"
            goto L29
        L62:
            java.lang.String r0 = "J"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L71
            r2 = 173(0xad, float:2.42E-43)
            java.lang.String r0 = "java/lang/Long"
            java.lang.String r3 = "longValue"
            goto L29
        L71:
            java.lang.String r0 = "D"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L80
            r2 = 175(0xaf, float:2.45E-43)
            java.lang.String r0 = "java/lang/Double"
            java.lang.String r3 = "doubleValue"
            goto L29
        L80:
            java.lang.String r0 = "java/lang/Integer"
            java.lang.String r3 = "intValue"
            goto L29
        L85:
            r12.visitTypeInsn(r1, r6)
            java.lang.String r0 = "()"
            java.lang.String r8 = r0.concat(r11)
            r9 = 0
            r5 = 182(0xb6, float:2.55E-43)
            r4 = r12
            r4.visitMethodInsn(r5, r6, r7, r8, r9)
            r4.visitInsn(r2)
            return
        L99:
            r4 = r12
            java.lang.String r11 = descriptorToClassName(r11)
            r4.visitTypeInsn(r1, r11)
            r11 = 176(0xb0, float:2.47E-43)
            r4.visitInsn(r11)
            return
    }

    private void generateSuperDelegateMethod(java.lang.Class<?> r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String[] r12, int r13, bsh.org.objectweb.asm.ClassWriter r14) {
            r7 = this;
            if (r11 != 0) goto L4
            java.lang.String r11 = "Ljava/lang/Object;"
        L4:
            java.lang.String r3 = getMethodDescriptor(r11, r12)
            java.lang.String r4 = getTypeParameterSignature(r12)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "_bshSuper"
            r0.<init>(r1)
            java.lang.String r8 = r8.getSimpleName()
            r0.append(r8)
            r0.append(r10)
            java.lang.String r2 = r0.toString()
            r5 = 0
            r1 = r13
            r0 = r14
            bsh.org.objectweb.asm.MethodVisitor r0 = r0.visitMethod(r1, r2, r3, r4, r5)
            r8 = 25
            r13 = 0
            r0.visitVarInsn(r8, r13)
            int r14 = r12.length
            r1 = 1
            r2 = r13
            r4 = r1
        L32:
            if (r2 >= r14) goto L5d
            r5 = r12[r2]
            boolean r6 = isPrimitive(r5)
            if (r6 == 0) goto L42
            r6 = 21
            r0.visitVarInsn(r6, r4)
            goto L45
        L42:
            r0.visitVarInsn(r8, r4)
        L45:
            java.lang.String r6 = "D"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L58
            java.lang.String r6 = "J"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L56
            goto L58
        L56:
            r5 = r1
            goto L59
        L58:
            r5 = 2
        L59:
            int r4 = r4 + r5
            int r2 = r2 + 1
            goto L32
        L5d:
            r1 = 183(0xb7, float:2.56E-43)
            r5 = 0
            r2 = r9
            r4 = r3
            r3 = r10
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            generatePlainReturnCode(r11, r0)
            r0.visitMaxs(r13, r13)
            return
    }

    private static int getASMModifiers(bsh.Modifiers r3) {
            r0 = 1
            boolean r1 = r3.hasModifier(r0)
            r2 = 2
            boolean r2 = r3.hasModifier(r2)
            if (r2 == 0) goto Le
            r1 = r1 | 2
        Le:
            r2 = 4
            boolean r2 = r3.hasModifier(r2)
            if (r2 == 0) goto L17
            r1 = r1 | 4
        L17:
            r2 = 8
            boolean r2 = r3.hasModifier(r2)
            if (r2 == 0) goto L21
            r1 = r1 | 8
        L21:
            r2 = 32
            boolean r2 = r3.hasModifier(r2)
            if (r2 == 0) goto L2b
            r1 = r1 | 32
        L2b:
            r2 = 1024(0x400, float:1.435E-42)
            boolean r2 = r3.hasModifier(r2)
            if (r2 == 0) goto L35
            r1 = r1 | 1024(0x400, float:1.435E-42)
        L35:
            r2 = 256(0x100, float:3.59E-43)
            boolean r2 = r3.hasModifier(r2)
            if (r2 == 0) goto L3f
            r1 = r1 | 256(0x100, float:3.59E-43)
        L3f:
            int r2 = r3.getModifiers()
            r2 = r2 & 7
            if (r2 != 0) goto L4b
            r1 = r1 | r0
            r3.addModifier(r0)
        L4b:
            return r1
    }

    private static java.lang.String getMethodDescriptor(java.lang.String r4, java.lang.String[] r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            int r1 = r5.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L13
            r3 = r5[r2]
            r0.append(r3)
            int r2 = r2 + 1
            goto L9
        L13:
            r5 = 41
            r0.append(r5)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    public static java.lang.String[] getTypeDescriptors(java.lang.Class<?>[] r4) {
            int r0 = r4.length
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto L11
            r3 = r4[r2]
            java.lang.String r3 = bsh.BSHType.getTypeDescriptor(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L4
        L11:
            return r1
    }

    private static java.lang.String getTypeParameterSignature(java.lang.String[] r0) {
            r0 = 0
            return r0
    }

    private static boolean isPrimitive(java.lang.String r1) {
            int r1 = r1.length()
            r0 = 1
            if (r1 != r0) goto L8
            return r0
        L8:
            r1 = 0
            return r1
    }

    private static /* synthetic */ boolean lambda$checkAbstractMethodImplementation$0(java.lang.reflect.Method r0) {
            int r0 = r0.getModifiers()
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    private static /* synthetic */ boolean lambda$checkAbstractMethodImplementation$1(java.lang.reflect.Method r2, java.lang.reflect.Method r3) {
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = r3.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L26
            int r0 = r3.getModifiers()
            r0 = r0 & 1026(0x402, float:1.438E-42)
            if (r0 != 0) goto L26
            java.lang.Class[] r2 = r2.getParameterTypes()
            java.lang.Class[] r3 = r3.getParameterTypes()
            boolean r2 = bsh.Types.areSignaturesEqual(r2, r3)
            if (r2 == 0) goto L26
            r2 = 1
            return r2
        L26:
            r2 = 0
            return r2
    }

    private static /* synthetic */ int lambda$checkAbstractMethodImplementation$2(java.lang.reflect.Method r2, java.lang.reflect.Method r3) {
            int r0 = r2.getModifiers()
            r1 = 1
            r0 = r0 & r1
            if (r0 > 0) goto L22
            int r0 = r3.getModifiers()
            r0 = r0 & 5
            if (r0 != 0) goto L11
            goto L22
        L11:
            int r2 = r2.getModifiers()
            r2 = r2 & 7
            int r3 = r3.getModifiers()
            r3 = r3 & 7
            if (r2 != r3) goto L21
            r2 = 0
            return r2
        L21:
            return r1
        L22:
            r2 = -1
            return r2
    }

    private static /* synthetic */ java.lang.reflect.Method[] lambda$checkAbstractMethodImplementation$3(int r0) {
            java.lang.reflect.Method[] r0 = new java.lang.reflect.Method[r0]
            return r0
    }

    private static /* synthetic */ void lambda$checkAbstractMethodImplementation$4(java.util.List r2, java.lang.Class r3, java.lang.reflect.Method r4) {
            java.util.stream.Stream r2 = r2.stream()
            be.i r0 = new be.i
            r1 = 3
            r0.<init>(r4, r1)
            java.util.stream.Stream r2 = r2.filter(r0)
            bsh.f r0 = new bsh.f
            r0.<init>()
            java.util.stream.Stream r2 = r2.sorted(r0)
            bsh.e r0 = new bsh.e
            r1 = 1
            r0.<init>(r1)
            java.lang.Object[] r2 = r2.toArray(r0)
            java.lang.reflect.Method[] r2 = (java.lang.reflect.Method[]) r2
            int r0 = r2.length
            if (r0 != 0) goto L65
            bsh.Modifiers r0 = bsh.Reflect.getClassModifiers(r3)
            java.lang.String r1 = "abstract"
            boolean r0 = r0.hasModifier(r1)
            if (r0 == 0) goto L33
            goto L65
        L33:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = r3.getSimpleName()
            java.lang.String r0 = r4.getName()
            java.lang.Class r4 = r4.getDeclaringClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " is not abstract and does not override abstract method "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = "() in "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r2.<init>(r3)
            throw r2
        L65:
            int r3 = r2.length
            if (r3 <= 0) goto L7a
            int r3 = r4.getModifiers()
            r0 = 0
            r2 = r2[r0]
            int r2 = r2.getModifiers()
            java.lang.Class r4 = r4.getDeclaringClass()
            checkInheritanceRules(r3, r2, r4)
        L7a:
            return
    }

    private static void pushBshStatic(java.lang.String r2, java.lang.String r3, bsh.org.objectweb.asm.MethodVisitor r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            bsh.This$Keys r1 = bsh.This.Keys.BSHSTATIC
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "Lbsh/This;"
            r1 = 178(0xb2, float:2.5E-43)
            r4.visitFieldInsn(r1, r2, r3, r0)
            return
    }

    private static void pushBshThis(java.lang.String r2, java.lang.String r3, bsh.org.objectweb.asm.MethodVisitor r4) {
            r0 = 25
            r1 = 0
            r4.visitVarInsn(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            bsh.This$Keys r1 = bsh.This.Keys.BSHTHIS
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "Lbsh/This;"
            r1 = 180(0xb4, float:2.52E-43)
            r4.visitFieldInsn(r1, r2, r3, r0)
            return
    }

    public static void startInterpreterForClass(java.lang.Class<?> r7) {
            java.lang.String r0 = "class_"
            java.lang.String r1 = r7.getName()
            r2 = 1
            java.lang.String r1 = bsh.Name.suffix(r1, r2)
            java.lang.String r2 = ".bsh"
            java.lang.String r2 = bc.e.i(r1, r2)
            java.net.URL r3 = r7.getResource(r2)
            if (r3 == 0) goto L8a
            bsh.FileReader r3 = new bsh.FileReader     // Catch: java.lang.Throwable -> L55 bsh.TargetError -> L6a
            java.io.InputStream r4 = r7.getResourceAsStream(r2)     // Catch: java.lang.Throwable -> L55 bsh.TargetError -> L6a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L55 bsh.TargetError -> L6a
            bsh.Interpreter r4 = new bsh.Interpreter     // Catch: java.lang.Throwable -> L4b
            r4.<init>()     // Catch: java.lang.Throwable -> L4b
            bsh.NameSpace r5 = r4.getNameSpace()     // Catch: java.lang.Throwable -> L4b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L4b
            r6.append(r1)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = "_global"
            r6.append(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L4b
            r5.setName(r0)     // Catch: java.lang.Throwable -> L4b
            bsh.BshClassManager r0 = r5.getClassManager()     // Catch: java.lang.Throwable -> L4b
            r0.associateClass(r7)     // Catch: java.lang.Throwable -> L4b
            r4.eval(r3, r5, r2)     // Catch: java.lang.Throwable -> L4b
            r3.close()     // Catch: java.lang.Throwable -> L55 java.lang.Throwable -> L55 bsh.TargetError -> L6a
            return
        L4b:
            r7 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r0 = move-exception
            r7.addSuppressed(r0)     // Catch: java.lang.Throwable -> L55 java.lang.Throwable -> L55 bsh.TargetError -> L6a
        L54:
            throw r7     // Catch: java.lang.Throwable -> L55 java.lang.Throwable -> L55 bsh.TargetError -> L6a
        L55:
            r7 = move-exception
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Evaluation Error: "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.println(r7)
            goto L89
        L6a:
            r7 = move-exception
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Script threw exception: "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            boolean r0 = r7.inNativeCode()
            if (r0 == 0) goto L89
            java.io.PrintStream r0 = java.lang.System.err
            r7.printStackTrace(r0)
        L89:
            return
        L8a:
            bsh.InterpreterError r0 = new bsh.InterpreterError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Script ("
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = ") for BeanShell generated class: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = " not found."
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
    }

    public byte[] generateClass() {
            r16 = this;
            r0 = r16
            java.util.Map<java.lang.String, bsh.NameSpace> r1 = bsh.This.contextStore
            java.lang.String r2 = r0.uuid
            java.lang.Object r1 = r1.get(r2)
            bsh.NameSpace r1 = (bsh.NameSpace) r1
            bsh.Modifiers r2 = r0.classModifiers
            int r2 = getASMModifiers(r2)
            bsh.ClassGenerator$Type r3 = r0.type
            bsh.ClassGenerator$Type r4 = bsh.ClassGenerator.Type.INTERFACE
            if (r3 != r4) goto L1c
            r2 = r2 | 1537(0x601, float:2.154E-42)
        L1a:
            r5 = r2
            goto L2c
        L1c:
            bsh.ClassGenerator$Type r4 = bsh.ClassGenerator.Type.ENUM
            if (r3 != r4) goto L23
            r2 = r2 | 16433(0x4031, float:2.3028E-41)
            goto L1a
        L23:
            r2 = r2 | 33
            r3 = r2 & 1024(0x400, float:1.435E-42)
            if (r3 <= 0) goto L1a
            int r2 = r2 + (-1024)
            goto L1a
        L2c:
            java.lang.Class<?>[] r2 = r0.interfaces
            int r2 = r2.length
            r10 = 1
            int r2 = r2 + r10
            java.lang.String[] r9 = new java.lang.String[r2]
            r11 = 0
            r2 = r11
        L35:
            java.lang.Class<?>[] r3 = r0.interfaces
            int r4 = r3.length
            if (r2 >= r4) goto L63
            r3 = r3[r2]
            java.lang.String r3 = bsh.org.objectweb.asm.Type.getInternalName(r3)
            r9[r2] = r3
            java.lang.Class<?>[] r3 = r0.interfaces
            r3 = r3[r2]
            boolean r3 = bsh.Reflect.isGeneratedClass(r3)
            if (r3 == 0) goto L60
            java.lang.Class<?>[] r3 = r0.interfaces
            r3 = r3[r2]
            bsh.Variable[] r3 = bsh.Reflect.getVariables(r3)
            int r4 = r3.length
            r6 = r11
        L56:
            if (r6 >= r4) goto L60
            r7 = r3[r6]
            r1.setVariableImpl(r7)
            int r6 = r6 + 1
            goto L56
        L60:
            int r2 = r2 + 1
            goto L35
        L63:
            int r2 = r3.length
            java.lang.Class<bsh.GeneratedClass> r3 = bsh.GeneratedClass.class
            java.lang.String r3 = bsh.org.objectweb.asm.Type.getInternalName(r3)
            r9[r2] = r3
            bsh.org.objectweb.asm.ClassWriter r7 = new bsh.org.objectweb.asm.ClassWriter
            r2 = 2
            r7.<init>(r2)
            bsh.ClassGenerator$Type r2 = r0.type
            bsh.ClassGenerator$Type r3 = bsh.ClassGenerator.Type.ENUM
            if (r2 != r3) goto L88
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Ljava/lang/Enum<"
            r2.<init>(r3)
            java.lang.String r3 = r0.classDescript
            java.lang.String r4 = ">;"
            java.lang.String r2 = eh.a.r(r2, r3, r4)
            goto L89
        L88:
            r2 = 0
        L89:
            java.lang.String r6 = r0.fqClassName
            java.lang.String r8 = r0.superClassName
            r4 = 52
            r3 = r7
            r7 = r2
            r3.visit(r4, r5, r6, r7, r8, r9)
            r7 = r3
            bsh.ClassGenerator$Type r2 = r0.type
            bsh.ClassGenerator$Type r3 = bsh.ClassGenerator.Type.INTERFACE
            java.lang.String r4 = "Lbsh/This;"
            if (r2 == r3) goto Lb3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            bsh.This$Keys r3 = bsh.This.Keys.BSHTHIS
            r2.append(r3)
            java.lang.String r3 = r0.className
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            generateField(r2, r4, r10, r7)
        Lb3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            bsh.This$Keys r3 = bsh.This.Keys.BSHSTATIC
            r2.append(r3)
            java.lang.String r3 = r0.className
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 25
            generateField(r2, r4, r3, r7)
            java.lang.String r2 = "Ljava/lang/String;"
            java.lang.String r4 = r0.uuid
            java.lang.String r5 = "UUID"
            generateField(r5, r2, r3, r4, r7)
            bsh.Variable[] r2 = r0.vars
            int r3 = r2.length
            r4 = r11
        Ld8:
            java.lang.String r8 = "private"
            if (r4 >= r3) goto L118
            r5 = r2[r4]
            boolean r6 = r5.hasModifier(r8)
            if (r6 == 0) goto Le5
            goto L115
        Le5:
            java.lang.String r6 = r5.getTypeDescriptor()
            bsh.Modifiers r8 = r5.getModifiers()
            int r8 = getASMModifiers(r8)
            bsh.ClassGenerator$Type r9 = r0.type
            bsh.ClassGenerator$Type r12 = bsh.ClassGenerator.Type.INTERFACE
            if (r9 != r12) goto Lfe
            r5.setConstant()
            r1.setVariableImpl(r5)
            goto L115
        Lfe:
            bsh.ClassGenerator$Type r12 = bsh.ClassGenerator.Type.ENUM
            if (r9 != r12) goto L10e
            java.lang.String r9 = "enum"
            boolean r9 = r5.hasModifier(r9)
            if (r9 == 0) goto L10e
            r8 = r8 | 16400(0x4010, float:2.2981E-41)
            java.lang.String r6 = r0.classDescript
        L10e:
            java.lang.String r5 = r5.getName()
            generateField(r5, r6, r8, r7)
        L115:
            int r4 = r4 + 1
            goto Ld8
        L118:
            bsh.ClassGenerator$Type r1 = r0.type
            bsh.ClassGenerator$Type r2 = bsh.ClassGenerator.Type.ENUM
            if (r1 != r2) goto L127
            java.lang.String r1 = r0.fqClassName
            java.lang.String r2 = r0.className
            java.lang.String r3 = r0.classDescript
            r0.generateEnumSupport(r1, r2, r3, r7)
        L127:
            r0.generateStaticInitializer(r7)
            r1 = r11
            r2 = r1
        L12c:
            bsh.DelayedEvalBshMethod[] r3 = r0.constructors
            int r4 = r3.length
            if (r1 >= r4) goto L161
            r3 = r3[r1]
            boolean r3 = r3.hasModifier(r8)
            if (r3 == 0) goto L13a
            goto L15e
        L13a:
            bsh.DelayedEvalBshMethod[] r2 = r0.constructors
            r2 = r2[r1]
            bsh.Modifiers r2 = r2.getModifiers()
            int r2 = getASMModifiers(r2)
            bsh.DelayedEvalBshMethod[] r3 = r0.constructors
            r3 = r3[r1]
            boolean r3 = r3.isVarArgs()
            if (r3 == 0) goto L152
            r2 = r2 | 128(0x80, float:1.8E-43)
        L152:
            bsh.DelayedEvalBshMethod[] r3 = r0.constructors
            r3 = r3[r1]
            java.lang.String[] r3 = r3.getParamTypeDescriptors()
            r0.generateConstructor(r1, r3, r2, r7)
            r2 = r10
        L15e:
            int r1 = r1 + 1
            goto L12c
        L161:
            bsh.ClassGenerator$Type r1 = r0.type
            bsh.ClassGenerator$Type r3 = bsh.ClassGenerator.Type.CLASS
            if (r1 != r3) goto L16f
            if (r2 != 0) goto L16f
            r1 = -1
            java.lang.String[] r2 = new java.lang.String[r11]
            r0.generateConstructor(r1, r2, r10, r7)
        L16f:
            bsh.DelayedEvalBshMethod[] r9 = r0.methods
            int r12 = r9.length
            r13 = r11
        L173:
            if (r13 >= r12) goto L201
            r14 = r9[r13]
            boolean r1 = r14.isExtension
            if (r1 == 0) goto L17d
            goto L1fb
        L17d:
            boolean r1 = r14.hasModifier(r8)
            if (r1 == 0) goto L185
            goto L1fb
        L185:
            bsh.ClassGenerator$Type r1 = r0.type
            bsh.ClassGenerator$Type r2 = bsh.ClassGenerator.Type.INTERFACE
            if (r1 != r2) goto L1aa
            java.lang.String r1 = "static"
            boolean r1 = r14.hasModifier(r1)
            if (r1 != 0) goto L1aa
            java.lang.String r1 = "default"
            boolean r1 = r14.hasModifier(r1)
            if (r1 != 0) goto L1aa
            java.lang.String r1 = "abstract"
            boolean r2 = r14.hasModifier(r1)
            if (r2 != 0) goto L1aa
            bsh.Modifiers r2 = r14.getModifiers()
            r2.addModifier(r1)
        L1aa:
            bsh.Modifiers r1 = r14.getModifiers()
            int r1 = getASMModifiers(r1)
            boolean r2 = r14.isVarArgs()
            if (r2 == 0) goto L1ba
            r1 = r1 | 128(0x80, float:1.8E-43)
        L1ba:
            r6 = r1
            r1 = r6 & 8
            if (r1 <= 0) goto L1c1
            r15 = r10
            goto L1c2
        L1c1:
            r15 = r11
        L1c2:
            java.lang.String r1 = r0.className
            java.lang.String r2 = r0.fqClassName
            java.lang.String r3 = r14.getName()
            java.lang.String r4 = r14.getReturnTypeDescriptor()
            java.lang.String[] r5 = r14.getParamTypeDescriptors()
            r0.generateMethod(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Class<?> r1 = r0.superClass
            java.lang.String r2 = r14.getName()
            java.lang.String[] r3 = r14.getParamTypeDescriptors()
            java.lang.reflect.Method r1 = classContainsMethod(r1, r2, r3)
            if (r1 == 0) goto L1fb
            if (r15 != 0) goto L1fb
            java.lang.Class<?> r1 = r0.superClass
            java.lang.String r2 = r0.superClassName
            java.lang.String r3 = r14.getName()
            java.lang.String r4 = r14.getReturnTypeDescriptor()
            java.lang.String[] r5 = r14.getParamTypeDescriptors()
            r6 = 1
            r0.generateSuperDelegateMethod(r1, r2, r3, r4, r5, r6, r7)
        L1fb:
            int r13 = r13 + 1
            r0 = r16
            goto L173
        L201:
            byte[] r0 = r7.toByteArray()
            return r0
    }

    public void generateConstructor(int r18, java.lang.String[] r19, int r20, bsh.org.objectweb.asm.ClassWriter r21) {
            r17 = this;
            r0 = r17
            r1 = r19
            int r2 = r1.length
            int r2 = r2 + 1
            int r3 = r1.length
            int r3 = r3 + 2
            java.lang.String r4 = "V"
            java.lang.String r8 = getMethodDescriptor(r4, r1)
            java.lang.String r9 = getTypeParameterSignature(r1)
            java.lang.String r7 = "<init>"
            r10 = 0
            r6 = r20
            r5 = r21
            bsh.org.objectweb.asm.MethodVisitor r11 = r5.visitMethod(r6, r7, r8, r9, r10)
            r4 = 0
            r0.generateParameterReifierCode(r1, r4, r11)
            r1 = 58
            r11.visitVarInsn(r1, r2)
            r1 = r18
            r0.generateConstructorSwitch(r1, r2, r3, r11)
            r1 = 25
            r11.visitVarInsn(r1, r4)
            java.lang.String r3 = r0.className
            r11.visitLdcInsn(r3)
            r11.visitVarInsn(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "("
            r1.<init>(r2)
            java.lang.String r2 = bsh.ClassGeneratorUtil.GENERATED_CLASS_DESC
            java.lang.String r3 = "Ljava/lang/String;[Ljava/lang/Object;)V"
            java.lang.String r15 = eh.a.r(r1, r2, r3)
            r16 = 0
            r12 = 184(0xb8, float:2.58E-43)
            java.lang.String r13 = "bsh/This"
            java.lang.String r14 = "initInstance"
            r11.visitMethodInsn(r12, r13, r14, r15, r16)
            r1 = 177(0xb1, float:2.48E-43)
            r11.visitInsn(r1)
            r11.visitMaxs(r4, r4)
            return
    }

    public void generateConstructorSwitch(int r18, int r19, int r20, bsh.org.objectweb.asm.MethodVisitor r21) {
            r17 = this;
            r0 = r17
            r6 = r20
            r7 = r21
            bsh.org.objectweb.asm.Label r13 = new bsh.org.objectweb.asm.Label
            r13.<init>()
            bsh.org.objectweb.asm.Label r4 = new bsh.org.objectweb.asm.Label
            r4.<init>()
            bsh.util.ValueReferenceMap<java.lang.Class<?>, bsh.BshClassManager$MemberCache> r1 = bsh.BshClassManager.memberCache
            java.lang.Class<?> r2 = r0.superClass
            java.lang.Object r1 = r1.get(r2)
            bsh.BshClassManager$MemberCache r1 = (bsh.BshClassManager.MemberCache) r1
            java.lang.Class<?> r2 = r0.superClass
            java.lang.String r2 = r2.getName()
            java.util.List r14 = r1.members(r2)
            int r1 = r14.size()
            bsh.DelayedEvalBshMethod[] r2 = r0.constructors
            int r2 = r2.length
            int r1 = r1 + r2
            bsh.org.objectweb.asm.Label[] r5 = new bsh.org.objectweb.asm.Label[r1]
            r15 = 0
            r2 = r15
        L30:
            if (r2 >= r1) goto L3c
            bsh.org.objectweb.asm.Label r3 = new bsh.org.objectweb.asm.Label
            r3.<init>()
            r5[r2] = r3
            int r2 = r2 + 1
            goto L30
        L3c:
            java.lang.Class<?> r2 = r0.superClass
            java.lang.String r2 = bsh.BSHType.getTypeDescriptor(r2)
            bsh.org.objectweb.asm.Type r2 = bsh.org.objectweb.asm.Type.getType(r2)
            r7.visitLdcInsn(r2)
            java.lang.String r2 = r0.fqClassName
            java.lang.String r3 = r0.className
            pushBshStatic(r2, r3, r7)
            r2 = 25
            r3 = r19
            r7.visitVarInsn(r2, r3)
            r3 = 16
            r8 = r18
            r7.visitIntInsn(r3, r8)
            java.lang.String r11 = "(Ljava/lang/Class;Lbsh/This;[Ljava/lang/Object;I)Lbsh/This$ConstructorArgs;"
            r12 = 0
            r8 = 184(0xb8, float:2.58E-43)
            java.lang.String r9 = "bsh/This"
            java.lang.String r10 = "getConstructorArgs"
            r7.visitMethodInsn(r8, r9, r10, r11, r12)
            r3 = 58
            r7.visitVarInsn(r3, r6)
            r7.visitVarInsn(r2, r6)
            java.lang.String r3 = "selector"
            java.lang.String r8 = "I"
            r9 = 180(0xb4, float:2.52E-43)
            java.lang.String r10 = "bsh/This$ConstructorArgs"
            r7.visitFieldInsn(r9, r10, r3, r8)
            int r1 = r1 + (-1)
            r7.visitTableSwitchInsn(r15, r1, r13, r5)
            r1 = r15
            r8 = r1
        L84:
            int r3 = r14.size()
            if (r8 >= r3) goto La9
            r3 = r2
            java.lang.String r2 = r0.superClassName
            java.lang.Object r9 = r14.get(r8)
            bsh.Invocable r9 = (bsh.Invocable) r9
            java.lang.String[] r9 = r9.getParamTypeDescriptors()
            r16 = r9
            r9 = r3
            r3 = r16
            r0.doSwitchBranch(r1, r2, r3, r4, r5, r6, r7)
            int r8 = r8 + 1
            int r1 = r1 + 1
            r6 = r20
            r7 = r21
            r2 = r9
            goto L84
        La9:
            r9 = r2
            r8 = r15
        Lab:
            bsh.DelayedEvalBshMethod[] r2 = r0.constructors
            int r3 = r2.length
            if (r8 >= r3) goto Lc7
            r3 = r2
            java.lang.String r2 = r0.fqClassName
            r3 = r3[r8]
            java.lang.String[] r3 = r3.getParamTypeDescriptors()
            r6 = r20
            r7 = r21
            r0.doSwitchBranch(r1, r2, r3, r4, r5, r6, r7)
            r6 = r0
            r10 = r4
            int r8 = r8 + 1
            int r1 = r1 + 1
            goto Lab
        Lc7:
            r7 = r21
            r6 = r0
            r10 = r4
            r7.visitLabel(r13)
            r7.visitVarInsn(r9, r15)
            java.lang.String r2 = r6.superClassName
            java.lang.String r4 = "()V"
            r5 = 0
            r1 = 183(0xb7, float:2.56E-43)
            java.lang.String r3 = "<init>"
            r0 = r7
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            r7.visitLabel(r10)
            return
    }

    public void generateStaticInitializer(bsh.org.objectweb.asm.ClassWriter r13) {
            r12 = this;
            r4 = 0
            r5 = 0
            r1 = 8
            java.lang.String r2 = "<clinit>"
            java.lang.String r3 = "()V"
            r0 = r13
            bsh.org.objectweb.asm.MethodVisitor r6 = r0.visitMethod(r1, r2, r3, r4, r5)
            java.lang.String r13 = r12.fqClassName
            java.lang.String r0 = "UUID"
            java.lang.String r1 = "Ljava/lang/String;"
            r2 = 178(0xb2, float:2.5E-43)
            r6.visitFieldInsn(r2, r13, r0, r1)
            java.lang.String r10 = "(Ljava/lang/String;)Lbsh/This;"
            r11 = 0
            r7 = 184(0xb8, float:2.58E-43)
            java.lang.String r8 = "bsh/This"
            java.lang.String r9 = "pullBshStatic"
            r6.visitMethodInsn(r7, r8, r9, r10, r11)
            java.lang.String r13 = r12.fqClassName
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            bsh.This$Keys r1 = bsh.This.Keys.BSHSTATIC
            r0.append(r1)
            java.lang.String r1 = r12.className
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Lbsh/This;"
            r2 = 179(0xb3, float:2.51E-43)
            r6.visitFieldInsn(r2, r13, r0, r1)
            bsh.ClassGenerator$Type r13 = r12.type
            bsh.ClassGenerator$Type r0 = bsh.ClassGenerator.Type.ENUM
            if (r13 != r0) goto L4d
            java.lang.String r13 = r12.fqClassName
            java.lang.String r0 = r12.classDescript
            r12.generateEnumStaticInit(r13, r0, r6)
        L4d:
            java.lang.String r13 = r12.classDescript
            bsh.org.objectweb.asm.Type r13 = bsh.org.objectweb.asm.Type.getType(r13)
            r6.visitLdcInsn(r13)
            java.lang.String r10 = "(Ljava/lang/Class;)V"
            r11 = 0
            r7 = 184(0xb8, float:2.58E-43)
            java.lang.String r8 = "bsh/This"
            java.lang.String r9 = "initStatic"
            r6.visitMethodInsn(r7, r8, r9, r10, r11)
            r13 = 177(0xb1, float:2.48E-43)
            r6.visitInsn(r13)
            r13 = 0
            r6.visitMaxs(r13, r13)
            return
    }

    public void initStaticNameSpace(bsh.NameSpace r5, bsh.BSHBlock r6) {
            r4 = this;
            java.lang.String r0 = ""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: bsh.UtilEvalError -> L3b
            r1.<init>(r0)     // Catch: bsh.UtilEvalError -> L3b
            bsh.This$Keys r2 = bsh.This.Keys.BSHCLASSMODIFIERS     // Catch: bsh.UtilEvalError -> L3b
            r1.append(r2)     // Catch: bsh.UtilEvalError -> L3b
            java.lang.String r1 = r1.toString()     // Catch: bsh.UtilEvalError -> L3b
            bsh.Modifiers r2 = r4.classModifiers     // Catch: bsh.UtilEvalError -> L3b
            r3 = 0
            r5.setLocalVariable(r1, r2, r3)     // Catch: bsh.UtilEvalError -> L3b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: bsh.UtilEvalError -> L3b
            r1.<init>(r0)     // Catch: bsh.UtilEvalError -> L3b
            bsh.This$Keys r2 = bsh.This.Keys.BSHCONSTRUCTORS     // Catch: bsh.UtilEvalError -> L3b
            r1.append(r2)     // Catch: bsh.UtilEvalError -> L3b
            java.lang.String r1 = r1.toString()     // Catch: bsh.UtilEvalError -> L3b
            bsh.DelayedEvalBshMethod[] r2 = r4.constructors     // Catch: bsh.UtilEvalError -> L3b
            r5.setLocalVariable(r1, r2, r3)     // Catch: bsh.UtilEvalError -> L3b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: bsh.UtilEvalError -> L3b
            r1.<init>(r0)     // Catch: bsh.UtilEvalError -> L3b
            bsh.This$Keys r0 = bsh.This.Keys.BSHINIT     // Catch: bsh.UtilEvalError -> L3b
            r1.append(r0)     // Catch: bsh.UtilEvalError -> L3b
            java.lang.String r0 = r1.toString()     // Catch: bsh.UtilEvalError -> L3b
            r5.setLocalVariable(r0, r6, r3)     // Catch: bsh.UtilEvalError -> L3b
            return
        L3b:
            r5 = move-exception
            java.lang.String r6 = "Unable to init class static block: "
            bsh.j.d(r6, r5)
            return
    }
}
