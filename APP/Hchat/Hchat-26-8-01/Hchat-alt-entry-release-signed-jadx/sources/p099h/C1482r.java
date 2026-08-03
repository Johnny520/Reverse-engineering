package p099h;

import gg.AbstractC1416l;
import gg.AbstractC1417m;
import p085fg.InterfaceC1231l;
import p116i.AbstractC1742d;
import p116i.InterfaceC1747e1;
import p116i.InterfaceC1803y;
import p117i0.InterfaceC1854l2;
import p293u2.C4242l;

/* JADX INFO: renamed from: h.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1482r extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4923g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1484s f4924h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f4925i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1482r(C1484s c1484s, long j3, int i9) {
        super(1);
        this.f4923g = i9;
        this.f4924h = c1484s;
        this.f4925i = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        long j3;
        InterfaceC1803y interfaceC1803y;
        long j4;
        switch (this.f4923g) {
            case 0:
                InterfaceC1747e1 interfaceC1747e1 = (InterfaceC1747e1) obj;
                Object objMo4002b = interfaceC1747e1.mo4002b();
                C1484s c1484s = this.f4924h;
                if (AbstractC1416l.m3825a(objMo4002b, c1484s.f4930x.mo4002b())) {
                    j3 = C4242l.m8534a(c1484s.f4931y, AbstractC1468k.f4881a) ? this.f4925i : c1484s.f4931y;
                } else {
                    InterfaceC1854l2 interfaceC1854l2 = (InterfaceC1854l2) c1484s.f4930x.f4937c.m2320g(interfaceC1747e1.mo4002b());
                    j3 = interfaceC1854l2 != null ? ((C4242l) interfaceC1854l2.getValue()).f13918a : 0L;
                }
                InterfaceC1854l2 interfaceC1854l22 = (InterfaceC1854l2) c1484s.f4930x.f4937c.m2320g(interfaceC1747e1.mo4003c());
                long j5 = interfaceC1854l22 != null ? ((C4242l) interfaceC1854l22.getValue()).f13918a : 0L;
                C1454e1 c1454e1 = (C1454e1) c1484s.f4929w.getValue();
                return (c1454e1 == null || (interfaceC1803y = (InterfaceC1803y) c1454e1.f4828a.invoke(new C4242l(j3), new C4242l(j5))) == null) ? AbstractC1742d.m4379o(0.0f, 400.0f, null, 5) : interfaceC1803y;
            default:
                C1484s c1484s2 = this.f4924h;
                if (AbstractC1416l.m3825a(obj, c1484s2.f4930x.mo4002b())) {
                    j4 = C4242l.m8534a(c1484s2.f4931y, AbstractC1468k.f4881a) ? this.f4925i : c1484s2.f4931y;
                } else {
                    InterfaceC1854l2 interfaceC1854l23 = (InterfaceC1854l2) c1484s2.f4930x.f4937c.m2320g(obj);
                    j4 = interfaceC1854l23 != null ? ((C4242l) interfaceC1854l23.getValue()).f13918a : 0L;
                }
                return new C4242l(j4);
        }
    }
}
