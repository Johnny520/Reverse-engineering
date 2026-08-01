package p239q5;

import p239q5.AbstractC6257h;
import p254r5.AbstractC6487a;
import p254r5.C6510o;
import p269s5.C7187b;
import p269s5.C7188c;
import p269s5.InterfaceC7189d;
import p269s5.InterfaceC7190e;
import p376zd.C9987e;

/* JADX INFO: renamed from: q5.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6265p extends AbstractC6257h {
    public C6265p(C6270u c6270u, C6274y c6274y, C6267r c6267r, C6268s c6268s) {
        super(c6270u, c6274y, c6267r, c6268s);
        int iM24796b = c6270u.m24796b();
        if (iM24796b == 5 || iM24796b == 6) {
            C6264o.m24729a("opcode with invalid branchingness: ", c6270u.m24796b());
            throw null;
        }
        if (c6267r == null || c6270u.m24796b() == 1) {
            return;
        }
        C9987e.m38645a("can't mix branchingness with result");
        throw null;
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: a */
    public void mo24658a(AbstractC6257h.b bVar) {
        bVar.mo15699c(this);
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: e */
    public InterfaceC7190e mo24659e() {
        return C7187b.f23814s;
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: s */
    public AbstractC6257h mo24661s(C7188c c7188c) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: t */
    public AbstractC6257h mo24662t(C6267r c6267r, C6268s c6268s) {
        return new C6265p(m24695j(), m24696k(), c6267r, c6268s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: u */
    public AbstractC6257h mo24701u() {
        C6268s c6268sM24698o = m24698o();
        int size = c6268sM24698o.size();
        if (size != 0) {
            InterfaceC7189d interfaceC7189dM24755u = c6268sM24698o.m24769G(size - 1).m24755u();
            if (interfaceC7189dM24755u.mo6842l()) {
                AbstractC6487a abstractC6487aM25781v = (AbstractC6487a) interfaceC7189dM24755u;
                C6268s c6268sM24778R = c6268sM24698o.m24778R();
                try {
                    int iM24798d = m24695j().m24798d();
                    if (iM24798d == 15 && (abstractC6487aM25781v instanceof C6510o)) {
                        abstractC6487aM25781v = C6510o.m25781v(-((C6510o) abstractC6487aM25781v).m25782u());
                        iM24798d = 14;
                    }
                    AbstractC6487a abstractC6487a = abstractC6487aM25781v;
                    return new C6263n(AbstractC6273x.m24829V(iM24798d, m24697n(), c6268sM24778R, abstractC6487a), m24696k(), m24697n(), c6268sM24778R, abstractC6487a);
                } catch (IllegalArgumentException unused) {
                }
            } else {
                InterfaceC7189d interfaceC7189dM24755u2 = c6268sM24698o.m24769G(0).m24755u();
                if (size == 2 && interfaceC7189dM24755u2.mo6842l()) {
                    AbstractC6487a abstractC6487a2 = (AbstractC6487a) interfaceC7189dM24755u2;
                    C6268s c6268sM24777Q = c6268sM24698o.m24777Q();
                    return new C6263n(AbstractC6273x.m24829V(m24695j().m24798d(), m24697n(), c6268sM24777Q, abstractC6487a2), m24696k(), m24697n(), c6268sM24777Q, abstractC6487a2);
                }
            }
        }
        return this;
    }

    public C6265p(C6270u c6270u, C6274y c6274y, C6267r c6267r, C6267r c6267r2) {
        this(c6270u, c6274y, c6267r, C6268s.m24767J(c6267r2));
    }
}
