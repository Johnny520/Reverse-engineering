package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class l70 {

    /* JADX INFO: renamed from: a */
    public final jh0 f3371a;

    /* JADX INFO: renamed from: b */
    public C0791u5 f3372b;

    /* JADX INFO: renamed from: c */
    public final kh0 f3373c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f3374d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f3375e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f3376f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f3377g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f3378h;

    /* JADX INFO: renamed from: i */
    public final pe0 f3379i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l70() {
        long[] jArr = dy0.f1212a;
        this.f3371a = new jh0();
        kh0 kh0Var = ey0.f1546a;
        this.f3373c = new kh0();
        this.f3374d = new ArrayList();
        this.f3375e = new ArrayList();
        this.f3376f = new ArrayList();
        this.f3377g = new ArrayList();
        this.f3378h = new ArrayList();
        this.f3379i = new i70(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static int m1978e(int[] iArr, w80 w80Var) {
        w80Var.getClass();
        int i = iArr[0] + w80Var.f7041k;
        iArr[0] = i;
        return Math.max(0, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m1979a() {
        ArrayList arrayList = this.f3378h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        AbstractC0748t1.m4160r(arrayList.get(0));
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1980b(int i, int i2, ArrayList arrayList, C0791u5 c0791u5, t80 t80Var, boolean z, boolean z2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        kh0 kh0Var;
        C0791u5 c0791u52 = this.f3372b;
        this.f3372b = c0791u5;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            w80 w80Var = (w80) arrayList.get(i11);
            int size2 = w80Var.f7032b.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((xq0) w80Var.f7032b.get(i12)).mo50j();
            }
        }
        jh0 jh0Var = this.f3371a;
        if (jh0Var.m1703i()) {
            m1981c();
            return;
        }
        boolean z3 = z || !z2;
        Object[] objArr = jh0Var.f2879b;
        long[] jArr = jh0Var.f2878a;
        int length = jArr.length - 2;
        kh0 kh0Var2 = this.f3373c;
        int i13 = 8;
        boolean z4 = z3;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j = jArr[i14];
                kh0 kh0Var3 = kh0Var2;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    long j2 = j;
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j2 & 255) < 128) {
                            kh0Var = kh0Var3;
                            kh0Var.m1890a(objArr[(i14 << 3) + i16]);
                        } else {
                            kh0Var = kh0Var3;
                        }
                        j2 >>= 8;
                        i16++;
                        kh0Var3 = kh0Var;
                    }
                    kh0Var2 = kh0Var3;
                    if (i15 != 8) {
                        break;
                    }
                } else {
                    kh0Var2 = kh0Var3;
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
            w80 w80Var2 = (w80) arrayList.get(i17);
            Object obj = w80Var2.f7036f;
            List list = w80Var2.f7032b;
            kh0Var2.m1901l(obj);
            int size4 = list.size();
            for (int i18 = 0; i18 < size4; i18++) {
                ((xq0) list.get(i18)).mo50j();
            }
            AbstractC0748t1.m4160r(jh0Var.m1705k(w80Var2.f7036f));
        }
        int[] iArr = new int[1];
        ArrayList arrayList2 = this.f3375e;
        ArrayList arrayList3 = this.f3374d;
        if (z4 && c0791u52 != null) {
            if (arrayList3.isEmpty()) {
                i10 = 0;
            } else {
                if (arrayList3.size() > 1) {
                    AbstractC0127df.m688F(arrayList3, new k70(c0791u52, 2));
                }
                if (arrayList3.size() > 0) {
                    w80 w80Var3 = (w80) arrayList3.get(0);
                    m1978e(iArr, w80Var3);
                    Object objM1701g = jh0Var.m1701g(w80Var3.f7036f);
                    objM1701g.getClass();
                    AbstractC0748t1.m4160r(objM1701g);
                    w80Var3.m4922a(0);
                    throw null;
                }
                i10 = 0;
                Arrays.fill(iArr, 0, 1, 0);
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() > 1) {
                    AbstractC0127df.m688F(arrayList2, new k70(c0791u52, i10));
                }
                if (arrayList2.size() > 0) {
                    w80 w80Var4 = (w80) arrayList2.get(i10);
                    m1978e(iArr, w80Var4);
                    Object objM1701g2 = jh0Var.m1701g(w80Var4.f7036f);
                    objM1701g2.getClass();
                    AbstractC0748t1.m4160r(objM1701g2);
                    w80Var4.m4922a(i10);
                    throw null;
                }
                Arrays.fill(iArr, i10, 1, i10);
            }
        }
        Object[] objArr2 = kh0Var2.f3151b;
        long[] jArr2 = kh0Var2.f3150a;
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
                            AbstractC0748t1.m4160r(jh0Var.m1701g(objArr2[(i19 << 3) + i21]));
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
        ArrayList arrayList4 = this.f3376f;
        if (arrayList4.isEmpty()) {
            i5 = i;
            i6 = i2;
            i7 = 1;
        } else {
            if (arrayList4.size() > 1) {
                AbstractC0127df.m688F(arrayList4, new k70(c0791u5, 3));
            }
            int size5 = arrayList4.size();
            for (int i22 = 0; i22 < size5; i22++) {
                w80 w80Var5 = (w80) arrayList4.get(i22);
                Object objM1701g3 = jh0Var.m1701g(w80Var5.f7036f);
                objM1701g3.getClass();
                AbstractC0748t1.m4160r(objM1701g3);
                w80Var5.m4924c((z ? (int) (((w80) AbstractC0960ye.m5240J(arrayList)).m4922a(0) >> 32) : 0) - m1978e(iArr, w80Var5), i, i2);
                if (z4) {
                    m1982d(w80Var5, true);
                    throw null;
                }
            }
            i5 = i;
            i6 = i2;
            i7 = 1;
            Arrays.fill(iArr, 0, 1, 0);
        }
        ArrayList arrayList5 = this.f3377g;
        if (!arrayList5.isEmpty()) {
            if (arrayList5.size() > i7) {
                AbstractC0127df.m688F(arrayList5, new k70(c0791u5, i7));
            }
            int size6 = arrayList5.size();
            for (int i23 = 0; i23 < size6; i23++) {
                w80 w80Var6 = (w80) arrayList5.get(i23);
                Object objM1701g4 = jh0Var.m1701g(w80Var6.f7036f);
                objM1701g4.getClass();
                AbstractC0748t1.m4160r(objM1701g4);
                w80Var6.m4924c((0 - w80Var6.f7041k) + m1978e(iArr, w80Var6), i5, i6);
                if (z4) {
                    m1982d(w80Var6, true);
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
        kh0Var2.m1891b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1981c() {
        jh0 jh0Var = this.f3371a;
        if (jh0Var.m1704j()) {
            Object[] objArr = jh0Var.f2880c;
            long[] jArr = jh0Var.f2878a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                AbstractC0748t1.m4160r(objArr[(i << 3) + i3]);
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
            jh0Var.m1695a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m1982d(w80 w80Var, boolean z) {
        Object objM1701g = this.f3371a.m1701g(w80Var.f7036f);
        objM1701g.getClass();
        AbstractC0748t1.m4160r(objM1701g);
        throw null;
    }
}
