package p167l3;

import ec.AbstractC2148k;
import ec.InterfaceC2165o0;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1067w;
import p165l1.InterfaceC4507m;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p236q2.AbstractC6234b;
import p242q8.AbstractC6325c;
import p250r1.C6457g;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: l3.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4614g extends InterfaceC4507m.c {

    /* JADX INFO: renamed from: F */
    public InterfaceC0184l f13732F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC0184l f13733G = new a();

    /* JADX INFO: renamed from: l3.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: l3.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10145a extends AbstractC6544m implements InterfaceC0188p {

            /* JADX INFO: renamed from: q */
            public int f13735q;

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ C4614g f13736r;

            /* JADX INFO: renamed from: s */
            public final /* synthetic */ C6457g f13737s;

            /* JADX INFO: renamed from: l3.g$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
            public static final class C10146a extends AbstractC1067w implements InterfaceC0173a {

                /* JADX INFO: renamed from: r */
                public final /* synthetic */ C6457g f13738r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10146a(C6457g c6457g) {
                    super(0);
                    this.f13738r = c6457g;
                }

                @Override // p010a9.InterfaceC0173a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C6457g invoke() {
                    return this.f13738r;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10145a(C4614g c4614g, C6457g c6457g, InterfaceC5976f interfaceC5976f) {
                super(2, interfaceC5976f);
                this.f13736r = c4614g;
                this.f13737s = c6457g;
            }

            @Override // p257r8.AbstractC6532a
            public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
                return new C10145a(this.f13736r, this.f13737s, interfaceC5976f);
            }

            @Override // p010a9.InterfaceC0188p
            public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
                return ((C10145a) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM24992g = AbstractC6325c.m24992g();
                int i10 = this.f13735q;
                if (i10 == 0) {
                    AbstractC4713t.m18808b(obj);
                    C4614g c4614g = this.f13736r;
                    C10146a c10146a = new C10146a(this.f13737s);
                    this.f13735q = 1;
                    if (AbstractC6234b.m24563a(c4614g, c10146a, this) == objM24992g) {
                        return objM24992g;
                    }
                } else {
                    if (i10 != 1) {
                        C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC4713t.m18808b(obj);
                }
                return C4700i0.f13910a;
            }
        }

        public a() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m18534a(C6457g c6457g) {
            if (C4614g.this.m17461m2()) {
                AbstractC2148k.m7817d(C4614g.this.m17455f2(), null, null, new C10145a(C4614g.this, c6457g, null), 3, null);
            }
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m18534a((C6457g) obj);
            return C4700i0.f13910a;
        }
    }

    public C4614g(InterfaceC0184l interfaceC0184l) {
        this.f13732F = interfaceC0184l;
    }

    /* JADX INFO: renamed from: G2 */
    public final void m18533G2(InterfaceC0184l interfaceC0184l) {
        this.f13732F = interfaceC0184l;
        if (m17461m2()) {
            interfaceC0184l.mo27m(this.f13733G);
        }
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: p2 */
    public void mo1377p2() {
        this.f13732F.mo27m(this.f13733G);
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: q2 */
    public void mo1378q2() {
        this.f13732F.mo27m(null);
    }
}
