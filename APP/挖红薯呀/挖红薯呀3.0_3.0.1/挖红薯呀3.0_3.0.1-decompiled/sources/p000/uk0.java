package p000;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class uk0 implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sk0 f6250a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public uk0(sk0 sk0Var) {
        this.f6250a = sk0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onBackCancelled() {
        sk0 sk0Var = this.f6250a;
        ri0 ri0Var = sk0Var.f6004a;
        if (ri0Var == null) {
            C0921xc.m5134o("This input is not added to any dispatcher.");
            return;
        }
        if (!sk0Var.f6005b) {
            ri0Var.m3509c(sk0Var, null);
        }
        ui0 ui0Var = ri0Var.f5421b;
        ui0Var.getClass();
        if (sk0Var.equals(ui0Var.f6235h) && -1 == ui0Var.f6234g) {
            if (ui0Var.f6233f == null) {
                ui0Var.m4333c(-1);
            }
            ui0Var.f6233f = null;
            ui0Var.f6234g = 0;
            ui0Var.f6235h = null;
            z31 z31Var = ui0Var.f6228a;
            z31Var.getClass();
            z31Var.m5413j(null, vi0.f6722f);
        }
        sk0Var.f6005b = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onBackInvoked() {
        this.f6250a.m4208a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        qi0 qi0VarM4261b = u50.m4261b(backEvent);
        sk0 sk0Var = this.f6250a;
        ri0 ri0Var = sk0Var.f6004a;
        if (ri0Var == null) {
            C0921xc.m5134o("This input is not added to any dispatcher.");
            return;
        }
        if (sk0Var.f6005b) {
            ui0 ui0Var = ri0Var.f5421b;
            ui0Var.getClass();
            if (sk0Var.equals(ui0Var.f6235h) && -1 == ui0Var.f6234g) {
                if (ui0Var.f6233f == null) {
                    ui0Var.m4333c(-1);
                }
                z31 z31Var = ui0Var.f6228a;
                wi0 wi0Var = new wi0(qi0VarM4261b);
                z31Var.getClass();
                z31Var.m5413j(null, wi0Var);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        qi0 qi0VarM4261b = u50.m4261b(backEvent);
        sk0 sk0Var = this.f6250a;
        ri0 ri0Var = sk0Var.f6004a;
        if (ri0Var == null) {
            C0921xc.m5134o("This input is not added to any dispatcher.");
        } else {
            if (sk0Var.f6005b) {
                return;
            }
            ri0Var.m3509c(sk0Var, qi0VarM4261b);
            sk0Var.f6005b = true;
        }
    }
}
