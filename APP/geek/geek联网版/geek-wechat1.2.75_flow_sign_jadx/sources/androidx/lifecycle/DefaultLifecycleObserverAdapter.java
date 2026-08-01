package androidx.lifecycle;

import p000.AbstractC0891xf;
import p000.EnumC0494mq;
import p000.InterfaceC0642qq;
import p000.InterfaceC0716sq;
import p000.InterfaceC0854wf;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC0642qq {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0854wf f473a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0642qq f474b;

    public DefaultLifecycleObserverAdapter(InterfaceC0854wf interfaceC0854wf, InterfaceC0642qq interfaceC0642qq) {
        this.f473a = interfaceC0854wf;
        this.f474b = interfaceC0642qq;
    }

    @Override // p000.InterfaceC0642qq
    /* JADX INFO: renamed from: b */
    public final void mo109b(InterfaceC0716sq interfaceC0716sq, EnumC0494mq enumC0494mq) {
        int i = AbstractC0891xf.f5244a[enumC0494mq.ordinal()];
        if (i == 3) {
            this.f473a.mo236a();
        } else if (i == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0642qq interfaceC0642qq = this.f474b;
        if (interfaceC0642qq != null) {
            interfaceC0642qq.mo109b(interfaceC0716sq, enumC0494mq);
        }
    }
}
