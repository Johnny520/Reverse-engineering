package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dc1 {
    public static final my a = new my(new n31(7));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static pt1 a(px pxVar) {
        go0 go0Var = (go0) pxVar;
        pt1 pt1Var = (pt1) go0Var.j(a);
        Object obj = null;
        if (pt1Var == null) {
            go0Var.W(1208426157);
            View view = (View) go0Var.j(r7.f);
            view.getClass();
            while (true) {
                if (view == null) {
                    pt1Var = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                pt1 pt1Var2 = tag instanceof pt1 ? (pt1) tag : null;
                if (pt1Var2 != null) {
                    pt1Var = pt1Var2;
                    break;
                }
                Object objB = pb3.b(view);
                view = objB instanceof View ? (View) objB : null;
            }
        } else {
            go0Var.W(1208423708);
        }
        go0Var.p(false);
        if (pt1Var != null) {
            go0Var.W(1208423789);
            go0Var.p(false);
            return pt1Var;
        }
        go0Var.W(1208428160);
        Context baseContext = (Context) go0Var.j(r7.b);
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
            if (baseContext instanceof pt1) {
                obj = baseContext;
                break;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        pt1 pt1Var3 = (pt1) obj;
        go0Var.p(false);
        return pt1Var3;
    }
}
