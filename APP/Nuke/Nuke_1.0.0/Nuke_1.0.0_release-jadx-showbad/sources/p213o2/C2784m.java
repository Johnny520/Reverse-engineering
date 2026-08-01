package p213o2;

import p230r2.AbstractC3148x;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: o2.m */
/* JADX INFO: loaded from: classes.dex */
public class C2784m extends AbstractC3148x {

    /* JADX INFO: renamed from: a */
    public AbstractC2770B f8790a = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) {
        AbstractC2770B abstractC2770B = this.f8790a;
        if (abstractC2770B != null) {
            return abstractC2770B.mo4964b(c3390a);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) {
        AbstractC2770B abstractC2770B = this.f8790a;
        if (abstractC2770B == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        abstractC2770B.mo4965c(c3391b, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p230r2.AbstractC3148x
    /* JADX INFO: renamed from: d */
    public final AbstractC2770B mo4971d() {
        AbstractC2770B abstractC2770B = this.f8790a;
        if (abstractC2770B != null) {
            return abstractC2770B;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
