package p086r0;

import android.app.Activity;
import de.robv.android.xposed.XC_MethodHook;
import p011F0.AbstractC0120h;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p054c0.AbstractC0509a;
import p070i0.AbstractC0731a;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.T0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0871T0 extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2998a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0881Y0 f2999b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Class f3000c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Class f3001d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0871T0(C0881Y0 c0881y0, Class cls, Class cls2, int i2) {
        this.f2998a = i2;
        this.f2999b = c0881y0;
        this.f3000c = cls;
        this.f3001d = cls2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Activity activity;
        C0881Y0 c0881y0 = this.f2999b;
        Class cls = this.f3001d;
        Class cls2 = this.f3000c;
        int i2 = this.f2998a;
        AbstractC0223g.m418e(methodHookParam, "param");
        switch (i2) {
            case 0:
                Object obj = methodHookParam.thisObject;
                activity = obj instanceof Activity ? (Activity) obj : null;
                if (activity != null) {
                    String name = activity.getClass().getName();
                    boolean z2 = AbstractC1126i.f3786a;
                    AbstractC0731a.m1387d("self sns detail resumed", name, AbstractC0174d.m355k("enabled=", C1124g.m2410A()));
                    C0881Y0.m1776b(c0881y0, activity, cls2, cls);
                    break;
                }
                break;
            default:
                Object[] objArr = methodHookParam.args;
                AbstractC0223g.m417d(objArr, "args");
                if (AbstractC0223g.m414a(AbstractC0120h.m258f0(0, objArr), Boolean.TRUE)) {
                    Object obj2 = methodHookParam.thisObject;
                    activity = obj2 instanceof Activity ? (Activity) obj2 : null;
                    if (activity != null) {
                        C0881Y0.m1776b(c0881y0, activity, cls2, cls);
                        break;
                    }
                }
                break;
        }
    }
}
