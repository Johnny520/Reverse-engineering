package p032;

import bsh.C2632;
import lin.util.ReflectUtils.ReflectException;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世哲子苏楪兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C6319 f17411;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static ClassLoader f17412;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object[][] f17413 = {new Object[]{"int", Integer.TYPE}, new Object[]{"boolean", Boolean.TYPE}, new Object[]{"byte", Byte.TYPE}, new Object[]{"long", Long.TYPE}, new Object[]{"char", Character.TYPE}, new Object[]{"double", Double.TYPE}, new Object[]{"float", Float.TYPE}, new Object[]{"short", Short.TYPE}, new Object[]{"void", Void.TYPE}};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Class m11838(String str) {
        try {
            return f17411.loadClass(str);
        } catch (Throwable th) {
            C5919.m11252(th);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Class m11839(String str) {
        if (str.length() != 1) {
            for (int i = 0; i < 9; i++) {
                Object[] objArr = f17413[i];
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
