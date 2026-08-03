package p006g;

import p000a.AbstractC0001b;
import p010k.C0190t;
import p013n.C0202d;

/* JADX INFO: renamed from: g.H */
/* JADX INFO: loaded from: classes.dex */
public final class C0085H extends AbstractC0106q {
    @Override // p006g.AbstractC0106q, p006g.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k c0100k) {
        c0100k.m306p().m332u(m316i().m452h());
    }

    @Override // p006g.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f410f;
    }

    @Override // p006g.AbstractC0108s
    /* JADX INFO: renamed from: c */
    public final int mo232c() {
        return 4;
    }

    @Override // p006g.AbstractC0108s
    /* JADX INFO: renamed from: d */
    public final void mo233d(C0100k c0100k, C0202d c0202d) {
        C0190t c0190tM452h = m316i().m452h();
        int iM328q = c0100k.m306p().m328q(c0190tM452h);
        if (c0202d.m486d()) {
            c0202d.m484b(0, m319g() + ' ' + c0190tM452h.mo107a());
            c0202d.m484b(4, "  descriptor_idx: ".concat(AbstractC0001b.m13s(iM328q)));
        }
        c0202d.m497q(iM328q);
    }
}
