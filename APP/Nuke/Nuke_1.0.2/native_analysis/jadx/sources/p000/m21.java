package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class m21 extends r21 {

    /* JADX INFO: renamed from: j */
    public final boolean f6445j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m21(k21 k21Var) {
        super(true);
        boolean z = true;
        m4315Q(k21Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r21.f9331i;
        InterfaceC0472ms interfaceC0472ms = (InterfaceC0472ms) atomicReferenceFieldUpdater.get(this);
        C0511ns c0511ns = interfaceC0472ms instanceof C0511ns ? (C0511ns) interfaceC0472ms : null;
        if (c0511ns == null) {
            z = false;
            break;
        }
        r21 r21VarM3225j = c0511ns.m3225j();
        while (!r21VarM3225j.mo3027L()) {
            InterfaceC0472ms interfaceC0472ms2 = (InterfaceC0472ms) atomicReferenceFieldUpdater.get(r21VarM3225j);
            C0511ns c0511ns2 = interfaceC0472ms2 instanceof C0511ns ? (C0511ns) interfaceC0472ms2 : null;
            if (c0511ns2 == null) {
                z = false;
                break;
            }
            r21VarM3225j = c0511ns2.m3225j();
        }
        this.f6445j = z;
    }

    @Override // p000.r21
    /* JADX INFO: renamed from: L */
    public final boolean mo3027L() {
        return this.f6445j;
    }

    @Override // p000.r21
    /* JADX INFO: renamed from: M */
    public final boolean mo3028M() {
        return true;
    }
}
