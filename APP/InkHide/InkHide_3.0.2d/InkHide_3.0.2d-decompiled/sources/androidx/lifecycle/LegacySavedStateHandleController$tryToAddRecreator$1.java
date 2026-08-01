package androidx.lifecycle;

import p024M.C0190d;

/* JADX INFO: loaded from: classes.dex */
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements InterfaceC0482q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0486u f1494a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0190d f1495b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LegacySavedStateHandleController$tryToAddRecreator$1(C0190d c0190d, C0486u c0486u) {
        this.f1494a = c0486u;
        this.f1495b = c0190d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0482q
    /* JADX INFO: renamed from: c */
    public final void mo391c(InterfaceC0484s interfaceC0484s, EnumC0478m enumC0478m) {
        if (enumC0478m == EnumC0478m.ON_START) {
            this.f1494a.m932f(this);
            this.f1495b.m399g();
        }
    }
}
