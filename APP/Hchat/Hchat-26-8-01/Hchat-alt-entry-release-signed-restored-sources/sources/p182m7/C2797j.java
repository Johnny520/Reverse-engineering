package p182m7;

import java.util.Iterator;
import p023b8.AbstractC0214l;
import p047d7.C0719b;
import p152k7.AbstractC2331a;
import p257r7.AbstractC3729s;
import p257r7.C3725o;
import p257r7.C3731u;
import p298u7.C4278a;
import p363y7.AbstractC5999a;
import p379z7.C6110f;
import p379z7.C6112h;

/* JADX INFO: renamed from: m7.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2797j extends AbstractC2796i {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2796i, p182m7.AbstractC2804q
    /* JADX INFO: renamed from: M */
    public final void mo6189M() {
        ((C2798k) this.f9062k).f9054n.mo6168Y();
        super.mo6189M();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2796i, p182m7.AbstractC2804q
    /* JADX INFO: renamed from: N */
    public final void mo6190N() {
        mo6185R().m6521N();
        C2798k c2798k = (C2798k) this.f9062k;
        c2798k.f9053m.m6521N();
        c2798k.f9057q.m6521N();
        c2798k.f9054n.mo6169Z();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2796i
    /* JADX INFO: renamed from: R */
    public final C0719b mo6185R() {
        return ((C2798k) this.f9062k).f9055o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public final C2808u m6196U(int i9) {
        C2808u c2808u;
        C2809v c2809v = ((C2798k) this.f9062k).f9053m;
        if (i9 == -1) {
            c2809v.getClass();
            return null;
        }
        C2797j c2797j = (C2797j) c2809v.m5554v(C2797j.class);
        c2797j.getClass();
        C2803p c2803p = new C2803p(c2797j);
        Iterator c6110f = !c2803p.hasNext() ? C6112h.f24664g : new C6110f(c2803p, C2797j.class, null);
        while (c6110f.hasNext()) {
            C2809v c2809v2 = ((C2798k) ((C2797j) c6110f.next()).f9062k).f9053m;
            if (i9 == -1) {
                c2809v2.getClass();
            } else {
                int size = c2809v2.f9926k.size();
                for (int i10 = 0; i10 < size; i10++) {
                    c2808u = (C2808u) c2809v2.m6524Q(i10);
                    if (i9 == c2808u.f9037p.f12083n) {
                        break;
                    }
                }
            }
            c2808u = null;
            if (c2808u != null) {
                return c2808u;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public final C2807t m6197V() {
        return ((C2798k) this.f9062k).f9054n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX INFO: renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2790c m6198W(String str) {
        String strM7746Q;
        boolean zEquals;
        C4278a c4278aM6176b0;
        C3725o c3725oM6165V;
        C2791d c2791d = m6197V().f9071w;
        int size = c2791d.f9926k.size();
        C2790c c2790c = null;
        for (int i9 = 0; i9 < size; i9++) {
            C2790c c2790c2 = (C2790c) c2791d.m6524Q(i9);
            c2790c2.getClass();
            int i10 = AbstractC0214l.f522a;
            int iIndexOf = str.indexOf(58);
            String strSubstring = iIndexOf > 0 ? str.substring(0, iIndexOf) : null;
            if (strSubstring == null) {
                String strM892a = AbstractC0214l.m892a(str);
                int iM5539s = AbstractC2331a.m5539s(c2790c2.f12076k, 4);
                if (c2790c2.mo6180g() != null) {
                    AbstractC3729s abstractC3729sM8600V = (iM5539s >= 0 && (c4278aM6176b0 = c2790c2.mo6180g()) != null) ? c4278aM6176b0.m8600V(iM5539s) : null;
                    if (abstractC3729sM8600V == null || (strM7746Q = abstractC3729sM8600V.f12101m) == null) {
                        strM7746Q = null;
                    } else {
                        C3731u c3731u = abstractC3729sM8600V.f12106q;
                        if (c3731u != null) {
                            strM7746Q = c3731u.m7746Q(strM7746Q, false);
                        }
                    }
                    zEquals = strM892a.equals(strM7746Q);
                }
            } else {
                C2808u c2808uM6175a0 = c2790c2.m6175a0();
                if (!strSubstring.equals((c2808uM6175a0 == null || (c3725oM6165V = c2808uM6175a0.m6165V(c2808uM6175a0.f9036o.f12083n)) == null) ? null : c3725oM6165V.f12101m)) {
                    zEquals = false;
                }
            }
            if (zEquals) {
                if (c2790c2.mo6174Z() == 0) {
                    return c2790c2;
                }
                c2790c = c2790c2;
            }
        }
        return c2790c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public final C2790c m6199X(int i9) {
        C2791d c2791d = m6197V().f9071w;
        if (i9 == 0) {
            c2791d.getClass();
            return null;
        }
        int size = c2791d.f9926k.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2790c c2790c = (C2790c) c2791d.m6524Q(i10);
            if (i9 == c2790c.mo6174Z()) {
                return c2790c;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2796i, p182m7.AbstractC2804q
    public final String toString() {
        m6194S();
        if (this.f9052l == null) {
            this.f9052l = new C2805r(this);
        }
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(m6197V().m6200c0(true));
        Iterator it = ((C2798k) this.f9062k).f9053m.f9926k.iterator();
        if (it.hasNext()) {
            sb2.append(' ');
            sb2.append(AbstractC5999a.m10745h(it));
        }
        Iterator itM10866b = m6197V().f9071w.f9926k.m10866b();
        if (itM10866b.hasNext()) {
            sb2.append(' ');
            sb2.append(AbstractC5999a.m10745h(itM10866b));
        }
        sb2.append('>');
        return sb2.toString();
    }
}
