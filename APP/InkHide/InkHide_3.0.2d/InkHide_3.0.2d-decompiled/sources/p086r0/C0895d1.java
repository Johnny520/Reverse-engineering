package p086r0;

import de.robv.android.xposed.XC_MethodHook;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p027N0.AbstractC0223g;
import p054c0.AbstractC0509a;
import p070i0.AbstractC0731a;

/* JADX INFO: renamed from: r0.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0895d1 extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3148a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0901f1 f3149b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Class f3150c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Class f3151d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0895d1(C0901f1 c0901f1, Class cls, Class cls2, int i2) {
        this.f3148a = i2;
        this.f3149b = c0901f1;
        this.f3150c = cls;
        this.f3151d = cls2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f3148a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object result = methodHookParam.getResult();
                if (result != null) {
                    if (result != this.f3149b.f3180g) {
                        this.f3149b.f3180g = result;
                    }
                    this.f3149b.m1925d(result, this.f3150c, this.f3151d);
                    break;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object c0104d;
        switch (this.f3148a) {
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                if (this.f3149b.f3181h || !this.f3149b.m1925d(methodHookParam.thisObject, this.f3150c, this.f3151d) || AbstractC0223g.m414a(methodHookParam.method.getName(), "notifyDataSetChanged")) {
                    return;
                }
                methodHookParam.setResult((Object) null);
                C0901f1 c0901f1 = this.f3149b;
                Object obj = methodHookParam.thisObject;
                c0901f1.getClass();
                if (obj == null) {
                    return;
                }
                try {
                    c0901f1.f3181h = true;
                    try {
                        c0104d = obj.getClass().getMethod("notifyDataSetChanged", null).invoke(obj, null);
                        c0901f1.f3181h = false;
                    } catch (Throwable th) {
                        c0901f1.f3181h = false;
                        throw th;
                    }
                } catch (Throwable th2) {
                    c0104d = new C0104d(th2);
                }
                Throwable thM246a = AbstractC0105e.m246a(c0104d);
                if (thM246a != null) {
                    c0901f1.f3181h = false;
                    AbstractC0731a.m1387d("hide sns posts notifyDataSetChanged fail", thM246a);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
