package p000;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: renamed from: dx */
/* JADX INFO: loaded from: classes.dex */
public final class C1342dx implements InterfaceC1474gx {

    /* JADX INFO: renamed from: a */
    public final C1518hx f4832a;

    /* JADX INFO: renamed from: b */
    public boolean f4833b;

    /* JADX INFO: renamed from: c */
    public Bundle f4834c;

    /* JADX INFO: renamed from: d */
    public final C1251cA f4835d;

    public C1342dx(C1518hx c1518hx, InterfaceC2752yE interfaceC2752yE) {
        this.f4832a = c1518hx;
        this.f4835d = new C1251cA(new C2790z9(5, interfaceC2752yE));
    }

    /* JADX INFO: renamed from: a */
    public final void m2598a() {
        if (this.f4833b) {
            return;
        }
        Bundle bundleM2896a = this.f4832a.m2896a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4834c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleM2896a != null) {
            bundle.putAll(bundleM2896a);
        }
        this.f4834c = bundle;
        this.f4833b = true;
    }

    @Override // p000.InterfaceC1474gx
    public final Bundle saveState() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4834c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((C1386ex) this.f4835d.getValue()).f4935d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleSaveState = ((C1194ax) entry.getValue()).f4096e.saveState();
            if (!AbstractC0585Nj.m1134a(bundleSaveState, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleSaveState);
            }
        }
        this.f4833b = false;
        return bundle;
    }
}
