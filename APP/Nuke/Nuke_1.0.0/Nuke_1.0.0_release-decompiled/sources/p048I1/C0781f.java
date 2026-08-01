package p048I1;

import android.os.Bundle;
import com.bumptech.glide.AbstractC1926h;
import java.util.Arrays;
import java.util.Map;
import p002A1.C0147t;
import p002A1.EnumC0141n;
import p055K1.C0874a;
import p056K2.C0882h;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;

/* JADX INFO: renamed from: I1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0781f {

    /* JADX INFO: renamed from: a */
    public final C0874a f2524a;

    /* JADX INFO: renamed from: b */
    public final C0780e f2525b;

    public C0781f(C0874a c0874a) {
        this.f2524a = c0874a;
        this.f2525b = new C0780e(c0874a);
    }

    /* JADX INFO: renamed from: a */
    public final void m1329a(Bundle bundle) {
        C0874a c0874a = this.f2524a;
        InterfaceC0782g interfaceC0782g = c0874a.f2756a;
        if (!c0874a.f2760e) {
            c0874a.m1901a();
        }
        if (((C0147t) interfaceC0782g.getLifecycle()).f541c.compareTo(EnumC0141n.f534g) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + ((C0147t) interfaceC0782g.getLifecycle()).f541c).toString());
        }
        if (c0874a.f2762g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleM3577t = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleM3577t = AbstractC1926h.m3577t("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        c0874a.f2761f = bundleM3577t;
        c0874a.f2762g = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m1330b(Bundle bundle) {
        C0874a c0874a = this.f2524a;
        Bundle bundleM3224j = AbstractC1784a.m3224j((C0882h[]) Arrays.copyOf(new C0882h[0], 0));
        Bundle bundle2 = c0874a.f2761f;
        if (bundle2 != null) {
            bundleM3224j.putAll(bundle2);
        }
        synchronized (c0874a.f2758c) {
            for (Map.Entry entry : c0874a.f2759d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleMo166a = ((InterfaceC0779d) entry.getValue()).mo166a();
                AbstractC1665j.m2985e(str, "key");
                bundleM3224j.putBundle(str, bundleMo166a);
            }
        }
        if (bundleM3224j.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleM3224j);
    }
}
