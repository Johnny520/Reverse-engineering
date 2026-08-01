package p230r2;

import p213o2.AbstractC2770B;
import p213o2.C2785n;
import p213o2.InterfaceC2771C;
import p252v2.C3352a;

/* JADX INFO: renamed from: r2.S */
/* JADX INFO: loaded from: classes.dex */
public final class C3114S implements InterfaceC2771C {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f9822d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Class f9823e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC2770B f9824f;

    public /* synthetic */ C3114S(Class cls, AbstractC2770B abstractC2770B, int i5) {
        this.f9822d = i5;
        this.f9823e = cls;
        this.f9824f = abstractC2770B;
    }

    @Override // p213o2.InterfaceC2771C
    /* JADX INFO: renamed from: a */
    public final AbstractC2770B mo4967a(C2785n c2785n, C3352a c3352a) {
        switch (this.f9822d) {
            case 0:
                if (c3352a.f10417a == this.f9823e) {
                    return this.f9824f;
                }
                return null;
            default:
                Class<?> cls = c3352a.f10417a;
                if (this.f9823e.isAssignableFrom(cls)) {
                    return new C3126c(this, cls);
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.f9822d) {
            case 0:
                return "Factory[type=" + this.f9823e.getName() + ",adapter=" + this.f9824f + "]";
            default:
                return "Factory[typeHierarchy=" + this.f9823e.getName() + ",adapter=" + this.f9824f + "]";
        }
    }
}
