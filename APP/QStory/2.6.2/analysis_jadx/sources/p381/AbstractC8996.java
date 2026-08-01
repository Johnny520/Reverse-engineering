package p381;

import android.os.Handler;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.concurrent.atomic.AtomicBoolean;
import p234.C8077;
import p373.C8973;
import p392.AbstractC9121;
import top.sacz.xphelper.activity.BaseActivity;
import top.sacz.xphelper.activity.BaseComposeActivity;

/* JADX INFO: renamed from: 飘花落叶言苏楪世兰子哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8996 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String f25284;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AtomicBoolean f25285 = new AtomicBoolean();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f25283 = "lin_proxy_intent";

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m14585() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException {
        Field declaredField;
        Field declaredField2 = Class.forName("android.app.ActivityTaskManager").getDeclaredField("IActivityTaskManagerSingleton");
        declaredField2.setAccessible(true);
        Object obj = declaredField2.get(null);
        try {
            try {
                declaredField = Class.forName("android.app.ActivityManagerNative").getDeclaredField("gDefault");
            } catch (Exception unused) {
                return;
            }
        } catch (Exception unused2) {
            declaredField = Class.forName("android.app.ActivityManager").getDeclaredField("IActivityManagerSingleton");
        }
        declaredField.setAccessible(true);
        declaredField.get(null);
        Class<?> cls = Class.forName("android.util.Singleton");
        Field declaredField3 = cls.getDeclaredField("mInstance");
        declaredField3.setAccessible(true);
        cls.getMethod("get", null).invoke(obj, null);
        Object obj2 = declaredField3.get(obj);
        Object[][] objArr = AbstractC9121.f25498;
        declaredField3.set(obj, Proxy.newProxyInstance(AbstractC9121.class.getClassLoader(), new Class[]{Class.forName("android.app.IActivityTaskManager")}, new C8973(obj2, 1)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m14586() throws IllegalAccessException, NoSuchFieldException {
        Field declaredField;
        try {
            try {
                declaredField = Class.forName("android.app.ActivityManagerNative").getDeclaredField("gDefault");
            } catch (Exception unused) {
                declaredField = Class.forName("android.app.ActivityManager").getDeclaredField("IActivityManagerSingleton");
            }
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Field declaredField2 = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            Object[][] objArr = AbstractC9121.f25498;
            declaredField2.set(obj, Proxy.newProxyInstance(AbstractC9121.class.getClassLoader(), new Class[]{Class.forName("android.app.IActivityManager")}, new C8973(obj2, 1)));
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m14587(Object obj) throws IllegalAccessException, NoSuchFieldException {
        Field declaredField = obj.getClass().getDeclaredField("mH");
        declaredField.setAccessible(true);
        Handler handler = (Handler) declaredField.get(obj);
        Field declaredField2 = Class.forName("android.os.Handler").getDeclaredField("mCallback");
        declaredField2.setAccessible(true);
        declaredField2.set(handler, new C8077((Handler.Callback) declaredField2.get(handler), 2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m14588(String str) {
        try {
            Object[][] objArr = AbstractC9121.f25498;
            if (BaseActivity.class.isAssignableFrom(AbstractC9121.class.getClassLoader().loadClass(str))) {
                return true;
            }
            return BaseComposeActivity.class.isAssignableFrom(AbstractC9121.class.getClassLoader().loadClass(str));
        } catch (Exception unused) {
            return false;
        }
    }
}
