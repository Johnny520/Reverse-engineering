package p119i1;

import java.util.Map;
import p010a9.InterfaceC0184l;
import p134j1.AbstractC3498b;
import p134j1.C3497a;
import p172l8.C4699i;
import p172l8.C4711r;
import p364z0.InterfaceC9827e;

/* JADX INFO: renamed from: i1.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3125f extends AbstractC3137l {

    /* JADX INFO: renamed from: g */
    public final InterfaceC0184l f8327g;

    /* JADX INFO: renamed from: h */
    public final AbstractC3137l f8328h;

    public C3125f(long j10, C3147q c3147q, InterfaceC0184l interfaceC0184l, AbstractC3137l abstractC3137l) {
        super(j10, c3147q, null);
        this.f8327g = interfaceC0184l;
        this.f8328h = abstractC3137l;
        abstractC3137l.mo11660m(this);
    }

    /* JADX INFO: renamed from: A */
    public final AbstractC3137l m11714A() {
        return this.f8328h;
    }

    @Override // p119i1.AbstractC3137l
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public InterfaceC0184l mo11676g() {
        return this.f8327g;
    }

    @Override // p119i1.AbstractC3137l
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public Void mo11660m(AbstractC3137l abstractC3137l) {
        AbstractC3130h0.m11750b();
        throw new C4699i();
    }

    @Override // p119i1.AbstractC3137l
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public Void mo11661n(AbstractC3137l abstractC3137l) {
        AbstractC3130h0.m11750b();
        throw new C4699i();
    }

    @Override // p119i1.AbstractC3137l
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public Void mo11681p(InterfaceC3158v0 interfaceC3158v0) {
        AbstractC3159w.m11901b0();
        throw new C4699i();
    }

    @Override // p119i1.AbstractC3137l
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public C3125f mo11663x(InterfaceC0184l interfaceC0184l) {
        Map map;
        InterfaceC9827e interfaceC9827e = AbstractC3498b.f9713a;
        if (interfaceC9827e != null) {
            C4711r c4711rM13035e = AbstractC3498b.m13035e(interfaceC9827e, this, true, interfaceC0184l, null);
            C3497a c3497a = (C3497a) c4711rM13035e.m18795e();
            InterfaceC0184l interfaceC0184lM13029a = c3497a.m13029a();
            c3497a.m13030b();
            map = (Map) c4711rM13035e.m18796f();
            interfaceC0184l = interfaceC0184lM13029a;
        } else {
            map = null;
        }
        C3125f c3125f = new C3125f(mo11678i(), mo11675f(), AbstractC3159w.m11885N(interfaceC0184l, mo11676g(), false, 4, null), m11714A());
        if (interfaceC9827e != null) {
            AbstractC3498b.m13032b(interfaceC9827e, this, c3125f, map);
        }
        return c3125f;
    }

    @Override // p119i1.AbstractC3137l
    /* JADX INFO: renamed from: d */
    public void mo11659d() {
        if (m11754e()) {
            return;
        }
        if (mo11678i() != this.f8328h.mo11678i()) {
            m11753b();
        }
        this.f8328h.mo11661n(this);
        super.mo11659d();
        AbstractC3498b.m13034d(this);
    }

    @Override // p119i1.AbstractC3137l
    /* JADX INFO: renamed from: h */
    public boolean mo11677h() {
        return true;
    }

    @Override // p119i1.AbstractC3137l
    /* JADX INFO: renamed from: k */
    public InterfaceC0184l mo11680k() {
        return null;
    }

    @Override // p119i1.AbstractC3137l
    /* JADX INFO: renamed from: o */
    public void mo11662o() {
    }
}
