package p109hb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import p011ab.C0042b;
import p036c9.C0442h;
import p036c9.RunnableC0474p;
import p036c9.RunnableC0487t;
import p036c9.ThreadFactoryC0478q;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p136j8.AbstractC2091b;
import p242q8.C3460o;
import p258r8.C3742g;
import p258r8.C3744i;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import p332wb.C5491y2;

/* JADX INFO: renamed from: hb.i0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1684i0 {

    /* JADX INFO: renamed from: a */
    public final C3742g f5582a;

    /* JADX INFO: renamed from: b */
    public final C0042b f5583b;

    /* JADX INFO: renamed from: c */
    public final Handler f5584c;

    /* JADX INFO: renamed from: d */
    public final SharedPreferences f5585d;

    /* JADX INFO: renamed from: e */
    public final Set f5586e;

    /* JADX INFO: renamed from: f */
    public final SharedPreferences f5587f;

    /* JADX INFO: renamed from: g */
    public final C1695r f5588g;

    /* JADX INFO: renamed from: h */
    public final C1671c f5589h;

    /* JADX INFO: renamed from: i */
    public final C1687k f5590i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1684i0(C3742g c3742g, C0042b c0042b) {
        c3742g.getClass();
        this.f5582a = c3742g;
        this.f5583b = c0042b;
        this.f5584c = new Handler(Looper.getMainLooper());
        Context context = c3742g.f12143a;
        this.f5585d = AbstractC4302b.m8640c(context, "Hchat_selected_messages_config");
        this.f5586e = AbstractC2091b.m5168o();
        this.f5587f = AbstractC4302b.m8640c(context, "Hchat_selected_message_method_cache");
        this.f5588g = new C1695r(c3742g, c0042b);
        C1671c c1671c = new C1671c();
        c1671c.f5520g = c0042b;
        c1671c.f5521h = new Handler(Looper.getMainLooper());
        c1671c.f5522i = Executors.newSingleThreadExecutor(new ThreadFactoryC0478q(15));
        c1671c.f5523j = new ConcurrentHashMap();
        this.f5589h = c1671c;
        this.f5590i = new C1687k(c3742g, c0042b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m4284a(Object obj, String str, int i9) {
        if (KavaReflector.invokeMethod(obj, "findItem", Integer.valueOf(i9)) == null && KavaReflector.invokeMethod(obj, "add", 0, Integer.valueOf(i9), 0, str) == null && KavaReflector.invokeMethod(obj, "add", 0, Integer.valueOf(i9), 0, str) == null && KavaReflector.invokeMethod(obj, "f", Integer.valueOf(i9), str) == null) {
            KavaReflector.invokeMethod(obj, "f", Integer.valueOf(i9), str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m4285c(Method method) {
        return method.getDeclaringClass().getName().equals("com.tencent.mm.ui.transmit.MsgRetransmitUI") && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m4286b(Method method, XC_MethodHook xC_MethodHook) {
        Object c3959f;
        Set set = this.f5586e;
        if (!set.add(method)) {
            return true;
        }
        try {
            C3744i c3744i = C3744i.f12154b;
            Method methodAccessible = KavaReflector.accessible(method);
            if (methodAccessible == null) {
                methodAccessible = method;
            }
            c3744i.m7763b(methodAccessible, xC_MethodHook);
            c3959f = Boolean.TRUE;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            set.remove(method);
            this.f5583b.invoke("群发助手Hook安装失败: " + method.toGenericString(), thM8182b);
        }
        Boolean bool = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
            c3959f = bool;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m4287d(Activity activity, InterfaceC1231l interfaceC1231l, String str, String str2, boolean z9) {
        C1701x c1701x = new C1701x(activity, this, interfaceC1231l, str, str2, z9);
        C1689l c1689l = C1690m.f5615a;
        List listM4307a = C1690m.m4307a(z9);
        if (listM4307a != null) {
            c1701x.invoke(listM4307a);
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        new Thread(new RunnableC0474p(this, z9, atomicBoolean, atomicBoolean2, C5491y2.m9813X1(activity, new C0442h(atomicBoolean2, atomicBoolean, 4), str, "正在载入联系人..."), activity, c1701x, 2), "Hchat-SelectedMessageContacts").start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x000e  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4288e(Activity activity, String str) {
        Activity activity2 = null;
        if (activity == null) {
            C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
            Activity activityM7263a = c3460oCurrentActivity != null ? c3460oCurrentActivity.m7263a() : null;
            if (activityM7263a == null) {
                activityM7263a = null;
            }
            if (activityM7263a != null && !activityM7263a.isFinishing()) {
                activity2 = activityM7263a;
            }
            if (activity2 == null) {
                return;
            } else {
                activity = activity2;
            }
        } else {
            if (activity.isFinishing()) {
                activity = null;
            }
            if (activity == null) {
            }
        }
        this.f5584c.post(new RunnableC0487t(activity, str, 6));
    }
}
