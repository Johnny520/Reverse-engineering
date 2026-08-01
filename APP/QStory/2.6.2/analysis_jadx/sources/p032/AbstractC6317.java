package p032;

import java.lang.reflect.Field;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import lin.util.ReflectUtils.ReflectException;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世哲子苏楪兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final HashMap f17410 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Object m11829(Class cls, Class cls2, String str) {
        try {
            return m11834(cls, cls2, str).get(null);
        } catch (IllegalAccessException e) {
            C5919.m11252(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static Object m11830(Class cls, Object obj) {
        return m11833(obj.getClass(), cls).get(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Object m11831(Class cls, String str, Object obj) {
        try {
            return m11834(obj.getClass(), cls, str).get(obj);
        } catch (IllegalAccessException e) {
            C5919.m11252(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Field m11832(Class cls, String str) {
        String str2 = cls.getName() + " " + str;
        HashMap map = f17410;
        if (map.containsKey(str2)) {
            return (Field) map.get(str2);
        }
        while (cls != null) {
            for (Field field : cls.getDeclaredFields()) {
                if (field.getName().equals(str)) {
                    field.setAccessible(true);
                    map.put(str2, field);
                    return field;
                }
            }
            cls = cls.getSuperclass();
        }
        throw new ReflectException("查找不到未知类型但有字段名的字段 ".concat(str2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Field m11833(Class cls, Class cls2) {
        String str = cls.getName() + " type= " + cls2.getName();
        HashMap map = f17410;
        if (map.containsKey(str)) {
            return (Field) map.get(str);
        }
        while (cls != null) {
            for (Field field : cls.getDeclaredFields()) {
                if (field.getType() == cls2) {
                    field.setAccessible(true);
                    map.put(str, field);
                    return field;
                }
            }
            cls = cls.getSuperclass();
        }
        throw new ReflectException("查找不到唯一此类型的字段 : ".concat(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Field m11834(Class cls, Class cls2, String str) {
        if (cls2 == null) {
            return m11832(cls, str);
        }
        if (str == null) {
            return m11833(cls, cls2);
        }
        String str2 = cls.getName() + " " + cls2.getName() + " " + str;
        HashMap map = f17410;
        if (map.containsKey(str2)) {
            return (Field) map.get(str2);
        }
        while (cls != null) {
            for (Field field : cls.getDeclaredFields()) {
                if (field.getName().equals(str) && AbstractC4921.m9890(field.getType(), cls2)) {
                    field.setAccessible(true);
                    map.put(str2, field);
                    return field;
                }
            }
            cls = cls.getSuperclass();
        }
        throw new ReflectException("查找不到字段 : ".concat(str2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m11835(Object obj, String str, Class cls, Object obj2) {
        m11834(obj.getClass(), cls, str).set(obj, obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Object m11836(Object obj, String str) {
        return m11832(obj.getClass(), str).get(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m11837(Object obj, String str, Object obj2) {
        m11834(obj.getClass(), obj2.getClass(), str).set(obj, obj2);
    }
}
