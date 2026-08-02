package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b71 extends o61 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f71 f720b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mn0 f721c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b71(f71 f71Var, mn0 mn0Var, String str) {
        super(str);
        this.f720b = f71Var;
        this.f721c = mn0Var;
    }

    @Override // p000.nf1
    /* JADX INFO: renamed from: g */
    public final of1 mo287g(pf1 pf1Var, List list, long j) {
        f71 f71Var = this.f720b;
        z61 z61Var = f71Var.f2833o;
        z61Var.f13741h = pf1Var.getLayoutDirection();
        z61Var.f13742i = pf1Var.mo693b();
        z61Var.f13743j = pf1Var.mo697m();
        boolean zMo699u = pf1Var.mo699u();
        mn0 mn0Var = this.f721c;
        if (zMo699u || f71Var.f2826h.f9391o == null) {
            f71Var.f2829k = 0;
            of1 of1Var = (of1) mn0Var.mo12g(z61Var, new C0221fz(j));
            return new a71(of1Var, f71Var, f71Var.f2829k, of1Var, 1);
        }
        f71Var.f2830l = 0;
        of1 of1Var2 = (of1) mn0Var.mo12g(f71Var.f2834p, new C0221fz(j));
        return new a71(of1Var2, f71Var, f71Var.f2830l, of1Var2, 0);
    }
}
