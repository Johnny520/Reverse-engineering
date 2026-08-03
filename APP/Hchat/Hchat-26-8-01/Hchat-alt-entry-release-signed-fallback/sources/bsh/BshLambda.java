package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BshLambda {
    private static final bsh.BshLambda.ByteClassLoader byteClassLoader = null;
    private static volatile int dummyTypeCount;
    private static final java.util.WeakHashMap<bsh.BshLambda, java.lang.Class<?>> dummyTypesLambdas = null;
    private static java.util.Map<java.lang.Class<?>, java.lang.Class<?>> fiClasses;
    protected final java.lang.Class<?> dummyType;
    protected final bsh.Node expressionNode;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class BshLambdaFromLambdaExpression extends bsh.BshLambda {
        private final bsh.Node bodyNode;
        private final bsh.NameSpace declaringNameSpace;
        private final bsh.Modifiers[] paramsModifiers;
        private final java.lang.String[] paramsNames;
        private final java.lang.Class<?>[] paramsTypes;

        public BshLambdaFromLambdaExpression(bsh.Node r2, bsh.NameSpace r3, bsh.Modifiers[] r4, java.lang.Class<?>[] r5, java.lang.String[] r6, bsh.Node r7) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                if (r3 == 0) goto Lb
                bsh.NameSpace r2 = r3.toLambdaNameSpace()
                goto Lc
            Lb:
                r2 = 0
            Lc:
                r1.declaringNameSpace = r2
                r1.paramsModifiers = r4
                r1.paramsTypes = r5
                r1.paramsNames = r6
                r1.bodyNode = r7
                int r2 = r4.length
                int r3 = r5.length
                if (r2 != r3) goto L1f
                int r2 = r5.length
                int r3 = r6.length
                if (r2 != r3) goto L1f
                return
            L1f:
                java.lang.String r2 = "The length of 'paramsModifiers', 'paramsTypes' and 'paramsNames' can't be different!"
                j8.o.t(r2)
                r2 = 0
                throw r2
        }

        private bsh.NameSpace initNameSpace(java.lang.Object[] r8) {
                r7 = this;
                bsh.NameSpace r0 = new bsh.NameSpace
                bsh.NameSpace r1 = r7.declaringNameSpace
                java.lang.String r2 = "LambdaExpression"
                r0.<init>(r1, r2)
                r1 = 0
                r2 = r1
            Lb:
                java.lang.String[] r3 = r7.paramsNames
                int r4 = r3.length
                if (r2 >= r4) goto L2c
                java.lang.Class<?>[] r4 = r7.paramsTypes
                r4 = r4[r2]
                if (r4 == 0) goto L22
                r3 = r3[r2]
                r5 = r8[r2]
                bsh.Modifiers[] r6 = r7.paramsModifiers
                r6 = r6[r2]
                r0.setTypedVariable(r3, r4, r5, r6)
                goto L29
            L22:
                r3 = r3[r2]
                r4 = r8[r2]
                r0.setVariable(r3, r4, r1)
            L29:
                int r2 = r2 + 1
                goto Lb
            L2c:
                return r0
        }

        @Override // bsh.BshLambda
        public final java.lang.Object invokeImpl(java.lang.Object[] r4) {
                r3 = this;
                int r0 = r4.length
                java.lang.Class<?>[] r1 = r3.paramsTypes
                int r1 = r1.length
                if (r0 != r1) goto L34
                bsh.NameSpace r4 = r3.initNameSpace(r4)
                bsh.CallStack r0 = new bsh.CallStack
                r0.<init>(r4)
                bsh.Interpreter r1 = new bsh.Interpreter
                r1.<init>(r4)
                bsh.Node r4 = r3.bodyNode
                boolean r2 = r4 instanceof bsh.BSHBlock
                if (r2 == 0) goto L2f
                java.lang.Object r4 = r4.eval(r0, r1)
                boolean r0 = r4 instanceof bsh.ReturnControl
                if (r0 == 0) goto L2d
                bsh.ReturnControl r4 = (bsh.ReturnControl) r4
                int r0 = r4.kind
                r1 = 47
                if (r0 != r1) goto L2d
                java.lang.Object r4 = r4.value
                return r4
            L2d:
                r4 = 0
                return r4
            L2f:
                java.lang.Object r4 = r4.eval(r0, r1)
                return r4
            L34:
                bsh.UtilEvalError r4 = new bsh.UtilEvalError
                java.lang.String r0 = "Wrong number of arguments!"
                r4.<init>(r0)
                throw r4
        }

        @Override // bsh.BshLambda
        public boolean isAssignable(java.lang.reflect.Method r4, int r5) {
                r3 = this;
                java.lang.reflect.Type[] r4 = r4.getGenericParameterTypes()
                java.lang.Class<?>[] r0 = r3.paramsTypes
                int r1 = r0.length
                int r2 = r4.length
                if (r1 == r2) goto Lc
                r4 = 0
                return r4
            Lc:
                boolean r4 = bsh.Types.isSignatureAssignable(r0, r4, r5)
                return r4
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class BshLambdaFromMethodReference extends bsh.BshLambda {
        private final java.lang.Class<?> _class;
        private final java.lang.String methodName;
        private final java.lang.reflect.Method[] methods;
        private final boolean staticRef;
        private final java.lang.Object thisArg;

        public BshLambdaFromMethodReference(bsh.Node r2, java.lang.Object r3, java.lang.String r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                r1.thisArg = r3
                r1.methodName = r4
                boolean r2 = r3 instanceof bsh.ClassIdentifier
                r1.staticRef = r2
                if (r2 == 0) goto L13
                bsh.ClassIdentifier r3 = (bsh.ClassIdentifier) r3
                java.lang.Class<?> r2 = r3.clas
                goto L17
            L13:
                java.lang.Class r2 = r3.getClass()
            L17:
                r1._class = r2
                boolean r3 = r2.isInterface()
                if (r3 == 0) goto L34
                java.lang.reflect.Method[] r2 = r2.getMethods()
                java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
                java.lang.reflect.Method[] r3 = r3.getMethods()
                java.lang.reflect.Method[][] r2 = new java.lang.reflect.Method[][]{r2, r3}
                java.lang.Object[] r2 = bsh.util.Util.concatArrays(r2)
                java.lang.reflect.Method[] r2 = (java.lang.reflect.Method[]) r2
                goto L38
            L34:
                java.lang.reflect.Method[] r2 = r2.getMethods()
            L38:
                r1.methods = r2
                return
        }

        @Override // bsh.BshLambda
        public final java.lang.Object invokeImpl(java.lang.Object[] r12) {
                r11 = this;
                r1 = 0
                bsh.NameSpace r0 = new bsh.NameSpace     // Catch: java.lang.reflect.InvocationTargetException -> L22
                java.lang.String r2 = "MethodReferenceLambda"
                r0.<init>(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L22
                bsh.CallStack r7 = new bsh.CallStack     // Catch: java.lang.reflect.InvocationTargetException -> L22
                r7.<init>(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L22
                bsh.Interpreter r6 = new bsh.Interpreter     // Catch: java.lang.reflect.InvocationTargetException -> L22
                r6.<init>(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L22
                boolean r2 = r11.staticRef     // Catch: java.lang.reflect.InvocationTargetException -> L22
                if (r2 != 0) goto L26
                java.lang.Object r3 = r11.thisArg     // Catch: java.lang.reflect.InvocationTargetException -> L22
                java.lang.String r4 = r11.methodName     // Catch: java.lang.reflect.InvocationTargetException -> L22
                bsh.Node r8 = r11.expressionNode     // Catch: java.lang.reflect.InvocationTargetException -> L22
                r5 = r12
                java.lang.Object r12 = bsh.Reflect.invokeObjectMethod(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L22
                return r12
            L22:
                r0 = move-exception
                r12 = r0
                goto Lad
            L26:
                r5 = r12
                java.lang.String r12 = r11.methodName     // Catch: java.lang.reflect.InvocationTargetException -> L22
                java.lang.String r2 = "new"
                boolean r12 = r12.equals(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L22
                if (r12 == 0) goto L38
                java.lang.Class<?> r12 = r11._class     // Catch: java.lang.reflect.InvocationTargetException -> L22
                java.lang.Object r12 = bsh.Reflect.constructObject(r12, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L22
                return r12
            L38:
                int r12 = r5.length     // Catch: java.lang.reflect.InvocationTargetException -> L22
                if (r12 == 0) goto L9e
                java.lang.Class<?> r12 = r11._class     // Catch: java.lang.reflect.InvocationTargetException -> L22
                r2 = 0
                r3 = r5[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L22
                boolean r12 = r12.isInstance(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L22
                if (r12 != 0) goto L47
                goto L9e
            L47:
                java.lang.Class[] r12 = bsh.Types.getTypes(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L22
                int r0 = r12.length     // Catch: java.lang.reflect.InvocationTargetException -> L22
                r3 = 1
                java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r12, r3, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L22
                java.lang.Class[] r0 = (java.lang.Class[]) r0     // Catch: java.lang.reflect.InvocationTargetException -> L22
                java.lang.reflect.Method[] r4 = r11.methods     // Catch: java.lang.reflect.InvocationTargetException -> L22
                int r6 = r4.length     // Catch: java.lang.reflect.InvocationTargetException -> L22
                r7 = r2
            L57:
                if (r7 >= r6) goto L96
                r8 = r4[r7]     // Catch: java.lang.reflect.InvocationTargetException -> L22
                java.lang.String r9 = r11.methodName     // Catch: java.lang.reflect.InvocationTargetException -> L22
                java.lang.String r10 = r8.getName()     // Catch: java.lang.reflect.InvocationTargetException -> L22
                boolean r9 = r9.equals(r10)     // Catch: java.lang.reflect.InvocationTargetException -> L22
                if (r9 != 0) goto L68
                goto L93
            L68:
                boolean r9 = bsh.Reflect.isStatic(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L93
                if (r9 == 0) goto L7d
                java.lang.reflect.Type[] r9 = r8.getGenericParameterTypes()     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L93
                boolean r9 = bsh.Types.isSignatureAssignable(r12, r9, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L93
                if (r9 == 0) goto L93
                java.lang.Object r12 = r8.invoke(r1, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L93
                return r12
            L7d:
                java.lang.reflect.Type[] r9 = r8.getGenericParameterTypes()     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L93
                boolean r9 = bsh.Types.isSignatureAssignable(r0, r9, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L93
                if (r9 == 0) goto L93
                r9 = r5[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L93
                int r10 = r5.length     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L93
                java.lang.Object[] r10 = java.util.Arrays.copyOfRange(r5, r3, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L93
                java.lang.Object r12 = r8.invoke(r9, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L22 java.lang.IllegalAccessException -> L93
                return r12
            L93:
                int r7 = r7 + 1
                goto L57
            L96:
                bsh.UtilEvalError r12 = new bsh.UtilEvalError     // Catch: java.lang.reflect.InvocationTargetException -> L22
                java.lang.String r0 = "Can't invoke lambda made from method reference!"
                r12.<init>(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L22
                throw r12     // Catch: java.lang.reflect.InvocationTargetException -> L22
            L9e:
                bsh.BshClassManager r12 = r0.getClassManager()     // Catch: java.lang.reflect.InvocationTargetException -> L22
                java.lang.Class<?> r0 = r11._class     // Catch: java.lang.reflect.InvocationTargetException -> L22
                java.lang.String r2 = r11.methodName     // Catch: java.lang.reflect.InvocationTargetException -> L22
                bsh.Node r3 = r11.expressionNode     // Catch: java.lang.reflect.InvocationTargetException -> L22
                java.lang.Object r12 = bsh.Reflect.invokeStaticMethod(r12, r0, r2, r5, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L22
                return r12
            Lad:
                bsh.TargetError r0 = new bsh.TargetError
                java.lang.Throwable r12 = r12.getTargetException()
                bsh.Node r2 = r11.expressionNode
                r0.<init>(r12, r2, r1)
                throw r0
        }

        @Override // bsh.BshLambda
        public boolean isAssignable(java.lang.reflect.Method r9, int r10) {
                r8 = this;
                boolean r0 = r8.staticRef
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L48
                java.lang.Class<?> r0 = r8._class
                java.lang.reflect.Method[] r0 = r0.getMethods()
                int r3 = r0.length
                r4 = r2
            Le:
                if (r4 >= r3) goto L47
                r5 = r0[r4]
                java.lang.String r6 = r8.methodName
                java.lang.String r7 = r5.getName()
                boolean r6 = r6.equals(r7)
                if (r6 != 0) goto L1f
                goto L43
            L1f:
                boolean r6 = bsh.Reflect.isStatic(r5)
                if (r6 == 0) goto L26
                goto L43
            L26:
                java.lang.Class[] r6 = r5.getParameterTypes()
                java.lang.reflect.Type[] r7 = r9.getGenericParameterTypes()
                boolean r6 = bsh.Types.isSignatureAssignable(r6, r7, r10)
                if (r6 != 0) goto L35
                goto L43
            L35:
                java.lang.Class r5 = r5.getReturnType()
                java.lang.reflect.Type r6 = r9.getGenericReturnType()
                boolean r5 = bsh.Types.isAssignable(r5, r6, r10)
                if (r5 != 0) goto L46
            L43:
                int r4 = r4 + 1
                goto Le
            L46:
                return r1
            L47:
                return r2
            L48:
                java.lang.String r0 = r8.methodName
                java.lang.String r3 = "new"
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L7e
                java.lang.Class<?> r0 = r8._class
                java.lang.reflect.Constructor[] r0 = r0.getConstructors()
                int r3 = r0.length
                r4 = r2
            L5a:
                if (r4 >= r3) goto L7d
                r5 = r0[r4]
                java.lang.Class[] r5 = r5.getParameterTypes()
                java.lang.reflect.Type[] r6 = r9.getGenericParameterTypes()
                boolean r5 = bsh.Types.isSignatureAssignable(r5, r6, r10)
                if (r5 != 0) goto L6d
                goto L79
            L6d:
                java.lang.Class<?> r5 = r8._class
                java.lang.reflect.Type r6 = r9.getGenericReturnType()
                boolean r5 = bsh.Types.isAssignable(r5, r6, r10)
                if (r5 != 0) goto L7c
            L79:
                int r4 = r4 + 1
                goto L5a
            L7c:
                return r1
            L7d:
                return r2
            L7e:
                java.lang.reflect.Method[] r0 = r8.methods
                int r3 = r0.length
                r4 = r2
            L82:
                if (r4 >= r3) goto Le8
                r5 = r0[r4]
                java.lang.String r6 = r8.methodName
                java.lang.String r7 = r5.getName()
                boolean r6 = r6.equals(r7)
                if (r6 != 0) goto L93
                goto Le4
            L93:
                boolean r6 = bsh.Reflect.isStatic(r5)
                if (r6 == 0) goto Lb7
                java.lang.Class[] r6 = r5.getParameterTypes()
                java.lang.reflect.Type[] r7 = r9.getGenericParameterTypes()
                boolean r6 = bsh.Types.isSignatureAssignable(r6, r7, r10)
                if (r6 != 0) goto La8
                goto Le4
            La8:
                java.lang.Class r5 = r5.getReturnType()
                java.lang.reflect.Type r6 = r9.getGenericReturnType()
                boolean r5 = bsh.Types.isAssignable(r5, r6, r10)
                if (r5 != 0) goto Le7
                goto Le4
            Lb7:
                java.lang.Class<?> r6 = r8._class
                java.lang.Class[] r6 = new java.lang.Class[]{r6}
                java.lang.Class[] r7 = r5.getParameterTypes()
                java.lang.Class[][] r6 = new java.lang.Class[][]{r6, r7}
                java.lang.Object[] r6 = bsh.util.Util.concatArrays(r6)
                java.lang.Class[] r6 = (java.lang.Class[]) r6
                java.lang.reflect.Type[] r7 = r9.getGenericParameterTypes()
                boolean r6 = bsh.Types.isSignatureAssignable(r6, r7, r10)
                if (r6 != 0) goto Ld6
                goto Le4
            Ld6:
                java.lang.Class r5 = r5.getReturnType()
                java.lang.reflect.Type r6 = r9.getGenericReturnType()
                boolean r5 = bsh.Types.isAssignable(r5, r6, r10)
                if (r5 != 0) goto Le7
            Le4:
                int r4 = r4 + 1
                goto L82
            Le7:
                return r1
            Le8:
                return r2
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class ByteClassLoader extends java.lang.ClassLoader {
        private ByteClassLoader() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ ByteClassLoader(int r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.Class<?> classFromBytes(java.lang.String r1, byte[] r2) {
                r0 = this;
                java.lang.Class r1 = bsh.loader.BshLoaderHelper.getClassByCode(r1, r2)
                return r1
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class WrapperGenerator {
        private WrapperGenerator() {
                r0 = this;
                r0.<init>()
                return
        }

        public static <T> java.lang.Class<T> generateClass(java.lang.Class<T> r3) {
                java.util.Base64$Encoder r0 = java.util.Base64.getUrlEncoder()
                java.util.Base64$Encoder r0 = r0.withoutPadding()
                java.lang.String r1 = r3.getName()
                byte[] r1 = r1.getBytes()
                java.lang.String r0 = r0.encodeToString(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.Class<bsh.BshLambda> r2 = bsh.BshLambda.class
                java.lang.String r2 = r2.getName()
                r1.append(r2)
                java.lang.String r2 = "Generated"
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r1 = "."
                java.lang.String r2 = "/"
                java.lang.String r1 = r0.replace(r1, r2)
                byte[] r3 = generateClassBytes(r1, r3)
                bsh.BshLambda$ByteClassLoader r1 = bsh.BshLambda.b()
                java.lang.Class r3 = r1.classFromBytes(r0, r3)
                return r3
        }

        private static byte[] generateClassBytes(java.lang.String r7, java.lang.Class<?> r8) {
                bsh.org.objectweb.asm.ClassWriter r0 = new bsh.org.objectweb.asm.ClassWriter
                r1 = 2
                r0.<init>(r1)
                java.lang.String r1 = bsh.Types.getInternalName(r8)
                java.lang.String[] r6 = new java.lang.String[]{r1}
                java.lang.String r4 = generateClassSignature(r8)
                r2 = 1
                java.lang.String r5 = "java/lang/Object"
                r1 = 52
                r3 = r7
                r0.visit(r1, r2, r3, r4, r5, r6)
                java.lang.Class<bsh.BshLambda> r1 = bsh.BshLambda.class
                java.lang.String r3 = bsh.Types.getDescriptor(r1)
                r4 = 0
                r5 = 0
                r1 = 2
                java.lang.String r2 = "bshLambda"
                bsh.org.objectweb.asm.FieldVisitor r1 = r0.visitField(r1, r2, r3, r4, r5)
                r1.visitEnd()
                writeConstructor(r0, r7)
                java.lang.reflect.Method r8 = bsh.BshLambda.methodFromFI(r8)
                writeMethod(r0, r7, r8)
                r0.visitEnd()
                byte[] r7 = r0.toByteArray()
                return r7
        }

        private static java.lang.String generateClassSignature(java.lang.Class<?> r3) {
                java.lang.reflect.TypeVariable[] r0 = r3.getTypeParameters()
                int r0 = r0.length
                if (r0 == 0) goto L10
                java.lang.reflect.TypeVariable[] r0 = r3.getTypeParameters()
                java.lang.reflect.ParameterizedType r0 = bsh.Types.createParameterizedType(r3, r0)
                goto L11
            L10:
                r0 = r3
            L11:
                java.lang.reflect.TypeVariable[] r3 = r3.getTypeParameters()
                r1 = 1
                java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
                r2 = 0
                r1[r2] = r0
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                java.lang.String r3 = bsh.Types.getASMClassSignature(r3, r0, r1)
                return r3
        }

        private static void writeConstructor(bsh.org.objectweb.asm.ClassWriter r15, java.lang.String r16) {
                java.lang.Class<bsh.BshLambda> r0 = bsh.BshLambda.class
                java.lang.Class[] r1 = new java.lang.Class[]{r0}
                java.lang.Class r2 = java.lang.Void.TYPE
                java.lang.String r6 = bsh.Types.getMethodDescriptor(r2, r1)
                r7 = 0
                r8 = 0
                r4 = 1
                java.lang.String r5 = "<init>"
                r3 = r15
                bsh.org.objectweb.asm.MethodVisitor r9 = r3.visitMethod(r4, r5, r6, r7, r8)
                r9.visitCode()
                r15 = 25
                r1 = 0
                r9.visitVarInsn(r15, r1)
                java.lang.String r13 = "()V"
                r14 = 0
                r10 = 183(0xb7, float:2.56E-43)
                java.lang.String r11 = "java/lang/Object"
                java.lang.String r12 = "<init>"
                r9.visitMethodInsn(r10, r11, r12, r13, r14)
                r9.visitVarInsn(r15, r1)
                r2 = 1
                r9.visitVarInsn(r15, r2)
                java.lang.String r15 = "bshLambda"
                java.lang.String r0 = bsh.Types.getDescriptor(r0)
                r2 = 181(0xb5, float:2.54E-43)
                r3 = r16
                r9.visitFieldInsn(r2, r3, r15, r0)
                r15 = 177(0xb1, float:2.48E-43)
                r9.visitInsn(r15)
                r9.visitMaxs(r1, r1)
                r9.visitEnd()
                return
        }

        private static void writeMethod(bsh.org.objectweb.asm.ClassWriter r18, java.lang.String r19, java.lang.reflect.Method r20) {
                java.lang.Class<bsh.BshLambda> r0 = bsh.BshLambda.class
                java.lang.String r3 = bsh.Types.getInternalName(r0)
                java.lang.reflect.Parameter[] r1 = r20.getParameters()
                java.lang.Class[] r2 = r20.getExceptionTypes()
                java.lang.String r6 = r20.getName()
                java.lang.String r7 = bsh.Types.getMethodDescriptor(r20)
                java.lang.String r8 = bsh.Types.getASMMethodSignature(r20)
                java.lang.String[] r9 = bsh.Types.getInternalNames(r2)
                r5 = 1
                r4 = r18
                bsh.org.objectweb.asm.MethodVisitor r10 = r4.visitMethod(r5, r6, r7, r8, r9)
                r10.visitCode()
                r4 = 25
                r7 = 0
                r10.visitVarInsn(r4, r7)
                java.lang.String r5 = "bshLambda"
                java.lang.String r0 = bsh.Types.getDescriptor(r0)
                r6 = 180(0xb4, float:2.52E-43)
                r8 = r19
                r10.visitFieldInsn(r6, r8, r5, r0)
                int r0 = r1.length
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r10.visitLdcInsn(r0)
                java.lang.String r0 = "java/lang/Object"
                r5 = 189(0xbd, float:2.65E-43)
                r10.visitTypeInsn(r5, r0)
                r6 = r7
                r8 = 1
            L4c:
                int r9 = r1.length
                java.lang.Class r12 = java.lang.Float.TYPE
                java.lang.Class r13 = java.lang.Integer.TYPE
                java.lang.Class r14 = java.lang.Short.TYPE
                java.lang.Class r15 = java.lang.Byte.TYPE
                java.lang.Class r0 = java.lang.Boolean.TYPE
                java.lang.Class r11 = java.lang.Character.TYPE
                r7 = 89
                java.lang.Class r5 = java.lang.Double.TYPE
                java.lang.Class r4 = java.lang.Long.TYPE
                if (r6 >= r9) goto L12c
                r9 = r1[r6]
                java.lang.Class r9 = r9.getType()
                r10.visitInsn(r7)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                r10.visitLdcInsn(r7)
                r7 = 21
                if (r9 != r11) goto L8a
                r10.visitVarInsn(r7, r8)
                java.lang.String r14 = "(C)Ljava/lang/Character;"
                r15 = 0
                r11 = 184(0xb8, float:2.58E-43)
                java.lang.String r12 = "java/lang/Character"
                java.lang.String r13 = "valueOf"
                r0 = 83
                r10.visitMethodInsn(r11, r12, r13, r14, r15)
            L86:
                r7 = 25
                goto L118
            L8a:
                r11 = 83
                if (r9 != r0) goto L9f
                r10.visitVarInsn(r7, r8)
                java.lang.String r14 = "(Z)Ljava/lang/Boolean;"
                r15 = 0
                r0 = r11
                r11 = 184(0xb8, float:2.58E-43)
                java.lang.String r12 = "java/lang/Boolean"
                java.lang.String r13 = "valueOf"
                r10.visitMethodInsn(r11, r12, r13, r14, r15)
                goto L86
            L9f:
                r0 = r11
                if (r9 != r15) goto Lb2
                r10.visitVarInsn(r7, r8)
                java.lang.String r14 = "(B)Ljava/lang/Byte;"
                r15 = 0
                r11 = 184(0xb8, float:2.58E-43)
                java.lang.String r12 = "java/lang/Byte"
                java.lang.String r13 = "valueOf"
                r10.visitMethodInsn(r11, r12, r13, r14, r15)
                goto L86
            Lb2:
                if (r9 != r14) goto Lc4
                r10.visitVarInsn(r7, r8)
                java.lang.String r14 = "(S)Ljava/lang/Short;"
                r15 = 0
                r11 = 184(0xb8, float:2.58E-43)
                java.lang.String r12 = "java/lang/Short"
                java.lang.String r13 = "valueOf"
                r10.visitMethodInsn(r11, r12, r13, r14, r15)
                goto L86
            Lc4:
                if (r9 != r13) goto Ld6
                r10.visitVarInsn(r7, r8)
                java.lang.String r14 = "(I)Ljava/lang/Integer;"
                r15 = 0
                r11 = 184(0xb8, float:2.58E-43)
                java.lang.String r12 = "java/lang/Integer"
                java.lang.String r13 = "valueOf"
                r10.visitMethodInsn(r11, r12, r13, r14, r15)
                goto L86
            Ld6:
                if (r9 != r4) goto Lea
                r7 = 22
                r10.visitVarInsn(r7, r8)
                java.lang.String r14 = "(J)Ljava/lang/Long;"
                r15 = 0
                r11 = 184(0xb8, float:2.58E-43)
                java.lang.String r12 = "java/lang/Long"
                java.lang.String r13 = "valueOf"
                r10.visitMethodInsn(r11, r12, r13, r14, r15)
                goto L86
            Lea:
                if (r9 != r12) goto Lfe
                r7 = 23
                r10.visitVarInsn(r7, r8)
                java.lang.String r14 = "(F)Ljava/lang/Float;"
                r15 = 0
                r11 = 184(0xb8, float:2.58E-43)
                java.lang.String r12 = "java/lang/Float"
                java.lang.String r13 = "valueOf"
                r10.visitMethodInsn(r11, r12, r13, r14, r15)
                goto L86
            Lfe:
                if (r9 != r5) goto L113
                r7 = 24
                r10.visitVarInsn(r7, r8)
                java.lang.String r14 = "(D)Ljava/lang/Double;"
                r15 = 0
                r11 = 184(0xb8, float:2.58E-43)
                java.lang.String r12 = "java/lang/Double"
                java.lang.String r13 = "valueOf"
                r10.visitMethodInsn(r11, r12, r13, r14, r15)
                goto L86
            L113:
                r7 = 25
                r10.visitVarInsn(r7, r8)
            L118:
                r10.visitInsn(r0)
                if (r9 == r4) goto L122
                if (r9 != r5) goto L120
                goto L122
            L120:
                r0 = 1
                goto L123
            L122:
                r0 = 2
            L123:
                int r8 = r8 + r0
                int r6 = r6 + 1
                r4 = r7
                r5 = 189(0xbd, float:2.65E-43)
                r7 = 0
                goto L4c
            L12c:
                r6 = 83
                int r1 = r2.length
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r10.visitLdcInsn(r1)
                java.lang.String r1 = "java/lang/Class"
                r8 = 189(0xbd, float:2.65E-43)
                r10.visitTypeInsn(r8, r1)
                r1 = 0
            L13e:
                int r8 = r2.length
                if (r1 >= r8) goto L15a
                r8 = r2[r1]
                r10.visitInsn(r7)
                java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
                r10.visitLdcInsn(r9)
                bsh.org.objectweb.asm.Type r8 = bsh.Types.getASMType(r8)
                r10.visitLdcInsn(r8)
                r10.visitInsn(r6)
                int r1 = r1 + 1
                goto L13e
            L15a:
                java.lang.Class r7 = r20.getReturnType()
                boolean r1 = r7.isPrimitive()
                if (r1 == 0) goto L16a
                java.lang.Class r1 = bsh.Primitive.boxType(r7)
                r8 = r1
                goto L16b
            L16a:
                r8 = r7
            L16b:
                boolean r1 = r7.isPrimitive()
                if (r1 == 0) goto L180
                java.lang.String r1 = bsh.Types.getInternalName(r8)
                java.lang.String r2 = "TYPE"
                java.lang.String r6 = "Ljava/lang/Class;"
                r9 = 178(0xb2, float:2.5E-43)
                r10.visitFieldInsn(r9, r1, r2, r6)
            L17e:
                r1 = r5
                goto L188
            L180:
                bsh.org.objectweb.asm.Type r1 = bsh.Types.getASMType(r7)
                r10.visitLdcInsn(r1)
                goto L17e
            L188:
                java.lang.String r5 = "([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;"
                r6 = 0
                r2 = 182(0xb6, float:2.55E-43)
                r9 = r4
                java.lang.String r4 = "invoke"
                r17 = r9
                r9 = r1
                r1 = r10
                r10 = r17
                r1.visitMethodInsn(r2, r3, r4, r5, r6)
                r2 = 192(0xc0, float:2.69E-43)
                java.lang.String r3 = bsh.Types.getInternalName(r8)
                r1.visitTypeInsn(r2, r3)
                java.lang.Class r2 = java.lang.Void.TYPE
                if (r7 != r2) goto L1b4
                r0 = 87
                r1.visitInsn(r0)
                r0 = 177(0xb1, float:2.48E-43)
                r1.visitInsn(r0)
                r10 = r1
            L1b1:
                r0 = 0
                goto L25c
            L1b4:
                r2 = 172(0xac, float:2.41E-43)
                if (r7 != r0) goto L1c9
                java.lang.String r14 = "()Z"
                r15 = 0
                r11 = 182(0xb6, float:2.55E-43)
                java.lang.String r12 = "java/lang/Boolean"
                java.lang.String r13 = "booleanValue"
                r10 = r1
                r10.visitMethodInsn(r11, r12, r13, r14, r15)
                r1.visitInsn(r2)
                goto L1b1
            L1c9:
                if (r7 != r11) goto L1dc
                java.lang.String r14 = "()C"
                r15 = 0
                r11 = 182(0xb6, float:2.55E-43)
                java.lang.String r12 = "java/lang/Character"
                java.lang.String r13 = "charValue"
                r10 = r1
                r10.visitMethodInsn(r11, r12, r13, r14, r15)
                r1.visitInsn(r2)
                goto L1b1
            L1dc:
                if (r7 != r15) goto L1ef
                java.lang.String r14 = "()B"
                r15 = 0
                r11 = 182(0xb6, float:2.55E-43)
                java.lang.String r12 = "java/lang/Byte"
                java.lang.String r13 = "byteValue"
                r10 = r1
                r10.visitMethodInsn(r11, r12, r13, r14, r15)
                r1.visitInsn(r2)
                goto L1b1
            L1ef:
                if (r7 != r14) goto L202
                java.lang.String r14 = "()S"
                r15 = 0
                r11 = 182(0xb6, float:2.55E-43)
                java.lang.String r12 = "java/lang/Short"
                java.lang.String r13 = "shortValue"
                r10 = r1
                r10.visitMethodInsn(r11, r12, r13, r14, r15)
                r1.visitInsn(r2)
                goto L1b1
            L202:
                if (r7 != r13) goto L215
                java.lang.String r14 = "()I"
                r15 = 0
                r11 = 182(0xb6, float:2.55E-43)
                java.lang.String r12 = "java/lang/Integer"
                java.lang.String r13 = "intValue"
                r10 = r1
                r10.visitMethodInsn(r11, r12, r13, r14, r15)
                r1.visitInsn(r2)
                goto L1b1
            L215:
                if (r7 != r10) goto L22a
                java.lang.String r14 = "()J"
                r15 = 0
                r11 = 182(0xb6, float:2.55E-43)
                java.lang.String r12 = "java/lang/Long"
                java.lang.String r13 = "longValue"
                r10 = r1
                r10.visitMethodInsn(r11, r12, r13, r14, r15)
                r0 = 173(0xad, float:2.42E-43)
                r10.visitInsn(r0)
                goto L1b1
            L22a:
                r10 = r1
                if (r7 != r12) goto L240
                java.lang.String r14 = "()F"
                r15 = 0
                r11 = 182(0xb6, float:2.55E-43)
                java.lang.String r12 = "java/lang/Float"
                java.lang.String r13 = "floatValue"
                r10.visitMethodInsn(r11, r12, r13, r14, r15)
                r0 = 174(0xae, float:2.44E-43)
                r10.visitInsn(r0)
                goto L1b1
            L240:
                if (r7 != r9) goto L255
                java.lang.String r14 = "()D"
                r15 = 0
                r11 = 182(0xb6, float:2.55E-43)
                java.lang.String r12 = "java/lang/Double"
                java.lang.String r13 = "doubleValue"
                r10.visitMethodInsn(r11, r12, r13, r14, r15)
                r0 = 175(0xaf, float:2.45E-43)
                r10.visitInsn(r0)
                goto L1b1
            L255:
                r0 = 176(0xb0, float:2.47E-43)
                r10.visitInsn(r0)
                goto L1b1
            L25c:
                r10.visitMaxs(r0, r0)
                r10.visitEnd()
                return
        }
    }

    static {
            bsh.BshLambda$ByteClassLoader r0 = new bsh.BshLambda$ByteClassLoader
            r1 = 0
            r0.<init>(r1)
            bsh.BshLambda.byteClassLoader = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            bsh.BshLambda.dummyTypesLambdas = r0
            r0 = 1
            bsh.BshLambda.dummyTypeCount = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            bsh.BshLambda.fiClasses = r0
            return
    }

    private BshLambda(bsh.Node r2) {
            r1 = this;
            r1.<init>()
            r1.expressionNode = r2
            java.lang.Class r2 = generateDummyType()
            r1.dummyType = r2
            java.util.WeakHashMap<bsh.BshLambda, java.lang.Class<?>> r0 = bsh.BshLambda.dummyTypesLambdas
            r0.put(r1, r2)
            return
    }

    public /* synthetic */ BshLambda(bsh.Node r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ java.lang.Object a(bsh.BshLambda r0, java.lang.Object r1, java.lang.reflect.Method r2, java.lang.Object[] r3) {
            java.lang.Object r0 = r0.lambda$convertTo$0(r1, r2, r3)
            return r0
    }

    public static /* bridge */ /* synthetic */ bsh.BshLambda.ByteClassLoader b() {
            bsh.BshLambda$ByteClassLoader r0 = bsh.BshLambda.byteClassLoader
            return r0
    }

    public static bsh.BshLambda fromLambdaExpression(bsh.Node r7, bsh.NameSpace r8, bsh.Modifiers[] r9, java.lang.Class<?>[] r10, java.lang.String[] r11, bsh.Node r12) {
            bsh.BshLambda$BshLambdaFromLambdaExpression r0 = new bsh.BshLambda$BshLambdaFromLambdaExpression
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static bsh.BshLambda fromMethodReference(bsh.Node r1, java.lang.Object r2, java.lang.String r3) {
            bsh.BshLambda$BshLambdaFromMethodReference r0 = new bsh.BshLambda$BshLambdaFromMethodReference
            r0.<init>(r1, r2, r3)
            return r0
    }

    private static java.lang.Class<?> generateDummyType() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<bsh.BshLambda> r1 = bsh.BshLambda.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "Type"
            r0.append(r1)
            int r1 = bsh.BshLambda.dummyTypeCount
            int r2 = r1 + 1
            bsh.BshLambda.dummyTypeCount = r2
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            bsh.org.objectweb.asm.ClassWriter r1 = new bsh.org.objectweb.asm.ClassWriter
            r2 = 2
            r1.<init>(r2)
            java.lang.String r2 = "."
            java.lang.String r3 = "/"
            java.lang.String r4 = r0.replace(r2, r3)
            java.lang.String r6 = "java/lang/Object"
            r7 = 0
            r2 = 52
            r3 = 1537(0x601, float:2.154E-42)
            r5 = 0
            r1.visit(r2, r3, r4, r5, r6, r7)
            r1.visitEnd()
            bsh.BshLambda$ByteClassLoader r2 = bsh.BshLambda.byteClassLoader
            byte[] r1 = r1.toByteArray()
            java.lang.Class r0 = r2.classFromBytes(r0, r1)
            return r0
    }

    public static <T> java.lang.Class<T> getClassForFI(java.lang.Class<T> r2) {
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r0 = bsh.BshLambda.fiClasses
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L11
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r0 = bsh.BshLambda.fiClasses
            java.lang.Object r2 = r0.get(r2)
            java.lang.Class r2 = (java.lang.Class) r2
            return r2
        L11:
            java.lang.Class r0 = bsh.BshLambda.WrapperGenerator.generateClass(r2)
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r1 = bsh.BshLambda.fiClasses
            r1.put(r2, r0)
            return r0
    }

    public static boolean isAssignable(java.lang.Class<?> r3, java.lang.Class<?> r4, int r5) {
            java.lang.reflect.Method r4 = methodFromFI(r4)
            java.util.WeakHashMap<bsh.BshLambda, java.lang.Class<?>> r0 = bsh.BshLambda.dummyTypesLambdas
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            if (r2 != r3) goto Le
            java.lang.Object r3 = r1.getKey()
            bsh.BshLambda r3 = (bsh.BshLambda) r3
            boolean r3 = r3.isAssignable(r4, r5)
            return r3
        L2b:
            r3 = 0
            return r3
    }

    private /* synthetic */ java.lang.Object lambda$convertTo$0(java.lang.Object r6, java.lang.reflect.Method r7, java.lang.Object[] r8) {
            r5 = this;
            java.lang.Class r0 = r7.getDeclaringClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto L6a
            java.lang.String r0 = r7.getName()
            r0.getClass()
            int r1 = r0.hashCode()
            r2 = 0
            r3 = 1
            r4 = -1
            switch(r1) {
                case -1776922004: goto L30;
                case -1295482945: goto L25;
                case 147696667: goto L1a;
                default: goto L19;
            }
        L19:
            goto L3a
        L1a:
            java.lang.String r1 = "hashCode"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L23
            goto L3a
        L23:
            r4 = 2
            goto L3a
        L25:
            java.lang.String r1 = "equals"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
            goto L3a
        L2e:
            r4 = r3
            goto L3a
        L30:
            java.lang.String r1 = "toString"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L39
            goto L3a
        L39:
            r4 = r2
        L3a:
            switch(r4) {
                case 0: goto L56;
                case 1: goto L47;
                case 2: goto L3e;
                default: goto L3d;
            }
        L3d:
            goto L6a
        L3e:
            int r6 = java.lang.System.identityHashCode(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        L47:
            if (r8 == 0) goto L51
            int r7 = r8.length
            if (r7 != r3) goto L51
            r7 = r8[r2]
            if (r6 != r7) goto L51
            r2 = r3
        L51:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            return r6
        L56:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "BshLambdaProxy["
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r7 = "]"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            return r6
        L6a:
            if (r8 == 0) goto L6d
            goto L6f
        L6d:
            java.lang.Object[] r8 = bsh.Reflect.ZERO_ARGS
        L6f:
            java.lang.Class[] r6 = r7.getExceptionTypes()
            java.lang.Class r7 = r7.getReturnType()
            java.lang.Object r6 = r5.invoke(r8, r6, r7)
            return r6
    }

    public static java.lang.reflect.Method methodFromFI(java.lang.Class<?> r5) {
            java.lang.reflect.Method[] r0 = r5.getMethods()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L2a
            r3 = r0[r2]
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isAbstract(r4)
            if (r4 == 0) goto L27
            boolean r4 = r3.isBridge()
            if (r4 != 0) goto L27
            boolean r4 = r3.isSynthetic()
            if (r4 != 0) goto L27
            boolean r4 = bsh.Types.isObjectClassMethod(r3)
            if (r4 != 0) goto L27
            return r3
        L27:
            int r2 = r2 + 1
            goto L6
        L2a:
            java.lang.String r5 = r5.getName()
            java.lang.String r0 = "This class isn't a valid Functional Interface: "
            java.lang.String r5 = r0.concat(r5)
            j8.o.t(r5)
            r5 = 0
            return r5
    }

    public <T> T convertTo(java.lang.Class<T> r5) {
            r4 = this;
            java.lang.Class<?> r0 = r4.dummyType
            r1 = 4
            boolean r0 = isAssignable(r0, r5, r1)
            if (r0 == 0) goto L34
            java.lang.ClassLoader r0 = r5.getClassLoader()     // Catch: java.lang.Throwable -> L1b
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch: java.lang.Throwable -> L1b
            bsh.d r1 = new bsh.d     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r5 = java.lang.reflect.Proxy.newProxyInstance(r0, r5, r1)     // Catch: java.lang.Throwable -> L1b
            return r5
        L1b:
            r5 = move-exception
            bsh.UtilEvalError r0 = new bsh.UtilEvalError
            java.lang.String r1 = r5.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Can't create a instance for the generate class for the BshLambda: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1, r5)
            throw r0
        L34:
            bsh.UtilEvalError r0 = new bsh.UtilEvalError
            java.lang.String r5 = r5.getName()
            java.lang.String r1 = "This BshLambda can't be converted to "
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
    }

    public final <T> T invoke(java.lang.Object[] r5, java.lang.Class<?>[] r6, java.lang.Class<T> r7) {
            r4 = this;
            java.lang.String r0 = "Can't assign "
            r1 = 0
            boolean r2 = r7.isPrimitive()     // Catch: bsh.UtilEvalError -> L12 bsh.EvalError -> L14 bsh.TargetError -> L16
            if (r2 == 0) goto L18
            java.lang.Object r5 = r4.invokeImpl(r5)     // Catch: bsh.UtilEvalError -> L12 bsh.EvalError -> L14 bsh.TargetError -> L16
            java.lang.Object r5 = bsh.Primitive.unwrap(r5)     // Catch: bsh.UtilEvalError -> L12 bsh.EvalError -> L14 bsh.TargetError -> L16
            goto L1c
        L12:
            r5 = move-exception
            goto L53
        L14:
            r5 = move-exception
            goto L5f
        L16:
            r5 = move-exception
            goto L79
        L18:
            java.lang.Object r5 = r4.invokeImpl(r5)     // Catch: bsh.UtilEvalError -> L12 bsh.EvalError -> L14 bsh.TargetError -> L16
        L1c:
            java.lang.Class r2 = java.lang.Void.TYPE     // Catch: bsh.UtilEvalError -> L12 bsh.EvalError -> L14 bsh.TargetError -> L16
            if (r7 != r2) goto L21
            return r1
        L21:
            r2 = 1
            java.lang.Object r2 = bsh.Types.castObject(r5, r7, r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r5 = bsh.Primitive.unwrap(r2)     // Catch: java.lang.Throwable -> L2b
            return r5
        L2b:
            java.lang.Class r5 = bsh.Types.getType(r5)     // Catch: bsh.UtilEvalError -> L12 bsh.EvalError -> L14 bsh.TargetError -> L16
            java.lang.String r5 = bsh.Types.prettyName(r5)     // Catch: bsh.UtilEvalError -> L12 bsh.EvalError -> L14 bsh.TargetError -> L16
            java.lang.String r7 = bsh.Types.prettyName(r7)     // Catch: bsh.UtilEvalError -> L12 bsh.EvalError -> L14 bsh.TargetError -> L16
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: bsh.UtilEvalError -> L12 bsh.EvalError -> L14 bsh.TargetError -> L16
            r2.<init>(r0)     // Catch: bsh.UtilEvalError -> L12 bsh.EvalError -> L14 bsh.TargetError -> L16
            r2.append(r5)     // Catch: bsh.UtilEvalError -> L12 bsh.EvalError -> L14 bsh.TargetError -> L16
            java.lang.String r5 = " to "
            r2.append(r5)     // Catch: bsh.UtilEvalError -> L12 bsh.EvalError -> L14 bsh.TargetError -> L16
            r2.append(r7)     // Catch: bsh.UtilEvalError -> L12 bsh.EvalError -> L14 bsh.TargetError -> L16
            java.lang.String r5 = r2.toString()     // Catch: bsh.UtilEvalError -> L12 bsh.EvalError -> L14 bsh.TargetError -> L16
            bsh.RuntimeEvalError r7 = new bsh.RuntimeEvalError     // Catch: bsh.UtilEvalError -> L12 bsh.EvalError -> L14 bsh.TargetError -> L16
            bsh.Node r0 = r4.expressionNode     // Catch: bsh.UtilEvalError -> L12 bsh.EvalError -> L14 bsh.TargetError -> L16
            r7.<init>(r5, r0, r1)     // Catch: bsh.UtilEvalError -> L12 bsh.EvalError -> L14 bsh.TargetError -> L16
            throw r7     // Catch: bsh.UtilEvalError -> L12 bsh.EvalError -> L14 bsh.TargetError -> L16
        L53:
            bsh.RuntimeEvalError r6 = new bsh.RuntimeEvalError
            bsh.Node r7 = r4.expressionNode
            bsh.EvalError r5 = r5.toEvalError(r7, r1)
            r6.<init>(r5)
            throw r6
        L5f:
            bsh.RuntimeEvalError r6 = new bsh.RuntimeEvalError
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Can't invoke lambda: "
            r7.<init>(r0)
            java.lang.String r0 = r5.getMessage()
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            bsh.Node r0 = r4.expressionNode
            r6.<init>(r7, r0, r1, r5)
            throw r6
        L79:
            int r7 = r6.length
            r0 = 0
        L7b:
            if (r0 >= r7) goto L91
            r2 = r6[r0]
            java.lang.Throwable r3 = r5.getTarget()
            boolean r2 = r2.isInstance(r3)
            if (r2 != 0) goto L8c
            int r0 = r0 + 1
            goto L7b
        L8c:
            java.lang.Throwable r5 = r5.getTarget()
            throw r5
        L91:
            bsh.RuntimeEvalError r6 = new bsh.RuntimeEvalError
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Can't invoke lambda: Unexpected Exception: "
            r7.<init>(r0)
            java.lang.Throwable r0 = r5.getTarget()
            java.lang.String r0 = r0.getMessage()
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            bsh.Node r0 = r4.expressionNode
            java.lang.Throwable r5 = r5.getTarget()
            r6.<init>(r7, r0, r1, r5)
            throw r6
    }

    public abstract java.lang.Object invokeImpl(java.lang.Object[] r1);

    public abstract boolean isAssignable(java.lang.reflect.Method r1, int r2);
}
