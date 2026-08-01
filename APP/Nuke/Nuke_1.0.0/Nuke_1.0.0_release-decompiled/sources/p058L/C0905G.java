package p058L;

import p095T.InterfaceC1339T0;
import p112W2.InterfaceC1599a;
import p203n.C2665l;
import p204n0.C2683b;

/* JADX INFO: renamed from: L.G */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0905G implements InterfaceC1599a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2815d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC1339T0 f2816e;

    public /* synthetic */ C0905G(InterfaceC1339T0 interfaceC1339T0, int i5) {
        this.f2815d = i5;
        this.f2816e = interfaceC1339T0;
    }

    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i5 = this.f2815d;
        InterfaceC1339T0 interfaceC1339T0 = this.f2816e;
        switch (i5) {
            case 0:
                break;
            default:
                C2665l c2665l = AbstractC0907I.f2820a;
                break;
        }
        return new C2683b(((C2683b) interfaceC1339T0.getValue()).f8556a);
    }
}
