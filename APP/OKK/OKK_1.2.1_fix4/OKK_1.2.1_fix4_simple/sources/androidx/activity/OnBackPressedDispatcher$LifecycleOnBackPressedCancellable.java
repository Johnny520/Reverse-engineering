package androidx.activity;

import androidx.lifecycle.EnumC0535l;
import androidx.lifecycle.InterfaceC0539p;
import androidx.lifecycle.InterfaceC0541r;

/* JADX INFO: loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements InterfaceC0539p {
    @Override // androidx.lifecycle.InterfaceC0539p
    /* JADX INFO: renamed from: b */
    public final void mo981b(InterfaceC0541r r2, EnumC0535l r3) {
        if (r3 != EnumC0535l.ON_START) goto L5;
        throw null;
    L5:
        if (r3 != EnumC0535l.ON_STOP) goto L8;
        return;
    L8:
        if (r3 == EnumC0535l.ON_DESTROY) goto L10;
        return;
    L10:
        throw null;
    }
}
