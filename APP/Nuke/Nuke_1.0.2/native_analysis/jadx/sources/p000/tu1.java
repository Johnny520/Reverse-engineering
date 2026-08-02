package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tu1 extends iv1 {

    /* JADX INFO: renamed from: c */
    public static final tu1 f10967c = new tu1(1, 0, 2);

    @Override // p000.iv1
    /* JADX INFO: renamed from: a */
    public final void mo296a(bo0 bo0Var, InterfaceC0654rf interfaceC0654rf, tr2 tr2Var, z72 z72Var, jv1 jv1Var) {
        int[] iArr;
        ao0 ao0Var;
        int iM5412c;
        int iM578c = bo0Var.m578c(0);
        if (tr2Var.f10926n != 0) {
            AbstractC0752tx.m5443a("Cannot move a group while inserting");
        }
        if (iM578c < 0) {
            AbstractC0752tx.m5443a("Parameter offset is out of bounds");
        }
        if (iM578c == 0) {
            return;
        }
        int i = tr2Var.f10932t;
        int i2 = tr2Var.f10934v;
        int i3 = tr2Var.f10933u;
        int i4 = i;
        while (true) {
            iArr = tr2Var.f10914b;
            if (iM578c <= 0) {
                break;
            }
            i4 += iArr[(tr2Var.m5426r(i4) * 5) + 3];
            if (i4 > i3) {
                AbstractC0752tx.m5443a("Parameter offset is out of bounds");
            }
            iM578c--;
        }
        int i5 = iArr[(tr2Var.m5426r(i4) * 5) + 3];
        int iM5416g = tr2Var.m5416g(tr2Var.f10914b, tr2Var.m5426r(tr2Var.f10932t));
        int iM5416g2 = tr2Var.m5416g(tr2Var.f10914b, tr2Var.m5426r(i4));
        int i6 = i4 + i5;
        int iM5416g3 = tr2Var.m5416g(tr2Var.f10914b, tr2Var.m5426r(i6));
        int i7 = iM5416g3 - iM5416g2;
        tr2Var.m5432x(i7, Math.max(tr2Var.f10932t - 1, 0));
        tr2Var.m5431w(i5);
        int[] iArr2 = tr2Var.f10914b;
        int iM5426r = tr2Var.m5426r(i6) * 5;
        AbstractC0460mg.m3086a0(iArr2, iArr2, tr2Var.m5426r(i) * 5, iM5426r, (i5 * 5) + iM5426r);
        if (i7 > 0) {
            Object[] objArr = tr2Var.f10915c;
            int iM5417h = tr2Var.m5417h(iM5416g2 + i7);
            System.arraycopy(objArr, iM5417h, objArr, iM5416g, tr2Var.m5417h(iM5416g3 + i7) - iM5417h);
        }
        int i8 = iM5416g2 + i7;
        int i9 = i8 - iM5416g;
        int i10 = tr2Var.f10923k;
        int i11 = tr2Var.f10924l;
        int length = tr2Var.f10915c.length;
        int i12 = tr2Var.f10925m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iM5426r2 = tr2Var.m5426r(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(iM5426r2 * 5) + 4] = tr2.m5387i(tr2.m5387i(tr2Var.m5416g(iArr2, iM5426r2) - i15, i12 < iM5426r2 ? 0 : i10, i11, length), tr2Var.f10923k, tr2Var.f10924l, tr2Var.f10915c.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iM5424p = tr2Var.m5424p();
        int iM4989a = sr2.m4989a(tr2Var.f10916d, i6, iM5424p);
        ArrayList arrayList = new ArrayList();
        if (iM4989a >= 0) {
            while (iM4989a < tr2Var.f10916d.size() && (iM5412c = tr2Var.m5412c((ao0Var = (ao0) tr2Var.f10916d.get(iM4989a)))) >= i6 && iM5412c < i16) {
                arrayList.add(ao0Var);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            ao0 ao0Var2 = (ao0) arrayList.get(i18);
            int iM5412c2 = tr2Var.m5412c(ao0Var2) + i17;
            if (iM5412c2 >= tr2Var.f10919g) {
                ao0Var2.f313a = -(iM5424p - iM5412c2);
            } else {
                ao0Var2.f313a = iM5412c2;
            }
            tr2Var.f10916d.add(sr2.m4989a(tr2Var.f10916d, iM5412c2, iM5424p), ao0Var2);
        }
        if (tr2Var.m5397I(i6, i5)) {
            AbstractC0752tx.m5443a("Unexpectedly removed anchors");
        }
        tr2Var.m5421m(i2, tr2Var.f10933u, i);
        if (i7 > 0) {
            tr2Var.m5398J(i8, i7, i6 - 1);
        }
    }
}
