package p051J;

import p000A.C0042V0;
import p000A.C0078o0;
import p011B4.AbstractC0231b;
import p041H0.AbstractC0582a0;
import p041H0.AbstractC0601k;
import p058L.C0920W;
import p092S0.C1259L;
import p115X0.C1624B;
import p115X0.C1636k;
import p115X0.C1646u;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;
import p198m0.C2590u;

/* JADX INFO: renamed from: J.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0813e extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final C1624B f2612a;

    /* JADX INFO: renamed from: b */
    public final C1646u f2613b;

    /* JADX INFO: renamed from: c */
    public final C0078o0 f2614c;

    /* JADX INFO: renamed from: d */
    public final boolean f2615d;

    /* JADX INFO: renamed from: e */
    public final C0042V0 f2616e;

    /* JADX INFO: renamed from: f */
    public final C0920W f2617f;

    /* JADX INFO: renamed from: g */
    public final C1636k f2618g;

    /* JADX INFO: renamed from: h */
    public final C2590u f2619h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0813e(C1624B c1624b, C1646u c1646u, C0078o0 c0078o0, boolean z5, C0042V0 c0042v0, C0920W c0920w, C1636k c1636k, C2590u c2590u) {
        this.f2612a = c1624b;
        this.f2613b = c1646u;
        this.f2614c = c0078o0;
        this.f2615d = z5;
        this.f2616e = c0042v0;
        this.f2617f = c0920w;
        this.f2618g = c1636k;
        this.f2619h = c2590u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C0816h c0816h = new C0816h();
        c0816h.f2625t = this.f2612a;
        c0816h.f2626u = this.f2613b;
        c0816h.f2627v = this.f2614c;
        c0816h.f2628w = this.f2615d;
        c0816h.f2629x = this.f2616e;
        C0920W c0920w = this.f2617f;
        c0816h.f2630y = c0920w;
        c0816h.f2631z = this.f2618g;
        c0816h.f2624A = this.f2619h;
        c0920w.f2870f = new C0814f(c0816h, 4);
        return c0816h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0813e)) {
            return false;
        }
        C0813e c0813e = (C0813e) obj;
        return this.f2612a.equals(c0813e.f2612a) && this.f2613b.equals(c0813e.f2613b) && this.f2614c.equals(c0813e.f2614c) && this.f2615d == c0813e.f2615d && AbstractC1665j.m2981a(this.f2616e, c0813e.f2616e) && this.f2617f.equals(c0813e.f2617f) && AbstractC1665j.m2981a(this.f2618g, c0813e.f2618g) && AbstractC1665j.m2981a(this.f2619h, c0813e.f2619h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C0816h c0816h = (C0816h) abstractC2206o;
        boolean z5 = c0816h.f2628w;
        C1636k c1636k = c0816h.f2631z;
        C0920W c0920w = c0816h.f2630y;
        c0816h.f2625t = this.f2612a;
        C1646u c1646u = this.f2613b;
        c0816h.f2626u = c1646u;
        c0816h.f2627v = this.f2614c;
        boolean z6 = this.f2615d;
        c0816h.f2628w = z6;
        c0816h.f2629x = this.f2616e;
        C0920W c0920w2 = this.f2617f;
        c0816h.f2630y = c0920w2;
        C1636k c1636k2 = this.f2618g;
        c0816h.f2631z = c1636k2;
        c0816h.f2624A = this.f2619h;
        if (z6 != z5 || z6 != z5 || !AbstractC1665j.m2981a(c1636k2, c1636k) || !C1259L.m2335c(c1646u.f5651b)) {
            AbstractC0601k.m1036l(c0816h);
        }
        if (c0920w2.equals(c0920w)) {
            return;
        }
        c0920w2.f2870f = new C0814f(c0816h, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2619h.hashCode() + ((this.f2618g.hashCode() + ((this.f2617f.hashCode() + ((this.f2616e.hashCode() + AbstractC0231b.m395f(AbstractC0231b.m395f(AbstractC0231b.m395f((this.f2614c.hashCode() + ((this.f2613b.hashCode() + (this.f2612a.hashCode() * 31)) * 31)) * 31, 31, false), 31, this.f2615d), 31, false)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f2612a + ", value=" + this.f2613b + ", state=" + this.f2614c + ", readOnly=false, enabled=" + this.f2615d + ", isPassword=false, offsetMapping=" + this.f2616e + ", manager=" + this.f2617f + ", imeOptions=" + this.f2618g + ", focusRequester=" + this.f2619h + ')';
    }
}
