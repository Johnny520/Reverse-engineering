package p384ze;

import p025bc.AbstractC0255e;
import p302ud.C4305a;

/* JADX INFO: renamed from: ze.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6139a {

    /* JADX INFO: renamed from: a */
    public final C4305a f24730a;

    /* JADX INFO: renamed from: b */
    public final C4305a f24731b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6139a(C4305a c4305a, C4305a c4305a2) {
        this.f24730a = c4305a;
        this.f24731b = c4305a2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6139a)) {
            return false;
        }
        C6139a c6139a = (C6139a) obj;
        return this.f24730a.equals(c6139a.f24730a) && this.f24731b.equals(c6139a.f24731b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f24731b.f14348i * 31) + this.f24730a.f14348i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("(", String.valueOf(this.f24730a), ", ", String.valueOf(this.f24731b), ")");
    }
}
