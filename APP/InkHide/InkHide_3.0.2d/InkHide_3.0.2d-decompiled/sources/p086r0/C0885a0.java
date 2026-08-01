package p086r0;

import android.view.View;
import de.robv.android.xposed.XC_MethodHook;
import p011F0.AbstractC0120h;
import p027N0.AbstractC0223g;
import p054c0.AbstractC0509a;

/* JADX INFO: renamed from: r0.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0885a0 extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3061a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0894d0 f3062b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Class f3063c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0885a0(C0894d0 c0894d0, Class cls, int i2) {
        this.f3061a = i2;
        this.f3062b = c0894d0;
        this.f3063c = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f3061a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj = methodHookParam.thisObject;
                View view = obj instanceof View ? (View) obj : null;
                if (view != null) {
                    C0894d0.m1838c(this.f3062b, view, this.f3063c.getName().concat(".performClick"));
                    break;
                }
                break;
            default:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr = methodHookParam.args;
                AbstractC0223g.m417d(objArr, "args");
                Object objM258f0 = AbstractC0120h.m258f0(0, objArr);
                View view2 = objM258f0 instanceof View ? (View) objM258f0 : null;
                if (view2 != null) {
                    C0894d0.m1838c(this.f3062b, view2, this.f3063c.getName().concat(".performItemClick"));
                    break;
                }
                break;
        }
    }
}
