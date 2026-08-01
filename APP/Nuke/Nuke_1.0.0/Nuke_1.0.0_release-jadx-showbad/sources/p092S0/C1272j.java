package p092S0;

/* JADX INFO: renamed from: S0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1272j {

    /* JADX INFO: renamed from: a */
    public final int f4575a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m2358a(int i5) {
        if (i5 == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i5 == 1) {
            return "EmojiSupportMatch.None";
        }
        if (i5 == 2) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i5 + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1272j) {
            return this.f4575a == ((C1272j) obj).f4575a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f4575a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m2358a(this.f4575a);
    }
}
