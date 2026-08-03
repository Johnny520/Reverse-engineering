package p175m0;

import p020b5.C0190i;
import p069f.C0945l0;
import p085fg.InterfaceC1220a;
import p100h0.C1548s;
import p117i0.C1848k0;
import p117i0.C1876r1;
import p117i0.InterfaceC1807a;
import p131j0.C2046b;
import p159l0.C2420b;
import p159l0.C2429k;

/* JADX INFO: renamed from: m0.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2711r extends AbstractC2701j0 {

    /* JADX INFO: renamed from: d */
    public static final C2711r f8785d;

    /* JADX INFO: renamed from: e */
    public static final C2711r f8786e;

    /* JADX INFO: renamed from: f */
    public static final C2711r f8787f;

    /* JADX INFO: renamed from: g */
    public static final C2711r f8788g;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f8789c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i9 = 1;
        f8785d = new C2711r(i9, 2, 0);
        int i10 = 1;
        f8786e = new C2711r(i10, i10, 1);
        f8787f = new C2711r(i9, 2, 2);
        int i11 = 1;
        f8788g = new C2711r(i11, i11, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2711r(int i9, int i10, int i11) {
        super(i9, i10);
        this.f8789c = i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p175m0.AbstractC2701j0
    /* JADX INFO: renamed from: a */
    public final void mo6126a(C1548s c1548s, InterfaceC1807a interfaceC1807a, C2429k c2429k, C0190i c0190i, InterfaceC2703k0 interfaceC2703k0) {
        switch (this.f8789c) {
            case 0:
                Object objInvoke = ((InterfaceC1220a) c1548s.m4049d(0)).invoke();
                C2420b c2420b = (C2420b) c1548s.m4049d(1);
                int iM4048c = c1548s.m4048c(0);
                c2420b.getClass();
                c2429k.m5815U(c2429k.m5818c(c2420b), objInvoke);
                interfaceC1807a.mo4448p(iM4048c, objInvoke);
                interfaceC1807a.mo4443d(objInvoke);
                break;
            case 1:
                C2420b c2420b2 = (C2420b) c1548s.m4049d(0);
                int iM4048c2 = c1548s.m4048c(0);
                interfaceC1807a.mo4447k();
                c2420b2.getClass();
                interfaceC1807a.mo4442c(iM4048c2, c2429k.m5798D(c2429k.m5818c(c2420b2)));
                break;
            case 2:
                Object objM4049d = c1548s.m4049d(0);
                C2420b c2420b3 = (C2420b) c1548s.m4049d(1);
                int iM4048c3 = c1548s.m4048c(0);
                if (objM4049d instanceof C1848k0) {
                    C1848k0 c1848k0 = (C1848k0) objM4049d;
                    ((C2046b) c0190i.f480f).m5056b(c1848k0);
                    ((C0945l0) c0190i.f479e).m2328a(c1848k0);
                }
                Object objM5805K = c2429k.m5805K(c2429k.m5818c(c2420b3), iM4048c3, objM4049d);
                if (objM5805K instanceof C1848k0) {
                    c0190i.m845g((C1848k0) objM5805K);
                } else if (objM5805K instanceof C1876r1) {
                    ((C1876r1) objM5805K).m4647c();
                }
                break;
            default:
                Object objM4049d2 = c1548s.m4049d(0);
                int iM4048c4 = c1548s.m4048c(0);
                if (objM4049d2 instanceof C1848k0) {
                    C1848k0 c1848k02 = (C1848k0) objM4049d2;
                    ((C2046b) c0190i.f480f).m5056b(c1848k02);
                    ((C0945l0) c0190i.f479e).m2328a(c1848k02);
                }
                Object objM5805K2 = c2429k.m5805K(c2429k.f7982t, iM4048c4, objM4049d2);
                if (objM5805K2 instanceof C1848k0) {
                    c0190i.m845g((C1848k0) objM5805K2);
                } else if (objM5805K2 instanceof C1876r1) {
                    ((C1876r1) objM5805K2).m4647c();
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p175m0.AbstractC2701j0
    /* JADX INFO: renamed from: b */
    public C2420b mo6132b(C1548s c1548s) {
        switch (this.f8789c) {
            case 0:
                return (C2420b) c1548s.m4049d(1);
            case 1:
                return (C2420b) c1548s.m4049d(0);
            default:
                return super.mo6132b(c1548s);
        }
    }
}
