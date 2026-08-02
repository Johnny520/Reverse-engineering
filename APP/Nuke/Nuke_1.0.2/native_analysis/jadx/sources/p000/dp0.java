package p000;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dp0 implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2138a;

    /* JADX INFO: renamed from: b */
    public final Object f2139b;

    public /* synthetic */ dp0(int i, Object obj) {
        this.f2138a = i;
        this.f2139b = obj;
    }

    /* JADX INFO: renamed from: a */
    public static void m1067a(Object obj, Object obj2) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Bundle bundle;
        Field declaredField = obj2.getClass().getDeclaredField("mIntent");
        declaredField.setAccessible(true);
        Intent intent = (Intent) declaredField.get(obj2);
        Log.d("ParasiticsUtils:", "handleMessage: target wrapper =" + intent);
        try {
            Field declaredField2 = Intent.class.getDeclaredField("mExtras");
            declaredField2.setAccessible(true);
            bundle = (Bundle) declaredField2.get(intent);
        } catch (Exception unused) {
            bundle = null;
        }
        if (bundle != null) {
            bundle.setClassLoader(AbstractC0079c5.f1154e);
            if (intent.hasExtra("miko_activity_proxy_intent")) {
                Intent intent2 = (Intent) intent.getParcelableExtra("miko_activity_proxy_intent");
                declaredField.set(obj2, intent2);
                if (Build.VERSION.SDK_INT >= 31) {
                    IBinder iBinder = (IBinder) obj.getClass().getMethod("getActivityToken", null).invoke(obj, null);
                    Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", null);
                    declaredMethod.setAccessible(true);
                    Object objInvoke = declaredMethod.invoke(null, null);
                    try {
                        Object objInvoke2 = objInvoke.getClass().getMethod("getLaunchingActivity", IBinder.class).invoke(objInvoke, iBinder);
                        if (objInvoke2 != null) {
                            Field declaredField3 = objInvoke2.getClass().getDeclaredField("intent");
                            declaredField3.setAccessible(true);
                            declaredField3.set(objInvoke2, intent2);
                        }
                    } catch (NoSuchMethodException e) {
                        if (Build.VERSION.SDK_INT != 33) {
                            throw e;
                        }
                    }
                }
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        int i = this.f2138a;
        Object obj2 = this.f2139b;
        switch (i) {
            case 0:
                ep0 ep0Var = (ep0) obj2;
                int i2 = message.what;
                if (i2 == 1) {
                    ep0Var.m1401b((cp0) message.obj);
                    return true;
                }
                if (i2 != 2) {
                    return false;
                }
                ep0Var.f2535d.m6048a((cp0) message.obj);
                return false;
            default:
                int i3 = message.what;
                Bundle bundle = null;
                try {
                    if (i3 == 100) {
                        Object obj3 = message.obj;
                        Field declaredField = obj3.getClass().getDeclaredField("intent");
                        declaredField.setAccessible(true);
                        Intent intent = (Intent) declaredField.get(obj3);
                        try {
                            Field declaredField2 = Intent.class.getDeclaredField("mExtras");
                            declaredField2.setAccessible(true);
                            bundle = (Bundle) declaredField2.get(intent);
                        } catch (Exception unused) {
                        }
                        if (bundle != null) {
                            bundle.setClassLoader(AbstractC0079c5.f1154e);
                            if (intent.hasExtra("miko_activity_proxy_intent")) {
                                declaredField.set(obj3, (Intent) intent.getParcelableExtra("miko_activity_proxy_intent"));
                            }
                        }
                    } else if (i3 == 159 && (obj = message.obj) != null) {
                        Method declaredMethod = Class.forName("android.app.servertransaction.ClientTransaction").getDeclaredMethod("getCallbacks", null);
                        declaredMethod.setAccessible(true);
                        List list = (List) declaredMethod.invoke(obj, null);
                        if (list != null || !list.isEmpty()) {
                            for (Object obj4 : list) {
                                if (obj4.getClass().getName().contains("LaunchActivityItem")) {
                                    m1067a(obj, obj4);
                                }
                            }
                        }
                    }
                } catch (Exception unused2) {
                }
                Handler.Callback callback = (Handler.Callback) obj2;
                return callback != null && callback.handleMessage(message);
        }
    }
}
