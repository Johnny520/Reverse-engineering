package p250;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import com.alibaba.fastjson2.C3775;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p140.C8242;
import p398.AbstractC9831;
import p405.AbstractC9919;

/* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8907 implements Handler.Callback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f22611;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22612;

    public /* synthetic */ C8907(Object obj, int i) {
        this.f22612 = i;
        this.f22611 = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14117(Object obj, Object obj2) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
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
            bundle.setClassLoader(AbstractC9919.f25822);
            String str = AbstractC9831.f25622;
            if (intent.hasExtra(str)) {
                Intent intent2 = (Intent) intent.getParcelableExtra(str);
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
        Bundle bundle = null;
        switch (this.f22612) {
            case 0:
                C8913 c8913 = (C8913) this.f22611;
                int i = message.what;
                if (i == 1) {
                    c8913.m14123((C8908) message.obj);
                    return true;
                }
                if (i == 2) {
                    c8913.f22639.m7355((C8908) message.obj);
                }
                return false;
            case 1:
                if (message.what == 0) {
                    C8242 c8242 = (C8242) this.f22611;
                    if (message.obj == null) {
                        synchronized (c8242.f20444) {
                            throw null;
                        }
                    }
                    C3775.m6954();
                }
                return false;
            default:
                int i2 = message.what;
                try {
                    if (i2 == 100) {
                        Object obj2 = message.obj;
                        Field declaredField = obj2.getClass().getDeclaredField("intent");
                        declaredField.setAccessible(true);
                        Intent intent = (Intent) declaredField.get(obj2);
                        try {
                            Field declaredField2 = Intent.class.getDeclaredField("mExtras");
                            declaredField2.setAccessible(true);
                            bundle = (Bundle) declaredField2.get(intent);
                        } catch (Exception unused) {
                        }
                        if (bundle != null) {
                            bundle.setClassLoader(AbstractC9919.f25822);
                            String str = AbstractC9831.f25622;
                            if (intent.hasExtra(str)) {
                                declaredField.set(obj2, (Intent) intent.getParcelableExtra(str));
                            }
                        }
                    } else if (i2 == 159 && (obj = message.obj) != null) {
                        Method declaredMethod = Class.forName("android.app.servertransaction.ClientTransaction").getDeclaredMethod("getCallbacks", null);
                        declaredMethod.setAccessible(true);
                        List list = (List) declaredMethod.invoke(obj, null);
                        if (list != null || !list.isEmpty()) {
                            for (Object obj3 : list) {
                                if (obj3.getClass().getName().contains("LaunchActivityItem")) {
                                    m14117(obj, obj3);
                                }
                            }
                        }
                    }
                } catch (Exception unused2) {
                }
                Handler.Callback callback = (Handler.Callback) this.f22611;
                return callback != null && callback.handleMessage(message);
        }
    }
}
