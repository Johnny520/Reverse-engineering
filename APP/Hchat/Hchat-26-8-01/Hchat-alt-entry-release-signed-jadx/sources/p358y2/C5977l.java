package p358y2;

import gg.AbstractC1417m;
import p028c1.AbstractC0378h;
import p072f2.AbstractC1052o;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1883u;
import p117i0.InterfaceC1809a1;
import p266s0.AbstractC3879i;
import p266s0.C3878h;
import p276sf.C3967n;
import p308v1.AbstractC4434w;
import p308v1.InterfaceC4412n0;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p356y0.AbstractC5839a;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: y2.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5977l extends AbstractC1417m implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f24288g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5989x f24289h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f24290i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5977l(C5989x c5989x, InterfaceC1809a1 interfaceC1809a1, int i9) {
        super(2);
        this.f24288g = i9;
        this.f24289h = c5989x;
        this.f24290i = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        int i9 = this.f24288g;
        C3967n c3967n = C3967n.f12976a;
        InterfaceC1809a1 interfaceC1809a1 = this.f24290i;
        C5989x c5989x = this.f24289h;
        int i10 = 0;
        switch (i9) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1836h0.m4519V();
                } else {
                    Object objM4514P = c1836h0.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (objM4514P == c1823e) {
                        objM4514P = C5966c.f24246k;
                        c1836h0.m4545k0(objM4514P);
                    }
                    InterfaceC5853o interfaceC5853oM2648a = AbstractC1052o.m2648a(C5850l.f23787a, (InterfaceC1231l) objM4514P);
                    boolean zM4538h = c1836h0.m4538h(c5989x);
                    Object objM4514P2 = c1836h0.m4514P();
                    if (zM4538h || objM4514P2 == c1823e) {
                        objM4514P2 = new C5975j(c5989x, 1);
                        c1836h0.m4545k0(objM4514P2);
                    }
                    InterfaceC5853o interfaceC5853oM1336a = AbstractC0378h.m1336a(AbstractC4434w.m8890n(interfaceC5853oM2648a, (InterfaceC1231l) objM4514P2), c5989x.getCanCalculatePosition() ? 1.0f : 0.0f);
                    C1883u c1883u = AbstractC5978m.f24291a;
                    InterfaceC1235p interfaceC1235p = (InterfaceC1235p) interfaceC1809a1.getValue();
                    Object objM4514P3 = c1836h0.m4514P();
                    if (objM4514P3 == c1823e) {
                        objM4514P3 = C5970e.f24265c;
                        c1836h0.m4545k0(objM4514P3);
                    }
                    InterfaceC4412n0 interfaceC4412n0 = (InterfaceC4412n0) objM4514P3;
                    int iHashCode = Long.hashCode(c1836h0.f6095T);
                    C3878h c3878hM4546l = c1836h0.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, interfaceC5853oM1336a);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y = C5601f.f22758b;
                    c1836h0.m4531d0();
                    if (c1836h0.f6094S) {
                        c1836h0.m4544k(c5660y);
                    } else {
                        c1836h0.m4551n0();
                    }
                    AbstractC1874r.m4615A(C5601f.f22761e, c1836h0, interfaceC4412n0);
                    AbstractC1874r.m4615A(C5601f.f22760d, c1836h0, c3878hM4546l);
                    AbstractC1874r.m4615A(C5601f.f22762f, c1836h0, Integer.valueOf(iHashCode));
                    AbstractC1874r.m4641w(C5601f.f22763g, c1836h0);
                    AbstractC1874r.m4615A(C5601f.f22759c, c1836h0, interfaceC5853oM10543c);
                    interfaceC1235p.invoke(c1836h0, 0);
                    c1836h0.m4553p(true);
                }
                break;
            default:
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c1836h02.m4519V();
                } else {
                    AbstractC1874r.m4619a(AbstractC5978m.f24292b.mo4582a(Boolean.TRUE), AbstractC3879i.m8071e(1022273628, new C5977l(c5989x, interfaceC1809a1, i10), c1836h02), c1836h02, 56);
                }
                break;
        }
        return c3967n;
    }
}
