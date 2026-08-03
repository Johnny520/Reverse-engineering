package androidx.lifecycle;

import androidx.lifecycle.AbstractC1116e;
import androidx.savedstate.C1224a;
import kotlin.Metadata;
import p000a.C0631i9;
import p000a.InterfaceC0935y9;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m3302d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3303d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/g;", "lifecycle-viewmodel-savedstate_release"}, m3304k = 1, m3305mv = {1, 8, 0}, m3307xi = 48)
public final class SavedStateHandleController implements InterfaceC1118g {

    /* JADX INFO: renamed from: a */
    public final String f4661a;

    /* JADX INFO: renamed from: b */
    public final C1128m f4662b;

    /* JADX INFO: renamed from: c */
    public boolean f4663c;

    public SavedStateHandleController(String str, C1128m c1128m) {
        this.f4661a = str;
        this.f4662b = c1128m;
    }

    @Override // androidx.lifecycle.InterfaceC1118g
    /* JADX INFO: renamed from: a */
    public final void mo485a(InterfaceC0935y9 interfaceC0935y9, AbstractC1116e.a aVar) {
        if (aVar == AbstractC1116e.a.ON_DESTROY) {
            this.f4663c = false;
            interfaceC0935y9.getLifecycle().mo2594c(this);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2585c(AbstractC1116e abstractC1116e, C1224a c1224a) {
        C0631i9.m1482e(c1224a, "registry");
        C0631i9.m1482e(abstractC1116e, "lifecycle");
        if (this.f4663c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f4663c = true;
        abstractC1116e.mo2592a(this);
        c1224a.m3009c(this.f4661a, this.f4662b.f4706e);
    }
}
