package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class y70 {

    /* JADX INFO: renamed from: a */
    public final Object f7559a;

    /* JADX INFO: renamed from: b */
    public final a80 f7560b;

    /* JADX INFO: renamed from: d */
    public int f7562d;

    /* JADX INFO: renamed from: e */
    public y70 f7563e;

    /* JADX INFO: renamed from: f */
    public boolean f7564f;

    /* JADX INFO: renamed from: c */
    public int f7561c = -1;

    /* JADX INFO: renamed from: g */
    public final gp0 f7565g = r60.m3419u(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y70(Object obj, a80 a80Var) {
        this.f7559a = obj;
        this.f7560b = a80Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final y70 m5214a() {
        if (this.f7564f) {
            z10.m5363c("Pin should not be called on an already disposed item ");
        }
        if (this.f7562d == 0) {
            this.f7560b.f69d.add(this);
            y70 y70Var = (y70) this.f7565g.getValue();
            if (y70Var != null) {
                y70Var.m5214a();
            } else {
                y70Var = null;
            }
            this.f7563e = y70Var;
        }
        this.f7562d++;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m5215b() {
        if (this.f7564f) {
            return;
        }
        if (this.f7562d <= 0) {
            z10.m5363c("Release should only be called once");
        }
        int i = this.f7562d - 1;
        this.f7562d = i;
        if (i == 0) {
            this.f7560b.f69d.remove(this);
            y70 y70Var = this.f7563e;
            if (y70Var != null) {
                y70Var.m5215b();
            }
            this.f7563e = null;
        }
    }
}
