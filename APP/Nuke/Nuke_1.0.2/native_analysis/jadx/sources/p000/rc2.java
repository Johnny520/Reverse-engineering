package p000;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rc2 {

    /* JADX INFO: renamed from: a */
    public final sc2 f9511a;

    /* JADX INFO: renamed from: b */
    public final qc2 f9512b;

    public rc2(sc2 sc2Var) {
        this.f9511a = sc2Var;
        this.f9512b = new qc2(sc2Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m4432a(Bundle bundle) {
        sc2 sc2Var = this.f9511a;
        tc2 tc2Var = sc2Var.f10038a;
        if (!sc2Var.f10042e) {
            sc2Var.m4793a();
        }
        if (((la1) tc2Var.getLifecycle()).f6009h.compareTo(aa1.f122k) >= 0) {
            c80.m681y("performRestore cannot be called when owner is ", ((la1) tc2Var.getLifecycle()).f6009h);
            return;
        }
        if (sc2Var.f10044g) {
            C0676s.m4653l("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundleM786K = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleM786K = ci0.m786K("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        sc2Var.f10043f = bundleM786K;
        sc2Var.f10044g = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m4433b(Bundle bundle) {
        sc2 sc2Var = this.f9511a;
        Bundle bundleM5313l = AbstractC0738tl.m5313l((ow1[]) Arrays.copyOf(new ow1[0], 0));
        Bundle bundle2 = sc2Var.f10043f;
        if (bundle2 != null) {
            bundleM5313l.putAll(bundle2);
        }
        synchronized (sc2Var.f10040c) {
            for (Map.Entry entry : sc2Var.f10041d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleMo3037a = ((pc2) entry.getValue()).mo3037a();
                str.getClass();
                bundleM5313l.putBundle(str, bundleMo3037a);
            }
        }
        if (bundleM5313l.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleM5313l);
    }
}
