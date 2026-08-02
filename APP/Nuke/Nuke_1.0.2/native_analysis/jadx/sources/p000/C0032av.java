package p000;

import java.util.List;

/* JADX INFO: renamed from: av */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0032av implements nf1, lb2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0921yf f400a;

    /* JADX INFO: renamed from: b */
    public final C0583pk f401b;

    public C0032av(InterfaceC0921yf interfaceC0921yf, C0583pk c0583pk) {
        this.f400a = interfaceC0921yf;
        this.f401b = c0583pk;
    }

    @Override // p000.lb2
    /* JADX INFO: renamed from: a */
    public final of1 mo281a(final sz1[] sz1VarArr, final pf1 pf1Var, final int[] iArr, int i, final int i2) {
        return pf1Var.mo696j0(i2, i, ce0.f1492h, new in0() { // from class: zu
            @Override // p000.in0
            /* JADX INFO: renamed from: j */
            public final Object mo5j(Object obj) {
                rz1 rz1Var = (rz1) obj;
                sz1[] sz1VarArr2 = sz1VarArr;
                int length = sz1VarArr2.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    sz1 sz1Var = sz1VarArr2[i3];
                    int i5 = i4 + 1;
                    sz1Var.getClass();
                    Object objMo2342i = sz1Var.mo2342i();
                    mb2 mb2Var = objMo2342i instanceof mb2 ? (mb2) objMo2342i : null;
                    d61 layoutDirection = pf1Var.getLayoutDirection();
                    t20 t20Var = mb2Var != null ? mb2Var.f6553c : null;
                    int i6 = i2;
                    rz1.m4639g(rz1Var, sz1Var, t20Var != null ? t20Var.f10505a.m3868a(sz1Var.f10438h, i6, layoutDirection) : this.f401b.m3868a(sz1Var.f10438h, i6, layoutDirection), iArr[i4]);
                    i3++;
                    i4 = i5;
                }
                return a83.f116a;
            }
        });
    }

    @Override // p000.nf1
    /* JADX INFO: renamed from: b */
    public final int mo282b(m11 m11Var, List list, int i) {
        int iMo692T = m11Var.mo692T(this.f400a.mo5883b());
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
            int iMo2341f = if1Var.mo2341f(i);
            if (fM4822K == 0.0f) {
                i2 += iMo2341f;
            } else if (fM4822K > 0.0f) {
                f += fM4822K;
                iMax = Math.max(iMax, Math.round(iMo2341f / fM4822K));
            }
        }
        return ((list.size() - 1) * iMo692T) + Math.round(iMax * f) + i2;
    }

    @Override // p000.lb2
    /* JADX INFO: renamed from: c */
    public final void mo283c(int i, pf1 pf1Var, int[] iArr, int[] iArr2) {
        this.f400a.mo5670f(i, pf1Var, iArr, iArr2);
    }

    @Override // p000.nf1
    /* JADX INFO: renamed from: d */
    public final int mo284d(m11 m11Var, List list, int i) {
        int iMo692T = m11Var.mo692T(this.f400a.mo5883b());
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
                int iMin2 = Math.min(if1Var.mo2341f(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, if1Var.mo2338W(iMin2));
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
                iMax = Math.max(iMax, if1Var2.mo2338W(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM4822K2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // p000.lb2
    /* JADX INFO: renamed from: e */
    public final long mo285e(int i, int i2, int i3, boolean z) {
        return !z ? AbstractC0258gz.m2027a(0, i3, i, i2) : rp0.m4542c0(0, i3, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0032av)) {
            return false;
        }
        C0032av c0032av = (C0032av) obj;
        return this.f400a.equals(c0032av.f400a) && this.f401b.equals(c0032av.f401b);
    }

    @Override // p000.lb2
    /* JADX INFO: renamed from: f */
    public final int mo286f(sz1 sz1Var) {
        return sz1Var.f10438h;
    }

    @Override // p000.nf1
    /* JADX INFO: renamed from: g */
    public final of1 mo287g(pf1 pf1Var, List list, long j) {
        return AbstractC0731te.m5195X(this, C0221fz.m1764i(j), C0221fz.m1765j(j), C0221fz.m1762g(j), C0221fz.m1763h(j), pf1Var.mo692T(this.f400a.mo5883b()), pf1Var, list, new sz1[list.size()], list.size());
    }

    @Override // p000.nf1
    /* JADX INFO: renamed from: h */
    public final int mo288h(m11 m11Var, List list, int i) {
        int iMo692T = m11Var.mo692T(this.f400a.mo5883b());
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
            int iMo2339X = if1Var.mo2339X(i);
            if (fM4822K == 0.0f) {
                i2 += iMo2339X;
            } else if (fM4822K > 0.0f) {
                f += fM4822K;
                iMax = Math.max(iMax, Math.round(iMo2339X / fM4822K));
            }
        }
        return ((list.size() - 1) * iMo692T) + Math.round(iMax * f) + i2;
    }

    public final int hashCode() {
        return Float.hashCode(this.f401b.f8378a) + (this.f400a.hashCode() * 31);
    }

    @Override // p000.lb2
    /* JADX INFO: renamed from: i */
    public final int mo289i(sz1 sz1Var) {
        return sz1Var.f10439i;
    }

    @Override // p000.nf1
    /* JADX INFO: renamed from: j */
    public final int mo290j(m11 m11Var, List list, int i) {
        int iMo692T = m11Var.mo692T(this.f400a.mo5883b());
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
                int iMin2 = Math.min(if1Var.mo2341f(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, if1Var.mo2337N(iMin2));
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
                iMax = Math.max(iMax, if1Var2.mo2337N(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM4822K2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f400a + ", horizontalAlignment=" + this.f401b + ')';
    }
}
