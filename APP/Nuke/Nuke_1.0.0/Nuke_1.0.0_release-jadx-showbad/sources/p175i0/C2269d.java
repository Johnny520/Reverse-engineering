package p175i0;

/* JADX INFO: renamed from: i0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2269d {

    /* JADX INFO: renamed from: a */
    public final int f7422a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C2269d) {
            return this.f7422a == ((C2269d) obj).f7422a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f7422a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AndroidContentDataType(androidAutofillType=" + this.f7422a + ')';
    }
}
