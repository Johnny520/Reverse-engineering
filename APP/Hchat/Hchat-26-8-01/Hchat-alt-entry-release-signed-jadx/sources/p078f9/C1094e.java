package p078f9;

import android.app.Activity;
import android.view.MenuItem;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p011ab.C0042b;
import p036c9.RunnableC0487t;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p136j8.AbstractC2091b;
import p222p.AbstractC3199a;
import p242q8.C3460o;
import p258r8.C3742g;
import p258r8.C3744i;

/* JADX INFO: renamed from: f9.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1094e {

    /* JADX INFO: renamed from: a */
    public final C3742g f3512a;

    /* JADX INFO: renamed from: b */
    public final C0042b f3513b;

    /* JADX INFO: renamed from: c */
    public final Set f3514c;

    /* JADX INFO: renamed from: d */
    public final Map f3515d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f3516e;

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap f3517f;

    /* JADX INFO: renamed from: g */
    public final ConcurrentHashMap f3518g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1094e(C3742g c3742g, C0042b c0042b) {
        c3742g.getClass();
        this.f3512a = c3742g;
        this.f3513b = c0042b;
        this.f3514c = AbstractC2091b.m5168o();
        this.f3515d = AbstractC3199a.m6843p();
        this.f3516e = new ConcurrentHashMap();
        this.f3517f = new ConcurrentHashMap();
        this.f3518g = new ConcurrentHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static MenuItem m2815a(Object obj) {
        Object objInvokeMethod = KavaReflector.invokeMethod(obj, "findItem", 1212368196);
        if (objInvokeMethod instanceof MenuItem) {
            return (MenuItem) objInvokeMethod;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m2816d(Activity activity, String str) {
        if (activity == null) {
            C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
            activity = c3460oCurrentActivity != null ? c3460oCurrentActivity.m7263a() : null;
        }
        if (activity != null) {
            activity.runOnUiThread(new RunnableC0487t(activity, str, 4));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m2817b(Method method, boolean z9) {
        C1093d c1093d = new C1093d(z9, this, 0);
        if (!Modifier.isAbstract(method.getModifiers()) && !method.getDeclaringClass().isInterface()) {
            Set set = this.f3514c;
            if (!set.add(method)) {
                return true;
            }
            try {
                C3744i.f12154b.m7763b(method, c1093d);
                return true;
            } catch (Throwable th2) {
                set.remove(method);
                this.f3513b.invoke("修改聊天记录Hook安装失败: " + method.getName(), th2);
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final long m2818c(Object obj) {
        Class<?> cls = obj.getClass();
        C1091b c1091b = new C1091b(obj, 0);
        ConcurrentHashMap concurrentHashMap = this.f3517f;
        Method method = (Method) concurrentHashMap.get(cls);
        Number number = null;
        if (method == null) {
            method = (Method) c1091b.invoke();
            if (method != null) {
                concurrentHashMap.putIfAbsent(cls, method);
            } else {
                method = null;
            }
        }
        int i9 = 0;
        if (method != null) {
            Object objInvoke = KavaReflector.invoke(method, obj, new Object[0]);
            Number number2 = objInvoke instanceof Number ? (Number) objInvoke : null;
            if (number2 != null) {
                return number2.longValue();
            }
        }
        String[] strArr = {"field_msgId", "msgId", "msgID"};
        while (true) {
            if (i9 >= 3) {
                break;
            }
            Object field = KavaReflector.readField(obj, strArr[i9]);
            if (field instanceof Number) {
                number = (Number) field;
                break;
            }
            i9++;
        }
        if (number != null) {
            return number.longValue();
        }
        return 0L;
    }
}
