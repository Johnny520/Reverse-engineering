package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: vc */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0805vc implements nf1 {

    /* JADX INFO: renamed from: a */
    public final C0126dd f11895a;

    /* JADX INFO: renamed from: b */
    public boolean f11896b;

    public C0805vc(C0126dd c0126dd) {
        this.f11895a = c0126dd;
    }

    @Override // p000.nf1
    /* JADX INFO: renamed from: b */
    public final int mo282b(m11 m11Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo2341f = ((if1) list.get(0)).mo2341f(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo2341f2 = ((if1) list.get(i2)).mo2341f(i);
                if (iMo2341f2 > iMo2341f) {
                    iMo2341f = iMo2341f2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMo2341f;
    }

    @Override // p000.nf1
    /* JADX INFO: renamed from: d */
    public final int mo284d(m11 m11Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo2338W = ((if1) list.get(0)).mo2338W(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo2338W2 = ((if1) list.get(i2)).mo2338W(i);
                if (iMo2338W2 > iMo2338W) {
                    iMo2338W = iMo2338W2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMo2338W;
    }

    @Override // p000.nf1
    /* JADX INFO: renamed from: g */
    public final of1 mo287g(pf1 pf1Var, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            sz1 sz1VarMo2340e = ((if1) list.get(i)).mo2340e(j);
            iMax = Math.max(iMax, sz1VarMo2340e.f10438h);
            iMax2 = Math.max(iMax2, sz1VarMo2340e.f10439i);
            arrayList.add(sz1VarMo2340e);
        }
        boolean zMo699u = pf1Var.mo699u();
        C0126dd c0126dd = this.f11895a;
        if (zMo699u) {
            this.f11896b = true;
            c0126dd.f1997a.setValue(new h11((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.f11896b) {
            c0126dd.f1997a.setValue(new h11((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return pf1Var.mo696j0(iMax, iMax2, ce0.f1492h, new C0340j8(2, arrayList));
    }

    @Override // p000.nf1
    /* JADX INFO: renamed from: h */
    public final int mo288h(m11 m11Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo2339X = ((if1) list.get(0)).mo2339X(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo2339X2 = ((if1) list.get(i2)).mo2339X(i);
                if (iMo2339X2 > iMo2339X) {
                    iMo2339X = iMo2339X2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMo2339X;
    }

    @Override // p000.nf1
    /* JADX INFO: renamed from: j */
    public final int mo290j(m11 m11Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo2337N = ((if1) list.get(0)).mo2337N(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo2337N2 = ((if1) list.get(i2)).mo2337N(i);
                if (iMo2337N2 > iMo2337N) {
                    iMo2337N = iMo2337N2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMo2337N;
    }
}
