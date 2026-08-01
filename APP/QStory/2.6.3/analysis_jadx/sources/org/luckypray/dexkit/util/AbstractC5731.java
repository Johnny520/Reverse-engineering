package org.luckypray.dexkit.util;

import androidx.activity.AbstractC0053;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4347;
import net.bytebuddy.pool.TypePool;
import p052.InterfaceC6558;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: org.luckypray.dexkit.util.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5731 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final LinkedHashMap f15716 = AbstractC4339.m8768(new Pair("boolean", "Z"), new Pair("byte", "B"), new Pair("char", "C"), new Pair("short", "S"), new Pair("int", "I"), new Pair("float", "F"), new Pair("long", "J"), new Pair("double", "D"), new Pair("void", "V"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final LinkedHashMap f15715 = AbstractC4339.m8768(new Pair("Z", "boolean"), new Pair("B", "byte"), new Pair("C", "char"), new Pair("S", "short"), new Pair("I", "int"), new Pair("F", "float"), new Pair("J", "long"), new Pair("D", "double"), new Pair("V", "void"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final String m11129(String str) {
        str.getClass();
        if (str.endsWith("[]")) {
            return "[".concat(m11129(str.substring(0, str.length() - 2)));
        }
        String str2 = (String) f15716.get(str);
        if (str2 != null) {
            return str2;
        }
        String strReplace = str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
        strReplace.getClass();
        return "L" + strReplace + ";";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String m11130(Class cls) {
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                componentType.getClass();
                return "[".concat(m11130(componentType));
            }
            String strReplace = cls.getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
            strReplace.getClass();
            return AbstractC0053.m158("L", strReplace, ";");
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
        C5925.m11311(AbstractC0053.m154(cls, "Unknown primitive type: "));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String m11131(String str) {
        str.getClass();
        if (str.charAt(0) == '[') {
            return m11131(str.substring(1)).concat("[]");
        }
        if (str.length() == 1) {
            String str2 = (String) f15715.get(str);
            if (str2 != null) {
                return str2;
            }
            C5925.m11310("Unknown primitive typeSign: ".concat(str));
            return null;
        }
        if (str.charAt(0) != 'L' || str.charAt(str.length() - 1) != ';') {
            C5925.m11311("Unknown class sign: ".concat(str));
            return null;
        }
        String strReplace = str.substring(1, str.length() - 1).replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        strReplace.getClass();
        return strReplace;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String m11132(Class cls) {
        cls.getClass();
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            return AbstractC0053.m136(m11132(componentType), "[]");
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
        C5925.m11311(AbstractC0053.m154(cls, "Unknown primitive type: "));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m11133(Method method) {
        method.getClass();
        StringBuilder sb = new StringBuilder("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        sb.append(AbstractC4347.m8856(parameterTypes, null, null, new InterfaceC6558() { // from class: org.luckypray.dexkit.util.DexSignUtil$getMethodSign$1$1
            @Override // p052.InterfaceC6558
            public final CharSequence invoke(Class<?> cls) {
                cls.getClass();
                return AbstractC5731.m11130(cls);
            }
        }, 30));
        sb.append(")");
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb.append(m11130(returnType));
        return sb.toString();
    }
}
