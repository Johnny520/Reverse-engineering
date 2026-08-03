package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC0539p {

    /* JADX INFO: renamed from: a */
    public boolean f1472a;

    @Override // androidx.lifecycle.InterfaceC0539p
    /* JADX INFO: renamed from: b */
    public final void mo981b(InterfaceC0541r r2, EnumC0535l r3) {
        if (r3 != EnumC0535l.ON_DESTROY) goto L6;
        this.f1472a = false;
        r2.mo1231d().m1258e(this);
        return;
    }
}
