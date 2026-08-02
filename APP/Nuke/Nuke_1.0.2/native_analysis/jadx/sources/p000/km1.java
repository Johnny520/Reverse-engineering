package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class km1 {

    /* JADX INFO: renamed from: a */
    public final ju2 f5637a = pp0.m3908f(lm1.f6196f);

    /* JADX INFO: renamed from: b */
    public final ju2 f5638b;

    /* JADX INFO: renamed from: c */
    public final m52 f5639c;

    /* JADX INFO: renamed from: d */
    public final C0017ag f5640d;

    /* JADX INFO: renamed from: e */
    public final C0017ag f5641e;

    /* JADX INFO: renamed from: f */
    public hm1 f5642f;

    /* JADX INFO: renamed from: g */
    public int f5643g;

    /* JADX INFO: renamed from: h */
    public jm1 f5644h;

    /* JADX INFO: renamed from: i */
    public final LinkedHashSet f5645i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashSet f5646j;

    /* JADX INFO: renamed from: k */
    public final LinkedHashSet f5647k;

    /* JADX INFO: renamed from: l */
    public boolean f5648l;

    /* JADX INFO: renamed from: m */
    public boolean f5649m;

    /* JADX INFO: renamed from: n */
    public boolean f5650n;

    public km1() {
        ju2 ju2VarM3908f = pp0.m3908f(new im1());
        this.f5638b = ju2VarM3908f;
        this.f5639c = new m52(ju2VarM3908f, null);
        this.f5640d = new C0017ag();
        this.f5641e = new C0017ag();
        this.f5645i = new LinkedHashSet();
        this.f5646j = new LinkedHashSet();
        this.f5647k = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: a */
    public final void m2723a(fm1 fm1Var, jm1 jm1Var, int i) {
        fm1Var.getClass();
        if (jm1Var.f5105a == null) {
            (i != 0 ? i != 1 ? this.f5645i : this.f5646j : this.f5647k).add(jm1Var);
            jm1Var.f5105a = fm1Var;
            ((im1) this.f5639c.f6484h.getValue()).getClass();
            jm1Var.mo2230b(i != 0 ? i != 1 ? this.f5650n : this.f5648l : this.f5649m);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(jm1Var);
        fm1 fm1Var2 = jm1Var.f5105a;
        sb.append("' is already added to dispatcher ");
        sb.append(fm1Var2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: b */
    public final void m2724b() {
        boolean z;
        boolean z2;
        im1 im1Var;
        C0017ag c0017ag = this.f5640d;
        if (c0017ag == null || !c0017ag.isEmpty()) {
            Iterator it = c0017ag.iterator();
            while (it.hasNext()) {
                if (((hm1) it.next()).f4078b) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        C0017ag c0017ag2 = this.f5641e;
        if (c0017ag2 == null || !c0017ag2.isEmpty()) {
            Iterator it2 = c0017ag2.iterator();
            while (it2.hasNext()) {
                if (((hm1) it2.next()).f4078b) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        boolean z3 = z || z2;
        boolean z4 = this.f5649m != z;
        boolean z5 = this.f5648l != z2;
        boolean z6 = this.f5650n != z3;
        LinkedHashSet linkedHashSet = this.f5647k;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((jm1) it3.next()).mo2230b(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.f5646j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((jm1) it4.next()).mo2230b(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.f5645i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((jm1) it5.next()).mo2230b(z3);
            }
        }
        this.f5649m = z;
        this.f5648l = z2;
        this.f5650n = z3;
        hm1 hm1VarM2725c = this.f5642f;
        if (hm1VarM2725c == null) {
            hm1VarM2725c = m2725c(0);
        }
        hm1 hm1VarM2725c2 = this.f5642f;
        if (hm1VarM2725c2 == null) {
            hm1VarM2725c2 = m2725c(0);
        }
        if (t11.m5086l(hm1VarM2725c2, hm1VarM2725c)) {
            if (hm1VarM2725c2 == null) {
                im1Var = new im1();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = c0017ag.iterator();
                while (it6.hasNext()) {
                    boolean z7 = ((hm1) it6.next()).f4078b;
                }
                Iterator<E> it7 = c0017ag2.iterator();
                while (it7.hasNext()) {
                    boolean z8 = ((hm1) it7.next()).f4078b;
                }
                t11 t11Var = hm1VarM2725c2.f4077a;
                pb1 pb1VarM1424E = AbstractC0179eu.m1424E();
                AbstractC0325iu.m2393g0(arrayList, pb1VarM1424E);
                pb1VarM1424E.add(t11Var);
                AbstractC0325iu.m2393g0(be0.f819h, pb1VarM1424E);
                im1Var = new im1(arrayList.size(), AbstractC0179eu.m1476z(pb1VarM1424E));
            }
            ju2 ju2Var = this.f5638b;
            if (t11.m5086l((im1) ju2Var.getValue(), im1Var)) {
                return;
            }
            ju2Var.m2576h(null, im1Var);
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

    /* JADX INFO: renamed from: c */
    public final hm1 m2725c(int i) {
        Object next;
        Object next2;
        C0017ag c0017ag = this.f5641e;
        C0017ag c0017ag2 = this.f5640d;
        Object obj = null;
        if (i == -1) {
            Iterator it = c0017ag2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((hm1) next).f4078b) {
                    break;
                }
            }
            hm1 hm1Var = (hm1) next;
            if (hm1Var != null) {
                return hm1Var;
            }
            Iterator it2 = c0017ag.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next3 = it2.next();
                if (((hm1) next3).f4078b) {
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
            Iterator it3 = c0017ag2.iterator();
            while (it3.hasNext()) {
                ((hm1) it3.next()).getClass();
            }
            Iterator it4 = c0017ag.iterator();
            while (it4.hasNext()) {
                ((hm1) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = c0017ag2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it5.next();
            if (((hm1) next2).f4078b) {
                break;
            }
        }
        hm1 hm1Var2 = (hm1) next2;
        if (hm1Var2 != null) {
            return hm1Var2;
        }
        Iterator it6 = c0017ag.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next4 = it6.next();
            if (((hm1) next4).f4078b) {
                obj = next4;
                break;
            }
        }
        return (hm1) obj;
    }
}
