package p321w;

import ci.C0611w;
import p085fg.InterfaceC1231l;
import p119i2.C1935k0;
import p276sf.C3967n;
import p322w0.C4665p;

/* JADX INFO: renamed from: w.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4610k implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f15212g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4621n1 f15213h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1231l f15214i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4610k(C4621n1 c4621n1, InterfaceC1231l interfaceC1231l, int i9) {
        this.f15212g = i9;
        this.f15213h = c4621n1;
        this.f15214i = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f15212g) {
            case 0:
                C1935k0 c1935k0 = (C1935k0) obj;
                C4621n1 c4621n1 = this.f15213h;
                if (c4621n1 != null) {
                    c4621n1.f15299a.setValue(c1935k0);
                }
                InterfaceC1231l interfaceC1231l = this.f15214i;
                if (interfaceC1231l != null) {
                    interfaceC1231l.invoke(c1935k0);
                }
                return C3967n.f12976a;
            default:
                C4621n1 c4621n12 = this.f15213h;
                C4665p c4665p = c4621n12.f15301c;
                InterfaceC1231l interfaceC1231l2 = this.f15214i;
                c4665p.add(interfaceC1231l2);
                return new C0611w(c4621n12, 8, interfaceC1231l2);
        }
    }
}
