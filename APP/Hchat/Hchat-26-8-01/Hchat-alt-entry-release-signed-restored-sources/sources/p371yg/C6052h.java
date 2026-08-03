package p371yg;

import java.util.concurrent.atomic.AtomicReferenceArray;
import vg.AbstractC4568q;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: yg.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6052h extends AbstractC4568q {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AtomicReferenceArray f24516e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6052h(long j3, C6052h c6052h, int i9) {
        super(j3, c6052h, i9);
        this.f24516e = new AtomicReferenceArray(AbstractC6051g.f24515f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // vg.AbstractC4568q
    /* JADX INFO: renamed from: f */
    public final int mo8219f() {
        return AbstractC6051g.f24515f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // vg.AbstractC4568q
    /* JADX INFO: renamed from: g */
    public final void mo8220g(int i9, InterfaceC5561g interfaceC5561g) {
        this.f24516e.set(i9, AbstractC6051g.f24514e);
        m9015h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SemaphoreSegment[id=" + this.f15053c + ", hashCode=" + hashCode() + ']';
    }
}
