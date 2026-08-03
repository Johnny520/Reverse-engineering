package p339x1;

import gg.AbstractC1417m;
import p071f1.InterfaceC1031u;
import p085fg.InterfaceC1220a;
import p276sf.C3967n;

/* JADX INFO: renamed from: x1.f1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5603f1 extends AbstractC1417m implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22810g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC5614i1 f22811h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5603f1(AbstractC5614i1 abstractC5614i1, int i9) {
        super(0);
        this.f22810g = i9;
        this.f22811h = abstractC5614i1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f22810g) {
            case 0:
                AbstractC5614i1 abstractC5614i1 = this.f22811h;
                InterfaceC1031u interfaceC1031u = abstractC5614i1.f22862N;
                interfaceC1031u.getClass();
                abstractC5614i1.m10100l1(interfaceC1031u, abstractC5614i1.f22861M);
                break;
            default:
                AbstractC5614i1 abstractC5614i12 = this.f22811h.f22870w;
                if (abstractC5614i12 != null) {
                    abstractC5614i12.m10113y1();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
