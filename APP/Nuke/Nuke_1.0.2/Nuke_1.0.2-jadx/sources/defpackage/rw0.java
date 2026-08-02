package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rw0 implements jh1 {
    public static final mv1 b = mv1.a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    public final hh1 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public rw0(hh1 hh1Var) {
        this.a = hh1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jh1
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jh1
    public final ih1 b(Object obj, int i, int i2, ov1 ov1Var) {
        cq0 cq0Var = (cq0) obj;
        hh1 hh1Var = this.a;
        if (hh1Var != null) {
            fh1 fh1Var = (fh1) hh1Var.i;
            gh1 gh1VarA = gh1.a(cq0Var);
            Object objC = fh1Var.c(gh1VarA);
            ArrayDeque arrayDeque = gh1.b;
            synchronized (arrayDeque) {
                arrayDeque.offer(gh1VarA);
            }
            cq0 cq0Var2 = (cq0) objC;
            if (cq0Var2 == null) {
                fh1Var.f(gh1.a(cq0Var), cq0Var);
            } else {
                cq0Var = cq0Var2;
            }
        }
        return new ih1(cq0Var, new zw0(cq0Var, ((Integer) ov1Var.c(b)).intValue()));
    }
}
