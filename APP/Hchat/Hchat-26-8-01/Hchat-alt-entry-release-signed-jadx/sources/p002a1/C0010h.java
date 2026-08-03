package p002a1;

import gg.AbstractC1417m;
import gg.AbstractC1428x;
import p072f2.AbstractC1052o;
import p072f2.C1054q;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p099h.EnumC1456f0;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import p343x6.AbstractC5700d;
import p356y0.AbstractC5839a;
import p356y0.C5848j;
import p356y0.C5850l;
import p356y0.InterfaceC5851m;
import p356y0.InterfaceC5853o;
import p357y1.AbstractC5858a;
import p357y1.C5868c1;
import p358y2.C5966c;
import p358y2.C5985t;
import p358y2.C5989x;

/* JADX INFO: renamed from: a1.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0010h extends AbstractC1417m implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f26g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f27h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0010h(Object obj, int i9) {
        super(2);
        this.f26g = i9;
        this.f27h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26g) {
            case 0:
                ((ViewOnAttachStateChangeListenerC0011i) this.f27h).m162m(((Number) obj).intValue(), (C1054q) obj2);
                break;
            case 1:
                EnumC1456f0 enumC1456f0 = (EnumC1456f0) obj;
                EnumC1456f0 enumC1456f02 = (EnumC1456f0) obj2;
                EnumC1456f0 enumC1456f03 = EnumC1456f0.f4835i;
                break;
            case 2:
                InterfaceC5853o interfaceC5853o = (InterfaceC5853o) obj;
                InterfaceC5853o interfaceC5853oM10542b = (InterfaceC5851m) obj2;
                C1836h0 c1836h0 = (C1836h0) this.f27h;
                if (interfaceC5853oM10542b instanceof C5848j) {
                    InterfaceC1236q interfaceC1236q = ((C5848j) interfaceC5853oM10542b).f23785a;
                    AbstractC1428x.m3838c(3, interfaceC1236q);
                    interfaceC5853oM10542b = AbstractC5839a.m10542b(c1836h0, (InterfaceC5853o) interfaceC1236q.mo734b(C5850l.f23787a, c1836h0, 0));
                }
                break;
            case 3:
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c1836h02.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((AbstractC5858a) this.f27h).mo10551a(c1836h02, 0);
                } else {
                    c1836h02.m4519V();
                }
                break;
            case 4:
                ((Number) obj2).intValue();
                ((C5868c1) this.f27h).mo10551a((C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            case 5:
                C1836h0 c1836h03 = (C1836h0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (c1836h03.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objM4514P = c1836h03.m4514P();
                    if (objM4514P == C1851l.f6155a) {
                        objM4514P = C5966c.f24243h;
                        c1836h03.m4545k0(objM4514P);
                    }
                    AbstractC5700d.m10276f(AbstractC1052o.m2648a(C5850l.f23787a, (InterfaceC1231l) objM4514P), (InterfaceC1235p) ((InterfaceC1809a1) this.f27h).getValue(), c1836h03, 0);
                } else {
                    c1836h03.m4519V();
                }
                break;
            case 6:
                ((Number) obj2).intValue();
                ((C5985t) this.f27h).mo10551a((C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            default:
                ((Number) obj2).intValue();
                ((C5989x) this.f27h).mo10551a((C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
        }
        return C3967n.f12976a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0010h(AbstractC5858a abstractC5858a, int i9, int i10) {
        super(2);
        this.f26g = i10;
        this.f27h = abstractC5858a;
    }
}
