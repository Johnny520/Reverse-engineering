package androidx.lifecycle;

import p000.EnumC0347iq;
import p000.InterfaceC0494mq;
import p000.InterfaceC0568oq;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC0494mq {

    /* JADX INFO: renamed from: a */
    public boolean f515a;

    @Override // p000.InterfaceC0494mq
    /* JADX INFO: renamed from: b */
    public final void mo124b(InterfaceC0568oq interfaceC0568oq, EnumC0347iq enumC0347iq) {
        if (enumC0347iq == EnumC0347iq.ON_DESTROY) {
            this.f515a = false;
            interfaceC0568oq.mo120e().m279f(this);
        }
    }
}
