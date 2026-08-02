package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fm1 {
    public final iz a;
    public final km1 b = new km1();
    public final LinkedHashSet c;
    public final LinkedHashSet d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public fm1(iz izVar) {
        this.a = izVar;
        new LinkedHashSet();
        this.c = new LinkedHashSet();
        this.d = new LinkedHashSet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(fm1 fm1Var, hm1 hm1Var) {
        fm1Var.getClass();
        hm1Var.getClass();
        if (fm1Var.c.add(hm1Var)) {
            km1 km1Var = fm1Var.b;
            km1Var.getClass();
            if (hm1Var.c != null) {
                c80.n("Handler '", hm1Var, "' is already registered with a dispatcher");
                return;
            }
            km1Var.e.addFirst(hm1Var);
            hm1Var.c = fm1Var;
            km1Var.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(jm1 jm1Var) {
        if (this.d.add(jm1Var)) {
            this.b.a(this, jm1Var, -1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(ht1 ht1Var, int i) {
        if (i != 1 && i != 0) {
            s.c(vi0.g("Unsupported priority value: ", i));
        } else if (this.d.add(ht1Var)) {
            this.b.a(this, ht1Var, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(jm1 jm1Var, em1 em1Var) {
        km1 km1Var = this.b;
        km1Var.getClass();
        if (km1Var.g != 0) {
            return;
        }
        hm1 hm1VarC = km1Var.c(-1);
        km1Var.f = hm1VarC;
        km1Var.g = -1;
        km1Var.h = jm1Var;
        if (em1Var != null) {
            if (hm1VarC != null) {
                hm1VarC.d(em1Var);
            }
            ju2 ju2Var = km1Var.a;
            mm1 mm1Var = new mm1(em1Var);
            ju2Var.getClass();
            ju2Var.h(null, mm1Var);
        }
    }
}
