package p000;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class cx0 implements zw0, nx0 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ax0 f907d;

    /* JADX INFO: renamed from: e */
    public z90 f908e;

    /* JADX INFO: renamed from: f */
    public lx0 f909f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cx0(ax0 ax0Var) {
        this.f907d = ax0Var;
        Object objMo217d = ax0Var.mo217d("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objMo217d instanceof Bundle ? (Bundle) objMo217d : null;
        if (bundle != null) {
            m606e(bundle);
        }
        ax0Var.mo214a("androidx.savedstate.SavedStateRegistry", new C0381k6(8, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.zw0
    /* JADX INFO: renamed from: a */
    public final C0541o8 mo214a(String str, InterfaceC0298hw interfaceC0298hw) {
        return this.f907d.mo214a(str, interfaceC0298hw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.zw0
    /* JADX INFO: renamed from: b */
    public final boolean mo215b(Object obj) {
        return this.f907d.mo215b(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.zw0
    /* JADX INFO: renamed from: c */
    public final Map mo216c() {
        return this.f907d.mo216c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.zw0
    /* JADX INFO: renamed from: d */
    public final Object mo217d(String str) {
        return this.f907d.mo217d(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final lx0 m606e(Bundle bundle) {
        lx0 lx0Var = this.f909f;
        if (lx0Var != null) {
            return lx0Var;
        }
        lx0 lx0Var2 = new lx0(new mx0(this, new C0381k6(9, this)));
        this.f909f = lx0Var2;
        lx0Var2.m2084a(bundle);
        return lx0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.x90
    public final s90 getLifecycle() {
        z90 z90Var = this.f908e;
        if (z90Var != null) {
            return z90Var;
        }
        z90 z90Var2 = new z90(this, false);
        this.f908e = z90Var2;
        return z90Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.nx0
    public final kx0 getSavedStateRegistry() {
        return m606e(null).f3615b;
    }
}
