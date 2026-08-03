package p332wb;

import java.util.Set;
import p015b0.C0151q;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.v1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5392v1 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21266g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5292s0 f21267h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f21268i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5392v1(C5292s0 c5292s0, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f21266g = i9;
        this.f21267h = c5292s0;
        this.f21268i = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        C3619d c3619d = (C3619d) obj;
        switch (this.f21266g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                c3619d.getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    InterfaceC1809a1 interfaceC1809a1 = this.f21268i;
                    Set set = (Set) interfaceC1809a1.getValue();
                    C5292s0 c5292s0 = this.f21267h;
                    boolean zContains = set.contains(c5292s0.f20550a);
                    boolean zM4534f = c1836h0.m4534f(interfaceC1809a1) | c1836h0.m4538h(c5292s0);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4534f || objM4514P == C1851l.f6155a) {
                        objM4514P = new C5458x1(c5292s0, interfaceC1809a1, 0);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9495a0(c5292s0, zContains, true, (InterfaceC1220a) objM4514P, c1836h0, 384);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                c3619d.getClass();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    InterfaceC1809a1 interfaceC1809a12 = this.f21268i;
                    Set set2 = (Set) interfaceC1809a12.getValue();
                    C5292s0 c5292s02 = this.f21267h;
                    boolean zContains2 = set2.contains(c5292s02.f20550a);
                    boolean zM4534f2 = c1836h02.m4534f(interfaceC1809a12) | c1836h02.m4538h(c5292s02);
                    Object objM4514P2 = c1836h02.m4514P();
                    if (zM4534f2 || objM4514P2 == C1851l.f6155a) {
                        objM4514P2 = new C5458x1(c5292s02, interfaceC1809a12, 1);
                        c1836h02.m4545k0(objM4514P2);
                    }
                    AbstractC4955ho.m9495a0(c5292s02, zContains2, true, (InterfaceC1220a) objM4514P2, c1836h02, 384);
                } else {
                    c1836h02.m4519V();
                }
                break;
            default:
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                c3619d.getClass();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1327069086, new C0151q(this.f21267h, 27, this.f21268i), c1836h03), c1836h03, 48, 1);
                } else {
                    c1836h03.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
