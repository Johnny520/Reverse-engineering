package androidx.lifecycle;

import p000.EnumC0347iq;
import p000.InterfaceC0494mq;
import p000.InterfaceC0568oq;
import p000.p10;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC0494mq {

    /* JADX INFO: renamed from: a */
    public final p10 f514a;

    public SavedStateHandleAttacher(p10 p10Var) {
        this.f514a = p10Var;
    }

    @Override // p000.InterfaceC0494mq
    /* JADX INFO: renamed from: b */
    public final void mo124b(InterfaceC0568oq interfaceC0568oq, EnumC0347iq enumC0347iq) {
        if (enumC0347iq != EnumC0347iq.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0347iq).toString());
        }
        interfaceC0568oq.mo120e().m279f(this);
        p10 p10Var = this.f514a;
        if (p10Var.f3632b) {
            return;
        }
        p10Var.f3633c = p10Var.f3631a.m7c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        p10Var.f3632b = true;
    }
}
