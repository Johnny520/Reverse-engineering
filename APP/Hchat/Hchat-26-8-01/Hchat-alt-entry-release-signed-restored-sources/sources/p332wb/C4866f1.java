package p332wb;

import java.util.List;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.C1851l;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p276sf.C3967n;
import p356y0.InterfaceC5853o;
import sh.C4060x;

/* JADX INFO: renamed from: wb.f1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4866f1 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17039g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4060x f17040h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3641z f17041i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ List f17042j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1231l f17043k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4866f1(C4060x c4060x, C3641z c3641z, List list, InterfaceC1231l interfaceC1231l, int i9) {
        this.f17039g = i9;
        this.f17040h = c4060x;
        this.f17041i = c3641z;
        this.f17042j = list;
        this.f17043k = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f17039g;
        InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        interfaceC3268x0.getClass();
        int i10 = iIntValue & 6;
        switch (i9) {
            case 0:
                if (i10 == 0) {
                    iIntValue |= c1836h0.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, this.f17040h.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    List list = this.f17042j;
                    boolean zM4538h = c1836h0.m4538h(list);
                    InterfaceC1231l interfaceC1231l = this.f17043k;
                    boolean zM4534f = zM4538h | c1836h0.m4534f(interfaceC1231l);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4534f || objM4514P == C1851l.f6155a) {
                        objM4514P = new C5062l1(list, interfaceC1231l, 0);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, this.f17041i, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P, c1836h0, 0, 504);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                if (i10 == 0) {
                    iIntValue |= c1836h0.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a2 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, this.f17040h.f13440e, null);
                    C3272z0 c3272z0M6872b2 = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    List list2 = this.f17042j;
                    boolean zM4538h2 = c1836h0.m4538h(list2);
                    InterfaceC1231l interfaceC1231l2 = this.f17043k;
                    boolean zM4534f2 = zM4538h2 | c1836h0.m4534f(interfaceC1231l2);
                    Object objM4514P2 = c1836h0.m4514P();
                    if (zM4534f2 || objM4514P2 == C1851l.f6155a) {
                        objM4514P2 = new C5062l1(list2, interfaceC1231l2, 1);
                        c1836h0.m4545k0(objM4514P2);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a2, this.f17041i, c3272z0M6872b2, null, null, null, false, null, (InterfaceC1231l) objM4514P2, c1836h0, 0, 504);
                } else {
                    c1836h0.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
