package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class m01 extends nz0 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AtomicReferenceArray f3776g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m01(long j, m01 m01Var, int i) {
        super(j, m01Var, i);
        this.f3776g = new AtomicReferenceArray(l01.f3305f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.nz0
    /* JADX INFO: renamed from: k */
    public final int mo2402k() {
        return l01.f3305f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.nz0
    /* JADX INFO: renamed from: l */
    public final void mo2403l(int i, InterfaceC0618pk interfaceC0618pk) {
        this.f3776g.set(i, l01.f3304e);
        m2746m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SemaphoreSegment[id=" + this.f4374e + ", hashCode=" + hashCode() + ']';
    }
}
