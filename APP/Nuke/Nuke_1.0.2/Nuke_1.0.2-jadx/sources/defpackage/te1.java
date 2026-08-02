package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class te1 extends xs1 {
    public final g21 l;
    public final jm2 m;
    public final f21 n;
    public final int o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public te1(g21 g21Var, jm2 jm2Var, f21 f21Var, f21 f21Var2, int i) {
        super(4, 12);
        if (g21Var == null) {
            um2.f("type == null");
            throw null;
        }
        if (f21Var == null) {
            um2.f("firstItem == null");
            throw null;
        }
        if (f21Var2 == null) {
            um2.f("lastItem == null");
            throw null;
        }
        if (i <= 0) {
            s.j("itemCount <= 0");
            throw null;
        }
        this.l = g21Var;
        this.m = jm2Var;
        this.n = f21Var;
        this.o = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void l(jm2[] jm2VarArr, eh1 eh1Var) {
        if (jm2VarArr == null) {
            um2.f("sections == null");
            return;
        }
        if (eh1Var.f.size() != 0) {
            s.j("mapSection.items().size() != 0");
            return;
        }
        ArrayList arrayList = new ArrayList(50);
        for (jm2 jm2Var : jm2VarArr) {
            int i = 0;
            g21 g21Var = null;
            f21 f21Var = null;
            f21 f21Var2 = null;
            for (f21 f21Var3 : jm2Var.c()) {
                g21 g21VarB = f21Var3.b();
                if (g21VarB != g21Var) {
                    if (i != 0) {
                        arrayList.add(new te1(g21Var, jm2Var, f21Var, f21Var2, i));
                    }
                    i = 0;
                    f21Var = f21Var3;
                    g21Var = g21VarB;
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
        eh1Var.k(new y73(g21.TYPE_MAP_LIST, arrayList));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final g21 b() {
        return g21.TYPE_MAP_ITEM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xs1
    public final void k(z70 z70Var, yn ynVar) {
        g21 g21Var = this.l;
        int i = g21Var.h;
        f21 f21Var = this.n;
        jm2 jm2Var = this.m;
        int iB = f21Var == null ? jm2Var.b() : jm2Var.a(f21Var);
        boolean zD = ynVar.d();
        int i2 = this.o;
        if (zD) {
            ynVar.c(g() + ' ' + g21Var.i + " map", 0);
            StringBuilder sb = new StringBuilder("  type:   ");
            sb.append(pp0.J(i));
            sb.append(" // ");
            sb.append(g21Var.toString());
            ynVar.c(sb.toString(), 2);
            ynVar.c("  unused: 0", 2);
            ynVar.c("  size:   ".concat(pp0.K(i2)), 4);
            ynVar.c("  offset: ".concat(pp0.K(iB)), 4);
        }
        ynVar.k(i);
        ynVar.k(0);
        ynVar.j(i2);
        ynVar.j(iB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(te1.class.getName());
        sb.append('{');
        sb.append(this.m.toString());
        sb.append(' ');
        return hk1.i(sb, this.l.j, '}');
    }

    public te1(eh1 eh1Var) {
        super(4, 12);
        if (eh1Var != null) {
            this.l = g21.TYPE_MAP_LIST;
            this.m = eh1Var;
            this.n = null;
            this.o = 1;
            return;
        }
        um2.f("section == null");
        throw null;
    }

    @Override // defpackage.f21
    public final void a(z70 z70Var) {
    }
}
