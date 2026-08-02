package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sn1 extends eo1 {
    public final th1 c;
    public final dk d;
    public final gd1 e;
    public zn1 f;
    public h12 g;
    public boolean h;
    public boolean i;
    public boolean j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sn1(th1 th1Var) {
        this.c = th1Var;
        dk dkVar = new dk((byte) 0, 10);
        dkVar.j = new long[2];
        this.d = dkVar;
        this.e = new gd1(2);
        this.i = true;
        this.j = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:177:0x005a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:180:0x0015 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:182:0x0015 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:185:0x0054 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x004b */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:75:0x01c9 */
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
    @Override // defpackage.eo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(gd1 gd1Var, c61 c61Var, er2 er2Var, boolean z) {
        dk dkVar;
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
        boolean zA = super.a(gd1Var, c61Var, er2Var, z);
        ?? M = this.c;
        boolean z6 = true;
        if (M.u) {
            ?? zk1Var = 0;
            while (M != 0) {
                if (M instanceof r12) {
                    this.f = sp0.Z((r12) M, 16);
                } else if ((M.j & 16) != 0 && (M instanceof u60)) {
                    th1 th1Var = ((u60) M).w;
                    int i6 = 0;
                    M = M;
                    zk1Var = zk1Var;
                    while (th1Var != null) {
                        if ((th1Var.j & 16) != 0) {
                            i6++;
                            zk1Var = zk1Var;
                            if (i6 == 1) {
                                M = th1Var;
                            } else {
                                if (zk1Var == 0) {
                                    zk1Var = new zk1(new th1[16]);
                                }
                                if (M != 0) {
                                    zk1Var.b(M);
                                    M = 0;
                                }
                                zk1Var.b(th1Var);
                            }
                        }
                        th1Var = th1Var.m;
                        M = M;
                        zk1Var = zk1Var;
                    }
                    if (i6 == 1) {
                    }
                }
                M = sp0.m(zk1Var);
            }
            if (this.f != null) {
                int iG = gd1Var.g();
                int i7 = 0;
                while (true) {
                    dkVar = this.d;
                    gd1Var2 = this.e;
                    if (i7 >= iG) {
                        break;
                    }
                    long jA = gd1Var.a(i7);
                    o12 o12Var2 = (o12) gd1Var.h(i7);
                    if (dkVar.g(jA)) {
                        boolean z7 = z6;
                        long j = o12Var2.g;
                        ArrayList arrayList = o12Var2.m;
                        long j2 = o12Var2.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z5 = z7;
                            be0 be0Var = be0.h;
                            z4 = zA;
                            ArrayList arrayList2 = new ArrayList((arrayList == null ? be0Var : arrayList).size());
                            List list = arrayList == null ? be0Var : arrayList;
                            i3 = iG;
                            int size = list.size();
                            i4 = i7;
                            int i8 = 0;
                            while (i8 < size) {
                                List list2 = list;
                                ts0 ts0Var = (ts0) list.get(i8);
                                gd1 gd1Var3 = gd1Var2;
                                long j3 = jA;
                                long j4 = ts0Var.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    o12Var = o12Var2;
                                    long j5 = ts0Var.a;
                                    i5 = size;
                                    zn1 zn1Var = this.f;
                                    zn1Var.getClass();
                                    arrayList2.add(new ts0(j5, zn1Var.D(c61Var2, j4), ts0Var.c, ts0Var.d, ts0Var.e));
                                } else {
                                    i5 = size;
                                    o12Var = o12Var2;
                                }
                                i8++;
                                size = i5;
                                list = list2;
                                gd1Var2 = gd1Var3;
                                jA = j3;
                                o12Var2 = o12Var;
                            }
                            gd1 gd1Var4 = gd1Var2;
                            long j6 = jA;
                            zn1 zn1Var2 = this.f;
                            zn1Var2.getClass();
                            long jD = zn1Var2.D(c61Var2, j);
                            zn1 zn1Var3 = this.f;
                            zn1Var3.getClass();
                            o12 o12Var3 = new o12(o12Var2.a, o12Var2.b, zn1Var3.D(c61Var2, j2), o12Var2.d, o12Var2.e, o12Var2.f, jD, o12Var2.h, o12Var2.i, arrayList2, o12Var2.j, o12Var2.k, o12Var2.l, o12Var2.n);
                            o12 o12Var4 = o12Var2.q;
                            if (o12Var4 == null) {
                                o12Var4 = o12Var2;
                            }
                            o12Var3.q = o12Var4;
                            o12 o12Var5 = o12Var2.q;
                            if (o12Var5 != null) {
                                o12Var2 = o12Var5;
                            }
                            o12Var3.q = o12Var2;
                            gd1Var4.d(j6, o12Var3);
                        } else {
                            z4 = zA;
                            i3 = iG;
                            i4 = i7;
                            z5 = z7;
                        }
                    } else {
                        z4 = zA;
                        i3 = iG;
                        z5 = z6;
                        i4 = i7;
                    }
                    i7 = i4 + 1;
                    c61Var2 = c61Var;
                    iG = i3;
                    z6 = z5;
                    zA = z4;
                }
                boolean z8 = zA;
                boolean z9 = z6;
                if (gd1Var2.g() == 0) {
                    dkVar.i = 0;
                    this.a.g();
                    return z9;
                }
                int i9 = dkVar.i;
                while (true) {
                    i9--;
                    if (-1 >= i9) {
                        break;
                    }
                    long j7 = ((long[]) dkVar.j)[i9];
                    if (gd1Var.h) {
                        int i10 = gd1Var.k;
                        long[] jArr = gd1Var.i;
                        Object[] objArr = gd1Var.j;
                        int i11 = 0;
                        for (int i12 = 0; i12 < i10; i12++) {
                            Object obj2 = objArr[i12];
                            if (obj2 != te.c) {
                                if (i12 != i11) {
                                    jArr[i11] = jArr[i12];
                                    objArr[i11] = obj2;
                                    objArr[i12] = null;
                                }
                                i11++;
                            }
                        }
                        gd1Var.h = false;
                        gd1Var.k = i11;
                    }
                    if (rg3.q(gd1Var.i, gd1Var.k, j7) < 0 && i9 < (i2 = dkVar.i)) {
                        int i13 = i2 - 1;
                        int i14 = i9;
                        while (i14 < i13) {
                            long[] jArr2 = (long[]) dkVar.j;
                            int i15 = i14 + 1;
                            jArr2[i14] = jArr2[i15];
                            i14 = i15;
                        }
                        dkVar.i--;
                    }
                }
                ArrayList arrayList3 = new ArrayList(gd1Var2.g());
                int iG2 = gd1Var2.g();
                for (int i16 = 0; i16 < iG2; i16++) {
                    arrayList3.add(gd1Var2.h(i16));
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
                    if (er2Var.a(((o12) obj).a)) {
                        break;
                    }
                    i17++;
                }
                o12 o12Var6 = (o12) obj;
                if (o12Var6 != null) {
                    boolean z10 = o12Var6.d;
                    if (z) {
                        z2 = false;
                        if (!this.i && (z10 || o12Var6.h)) {
                            zn1 zn1Var4 = this.f;
                            zn1Var4.getClass();
                            long j8 = zn1Var4.j;
                            long j9 = o12Var6.c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                            int i18 = (int) (j8 >> 32);
                            this.i = !((fIntBitsToFloat2 > ((float) ((int) (j8 & 4294967295L))) ? z9 : false) | (fIntBitsToFloat2 < 0.0f ? z9 : false) | (fIntBitsToFloat > ((float) i18) ? z9 : false) | (fIntBitsToFloat < 0.0f ? z9 : false));
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                    }
                    boolean z11 = this.i;
                    boolean z12 = this.h;
                    if (z11 == z12 || !((i = h12Var2.f) == 3 || i == 4 || i == 5)) {
                        int i19 = h12Var2.f;
                        if (i19 == 4 && z12 && !this.j) {
                            h12Var2.f = 3;
                        } else if (i19 == 5 && z11 && z10) {
                            h12Var2.f = 3;
                        }
                    } else {
                        h12Var2.f = z11 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (z8 || h12Var2.f != 3 || (h12Var = this.g) == null) {
                    z3 = z9;
                    break;
                }
                ?? r1 = h12Var.a;
                int size3 = r1.size();
                ?? r4 = h12Var2.a;
                if (size3 == r4.size()) {
                    int size4 = r4.size();
                    for (?? r5 = z2; r5 < size4; r5++) {
                        if (!rs1.b(((o12) r1.get(r5)).c, ((o12) r4.get(r5)).c)) {
                            z3 = z9;
                            break;
                        }
                    }
                    z3 = z2;
                }
                this.g = h12Var2;
                return z3;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.eo1
    public final void b(er2 er2Var) {
        super.b(er2Var);
        h12 h12Var = this.g;
        if (h12Var == null) {
            return;
        }
        this.h = this.i;
        List list = h12Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            o12 o12Var = (o12) list.get(i);
            boolean z = o12Var.d;
            long j = o12Var.a;
            boolean zA = er2Var.a(j);
            boolean z2 = this.i;
            if ((!z && !zA) || (!z && !z2)) {
                this.d.u(j);
            }
        }
        this.i = false;
        this.j = h12Var.f == 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x004c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:0x005b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x0018 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x0018 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:43:0x0055 */
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
    public final void c() {
        zk1 zk1Var = this.a;
        Object[] objArr = zk1Var.h;
        int i = zk1Var.j;
        for (int i2 = 0; i2 < i; i2++) {
            ((sn1) objArr[i2]).c();
        }
        ?? M = this.c;
        ?? zk1Var2 = 0;
        while (M != 0) {
            if (M instanceof r12) {
                ((r12) M).m0();
            } else if ((M.j & 16) != 0 && (M instanceof u60)) {
                th1 th1Var = ((u60) M).w;
                int i3 = 0;
                zk1Var2 = zk1Var2;
                M = M;
                while (th1Var != null) {
                    if ((th1Var.j & 16) != 0) {
                        i3++;
                        zk1Var2 = zk1Var2;
                        if (i3 == 1) {
                            M = th1Var;
                        } else {
                            if (zk1Var2 == 0) {
                                zk1Var2 = new zk1(new th1[16]);
                            }
                            if (M != 0) {
                                zk1Var2.b(M);
                                M = 0;
                            }
                            zk1Var2.b(th1Var);
                        }
                    }
                    th1Var = th1Var.m;
                    zk1Var2 = zk1Var2;
                    M = M;
                }
                if (i3 == 1) {
                }
            }
            M = sp0.m(zk1Var2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(er2 er2Var) {
        boolean z;
        boolean z2;
        r61 r61Var;
        gd1 gd1Var = this.e;
        if (gd1Var.g() == 0) {
            z = false;
        } else {
            th1 th1Var = this.c;
            if (th1Var.u) {
                zn1 zn1Var = th1Var.o;
                if ((zn1Var == null || (r61Var = zn1Var.v) == null) ? false : r61Var.I()) {
                    h12 h12Var = this.g;
                    h12Var.getClass();
                    zn1 zn1Var2 = this.f;
                    zn1Var2.getClass();
                    long j = zn1Var2.j;
                    th1 th1VarM = th1Var;
                    zk1 zk1Var = null;
                    while (true) {
                        z = true;
                        if (th1VarM == null) {
                            break;
                        }
                        if (th1VarM instanceof r12) {
                            ((r12) th1VarM).J(h12Var, i12.j, j);
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            if (((th1VarM.j & 16) != 0) && (th1VarM instanceof u60)) {
                                int i = 0;
                                for (th1 th1Var2 = ((u60) th1VarM).w; th1Var2 != null; th1Var2 = th1Var2.m) {
                                    if ((th1Var2.j & 16) != 0) {
                                        i++;
                                        if (i == 1) {
                                            th1VarM = th1Var2;
                                        } else {
                                            if (zk1Var == null) {
                                                zk1Var = new zk1(new th1[16]);
                                            }
                                            if (th1VarM != null) {
                                                zk1Var.b(th1VarM);
                                                th1VarM = null;
                                            }
                                            zk1Var.b(th1Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                        }
                        th1VarM = sp0.m(zk1Var);
                    }
                    if (th1Var.u) {
                        zk1 zk1Var2 = this.a;
                        Object[] objArr = zk1Var2.h;
                        int i2 = zk1Var2.j;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((sn1) objArr[i3]).d(er2Var);
                        }
                    }
                }
            }
        }
        b(er2Var);
        int i4 = gd1Var.k;
        Object[] objArr2 = gd1Var.j;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr2[i5] = null;
        }
        gd1Var.k = 0;
        gd1Var.h = false;
        this.f = null;
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e(er2 er2Var, boolean z) {
        boolean z2;
        boolean z3;
        r61 r61Var;
        if (this.e.g() == 0) {
            return false;
        }
        th1 th1VarM = this.c;
        if (th1VarM.u) {
            zn1 zn1Var = th1VarM.o;
            if ((zn1Var == null || (r61Var = zn1Var.v) == null) ? false : r61Var.I()) {
                h12 h12Var = this.g;
                h12Var.getClass();
                zn1 zn1Var2 = this.f;
                zn1Var2.getClass();
                long j = zn1Var2.j;
                th1 th1VarM2 = th1VarM;
                zk1 zk1Var = null;
                while (th1VarM2 != null) {
                    if (th1VarM2 instanceof r12) {
                        ((r12) th1VarM2).J(h12Var, i12.h, j);
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        if (((th1VarM2.j & 16) != 0) && (th1VarM2 instanceof u60)) {
                            int i = 0;
                            for (th1 th1Var = ((u60) th1VarM2).w; th1Var != null; th1Var = th1Var.m) {
                                if ((th1Var.j & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        th1VarM2 = th1Var;
                                    } else {
                                        if (zk1Var == null) {
                                            zk1Var = new zk1(new th1[16]);
                                        }
                                        if (th1VarM2 != null) {
                                            zk1Var.b(th1VarM2);
                                            th1VarM2 = null;
                                        }
                                        zk1Var.b(th1Var);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                    }
                    th1VarM2 = sp0.m(zk1Var);
                }
                if (th1VarM.u) {
                    zk1 zk1Var2 = this.a;
                    Object[] objArr = zk1Var2.h;
                    int i2 = zk1Var2.j;
                    for (int i3 = 0; i3 < i2; i3++) {
                        sn1 sn1Var = (sn1) objArr[i3];
                        this.f.getClass();
                        sn1Var.e(er2Var, z);
                    }
                }
                if (th1VarM.u) {
                    zk1 zk1Var3 = null;
                    while (th1VarM != null) {
                        if (th1VarM instanceof r12) {
                            ((r12) th1VarM).J(h12Var, i12.i, j);
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            if (((th1VarM.j & 16) != 0) && (th1VarM instanceof u60)) {
                                int i4 = 0;
                                for (th1 th1Var2 = ((u60) th1VarM).w; th1Var2 != null; th1Var2 = th1Var2.m) {
                                    if ((th1Var2.j & 16) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            th1VarM = th1Var2;
                                        } else {
                                            if (zk1Var3 == null) {
                                                zk1Var3 = new zk1(new th1[16]);
                                            }
                                            if (th1VarM != null) {
                                                zk1Var3.b(th1VarM);
                                                th1VarM = null;
                                            }
                                            zk1Var3.b(th1Var2);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                        }
                        th1VarM = sp0.m(zk1Var3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(long j, lk1 lk1Var) {
        dk dkVar = this.d;
        if (dkVar.g(j) && lk1Var.g(this) < 0) {
            dkVar.u(j);
            this.e.f(j);
        }
        zk1 zk1Var = this.a;
        Object[] objArr = zk1Var.h;
        int i = zk1Var.j;
        for (int i2 = 0; i2 < i; i2++) {
            ((sn1) objArr[i2]).f(j, lk1Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ')';
    }
}
