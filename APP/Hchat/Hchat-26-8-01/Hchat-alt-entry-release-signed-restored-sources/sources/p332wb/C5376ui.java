package p332wb;

import java.util.List;
import p000a.AbstractC0000a;
import p036c9.C0503y0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p222p.AbstractC3222h1;
import p276sf.C3967n;
import p317vb.InterfaceC4544a;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import sh.C4056v1;

/* JADX INFO: renamed from: wb.ui */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5376ui implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21120g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List f21121h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f21122i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1231l f21123j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5376ui(List list, InterfaceC1231l interfaceC1231l, String str) {
        this.f21120g = 3;
        this.f21121h = list;
        this.f21123j = interfaceC1231l;
        this.f21122i = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21120g) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9486Z(this.f21121h, this.f21122i, this.f21123j, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9486Z(this.f21121h, this.f21122i, this.f21123j, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            case 2:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    List list = this.f21121h;
                    if (list.isEmpty()) {
                        c1836h0.m4525a0(-1315814217);
                        AbstractC4955ho.m9657s0(this.f21122i, c1836h0, 0);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(-1315755658);
                        int i9 = 0;
                        for (Object obj3 : list) {
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                AbstractC0000a.m32Q0();
                                throw null;
                            }
                            InterfaceC4544a interfaceC4544a = (InterfaceC4544a) obj3;
                            InterfaceC1231l interfaceC1231l = this.f21123j;
                            boolean zM4534f = c1836h0.m4534f(interfaceC1231l) | c1836h0.m4538h(interfaceC4544a);
                            Object objM4514P = c1836h0.m4514P();
                            if (zM4534f || objM4514P == C1851l.f6155a) {
                                objM4514P = new C4056v1(interfaceC1231l, 11, interfaceC4544a);
                                c1836h0.m4545k0(objM4514P);
                            }
                            AbstractC4955ho.m9351I0(interfaceC4544a, (InterfaceC1220a) objM4514P, c1836h0, 0);
                            if (i9 < list.size() - 1) {
                                c1836h0.m4525a0(-36125428);
                                AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                                c1836h0.m4553p(false);
                            } else {
                                c1836h0.m4525a0(-36073534);
                                c1836h0.m4553p(false);
                            }
                            i9 = i10;
                        }
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            default:
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    InterfaceC5853o interfaceC5853oM6904g = AbstractC3222h1.m6904g(AbstractC3222h1.m6901d(C5850l.f23787a, 1.0f), 0.0f, 360, 1);
                    List list2 = this.f21121h;
                    boolean zM4538h = c1836h02.m4538h(list2);
                    InterfaceC1231l interfaceC1231l2 = this.f21123j;
                    boolean zM4534f2 = zM4538h | c1836h02.m4534f(interfaceC1231l2);
                    String str = this.f21122i;
                    boolean zM4534f3 = zM4534f2 | c1836h02.m4534f(str);
                    Object objM4514P2 = c1836h02.m4514P();
                    if (zM4534f3 || objM4514P2 == C1851l.f6155a) {
                        objM4514P2 = new C0503y0(list2, interfaceC1231l2, str);
                        c1836h02.m4545k0(objM4514P2);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM6904g, null, null, null, null, null, false, null, (InterfaceC1231l) objM4514P2, c1836h02, 6, 510);
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5376ui(List list, String str, InterfaceC1231l interfaceC1231l) {
        this.f21120g = 2;
        this.f21121h = list;
        this.f21122i = str;
        this.f21123j = interfaceC1231l;
    }

    public /* synthetic */ C5376ui(List list, String str, InterfaceC1231l interfaceC1231l, int i9, int i10) {
        this.f21120g = i10;
        this.f21121h = list;
        this.f21122i = str;
        this.f21123j = interfaceC1231l;
    }
}
