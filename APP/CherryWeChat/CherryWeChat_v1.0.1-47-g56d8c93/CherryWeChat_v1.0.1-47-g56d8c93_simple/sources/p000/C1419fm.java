package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: fm */
/* JADX INFO: loaded from: classes.dex */
public class C1419fm extends C2152km {

    /* JADX INFO: renamed from: c */
    public final boolean f5013c;

    public C1419fm() {
        boolean r0 = true;
        super(true);
        m4344B(null);
        AtomicReferenceFieldUpdater r2 = C2152km.f7530b;
        InterfaceC1487h9 r3 = (InterfaceC1487h9) r2.get(this);
        if ((r3 instanceof C1531i9) == false) goto L5;
        C1531i9 r32 = (C1531i9) r3;
    L7:
        if (r32 == null) goto L27;
        C2152km r33 = r32.f5343d;
        if (r33 != null) goto L12;
        r33 = null;
    L12:
        if (r33 == null) goto L27;
    L15:
        if (r33.mo2730w() == true) goto L28;
        InterfaceC1487h9 r34 = (InterfaceC1487h9) r2.get(r33);
        if ((r34 instanceof C1531i9) == false) goto L20;
        C1531i9 r35 = (C1531i9) r34;
    L21:
        if (r35 == null) goto L27;
        r33 = r35.f5343d;
        if (r33 != null) goto L26;
        r33 = null;
    L26:
        if (r33 != null) goto L15;
    L20:
        r35 = null;
    L28:
        this.f5013c = r0;
        return;
    L27:
        r0 = false;
        goto L28
    L5:
        r32 = null;
        goto L7
    }

    @Override // p000.C2152km
    /* JADX INFO: renamed from: w */
    public final boolean mo2730w() {
        return this.f5013c;
    }

    @Override // p000.C2152km
    /* JADX INFO: renamed from: x */
    public final boolean mo2731x() {
        return true;
    }
}
