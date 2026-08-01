package p086r0;

import android.app.Activity;
import android.view.View;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.ref.WeakReference;
import p011F0.AbstractC0120h;
import p027N0.AbstractC0223g;
import p054c0.AbstractC0509a;
import p070i0.AbstractC0731a;

/* JADX INFO: renamed from: r0.E0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0833E0 extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2790a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0842H0 f2791b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Class f2792c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0833E0(C0842H0 c0842h0, Class cls, int i2) {
        this.f2790a = i2;
        this.f2791b = c0842h0;
        this.f2792c = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f2790a) {
            case 2:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr = methodHookParam.args;
                AbstractC0223g.m417d(objArr, "args");
                Object objM258f0 = AbstractC0120h.m258f0(0, objArr);
                if (objM258f0 != null) {
                    Object obj = methodHookParam.thisObject;
                    View view = obj instanceof View ? (View) obj : null;
                    C0842H0 c0842h0 = this.f2791b;
                    WeakReference weakReference = c0842h0.f2860f;
                    Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                    if (activity == null || c0842h0.m1660A1(activity)) {
                        boolean zM1617Y0 = C0842H0.m1617Y0();
                        Class cls = this.f2792c;
                        if (zM1617Y0) {
                            String name = cls.getName();
                            String name2 = view != null ? view.getClass().getName() : null;
                            if (name2 == null) {
                                name2 = "";
                            }
                            AbstractC0731a.m1387d("8076 recycler setAdapter", name, name2, objM258f0.getClass().getName());
                        }
                        if (C0842H0.m1608T0() && view != null) {
                            AbstractC0731a.m1387d("play8072 recycler setAdapter", cls.getName(), view.getClass().getName(), objM258f0.getClass().getName());
                            if (c0842h0.m1702s(view, objM258f0)) {
                                c0842h0.m1698q0(objM258f0.getClass());
                            }
                        }
                        c0842h0.m1698q0(objM258f0.getClass());
                    }
                    break;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f2790a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj = methodHookParam.thisObject;
                View view = obj instanceof View ? (View) obj : null;
                if (view != null) {
                    this.f2792c.getName().concat(".performClick");
                    if (C0842H0.m1632f(this.f2791b, view)) {
                        methodHookParam.setResult(Boolean.TRUE);
                    }
                    break;
                }
                break;
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr = methodHookParam.args;
                AbstractC0223g.m417d(objArr, "args");
                Object objM258f0 = AbstractC0120h.m258f0(0, objArr);
                View view2 = objM258f0 instanceof View ? (View) objM258f0 : null;
                if (view2 != null) {
                    this.f2792c.getName().concat(".performItemClick");
                    if (C0842H0.m1632f(this.f2791b, view2)) {
                        methodHookParam.setResult(Boolean.TRUE);
                    }
                    break;
                }
                break;
        }
    }
}
