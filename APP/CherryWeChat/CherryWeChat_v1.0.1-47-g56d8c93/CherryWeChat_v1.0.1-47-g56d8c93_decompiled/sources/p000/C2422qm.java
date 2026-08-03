package p000;

/* JADX INFO: renamed from: qm */
/* JADX INFO: loaded from: classes.dex */
public final class C2422qm extends AbstractC1406fG {

    /* JADX INFO: renamed from: g */
    public final C2341oz f8484g;

    public C2422qm(C2341oz c2341oz) {
        super(4);
        this.f8484g = c2341oz;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058 A[Catch: IllegalArgumentException -> 0x0086, PHI: r14
  0x0058: PHI (r14v2 long) = (r14v1 long), (r14v5 long) binds: [B:21:0x0045, B:25:0x0055] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {IllegalArgumentException -> 0x0086, blocks: (B:33:0x007d, B:35:0x0080, B:36:0x0083, B:17:0x0036, B:20:0x0041, B:24:0x004b, B:27:0x0058, B:30:0x006d, B:31:0x0074), top: B:43:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000f  */
    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo841a() throws Throwable {
        Throwable th;
        int i;
        C2135kC c2135kC;
        C2341oz c2341oz = this.f8484g;
        String strM4760j = c2341oz.m4760j();
        try {
            int length = strM4760j.length();
            if (length == 0) {
                th = null;
                c2135kC = th;
                break;
            }
            char cCharAt = strM4760j.charAt(0);
            if (AbstractC0585Nj.m1139g(cCharAt, 48) < 0) {
                i = 1;
                if (length == 1 || cCharAt != '+') {
                }
                c2135kC = th;
                break;
            }
            i = 0;
            int i2 = 10;
            long j = 10;
            long j2 = 0;
            long jDivideUnsigned = 512409557603043100L;
            while (i < length) {
                th = null;
                try {
                    int iDigit = Character.digit((int) strM4760j.charAt(i), i2);
                    if (iDigit >= 0) {
                        if (Long.compareUnsigned(j2, jDivideUnsigned) <= 0) {
                            long j3 = j2 * j;
                            int i3 = i;
                            long j4 = (((long) iDigit) & 4294967295L) + j3;
                            if (Long.compareUnsigned(j4, j3) >= 0) {
                                j2 = j4;
                                i2 = 10;
                                i = i3 + 1;
                            }
                        } else if (jDivideUnsigned == 512409557603043100L) {
                            jDivideUnsigned = Long.divideUnsigned(-1L, j);
                            if (Long.compareUnsigned(j2, jDivideUnsigned) > 0) {
                            }
                        }
                    }
                    c2135kC = th;
                    break;
                } catch (IllegalArgumentException unused) {
                    C2341oz.m4750m(c2341oz, "Failed to parse type 'ULong' for input '" + strM4760j + '\'', 0, 6);
                    throw th;
                }
            }
            th = null;
            c2135kC = new C2135kC(j2);
            if (c2135kC != 0) {
                return c2135kC.f7478a;
            }
            AbstractC0042Az.m60G(strM4760j);
            throw th;
        } catch (IllegalArgumentException unused2) {
            th = null;
        }
    }

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: j */
    public final int mo1770j(InterfaceC0126Cx interfaceC0126Cx) {
        throw new IllegalStateException("unsupported");
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: p */
    public final int mo846p() {
        C2341oz c2341oz = this.f8484g;
        String strM4760j = c2341oz.m4760j();
        try {
            C1402fC c1402fCM2719s0 = AbstractC1406fG.m2719s0(strM4760j);
            if (c1402fCM2719s0 != null) {
                return c1402fCM2719s0.f4976a;
            }
            AbstractC0042Az.m60G(strM4760j);
            throw null;
        } catch (IllegalArgumentException unused) {
            C2341oz.m4750m(c2341oz, "Failed to parse type 'UInt' for input '" + strM4760j + '\'', 0, 6);
            throw null;
        }
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: t */
    public final byte mo847t() {
        C1130aC c1130aC;
        C2341oz c2341oz = this.f8484g;
        String strM4760j = c2341oz.m4760j();
        try {
            C1402fC c1402fCM2719s0 = AbstractC1406fG.m2719s0(strM4760j);
            if (c1402fCM2719s0 != null) {
                int i = c1402fCM2719s0.f4976a;
                c1130aC = Integer.compareUnsigned(i, 255) > 0 ? null : new C1130aC((byte) i);
            }
            if (c1130aC != null) {
                return c1130aC.f3580a;
            }
            AbstractC0042Az.m60G(strM4760j);
            throw null;
        } catch (IllegalArgumentException unused) {
            C2341oz.m4750m(c2341oz, "Failed to parse type 'UByte' for input '" + strM4760j + '\'', 0, 6);
            throw null;
        }
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: x */
    public final short mo849x() {
        C2355pC c2355pC;
        C2341oz c2341oz = this.f8484g;
        String strM4760j = c2341oz.m4760j();
        try {
            C1402fC c1402fCM2719s0 = AbstractC1406fG.m2719s0(strM4760j);
            if (c1402fCM2719s0 != null) {
                int i = c1402fCM2719s0.f4976a;
                c2355pC = Integer.compareUnsigned(i, 65535) > 0 ? null : new C2355pC((short) i);
            }
            if (c2355pC != null) {
                return c2355pC.f8240a;
            }
            AbstractC0042Az.m60G(strM4760j);
            throw null;
        } catch (IllegalArgumentException unused) {
            C2341oz.m4750m(c2341oz, "Failed to parse type 'UShort' for input '" + strM4760j + '\'', 0, 6);
            throw null;
        }
    }
}
