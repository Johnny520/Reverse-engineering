package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rc2 {
    public final sc2 a;
    public final qc2 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public rc2(sc2 sc2Var) {
        this.a = sc2Var;
        this.b = new qc2(sc2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(Bundle bundle) {
        sc2 sc2Var = this.a;
        tc2 tc2Var = sc2Var.a;
        if (!sc2Var.e) {
            sc2Var.a();
        }
        if (((la1) tc2Var.getLifecycle()).h.compareTo(aa1.k) >= 0) {
            c80.y("performRestore cannot be called when owner is ", ((la1) tc2Var.getLifecycle()).h);
            return;
        }
        if (sc2Var.g) {
            s.l("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundleK = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleK = ci0.K("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        sc2Var.f = bundleK;
        sc2Var.g = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(Bundle bundle) {
        sc2 sc2Var = this.a;
        Bundle bundleL = tl.l((ow1[]) Arrays.copyOf(new ow1[0], 0));
        Bundle bundle2 = sc2Var.f;
        if (bundle2 != null) {
            bundleL.putAll(bundle2);
        }
        synchronized (sc2Var.c) {
            for (Map.Entry entry : sc2Var.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleA = ((pc2) entry.getValue()).a();
                str.getClass();
                bundleL.putBundle(str, bundleA);
            }
        }
        if (bundleL.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleL);
    }
}
