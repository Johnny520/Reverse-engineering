package p015b0;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0473c5;
import androidx.compose.runtime.InterfaceC0564p5;
import androidx.compose.runtime.InterfaceC0572r;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0189q;
import p015b0.AbstractC0791j4;
import p018b3.C0942c1;
import p018b3.C0978t0;
import p018b3.InterfaceC0948e1;
import p024b9.AbstractC1067w;
import p055e.AbstractC1960a;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;
import p165l1.AbstractC4505k;
import p165l1.InterfaceC4507m;
import p172l8.C4700i0;
import p179m2.AbstractC4836e2;
import p179m2.AbstractC4846g2;
import p179m2.AbstractC4870l1;
import p189n.EnumC5190a2;
import p215oc.C5729x;
import p219p.AbstractC5857i1;
import p219p.AbstractC5887s1;
import p219p.EnumC5898w0;
import p219p.InterfaceC5881q1;
import p221p1.AbstractC5923f;
import p228p8.InterfaceC5976f;
import p248r.InterfaceC6434j;
import p250r1.C6457g;
import p319w2.C9122q3;

/* JADX INFO: renamed from: b0.j4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0791j4 {

    /* JADX INFO: renamed from: b0.j4$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2397a;

        static {
            int[] iArr = new int[EnumC5898w0.values().length];
            try {
                iArr[EnumC5898w0.f18786q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5898w0.f18787r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f2397a = iArr;
        }
    }

    /* JADX INFO: renamed from: b0.j4$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C0840q4 f2398r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC6434j f2399s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ boolean f2400t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0840q4 c0840q4, InterfaceC6434j interfaceC6434j, boolean z10) {
            super(1);
            this.f2398r = c0840q4;
            this.f2399s = interfaceC6434j;
            this.f2400t = z10;
        }

        /* JADX INFO: renamed from: a */
        public final void m2972a(AbstractC4846g2 abstractC4846g2) {
            throw null;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            AbstractC1960a.m7104a(obj);
            m2972a(null);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: b0.j4$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements InterfaceC0189q {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ C0840q4 f2401q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ boolean f2402r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC6434j f2403s;

        /* JADX INFO: renamed from: b0.j4$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a implements InterfaceC5881q1 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC5881q1 f2404a;

            /* JADX INFO: renamed from: b */
            public final InterfaceC0564p5 f2405b;

            /* JADX INFO: renamed from: c */
            public final InterfaceC0564p5 f2406c;

            public a(InterfaceC5881q1 interfaceC5881q1, final C0840q4 c0840q4) {
                this.f2404a = interfaceC5881q1;
                this.f2405b = AbstractC0473c5.m1565d(new InterfaceC0173a() { // from class: b0.l4
                    @Override // p010a9.InterfaceC0173a
                    public final Object invoke() {
                        return Boolean.valueOf(AbstractC0791j4.c.a.m2976h(c0840q4));
                    }
                });
                this.f2406c = AbstractC0473c5.m1565d(new InterfaceC0173a() { // from class: b0.m4
                    @Override // p010a9.InterfaceC0173a
                    public final Object invoke() {
                        return Boolean.valueOf(AbstractC0791j4.c.a.m2975g(c0840q4));
                    }
                });
            }

            /* JADX INFO: renamed from: g */
            public static boolean m2975g(C0840q4 c0840q4) {
                return c0840q4.m3166f() > 0.0f;
            }

            /* JADX INFO: renamed from: h */
            public static boolean m2976h(C0840q4 c0840q4) {
                return c0840q4.m3166f() < c0840q4.m3165e();
            }

            @Override // p219p.InterfaceC5881q1
            /* JADX INFO: renamed from: a */
            public boolean mo2977a() {
                return this.f2404a.mo2977a();
            }

            @Override // p219p.InterfaceC5881q1
            /* JADX INFO: renamed from: b */
            public boolean mo2978b() {
                return ((Boolean) this.f2406c.getValue()).booleanValue();
            }

            @Override // p219p.InterfaceC5881q1
            /* JADX INFO: renamed from: c */
            public Object mo2979c(EnumC5190a2 enumC5190a2, InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f) {
                return this.f2404a.mo2979c(enumC5190a2, interfaceC0188p, interfaceC5976f);
            }

            @Override // p219p.InterfaceC5881q1
            /* JADX INFO: renamed from: e */
            public boolean mo2980e() {
                return ((Boolean) this.f2405b.getValue()).booleanValue();
            }

            @Override // p219p.InterfaceC5881q1
            /* JADX INFO: renamed from: f */
            public float mo2981f(float f10) {
                return this.f2404a.mo2981f(f10);
            }
        }

        public c(C0840q4 c0840q4, boolean z10, InterfaceC6434j interfaceC6434j) {
            this.f2401q = c0840q4;
            this.f2402r = z10;
            this.f2403s = interfaceC6434j;
        }

        /* JADX INFO: renamed from: a */
        public static float m2973a(C0840q4 c0840q4, float f10) {
            float fM3166f = c0840q4.m3166f() + f10;
            if (fM3166f > c0840q4.m3165e()) {
                f10 = c0840q4.m3165e() - c0840q4.m3166f();
            } else if (fM3166f < 0.0f) {
                f10 = -c0840q4.m3166f();
            }
            c0840q4.m3170j(c0840q4.m3166f() + f10);
            return f10;
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC4507m m2974c(InterfaceC4507m interfaceC4507m, InterfaceC0572r interfaceC0572r, int i10) {
            interfaceC0572r.mo2163V(805428266);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(805428266, i10, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:71)");
            }
            boolean z10 = this.f2401q.m3168h() == EnumC5898w0.f18786q || !(interfaceC0572r.mo2142A(AbstractC4870l1.m19447l()) == EnumC3191u.f8485r);
            boolean zMo2162U = interfaceC0572r.mo2162U(this.f2401q);
            final C0840q4 c0840q4 = this.f2401q;
            Object objMo2170f = interfaceC0572r.mo2170f();
            if (zMo2162U || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
                objMo2170f = new InterfaceC0184l() { // from class: b0.k4
                    @Override // p010a9.InterfaceC0184l
                    /* JADX INFO: renamed from: m */
                    public final Object mo27m(Object obj) {
                        return Float.valueOf(AbstractC0791j4.c.m2973a(c0840q4, ((Float) obj).floatValue()));
                    }
                };
                interfaceC0572r.mo2153L(objMo2170f);
            }
            InterfaceC5881q1 interfaceC5881q1M23708c = AbstractC5887s1.m23708c((InterfaceC0184l) objMo2170f, interfaceC0572r, 0);
            boolean zMo2162U2 = interfaceC0572r.mo2162U(interfaceC5881q1M23708c) | interfaceC0572r.mo2162U(this.f2401q);
            C0840q4 c0840q42 = this.f2401q;
            Object objMo2170f2 = interfaceC0572r.mo2170f();
            if (zMo2162U2 || objMo2170f2 == InterfaceC0572r.f1573a.m2191a()) {
                objMo2170f2 = new a(interfaceC5881q1M23708c, c0840q42);
                interfaceC0572r.mo2153L(objMo2170f2);
            }
            InterfaceC4507m interfaceC4507mM23617l = AbstractC5857i1.m23617l(InterfaceC4507m.f13080a, (a) objMo2170f2, this.f2401q.m3168h(), this.f2402r && this.f2401q.m3165e() != 0.0f, z10, null, this.f2403s, 16, null);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
            interfaceC0572r.mo2152K();
            return interfaceC4507mM23617l;
        }

        @Override // p010a9.InterfaceC0189q
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ Object mo236e(Object obj, Object obj2, Object obj3) {
            return m2974c((InterfaceC4507m) obj, (InterfaceC0572r) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC4507m m2969b(InterfaceC4507m interfaceC4507m, C0840q4 c0840q4, C0978t0 c0978t0, InterfaceC0948e1 interfaceC0948e1, InterfaceC0173a interfaceC0173a) {
        InterfaceC4507m c0729a6;
        EnumC5898w0 enumC5898w0M3168h = c0840q4.m3168h();
        int iM3167g = c0840q4.m3167g(c0978t0.m3585j());
        c0840q4.m3171k(c0978t0.m3585j());
        C0942c1 c0942c1M3297c = AbstractC0897y5.m3297c(interfaceC0948e1, c0978t0.m3583h());
        int i10 = a.f2397a[enumC5898w0M3168h.ordinal()];
        if (i10 == 1) {
            c0729a6 = new C0729a6(c0840q4, iM3167g, c0942c1M3297c, interfaceC0173a);
        } else {
            if (i10 != 2) {
                C5729x.m23182a();
                return null;
            }
            c0729a6 = new C0900z1(c0840q4, iM3167g, c0942c1M3297c, interfaceC0173a);
        }
        return AbstractC5923f.m23837b(interfaceC4507m).mo17445i(c0729a6);
    }

    /* JADX INFO: renamed from: c */
    public static final C6457g m2970c(InterfaceC3175e interfaceC3175e, int i10, C0942c1 c0942c1, C9122q3 c9122q3, boolean z10, int i11) {
        C6457g c6457gM25594a;
        if (c9122q3 == null || (c6457gM25594a = c9122q3.m35386e(c0942c1.m3465a().mo3268b(i10))) == null) {
            c6457gM25594a = C6457g.f20319e.m25594a();
        }
        C6457g c6457g = c6457gM25594a;
        int iMo1236x1 = interfaceC3175e.mo1236x1(AbstractC0811m3.m3029a());
        return C6457g.m25573h(c6457g, z10 ? (i11 - c6457g.m25583l()) - iMo1236x1 : c6457g.m25583l(), 0.0f, z10 ? i11 - c6457g.m25583l() : iMo1236x1 + c6457g.m25583l(), 0.0f, 10, null);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC4507m m2971d(InterfaceC4507m interfaceC4507m, C0840q4 c0840q4, InterfaceC6434j interfaceC6434j, boolean z10) {
        return AbstractC4505k.m17436b(interfaceC4507m, AbstractC4836e2.m19334b() ? new b(c0840q4, interfaceC6434j, z10) : AbstractC4836e2.m19333a(), new c(c0840q4, z10, interfaceC6434j));
    }
}
