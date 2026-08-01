package androidx.activity.result;

import p000.EnumC0347iq;
import p000.InterfaceC0494mq;
import p000.InterfaceC0568oq;

/* JADX INFO: loaded from: classes.dex */
class ActivityResultRegistry$1 implements InterfaceC0494mq {
    @Override // p000.InterfaceC0494mq
    /* JADX INFO: renamed from: b */
    public final void mo124b(InterfaceC0568oq interfaceC0568oq, EnumC0347iq enumC0347iq) {
        if (EnumC0347iq.ON_START.equals(enumC0347iq) || EnumC0347iq.ON_STOP.equals(enumC0347iq) || EnumC0347iq.ON_DESTROY.equals(enumC0347iq)) {
            throw null;
        }
    }
}
