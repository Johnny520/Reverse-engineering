package androidx.lifecycle;

import p024M.C0190d;
import p027N0.AbstractC0223g;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC0482q {

    /* JADX INFO: renamed from: a */
    public final String f1505a;

    /* JADX INFO: renamed from: b */
    public final C0454F f1506b;

    /* JADX INFO: renamed from: c */
    public boolean f1507c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SavedStateHandleController(String str, C0454F c0454f) {
        this.f1505a = str;
        this.f1506b = c0454f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0482q
    /* JADX INFO: renamed from: c */
    public final void mo391c(InterfaceC0484s interfaceC0484s, EnumC0478m enumC0478m) {
        if (enumC0478m == EnumC0478m.ON_DESTROY) {
            this.f1507c = false;
            interfaceC0484s.mo636c().m932f(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m920d(C0190d c0190d, C0486u c0486u) {
        AbstractC0223g.m418e(c0190d, "registry");
        AbstractC0223g.m418e(c0486u, "lifecycle");
        if (this.f1507c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f1507c = true;
        c0486u.m927a(this);
        c0190d.m398f(this.f1505a, this.f1506b.f1475e);
    }
}
