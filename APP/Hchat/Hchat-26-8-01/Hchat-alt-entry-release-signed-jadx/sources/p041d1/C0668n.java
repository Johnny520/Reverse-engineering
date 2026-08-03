package p041d1;

import gg.AbstractC1417m;
import gg.C1425u;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: d1.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0668n extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1425u f2050g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2051h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0668n(C1425u c1425u, int i9) {
        super(1);
        this.f2050g = c1425u;
        this.f2051h = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        Boolean boolValueOf = Boolean.valueOf(((C0653b0) obj).m1805r1(this.f2051h));
        this.f2050g.f4738g = boolValueOf;
        return boolValueOf;
    }
}
