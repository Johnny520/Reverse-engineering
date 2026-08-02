package p000;

import java.util.List;

/* JADX INFO: renamed from: gm */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0245gm implements nf1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0644r5 f3579a;

    /* JADX INFO: renamed from: b */
    public final boolean f3580b;

    public C0245gm(InterfaceC0644r5 interfaceC0644r5, boolean z) {
        this.f3579a = interfaceC0644r5;
        this.f3580b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0245gm)) {
            return false;
        }
        C0245gm c0245gm = (C0245gm) obj;
        return t11.m5086l(this.f3579a, c0245gm.f3579a) && this.f3580b == c0245gm.f3580b;
    }

    @Override // p000.nf1
    /* JADX INFO: renamed from: g */
    public final of1 mo287g(final pf1 pf1Var, final List list, long j) {
        int iM1765j;
        int iM1764i;
        sz1 sz1VarMo2340e;
        boolean zIsEmpty = list.isEmpty();
        ce0 ce0Var = ce0.f1492h;
        if (zIsEmpty) {
            return pf1Var.mo696j0(C0221fz.m1765j(j), C0221fz.m1764i(j), ce0Var, new C0829w(24));
        }
        long j2 = this.f3580b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final if1 if1Var = (if1) list.get(0);
            Object objMo2342i = if1Var.mo2342i();
            C0060bm c0060bm = objMo2342i instanceof C0060bm ? (C0060bm) objMo2342i : null;
            if (c0060bm != null ? c0060bm.f936w : false) {
                iM1765j = C0221fz.m1765j(j);
                iM1764i = C0221fz.m1764i(j);
                int iM1765j2 = C0221fz.m1765j(j);
                int iM1764i2 = C0221fz.m1764i(j);
                if (!((iM1764i2 >= 0) & (iM1765j2 >= 0))) {
                    mz0.m3220a("width and height must be >= 0");
                }
                sz1VarMo2340e = if1Var.mo2340e(AbstractC0258gz.m2034h(iM1765j2, iM1765j2, iM1764i2, iM1764i2));
            } else {
                sz1VarMo2340e = if1Var.mo2340e(j2);
                iM1765j = Math.max(C0221fz.m1765j(j), sz1VarMo2340e.f10438h);
                iM1764i = Math.max(C0221fz.m1764i(j), sz1VarMo2340e.f10439i);
            }
            final int i = iM1764i;
            final int i2 = iM1765j;
            final sz1 sz1Var = sz1VarMo2340e;
            return pf1Var.mo696j0(i2, i, ce0Var, new in0() { // from class: em
                @Override // p000.in0
                /* JADX INFO: renamed from: j */
                public final Object mo5j(Object obj) {
                    AbstractC0135dm.m1058b((rz1) obj, sz1Var, if1Var, pf1Var.getLayoutDirection(), i2, i, this.f3579a);
                    return a83.f116a;
                }
            });
        }
        final sz1[] sz1VarArr = new sz1[list.size()];
        final a72 a72Var = new a72();
        a72Var.f108h = C0221fz.m1765j(j);
        final a72 a72Var2 = new a72();
        a72Var2.f108h = C0221fz.m1764i(j);
        int size = list.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            if1 if1Var2 = (if1) list.get(i3);
            Object objMo2342i2 = if1Var2.mo2342i();
            C0060bm c0060bm2 = objMo2342i2 instanceof C0060bm ? (C0060bm) objMo2342i2 : null;
            if (c0060bm2 != null ? c0060bm2.f936w : false) {
                z = true;
            } else {
                sz1 sz1VarMo2340e2 = if1Var2.mo2340e(j2);
                sz1VarArr[i3] = sz1VarMo2340e2;
                a72Var.f108h = Math.max(a72Var.f108h, sz1VarMo2340e2.f10438h);
                a72Var2.f108h = Math.max(a72Var2.f108h, sz1VarMo2340e2.f10439i);
            }
        }
        if (z) {
            int i4 = a72Var.f108h;
            int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
            int i6 = a72Var2.f108h;
            long jM2027a = AbstractC0258gz.m2027a(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                if1 if1Var3 = (if1) list.get(i7);
                Object objMo2342i3 = if1Var3.mo2342i();
                C0060bm c0060bm3 = objMo2342i3 instanceof C0060bm ? (C0060bm) objMo2342i3 : null;
                if (c0060bm3 != null ? c0060bm3.f936w : false) {
                    sz1VarArr[i7] = if1Var3.mo2340e(jM2027a);
                }
            }
        }
        return pf1Var.mo696j0(a72Var.f108h, a72Var2.f108h, ce0Var, new in0() { // from class: fm
            @Override // p000.in0
            /* JADX INFO: renamed from: j */
            public final Object mo5j(Object obj) {
                rz1 rz1Var = (rz1) obj;
                sz1[] sz1VarArr2 = sz1VarArr;
                int length = sz1VarArr2.length;
                int i8 = 0;
                int i9 = 0;
                while (i9 < length) {
                    int i10 = i8;
                    sz1 sz1Var2 = sz1VarArr2[i9];
                    sz1Var2.getClass();
                    AbstractC0135dm.m1058b(rz1Var, sz1Var2, (if1) list.get(i10), pf1Var.getLayoutDirection(), a72Var.f108h, a72Var2.f108h, this.f3579a);
                    i9++;
                    i8 = i10 + 1;
                }
                return a83.f116a;
            }
        });
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3580b) + (this.f3579a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f3579a + ", propagateMinConstraints=" + this.f3580b + ')';
    }
}
