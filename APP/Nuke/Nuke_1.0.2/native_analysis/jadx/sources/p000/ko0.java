package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ko0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f5688a;

    /* JADX INFO: renamed from: b */
    public final int f5689b;

    /* JADX INFO: renamed from: c */
    public int f5690c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f5691d;

    /* JADX INFO: renamed from: e */
    public final zj1 f5692e;

    /* JADX INFO: renamed from: f */
    public final hx2 f5693f;

    public ko0(int i, ArrayList arrayList) {
        this.f5688a = arrayList;
        this.f5689b = i;
        if (i < 0) {
            j22.m2429a("Invalid start index");
        }
        this.f5691d = new ArrayList();
        zj1 zj1Var = new zj1();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            e51 e51Var = (e51) this.f5688a.get(i3);
            int i4 = e51Var.f2311c;
            int i5 = e51Var.f2312d;
            zj1Var.m6421h(i4, new br0(i3, i2, i5));
            i2 += i5;
        }
        this.f5692e = zj1Var;
        this.f5693f = new hx2(new jo0(this));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2726a(int i, int i2) {
        br0 br0Var;
        int i3;
        int i4;
        zj1 zj1Var = this.f5692e;
        br0 br0Var2 = (br0) zj1Var.m6022b(i);
        if (br0Var2 == null) {
            return false;
        }
        int i5 = br0Var2.f990b;
        int i6 = i2 - br0Var2.f991c;
        br0Var2.f991c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = zj1Var.f12751c;
        long[] jArr = zj1Var.f12749a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (br0Var = (br0) objArr[(i7 << 3) + i9]).f990b) >= i5 && br0Var != br0Var2 && (i4 = i3 + i6) >= 0) {
                        br0Var.f990b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
