package Yue;

import com.nmmedit.protect.NativeUtil;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4806 {
    static {
        NativeUtil.classesInit0(92);
    }

    /* JADX INFO: renamed from: ۥ */
    public static native List<Field> m1710(Class<?> cls, Class<?> cls2, int i);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native Object m1711(Object obj, Class<?> cls);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native List<Field> m14541(Class<?> cls, Class<?> cls2);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native List<Field> m14542(Class<?> cls, Class<?> cls2);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Object m14543(Object obj, Class<?> cls, HashSet<Object> hashSet) {
        Object objM14543;
        if (obj == null || hashSet.contains(obj)) {
            return null;
        }
        hashSet.add(obj);
        Class<?> cls2 = obj.getClass();
        if (cls.isAssignableFrom(cls2)) {
            return obj;
        }
        try {
            C3270.m6707();
            Iterator<Field> it = m1710(cls2, null, 1).iterator();
            while (it.hasNext()) {
                Object objectField = XposedHelpers.getObjectField(obj, it.next().getName());
                if (objectField != null && (objM14543 = m14543(objectField, cls, hashSet)) != null) {
                    return objM14543;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native Object m14544(Field field, Object obj) throws IllegalAccessException;
}
