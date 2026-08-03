package p006g;

import p000a.AbstractC0001b;
import p010k.C0190t;
import p013n.C0202d;

/* JADX INFO: renamed from: g.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0084G extends AbstractC0107r implements Comparable {

    /* JADX INFO: renamed from: b */
    private final C0190t f325b;

    /* JADX INFO: renamed from: c */
    private C0083F f326c;

    public C0084G(C0190t c0190t) {
        if (c0190t == null) {
            throw new NullPointerException("value == null");
        }
        this.f325b = c0190t;
        this.f326c = null;
    }

    @Override // p006g.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k c0100k) {
        if (this.f326c == null) {
            C0079B c0079bM305o = c0100k.m305o();
            C0083F c0083f = new C0083F(this.f325b);
            this.f326c = c0083f;
            c0079bM305o.m229o(c0083f);
        }
    }

    @Override // p006g.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f409e;
    }

    @Override // p006g.AbstractC0108s
    /* JADX INFO: renamed from: c */
    public final int mo232c() {
        return 4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f325b.compareTo(((C0084G) obj).f325b);
    }

    @Override // p006g.AbstractC0108s
    /* JADX INFO: renamed from: d */
    public final void mo233d(C0100k c0100k, C0202d c0202d) {
        String str;
        int iM235f = this.f326c.m235f();
        if (c0202d.m486d()) {
            StringBuilder sb = new StringBuilder();
            sb.append(m319g());
            sb.append(' ');
            String strMo107a = this.f325b.mo107a();
            if (strMo107a.length() <= 98) {
                str = "";
            } else {
                strMo107a = strMo107a.substring(0, 95);
                str = "...";
            }
            sb.append("\"" + strMo107a + str + '\"');
            c0202d.m484b(0, sb.toString());
            c0202d.m484b(4, "  string_data_off: ".concat(AbstractC0001b.m13s(iM235f)));
        }
        c0202d.m497q(iM235f);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0084G) {
            return this.f325b.equals(((C0084G) obj).f325b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f325b.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final C0190t m253i() {
        return this.f325b;
    }
}
