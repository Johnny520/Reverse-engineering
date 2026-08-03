package androidx.lifecycle;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC0539p {

    /* JADX INFO: renamed from: a */
    public final C0519H f1471a;

    public SavedStateHandleAttacher(C0519H r1) {
        this.f1471a = r1;
    }

    @Override // androidx.lifecycle.InterfaceC0539p
    /* JADX INFO: renamed from: b */
    public final void mo981b(InterfaceC0541r r3, EnumC0535l r4) {
        if (r4 != EnumC0535l.ON_CREATE) goto L14;
        r3.mo1231d().m1258e(this);
        C0519H r32 = this.f1471a;
        if (r32.f1464b == true) goto L15;
        Bundle r42 = r32.f1463a.m982a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle r02 = new Bundle();
        Bundle r1 = r32.f1465c;
        if (r1 == null) goto L9;
        r02.putAll(r1);
    L9:
        if (r42 == null) goto L11;
        r02.putAll(r42);
    L11:
        r32.f1465c = r02;
        r32.f1464b = true;
        C0520I r33 = (C0520I) r32.f1466d.m466a();
        return;
    L15:
        return;
    L14:
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + r4).toString());
    }
}
