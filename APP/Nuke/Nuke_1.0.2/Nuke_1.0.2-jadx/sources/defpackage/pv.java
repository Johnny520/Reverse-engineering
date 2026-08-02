package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class pv extends RuntimeException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pv(q92 q92Var) {
        StringBuilder sb = new StringBuilder("HTTP ");
        r92 r92Var = q92Var.a;
        sb.append(r92Var.k);
        sb.append(" ");
        sb.append(r92Var.j);
        super(sb.toString());
    }
}
