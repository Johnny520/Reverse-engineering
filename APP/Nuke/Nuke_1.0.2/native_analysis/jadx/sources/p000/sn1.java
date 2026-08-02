package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sn1 extends eo1 {

    /* JADX INFO: renamed from: c */
    public final th1 f10240c;

    /* JADX INFO: renamed from: d */
    public final C0133dk f10241d;

    /* JADX INFO: renamed from: e */
    public final gd1 f10242e;

    /* JADX INFO: renamed from: f */
    public zn1 f10243f;

    /* JADX INFO: renamed from: g */
    public h12 f10244g;

    /* JADX INFO: renamed from: h */
    public boolean f10245h;

    /* JADX INFO: renamed from: i */
    public boolean f10246i;

    /* JADX INFO: renamed from: j */
    public boolean f10247j;

    public sn1(th1 th1Var) {
        this.f10240c = th1Var;
        C0133dk c0133dk = new C0133dk((byte) 0, 10);
        c0133dk.f2082j = new long[2];
        this.f10241d = c0133dk;
        this.f10242e = new gd1(2);
        this.f10246i = true;
        this.f10247j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x032c  */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [th1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [th1] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40, types: [th1] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [zk1] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [zk1] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    @Override // p000.eo1
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo1398a(gd1 gd1Var, c61 c61Var, er2 er2Var, boolean z) {
        C0133dk c0133dk;
        gd1 gd1Var2;
        Object obj;
        boolean z2;
        boolean z3;
        h12 h12Var;
        int i;
        int i2;
        boolean z4;
        int i3;
        boolean z5;
        int i4;
        int i5;
        o12 o12Var;
        c61 c61Var2 = c61Var;
        boolean zMo1398a = super.mo1398a(gd1Var, c61Var, er2Var, z);
        ?? M4952m = this.f10240c;
        boolean z6 = true;
        if (M4952m.f10770u) {
            ?? zk1Var = 0;
            while (M4952m != 0) {
                if (M4952m instanceof r12) {
                    this.f10243f = sp0.m4927Z((r12) M4952m, 16);
                } else if ((M4952m.f10759j & 16) != 0 && (M4952m instanceof u60)) {
                    th1 th1Var = ((u60) M4952m).f11116w;
                    int i6 = 0;
                    M4952m = M4952m;
                    zk1Var = zk1Var;
                    while (th1Var != null) {
                        if ((th1Var.f10759j & 16) != 0) {
                            i6++;
                            zk1Var = zk1Var;
                            if (i6 == 1) {
                                M4952m = th1Var;
                            } else {
                                if (zk1Var == 0) {
                                    zk1Var = new zk1(new th1[16]);
                                }
                                if (M4952m != 0) {
                                    zk1Var.m6423b(M4952m);
                                    M4952m = 0;
                                }
                                zk1Var.m6423b(th1Var);
                            }
                        }
                        th1Var = th1Var.f10762m;
                        M4952m = M4952m;
                        zk1Var = zk1Var;
                    }
                    if (i6 == 1) {
                    }
                }
                M4952m = sp0.m4952m(zk1Var);
            }
            if (this.f10243f != null) {
                int iM1833g = gd1Var.m1833g();
                int i7 = 0;
                while (true) {
                    c0133dk = this.f10241d;
                    gd1Var2 = this.f10242e;
                    if (i7 >= iM1833g) {
                        break;
                    }
                    long jM1830a = gd1Var.m1830a(i7);
                    o12 o12Var2 = (o12) gd1Var.m1834h(i7);
                    if (c0133dk.m1036g(jM1830a)) {
                        boolean z7 = z6;
                        long j = o12Var2.f7426g;
                        ArrayList arrayList = o12Var2.f7432m;
                        long j2 = o12Var2.f7422c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z5 = z7;
                            be0 be0Var = be0.f819h;
                            z4 = zMo1398a;
                            ArrayList arrayList2 = new ArrayList((arrayList == null ? be0Var : arrayList).size());
                            List list = arrayList == null ? be0Var : arrayList;
                            i3 = iM1833g;
                            int size = list.size();
                            i4 = i7;
                            int i8 = 0;
                            while (i8 < size) {
                                List list2 = list;
                                ts0 ts0Var = (ts0) list.get(i8);
                                gd1 gd1Var3 = gd1Var2;
                                long j3 = jM1830a;
                                long j4 = ts0Var.f10942b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    o12Var = o12Var2;
                                    long j5 = ts0Var.f10941a;
                                    i5 = size;
                                    zn1 zn1Var = this.f10243f;
                                    zn1Var.getClass();
                                    arrayList2.add(new ts0(j5, zn1Var.mo642D(c61Var2, j4), ts0Var.f10943c, ts0Var.f10944d, ts0Var.f10945e));
                                } else {
                                    i5 = size;
                                    o12Var = o12Var2;
                                }
                                i8++;
                                size = i5;
                                list = list2;
                                gd1Var2 = gd1Var3;
                                jM1830a = j3;
                                o12Var2 = o12Var;
                            }
                            gd1 gd1Var4 = gd1Var2;
                            long j6 = jM1830a;
                            zn1 zn1Var2 = this.f10243f;
                            zn1Var2.getClass();
                            long jMo642D = zn1Var2.mo642D(c61Var2, j);
                            zn1 zn1Var3 = this.f10243f;
                            zn1Var3.getClass();
                            o12 o12Var3 = new o12(o12Var2.f7420a, o12Var2.f7421b, zn1Var3.mo642D(c61Var2, j2), o12Var2.f7423d, o12Var2.f7424e, o12Var2.f7425f, jMo642D, o12Var2.f7427h, o12Var2.f7428i, arrayList2, o12Var2.f7429j, o12Var2.f7430k, o12Var2.f7431l, o12Var2.f7433n);
                            o12 o12Var4 = o12Var2.f7436q;
                            if (o12Var4 == null) {
                                o12Var4 = o12Var2;
                            }
                            o12Var3.f7436q = o12Var4;
                            o12 o12Var5 = o12Var2.f7436q;
                            if (o12Var5 != null) {
                                o12Var2 = o12Var5;
                            }
                            o12Var3.f7436q = o12Var2;
                            gd1Var4.m1831d(j6, o12Var3);
                        } else {
                            z4 = zMo1398a;
                            i3 = iM1833g;
                            i4 = i7;
                            z5 = z7;
                        }
                    } else {
                        z4 = zMo1398a;
                        i3 = iM1833g;
                        z5 = z6;
                        i4 = i7;
                    }
                    i7 = i4 + 1;
                    c61Var2 = c61Var;
                    iM1833g = i3;
                    z6 = z5;
                    zMo1398a = z4;
                }
                boolean z8 = zMo1398a;
                boolean z9 = z6;
                if (gd1Var2.m1833g() == 0) {
                    c0133dk.f2081i = 0;
                    this.f2530a.m6428g();
                    return z9;
                }
                int i9 = c0133dk.f2081i;
                while (true) {
                    i9--;
                    if (-1 >= i9) {
                        break;
                    }
                    long j7 = ((long[]) c0133dk.f2082j)[i9];
                    if (gd1Var.f3409h) {
                        int i10 = gd1Var.f3412k;
                        long[] jArr = gd1Var.f3410i;
                        Object[] objArr = gd1Var.f3411j;
                        int i11 = 0;
                        for (int i12 = 0; i12 < i10; i12++) {
                            Object obj2 = objArr[i12];
                            if (obj2 != AbstractC0731te.f10691c) {
                                if (i12 != i11) {
                                    jArr[i11] = jArr[i12];
                                    objArr[i11] = obj2;
                                    objArr[i12] = null;
                                }
                                i11++;
                            }
                        }
                        gd1Var.f3409h = false;
                        gd1Var.f3412k = i11;
                    }
                    if (rg3.m4481q(gd1Var.f3410i, gd1Var.f3412k, j7) < 0 && i9 < (i2 = c0133dk.f2081i)) {
                        int i13 = i2 - 1;
                        int i14 = i9;
                        while (i14 < i13) {
                            long[] jArr2 = (long[]) c0133dk.f2082j;
                            int i15 = i14 + 1;
                            jArr2[i14] = jArr2[i15];
                            i14 = i15;
                        }
                        c0133dk.f2081i--;
                    }
                }
                ArrayList arrayList3 = new ArrayList(gd1Var2.m1833g());
                int iM1833g2 = gd1Var2.m1833g();
                for (int i16 = 0; i16 < iM1833g2; i16++) {
                    arrayList3.add(gd1Var2.m1834h(i16));
                }
                h12 h12Var2 = new h12(arrayList3, er2Var);
                int size2 = arrayList3.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList3.get(i17);
                    if (er2Var.m1411a(((o12) obj).f7420a)) {
                        break;
                    }
                    i17++;
                }
                o12 o12Var6 = (o12) obj;
                if (o12Var6 != null) {
                    boolean z10 = o12Var6.f7423d;
                    if (z) {
                        z2 = false;
                        if (!this.f10246i && (z10 || o12Var6.f7427h)) {
                            zn1 zn1Var4 = this.f10243f;
                            zn1Var4.getClass();
                            long j8 = zn1Var4.f10440j;
                            long j9 = o12Var6.f7422c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                            int i18 = (int) (j8 >> 32);
                            this.f10246i = !((fIntBitsToFloat2 > ((float) ((int) (j8 & 4294967295L))) ? z9 : false) | (fIntBitsToFloat2 < 0.0f ? z9 : false) | (fIntBitsToFloat > ((float) i18) ? z9 : false) | (fIntBitsToFloat < 0.0f ? z9 : false));
                        }
                    } else {
                        z2 = false;
                        this.f10246i = false;
                    }
                    boolean z11 = this.f10246i;
                    boolean z12 = this.f10245h;
                    if (z11 == z12 || !((i = h12Var2.f3781f) == 3 || i == 4 || i == 5)) {
                        int i19 = h12Var2.f3781f;
                        if (i19 == 4 && z12 && !this.f10247j) {
                            h12Var2.f3781f = 3;
                        } else if (i19 == 5 && z11 && z10) {
                            h12Var2.f3781f = 3;
                        }
                    } else {
                        h12Var2.f3781f = z11 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (z8 || h12Var2.f3781f != 3 || (h12Var = this.f10244g) == null) {
                    z3 = z9;
                    break;
                }
                ?? r1 = h12Var.f3776a;
                int size3 = r1.size();
                ?? r4 = h12Var2.f3776a;
                if (size3 == r4.size()) {
                    int size4 = r4.size();
                    for (?? r5 = z2; r5 < size4; r5++) {
                        if (!rs1.m4609b(((o12) r1.get(r5)).f7422c, ((o12) r4.get(r5)).f7422c)) {
                            z3 = z9;
                            break;
                        }
                    }
                    z3 = z2;
                }
                this.f10244g = h12Var2;
                return z3;
            }
        }
        return true;
    }

    @Override // p000.eo1
    /* JADX INFO: renamed from: b */
    public final void mo1399b(er2 er2Var) {
        super.mo1399b(er2Var);
        h12 h12Var = this.f10244g;
        if (h12Var == null) {
            return;
        }
        this.f10245h = this.f10246i;
        List list = h12Var.f3776a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            o12 o12Var = (o12) list.get(i);
            boolean z = o12Var.f7423d;
            long j = o12Var.f7420a;
            boolean zM1411a = er2Var.m1411a(j);
            boolean z2 = this.f10246i;
            if ((!z && !zM1411a) || (!z && !z2)) {
                this.f10241d.m1043u(j);
            }
        }
        this.f10246i = false;
        this.f10247j = h12Var.f3781f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [zk1] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [zk1] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [th1] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [th1] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [th1] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: c */
    public final void m4896c() {
        zk1 zk1Var = this.f2530a;
        Object[] objArr = zk1Var.f13934h;
        int i = zk1Var.f13936j;
        for (int i2 = 0; i2 < i; i2++) {
            ((sn1) objArr[i2]).m4896c();
        }
        ?? M4952m = this.f10240c;
        ?? zk1Var2 = 0;
        while (M4952m != 0) {
            if (M4952m instanceof r12) {
                ((r12) M4952m).mo233m0();
            } else if ((M4952m.f10759j & 16) != 0 && (M4952m instanceof u60)) {
                th1 th1Var = ((u60) M4952m).f11116w;
                int i3 = 0;
                zk1Var2 = zk1Var2;
                M4952m = M4952m;
                while (th1Var != null) {
                    if ((th1Var.f10759j & 16) != 0) {
                        i3++;
                        zk1Var2 = zk1Var2;
                        if (i3 == 1) {
                            M4952m = th1Var;
                        } else {
                            if (zk1Var2 == 0) {
                                zk1Var2 = new zk1(new th1[16]);
                            }
                            if (M4952m != 0) {
                                zk1Var2.m6423b(M4952m);
                                M4952m = 0;
                            }
                            zk1Var2.m6423b(th1Var);
                        }
                    }
                    th1Var = th1Var.f10762m;
                    zk1Var2 = zk1Var2;
                    M4952m = M4952m;
                }
                if (i3 == 1) {
                }
            }
            M4952m = sp0.m4952m(zk1Var2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4897d(er2 er2Var) {
        boolean z;
        boolean z2;
        r61 r61Var;
        gd1 gd1Var = this.f10242e;
        if (gd1Var.m1833g() == 0) {
            z = false;
        } else {
            th1 th1Var = this.f10240c;
            if (th1Var.f10770u) {
                zn1 zn1Var = th1Var.f10764o;
                if ((zn1Var == null || (r61Var = zn1Var.f13985v) == null) ? false : r61Var.m4351I()) {
                    h12 h12Var = this.f10244g;
                    h12Var.getClass();
                    zn1 zn1Var2 = this.f10243f;
                    zn1Var2.getClass();
                    long j = zn1Var2.f10440j;
                    th1 th1VarM4952m = th1Var;
                    zk1 zk1Var = null;
                    while (true) {
                        z = true;
                        if (th1VarM4952m == null) {
                            break;
                        }
                        if (th1VarM4952m instanceof r12) {
                            ((r12) th1VarM4952m).mo215J(h12Var, i12.f4218j, j);
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            if (((th1VarM4952m.f10759j & 16) != 0) && (th1VarM4952m instanceof u60)) {
                                int i = 0;
                                for (th1 th1Var2 = ((u60) th1VarM4952m).f11116w; th1Var2 != null; th1Var2 = th1Var2.f10762m) {
                                    if ((th1Var2.f10759j & 16) != 0) {
                                        i++;
                                        if (i == 1) {
                                            th1VarM4952m = th1Var2;
                                        } else {
                                            if (zk1Var == null) {
                                                zk1Var = new zk1(new th1[16]);
                                            }
                                            if (th1VarM4952m != null) {
                                                zk1Var.m6423b(th1VarM4952m);
                                                th1VarM4952m = null;
                                            }
                                            zk1Var.m6423b(th1Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                        }
                        th1VarM4952m = sp0.m4952m(zk1Var);
                    }
                    if (th1Var.f10770u) {
                        zk1 zk1Var2 = this.f2530a;
                        Object[] objArr = zk1Var2.f13934h;
                        int i2 = zk1Var2.f13936j;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((sn1) objArr[i3]).m4897d(er2Var);
                        }
                    }
                }
            }
        }
        mo1399b(er2Var);
        int i4 = gd1Var.f3412k;
        Object[] objArr2 = gd1Var.f3411j;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr2[i5] = null;
        }
        gd1Var.f3412k = 0;
        gd1Var.f3409h = false;
        this.f10243f = null;
        return z;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4898e(er2 er2Var, boolean z) {
        boolean z2;
        boolean z3;
        r61 r61Var;
        if (this.f10242e.m1833g() == 0) {
            return false;
        }
        th1 th1VarM4952m = this.f10240c;
        if (th1VarM4952m.f10770u) {
            zn1 zn1Var = th1VarM4952m.f10764o;
            if ((zn1Var == null || (r61Var = zn1Var.f13985v) == null) ? false : r61Var.m4351I()) {
                h12 h12Var = this.f10244g;
                h12Var.getClass();
                zn1 zn1Var2 = this.f10243f;
                zn1Var2.getClass();
                long j = zn1Var2.f10440j;
                th1 th1VarM4952m2 = th1VarM4952m;
                zk1 zk1Var = null;
                while (th1VarM4952m2 != null) {
                    if (th1VarM4952m2 instanceof r12) {
                        ((r12) th1VarM4952m2).mo215J(h12Var, i12.f4216h, j);
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        if (((th1VarM4952m2.f10759j & 16) != 0) && (th1VarM4952m2 instanceof u60)) {
                            int i = 0;
                            for (th1 th1Var = ((u60) th1VarM4952m2).f11116w; th1Var != null; th1Var = th1Var.f10762m) {
                                if ((th1Var.f10759j & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        th1VarM4952m2 = th1Var;
                                    } else {
                                        if (zk1Var == null) {
                                            zk1Var = new zk1(new th1[16]);
                                        }
                                        if (th1VarM4952m2 != null) {
                                            zk1Var.m6423b(th1VarM4952m2);
                                            th1VarM4952m2 = null;
                                        }
                                        zk1Var.m6423b(th1Var);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                    }
                    th1VarM4952m2 = sp0.m4952m(zk1Var);
                }
                if (th1VarM4952m.f10770u) {
                    zk1 zk1Var2 = this.f2530a;
                    Object[] objArr = zk1Var2.f13934h;
                    int i2 = zk1Var2.f13936j;
                    for (int i3 = 0; i3 < i2; i3++) {
                        sn1 sn1Var = (sn1) objArr[i3];
                        this.f10243f.getClass();
                        sn1Var.m4898e(er2Var, z);
                    }
                }
                if (th1VarM4952m.f10770u) {
                    zk1 zk1Var3 = null;
                    while (th1VarM4952m != null) {
                        if (th1VarM4952m instanceof r12) {
                            ((r12) th1VarM4952m).mo215J(h12Var, i12.f4217i, j);
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            if (((th1VarM4952m.f10759j & 16) != 0) && (th1VarM4952m instanceof u60)) {
                                int i4 = 0;
                                for (th1 th1Var2 = ((u60) th1VarM4952m).f11116w; th1Var2 != null; th1Var2 = th1Var2.f10762m) {
                                    if ((th1Var2.f10759j & 16) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            th1VarM4952m = th1Var2;
                                        } else {
                                            if (zk1Var3 == null) {
                                                zk1Var3 = new zk1(new th1[16]);
                                            }
                                            if (th1VarM4952m != null) {
                                                zk1Var3.m6423b(th1VarM4952m);
                                                th1VarM4952m = null;
                                            }
                                            zk1Var3.m6423b(th1Var2);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                        }
                        th1VarM4952m = sp0.m4952m(zk1Var3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m4899f(long j, lk1 lk1Var) {
        C0133dk c0133dk = this.f10241d;
        if (c0133dk.m1036g(j) && lk1Var.m2931g(this) < 0) {
            c0133dk.m1043u(j);
            this.f10242e.m1832f(j);
        }
        zk1 zk1Var = this.f2530a;
        Object[] objArr = zk1Var.f13934h;
        int i = zk1Var.f13936j;
        for (int i2 = 0; i2 < i; i2++) {
            ((sn1) objArr[i2]).m4899f(j, lk1Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f10240c + ", children=" + this.f2530a + ", pointerIds=" + this.f10241d + ')';
    }
}
