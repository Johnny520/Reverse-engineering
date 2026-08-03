package androidx.lifecycle;

import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC0539p {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0527d f1459a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0539p f1460b;

    public DefaultLifecycleObserverAdapter(InterfaceC0527d r2, InterfaceC0539p r3) {
        AbstractC0307g.m703e(r2, "defaultLifecycleObserver");
        this.f1459a = r2;
        this.f1460b = r3;
    }

    @Override // androidx.lifecycle.InterfaceC0539p
    /* JADX INFO: renamed from: b */
    public final void mo981b(InterfaceC0541r r3, EnumC0535l r4) {
        int r02 = AbstractC0528e.f1480a[r4.ordinal()];
        InterfaceC0527d r1 = this.f1459a;
        switch(r02) {
            case 1: goto L12;
            case 2: goto L11;
            case 3: goto L10;
            case 4: goto L9;
            case 5: goto L8;
            case 6: goto L7;
            case 7: goto L6;
            default: goto L13;
        };
    L7:
        r1.getClass();
        goto L13
    L8:
        r1.getClass();
        goto L13
    L9:
        r1.getClass();
        goto L13
    L10:
        r1.mo1196a();
        goto L13
    L11:
        r1.getClass();
        goto L13
    L12:
        r1.getClass();
    L13:
        InterfaceC0539p r03 = this.f1460b;
        if (r03 == null) goto L17;
        r03.mo981b(r3, r4);
        return;
    L17:
        return;
    L6:
        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
    }
}
