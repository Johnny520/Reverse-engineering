package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c20 extends AbstractC0602q2 implements y10 {

    /* JADX INFO: renamed from: i */
    public static final b20 f1109i = new b20(gd3.f3438p, new C0251gs(9));

    public c20() {
        super(gd3.f3438p);
    }

    /* JADX INFO: renamed from: D */
    public abstract void mo612D(a20 a20Var, Runnable runnable);

    /* JADX INFO: renamed from: E */
    public boolean mo613E(a20 a20Var) {
        return !(this instanceof u73);
    }

    /* JADX INFO: renamed from: F */
    public c20 mo614F(int i) {
        sp0.m4962t(i);
        return new sa1(this, i);
    }

    @Override // p000.AbstractC0602q2, p000.a20
    /* JADX INFO: renamed from: o */
    public final y10 mo15o(z10 z10Var) {
        y10 y10Var;
        z10Var.getClass();
        if (z10Var instanceof b20) {
            b20 b20Var = (b20) z10Var;
            z10 z10Var2 = this.f8704h;
            if ((z10Var2 == b20Var || b20Var.f534i == z10Var2) && (y10Var = (y10) b20Var.f533h.mo5j(this)) != null) {
                return y10Var;
            }
        } else if (gd3.f3438p == z10Var) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + p40.m3740x(this);
    }

    @Override // p000.AbstractC0602q2, p000.a20
    /* JADX INFO: renamed from: u */
    public final a20 mo17u(z10 z10Var) {
        z10Var.getClass();
        if (z10Var instanceof b20) {
            b20 b20Var = (b20) z10Var;
            z10 z10Var2 = this.f8704h;
            if ((z10Var2 != b20Var && b20Var.f534i != z10Var2) || ((y10) b20Var.f533h.mo5j(this)) == null) {
                return this;
            }
        } else if (gd3.f3438p != z10Var) {
            return this;
        }
        return zd0.f13837h;
    }
}
