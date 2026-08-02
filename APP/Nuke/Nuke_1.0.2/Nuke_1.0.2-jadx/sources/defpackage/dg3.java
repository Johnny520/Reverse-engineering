package defpackage;

import android.view.View;
import android.view.ViewGroup;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dg3 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final bg3 a(o2 o2Var, lx lxVar, kw kwVar) {
        b7 b7Var;
        bg3 bg3Var;
        Object[] objArr = 0;
        if (iq0.a.compareAndSet(false, true)) {
            jn jnVarA = fg1.a(1, 6, null);
            p7.A(te.e((a20) vb.t.getValue()), null, new b2((Object) jnVarA, (t00) (objArr == true ? 1 : 0), 9), 3);
            v5 v5Var = new v5(11, jnVarA);
            synchronized (ds2.c) {
                ds2.i = du.y0(ds2.i, v5Var);
            }
            ds2.a();
        }
        if (o2Var.getChildCount() > 0) {
            View childAt = o2Var.getChildAt(0);
            b7Var = childAt instanceof b7 ? (b7) childAt : null;
            if (b7Var != null) {
                b7Var.setComposeViewContext(lxVar);
            }
            if (b7Var == null) {
                b7Var = new b7(o2Var.getContext(), lxVar);
                o2Var.addView(b7Var.getView(), a);
            }
            b7Var.setComposeViewContext(lxVar);
            if (o2Var.getComposeViewContext$ui() != null) {
                lxVar.c();
                b7Var.setComposeViewContextIncrementedDuringInit$ui(true);
            }
            Object tag = b7Var.getTag(R.id.wrapped_composition_tag);
            bg3Var = tag instanceof bg3 ? (bg3) tag : null;
            if (bg3Var == null) {
                bg3Var = new bg3(b7Var, new fy(lxVar.b, new s73(b7Var.getRoot())));
                b7Var.setTag(R.id.wrapped_composition_tag, bg3Var);
            }
            bg3Var.d(kwVar);
            b7Var.setFrameEndScheduler$ui(new cg3(lxVar.b));
            return bg3Var;
        }
        o2Var.removeAllViews();
        b7Var = null;
        if (b7Var == null) {
        }
        b7Var.setComposeViewContext(lxVar);
        if (o2Var.getComposeViewContext$ui() != null) {
        }
        Object tag2 = b7Var.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof bg3) {
        }
        if (bg3Var == null) {
        }
        bg3Var.d(kwVar);
        b7Var.setFrameEndScheduler$ui(new cg3(lxVar.b));
        return bg3Var;
    }
}
