package bsh;

import bsh.loader.BshLoaderHelper;
import bsh.org.objectweb.asm.ClassWriter;
import bsh.org.objectweb.asm.MethodVisitor;
import bsh.org.objectweb.asm.Opcodes;
import bsh.util.Util;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BshLambda {
    protected final Class<?> dummyType;
    protected final Node expressionNode;
    private static final ByteClassLoader byteClassLoader = new ByteClassLoader(0);
    private static final WeakHashMap<BshLambda, Class<?>> dummyTypesLambdas = new WeakHashMap<>();
    private static volatile int dummyTypeCount = 1;
    private static Map<Class<?>, Class<?>> fiClasses = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class BshLambdaFromLambdaExpression extends BshLambda {
        private final Node bodyNode;
        private final NameSpace declaringNameSpace;
        private final Modifiers[] paramsModifiers;
        private final String[] paramsNames;
        private final Class<?>[] paramsTypes;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public BshLambdaFromLambdaExpression(Node node, NameSpace nameSpace, Modifiers[] modifiersArr, Class<?>[] clsArr, String[] strArr, Node node2) {
            super(node, 0);
            this.declaringNameSpace = nameSpace != null ? nameSpace.toLambdaNameSpace() : null;
            this.paramsModifiers = modifiersArr;
            this.paramsTypes = clsArr;
            this.paramsNames = strArr;
            this.bodyNode = node2;
            if (modifiersArr.length == clsArr.length && clsArr.length == strArr.length) {
                return;
            }
            C2104o.m5294t("The length of 'paramsModifiers', 'paramsTypes' and 'paramsNames' can't be different!");
            throw null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private NameSpace initNameSpace(Object[] objArr) {
            NameSpace nameSpace = new NameSpace(this.declaringNameSpace, "LambdaExpression");
            int i9 = 0;
            while (true) {
                String[] strArr = this.paramsNames;
                if (i9 >= strArr.length) {
                    return nameSpace;
                }
                Class<?> cls = this.paramsTypes[i9];
                if (cls != null) {
                    nameSpace.setTypedVariable(strArr[i9], cls, objArr[i9], this.paramsModifiers[i9]);
                } else {
                    nameSpace.setVariable(strArr[i9], objArr[i9], false);
                }
                i9++;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.BshLambda
        public final Object invokeImpl(Object[] objArr) throws UtilEvalError {
            if (objArr.length != this.paramsTypes.length) {
                throw new UtilEvalError("Wrong number of arguments!");
            }
            NameSpace nameSpaceInitNameSpace = initNameSpace(objArr);
            CallStack callStack = new CallStack(nameSpaceInitNameSpace);
            Interpreter interpreter = new Interpreter(nameSpaceInitNameSpace);
            Node node = this.bodyNode;
            if (!(node instanceof BSHBlock)) {
                return node.eval(callStack, interpreter);
            }
            Object objEval = node.eval(callStack, interpreter);
            if (!(objEval instanceof ReturnControl)) {
                return null;
            }
            ReturnControl returnControl = (ReturnControl) objEval;
            if (returnControl.kind == 47) {
                return returnControl.value;
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.BshLambda
        public boolean isAssignable(Method method, int i9) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Class<?>[] clsArr = this.paramsTypes;
            if (clsArr.length != genericParameterTypes.length) {
                return false;
            }
            return Types.isSignatureAssignable(clsArr, genericParameterTypes, i9);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class BshLambdaFromMethodReference extends BshLambda {
        private final Class<?> _class;
        private final String methodName;
        private final Method[] methods;
        private final boolean staticRef;
        private final Object thisArg;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public BshLambdaFromMethodReference(Node node, Object obj, String str) {
            super(node, 0);
            this.thisArg = obj;
            this.methodName = str;
            boolean z9 = obj instanceof ClassIdentifier;
            this.staticRef = z9;
            Class<?> cls = z9 ? ((ClassIdentifier) obj).clas : obj.getClass();
            this._class = cls;
            this.methods = cls.isInterface() ? (Method[]) Util.concatArrays(cls.getMethods(), Object.class.getMethods()) : cls.getMethods();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.BshLambda
        public final Object invokeImpl(Object[] objArr) throws TargetError, UtilEvalError {
            try {
                NameSpace nameSpace = new NameSpace("MethodReferenceLambda");
                CallStack callStack = new CallStack(nameSpace);
                Interpreter interpreter = new Interpreter(nameSpace);
                if (!this.staticRef) {
                    return Reflect.invokeObjectMethod(this.thisArg, this.methodName, objArr, interpreter, callStack, this.expressionNode);
                }
                if (this.methodName.equals("new")) {
                    return Reflect.constructObject(this._class, objArr);
                }
                if (objArr.length != 0 && this._class.isInstance(objArr[0])) {
                    Class<?>[] types = Types.getTypes(objArr);
                    Class[] clsArr = (Class[]) Arrays.copyOfRange(types, 1, types.length);
                    for (Method method : this.methods) {
                        if (this.methodName.equals(method.getName())) {
                            try {
                                if (Reflect.isStatic(method)) {
                                    if (Types.isSignatureAssignable(types, method.getGenericParameterTypes(), 1)) {
                                        return method.invoke(null, objArr);
                                    }
                                } else if (Types.isSignatureAssignable((Class<?>[]) clsArr, method.getGenericParameterTypes(), 1)) {
                                    return method.invoke(objArr[0], Arrays.copyOfRange(objArr, 1, objArr.length));
                                }
                            } catch (IllegalAccessException unused) {
                                continue;
                            }
                        }
                    }
                    throw new UtilEvalError("Can't invoke lambda made from method reference!");
                }
                return Reflect.invokeStaticMethod(nameSpace.getClassManager(), this._class, this.methodName, objArr, this.expressionNode);
            } catch (InvocationTargetException e6) {
                throw new TargetError(e6.getTargetException(), this.expressionNode, null);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.BshLambda
        public boolean isAssignable(Method method, int i9) {
            if (!this.staticRef) {
                for (Method method2 : this._class.getMethods()) {
                    if (this.methodName.equals(method2.getName()) && !Reflect.isStatic(method2) && Types.isSignatureAssignable(method2.getParameterTypes(), method.getGenericParameterTypes(), i9) && Types.isAssignable(method2.getReturnType(), method.getGenericReturnType(), i9)) {
                        return true;
                    }
                }
                return false;
            }
            if (this.methodName.equals("new")) {
                for (Constructor<?> constructor : this._class.getConstructors()) {
                    if (Types.isSignatureAssignable(constructor.getParameterTypes(), method.getGenericParameterTypes(), i9) && Types.isAssignable(this._class, method.getGenericReturnType(), i9)) {
                        return true;
                    }
                }
                return false;
            }
            for (Method method3 : this.methods) {
                if (this.methodName.equals(method3.getName())) {
                    if (Reflect.isStatic(method3)) {
                        if (Types.isSignatureAssignable(method3.getParameterTypes(), method.getGenericParameterTypes(), i9) && Types.isAssignable(method3.getReturnType(), method.getGenericReturnType(), i9)) {
                            return true;
                        }
                    } else if (Types.isSignatureAssignable((Class<?>[]) Util.concatArrays(new Class[]{this._class}, method3.getParameterTypes()), method.getGenericParameterTypes(), i9) && Types.isAssignable(method3.getReturnType(), method.getGenericReturnType(), i9)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class WrapperGenerator {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private WrapperGenerator() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static <T> Class<T> generateClass(Class<T> cls) {
            String str = BshLambda.class.getName() + "Generated" + Base64.getUrlEncoder().withoutPadding().encodeToString(cls.getName().getBytes());
            return (Class<T>) BshLambda.byteClassLoader.classFromBytes(str, generateClassBytes(str.replace(".", "/"), cls));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private static byte[] generateClassBytes(String str, Class<?> cls) {
            ClassWriter classWriter = new ClassWriter(2);
            classWriter.visit(52, 1, str, generateClassSignature(cls), "java/lang/Object", new String[]{Types.getInternalName(cls)});
            classWriter.visitField(2, "bshLambda", Types.getDescriptor(BshLambda.class), null, null).visitEnd();
            writeConstructor(classWriter, str);
            writeMethod(classWriter, str, BshLambda.methodFromFI(cls));
            classWriter.visitEnd();
            return classWriter.toByteArray();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private static String generateClassSignature(Class<?> cls) {
            return Types.getASMClassSignature(cls.getTypeParameters(), Object.class, cls.getTypeParameters().length != 0 ? Types.createParameterizedType(cls, cls.getTypeParameters()) : cls);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private static void writeConstructor(ClassWriter classWriter, String str) {
            MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(1, "<init>", Types.getMethodDescriptor(Void.TYPE, BshLambda.class), null, null);
            methodVisitorVisitMethod.visitCode();
            methodVisitorVisitMethod.visitVarInsn(25, 0);
            methodVisitorVisitMethod.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
            methodVisitorVisitMethod.visitVarInsn(25, 0);
            methodVisitorVisitMethod.visitVarInsn(25, 1);
            methodVisitorVisitMethod.visitFieldInsn(Opcodes.PUTFIELD, str, "bshLambda", Types.getDescriptor(BshLambda.class));
            methodVisitorVisitMethod.visitInsn(Opcodes.RETURN);
            methodVisitorVisitMethod.visitMaxs(0, 0);
            methodVisitorVisitMethod.visitEnd();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0122  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void writeMethod(ClassWriter classWriter, String str, Method method) {
            Class<?> cls;
            Class<?> cls2;
            Class<?> cls3;
            Class<?> cls4;
            Class<?> cls5;
            Class<?> cls6;
            Class<?> cls7;
            Class<?> cls8;
            MethodVisitor methodVisitor;
            int i9;
            char c10;
            String internalName = Types.getInternalName(BshLambda.class);
            Parameter[] parameters = method.getParameters();
            Class<?>[] exceptionTypes = method.getExceptionTypes();
            MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(1, method.getName(), Types.getMethodDescriptor(method), Types.getASMMethodSignature(method), Types.getInternalNames(exceptionTypes));
            methodVisitorVisitMethod.visitCode();
            methodVisitorVisitMethod.visitVarInsn(25, 0);
            methodVisitorVisitMethod.visitFieldInsn(Opcodes.GETFIELD, str, "bshLambda", Types.getDescriptor(BshLambda.class));
            methodVisitorVisitMethod.visitLdcInsn(Integer.valueOf(parameters.length));
            methodVisitorVisitMethod.visitTypeInsn(Opcodes.ANEWARRAY, "java/lang/Object");
            int i10 = 0;
            int i11 = 1;
            while (true) {
                int length = parameters.length;
                cls = Float.TYPE;
                cls2 = Integer.TYPE;
                cls3 = Short.TYPE;
                cls4 = Byte.TYPE;
                cls5 = Boolean.TYPE;
                cls6 = Character.TYPE;
                cls7 = Double.TYPE;
                cls8 = Long.TYPE;
                if (i10 >= length) {
                    break;
                }
                Class<?> type = parameters[i10].getType();
                methodVisitorVisitMethod.visitInsn(89);
                methodVisitorVisitMethod.visitLdcInsn(Integer.valueOf(i10));
                if (type == cls6) {
                    methodVisitorVisitMethod.visitVarInsn(21, i11);
                    i9 = 83;
                    methodVisitorVisitMethod.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
                } else if (type == cls5) {
                    methodVisitorVisitMethod.visitVarInsn(21, i11);
                    i9 = 83;
                    methodVisitorVisitMethod.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
                } else {
                    i9 = 83;
                    if (type == cls4) {
                        methodVisitorVisitMethod.visitVarInsn(21, i11);
                        methodVisitorVisitMethod.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;", false);
                    } else if (type == cls3) {
                        methodVisitorVisitMethod.visitVarInsn(21, i11);
                        methodVisitorVisitMethod.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;", false);
                    } else if (type == cls2) {
                        methodVisitorVisitMethod.visitVarInsn(21, i11);
                        methodVisitorVisitMethod.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
                    } else if (type == cls8) {
                        methodVisitorVisitMethod.visitVarInsn(22, i11);
                        methodVisitorVisitMethod.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
                    } else if (type == cls) {
                        methodVisitorVisitMethod.visitVarInsn(23, i11);
                        methodVisitorVisitMethod.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;", false);
                    } else if (type == cls7) {
                        methodVisitorVisitMethod.visitVarInsn(24, i11);
                        methodVisitorVisitMethod.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;", false);
                    } else {
                        c10 = 25;
                        methodVisitorVisitMethod.visitVarInsn(25, i11);
                        methodVisitorVisitMethod.visitInsn(i9);
                        i11 += (type != cls8 || type == cls7) ? 2 : 1;
                        i10++;
                    }
                }
                c10 = 25;
                methodVisitorVisitMethod.visitInsn(i9);
                i11 += (type != cls8 || type == cls7) ? 2 : 1;
                i10++;
            }
            methodVisitorVisitMethod.visitLdcInsn(Integer.valueOf(exceptionTypes.length));
            methodVisitorVisitMethod.visitTypeInsn(Opcodes.ANEWARRAY, "java/lang/Class");
            for (int i12 = 0; i12 < exceptionTypes.length; i12++) {
                Class<?> cls9 = exceptionTypes[i12];
                methodVisitorVisitMethod.visitInsn(89);
                methodVisitorVisitMethod.visitLdcInsn(Integer.valueOf(i12));
                methodVisitorVisitMethod.visitLdcInsn(Types.getASMType(cls9));
                methodVisitorVisitMethod.visitInsn(83);
            }
            Class<?> returnType = method.getReturnType();
            Class<?> clsBoxType = returnType.isPrimitive() ? Primitive.boxType(returnType) : returnType;
            if (returnType.isPrimitive()) {
                methodVisitorVisitMethod.visitFieldInsn(Opcodes.GETSTATIC, Types.getInternalName(clsBoxType), "TYPE", "Ljava/lang/Class;");
            } else {
                methodVisitorVisitMethod.visitLdcInsn(Types.getASMType(returnType));
            }
            methodVisitorVisitMethod.visitMethodInsn(Opcodes.INVOKEVIRTUAL, internalName, "invoke", "([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;", false);
            methodVisitorVisitMethod.visitTypeInsn(Opcodes.CHECKCAST, Types.getInternalName(clsBoxType));
            if (returnType == Void.TYPE) {
                methodVisitorVisitMethod.visitInsn(87);
                methodVisitorVisitMethod.visitInsn(Opcodes.RETURN);
                methodVisitor = methodVisitorVisitMethod;
            } else if (returnType == cls5) {
                methodVisitor = methodVisitorVisitMethod;
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
                methodVisitorVisitMethod.visitInsn(Opcodes.IRETURN);
            } else if (returnType == cls6) {
                methodVisitor = methodVisitorVisitMethod;
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Character", "charValue", "()C", false);
                methodVisitorVisitMethod.visitInsn(Opcodes.IRETURN);
            } else if (returnType == cls4) {
                methodVisitor = methodVisitorVisitMethod;
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Byte", "byteValue", "()B", false);
                methodVisitorVisitMethod.visitInsn(Opcodes.IRETURN);
            } else if (returnType == cls3) {
                methodVisitor = methodVisitorVisitMethod;
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Short", "shortValue", "()S", false);
                methodVisitorVisitMethod.visitInsn(Opcodes.IRETURN);
            } else if (returnType == cls2) {
                methodVisitor = methodVisitorVisitMethod;
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
                methodVisitorVisitMethod.visitInsn(Opcodes.IRETURN);
            } else if (returnType == cls8) {
                methodVisitor = methodVisitorVisitMethod;
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Long", "longValue", "()J", false);
                methodVisitor.visitInsn(Opcodes.LRETURN);
            } else {
                methodVisitor = methodVisitorVisitMethod;
                if (returnType == cls) {
                    methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Float", "floatValue", "()F", false);
                    methodVisitor.visitInsn(Opcodes.FRETURN);
                } else if (returnType == cls7) {
                    methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Double", "doubleValue", "()D", false);
                    methodVisitor.visitInsn(Opcodes.DRETURN);
                } else {
                    methodVisitor.visitInsn(Opcodes.ARETURN);
                }
            }
            methodVisitor.visitMaxs(0, 0);
            methodVisitor.visitEnd();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private BshLambda(Node node) {
        this.expressionNode = node;
        Class<?> clsGenerateDummyType = generateDummyType();
        this.dummyType = clsGenerateDummyType;
        dummyTypesLambdas.put(this, clsGenerateDummyType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static BshLambda fromLambdaExpression(Node node, NameSpace nameSpace, Modifiers[] modifiersArr, Class<?>[] clsArr, String[] strArr, Node node2) {
        return new BshLambdaFromLambdaExpression(node, nameSpace, modifiersArr, clsArr, strArr, node2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static BshLambda fromMethodReference(Node node, Object obj, String str) {
        return new BshLambdaFromMethodReference(node, obj, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Class<?> generateDummyType() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(BshLambda.class.getName());
        sb2.append("Type");
        int i9 = dummyTypeCount;
        dummyTypeCount = i9 + 1;
        sb2.append(i9);
        String string = sb2.toString();
        ClassWriter classWriter = new ClassWriter(2);
        classWriter.visit(52, 1537, string.replace(".", "/"), null, "java/lang/Object", null);
        classWriter.visitEnd();
        return byteClassLoader.classFromBytes(string, classWriter.toByteArray());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> Class<T> getClassForFI(Class<T> cls) {
        if (fiClasses.containsKey(cls)) {
            return (Class) fiClasses.get(cls);
        }
        Class<T> clsGenerateClass = WrapperGenerator.generateClass(cls);
        fiClasses.put(cls, clsGenerateClass);
        return clsGenerateClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isAssignable(Class<?> cls, Class<?> cls2, int i9) {
        Method methodMethodFromFI = methodFromFI(cls2);
        for (Map.Entry<BshLambda, Class<?>> entry : dummyTypesLambdas.entrySet()) {
            if (entry.getValue() == cls) {
                return entry.getKey().isAssignable(methodMethodFromFI, i9);
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$convertTo$0(Object obj, Method method, Object[] objArr) {
        boolean z9;
        if (method.getDeclaringClass() == Object.class) {
            String name = method.getName();
            name.getClass();
            z9 = false;
            switch (name) {
                case "toString":
                    return "BshLambdaProxy[" + this + "]";
                case "equals":
                    if (objArr != null && objArr.length == 1 && obj == objArr[0]) {
                        z9 = true;
                    }
                    return Boolean.valueOf(z9);
                case "hashCode":
                    return Integer.valueOf(System.identityHashCode(obj));
            }
        }
        if (objArr == null) {
            objArr = Reflect.ZERO_ARGS;
        }
        return invoke(objArr, method.getExceptionTypes(), method.getReturnType());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Method methodFromFI(Class<?> cls) {
        for (Method method : cls.getMethods()) {
            if (Modifier.isAbstract(method.getModifiers()) && !method.isBridge() && !method.isSynthetic() && !Types.isObjectClassMethod(method)) {
                return method;
            }
        }
        C2104o.m5294t("This class isn't a valid Functional Interface: ".concat(cls.getName()));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public <T> T convertTo(Class<T> cls) throws UtilEvalError {
        if (!isAssignable(this.dummyType, cls, 4)) {
            throw new UtilEvalError("This BshLambda can't be converted to ".concat(cls.getName()));
        }
        try {
            return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: bsh.d
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method, Object[] objArr) {
                    return this.f998g.lambda$convertTo$0(obj, method, objArr);
                }
            });
        } catch (Throwable th2) {
            throw new UtilEvalError("Can't create a instance for the generate class for the BshLambda: " + th2.getMessage(), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final <T> T invoke(Object[] objArr, Class<?>[] clsArr, Class<T> cls) throws Throwable {
        try {
            Object objUnwrap = cls.isPrimitive() ? Primitive.unwrap(invokeImpl(objArr)) : invokeImpl(objArr);
            if (cls == Void.TYPE) {
                return null;
            }
            return (T) Primitive.unwrap(Types.castObject(objUnwrap, cls, 1));
        } catch (TargetError e6) {
            for (Class<?> cls2 : clsArr) {
                if (cls2.isInstance(e6.getTarget())) {
                    throw e6.getTarget();
                }
            }
            throw new RuntimeEvalError("Can't invoke lambda: Unexpected Exception: " + e6.getTarget().getMessage(), this.expressionNode, null, e6.getTarget());
        } catch (EvalError e7) {
            throw new RuntimeEvalError("Can't invoke lambda: " + e7.getMessage(), this.expressionNode, null, e7);
        } catch (UtilEvalError e10) {
            throw new RuntimeEvalError(e10.toEvalError(this.expressionNode, null));
        }
    }

    public abstract Object invokeImpl(Object[] objArr);

    public abstract boolean isAssignable(Method method, int i9);

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class ByteClassLoader extends ClassLoader {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: bsh.BshLambda.ByteClassLoader.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ ByteClassLoader(int i9) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Class<?> classFromBytes(String str, byte[] bArr) {
            return BshLoaderHelper.getClassByCode(str, bArr);
        }

        private ByteClassLoader() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 bsh.Node) A[MD:(bsh.Node):void (m)] (LINE:18) call: bsh.BshLambda.<init>(bsh.Node):void type: THIS */
    public /* synthetic */ BshLambda(Node node, int i9) {
        this(node);
    }
}
