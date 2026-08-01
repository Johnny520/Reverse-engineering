package androidx.activity.result;

import androidx.lifecycle.EnumC0478m;
import androidx.lifecycle.InterfaceC0482q;
import androidx.lifecycle.InterfaceC0484s;

/* JADX INFO: loaded from: classes.dex */
class ActivityResultRegistry$1 implements InterfaceC0482q {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0482q
    /* JADX INFO: renamed from: c */
    public final void mo391c(InterfaceC0484s interfaceC0484s, EnumC0478m enumC0478m) {
        if (EnumC0478m.ON_START.equals(enumC0478m) || EnumC0478m.ON_STOP.equals(enumC0478m) || EnumC0478m.ON_DESTROY.equals(enumC0478m)) {
            throw null;
        }
    }
}
