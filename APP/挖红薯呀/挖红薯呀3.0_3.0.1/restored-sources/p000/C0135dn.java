package p000;

/* JADX INFO: renamed from: dn */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0135dn extends e41 implements w31 {

    /* JADX INFO: renamed from: e */
    public final InterfaceC0298hw f1157e;

    /* JADX INFO: renamed from: f */
    public final C0496n2 f1158f;

    /* JADX INFO: renamed from: g */
    public C0098cn f1159g = new C0098cn(t21.m4172j().mo811g());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0135dn(C0496n2 c0496n2, InterfaceC0298hw interfaceC0298hw) {
        this.f1157e = interfaceC0298hw;
        this.f1158f = c0496n2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.d41
    /* JADX INFO: renamed from: a */
    public final f41 mo440a() {
        return this.f1159g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.d41
    /* JADX INFO: renamed from: c */
    public final void mo441c(f41 f41Var) {
        f41Var.getClass();
        this.f1159g = (C0098cn) f41Var;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IGET, IGET, CONST]}, finally: {[IGET, IGET, CONST, AGET, CHECK_CAST, INVOKE, ARITH, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0098cn m718g(C0098cn c0098cn, l21 l21Var, boolean z, InterfaceC0298hw interfaceC0298hw) {
        sh0 sh0VarM3409k;
        C0496n2 c0496n2;
        int i;
        C0098cn c0098cn2 = c0098cn;
        if (c0098cn2.m589c(this, l21Var)) {
            if (z) {
                sh0VarM3409k = r60.m3409k();
                Object[] objArr = sh0VarM3409k.f5768d;
                int i2 = sh0VarM3409k.f5770f;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((C0552oi) objArr[i3]).m2926b();
                }
                try {
                    ch0 ch0Var = c0098cn2.f860e;
                    C0541o8 c0541o8 = z21.f7778a;
                    b30 b30Var = (b30) c0541o8.m2801e();
                    if (b30Var == null) {
                        b30Var = new b30();
                        c0541o8.m2808m(b30Var);
                    }
                    int i4 = b30Var.f365a;
                    Object[] objArr2 = ch0Var.f811b;
                    int[] iArr = ch0Var.f812c;
                    long[] jArr = ch0Var.f810a;
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
                                        d41 d41Var = (d41) objArr2[i9];
                                        i = i6;
                                        b30Var.f365a = i4 + iArr[i9];
                                        InterfaceC0742sw interfaceC0742swMo809e = l21Var.mo809e();
                                        if (interfaceC0742swMo809e != null) {
                                            interfaceC0742swMo809e.invoke(d41Var);
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
                    b30Var.f365a = i4;
                    Object[] objArr3 = sh0VarM3409k.f5768d;
                    int i10 = sh0VarM3409k.f5770f;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((C0552oi) objArr3[i11]).m2925a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c0098cn2;
        }
        ch0 ch0Var2 = new ch0();
        C0541o8 c0541o82 = z21.f7778a;
        b30 b30Var2 = (b30) c0541o82.m2801e();
        if (b30Var2 == null) {
            b30Var2 = new b30();
            c0541o82.m2808m(b30Var2);
        }
        int i12 = b30Var2.f365a;
        sh0VarM3409k = r60.m3409k();
        Object[] objArr4 = sh0VarM3409k.f5768d;
        int i13 = sh0VarM3409k.f5770f;
        for (int i14 = 0; i14 < i13; i14++) {
            ((C0552oi) objArr4[i14]).m2926b();
        }
        try {
            b30Var2.f365a = i12 + 1;
            Object objM4278u = u50.m4278u(new C0340j2(this, b30Var2, ch0Var2, i12), interfaceC0298hw);
            b30Var2.f365a = i12;
            Object[] objArr5 = sh0VarM3409k.f5768d;
            int i15 = sh0VarM3409k.f5770f;
            for (int i16 = 0; i16 < i15; i16++) {
                ((C0552oi) objArr5[i16]).m2925a();
            }
            Object obj = t21.f5893c;
            synchronized (obj) {
                try {
                    l21 l21VarM4172j = t21.m4172j();
                    Object obj2 = c0098cn2.f861f;
                    if (obj2 == C0098cn.f857h || (c0496n2 = this.f1158f) == null || !c0496n2.m2629g(objM4278u, obj2)) {
                        C0098cn c0098cn3 = this.f1159g;
                        synchronized (obj) {
                            f41 f41VarM4175m = t21.m4175m(c0098cn3, this);
                            f41VarM4175m.mo485a(c0098cn3);
                            f41VarM4175m.f1577a = l21VarM4172j.mo811g();
                            c0098cn2 = (C0098cn) f41VarM4175m;
                            c0098cn2.f860e = ch0Var2;
                            c0098cn2.f862g = c0098cn2.m590d(this, l21VarM4172j);
                            c0098cn2.f861f = objM4278u;
                        }
                        return c0098cn2;
                    }
                    c0098cn2.f860e = ch0Var2;
                    c0098cn2.f862g = c0098cn2.m590d(this, l21VarM4172j);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            b30 b30Var3 = (b30) z21.f7778a.m2801e();
            if (b30Var3 == null || b30Var3.f365a != 0) {
                return c0098cn2;
            }
            t21.m4172j().mo816m();
            synchronized (obj) {
                l21 l21VarM4172j2 = t21.m4172j();
                c0098cn2.f858c = l21VarM4172j2.mo811g();
                c0098cn2.f859d = l21VarM4172j2.mo812h();
                return c0098cn2;
            }
        } finally {
            Object[] objArr6 = sh0VarM3409k.f5768d;
            int i17 = sh0VarM3409k.f5770f;
            for (int i18 = 0; i18 < i17; i18++) {
                ((C0552oi) objArr6[i18]).m2925a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.w31
    public final Object getValue() {
        InterfaceC0742sw interfaceC0742swMo809e = t21.m4172j().mo809e();
        if (interfaceC0742swMo809e != null) {
            interfaceC0742swMo809e.invoke(this);
        }
        l21 l21VarM4172j = t21.m4172j();
        return m718g((C0098cn) t21.m4171i(this.f1159g, l21VarM4172j), l21VarM4172j, true, this.f1157e).f861f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final C0098cn m719h() {
        l21 l21VarM4172j = t21.m4172j();
        return m718g((C0098cn) t21.m4171i(this.f1159g, l21VarM4172j), l21VarM4172j, false, this.f1157e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        C0098cn c0098cn = (C0098cn) t21.m4170h(this.f1159g);
        sb.append(c0098cn.m589c(this, t21.m4172j()) ? String.valueOf(c0098cn.f861f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
