package p000;

import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ri0 {

    /* JADX INFO: renamed from: a */
    public final yk0 f5420a;

    /* JADX INFO: renamed from: b */
    public final ui0 f5421b = new ui0();

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f5422c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f5423d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ri0(yk0 yk0Var) {
        this.f5420a = yk0Var;
        new LinkedHashSet();
        this.f5422c = new LinkedHashSet();
        this.f5423d = new LinkedHashSet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m3507a(ti0 ti0Var) {
        if (this.f5423d.add(ti0Var)) {
            this.f5421b.m4331a(this, ti0Var, -1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m3508b(sk0 sk0Var, int i) {
        if (i != 1 && i != 0) {
            throw new IllegalArgumentException(AbstractC0748t1.m4154l("Unsupported priority value: ", i).toString());
        }
        if (this.f5423d.add(sk0Var)) {
            this.f5421b.m4331a(this, sk0Var, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m3509c(ti0 ti0Var, qi0 qi0Var) {
        ui0 ui0Var = this.f5421b;
        ui0Var.getClass();
        if (ui0Var.f6234g != 0) {
            return;
        }
        ui0Var.f6233f = ui0Var.m4333c(-1);
        ui0Var.f6234g = -1;
        ui0Var.f6235h = ti0Var;
        if (qi0Var != null) {
            z31 z31Var = ui0Var.f6228a;
            wi0 wi0Var = new wi0(qi0Var);
            z31Var.getClass();
            z31Var.m5413j(null, wi0Var);
        }
    }
}
