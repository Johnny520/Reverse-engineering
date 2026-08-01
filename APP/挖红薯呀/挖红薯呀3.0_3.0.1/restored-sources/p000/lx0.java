package p000;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class lx0 {

    /* JADX INFO: renamed from: a */
    public final mx0 f3614a;

    /* JADX INFO: renamed from: b */
    public final kx0 f3615b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public lx0(mx0 mx0Var) {
        this.f3614a = mx0Var;
        this.f3615b = new kx0(mx0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2084a(Bundle bundle) {
        mx0 mx0Var = this.f3614a;
        nx0 nx0Var = mx0Var.f4060a;
        if (!mx0Var.f4064e) {
            mx0Var.m2606a();
        }
        if (((z90) nx0Var.getLifecycle()).f7841c.compareTo(r90.f5335g) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + ((z90) nx0Var.getLifecycle()).f7841c).toString());
        }
        if (mx0Var.f4066g) {
            C0921xc.m5134o("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundleM4916w = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleM4916w = w60.m4916w(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        mx0Var.f4065f = bundleM4916w;
        mx0Var.f4066g = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m2085b(Bundle bundle) {
        mx0 mx0Var = this.f3614a;
        Bundle bundleM1922h = AbstractC0398kl.m1922h((uo0[]) Arrays.copyOf(new uo0[0], 0));
        Bundle bundle2 = mx0Var.f4065f;
        if (bundle2 != null) {
            bundleM1922h.putAll(bundle2);
        }
        synchronized (mx0Var.f4062c) {
            for (Map.Entry entry : mx0Var.f4063d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleMo1264a = ((jx0) entry.getValue()).mo1264a();
                str.getClass();
                bundleM1922h.putBundle(str, bundleMo1264a);
            }
        }
        if (bundleM1922h.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleM1922h);
    }
}
