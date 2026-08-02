package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: dc */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0125dc implements nf1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ab3 f1975a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r61 f1976b;

    public C0125dc(ab3 ab3Var, r61 r61Var) {
        this.f1975a = ab3Var;
        this.f1976b = r61Var;
    }

    @Override // p000.nf1
    /* JADX INFO: renamed from: b */
    public final int mo282b(m11 m11Var, List list, int i) {
        ab3 ab3Var = this.f1975a;
        ViewGroup.LayoutParams layoutParams = ab3Var.getLayoutParams();
        layoutParams.getClass();
        ab3Var.measure(AbstractC0309ic.m2321e(ab3Var, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return ab3Var.getMeasuredHeight();
    }

    @Override // p000.nf1
    /* JADX INFO: renamed from: d */
    public final int mo284d(m11 m11Var, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ab3 ab3Var = this.f1975a;
        ViewGroup.LayoutParams layoutParams = ab3Var.getLayoutParams();
        layoutParams.getClass();
        ab3Var.measure(iMakeMeasureSpec, AbstractC0309ic.m2321e(ab3Var, 0, i, layoutParams.height));
        return ab3Var.getMeasuredWidth();
    }

    @Override // p000.nf1
    /* JADX INFO: renamed from: g */
    public final of1 mo287g(pf1 pf1Var, List list, long j) {
        ab3 ab3Var = this.f1975a;
        int childCount = ab3Var.getChildCount();
        ce0 ce0Var = ce0.f1492h;
        if (childCount == 0) {
            return pf1Var.mo696j0(C0221fz.m1765j(j), C0221fz.m1764i(j), ce0Var, C0799v6.f11771t);
        }
        if (C0221fz.m1765j(j) != 0) {
            ab3Var.getChildAt(0).setMinimumWidth(C0221fz.m1765j(j));
        }
        if (C0221fz.m1764i(j) != 0) {
            ab3Var.getChildAt(0).setMinimumHeight(C0221fz.m1764i(j));
        }
        int iM1765j = C0221fz.m1765j(j);
        int iM1763h = C0221fz.m1763h(j);
        ViewGroup.LayoutParams layoutParams = ab3Var.getLayoutParams();
        layoutParams.getClass();
        int iM2321e = AbstractC0309ic.m2321e(ab3Var, iM1765j, iM1763h, layoutParams.width);
        int iM1764i = C0221fz.m1764i(j);
        int iM1762g = C0221fz.m1762g(j);
        ViewGroup.LayoutParams layoutParams2 = ab3Var.getLayoutParams();
        layoutParams2.getClass();
        ab3Var.measure(iM2321e, AbstractC0309ic.m2321e(ab3Var, iM1764i, iM1762g, layoutParams2.height));
        return pf1Var.mo696j0(ab3Var.getMeasuredWidth(), ab3Var.getMeasuredHeight(), ce0Var, new C0050bc(ab3Var, this.f1976b, 1));
    }

    @Override // p000.nf1
    /* JADX INFO: renamed from: h */
    public final int mo288h(m11 m11Var, List list, int i) {
        ab3 ab3Var = this.f1975a;
        ViewGroup.LayoutParams layoutParams = ab3Var.getLayoutParams();
        layoutParams.getClass();
        ab3Var.measure(AbstractC0309ic.m2321e(ab3Var, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return ab3Var.getMeasuredHeight();
    }

    @Override // p000.nf1
    /* JADX INFO: renamed from: j */
    public final int mo290j(m11 m11Var, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ab3 ab3Var = this.f1975a;
        ViewGroup.LayoutParams layoutParams = ab3Var.getLayoutParams();
        layoutParams.getClass();
        ab3Var.measure(iMakeMeasureSpec, AbstractC0309ic.m2321e(ab3Var, 0, i, layoutParams.height));
        return ab3Var.getMeasuredWidth();
    }
}
