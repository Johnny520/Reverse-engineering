package p264s0;

import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p166l2.AbstractC4549i;
import p166l2.AbstractC4563l1;
import p166l2.AbstractC4565m;
import p166l2.InterfaceC4545h;
import p166l2.InterfaceC4553j;
import p166l2.InterfaceC4559k1;
import p172l8.C4700i0;
import p248r.InterfaceC6432h;
import p249r0.AbstractC6446i;
import p249r0.C6439b;
import p265s1.C7128q1;
import p265s1.InterfaceC7143t1;

/* JADX INFO: renamed from: s0.w4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6991w4 extends AbstractC4565m implements InterfaceC4545h, InterfaceC4559k1 {

    /* JADX INFO: renamed from: H */
    public final InterfaceC6432h f23140H;

    /* JADX INFO: renamed from: I */
    public final boolean f23141I;

    /* JADX INFO: renamed from: J */
    public final float f23142J;

    /* JADX INFO: renamed from: K */
    public final InterfaceC7143t1 f23143K;

    /* JADX INFO: renamed from: L */
    public InterfaceC4553j f23144L;

    /* JADX INFO: renamed from: s0.w4$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC7143t1 {
        public a() {
        }

        @Override // p265s1.InterfaceC7143t1
        /* JADX INFO: renamed from: a */
        public final long mo3692a() {
            long jMo3692a = C6991w4.this.f23143K.mo3692a();
            if (jMo3692a != 16) {
                return jMo3692a;
            }
            C6680c8 c6680c8 = (C6680c8) AbstractC4549i.m17816a(C6991w4.this, AbstractC6728f8.m26672b());
            return (c6680c8 == null || c6680c8.m26478a() == 16) ? ((C7128q1) AbstractC4549i.m17816a(C6991w4.this, AbstractC6865o1.m27265a())).m28139y() : c6680c8.m26478a();
        }
    }

    public C6991w4(InterfaceC6432h interfaceC6432h, boolean z10, float f10, InterfaceC7143t1 interfaceC7143t1) {
        this.f23140H = interfaceC6432h;
        this.f23141I = z10;
        this.f23142J = f10;
        this.f23143K = interfaceC7143t1;
    }

    /* JADX INFO: renamed from: M2 */
    public static C6439b m27620M2(C6991w4 c6991w4) {
        C6439b c6439bM26479b;
        C6680c8 c6680c8 = (C6680c8) AbstractC4549i.m17816a(c6991w4, AbstractC6728f8.m26672b());
        return (c6680c8 == null || (c6439bM26479b = c6680c8.m26479b()) == null) ? C6696d8.f21155a.m26633a() : c6439bM26479b;
    }

    /* JADX INFO: renamed from: N2 */
    public static C4700i0 m27621N2(C6991w4 c6991w4) {
        if (((C6680c8) AbstractC4549i.m17816a(c6991w4, AbstractC6728f8.m26672b())) == null) {
            c6991w4.m27624Q2();
        } else if (c6991w4.f23144L == null) {
            c6991w4.m27623P2();
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: P2 */
    public final void m27623P2() {
        this.f23144L = m18049G2(AbstractC6446i.m25498c(this.f23140H, this.f23141I, this.f23142J, new a(), new InterfaceC0173a() { // from class: s0.v4
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C6991w4.m27620M2(this.f22995q);
            }
        }));
    }

    /* JADX INFO: renamed from: Q2 */
    public final void m27624Q2() {
        InterfaceC4553j interfaceC4553j = this.f23144L;
        if (interfaceC4553j != null) {
            m18052J2(interfaceC4553j);
        }
        this.f23144L = null;
    }

    /* JADX INFO: renamed from: R2 */
    public final void m27625R2() {
        AbstractC4563l1.m18046a(this, new InterfaceC0173a() { // from class: s0.u4
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C6991w4.m27621N2(this.f22942q);
            }
        });
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: p2 */
    public void mo1377p2() {
        m27625R2();
    }

    @Override // p166l2.InterfaceC4559k1
    /* JADX INFO: renamed from: s1 */
    public void mo18018s1() {
        m27625R2();
    }

    public /* synthetic */ C6991w4(InterfaceC6432h interfaceC6432h, boolean z10, float f10, InterfaceC7143t1 interfaceC7143t1, AbstractC1043k abstractC1043k) {
        this(interfaceC6432h, z10, f10, interfaceC7143t1);
    }
}
