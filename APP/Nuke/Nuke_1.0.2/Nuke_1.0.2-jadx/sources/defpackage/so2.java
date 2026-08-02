package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public interface so2 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default void a(in0 in0Var, in0 in0Var2) {
        if (this instanceof ro2) {
            in0Var.j(((ro2) this).a);
        } else if (this instanceof qo2) {
            in0Var2.j(((qo2) this).a);
        } else {
            c80.s();
        }
    }
}
