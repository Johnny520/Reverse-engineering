package p119i1;

import p010a9.InterfaceC0184l;
import p057e1.AbstractC1998z;
import p117i.C3084s0;
import p172l8.C4699i;

/* JADX INFO: renamed from: i1.b1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3117b1 extends C3121d {

    /* JADX INFO: renamed from: s */
    public final C3121d f8295s;

    /* JADX INFO: renamed from: t */
    public final boolean f8296t;

    /* JADX INFO: renamed from: u */
    public final boolean f8297u;

    /* JADX INFO: renamed from: v */
    public InterfaceC0184l f8298v;

    /* JADX INFO: renamed from: w */
    public InterfaceC0184l f8299w;

    /* JADX INFO: renamed from: x */
    public final long f8300x;

    public C3117b1(C3121d c3121d, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, boolean z10, boolean z11) {
        InterfaceC0184l interfaceC0184lMo11680k;
        InterfaceC0184l interfaceC0184lMo11676g;
        super(AbstractC3159w.f8424b, C3147q.f8395u.m11851a(), AbstractC3159w.m11884M(interfaceC0184l, (c3121d == null || (interfaceC0184lMo11676g = c3121d.mo11676g()) == null) ? AbstractC3159w.f8433k.mo11676g() : interfaceC0184lMo11676g, z10), AbstractC3159w.m11886O(interfaceC0184l2, (c3121d == null || (interfaceC0184lMo11680k = c3121d.mo11680k()) == null) ? AbstractC3159w.f8433k.mo11680k() : interfaceC0184lMo11680k));
        this.f8295s = c3121d;
        this.f8296t = z10;
        this.f8297u = z11;
        this.f8298v = super.mo11676g();
        this.f8299w = super.mo11680k();
        this.f8300x = AbstractC1998z.m7206a();
    }

    @Override // p119i1.C3121d
    /* JADX INFO: renamed from: C */
    public AbstractC3141n mo11655C() {
        return m11669U().mo11655C();
    }

    @Override // p119i1.C3121d
    /* JADX INFO: renamed from: E */
    public C3084s0 mo11666E() {
        return m11669U().mo11666E();
    }

    @Override // p119i1.C3121d, p119i1.AbstractC3137l
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public InterfaceC0184l mo11676g() {
        return this.f8298v;
    }

    @Override // p119i1.C3121d
    /* JADX INFO: renamed from: Q */
    public void mo11668Q(C3084s0 c3084s0) {
        AbstractC3130h0.m11750b();
        throw new C4699i();
    }

    @Override // p119i1.C3121d
    /* JADX INFO: renamed from: R */
    public C3121d mo11656R(InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2) {
        InterfaceC0184l interfaceC0184lM11885N = AbstractC3159w.m11885N(interfaceC0184l, mo11676g(), false, 4, null);
        InterfaceC0184l interfaceC0184lM11886O = AbstractC3159w.m11886O(interfaceC0184l2, mo11680k());
        return !this.f8296t ? new C3117b1(m11669U().mo11656R(null, interfaceC0184lM11886O), interfaceC0184lM11885N, interfaceC0184lM11886O, false, true) : m11669U().mo11656R(interfaceC0184lM11885N, interfaceC0184lM11886O);
    }

    /* JADX INFO: renamed from: U */
    public final C3121d m11669U() {
        C3121d c3121d = this.f8295s;
        return c3121d == null ? AbstractC3159w.f8433k : c3121d;
    }

    /* JADX INFO: renamed from: V */
    public final long m11670V() {
        return this.f8300x;
    }

    @Override // p119i1.C3121d, p119i1.AbstractC3137l
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public Void mo11660m(AbstractC3137l abstractC3137l) {
        AbstractC3130h0.m11750b();
        throw new C4699i();
    }

    @Override // p119i1.C3121d, p119i1.AbstractC3137l
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public Void mo11661n(AbstractC3137l abstractC3137l) {
        AbstractC3130h0.m11750b();
        throw new C4699i();
    }

    /* JADX INFO: renamed from: Y */
    public void m11673Y(InterfaceC0184l interfaceC0184l) {
        this.f8298v = interfaceC0184l;
    }

    /* JADX INFO: renamed from: Z */
    public void m11674Z(InterfaceC0184l interfaceC0184l) {
        this.f8299w = interfaceC0184l;
    }

    @Override // p119i1.C3121d, p119i1.AbstractC3137l
    /* JADX INFO: renamed from: d */
    public void mo11659d() {
        C3121d c3121d;
        m11758t(true);
        if (!this.f8297u || (c3121d = this.f8295s) == null) {
            return;
        }
        c3121d.mo11659d();
    }

    @Override // p119i1.AbstractC3137l
    /* JADX INFO: renamed from: f */
    public C3147q mo11675f() {
        return m11669U().mo11675f();
    }

    @Override // p119i1.C3121d, p119i1.AbstractC3137l
    /* JADX INFO: renamed from: h */
    public boolean mo11677h() {
        return m11669U().mo11677h();
    }

    @Override // p119i1.AbstractC3137l
    /* JADX INFO: renamed from: i */
    public long mo11678i() {
        return m11669U().mo11678i();
    }

    @Override // p119i1.C3121d, p119i1.AbstractC3137l
    /* JADX INFO: renamed from: j */
    public int mo11679j() {
        return m11669U().mo11679j();
    }

    @Override // p119i1.C3121d, p119i1.AbstractC3137l
    /* JADX INFO: renamed from: k */
    public InterfaceC0184l mo11680k() {
        return this.f8299w;
    }

    @Override // p119i1.C3121d, p119i1.AbstractC3137l
    /* JADX INFO: renamed from: o */
    public void mo11662o() {
        m11669U().mo11662o();
    }

    @Override // p119i1.C3121d, p119i1.AbstractC3137l
    /* JADX INFO: renamed from: p */
    public void mo11681p(InterfaceC3158v0 interfaceC3158v0) {
        m11669U().mo11681p(interfaceC3158v0);
    }

    @Override // p119i1.AbstractC3137l
    /* JADX INFO: renamed from: u */
    public void mo11682u(C3147q c3147q) {
        AbstractC3130h0.m11750b();
        throw new C4699i();
    }

    @Override // p119i1.AbstractC3137l
    /* JADX INFO: renamed from: v */
    public void mo11683v(long j10) {
        AbstractC3130h0.m11750b();
        throw new C4699i();
    }

    @Override // p119i1.C3121d, p119i1.AbstractC3137l
    /* JADX INFO: renamed from: w */
    public void mo11684w(int i10) {
        m11669U().mo11684w(i10);
    }

    @Override // p119i1.C3121d, p119i1.AbstractC3137l
    /* JADX INFO: renamed from: x */
    public AbstractC3137l mo11663x(InterfaceC0184l interfaceC0184l) {
        InterfaceC0184l interfaceC0184lM11885N = AbstractC3159w.m11885N(interfaceC0184l, mo11676g(), false, 4, null);
        return !this.f8296t ? AbstractC3159w.m11878G(m11669U().mo11663x(null), interfaceC0184lM11885N, true) : m11669U().mo11663x(interfaceC0184lM11885N);
    }
}
