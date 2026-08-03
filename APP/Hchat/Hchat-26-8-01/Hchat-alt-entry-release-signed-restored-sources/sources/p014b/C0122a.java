package p014b;

import gg.AbstractC1417m;
import p085fg.InterfaceC1220a;
import p276sf.C3967n;

/* JADX INFO: renamed from: b.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0122a extends AbstractC1417m implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f321g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0127f f322h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0122a(C0127f c0127f, int i9) {
        super(0);
        this.f321g = i9;
        this.f322h = c0127f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f321g) {
            case 0:
                this.f322h.m652d();
                break;
            default:
                this.f322h.m649a();
                break;
        }
        return C3967n.f12976a;
    }
}
