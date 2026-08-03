package p040d0;

import p015b0.C0141g;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.C1876r1;
import p144k.C2176h1;
import p266s0.C3874d;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;

/* JADX INFO: renamed from: d0.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0646c implements InterfaceC0648e {

    /* JADX INFO: renamed from: a */
    public final C3874d f2011a;

    /* JADX INFO: renamed from: b */
    public final C2176h1 f2012b = new C2176h1();

    /* JADX INFO: renamed from: c */
    public final C1845j1 f2013c = AbstractC1874r.m4639u(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0646c(C3874d c3874d) {
        this.f2011a = c3874d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p040d0.InterfaceC0648e
    /* JADX INFO: renamed from: a */
    public final Object mo716a(InterfaceC0647d interfaceC0647d, AbstractC6044i abstractC6044i) {
        Object objM5407b = C2176h1.m5407b(this.f2012b, new C0141g(this, new C0645b(interfaceC0647d), null, 1), abstractC6044i);
        return objM5407b == EnumC5799a.f23547g ? objM5407b : C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1795b(final InterfaceC1220a interfaceC1220a, C1836h0 c1836h0, final int i9) {
        final InterfaceC1220a interfaceC1220a2;
        C1836h0 c1836h02;
        c1836h0.m4527b0(723898654);
        int i10 = (c1836h0.m4534f(this) ? 32 : 16) | i9;
        if (c1836h0.m4516S(i10 & 1, (i10 & 19) != 18)) {
            C0645b c0645b = (C0645b) this.f2013c.getValue();
            if (c0645b == null) {
                C1876r1 c1876r1M4557t = c1836h0.m4557t();
                if (c1876r1M4557t != null) {
                    final int i11 = 0;
                    c1876r1M4557t.f6241d = new InterfaceC1235p(this, interfaceC1220a, i9, i11) { // from class: d0.a

                        /* JADX INFO: renamed from: g */
                        public final /* synthetic */ int f2006g;

                        /* JADX INFO: renamed from: h */
                        public final /* synthetic */ C0646c f2007h;

                        /* JADX INFO: renamed from: i */
                        public final /* synthetic */ InterfaceC1220a f2008i;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        {
                            this.f2006g = i11;
                            this.f2007h = this;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj, Object obj2) {
                            int i12 = this.f2006g;
                            C1836h0 c1836h03 = (C1836h0) obj;
                            ((Integer) obj2).getClass();
                            switch (i12) {
                                case 0:
                                    this.f2007h.m1795b(this.f2008i, c1836h03, AbstractC1874r.m4617C(7));
                                    break;
                                default:
                                    this.f2007h.m1795b(this.f2008i, c1836h03, AbstractC1874r.m4617C(7));
                                    break;
                            }
                            return C3967n.f12976a;
                        }
                    };
                    return;
                }
                return;
            }
            interfaceC1220a2 = interfaceC1220a;
            c1836h02 = c1836h0;
            this.f2011a.mo726d(c0645b, c0645b.f2009a, interfaceC1220a2, c1836h02, 384);
        } else {
            interfaceC1220a2 = interfaceC1220a;
            c1836h02 = c1836h0;
            c1836h02.m4519V();
        }
        C1876r1 c1876r1M4557t2 = c1836h02.m4557t();
        if (c1876r1M4557t2 != null) {
            final int i12 = 1;
            c1876r1M4557t2.f6241d = new InterfaceC1235p(this, interfaceC1220a2, i9, i12) { // from class: d0.a

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ int f2006g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ C0646c f2007h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ InterfaceC1220a f2008i;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f2006g = i12;
                    this.f2007h = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1235p
                public final Object invoke(Object obj, Object obj2) {
                    int i122 = this.f2006g;
                    C1836h0 c1836h03 = (C1836h0) obj;
                    ((Integer) obj2).getClass();
                    switch (i122) {
                        case 0:
                            this.f2007h.m1795b(this.f2008i, c1836h03, AbstractC1874r.m4617C(7));
                            break;
                        default:
                            this.f2007h.m1795b(this.f2008i, c1836h03, AbstractC1874r.m4617C(7));
                            break;
                    }
                    return C3967n.f12976a;
                }
            };
        }
    }
}
