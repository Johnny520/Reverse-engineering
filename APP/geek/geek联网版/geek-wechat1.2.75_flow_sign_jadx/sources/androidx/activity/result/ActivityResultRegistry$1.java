package androidx.activity.result;

import p000.EnumC0494mq;
import p000.InterfaceC0642qq;
import p000.InterfaceC0716sq;

/* JADX INFO: loaded from: classes.dex */
class ActivityResultRegistry$1 implements InterfaceC0642qq {
    @Override // p000.InterfaceC0642qq
    /* JADX INFO: renamed from: b */
    public final void mo109b(InterfaceC0716sq interfaceC0716sq, EnumC0494mq enumC0494mq) {
        if (EnumC0494mq.ON_START.equals(enumC0494mq) || EnumC0494mq.ON_STOP.equals(enumC0494mq) || EnumC0494mq.ON_DESTROY.equals(enumC0494mq)) {
            throw null;
        }
    }
}
