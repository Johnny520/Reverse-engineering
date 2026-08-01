package p213o2;

import java.io.IOException;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: o2.A */
/* JADX INFO: loaded from: classes.dex */
public final class C2769A extends AbstractC2770B {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC2770B f8780a;

    public C2769A(AbstractC2770B abstractC2770B) {
        this.f8780a = abstractC2770B;
    }

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) {
        if (c3390a.m5630J() != 9) {
            return this.f8780a.mo4964b(c3390a);
        }
        c3390a.m5626F();
        return null;
    }

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        if (obj == null) {
            c3391b.m5666n();
        } else {
            this.f8780a.mo4965c(c3391b, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f8780a + "]";
    }
}
