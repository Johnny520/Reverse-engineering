package p332wb;

import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.hh */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4948hh implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17611g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1231l f17612h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Integer f17613i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4948hh(InterfaceC1231l interfaceC1231l, Integer num, int i9) {
        this.f17611g = i9;
        this.f17612h = interfaceC1231l;
        this.f17613i = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f17611g) {
            case 0:
                this.f17612h.invoke(this.f17613i);
                break;
            default:
                Integer num = this.f17613i;
                num.getClass();
                this.f17612h.invoke(num);
                break;
        }
        return C3967n.f12976a;
    }
}
