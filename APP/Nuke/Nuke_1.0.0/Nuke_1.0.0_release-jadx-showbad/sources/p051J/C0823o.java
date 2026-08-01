package p051J;

import p000A.C0078o0;
import p041H0.AbstractC0582a0;
import p058L.C0920W;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;
import p238t.AbstractC3204b;

/* JADX INFO: renamed from: J.o */
/* JADX INFO: loaded from: classes.dex */
final class C0823o extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final C0811c f2642a;

    /* JADX INFO: renamed from: b */
    public final C0078o0 f2643b;

    /* JADX INFO: renamed from: c */
    public final C0920W f2644c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0823o(C0811c c0811c, C0078o0 c0078o0, C0920W c0920w) {
        this.f2642a = c0811c;
        this.f2643b = c0078o0;
        this.f2644c = c0920w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        return new C0824p(this.f2642a, this.f2643b, this.f2644c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0823o)) {
            return false;
        }
        C0823o c0823o = (C0823o) obj;
        return AbstractC1665j.m2981a(this.f2642a, c0823o.f2642a) && AbstractC1665j.m2981a(this.f2643b, c0823o.f2643b) && AbstractC1665j.m2981a(this.f2644c, c0823o.f2644c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C0824p c0824p = (C0824p) abstractC2206o;
        if (c0824p.f7199q) {
            c0824p.f2645r.mo1417g();
            c0824p.f2645r.m1421k(c0824p);
        }
        C0811c c0811c = this.f2642a;
        c0824p.f2645r = c0811c;
        if (c0824p.f7199q) {
            if (c0811c.f2606a != null) {
                AbstractC3204b.m5477c("Expected textInputModifierNode to be null");
            }
            c0811c.f2606a = c0824p;
        }
        c0824p.f2646s = this.f2643b;
        c0824p.f2647t = this.f2644c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2644c.hashCode() + ((this.f2643b.hashCode() + (this.f2642a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f2642a + ", legacyTextFieldState=" + this.f2643b + ", textFieldSelectionManager=" + this.f2644c + ')';
    }
}
