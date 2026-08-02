package defpackage;

import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wg1 extends ag1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final void a(z70 z70Var) {
        ((b42) z70Var.i).p(this.i);
        ((b42) z70Var.h).o(this.j.i.h);
        b42 b42Var = (b42) z70Var.j;
        d42 d42Var = ((n30) this.j).j;
        synchronized (b42Var) {
            if (d42Var == null) {
                throw new NullPointerException("prototype == null");
            }
            b42Var.g();
            if (((a42) ((TreeMap) b42Var.g).get(d42Var)) == null) {
                ((TreeMap) b42Var.g).put(d42Var, new a42(d42Var));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final g21 b() {
        return g21.TYPE_METHOD_ID_ITEM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ag1
    public final int h(z70 z70Var) {
        b42 b42Var = (b42) z70Var.j;
        d42 d42Var = ((n30) this.j).j;
        if (d42Var == null) {
            b42Var.getClass();
            um2.f("prototype == null");
            return 0;
        }
        b42Var.f();
        a42 a42Var = (a42) ((TreeMap) b42Var.g).get(d42Var);
        if (a42Var != null) {
            return a42Var.e();
        }
        s.j("not found");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ag1
    public final String i() {
        return "proto_idx";
    }
}
