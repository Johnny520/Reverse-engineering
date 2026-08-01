package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class vk0 {

    /* JADX INFO: renamed from: a */
    public final wk0 f6737a;

    /* JADX INFO: renamed from: b */
    public boolean f6738b;

    /* JADX INFO: renamed from: c */
    public ri0 f6739c;

    /* JADX INFO: renamed from: d */
    public final cl0 f6740d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vk0(cl0 cl0Var, wk0 wk0Var) {
        boolean z = cl0Var.f852b;
        this.f6737a = wk0Var;
        this.f6738b = z;
        this.f6740d = cl0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4759a(boolean z) {
        ui0 ui0Var;
        boolean z2 = z && this.f6740d.f852b;
        if (this.f6738b == z2) {
            return;
        }
        this.f6738b = z2;
        ri0 ri0Var = this.f6739c;
        if (ri0Var == null || (ui0Var = ri0Var.f5421b) == null) {
            return;
        }
        ui0Var.m4332b();
    }
}
