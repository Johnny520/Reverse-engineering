package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x71 {
    public final rk1 a;
    public e9 b;
    public final sk1 c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final uh1 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x71() {
        long[] jArr = ed2.a;
        this.a = new rk1();
        sk1 sk1Var = fd2.a;
        this.c = new sk1();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new u71(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int e(int[] iArr, y81 y81Var) {
        y81Var.getClass();
        int i = iArr[0] + y81Var.l;
        iArr[0] = i;
        return Math.max(0, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long a() {
        ArrayList arrayList = this.h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        vi0.t(arrayList.get(0));
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(int i, int i2, ArrayList arrayList, e9 e9Var, v81 v81Var, boolean z, boolean z2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        sk1 sk1Var;
        e9 e9Var2 = this.b;
        this.b = e9Var;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            y81 y81Var = (y81) arrayList.get(i11);
            int size2 = y81Var.b.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((sz1) y81Var.b.get(i12)).i();
            }
        }
        rk1 rk1Var = this.a;
        if (rk1Var.i()) {
            c();
            return;
        }
        boolean z3 = z || !z2;
        Object[] objArr = rk1Var.b;
        long[] jArr = rk1Var.a;
        int length = jArr.length - 2;
        sk1 sk1Var2 = this.c;
        int i13 = 8;
        boolean z4 = z3;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j = jArr[i14];
                sk1 sk1Var3 = sk1Var2;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    long j2 = j;
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j2 & 255) < 128) {
                            sk1Var = sk1Var3;
                            sk1Var.a(objArr[(i14 << 3) + i16]);
                        } else {
                            sk1Var = sk1Var3;
                        }
                        j2 >>= 8;
                        i16++;
                        sk1Var3 = sk1Var;
                    }
                    sk1Var2 = sk1Var3;
                    if (i15 != 8) {
                        break;
                    }
                } else {
                    sk1Var2 = sk1Var3;
                }
                if (i14 == length) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        int size3 = arrayList.size();
        for (int i17 = 0; i17 < size3; i17++) {
            y81 y81Var2 = (y81) arrayList.get(i17);
            Object obj = y81Var2.g;
            List list = y81Var2.b;
            sk1Var2.l(obj);
            int size4 = list.size();
            for (int i18 = 0; i18 < size4; i18++) {
                ((sz1) list.get(i18)).i();
            }
            vi0.t(rk1Var.k(y81Var2.g));
        }
        int[] iArr = new int[1];
        ArrayList arrayList2 = this.e;
        ArrayList arrayList3 = this.d;
        if (z4 && e9Var2 != null) {
            if (arrayList3.isEmpty()) {
                i10 = 0;
            } else {
                if (arrayList3.size() > 1) {
                    hu.f0(arrayList3, new w71(e9Var2, 2));
                }
                if (arrayList3.size() > 0) {
                    y81 y81Var3 = (y81) arrayList3.get(0);
                    e(iArr, y81Var3);
                    Object objG = rk1Var.g(y81Var3.g);
                    objG.getClass();
                    vi0.t(objG);
                    y81Var3.a(0);
                    throw null;
                }
                i10 = 0;
                Arrays.fill(iArr, 0, 1, 0);
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() > 1) {
                    hu.f0(arrayList2, new w71(e9Var2, i10));
                }
                if (arrayList2.size() > 0) {
                    y81 y81Var4 = (y81) arrayList2.get(i10);
                    e(iArr, y81Var4);
                    Object objG2 = rk1Var.g(y81Var4.g);
                    objG2.getClass();
                    vi0.t(objG2);
                    y81Var4.a(i10);
                    throw null;
                }
                Arrays.fill(iArr, i10, 1, i10);
            }
        }
        Object[] objArr2 = sk1Var2.b;
        long[] jArr2 = sk1Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i19 = 0;
            while (true) {
                long j3 = jArr2[i19];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i20 = 8 - ((~(i19 - length2)) >>> 31);
                    int i21 = 0;
                    while (i21 < i20) {
                        if ((j3 & 255) < 128) {
                            i9 = i13;
                            vi0.t(rk1Var.g(objArr2[(i19 << 3) + i21]));
                        } else {
                            i9 = i13;
                        }
                        j3 >>= i9;
                        i21++;
                        i13 = i9;
                    }
                    i8 = i13;
                    if (i20 != i8) {
                        break;
                    }
                } else {
                    i8 = i13;
                }
                if (i19 == length2) {
                    break;
                }
                i19++;
                i13 = i8;
            }
        }
        ArrayList arrayList4 = this.f;
        if (arrayList4.isEmpty()) {
            i5 = i;
            i6 = i2;
            i7 = 1;
        } else {
            if (arrayList4.size() > 1) {
                hu.f0(arrayList4, new w71(e9Var, 3));
            }
            int size5 = arrayList4.size();
            for (int i22 = 0; i22 < size5; i22++) {
                y81 y81Var5 = (y81) arrayList4.get(i22);
                Object objG3 = rk1Var.g(y81Var5.g);
                objG3.getClass();
                vi0.t(objG3);
                y81Var5.c((z ? (int) (4294967295L & ((y81) du.o0(arrayList)).a(0)) : 0) - e(iArr, y81Var5), i, i2);
                if (z4) {
                    d(y81Var5, true);
                    throw null;
                }
            }
            i5 = i;
            i6 = i2;
            i7 = 1;
            Arrays.fill(iArr, 0, 1, 0);
        }
        ArrayList arrayList5 = this.g;
        if (!arrayList5.isEmpty()) {
            if (arrayList5.size() > i7) {
                hu.f0(arrayList5, new w71(e9Var, i7));
            }
            int size6 = arrayList5.size();
            for (int i23 = 0; i23 < size6; i23++) {
                y81 y81Var6 = (y81) arrayList5.get(i23);
                Object objG4 = rk1Var.g(y81Var6.g);
                objG4.getClass();
                vi0.t(objG4);
                y81Var6.c((0 - y81Var6.l) + e(iArr, y81Var6), i5, i6);
                if (z4) {
                    d(y81Var6, true);
                    throw null;
                }
            }
        }
        Collections.reverse(arrayList4);
        arrayList.addAll(0, arrayList4);
        arrayList.addAll(arrayList5);
        arrayList3.clear();
        arrayList2.clear();
        arrayList4.clear();
        arrayList5.clear();
        sk1Var2.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        rk1 rk1Var = this.a;
        if (rk1Var.j()) {
            Object[] objArr = rk1Var.c;
            long[] jArr = rk1Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                vi0.t(objArr[(i << 3) + i3]);
                                throw null;
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            rk1Var.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(y81 y81Var, boolean z) {
        Object objG = this.a.g(y81Var.g);
        objG.getClass();
        vi0.t(objG);
        throw null;
    }
}
