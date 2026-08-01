package p086r0;

import android.util.SparseArray;
import de.robv.android.xposed.XC_MethodHook;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0509a;
import p054c0.AbstractC0514f;
import p070i0.AbstractC0731a;
import p084q0.C0808h;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1135r;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.M0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0857M0 extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2946a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0860N0 f2947b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0857M0(C0860N0 c0860n0, int i2) {
        this.f2946a = i2;
        this.f2947b = c0860n0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4 A[PHI: r3
  0x00b4: PHI (r3v8 java.lang.Object) = (r3v7 java.lang.Object), (r3v7 java.lang.Object), (r3v12 java.lang.Object), (r3v15 java.lang.Object) binds: [B:22:0x0070, B:36:0x00a1, B:40:0x00ae, B:34:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    @Override // p054c0.AbstractC0509a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object c0104d;
        Object objMo1015f;
        Object objNewInstance = null;
        boolean zContains = false;
        C0860N0 c0860n0 = this.f2947b;
        int i2 = this.f2946a;
        AbstractC0223g.m418e(methodHookParam, "param");
        switch (i2) {
            case 0:
                if (c0860n0.m1767b(methodHookParam, methodHookParam.getResult())) {
                    AbstractC0731a.m1384a(methodHookParam.getResult());
                    try {
                        objNewInstance = methodHookParam.getResult().getClass().getDeclaredConstructor(null).newInstance(null);
                    } catch (Throwable unused) {
                        AbstractC0731a.m1384a("error new Instance, return null");
                    }
                    methodHookParam.setResult(objNewInstance);
                }
                break;
            case 1:
                Object result = methodHookParam.getResult();
                c0860n0.getClass();
                if (result != null) {
                    boolean z2 = AbstractC1126i.f3786a;
                    if (C1124g.m2450z()) {
                        try {
                            objMo1015f = (String) AbstractC0514f.f1622b.mo1015f(result, AbstractC1135r.m2497s(2420) ? "q1" : "q");
                        } catch (Throwable unused2) {
                            objMo1015f = null;
                        }
                        if (objMo1015f == null) {
                            int iM2486h = AbstractC1135r.m2486h();
                            if (2320 <= iM2486h && iM2486h <= 2441) {
                                Object objMo1015f2 = AbstractC0514f.f1622b.mo1015f(result, "p");
                                if (objMo1015f2 != null) {
                                    objMo1015f = AbstractC0514f.f1622b.mo1015f(objMo1015f2, "e");
                                    if (objMo1015f != null) {
                                    }
                                }
                            } else if (AbstractC1135r.m2497s(2300)) {
                                Object objMo1015f3 = AbstractC0514f.f1622b.mo1015f(result, "o");
                                if (objMo1015f3 != null) {
                                    objMo1015f = AbstractC0514f.f1622b.mo1015f(objMo1015f3, "e");
                                    if (objMo1015f != null) {
                                    }
                                }
                            }
                        } else if (objMo1015f != null) {
                            boolean z3 = AbstractC1126i.f3786a;
                            String str = (String) objMo1015f;
                            if (!C1124g.m2429e(str)) {
                                C0808h c0808h = (C0808h) AbstractC0503h.m988u(C0808h.class);
                                if (C1124g.m2443s()) {
                                    if (AbstractC0307q.m534d0(str)) {
                                        AbstractC0731a.m1387d("chatUser is null or blank");
                                    } else {
                                        zContains = c0808h.f2685b.contains(str);
                                    }
                                }
                                if (zContains) {
                                    AbstractC0731a.m1384a("need hide user from search result list after", objMo1015f);
                                }
                            }
                        }
                    }
                }
                if (zContains) {
                    AbstractC0731a.m1384a(methodHookParam.getResult());
                    try {
                        c0104d = methodHookParam.getResult().getClass().getDeclaredConstructor(null).newInstance(null);
                    } catch (Throwable th) {
                        c0104d = new C0104d(th);
                    }
                    if (AbstractC0105e.m246a(c0104d) == null) {
                        objNewInstance = c0104d;
                    } else {
                        AbstractC0731a.m1387d("error new Instance, return null");
                    }
                    methodHookParam.setResult(objNewInstance);
                }
                break;
            default:
                if (c0860n0.m1767b(methodHookParam, methodHookParam.getResult())) {
                    AbstractC0731a.m1384a("search hide", methodHookParam.getResult());
                    Object objMo1015f4 = AbstractC0514f.f1622b.mo1015f(methodHookParam.thisObject, "f");
                    AbstractC0223g.m417d(objMo1015f4, "getObjectField(...)");
                    methodHookParam.setResult(((SparseArray) objMo1015f4).get(0));
                }
                break;
        }
    }
}
