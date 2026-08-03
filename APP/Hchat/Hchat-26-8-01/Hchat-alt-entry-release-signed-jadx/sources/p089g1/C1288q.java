package p089g1;

import gg.AbstractC1417m;
import p085fg.InterfaceC1231l;
import p259r9.AbstractC3754e0;

/* JADX INFO: renamed from: g1.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1288q extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4285g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1289r f4286h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1288q(C1289r c1289r, int i9) {
        super(1);
        this.f4285g = i9;
        this.f4286h = c1289r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f4285g) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f4286h.f4298n.mo469c(AbstractC3754e0.m7905p(dDoubleValue, r10.f4289e, r10.f4290f)));
            default:
                return Double.valueOf(AbstractC3754e0.m7905p(this.f4286h.f4295k.mo469c(((Number) obj).doubleValue()), r10.f4289e, r10.f4290f));
        }
    }
}
