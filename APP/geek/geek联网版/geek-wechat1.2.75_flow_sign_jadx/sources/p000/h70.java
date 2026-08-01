package p000;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h70 {

    /* JADX INFO: renamed from: a */
    public HashMap f2130a;

    /* JADX INFO: renamed from: b */
    public double f2131b;

    /* JADX INFO: renamed from: c */
    public double f2132c;

    /* JADX INFO: renamed from: a */
    public static h70 m1359a(double d, double d2) {
        C0640qo c0640qoM2156a = C0640qo.m2156a(d, d2, 50.0d);
        double dAbs = Math.abs(c0640qoM2156a.f3928a - d2);
        for (double d3 = 1.0d; d3 < 50.0d && Math.round(d2) != Math.round(c0640qoM2156a.f3928a); d3 += 1.0d) {
            C0640qo c0640qoM2156a2 = C0640qo.m2156a(d, d2, 50.0d + d3);
            double dAbs2 = Math.abs(c0640qoM2156a2.f3928a - d2);
            if (dAbs2 < dAbs) {
                dAbs = dAbs2;
                c0640qoM2156a = c0640qoM2156a2;
            }
            C0640qo c0640qoM2156a3 = C0640qo.m2156a(d, d2, 50.0d - d3);
            double dAbs3 = Math.abs(c0640qoM2156a3.f3928a - d2);
            if (dAbs3 < dAbs) {
                dAbs = dAbs3;
                c0640qoM2156a = c0640qoM2156a3;
            }
        }
        h70 h70Var = new h70();
        h70Var.f2130a = new HashMap();
        h70Var.f2131b = d;
        h70Var.f2132c = d2;
        return h70Var;
    }

    /* JADX INFO: renamed from: b */
    public final int m1360b(int i) {
        HashMap map = this.f2130a;
        Integer numValueOf = (Integer) map.get(Integer.valueOf(i));
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(C0640qo.m2156a(this.f2131b, this.f2132c, i).f3929b);
            map.put(Integer.valueOf(i), numValueOf);
        }
        return numValueOf.intValue();
    }
}
