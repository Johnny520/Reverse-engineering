package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p83 {
    public static final jd f = new jd(0.0f);
    public final x93 a;
    public long b = Long.MIN_VALUE;
    public jd c = f;
    public boolean d;
    public float e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p83(hd hdVar) {
        this.a = hdVar.a(rg3.n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
    
        if (defpackage.qp0.A(r0).a(r8, r3) == r12) goto L43;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(m0 m0Var, s1 s1Var, u00 u00Var) {
        o83 o83Var;
        float f2;
        o83 o83Var2;
        in0 in0Var;
        xm0 xm0Var;
        if (u00Var instanceof o83) {
            o83Var = (o83) u00Var;
            int i = o83Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                o83Var.p = i - Integer.MIN_VALUE;
            } else {
                o83Var = new o83(this, u00Var);
            }
        }
        Object obj = o83Var.n;
        int i2 = o83Var.p;
        jd jdVar = f;
        k20 k20Var = k20.h;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xm0Var = (xm0) o83Var.k;
                    fg1.T(obj);
                    xm0Var.a();
                    this.b = Long.MIN_VALUE;
                    this.c = jdVar;
                    this.d = false;
                    return a83.a;
                }
                float f3 = o83Var.m;
                xm0 xm0Var2 = o83Var.l;
                in0 in0Var2 = (in0) o83Var.k;
                fg1.T(obj);
                o83Var2 = o83Var;
                xm0Var = xm0Var2;
                f2 = f3;
                in0Var = in0Var2;
                xm0Var.a();
                if (f2 != 0.0f) {
                    if (Math.abs(this.e) == 0.0f) {
                        d62 d62Var = new d62(7, this, in0Var);
                        o83Var2.k = xm0Var;
                        o83Var2.l = null;
                        o83Var2.p = 2;
                        a20 a20Var = o83Var2.i;
                        a20Var.getClass();
                    }
                } else if (Math.abs(this.e) < 0.01f) {
                    d8 d8Var = new d8(this, f2, in0Var);
                    o83Var2.k = in0Var;
                    o83Var2.l = xm0Var;
                    o83Var2.m = f2;
                    o83Var2.p = 1;
                    a20 a20Var2 = o83Var2.i;
                    a20Var2.getClass();
                    if (qp0.A(a20Var2).a(d8Var, o83Var2) == k20Var) {
                        return k20Var;
                    }
                    xm0Var.a();
                    if (f2 != 0.0f) {
                    }
                } else if (Math.abs(this.e) == 0.0f) {
                }
                this.b = Long.MIN_VALUE;
                this.c = jdVar;
                this.d = false;
                return a83.a;
            }
            fg1.T(obj);
            if (this.d) {
                nz0.c("animateToZero called while previous animation is running");
            }
            a20 a20Var3 = o83Var.i;
            a20Var3.getClass();
            fi1 fi1Var = (fi1) a20Var3.o(sn.M);
            float fV = fi1Var != null ? fi1Var.v() : 1.0f;
            this.d = true;
            f2 = fV;
            o83Var2 = o83Var;
            in0Var = m0Var;
            xm0Var = s1Var;
            if (Math.abs(this.e) < 0.01f) {
            }
        } catch (Throwable th) {
            this.b = Long.MIN_VALUE;
            this.c = jdVar;
            this.d = false;
            throw th;
        }
    }
}
