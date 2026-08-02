package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n70 extends qu2 implements gu2 {
    public final xm0 i;
    public final ks2 j;
    public m70 k = new m70(ds2.j().g());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n70(xm0 xm0Var, sn snVar) {
        this.i = xm0Var;
        this.j = snVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pu2
    public final ru2 a() {
        return this.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pu2
    public final void c(ru2 ru2Var) {
        ru2Var.getClass();
        this.k = (m70) ru2Var;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IGET, IGET, CONST]}, finally: {[IGET, IGET, CONST, AGET, CHECK_CAST, INVOKE, ARITH, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m70 g(m70 m70Var, vr2 vr2Var, boolean z, xm0 xm0Var) {
        zk1 zk1VarL;
        m70 m70Var2;
        ks2 ks2Var;
        int i;
        if (m70Var.c(this, vr2Var)) {
            if (z) {
                zk1VarL = op0.l();
                Object[] objArr = zk1VarL.h;
                int i2 = zk1VarL.j;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((fo0) objArr[i3]).b();
                }
                try {
                    gk1 gk1Var = m70Var.e;
                    b5 b5Var = ls2.a;
                    e11 e11Var = (e11) b5Var.p();
                    if (e11Var == null) {
                        e11Var = new e11();
                        b5Var.A(e11Var);
                    }
                    int i4 = e11Var.a;
                    Object[] objArr2 = gk1Var.b;
                    int[] iArr = gk1Var.c;
                    long[] jArr = gk1Var.a;
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
                                        e11Var.a = i4 + iArr[i9];
                                        in0 in0VarE = vr2Var.e();
                                        if (in0VarE != null) {
                                            in0VarE.j(pu2Var);
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
                    e11Var.a = i4;
                    Object[] objArr3 = zk1VarL.h;
                    int i10 = zk1VarL.j;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((fo0) objArr3[i11]).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return m70Var;
        }
        gk1 gk1Var2 = new gk1();
        b5 b5Var2 = ls2.a;
        e11 e11Var2 = (e11) b5Var2.p();
        if (e11Var2 == null) {
            e11Var2 = new e11();
            b5Var2.A(e11Var2);
        }
        int i12 = e11Var2.a;
        zk1VarL = op0.l();
        Object[] objArr4 = zk1VarL.h;
        int i13 = zk1VarL.j;
        for (int i14 = 0; i14 < i13; i14++) {
            ((fo0) objArr4[i14]).b();
        }
        try {
            e11Var2.a = i12 + 1;
            Object objP = tl.P(new l70(this, e11Var2, gk1Var2, i12, 0), xm0Var);
            e11Var2.a = i12;
            Object[] objArr5 = zk1VarL.h;
            int i15 = zk1VarL.j;
            for (int i16 = 0; i16 < i15; i16++) {
                ((fo0) objArr5[i16]).a();
            }
            Object obj = ds2.c;
            synchronized (obj) {
                try {
                    vr2 vr2VarJ = ds2.j();
                    Object obj2 = m70Var.f;
                    if (obj2 == m70.h || (ks2Var = this.j) == null || !ks2Var.c(objP, obj2)) {
                        m70 m70Var3 = this.k;
                        synchronized (obj) {
                            ru2 ru2VarM = ds2.m(m70Var3, this);
                            ru2VarM.a(m70Var3);
                            ru2VarM.a = vr2VarJ.g();
                            m70Var2 = (m70) ru2VarM;
                            m70Var2.e = gk1Var2;
                            m70Var2.g = m70Var2.d(this, vr2VarJ);
                            m70Var2.f = objP;
                        }
                        return m70Var2;
                    }
                    m70Var.e = gk1Var2;
                    m70Var.g = m70Var.d(this, vr2VarJ);
                    m70Var2 = m70Var;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            e11 e11Var3 = (e11) ls2.a.p();
            if (e11Var3 == null || e11Var3.a != 0) {
                return m70Var2;
            }
            ds2.j().m();
            synchronized (obj) {
                vr2 vr2VarJ2 = ds2.j();
                m70Var2.c = vr2VarJ2.g();
                m70Var2.d = vr2VarJ2.h();
                return m70Var2;
            }
        } finally {
            Object[] objArr6 = zk1VarL.h;
            int i17 = zk1VarL.j;
            for (int i18 = 0; i18 < i17; i18++) {
                ((fo0) objArr6[i18]).a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gu2
    public final Object getValue() {
        in0 in0VarE = ds2.j().e();
        if (in0VarE != null) {
            in0VarE.j(this);
        }
        vr2 vr2VarJ = ds2.j();
        return g((m70) ds2.i(this.k, vr2VarJ), vr2VarJ, true, this.i).f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final m70 h() {
        vr2 vr2VarJ = ds2.j();
        return g((m70) ds2.i(this.k, vr2VarJ), vr2VarJ, false, this.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        m70 m70Var = (m70) ds2.h(this.k);
        sb.append(m70Var.c(this, ds2.j()) ? String.valueOf(m70Var.f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
