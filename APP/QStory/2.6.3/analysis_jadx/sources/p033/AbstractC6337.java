package p033;

import bsh.C2633;
import lin.util.ReflectUtils.ReflectException;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世哲子苏楪兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6337 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C6338 f17460;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static ClassLoader f17461;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object[][] f17462 = {new Object[]{"int", Integer.TYPE}, new Object[]{"boolean", Boolean.TYPE}, new Object[]{"byte", Byte.TYPE}, new Object[]{"long", Long.TYPE}, new Object[]{"char", Character.TYPE}, new Object[]{"double", Double.TYPE}, new Object[]{"float", Float.TYPE}, new Object[]{"short", Short.TYPE}, new Object[]{"void", Void.TYPE}};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Class m11866(String str) {
        try {
            return f17460.loadClass(str);
        } catch (Throwable th) {
            C5925.m11313(th);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Class m11867(String str) {
        if (str.length() != 1) {
            for (int i = 0; i < 9; i++) {
                Object[] objArr = f17462[i];
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
                C2633.m5339("Not an underlying type");
                return null;
        }
    }
}
