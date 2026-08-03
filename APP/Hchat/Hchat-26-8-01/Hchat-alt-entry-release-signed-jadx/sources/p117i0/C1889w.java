package p117i0;

import p069f.AbstractC0951o0;
import p069f.C0925b0;
import p131j0.C2046b;
import p322w0.AbstractC4655f;
import p322w0.AbstractC4662m;
import p322w0.AbstractC4672w;
import p322w0.InterfaceC4670u;

/* JADX INFO: renamed from: i0.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1889w extends AbstractC4672w {

    /* JADX INFO: renamed from: h */
    public static final Object f6266h = new Object();

    /* JADX INFO: renamed from: c */
    public long f6267c;

    /* JADX INFO: renamed from: d */
    public int f6268d;

    /* JADX INFO: renamed from: e */
    public C0925b0 f6269e;

    /* JADX INFO: renamed from: f */
    public Object f6270f;

    /* JADX INFO: renamed from: g */
    public int f6271g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1889w(long j3) {
        super(j3);
        C0925b0 c0925b0 = AbstractC0951o0.f2997a;
        c0925b0.getClass();
        this.f6269e = c0925b0;
        this.f6270f = f6266h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4672w
    /* JADX INFO: renamed from: a */
    public final void mo4494a(AbstractC4672w abstractC4672w) {
        abstractC4672w.getClass();
        C1889w c1889w = (C1889w) abstractC4672w;
        this.f6269e = c1889w.f6269e;
        this.f6270f = c1889w.f6270f;
        this.f6271g = c1889w.f6271g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4672w
    /* JADX INFO: renamed from: b */
    public final AbstractC4672w mo4495b(long j3) {
        return new C1889w(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4650c(C1892x c1892x, AbstractC4655f abstractC4655f) {
        boolean z9;
        boolean z10;
        Object obj = AbstractC4662m.f15512c;
        synchronized (obj) {
            z9 = true;
            if (this.f6267c == abstractC4655f.mo9109g()) {
                z10 = this.f6268d != abstractC4655f.mo9097h();
            }
        }
        if (this.f6270f == f6266h || (z10 && this.f6271g != m4651d(c1892x, abstractC4655f))) {
            z9 = false;
        }
        if (!z9 || !z10) {
            return z9;
        }
        synchronized (obj) {
            this.f6267c = abstractC4655f.mo9109g();
            this.f6268d = abstractC4655f.mo9097h();
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9 A[PHI: r10
  0x00d9: PHI (r10v14 int) = (r10v13 int), (r10v15 int) binds: [B:30:0x00aa, B:40:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m4651d(C1892x c1892x, AbstractC4655f abstractC4655f) {
        C0925b0 c0925b0;
        int iIdentityHashCode;
        long[] jArr;
        int i9;
        Object[] objArr;
        int[] iArr;
        long[] jArr2;
        int i10;
        Object[] objArr2;
        int[] iArr2;
        long j3;
        int i11;
        AbstractC4672w abstractC4672wM9128i;
        C1889w c1889w;
        synchronized (AbstractC4662m.f15512c) {
            c0925b0 = this.f6269e;
        }
        int i12 = 7;
        if (c0925b0.f2898e == 0) {
            return 7;
        }
        C2046b c2046bM4633o = AbstractC1874r.m4633o();
        Object[] objArr3 = c2046bM4633o.f6891g;
        int i13 = c2046bM4633o.f6893i;
        for (int i14 = 0; i14 < i13; i14++) {
            ((C1832g0) objArr3[i14]).m4491b();
        }
        try {
            Object[] objArr4 = c0925b0.f2895b;
            int[] iArr3 = c0925b0.f2896c;
            long[] jArr3 = c0925b0.f2894a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                iIdentityHashCode = 7;
                int i15 = 0;
                while (true) {
                    long j4 = jArr3[i15];
                    long j5 = -9187201950435737472L;
                    if ((((~j4) << i12) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i16 = 8;
                        int i17 = 8 - ((~(i15 - length)) >>> 31);
                        i9 = i12;
                        for (int i18 = 0; i18 < i17; i18 = i10 + 1) {
                            if ((j4 & 255) < 128) {
                                int i19 = (i15 << 3) + i18;
                                j3 = j5;
                                int i20 = i16;
                                InterfaceC4670u interfaceC4670u = (InterfaceC4670u) objArr4[i19];
                                if (iArr3[i19] != 1) {
                                    jArr2 = jArr3;
                                    i10 = i18;
                                    objArr2 = objArr4;
                                    iArr2 = iArr3;
                                } else {
                                    if (interfaceC4670u instanceof C1892x) {
                                        C1892x c1892x2 = (C1892x) interfaceC4670u;
                                        C1889w c1889wM4652g = c1892x2.m4652g((C1889w) AbstractC4662m.m9128i(c1892x2.f6286j, abstractC4655f), abstractC4655f, false, c1892x2.f6284h);
                                        C0925b0 c0925b02 = c1889wM4652g.f6269e;
                                        Object[] objArr5 = c0925b02.f2895b;
                                        long[] jArr4 = c0925b02.f2894a;
                                        int length2 = jArr4.length - 2;
                                        jArr2 = jArr3;
                                        i10 = i18;
                                        objArr2 = objArr4;
                                        if (length2 >= 0) {
                                            int i21 = 0;
                                            while (true) {
                                                long j10 = jArr4[i21];
                                                iArr2 = iArr3;
                                                c1889w = c1889wM4652g;
                                                if ((((~j10) << i9) & j10 & j3) != j3) {
                                                    int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                                    for (int i23 = 0; i23 < i22; i23++) {
                                                        if ((j10 & 255) < 128) {
                                                            iIdentityHashCode = (iIdentityHashCode * 31) + System.identityHashCode((InterfaceC4670u) objArr5[(i21 << 3) + i23]);
                                                        }
                                                        j10 >>= i20;
                                                    }
                                                    if (i22 != i20) {
                                                        break;
                                                    }
                                                    if (i21 == length2) {
                                                        break;
                                                    }
                                                    i21++;
                                                    iArr3 = iArr2;
                                                    c1889wM4652g = c1889w;
                                                    i20 = 8;
                                                }
                                            }
                                        } else {
                                            iArr2 = iArr3;
                                            c1889w = c1889wM4652g;
                                        }
                                        abstractC4672wM9128i = c1889w;
                                    } else {
                                        jArr2 = jArr3;
                                        i10 = i18;
                                        objArr2 = objArr4;
                                        iArr2 = iArr3;
                                        abstractC4672wM9128i = AbstractC4662m.m9128i(interfaceC4670u.mo4484a(), abstractC4655f);
                                    }
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(abstractC4672wM9128i)) * 31) + Long.hashCode(abstractC4672wM9128i.f15550a);
                                }
                                i11 = 8;
                            } else {
                                jArr2 = jArr3;
                                i10 = i18;
                                objArr2 = objArr4;
                                iArr2 = iArr3;
                                j3 = j5;
                                i11 = i16;
                            }
                            j4 >>= i11;
                            i16 = i11;
                            jArr3 = jArr2;
                            j5 = j3;
                            objArr4 = objArr2;
                            iArr3 = iArr2;
                        }
                        jArr = jArr3;
                        objArr = objArr4;
                        iArr = iArr3;
                        if (i17 != i16) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i9 = i12;
                        objArr = objArr4;
                        iArr = iArr3;
                    }
                    if (i15 == length) {
                        i12 = iIdentityHashCode;
                        break;
                    }
                    i15++;
                    i12 = i9;
                    jArr3 = jArr;
                    objArr4 = objArr;
                    iArr3 = iArr;
                }
            }
            iIdentityHashCode = i12;
            Object[] objArr6 = c2046bM4633o.f6891g;
            int i24 = c2046bM4633o.f6893i;
            for (int i25 = 0; i25 < i24; i25++) {
                ((C1832g0) objArr6[i25]).m4490a();
            }
            return iIdentityHashCode;
        } catch (Throwable th2) {
            Object[] objArr7 = c2046bM4633o.f6891g;
            int i26 = c2046bM4633o.f6893i;
            for (int i27 = 0; i27 < i26; i27++) {
                ((C1832g0) objArr7[i27]).m4490a();
            }
            throw th2;
        }
    }
}
