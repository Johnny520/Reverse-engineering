package bi;

import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p222p.AbstractC3241o;
import p265s.AbstractC3847o;
import p266s0.C3874d;
import p266s0.C3878h;
import p276sf.C3967n;
import p308v1.InterfaceC4412n0;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import sh.AbstractC4045s;

/* JADX INFO: renamed from: bi.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0321i implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f949g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3874d f950h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0321i(C3874d c3874d, int i9) {
        this.f949g = i9;
        this.f950h = c3874d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        C1836h0 c1836h0 = (C1836h0) obj;
        Integer num = (Integer) obj2;
        switch (this.f949g) {
            case 0:
                int iIntValue = num.intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.f950h.invoke(c1836h0, 0);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 1:
                num.getClass();
                AbstractC3847o.m8016c(this.f950h, c1836h0, AbstractC1874r.m4617C(7));
                break;
            case 2:
                num.getClass();
                AbstractC4045s.m8243g(this.f950h, c1836h0, AbstractC1874r.m4617C(7));
                break;
            case 3:
                int iIntValue2 = num.intValue();
                if (c1836h0.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    InterfaceC4412n0 interfaceC4412n0M6930d = AbstractC3241o.m6930d(C5840b.f23761g, false);
                    int iHashCode = Long.hashCode(c1836h0.f6095T);
                    C3878h c3878hM4546l = c1836h0.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, C5850l.f23787a);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y = C5601f.f22758b;
                    c1836h0.m4531d0();
                    if (c1836h0.f6094S) {
                        c1836h0.m4544k(c5660y);
                    } else {
                        c1836h0.m4551n0();
                    }
                    AbstractC1874r.m4615A(C5601f.f22761e, c1836h0, interfaceC4412n0M6930d);
                    AbstractC1874r.m4615A(C5601f.f22760d, c1836h0, c3878hM4546l);
                    AbstractC1874r.m4638t(c1836h0, Integer.valueOf(iHashCode), C5601f.f22762f);
                    AbstractC1874r.m4641w(C5601f.f22763g, c1836h0);
                    AbstractC1874r.m4615A(C5601f.f22759c, c1836h0, interfaceC5853oM10543c);
                    this.f950h.invoke(c1836h0, 0);
                    c1836h0.m4553p(true);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 4:
                int iIntValue3 = num.intValue();
                if (c1836h0.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    this.f950h.invoke(c1836h0, 0);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 5:
                int iIntValue4 = num.intValue();
                if (c1836h0.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    this.f950h.invoke(c1836h0, 0);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 6:
                int iIntValue5 = num.intValue();
                if (c1836h0.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    this.f950h.invoke(c1836h0, 0);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            default:
                int iIntValue6 = num.intValue();
                if (c1836h0.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    this.f950h.invoke(c1836h0, 0);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C0321i(C3874d c3874d, int i9, int i10) {
        this.f949g = i10;
        this.f950h = c3874d;
    }
}
