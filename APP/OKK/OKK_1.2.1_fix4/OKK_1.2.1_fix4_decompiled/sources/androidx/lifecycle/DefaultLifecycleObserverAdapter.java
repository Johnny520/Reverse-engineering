package androidx.lifecycle;

import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC0539p {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0527d f1459a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0539p f1460b;

    public DefaultLifecycleObserverAdapter(InterfaceC0527d interfaceC0527d, InterfaceC0539p interfaceC0539p) {
        AbstractC0307g.m703e(interfaceC0527d, "defaultLifecycleObserver");
        this.f1459a = interfaceC0527d;
        this.f1460b = interfaceC0539p;
    }

    @Override // androidx.lifecycle.InterfaceC0539p
    /* JADX INFO: renamed from: b */
    public final void mo981b(InterfaceC0541r interfaceC0541r, EnumC0535l enumC0535l) {
        int i2 = AbstractC0528e.f1480a[enumC0535l.ordinal()];
        InterfaceC0527d interfaceC0527d = this.f1459a;
        switch (i2) {
            case 1:
                interfaceC0527d.getClass();
                break;
            case 2:
                interfaceC0527d.getClass();
                break;
            case 3:
                interfaceC0527d.mo1196a();
                break;
            case 4:
                interfaceC0527d.getClass();
                break;
            case 5:
                interfaceC0527d.getClass();
                break;
            case 6:
                interfaceC0527d.getClass();
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0539p interfaceC0539p = this.f1460b;
        if (interfaceC0539p != null) {
            interfaceC0539p.mo981b(interfaceC0541r, enumC0535l);
        }
    }
}
