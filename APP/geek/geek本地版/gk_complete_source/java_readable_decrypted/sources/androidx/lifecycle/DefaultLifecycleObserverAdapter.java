package androidx.lifecycle;

import p000.AbstractC0854wf;
import p000.EnumC0347iq;
import p000.InterfaceC0494mq;
import p000.InterfaceC0568oq;
import p000.InterfaceC0817vf;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC0494mq {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0817vf f510a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0494mq f511b;

    public DefaultLifecycleObserverAdapter(InterfaceC0817vf interfaceC0817vf, InterfaceC0494mq interfaceC0494mq) {
        this.f510a = interfaceC0817vf;
        this.f511b = interfaceC0494mq;
    }

    @Override // p000.InterfaceC0494mq
    /* JADX INFO: renamed from: b */
    public final void mo124b(InterfaceC0568oq interfaceC0568oq, EnumC0347iq enumC0347iq) {
        int i = AbstractC0854wf.f4963a[enumC0347iq.ordinal()];
        if (i == 3) {
            this.f510a.mo251a();
        } else if (i == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0494mq interfaceC0494mq = this.f511b;
        if (interfaceC0494mq != null) {
            interfaceC0494mq.mo124b(interfaceC0568oq, enumC0347iq);
        }
    }
}
