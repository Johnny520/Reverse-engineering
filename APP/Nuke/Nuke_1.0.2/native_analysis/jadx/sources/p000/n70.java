package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n70 extends qu2 implements gu2 {

    /* JADX INFO: renamed from: i */
    public final xm0 f7030i;

    /* JADX INFO: renamed from: j */
    public final ks2 f7031j;

    /* JADX INFO: renamed from: k */
    public m70 f7032k = new m70(ds2.m1126j().mo79g());

    public n70(xm0 xm0Var, C0700sn c0700sn) {
        this.f7030i = xm0Var;
        this.f7031j = c0700sn;
    }

    @Override // p000.pu2
    /* JADX INFO: renamed from: a */
    public final ru2 mo2588a() {
        return this.f7032k;
    }

    @Override // p000.pu2
    /* JADX INFO: renamed from: c */
    public final void mo2590c(ru2 ru2Var) {
        ru2Var.getClass();
        this.f7032k = (m70) ru2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m70 m3253g(m70 m70Var, vr2 vr2Var, boolean z, xm0 xm0Var) {
        zk1 zk1VarM3589l;
        m70 m70Var2;
        ks2 ks2Var;
        int i;
        if (m70Var.m3040c(this, vr2Var)) {
            if (z) {
                zk1VarM3589l = op0.m3589l();
                Object[] objArr = zk1VarM3589l.f13934h;
                int i2 = zk1VarM3589l.f13936j;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((fo0) objArr[i3]).m1700b();
                }
                try {
                    gk1 gk1Var = m70Var.f6495e;
                    C0043b5 c0043b5 = ls2.f6293a;
                    e11 e11Var = (e11) c0043b5.m429p();
                    if (e11Var == null) {
                        e11Var = new e11();
                        c0043b5.m410A(e11Var);
                    }
                    int i4 = e11Var.f2293a;
                    Object[] objArr2 = gk1Var.f3553b;
                    int[] iArr = gk1Var.f3554c;
                    long[] jArr = gk1Var.f3552a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        pu2 pu2Var = (pu2) objArr2[i9];
                                        i = i6;
                                        e11Var.f2293a = i4 + iArr[i9];
                                        in0 in0VarMo77e = vr2Var.mo77e();
                                        if (in0VarMo77e != null) {
                                            in0VarMo77e.mo5j(pu2Var);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                                if (i5 == length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    e11Var.f2293a = i4;
                    Object[] objArr3 = zk1VarM3589l.f13934h;
                    int i10 = zk1VarM3589l.f13936j;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((fo0) objArr3[i11]).m1699a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return m70Var;
        }
        gk1 gk1Var2 = new gk1();
        C0043b5 c0043b52 = ls2.f6293a;
        e11 e11Var2 = (e11) c0043b52.m429p();
        if (e11Var2 == null) {
            e11Var2 = new e11();
            c0043b52.m410A(e11Var2);
        }
        int i12 = e11Var2.f2293a;
        zk1VarM3589l = op0.m3589l();
        Object[] objArr4 = zk1VarM3589l.f13934h;
        int i13 = zk1VarM3589l.f13936j;
        for (int i14 = 0; i14 < i13; i14++) {
            ((fo0) objArr4[i14]).m1700b();
        }
        try {
            e11Var2.f2293a = i12 + 1;
            Object objM5288P = AbstractC0738tl.m5288P(new l70(this, e11Var2, gk1Var2, i12, 0), xm0Var);
            e11Var2.f2293a = i12;
            Object[] objArr5 = zk1VarM3589l.f13934h;
            int i15 = zk1VarM3589l.f13936j;
            for (int i16 = 0; i16 < i15; i16++) {
                ((fo0) objArr5[i16]).m1699a();
            }
            Object obj = ds2.f2181c;
            synchronized (obj) {
                try {
                    vr2 vr2VarM1126j = ds2.m1126j();
                    Object obj2 = m70Var.f6496f;
                    if (obj2 == m70.f6492h || (ks2Var = this.f7031j) == null || !ks2Var.mo1841c(objM5288P, obj2)) {
                        m70 m70Var3 = this.f7032k;
                        synchronized (obj) {
                            ru2 ru2VarM1129m = ds2.m1129m(m70Var3, this);
                            ru2VarM1129m.mo1717a(m70Var3);
                            ru2VarM1129m.f9760a = vr2VarM1126j.mo79g();
                            m70Var2 = (m70) ru2VarM1129m;
                            m70Var2.f6495e = gk1Var2;
                            m70Var2.f6497g = m70Var2.m3041d(this, vr2VarM1126j);
                            m70Var2.f6496f = objM5288P;
                        }
                        return m70Var2;
                    }
                    m70Var.f6495e = gk1Var2;
                    m70Var.f6497g = m70Var.m3041d(this, vr2VarM1126j);
                    m70Var2 = m70Var;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            e11 e11Var3 = (e11) ls2.f6293a.m429p();
            if (e11Var3 == null || e11Var3.f2293a != 0) {
                return m70Var2;
            }
            ds2.m1126j().mo84m();
            synchronized (obj) {
                vr2 vr2VarM1126j2 = ds2.m1126j();
                m70Var2.f6493c = vr2VarM1126j2.mo79g();
                m70Var2.f6494d = vr2VarM1126j2.mo80h();
                return m70Var2;
            }
        } finally {
            Object[] objArr6 = zk1VarM3589l.f13934h;
            int i17 = zk1VarM3589l.f13936j;
            for (int i18 = 0; i18 < i17; i18++) {
                ((fo0) objArr6[i18]).m1699a();
            }
        }
    }

    @Override // p000.gu2
    public final Object getValue() {
        in0 in0VarMo77e = ds2.m1126j().mo77e();
        if (in0VarMo77e != null) {
            in0VarMo77e.mo5j(this);
        }
        vr2 vr2VarM1126j = ds2.m1126j();
        return m3253g((m70) ds2.m1125i(this.f7032k, vr2VarM1126j), vr2VarM1126j, true, this.f7030i).f6496f;
    }

    /* JADX INFO: renamed from: h */
    public final m70 m3254h() {
        vr2 vr2VarM1126j = ds2.m1126j();
        return m3253g((m70) ds2.m1125i(this.f7032k, vr2VarM1126j), vr2VarM1126j, false, this.f7030i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        m70 m70Var = (m70) ds2.m1124h(this.f7032k);
        sb.append(m70Var.m3040c(this, ds2.m1126j()) ? String.valueOf(m70Var.f6496f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
