package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y73 extends xs1 {
    public final g21 l;
    public final ArrayList m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public y73(g21 g21Var, ArrayList arrayList) {
        int iL = l(arrayList);
        xs1 xs1Var = (xs1) arrayList.get(0);
        super(iL, l(arrayList) + (xs1Var.c() * arrayList.size()));
        if (g21Var == null) {
            um2.f("itemType == null");
            throw null;
        }
        this.m = arrayList;
        this.l = g21Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int l(ArrayList arrayList) {
        try {
            return Math.max(4, ((xs1) arrayList.get(0)).h);
        } catch (IndexOutOfBoundsException unused) {
            s.j("items.size() == 0");
            return 0;
        } catch (NullPointerException unused2) {
            um2.f("items == null");
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final void a(z70 z70Var) {
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((xs1) it.next()).a(z70Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final g21 b() {
        return this.l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xs1
    public final void i(eh1 eh1Var, int i) {
        int iH = i + this.h;
        boolean z = true;
        int i2 = -1;
        int i3 = -1;
        for (xs1 xs1Var : this.m) {
            int iC = xs1Var.c();
            int i4 = xs1Var.h;
            if (z) {
                z = false;
                i2 = iC;
                i3 = i4;
            } else if (iC != i2) {
                c80.t("item size mismatch");
                return;
            } else if (i4 != i3) {
                c80.t("item alignment mismatch");
                return;
            }
            iH = xs1Var.h(eh1Var, iH) + iC;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xs1
    public final void k(z70 z70Var, yn ynVar) {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        if (ynVar.d()) {
            ynVar.c(g() + " " + this.l.j, 0);
            ynVar.c("  size: ".concat(pp0.K(size)), 4);
        }
        ynVar.j(size);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((xs1) it.next()).d(z70Var, ynVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(y73.class.getName());
        sb.append(this.m);
        return sb.toString();
    }
}
