package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class q31 extends q43 {
    public static final q31 a = new q31();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private q31() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static k31 d(int i, l41 l41Var) throws IOException {
        int iU = vi0.u(i);
        if (iU == 5) {
            return new j41(l41Var.G());
        }
        if (iU == 6) {
            return new j41(new i71(l41Var.G()));
        }
        if (iU == 7) {
            return new j41(Boolean.valueOf(l41Var.t()));
        }
        if (iU == 8) {
            l41Var.E();
            return a41.h;
        }
        s.l("Unexpected token: ".concat(vi0.x(i)));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void e(o41 o41Var, k31 k31Var) throws IOException {
        if (k31Var == null || (k31Var instanceof a41)) {
            o41Var.p();
            return;
        }
        if (k31Var instanceof j41) {
            j41 j41Var = (j41) k31Var;
            Serializable serializable = j41Var.h;
            if (serializable instanceof Number) {
                o41Var.B(j41Var.c());
                return;
            } else if (serializable instanceof Boolean) {
                o41Var.E(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(j41Var.a()));
                return;
            } else {
                o41Var.D(j41Var.a());
                return;
            }
        }
        boolean z = k31Var instanceof a31;
        if (z) {
            o41Var.c();
            if (!z) {
                c80.m("Not a JSON Array: ", k31Var);
                return;
            }
            Iterator it = ((a31) k31Var).h.iterator();
            while (it.hasNext()) {
                e(o41Var, (k31) it.next());
            }
            o41Var.h();
            return;
        }
        boolean z2 = k31Var instanceof e41;
        if (!z2) {
            throw new IllegalArgumentException("Couldn't write " + k31Var.getClass());
        }
        o41Var.e();
        if (!z2) {
            c80.m("Not a JSON Object: ", k31Var);
            return;
        }
        Iterator it2 = ((kb1) ((e41) k31Var).h.entrySet()).iterator();
        while (((jb1) it2).hasNext()) {
            lb1 lb1VarB = ((jb1) it2).b();
            o41Var.k((String) lb1VarB.getKey());
            e(o41Var, (k31) lb1VarB.getValue());
        }
        o41Var.j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final Object b(l41 l41Var) throws IOException {
        k31 a31Var;
        k31 a31Var2;
        int I = l41Var.I();
        int iU = vi0.u(I);
        if (iU == 0) {
            l41Var.b();
            a31Var = new a31();
        } else if (iU != 2) {
            a31Var = null;
        } else {
            l41Var.c();
            a31Var = new e41();
        }
        if (a31Var == null) {
            return d(I, l41Var);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (l41Var.p()) {
                String strB = a31Var instanceof e41 ? l41Var.B() : null;
                int I2 = l41Var.I();
                int iU2 = vi0.u(I2);
                if (iU2 == 0) {
                    l41Var.b();
                    a31Var2 = new a31();
                } else if (iU2 != 2) {
                    a31Var2 = null;
                } else {
                    l41Var.c();
                    a31Var2 = new e41();
                }
                boolean z = a31Var2 != null;
                if (a31Var2 == null) {
                    a31Var2 = d(I2, l41Var);
                }
                if (a31Var instanceof a31) {
                    ((a31) a31Var).h.add(a31Var2);
                } else {
                    ((e41) a31Var).h.put(strB, a31Var2);
                }
                if (z) {
                    arrayDeque.addLast(a31Var);
                    a31Var = a31Var2;
                }
            } else {
                if (a31Var instanceof a31) {
                    l41Var.h();
                } else {
                    l41Var.j();
                }
                if (arrayDeque.isEmpty()) {
                    return a31Var;
                }
                a31Var = (k31) arrayDeque.removeLast();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final /* bridge */ /* synthetic */ void c(o41 o41Var, Object obj) throws IOException {
        e(o41Var, (k31) obj);
    }
}
