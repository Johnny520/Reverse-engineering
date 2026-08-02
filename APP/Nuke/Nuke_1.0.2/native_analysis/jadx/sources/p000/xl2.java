package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xl2 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f13073l = 0;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ long f13074m;

    /* JADX INFO: renamed from: n */
    public /* synthetic */ Object f13075n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl2(xk1 xk1Var, long j, t00 t00Var) {
        super(2, t00Var);
        this.f13075n = xk1Var;
        this.f13074m = j;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f13073l;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                ((xl2) mo13p((t00) obj2, (gm2) obj)).mo7r(a83Var);
                break;
            default:
                ((xl2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
                break;
        }
        return a83Var;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        switch (this.f13073l) {
            case 0:
                xl2 xl2Var = new xl2(this.f13074m, t00Var);
                xl2Var.f13075n = obj;
                return xl2Var;
            default:
                return new xl2((xk1) this.f13075n, this.f13074m, t00Var);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        int i = this.f13073l;
        a83 a83Var = a83.f116a;
        long j = this.f13074m;
        switch (i) {
            case 0:
                fg1.m1627T(obj);
                im2 im2Var = ((gm2) this.f13075n).f3582a;
                im2Var.m2366c(im2Var.f4697k, j, 1);
                break;
            default:
                xk1 xk1Var = (xk1) this.f13075n;
                fg1.m1627T(obj);
                if (((z22) xk1Var.getValue()) != null) {
                    xk1Var.setValue(null);
                }
                xk1Var.setValue(new z22(j));
                break;
        }
        return a83Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl2(long j, t00 t00Var) {
        super(2, t00Var);
        this.f13074m = j;
    }
}
