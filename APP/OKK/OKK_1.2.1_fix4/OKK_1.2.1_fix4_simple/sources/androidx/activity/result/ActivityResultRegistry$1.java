package androidx.activity.result;

import androidx.lifecycle.EnumC0535l;
import androidx.lifecycle.InterfaceC0539p;
import androidx.lifecycle.InterfaceC0541r;

/* JADX INFO: loaded from: classes.dex */
class ActivityResultRegistry$1 implements InterfaceC0539p {
    @Override // androidx.lifecycle.InterfaceC0539p
    /* JADX INFO: renamed from: b */
    public final void mo981b(InterfaceC0541r r2, EnumC0535l r3) {
        if (EnumC0535l.ON_START.equals(r3) == false) goto L5;
        throw null;
    L5:
        if (EnumC0535l.ON_STOP.equals(r3) == false) goto L7;
        throw null;
    L7:
        if (EnumC0535l.ON_DESTROY.equals(r3) == true) goto L9;
        return;
    L9:
        throw null;
    }
}
