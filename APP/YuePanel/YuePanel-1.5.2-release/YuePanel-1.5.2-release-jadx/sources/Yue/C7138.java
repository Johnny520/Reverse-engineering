package Yue;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥۡۦۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7138 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f2700 = "ResourcesFlusher";

    /* JADX INFO: renamed from: ۥ۟ */
    public static Field f2701;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean f21511;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Class<?> f21512;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean f21513;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Field f21514;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean f21515;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static Field f21516;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean f21517;

    /* JADX INFO: renamed from: ۥ */
    public static void m3425(@InterfaceC6391 Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        m22289(resources);
    }

    @InterfaceC7113(21)
    /* JADX INFO: renamed from: ۥ۟ */
    public static void m3426(@InterfaceC6391 Resources resources) {
        Map map;
        if (!f21511) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f2701 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(f2700, "Could not retrieve Resources#mDrawableCache field", e);
            }
            f21511 = true;
        }
        Field field = f2701;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(f2700, "Could not retrieve value from Resources#mDrawableCache", e2);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    @InterfaceC7113(23)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m22288(@InterfaceC6391 Resources resources) {
        Object obj;
        if (!f21511) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f2701 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(f2700, "Could not retrieve Resources#mDrawableCache field", e);
            }
            f21511 = true;
        }
        Field field = f2701;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(f2700, "Could not retrieve value from Resources#mDrawableCache", e2);
                obj = null;
            }
        } else {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        m22290(obj);
    }

    @InterfaceC7113(24)
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m22289(@InterfaceC6391 Resources resources) {
        Object obj;
        if (!f21517) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f21516 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(f2700, "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f21517 = true;
        }
        Field field = f21516;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e2) {
            Log.e(f2700, "Could not retrieve value from Resources#mResourcesImpl", e2);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f21511) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f2701 = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e(f2700, "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
            }
            f21511 = true;
        }
        Field field2 = f2701;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e4) {
                Log.e(f2700, "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
            }
        }
        if (obj2 != null) {
            m22290(obj2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m22290(@InterfaceC6391 Object obj) {
        LongSparseArray longSparseArray;
        if (!f21513) {
            try {
                f21512 = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e(f2700, "Could not find ThemedResourceCache class", e);
            }
            f21513 = true;
        }
        Class<?> cls = f21512;
        if (cls == null) {
            return;
        }
        if (!f21515) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f21514 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e(f2700, "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f21515 = true;
        }
        Field field = f21514;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e(f2700, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
