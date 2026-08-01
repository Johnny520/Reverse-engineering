package p265s1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import p215oc.C5725t;

/* JADX INFO: renamed from: s1.s0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7137s0 implements InterfaceC7158w2 {

    /* JADX INFO: renamed from: a */
    public final PathMeasure f23668a;

    public C7137s0(PathMeasure pathMeasure) {
        this.f23668a = pathMeasure;
    }

    @Override // p265s1.InterfaceC7158w2
    /* JADX INFO: renamed from: a */
    public void mo28195a(InterfaceC7144t2 interfaceC7144t2, boolean z10) {
        Path pathM28188v;
        PathMeasure pathMeasure = this.f23668a;
        if (interfaceC7144t2 == null) {
            pathM28188v = null;
        } else {
            if (!(interfaceC7144t2 instanceof C7132r0)) {
                C5725t.m23179a("Unable to obtain android.graphics.Path");
                return;
            }
            pathM28188v = ((C7132r0) interfaceC7144t2).m28188v();
        }
        pathMeasure.setPath(pathM28188v, z10);
    }

    @Override // p265s1.InterfaceC7158w2
    /* JADX INFO: renamed from: b */
    public boolean mo28196b(float f10, float f11, InterfaceC7144t2 interfaceC7144t2, boolean z10) {
        PathMeasure pathMeasure = this.f23668a;
        if (interfaceC7144t2 instanceof C7132r0) {
            return pathMeasure.getSegment(f10, f11, ((C7132r0) interfaceC7144t2).m28188v(), z10);
        }
        C5725t.m23179a("Unable to obtain android.graphics.Path");
        return false;
    }

    @Override // p265s1.InterfaceC7158w2
    public float getLength() {
        return this.f23668a.getLength();
    }
}
