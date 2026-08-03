package p119i2;

/* JADX INFO: renamed from: i2.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1932j {

    /* JADX INFO: renamed from: a */
    public final int f6548a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m4799a(int i9) {
        if (i9 == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i9 == 1) {
            return "EmojiSupportMatch.None";
        }
        if (i9 == 2) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i9 + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1932j) {
            return this.f6548a == ((C1932j) obj).f6548a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f6548a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m4799a(this.f6548a);
    }
}
