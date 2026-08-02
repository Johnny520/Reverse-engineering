package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p83 {

    /* JADX INFO: renamed from: f */
    public static final C0346jd f8036f = new C0346jd(0.0f);

    /* JADX INFO: renamed from: a */
    public final x93 f8037a;

    /* JADX INFO: renamed from: b */
    public long f8038b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public C0346jd f8039c = f8036f;

    /* JADX INFO: renamed from: d */
    public boolean f8040d;

    /* JADX INFO: renamed from: e */
    public float f8041e;

    public p83(InterfaceC0273hd interfaceC0273hd) {
        this.f8037a = interfaceC0273hd.mo512a(rg3.f9572n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
    
        if (p000.qp0.m4220A(r0).m6080a(r8, r3) == r12) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e A[Catch: all -> 0x003a, PHI: r0 r2 r3 r13
  0x007e: PHI (r0v16 in0) = (r0v9 in0), (r0v17 in0) binds: [B:29:0x0076, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
  0x007e: PHI (r2v5 xm0) = (r2v3 xm0), (r2v6 xm0) binds: [B:29:0x0076, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
  0x007e: PHI (r3v4 o83) = (r3v2 o83), (r3v5 o83) binds: [B:29:0x0076, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
  0x007e: PHI (r13v1 float) = (r13v0 float), (r13v2 float) binds: [B:29:0x0076, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d7, B:20:0x004b, B:36:0x00a9, B:30:0x007e, B:33:0x008c, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d7, B:20:0x004b, B:36:0x00a9, B:30:0x007e, B:33:0x008c, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0 A[Catch: all -> 0x003a, PHI: r0 r2 r3
  0x00b0: PHI (r0v12 in0) = (r0v16 in0), (r0v17 in0) binds: [B:32:0x008b, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r2v4 xm0) = (r2v5 xm0), (r2v6 xm0) binds: [B:32:0x008b, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r3v3 o83) = (r3v4 o83), (r3v5 o83) binds: [B:32:0x008b, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d7, B:20:0x004b, B:36:0x00a9, B:30:0x007e, B:33:0x008c, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d7, B:20:0x004b, B:36:0x00a9, B:30:0x007e, B:33:0x008c, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a6 -> B:36:0x00a9). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3798a(C0444m0 c0444m0, C0678s1 c0678s1, u00 u00Var) {
        o83 o83Var;
        float f;
        o83 o83Var2;
        in0 in0Var;
        xm0 xm0Var;
        if (u00Var instanceof o83) {
            o83Var = (o83) u00Var;
            int i = o83Var.f7588p;
            if ((i & Integer.MIN_VALUE) != 0) {
                o83Var.f7588p = i - Integer.MIN_VALUE;
            } else {
                o83Var = new o83(this, u00Var);
            }
        }
        Object obj = o83Var.f7586n;
        int i2 = o83Var.f7588p;
        C0346jd c0346jd = f8036f;
        k20 k20Var = k20.f5323h;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xm0Var = (xm0) o83Var.f7583k;
                    fg1.m1627T(obj);
                    xm0Var.mo6a();
                    this.f8038b = Long.MIN_VALUE;
                    this.f8039c = c0346jd;
                    this.f8040d = false;
                    return a83.f116a;
                }
                float f2 = o83Var.f7585m;
                xm0 xm0Var2 = o83Var.f7584l;
                in0 in0Var2 = (in0) o83Var.f7583k;
                fg1.m1627T(obj);
                o83Var2 = o83Var;
                xm0Var = xm0Var2;
                f = f2;
                in0Var = in0Var2;
                xm0Var.mo6a();
                if (f != 0.0f) {
                    if (Math.abs(this.f8041e) == 0.0f) {
                        d62 d62Var = new d62(7, this, in0Var);
                        o83Var2.f7583k = xm0Var;
                        o83Var2.f7584l = null;
                        o83Var2.f7588p = 2;
                        a20 a20Var = o83Var2.f11029i;
                        a20Var.getClass();
                    }
                } else if (Math.abs(this.f8041e) < 0.01f) {
                    C0121d8 c0121d8 = new C0121d8(this, f, in0Var);
                    o83Var2.f7583k = in0Var;
                    o83Var2.f7584l = xm0Var;
                    o83Var2.f7585m = f;
                    o83Var2.f7588p = 1;
                    a20 a20Var2 = o83Var2.f11029i;
                    a20Var2.getClass();
                    if (qp0.m4220A(a20Var2).m6080a(c0121d8, o83Var2) == k20Var) {
                        return k20Var;
                    }
                    xm0Var.mo6a();
                    if (f != 0.0f) {
                    }
                } else if (Math.abs(this.f8041e) == 0.0f) {
                }
                this.f8038b = Long.MIN_VALUE;
                this.f8039c = c0346jd;
                this.f8040d = false;
                return a83.f116a;
            }
            fg1.m1627T(obj);
            if (this.f8040d) {
                nz0.m3458c("animateToZero called while previous animation is running");
            }
            a20 a20Var3 = o83Var.f11029i;
            a20Var3.getClass();
            fi1 fi1Var = (fi1) a20Var3.mo15o(C0700sn.f10209M);
            float fMo1656v = fi1Var != null ? fi1Var.mo1656v() : 1.0f;
            this.f8040d = true;
            f = fMo1656v;
            o83Var2 = o83Var;
            in0Var = c0444m0;
            xm0Var = c0678s1;
            if (Math.abs(this.f8041e) < 0.01f) {
            }
        } catch (Throwable th) {
            this.f8038b = Long.MIN_VALUE;
            this.f8039c = c0346jd;
            this.f8040d = false;
            throw th;
        }
    }
}
