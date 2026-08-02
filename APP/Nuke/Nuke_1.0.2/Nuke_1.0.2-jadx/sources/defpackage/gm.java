package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gm implements nf1 {
    public final r5 a;
    public final boolean b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gm(r5 r5Var, boolean z) {
        this.a = r5Var;
        this.b = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm)) {
            return false;
        }
        gm gmVar = (gm) obj;
        return t11.l(this.a, gmVar.a) && this.b == gmVar.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nf1
    public final of1 g(final pf1 pf1Var, final List list, long j) {
        int iJ;
        int i;
        sz1 sz1VarE;
        boolean zIsEmpty = list.isEmpty();
        ce0 ce0Var = ce0.h;
        if (zIsEmpty) {
            return pf1Var.j0(fz.j(j), fz.i(j), ce0Var, new w(24));
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final if1 if1Var = (if1) list.get(0);
            Object objI = if1Var.i();
            bm bmVar = objI instanceof bm ? (bm) objI : null;
            if (bmVar != null ? bmVar.w : false) {
                iJ = fz.j(j);
                i = fz.i(j);
                int iJ2 = fz.j(j);
                int i2 = fz.i(j);
                if (!((i2 >= 0) & (iJ2 >= 0))) {
                    mz0.a("width and height must be >= 0");
                }
                sz1VarE = if1Var.e(gz.h(iJ2, iJ2, i2, i2));
            } else {
                sz1VarE = if1Var.e(j2);
                iJ = Math.max(fz.j(j), sz1VarE.h);
                i = Math.max(fz.i(j), sz1VarE.i);
            }
            final int i3 = i;
            final int i4 = iJ;
            final sz1 sz1Var = sz1VarE;
            return pf1Var.j0(i4, i3, ce0Var, new in0() { // from class: em
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.in0
                public final Object j(Object obj) {
                    dm.b((rz1) obj, sz1Var, if1Var, pf1Var.getLayoutDirection(), i4, i3, this.a);
                    return a83.a;
                }
            });
        }
        final sz1[] sz1VarArr = new sz1[list.size()];
        final a72 a72Var = new a72();
        a72Var.h = fz.j(j);
        final a72 a72Var2 = new a72();
        a72Var2.h = fz.i(j);
        int size = list.size();
        boolean z = false;
        for (int i5 = 0; i5 < size; i5++) {
            if1 if1Var2 = (if1) list.get(i5);
            Object objI2 = if1Var2.i();
            bm bmVar2 = objI2 instanceof bm ? (bm) objI2 : null;
            if (bmVar2 != null ? bmVar2.w : false) {
                z = true;
            } else {
                sz1 sz1VarE2 = if1Var2.e(j2);
                sz1VarArr[i5] = sz1VarE2;
                a72Var.h = Math.max(a72Var.h, sz1VarE2.h);
                a72Var2.h = Math.max(a72Var2.h, sz1VarE2.i);
            }
        }
        if (z) {
            int i6 = a72Var.h;
            int i7 = i6 != Integer.MAX_VALUE ? i6 : 0;
            int i8 = a72Var2.h;
            long jA = gz.a(i7, i6, i8 != Integer.MAX_VALUE ? i8 : 0, i8);
            int size2 = list.size();
            for (int i9 = 0; i9 < size2; i9++) {
                if1 if1Var3 = (if1) list.get(i9);
                Object objI3 = if1Var3.i();
                bm bmVar3 = objI3 instanceof bm ? (bm) objI3 : null;
                if (bmVar3 != null ? bmVar3.w : false) {
                    sz1VarArr[i9] = if1Var3.e(jA);
                }
            }
        }
        return pf1Var.j0(a72Var.h, a72Var2.h, ce0Var, new in0() { // from class: fm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // defpackage.in0
            public final Object j(Object obj) {
                rz1 rz1Var = (rz1) obj;
                sz1[] sz1VarArr2 = sz1VarArr;
                int length = sz1VarArr2.length;
                int i10 = 0;
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i10;
                    sz1 sz1Var2 = sz1VarArr2[i11];
                    sz1Var2.getClass();
                    dm.b(rz1Var, sz1Var2, (if1) list.get(i12), pf1Var.getLayoutDirection(), a72Var.h, a72Var2.h, this.a);
                    i11++;
                    i10 = i12 + 1;
                }
                return a83.a;
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ')';
    }
}
