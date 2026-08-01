package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: g7 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0236g7 implements xd0 {

    /* JADX INFO: renamed from: a */
    public final C0605p7 f1873a;

    /* JADX INFO: renamed from: b */
    public boolean f1874b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0236g7(C0605p7 c0605p7) {
        this.f1873a = c0605p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xd0
    /* JADX INFO: renamed from: b */
    public final int mo1223b(l30 l30Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo185f = ((sd0) list.get(0)).mo185f(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo185f2 = ((sd0) list.get(i2)).mo185f(i);
                if (iMo185f2 > iMo185f) {
                    iMo185f = iMo185f2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMo185f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xd0
    /* JADX INFO: renamed from: c */
    public final int mo1224c(l30 l30Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo182O = ((sd0) list.get(0)).mo182O(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo182O2 = ((sd0) list.get(i2)).mo182O(i);
                if (iMo182O2 > iMo182O) {
                    iMo182O = iMo182O2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMo182O;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xd0
    /* JADX INFO: renamed from: g */
    public final yd0 mo213g(zd0 zd0Var, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            xq0 xq0VarMo184e = ((sd0) list.get(i)).mo184e(j);
            iMax = Math.max(iMax, xq0VarMo184e.f7400d);
            iMax2 = Math.max(iMax2, xq0VarMo184e.f7401e);
            arrayList.add(xq0VarMo184e);
        }
        boolean zMo53m = zd0Var.mo53m();
        C0605p7 c0605p7 = this.f1873a;
        if (zMo53m) {
            this.f1874b = true;
            c0605p7.f4770a.setValue(new d30((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.f1874b) {
            c0605p7.f4770a.setValue(new d30((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return zd0Var.mo1279Q(iMax, iMax2, C0330is.f2614d, new C0006a5(1, arrayList));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xd0
    /* JADX INFO: renamed from: h */
    public final int mo1225h(l30 l30Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo183R = ((sd0) list.get(0)).mo183R(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo183R2 = ((sd0) list.get(i2)).mo183R(i);
                if (iMo183R2 > iMo183R) {
                    iMo183R = iMo183R2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMo183R;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xd0
    /* JADX INFO: renamed from: j */
    public final int mo1226j(l30 l30Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo181I = ((sd0) list.get(0)).mo181I(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo181I2 = ((sd0) list.get(i2)).mo181I(i);
                if (iMo181I2 > iMo181I) {
                    iMo181I = iMo181I2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMo181I;
    }
}
