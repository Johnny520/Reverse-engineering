package org.luckypray.dexkit.util;

import androidx.activity.AbstractC0900;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5179;
import net.bytebuddy.pool.TypePool;
import p068.InterfaceC7387;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: org.luckypray.dexkit.util.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6561 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final LinkedHashMap f16061 = AbstractC5171.m9327(new Pair("boolean", "Z"), new Pair("byte", "B"), new Pair("char", "C"), new Pair("short", "S"), new Pair("int", "I"), new Pair("float", "F"), new Pair("long", "J"), new Pair("double", "D"), new Pair("void", "V"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final LinkedHashMap f16060 = AbstractC5171.m9327(new Pair("Z", "boolean"), new Pair("B", "byte"), new Pair("C", "char"), new Pair("S", "short"), new Pair("I", "int"), new Pair("F", "float"), new Pair("J", "long"), new Pair("D", "double"), new Pair("V", "void"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final String m11688(String str) {
        str.getClass();
        if (str.endsWith("[]")) {
            return "[".concat(m11688(str.substring(0, str.length() - 2)));
        }
        String str2 = (String) f16061.get(str);
        if (str2 != null) {
            return str2;
        }
        String strReplace = str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
        strReplace.getClass();
        return "L" + strReplace + ";";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String m11689(Class cls) {
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                componentType.getClass();
                return "[".concat(m11689(componentType));
            }
            String strReplace = cls.getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
            strReplace.getClass();
            return AbstractC0900.m718("L", strReplace, ";");
        }
        if (cls.equals(Boolean.TYPE)) {
            return "Z";
        }
        if (cls.equals(Byte.TYPE)) {
            return "B";
        }
        if (cls.equals(Character.TYPE)) {
            return "C";
        }
        if (cls.equals(Short.TYPE)) {
            return "S";
        }
        if (cls.equals(Integer.TYPE)) {
            return "I";
        }
        if (cls.equals(Float.TYPE)) {
            return "F";
        }
        if (cls.equals(Long.TYPE)) {
            return "J";
        }
        if (cls.equals(Double.TYPE)) {
            return "D";
        }
        if (cls.equals(Void.TYPE)) {
            return "V";
        }
        C6755.m11870(AbstractC0900.m714(cls, "Unknown primitive type: "));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String m11690(String str) {
        str.getClass();
        if (str.charAt(0) == '[') {
            return m11690(str.substring(1)).concat("[]");
        }
        if (str.length() == 1) {
            String str2 = (String) f16060.get(str);
            if (str2 != null) {
                return str2;
            }
            C6755.m11869("Unknown primitive typeSign: ".concat(str));
            return null;
        }
        if (str.charAt(0) != 'L' || str.charAt(str.length() - 1) != ';') {
            C6755.m11870("Unknown class sign: ".concat(str));
            return null;
        }
        String strReplace = str.substring(1, str.length() - 1).replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        strReplace.getClass();
        return strReplace;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String m11691(Class cls) {
        cls.getClass();
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            return AbstractC0900.m696(m11691(componentType), "[]");
        }
        if (!cls.isPrimitive()) {
            return cls.getName();
        }
        if (cls.equals(Boolean.TYPE)) {
            return "boolean";
        }
        if (cls.equals(Byte.TYPE)) {
            return "byte";
        }
        if (cls.equals(Character.TYPE)) {
            return "char";
        }
        if (cls.equals(Short.TYPE)) {
            return "short";
        }
        if (cls.equals(Integer.TYPE)) {
            return "int";
        }
        if (cls.equals(Float.TYPE)) {
            return "float";
        }
        if (cls.equals(Long.TYPE)) {
            return "long";
        }
        if (cls.equals(Double.TYPE)) {
            return "double";
        }
        if (cls.equals(Void.TYPE)) {
            return "void";
        }
        C6755.m11870(AbstractC0900.m714(cls, "Unknown primitive type: "));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m11692(Method method) {
        method.getClass();
        StringBuilder sb = new StringBuilder("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        sb.append(AbstractC5179.m9415(parameterTypes, null, null, new InterfaceC7387() { // from class: org.luckypray.dexkit.util.DexSignUtil$getMethodSign$1$1
            @Override // p068.InterfaceC7387
            public final CharSequence invoke(Class<?> cls) {
                cls.getClass();
                return AbstractC6561.m11689(cls);
            }
        }, 30));
        sb.append(")");
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb.append(m11689(returnType));
        return sb.toString();
    }
}
