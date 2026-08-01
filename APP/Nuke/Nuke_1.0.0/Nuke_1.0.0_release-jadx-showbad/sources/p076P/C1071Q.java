package p076P;

import p211o0.C2762u;

/* JADX INFO: renamed from: P.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C1071Q {

    /* JADX INFO: renamed from: a */
    public final long f3339a = C2762u.f8762g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1071Q) {
            return C2762u.m4921c(this.f3339a, ((C1071Q) obj).f3339a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i5 = C2762u.f8763h;
        return Long.hashCode(this.f3339a) * 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) C2762u.m4927i(this.f3339a)) + ", rippleAlpha=null)";
    }
}
