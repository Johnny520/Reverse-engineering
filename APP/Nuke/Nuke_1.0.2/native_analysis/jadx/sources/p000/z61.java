package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z61 implements iw2 {

    /* JADX INFO: renamed from: h */
    public d61 f13741h = d61.f1886i;

    /* JADX INFO: renamed from: i */
    public float f13742i;

    /* JADX INFO: renamed from: j */
    public float f13743j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ f71 f13744k;

    public z61(f71 f71Var) {
        this.f13744k = f71Var;
    }

    @Override // p000.iw2
    /* JADX INFO: renamed from: I */
    public final List mo2409I(mn0 mn0Var, Object obj) {
        f71 f71Var = this.f13744k;
        f71Var.m1542h();
        r61 r61Var = f71Var.f2826h;
        n61 n61Var = r61Var.f9373N.f11783d;
        n61 n61Var2 = n61.f7020j;
        n61 n61Var3 = n61.f7018h;
        if (n61Var != n61Var3 && n61Var != n61Var2 && n61Var != n61.f7019i && n61Var != n61.f7021k) {
            kz0.m2764b("subcompose can only be used inside the measure or layout blocks");
        }
        rk1 rk1Var = f71Var.f2832n;
        Object objM4505g = rk1Var.m4505g(obj);
        if (objM4505g == null) {
            objM4505g = (r61) f71Var.f2835q.m4509k(obj);
            if (objM4505g != null) {
                if (f71Var.f2840v <= 0) {
                    kz0.m2764b("Check failed.");
                }
                f71Var.f2840v--;
            } else {
                objM4505g = f71Var.m1548n(obj);
                if (objM4505g == null) {
                    int i = f71Var.f2829k;
                    r61 r61Var2 = new r61(2);
                    r61Var.f9400x = true;
                    r61Var.m4344A(i, r61Var2);
                    r61Var.f9400x = false;
                    objM4505g = r61Var2;
                }
            }
            rk1Var.m4511m(obj, objM4505g);
        }
        r61 r61Var3 = (r61) objM4505g;
        if (AbstractC0142du.m1162r0(f71Var.f2829k, r61Var.m4383o()) != r61Var3) {
            int iM6430i = ((zk1) ((jk1) r61Var.m4383o()).f5084i).m6430i(r61Var3);
            if (iM6430i < f71Var.f2829k) {
                kz0.m2763a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i2 = f71Var.f2829k;
            if (i2 != iM6430i) {
                f71Var.m1544j(iM6430i, i2);
            }
        }
        f71Var.f2829k++;
        f71Var.m1547m(r61Var3, obj, false, mn0Var);
        return (n61Var == n61Var3 || n61Var == n61Var2) ? r61Var3.m4381m() : r61Var3.m4380l();
    }

    @Override // p000.pf1
    /* JADX INFO: renamed from: S */
    public final of1 mo691S(int i, int i2, Map map, in0 in0Var, in0 in0Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            kz0.m2764b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new y61(i, i2, map, in0Var, this, this.f13744k, in0Var2);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: b */
    public final float mo693b() {
        return this.f13742i;
    }

    @Override // p000.m11
    public final d61 getLayoutDirection() {
        return this.f13741h;
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: m */
    public final float mo697m() {
        return this.f13743j;
    }

    @Override // p000.m11
    /* JADX INFO: renamed from: u */
    public final boolean mo699u() {
        n61 n61Var = this.f13744k.f2826h.f9373N.f11783d;
        return n61Var == n61.f7021k || n61Var == n61.f7019i;
    }
}
