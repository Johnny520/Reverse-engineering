package p070f0;

import gg.AbstractC1416l;
import p100h0.C1511d1;
import p201o.AbstractC3026b;
import p321w.C4629q0;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: f0.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C0983o extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final C0971c f3097a;

    /* JADX INFO: renamed from: b */
    public final C4629q0 f3098b;

    /* JADX INFO: renamed from: c */
    public final C1511d1 f3099c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0983o(C0971c c0971c, C4629q0 c4629q0, C1511d1 c1511d1) {
        this.f3097a = c0971c;
        this.f3098b = c4629q0;
        this.f3099c = c1511d1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0983o)) {
            return false;
        }
        C0983o c0983o = (C0983o) obj;
        return AbstractC1416l.m3825a(this.f3097a, c0983o.f3097a) && this.f3098b.equals(c0983o.f3098b) && this.f3099c.equals(c0983o.f3099c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        return new C0984p(this.f3097a, this.f3098b, this.f3099c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C0984p c0984p = (C0984p) abstractC5852n;
        if (c0984p.f23801t) {
            c0984p.f3100u.mo2397d();
            c0984p.f3100u.m2404k(c0984p);
        }
        C0971c c0971c = this.f3097a;
        c0984p.f3100u = c0971c;
        if (c0984p.f23801t) {
            if (c0971c.f3059a != null) {
                AbstractC3026b.m6430c("Expected textInputModifierNode to be null");
            }
            c0971c.f3059a = c0984p;
        }
        c0984p.f3101v = this.f3098b;
        c0984p.f3102w = this.f3099c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3099c.hashCode() + ((this.f3098b.hashCode() + (this.f3097a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f3097a + ", legacyTextFieldState=" + this.f3098b + ", textFieldSelectionManager=" + this.f3099c + ')';
    }
}
