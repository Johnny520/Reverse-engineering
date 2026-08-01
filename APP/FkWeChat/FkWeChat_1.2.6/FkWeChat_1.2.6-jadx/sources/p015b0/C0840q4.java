package p015b0;

import androidx.compose.runtime.AbstractC0471c3;
import androidx.compose.runtime.AbstractC0473c5;
import androidx.compose.runtime.AbstractC0570q4;
import androidx.compose.runtime.InterfaceC0491f2;
import androidx.compose.runtime.InterfaceC0498g2;
import androidx.compose.runtime.InterfaceC0512i2;
import java.util.List;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p080f9.AbstractC2368o;
import p102h1.AbstractC2820b;
import p102h1.InterfaceC2821b0;
import p102h1.InterfaceC2843x;
import p185m8.AbstractC5114x;
import p219p.EnumC5898w0;
import p250r1.C6457g;
import p319w2.C9137t3;

/* JADX INFO: renamed from: b0.q4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0840q4 {

    /* JADX INFO: renamed from: g */
    public static final a f2650g = new a(null);

    /* JADX INFO: renamed from: h */
    public static final InterfaceC2843x f2651h = AbstractC2820b.m10040b(new InterfaceC0188p() { // from class: b0.o4
        @Override // p010a9.InterfaceC0188p
        public final Object invoke(Object obj, Object obj2) {
            return C0840q4.m3161a((InterfaceC2821b0) obj, (C0840q4) obj2);
        }
    }, new InterfaceC0184l() { // from class: b0.p4
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public final Object mo27m(Object obj) {
            return C0840q4.m3162b((List) obj);
        }
    });

    /* JADX INFO: renamed from: a */
    public final InterfaceC0491f2 f2652a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0491f2 f2653b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0498g2 f2654c;

    /* JADX INFO: renamed from: d */
    public C6457g f2655d;

    /* JADX INFO: renamed from: e */
    public long f2656e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0512i2 f2657f;

    public C0840q4(EnumC5898w0 enumC5898w0, float f10) {
        this.f2652a = AbstractC0471c3.m1561a(f10);
        this.f2653b = AbstractC0471c3.m1561a(0.0f);
        this.f2654c = AbstractC0570q4.m2141a(0);
        this.f2655d = C6457g.f20319e.m25594a();
        this.f2656e = C9137t3.f31232b.m35528a();
        this.f2657f = AbstractC0473c5.m1570i(enumC5898w0, AbstractC0473c5.m1579r());
    }

    /* JADX INFO: renamed from: a */
    public static List m3161a(InterfaceC2821b0 interfaceC2821b0, C0840q4 c0840q4) {
        return AbstractC5114x.m20803r(Float.valueOf(c0840q4.m3166f()), Boolean.valueOf(c0840q4.m3168h() == EnumC5898w0.f18786q));
    }

    /* JADX INFO: renamed from: b */
    public static C0840q4 m3162b(List list) {
        Object obj = list.get(1);
        obj.getClass();
        EnumC5898w0 enumC5898w0 = ((Boolean) obj).booleanValue() ? EnumC5898w0.f18786q : EnumC5898w0.f18787r;
        Object obj2 = list.get(0);
        obj2.getClass();
        return new C0840q4(enumC5898w0, ((Float) obj2).floatValue());
    }

    /* JADX INFO: renamed from: d */
    public final void m3164d(float f10, float f11, int i10) {
        float fM3166f = m3166f();
        float f12 = i10;
        float f13 = fM3166f + f12;
        m3170j(m3166f() + ((f11 <= f13 && (f10 >= fM3166f || f11 - f10 <= f12)) ? (f10 >= fM3166f || f11 - f10 > f12) ? 0.0f : f10 - fM3166f : f11 - f13));
    }

    /* JADX INFO: renamed from: e */
    public final float m3165e() {
        return this.f2653b.mo1663b();
    }

    /* JADX INFO: renamed from: f */
    public final float m3166f() {
        return this.f2652a.mo1663b();
    }

    /* JADX INFO: renamed from: g */
    public final int m3167g(long j10) {
        return C9137t3.m35523n(j10) != C9137t3.m35523n(this.f2656e) ? C9137t3.m35523n(j10) : C9137t3.m35518i(j10) != C9137t3.m35518i(this.f2656e) ? C9137t3.m35518i(j10) : C9137t3.m35521l(j10);
    }

    /* JADX INFO: renamed from: h */
    public final EnumC5898w0 m3168h() {
        return (EnumC5898w0) this.f2657f.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final void m3169i(float f10) {
        this.f2653b.mo1664h(f10);
    }

    /* JADX INFO: renamed from: j */
    public final void m3170j(float f10) {
        this.f2652a.mo1664h(f10);
    }

    /* JADX INFO: renamed from: k */
    public final void m3171k(long j10) {
        this.f2656e = j10;
    }

    /* JADX INFO: renamed from: l */
    public final void m3172l(int i10) {
        this.f2654c.mo1687j(i10);
    }

    /* JADX INFO: renamed from: m */
    public final void m3173m(EnumC5898w0 enumC5898w0, C6457g c6457g, int i10, int i11) {
        float f10 = i11 - i10;
        m3169i(f10);
        if (c6457g.m25583l() != this.f2655d.m25583l() || c6457g.m25586o() != this.f2655d.m25586o()) {
            boolean z10 = enumC5898w0 == EnumC5898w0.f18786q;
            m3164d(z10 ? c6457g.m25586o() : c6457g.m25583l(), z10 ? c6457g.m25580i() : c6457g.m25584m(), i10);
            this.f2655d = c6457g;
        }
        m3170j(AbstractC2368o.m8585l(m3166f(), 0.0f, f10));
        m3172l(i10);
    }

    /* JADX INFO: renamed from: b0.q4$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC2843x m3174a() {
            return C0840q4.f2651h;
        }

        public a() {
        }
    }

    public /* synthetic */ C0840q4(EnumC5898w0 enumC5898w0, float f10, int i10, AbstractC1043k abstractC1043k) {
        this(enumC5898w0, (i10 & 2) != 0 ? 0.0f : f10);
    }
}
