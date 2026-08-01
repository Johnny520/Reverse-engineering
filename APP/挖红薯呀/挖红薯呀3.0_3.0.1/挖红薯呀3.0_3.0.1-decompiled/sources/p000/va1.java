package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class va1 {

    /* JADX INFO: renamed from: f */
    public static final C0916x7 f6626f = new C0916x7(0.0f);

    /* JADX INFO: renamed from: a */
    public final mb1 f6627a;

    /* JADX INFO: renamed from: b */
    public long f6628b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public C0916x7 f6629c = f6626f;

    /* JADX INFO: renamed from: d */
    public boolean f6630d;

    /* JADX INFO: renamed from: e */
    public float f6631e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public va1(InterfaceC0830v7 interfaceC0830v7) {
        this.f6627a = interfaceC0830v7.mo969a(AbstractC0398kl.f3213x);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d2, code lost:
    
        if (p000.v50.m4406l(r3.mo540e()).m4008c(r8, r3) == r12) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[Catch: all -> 0x003a, PHI: r0 r2 r3 r13
  0x007d: PHI (r0v16 sw) = (r0v9 sw), (r0v17 sw) binds: [B:29:0x0075, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE]
  0x007d: PHI (r2v5 hw) = (r2v3 hw), (r2v6 hw) binds: [B:29:0x0075, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE]
  0x007d: PHI (r3v4 ua1) = (r3v2 ua1), (r3v5 ua1) binds: [B:29:0x0075, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE]
  0x007d: PHI (r13v1 float) = (r13v0 float), (r13v2 float) binds: [B:29:0x0075, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d5, B:20:0x004b, B:36:0x00a7, B:30:0x007d, B:33:0x008b, B:38:0x00ae, B:41:0x00b9), top: B:49:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d5, B:20:0x004b, B:36:0x00a7, B:30:0x007d, B:33:0x008b, B:38:0x00ae, B:41:0x00b9), top: B:49:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae A[Catch: all -> 0x003a, PHI: r0 r2 r3
  0x00ae: PHI (r0v12 sw) = (r0v16 sw), (r0v17 sw) binds: [B:32:0x008a, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE]
  0x00ae: PHI (r2v4 hw) = (r2v5 hw), (r2v6 hw) binds: [B:32:0x008a, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE]
  0x00ae: PHI (r3v3 ua1) = (r3v4 ua1), (r3v5 ua1) binds: [B:32:0x008a, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d5, B:20:0x004b, B:36:0x00a7, B:30:0x007d, B:33:0x008b, B:38:0x00ae, B:41:0x00b9), top: B:49:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d5, B:20:0x004b, B:36:0x00a7, B:30:0x007d, B:33:0x008b, B:38:0x00ae, B:41:0x00b9), top: B:49:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a4 -> B:36:0x00a7). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4439a(C1006zj c1006zj, C0607p9 c0607p9, AbstractC0358jk abstractC0358jk) {
        ua1 ua1Var;
        float f;
        ua1 ua1Var2;
        InterfaceC0742sw interfaceC0742sw;
        InterfaceC0298hw interfaceC0298hw;
        if (abstractC0358jk instanceof ua1) {
            ua1Var = (ua1) abstractC0358jk;
            int i = ua1Var.f6181l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ua1Var.f6181l = i - Integer.MIN_VALUE;
            } else {
                ua1Var = new ua1(this, abstractC0358jk);
            }
        }
        Object obj = ua1Var.f6179j;
        int i2 = ua1Var.f6181l;
        C0916x7 c0916x7 = f6626f;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    interfaceC0298hw = (InterfaceC0298hw) ua1Var.f6176g;
                    w60.m4891M(obj);
                    interfaceC0298hw.invoke();
                    this.f6628b = Long.MIN_VALUE;
                    this.f6629c = c0916x7;
                    this.f6630d = false;
                    return na1.f4229a;
                }
                float f2 = ua1Var.f6178i;
                InterfaceC0298hw interfaceC0298hw2 = ua1Var.f6177h;
                InterfaceC0742sw interfaceC0742sw2 = (InterfaceC0742sw) ua1Var.f6176g;
                w60.m4891M(obj);
                ua1Var2 = ua1Var;
                interfaceC0298hw = interfaceC0298hw2;
                f = f2;
                interfaceC0742sw = interfaceC0742sw2;
                interfaceC0298hw.invoke();
                if (f != 0.0f) {
                    if (Math.abs(this.f6631e) == 0.0f) {
                        C0073c c0073c = new C0073c(23, this, interfaceC0742sw);
                        ua1Var2.f6176g = interfaceC0298hw;
                        ua1Var2.f6177h = null;
                        ua1Var2.f6181l = 2;
                    }
                } else if (Math.abs(this.f6631e) < 0.01f) {
                    g81 g81Var = new g81(this, f, interfaceC0742sw);
                    ua1Var2.f6176g = interfaceC0742sw;
                    ua1Var2.f6177h = interfaceC0298hw;
                    ua1Var2.f6178i = f;
                    ua1Var2.f6181l = 1;
                    if (v50.m4406l(ua1Var2.mo540e()).m4008c(g81Var, ua1Var2) == enumC1007zk) {
                        return enumC1007zk;
                    }
                    interfaceC0298hw.invoke();
                    if (f != 0.0f) {
                    }
                } else if (Math.abs(this.f6631e) == 0.0f) {
                }
                this.f6628b = Long.MIN_VALUE;
                this.f6629c = c0916x7;
                this.f6630d = false;
                return na1.f4229a;
            }
            w60.m4891M(obj);
            if (this.f6630d) {
                z10.m5363c("animateToZero called while previous animation is running");
            }
            xf0 xf0Var = (xf0) ua1Var.mo540e().mo64l(C0496n2.f4131K);
            float fMo591u = xf0Var != null ? xf0Var.mo591u() : 1.0f;
            this.f6630d = true;
            f = fMo591u;
            ua1Var2 = ua1Var;
            interfaceC0742sw = c1006zj;
            interfaceC0298hw = c0607p9;
            if (Math.abs(this.f6631e) < 0.01f) {
            }
        } catch (Throwable th) {
            this.f6628b = Long.MIN_VALUE;
            this.f6629c = c0916x7;
            this.f6630d = false;
            throw th;
        }
    }
}
