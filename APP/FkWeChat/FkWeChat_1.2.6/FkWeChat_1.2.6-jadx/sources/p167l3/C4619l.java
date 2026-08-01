package p167l3;

import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1067w;
import p024b9.C1050n0;
import p024b9.C1055q;
import p135j2.AbstractC3541k1;
import p135j2.InterfaceC3537j1;
import p165l1.C4503i;
import p166l2.AbstractC4549i;
import p166l2.AbstractC4563l1;
import p166l2.AbstractC4565m;
import p166l2.InterfaceC4545h;
import p166l2.InterfaceC4559k1;
import p172l8.C4700i0;
import p235q1.C6206h0;
import p235q1.InterfaceC6198d0;

/* JADX INFO: renamed from: l3.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4619l extends AbstractC4565m implements InterfaceC4559k1, InterfaceC4545h {

    /* JADX INFO: renamed from: H */
    public final C6206h0 f13747H = (C6206h0) m18049G2(new C6206h0(0, true, new a(this), null, 9, null));

    /* JADX INFO: renamed from: I */
    public InterfaceC3537j1.a f13748I;

    /* JADX INFO: renamed from: l3.l$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a extends C1055q implements InterfaceC0188p {
        public a(Object obj) {
            super(2, obj, C4619l.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18554y((InterfaceC6198d0) obj, (InterfaceC6198d0) obj2);
            return C4700i0.f13910a;
        }

        /* JADX INFO: renamed from: y */
        public final void m18554y(InterfaceC6198d0 interfaceC6198d0, InterfaceC6198d0 interfaceC6198d02) {
            ((C4619l) this.f3190r).m18552N2(interfaceC6198d0, interfaceC6198d02);
        }
    }

    /* JADX INFO: renamed from: l3.l$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C1050n0 f13749r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C4619l f13750s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1050n0 c1050n0, C4619l c4619l) {
            super(0);
            this.f13749r = c1050n0;
            this.f13750s = c4619l;
        }

        /* JADX INFO: renamed from: a */
        public final void m18555a() {
            this.f13749r.f3208q = AbstractC4549i.m17816a(this.f13750s, AbstractC3541k1.m13235a());
        }

        @Override // p010a9.InterfaceC0173a
        public /* bridge */ /* synthetic */ Object invoke() {
            m18555a();
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N2 */
    public final void m18552N2(InterfaceC6198d0 interfaceC6198d0, InterfaceC6198d0 interfaceC6198d02) {
        boolean zMo24356c;
        if (C4503i.f13071q && m17461m2() && (zMo24356c = interfaceC6198d02.mo24356c()) != interfaceC6198d0.mo24356c()) {
            if (zMo24356c) {
                InterfaceC3537j1 interfaceC3537j1M18553O2 = m18553O2();
                this.f13748I = interfaceC3537j1M18553O2 != null ? interfaceC3537j1M18553O2.mo1311b() : null;
            } else {
                InterfaceC3537j1.a aVar = this.f13748I;
                if (aVar != null) {
                    aVar.mo1310a();
                }
                this.f13748I = null;
            }
        }
    }

    /* JADX INFO: renamed from: O2 */
    private final InterfaceC3537j1 m18553O2() {
        C1050n0 c1050n0 = new C1050n0();
        AbstractC4563l1.m18046a(this, new b(c1050n0, this));
        return (InterfaceC3537j1) c1050n0.f3208q;
    }

    @Override // p166l2.InterfaceC4559k1
    /* JADX INFO: renamed from: s1 */
    public void mo18018s1() {
        InterfaceC3537j1 interfaceC3537j1M18553O2 = m18553O2();
        if (this.f13747H.mo24362j0().mo24356c()) {
            InterfaceC3537j1.a aVar = this.f13748I;
            if (aVar != null) {
                aVar.mo1310a();
            }
            this.f13748I = interfaceC3537j1M18553O2 != null ? interfaceC3537j1M18553O2.mo1311b() : null;
        }
    }
}
