package p006g;

import p000a.AbstractC0001b;
import p010k.C0190t;
import p011l.C0193a;
import p011l.C0194b;
import p013n.C0202d;

/* JADX INFO: renamed from: g.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0081D extends AbstractC0107r {

    /* JADX INFO: renamed from: b */
    private final C0193a f316b;

    /* JADX INFO: renamed from: c */
    private final C0190t f317c;

    /* JADX INFO: renamed from: d */
    private C0086I f318d;

    public C0081D(C0193a c0193a) {
        if (c0193a == null) {
            throw new NullPointerException("prototype == null");
        }
        this.f316b = c0193a;
        C0194b c0194bM457d = c0193a.m457d();
        int iM504B = c0194bM457d.m504B();
        StringBuilder sb = new StringBuilder(iM504B + 1);
        char cCharAt = c0193a.m458e().m471h().charAt(0);
        sb.append(cCharAt == '[' ? 'L' : cCharAt);
        for (int i2 = 0; i2 < iM504B; i2++) {
            char cCharAt2 = c0194bM457d.m515r(i2).m471h().charAt(0);
            if (cCharAt2 == '[') {
                cCharAt2 = 'L';
            }
            sb.append(cCharAt2);
        }
        this.f317c = new C0190t(sb.toString());
        C0194b c0194bM457d2 = c0193a.m457d();
        this.f318d = c0194bM457d2.m504B() == 0 ? null : new C0086I(c0194bM457d2);
    }

    @Override // p006g.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k c0100k) {
        C0113x c0113xM306p = c0100k.m306p();
        C0113x c0113xM307q = c0100k.m307q();
        C0079B c0079bM308r = c0100k.m308r();
        c0113xM307q.m335x(this.f316b.m458e());
        c0113xM306p.m332u(this.f317c);
        C0086I c0086i = this.f318d;
        if (c0086i != null) {
            this.f318d = (C0086I) c0079bM308r.m230p(c0086i);
        }
    }

    @Override // p006g.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f411g;
    }

    @Override // p006g.AbstractC0108s
    /* JADX INFO: renamed from: c */
    public final int mo232c() {
        return 12;
    }

    @Override // p006g.AbstractC0108s
    /* JADX INFO: renamed from: d */
    public final void mo233d(C0100k c0100k, C0202d c0202d) {
        C0113x c0113xM306p = c0100k.m306p();
        C0190t c0190t = this.f317c;
        int iM328q = c0113xM306p.m328q(c0190t);
        C0113x c0113xM307q = c0100k.m307q();
        C0193a c0193a = this.f316b;
        int iM331t = c0113xM307q.m331t(c0193a.m458e());
        C0086I c0086i = this.f318d;
        int iM235f = c0086i == null ? 0 : c0086i.m235f();
        if (c0202d.m486d()) {
            StringBuilder sb = new StringBuilder();
            sb.append(c0193a.m458e().mo107a());
            sb.append(" proto(");
            C0194b c0194bM457d = c0193a.m457d();
            int iM504B = c0194bM457d.m504B();
            for (int i2 = 0; i2 < iM504B; i2++) {
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(c0194bM457d.m515r(i2).mo107a());
            }
            sb.append(")");
            c0202d.m484b(0, m319g() + ' ' + sb.toString());
            c0202d.m484b(4, "  shorty_idx:      " + AbstractC0001b.m13s(iM328q) + " // " + c0190t.m448k());
            c0202d.m484b(4, "  return_type_idx: " + AbstractC0001b.m13s(iM331t) + " // " + c0193a.m458e().mo107a());
            c0202d.m484b(4, "  parameters_off:  ".concat(AbstractC0001b.m13s(iM235f)));
        }
        c0202d.m497q(iM328q);
        c0202d.m497q(iM331t);
        c0202d.m497q(iM235f);
    }
}
