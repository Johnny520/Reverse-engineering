package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class go2 extends lm2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AtomicReferenceArray f3643e;

    public go2(long j, go2 go2Var, int i) {
        super(j, go2Var, i);
        this.f3643e = new AtomicReferenceArray(fo2.f3085f);
    }

    @Override // p000.lm2
    /* JADX INFO: renamed from: g */
    public final int mo2006g() {
        return fo2.f3085f;
    }

    @Override // p000.lm2
    /* JADX INFO: renamed from: h */
    public final void mo2007h(int i, a20 a20Var) {
        this.f3643e.set(i, fo2.f3084e);
        m2945i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f6198c + ", hashCode=" + hashCode() + ']';
    }
}
