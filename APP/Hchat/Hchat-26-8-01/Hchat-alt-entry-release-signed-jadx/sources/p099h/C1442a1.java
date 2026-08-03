package p099h;

import p116i.C1739c;
import p293u2.C4242l;

/* JADX INFO: renamed from: h.a1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1442a1 {

    /* JADX INFO: renamed from: a */
    public final C1739c f4786a;

    /* JADX INFO: renamed from: b */
    public long f4787b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1442a1(C1739c c1739c, long j3) {
        this.f4786a = c1739c;
        this.f4787b = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1442a1)) {
            return false;
        }
        C1442a1 c1442a1 = (C1442a1) obj;
        return this.f4786a.equals(c1442a1.f4786a) && C4242l.m8534a(this.f4787b, c1442a1.f4787b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f4787b) + (this.f4786a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AnimData(anim=" + this.f4786a + ", startSize=" + ((Object) C4242l.m8535b(this.f4787b)) + ')';
    }
}
