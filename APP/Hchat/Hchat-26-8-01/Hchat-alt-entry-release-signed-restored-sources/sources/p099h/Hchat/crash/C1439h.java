package p099h.Hchat.crash;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: h.Hchat.crash.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1439h {

    /* JADX INFO: renamed from: a */
    public final long f4776a;

    /* JADX INFO: renamed from: b */
    public final String f4777b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1439h(long j3, String str) {
        str.getClass();
        this.f4776a = j3;
        this.f4777b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1439h)) {
            return false;
        }
        C1439h c1439h = (C1439h) obj;
        return this.f4776a == c1439h.f4776a && AbstractC1416l.m3825a(this.f4777b, c1439h.f4777b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4777b.hashCode() + (Long.hashCode(this.f4776a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SystemExitRecord(timestamp=" + this.f4776a + ", details=" + this.f4777b + ")";
    }
}
