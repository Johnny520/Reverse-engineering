package com.esotericsoftware.reflectasm;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import com.esotericsoftware.asm.ClassWriter;
import com.esotericsoftware.asm.Label;
import com.esotericsoftware.asm.MethodVisitor;
import com.esotericsoftware.asm.Type;
import io.ktor.util.C4211;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.pool.TypePool;
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class MethodAccess {
    private String[] methodNames;
    private Class[][] parameterTypes;
    private Class[] returnTypes;

    private static void addDeclaredMethodsToList(Class cls, ArrayList<Method> arrayList) {
        for (Method method : cls.getDeclaredMethods()) {
            if (!Modifier.isPrivate(method.getModifiers())) {
                arrayList.add(method);
            }
        }
    }

    public static MethodAccess get(Class cls) {
        Class clsLoadAccessClass;
        MethodAccess methodAccess;
        Type type;
        Label[] labelArr;
        Class[] clsArr;
        boolean zIsInterface = cls.isInterface();
        if (!zIsInterface && cls.getSuperclass() == null && cls != Object.class) {
            C5925.m11310("The type must not be an interface, a primitive type, or void.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (zIsInterface) {
            recursiveAddInterfaceMethodsToList(cls, arrayList);
        } else {
            for (Class superclass = cls; superclass != Object.class; superclass = superclass.getSuperclass()) {
                addDeclaredMethodsToList(superclass, arrayList);
            }
        }
        int size = arrayList.size();
        String[] strArr = new String[size];
        Class[][] clsArr2 = new Class[size][];
        Class[] clsArr3 = new Class[size];
        for (int i = 0; i < size; i++) {
            Method method = (Method) arrayList.get(i);
            strArr[i] = method.getName();
            clsArr2[i] = method.getParameterTypes();
            clsArr3[i] = method.getReturnType();
        }
        String name = cls.getName();
        String strConcat = name.concat("MethodAccess");
        if (strConcat.startsWith("java.")) {
            strConcat = "reflectasm.".concat(strConcat);
        }
        AccessClassLoader accessClassLoader = AccessClassLoader.get(cls);
        synchronized (accessClassLoader) {
            try {
                clsLoadAccessClass = accessClassLoader.loadAccessClass(strConcat);
                if (clsLoadAccessClass == null) {
                    String strReplace = strConcat.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
                    String strReplace2 = name.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
                    ClassWriter classWriter = new ClassWriter(1);
                    classWriter.visit(196653, 33, strReplace, null, "com/esotericsoftware/reflectasm/MethodAccess", null);
                    MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(1, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", null, null);
                    methodVisitorVisitMethod.visitCode();
                    int i2 = 25;
                    methodVisitorVisitMethod.visitVarInsn(25, 0);
                    methodAccess = null;
                    methodVisitorVisitMethod.visitMethodInsn(183, "com/esotericsoftware/reflectasm/MethodAccess", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V");
                    methodVisitorVisitMethod.visitInsn(177);
                    methodVisitorVisitMethod.visitMaxs(0, 0);
                    methodVisitorVisitMethod.visitEnd();
                    MethodVisitor methodVisitorVisitMethod2 = classWriter.visitMethod(129, "invoke", "(Ljava/lang/Object;I[Ljava/lang/Object;)Ljava/lang/Object;", null, null);
                    methodVisitorVisitMethod2.visitCode();
                    if (!arrayList.isEmpty()) {
                        methodVisitorVisitMethod2.visitVarInsn(25, 1);
                        methodVisitorVisitMethod2.visitTypeInsn(192, strReplace2);
                        methodVisitorVisitMethod2.visitVarInsn(58, 4);
                        methodVisitorVisitMethod2.visitVarInsn(21, 2);
                        Label[] labelArr2 = new Label[size];
                        for (int i3 = 0; i3 < size; i3++) {
                            labelArr2[i3] = new Label();
                        }
                        Label label = new Label();
                        methodVisitorVisitMethod2.visitTableSwitchInsn(0, size - 1, label, labelArr2);
                        StringBuilder sb = new StringBuilder(128);
                        int i4 = 0;
                        while (i4 < size) {
                            methodVisitorVisitMethod2.visitLabel(labelArr2[i4]);
                            if (i4 == 0) {
                                MethodVisitor methodVisitor = methodVisitorVisitMethod2;
                                methodVisitor.visitFrame(1, 1, new Object[]{strReplace2}, 0, null);
                                methodVisitorVisitMethod2 = methodVisitor;
                            } else {
                                methodVisitorVisitMethod2.visitFrame(3, 0, null, 0, null);
                            }
                            methodVisitorVisitMethod2.visitVarInsn(i2, 4);
                            sb.setLength(0);
                            sb.append('(');
                            Class[] clsArr4 = clsArr2[i4];
                            Class cls2 = clsArr3[i4];
                            boolean z = zIsInterface;
                            int i5 = 0;
                            while (i5 < clsArr4.length) {
                                int i6 = size;
                                methodVisitorVisitMethod2.visitVarInsn(25, 3);
                                methodVisitorVisitMethod2.visitIntInsn(16, i5);
                                methodVisitorVisitMethod2.visitInsn(50);
                                Type type2 = Type.getType(clsArr4[i5]);
                                switch (type2.getSort()) {
                                    case 1:
                                        type = type2;
                                        labelArr = labelArr2;
                                        clsArr = clsArr4;
                                        methodVisitorVisitMethod2.visitTypeInsn(192, "java/lang/Boolean");
                                        methodVisitorVisitMethod2.visitMethodInsn(182, "java/lang/Boolean", "booleanValue", "()Z");
                                        break;
                                    case 2:
                                        type = type2;
                                        labelArr = labelArr2;
                                        clsArr = clsArr4;
                                        methodVisitorVisitMethod2.visitTypeInsn(192, "java/lang/Character");
                                        methodVisitorVisitMethod2.visitMethodInsn(182, "java/lang/Character", "charValue", "()C");
                                        break;
                                    case 3:
                                        type = type2;
                                        labelArr = labelArr2;
                                        clsArr = clsArr4;
                                        methodVisitorVisitMethod2.visitTypeInsn(192, "java/lang/Byte");
                                        methodVisitorVisitMethod2.visitMethodInsn(182, "java/lang/Byte", "byteValue", "()B");
                                        break;
                                    case 4:
                                        type = type2;
                                        labelArr = labelArr2;
                                        clsArr = clsArr4;
                                        methodVisitorVisitMethod2.visitTypeInsn(192, "java/lang/Short");
                                        methodVisitorVisitMethod2.visitMethodInsn(182, "java/lang/Short", "shortValue", "()S");
                                        break;
                                    case 5:
                                        type = type2;
                                        labelArr = labelArr2;
                                        clsArr = clsArr4;
                                        methodVisitorVisitMethod2.visitTypeInsn(192, "java/lang/Integer");
                                        methodVisitorVisitMethod2.visitMethodInsn(182, "java/lang/Integer", "intValue", "()I");
                                        break;
                                    case 6:
                                        type = type2;
                                        labelArr = labelArr2;
                                        clsArr = clsArr4;
                                        methodVisitorVisitMethod2.visitTypeInsn(192, "java/lang/Float");
                                        methodVisitorVisitMethod2.visitMethodInsn(182, "java/lang/Float", "floatValue", "()F");
                                        break;
                                    case 7:
                                        type = type2;
                                        labelArr = labelArr2;
                                        clsArr = clsArr4;
                                        methodVisitorVisitMethod2.visitTypeInsn(192, "java/lang/Long");
                                        methodVisitorVisitMethod2.visitMethodInsn(182, "java/lang/Long", "longValue", "()J");
                                        break;
                                    case 8:
                                        type = type2;
                                        methodVisitorVisitMethod2.visitTypeInsn(192, "java/lang/Double");
                                        labelArr = labelArr2;
                                        clsArr = clsArr4;
                                        methodVisitorVisitMethod2.visitMethodInsn(182, "java/lang/Double", "doubleValue", "()D");
                                        break;
                                    case 9:
                                        type = type2;
                                        methodVisitorVisitMethod2.visitTypeInsn(192, type.getDescriptor());
                                        labelArr = labelArr2;
                                        clsArr = clsArr4;
                                        break;
                                    case 10:
                                        type = type2;
                                        methodVisitorVisitMethod2.visitTypeInsn(192, type2.getInternalName());
                                        labelArr = labelArr2;
                                        clsArr = clsArr4;
                                        break;
                                    default:
                                        type = type2;
                                        labelArr = labelArr2;
                                        clsArr = clsArr4;
                                        break;
                                }
                                sb.append(type.getDescriptor());
                                i5++;
                                size = i6;
                                labelArr2 = labelArr;
                                clsArr4 = clsArr;
                            }
                            int i7 = size;
                            Label[] labelArr3 = labelArr2;
                            sb.append(')');
                            sb.append(Type.getDescriptor(cls2));
                            methodVisitorVisitMethod2.visitMethodInsn(z ? 185 : Modifier.isStatic(((Method) arrayList.get(i4)).getModifiers()) ? 184 : 182, strReplace2, strArr[i4], sb.toString());
                            switch (Type.getType(cls2).getSort()) {
                                case 0:
                                    methodVisitorVisitMethod2.visitInsn(1);
                                    continue;
                                    methodVisitorVisitMethod2.visitInsn(176);
                                    i4++;
                                    zIsInterface = z;
                                    size = i7;
                                    labelArr2 = labelArr3;
                                    i2 = 25;
                                    break;
                                case 1:
                                    methodVisitorVisitMethod2.visitMethodInsn(184, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;");
                                    break;
                                case 2:
                                    methodVisitorVisitMethod2.visitMethodInsn(184, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;");
                                    break;
                                case 3:
                                    methodVisitorVisitMethod2.visitMethodInsn(184, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
                                    break;
                                case 4:
                                    methodVisitorVisitMethod2.visitMethodInsn(184, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
                                    break;
                                case 5:
                                    methodVisitorVisitMethod2.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                    break;
                                case 6:
                                    methodVisitorVisitMethod2.visitMethodInsn(184, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
                                    break;
                                case 7:
                                    methodVisitorVisitMethod2.visitMethodInsn(184, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
                                    break;
                                case 8:
                                    methodVisitorVisitMethod2.visitMethodInsn(184, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
                                    break;
                            }
                            methodVisitorVisitMethod2.visitInsn(176);
                            i4++;
                            zIsInterface = z;
                            size = i7;
                            labelArr2 = labelArr3;
                            i2 = 25;
                        }
                        methodVisitorVisitMethod2.visitLabel(label);
                        methodVisitorVisitMethod2.visitFrame(3, 0, null, 0, null);
                    }
                    methodVisitorVisitMethod2.visitTypeInsn(187, "java/lang/IllegalArgumentException");
                    methodVisitorVisitMethod2.visitInsn(89);
                    methodVisitorVisitMethod2.visitTypeInsn(187, "java/lang/StringBuilder");
                    methodVisitorVisitMethod2.visitInsn(89);
                    methodVisitorVisitMethod2.visitLdcInsn("Method not found: ");
                    methodVisitorVisitMethod2.visitMethodInsn(183, "java/lang/StringBuilder", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V");
                    methodVisitorVisitMethod2.visitVarInsn(21, 2);
                    methodVisitorVisitMethod2.visitMethodInsn(182, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;");
                    methodVisitorVisitMethod2.visitMethodInsn(182, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;");
                    methodVisitorVisitMethod2.visitMethodInsn(183, "java/lang/IllegalArgumentException", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V");
                    methodVisitorVisitMethod2.visitInsn(191);
                    methodVisitorVisitMethod2.visitMaxs(0, 0);
                    methodVisitorVisitMethod2.visitEnd();
                    classWriter.visitEnd();
                    clsLoadAccessClass = accessClassLoader.defineAccessClass(strConcat, classWriter.toByteArray());
                } else {
                    methodAccess = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            MethodAccess methodAccess2 = (MethodAccess) clsLoadAccessClass.newInstance();
            methodAccess2.methodNames = strArr;
            methodAccess2.parameterTypes = clsArr2;
            methodAccess2.returnTypes = clsArr3;
            return methodAccess2;
        } catch (Throwable th2) {
            C0276.m848("Error constructing method access class: ".concat(strConcat), th2);
            return methodAccess;
        }
    }

    private static void recursiveAddInterfaceMethodsToList(Class cls, ArrayList<Method> arrayList) {
        addDeclaredMethodsToList(cls, arrayList);
        for (Class<?> cls2 : cls.getInterfaces()) {
            recursiveAddInterfaceMethodsToList(cls2, arrayList);
        }
    }

    public int getIndex(String str, int i) {
        int length = this.methodNames.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.methodNames[i2].equals(str) && this.parameterTypes[i2].length == i) {
                return i2;
            }
        }
        throw new IllegalArgumentException("Unable to find non-private method: " + str + " with " + i + " params.");
    }

    public String[] getMethodNames() {
        return this.methodNames;
    }

    public Class[][] getParameterTypes() {
        return this.parameterTypes;
    }

    public Class[] getReturnTypes() {
        return this.returnTypes;
    }

    public abstract Object invoke(Object obj, int i, Object... objArr);

    public Object invoke(Object obj, String str, Object... objArr) {
        return invoke(obj, getIndex(str, objArr == null ? 0 : objArr.length), objArr);
    }

    public Object invoke(Object obj, String str, Class[] clsArr, Object... objArr) {
        return invoke(obj, getIndex(str, clsArr), objArr);
    }

    public int getIndex(String str, Class... clsArr) {
        int length = this.methodNames.length;
        for (int i = 0; i < length; i++) {
            if (this.methodNames[i].equals(str) && Arrays.equals(clsArr, this.parameterTypes[i])) {
                return i;
            }
        }
        C4211.m8603(Arrays.toString(clsArr), AbstractC6183.m11585("Unable to find non-private method: ", str, " "));
        return 0;
    }

    public int getIndex(String str) {
        int length = this.methodNames.length;
        for (int i = 0; i < length; i++) {
            if (this.methodNames[i].equals(str)) {
                return i;
            }
        }
        C5925.m11310(AbstractC0053.m157("Unable to find non-private method: ", str));
        return 0;
    }
}
