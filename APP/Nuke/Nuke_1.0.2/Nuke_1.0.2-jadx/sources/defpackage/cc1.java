package defpackage;

import android.view.View;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cc1 {
    public static final my a = new my(new n31(6));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static gm1 a(px pxVar) {
        gm1 gm1Var;
        go0 go0Var = (go0) pxVar;
        gm1 gm1Var2 = (gm1) go0Var.j(a);
        if (gm1Var2 != null) {
            go0Var.W(950834231);
            go0Var.p(false);
            return gm1Var2;
        }
        go0Var.W(950836184);
        View view = (View) go0Var.j(r7.f);
        view.getClass();
        while (true) {
            gm1Var = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
            gm1 gm1Var3 = tag instanceof gm1 ? (gm1) tag : null;
            if (gm1Var3 != null) {
                gm1Var = gm1Var3;
                break;
            }
            Object objB = pb3.b(view);
            view = objB instanceof View ? (View) objB : null;
        }
        go0Var.p(false);
        return gm1Var;
    }
}
