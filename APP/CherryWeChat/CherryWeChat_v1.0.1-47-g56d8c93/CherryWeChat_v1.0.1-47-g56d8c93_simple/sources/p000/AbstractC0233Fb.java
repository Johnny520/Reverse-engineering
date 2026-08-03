package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0233Fb extends AbstractC2571u5 {

    /* JADX INFO: renamed from: b */
    public final InterfaceC1137ac f731b;

    /* JADX INFO: renamed from: c */
    public transient InterfaceC0190Eb f732c;

    public AbstractC0233Fb(InterfaceC0190Eb r1, InterfaceC1137ac r2) {
        super(r1);
        this.f731b = r2;
    }

    @Override // p000.InterfaceC0190Eb
    /* JADX INFO: renamed from: e */
    public final InterfaceC1137ac mo263e() {
        return this.f731b;
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: j */
    public final void mo472j() {
        InterfaceC0190Eb r0 = this.f732c;
        if (r0 == null) goto L17;
        if (r0 == this) goto L17;
        ((AbstractC1217bc) this.f731b.mo24m(C1456gf.f5158b)).getClass();
        C1367ee r02 = (C1367ee) r0;
        AtomicReferenceFieldUpdater r1 = C1367ee.f4893h;
    L7:
        if (r1.get(r02) == AbstractC1406fG.f4984c) goto L7;
        Object r03 = r1.get(r02);
        if ((r03 instanceof C0523M6) == false) goto L11;
        C0523M6 r04 = (C0523M6) r03;
    L12:
        if (r04 == null) goto L17;
        AtomicReferenceFieldUpdater r12 = C0523M6.f1709h;
        InterfaceC2100je r2 = (InterfaceC2100je) r12.get(r04);
        if (r2 == null) goto L17;
        r2.mo1795a();
        r12.set(r04, C0937Vs.f2926a);
        goto L17
    L11:
        r04 = null;
    L17:
        this.f732c = C0146Da.f377a;
    }

    public AbstractC0233Fb(InterfaceC0190Eb r2) {
        if (r2 == null) goto L4;
        InterfaceC1137ac r0 = r2.mo263e();
    L5:
        this(r2, r0);
        return;
    L4:
        r0 = null;
        goto L5
    }
}
