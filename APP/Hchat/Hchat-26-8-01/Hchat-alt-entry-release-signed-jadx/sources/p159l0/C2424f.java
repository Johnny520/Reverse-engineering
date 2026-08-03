package p159l0;

import p219oh.AbstractC3165h;

/* JADX INFO: renamed from: l0.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2424f extends AbstractC3165h {

    /* JADX INFO: renamed from: c */
    public final AbstractC3165h f7933c;

    /* JADX INFO: renamed from: d */
    public final int f7934d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2424f(AbstractC3165h abstractC3165h, int i9) {
        this.f7933c = abstractC3165h;
        this.f7934d = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2424f)) {
            return false;
        }
        C2424f c2424f = (C2424f) obj;
        return c2424f.f7933c.equals(this.f7933c) && c2424f.f7934d == this.f7934d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f7933c.hashCode() + (this.f7934d * 31);
    }
}
