package p392;

import bsh.C2632;
import top.sacz.xphelper.exception.ReflectException;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲兰子世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9121 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C9122 f25497;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object[][] f25498 = {new Object[]{"int", Integer.TYPE}, new Object[]{"boolean", Boolean.TYPE}, new Object[]{"byte", Byte.TYPE}, new Object[]{"long", Long.TYPE}, new Object[]{"char", Character.TYPE}, new Object[]{"double", Double.TYPE}, new Object[]{"float", Float.TYPE}, new Object[]{"short", Short.TYPE}, new Object[]{"void", Void.TYPE}};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Class m14657(String str) {
        try {
            return f25497.loadClass(str);
        } catch (ClassNotFoundException e) {
            C5919.m11252(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Class m14658(String str) {
        if (str.length() != 1) {
            for (int i = 0; i < 9; i++) {
                Object[] objArr = f25498[i];
                if (str.equals(objArr[0])) {
                    return (Class) objArr[1];
                }
            }
            throw new ReflectException(str.concat(" <-不是基本的数据类型"));
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            return Void.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        switch (cCharAt) {
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
}
