package nc;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p145jc.AbstractC3795a0;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: nc.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5572k extends AbstractC3795a0 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AtomicReferenceArray f17450e;

    public C5572k(long j10, C5572k c5572k, int i10) {
        super(j10, c5572k, i10);
        this.f17450e = new AtomicReferenceArray(AbstractC5571j.f17449f);
    }

    @Override // p145jc.AbstractC3795a0
    /* JADX INFO: renamed from: r */
    public int mo9856r() {
        return AbstractC5571j.f17449f;
    }

    @Override // p145jc.AbstractC3795a0
    /* JADX INFO: renamed from: s */
    public void mo9857s(int i10, Throwable th, InterfaceC5980j interfaceC5980j) {
        m22654v().set(i10, AbstractC5571j.f17448e);
        m15129t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f10969c + ", hashCode=" + hashCode() + ']';
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ AtomicReferenceArray m22654v() {
        return this.f17450e;
    }
}
