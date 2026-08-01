package androidx.lifecycle;

import p000.EnumC0494mq;
import p000.InterfaceC0642qq;
import p000.InterfaceC0716sq;
import p000.w10;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC0642qq {

    /* JADX INFO: renamed from: a */
    public final w10 f477a;

    public SavedStateHandleAttacher(w10 w10Var) {
        this.f477a = w10Var;
    }

    @Override // p000.InterfaceC0642qq
    /* JADX INFO: renamed from: b */
    public final void mo109b(InterfaceC0716sq interfaceC0716sq, EnumC0494mq enumC0494mq) {
        if (enumC0494mq != EnumC0494mq.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0494mq).toString());
        }
        interfaceC0716sq.mo105e().m264f(this);
        w10 w10Var = this.f477a;
        if (w10Var.f5028b) {
            return;
        }
        w10Var.f5029c = w10Var.f5027a.m20c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        w10Var.f5028b = true;
    }
}
