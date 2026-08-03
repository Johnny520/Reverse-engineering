package p357y1;

import gg.AbstractC1417m;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p276sf.C3967n;

/* JADX INFO: renamed from: y1.d1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5872d1 extends AbstractC1417m implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23842g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5880f1 f23843h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC5934t f23844i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1235p f23845j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5872d1(ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t, C5880f1 c5880f1, InterfaceC1235p interfaceC1235p) {
        super(2);
        this.f23844i = viewTreeObserverOnGlobalLayoutListenerC5934t;
        this.f23843h = c5880f1;
        this.f23845j = interfaceC1235p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23842g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1836h0.m4525a0(866651995);
                    AbstractC5888h1.m10608a(this.f23844i, this.f23843h.f23867k, this.f23845j, c1836h0, 0);
                    c1836h0.m4553p(false);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                ((Number) obj2).intValue();
                this.f23843h.m10581a(this.f23844i, this.f23845j, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
        }
        return C3967n.f12976a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5872d1(C5880f1 c5880f1, ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t, InterfaceC1235p interfaceC1235p, int i9) {
        super(2);
        this.f23843h = c5880f1;
        this.f23844i = viewTreeObserverOnGlobalLayoutListenerC5934t;
        this.f23845j = interfaceC1235p;
    }
}
