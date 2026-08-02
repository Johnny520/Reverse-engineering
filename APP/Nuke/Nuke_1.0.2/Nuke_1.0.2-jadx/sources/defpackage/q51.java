package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q51 implements bd0 {
    public final p51 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q51(p51 p51Var) {
        this.a = p51Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: a(Ln43;)Lx93; */
    /* JADX DEBUG: Method merged with bridge method: a(Ln43;)Lz93; */
    @Override // defpackage.bd0, defpackage.hd
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final ca3 a(n43 n43Var) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        p51 p51Var = this.a;
        zj1 zj1Var = p51Var.b;
        yj1 yj1Var = new yj1(zj1Var.e + 2);
        zj1 zj1Var2 = new zj1(zj1Var.e);
        int[] iArr3 = zj1Var.b;
        Object[] objArr3 = zj1Var.c;
        long[] jArr = zj1Var.a;
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
                            yj1Var.a(i7);
                            i = i3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            zj1Var2.h(i7, new ba3((nd) n43Var.a.j(o51Var.a), o51Var.b));
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
        if (!zj1Var.a(0)) {
            int i8 = yj1Var.b;
            if (i8 < 0) {
                s.d("Index must be between 0 and size");
                return null;
            }
            yj1Var.b(i8 + 1);
            int[] iArr4 = yj1Var.a;
            int i9 = yj1Var.b;
            if (i9 != 0) {
                mg.a0(iArr4, iArr4, 1, 0, i9);
            }
            iArr4[0] = 0;
            yj1Var.b++;
        }
        if (!zj1Var.a(p51Var.a)) {
            yj1Var.a(p51Var.a);
        }
        int i10 = yj1Var.b;
        if (i10 != 0) {
            int[] iArr5 = yj1Var.a;
            iArr5.getClass();
            Arrays.sort(iArr5, 0, i10);
        }
        return new ca3(yj1Var, zj1Var2, p51Var.a, hd0.b);
    }
}
