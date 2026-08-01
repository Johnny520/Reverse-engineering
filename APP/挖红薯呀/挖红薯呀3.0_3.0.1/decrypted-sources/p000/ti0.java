package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ti0 {

    /* JADX INFO: renamed from: a */
    public ri0 f6004a;

    /* JADX INFO: renamed from: b */
    public boolean f6005b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4208a() {
        ri0 ri0Var = this.f6004a;
        if (ri0Var == null) {
            C0921xc.m5134o("This input is not added to any dispatcher.");
            return;
        }
        if (!this.f6005b) {
            ri0Var.m3509c(this, null);
        }
        ui0 ui0Var = ri0Var.f5421b;
        yk0 yk0Var = ri0Var.f5420a;
        ui0Var.getClass();
        if (equals(ui0Var.f6235h) && -1 == ui0Var.f6234g) {
            vk0 vk0VarM4333c = ui0Var.f6233f;
            if (vk0VarM4333c == null) {
                vk0VarM4333c = ui0Var.m4333c(-1);
            }
            ui0Var.f6233f = null;
            ui0Var.f6234g = 0;
            ui0Var.f6235h = null;
            if (vk0VarM4333c == null) {
                ((bl0) yk0Var.f7653a).f543a.run();
            } else {
                cl0 cl0Var = vk0VarM4333c.f6740d;
                cl0Var.f854d.invoke(cl0Var);
            }
            z31 z31Var = ui0Var.f6228a;
            z31Var.getClass();
            z31Var.m5413j(null, vi0.f6722f);
        }
        this.f6005b = false;
    }

    /* JADX INFO: renamed from: b */
    public void mo4084b(boolean z) {
    }
}
