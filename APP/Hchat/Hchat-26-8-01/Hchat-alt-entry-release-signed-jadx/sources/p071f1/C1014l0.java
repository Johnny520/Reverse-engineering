package p071f1;

import be.AbstractC0283h;
import p057e1.C0808c;
import p057e1.C0809d;

/* JADX INFO: renamed from: f1.l0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1014l0 extends AbstractC0996c0 {

    /* JADX INFO: renamed from: f */
    public final C0809d f3198f;

    /* JADX INFO: renamed from: g */
    public final C1009j f3199g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1014l0(C0809d c0809d) {
        C1009j c1009jM2609a;
        this.f3198f = c0809d;
        if (AbstractC0283h.m1124D(c0809d)) {
            c1009jM2609a = null;
        } else {
            c1009jM2609a = AbstractC1013l.m2609a();
            C1009j.m2601c(c1009jM2609a, c0809d);
        }
        this.f3199g = c1009jM2609a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1014l0) {
            return this.f3198f.equals(((C1014l0) obj).f3198f);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3198f.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.AbstractC0996c0
    /* JADX INFO: renamed from: k */
    public final C0808c mo2530k() {
        C0809d c0809d = this.f3198f;
        return new C0808c(c0809d.f2420a, c0809d.f2421b, c0809d.f2422c, c0809d.f2423d);
    }
}
