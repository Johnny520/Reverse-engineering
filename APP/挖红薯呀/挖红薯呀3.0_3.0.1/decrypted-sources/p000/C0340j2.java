package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: j2 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0340j2 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2658d = 1;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f2659e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f2660f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f2661g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f2662h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0340j2(C0135dn c0135dn, b30 b30Var, ch0 ch0Var, int i) {
        this.f2660f = c0135dn;
        this.f2661g = b30Var;
        this.f2662h = ch0Var;
        this.f2659e = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f2658d;
        k50 k50Var = k50.f3015d;
        na1 na1Var = na1.f4229a;
        Object obj2 = this.f2662h;
        int i2 = this.f2659e;
        Object obj3 = this.f2661g;
        Object obj4 = this.f2660f;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj4;
                zd0 zd0Var = (zd0) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                wq0 wq0Var = (wq0) obj;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    List list = (List) arrayList.get(i3);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i4 = 0;
                    while (i4 < size2) {
                        iArr[i4] = ((xq0) list.get(i4)).f7400d + (i4 < list.size() + (-1) ? zd0Var.mo641F(8.0f) : 0);
                        i4++;
                    }
                    int[] iArr2 = new int[size2];
                    if (zd0Var.getLayoutDirection() == k50Var) {
                        int i5 = 0;
                        for (int i6 = 0; i6 < size2; i6++) {
                            i5 += iArr[i6];
                        }
                        int i7 = i2 - i5;
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < size2) {
                            int i10 = iArr[i8];
                            iArr2[i9] = i7;
                            i7 += i10;
                            i8++;
                            i9++;
                        }
                    } else {
                        int i11 = 0;
                        for (int i12 = size2 - 1; -1 < i12; i12--) {
                            int i13 = iArr[i12];
                            iArr2[i12] = i11;
                            i11 += i13;
                        }
                    }
                    int size3 = list.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        wq0.m5015i(wq0Var, (xq0) list.get(i14), iArr2[i14], ((Number) arrayList2.get(i3)).intValue());
                    }
                }
                return na1Var;
            case 1:
                b30 b30Var = (b30) obj3;
                ch0 ch0Var = (ch0) obj2;
                if (obj == ((C0135dn) obj4)) {
                    C0921xc.m5134o("A derived state calculation cannot read itself");
                    return null;
                }
                if (obj instanceof d41) {
                    int i15 = b30Var.f365a - i2;
                    int iM534d = ch0Var.m534d(obj);
                    ch0Var.m537g(Math.min(i15, iM534d >= 0 ? ch0Var.f812c[iM534d] : Integer.MAX_VALUE), obj);
                }
                return na1Var;
            default:
                xq0[] xq0VarArr = (xq0[]) obj4;
                iw0 iw0Var = (iw0) obj3;
                int[] iArr3 = (int[]) obj2;
                wq0 wq0Var2 = (wq0) obj;
                int length = xq0VarArr.length;
                int i16 = 0;
                int i17 = 0;
                while (i16 < length) {
                    xq0 xq0Var = xq0VarArr[i16];
                    int i18 = i17 + 1;
                    xq0Var.getClass();
                    Object objMo50j = xq0Var.mo50j();
                    gw0 gw0Var = objMo50j instanceof gw0 ? (gw0) objMo50j : null;
                    C0213fl c0213fl = gw0Var != null ? gw0Var.f2084c : null;
                    wq0.m5015i(wq0Var2, xq0Var, iArr3[i17], c0213fl != null ? c0213fl.f1766a.m1072a(xq0Var.f7401e, i2, k50Var) : iw0Var.f2633b.m1234a(xq0Var.f7401e, i2));
                    i16++;
                    i17 = i18;
                }
                return na1Var;
        }
    }

    public /* synthetic */ C0340j2(ArrayList arrayList, zd0 zd0Var, int i, ArrayList arrayList2) {
        this.f2660f = arrayList;
        this.f2662h = zd0Var;
        this.f2659e = i;
        this.f2661g = arrayList2;
    }

    public /* synthetic */ C0340j2(xq0[] xq0VarArr, iw0 iw0Var, int i, int[] iArr) {
        this.f2660f = xq0VarArr;
        this.f2661g = iw0Var;
        this.f2659e = i;
        this.f2662h = iArr;
    }
}
