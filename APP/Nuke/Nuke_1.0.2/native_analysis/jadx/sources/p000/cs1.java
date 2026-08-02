package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cs1 extends q43 {

    /* JADX INFO: renamed from: b */
    public static final bs1 f1709b = new bs1(new cs1(2), 0);

    /* JADX INFO: renamed from: a */
    public final int f1710a;

    public cs1(int i) {
        this.f1710a = i;
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    public final Object mo97b(l41 l41Var) throws IOException {
        int iM2814I = l41Var.m2814I();
        int iM5702u = vi0.m5702u(iM2814I);
        if (iM5702u == 5 || iM5702u == 6) {
            return hk1.m2202a(this.f1710a, l41Var);
        }
        if (iM5702u == 8) {
            l41Var.m2810E();
            return null;
        }
        um2.m5518h("Expecting number, got: ", vi0.m5705x(iM2814I), "; at path ", l41Var.m2831o(false));
        return null;
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    public final void mo98c(o41 o41Var, Object obj) throws IOException {
        o41Var.m3486B((Number) obj);
    }
}
