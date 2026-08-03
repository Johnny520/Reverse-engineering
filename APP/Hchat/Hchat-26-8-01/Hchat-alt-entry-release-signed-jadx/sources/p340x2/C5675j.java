package p340x2;

import gg.AbstractC1417m;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p276sf.C3967n;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: x2.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5675j extends AbstractC1417m implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC1231l f23106g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC5853o f23107h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1231l f23108i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f23109j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f23110k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5675j(InterfaceC1231l interfaceC1231l, InterfaceC5853o interfaceC5853o, InterfaceC1231l interfaceC1231l2, int i9, int i10) {
        super(2);
        this.f23106g = interfaceC1231l;
        this.f23107h = interfaceC5853o;
        this.f23108i = interfaceC1231l2;
        this.f23109j = i9;
        this.f23110k = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC5674i.m10235b(this.f23106g, this.f23107h, this.f23108i, (C1836h0) obj, AbstractC1874r.m4617C(this.f23109j | 1), this.f23110k);
        return C3967n.f12976a;
    }
}
