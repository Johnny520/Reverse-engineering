package p229p7;

import p222p.AbstractC3199a;
import p243q9.C3465a;
import p257r7.AbstractC3712b;
import p257r7.AbstractC3729s;
import p257r7.C3711a;
import p257r7.C3713c;
import p257r7.C3716f;
import p273s7.C3938g;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: p7.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3339i extends C3331a {

    /* JADX INFO: renamed from: r */
    public final C3716f f10742r;

    /* JADX INFO: renamed from: s */
    public final C3716f f10743s;

    /* JADX INFO: renamed from: t */
    public final C3713c f10744t;

    /* JADX INFO: renamed from: u */
    public final C3713c f10745u;

    /* JADX INFO: renamed from: v */
    public final C3711a f10746v;

    /* JADX INFO: renamed from: w */
    public final C3716f f10747w;

    /* JADX INFO: renamed from: x */
    public final C3716f f10748x;

    /* JADX INFO: renamed from: y */
    public C3465a f10749y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3339i() {
        super((short) 1);
        C3716f c3716f = new C3716f(false);
        this.f10742r = c3716f;
        C3716f c3716f2 = new C3716f(false);
        this.f10743s = c3716f2;
        C3713c c3713c = new C3713c(1, 1);
        this.f10744t = c3713c;
        C3713c c3713c2 = new C3713c(1, 1);
        this.f10745u = c3713c2;
        C3711a c3711a = new C3711a(1, false);
        this.f10746v = c3711a;
        C3716f c3716f3 = new C3716f(false);
        this.f10747w = c3716f3;
        C3716f c3716f4 = new C3716f(false);
        this.f10748x = c3716f4;
        m6539P(c3716f);
        m6539P(c3716f2);
        m6539P(c3713c);
        m6539P(c3713c2);
        m6539P(c3711a);
        m6539P(c3716f3);
        m6539P(c3716f4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public final void m7055T(boolean z9) {
        C3465a c3465a;
        C3713c c3713c = this.f10745u;
        boolean z10 = ((c3713c.f12076k[0] & 1) != 0) != z9;
        c3713c.m7719P(z9 ? (byte) 1 : (byte) 0);
        if (!z10 || (c3465a = this.f10749y) == null) {
            return;
        }
        C3938g c3938g = (C3938g) c3465a.f11234h;
        int size = c3938g.f9926k.size();
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC3729s abstractC3729s = (AbstractC3729s) c3938g.m6524Q(i9);
            if (z9 != abstractC3729s.f12104o) {
                abstractC3729s.f12104o = z9;
                if (abstractC3729s.mo5551p() != 0) {
                    String str = abstractC3729s.f12101m;
                    abstractC3729s.f12101m = str;
                    byte[] bArrMo7724V = abstractC3729s.mo7724V(str);
                    if (bArrMo7724V == null || bArrMo7724V.length == 0) {
                        bArrMo7724V = AbstractC3712b.f12075l;
                    }
                    if (bArrMo7724V != abstractC3729s.f12076k) {
                        abstractC3729s.f12076k = bArrMo7724V;
                    }
                }
            }
        }
        c3938g.f12917p = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229p7.C3331a
    public final String toString() {
        if (m7051Q() != 2) {
            return super.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C3339i.class.getSimpleName());
        sb2.append(" {strings=");
        sb2.append(this.f10742r);
        sb2.append(", styles=");
        sb2.append(this.f10743s);
        sb2.append(", utf8=");
        sb2.append((this.f10745u.f12076k[0] & 1) != 0);
        sb2.append(", sorted=");
        sb2.append((this.f10744t.f12076k[0] & 1) != 0);
        sb2.append(", flagExtra=");
        sb2.append(AbstractC5999a.m10752o((short) this.f10746v.f12074o));
        sb2.append(", offset-strings=");
        sb2.append(this.f10747w.f12083n);
        sb2.append(", offset-styles=");
        return AbstractC3199a.m6841n(sb2, this.f10748x.f12083n, '}');
    }
}
