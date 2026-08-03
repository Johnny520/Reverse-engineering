package p358y2;

import gg.AbstractC1417m;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p276sf.C3967n;
import p343x6.AbstractC5700d;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: y2.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5971f extends AbstractC1417m implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC5853o f24267g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1235p f24268h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f24269i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5971f(InterfaceC5853o interfaceC5853o, InterfaceC1235p interfaceC1235p, int i9) {
        super(2);
        this.f24267g = interfaceC5853o;
        this.f24268h = interfaceC1235p;
        this.f24269i = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM4617C = AbstractC1874r.m4617C(this.f24269i | 1);
        AbstractC5700d.m10276f(this.f24267g, this.f24268h, (C1836h0) obj, iM4617C);
        return C3967n.f12976a;
    }
}
