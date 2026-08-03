package androidx.activity;

import android.os.Build;
import androidx.lifecycle.EnumC0535l;
import androidx.lifecycle.InterfaceC0539p;
import androidx.lifecycle.InterfaceC0541r;

/* JADX INFO: loaded from: classes.dex */
class ComponentActivity$6 implements InterfaceC0539p {
    @Override // androidx.lifecycle.InterfaceC0539p
    /* JADX INFO: renamed from: b */
    public final void mo981b(InterfaceC0541r interfaceC0541r, EnumC0535l enumC0535l) {
        if (enumC0535l != EnumC0535l.ON_CREATE || Build.VERSION.SDK_INT < 33) {
            return;
        }
        int i2 = AbstractActivityC0474a.f1062a;
        throw null;
    }
}
