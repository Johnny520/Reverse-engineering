package p354xh;

import bi.AbstractC0319g;
import bi.C0321i;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1858m2;
import p117i0.InterfaceC1809a1;
import p266s0.AbstractC3879i;
import p266s0.C3874d;
import p276sf.C3967n;
import p332wb.C4960ht;

/* JADX INFO: renamed from: xh.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5827l implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23677g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f23678h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3874d f23679i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5827l(InterfaceC1809a1 interfaceC1809a1, C3874d c3874d, int i9) {
        this.f23677g = i9;
        this.f23678h = interfaceC1809a1;
        this.f23679i = c3874d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        int i9 = this.f23677g;
        C1836h0 c1836h0 = (C1836h0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i9) {
            case 0:
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C1858m2 c1858m2 = AbstractC0319g.f947a;
                    InterfaceC1809a1 interfaceC1809a1 = this.f23678h;
                    boolean zM4534f = c1836h0.m4534f(interfaceC1809a1);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4534f || objM4514P == C1851l.f6155a) {
                        objM4514P = new C4960ht(interfaceC1809a1, 2);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC1874r.m4619a(c1858m2.mo4582a((InterfaceC1220a) objM4514P), AbstractC3879i.m8071e(373708764, new C0321i(this.f23679i, 5), c1836h0), c1836h0, 56);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C1858m2 c1858m22 = AbstractC0319g.f947a;
                    InterfaceC1809a1 interfaceC1809a12 = this.f23678h;
                    boolean zM4534f2 = c1836h0.m4534f(interfaceC1809a12);
                    Object objM4514P2 = c1836h0.m4514P();
                    if (zM4534f2 || objM4514P2 == C1851l.f6155a) {
                        objM4514P2 = new C4960ht(interfaceC1809a12, 5);
                        c1836h0.m4545k0(objM4514P2);
                    }
                    AbstractC1874r.m4619a(c1858m22.mo4582a((InterfaceC1220a) objM4514P2), AbstractC3879i.m8071e(1218748044, new C0321i(this.f23679i, 6), c1836h0), c1836h0, 56);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C1858m2 c1858m23 = AbstractC0319g.f947a;
                    InterfaceC1809a1 interfaceC1809a13 = this.f23678h;
                    boolean zM4534f3 = c1836h0.m4534f(interfaceC1809a13);
                    Object objM4514P3 = c1836h0.m4514P();
                    if (zM4534f3 || objM4514P3 == C1851l.f6155a) {
                        objM4514P3 = new C4960ht(interfaceC1809a13, 9);
                        c1836h0.m4545k0(objM4514P3);
                    }
                    AbstractC1874r.m4619a(c1858m23.mo4582a((InterfaceC1220a) objM4514P3), AbstractC3879i.m8071e(-1650834240, new C0321i(this.f23679i, 7), c1836h0), c1836h0, 56);
                } else {
                    c1836h0.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
