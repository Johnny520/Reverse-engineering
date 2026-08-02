package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tu1 extends iv1 {
    public static final tu1 c = new tu1(1, 0, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.iv1
    public final void a(bo0 bo0Var, rf rfVar, tr2 tr2Var, z72 z72Var, jv1 jv1Var) {
        int[] iArr;
        ao0 ao0Var;
        int iC;
        int iC2 = bo0Var.c(0);
        if (tr2Var.n != 0) {
            tx.a("Cannot move a group while inserting");
        }
        if (iC2 < 0) {
            tx.a("Parameter offset is out of bounds");
        }
        if (iC2 == 0) {
            return;
        }
        int i = tr2Var.t;
        int i2 = tr2Var.v;
        int i3 = tr2Var.u;
        int i4 = i;
        while (true) {
            iArr = tr2Var.b;
            if (iC2 <= 0) {
                break;
            }
            i4 += iArr[(tr2Var.r(i4) * 5) + 3];
            if (i4 > i3) {
                tx.a("Parameter offset is out of bounds");
            }
            iC2--;
        }
        int i5 = iArr[(tr2Var.r(i4) * 5) + 3];
        int iG = tr2Var.g(tr2Var.b, tr2Var.r(tr2Var.t));
        int iG2 = tr2Var.g(tr2Var.b, tr2Var.r(i4));
        int i6 = i4 + i5;
        int iG3 = tr2Var.g(tr2Var.b, tr2Var.r(i6));
        int i7 = iG3 - iG2;
        tr2Var.x(i7, Math.max(tr2Var.t - 1, 0));
        tr2Var.w(i5);
        int[] iArr2 = tr2Var.b;
        int iR = tr2Var.r(i6) * 5;
        mg.a0(iArr2, iArr2, tr2Var.r(i) * 5, iR, (i5 * 5) + iR);
        if (i7 > 0) {
            Object[] objArr = tr2Var.c;
            int iH = tr2Var.h(iG2 + i7);
            System.arraycopy(objArr, iH, objArr, iG, tr2Var.h(iG3 + i7) - iH);
        }
        int i8 = iG2 + i7;
        int i9 = i8 - iG;
        int i10 = tr2Var.k;
        int i11 = tr2Var.l;
        int length = tr2Var.c.length;
        int i12 = tr2Var.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iR2 = tr2Var.r(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(iR2 * 5) + 4] = tr2.i(tr2.i(tr2Var.g(iArr2, iR2) - i15, i12 < iR2 ? 0 : i10, i11, length), tr2Var.k, tr2Var.l, tr2Var.c.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iP = tr2Var.p();
        int iA = sr2.a(tr2Var.d, i6, iP);
        ArrayList arrayList = new ArrayList();
        if (iA >= 0) {
            while (iA < tr2Var.d.size() && (iC = tr2Var.c((ao0Var = (ao0) tr2Var.d.get(iA)))) >= i6 && iC < i16) {
                arrayList.add(ao0Var);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            ao0 ao0Var2 = (ao0) arrayList.get(i18);
            int iC3 = tr2Var.c(ao0Var2) + i17;
            if (iC3 >= tr2Var.g) {
                ao0Var2.a = -(iP - iC3);
            } else {
                ao0Var2.a = iC3;
            }
            tr2Var.d.add(sr2.a(tr2Var.d, iC3, iP), ao0Var2);
        }
        if (tr2Var.I(i6, i5)) {
            tx.a("Unexpectedly removed anchors");
        }
        tr2Var.m(i2, tr2Var.u, i);
        if (i7 > 0) {
            tr2Var.J(i8, i7, i6 - 1);
        }
    }
}
