package p222p;

import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p276sf.C3967n;
import p321w.AbstractC4583b;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: p.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3235m implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f10319g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC5853o f10320h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f10321i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3235m(InterfaceC5853o interfaceC5853o, int i9) {
        this.f10320h = interfaceC5853o;
        this.f10321i = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        int i9 = this.f10319g;
        C1836h0 c1836h0 = (C1836h0) obj;
        ((Integer) obj2).getClass();
        switch (i9) {
            case 0:
                AbstractC3241o.m6927a(this.f10320h, c1836h0, AbstractC1874r.m4617C(this.f10321i | 1));
                break;
            default:
                AbstractC4583b.m9028b(this.f10320h, c1836h0, AbstractC1874r.m4617C(1), this.f10321i);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C3235m(InterfaceC5853o interfaceC5853o, int i9, int i10) {
        this.f10320h = interfaceC5853o;
        this.f10321i = i10;
    }
}
