package p398;

import android.os.Handler;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.concurrent.atomic.AtomicBoolean;
import p250.C8907;
import p372.C9728;
import p405.AbstractC9919;
import top.sacz.xphelper.activity.BaseActivity;
import top.sacz.xphelper.activity.BaseComposeActivity;

/* JADX INFO: renamed from: 飘花落叶言苏楪世哲兰子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9831 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String f25623;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AtomicBoolean f25624 = new AtomicBoolean();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f25622 = "lin_proxy_intent";

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m15168() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException {
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
        Object[][] objArr = AbstractC9919.f25823;
        declaredField3.set(obj, Proxy.newProxyInstance(AbstractC9919.class.getClassLoader(), new Class[]{Class.forName("android.app.IActivityTaskManager")}, new C9728(obj2, 1)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m15169() throws IllegalAccessException, NoSuchFieldException {
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
            Object[][] objArr = AbstractC9919.f25823;
            declaredField2.set(obj, Proxy.newProxyInstance(AbstractC9919.class.getClassLoader(), new Class[]{Class.forName("android.app.IActivityManager")}, new C9728(obj2, 1)));
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m15170(Object obj) throws IllegalAccessException, NoSuchFieldException {
        Field declaredField = obj.getClass().getDeclaredField("mH");
        declaredField.setAccessible(true);
        Handler handler = (Handler) declaredField.get(obj);
        Field declaredField2 = Class.forName("android.os.Handler").getDeclaredField("mCallback");
        declaredField2.setAccessible(true);
        declaredField2.set(handler, new C8907((Handler.Callback) declaredField2.get(handler), 2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m15171(String str) {
        try {
            Object[][] objArr = AbstractC9919.f25823;
            if (BaseActivity.class.isAssignableFrom(AbstractC9919.class.getClassLoader().loadClass(str))) {
                return true;
            }
            return BaseComposeActivity.class.isAssignableFrom(AbstractC9919.class.getClassLoader().loadClass(str));
        } catch (Exception unused) {
            return false;
        }
    }
}
