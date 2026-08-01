package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class nh0 extends l21 {

    /* JADX INFO: renamed from: n */
    public static final int[] f4264n = new int[0];

    /* JADX INFO: renamed from: e */
    public final InterfaceC0742sw f4265e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0742sw f4266f;

    /* JADX INFO: renamed from: g */
    public int f4267g;

    /* JADX INFO: renamed from: h */
    public kh0 f4268h;

    /* JADX INFO: renamed from: i */
    public ArrayList f4269i;

    /* JADX INFO: renamed from: j */
    public q21 f4270j;

    /* JADX INFO: renamed from: k */
    public int[] f4271k;

    /* JADX INFO: renamed from: l */
    public int f4272l;

    /* JADX INFO: renamed from: m */
    public boolean f4273m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public nh0(long j, q21 q21Var, InterfaceC0742sw interfaceC0742sw, InterfaceC0742sw interfaceC0742sw2) {
        super(j, q21Var);
        this.f4265e = interfaceC0742sw;
        this.f4266f = interfaceC0742sw2;
        this.f4270j = q21.f5028h;
        this.f4271k = f4264n;
        this.f4272l = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final void m2705A(long j) {
        synchronized (t21.f5893c) {
            this.f4270j = this.f4270j.m3193e(j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public void mo804B(kh0 kh0Var) {
        this.f4268h = kh0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public nh0 mo805C(InterfaceC0742sw interfaceC0742sw, InterfaceC0742sw interfaceC0742sw2) {
        yi0 yi0Var;
        if (this.f3331c) {
            wr0.m5024a("Cannot use a disposed snapshot");
        }
        if (this.f4273m && this.f3332d < 0) {
            wr0.m5025b("Unsupported operation on a disposed or applied snapshot");
        }
        m2705A(mo811g());
        Object obj = t21.f5893c;
        synchronized (obj) {
            long j = t21.f5895e;
            t21.f5895e = j + 1;
            t21.f5894d = t21.f5894d.m3193e(j);
            q21 q21VarMo808d = mo808d();
            mo818r(q21VarMo808d.m3193e(j));
            yi0Var = new yi0(j, t21.m4166d(q21VarMo808d, mo811g() + 1, j), t21.m4173k(interfaceC0742sw, mo809e(), true), t21.m4174l(interfaceC0742sw2, mo813i()), this);
        }
        if (this.f4273m || this.f3331c) {
            return yi0Var;
        }
        long jMo811g = mo811g();
        synchronized (obj) {
            long j2 = t21.f5895e;
            t21.f5895e = j2 + 1;
            mo819s(j2);
            t21.f5894d = t21.f5894d.m3193e(mo811g());
        }
        mo818r(t21.m4166d(mo808d(), jMo811g + 1, mo811g()));
        return yi0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: b */
    public final void mo1968b() {
        t21.f5894d = t21.f5894d.m3190b(mo811g()).m3189a(this.f4270j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: c */
    public void mo807c() {
        if (this.f3331c) {
            return;
        }
        this.f3331c = true;
        synchronized (t21.f5893c) {
            m1970o();
        }
        mo815l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: f */
    public boolean mo810f() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: h */
    public int mo812h() {
        return this.f4267g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: i */
    public InterfaceC0742sw mo813i() {
        return this.f4266f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: k */
    public void mo814k() {
        this.f4272l++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // p000.l21
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo815l() {
        if (this.f4272l <= 0) {
            wr0.m5024a("no pending nested snapshots");
        }
        int i = this.f4272l - 1;
        this.f4272l = i;
        if (i != 0 || this.f4273m) {
            return;
        }
        kh0 kh0VarMo823x = mo823x();
        if (kh0VarMo823x != null) {
            if (this.f4273m) {
                wr0.m5025b("Unsupported operation on a snapshot that has been applied");
            }
            mo804B(null);
            long jMo811g = mo811g();
            Object[] objArr = kh0VarMo823x.f3151b;
            long[] jArr = kh0VarMo823x.f3150a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (f41 f41VarMo440a = ((d41) objArr[(i2 << 3) + i4]).mo440a(); f41VarMo440a != null; f41VarMo440a = f41VarMo440a.f1578b) {
                                    long j2 = f41VarMo440a.f1577a;
                                    if (j2 == jMo811g || AbstractC0960ye.m5239I(this.f4270j, Long.valueOf(j2))) {
                                        sx0 sx0Var = t21.f5891a;
                                        f41VarMo440a.f1577a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        m1967a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: m */
    public void mo816m() {
        if (this.f4273m || this.f3331c) {
            return;
        }
        m2706v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: n */
    public void mo817n(d41 d41Var) {
        kh0 kh0VarMo823x = mo823x();
        if (kh0VarMo823x == null) {
            kh0 kh0Var = ey0.f1546a;
            kh0VarMo823x = new kh0();
            mo804B(kh0VarMo823x);
        }
        kh0VarMo823x.m1890a(d41Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: p */
    public final void mo1971p() {
        int length = this.f4271k.length;
        for (int i = 0; i < length; i++) {
            t21.m4183u(this.f4271k[i]);
        }
        m1970o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: t */
    public void mo820t(int i) {
        this.f4267g = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: u */
    public l21 mo821u(InterfaceC0742sw interfaceC0742sw) {
        zi0 zi0Var;
        if (this.f3331c) {
            wr0.m5024a("Cannot use a disposed snapshot");
        }
        if (this.f4273m && this.f3332d < 0) {
            wr0.m5025b("Unsupported operation on a disposed or applied snapshot");
        }
        long jMo811g = mo811g();
        m2705A(mo811g());
        Object obj = t21.f5893c;
        synchronized (obj) {
            long j = t21.f5895e;
            t21.f5895e = j + 1;
            t21.f5894d = t21.f5894d.m3193e(j);
            zi0Var = new zi0(j, t21.m4166d(mo808d(), jMo811g + 1, j), t21.m4173k(interfaceC0742sw, mo809e(), true), this);
        }
        if (this.f4273m || this.f3331c) {
            return zi0Var;
        }
        long jMo811g2 = mo811g();
        synchronized (obj) {
            long j2 = t21.f5895e;
            t21.f5895e = j2 + 1;
            mo819s(j2);
            t21.f5894d = t21.f5894d.m3193e(mo811g());
        }
        mo818r(t21.m4166d(mo808d(), jMo811g2 + 1, mo811g()));
        return zi0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final void m2706v() {
        m2705A(mo811g());
        if (this.f4273m || this.f3331c) {
            return;
        }
        long jMo811g = mo811g();
        synchronized (t21.f5893c) {
            long j = t21.f5895e;
            t21.f5895e = j + 1;
            mo819s(j);
            t21.f5894d = t21.f5894d.m3193e(mo811g());
        }
        mo818r(t21.m4166d(mo808d(), jMo811g + 1, mo811g()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v50 mo822w() {
        HashMap mapM4164b;
        List list;
        kh0 kh0Var;
        long j;
        long j2;
        kh0 kh0VarMo823x = mo823x();
        if (kh0VarMo823x != null) {
            long j3 = t21.f5900j.f3330b;
            mapM4164b = t21.m4164b(j3, this, t21.f5894d.m3190b(j3));
        } else {
            mapM4164b = null;
        }
        C0294hs c0294hs = C0294hs.f2354d;
        synchronized (t21.f5893c) {
            try {
                t21.m4165c(this);
                if (kh0VarMo823x == null || kh0VarMo823x.f3153d == 0) {
                    mo1968b();
                    C0668qx c0668qx = t21.f5900j;
                    kh0 kh0Var2 = c0668qx.f4268h;
                    t21.m4184v(c0668qx, t21.f5891a);
                    if (kh0Var2 == null || !kh0Var2.m1897h()) {
                        list = c0294hs;
                        kh0Var = null;
                    } else {
                        list = t21.f5898h;
                        kh0Var = kh0Var2;
                    }
                } else {
                    C0668qx c0668qx2 = t21.f5900j;
                    v50 v50VarM2707z = m2707z(t21.f5895e, kh0VarMo823x, mapM4164b, t21.f5894d.m3190b(c0668qx2.f3330b));
                    if (!v50VarM2707z.equals(o21.f4412a)) {
                        return v50VarM2707z;
                    }
                    mo1968b();
                    kh0Var = c0668qx2.f4268h;
                    t21.m4184v(c0668qx2, t21.f5891a);
                    mo804B(null);
                    c0668qx2.f4268h = null;
                    list = t21.f5898h;
                }
                this.f4273m = true;
                if (kh0Var != null) {
                    fy0 fy0Var = new fy0(kh0Var);
                    if (!kh0Var.m1896g()) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((InterfaceC0904ww) list.get(i)).invoke(fy0Var, this);
                        }
                    }
                }
                if (kh0VarMo823x != null && kh0VarMo823x.m1897h()) {
                    fy0 fy0Var2 = new fy0(kh0VarMo823x);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((InterfaceC0904ww) list.get(i2)).invoke(fy0Var2, this);
                    }
                }
                synchronized (t21.f5893c) {
                    try {
                        mo1971p();
                        t21.m4168f();
                        if (kh0Var != null) {
                            Object[] objArr = kh0Var.f3151b;
                            long[] jArr = kh0Var.f3150a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                while (true) {
                                    long j4 = jArr[i3];
                                    j2 = 255;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j4 & 255) < 128) {
                                                t21.m4179q((d41) objArr[(i3 << 3) + i5]);
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i4 != 8) {
                                            break;
                                        }
                                        if (i3 == length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                        }
                        if (kh0VarMo823x != null) {
                            Object[] objArr2 = kh0VarMo823x.f3151b;
                            long[] jArr2 = kh0VarMo823x.f3150a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j5 = jArr2[i6];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j5 & j2) < j) {
                                                t21.m4179q((d41) objArr2[(i6 << 3) + i8]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 == length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.f4269i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                t21.m4179q((d41) arrayList.get(i9));
                            }
                        }
                        this.f4269i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return o21.f4412a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public kh0 mo823x() {
        return this.f4268h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: e()Lsw; */
    @Override // p000.l21
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public InterfaceC0742sw mo809e() {
        return this.f4265e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final v50 m2707z(long j, kh0 kh0Var, HashMap map, q21 q21Var) {
        ArrayList arrayList;
        ArrayList arrayListM5249S;
        ArrayList arrayList2;
        q21 q21Var2;
        Object[] objArr;
        long[] jArr;
        q21 q21Var3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList3;
        f41 f41VarMo594b;
        q21 q21VarM3192d = mo808d().m3193e(mo811g()).m3192d(this.f4270j);
        Object[] objArr3 = kh0Var.f3151b;
        long[] jArr3 = kh0Var.f3150a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList2 = null;
            arrayListM5249S = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            d41 d41Var = (d41) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            f41 f41VarMo440a = d41Var.mo440a();
                            i = i4;
                            ArrayList arrayList4 = arrayList2;
                            f41 f41VarM4181s = t21.m4181s(f41VarMo440a, j, q21Var);
                            if (f41VarM4181s == null) {
                                arrayList3 = arrayListM5249S;
                                j2 = j3;
                            } else {
                                arrayList3 = arrayListM5249S;
                                j2 = j3;
                                f41 f41VarM4181s2 = t21.m4181s(f41VarMo440a, mo811g(), q21VarM3192d);
                                if (f41VarM4181s2 != null && f41VarM4181s2.f1577a != 1 && !f41VarM4181s.equals(f41VarM4181s2)) {
                                    q21Var3 = q21VarM3192d;
                                    f41 f41VarM4181s3 = t21.m4181s(f41VarMo440a, mo811g(), mo808d());
                                    if (f41VarM4181s3 == null) {
                                        t21.m4180r();
                                        throw null;
                                    }
                                    if (map == null || (f41VarMo594b = (f41) map.get(f41VarM4181s)) == null) {
                                        f41VarMo594b = d41Var.mo594b(f41VarM4181s2, f41VarM4181s, f41VarM4181s3);
                                    }
                                    if (f41VarMo594b == null) {
                                        return new n21(this);
                                    }
                                    if (!f41VarMo594b.equals(f41VarM4181s3)) {
                                        if (f41VarMo594b.equals(f41VarM4181s)) {
                                            ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList5.add(new uo0(d41Var, f41VarM4181s.mo486b(mo811g())));
                                            arrayListM5249S = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayListM5249S.add(d41Var);
                                            arrayList2 = arrayList5;
                                        } else {
                                            arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList2.add(!f41VarMo594b.equals(f41VarM4181s2) ? new uo0(d41Var, f41VarMo594b) : new uo0(d41Var, f41VarM4181s2.mo486b(mo811g())));
                                        }
                                    }
                                    arrayListM5249S = arrayList3;
                                }
                                arrayList2 = arrayList4;
                                arrayListM5249S = arrayList3;
                            }
                            q21Var3 = q21VarM3192d;
                            arrayList2 = arrayList4;
                            arrayListM5249S = arrayList3;
                        } else {
                            q21Var3 = q21VarM3192d;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        q21VarM3192d = q21Var3;
                    }
                    q21Var2 = q21VarM3192d;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    q21Var2 = q21VarM3192d;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                q21VarM3192d = q21Var2;
            }
        } else {
            arrayList = null;
            arrayListM5249S = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            m2706v();
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                uo0 uo0Var = (uo0) arrayList2.get(i5);
                d41 d41Var2 = (d41) uo0Var.f6274d;
                f41 f41Var = (f41) uo0Var.f6275e;
                f41Var.f1577a = j;
                synchronized (t21.f5893c) {
                    f41Var.f1578b = d41Var2.mo440a();
                    d41Var2.mo441c(f41Var);
                }
            }
        }
        if (arrayListM5249S != null) {
            int size2 = arrayListM5249S.size();
            for (int i6 = 0; i6 < size2; i6++) {
                kh0Var.m1901l((d41) arrayListM5249S.get(i6));
            }
            ArrayList arrayList6 = this.f4269i;
            if (arrayList6 != null) {
                arrayListM5249S = AbstractC0960ye.m5249S(arrayList6, arrayListM5249S);
            }
            this.f4269i = arrayListM5249S;
        }
        return o21.f4412a;
    }
}
