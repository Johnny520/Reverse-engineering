package p000;

import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fm1 {

    /* JADX INFO: renamed from: a */
    public final C0330iz f3055a;

    /* JADX INFO: renamed from: b */
    public final km1 f3056b = new km1();

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f3057c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f3058d;

    public fm1(C0330iz c0330iz) {
        this.f3055a = c0330iz;
        new LinkedHashSet();
        this.f3057c = new LinkedHashSet();
        this.f3058d = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: a */
    public static void m1662a(fm1 fm1Var, hm1 hm1Var) {
        fm1Var.getClass();
        hm1Var.getClass();
        if (fm1Var.f3057c.add(hm1Var)) {
            km1 km1Var = fm1Var.f3056b;
            km1Var.getClass();
            if (hm1Var.f4079c != null) {
                c80.m670n("Handler '", hm1Var, "' is already registered with a dispatcher");
                return;
            }
            km1Var.f5641e.addFirst(hm1Var);
            hm1Var.f4079c = fm1Var;
            km1Var.m2724b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1663b(jm1 jm1Var) {
        if (this.f3058d.add(jm1Var)) {
            this.f3056b.m2723a(this, jm1Var, -1);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1664c(ht1 ht1Var, int i) {
        if (i != 1 && i != 0) {
            C0676s.m4645c(vi0.m5688g("Unsupported priority value: ", i));
        } else if (this.f3058d.add(ht1Var)) {
            this.f3056b.m2723a(this, ht1Var, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1665d(jm1 jm1Var, em1 em1Var) {
        km1 km1Var = this.f3056b;
        km1Var.getClass();
        if (km1Var.f5643g != 0) {
            return;
        }
        hm1 hm1VarM2725c = km1Var.m2725c(-1);
        km1Var.f5642f = hm1VarM2725c;
        km1Var.f5643g = -1;
        km1Var.f5644h = jm1Var;
        if (em1Var != null) {
            if (hm1VarM2725c != null) {
                hm1VarM2725c.mo1359d(em1Var);
            }
            ju2 ju2Var = km1Var.f5637a;
            mm1 mm1Var = new mm1(em1Var);
            ju2Var.getClass();
            ju2Var.m2576h(null, mm1Var);
        }
    }
}
