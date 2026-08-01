package p119i1;

import p010a9.InterfaceC0184l;
import p057e1.AbstractC1998z;
import p172l8.C4699i;

/* JADX INFO: renamed from: i1.c1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3120c1 extends AbstractC3137l {

    /* JADX INFO: renamed from: g */
    public final AbstractC3137l f8302g;

    /* JADX INFO: renamed from: h */
    public final boolean f8303h;

    /* JADX INFO: renamed from: i */
    public final boolean f8304i;

    /* JADX INFO: renamed from: j */
    public InterfaceC0184l f8305j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC0184l f8306k;

    /* JADX INFO: renamed from: l */
    public final long f8307l;

    /* JADX INFO: renamed from: m */
    public final AbstractC3137l f8308m;

    public C3120c1(AbstractC3137l abstractC3137l, InterfaceC0184l interfaceC0184l, boolean z10, boolean z11) {
        InterfaceC0184l interfaceC0184lMo11676g;
        super(AbstractC3159w.f8424b, C3147q.f8395u.m11851a(), null);
        this.f8302g = abstractC3137l;
        this.f8303h = z10;
        this.f8304i = z11;
        this.f8305j = AbstractC3159w.m11884M(interfaceC0184l, (abstractC3137l == null || (interfaceC0184lMo11676g = abstractC3137l.mo11676g()) == null) ? AbstractC3159w.f8433k.mo11676g() : interfaceC0184lMo11676g, z10);
        this.f8307l = AbstractC1998z.m7206a();
        this.f8308m = this;
    }

    /* JADX INFO: renamed from: A */
    public final AbstractC3137l m11690A() {
        AbstractC3137l abstractC3137l = this.f8302g;
        return abstractC3137l == null ? AbstractC3159w.f8433k : abstractC3137l;
    }

    @Override // p119i1.AbstractC3137l
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public InterfaceC0184l mo11676g() {
        return this.f8305j;
    }

    /* JADX INFO: renamed from: C */
    public final long m11692C() {
        return this.f8307l;
    }

    @Override // p119i1.AbstractC3137l
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public Void mo11660m(AbstractC3137l abstractC3137l) {
        AbstractC3130h0.m11750b();
        throw new C4699i();
    }

    @Override // p119i1.AbstractC3137l
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public Void mo11661n(AbstractC3137l abstractC3137l) {
        AbstractC3130h0.m11750b();
        throw new C4699i();
    }

    /* JADX INFO: renamed from: F */
    public void m11695F(InterfaceC0184l interfaceC0184l) {
        this.f8305j = interfaceC0184l;
    }

    @Override // p119i1.AbstractC3137l
    /* JADX INFO: renamed from: d */
    public void mo11659d() {
        AbstractC3137l abstractC3137l;
        m11758t(true);
        if (!this.f8304i || (abstractC3137l = this.f8302g) == null) {
            return;
        }
        abstractC3137l.mo11659d();
    }

    @Override // p119i1.AbstractC3137l
    /* JADX INFO: renamed from: f */
    public C3147q mo11675f() {
        return m11690A().mo11675f();
    }

    @Override // p119i1.AbstractC3137l
    /* JADX INFO: renamed from: h */
    public boolean mo11677h() {
        return m11690A().mo11677h();
    }

    @Override // p119i1.AbstractC3137l
    /* JADX INFO: renamed from: i */
    public long mo11678i() {
        return m11690A().mo11678i();
    }

    @Override // p119i1.AbstractC3137l
    /* JADX INFO: renamed from: k */
    public InterfaceC0184l mo11680k() {
        return this.f8306k;
    }

    @Override // p119i1.AbstractC3137l
    /* JADX INFO: renamed from: o */
    public void mo11662o() {
        m11690A().mo11662o();
    }

    @Override // p119i1.AbstractC3137l
    /* JADX INFO: renamed from: p */
    public void mo11681p(InterfaceC3158v0 interfaceC3158v0) {
        m11690A().mo11681p(interfaceC3158v0);
    }

    @Override // p119i1.AbstractC3137l
    /* JADX INFO: renamed from: x */
    public AbstractC3137l mo11663x(InterfaceC0184l interfaceC0184l) {
        InterfaceC0184l interfaceC0184lM11885N = AbstractC3159w.m11885N(interfaceC0184l, mo11676g(), false, 4, null);
        return !this.f8303h ? AbstractC3159w.m11878G(m11690A().mo11663x(null), interfaceC0184lM11885N, true) : m11690A().mo11663x(interfaceC0184lM11885N);
    }
}
