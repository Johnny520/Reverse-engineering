package p086r0;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import p027N0.AbstractC0223g;
import p054c0.AbstractC0509a;
import p054c0.AbstractC0514f;
import p062e0.InterfaceC0551a;
import p070i0.AbstractC0731a;
import p102z0.AbstractC1135r;

/* JADX INFO: renamed from: r0.D0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0830D0 extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2756a;

    /* JADX INFO: renamed from: b */
    public boolean f2757b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0551a f2758c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0830D0(InterfaceC0551a interfaceC0551a, int i2) {
        this.f2756a = i2;
        this.f2758c = interfaceC0551a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Window window;
        View decorView;
        List list;
        switch (this.f2756a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj = methodHookParam.args[0];
                C0842H0 c0842h0 = (C0842H0) this.f2758c;
                c0842h0.getClass();
                Object objM1584D1 = C0842H0.m1584D1(obj);
                if (objM1584D1 != null) {
                    if ((C0842H0.m1583D0(objM1584D1.getClass()) || !AbstractC1135r.m2499u()) && c0842h0.m1697q(methodHookParam.thisObject, objM1584D1) && !this.f2757b) {
                        AbstractC0731a.m1387d(AbstractC1135r.m2493o(), "guess setAdapter: ", objM1584D1, objM1584D1.getClass().getSuperclass());
                        Method methodM1663E = c0842h0.m1663E(objM1584D1.getClass().getSuperclass());
                        if (methodM1663E == null) {
                            methodM1663E = AbstractC0514f.f1622b.mo1011b(objM1584D1.getClass().getSuperclass(), "getItem", Integer.TYPE);
                        }
                        if (methodM1663E == null) {
                            AbstractC0731a.m1387d("guess getItem method is ", methodM1663E);
                        } else {
                            AbstractC0514f.m1027d(methodM1663E, new C0827C0(c0842h0, 17));
                            this.f2757b = true;
                        }
                    }
                    break;
                }
                break;
            default:
                AbstractC0223g.m418e(methodHookParam, "param");
                boolean z2 = this.f2757b;
                C0919l1 c0919l1 = (C0919l1) this.f2758c;
                if (z2) {
                    c0919l1.m2023I(methodHookParam.thisObject);
                }
                Object obj2 = methodHookParam.thisObject;
                c0919l1.getClass();
                Activity activity = obj2 instanceof Activity ? (Activity) obj2 : null;
                if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                    if ((!C0919l1.m1999A(activity) || activity.isFinishing()) ? false : c0919l1.m2036x(activity, decorView)) {
                        C0913j1 c0913j1M2129a = C0951w0.m2129a();
                        if (c0913j1M2129a == null || (list = c0913j1M2129a.f3238e) == null) {
                            list = C0919l1.f3264n;
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            decorView.postDelayed(new RunnableC0904g1(c0919l1, activity, 0), ((Number) it.next()).longValue());
                        }
                        break;
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f2756a) {
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                this.f2757b = ((C0919l1) this.f2758c).m2026h(methodHookParam.thisObject);
                break;
        }
    }
}
