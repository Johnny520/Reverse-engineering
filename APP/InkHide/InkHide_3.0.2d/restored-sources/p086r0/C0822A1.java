package p086r0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import androidx.activity.AbstractActivityC0376g;
import com.p055lu.wxmask.MainHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0039l;
import p001A0.C0021V;
import p001A0.C0026a;
import p001A0.C0035h;
import p001A0.C0048u;
import p001A0.C0052y;
import p003B0.AbstractC0056b;
import p005C0.C0070d;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p009E0.C0109i;
import p011F0.AbstractC0120h;
import p011F0.C0131s;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p062e0.InterfaceC0551a;
import p069i.C0709q1;
import p070i0.AbstractC0731a;
import p088s0.C0976J;
import p090t0.C1010e;
import p102z0.AbstractC1135r;

/* JADX INFO: renamed from: r0.A1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0822A1 implements InterfaceC0551a {

    /* JADX INFO: renamed from: a */
    public WeakReference f2740a;

    /* JADX INFO: renamed from: b */
    public C0021V f2741b;

    /* JADX INFO: renamed from: c */
    public final Handler f2742c = new Handler(Looper.getMainLooper());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m1497a(Activity activity, Object obj, EditText editText) {
        Window window;
        View decorView;
        View viewFindViewById;
        Object c0104d;
        boolean zBooleanValue;
        Object c0104d2;
        if (AbstractC1135r.m2498t()) {
            editText.clearFocus();
            if (m1498b(activity)) {
                return;
            }
        }
        int iM103a = AbstractC0056b.m103a("b5i");
        boolean z2 = false;
        if (iM103a > 0 && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewFindViewById = decorView.findViewById(iM103a)) != null && viewFindViewById.isShown() && viewFindViewById.isEnabled()) {
            try {
                viewFindViewById.performClick();
                AbstractC0731a.m1384a("search command back button clicked", activity.getClass().getName(), "b5i");
                c0104d = Boolean.TRUE;
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Object obj2 = Boolean.FALSE;
            if (c0104d instanceof C0104d) {
                c0104d = obj2;
            }
            zBooleanValue = ((Boolean) c0104d).booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (zBooleanValue) {
            return;
        }
        Class<?> cls = obj.getClass();
        ArrayList arrayList = new ArrayList();
        for (Class<?> superclass = cls; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            try {
                Method[] declaredMethods = superclass.getDeclaredMethods();
                AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                c0104d2 = AbstractC0120h.m262j0(declaredMethods);
            } catch (Throwable th2) {
                c0104d2 = new C0104d(th2);
            }
            Object obj3 = C0131s.f426a;
            if (c0104d2 instanceof C0104d) {
                c0104d2 = obj3;
            }
            arrayList.addAll((Collection) c0104d2);
        }
        Iterator it = AbstractC0120h.m252Z(new String[]{"cancelSearch", "clearSearch", "closeSearch", "hideSearch", "collapse", "onCancel", "onBack"}).iterator();
        while (true) {
            Object obj4 = null;
            if (it.hasNext()) {
                String str = (String) it.next();
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    Method method = (Method) next;
                    if (AbstractC0223g.m414a(method.getName(), str)) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0) {
                            obj4 = next;
                            break;
                        }
                    }
                }
                Method method2 = (Method) obj4;
                if (method2 != null && m1499c(obj, method2)) {
                    break;
                }
            } else {
                for (Object obj5 : arrayList) {
                    Method method3 = (Method) obj5;
                    Class<?>[] parameterTypes2 = method3.getParameterTypes();
                    AbstractC0223g.m417d(parameterTypes2, "getParameterTypes(...)");
                    if (parameterTypes2.length == 0 && AbstractC0223g.m414a(method3.getReturnType(), Void.TYPE)) {
                        String name = method3.getName();
                        AbstractC0223g.m417d(name, "getName(...)");
                        if (!AbstractC0299i.m511i0(name, "cancel", true)) {
                            String name2 = method3.getName();
                            AbstractC0223g.m417d(name2, "getName(...)");
                            if (!AbstractC0299i.m511i0(name2, "close", true)) {
                                String name3 = method3.getName();
                                AbstractC0223g.m417d(name3, "getName(...)");
                                if (!AbstractC0299i.m511i0(name3, "hide", true)) {
                                    String name4 = method3.getName();
                                    AbstractC0223g.m417d(name4, "getName(...)");
                                    if (AbstractC0299i.m511i0(name4, "back", true)) {
                                    }
                                }
                            }
                        }
                        obj4 = obj5;
                        break;
                    }
                }
                Method method4 = (Method) obj4;
                if (method4 != null && m1499c(obj, method4)) {
                    break;
                }
            }
        }
        z2 = true;
        if (z2) {
            return;
        }
        if (((obj instanceof View) && ((View) obj).performClick()) || m1498b(activity)) {
            return;
        }
        editText.clearFocus();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m1498b(Activity activity) {
        Object c0104d;
        try {
            if (activity instanceof AbstractActivityC0376g) {
                ((AbstractActivityC0376g) activity).f898i.m642b();
            } else {
                activity.onBackPressed();
            }
            AbstractC0731a.m1384a("search command activity back dispatched", activity.getClass().getName());
            c0104d = Boolean.TRUE;
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Object obj = Boolean.FALSE;
        if (c0104d instanceof C0104d) {
            c0104d = obj;
        }
        return ((Boolean) c0104d).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m1499c(Object obj, Method method) {
        Object c0104d;
        try {
            method.setAccessible(true);
            method.invoke(obj, null);
            AbstractC0731a.m1384a("search command close search invoked", obj.getClass().getName(), method.getName());
            c0104d = Boolean.TRUE;
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Object obj2 = Boolean.FALSE;
        if (c0104d instanceof C0104d) {
            c0104d = obj2;
        }
        return ((Boolean) c0104d).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static EditText m1500e(Object obj, Field field) {
        Object c0104d;
        try {
            field.setAccessible(true);
            Object obj2 = field.get(obj);
            c0104d = obj2 instanceof EditText ? (EditText) obj2 : null;
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        return (EditText) (c0104d instanceof C0104d ? null : c0104d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1501d(Activity activity, final boolean z2) {
        final Activity activity2;
        View decorView;
        WeakReference weakReference = this.f2740a;
        if (weakReference == null || (activity2 = (Activity) weakReference.get()) == null) {
            if (activity.isFinishing() || activity.isDestroyed()) {
                activity = null;
            }
            if (activity == null) {
                return;
            } else {
                activity2 = activity;
            }
        } else {
            if (activity2.isFinishing() || activity2.isDestroyed()) {
                activity2 = null;
            }
            if (activity2 == null) {
            }
        }
        Window window = activity2.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.post(new Runnable() { // from class: r0.y1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                Activity activity3 = activity2;
                boolean z3 = z2;
                if (z3) {
                    C0709q1 c0709q1 = new C0709q1(activity3);
                    if (!((AtomicBoolean) c0709q1.f2401g).get()) {
                        ((C1010e) c0709q1.f2395a).m2209g();
                    }
                } else {
                    new C0976J(activity3).m2209g();
                }
                AbstractC0731a.m1384a("search command ui opened", z3 ? "list" : "panel", activity3.getClass().getName());
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p062e0.InterfaceC0551a
    public final void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        Object c0104d;
        Object c0104d2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        new WeakReference(applicationContext);
        Context applicationContext2 = context.getApplicationContext();
        Application application = applicationContext2 instanceof Application ? (Application) applicationContext2 : null;
        if (application != null && MainHook.uniqueMetaStore.add("search-command-activity-lifecycle")) {
            application.registerActivityLifecycleCallbacks(new C0911j(this, 5));
        }
        this.f2741b = AbstractC0039l.m74l(context);
        CopyOnWriteArrayList copyOnWriteArrayList = C0052y.f291a;
        C0052y.m98c(context, new C0048u("search-command", "搜索框命令监听", new C0925n1(7), new C0035h(context, 19), new C0925n1(8), new C0026a(16)));
        C0021V c0021v = this.f2741b;
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        if (c0021v != null) {
            Iterator it = c0021v.f161a.iterator();
            while (it.hasNext()) {
                linkedHashSet.add((String) it.next());
            }
        }
        linkedHashSet.add("com.tencent.mm.ui.tools.ActionBarSearchView");
        for (String str : linkedHashSet) {
            String strM352h = AbstractC0174d.m352h("search-command-ctor:", str);
            if (MainHook.uniqueMetaStore.add(strM352h)) {
                try {
                    c0104d = Class.forName(str, false, context.getClassLoader());
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                if (c0104d instanceof C0104d) {
                    c0104d = null;
                }
                Class cls = (Class) c0104d;
                if (cls == null) {
                    MainHook.uniqueMetaStore.remove(strM352h);
                } else {
                    try {
                        XposedBridge.hookAllConstructors(cls, new C0070d(3, this));
                        AbstractC0731a.m1384a("search command hook installed", str);
                        c0104d2 = C0109i.f404a;
                    } catch (Throwable th2) {
                        c0104d2 = new C0104d(th2);
                    }
                    Throwable thM246a = AbstractC0105e.m246a(c0104d2);
                    if (thM246a != null) {
                        MainHook.uniqueMetaStore.remove(strM352h);
                        AbstractC0731a.m1387d("search command hook install fail", str, thM246a);
                    }
                }
            }
        }
    }
}
