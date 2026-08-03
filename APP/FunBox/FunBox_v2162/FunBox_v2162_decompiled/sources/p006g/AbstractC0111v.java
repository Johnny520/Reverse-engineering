package p006g;

import p000a.AbstractC0001b;
import p010k.AbstractC0186p;
import p010k.C0188r;
import p013n.C0202d;

/* JADX INFO: renamed from: g.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0111v extends AbstractC0106q {

    /* JADX INFO: renamed from: c */
    private final AbstractC0186p f430c;

    public AbstractC0111v(AbstractC0186p abstractC0186p) {
        super(abstractC0186p.m440g());
        this.f430c = abstractC0186p;
    }

    @Override // p006g.AbstractC0106q, p006g.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public void mo242a(C0100k c0100k) {
        super.mo242a(c0100k);
        c0100k.m306p().m332u(this.f430c.m441h().m443h());
    }

    @Override // p006g.AbstractC0108s
    /* JADX INFO: renamed from: c */
    public final int mo232c() {
        return 8;
    }

    @Override // p006g.AbstractC0108s
    /* JADX INFO: renamed from: d */
    public final void mo233d(C0100k c0100k, C0202d c0202d) {
        C0113x c0113xM307q = c0100k.m307q();
        C0113x c0113xM306p = c0100k.m306p();
        AbstractC0186p abstractC0186p = this.f430c;
        C0188r c0188rM441h = abstractC0186p.m441h();
        int iM329r = c0113xM307q.m329r(m316i());
        int iM328q = c0113xM306p.m328q(c0188rM441h.m443h());
        int iMo325k = mo325k(c0100k);
        if (c0202d.m486d()) {
            c0202d.m484b(0, m319g() + ' ' + abstractC0186p.mo107a());
            c0202d.m484b(2, "  class_idx: ".concat(AbstractC0001b.m11q(iM329r)));
            c0202d.m484b(2, String.format("  %-10s %s", mo326l() + ':', AbstractC0001b.m11q(iMo325k)));
            c0202d.m484b(4, "  name_idx:  ".concat(AbstractC0001b.m13s(iM328q)));
        }
        c0202d.m498r(iM329r);
        c0202d.m498r(iMo325k);
        c0202d.m497q(iM328q);
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC0186p m324j() {
        return this.f430c;
    }

    /* JADX INFO: renamed from: k */
    protected abstract int mo325k(C0100k c0100k);

    /* JADX INFO: renamed from: l */
    protected abstract String mo326l();
}
