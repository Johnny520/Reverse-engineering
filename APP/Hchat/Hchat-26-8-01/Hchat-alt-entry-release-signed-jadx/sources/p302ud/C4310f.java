package p302ud;

import p025bc.AbstractC0255e;

/* JADX INFO: renamed from: ud.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4310f {

    /* JADX INFO: renamed from: a */
    public final C4305a f14387a;

    /* JADX INFO: renamed from: b */
    public final C4305a f14388b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4310f(C4305a c4305a, C4305a c4305a2) {
        this.f14387a = c4305a;
        this.f14388b = c4305a2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4310f.class != obj.getClass()) {
            return false;
        }
        C4310f c4310f = (C4310f) obj;
        return this.f14387a.equals(c4310f.f14387a) && this.f14388b.equals(c4310f.f14388b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f14388b.f14348i * 31) + this.f14387a.f14348i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1021j("Edge: ", String.valueOf(this.f14387a), " -> ", String.valueOf(this.f14388b));
    }
}
