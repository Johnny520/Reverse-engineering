package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class jj0 extends vj0 {

    /* JADX INFO: renamed from: c */
    public final oe0 f2900c;

    /* JADX INFO: renamed from: d */
    public final C0070bw f2901d;

    /* JADX INFO: renamed from: e */
    public final ub0 f2902e;

    /* JADX INFO: renamed from: f */
    public qj0 f2903f;

    /* JADX INFO: renamed from: g */
    public ir0 f2904g;

    /* JADX INFO: renamed from: h */
    public boolean f2905h;

    /* JADX INFO: renamed from: i */
    public boolean f2906i;

    /* JADX INFO: renamed from: j */
    public boolean f2907j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jj0(oe0 oe0Var) {
        this.f2900c = oe0Var;
        C0070bw c0070bw = new C0070bw();
        c0070bw.f595e = new long[2];
        this.f2901d = c0070bw;
        this.f2902e = new ub0(2);
        this.f2906i = true;
        this.f2907j = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:177:0x005a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:180:0x0015 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:182:0x0015 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:185:0x0054 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x004b */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:75:0x01b7 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x031a  */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [oe0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [oe0] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42, types: [oe0] */
    /* JADX WARN: Type inference failed for: r5v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [sh0] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26, types: [sh0] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    @Override // p000.vj0
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo1712a(ub0 ub0Var, i50 i50Var, C0111d c0111d, boolean z) {
        C0070bw c0070bw;
        ub0 ub0Var2;
        Object obj;
        boolean z2;
        boolean z3;
        ir0 ir0Var;
        int i;
        int i2;
        boolean z4;
        int i3;
        boolean z5;
        int i4;
        int i5;
        nr0 nr0Var;
        boolean zMo1712a = super.mo1712a(ub0Var, i50Var, c0111d, z);
        ?? M3050f = this.f2900c;
        boolean z6 = true;
        if (M3050f.f4542q) {
            ?? sh0Var = 0;
            while (M3050f != 0) {
                if (M3050f instanceof qr0) {
                    this.f2903f = pf1.m3037O((qr0) M3050f, 16);
                } else if ((M3050f.f4531f & 16) != 0 && (M3050f instanceof AbstractC0731sm)) {
                    oe0 oe0Var = ((AbstractC0731sm) M3050f).f5782s;
                    int i6 = 0;
                    M3050f = M3050f;
                    sh0Var = sh0Var;
                    while (oe0Var != null) {
                        if ((oe0Var.f4531f & 16) != 0) {
                            i6++;
                            sh0Var = sh0Var;
                            if (i6 == 1) {
                                M3050f = oe0Var;
                            } else {
                                if (sh0Var == 0) {
                                    sh0Var = new sh0(new oe0[16]);
                                }
                                if (M3050f != 0) {
                                    sh0Var.m4072b(M3050f);
                                    M3050f = 0;
                                }
                                sh0Var.m4072b(oe0Var);
                            }
                        }
                        oe0Var = oe0Var.f4534i;
                        M3050f = M3050f;
                        sh0Var = sh0Var;
                    }
                    if (i6 == 1) {
                    }
                }
                M3050f = pf1.m3050f(sh0Var);
            }
            if (this.f2903f != null) {
                int iM4297d = ub0Var.m4297d();
                int i7 = 0;
                while (true) {
                    c0070bw = this.f2901d;
                    ub0Var2 = this.f2902e;
                    if (i7 >= iM4297d) {
                        break;
                    }
                    long jM4294a = ub0Var.m4294a(i7);
                    nr0 nr0Var2 = (nr0) ub0Var.m4298e(i7);
                    if (c0070bw.m377f(jM4294a)) {
                        boolean z7 = z6;
                        long j = nr0Var2.f4311g;
                        ArrayList arrayList = nr0Var2.f4315k;
                        long j2 = nr0Var2.f4307c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z5 = z7;
                            C0294hs c0294hs = C0294hs.f2354d;
                            z4 = zMo1712a;
                            ArrayList arrayList2 = new ArrayList((arrayList == null ? c0294hs : arrayList).size());
                            List list = arrayList == null ? c0294hs : arrayList;
                            i3 = iM4297d;
                            int size = list.size();
                            i4 = i7;
                            int i8 = 0;
                            while (i8 < size) {
                                List list2 = list;
                                C0448ly c0448ly = (C0448ly) list.get(i8);
                                ub0 ub0Var3 = ub0Var2;
                                long j3 = jM4294a;
                                long j4 = c0448ly.f3617b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    nr0Var = nr0Var2;
                                    long j5 = c0448ly.f3616a;
                                    i5 = size;
                                    qj0 qj0Var = this.f2903f;
                                    qj0Var.getClass();
                                    arrayList2.add(new C0448ly(j5, qj0Var.mo340A(i50Var, j4), c0448ly.f3618c));
                                } else {
                                    i5 = size;
                                    nr0Var = nr0Var2;
                                }
                                i8++;
                                size = i5;
                                list = list2;
                                ub0Var2 = ub0Var3;
                                jM4294a = j3;
                                nr0Var2 = nr0Var;
                            }
                            ub0 ub0Var4 = ub0Var2;
                            long j6 = jM4294a;
                            qj0 qj0Var2 = this.f2903f;
                            qj0Var2.getClass();
                            long jMo340A = qj0Var2.mo340A(i50Var, j);
                            qj0 qj0Var3 = this.f2903f;
                            qj0Var3.getClass();
                            nr0 nr0Var3 = new nr0(nr0Var2.f4305a, nr0Var2.f4306b, qj0Var3.mo340A(i50Var, j2), nr0Var2.f4308d, nr0Var2.f4309e, nr0Var2.f4310f, jMo340A, nr0Var2.f4312h, nr0Var2.f4313i, arrayList2, nr0Var2.f4314j, nr0Var2.f4316l);
                            nr0 nr0Var4 = nr0Var2.f4319o;
                            if (nr0Var4 == null) {
                                nr0Var4 = nr0Var2;
                            }
                            nr0Var3.f4319o = nr0Var4;
                            nr0 nr0Var5 = nr0Var2.f4319o;
                            if (nr0Var5 != null) {
                                nr0Var2 = nr0Var5;
                            }
                            nr0Var3.f4319o = nr0Var2;
                            ub0Var4.m4295b(j6, nr0Var3);
                        } else {
                            z4 = zMo1712a;
                            i3 = iM4297d;
                            i4 = i7;
                            z5 = z7;
                        }
                    } else {
                        z4 = zMo1712a;
                        i3 = iM4297d;
                        z5 = z6;
                        i4 = i7;
                    }
                    i7 = i4 + 1;
                    iM4297d = i3;
                    z6 = z5;
                    zMo1712a = z4;
                }
                boolean z8 = zMo1712a;
                boolean z9 = z6;
                if (ub0Var2.m4297d() == 0) {
                    c0070bw.f594d = 0;
                    this.f6726a.m4077g();
                    return z9;
                }
                int i9 = c0070bw.f594d;
                while (true) {
                    i9--;
                    if (-1 >= i9) {
                        break;
                    }
                    long j7 = ((long[]) c0070bw.f595e)[i9];
                    if (ub0Var.f6185d) {
                        int i10 = ub0Var.f6188g;
                        long[] jArr = ub0Var.f6186e;
                        Object[] objArr = ub0Var.f6187f;
                        int i11 = 0;
                        for (int i12 = 0; i12 < i10; i12++) {
                            Object obj2 = objArr[i12];
                            if (obj2 != rd0.f5372k) {
                                if (i12 != i11) {
                                    jArr[i11] = jArr[i12];
                                    objArr[i11] = obj2;
                                    objArr[i12] = null;
                                }
                                i11++;
                            }
                        }
                        ub0Var.f6185d = false;
                        ub0Var.f6188g = i11;
                    }
                    if (o30.m2771k(ub0Var.f6186e, ub0Var.f6188g, j7) < 0 && i9 < (i2 = c0070bw.f594d)) {
                        int i13 = i2 - 1;
                        int i14 = i9;
                        while (i14 < i13) {
                            long[] jArr2 = (long[]) c0070bw.f595e;
                            int i15 = i14 + 1;
                            jArr2[i14] = jArr2[i15];
                            i14 = i15;
                        }
                        c0070bw.f594d--;
                    }
                }
                ArrayList arrayList3 = new ArrayList(ub0Var2.m4297d());
                int iM4297d2 = ub0Var2.m4297d();
                for (int i16 = 0; i16 < iM4297d2; i16++) {
                    arrayList3.add(ub0Var2.m4298e(i16));
                }
                ir0 ir0Var2 = new ir0(arrayList3, c0111d);
                int size2 = arrayList3.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList3.get(i17);
                    if (c0111d.m614j(((nr0) obj).f4305a)) {
                        break;
                    }
                    i17++;
                }
                nr0 nr0Var6 = (nr0) obj;
                if (nr0Var6 != null) {
                    boolean z10 = nr0Var6.f4308d;
                    if (z) {
                        z2 = false;
                        if (!this.f2906i && (z10 || nr0Var6.f4312h)) {
                            qj0 qj0Var4 = this.f2903f;
                            qj0Var4.getClass();
                            long j8 = qj0Var4.f7402f;
                            long j9 = nr0Var6.f4307c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                            int i18 = (int) (j8 >> 32);
                            this.f2906i = !((fIntBitsToFloat2 > ((float) ((int) (j8 & 4294967295L))) ? z9 : false) | (fIntBitsToFloat2 < 0.0f ? z9 : false) | (fIntBitsToFloat > ((float) i18) ? z9 : false) | (fIntBitsToFloat < 0.0f ? z9 : false));
                        }
                    } else {
                        z2 = false;
                        this.f2906i = false;
                    }
                    boolean z11 = this.f2906i;
                    boolean z12 = this.f2905h;
                    if (z11 == z12 || !((i = ir0Var2.f2613d) == 3 || i == 4 || i == 5)) {
                        int i19 = ir0Var2.f2613d;
                        if (i19 == 4 && z12 && !this.f2907j) {
                            ir0Var2.f2613d = 3;
                        } else if (i19 == 5 && z11 && z10) {
                            ir0Var2.f2613d = 3;
                        }
                    } else {
                        ir0Var2.f2613d = z11 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (z8 || ir0Var2.f2613d != 3 || (ir0Var = this.f2904g) == null) {
                    z3 = z9;
                    break;
                }
                ?? r1 = ir0Var.f2610a;
                int size3 = r1.size();
                ?? r4 = ir0Var2.f2610a;
                if (size3 == r4.size()) {
                    int size4 = r4.size();
                    for (?? r5 = z2; r5 < size4; r5++) {
                        if (!ok0.m2931b(((nr0) r1.get(r5)).f4307c, ((nr0) r4.get(r5)).f4307c)) {
                            z3 = z9;
                            break;
                        }
                    }
                    z3 = z2;
                }
                this.f2904g = ir0Var2;
                return z3;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.vj0
    /* JADX INFO: renamed from: b */
    public final void mo1713b(C0111d c0111d) {
        super.mo1713b(c0111d);
        ir0 ir0Var = this.f2904g;
        if (ir0Var == null) {
            return;
        }
        this.f2905h = this.f2906i;
        List list = ir0Var.f2610a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            nr0 nr0Var = (nr0) list.get(i);
            boolean z = nr0Var.f4308d;
            long j = nr0Var.f4305a;
            boolean zM614j = c0111d.m614j(j);
            boolean z2 = this.f2906i;
            if ((!z && !zM614j) || (!z && !z2)) {
                this.f2901d.m380j(j);
            }
        }
        this.f2906i = false;
        this.f2907j = ir0Var.f2613d == 5;
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
    /* JADX WARN: Type inference failed for: r1v4, types: [sh0] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [sh0] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [oe0] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [oe0] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [oe0] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: c */
    public final void m1714c() {
        sh0 sh0Var = this.f6726a;
        Object[] objArr = sh0Var.f5768d;
        int i = sh0Var.f5770f;
        for (int i2 = 0; i2 < i; i2++) {
            ((jj0) objArr[i2]).m1714c();
        }
        ?? M3050f = this.f2900c;
        ?? sh0Var2 = 0;
        while (M3050f != 0) {
            if (M3050f instanceof qr0) {
                ((qr0) M3050f).mo758U();
            } else if ((M3050f.f4531f & 16) != 0 && (M3050f instanceof AbstractC0731sm)) {
                oe0 oe0Var = ((AbstractC0731sm) M3050f).f5782s;
                int i3 = 0;
                sh0Var2 = sh0Var2;
                M3050f = M3050f;
                while (oe0Var != null) {
                    if ((oe0Var.f4531f & 16) != 0) {
                        i3++;
                        sh0Var2 = sh0Var2;
                        if (i3 == 1) {
                            M3050f = oe0Var;
                        } else {
                            if (sh0Var2 == 0) {
                                sh0Var2 = new sh0(new oe0[16]);
                            }
                            if (M3050f != 0) {
                                sh0Var2.m4072b(M3050f);
                                M3050f = 0;
                            }
                            sh0Var2.m4072b(oe0Var);
                        }
                    }
                    oe0Var = oe0Var.f4534i;
                    sh0Var2 = sh0Var2;
                    M3050f = M3050f;
                }
                if (i3 == 1) {
                }
            }
            M3050f = pf1.m3050f(sh0Var2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:27:0x0058 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:47:0x0067 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:50:0x0022 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x0022 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:55:0x0061 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [oe0] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [oe0] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [sh0] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [sh0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1715d(C0111d c0111d) {
        boolean z;
        ub0 ub0Var = this.f2902e;
        if (ub0Var.m4297d() == 0) {
            z = false;
        } else {
            oe0 oe0Var = this.f2900c;
            if (oe0Var.f4542q) {
                ir0 ir0Var = this.f2904g;
                ir0Var.getClass();
                qj0 qj0Var = this.f2903f;
                qj0Var.getClass();
                long j = qj0Var.f7402f;
                ?? M3050f = oe0Var;
                ?? sh0Var = 0;
                while (true) {
                    z = true;
                    if (M3050f == 0) {
                        break;
                    }
                    if (M3050f instanceof qr0) {
                        ((qr0) M3050f).mo762x(ir0Var, jr0.f2935f, j);
                    } else if ((M3050f.f4531f & 16) != 0 && (M3050f instanceof AbstractC0731sm)) {
                        oe0 oe0Var2 = ((AbstractC0731sm) M3050f).f5782s;
                        int i = 0;
                        M3050f = M3050f;
                        sh0Var = sh0Var;
                        while (oe0Var2 != null) {
                            if ((oe0Var2.f4531f & 16) != 0) {
                                i++;
                                sh0Var = sh0Var;
                                if (i == 1) {
                                    M3050f = oe0Var2;
                                } else {
                                    if (sh0Var == 0) {
                                        sh0Var = new sh0(new oe0[16]);
                                    }
                                    if (M3050f != 0) {
                                        sh0Var.m4072b(M3050f);
                                        M3050f = 0;
                                    }
                                    sh0Var.m4072b(oe0Var2);
                                }
                            }
                            oe0Var2 = oe0Var2.f4534i;
                            M3050f = M3050f;
                            sh0Var = sh0Var;
                        }
                        if (i == 1) {
                        }
                    }
                    M3050f = pf1.m3050f(sh0Var);
                }
                if (oe0Var.f4542q) {
                    sh0 sh0Var2 = this.f6726a;
                    Object[] objArr = sh0Var2.f5768d;
                    int i2 = sh0Var2.f5770f;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((jj0) objArr[i3]).m1715d(c0111d);
                    }
                }
            }
        }
        mo1713b(c0111d);
        int i4 = ub0Var.f6188g;
        Object[] objArr2 = ub0Var.f6187f;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr2[i5] = null;
        }
        ub0Var.f6188g = 0;
        ub0Var.f6185d = false;
        this.f2903f = null;
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:27:0x0056 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:59:0x00be */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:69:0x0065 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x0020 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x0020 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:77:0x005f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:82:0x00cd */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:85:0x008b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:87:0x008b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:90:0x00c7 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [oe0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [oe0] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [oe0] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [sh0] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [sh0] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [oe0] */
    /* JADX WARN: Type inference failed for: r6v10, types: [oe0] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [sh0] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [sh0] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: e */
    public final boolean m1716e(C0111d c0111d, boolean z) {
        if (this.f2902e.m4297d() == 0) {
            return false;
        }
        ?? M3050f = this.f2900c;
        if (!M3050f.f4542q) {
            return false;
        }
        ir0 ir0Var = this.f2904g;
        ir0Var.getClass();
        qj0 qj0Var = this.f2903f;
        qj0Var.getClass();
        long j = qj0Var.f7402f;
        ?? M3050f2 = M3050f;
        ?? sh0Var = 0;
        while (M3050f2 != 0) {
            if (M3050f2 instanceof qr0) {
                ((qr0) M3050f2).mo762x(ir0Var, jr0.f2933d, j);
            } else if ((M3050f2.f4531f & 16) != 0 && (M3050f2 instanceof AbstractC0731sm)) {
                oe0 oe0Var = ((AbstractC0731sm) M3050f2).f5782s;
                int i = 0;
                M3050f2 = M3050f2;
                sh0Var = sh0Var;
                while (oe0Var != null) {
                    if ((oe0Var.f4531f & 16) != 0) {
                        i++;
                        sh0Var = sh0Var;
                        if (i == 1) {
                            M3050f2 = oe0Var;
                        } else {
                            if (sh0Var == 0) {
                                sh0Var = new sh0(new oe0[16]);
                            }
                            if (M3050f2 != 0) {
                                sh0Var.m4072b(M3050f2);
                                M3050f2 = 0;
                            }
                            sh0Var.m4072b(oe0Var);
                        }
                    }
                    oe0Var = oe0Var.f4534i;
                    M3050f2 = M3050f2;
                    sh0Var = sh0Var;
                }
                if (i == 1) {
                }
            }
            M3050f2 = pf1.m3050f(sh0Var);
        }
        if (M3050f.f4542q) {
            sh0 sh0Var2 = this.f6726a;
            Object[] objArr = sh0Var2.f5768d;
            int i2 = sh0Var2.f5770f;
            for (int i3 = 0; i3 < i2; i3++) {
                jj0 jj0Var = (jj0) objArr[i3];
                this.f2903f.getClass();
                jj0Var.m1716e(c0111d, z);
            }
        }
        if (M3050f.f4542q) {
            ?? sh0Var3 = 0;
            while (M3050f != 0) {
                if (M3050f instanceof qr0) {
                    ((qr0) M3050f).mo762x(ir0Var, jr0.f2934e, j);
                } else if ((M3050f.f4531f & 16) != 0 && (M3050f instanceof AbstractC0731sm)) {
                    oe0 oe0Var2 = ((AbstractC0731sm) M3050f).f5782s;
                    int i4 = 0;
                    M3050f = M3050f;
                    sh0Var3 = sh0Var3;
                    while (oe0Var2 != null) {
                        if ((oe0Var2.f4531f & 16) != 0) {
                            i4++;
                            sh0Var3 = sh0Var3;
                            if (i4 == 1) {
                                M3050f = oe0Var2;
                            } else {
                                if (sh0Var3 == 0) {
                                    sh0Var3 = new sh0(new oe0[16]);
                                }
                                if (M3050f != 0) {
                                    sh0Var3.m4072b(M3050f);
                                    M3050f = 0;
                                }
                                sh0Var3.m4072b(oe0Var2);
                            }
                        }
                        oe0Var2 = oe0Var2.f4534i;
                        M3050f = M3050f;
                        sh0Var3 = sh0Var3;
                    }
                    if (i4 == 1) {
                    }
                }
                M3050f = pf1.m3050f(sh0Var3);
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m1717f(long j, dh0 dh0Var) {
        C0070bw c0070bw = this.f2901d;
        if (c0070bw.m377f(j) && dh0Var.m703g(this) < 0) {
            c0070bw.m380j(j);
            this.f2902e.m4296c(j);
        }
        sh0 sh0Var = this.f6726a;
        Object[] objArr = sh0Var.f5768d;
        int i = sh0Var.f5770f;
        for (int i2 = 0; i2 < i; i2++) {
            ((jj0) objArr[i2]).m1717f(j, dh0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Node(modifierNode=" + this.f2900c + ", children=" + this.f6726a + ", pointerIds=" + this.f2901d + ')';
    }
}
