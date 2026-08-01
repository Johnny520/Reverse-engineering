package p010B3;

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
import p142c2.C1894e;
import p142c2.C1896g;

/* JADX INFO: renamed from: B3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0226e implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f778a;

    /* JADX INFO: renamed from: b */
    public final Object f779b;

    public /* synthetic */ C0226e(int i5, Object obj) {
        this.f778a = i5;
        this.f779b = obj;
    }

    /* JADX INFO: renamed from: a */
    public static void m328a(Object obj, Object obj2) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
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
            bundle.setClassLoader(AbstractC0222a.f774f);
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
                    } catch (NoSuchMethodException e5) {
                        if (Build.VERSION.SDK_INT != 33) {
                            throw e5;
                        }
                    }
                }
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        int i5 = this.f778a;
        Object obj2 = this.f779b;
        switch (i5) {
            case 0:
                int i6 = message.what;
                Bundle bundle = null;
                try {
                    if (i6 == 100) {
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
                            bundle.setClassLoader(AbstractC0222a.f774f);
                            if (intent.hasExtra("miko_activity_proxy_intent")) {
                                declaredField.set(obj3, (Intent) intent.getParcelableExtra("miko_activity_proxy_intent"));
                            }
                        }
                    } else if (i6 == 159 && (obj = message.obj) != null) {
                        Method declaredMethod = Class.forName("android.app.servertransaction.ClientTransaction").getDeclaredMethod("getCallbacks", null);
                        declaredMethod.setAccessible(true);
                        List list = (List) declaredMethod.invoke(obj, null);
                        if (list != null || !list.isEmpty()) {
                            for (Object obj4 : list) {
                                if (obj4.getClass().getName().contains("LaunchActivityItem")) {
                                    m328a(obj, obj4);
                                }
                            }
                        }
                    }
                } catch (Exception unused2) {
                }
                Handler.Callback callback = (Handler.Callback) obj2;
                return callback != null && callback.handleMessage(message);
            default:
                C1896g c1896g = (C1896g) obj2;
                int i7 = message.what;
                if (i7 == 1) {
                    c1896g.m3386b((C1894e) message.obj);
                    return true;
                }
                if (i7 != 2) {
                    return false;
                }
                c1896g.f6447d.m3613a((C1894e) message.obj);
                return false;
        }
    }
}
