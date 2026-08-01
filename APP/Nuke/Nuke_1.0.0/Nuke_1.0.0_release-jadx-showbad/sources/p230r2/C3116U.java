package p230r2;

import p213o2.AbstractC2770B;
import p213o2.C2785n;
import p213o2.InterfaceC2771C;
import p252v2.C3352a;

/* JADX INFO: renamed from: r2.U */
/* JADX INFO: loaded from: classes.dex */
public final class C3116U implements InterfaceC2771C {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Class f9825d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Class f9826e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC2770B f9827f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3116U(Class cls, Class cls2, AbstractC2770B abstractC2770B) {
        this.f9825d = cls;
        this.f9826e = cls2;
        this.f9827f = abstractC2770B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.InterfaceC2771C
    /* JADX INFO: renamed from: a */
    public final AbstractC2770B mo4967a(C2785n c2785n, C3352a c3352a) {
        Class cls = c3352a.f10417a;
        if (cls == this.f9825d || cls == this.f9826e) {
            return this.f9827f;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Factory[type=" + this.f9826e.getName() + "+" + this.f9825d.getName() + ",adapter=" + this.f9827f + "]";
    }
}
