package androidx.lifecycle;

import androidx.lifecycle.AbstractC1116e;
import kotlin.Metadata;
import p000a.C0142Hd;
import p000a.InterfaceC0935y9;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m3302d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3303d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/g;", "lifecycle-viewmodel-savedstate_release"}, m3304k = 1, m3305mv = {1, 8, 0}, m3307xi = 48)
public final class SavedStateHandleAttacher implements InterfaceC1118g {

    /* JADX INFO: renamed from: a */
    public final C0142Hd f4660a;

    public SavedStateHandleAttacher(C0142Hd c0142Hd) {
        this.f4660a = c0142Hd;
    }

    @Override // androidx.lifecycle.InterfaceC1118g
    /* JADX INFO: renamed from: a */
    public final void mo485a(InterfaceC0935y9 interfaceC0935y9, AbstractC1116e.a aVar) {
        if (aVar == AbstractC1116e.a.ON_CREATE) {
            interfaceC0935y9.getLifecycle().mo2594c(this);
            this.f4660a.m370b();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
        }
    }
}
