package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: tp */
/* JADX INFO: loaded from: classes.dex */
public class C0752tp extends C0040aq {

    /* JADX INFO: renamed from: c */
    public final boolean f4570c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0752tp() {
        super(true);
        boolean z = true;
        m438A(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0040aq.f617b;
        InterfaceC0441la interfaceC0441la = (InterfaceC0441la) atomicReferenceFieldUpdater.get(this);
        C0478ma c0478ma = interfaceC0441la instanceof C0478ma ? (C0478ma) interfaceC0441la : null;
        if (c0478ma == null) {
            z = false;
            break;
        }
        C0040aq c0040aqM2618k = c0478ma.m2618k();
        while (!c0040aqM2618k.mo462u()) {
            InterfaceC0441la interfaceC0441la2 = (InterfaceC0441la) atomicReferenceFieldUpdater.get(c0040aqM2618k);
            C0478ma c0478ma2 = interfaceC0441la2 instanceof C0478ma ? (C0478ma) interfaceC0441la2 : null;
            if (c0478ma2 == null) {
                z = false;
                break;
            }
            c0040aqM2618k = c0478ma2.m2618k();
        }
        this.f4570c = z;
    }

    @Override // p000.C0040aq
    /* JADX INFO: renamed from: u */
    public final boolean mo462u() {
        return this.f4570c;
    }

    @Override // p000.C0040aq
    /* JADX INFO: renamed from: v */
    public final boolean mo463v() {
        return true;
    }
}
