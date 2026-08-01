package p230r2;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import p213o2.AbstractC2770B;
import p213o2.C2789r;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: r2.a0 */
/* JADX INFO: loaded from: classes.dex */
public class C3123a0 extends AbstractC2770B {
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) {
        try {
            return new AtomicInteger(c3390a.m5622A());
        } catch (NumberFormatException e5) {
            throw new C2789r(e5);
        }
    }

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        c3391b.m5653C(((AtomicInteger) obj).get());
    }
}
