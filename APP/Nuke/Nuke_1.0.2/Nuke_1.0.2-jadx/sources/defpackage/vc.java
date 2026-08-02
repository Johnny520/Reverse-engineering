package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vc implements nf1 {
    public final dd a;
    public boolean b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vc(dd ddVar) {
        this.a = ddVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nf1
    public final int b(m11 m11Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iF = ((if1) list.get(0)).f(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iF2 = ((if1) list.get(i2)).f(i);
                if (iF2 > iF) {
                    iF = iF2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nf1
    public final int d(m11 m11Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iW = ((if1) list.get(0)).W(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iW2 = ((if1) list.get(i2)).W(i);
                if (iW2 > iW) {
                    iW = iW2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nf1
    public final of1 g(pf1 pf1Var, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            sz1 sz1VarE = ((if1) list.get(i)).e(j);
            iMax = Math.max(iMax, sz1VarE.h);
            iMax2 = Math.max(iMax2, sz1VarE.i);
            arrayList.add(sz1VarE);
        }
        boolean zU = pf1Var.u();
        dd ddVar = this.a;
        if (zU) {
            this.b = true;
            ddVar.a.setValue(new h11((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.b) {
            ddVar.a.setValue(new h11((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return pf1Var.j0(iMax, iMax2, ce0.h, new j8(2, arrayList));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nf1
    public final int h(m11 m11Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iX = ((if1) list.get(0)).X(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iX2 = ((if1) list.get(i2)).X(i);
                if (iX2 > iX) {
                    iX = iX2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nf1
    public final int j(m11 m11Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iN = ((if1) list.get(0)).N(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iN2 = ((if1) list.get(i2)).N(i);
                if (iN2 > iN) {
                    iN = iN2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iN;
    }
}
