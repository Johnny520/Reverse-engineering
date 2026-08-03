package p280t2;

import p293u2.C4245o;
import p293u2.C4246p;
import p343x6.AbstractC5700d;

/* JADX INFO: renamed from: t2.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4101q {

    /* JADX INFO: renamed from: c */
    public static final C4101q f13567c = new C4101q(AbstractC5700d.m10248D(0), AbstractC5700d.m10248D(0));

    /* JADX INFO: renamed from: a */
    public final long f13568a;

    /* JADX INFO: renamed from: b */
    public final long f13569b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4101q(long j3, long j4) {
        this.f13568a = j3;
        this.f13569b = j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4101q)) {
            return false;
        }
        C4101q c4101q = (C4101q) obj;
        return C4245o.m8538a(this.f13568a, c4101q.f13568a) && C4245o.m8538a(this.f13569b, c4101q.f13569b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C4246p[] c4246pArr = C4245o.f13923b;
        return Long.hashCode(this.f13569b) + (Long.hashCode(this.f13568a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) C4245o.m8541d(this.f13568a)) + ", restLine=" + ((Object) C4245o.m8541d(this.f13569b)) + ')';
    }
}
