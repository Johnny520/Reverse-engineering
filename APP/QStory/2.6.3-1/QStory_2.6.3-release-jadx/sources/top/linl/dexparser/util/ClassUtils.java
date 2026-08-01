package top.linl.dexparser.util;

import bsh.C3466;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
                C3466.m5899("Not an underlying type");
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
