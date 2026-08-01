package p000;

/* JADX INFO: renamed from: cn */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0098cn extends f41 {

    /* JADX INFO: renamed from: h */
    public static final Object f857h = new Object();

    /* JADX INFO: renamed from: c */
    public long f858c;

    /* JADX INFO: renamed from: d */
    public int f859d;

    /* JADX INFO: renamed from: e */
    public ch0 f860e;

    /* JADX INFO: renamed from: f */
    public Object f861f;

    /* JADX INFO: renamed from: g */
    public int f862g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0098cn(long j) {
        super(j);
        ch0 ch0Var = jk0.f2910a;
        ch0Var.getClass();
        this.f860e = ch0Var;
        this.f861f = f857h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f41
    /* JADX INFO: renamed from: a */
    public final void mo485a(f41 f41Var) {
        f41Var.getClass();
        C0098cn c0098cn = (C0098cn) f41Var;
        this.f860e = c0098cn.f860e;
        this.f861f = c0098cn.f861f;
        this.f862g = c0098cn.f862g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f41
    /* JADX INFO: renamed from: b */
    public final f41 mo486b(long j) {
        return new C0098cn(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m589c(C0135dn c0135dn, l21 l21Var) {
        boolean z;
        boolean z2;
        Object obj = t21.f5893c;
        synchronized (obj) {
            z = true;
            if (this.f858c == l21Var.mo811g()) {
                z2 = this.f859d != l21Var.mo812h();
            }
        }
        if (this.f861f == f857h || (z2 && this.f862g != m590d(c0135dn, l21Var))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.f858c = l21Var.mo811g();
            this.f859d = l21Var.mo812h();
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX INFO: renamed from: d */
    public final int m590d(C0135dn c0135dn, l21 l21Var) {
        ch0 ch0Var;
        int iIdentityHashCode;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        f41 f41VarM4171i;
        synchronized (t21.f5893c) {
            ch0Var = this.f860e;
        }
        int i6 = 7;
        if (ch0Var.f814e == 0) {
            return 7;
        }
        sh0 sh0VarM3409k = r60.m3409k();
        Object[] objArr = sh0VarM3409k.f5768d;
        int i7 = sh0VarM3409k.f5770f;
        boolean z = false;
        for (int i8 = 0; i8 < i7; i8++) {
            ((C0552oi) objArr[i8]).m2926b();
        }
        try {
            Object[] objArr2 = ch0Var.f811b;
            int[] iArr = ch0Var.f812c;
            long[] jArr = ch0Var.f810a;
            int length = jArr.length - 2;
            if (length >= 0) {
                iIdentityHashCode = 7;
                int i9 = 0;
                while (true) {
                    long j = jArr[i9];
                    if ((((~j) << i6) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8;
                        int i11 = 8 - ((~(i9 - length)) >>> 31);
                        for (?? r14 = z; r14 < i11; r14++) {
                            if ((255 & j) < 128) {
                                int i12 = (i9 << 3) + r14;
                                i3 = i6;
                                d41 d41Var = (d41) objArr2[i12];
                                i5 = i10;
                                if (iArr[i12] != 1) {
                                    i4 = length;
                                } else {
                                    if (d41Var instanceof C0135dn) {
                                        C0135dn c0135dn2 = (C0135dn) d41Var;
                                        f41VarM4171i = c0135dn2.m718g((C0098cn) t21.m4171i(c0135dn2.f1159g, l21Var), l21Var, z, c0135dn2.f1157e);
                                    } else {
                                        f41VarM4171i = t21.m4171i(d41Var.mo440a(), l21Var);
                                    }
                                    i4 = length;
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(f41VarM4171i)) * 31) + Long.hashCode(f41VarM4171i.f1577a);
                                }
                            } else {
                                i3 = i6;
                                i4 = length;
                                i5 = i10;
                            }
                            j >>= i5;
                            i6 = i3;
                            i10 = i5;
                            length = i4;
                            z = false;
                        }
                        i = i6;
                        i2 = length;
                        if (i11 != i10) {
                            break;
                        }
                    } else {
                        i = i6;
                        i2 = length;
                    }
                    if (i9 == i2) {
                        i6 = iIdentityHashCode;
                        break;
                    }
                    i9++;
                    i6 = i;
                    length = i2;
                    z = false;
                }
            }
            iIdentityHashCode = i6;
            Object[] objArr3 = sh0VarM3409k.f5768d;
            int i13 = sh0VarM3409k.f5770f;
            for (int i14 = 0; i14 < i13; i14++) {
                ((C0552oi) objArr3[i14]).m2925a();
            }
            return iIdentityHashCode;
        } catch (Throwable th) {
            Object[] objArr4 = sh0VarM3409k.f5768d;
            int i15 = sh0VarM3409k.f5770f;
            for (int i16 = 0; i16 < i15; i16++) {
                ((C0552oi) objArr4[i16]).m2925a();
            }
            throw th;
        }
    }
}
