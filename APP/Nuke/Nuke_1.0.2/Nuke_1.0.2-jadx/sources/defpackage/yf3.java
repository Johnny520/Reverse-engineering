package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yf3 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean a(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(px pxVar, in0 in0Var) {
        ((go0) pxVar).b(new w1(in0Var), a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(px pxVar, mn0 mn0Var, Object obj) {
        if (((go0) pxVar).S || !t11.l(((go0) pxVar).L(), obj)) {
            go0 go0Var = (go0) pxVar;
            go0Var.f0(obj);
            go0Var.b(mn0Var, obj);
        }
    }
}
