package p153k8;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: k8.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2340d {

    /* JADX INFO: renamed from: a */
    public final String f7667a;

    /* JADX INFO: renamed from: b */
    public final long f7668b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2340d(String str, long j3) {
        this.f7667a = str;
        this.f7668b = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2340d)) {
            return false;
        }
        C2340d c2340d = (C2340d) obj;
        return this.f7667a.equals(c2340d.f7667a) && this.f7668b == c2340d.f7668b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f7668b) + (this.f7667a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM2259v = AbstractC0921a.m2259v("TimedInsert(talker=", this.f7667a, ", createTime=", this.f7668b);
        sbM2259v.append(")");
        return sbM2259v.toString();
    }
}
