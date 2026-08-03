package p099h;

import gg.AbstractC1416l;
import gg.AbstractC1417m;
import p002a1.C0010h;
import p016b1.C0166f;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p116i.C1765k1;
import p116i.InterfaceC1747e1;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.C1851l;
import p266s0.AbstractC3879i;
import p266s0.C3874d;
import p276sf.C3967n;
import p308v1.AbstractC4434w;
import p322w0.C4665p;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: h.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1461h extends AbstractC1417m implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1765k1 f4852g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f4853h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1231l f4854i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1486t f4855j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C4665p f4856k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C3874d f4857l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1461h(C1765k1 c1765k1, Object obj, InterfaceC1231l interfaceC1231l, C1486t c1486t, C4665p c4665p, C3874d c3874d) {
        super(2);
        this.f4852g = c1765k1;
        this.f4853h = obj;
        this.f4854i = interfaceC1231l;
        this.f4855j = c1486t;
        this.f4856k = c4665p;
        this.f4857l = c3874d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        C1836h0 c1836h0 = (C1836h0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objM4514P = c1836h0.m4514P();
            InterfaceC1231l interfaceC1231l = this.f4854i;
            C1486t c1486t = this.f4855j;
            C1823e c1823e = C1851l.f6155a;
            if (objM4514P == c1823e) {
                objM4514P = (C1453e0) interfaceC1231l.invoke(c1486t);
                c1836h0.m4545k0(objM4514P);
            }
            C1453e0 c1453e0 = (C1453e0) objM4514P;
            C1765k1 c1765k1 = this.f4852g;
            InterfaceC1747e1 interfaceC1747e1M4417f = c1765k1.m4417f();
            C1845j1 c1845j1 = c1765k1.f5892d;
            Object objMo4003c = interfaceC1747e1M4417f.mo4003c();
            Object obj3 = this.f4853h;
            boolean zM4536g = c1836h0.m4536g(AbstractC1416l.m3825a(objMo4003c, obj3));
            Object objM4514P2 = c1836h0.m4514P();
            if (zM4536g || objM4514P2 == c1823e) {
                objM4514P2 = AbstractC1416l.m3825a(c1765k1.m4417f().mo4003c(), obj3) ? C1485s0.f4932b : ((C1453e0) interfaceC1231l.invoke(c1486t)).f4825b;
                c1836h0.m4545k0(objM4514P2);
            }
            C1485s0 c1485s0 = (C1485s0) objM4514P2;
            Object objM4514P3 = c1836h0.m4514P();
            if (objM4514P3 == c1823e) {
                objM4514P3 = new C1476o(AbstractC1416l.m3825a(obj3, c1845j1.getValue()));
                c1836h0.m4545k0(objM4514P3);
            }
            C1476o c1476o = (C1476o) objM4514P3;
            C1483r0 c1483r0 = c1453e0.f4824a;
            boolean zM4538h = c1836h0.m4538h(c1453e0);
            Object objM4514P4 = c1836h0.m4514P();
            if (zM4538h || objM4514P4 == c1823e) {
                objM4514P4 = new C1452e(c1453e0);
                c1836h0.m4545k0(objM4514P4);
            }
            InterfaceC5853o interfaceC5853oM8887k = AbstractC4434w.m8887k(C5850l.f23787a, (InterfaceC1236q) objM4514P4);
            c1476o.f4899a.setValue(Boolean.valueOf(AbstractC1416l.m3825a(obj3, c1845j1.getValue())));
            InterfaceC5853o interfaceC5853oMo10549d = interfaceC5853oM8887k.mo10549d(c1476o);
            boolean zM4538h2 = c1836h0.m4538h(obj3);
            Object objM4514P5 = c1836h0.m4514P();
            if (zM4538h2 || objM4514P5 == c1823e) {
                objM4514P5 = new C0166f(obj3, 11);
                c1836h0.m4545k0(objM4514P5);
            }
            InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) objM4514P5;
            boolean zM4534f = c1836h0.m4534f(c1485s0);
            Object objM4514P6 = c1836h0.m4514P();
            if (zM4534f || objM4514P6 == c1823e) {
                objM4514P6 = new C0010h(c1485s0, 1);
                c1836h0.m4545k0(objM4514P6);
            }
            AbstractC1441a0.m3982a(c1765k1, interfaceC1231l2, interfaceC5853oMo10549d, c1483r0, c1485s0, (InterfaceC1235p) objM4514P6, AbstractC3879i.m8071e(-143346359, new C1458g(this.f4856k, obj3, c1486t, this.f4857l), c1836h0), c1836h0, 12582912);
        } else {
            c1836h0.m4519V();
        }
        return C3967n.f12976a;
    }
}
