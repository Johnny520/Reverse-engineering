package top.linl.dexparser.util;

import bsh.C2632;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import net.bytebuddy.pool.TypePool;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class DexTypeUtils {
    private static final Map<String, Class<?>> CLASS_CACHE = new HashMap();
    private static ClassLoader loader;

    public static String conversionTypeName(String str) {
        int iIndexOf;
        if (isSimpleArray(str)) {
            return findSimpleTypeArray(str).getName();
        }
        if (str.length() == 1) {
            return findSimpleType(str.charAt(0)).getName();
        }
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(sb.indexOf("L"));
        sb.deleteCharAt(sb.length() - 1);
        do {
            iIndexOf = sb.indexOf("/");
            if (iIndexOf != -1) {
                sb.setCharAt(iIndexOf, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            }
        } while (iIndexOf != -1);
        return sb.toString();
    }

    public static Class<?> findClass(String str) {
        Class<?> clsLoadClass;
        Map<String, Class<?>> map = CLASS_CACHE;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        if (str.length() == 1) {
            Class<?> clsFindSimpleType = findSimpleType(str.charAt(0));
            map.put(str, clsFindSimpleType);
            return clsFindSimpleType;
        }
        if (isSimpleArray(str)) {
            Class<?> clsFindSimpleTypeArray = findSimpleTypeArray(str);
            map.put(str, clsFindSimpleTypeArray);
            return clsFindSimpleTypeArray;
        }
        try {
            String strConversionTypeName = conversionTypeName(str);
            if (strConversionTypeName.charAt(0) == '[') {
                clsLoadClass = loader.loadClass(strConversionTypeName.replace("[", ""));
                StringBuilder sb = new StringBuilder(strConversionTypeName);
                for (int i = 0; i < sb.length() && sb.charAt(i) == '['; i++) {
                    clsLoadClass = Array.newInstance(clsLoadClass, 0).getClass();
                }
            } else {
                clsLoadClass = loader.loadClass(strConversionTypeName);
            }
            CLASS_CACHE.put(str, clsLoadClass);
            return clsLoadClass;
        } catch (ClassNotFoundException e) {
            C5919.m11252(e);
            return null;
        }
    }

    public static Class<?> findSimpleType(char c) {
        if (c == 'F') {
            return Float.TYPE;
        }
        if (c == 'S') {
            return Short.TYPE;
        }
        if (c == 'V') {
            return Void.TYPE;
        }
        if (c == 'Z') {
            return Boolean.TYPE;
        }
        if (c == 'I') {
            return Integer.TYPE;
        }
        if (c == 'J') {
            return Long.TYPE;
        }
        switch (c) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                C2632.m5294("Not an underlying type");
                return null;
        }
    }

    public static Class<?> findSimpleTypeArray(String str) {
        Class<?> clsFindSimpleType = findSimpleType(str.charAt(str.lastIndexOf(91) + 1));
        for (int i = 0; i < str.length() && str.charAt(i) == '['; i++) {
            clsFindSimpleType = Array.newInstance(clsFindSimpleType, 0).getClass();
        }
        return clsFindSimpleType;
    }

    private static boolean isSimpleArray(String str) {
        int iLastIndexOf = str.lastIndexOf(91);
        return (iLastIndexOf == -1 || str.charAt(iLastIndexOf + 1) == 'L') ? false : true;
    }

    public static void setClassLoader(ClassLoader classLoader) {
        loader = classLoader;
    }
}
