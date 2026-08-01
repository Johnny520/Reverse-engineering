package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xq0 {

    /* JADX INFO: renamed from: d */
    public int f7400d;

    /* JADX INFO: renamed from: e */
    public int f7401e;

    /* JADX INFO: renamed from: f */
    public long f7402f = 0;

    /* JADX INFO: renamed from: g */
    public long f7403g = yq0.f7687a;

    /* JADX INFO: renamed from: h */
    public long f7404h = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public int mo5001S() {
        return (int) (this.f7402f & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public int mo5002U() {
        return (int) (this.f7402f >> 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public final void m5144V() {
        this.f7400d = w60.m4907n((int) (this.f7402f >> 32), C0617pj.m3139j(this.f7403g), C0617pj.m3137h(this.f7403g));
        int iM4907n = w60.m4907n((int) (this.f7402f & 4294967295L), C0617pj.m3138i(this.f7403g), C0617pj.m3136g(this.f7403g));
        this.f7401e = iM4907n;
        int i = this.f7400d;
        long j = this.f7402f;
        this.f7404h = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iM4907n - ((int) (j & 4294967295L))) / 2)));
    }

    /* JADX INFO: renamed from: X */
    public abstract void mo47X(long j, float f, InterfaceC0742sw interfaceC0742sw);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public final void m5145Y(long j) {
        if (d30.m628a(this.f7402f, j)) {
            return;
        }
        this.f7402f = j;
        m5144V();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public final void m5146a0(long j) {
        if (C0617pj.m3131b(this.f7403g, j)) {
            return;
        }
        this.f7403g = j;
        m5144V();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public Object mo50j() {
        return null;
    }
}
