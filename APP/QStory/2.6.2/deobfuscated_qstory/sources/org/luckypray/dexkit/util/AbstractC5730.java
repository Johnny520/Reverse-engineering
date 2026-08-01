package org.luckypray.dexkit.util;

import androidx.activity.AbstractC0053;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4346;
import net.bytebuddy.pool.TypePool;
import p052.InterfaceC6557;
import p383.AbstractC9032;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: org.luckypray.dexkit.util.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5730 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final LinkedHashMap f15716 = AbstractC4338.m8786(new Pair("boolean", "Z"), new Pair("byte", "B"), new Pair("char", "C"), new Pair("short", "S"), new Pair("int", "I"), new Pair("float", "F"), new Pair("long", "J"), new Pair("double", "D"), new Pair("void", "V"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final LinkedHashMap f15715 = AbstractC4338.m8786(new Pair("Z", "boolean"), new Pair("B", "byte"), new Pair("C", "char"), new Pair("S", "short"), new Pair("I", "int"), new Pair("F", "float"), new Pair("J", "long"), new Pair("D", "double"), new Pair("V", "void"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final String m11072(String str) {
        str.getClass();
        if (str.endsWith("[]")) {
            return "[".concat(m11072(str.substring(0, str.length() - 2)));
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
    public static final String m11073(Class cls) {
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                componentType.getClass();
                return "[".concat(m11073(componentType));
            }
            String strReplace = cls.getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
            strReplace.getClass();
            return AbstractC0053.m156("L", strReplace, ";");
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
        C5919.m11250(AbstractC9032.m14590(cls, "Unknown primitive type: "));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String m11074(String str) {
        str.getClass();
        if (str.charAt(0) == '[') {
            return m11074(str.substring(1)).concat("[]");
        }
        if (str.length() == 1) {
            String str2 = (String) f15715.get(str);
            if (str2 != null) {
                return str2;
            }
            C5919.m11249("Unknown primitive typeSign: ".concat(str));
            return null;
        }
        if (str.charAt(0) != 'L' || str.charAt(str.length() - 1) != ';') {
            C5919.m11250("Unknown class sign: ".concat(str));
            return null;
        }
        String strReplace = str.substring(1, str.length() - 1).replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        strReplace.getClass();
        return strReplace;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String m11075(Class cls) {
        cls.getClass();
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            return AbstractC0053.m136(m11075(componentType), "[]");
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
        C5919.m11250(AbstractC9032.m14590(cls, "Unknown primitive type: "));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m11076(Method method) {
        method.getClass();
        StringBuilder sb = new StringBuilder("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        sb.append(AbstractC4346.m8856(parameterTypes, null, null, new InterfaceC6557() { // from class: org.luckypray.dexkit.util.DexSignUtil$getMethodSign$1$1
            @Override // p052.InterfaceC6557
            public final CharSequence invoke(Class<?> cls) {
                cls.getClass();
                return AbstractC5730.m11073(cls);
            }
        }, 30));
        sb.append(")");
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb.append(m11073(returnType));
        return sb.toString();
    }
}
