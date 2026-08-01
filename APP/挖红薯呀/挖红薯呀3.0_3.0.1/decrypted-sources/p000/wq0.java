package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wq0 implements InterfaceC0968ym {

    /* JADX INFO: renamed from: d */
    public boolean f7170d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: xq0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m5014a(wq0 wq0Var, xq0 xq0Var) {
        wq0Var.getClass();
        if (xq0Var instanceof cg0) {
            ((cg0) xq0Var).mo530n(wq0Var.f7170d);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m5015i(wq0 wq0Var, xq0 xq0Var, int i, int i2) {
        wq0Var.getClass();
        m5014a(wq0Var, xq0Var);
        xq0Var.mo47X(w20.m4835c((((long) i2) & 4294967295L) | (((long) i) << 32), xq0Var.f7404h), 0.0f, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m5016j(wq0 wq0Var, xq0 xq0Var, long j) {
        wq0Var.getClass();
        m5014a(wq0Var, xq0Var);
        xq0Var.mo47X(w20.m4835c(j, xq0Var.f7404h), 0.0f, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m5017k(wq0 wq0Var, xq0 xq0Var, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (wq0Var.mo5022e() == k50.f3015d || wq0Var.mo5023f() == 0) {
            m5014a(wq0Var, xq0Var);
            xq0Var.mo47X(w20.m4835c(j, xq0Var.f7404h), 0.0f, null);
        } else {
            int iMo5023f = (wq0Var.mo5023f() - xq0Var.f7400d) - ((int) (j >> 32));
            m5014a(wq0Var, xq0Var);
            xq0Var.mo47X(w20.m4835c((((long) iMo5023f) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), xq0Var.f7404h), 0.0f, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m5018l(wq0 wq0Var, xq0 xq0Var, int i, int i2) {
        int i3 = yq0.f7688b;
        C0601p3 c0601p3 = C0601p3.f4706D;
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (wq0Var.mo5022e() == k50.f3015d || wq0Var.mo5023f() == 0) {
            m5014a(wq0Var, xq0Var);
            xq0Var.mo47X(w20.m4835c(j, xq0Var.f7404h), 0.0f, c0601p3);
        } else {
            int iMo5023f = (wq0Var.mo5023f() - xq0Var.f7400d) - ((int) (j >> 32));
            m5014a(wq0Var, xq0Var);
            xq0Var.mo47X(w20.m4835c((((long) iMo5023f) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), xq0Var.f7404h), 0.0f, c0601p3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static void m5019n(wq0 wq0Var, xq0 xq0Var, long j) {
        int i = yq0.f7688b;
        C0601p3 c0601p3 = C0601p3.f4706D;
        if (wq0Var.mo5022e() == k50.f3015d || wq0Var.mo5023f() == 0) {
            m5014a(wq0Var, xq0Var);
            xq0Var.mo47X(w20.m4835c(j, xq0Var.f7404h), 0.0f, c0601p3);
        } else {
            int iMo5023f = (wq0Var.mo5023f() - xq0Var.f7400d) - ((int) (j >> 32));
            m5014a(wq0Var, xq0Var);
            xq0Var.mo47X(w20.m4835c((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iMo5023f) << 32), xq0Var.f7404h), 0.0f, c0601p3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static void m5020q(wq0 wq0Var, xq0 xq0Var, InterfaceC0742sw interfaceC0742sw) {
        wq0Var.getClass();
        m5014a(wq0Var, xq0Var);
        xq0Var.mo47X(w20.m4835c(0L, xq0Var.f7404h), 0.0f, interfaceC0742sw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public float mo5021d(C0190ez c0190ez) {
        return Float.NaN;
    }

    /* JADX INFO: renamed from: e */
    public abstract k50 mo5022e();

    /* JADX INFO: renamed from: f */
    public abstract int mo5023f();
}
