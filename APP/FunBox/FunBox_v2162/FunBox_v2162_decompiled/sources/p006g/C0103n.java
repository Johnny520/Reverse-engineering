package p006g;

import p000a.AbstractC0001b;
import p004e.C0032i;
import p010k.C0187q;
import p011l.C0194b;
import p013n.C0202d;

/* JADX INFO: renamed from: g.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0103n extends AbstractC0102m implements Comparable {

    /* JADX INFO: renamed from: b */
    private final C0187q f403b;

    /* JADX INFO: renamed from: c */
    private final C0096g f404c;

    public C0103n(C0187q c0187q, int i2, C0032i c0032i, C0194b c0194b) {
        super(i2);
        if (c0187q == null) {
            throw new NullPointerException("method == null");
        }
        this.f403b = c0187q;
        if (c0032i == null) {
            this.f404c = null;
        } else {
            this.f404c = new C0096g(c0187q, c0032i, (i2 & 8) != 0, c0194b);
        }
    }

    @Override // p013n.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        return this.f403b.mo107a();
    }

    @Override // p006g.AbstractC0102m
    /* JADX INFO: renamed from: b */
    public final int mo312b(C0100k c0100k, C0202d c0202d, int i2, int i3) {
        C0115z c0115zM303m = c0100k.m303m();
        C0187q c0187q = this.f403b;
        int iM338q = c0115zM303m.m338q(c0187q);
        int i4 = iM338q - i2;
        int iM313e = m313e();
        C0096g c0096g = this.f404c;
        int iM235f = c0096g == null ? 0 : c0096g.m235f();
        if ((iM235f != 0) != ((iM313e & 1280) == 0)) {
            throw new UnsupportedOperationException("code vs. access_flags mismatch");
        }
        if (c0202d.m486d()) {
            c0202d.m484b(0, String.format("  [%x] %s", Integer.valueOf(i3), c0187q.mo107a()));
            c0202d.m484b(AbstractC0001b.m15u(i4), "    method_idx:   ".concat(AbstractC0001b.m13s(iM338q)));
            c0202d.m484b(AbstractC0001b.m15u(iM313e), "    access_flags: " + AbstractC0001b.m8m(iM313e));
            c0202d.m484b(AbstractC0001b.m15u(iM235f), "    code_off:     ".concat(AbstractC0001b.m13s(iM235f)));
        }
        c0202d.m500t(i4);
        c0202d.m500t(iM313e);
        c0202d.m500t(iM235f);
        return iM338q;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f403b.compareTo(((C0103n) obj).f403b);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0103n) && this.f403b.compareTo(((C0103n) obj).f403b) == 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m314f(C0100k c0100k) {
        C0115z c0115zM303m = c0100k.m303m();
        C0079B c0079bM309s = c0100k.m309s();
        c0115zM303m.m339r(this.f403b);
        C0096g c0096g = this.f404c;
        if (c0096g != null) {
            c0079bM309s.m229o(c0096g);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C0103n.class.getName());
        sb.append('{');
        sb.append(AbstractC0001b.m11q(m313e()));
        sb.append(' ');
        sb.append(this.f403b);
        C0096g c0096g = this.f404c;
        if (c0096g != null) {
            sb.append(' ');
            sb.append(c0096g);
        }
        sb.append('}');
        return sb.toString();
    }
}
