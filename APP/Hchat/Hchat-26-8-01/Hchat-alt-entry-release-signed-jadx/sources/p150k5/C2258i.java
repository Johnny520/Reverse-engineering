package p150k5;

import java.util.Iterator;
import p207o5.AbstractC3050e;
import p207o5.AbstractC3064s;

/* JADX INFO: renamed from: k5.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2258i implements Iterable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7487g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC3050e f7488h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f7489i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Iterator f7490j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f7491k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C2264o f7492l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2258i(C2264o c2264o, AbstractC3050e abstractC3050e, int i9, AbstractC3064s abstractC3064s, boolean z9, int i10) {
        this.f7487g = i10;
        this.f7492l = c2264o;
        this.f7488h = abstractC3050e;
        this.f7489i = i9;
        this.f7490j = abstractC3064s;
        this.f7491k = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f7487g) {
            case 0:
                return new C2257h(this, this.f7492l.f7511j.f7532b, this.f7489i, this.f7488h.mo6490c());
            default:
                AbstractC3050e abstractC3050e = this.f7488h;
                return new C2253f(this, this.f7492l.f7511j.f7532b, this.f7489i, abstractC3050e.mo6491d(), abstractC3050e.mo6492e());
        }
    }
}
