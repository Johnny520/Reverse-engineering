package androidx.lifecycle;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC0539p {

    /* JADX INFO: renamed from: a */
    public final C0519H f1471a;

    public SavedStateHandleAttacher(C0519H c0519h) {
        this.f1471a = c0519h;
    }

    @Override // androidx.lifecycle.InterfaceC0539p
    /* JADX INFO: renamed from: b */
    public final void mo981b(InterfaceC0541r interfaceC0541r, EnumC0535l enumC0535l) {
        if (enumC0535l != EnumC0535l.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0535l).toString());
        }
        interfaceC0541r.mo1231d().m1258e(this);
        C0519H c0519h = this.f1471a;
        if (c0519h.f1464b) {
            return;
        }
        Bundle bundleM982a = c0519h.f1463a.m982a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = c0519h.f1465c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleM982a != null) {
            bundle.putAll(bundleM982a);
        }
        c0519h.f1465c = bundle;
        c0519h.f1464b = true;
    }
}
