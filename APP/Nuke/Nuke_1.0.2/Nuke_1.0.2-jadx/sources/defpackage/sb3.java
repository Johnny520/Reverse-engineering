package defpackage;

import android.view.View;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sb3 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final u33 a(y33 y33Var, n43 n43Var, String str, px pxVar) {
        t33 t33Var;
        boolean zF = ((go0) pxVar).f(y33Var);
        go0 go0Var = (go0) pxVar;
        Object objL = go0Var.L();
        eb ebVar = nx.a;
        if (zF || objL == ebVar) {
            objL = new u33(y33Var, n43Var, str);
            go0Var.f0(objL);
        }
        u33 u33Var = (u33) objL;
        boolean zF2 = go0Var.f(y33Var) | go0Var.h(u33Var);
        Object objL2 = go0Var.L();
        if (zF2 || objL2 == ebVar) {
            objL2 = new d62(6, y33Var, u33Var);
            go0Var.f0(objL2);
        }
        eu.c(u33Var, (in0) objL2, go0Var);
        if (y33Var.g() && (t33Var = (t33) u33Var.b.getValue()) != null) {
            y33 y33Var2 = u33Var.c;
            t33Var.h.f(t33Var.j.j(y33Var2.f().a), t33Var.j.j(y33Var2.f().b), (fj0) t33Var.i.j(y33Var2.f()));
        }
        return u33Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final tc2 b(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            tc2 tc2Var = tag instanceof tc2 ? (tc2) tag : null;
            if (tc2Var != null) {
                return tc2Var;
            }
            Object objB = pb3.b(view);
            view = objB instanceof View ? (View) objB : null;
        }
        return null;
    }
}
