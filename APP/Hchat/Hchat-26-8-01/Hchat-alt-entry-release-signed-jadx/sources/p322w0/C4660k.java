package p322w0;

import p085fg.InterfaceC1231l;
import p276sf.C3967n;

/* JADX INFO: renamed from: w0.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4660k implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f15506g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1231l f15507h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1231l f15508i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4660k(InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2, int i9) {
        this.f15506g = i9;
        this.f15507h = interfaceC1231l;
        this.f15508i = interfaceC1231l2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f15506g) {
            case 0:
                this.f15507h.invoke(obj);
                this.f15508i.invoke(obj);
                break;
            default:
                this.f15507h.invoke(obj);
                this.f15508i.invoke(obj);
                break;
        }
        return C3967n.f12976a;
    }
}
