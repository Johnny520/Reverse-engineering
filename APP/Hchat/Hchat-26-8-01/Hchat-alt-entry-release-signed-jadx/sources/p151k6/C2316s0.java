package p151k6;

import p105h6.AbstractC1622n;
import p105h6.C1612d;
import p105h6.C1614f;
import p105h6.InterfaceC1623o;
import p194n6.C2901a;

/* JADX INFO: renamed from: k6.s0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2316s0 implements InterfaceC1623o {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7637g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Class f7638h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AbstractC1622n f7639i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2316s0(Class cls, AbstractC1622n abstractC1622n, int i9) {
        this.f7637g = i9;
        this.f7638h = cls;
        this.f7639i = abstractC1622n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.InterfaceC1623o
    /* JADX INFO: renamed from: a */
    public final AbstractC1622n mo4137a(C1614f c1614f, C2901a c2901a) {
        switch (this.f7637g) {
            case 0:
                if (c2901a.f9368a == this.f7638h) {
                    return this.f7639i;
                }
                return null;
            default:
                if (this.f7638h.isAssignableFrom(c2901a.f9368a)) {
                    return new C1612d(this, 2);
                }
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        switch (this.f7637g) {
            case 0:
                return "Factory[type=" + this.f7638h.getName() + ",adapter=" + this.f7639i + "]";
            default:
                return "Factory[typeHierarchy=" + this.f7638h.getName() + ",adapter=" + this.f7639i + "]";
        }
    }
}
