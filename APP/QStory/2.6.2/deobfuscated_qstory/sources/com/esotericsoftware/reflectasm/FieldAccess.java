package com.esotericsoftware.reflectasm;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import com.esotericsoftware.asm.ClassWriter;
import com.esotericsoftware.asm.Label;
import com.esotericsoftware.asm.MethodVisitor;
import com.esotericsoftware.asm.Type;
import io.ktor.util.C4210;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.pool.TypePool;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FieldAccess {
    private String[] fieldNames;
    private Class[] fieldTypes;
    private Field[] fields;

    public static FieldAccess get(Class cls) {
        Class clsLoadAccessClass;
        if (cls.getSuperclass() == null) {
            C5919.m11249("The type must not be the Object class, an interface, a primitive type, or void.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Class superclass = cls;
        while (true) {
            if (superclass == Object.class) {
                break;
            }
            for (Field field : superclass.getDeclaredFields()) {
                int modifiers = field.getModifiers();
                if (!Modifier.isStatic(modifiers) && !Modifier.isPrivate(modifiers)) {
                    arrayList.add(field);
                }
            }
            superclass = superclass.getSuperclass();
        }
        int size = arrayList.size();
        String[] strArr = new String[size];
        Class[] clsArr = new Class[arrayList.size()];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((Field) arrayList.get(i)).getName();
            clsArr[i] = ((Field) arrayList.get(i)).getType();
        }
        String name = cls.getName();
        String strConcat = name.concat("FieldAccess");
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
                    ClassWriter classWriter = new ClassWriter(0);
                    classWriter.visit(196653, 33, strReplace, null, "com/esotericsoftware/reflectasm/FieldAccess", null);
                    insertConstructor(classWriter);
                    insertGetObject(classWriter, strReplace2, arrayList);
                    insertSetObject(classWriter, strReplace2, arrayList);
                    Type type = Type.BOOLEAN_TYPE;
                    insertGetPrimitive(classWriter, strReplace2, arrayList, type);
                    insertSetPrimitive(classWriter, strReplace2, arrayList, type);
                    Type type2 = Type.BYTE_TYPE;
                    insertGetPrimitive(classWriter, strReplace2, arrayList, type2);
                    insertSetPrimitive(classWriter, strReplace2, arrayList, type2);
                    Type type3 = Type.SHORT_TYPE;
                    insertGetPrimitive(classWriter, strReplace2, arrayList, type3);
                    insertSetPrimitive(classWriter, strReplace2, arrayList, type3);
                    Type type4 = Type.INT_TYPE;
                    insertGetPrimitive(classWriter, strReplace2, arrayList, type4);
                    insertSetPrimitive(classWriter, strReplace2, arrayList, type4);
                    Type type5 = Type.LONG_TYPE;
                    insertGetPrimitive(classWriter, strReplace2, arrayList, type5);
                    insertSetPrimitive(classWriter, strReplace2, arrayList, type5);
                    Type type6 = Type.DOUBLE_TYPE;
                    insertGetPrimitive(classWriter, strReplace2, arrayList, type6);
                    insertSetPrimitive(classWriter, strReplace2, arrayList, type6);
                    Type type7 = Type.FLOAT_TYPE;
                    insertGetPrimitive(classWriter, strReplace2, arrayList, type7);
                    insertSetPrimitive(classWriter, strReplace2, arrayList, type7);
                    Type type8 = Type.CHAR_TYPE;
                    insertGetPrimitive(classWriter, strReplace2, arrayList, type8);
                    insertSetPrimitive(classWriter, strReplace2, arrayList, type8);
                    insertGetString(classWriter, strReplace2, arrayList);
                    classWriter.visitEnd();
                    clsLoadAccessClass = accessClassLoader.defineAccessClass(strConcat, classWriter.toByteArray());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            FieldAccess fieldAccess = (FieldAccess) clsLoadAccessClass.newInstance();
            fieldAccess.fieldNames = strArr;
            fieldAccess.fieldTypes = clsArr;
            fieldAccess.fields = (Field[]) arrayList.toArray(new Field[arrayList.size()]);
            return fieldAccess;
        } catch (Throwable th2) {
            C0276.m847("Error constructing field access class: ".concat(strConcat), th2);
            return null;
        }
    }

    private static void insertConstructor(ClassWriter classWriter) {
        MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(1, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", null, null);
        methodVisitorVisitMethod.visitCode();
        methodVisitorVisitMethod.visitVarInsn(25, 0);
        methodVisitorVisitMethod.visitMethodInsn(183, "com/esotericsoftware/reflectasm/FieldAccess", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V");
        methodVisitorVisitMethod.visitInsn(177);
        methodVisitorVisitMethod.visitMaxs(1, 1);
        methodVisitorVisitMethod.visitEnd();
    }

    private static void insertGetObject(ClassWriter classWriter, String str, ArrayList<Field> arrayList) {
        int i;
        MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(1, "get", "(Ljava/lang/Object;I)Ljava/lang/Object;", null, null);
        methodVisitorVisitMethod.visitCode();
        methodVisitorVisitMethod.visitVarInsn(21, 2);
        if (arrayList.isEmpty()) {
            i = 6;
        } else {
            int size = arrayList.size();
            Label[] labelArr = new Label[size];
            for (int i2 = 0; i2 < size; i2++) {
                labelArr[i2] = new Label();
            }
            Label label = new Label();
            methodVisitorVisitMethod.visitTableSwitchInsn(0, size - 1, label, labelArr);
            for (int i3 = 0; i3 < size; i3++) {
                Field field = arrayList.get(i3);
                methodVisitorVisitMethod.visitLabel(labelArr[i3]);
                methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
                methodVisitorVisitMethod.visitVarInsn(25, 1);
                methodVisitorVisitMethod.visitTypeInsn(192, str);
                methodVisitorVisitMethod.visitFieldInsn(180, field.getDeclaringClass().getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'), field.getName(), Type.getDescriptor(field.getType()));
                switch (Type.getType(field.getType()).getSort()) {
                    case 1:
                        methodVisitorVisitMethod.visitMethodInsn(184, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;");
                        break;
                    case 2:
                        methodVisitorVisitMethod.visitMethodInsn(184, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;");
                        break;
                    case 3:
                        methodVisitorVisitMethod.visitMethodInsn(184, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
                        break;
                    case 4:
                        methodVisitorVisitMethod.visitMethodInsn(184, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
                        break;
                    case 5:
                        methodVisitorVisitMethod.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                        break;
                    case 6:
                        methodVisitorVisitMethod.visitMethodInsn(184, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
                        break;
                    case 7:
                        methodVisitorVisitMethod.visitMethodInsn(184, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
                        break;
                    case 8:
                        methodVisitorVisitMethod.visitMethodInsn(184, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
                        break;
                }
                methodVisitorVisitMethod.visitInsn(176);
            }
            methodVisitorVisitMethod.visitLabel(label);
            methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
            i = 5;
        }
        insertThrowExceptionForFieldNotFound(methodVisitorVisitMethod);
        methodVisitorVisitMethod.visitMaxs(i, 3);
        methodVisitorVisitMethod.visitEnd();
    }

    private static void insertGetPrimitive(ClassWriter classWriter, String str, ArrayList<Field> arrayList, Type type) {
        String str2;
        int i;
        String descriptor = type.getDescriptor();
        int i2 = 172;
        switch (type.getSort()) {
            case 1:
                str2 = "getBoolean";
                break;
            case 2:
                str2 = "getChar";
                break;
            case 3:
                str2 = "getByte";
                break;
            case 4:
                str2 = "getShort";
                break;
            case 5:
                str2 = "getInt";
                break;
            case 6:
                str2 = "getFloat";
                i2 = 174;
                break;
            case 7:
                str2 = "getLong";
                i2 = 173;
                break;
            case 8:
                str2 = "getDouble";
                i2 = 175;
                break;
            default:
                str2 = "get";
                i2 = 176;
                break;
        }
        MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(1, str2, AbstractC0053.m152("(Ljava/lang/Object;I)", descriptor), null, null);
        methodVisitorVisitMethod.visitCode();
        methodVisitorVisitMethod.visitVarInsn(21, 2);
        if (arrayList.isEmpty()) {
            i = 6;
        } else {
            int size = arrayList.size();
            Label[] labelArr = new Label[size];
            Label label = new Label();
            boolean z = false;
            for (int i3 = 0; i3 < size; i3++) {
                if (Type.getType(arrayList.get(i3).getType()).equals(type)) {
                    labelArr[i3] = new Label();
                } else {
                    labelArr[i3] = label;
                    z = true;
                }
            }
            Label label2 = new Label();
            methodVisitorVisitMethod.visitTableSwitchInsn(0, size - 1, label2, labelArr);
            for (int i4 = 0; i4 < size; i4++) {
                Field field = arrayList.get(i4);
                if (!labelArr[i4].equals(label)) {
                    methodVisitorVisitMethod.visitLabel(labelArr[i4]);
                    methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
                    methodVisitorVisitMethod.visitVarInsn(25, 1);
                    methodVisitorVisitMethod.visitTypeInsn(192, str);
                    methodVisitorVisitMethod.visitFieldInsn(180, field.getDeclaringClass().getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'), field.getName(), descriptor);
                    methodVisitorVisitMethod.visitInsn(i2);
                }
            }
            if (z) {
                methodVisitorVisitMethod.visitLabel(label);
                methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
                insertThrowExceptionForFieldType(methodVisitorVisitMethod, type.getClassName());
            }
            methodVisitorVisitMethod.visitLabel(label2);
            methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
            i = 5;
        }
        MethodVisitor methodVisitorInsertThrowExceptionForFieldNotFound = insertThrowExceptionForFieldNotFound(methodVisitorVisitMethod);
        methodVisitorInsertThrowExceptionForFieldNotFound.visitMaxs(i, 3);
        methodVisitorInsertThrowExceptionForFieldNotFound.visitEnd();
    }

    private static void insertGetString(ClassWriter classWriter, String str, ArrayList<Field> arrayList) {
        int i;
        MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(1, "getString", "(Ljava/lang/Object;I)Ljava/lang/String;", null, null);
        methodVisitorVisitMethod.visitCode();
        methodVisitorVisitMethod.visitVarInsn(21, 2);
        if (arrayList.isEmpty()) {
            i = 6;
        } else {
            int size = arrayList.size();
            Label[] labelArr = new Label[size];
            Label label = new Label();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                if (arrayList.get(i2).getType().equals(String.class)) {
                    labelArr[i2] = new Label();
                } else {
                    labelArr[i2] = label;
                    z = true;
                }
            }
            Label label2 = new Label();
            methodVisitorVisitMethod.visitTableSwitchInsn(0, size - 1, label2, labelArr);
            for (int i3 = 0; i3 < size; i3++) {
                if (!labelArr[i3].equals(label)) {
                    Field field = arrayList.get(i3);
                    methodVisitorVisitMethod.visitLabel(labelArr[i3]);
                    methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
                    methodVisitorVisitMethod.visitVarInsn(25, 1);
                    methodVisitorVisitMethod.visitTypeInsn(192, str);
                    methodVisitorVisitMethod.visitFieldInsn(180, field.getDeclaringClass().getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'), field.getName(), "Ljava/lang/String;");
                    methodVisitorVisitMethod.visitInsn(176);
                }
            }
            if (z) {
                methodVisitorVisitMethod.visitLabel(label);
                methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
                insertThrowExceptionForFieldType(methodVisitorVisitMethod, "String");
            }
            methodVisitorVisitMethod.visitLabel(label2);
            methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
            i = 5;
        }
        insertThrowExceptionForFieldNotFound(methodVisitorVisitMethod);
        methodVisitorVisitMethod.visitMaxs(i, 3);
        methodVisitorVisitMethod.visitEnd();
    }

    private static void insertSetObject(ClassWriter classWriter, String str, ArrayList<Field> arrayList) {
        int i;
        MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(1, "set", "(Ljava/lang/Object;ILjava/lang/Object;)V", null, null);
        methodVisitorVisitMethod.visitCode();
        methodVisitorVisitMethod.visitVarInsn(21, 2);
        if (arrayList.isEmpty()) {
            i = 6;
        } else {
            int size = arrayList.size();
            Label[] labelArr = new Label[size];
            for (int i2 = 0; i2 < size; i2++) {
                labelArr[i2] = new Label();
            }
            Label label = new Label();
            methodVisitorVisitMethod.visitTableSwitchInsn(0, size - 1, label, labelArr);
            for (int i3 = 0; i3 < size; i3++) {
                Field field = arrayList.get(i3);
                Type type = Type.getType(field.getType());
                methodVisitorVisitMethod.visitLabel(labelArr[i3]);
                methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
                methodVisitorVisitMethod.visitVarInsn(25, 1);
                methodVisitorVisitMethod.visitTypeInsn(192, str);
                methodVisitorVisitMethod.visitVarInsn(25, 3);
                switch (type.getSort()) {
                    case 1:
                        methodVisitorVisitMethod.visitTypeInsn(192, "java/lang/Boolean");
                        methodVisitorVisitMethod.visitMethodInsn(182, "java/lang/Boolean", "booleanValue", "()Z");
                        break;
                    case 2:
                        methodVisitorVisitMethod.visitTypeInsn(192, "java/lang/Character");
                        methodVisitorVisitMethod.visitMethodInsn(182, "java/lang/Character", "charValue", "()C");
                        break;
                    case 3:
                        methodVisitorVisitMethod.visitTypeInsn(192, "java/lang/Byte");
                        methodVisitorVisitMethod.visitMethodInsn(182, "java/lang/Byte", "byteValue", "()B");
                        break;
                    case 4:
                        methodVisitorVisitMethod.visitTypeInsn(192, "java/lang/Short");
                        methodVisitorVisitMethod.visitMethodInsn(182, "java/lang/Short", "shortValue", "()S");
                        break;
                    case 5:
                        methodVisitorVisitMethod.visitTypeInsn(192, "java/lang/Integer");
                        methodVisitorVisitMethod.visitMethodInsn(182, "java/lang/Integer", "intValue", "()I");
                        break;
                    case 6:
                        methodVisitorVisitMethod.visitTypeInsn(192, "java/lang/Float");
                        methodVisitorVisitMethod.visitMethodInsn(182, "java/lang/Float", "floatValue", "()F");
                        break;
                    case 7:
                        methodVisitorVisitMethod.visitTypeInsn(192, "java/lang/Long");
                        methodVisitorVisitMethod.visitMethodInsn(182, "java/lang/Long", "longValue", "()J");
                        break;
                    case 8:
                        methodVisitorVisitMethod.visitTypeInsn(192, "java/lang/Double");
                        methodVisitorVisitMethod.visitMethodInsn(182, "java/lang/Double", "doubleValue", "()D");
                        break;
                    case 9:
                        methodVisitorVisitMethod.visitTypeInsn(192, type.getDescriptor());
                        break;
                    case 10:
                        methodVisitorVisitMethod.visitTypeInsn(192, type.getInternalName());
                        break;
                }
                methodVisitorVisitMethod.visitFieldInsn(181, field.getDeclaringClass().getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'), field.getName(), type.getDescriptor());
                methodVisitorVisitMethod.visitInsn(177);
            }
            methodVisitorVisitMethod.visitLabel(label);
            methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
            i = 5;
        }
        MethodVisitor methodVisitorInsertThrowExceptionForFieldNotFound = insertThrowExceptionForFieldNotFound(methodVisitorVisitMethod);
        methodVisitorInsertThrowExceptionForFieldNotFound.visitMaxs(i, 4);
        methodVisitorInsertThrowExceptionForFieldNotFound.visitEnd();
    }

    private static void insertSetPrimitive(ClassWriter classWriter, String str, ArrayList<Field> arrayList, Type type) {
        String str2;
        String str3;
        int i;
        String str4;
        int i2;
        int i3;
        String descriptor = type.getDescriptor();
        int i4 = 25;
        int i5 = 4;
        switch (type.getSort()) {
            case 1:
                str2 = "setBoolean";
                str3 = str2;
                i = 21;
                break;
            case 2:
                str2 = "setChar";
                str3 = str2;
                i = 21;
                break;
            case 3:
                str2 = "setByte";
                str3 = str2;
                i = 21;
                break;
            case 4:
                str2 = "setShort";
                str3 = str2;
                i = 21;
                break;
            case 5:
                str2 = "setInt";
                str3 = str2;
                i = 21;
                break;
            case 6:
                str3 = "setFloat";
                i = 23;
                break;
            case 7:
                str4 = "setLong";
                i2 = 22;
                str3 = str4;
                i = i2;
                i5 = 5;
                break;
            case 8:
                str4 = "setDouble";
                i2 = 24;
                str3 = str4;
                i = i2;
                i5 = 5;
                break;
            default:
                str3 = "set";
                i = 25;
                break;
        }
        MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(1, str3, AbstractC0053.m156("(Ljava/lang/Object;I", descriptor, ")V"), null, null);
        methodVisitorVisitMethod.visitCode();
        methodVisitorVisitMethod.visitVarInsn(21, 2);
        if (arrayList.isEmpty()) {
            i3 = 6;
        } else {
            int size = arrayList.size();
            Label[] labelArr = new Label[size];
            Label label = new Label();
            int i6 = 0;
            boolean z = false;
            for (int i7 = 0; i7 < size; i7++) {
                if (Type.getType(arrayList.get(i7).getType()).equals(type)) {
                    labelArr[i7] = new Label();
                } else {
                    labelArr[i7] = label;
                    z = true;
                }
            }
            Label label2 = new Label();
            methodVisitorVisitMethod.visitTableSwitchInsn(0, size - 1, label2, labelArr);
            while (i6 < size) {
                if (!labelArr[i6].equals(label)) {
                    Field field = arrayList.get(i6);
                    methodVisitorVisitMethod.visitLabel(labelArr[i6]);
                    methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
                    methodVisitorVisitMethod.visitVarInsn(i4, 1);
                    methodVisitorVisitMethod.visitTypeInsn(192, str);
                    methodVisitorVisitMethod.visitVarInsn(i, 3);
                    methodVisitorVisitMethod.visitFieldInsn(181, field.getDeclaringClass().getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'), field.getName(), descriptor);
                    methodVisitorVisitMethod.visitInsn(177);
                }
                i6++;
                i4 = 25;
            }
            if (z) {
                methodVisitorVisitMethod.visitLabel(label);
                methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
                insertThrowExceptionForFieldType(methodVisitorVisitMethod, type.getClassName());
            }
            methodVisitorVisitMethod.visitLabel(label2);
            methodVisitorVisitMethod.visitFrame(3, 0, null, 0, null);
            i3 = 5;
        }
        MethodVisitor methodVisitorInsertThrowExceptionForFieldNotFound = insertThrowExceptionForFieldNotFound(methodVisitorVisitMethod);
        methodVisitorInsertThrowExceptionForFieldNotFound.visitMaxs(i3, i5);
        methodVisitorInsertThrowExceptionForFieldNotFound.visitEnd();
    }

    private static MethodVisitor insertThrowExceptionForFieldNotFound(MethodVisitor methodVisitor) {
        methodVisitor.visitTypeInsn(187, "java/lang/IllegalArgumentException");
        methodVisitor.visitInsn(89);
        methodVisitor.visitTypeInsn(187, "java/lang/StringBuilder");
        methodVisitor.visitInsn(89);
        methodVisitor.visitLdcInsn("Field not found: ");
        methodVisitor.visitMethodInsn(183, "java/lang/StringBuilder", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V");
        methodVisitor.visitVarInsn(21, 2);
        methodVisitor.visitMethodInsn(182, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;");
        methodVisitor.visitMethodInsn(182, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;");
        methodVisitor.visitMethodInsn(183, "java/lang/IllegalArgumentException", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V");
        methodVisitor.visitInsn(191);
        return methodVisitor;
    }

    private static MethodVisitor insertThrowExceptionForFieldType(MethodVisitor methodVisitor, String str) {
        methodVisitor.visitTypeInsn(187, "java/lang/IllegalArgumentException");
        methodVisitor.visitInsn(89);
        methodVisitor.visitTypeInsn(187, "java/lang/StringBuilder");
        methodVisitor.visitInsn(89);
        methodVisitor.visitLdcInsn("Field not declared as " + str + ": ");
        methodVisitor.visitMethodInsn(183, "java/lang/StringBuilder", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V");
        methodVisitor.visitVarInsn(21, 2);
        methodVisitor.visitMethodInsn(182, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;");
        methodVisitor.visitMethodInsn(182, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;");
        methodVisitor.visitMethodInsn(183, "java/lang/IllegalArgumentException", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V");
        methodVisitor.visitInsn(191);
        return methodVisitor;
    }

    public abstract Object get(Object obj, int i);

    public abstract boolean getBoolean(Object obj, int i);

    public abstract byte getByte(Object obj, int i);

    public abstract char getChar(Object obj, int i);

    public abstract double getDouble(Object obj, int i);

    public int getFieldCount() {
        return this.fieldTypes.length;
    }

    public String[] getFieldNames() {
        return this.fieldNames;
    }

    public Class[] getFieldTypes() {
        return this.fieldTypes;
    }

    public Field[] getFields() {
        return this.fields;
    }

    public abstract float getFloat(Object obj, int i);

    public int getIndex(String str) {
        int length = this.fieldNames.length;
        for (int i = 0; i < length; i++) {
            if (this.fieldNames[i].equals(str)) {
                return i;
            }
        }
        C5919.m11249(AbstractC0053.m152("Unable to find non-private field: ", str));
        return 0;
    }

    public abstract int getInt(Object obj, int i);

    public abstract long getLong(Object obj, int i);

    public abstract short getShort(Object obj, int i);

    public abstract String getString(Object obj, int i);

    public abstract void set(Object obj, int i, Object obj2);

    public void set(Object obj, String str, Object obj2) {
        set(obj, getIndex(str), obj2);
    }

    public abstract void setBoolean(Object obj, int i, boolean z);

    public abstract void setByte(Object obj, int i, byte b);

    public abstract void setChar(Object obj, int i, char c);

    public abstract void setDouble(Object obj, int i, double d);

    public void setFields(Field[] fieldArr) {
        this.fields = fieldArr;
    }

    public abstract void setFloat(Object obj, int i, float f);

    public abstract void setInt(Object obj, int i, int i2);

    public abstract void setLong(Object obj, int i, long j);

    public abstract void setShort(Object obj, int i, short s);

    public int getIndex(Field field) {
        int length = this.fields.length;
        for (int i = 0; i < length; i++) {
            if (this.fields[i].equals(field)) {
                return i;
            }
        }
        C4210.m8614(field, "Unable to find non-private field: ");
        return 0;
    }

    public Object get(Object obj, String str) {
        return get(obj, getIndex(str));
    }
}
