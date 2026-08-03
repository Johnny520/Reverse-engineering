package p071f1;

import p057e1.C0808c;

/* JADX INFO: renamed from: f1.k0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1012k0 extends AbstractC0996c0 {

    /* JADX INFO: renamed from: f */
    public final C0808c f3197f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1012k0(C0808c c0808c) {
        this.f3197f = c0808c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1012k0) {
            return this.f3197f.equals(((C1012k0) obj).f3197f);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3197f.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.AbstractC0996c0
    /* JADX INFO: renamed from: k */
    public final C0808c mo2530k() {
        return this.f3197f;
    }
}
