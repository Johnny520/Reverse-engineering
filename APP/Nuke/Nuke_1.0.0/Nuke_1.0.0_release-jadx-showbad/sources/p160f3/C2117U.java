package p160f3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: f3.U */
/* JADX INFO: loaded from: classes.dex */
public class C2117U extends C2122Z {

    /* JADX INFO: renamed from: f */
    public final boolean f7051f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2117U(InterfaceC2115S interfaceC2115S) {
        super(true);
        boolean z5 = true;
        m3932O(interfaceC2115S);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2122Z.f7063e;
        InterfaceC2141j interfaceC2141j = (InterfaceC2141j) atomicReferenceFieldUpdater.get(this);
        C2143k c2143k = interfaceC2141j instanceof C2143k ? (C2143k) interfaceC2141j : null;
        if (c2143k == null) {
            z5 = false;
            break;
        }
        C2122Z c2122zM3913j = c2143k.m3913j();
        while (!c2122zM3913j.mo3911J()) {
            InterfaceC2141j interfaceC2141j2 = (InterfaceC2141j) atomicReferenceFieldUpdater.get(c2122zM3913j);
            C2143k c2143k2 = interfaceC2141j2 instanceof C2143k ? (C2143k) interfaceC2141j2 : null;
            if (c2143k2 == null) {
                z5 = false;
                break;
            }
            c2122zM3913j = c2143k2.m3913j();
        }
        this.f7051f = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.C2122Z
    /* JADX INFO: renamed from: J */
    public final boolean mo3911J() {
        return this.f7051f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.C2122Z
    /* JADX INFO: renamed from: K */
    public final boolean mo3912K() {
        return true;
    }
}
