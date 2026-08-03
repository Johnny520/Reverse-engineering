package p151k6;

import p105h6.AbstractC1622n;
import p105h6.C1614f;
import p105h6.InterfaceC1623o;
import p194n6.C2901a;

/* JADX INFO: renamed from: k6.u0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2320u0 implements InterfaceC1623o {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Class f7642g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Class f7643h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AbstractC1622n f7644i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2320u0(Class cls, Class cls2, AbstractC1622n abstractC1622n) {
        this.f7642g = cls;
        this.f7643h = cls2;
        this.f7644i = abstractC1622n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.InterfaceC1623o
    /* JADX INFO: renamed from: a */
    public final AbstractC1622n mo4137a(C1614f c1614f, C2901a c2901a) {
        Class cls = c2901a.f9368a;
        if (cls == this.f7642g || cls == this.f7643h) {
            return this.f7644i;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Factory[type=" + this.f7643h.getName() + "+" + this.f7642g.getName() + ",adapter=" + this.f7644i + "]";
    }
}
