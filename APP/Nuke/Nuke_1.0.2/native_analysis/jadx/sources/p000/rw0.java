package p000;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rw0 implements jh1 {

    /* JADX INFO: renamed from: b */
    public static final mv1 f9773b = mv1.m3211a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* JADX INFO: renamed from: a */
    public final hh1 f9774a;

    public rw0(hh1 hh1Var) {
        this.f9774a = hh1Var;
    }

    @Override // p000.jh1
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo235a(Object obj) {
        return true;
    }

    @Override // p000.jh1
    /* JADX INFO: renamed from: b */
    public final ih1 mo236b(Object obj, int i, int i2, ov1 ov1Var) {
        cq0 cq0Var = (cq0) obj;
        hh1 hh1Var = this.f9774a;
        if (hh1Var != null) {
            fh1 fh1Var = (fh1) hh1Var.f4019i;
            gh1 gh1VarM1923a = gh1.m1923a(cq0Var);
            Object objM5869c = fh1Var.m5869c(gh1VarM1923a);
            ArrayDeque arrayDeque = gh1.f3527b;
            synchronized (arrayDeque) {
                arrayDeque.offer(gh1VarM1923a);
            }
            cq0 cq0Var2 = (cq0) objM5869c;
            if (cq0Var2 == null) {
                fh1Var.m5871f(gh1.m1923a(cq0Var), cq0Var);
            } else {
                cq0Var = cq0Var2;
            }
        }
        return new ih1(cq0Var, new zw0(cq0Var, ((Integer) ov1Var.m3643c(f9773b)).intValue()));
    }
}
