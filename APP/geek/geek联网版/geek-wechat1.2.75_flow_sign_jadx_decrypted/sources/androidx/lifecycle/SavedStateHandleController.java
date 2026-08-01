package androidx.lifecycle;

import p000.EnumC0494mq;
import p000.InterfaceC0642qq;
import p000.InterfaceC0716sq;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC0642qq {

    /* JADX INFO: renamed from: a */
    public boolean f478a;

    @Override // p000.InterfaceC0642qq
    /* JADX INFO: renamed from: b */
    public final void mo109b(InterfaceC0716sq interfaceC0716sq, EnumC0494mq enumC0494mq) {
        if (enumC0494mq == EnumC0494mq.ON_DESTROY) {
            this.f478a = false;
            interfaceC0716sq.mo105e().m264f(this);
        }
    }
}
