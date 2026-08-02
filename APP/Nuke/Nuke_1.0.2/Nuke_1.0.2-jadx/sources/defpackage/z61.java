package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z61 implements iw2 {
    public d61 h = d61.i;
    public float i;
    public float j;
    public final /* synthetic */ f71 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z61(f71 f71Var) {
        this.k = f71Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.iw2
    public final List I(mn0 mn0Var, Object obj) {
        f71 f71Var = this.k;
        f71Var.h();
        r61 r61Var = f71Var.h;
        n61 n61Var = r61Var.N.d;
        n61 n61Var2 = n61.j;
        n61 n61Var3 = n61.h;
        if (n61Var != n61Var3 && n61Var != n61Var2 && n61Var != n61.i && n61Var != n61.k) {
            kz0.b("subcompose can only be used inside the measure or layout blocks");
        }
        rk1 rk1Var = f71Var.n;
        Object objG = rk1Var.g(obj);
        if (objG == null) {
            objG = (r61) f71Var.q.k(obj);
            if (objG != null) {
                if (f71Var.v <= 0) {
                    kz0.b("Check failed.");
                }
                f71Var.v--;
            } else {
                objG = f71Var.n(obj);
                if (objG == null) {
                    int i = f71Var.k;
                    r61 r61Var2 = new r61(2);
                    r61Var.x = true;
                    r61Var.A(i, r61Var2);
                    r61Var.x = false;
                    objG = r61Var2;
                }
            }
            rk1Var.m(obj, objG);
        }
        r61 r61Var3 = (r61) objG;
        if (du.r0(f71Var.k, r61Var.o()) != r61Var3) {
            int i2 = ((zk1) ((jk1) r61Var.o()).i).i(r61Var3);
            if (i2 < f71Var.k) {
                kz0.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i3 = f71Var.k;
            if (i3 != i2) {
                f71Var.j(i2, i3);
            }
        }
        f71Var.k++;
        f71Var.m(r61Var3, obj, false, mn0Var);
        return (n61Var == n61Var3 || n61Var == n61Var2) ? r61Var3.m() : r61Var3.l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pf1
    public final of1 S(int i, int i2, Map map, in0 in0Var, in0 in0Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            kz0.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new y61(i, i2, map, in0Var, this, this.k, in0Var2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float b() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.m11
    public final d61 getLayoutDirection() {
        return this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float m() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.m11
    public final boolean u() {
        n61 n61Var = this.k.h.N.d;
        return n61Var == n61.k || n61Var == n61.i;
    }
}
