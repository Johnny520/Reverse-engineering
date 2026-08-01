package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC0482q {

    /* JADX INFO: renamed from: a */
    public final C0456H f1504a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SavedStateHandleAttacher(C0456H c0456h) {
        this.f1504a = c0456h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0482q
    /* JADX INFO: renamed from: c */
    public final void mo391c(InterfaceC0484s interfaceC0484s, EnumC0478m enumC0478m) {
        if (enumC0478m == EnumC0478m.ON_CREATE) {
            interfaceC0484s.mo636c().m932f(this);
            this.f1504a.m913b();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0478m).toString());
        }
    }
}
