package p000;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: w4 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0513w4 {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f995a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public static final Set f996b = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Field m1118a(Class cls, String str) {
        if (str != null) {
            String str2 = cls.getName() + "#" + str;
            ConcurrentHashMap concurrentHashMap = f995a;
            Field field = (Field) concurrentHashMap.get(str2);
            if (field != null) {
                return field;
            }
            Set set = f996b;
            if (!set.contains(str2)) {
                while (cls != null) {
                    try {
                        Field declaredField = cls.getDeclaredField(str);
                        declaredField.setAccessible(true);
                        concurrentHashMap.put(str2, declaredField);
                        return declaredField;
                    } catch (NoSuchFieldException unused) {
                        cls = cls.getSuperclass();
                    }
                }
                set.add(str2);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static Object m1119b(Object obj, String str) {
        if (obj == null) {
            return null;
        }
        try {
            Field fieldM1118a = m1118a(obj.getClass(), str);
            if (fieldM1118a == null) {
                return null;
            }
            fieldM1118a.setAccessible(true);
            return fieldM1118a.get(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static int m1120c(Object obj, String str, int i) {
        Object objM1119b = m1119b(obj, str);
        return objM1119b instanceof Number ? ((Number) objM1119b).intValue() : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m1121d(Object obj, String str, Object obj2) {
        if (obj == null) {
            return;
        }
        try {
            Field fieldM1118a = m1118a(obj.getClass(), str);
            if (fieldM1118a == null) {
                return;
            }
            fieldM1118a.setAccessible(true);
            Class<?> type = fieldM1118a.getType();
            if (type == Integer.TYPE) {
                fieldM1118a.setInt(obj, obj2 instanceof Number ? ((Number) obj2).intValue() : 0);
                return;
            }
            if (type == Long.TYPE) {
                fieldM1118a.setLong(obj, obj2 instanceof Number ? ((Number) obj2).longValue() : 0L);
                return;
            }
            if (type == Boolean.TYPE) {
                fieldM1118a.setBoolean(obj, (obj2 instanceof Boolean) && ((Boolean) obj2).booleanValue());
            } else {
                if (obj2 == null && type.isPrimitive()) {
                    return;
                }
                fieldM1118a.set(obj, obj2);
            }
        } catch (Throwable unused) {
        }
    }
}
