package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class km1 {
    public final ju2 a = pp0.f(lm1.f);
    public final ju2 b;
    public final m52 c;
    public final ag d;
    public final ag e;
    public hm1 f;
    public int g;
    public jm1 h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public km1() {
        ju2 ju2VarF = pp0.f(new im1());
        this.b = ju2VarF;
        this.c = new m52(ju2VarF, null);
        this.d = new ag();
        this.e = new ag();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(fm1 fm1Var, jm1 jm1Var, int i) {
        fm1Var.getClass();
        if (jm1Var.a == null) {
            (i != 0 ? i != 1 ? this.i : this.j : this.k).add(jm1Var);
            jm1Var.a = fm1Var;
            ((im1) this.c.h.getValue()).getClass();
            jm1Var.b(i != 0 ? i != 1 ? this.n : this.l : this.m);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(jm1Var);
        fm1 fm1Var2 = jm1Var.a;
        sb.append("' is already added to dispatcher ");
        sb.append(fm1Var2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        boolean z;
        boolean z2;
        im1 im1Var;
        ag agVar = this.d;
        if (agVar == null || !agVar.isEmpty()) {
            Iterator it = agVar.iterator();
            while (it.hasNext()) {
                if (((hm1) it.next()).b) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        ag agVar2 = this.e;
        if (agVar2 == null || !agVar2.isEmpty()) {
            Iterator it2 = agVar2.iterator();
            while (it2.hasNext()) {
                if (((hm1) it2.next()).b) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        boolean z3 = z || z2;
        boolean z4 = this.m != z;
        boolean z5 = this.l != z2;
        boolean z6 = this.n != z3;
        LinkedHashSet linkedHashSet = this.k;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((jm1) it3.next()).b(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((jm1) it4.next()).b(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((jm1) it5.next()).b(z3);
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        hm1 hm1VarC = this.f;
        if (hm1VarC == null) {
            hm1VarC = c(0);
        }
        hm1 hm1VarC2 = this.f;
        if (hm1VarC2 == null) {
            hm1VarC2 = c(0);
        }
        if (t11.l(hm1VarC2, hm1VarC)) {
            if (hm1VarC2 == null) {
                im1Var = new im1();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = agVar.iterator();
                while (it6.hasNext()) {
                    boolean z7 = ((hm1) it6.next()).b;
                }
                Iterator<E> it7 = agVar2.iterator();
                while (it7.hasNext()) {
                    boolean z8 = ((hm1) it7.next()).b;
                }
                t11 t11Var = hm1VarC2.a;
                pb1 pb1VarE = eu.E();
                iu.g0(arrayList, pb1VarE);
                pb1VarE.add(t11Var);
                iu.g0(be0.h, pb1VarE);
                im1Var = new im1(arrayList.size(), eu.z(pb1VarE));
            }
            ju2 ju2Var = this.b;
            if (t11.l((im1) ju2Var.getValue(), im1Var)) {
                return;
            }
            ju2Var.h(null, im1Var);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((jm1) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((jm1) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((jm1) it10.next()).getClass();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final hm1 c(int i) {
        Object next;
        Object next2;
        ag agVar = this.e;
        ag agVar2 = this.d;
        Object obj = null;
        if (i == -1) {
            Iterator it = agVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((hm1) next).b) {
                    break;
                }
            }
            hm1 hm1Var = (hm1) next;
            if (hm1Var != null) {
                return hm1Var;
            }
            Iterator it2 = agVar.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next3 = it2.next();
                if (((hm1) next3).b) {
                    obj = next3;
                    break;
                }
            }
            return (hm1) obj;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = agVar2.iterator();
            while (it3.hasNext()) {
                ((hm1) it3.next()).getClass();
            }
            Iterator it4 = agVar.iterator();
            while (it4.hasNext()) {
                ((hm1) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = agVar2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it5.next();
            if (((hm1) next2).b) {
                break;
            }
        }
        hm1 hm1Var2 = (hm1) next2;
        if (hm1Var2 != null) {
            return hm1Var2;
        }
        Iterator it6 = agVar.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next4 = it6.next();
            if (((hm1) next4).b) {
                obj = next4;
                break;
            }
        }
        return (hm1) obj;
    }
}
