package p150k5;

import java.util.Iterator;
import p207o5.AbstractC3050e;
import p207o5.AbstractC3058m;
import p207o5.C3057l;
import p207o5.InterfaceC3048c;

/* JADX INFO: renamed from: k5.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2255g implements Iterable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC3050e f7473g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7474h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f7475i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Iterator f7476j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f7477k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C2264o f7478l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2255g(C2264o c2264o, AbstractC3050e abstractC3050e, int i9, int i10, C2261l c2261l, boolean z9) {
        this.f7478l = c2264o;
        this.f7473g = abstractC3050e;
        this.f7474h = i9;
        this.f7475i = i10;
        this.f7476j = c2261l;
        this.f7477k = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC3048c interfaceC3048cMo6490c = this.f7473g.mo6490c();
        C2270u c2270u = this.f7478l.f7511j;
        int i9 = this.f7474h;
        return new C2253f(this, c2270u.f7532b, this.f7475i, i9 == 0 ? AbstractC3058m.f9893a : new C3057l(c2270u, i9), interfaceC3048cMo6490c);
    }
}
