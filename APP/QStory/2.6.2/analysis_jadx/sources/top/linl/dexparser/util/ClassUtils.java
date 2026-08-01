package top.linl.dexparser.util;

import bsh.C2632;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class ClassUtils {
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
}
