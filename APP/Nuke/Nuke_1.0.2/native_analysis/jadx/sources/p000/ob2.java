package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ob2 implements nf1, lb2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0845wf f7614a;

    /* JADX INFO: renamed from: b */
    public final C0622qk f7615b;

    public ob2(InterfaceC0845wf interfaceC0845wf, C0622qk c0622qk) {
        this.f7614a = interfaceC0845wf;
        this.f7615b = c0622qk;
    }

    @Override // p000.lb2
    /* JADX INFO: renamed from: a */
    public final of1 mo281a(sz1[] sz1VarArr, pf1 pf1Var, int[] iArr, int i, int i2) {
        return pf1Var.mo696j0(i, i2, ce0.f1492h, new l70(sz1VarArr, this, i2, iArr));
    }

    @Override // p000.nf1
    /* JADX INFO: renamed from: b */
    public final int mo282b(m11 m11Var, List list, int i) {
        int iMo692T = m11Var.mo692T(this.f7614a.mo5883b());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo692T, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            if1 if1Var = (if1) list.get(i2);
            float fM4822K = AbstractC0691se.m4822K(AbstractC0691se.m4818G(if1Var));
            if (fM4822K == 0.0f) {
                int iMin2 = Math.min(if1Var.mo2338W(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, if1Var.mo2341f(iMin2));
            } else if (fM4822K > 0.0f) {
                f += fM4822K;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if1 if1Var2 = (if1) list.get(i3);
            float fM4822K2 = AbstractC0691se.m4822K(AbstractC0691se.m4818G(if1Var2));
            if (fM4822K2 > 0.0f) {
                iMax = Math.max(iMax, if1Var2.mo2341f(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM4822K2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // p000.lb2
    /* JADX INFO: renamed from: c */
    public final void mo283c(int i, pf1 pf1Var, int[] iArr, int[] iArr2) {
        this.f7614a.mo5488e(pf1Var, i, iArr, pf1Var.getLayoutDirection(), iArr2);
    }

    @Override // p000.nf1
    /* JADX INFO: renamed from: d */
    public final int mo284d(m11 m11Var, List list, int i) {
        int iMo692T = m11Var.mo692T(this.f7614a.mo5883b());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            if1 if1Var = (if1) list.get(i3);
            float fM4822K = AbstractC0691se.m4822K(AbstractC0691se.m4818G(if1Var));
            int iMo2338W = if1Var.mo2338W(i);
            if (fM4822K == 0.0f) {
                i2 += iMo2338W;
            } else if (fM4822K > 0.0f) {
                f += fM4822K;
                iMax = Math.max(iMax, Math.round(iMo2338W / fM4822K));
            }
        }
        return ((list.size() - 1) * iMo692T) + Math.round(iMax * f) + i2;
    }

    @Override // p000.lb2
    /* JADX INFO: renamed from: e */
    public final long mo285e(int i, int i2, int i3, boolean z) {
        return !z ? AbstractC0258gz.m2027a(i, i2, 0, i3) : rp0.m4543d0(i, i2, 0, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob2)) {
            return false;
        }
        ob2 ob2Var = (ob2) obj;
        return this.f7614a.equals(ob2Var.f7614a) && t11.m5086l(this.f7615b, ob2Var.f7615b);
    }

    @Override // p000.lb2
    /* JADX INFO: renamed from: f */
    public final int mo286f(sz1 sz1Var) {
        return sz1Var.f10439i;
    }

    @Override // p000.nf1
    /* JADX INFO: renamed from: g */
    public final of1 mo287g(pf1 pf1Var, List list, long j) {
        return AbstractC0731te.m5195X(this, C0221fz.m1765j(j), C0221fz.m1764i(j), C0221fz.m1763h(j), C0221fz.m1762g(j), pf1Var.mo692T(this.f7614a.mo5883b()), pf1Var, list, new sz1[list.size()], list.size());
    }

    @Override // p000.nf1
    /* JADX INFO: renamed from: h */
    public final int mo288h(m11 m11Var, List list, int i) {
        int iMo692T = m11Var.mo692T(this.f7614a.mo5883b());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo692T, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            if1 if1Var = (if1) list.get(i2);
            float fM4822K = AbstractC0691se.m4822K(AbstractC0691se.m4818G(if1Var));
            if (fM4822K == 0.0f) {
                int iMin2 = Math.min(if1Var.mo2338W(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, if1Var.mo2339X(iMin2));
            } else if (fM4822K > 0.0f) {
                f += fM4822K;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if1 if1Var2 = (if1) list.get(i3);
            float fM4822K2 = AbstractC0691se.m4822K(AbstractC0691se.m4818G(if1Var2));
            if (fM4822K2 > 0.0f) {
                iMax = Math.max(iMax, if1Var2.mo2339X(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM4822K2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7615b.f9011a) + (this.f7614a.hashCode() * 31);
    }

    @Override // p000.lb2
    /* JADX INFO: renamed from: i */
    public final int mo289i(sz1 sz1Var) {
        return sz1Var.f10438h;
    }

    @Override // p000.nf1
    /* JADX INFO: renamed from: j */
    public final int mo290j(m11 m11Var, List list, int i) {
        int iMo692T = m11Var.mo692T(this.f7614a.mo5883b());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            if1 if1Var = (if1) list.get(i3);
            float fM4822K = AbstractC0691se.m4822K(AbstractC0691se.m4818G(if1Var));
            int iMo2337N = if1Var.mo2337N(i);
            if (fM4822K == 0.0f) {
                i2 += iMo2337N;
            } else if (fM4822K > 0.0f) {
                f += fM4822K;
                iMax = Math.max(iMax, Math.round(iMo2337N / fM4822K));
            }
        }
        return ((list.size() - 1) * iMo692T) + Math.round(iMax * f) + i2;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f7614a + ", verticalAlignment=" + this.f7615b + ')';
    }
}
