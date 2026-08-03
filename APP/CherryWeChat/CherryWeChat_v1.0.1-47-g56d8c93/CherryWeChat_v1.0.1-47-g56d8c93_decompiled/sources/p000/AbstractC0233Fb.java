package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0233Fb extends AbstractC2571u5 {

    /* JADX INFO: renamed from: b */
    public final InterfaceC1137ac f731b;

    /* JADX INFO: renamed from: c */
    public transient InterfaceC0190Eb f732c;

    public AbstractC0233Fb(InterfaceC0190Eb interfaceC0190Eb, InterfaceC1137ac interfaceC1137ac) {
        super(interfaceC0190Eb);
        this.f731b = interfaceC1137ac;
    }

    @Override // p000.InterfaceC0190Eb
    /* JADX INFO: renamed from: e */
    public final InterfaceC1137ac mo263e() {
        return this.f731b;
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: j */
    public final void mo472j() {
        InterfaceC0190Eb interfaceC0190Eb = this.f732c;
        if (interfaceC0190Eb != null && interfaceC0190Eb != this) {
            ((AbstractC1217bc) this.f731b.mo24m(C1456gf.f5158b)).getClass();
            C1367ee c1367ee = (C1367ee) interfaceC0190Eb;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1367ee.f4893h;
            while (atomicReferenceFieldUpdater.get(c1367ee) == AbstractC1406fG.f4984c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(c1367ee);
            C0523M6 c0523m6 = obj instanceof C0523M6 ? (C0523M6) obj : null;
            if (c0523m6 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0523M6.f1709h;
                InterfaceC2100je interfaceC2100je = (InterfaceC2100je) atomicReferenceFieldUpdater2.get(c0523m6);
                if (interfaceC2100je != null) {
                    interfaceC2100je.mo1795a();
                    atomicReferenceFieldUpdater2.set(c0523m6, C0937Vs.f2926a);
                }
            }
        }
        this.f732c = C0146Da.f377a;
    }

    public AbstractC0233Fb(InterfaceC0190Eb interfaceC0190Eb) {
        this(interfaceC0190Eb, interfaceC0190Eb != null ? interfaceC0190Eb.mo263e() : null);
    }
}
