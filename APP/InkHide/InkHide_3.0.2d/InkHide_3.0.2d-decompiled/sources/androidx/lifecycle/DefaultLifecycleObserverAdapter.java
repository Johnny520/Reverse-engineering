package androidx.lifecycle;

import p027N0.AbstractC0223g;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC0482q {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0470e f1466a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0482q f1467b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DefaultLifecycleObserverAdapter(InterfaceC0470e interfaceC0470e, InterfaceC0482q interfaceC0482q) {
        AbstractC0223g.m418e(interfaceC0470e, "defaultLifecycleObserver");
        this.f1466a = interfaceC0470e;
        this.f1467b = interfaceC0482q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0482q
    /* JADX INFO: renamed from: c */
    public final void mo391c(InterfaceC0484s interfaceC0484s, EnumC0478m enumC0478m) {
        int i2 = AbstractC0471f.f1515a[enumC0478m.ordinal()];
        InterfaceC0470e interfaceC0470e = this.f1466a;
        switch (i2) {
            case 1:
                interfaceC0470e.getClass();
                break;
            case 2:
                interfaceC0470e.getClass();
                break;
            case 3:
                interfaceC0470e.mo736a(interfaceC0484s);
                break;
            case 4:
                interfaceC0470e.getClass();
                break;
            case 5:
                interfaceC0470e.getClass();
                break;
            case 6:
                interfaceC0470e.mo924b(interfaceC0484s);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0482q interfaceC0482q = this.f1467b;
        if (interfaceC0482q != null) {
            interfaceC0482q.mo391c(interfaceC0484s, enumC0478m);
        }
    }
}
