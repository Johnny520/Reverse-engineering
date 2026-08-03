package androidx.fragment.app;

import androidx.lifecycle.EnumC0535l;
import androidx.lifecycle.InterfaceC0539p;
import androidx.lifecycle.InterfaceC0541r;

/* JADX INFO: loaded from: classes.dex */
class FragmentManager$6 implements InterfaceC0539p {
    @Override // androidx.lifecycle.InterfaceC0539p
    /* JADX INFO: renamed from: b */
    public final void mo981b(InterfaceC0541r interfaceC0541r, EnumC0535l enumC0535l) {
        if (enumC0535l == EnumC0535l.ON_START || enumC0535l == EnumC0535l.ON_DESTROY) {
            throw null;
        }
    }
}
