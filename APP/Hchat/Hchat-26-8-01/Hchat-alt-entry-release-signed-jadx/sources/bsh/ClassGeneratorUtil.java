package bsh;

import be.C0285i;
import be.C0305w;
import bsh.ClassGenerator;
import bsh.This;
import bsh.org.objectweb.asm.ClassWriter;
import bsh.org.objectweb.asm.Label;
import bsh.org.objectweb.asm.MethodVisitor;
import bsh.org.objectweb.asm.Opcodes;
import bsh.org.objectweb.asm.Type;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ClassGeneratorUtil implements Opcodes {
    static final int ACCESS_MODIFIERS = 7;
    static final int DEFAULTCONSTRUCTOR = -1;
    private static final String OBJECT = "Ljava/lang/Object;";
    private final String classDescript;
    private final Modifiers classModifiers;
    private final String className;
    private final DelayedEvalBshMethod[] constructors;
    private final String fqClassName;
    private final Class<?>[] interfaces;
    private final DelayedEvalBshMethod[] methods;
    private final Class<?> superClass;
    private final String superClassName;
    private final ClassGenerator.Type type;
    private final String uuid;
    private final Variable[] vars;
    private static final String GENERATED_CLASS_DESC = Type.getDescriptor(GeneratedClass.class);
    private static final String PRIMITIVE_NAME = Type.getInternalName(Primitive.class);
    private static final String PRIMITIVE_DESC = Type.getDescriptor(Primitive.class);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ClassGeneratorUtil(Modifiers modifiers, String str, String str2, Class<?> cls, Class<?>[] clsArr, Variable[] variableArr, DelayedEvalBshMethod[] delayedEvalBshMethodArr, NameSpace nameSpace, ClassGenerator.Type type) {
        this.classModifiers = modifiers;
        this.className = str;
        this.type = type;
        if (str2 != null) {
            this.fqClassName = str2.replace('.', '/') + "/" + str;
        } else {
            this.fqClassName = str;
        }
        this.classDescript = "L" + this.fqClassName.replace('.', '/') + ";";
        cls = cls == null ? type == ClassGenerator.Type.ENUM ? Enum.class : Object.class : cls;
        this.superClass = cls;
        this.superClassName = Type.getInternalName(cls);
        this.interfaces = clsArr == null ? Reflect.ZERO_TYPES : clsArr;
        this.vars = variableArr;
        nameSpace.isInterface = type == ClassGenerator.Type.INTERFACE;
        nameSpace.isEnum = type == ClassGenerator.Type.ENUM;
        Map<String, NameSpace> map = This.contextStore;
        String string = UUID.randomUUID().toString();
        this.uuid = string;
        map.put(string, nameSpace);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String baseName = Types.getBaseName(str);
        for (DelayedEvalBshMethod delayedEvalBshMethod : delayedEvalBshMethodArr) {
            if (delayedEvalBshMethod.getName().equals(baseName)) {
                if (!delayedEvalBshMethod.modifiers.isAppliedContext(5)) {
                    delayedEvalBshMethod.modifiers.changeContext(5);
                }
                arrayList.add(delayedEvalBshMethod);
            } else {
                arrayList2.add(delayedEvalBshMethod);
            }
        }
        this.constructors = (DelayedEvalBshMethod[]) arrayList.toArray(new DelayedEvalBshMethod[arrayList.size()]);
        this.methods = (DelayedEvalBshMethod[]) arrayList2.toArray(new DelayedEvalBshMethod[arrayList2.size()]);
        Interpreter.debug("Generate class ", type, " ", this.fqClassName, " cons:", Integer.valueOf(arrayList.size()), " meths:", Integer.valueOf(arrayList2.size()), " vars:", Integer.valueOf(variableArr.length));
        if (type == ClassGenerator.Type.INTERFACE && !modifiers.hasModifier("abstract")) {
            modifiers.addModifier("abstract");
        }
        if (type != ClassGenerator.Type.ENUM || modifiers.hasModifier("static")) {
            return;
        }
        modifiers.addModifier("static");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v0, types: [bsh.ClassGeneratorUtil$1Reflector] */
    public static void checkAbstractMethodImplementation(Class<?> cls) {
        final ArrayList arrayList = new ArrayList();
        new Object() { // from class: bsh.ClassGeneratorUtil.1Reflector
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public void gatherMethods(Class<?> cls2) {
                if (cls2.getSuperclass() != null) {
                    gatherMethods(cls2.getSuperclass());
                }
                arrayList.addAll(Arrays.asList(cls2.getDeclaredMethods()));
                for (Class<?> cls3 : cls2.getInterfaces()) {
                    gatherMethods(cls3);
                }
            }
        }.gatherMethods(cls);
        arrayList.stream().filter(new C0341a(3)).forEach(new C0305w(arrayList, 2, cls));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean checkInheritanceRules(int i9, int i10, Class<?> cls) {
        int i11 = i9 & 7;
        int i12 = i10 & 7;
        if (i12 == i11 || i11 == 2 || i12 == 1 || (i11 == 0 && i12 != 2)) {
            return true;
        }
        C0353j.m1309g("Cannot reduce the visibility of the inherited method from ".concat(cls.getName()));
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Method classContainsMethod(Class<?> cls, String str, String[] strArr) {
        while (cls != null) {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.getName().equals(str) && strArr.length == method.getParameterCount()) {
                    String[] typeDescriptors = getTypeDescriptors(method.getParameterTypes());
                    boolean zEquals = true;
                    for (int i9 = 0; i9 < strArr.length && (zEquals = strArr[i9].equals(typeDescriptors[i9])); i9++) {
                    }
                    if (zEquals) {
                        return method;
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String descriptorToClassName(String str) {
        return (str.startsWith("[") || !str.startsWith("L")) ? str : AbstractC4855en.m9262f(1, 1, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void doSwitchBranch(int i9, String str, String[] strArr, Label label, Label[] labelArr, int i10, MethodVisitor methodVisitor) {
        int i11;
        String str2;
        String str3;
        methodVisitor.visitLabel(labelArr[i9]);
        methodVisitor.visitVarInsn(25, 0);
        for (String str4 : strArr) {
            if (str4.equals("Z")) {
                str3 = "getBoolean";
            } else if (str4.equals("B")) {
                str3 = "getByte";
            } else if (str4.equals("C")) {
                str3 = "getChar";
            } else if (str4.equals("S")) {
                str3 = "getShort";
            } else if (str4.equals("I")) {
                str3 = "getInt";
            } else if (str4.equals("J")) {
                str3 = "getLong";
            } else if (str4.equals("D")) {
                str3 = "getDouble";
            } else if (str4.equals("F")) {
                str3 = "getFloat";
            } else {
                i11 = i10;
                str2 = "getObject";
                methodVisitor.visitVarInsn(25, i11);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "bsh/This$ConstructorArgs", str2, "()".concat(!str2.equals("getObject") ? OBJECT : str4), false);
                if (!str2.equals("getObject")) {
                    methodVisitor.visitTypeInsn(Opcodes.CHECKCAST, descriptorToClassName(str4));
                }
            }
            i11 = i10;
            str2 = str3;
            methodVisitor.visitVarInsn(25, i11);
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "bsh/This$ConstructorArgs", str2, "()".concat(!str2.equals("getObject") ? OBJECT : str4), false);
            if (!str2.equals("getObject")) {
            }
        }
        methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, str, "<init>", getMethodDescriptor("V", strArr), false);
        methodVisitor.visitJumpInsn(Opcodes.GOTO, label);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void generateEnumStaticInit(String str, String str2, MethodVisitor methodVisitor) {
        String str3;
        MethodVisitor methodVisitor2;
        int i9;
        Variable[] variableArr = this.vars;
        int length = variableArr.length;
        int i10 = 3;
        int i11 = 0;
        while (i11 < length) {
            Variable variable = variableArr[i11];
            if (variable.hasModifier("enum")) {
                methodVisitor.visitTypeInsn(Opcodes.NEW, str);
                methodVisitor.visitInsn(89);
                methodVisitor.visitLdcInsn(variable.getName());
                if (8 >= i10) {
                    i9 = i10 + 1;
                    methodVisitor.visitInsn(i10);
                } else {
                    i9 = i10 + 1;
                    methodVisitor.visitIntInsn(16, i10 - 3);
                }
                str3 = str;
                methodVisitor2 = methodVisitor;
                methodVisitor2.visitMethodInsn(Opcodes.INVOKESPECIAL, str3, "<init>", "(Ljava/lang/String;I)V", false);
                methodVisitor2.visitFieldInsn(Opcodes.PUTSTATIC, str3, variable.getName(), str2);
                i10 = i9;
            } else {
                str3 = str;
                methodVisitor2 = methodVisitor;
            }
            i11++;
            methodVisitor = methodVisitor2;
            str = str3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void generateEnumSupport(String str, String str2, String str3, ClassWriter classWriter) {
        MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(9, "values", AbstractC4855en.m9263g("()[", str3), null, null);
        pushBshStatic(str, str2, methodVisitorVisitMethod);
        methodVisitorVisitMethod.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "bsh/This", "enumValues", "()[Ljava/lang/Object;", false);
        generatePlainReturnCode(AbstractC4855en.m9263g("[", str3), methodVisitorVisitMethod);
        methodVisitorVisitMethod.visitMaxs(0, 0);
        MethodVisitor methodVisitorVisitMethod2 = classWriter.visitMethod(9, "valueOf", "(Ljava/lang/String;)" + str3, null, null);
        methodVisitorVisitMethod2.visitLdcInsn(Type.getType(str3));
        methodVisitorVisitMethod2.visitVarInsn(25, 0);
        methodVisitorVisitMethod2.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
        generatePlainReturnCode(str3, methodVisitorVisitMethod2);
        methodVisitorVisitMethod2.visitMaxs(0, 0);
        MethodVisitor methodVisitorVisitMethod3 = classWriter.visitMethod(2, "<init>", "(Ljava/lang/String;I)V", null, null);
        methodVisitorVisitMethod3.visitVarInsn(25, 0);
        methodVisitorVisitMethod3.visitVarInsn(25, 1);
        methodVisitorVisitMethod3.visitVarInsn(21, 2);
        methodVisitorVisitMethod3.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
        methodVisitorVisitMethod3.visitVarInsn(25, 0);
        methodVisitorVisitMethod3.visitLdcInsn(str2);
        generateParameterReifierCode(new String[0], false, methodVisitorVisitMethod3);
        methodVisitorVisitMethod3.visitMethodInsn(Opcodes.INVOKESTATIC, "bsh/This", "initInstance", AbstractC0921a.m2255r(new StringBuilder("("), GENERATED_CLASS_DESC, "Ljava/lang/String;[Ljava/lang/Object;)V"), false);
        methodVisitorVisitMethod3.visitInsn(Opcodes.RETURN);
        methodVisitorVisitMethod3.visitMaxs(0, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void generateField(String str, String str2, int i9, Object obj, ClassWriter classWriter) {
        classWriter.visitField(i9, str, str2, null, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void generateMethod(String str, String str2, String str3, String str4, String[] strArr, int i9, ClassWriter classWriter) {
        boolean z9 = (i9 & 8) != 0;
        String str5 = str4 == null ? OBJECT : str4;
        MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(i9, str3, getMethodDescriptor(str5, strArr), getTypeParameterSignature(strArr), null);
        if ((i9 & 1280) != 0) {
            return;
        }
        if (z9 || this.type == ClassGenerator.Type.INTERFACE) {
            pushBshStatic(str2, str, methodVisitorVisitMethod);
        } else {
            pushBshThis(str2, str, methodVisitorVisitMethod);
        }
        methodVisitorVisitMethod.visitLdcInsn(str3);
        generateParameterReifierCode(strArr, z9, methodVisitorVisitMethod);
        methodVisitorVisitMethod.visitInsn(4);
        methodVisitorVisitMethod.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "bsh/This", "invokeMethod", "(Ljava/lang/String;[Ljava/lang/Object;Z)Ljava/lang/Object;", false);
        generateReturnCode(str5, methodVisitorVisitMethod);
        methodVisitorVisitMethod.visitMaxs(0, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [bsh.org.objectweb.asm.MethodVisitor] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    private void generateParameterReifierCode(String[] strArr, boolean z9, MethodVisitor methodVisitor) {
        methodVisitor.visitIntInsn(17, strArr.length);
        methodVisitor.visitTypeInsn(Opcodes.ANEWARRAY, "java/lang/Object");
        ?? r92 = !z9;
        int i9 = 0;
        while (i9 < strArr.length) {
            String str = strArr[i9];
            methodVisitor.visitInsn(89);
            methodVisitor.visitIntInsn(17, i9);
            if (isPrimitive(str)) {
                int i10 = str.equals("F") ? 23 : str.equals("D") ? 24 : str.equals("J") ? 22 : 21;
                String str2 = PRIMITIVE_NAME;
                methodVisitor.visitTypeInsn(Opcodes.NEW, str2);
                methodVisitor.visitInsn(89);
                methodVisitor.visitVarInsn(i10, r92);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, str2, "<init>", AbstractC0921a.m2255r(new StringBuilder("("), str, ")V"), false);
                methodVisitor.visitInsn(83);
            } else {
                methodVisitor.visitVarInsn(25, r92);
                Label label = new Label();
                methodVisitor.visitJumpInsn(Opcodes.IFNONNULL, label);
                methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, PRIMITIVE_NAME, "NULL", PRIMITIVE_DESC);
                methodVisitor.visitInsn(83);
                Label label2 = new Label();
                methodVisitor.visitJumpInsn(Opcodes.GOTO, label2);
                methodVisitor.visitLabel(label);
                methodVisitor.visitVarInsn(25, r92);
                methodVisitor.visitInsn(83);
                methodVisitor.visitLabel(label2);
            }
            i9++;
            r92 += (str.equals("D") || str.equals("J")) ? 2 : 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void generatePlainReturnCode(String str, MethodVisitor methodVisitor) {
        if (str.equals("V")) {
            methodVisitor.visitInsn(Opcodes.RETURN);
        } else if (isPrimitive(str)) {
            methodVisitor.visitInsn(str.equals("D") ? Opcodes.DRETURN : str.equals("F") ? Opcodes.FRETURN : str.equals("J") ? Opcodes.LRETURN : Opcodes.IRETURN);
        } else {
            methodVisitor.visitTypeInsn(Opcodes.CHECKCAST, descriptorToClassName(str));
            methodVisitor.visitInsn(Opcodes.ARETURN);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void generateReturnCode(String str, MethodVisitor methodVisitor) {
        String str2;
        String str3;
        if (str.equals("V")) {
            methodVisitor.visitInsn(87);
            methodVisitor.visitInsn(Opcodes.RETURN);
            return;
        }
        if (!isPrimitive(str)) {
            methodVisitor.visitTypeInsn(Opcodes.CHECKCAST, descriptorToClassName(str));
            methodVisitor.visitInsn(Opcodes.ARETURN);
            return;
        }
        boolean zEquals = str.equals("Z");
        int i9 = Opcodes.IRETURN;
        if (zEquals) {
            str2 = "java/lang/Boolean";
            str3 = "booleanValue";
        } else if (str.equals("C")) {
            str2 = "java/lang/Character";
            str3 = "charValue";
        } else if (str.equals("B")) {
            str2 = "java/lang/Byte";
            str3 = "byteValue";
        } else if (str.equals("S")) {
            str2 = "java/lang/Short";
            str3 = "shortValue";
        } else if (str.equals("F")) {
            i9 = Opcodes.FRETURN;
            str2 = "java/lang/Float";
            str3 = "floatValue";
        } else if (str.equals("J")) {
            i9 = Opcodes.LRETURN;
            str2 = "java/lang/Long";
            str3 = "longValue";
        } else if (str.equals("D")) {
            i9 = Opcodes.DRETURN;
            str2 = "java/lang/Double";
            str3 = "doubleValue";
        } else {
            str2 = "java/lang/Integer";
            str3 = "intValue";
        }
        String str4 = str2;
        String str5 = str3;
        methodVisitor.visitTypeInsn(Opcodes.CHECKCAST, str4);
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str4, str5, "()".concat(str), false);
        methodVisitor.visitInsn(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void generateSuperDelegateMethod(Class<?> cls, String str, String str2, String str3, String[] strArr, int i9, ClassWriter classWriter) {
        if (str3 == null) {
            str3 = OBJECT;
        }
        String methodDescriptor = getMethodDescriptor(str3, strArr);
        MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(i9, "_bshSuper" + cls.getSimpleName() + str2, methodDescriptor, getTypeParameterSignature(strArr), null);
        methodVisitorVisitMethod.visitVarInsn(25, 0);
        int length = strArr.length;
        int i10 = 1;
        for (int i11 = 0; i11 < length; i11++) {
            String str4 = strArr[i11];
            if (isPrimitive(str4)) {
                methodVisitorVisitMethod.visitVarInsn(21, i10);
            } else {
                methodVisitorVisitMethod.visitVarInsn(25, i10);
            }
            i10 += (str4.equals("D") || str4.equals("J")) ? 2 : 1;
        }
        methodVisitorVisitMethod.visitMethodInsn(Opcodes.INVOKESPECIAL, str, str2, methodDescriptor, false);
        generatePlainReturnCode(str3, methodVisitorVisitMethod);
        methodVisitorVisitMethod.visitMaxs(0, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    private static int getASMModifiers(Modifiers modifiers) {
        boolean zHasModifier = modifiers.hasModifier(1);
        ?? r12 = zHasModifier;
        if (modifiers.hasModifier(2)) {
            r12 = (zHasModifier ? 1 : 0) | 2;
        }
        ?? r13 = r12;
        if (modifiers.hasModifier(4)) {
            r13 = (r12 == true ? 1 : 0) | 4;
        }
        ?? r14 = r13;
        if (modifiers.hasModifier(8)) {
            r14 = (r13 == true ? 1 : 0) | 8;
        }
        ?? r15 = r14;
        if (modifiers.hasModifier(32)) {
            r15 = (r14 == true ? 1 : 0) | 32;
        }
        ?? r16 = r15;
        if (modifiers.hasModifier(1024)) {
            r16 = (r15 == true ? 1 : 0) | 1024;
        }
        ?? r17 = r16;
        if (modifiers.hasModifier(Opcodes.ACC_NATIVE)) {
            r17 = (r16 == true ? 1 : 0) | Opcodes.ACC_NATIVE;
        }
        if ((modifiers.getModifiers() & 7) != 0) {
            return r17;
        }
        int i9 = r17 | 1;
        modifiers.addModifier(1);
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String getMethodDescriptor(String str, String[] strArr) {
        StringBuilder sb2 = new StringBuilder("(");
        for (String str2 : strArr) {
            sb2.append(str2);
        }
        sb2.append(')');
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String[] getTypeDescriptors(Class<?>[] clsArr) {
        int length = clsArr.length;
        String[] strArr = new String[length];
        for (int i9 = 0; i9 < length; i9++) {
            strArr[i9] = BSHType.getTypeDescriptor(clsArr[i9]);
        }
        return strArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String getTypeParameterSignature(String[] strArr) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isPrimitive(String str) {
        return str.length() == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$checkAbstractMethodImplementation$0(Method method) {
        return (method.getModifiers() & 1024) > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$checkAbstractMethodImplementation$1(Method method, Method method2) {
        return method.getName().equals(method2.getName()) && (method2.getModifiers() & 1026) == 0 && Types.areSignaturesEqual(method.getParameterTypes(), method2.getParameterTypes());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$checkAbstractMethodImplementation$2(Method method, Method method2) {
        if ((method.getModifiers() & 1) > 0 || (method2.getModifiers() & 5) == 0) {
            return -1;
        }
        return (method.getModifiers() & 7) == (method2.getModifiers() & 7) ? 0 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Method[] lambda$checkAbstractMethodImplementation$3(int i9) {
        return new Method[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$checkAbstractMethodImplementation$4(List list, Class cls, Method method) {
        Method[] methodArr = (Method[]) list.stream().filter(new C0285i(method, 3)).sorted(new C0349f()).toArray(new C0348e(1));
        if (methodArr.length != 0 || Reflect.getClassModifiers(cls).hasModifier("abstract")) {
            if (methodArr.length > 0) {
                checkInheritanceRules(method.getModifiers(), methodArr[0].getModifiers(), method.getDeclaringClass());
                return;
            }
            return;
        }
        throw new RuntimeException(cls.getSimpleName() + " is not abstract and does not override abstract method " + method.getName() + "() in " + method.getDeclaringClass().getSimpleName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void pushBshStatic(String str, String str2, MethodVisitor methodVisitor) {
        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, str, This.Keys.BSHSTATIC + str2, "Lbsh/This;");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void pushBshThis(String str, String str2, MethodVisitor methodVisitor) {
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitFieldInsn(Opcodes.GETFIELD, str, This.Keys.BSHTHIS + str2, "Lbsh/This;");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void startInterpreterForClass(Class<?> cls) {
        String strSuffix = Name.suffix(cls.getName(), 1);
        String strM1020i = AbstractC0255e.m1020i(strSuffix, ".bsh");
        if (cls.getResource(strM1020i) == null) {
            throw new InterpreterError("Script (" + strM1020i + ") for BeanShell generated class: " + cls + " not found.");
        }
        try {
            try {
                FileReader fileReader = new FileReader(cls.getResourceAsStream(strM1020i));
                try {
                    Interpreter interpreter = new Interpreter();
                    NameSpace nameSpace = interpreter.getNameSpace();
                    nameSpace.setName("class_" + strSuffix + "_global");
                    nameSpace.getClassManager().associateClass(cls);
                    interpreter.eval(fileReader, nameSpace, strM1020i);
                    fileReader.close();
                } catch (Throwable th2) {
                    try {
                        fileReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (EvalError | IOException e6) {
                System.out.println("Evaluation Error: " + e6);
            }
        } catch (TargetError e7) {
            System.out.println("Script threw exception: " + e7);
            if (e7.inNativeCode()) {
                e7.printStackTrace(System.err);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte[] generateClass() {
        int i9;
        Class<?>[] clsArr;
        ClassGeneratorUtil classGeneratorUtil = this;
        NameSpace nameSpace = This.contextStore.get(classGeneratorUtil.uuid);
        int aSMModifiers = getASMModifiers(classGeneratorUtil.classModifiers);
        ClassGenerator.Type type = classGeneratorUtil.type;
        if (type == ClassGenerator.Type.INTERFACE) {
            i9 = aSMModifiers | 1537;
        } else if (type == ClassGenerator.Type.ENUM) {
            i9 = aSMModifiers | 16433;
        } else {
            i9 = aSMModifiers | 33;
            if ((i9 & 1024) > 0) {
                i9 -= 1024;
            }
        }
        int i10 = i9;
        String[] strArr = new String[classGeneratorUtil.interfaces.length + 1];
        int i11 = 0;
        while (true) {
            clsArr = classGeneratorUtil.interfaces;
            if (i11 >= clsArr.length) {
                break;
            }
            strArr[i11] = Type.getInternalName(clsArr[i11]);
            if (Reflect.isGeneratedClass(classGeneratorUtil.interfaces[i11])) {
                for (Variable variable : Reflect.getVariables(classGeneratorUtil.interfaces[i11])) {
                    nameSpace.setVariableImpl(variable);
                }
            }
            i11++;
        }
        strArr[clsArr.length] = Type.getInternalName(GeneratedClass.class);
        ClassWriter classWriter = new ClassWriter(2);
        classWriter.visit(52, i10, classGeneratorUtil.fqClassName, classGeneratorUtil.type == ClassGenerator.Type.ENUM ? AbstractC0921a.m2255r(new StringBuilder("Ljava/lang/Enum<"), classGeneratorUtil.classDescript, ">;") : null, classGeneratorUtil.superClassName, strArr);
        if (classGeneratorUtil.type != ClassGenerator.Type.INTERFACE) {
            generateField(This.Keys.BSHTHIS + classGeneratorUtil.className, "Lbsh/This;", 1, classWriter);
        }
        generateField(This.Keys.BSHSTATIC + classGeneratorUtil.className, "Lbsh/This;", 25, classWriter);
        generateField("UUID", "Ljava/lang/String;", 25, classGeneratorUtil.uuid, classWriter);
        for (Variable variable2 : classGeneratorUtil.vars) {
            if (!variable2.hasModifier("private")) {
                String typeDescriptor = variable2.getTypeDescriptor();
                int aSMModifiers2 = getASMModifiers(variable2.getModifiers());
                ClassGenerator.Type type2 = classGeneratorUtil.type;
                if (type2 == ClassGenerator.Type.INTERFACE) {
                    variable2.setConstant();
                    nameSpace.setVariableImpl(variable2);
                } else {
                    if (type2 == ClassGenerator.Type.ENUM && variable2.hasModifier("enum")) {
                        aSMModifiers2 |= 16400;
                        typeDescriptor = classGeneratorUtil.classDescript;
                    }
                    generateField(variable2.getName(), typeDescriptor, aSMModifiers2, classWriter);
                }
            }
        }
        if (classGeneratorUtil.type == ClassGenerator.Type.ENUM) {
            classGeneratorUtil.generateEnumSupport(classGeneratorUtil.fqClassName, classGeneratorUtil.className, classGeneratorUtil.classDescript, classWriter);
        }
        classGeneratorUtil.generateStaticInitializer(classWriter);
        int i12 = 0;
        boolean z9 = false;
        while (true) {
            DelayedEvalBshMethod[] delayedEvalBshMethodArr = classGeneratorUtil.constructors;
            if (i12 >= delayedEvalBshMethodArr.length) {
                break;
            }
            if (!delayedEvalBshMethodArr[i12].hasModifier("private")) {
                int aSMModifiers3 = getASMModifiers(classGeneratorUtil.constructors[i12].getModifiers());
                if (classGeneratorUtil.constructors[i12].isVarArgs()) {
                    aSMModifiers3 |= 128;
                }
                classGeneratorUtil.generateConstructor(i12, classGeneratorUtil.constructors[i12].getParamTypeDescriptors(), aSMModifiers3, classWriter);
                z9 = true;
            }
            i12++;
        }
        if (classGeneratorUtil.type == ClassGenerator.Type.CLASS && !z9) {
            classGeneratorUtil.generateConstructor(-1, new String[0], 1, classWriter);
        }
        DelayedEvalBshMethod[] delayedEvalBshMethodArr2 = classGeneratorUtil.methods;
        int length = delayedEvalBshMethodArr2.length;
        int i13 = 0;
        while (i13 < length) {
            DelayedEvalBshMethod delayedEvalBshMethod = delayedEvalBshMethodArr2[i13];
            if (!delayedEvalBshMethod.isExtension && !delayedEvalBshMethod.hasModifier("private")) {
                if (classGeneratorUtil.type == ClassGenerator.Type.INTERFACE && !delayedEvalBshMethod.hasModifier("static") && !delayedEvalBshMethod.hasModifier("default") && !delayedEvalBshMethod.hasModifier("abstract")) {
                    delayedEvalBshMethod.getModifiers().addModifier("abstract");
                }
                int aSMModifiers4 = getASMModifiers(delayedEvalBshMethod.getModifiers());
                if (delayedEvalBshMethod.isVarArgs()) {
                    aSMModifiers4 |= 128;
                }
                int i14 = aSMModifiers4;
                boolean z10 = (i14 & 8) > 0;
                classGeneratorUtil.generateMethod(classGeneratorUtil.className, classGeneratorUtil.fqClassName, delayedEvalBshMethod.getName(), delayedEvalBshMethod.getReturnTypeDescriptor(), delayedEvalBshMethod.getParamTypeDescriptors(), i14, classWriter);
                if (classContainsMethod(classGeneratorUtil.superClass, delayedEvalBshMethod.getName(), delayedEvalBshMethod.getParamTypeDescriptors()) != null && !z10) {
                    classGeneratorUtil.generateSuperDelegateMethod(classGeneratorUtil.superClass, classGeneratorUtil.superClassName, delayedEvalBshMethod.getName(), delayedEvalBshMethod.getReturnTypeDescriptor(), delayedEvalBshMethod.getParamTypeDescriptors(), 1, classWriter);
                }
            }
            i13++;
            classGeneratorUtil = this;
        }
        return classWriter.toByteArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void generateConstructor(int i9, String[] strArr, int i10, ClassWriter classWriter) {
        int length = strArr.length + 1;
        int length2 = strArr.length + 2;
        MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(i10, "<init>", getMethodDescriptor("V", strArr), getTypeParameterSignature(strArr), null);
        generateParameterReifierCode(strArr, false, methodVisitorVisitMethod);
        methodVisitorVisitMethod.visitVarInsn(58, length);
        generateConstructorSwitch(i9, length, length2, methodVisitorVisitMethod);
        methodVisitorVisitMethod.visitVarInsn(25, 0);
        methodVisitorVisitMethod.visitLdcInsn(this.className);
        methodVisitorVisitMethod.visitVarInsn(25, length);
        methodVisitorVisitMethod.visitMethodInsn(Opcodes.INVOKESTATIC, "bsh/This", "initInstance", AbstractC0921a.m2255r(new StringBuilder("("), GENERATED_CLASS_DESC, "Ljava/lang/String;[Ljava/lang/Object;)V"), false);
        methodVisitorVisitMethod.visitInsn(Opcodes.RETURN);
        methodVisitorVisitMethod.visitMaxs(0, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void generateConstructorSwitch(int i9, int i10, int i11, MethodVisitor methodVisitor) {
        int i12 = i11;
        MethodVisitor methodVisitor2 = methodVisitor;
        Label label = new Label();
        Label label2 = new Label();
        List<Invocable> listMembers = BshClassManager.memberCache.get(this.superClass).members(this.superClass.getName());
        int size = listMembers.size() + this.constructors.length;
        Label[] labelArr = new Label[size];
        for (int i13 = 0; i13 < size; i13++) {
            labelArr[i13] = new Label();
        }
        methodVisitor2.visitLdcInsn(Type.getType(BSHType.getTypeDescriptor(this.superClass)));
        pushBshStatic(this.fqClassName, this.className, methodVisitor2);
        int i14 = 25;
        methodVisitor2.visitVarInsn(25, i10);
        methodVisitor2.visitIntInsn(16, i9);
        methodVisitor2.visitMethodInsn(Opcodes.INVOKESTATIC, "bsh/This", "getConstructorArgs", "(Ljava/lang/Class;Lbsh/This;[Ljava/lang/Object;I)Lbsh/This$ConstructorArgs;", false);
        methodVisitor2.visitVarInsn(58, i12);
        methodVisitor2.visitVarInsn(25, i12);
        methodVisitor2.visitFieldInsn(Opcodes.GETFIELD, "bsh/This$ConstructorArgs", "selector", "I");
        methodVisitor2.visitTableSwitchInsn(0, size - 1, label, labelArr);
        int i15 = 0;
        int i16 = 0;
        while (i16 < listMembers.size()) {
            doSwitchBranch(i15, this.superClassName, listMembers.get(i16).getParamTypeDescriptors(), label2, labelArr, i12, methodVisitor2);
            i16++;
            i15++;
            i12 = i11;
            methodVisitor2 = methodVisitor;
            i14 = i14;
        }
        int i17 = i14;
        int i18 = 0;
        while (true) {
            DelayedEvalBshMethod[] delayedEvalBshMethodArr = this.constructors;
            if (i18 >= delayedEvalBshMethodArr.length) {
                methodVisitor.visitLabel(label);
                methodVisitor.visitVarInsn(i17, 0);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, this.superClassName, "<init>", "()V", false);
                methodVisitor.visitLabel(label2);
                return;
            }
            doSwitchBranch(i15, this.fqClassName, delayedEvalBshMethodArr[i18].getParamTypeDescriptors(), label2, labelArr, i11, methodVisitor);
            i18++;
            i15++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void generateStaticInitializer(ClassWriter classWriter) {
        MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(8, "<clinit>", "()V", null, null);
        methodVisitorVisitMethod.visitFieldInsn(Opcodes.GETSTATIC, this.fqClassName, "UUID", "Ljava/lang/String;");
        methodVisitorVisitMethod.visitMethodInsn(Opcodes.INVOKESTATIC, "bsh/This", "pullBshStatic", "(Ljava/lang/String;)Lbsh/This;", false);
        methodVisitorVisitMethod.visitFieldInsn(Opcodes.PUTSTATIC, this.fqClassName, This.Keys.BSHSTATIC + this.className, "Lbsh/This;");
        if (this.type == ClassGenerator.Type.ENUM) {
            generateEnumStaticInit(this.fqClassName, this.classDescript, methodVisitorVisitMethod);
        }
        methodVisitorVisitMethod.visitLdcInsn(Type.getType(this.classDescript));
        methodVisitorVisitMethod.visitMethodInsn(Opcodes.INVOKESTATIC, "bsh/This", "initStatic", "(Ljava/lang/Class;)V", false);
        methodVisitorVisitMethod.visitInsn(Opcodes.RETURN);
        methodVisitorVisitMethod.visitMaxs(0, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void initStaticNameSpace(NameSpace nameSpace, BSHBlock bSHBlock) {
        try {
            nameSpace.setLocalVariable(HttpUrl.FRAGMENT_ENCODE_SET + This.Keys.BSHCLASSMODIFIERS, this.classModifiers, false);
            nameSpace.setLocalVariable(HttpUrl.FRAGMENT_ENCODE_SET + This.Keys.BSHCONSTRUCTORS, this.constructors, false);
            nameSpace.setLocalVariable(HttpUrl.FRAGMENT_ENCODE_SET + This.Keys.BSHINIT, bSHBlock, false);
        } catch (UtilEvalError e6) {
            C0353j.m1306d("Unable to init class static block: ", e6);
        }
    }

    private static void generateField(String str, String str2, int i9, ClassWriter classWriter) {
        generateField(str, str2, i9, null, classWriter);
    }
}
