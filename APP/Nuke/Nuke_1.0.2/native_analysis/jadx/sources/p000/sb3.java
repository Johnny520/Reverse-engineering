package p000;

import android.view.View;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sb3 {
    /* JADX INFO: renamed from: a */
    public static final u33 m4783a(y33 y33Var, n43 n43Var, String str, InterfaceC0596px interfaceC0596px) {
        t33 t33Var;
        boolean zM1980f = ((go0) interfaceC0596px).m1980f(y33Var);
        go0 go0Var = (go0) interfaceC0596px;
        Object objM1956L = go0Var.m1956L();
        C0160eb c0160eb = C0520nx.f7360a;
        if (zM1980f || objM1956L == c0160eb) {
            objM1956L = new u33(y33Var, n43Var, str);
            go0Var.m1981f0(objM1956L);
        }
        u33 u33Var = (u33) objM1956L;
        boolean zM1980f2 = go0Var.m1980f(y33Var) | go0Var.m1984h(u33Var);
        Object objM1956L2 = go0Var.m1956L();
        if (zM1980f2 || objM1956L2 == c0160eb) {
            objM1956L2 = new d62(6, y33Var, u33Var);
            go0Var.m1981f0(objM1956L2);
        }
        AbstractC0179eu.m1450c(u33Var, (in0) objM1956L2, go0Var);
        if (y33Var.m6217g() && (t33Var = (t33) u33Var.f11095b.getValue()) != null) {
            y33 y33Var2 = u33Var.f11096c;
            t33Var.f10533h.m5836f(t33Var.f10535j.mo5j(y33Var2.m6216f().f11674a), t33Var.f10535j.mo5j(y33Var2.m6216f().f11675b), (fj0) t33Var.f10534i.mo5j(y33Var2.m6216f()));
        }
        return u33Var;
    }

    /* JADX INFO: renamed from: b */
    public static final tc2 m4784b(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            tc2 tc2Var = tag instanceof tc2 ? (tc2) tag : null;
            if (tc2Var != null) {
                return tc2Var;
            }
            Object objM3845b = pb3.m3845b(view);
            view = objM3845b instanceof View ? (View) objM3845b : null;
        }
        return null;
    }
}
