package p015b0;

import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p266s0.C3874d;
import p276sf.C3967n;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: b0.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0143i implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f377g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC5853o f378h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3874d f379i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f380j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0143i(InterfaceC5853o interfaceC5853o, C3874d c3874d, int i9, int i10) {
        this.f377g = i10;
        this.f378h = interfaceC5853o;
        this.f379i = c3874d;
        this.f380j = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        int i9 = this.f377g;
        C1836h0 c1836h0 = (C1836h0) obj;
        ((Integer) obj2).getClass();
        switch (i9) {
            case 0:
                AbstractC0149o.m729c(this.f378h, this.f379i, c1836h0, AbstractC1874r.m4617C(this.f380j | 1));
                break;
            case 1:
                AbstractC0149o.m730d(this.f378h, this.f379i, c1836h0, AbstractC1874r.m4617C(this.f380j | 1));
                break;
            case 2:
                AbstractC0157w.m738d(this.f378h, this.f379i, c1836h0, AbstractC1874r.m4617C(this.f380j | 1));
                break;
            case 3:
                AbstractC0149o.m728b(this.f378h, this.f379i, c1836h0, AbstractC1874r.m4617C(this.f380j | 1));
                break;
            default:
                AbstractC0149o.m727a(this.f378h, this.f379i, c1836h0, AbstractC1874r.m4617C(this.f380j | 1));
                break;
        }
        return C3967n.f12976a;
    }
}
