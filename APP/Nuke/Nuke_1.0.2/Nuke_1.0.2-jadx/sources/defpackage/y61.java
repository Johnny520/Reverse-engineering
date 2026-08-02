package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y61 implements of1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ in0 d;
    public final /* synthetic */ z61 e;
    public final /* synthetic */ f71 f;
    public final /* synthetic */ in0 g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y61(int i, int i2, Map map, in0 in0Var, z61 z61Var, f71 f71Var, in0 in0Var2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = in0Var;
        this.e = z61Var;
        this.f = f71Var;
        this.g = in0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.of1
    public final Map a() {
        return this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.of1
    public final void b() {
        pz0 pz0Var;
        r61 r61Var = this.f.h;
        boolean zU = this.e.u();
        in0 in0Var = this.g;
        if (!zU || (pz0Var = ((qz0) r61Var.M.d).Z) == null) {
            in0Var.j(((qz0) r61Var.M.d).s);
        } else {
            in0Var.j(pz0Var.s);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.of1
    public final int c() {
        return this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.of1
    public final in0 d() {
        return this.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.of1
    public final int e() {
        return this.a;
    }
}
