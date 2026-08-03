package p100h0;

import p027c0.C0368m;
import p036c9.C0471o0;
import p057e1.C0807b;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p116i.C1739c;
import p116i.C1766l;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1854l2;
import p276sf.C3967n;
import p332wb.AbstractC4955ho;
import p356y0.InterfaceC5853o;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: h0.j0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1528j0 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5100g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1231l f5101h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1220a f5102i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1528j0(InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l) {
        this.f5102i = interfaceC1220a;
        this.f5101h = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f5100g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj2;
                ((Integer) obj3).getClass();
                c1836h0.m4525a0(759876635);
                Object objM4514P = c1836h0.m4514P();
                C1823e c1823e = C1851l.f6155a;
                if (objM4514P == c1823e) {
                    objM4514P = AbstractC1874r.m4634p(this.f5102i);
                    c1836h0.m4545k0(objM4514P);
                }
                InterfaceC1854l2 interfaceC1854l2 = (InterfaceC1854l2) objM4514P;
                Object objM4514P2 = c1836h0.m4514P();
                if (objM4514P2 == c1823e) {
                    objM4514P2 = new C1739c(new C0807b(((C0807b) interfaceC1854l2.getValue()).f2414a), AbstractC1537m0.f5125b, new C0807b(AbstractC1537m0.f5126c), 8);
                    c1836h0.m4545k0(objM4514P2);
                }
                C1739c c1739c = (C1739c) objM4514P2;
                boolean zM4538h = c1836h0.m4538h(c1739c);
                Object objM4514P3 = c1836h0.m4514P();
                if (zM4538h || objM4514P3 == c1823e) {
                    objM4514P3 = new C0368m(interfaceC1854l2, c1739c, null, 4);
                    c1836h0.m4545k0(objM4514P3);
                }
                AbstractC1874r.m4624f((InterfaceC1235p) objM4514P3, c1836h0, C3967n.f12976a);
                C1766l c1766l = c1739c.f5786c;
                boolean zM4534f = c1836h0.m4534f(c1766l);
                Object objM4514P4 = c1836h0.m4514P();
                if (zM4534f || objM4514P4 == c1823e) {
                    objM4514P4 = new C1525i0(c1766l, 0);
                    c1836h0.m4545k0(objM4514P4);
                }
                InterfaceC5853o interfaceC5853o = (InterfaceC5853o) this.f5101h.invoke((InterfaceC1220a) objM4514P4);
                c1836h0.m4553p(false);
                return interfaceC5853o;
            default:
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h02.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    InterfaceC1231l interfaceC1231l = this.f5101h;
                    boolean zM4534f2 = c1836h02.m4534f(interfaceC1231l);
                    Object objM4514P5 = c1836h02.m4514P();
                    if (zM4534f2 || objM4514P5 == C1851l.f6155a) {
                        objM4514P5 = new C0471o0(interfaceC1231l, 2);
                        c1836h02.m4545k0(objM4514P5);
                    }
                    AbstractC4955ho.m9382M("微信首页", (InterfaceC1220a) objM4514P5, "返回", this.f5102i, null, null, c1836h02, 390, 48);
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
        }
    }

    public /* synthetic */ C1528j0(InterfaceC1231l interfaceC1231l, InterfaceC1220a interfaceC1220a) {
        this.f5101h = interfaceC1231l;
        this.f5102i = interfaceC1220a;
    }
}
