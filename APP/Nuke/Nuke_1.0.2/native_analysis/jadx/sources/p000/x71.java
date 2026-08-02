package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x71 {

    /* JADX INFO: renamed from: a */
    public final rk1 f12855a;

    /* JADX INFO: renamed from: b */
    public C0158e9 f12856b;

    /* JADX INFO: renamed from: c */
    public final sk1 f12857c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f12858d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f12859e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f12860f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f12861g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f12862h;

    /* JADX INFO: renamed from: i */
    public final uh1 f12863i;

    public x71() {
        long[] jArr = ed2.f2401a;
        this.f12855a = new rk1();
        sk1 sk1Var = fd2.f2911a;
        this.f12857c = new sk1();
        this.f12858d = new ArrayList();
        this.f12859e = new ArrayList();
        this.f12860f = new ArrayList();
        this.f12861g = new ArrayList();
        this.f12862h = new ArrayList();
        this.f12863i = new u71(this);
    }

    /* JADX INFO: renamed from: e */
    public static int m6040e(int[] iArr, y81 y81Var) {
        y81Var.getClass();
        int i = iArr[0] + y81Var.f13358l;
        iArr[0] = i;
        return Math.max(0, i);
    }

    /* JADX INFO: renamed from: a */
    public final long m6041a() {
        ArrayList arrayList = this.f12862h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        vi0.m5701t(arrayList.get(0));
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final void m6042b(int i, int i2, ArrayList arrayList, C0158e9 c0158e9, v81 v81Var, boolean z, boolean z2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        sk1 sk1Var;
        C0158e9 c0158e92 = this.f12856b;
        this.f12856b = c0158e9;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            y81 y81Var = (y81) arrayList.get(i11);
            int size2 = y81Var.f13348b.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((sz1) y81Var.f13348b.get(i12)).mo2342i();
            }
        }
        rk1 rk1Var = this.f12855a;
        if (rk1Var.m4507i()) {
            m6043c();
            return;
        }
        boolean z3 = z || !z2;
        Object[] objArr = rk1Var.f9619b;
        long[] jArr = rk1Var.f9618a;
        int length = jArr.length - 2;
        sk1 sk1Var2 = this.f12857c;
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
                            sk1Var.m4882a(objArr[(i14 << 3) + i16]);
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
            Object obj = y81Var2.f13353g;
            List list = y81Var2.f13348b;
            sk1Var2.m4893l(obj);
            int size4 = list.size();
            for (int i18 = 0; i18 < size4; i18++) {
                ((sz1) list.get(i18)).mo2342i();
            }
            vi0.m5701t(rk1Var.m4509k(y81Var2.f13353g));
        }
        int[] iArr = new int[1];
        ArrayList arrayList2 = this.f12859e;
        ArrayList arrayList3 = this.f12858d;
        if (z4 && c0158e92 != null) {
            if (arrayList3.isEmpty()) {
                i10 = 0;
            } else {
                if (arrayList3.size() > 1) {
                    AbstractC0290hu.m2231f0(arrayList3, new w71(c0158e92, 2));
                }
                if (arrayList3.size() > 0) {
                    y81 y81Var3 = (y81) arrayList3.get(0);
                    m6040e(iArr, y81Var3);
                    Object objM4505g = rk1Var.m4505g(y81Var3.f13353g);
                    objM4505g.getClass();
                    vi0.m5701t(objM4505g);
                    y81Var3.m6225a(0);
                    throw null;
                }
                i10 = 0;
                Arrays.fill(iArr, 0, 1, 0);
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() > 1) {
                    AbstractC0290hu.m2231f0(arrayList2, new w71(c0158e92, i10));
                }
                if (arrayList2.size() > 0) {
                    y81 y81Var4 = (y81) arrayList2.get(i10);
                    m6040e(iArr, y81Var4);
                    Object objM4505g2 = rk1Var.m4505g(y81Var4.f13353g);
                    objM4505g2.getClass();
                    vi0.m5701t(objM4505g2);
                    y81Var4.m6225a(i10);
                    throw null;
                }
                Arrays.fill(iArr, i10, 1, i10);
            }
        }
        Object[] objArr2 = sk1Var2.f10175b;
        long[] jArr2 = sk1Var2.f10174a;
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
                            vi0.m5701t(rk1Var.m4505g(objArr2[(i19 << 3) + i21]));
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
        ArrayList arrayList4 = this.f12860f;
        if (arrayList4.isEmpty()) {
            i5 = i;
            i6 = i2;
            i7 = 1;
        } else {
            if (arrayList4.size() > 1) {
                AbstractC0290hu.m2231f0(arrayList4, new w71(c0158e9, 3));
            }
            int size5 = arrayList4.size();
            for (int i22 = 0; i22 < size5; i22++) {
                y81 y81Var5 = (y81) arrayList4.get(i22);
                Object objM4505g3 = rk1Var.m4505g(y81Var5.f13353g);
                objM4505g3.getClass();
                vi0.m5701t(objM4505g3);
                y81Var5.m6227c((z ? (int) (4294967295L & ((y81) AbstractC0142du.m1159o0(arrayList)).m6225a(0)) : 0) - m6040e(iArr, y81Var5), i, i2);
                if (z4) {
                    m6044d(y81Var5, true);
                    throw null;
                }
            }
            i5 = i;
            i6 = i2;
            i7 = 1;
            Arrays.fill(iArr, 0, 1, 0);
        }
        ArrayList arrayList5 = this.f12861g;
        if (!arrayList5.isEmpty()) {
            if (arrayList5.size() > i7) {
                AbstractC0290hu.m2231f0(arrayList5, new w71(c0158e9, i7));
            }
            int size6 = arrayList5.size();
            for (int i23 = 0; i23 < size6; i23++) {
                y81 y81Var6 = (y81) arrayList5.get(i23);
                Object objM4505g4 = rk1Var.m4505g(y81Var6.f13353g);
                objM4505g4.getClass();
                vi0.m5701t(objM4505g4);
                y81Var6.m6227c((0 - y81Var6.f13358l) + m6040e(iArr, y81Var6), i5, i6);
                if (z4) {
                    m6044d(y81Var6, true);
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
        sk1Var2.m4883b();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6043c() {
        rk1 rk1Var = this.f12855a;
        if (rk1Var.m4508j()) {
            Object[] objArr = rk1Var.f9620c;
            long[] jArr = rk1Var.f9618a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                vi0.m5701t(objArr[(i << 3) + i3]);
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
            rk1Var.m4499a();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6044d(y81 y81Var, boolean z) {
        Object objM4505g = this.f12855a.m4505g(y81Var.f13353g);
        objM4505g.getClass();
        vi0.m5701t(objM4505g);
        throw null;
    }
}
