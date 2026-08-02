package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class te1 extends xs1 {

    /* JADX INFO: renamed from: l */
    public final g21 f10699l;

    /* JADX INFO: renamed from: m */
    public final jm2 f10700m;

    /* JADX INFO: renamed from: n */
    public final f21 f10701n;

    /* JADX INFO: renamed from: o */
    public final int f10702o;

    public te1(g21 g21Var, jm2 jm2Var, f21 f21Var, f21 f21Var2, int i) {
        super(4, 12);
        if (g21Var == null) {
            um2.m5516f("type == null");
            throw null;
        }
        if (f21Var == null) {
            um2.m5516f("firstItem == null");
            throw null;
        }
        if (f21Var2 == null) {
            um2.m5516f("lastItem == null");
            throw null;
        }
        if (i <= 0) {
            C0676s.m4651j("itemCount <= 0");
            throw null;
        }
        this.f10699l = g21Var;
        this.f10700m = jm2Var;
        this.f10701n = f21Var;
        this.f10702o = i;
    }

    /* JADX INFO: renamed from: l */
    public static void m5244l(jm2[] jm2VarArr, eh1 eh1Var) {
        if (jm2VarArr == null) {
            um2.m5516f("sections == null");
            return;
        }
        if (eh1Var.f2442f.size() != 0) {
            C0676s.m4651j("mapSection.items().size() != 0");
            return;
        }
        ArrayList arrayList = new ArrayList(50);
        for (jm2 jm2Var : jm2VarArr) {
            int i = 0;
            g21 g21Var = null;
            f21 f21Var = null;
            f21 f21Var2 = null;
            for (f21 f21Var3 : jm2Var.mo398c()) {
                g21 g21VarMo69b = f21Var3.mo69b();
                if (g21VarMo69b != g21Var) {
                    if (i != 0) {
                        arrayList.add(new te1(g21Var, jm2Var, f21Var, f21Var2, i));
                    }
                    i = 0;
                    f21Var = f21Var3;
                    g21Var = g21VarMo69b;
                }
                i++;
                f21Var2 = f21Var3;
            }
            if (i != 0) {
                arrayList.add(new te1(g21Var, jm2Var, f21Var, f21Var2, i));
            } else if (jm2Var == eh1Var) {
                arrayList.add(new te1(eh1Var));
            }
        }
        eh1Var.m1353k(new y73(g21.TYPE_MAP_LIST, arrayList));
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: b */
    public final g21 mo69b() {
        return g21.TYPE_MAP_ITEM;
    }

    @Override // p000.xs1
    /* JADX INFO: renamed from: k */
    public final void mo1532k(z70 z70Var, C0929yn c0929yn) {
        g21 g21Var = this.f10699l;
        int i = g21Var.f3282h;
        f21 f21Var = this.f10701n;
        jm2 jm2Var = this.f10700m;
        int iM2516b = f21Var == null ? jm2Var.m2516b() : jm2Var.mo1349a(f21Var);
        boolean zM6293d = c0929yn.m6293d();
        int i2 = this.f10702o;
        if (zM6293d) {
            c0929yn.m6292c(m6178g() + ' ' + g21Var.f3283i + " map", 0);
            StringBuilder sb = new StringBuilder("  type:   ");
            sb.append(pp0.m3898J(i));
            sb.append(" // ");
            sb.append(g21Var.toString());
            c0929yn.m6292c(sb.toString(), 2);
            c0929yn.m6292c("  unused: 0", 2);
            c0929yn.m6292c("  size:   ".concat(pp0.m3899K(i2)), 4);
            c0929yn.m6292c("  offset: ".concat(pp0.m3899K(iM2516b)), 4);
        }
        c0929yn.m6299k(i);
        c0929yn.m6299k(0);
        c0929yn.m6298j(i2);
        c0929yn.m6298j(iM2516b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(te1.class.getName());
        sb.append('{');
        sb.append(this.f10700m.toString());
        sb.append(' ');
        return hk1.m2210i(sb, this.f10699l.f3284j, '}');
    }

    public te1(eh1 eh1Var) {
        super(4, 12);
        if (eh1Var != null) {
            this.f10699l = g21.TYPE_MAP_LIST;
            this.f10700m = eh1Var;
            this.f10701n = null;
            this.f10702o = 1;
            return;
        }
        um2.m5516f("section == null");
        throw null;
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: a */
    public final void mo68a(z70 z70Var) {
    }
}
