package p049;

import androidx.window.area.AbstractC3400;
import java.lang.reflect.Field;
import java.util.HashMap;
import lin.util.ReflectUtils.ReflectException;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世哲子苏楪兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7165 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final HashMap f17804 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Object m12416(Class cls, Class cls2, String str) {
        try {
            return m12421(cls, cls2, str).get(null);
        } catch (IllegalAccessException e) {
            C6755.m11872(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static Object m12417(Class cls, Object obj) {
        return m12420(obj.getClass(), cls).get(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Object m12418(Class cls, String str, Object obj) {
        try {
            return m12421(obj.getClass(), cls, str).get(obj);
        } catch (IllegalAccessException e) {
            C6755.m11872(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Field m12419(Class cls, String str) {
        String str2 = cls.getName() + " " + str;
        HashMap map = f17804;
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
    public static Field m12420(Class cls, Class cls2) {
        String str = cls.getName() + " type= " + cls2.getName();
        HashMap map = f17804;
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
    public static Field m12421(Class cls, Class cls2, String str) {
        if (cls2 == null) {
            return m12419(cls, str);
        }
        if (str == null) {
            return m12420(cls, cls2);
        }
        String str2 = cls.getName() + " " + cls2.getName() + " " + str;
        HashMap map = f17804;
        if (map.containsKey(str2)) {
            return (Field) map.get(str2);
        }
        while (cls != null) {
            for (Field field : cls.getDeclaredFields()) {
                if (field.getName().equals(str) && AbstractC3400.m5636(field.getType(), cls2)) {
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
    public static void m12422(Object obj, String str, Class cls, Object obj2) {
        m12421(obj.getClass(), cls, str).set(obj, obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Object m12423(Object obj, String str) {
        return m12419(obj.getClass(), str).get(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m12424(Object obj, String str, Object obj2) {
        m12421(obj.getClass(), obj2.getClass(), str).set(obj, obj2);
    }
}
