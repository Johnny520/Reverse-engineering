package p357y1;

import gg.AbstractC1417m;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p266s0.C3874d;
import p276sf.C3967n;
import p339x1.InterfaceC5641r1;
import p343x6.AbstractC5700d;
import p358y2.C5986u;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: y1.g1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5884g1 extends AbstractC1417m implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23883g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1235p f23884h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f23885i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f23886j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5884g1(C5953x2 c5953x2, C5880f1 c5880f1, InterfaceC1235p interfaceC1235p) {
        super(2);
        this.f23883g = 1;
        this.f23885i = c5953x2;
        this.f23886j = c5880f1;
        this.f23884h = interfaceC1235p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23883g) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC5888h1.m10608a((InterfaceC5641r1) this.f23885i, (C5919p0) this.f23886j, this.f23884h, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            case 1:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Number) obj2).intValue();
                C5953x2 c5953x2 = (C5953x2) this.f23885i;
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = c5953x2.f24185g;
                    boolean zM4538h = c1836h0.m4538h(c5953x2);
                    Object objM4514P = c1836h0.m4514P();
                    InterfaceC5557c interfaceC5557c = null;
                    C1823e c1823e = C1851l.f6155a;
                    if (zM4538h || objM4514P == c1823e) {
                        objM4514P = new C5949w2(c5953x2, interfaceC5557c, 0);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC1874r.m4624f((InterfaceC1235p) objM4514P, c1836h0, viewTreeObserverOnGlobalLayoutListenerC5934t);
                    boolean zM4538h2 = c1836h0.m4538h(c5953x2);
                    Object objM4514P2 = c1836h0.m4514P();
                    if (zM4538h2 || objM4514P2 == c1823e) {
                        objM4514P2 = new C5949w2(c5953x2, interfaceC5557c, 1);
                        c1836h0.m4545k0(objM4514P2);
                    }
                    AbstractC1874r.m4624f((InterfaceC1235p) objM4514P2, c1836h0, viewTreeObserverOnGlobalLayoutListenerC5934t);
                    ((C5880f1) this.f23886j).m10581a(viewTreeObserverOnGlobalLayoutListenerC5934t, this.f23884h, c1836h0, 0);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC5700d.m10268a((InterfaceC1220a) this.f23885i, (C5986u) this.f23886j, (C3874d) this.f23884h, (C1836h0) obj, AbstractC1874r.m4617C(385));
                break;
        }
        return C3967n.f12976a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5884g1(Object obj, Object obj2, InterfaceC1235p interfaceC1235p, int i9, int i10) {
        super(2);
        this.f23883g = i10;
        this.f23885i = obj;
        this.f23886j = obj2;
        this.f23884h = interfaceC1235p;
    }
}
