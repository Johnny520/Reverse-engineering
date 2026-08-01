package p086r0;

import de.robv.android.xposed.XC_MethodHook;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import p011F0.AbstractC0129q;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p070i0.AbstractC0731a;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.r1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0937r1 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0943t1 f3339a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f3340b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f3341c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0937r1(C0943t1 c0943t1, Method method, String str) {
        this.f3339a = c0943t1;
        this.f3340b = method;
        this.f3341c = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        AbstractC0223g.m418e(methodHookParam, "param");
        this.f3339a.getClass();
        if (C0943t1.m2052A()) {
            this.f3339a.getClass();
            if (C0943t1.m2079n()) {
                C0943t1 c0943t1 = this.f3339a;
                Object obj = methodHookParam.thisObject;
                String str = this.f3341c;
                if (obj == null) {
                    c0943t1.getClass();
                    return;
                }
                synchronized (c0943t1.f3384v) {
                    try {
                        AbstractC0129q.m293g0(c0943t1.f3384v, new C0925n1(1));
                        ArrayList arrayList = c0943t1.f3384v;
                        if (arrayList == null || !arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((WeakReference) it.next()).get() == obj) {
                                    return;
                                }
                            }
                        }
                        if (c0943t1.f3384v.size() >= 12) {
                            c0943t1.f3384v.remove(0);
                        }
                        c0943t1.f3384v.add(new WeakReference(obj));
                        AbstractC0731a.m1384a("track voip audio", str, obj.getClass().getName(), C0943t1.m2072d0());
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        AbstractC0223g.m418e(methodHookParam, "param");
        C0943t1 c0943t1 = this.f3339a;
        boolean zM414a = AbstractC0223g.m414a(c0943t1.f3382t.get(), Boolean.TRUE);
        String str = this.f3341c;
        if (!(zM414a && AbstractC0299i.m511i0(str, "vibrator", true)) && C0943t1.m2052A()) {
            boolean z2 = AbstractC1126i.f3786a;
            if (C1124g.m2433i().isEmpty() || c0943t1.m2089R(null)) {
                return;
            }
            if (!c0943t1.m2091T() && (c0943t1.m2090S() == null || !C0943t1.m2079n())) {
                return;
            }
            String strM2090S = c0943t1.m2090S();
            Method method = this.f3340b;
            AbstractC0731a.m1384a("block voip audio", str, C0943t1.m2063P(method), "masked=".concat(strM2090S == null ? "unknown" : strM2090S), AbstractC0174d.m355k("suppressed=", c0943t1.m2091T()), C0943t1.m2072d0());
            c0943t1.m2087O("audio:".concat(str), strM2090S);
            C0943t1.m2067a0(methodHookParam.thisObject);
            C0943t1.m2075g(methodHookParam, method, null);
        }
    }
}
