package Yue;

import Yue.InterfaceC7144;
import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
public final class C3109 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f76 = "ActivityRecreator";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final Class<?> f77;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Field f4621;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Field f4622;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Method f4623;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Method f4624;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final Method f4625;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final Handler f4626 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۨ$ۥ */
    public class RunnableC0052 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C3111 f4627;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Object f4628;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public RunnableC0052(C3111 c3111, Object obj) {
            this.f4627 = c3111;
            this.f4628 = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4627.f78 = this.f4628;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۨ$ۥ۟ */
    public class RunnableC0053 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Application f4629;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C3111 f4630;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public RunnableC0053(Application application, C3111 c3111) {
            this.f4629 = application;
            this.f4630 = c3111;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4629.unregisterActivityLifecycleCallbacks(this.f4630);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۨ$ۥ۟۟, reason: contains not printable characters */
    public class RunnableC3110 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Object f4631;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Object f4632;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public RunnableC3110(Object obj, Object obj2) {
            this.f4631 = obj;
            this.f4632 = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = C3109.f4623;
                if (method != null) {
                    method.invoke(this.f4631, this.f4632, Boolean.FALSE, "AppCompat recreation");
                } else {
                    C3109.f4624.invoke(this.f4631, this.f4632, Boolean.FALSE);
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e(C3109.f76, "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۨ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C3111 implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: ۥ */
        public Object f78;

        /* JADX INFO: renamed from: ۥ۟ */
        public Activity f79;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int f4633;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f4634 = false;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean f4635 = false;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean f4636 = false;

        public C3111(@InterfaceC6391 Activity activity) {
            this.f79 = activity;
            this.f4633 = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f79 == activity) {
                this.f79 = null;
                this.f4635 = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f4635 || this.f4636 || this.f4634 || !C3109.m6348(this.f78, this.f4633, activity)) {
                return;
            }
            this.f4636 = true;
            this.f78 = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f79 == activity) {
                this.f4634 = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> clsM209 = m209();
        f77 = clsM209;
        f4621 = m210();
        f4622 = m6346();
        f4623 = m6344(clsM209);
        f4624 = m6343(clsM209);
        f4625 = m6345(clsM209);
    }

    /* JADX INFO: renamed from: ۥ */
    public static Class<?> m209() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static Field m210() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Method m6343(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Method m6344(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Method m6345(Class<?> cls) {
        if (m6347() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Field m6346() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean m6347() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m6348(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f4622.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                f4626.postAtFrontOfQueue(new RunnableC3110(f4621.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e(f76, "Exception while fetching field values", th);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m6349(@InterfaceC6391 Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (m6347() && f4625 == null) {
            return false;
        }
        if (f4624 == null && f4623 == null) {
            return false;
        }
        try {
            Object obj2 = f4622.get(activity);
            if (obj2 == null || (obj = f4621.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C3111 c3111 = new C3111(activity);
            application.registerActivityLifecycleCallbacks(c3111);
            Handler handler = f4626;
            handler.post(new RunnableC0052(c3111, obj2));
            try {
                if (m6347()) {
                    Method method = f4625;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new RunnableC0053(application, c3111));
                return true;
            } catch (Throwable th) {
                f4626.post(new RunnableC0053(application, c3111));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
