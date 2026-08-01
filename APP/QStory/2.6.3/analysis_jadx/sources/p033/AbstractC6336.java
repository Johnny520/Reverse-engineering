package p033;

import androidx.window.area.AbstractC2567;
import java.lang.reflect.Field;
import java.util.HashMap;
import lin.util.ReflectUtils.ReflectException;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世哲子苏楪兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6336 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final HashMap f17459 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Object m11857(Class cls, Class cls2, String str) {
        try {
            return m11862(cls, cls2, str).get(null);
        } catch (IllegalAccessException e) {
            C5925.m11313(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static Object m11858(Class cls, Object obj) {
        return m11861(obj.getClass(), cls).get(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Object m11859(Class cls, String str, Object obj) {
        try {
            return m11862(obj.getClass(), cls, str).get(obj);
        } catch (IllegalAccessException e) {
            C5925.m11313(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Field m11860(Class cls, String str) {
        String str2 = cls.getName() + " " + str;
        HashMap map = f17459;
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
    public static Field m11861(Class cls, Class cls2) {
        String str = cls.getName() + " type= " + cls2.getName();
        HashMap map = f17459;
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
    public static Field m11862(Class cls, Class cls2, String str) {
        if (cls2 == null) {
            return m11860(cls, str);
        }
        if (str == null) {
            return m11861(cls, cls2);
        }
        String str2 = cls.getName() + " " + cls2.getName() + " " + str;
        HashMap map = f17459;
        if (map.containsKey(str2)) {
            return (Field) map.get(str2);
        }
        while (cls != null) {
            for (Field field : cls.getDeclaredFields()) {
                if (field.getName().equals(str) && AbstractC2567.m5076(field.getType(), cls2)) {
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
    public static void m11863(Object obj, String str, Class cls, Object obj2) {
        m11862(obj.getClass(), cls, str).set(obj, obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Object m11864(Object obj, String str) {
        return m11860(obj.getClass(), str).get(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m11865(Object obj, String str, Object obj2) {
        m11862(obj.getClass(), obj2.getClass(), str).set(obj, obj2);
    }
}
