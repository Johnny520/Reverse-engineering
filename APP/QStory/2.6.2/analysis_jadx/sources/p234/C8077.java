package p234;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import com.alibaba.fastjson2.C2941;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p124.C7412;
import p381.AbstractC8996;
import p392.AbstractC9121;

/* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8077 implements Handler.Callback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f22268;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22269;

    public /* synthetic */ C8077(Object obj, int i) {
        this.f22269 = i;
        this.f22268 = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m13529(Object obj, Object obj2) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
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
            bundle.setClassLoader(AbstractC9121.f25497);
            String str = AbstractC8996.f25283;
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
        switch (this.f22269) {
            case 0:
                C8083 c8083 = (C8083) this.f22268;
                int i = message.what;
                if (i == 1) {
                    c8083.m13535((C8078) message.obj);
                    return true;
                }
                if (i == 2) {
                    c8083.f22296.m6750((C8078) message.obj);
                }
                return false;
            case 1:
                if (message.what == 0) {
                    C7412 c7412 = (C7412) this.f22268;
                    if (message.obj == null) {
                        synchronized (c7412.f20104) {
                            throw null;
                        }
                    }
                    C2941.m6336();
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
                            bundle.setClassLoader(AbstractC9121.f25497);
                            String str = AbstractC8996.f25283;
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
                                    m13529(obj, obj3);
                                }
                            }
                        }
                    }
                } catch (Exception unused2) {
                }
                Handler.Callback callback = (Handler.Callback) this.f22268;
                return callback != null && callback.handleMessage(message);
        }
    }
}
