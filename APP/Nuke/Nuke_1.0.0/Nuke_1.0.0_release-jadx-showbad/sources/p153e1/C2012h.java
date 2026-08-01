package p153e1;

/* JADX INFO: renamed from: e1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2012h {

    /* JADX INFO: renamed from: a */
    public final long f6734a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C2012h) {
            return this.f6734a == ((C2012h) obj).f6734a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f6734a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        long j5 = this.f6734a;
        if (j5 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) C2010f.m3697c(Float.intBitsToFloat((int) (j5 >> 32)))) + " x " + ((Object) C2010f.m3697c(Float.intBitsToFloat((int) (j5 & 4294967295L))));
    }
}
