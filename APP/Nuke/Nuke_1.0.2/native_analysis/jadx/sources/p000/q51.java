package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q51 implements bd0 {

    /* JADX INFO: renamed from: a */
    public final p51 f8742a;

    public q51(p51 p51Var) {
        this.f8742a = p51Var;
    }

    @Override // p000.bd0, p000.InterfaceC0273hd
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final ca3 mo512a(n43 n43Var) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        p51 p51Var = this.f8742a;
        zj1 zj1Var = p51Var.f7981b;
        yj1 yj1Var = new yj1(zj1Var.f12753e + 2);
        zj1 zj1Var2 = new zj1(zj1Var.f12753e);
        int[] iArr3 = zj1Var.f12750b;
        Object[] objArr3 = zj1Var.f12751c;
        long[] jArr = zj1Var.f12749a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            o51 o51Var = (o51) objArr3[i6];
                            yj1Var.m6281a(i7);
                            i = i3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            zj1Var2.m6421h(i7, new ba3((AbstractC0494nd) n43Var.f7004a.mo5j(o51Var.f7527a), o51Var.f7528b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!zj1Var.m6021a(0)) {
            int i8 = yj1Var.f13491b;
            if (i8 < 0) {
                C0676s.m4646d("Index must be between 0 and size");
                return null;
            }
            yj1Var.m6282b(i8 + 1);
            int[] iArr4 = yj1Var.f13490a;
            int i9 = yj1Var.f13491b;
            if (i9 != 0) {
                AbstractC0460mg.m3086a0(iArr4, iArr4, 1, 0, i9);
            }
            iArr4[0] = 0;
            yj1Var.f13491b++;
        }
        if (!zj1Var.m6021a(p51Var.f7980a)) {
            yj1Var.m6281a(p51Var.f7980a);
        }
        int i10 = yj1Var.f13491b;
        if (i10 != 0) {
            int[] iArr5 = yj1Var.f13490a;
            iArr5.getClass();
            Arrays.sort(iArr5, 0, i10);
        }
        return new ca3(yj1Var, zj1Var2, p51Var.f7980a, hd0.f3956b);
    }
}
