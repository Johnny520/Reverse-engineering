package androidx.activity;

import android.os.Build;
import androidx.lifecycle.EnumC0535l;
import androidx.lifecycle.InterfaceC0539p;
import androidx.lifecycle.InterfaceC0541r;

/* JADX INFO: loaded from: classes.dex */
class ComponentActivity$6 implements InterfaceC0539p {
    @Override // androidx.lifecycle.InterfaceC0539p
    /* JADX INFO: renamed from: b */
    public final void mo981b(InterfaceC0541r r1, EnumC0535l r2) {
        if (r2 == EnumC0535l.ON_CREATE) goto L5;
        return;
    L5:
        if (Build.VERSION.SDK_INT < 33) goto L10;
        int r12 = AbstractActivityC0474a.f1062a;
        throw null;
    }
}
