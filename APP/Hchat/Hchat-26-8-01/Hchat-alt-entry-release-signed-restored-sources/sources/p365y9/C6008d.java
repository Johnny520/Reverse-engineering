package p365y9;

import p025bc.AbstractC0255e;

/* JADX INFO: renamed from: y9.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6008d {

    /* JADX INFO: renamed from: a */
    public final String f24388a;

    /* JADX INFO: renamed from: b */
    public final String f24389b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6008d(String str, String str2) {
        this.f24388a = str;
        this.f24389b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6008d)) {
            return false;
        }
        C6008d c6008d = (C6008d) obj;
        return this.f24388a.equals(c6008d.f24388a) && this.f24389b.equals(c6008d.f24389b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f24389b.hashCode() + (this.f24388a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("Target(roomId=", this.f24388a, ", sender=", this.f24389b, ")");
    }
}
