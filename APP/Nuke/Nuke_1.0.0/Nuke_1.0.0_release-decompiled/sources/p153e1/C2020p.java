package p153e1;

/* JADX INFO: renamed from: e1.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2020p {

    /* JADX INFO: renamed from: a */
    public final long f6749a;

    /* JADX INFO: renamed from: a */
    public static final boolean m3712a(long j5, long j6) {
        return j5 == j6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2020p) {
            return this.f6749a == ((C2020p) obj).f6749a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6749a);
    }

    public final String toString() {
        long j5 = this.f6749a;
        return m3712a(j5, 0L) ? "Unspecified" : m3712a(j5, 4294967296L) ? "Sp" : m3712a(j5, 8589934592L) ? "Em" : "Invalid";
    }
}
