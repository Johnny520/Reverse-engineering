package p000a;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1116e;
import androidx.lifecycle.InterfaceC1118g;
import androidx.savedstate.C1224a;
import androidx.savedstate.Recreator;
import java.util.Map;
import p000a.C0124Gd;

/* JADX INFO: renamed from: a.Kd */
/* JADX INFO: loaded from: classes.dex */
public final class C0196Kd {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0214Ld f662a;

    /* JADX INFO: renamed from: b */
    public final C1224a f663b = new C1224a();

    /* JADX INFO: renamed from: c */
    public boolean f664c;

    public C0196Kd(InterfaceC0214Ld interfaceC0214Ld) {
        this.f662a = interfaceC0214Ld;
    }

    /* JADX INFO: renamed from: a */
    public final void m545a() {
        InterfaceC0214Ld interfaceC0214Ld = this.f662a;
        AbstractC1116e lifecycle = interfaceC0214Ld.getLifecycle();
        if (lifecycle.mo2593b() != AbstractC1116e.b.f4673b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.mo2592a(new Recreator(interfaceC0214Ld));
        final C1224a c1224a = this.f663b;
        c1224a.getClass();
        if (c1224a.f5207b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.mo2592a(new InterfaceC1118g() { // from class: a.Jd
            @Override // androidx.lifecycle.InterfaceC1118g
            /* JADX INFO: renamed from: a */
            public final void mo485a(InterfaceC0935y9 interfaceC0935y9, AbstractC1116e.a aVar) {
                C1224a c1224a2 = c1224a;
                C0631i9.m1482e(c1224a2, "this$0");
                if (aVar == AbstractC1116e.a.ON_START) {
                    c1224a2.f5211f = true;
                } else if (aVar == AbstractC1116e.a.ON_STOP) {
                    c1224a2.f5211f = false;
                }
            }
        });
        c1224a.f5207b = true;
        this.f664c = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m546b(Bundle bundle) {
        if (!this.f664c) {
            m545a();
        }
        AbstractC1116e lifecycle = this.f662a.getLifecycle();
        if (lifecycle.mo2593b().compareTo(AbstractC1116e.b.f4675d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.mo2593b()).toString());
        }
        C1224a c1224a = this.f663b;
        if (!c1224a.f5207b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c1224a.f5209d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c1224a.f5208c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c1224a.f5209d = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m547c(Bundle bundle) {
        C0631i9.m1482e(bundle, "outBundle");
        C1224a c1224a = this.f663b;
        c1224a.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = c1224a.f5208c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C0124Gd<String, C1224a.b> c0124Gd = c1224a.f5206a;
        c0124Gd.getClass();
        C0124Gd.d dVar = new C0124Gd.d();
        c0124Gd.f407c.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((C1224a.b) entry.getValue()).mo57a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
