package p063e9;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: e9.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0839j {

    /* JADX INFO: renamed from: a */
    public final String f2550a;

    /* JADX INFO: renamed from: b */
    public final long f2551b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0839j(String str, long j3) {
        this.f2550a = str;
        this.f2551b = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0839j)) {
            return false;
        }
        C0839j c0839j = (C0839j) obj;
        return this.f2550a.equals(c0839j.f2550a) && this.f2551b == c0839j.f2551b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f2551b) + (this.f2550a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM2259v = AbstractC0921a.m2259v("NativeMessageKey(talker=", this.f2550a, ", msgSvrId=", this.f2551b);
        sbM2259v.append(")");
        return sbM2259v.toString();
    }
}
