package p000;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class q31 extends q43 {

    /* JADX INFO: renamed from: a */
    public static final q31 f8716a = new q31();

    private q31() {
    }

    /* JADX INFO: renamed from: d */
    public static k31 m4049d(int i, l41 l41Var) throws IOException {
        int iM5702u = vi0.m5702u(i);
        if (iM5702u == 5) {
            return new j41(l41Var.m2812G());
        }
        if (iM5702u == 6) {
            return new j41(new i71(l41Var.m2812G()));
        }
        if (iM5702u == 7) {
            return new j41(Boolean.valueOf(l41Var.m2835t()));
        }
        if (iM5702u == 8) {
            l41Var.m2810E();
            return a41.f49h;
        }
        C0676s.m4653l("Unexpected token: ".concat(vi0.m5705x(i)));
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static void m4050e(o41 o41Var, k31 k31Var) throws IOException {
        if (k31Var == null || (k31Var instanceof a41)) {
            o41Var.m3498p();
            return;
        }
        if (k31Var instanceof j41) {
            j41 j41Var = (j41) k31Var;
            Serializable serializable = j41Var.f4889h;
            if (serializable instanceof Number) {
                o41Var.m3486B(j41Var.m2434c());
                return;
            } else if (serializable instanceof Boolean) {
                o41Var.m3488E(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(j41Var.mo25a()));
                return;
            } else {
                o41Var.m3487D(j41Var.mo25a());
                return;
            }
        }
        boolean z = k31Var instanceof a31;
        if (z) {
            o41Var.m3491c();
            if (!z) {
                c80.m669m("Not a JSON Array: ", k31Var);
                return;
            }
            Iterator it = ((a31) k31Var).f43h.iterator();
            while (it.hasNext()) {
                m4050e(o41Var, (k31) it.next());
            }
            o41Var.m3494h();
            return;
        }
        boolean z2 = k31Var instanceof e41;
        if (!z2) {
            throw new IllegalArgumentException("Couldn't write " + k31Var.getClass());
        }
        o41Var.m3492e();
        if (!z2) {
            c80.m669m("Not a JSON Object: ", k31Var);
            return;
        }
        Iterator it2 = ((kb1) ((e41) k31Var).f2304h.entrySet()).iterator();
        while (((jb1) it2).hasNext()) {
            lb1 lb1VarM2476b = ((jb1) it2).m2476b();
            o41Var.m3496k((String) lb1VarM2476b.getKey());
            m4050e(o41Var, (k31) lb1VarM2476b.getValue());
        }
        o41Var.m3495j();
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    public final Object mo97b(l41 l41Var) throws IOException {
        k31 a31Var;
        k31 a31Var2;
        int iM2814I = l41Var.m2814I();
        int iM5702u = vi0.m5702u(iM2814I);
        if (iM5702u == 0) {
            l41Var.m2824b();
            a31Var = new a31();
        } else if (iM5702u != 2) {
            a31Var = null;
        } else {
            l41Var.m2825c();
            a31Var = new e41();
        }
        if (a31Var == null) {
            return m4049d(iM2814I, l41Var);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (l41Var.m2832p()) {
                String strM2808B = a31Var instanceof e41 ? l41Var.m2808B() : null;
                int iM2814I2 = l41Var.m2814I();
                int iM5702u2 = vi0.m5702u(iM2814I2);
                if (iM5702u2 == 0) {
                    l41Var.m2824b();
                    a31Var2 = new a31();
                } else if (iM5702u2 != 2) {
                    a31Var2 = null;
                } else {
                    l41Var.m2825c();
                    a31Var2 = new e41();
                }
                boolean z = a31Var2 != null;
                if (a31Var2 == null) {
                    a31Var2 = m4049d(iM2814I2, l41Var);
                }
                if (a31Var instanceof a31) {
                    ((a31) a31Var).f43h.add(a31Var2);
                } else {
                    ((e41) a31Var).f2304h.put(strM2808B, a31Var2);
                }
                if (z) {
                    arrayDeque.addLast(a31Var);
                    a31Var = a31Var2;
                }
            } else {
                if (a31Var instanceof a31) {
                    l41Var.m2828h();
                } else {
                    l41Var.m2829j();
                }
                if (arrayDeque.isEmpty()) {
                    return a31Var;
                }
                a31Var = (k31) arrayDeque.removeLast();
            }
        }
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo98c(o41 o41Var, Object obj) throws IOException {
        m4050e(o41Var, (k31) obj);
    }
}
