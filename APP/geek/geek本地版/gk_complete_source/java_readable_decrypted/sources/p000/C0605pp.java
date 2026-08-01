package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: pp */
/* JADX INFO: loaded from: classes.dex */
public class C0605pp extends C0864wp {

    /* JADX INFO: renamed from: c */
    public final boolean f3920c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0605pp() {
        super(true);
        boolean z = true;
        m2578A(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0864wp.f5001b;
        InterfaceC0144da interfaceC0144da = (InterfaceC0144da) atomicReferenceFieldUpdater.get(this);
        C0180ea c0180ea = interfaceC0144da instanceof C0180ea ? (C0180ea) interfaceC0144da : null;
        if (c0180ea == null) {
            z = false;
            break;
        }
        C0864wp c0864wpM2336k = c0180ea.m2336k();
        while (!c0864wpM2336k.mo2127u()) {
            InterfaceC0144da interfaceC0144da2 = (InterfaceC0144da) atomicReferenceFieldUpdater.get(c0864wpM2336k);
            C0180ea c0180ea2 = interfaceC0144da2 instanceof C0180ea ? (C0180ea) interfaceC0144da2 : null;
            if (c0180ea2 == null) {
                z = false;
                break;
            }
            c0864wpM2336k = c0180ea2.m2336k();
        }
        this.f3920c = z;
    }

    @Override // p000.C0864wp
    /* JADX INFO: renamed from: u */
    public final boolean mo2127u() {
        return this.f3920c;
    }

    @Override // p000.C0864wp
    /* JADX INFO: renamed from: v */
    public final boolean mo2128v() {
        return true;
    }
}
