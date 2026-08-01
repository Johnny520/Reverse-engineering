package p350y1;

import java.util.List;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p265s1.AbstractC7078g1;
import p265s1.AbstractC7142t0;
import p265s1.AbstractC7147u0;
import p265s1.InterfaceC7144t2;
import p265s1.InterfaceC7158w2;
import p290u1.C8492k;
import p290u1.InterfaceC8487f;

/* JADX INFO: renamed from: y1.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9519g extends AbstractC9524l {

    /* JADX INFO: renamed from: b */
    public String f32382b;

    /* JADX INFO: renamed from: c */
    public AbstractC7078g1 f32383c;

    /* JADX INFO: renamed from: d */
    public float f32384d;

    /* JADX INFO: renamed from: e */
    public List f32385e;

    /* JADX INFO: renamed from: f */
    public int f32386f;

    /* JADX INFO: renamed from: g */
    public float f32387g;

    /* JADX INFO: renamed from: h */
    public float f32388h;

    /* JADX INFO: renamed from: i */
    public AbstractC7078g1 f32389i;

    /* JADX INFO: renamed from: j */
    public int f32390j;

    /* JADX INFO: renamed from: k */
    public int f32391k;

    /* JADX INFO: renamed from: l */
    public float f32392l;

    /* JADX INFO: renamed from: m */
    public float f32393m;

    /* JADX INFO: renamed from: n */
    public float f32394n;

    /* JADX INFO: renamed from: o */
    public float f32395o;

    /* JADX INFO: renamed from: p */
    public boolean f32396p;

    /* JADX INFO: renamed from: q */
    public boolean f32397q;

    /* JADX INFO: renamed from: r */
    public boolean f32398r;

    /* JADX INFO: renamed from: s */
    public C8492k f32399s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC7144t2 f32400t;

    /* JADX INFO: renamed from: u */
    public InterfaceC7144t2 f32401u;

    /* JADX INFO: renamed from: v */
    public InterfaceC7144t2 f32402v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC4705l f32403w;

    /* JADX INFO: renamed from: y1.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public static final a f32404r = new a();

        public a() {
            super(0);
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC7158w2 invoke() {
            return AbstractC7142t0.m28217a();
        }
    }

    public C9519g() {
        super(null);
        this.f32382b = _UrlKt.FRAGMENT_ENCODE_SET;
        this.f32384d = 1.0f;
        this.f32385e = AbstractC9527o.m37282d();
        this.f32386f = AbstractC9527o.m37279a();
        this.f32387g = 1.0f;
        this.f32390j = AbstractC9527o.m37280b();
        this.f32391k = AbstractC9527o.m37281c();
        this.f32392l = 4.0f;
        this.f32394n = 1.0f;
        this.f32396p = true;
        this.f32397q = true;
        InterfaceC7144t2 interfaceC7144t2M28224a = AbstractC7147u0.m28224a();
        this.f32400t = interfaceC7144t2M28224a;
        this.f32401u = interfaceC7144t2M28224a;
        this.f32403w = AbstractC4706m.m18788b(EnumC4708o.f13923s, a.f32404r);
    }

    @Override // p350y1.AbstractC9524l
    /* JADX INFO: renamed from: a */
    public void mo37082a(InterfaceC8487f interfaceC8487f) {
        C8492k c8492k;
        if (this.f32396p) {
            m37178w();
        } else if (this.f32398r) {
            m37179x();
        }
        this.f32396p = false;
        this.f32398r = false;
        AbstractC7078g1 abstractC7078g1 = this.f32383c;
        if (abstractC7078g1 != null) {
            InterfaceC8487f.m32659y0(interfaceC8487f, this.f32401u, abstractC7078g1, this.f32384d, null, null, 0, 56, null);
        }
        AbstractC7078g1 abstractC7078g12 = this.f32389i;
        if (abstractC7078g12 != null) {
            C8492k c8492k2 = this.f32399s;
            if (this.f32397q || c8492k2 == null) {
                C8492k c8492k3 = new C8492k(this.f32388h, this.f32392l, this.f32390j, this.f32391k, null, 16, null);
                this.f32399s = c8492k3;
                this.f32397q = false;
                c8492k = c8492k3;
            } else {
                c8492k = c8492k2;
            }
            InterfaceC8487f.m32659y0(interfaceC8487f, this.f32401u, abstractC7078g12, this.f32387g, c8492k, null, 0, 48, null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC7078g1 m37160e() {
        return this.f32383c;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC7158w2 m37161f() {
        return (InterfaceC7158w2) this.f32403w.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC7078g1 m37162g() {
        return this.f32389i;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC7144t2 m37163h() {
        InterfaceC7144t2 interfaceC7144t2 = this.f32402v;
        if (interfaceC7144t2 != null) {
            return interfaceC7144t2;
        }
        InterfaceC7144t2 interfaceC7144t2M28224a = AbstractC7147u0.m28224a();
        this.f32402v = interfaceC7144t2M28224a;
        return interfaceC7144t2M28224a;
    }

    /* JADX INFO: renamed from: i */
    public final void m37164i(AbstractC7078g1 abstractC7078g1) {
        this.f32383c = abstractC7078g1;
        m37249c();
    }

    /* JADX INFO: renamed from: j */
    public final void m37165j(float f10) {
        this.f32384d = f10;
        m37249c();
    }

    /* JADX INFO: renamed from: k */
    public final void m37166k(String str) {
        this.f32382b = str;
        m37249c();
    }

    /* JADX INFO: renamed from: l */
    public final void m37167l(List list) {
        this.f32385e = list;
        this.f32396p = true;
        m37249c();
    }

    /* JADX INFO: renamed from: m */
    public final void m37168m(int i10) {
        this.f32386f = i10;
        this.f32401u.mo28177j(i10);
        m37249c();
    }

    /* JADX INFO: renamed from: n */
    public final void m37169n(AbstractC7078g1 abstractC7078g1) {
        this.f32389i = abstractC7078g1;
        m37249c();
    }

    /* JADX INFO: renamed from: o */
    public final void m37170o(float f10) {
        this.f32387g = f10;
        m37249c();
    }

    /* JADX INFO: renamed from: p */
    public final void m37171p(int i10) {
        this.f32390j = i10;
        this.f32397q = true;
        m37249c();
    }

    /* JADX INFO: renamed from: q */
    public final void m37172q(int i10) {
        this.f32391k = i10;
        this.f32397q = true;
        m37249c();
    }

    /* JADX INFO: renamed from: r */
    public final void m37173r(float f10) {
        this.f32392l = f10;
        this.f32397q = true;
        m37249c();
    }

    /* JADX INFO: renamed from: s */
    public final void m37174s(float f10) {
        this.f32388h = f10;
        this.f32397q = true;
        m37249c();
    }

    /* JADX INFO: renamed from: t */
    public final void m37175t(float f10) {
        this.f32394n = f10;
        this.f32398r = true;
        m37249c();
    }

    public String toString() {
        return this.f32400t.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m37176u(float f10) {
        this.f32395o = f10;
        this.f32398r = true;
        m37249c();
    }

    /* JADX INFO: renamed from: v */
    public final void m37177v(float f10) {
        this.f32393m = f10;
        this.f32398r = true;
        m37249c();
    }

    /* JADX INFO: renamed from: w */
    public final void m37178w() {
        AbstractC9523k.m37248c(this.f32385e, this.f32400t);
        m37179x();
    }

    /* JADX INFO: renamed from: x */
    public final void m37179x() {
        if (this.f32393m == 0.0f && this.f32394n == 1.0f) {
            this.f32401u = this.f32400t;
            return;
        }
        if (AbstractC1061t.m3842c(this.f32401u, this.f32400t)) {
            this.f32401u = AbstractC7147u0.m28224a();
        } else {
            int iMo28179l = this.f32401u.mo28179l();
            this.f32401u.mo28183p();
            this.f32401u.mo28177j(iMo28179l);
        }
        m37161f().mo28195a(this.f32400t, false);
        float length = m37161f().getLength();
        float f10 = this.f32393m;
        float f11 = this.f32395o;
        float f12 = ((f10 + f11) % 1.0f) * length;
        float f13 = ((this.f32394n + f11) % 1.0f) * length;
        if (f12 <= f13) {
            m37161f().mo28196b(f12, f13, this.f32401u, true);
            return;
        }
        InterfaceC7144t2 interfaceC7144t2M37163h = m37163h();
        interfaceC7144t2M37163h.reset();
        m37161f().mo28196b(f12, length, interfaceC7144t2M37163h, true);
        InterfaceC7144t2.m28218e(this.f32401u, interfaceC7144t2M37163h, 0L, 2, null);
        interfaceC7144t2M37163h.reset();
        m37161f().mo28196b(0.0f, f13, interfaceC7144t2M37163h, true);
        InterfaceC7144t2.m28218e(this.f32401u, interfaceC7144t2M37163h, 0L, 2, null);
    }
}
