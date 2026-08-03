package p308v1;

import gg.AbstractC1417m;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;
import p340x2.AbstractC5674i;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: v1.g1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4392g1 extends AbstractC1417m implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f14629g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC5853o f14630h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f14631i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f14632j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC3955b f14633k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4392g1(Object obj, InterfaceC5853o interfaceC5853o, InterfaceC3955b interfaceC3955b, int i9, int i10) {
        super(2);
        this.f14629g = i10;
        this.f14632j = obj;
        this.f14630h = interfaceC5853o;
        this.f14633k = interfaceC3955b;
        this.f14631i = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        int i9 = this.f14629g;
        C1836h0 c1836h0 = (C1836h0) obj;
        ((Number) obj2).intValue();
        switch (i9) {
            case 0:
                AbstractC4434w.m8877a((C4401j1) this.f14632j, this.f14630h, (InterfaceC1235p) this.f14633k, c1836h0, AbstractC1874r.m4617C(this.f14631i | 1));
                break;
            default:
                AbstractC5674i.m10234a((InterfaceC1231l) this.f14632j, this.f14630h, (InterfaceC1231l) this.f14633k, c1836h0, AbstractC1874r.m4617C(this.f14631i | 1));
                break;
        }
        return C3967n.f12976a;
    }
}
