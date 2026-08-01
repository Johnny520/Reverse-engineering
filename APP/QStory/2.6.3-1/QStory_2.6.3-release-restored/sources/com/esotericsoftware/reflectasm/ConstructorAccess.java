package com.esotericsoftware.reflectasm;

import androidx.collection.C1123;
import com.esotericsoftware.asm.ClassWriter;
import com.esotericsoftware.asm.MethodVisitor;
import java.lang.reflect.Modifier;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ConstructorAccess<T> {
    boolean isNonStaticMemberClass;

    public static <T> ConstructorAccess<T> get(Class<T> cls) {
        Class clsLoadAccessClass;
        int modifiers;
        String strReplace;
        Class<?> enclosingClass = cls.getEnclosingClass();
        boolean z = (enclosingClass == null || !cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) ? false : true;
        String name = cls.getName();
        String strConcat = name.concat("ConstructorAccess");
        if (strConcat.startsWith("java.")) {
            strConcat = "reflectasm.".concat(strConcat);
        }
        AccessClassLoader accessClassLoader = AccessClassLoader.get(cls);
        synchronized (accessClassLoader) {
            try {
                clsLoadAccessClass = accessClassLoader.loadAccessClass(strConcat);
                if (clsLoadAccessClass == null) {
                    String strReplace2 = strConcat.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
                    String strReplace3 = name.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
                    if (z) {
                        strReplace = enclosingClass.getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
                        try {
                            int modifiers2 = cls.getDeclaredConstructor(enclosingClass).getModifiers();
                            if (Modifier.isPrivate(modifiers2)) {
                                throw new RuntimeException("Non-static member class cannot be created (the enclosing class constructor is private): ".concat(cls.getName()));
                            }
                            modifiers = modifiers2;
                        } catch (Exception e) {
                            throw new RuntimeException("Non-static member class cannot be created (missing enclosing class constructor): ".concat(cls.getName()), e);
                        }
                    } else {
                        try {
                            modifiers = cls.getDeclaredConstructor(null).getModifiers();
                            if (Modifier.isPrivate(modifiers)) {
                                throw new RuntimeException("Class cannot be created (the no-arg constructor is private): ".concat(cls.getName()));
                            }
                            strReplace = null;
                        } catch (Exception e2) {
                            throw new RuntimeException("Class cannot be created (missing no-arg constructor): ".concat(cls.getName()), e2);
                        }
                    }
                    String str = Modifier.isPublic(modifiers) ? "com/esotericsoftware/reflectasm/PublicConstructorAccess" : "com/esotericsoftware/reflectasm/ConstructorAccess";
                    ClassWriter classWriter = new ClassWriter(0);
                    classWriter.visit(196653, 33, strReplace2, null, str, null);
                    insertConstructor(classWriter, str);
                    insertNewInstance(classWriter, strReplace3);
                    insertNewInstanceInner(classWriter, strReplace3, strReplace);
                    classWriter.visitEnd();
                    clsLoadAccessClass = accessClassLoader.defineAccessClass(strConcat, classWriter.toByteArray());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            ConstructorAccess<T> constructorAccess = (ConstructorAccess) clsLoadAccessClass.newInstance();
            if (!(constructorAccess instanceof PublicConstructorAccess) && !AccessClassLoader.areInSameRuntimeClassLoader(cls, clsLoadAccessClass)) {
                throw new RuntimeException((!z ? "Class cannot be created (the no-arg constructor is protected or package-protected, and its ConstructorAccess could not be defined in the same class loader): " : "Non-static member class cannot be created (the enclosing class constructor is protected or package-protected, and its ConstructorAccess could not be defined in the same class loader): ").concat(cls.getName()));
            }
            constructorAccess.isNonStaticMemberClass = z;
            return constructorAccess;
        } catch (Throwable th2) {
            C1123.m1408("Exception constructing constructor access class: ".concat(strConcat), th2);
            return null;
        }
    }

    private static void insertConstructor(ClassWriter classWriter, String str) {
        MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(1, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", null, null);
        methodVisitorVisitMethod.visitCode();
        methodVisitorVisitMethod.visitVarInsn(25, 0);
        methodVisitorVisitMethod.visitMethodInsn(183, str, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V");
        methodVisitorVisitMethod.visitInsn(177);
        methodVisitorVisitMethod.visitMaxs(1, 1);
        methodVisitorVisitMethod.visitEnd();
    }

    public static void insertNewInstance(ClassWriter classWriter, String str) {
        MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(1, TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "()Ljava/lang/Object;", null, null);
        methodVisitorVisitMethod.visitCode();
        methodVisitorVisitMethod.visitTypeInsn(187, str);
        methodVisitorVisitMethod.visitInsn(89);
        methodVisitorVisitMethod.visitMethodInsn(183, str, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V");
        methodVisitorVisitMethod.visitInsn(176);
        methodVisitorVisitMethod.visitMaxs(2, 1);
        methodVisitorVisitMethod.visitEnd();
    }

    public static void insertNewInstanceInner(ClassWriter classWriter, String str, String str2) {
        MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(1, TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
        methodVisitorVisitMethod.visitCode();
        if (str2 != null) {
            methodVisitorVisitMethod.visitTypeInsn(187, str);
            methodVisitorVisitMethod.visitInsn(89);
            methodVisitorVisitMethod.visitVarInsn(25, 1);
            methodVisitorVisitMethod.visitTypeInsn(192, str2);
            methodVisitorVisitMethod.visitInsn(89);
            methodVisitorVisitMethod.visitMethodInsn(182, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME, "getClass", "()Ljava/lang/Class;");
            methodVisitorVisitMethod.visitInsn(87);
            methodVisitorVisitMethod.visitMethodInsn(183, str, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(L" + str2 + ";)V");
            methodVisitorVisitMethod.visitInsn(176);
            methodVisitorVisitMethod.visitMaxs(4, 2);
        } else {
            methodVisitorVisitMethod.visitTypeInsn(187, "java/lang/UnsupportedOperationException");
            methodVisitorVisitMethod.visitInsn(89);
            methodVisitorVisitMethod.visitLdcInsn("Not an inner class.");
            methodVisitorVisitMethod.visitMethodInsn(183, "java/lang/UnsupportedOperationException", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V");
            methodVisitorVisitMethod.visitInsn(191);
            methodVisitorVisitMethod.visitMaxs(3, 2);
        }
        methodVisitorVisitMethod.visitEnd();
    }

    public boolean isNonStaticMemberClass() {
        return this.isNonStaticMemberClass;
    }

    public abstract T newInstance();

    public abstract T newInstance(Object obj);
}
