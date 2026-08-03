package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: fm */
/* JADX INFO: loaded from: classes.dex */
public class C1419fm extends C2152km {

    /* JADX INFO: renamed from: c */
    public final boolean f5013c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1419fm() {
        super(true);
        boolean z = true;
        m4344B(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2152km.f7530b;
        InterfaceC1487h9 interfaceC1487h9 = (InterfaceC1487h9) atomicReferenceFieldUpdater.get(this);
        C1531i9 c1531i9 = interfaceC1487h9 instanceof C1531i9 ? (C1531i9) interfaceC1487h9 : null;
        if (c1531i9 == null) {
            z = false;
            break;
        }
        C2152km c2152km = c1531i9.f5343d;
        c2152km = c2152km == null ? null : c2152km;
        if (c2152km != null) {
            while (!c2152km.mo2730w()) {
                InterfaceC1487h9 interfaceC1487h92 = (InterfaceC1487h9) atomicReferenceFieldUpdater.get(c2152km);
                C1531i9 c1531i92 = interfaceC1487h92 instanceof C1531i9 ? (C1531i9) interfaceC1487h92 : null;
                if (c1531i92 != null) {
                    c2152km = c1531i92.f5343d;
                    if (c2152km == null) {
                        c2152km = null;
                    }
                    if (c2152km == null) {
                    }
                }
                z = false;
            }
        }
        this.f5013c = z;
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
