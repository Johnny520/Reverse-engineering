package p293u2;

import p343x6.AbstractC5700d;

/* JADX INFO: renamed from: u2.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4245o {

    /* JADX INFO: renamed from: b */
    public static final C4246p[] f13923b = {new C4246p(0), new C4246p(4294967296L), new C4246p(8589934592L)};

    /* JADX INFO: renamed from: c */
    public static final long f13924c = AbstractC5700d.m10260R(0, Float.NaN);

    /* JADX INFO: renamed from: a */
    public final long f13925a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [i2.q.invoke(java.lang.Object):java.lang.Object] */
    public /* synthetic */ C4245o(long j3) {
        this.f13925a = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final boolean m8538a(long j3, long j4) {
        return j3 == j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final long m8539b(long j3) {
        return f13923b[(int) ((j3 & 1095216660480L) >>> 32)].f13926a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final float m8540c(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m8541d(long j3) {
        long jM8539b = m8539b(j3);
        if (C4246p.m8542a(jM8539b, 0L)) {
            return "Unspecified";
        }
        if (C4246p.m8542a(jM8539b, 4294967296L)) {
            return m8540c(j3) + ".sp";
        }
        if (!C4246p.m8542a(jM8539b, 8589934592L)) {
            return "Invalid";
        }
        return m8540c(j3) + ".em";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C4245o) {
            return this.f13925a == ((C4245o) obj).f13925a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f13925a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m8541d(this.f13925a);
    }
}
