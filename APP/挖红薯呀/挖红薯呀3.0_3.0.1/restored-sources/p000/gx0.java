package p000;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import top.anjao2024.xp1whs.MainActivity;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class gx0 implements jx0 {

    /* JADX INFO: renamed from: a */
    public final kx0 f2085a;

    /* JADX INFO: renamed from: b */
    public boolean f2086b;

    /* JADX INFO: renamed from: c */
    public Bundle f2087c;

    /* JADX INFO: renamed from: d */
    public final x51 f2088d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gx0(kx0 kx0Var, MainActivity mainActivity) {
        kx0Var.getClass();
        this.f2085a = kx0Var;
        this.f2088d = new x51(new C0763tg(mainActivity, 5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.jx0
    /* JADX INFO: renamed from: a */
    public final Bundle mo1264a() {
        Bundle bundleM1922h = AbstractC0398kl.m1922h((uo0[]) Arrays.copyOf(new uo0[0], 0));
        Bundle bundle = this.f2087c;
        if (bundle != null) {
            bundleM1922h.putAll(bundle);
        }
        for (Map.Entry entry : ((hx0) this.f2088d.getValue()).f2371b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo1264a = ((C0925xg) ((dx0) entry.getValue()).f1207a.f5331e).mo1264a();
            if (!bundleMo1264a.isEmpty()) {
                str.getClass();
                bundleM1922h.putBundle(str, bundleMo1264a);
            }
        }
        this.f2086b = false;
        return bundleM1922h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1265b() {
        if (this.f2086b) {
            return;
        }
        Bundle bundleM1960a = this.f2085a.m1960a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleM1922h = AbstractC0398kl.m1922h((uo0[]) Arrays.copyOf(new uo0[0], 0));
        Bundle bundle = this.f2087c;
        if (bundle != null) {
            bundleM1922h.putAll(bundle);
        }
        if (bundleM1960a != null) {
            bundleM1922h.putAll(bundleM1960a);
        }
        this.f2087c = bundleM1922h;
        this.f2086b = true;
    }
}
