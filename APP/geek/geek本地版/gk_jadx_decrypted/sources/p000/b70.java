package p000;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b70 {

    /* JADX INFO: renamed from: a */
    public HashMap f774a;

    /* JADX INFO: renamed from: b */
    public double f775b;

    /* JADX INFO: renamed from: c */
    public double f776c;

    /* JADX INFO: renamed from: a */
    public static b70 m539a(double d, double d2) {
        C0492mo c0492moM1852a = C0492mo.m1852a(d, d2, 50.0d);
        double dAbs = Math.abs(c0492moM1852a.f3268a - d2);
        for (double d3 = 1.0d; d3 < 50.0d && Math.round(d2) != Math.round(c0492moM1852a.f3268a); d3 += 1.0d) {
            C0492mo c0492moM1852a2 = C0492mo.m1852a(d, d2, 50.0d + d3);
            double dAbs2 = Math.abs(c0492moM1852a2.f3268a - d2);
            if (dAbs2 < dAbs) {
                dAbs = dAbs2;
                c0492moM1852a = c0492moM1852a2;
            }
            C0492mo c0492moM1852a3 = C0492mo.m1852a(d, d2, 50.0d - d3);
            double dAbs3 = Math.abs(c0492moM1852a3.f3268a - d2);
            if (dAbs3 < dAbs) {
                dAbs = dAbs3;
                c0492moM1852a = c0492moM1852a3;
            }
        }
        b70 b70Var = new b70();
        b70Var.f774a = new HashMap();
        b70Var.f775b = d;
        b70Var.f776c = d2;
        return b70Var;
    }

    /* JADX INFO: renamed from: b */
    public final int m540b(int i) {
        HashMap map = this.f774a;
        Integer numValueOf = (Integer) map.get(Integer.valueOf(i));
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(C0492mo.m1852a(this.f775b, this.f776c, i).f3269b);
            map.put(Integer.valueOf(i), numValueOf);
        }
        return numValueOf.intValue();
    }
}
