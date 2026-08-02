package p000;

import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wg1 extends ag1 {
    @Override // p000.f21
    /* JADX INFO: renamed from: a */
    public final void mo68a(z70 z70Var) {
        ((b42) z70Var.f13758i).m404p(this.f3733i);
        ((b42) z70Var.f13757h).m403o(this.f191j.f6456i.f7459h);
        b42 b42Var = (b42) z70Var.f13759j;
        d42 d42Var = ((n30) this.f191j).f6977j;
        synchronized (b42Var) {
            if (d42Var == null) {
                throw new NullPointerException("prototype == null");
            }
            b42Var.m2519g();
            if (((a42) ((TreeMap) b42Var.f555g).get(d42Var)) == null) {
                ((TreeMap) b42Var.f555g).put(d42Var, new a42(d42Var));
            }
        }
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: b */
    public final g21 mo69b() {
        return g21.TYPE_METHOD_ID_ITEM;
    }

    @Override // p000.ag1
    /* JADX INFO: renamed from: h */
    public final int mo163h(z70 z70Var) {
        b42 b42Var = (b42) z70Var.f13759j;
        d42 d42Var = ((n30) this.f191j).f6977j;
        if (d42Var == null) {
            b42Var.getClass();
            um2.m5516f("prototype == null");
            return 0;
        }
        b42Var.m2518f();
        a42 a42Var = (a42) ((TreeMap) b42Var.f555g).get(d42Var);
        if (a42Var != null) {
            return a42Var.m2415e();
        }
        C0676s.m4651j("not found");
        return 0;
    }

    @Override // p000.ag1
    /* JADX INFO: renamed from: i */
    public final String mo164i() {
        return "proto_idx";
    }
}
