package p218og;

import p172lg.C2564d;

/* JADX INFO: renamed from: og.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3141e {

    /* JADX INFO: renamed from: a */
    public final String f10195a;

    /* JADX INFO: renamed from: b */
    public final C2564d f10196b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3141e(String str, C2564d c2564d) {
        this.f10195a = str;
        this.f10196b = c2564d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3141e)) {
            return false;
        }
        C3141e c3141e = (C3141e) obj;
        return this.f10195a.equals(c3141e.f10195a) && this.f10196b.equals(c3141e.f10196b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10196b.hashCode() + (this.f10195a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MatchGroup(value=" + this.f10195a + ", range=" + this.f10196b + ')';
    }
}
