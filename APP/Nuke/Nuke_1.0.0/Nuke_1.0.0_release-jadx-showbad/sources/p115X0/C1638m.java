package p115X0;

/* JADX INFO: renamed from: X0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1638m {

    /* JADX INFO: renamed from: a */
    public final int f5633a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m2939a(int i5) {
        return i5 == 0 ? "Unspecified" : i5 == 1 ? "Text" : i5 == 2 ? "Ascii" : i5 == 3 ? "Number" : i5 == 4 ? "Phone" : i5 == 5 ? "Uri" : i5 == 6 ? "Email" : i5 == 7 ? "Password" : i5 == 8 ? "NumberPassword" : i5 == 9 ? "Decimal" : "Invalid";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1638m) {
            return this.f5633a == ((C1638m) obj).f5633a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f5633a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m2939a(this.f5633a);
    }
}
