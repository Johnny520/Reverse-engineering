package p040H;

import p028F.C0347h;
import p047I0.C0724e1;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p095T.AbstractC1385s;
import p095T.C1366i0;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1603e;
import p136b0.C1843e;
import p160f3.AbstractC2162v;
import p216p.C2828V;

/* JADX INFO: renamed from: H.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0545c implements InterfaceC0547e {

    /* JADX INFO: renamed from: a */
    public final C1843e f1658a;

    /* JADX INFO: renamed from: b */
    public final C2828V f1659b = new C2828V();

    /* JADX INFO: renamed from: c */
    public final C1366i0 f1660c = AbstractC1385s.m2629s(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0545c(C1843e c1843e) {
        this.f1658a = c1843e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p040H.InterfaceC0547e
    /* JADX INFO: renamed from: a */
    public final Object mo556a(InterfaceC0546d interfaceC0546d, AbstractC1184i abstractC1184i) {
        C0347h c0347h = new C0347h(this, new C0544b(interfaceC0546d), null, 1);
        C2828V c2828v = this.f1659b;
        c2828v.getClass();
        Object objM3982d = AbstractC2162v.m3982d(new C0724e1(c2828v, c0347h, (InterfaceC1046d) null), abstractC1184i);
        return objM3982d == EnumC1152a.f3788d ? objM3982d : C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m774b(final InterfaceC1599a interfaceC1599a, InterfaceC1373m interfaceC1373m, final int i5) {
        final InterfaceC1599a interfaceC1599a2;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(723898654);
        int i6 = (c1383r.m2582f(this) ? 32 : 16) | i5;
        if (c1383r.m2560O(i6 & 1, (i6 & 19) != 18)) {
            C0544b c0544b = (C0544b) this.f1660c.getValue();
            if (c0544b == null) {
                C1388t0 c1388t0M2599r = c1383r.m2599r();
                if (c1388t0M2599r != null) {
                    final int i7 = 0;
                    c1388t0M2599r.f4928d = new InterfaceC1603e(this, interfaceC1599a, i5, i7) { // from class: H.a

                        /* JADX INFO: renamed from: d */
                        public final /* synthetic */ int f1653d;

                        /* JADX INFO: renamed from: e */
                        public final /* synthetic */ C0545c f1654e;

                        /* JADX INFO: renamed from: f */
                        public final /* synthetic */ InterfaceC1599a f1655f;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        {
                            this.f1653d = i7;
                            this.f1654e = this;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p112W2.InterfaceC1603e
                        /* JADX INFO: renamed from: g */
                        public final Object mo0g(Object obj, Object obj2) {
                            int i8 = this.f1653d;
                            InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj;
                            ((Integer) obj2).getClass();
                            switch (i8) {
                                case 0:
                                    this.f1654e.m774b(this.f1655f, interfaceC1373m2, AbstractC1385s.m2609A(7));
                                    break;
                                default:
                                    this.f1654e.m774b(this.f1655f, interfaceC1373m2, AbstractC1385s.m2609A(7));
                                    break;
                            }
                            return C0891q.f2780a;
                        }
                    };
                    return;
                }
                return;
            }
            interfaceC1599a2 = interfaceC1599a;
            this.f1658a.mo244j(c0544b, c0544b.f1656a, interfaceC1599a2, c1383r, 384);
        } else {
            interfaceC1599a2 = interfaceC1599a;
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r2 = c1383r.m2599r();
        if (c1388t0M2599r2 != null) {
            final int i8 = 1;
            c1388t0M2599r2.f4928d = new InterfaceC1603e(this, interfaceC1599a2, i5, i8) { // from class: H.a

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f1653d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ C0545c f1654e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ InterfaceC1599a f1655f;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f1653d = i8;
                    this.f1654e = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p112W2.InterfaceC1603e
                /* JADX INFO: renamed from: g */
                public final Object mo0g(Object obj, Object obj2) {
                    int i82 = this.f1653d;
                    InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj;
                    ((Integer) obj2).getClass();
                    switch (i82) {
                        case 0:
                            this.f1654e.m774b(this.f1655f, interfaceC1373m2, AbstractC1385s.m2609A(7));
                            break;
                        default:
                            this.f1654e.m774b(this.f1655f, interfaceC1373m2, AbstractC1385s.m2609A(7));
                            break;
                    }
                    return C0891q.f2780a;
                }
            };
        }
    }
}
