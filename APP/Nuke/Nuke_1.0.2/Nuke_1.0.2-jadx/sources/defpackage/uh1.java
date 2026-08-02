package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public interface uh1 {
    Object a(mn0 mn0Var, Object obj);

    boolean b(in0 in0Var);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default uh1 c(uh1 uh1Var) {
        return uh1Var == rh1.a ? this : new dv(this, uh1Var);
    }
}
