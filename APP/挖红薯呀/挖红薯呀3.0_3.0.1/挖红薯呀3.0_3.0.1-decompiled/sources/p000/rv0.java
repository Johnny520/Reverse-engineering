package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class rv0 {

    /* JADX INFO: renamed from: a */
    public final long f5561a = C0207ff.f1707g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rv0) {
            return C0207ff.m1094c(this.f5561a, ((rv0) obj).f5561a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = C0207ff.f1708h;
        return Long.hashCode(this.f5561a) * 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) C0207ff.m1100i(this.f5561a)) + ", rippleAlpha=null)";
    }
}
