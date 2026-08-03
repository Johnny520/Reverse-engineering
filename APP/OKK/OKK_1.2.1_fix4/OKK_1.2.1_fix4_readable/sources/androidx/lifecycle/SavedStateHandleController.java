package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC0539p {

    /* JADX INFO: renamed from: a */
    public boolean f1472a;

    @Override // androidx.lifecycle.InterfaceC0539p
    /* JADX INFO: renamed from: b */
    public final void mo981b(InterfaceC0541r interfaceC0541r, EnumC0535l enumC0535l) {
        if (enumC0535l == EnumC0535l.ON_DESTROY) {
            this.f1472a = false;
            interfaceC0541r.mo1231d().m1258e(this);
        }
    }
}
