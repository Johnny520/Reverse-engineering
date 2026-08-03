package p150k5;

import java.util.Iterator;
import p207o5.AbstractC3050e;
import p207o5.InterfaceC3048c;

/* JADX INFO: renamed from: k5.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2260k implements Iterable {

    /* JADX INFO: renamed from: g */
    public final InterfaceC3048c f7497g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC3048c f7498h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f7499i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Iterator f7500j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f7501k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C2264o f7502l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2260k(C2264o c2264o, AbstractC3050e abstractC3050e, int i9, C2262m c2262m, boolean z9) {
        this.f7502l = c2264o;
        this.f7499i = i9;
        this.f7500j = c2262m;
        this.f7501k = z9;
        this.f7497g = abstractC3050e.mo6491d();
        this.f7498h = abstractC3050e.mo6492e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2259j(this, this.f7502l.f7511j.f7532b, this.f7499i);
    }
}
