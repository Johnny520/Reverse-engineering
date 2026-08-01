package p207n3;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p074O2.InterfaceC1051i;
import p190k3.AbstractC2470r;

/* JADX INFO: renamed from: n3.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2701i extends AbstractC2470r {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AtomicReferenceArray f8614e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2701i(long j5, C2701i c2701i, int i5) {
        super(j5, c2701i, i5);
        this.f8614e = new AtomicReferenceArray(AbstractC2700h.f8613f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190k3.AbstractC2470r
    /* JADX INFO: renamed from: f */
    public final int mo4102f() {
        return AbstractC2700h.f8613f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190k3.AbstractC2470r
    /* JADX INFO: renamed from: g */
    public final void mo4103g(int i5, InterfaceC1051i interfaceC1051i) {
        this.f8614e.set(i5, AbstractC2700h.f8612e);
        m4406h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SemaphoreSegment[id=" + this.f7958c + ", hashCode=" + hashCode() + ']';
    }
}
