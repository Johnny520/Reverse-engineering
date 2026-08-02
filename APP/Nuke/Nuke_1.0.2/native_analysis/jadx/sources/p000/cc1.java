package p000;

import android.view.View;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cc1 {

    /* JADX INFO: renamed from: a */
    public static final C0478my f1478a = new C0478my(new n31(6));

    /* JADX INFO: renamed from: a */
    public static gm1 m741a(InterfaceC0596px interfaceC0596px) {
        gm1 gm1Var;
        go0 go0Var = (go0) interfaceC0596px;
        gm1 gm1Var2 = (gm1) go0Var.m1988j(f1478a);
        if (gm1Var2 != null) {
            go0Var.m1966W(950834231);
            go0Var.m1994p(false);
            return gm1Var2;
        }
        go0Var.m1966W(950836184);
        View view = (View) go0Var.m1988j(AbstractC0646r7.f9415f);
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
            Object objM3845b = pb3.m3845b(view);
            view = objM3845b instanceof View ? (View) objM3845b : null;
        }
        go0Var.m1994p(false);
        return gm1Var;
    }
}
