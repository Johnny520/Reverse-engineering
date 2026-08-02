package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class wk1 extends vr2 {

    /* JADX INFO: renamed from: n */
    public static final int[] f12556n = new int[0];

    /* JADX INFO: renamed from: e */
    public final in0 f12557e;

    /* JADX INFO: renamed from: f */
    public final in0 f12558f;

    /* JADX INFO: renamed from: g */
    public int f12559g;

    /* JADX INFO: renamed from: h */
    public sk1 f12560h;

    /* JADX INFO: renamed from: i */
    public ArrayList f12561i;

    /* JADX INFO: renamed from: j */
    public bs2 f12562j;

    /* JADX INFO: renamed from: k */
    public int[] f12563k;

    /* JADX INFO: renamed from: l */
    public int f12564l;

    /* JADX INFO: renamed from: m */
    public boolean f12565m;

    public wk1(long j, bs2 bs2Var, in0 in0Var, in0 in0Var2) {
        super(j, bs2Var);
        this.f12557e = in0Var;
        this.f12558f = in0Var2;
        this.f12562j = bs2.f1003l;
        this.f12563k = f12556n;
        this.f12564l = 1;
    }

    /* JADX INFO: renamed from: A */
    public final void m5941A(long j) {
        synchronized (ds2.f2181c) {
            this.f12562j = this.f12562j.m588e(j);
        }
    }

    /* JADX INFO: renamed from: B */
    public void mo72B(sk1 sk1Var) {
        this.f12560h = sk1Var;
    }

    /* JADX INFO: renamed from: C */
    public wk1 mo73C(in0 in0Var, in0 in0Var2) {
        om1 om1Var;
        if (this.f12148c) {
            j22.m2429a("Cannot use a disposed snapshot");
        }
        if (this.f12565m && this.f12149d < 0) {
            j22.m2430b("Unsupported operation on a disposed or applied snapshot");
        }
        m5941A(mo79g());
        Object obj = ds2.f2181c;
        synchronized (obj) {
            long j = ds2.f2183e;
            ds2.f2183e = j + 1;
            ds2.f2182d = ds2.f2182d.m588e(j);
            bs2 bs2VarMo76d = mo76d();
            mo86r(bs2VarMo76d.m588e(j));
            om1Var = new om1(j, ds2.m1120d(bs2VarMo76d, mo79g() + 1, j), ds2.m1127k(in0Var, mo77e(), true), ds2.m1128l(in0Var2, mo81i()), this);
        }
        if (this.f12565m || this.f12148c) {
            return om1Var;
        }
        long jMo79g = mo79g();
        synchronized (obj) {
            long j2 = ds2.f2183e;
            ds2.f2183e = j2 + 1;
            mo87s(j2);
            ds2.f2182d = ds2.f2182d.m588e(mo79g());
        }
        mo86r(ds2.m1120d(mo76d(), jMo79g + 1, mo79g()));
        return om1Var;
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: b */
    public final void mo5786b() {
        ds2.f2182d = ds2.f2182d.m585b(mo79g()).m584a(this.f12562j);
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: c */
    public void mo75c() {
        if (this.f12148c) {
            return;
        }
        this.f12148c = true;
        synchronized (ds2.f2181c) {
            m5788o();
        }
        mo83l();
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: f */
    public boolean mo78f() {
        return false;
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: h */
    public int mo80h() {
        return this.f12559g;
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: i */
    public in0 mo81i() {
        return this.f12558f;
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: k */
    public void mo82k() {
        this.f12564l++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // p000.vr2
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo83l() {
        if (this.f12564l <= 0) {
            j22.m2429a("no pending nested snapshots");
        }
        int i = this.f12564l - 1;
        this.f12564l = i;
        if (i != 0 || this.f12565m) {
            return;
        }
        sk1 sk1VarMo91x = mo91x();
        if (sk1VarMo91x != null) {
            if (this.f12565m) {
                j22.m2430b("Unsupported operation on a snapshot that has been applied");
            }
            mo72B(null);
            long jMo79g = mo79g();
            Object[] objArr = sk1VarMo91x.f10175b;
            long[] jArr = sk1VarMo91x.f10174a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (ru2 ru2VarMo2588a = ((pu2) objArr[(i2 << 3) + i4]).mo2588a(); ru2VarMo2588a != null; ru2VarMo2588a = ru2VarMo2588a.f9761b) {
                                    long j2 = ru2VarMo2588a.f9760a;
                                    if (j2 == jMo79g || AbstractC0142du.m1157m0(this.f12562j, Long.valueOf(j2))) {
                                        ml2 ml2Var = ds2.f2179a;
                                        ru2VarMo2588a.f9760a = 0L;
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
        m5785a();
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: m */
    public void mo84m() {
        if (this.f12565m || this.f12148c) {
            return;
        }
        m5942v();
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: n */
    public void mo85n(pu2 pu2Var) {
        sk1 sk1VarMo91x = mo91x();
        if (sk1VarMo91x == null) {
            sk1 sk1Var = fd2.f2911a;
            sk1VarMo91x = new sk1();
            mo72B(sk1VarMo91x);
        }
        sk1VarMo91x.m4882a(pu2Var);
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: p */
    public final void mo5789p() {
        int length = this.f12563k.length;
        for (int i = 0; i < length; i++) {
            ds2.m1137u(this.f12563k[i]);
        }
        m5788o();
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: t */
    public void mo88t(int i) {
        this.f12559g = i;
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: u */
    public vr2 mo89u(in0 in0Var) {
        pm1 pm1Var;
        if (this.f12148c) {
            j22.m2429a("Cannot use a disposed snapshot");
        }
        if (this.f12565m && this.f12149d < 0) {
            j22.m2430b("Unsupported operation on a disposed or applied snapshot");
        }
        long jMo79g = mo79g();
        m5941A(mo79g());
        Object obj = ds2.f2181c;
        synchronized (obj) {
            long j = ds2.f2183e;
            ds2.f2183e = j + 1;
            ds2.f2182d = ds2.f2182d.m588e(j);
            pm1Var = new pm1(j, ds2.m1120d(mo76d(), jMo79g + 1, j), ds2.m1127k(in0Var, mo77e(), true), this);
        }
        if (this.f12565m || this.f12148c) {
            return pm1Var;
        }
        long jMo79g2 = mo79g();
        synchronized (obj) {
            long j2 = ds2.f2183e;
            ds2.f2183e = j2 + 1;
            mo87s(j2);
            ds2.f2182d = ds2.f2182d.m588e(mo79g());
        }
        mo86r(ds2.m1120d(mo76d(), jMo79g2 + 1, mo79g()));
        return pm1Var;
    }

    /* JADX INFO: renamed from: v */
    public final void m5942v() {
        m5941A(mo79g());
        if (this.f12565m || this.f12148c) {
            return;
        }
        long jMo79g = mo79g();
        synchronized (ds2.f2181c) {
            long j = ds2.f2183e;
            ds2.f2183e = j + 1;
            mo87s(j);
            ds2.f2182d = ds2.f2182d.m588e(mo79g());
        }
        mo86r(ds2.m1120d(mo76d(), jMo79g + 1, mo79g()));
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p40 mo90w() {
        HashMap mapM1118b;
        List list;
        sk1 sk1Var;
        long j;
        long j2;
        sk1 sk1VarMo91x = mo91x();
        if (sk1VarMo91x != null) {
            long j3 = ds2.f2188j.f12147b;
            mapM1118b = ds2.m1118b(j3, this, ds2.f2182d.m585b(j3));
        } else {
            mapM1118b = null;
        }
        be0 be0Var = be0.f819h;
        synchronized (ds2.f2181c) {
            try {
                ds2.m1119c(this);
                if (sk1VarMo91x == null || sk1VarMo91x.f10177d == 0) {
                    mo5786b();
                    hq0 hq0Var = ds2.f2188j;
                    sk1 sk1Var2 = hq0Var.f12560h;
                    ds2.m1138v(hq0Var, ds2.f2179a);
                    if (sk1Var2 == null || !sk1Var2.m4889h()) {
                        list = be0Var;
                        sk1Var = null;
                    } else {
                        list = ds2.f2186h;
                        sk1Var = sk1Var2;
                    }
                } else {
                    hq0 hq0Var2 = ds2.f2188j;
                    p40 p40VarM5943z = m5943z(ds2.f2183e, sk1VarMo91x, mapM1118b, ds2.f2182d.m585b(hq0Var2.f12147b));
                    if (!p40VarM5943z.equals(yr2.f13600n)) {
                        return p40VarM5943z;
                    }
                    mo5786b();
                    sk1Var = hq0Var2.f12560h;
                    ds2.m1138v(hq0Var2, ds2.f2179a);
                    mo72B(null);
                    hq0Var2.f12560h = null;
                    list = ds2.f2186h;
                }
                this.f12565m = true;
                if (sk1Var != null) {
                    gd2 gd2Var = new gd2(sk1Var);
                    if (!sk1Var.m4888g()) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((mn0) list.get(i)).mo12g(gd2Var, this);
                        }
                    }
                }
                if (sk1VarMo91x != null && sk1VarMo91x.m4889h()) {
                    gd2 gd2Var2 = new gd2(sk1VarMo91x);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((mn0) list.get(i2)).mo12g(gd2Var2, this);
                    }
                }
                synchronized (ds2.f2181c) {
                    try {
                        mo5789p();
                        ds2.m1122f();
                        if (sk1Var != null) {
                            Object[] objArr = sk1Var.f10175b;
                            long[] jArr = sk1Var.f10174a;
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
                                                ds2.m1133q((pu2) objArr[(i3 << 3) + i5]);
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
                        if (sk1VarMo91x != null) {
                            Object[] objArr2 = sk1VarMo91x.f10175b;
                            long[] jArr2 = sk1VarMo91x.f10174a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j5 = jArr2[i6];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j5 & j2) < j) {
                                                ds2.m1133q((pu2) objArr2[(i6 << 3) + i8]);
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
                        ArrayList arrayList = this.f12561i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                ds2.m1133q((pu2) arrayList.get(i9));
                            }
                        }
                        this.f12561i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return yr2.f13600n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public sk1 mo91x() {
        return this.f12560h;
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public in0 mo77e() {
        return this.f12557e;
    }

    /* JADX INFO: renamed from: z */
    public final p40 m5943z(long j, sk1 sk1Var, HashMap map, bs2 bs2Var) {
        ArrayList arrayList;
        ArrayList arrayListM1168x0;
        ArrayList arrayList2;
        bs2 bs2Var2;
        Object[] objArr;
        long[] jArr;
        bs2 bs2Var3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList3;
        ru2 ru2VarMo2589b;
        bs2 bs2VarM587d = mo76d().m588e(mo79g()).m587d(this.f12562j);
        Object[] objArr3 = sk1Var.f10175b;
        long[] jArr3 = sk1Var.f10174a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList2 = null;
            arrayListM1168x0 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            pu2 pu2Var = (pu2) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            ru2 ru2VarMo2588a = pu2Var.mo2588a();
                            i = i4;
                            ArrayList arrayList4 = arrayList2;
                            ru2 ru2VarM1135s = ds2.m1135s(ru2VarMo2588a, j, bs2Var);
                            if (ru2VarM1135s == null) {
                                arrayList3 = arrayListM1168x0;
                                j2 = j3;
                            } else {
                                arrayList3 = arrayListM1168x0;
                                j2 = j3;
                                ru2 ru2VarM1135s2 = ds2.m1135s(ru2VarMo2588a, mo79g(), bs2VarM587d);
                                if (ru2VarM1135s2 != null && ru2VarM1135s2.f9760a != 1 && !ru2VarM1135s.equals(ru2VarM1135s2)) {
                                    bs2Var3 = bs2VarM587d;
                                    ru2 ru2VarM1135s3 = ds2.m1135s(ru2VarMo2588a, mo79g(), mo76d());
                                    if (ru2VarM1135s3 == null) {
                                        ds2.m1134r();
                                        throw null;
                                    }
                                    if (map == null || (ru2VarMo2589b = (ru2) map.get(ru2VarM1135s)) == null) {
                                        ru2VarMo2589b = pu2Var.mo2589b(ru2VarM1135s2, ru2VarM1135s, ru2VarM1135s3);
                                    }
                                    if (ru2VarMo2589b == null) {
                                        return new xr2(this);
                                    }
                                    if (!ru2VarMo2589b.equals(ru2VarM1135s3)) {
                                        if (ru2VarMo2589b.equals(ru2VarM1135s)) {
                                            ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList5.add(new ow1(pu2Var, ru2VarM1135s.mo1718b(mo79g())));
                                            arrayListM1168x0 = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayListM1168x0.add(pu2Var);
                                            arrayList2 = arrayList5;
                                        } else {
                                            arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList2.add(!ru2VarMo2589b.equals(ru2VarM1135s2) ? new ow1(pu2Var, ru2VarMo2589b) : new ow1(pu2Var, ru2VarM1135s2.mo1718b(mo79g())));
                                        }
                                    }
                                    arrayListM1168x0 = arrayList3;
                                }
                                arrayList2 = arrayList4;
                                arrayListM1168x0 = arrayList3;
                            }
                            bs2Var3 = bs2VarM587d;
                            arrayList2 = arrayList4;
                            arrayListM1168x0 = arrayList3;
                        } else {
                            bs2Var3 = bs2VarM587d;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        bs2VarM587d = bs2Var3;
                    }
                    bs2Var2 = bs2VarM587d;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    bs2Var2 = bs2VarM587d;
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
                bs2VarM587d = bs2Var2;
            }
        } else {
            arrayList = null;
            arrayListM1168x0 = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            m5942v();
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                ow1 ow1Var = (ow1) arrayList2.get(i5);
                pu2 pu2Var2 = (pu2) ow1Var.f7862h;
                ru2 ru2Var = (ru2) ow1Var.f7863i;
                ru2Var.f9760a = j;
                synchronized (ds2.f2181c) {
                    ru2Var.f9761b = pu2Var2.mo2588a();
                    pu2Var2.mo2590c(ru2Var);
                }
            }
        }
        if (arrayListM1168x0 != null) {
            int size2 = arrayListM1168x0.size();
            for (int i6 = 0; i6 < size2; i6++) {
                sk1Var.m4893l((pu2) arrayListM1168x0.get(i6));
            }
            ArrayList arrayList6 = this.f12561i;
            if (arrayList6 != null) {
                arrayListM1168x0 = AbstractC0142du.m1168x0(arrayList6, arrayListM1168x0);
            }
            this.f12561i = arrayListM1168x0;
        }
        return yr2.f13600n;
    }
}
