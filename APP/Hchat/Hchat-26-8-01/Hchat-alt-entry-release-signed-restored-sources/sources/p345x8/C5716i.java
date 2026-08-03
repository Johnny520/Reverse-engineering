package p345x8;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: x8.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5716i {

    /* JADX INFO: renamed from: a */
    public final String f23251a;

    /* JADX INFO: renamed from: b */
    public final long f23252b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5716i(String str, long j3) {
        this.f23251a = str;
        this.f23252b = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5716i)) {
            return false;
        }
        C5716i c5716i = (C5716i) obj;
        return this.f23251a.equals(c5716i.f23251a) && this.f23252b == c5716i.f23252b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f23252b) + (this.f23251a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM2259v = AbstractC0921a.m2259v("SessionTarget(target=", this.f23251a, ", timestamp=", this.f23252b);
        sbM2259v.append(")");
        return sbM2259v.toString();
    }
}
