package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dc implements nf1 {
    public final /* synthetic */ ab3 a;
    public final /* synthetic */ r61 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public dc(ab3 ab3Var, r61 r61Var) {
        this.a = ab3Var;
        this.b = r61Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nf1
    public final int b(m11 m11Var, List list, int i) {
        ab3 ab3Var = this.a;
        ViewGroup.LayoutParams layoutParams = ab3Var.getLayoutParams();
        layoutParams.getClass();
        ab3Var.measure(ic.e(ab3Var, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return ab3Var.getMeasuredHeight();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nf1
    public final int d(m11 m11Var, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ab3 ab3Var = this.a;
        ViewGroup.LayoutParams layoutParams = ab3Var.getLayoutParams();
        layoutParams.getClass();
        ab3Var.measure(iMakeMeasureSpec, ic.e(ab3Var, 0, i, layoutParams.height));
        return ab3Var.getMeasuredWidth();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nf1
    public final of1 g(pf1 pf1Var, List list, long j) {
        ab3 ab3Var = this.a;
        int childCount = ab3Var.getChildCount();
        ce0 ce0Var = ce0.h;
        if (childCount == 0) {
            return pf1Var.j0(fz.j(j), fz.i(j), ce0Var, v6.t);
        }
        if (fz.j(j) != 0) {
            ab3Var.getChildAt(0).setMinimumWidth(fz.j(j));
        }
        if (fz.i(j) != 0) {
            ab3Var.getChildAt(0).setMinimumHeight(fz.i(j));
        }
        int iJ = fz.j(j);
        int iH = fz.h(j);
        ViewGroup.LayoutParams layoutParams = ab3Var.getLayoutParams();
        layoutParams.getClass();
        int iE = ic.e(ab3Var, iJ, iH, layoutParams.width);
        int i = fz.i(j);
        int iG = fz.g(j);
        ViewGroup.LayoutParams layoutParams2 = ab3Var.getLayoutParams();
        layoutParams2.getClass();
        ab3Var.measure(iE, ic.e(ab3Var, i, iG, layoutParams2.height));
        return pf1Var.j0(ab3Var.getMeasuredWidth(), ab3Var.getMeasuredHeight(), ce0Var, new bc(ab3Var, this.b, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nf1
    public final int h(m11 m11Var, List list, int i) {
        ab3 ab3Var = this.a;
        ViewGroup.LayoutParams layoutParams = ab3Var.getLayoutParams();
        layoutParams.getClass();
        ab3Var.measure(ic.e(ab3Var, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return ab3Var.getMeasuredHeight();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nf1
    public final int j(m11 m11Var, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ab3 ab3Var = this.a;
        ViewGroup.LayoutParams layoutParams = ab3Var.getLayoutParams();
        layoutParams.getClass();
        ab3Var.measure(iMakeMeasureSpec, ic.e(ab3Var, 0, i, layoutParams.height));
        return ab3Var.getMeasuredWidth();
    }
}
