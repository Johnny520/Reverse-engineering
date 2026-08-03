package p354xh;

import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1237r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import p332wb.C4960ht;
import p343x6.AbstractC5700d;
import p358y2.C5986u;
import p358y2.EnumC5969d0;
import sh.C4016i0;

/* JADX INFO: renamed from: xh.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5832q implements InterfaceC1237r {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23710g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f23711h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5832q(InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f23710g = i9;
        this.f23711h = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1237r
    /* JADX INFO: renamed from: c */
    public final Object mo3355c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i9;
        int i10;
        int i11 = this.f23710g;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        InterfaceC1235p interfaceC1235p = (InterfaceC1235p) obj2;
        C1836h0 c1836h0 = (C1836h0) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        switch (i11) {
            case 0:
                interfaceC1235p.getClass();
                if ((iIntValue & 6) == 0) {
                    i9 = (c1836h0.m4536g(zBooleanValue) ? 4 : 2) | iIntValue;
                } else {
                    i9 = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i9 |= c1836h0.m4538h(interfaceC1235p) ? 32 : 16;
                }
                if (!c1836h0.m4516S(i9 & 1, (i9 & 147) != 146)) {
                    c1836h0.m4519V();
                } else if (zBooleanValue) {
                    c1836h0.m4525a0(276430998);
                    InterfaceC1809a1 interfaceC1809a1 = this.f23711h;
                    boolean zM4534f = c1836h0.m4534f(interfaceC1809a1);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4534f || objM4514P == C1851l.f6155a) {
                        objM4514P = new C4960ht(interfaceC1809a1, 4);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC5700d.m10268a((InterfaceC1220a) objM4514P, new C5986u(false, EnumC5969d0.f24261g, false, false), AbstractC3879i.m8071e(-1792426939, new C4016i0(6, interfaceC1235p), c1836h0), c1836h0, 384);
                    c1836h0.m4553p(false);
                } else {
                    c1836h0.m4525a0(276731791);
                    c1836h0.m4553p(false);
                }
                break;
            default:
                interfaceC1235p.getClass();
                if ((iIntValue & 6) == 0) {
                    i10 = (c1836h0.m4536g(zBooleanValue) ? 4 : 2) | iIntValue;
                } else {
                    i10 = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i10 |= c1836h0.m4538h(interfaceC1235p) ? 32 : 16;
                }
                if (!c1836h0.m4516S(i10 & 1, (i10 & 147) != 146)) {
                    c1836h0.m4519V();
                } else if (zBooleanValue) {
                    c1836h0.m4525a0(1909785122);
                    InterfaceC1809a1 interfaceC1809a12 = this.f23711h;
                    boolean zM4534f2 = c1836h0.m4534f(interfaceC1809a12);
                    Object objM4514P2 = c1836h0.m4514P();
                    if (zM4534f2 || objM4514P2 == C1851l.f6155a) {
                        objM4514P2 = new C4960ht(interfaceC1809a12, 8);
                        c1836h0.m4545k0(objM4514P2);
                    }
                    AbstractC5700d.m10268a((InterfaceC1220a) objM4514P2, new C5986u(false, EnumC5969d0.f24261g, false, false), AbstractC3879i.m8071e(-1400467783, new C4016i0(7, interfaceC1235p), c1836h0), c1836h0, 384);
                    c1836h0.m4553p(false);
                } else {
                    c1836h0.m4525a0(1910085915);
                    c1836h0.m4553p(false);
                }
                break;
        }
        return C3967n.f12976a;
    }
}
