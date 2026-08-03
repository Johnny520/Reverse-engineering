package p230p8;

import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import ba.C0226f;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import gg.C1414j;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1235p;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p242q8.C3460o;
import p258r8.C3742g;
import p258r8.C3744i;
import p276sf.C3959f;
import p276sf.C3960g;

/* JADX INFO: renamed from: p8.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3358j {

    /* JADX INFO: renamed from: a */
    public static final C3358j f10833a = new C3358j();

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f10834b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public static final Set f10835c = AbstractC2091b.m5168o();

    /* JADX INFO: renamed from: d */
    public static final Map f10836d = AbstractC3199a.m6843p();

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap f10837e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    public static volatile C3363o f10838f;

    /* JADX INFO: renamed from: g */
    public static volatile C1414j f10839g;

    /* JADX INFO: renamed from: h */
    public static volatile WeakReference f10840h;

    /* JADX INFO: renamed from: i */
    public static volatile long f10841i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Activity m7106a() {
        C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
        Activity activityM7263a = c3460oCurrentActivity != null ? c3460oCurrentActivity.m7263a() : null;
        if (activityM7263a == null) {
            activityM7263a = null;
        }
        if (activityM7263a != null) {
            if (!(activityM7263a.isFinishing() || activityM7263a.isDestroyed())) {
                return activityM7263a;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static MenuItem m7107b(int i9, Object obj) {
        Object objInvokeMethod = KavaReflector.invokeMethod(obj, "findItem", Integer.valueOf(i9));
        if (objInvokeMethod instanceof MenuItem) {
            return (MenuItem) objInvokeMethod;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r4v7, types: [fg.p, gg.j] */
    /* JADX INFO: renamed from: c */
    public static boolean m7108c(Method method, XC_MethodHook xC_MethodHook) {
        Object c3959f;
        if (Modifier.isAbstract(method.getModifiers()) || method.getDeclaringClass().isInterface()) {
            return false;
        }
        if (!f10835c.add(method)) {
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
            f10835c.remove(method);
            ?? r42 = f10839g;
            if (r42 != 0) {
                r42.invoke("朋友圈共享菜单Hook安装失败: " + method.toGenericString(), thM8182b);
            }
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m7109e(String str) {
        Object c3959f;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strM6704S0 = AbstractC3149m.m6704S0(AbstractC3149m.m6703R0(str).toString(), '\'', '\"');
        if (!(strM6704S0.length() > 0)) {
            strM6704S0 = null;
        }
        if (strM6704S0 == null) {
            return null;
        }
        Long lM6743g0 = AbstractC3156t.m6743g0(strM6704S0);
        if (lM6743g0 != null) {
            return Long.toUnsignedString(lM6743g0.longValue());
        }
        try {
            c3959f = Long.valueOf(Long.parseUnsignedLong(strM6704S0));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Long l10 = (Long) c3959f;
        if (l10 != null) {
            return Long.toUnsignedString(l10.longValue());
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041 A[PHI: r6
  0x0041: PHI (r6v1 java.lang.Object) = (r6v0 java.lang.Object), (r6v12 java.lang.Object), (r6v13 java.lang.Object) binds: [B:17:0x0031, B:20:0x0038, B:23:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3360l m7110f(XC_MethodHook.MethodHookParam methodHookParam) {
        View view;
        C3370v c3370vM7140v;
        View view2;
        String strM7109e;
        View view3;
        C3363o c3363o = f10838f;
        WeakReference weakReference = null;
        if (c3363o != null) {
            Object obj = methodHookParam.thisObject;
            Object[] objArr = methodHookParam.args;
            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            int i9 = 0;
            if (objArr != null) {
                for (Object obj2 : objArr) {
                    view = obj2 instanceof View ? (View) obj2 : null;
                    if (view != null) {
                        break;
                    }
                }
                view = null;
                setNewSetFromMap.getClass();
                Object objM7124g = C3363o.m7124g(0, view, setNewSetFromMap);
                c3370vM7140v = (objM7124g == null && (objM7124g = C3363o.m7124g(0, obj, setNewSetFromMap)) == null && (objM7124g = C3363o.m7124g(0, objArr, setNewSetFromMap)) == null) ? null : c3363o.m7140v(objM7124g);
                if (c3370vM7140v != null) {
                    Object obj3 = methodHookParam.thisObject;
                    Object[] objArr2 = methodHookParam.args;
                    Set setNewSetFromMap2 = Collections.newSetFromMap(new IdentityHashMap());
                    if (objArr2 != null) {
                        for (Object obj4 : objArr2) {
                            view2 = obj4 instanceof View ? (View) obj4 : null;
                            if (view2 != null) {
                                break;
                            }
                        }
                        view2 = null;
                    } else {
                        view2 = null;
                    }
                    setNewSetFromMap2.getClass();
                    Object objM7123f = C3363o.m7123f(0, view2, setNewSetFromMap2);
                    if (objM7123f == null && (objM7123f = C3363o.m7123f(0, obj3, setNewSetFromMap2)) == null) {
                        objM7123f = C3363o.m7123f(0, objArr2, setNewSetFromMap2);
                    }
                    if (objM7123f != null) {
                        Object field = KavaReflector.readField(objM7123f, "field_snsId");
                        if (field == null) {
                            field = KavaReflector.readField(objM7123f, "snsId");
                        }
                        strM7109e = m7109e(field != null ? field.toString() : null);
                    } else {
                        strM7109e = null;
                    }
                    String strM7109e2 = m7109e(c3370vM7140v.f10879a);
                    if (objM7123f != null && strM7109e2 != null && !AbstractC1416l.m3825a(strM7109e, strM7109e2)) {
                        objM7123f = null;
                    }
                    if (strM7109e2 != null) {
                        strM7109e = strM7109e2;
                    }
                    if (objM7123f == null && strM7109e != null) {
                        C3351d0 c3351d0SnsApi = WeChatApis.snsApi();
                        objM7123f = c3351d0SnsApi != null ? c3351d0SnsApi.m7073c(strM7109e).f10806b : null;
                    }
                    Object[] objArr3 = methodHookParam.args;
                    if (objArr3 != null) {
                        int length = objArr3.length;
                        while (true) {
                            if (i9 >= length) {
                                view3 = null;
                                break;
                            }
                            Object obj5 = objArr3[i9];
                            view3 = obj5 instanceof View ? (View) obj5 : null;
                            if (view3 != null) {
                                break;
                            }
                            i9++;
                        }
                        if (view3 != null) {
                            weakReference = new WeakReference(view3);
                        }
                    }
                    return new C3360l(strM7109e, c3370vM7140v, objM7123f, weakReference);
                }
            } else {
                view = null;
                setNewSetFromMap.getClass();
                Object objM7124g2 = C3363o.m7124g(0, view, setNewSetFromMap);
                if (objM7124g2 == null) {
                    if (c3370vM7140v != null) {
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: fg.p */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final synchronized boolean m7111d(C3742g c3742g, C3363o c3363o, InterfaceC1235p interfaceC1235p) {
        boolean z9;
        int i9;
        int i10;
        try {
            c3742g.getClass();
            c3363o.getClass();
            f10838f = c3363o;
            f10839g = (C1414j) interfaceC1235p;
            ArrayList arrayListM7118f = C3359k.f10842a.m7118f(c3742g, interfaceC1235p);
            z9 = false;
            if (arrayListM7118f.isEmpty()) {
                i9 = 0;
            } else {
                Iterator it = arrayListM7118f.iterator();
                i9 = 0;
                while (it.hasNext()) {
                    if (m7108c((Method) it.next(), new C0226f(21)) && (i9 = i9 + 1) < 0) {
                        AbstractC0000a.m30P0();
                        throw null;
                    }
                }
            }
            ArrayList arrayListM7117e = C3359k.f10842a.m7117e(c3742g, interfaceC1235p);
            if (arrayListM7117e.isEmpty()) {
                i10 = 0;
            } else {
                Iterator it2 = arrayListM7117e.iterator();
                i10 = 0;
                while (it2.hasNext()) {
                    if (m7108c((Method) it2.next(), new C0226f(20)) && (i10 = i10 + 1) < 0) {
                        AbstractC0000a.m30P0();
                        throw null;
                    }
                }
            }
            if (i9 <= 0) {
                interfaceC1235p.invoke("朋友圈共享菜单创建Hook未安装", null);
            }
            if (i10 <= 0) {
                interfaceC1235p.invoke("朋友圈共享菜单点击Hook未安装", null);
            }
            if (i9 > 0 && i10 > 0) {
                z9 = true;
            }
        } finally {
        }
        return z9;
    }
}
