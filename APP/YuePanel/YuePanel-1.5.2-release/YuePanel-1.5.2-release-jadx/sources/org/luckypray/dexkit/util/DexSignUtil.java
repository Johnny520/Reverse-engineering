package org.luckypray.dexkit.util;

import Yue.C3411;
import Yue.C4750;
import Yue.C5385;
import Yue.C5499;
import Yue.C5943;
import Yue.C7627;
import Yue.C7628;
import Yue.C8003;
import Yue.InterfaceC5578;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0007J\u0014\u0010\n\u001a\u00020\u00052\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0007J\u0014\u0010\r\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0007J\u0014\u0010\r\u001a\u00020\u00052\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0014\u0010\u0013\u001a\u00020\u00052\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0007J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0007J\u0014\u0010\u0018\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0007J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0007J\u0014\u0010\u001a\u001a\u00020\u00052\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\tH\u0007J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0007J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0003R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m2699d2 = {"Lorg/luckypray/dexkit/util/DexSignUtil;", "", "()V", "primitiveMap", "", "", "primitiveTypeNameMap", "getClassDescriptor", "clazz", "Ljava/lang/Class;", "getConstructorSign", "constructor", "Ljava/lang/reflect/Constructor;", "getDescriptor", "field", "Ljava/lang/reflect/Field;", "method", "Ljava/lang/reflect/Method;", "getFieldDescriptor", "getMethodDescriptor", "getMethodSign", "getParamTypeNames", "", "paramSigns", "getTypeName", "typeSign", "getTypeSign", "type", "typeName", "primitiveTypeName", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class DexSignUtil {

    @InterfaceC6399
    public static final DexSignUtil INSTANCE = new DexSignUtil();

    @InterfaceC6399
    private static final Map<String, String> primitiveMap = C5943.m18620(C8003.m4014("boolean", "Z"), C8003.m4014("byte", "B"), C8003.m4014("char", "C"), C8003.m4014("short", C4750.f10490), C8003.m4014("int", "I"), C8003.m4014("float", "F"), C8003.m4014("long", "J"), C8003.m4014("double", "D"), C8003.m4014("void", C4750.f10496));

    @InterfaceC6399
    private static final Map<String, String> primitiveTypeNameMap = C5943.m18620(C8003.m4014("Z", "boolean"), C8003.m4014("B", "byte"), C8003.m4014("C", "char"), C8003.m4014(C4750.f10490, "short"), C8003.m4014("I", "int"), C8003.m4014("F", "float"), C8003.m4014("J", "long"), C8003.m4014("D", "double"), C8003.m4014(C4750.f10496, "void"));

    private DexSignUtil() {
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final String getClassDescriptor(@InterfaceC6399 Class<?> cls) {
        C5499.m17103(cls, "clazz");
        return getDescriptor(cls);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final String getConstructorSign(@InterfaceC6399 Constructor<?> constructor) {
        C5499.m17103(constructor, "constructor");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        C5499.m17102(parameterTypes, "constructor.parameterTypes");
        sb.append(C3411.m8021(parameterTypes, "", null, null, 0, null, DexSignUtil$getConstructorSign$1$1.INSTANCE, 30, null));
        sb.append(")V");
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5578
    public static final String getDescriptor(@InterfaceC6399 Class<?> cls) {
        C5499.m17103(cls, "clazz");
        return getTypeSign(cls);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final String getFieldDescriptor(@InterfaceC6399 Field field) {
        C5499.m17103(field, "field");
        return getDescriptor(field);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5578
    public static final String getMethodDescriptor(@InterfaceC6399 Method method) {
        C5499.m17103(method, "method");
        return getDescriptor(method);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final String getMethodSign(@InterfaceC6399 Method method) {
        C5499.m17103(method, "method");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        C5499.m17102(parameterTypes, "method.parameterTypes");
        sb.append(C3411.m8021(parameterTypes, "", null, null, 0, null, DexSignUtil$getMethodSign$1$1.INSTANCE, 30, null));
        sb.append(")");
        Class<?> returnType = method.getReturnType();
        C5499.m17102(returnType, "method.returnType");
        sb.append(getTypeSign(returnType));
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final List<String> getParamTypeNames(@InterfaceC6399 String str) {
        C5499.m17103(str, "paramSigns");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int iM24056 = 0;
        while (iM24056 < str.length()) {
            char cCharAt = str.charAt(iM24056);
            if (cCharAt == '[') {
                iM24056++;
            } else {
                if (cCharAt == 'L') {
                    iM24056 = C7628.m24056(str, TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER, iM24056, false, 4, null);
                }
                iM24056++;
                String strSubstring = str.substring(i, iM24056);
                C5499.m17102(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                arrayList.add(getTypeName(strSubstring));
                i = iM24056;
            }
        }
        if (i == iM24056) {
            return arrayList;
        }
        throw new IllegalStateException("Unknown signString: " + str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5578
    public static final String getTypeName(@InterfaceC6399 String str) {
        C5499.m17103(str, "typeSign");
        if (str.charAt(0) == '[') {
            String strSubstring = str.substring(1);
            C5499.m17102(strSubstring, "(this as java.lang.String).substring(startIndex)");
            return getTypeName(strSubstring) + C5385.f13236;
        }
        if (str.length() == 1) {
            return primitiveTypeName(str);
        }
        if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
            String strSubstring2 = str.substring(1, str.length() - 1);
            C5499.m17102(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return C7627.m23997(strSubstring2, '/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, false, 4, null);
        }
        throw new IllegalStateException("Unknown class sign: " + str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5578
    public static final String getTypeSign(@InterfaceC6399 Class<?> cls) {
        C5499.m17103(cls, "type");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                C5499.m17100(componentType);
                return "[" + getTypeSign(componentType);
            }
            String name = cls.getName();
            C5499.m17102(name, "type.name");
            return "L" + C7627.m23997(name, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/', false, 4, null) + ";";
        }
        if (C5499.m17094(cls, Boolean.TYPE)) {
            return "Z";
        }
        if (C5499.m17094(cls, Byte.TYPE)) {
            return "B";
        }
        if (C5499.m17094(cls, Character.TYPE)) {
            return "C";
        }
        if (C5499.m17094(cls, Short.TYPE)) {
            return C4750.f10490;
        }
        if (C5499.m17094(cls, Integer.TYPE)) {
            return "I";
        }
        if (C5499.m17094(cls, Float.TYPE)) {
            return "F";
        }
        if (C5499.m17094(cls, Long.TYPE)) {
            return "J";
        }
        if (C5499.m17094(cls, Double.TYPE)) {
            return "D";
        }
        if (C5499.m17094(cls, Void.TYPE)) {
            return C4750.f10496;
        }
        throw new IllegalStateException("Unknown primitive type: " + cls);
    }

    @InterfaceC5578
    private static final String primitiveTypeName(String str) {
        String str2 = primitiveTypeNameMap.get(str);
        if (str2 != null) {
            return str2;
        }
        throw new IllegalArgumentException("Unknown primitive typeSign: " + str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5578
    public static final String getDescriptor(@InterfaceC6399 Method method) {
        C5499.m17103(method, "method");
        StringBuilder sb = new StringBuilder();
        Class<?> declaringClass = method.getDeclaringClass();
        C5499.m17102(declaringClass, "method.declaringClass");
        sb.append(getTypeSign(declaringClass));
        sb.append("->");
        sb.append(method.getName());
        sb.append(getMethodSign(method));
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5578
    public static final String getMethodDescriptor(@InterfaceC6399 Constructor<?> constructor) {
        C5499.m17103(constructor, "constructor");
        return getDescriptor(constructor);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final String getDescriptor(@InterfaceC6399 Constructor<?> constructor) {
        C5499.m17103(constructor, "constructor");
        StringBuilder sb = new StringBuilder();
        Class<?> declaringClass = constructor.getDeclaringClass();
        C5499.m17102(declaringClass, "constructor.declaringClass");
        sb.append(getTypeSign(declaringClass));
        sb.append("->");
        sb.append(MethodDescription.CONSTRUCTOR_INTERNAL_NAME);
        sb.append(getConstructorSign(constructor));
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final String getTypeName(@InterfaceC6399 Class<?> cls) {
        C5499.m17103(cls, "clazz");
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            C5499.m17100(componentType);
            return getTypeName(componentType) + C5385.f13236;
        }
        if (cls.isPrimitive()) {
            if (C5499.m17094(cls, Boolean.TYPE)) {
                return "boolean";
            }
            if (C5499.m17094(cls, Byte.TYPE)) {
                return "byte";
            }
            if (C5499.m17094(cls, Character.TYPE)) {
                return "char";
            }
            if (C5499.m17094(cls, Short.TYPE)) {
                return "short";
            }
            if (C5499.m17094(cls, Integer.TYPE)) {
                return "int";
            }
            if (C5499.m17094(cls, Float.TYPE)) {
                return "float";
            }
            if (C5499.m17094(cls, Long.TYPE)) {
                return "long";
            }
            if (C5499.m17094(cls, Double.TYPE)) {
                return "double";
            }
            if (C5499.m17094(cls, Void.TYPE)) {
                return "void";
            }
            throw new IllegalStateException("Unknown primitive type: " + cls);
        }
        String name = cls.getName();
        C5499.m17102(name, "clazz.name");
        return name;
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final String getDescriptor(@InterfaceC6399 Field field) {
        C5499.m17103(field, "field");
        StringBuilder sb = new StringBuilder();
        Class<?> declaringClass = field.getDeclaringClass();
        C5499.m17102(declaringClass, "field.declaringClass");
        sb.append(getTypeSign(declaringClass));
        sb.append("->");
        sb.append(field.getName());
        sb.append(":");
        Class<?> type = field.getType();
        C5499.m17102(type, "field.type");
        sb.append(getTypeSign(type));
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final String getTypeSign(@InterfaceC6399 String str) {
        C5499.m17103(str, "typeName");
        if (C7627.m23973(str, C5385.f13236, false, 2, null)) {
            String strSubstring = str.substring(0, str.length() - 2);
            C5499.m17102(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return "[" + getTypeSign(strSubstring);
        }
        String str2 = primitiveMap.get(str);
        if (str2 != null) {
            return str2;
        }
        return "L" + C7627.m23997(str, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/', false, 4, null) + ";";
    }
}
