package p267s1;

import gg.AbstractC1416l;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: s1.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3908n extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final C3883a f12827a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3908n(C3883a c3883a) {
        this.f12827a = c3883a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3908n) && this.f12827a.equals(((C3908n) obj).f12827a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        return new C3909o(this.f12827a, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C3909o c3909o = (C3909o) abstractC5852n;
        C3883a c3883a = c3909o.f12765v;
        C3883a c3883a2 = this.f12827a;
        if (AbstractC1416l.m3825a(c3883a, c3883a2)) {
            return;
        }
        c3909o.f12765v = c3883a2;
        if (c3909o.f12766w) {
            c3909o.m8082m1();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f12827a.f12740b * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f12827a + ", overrideDescendants=false)";
    }
}
