package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wd0 {

    /* JADX INFO: renamed from: a */
    public final int f12465a;

    /* JADX INFO: renamed from: a */
    public static String m5868a(int i) {
        if (i == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i == 1) {
            return "EmojiSupportMatch.None";
        }
        if (i == 2) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wd0) {
            return this.f12465a == ((wd0) obj).f12465a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12465a);
    }

    public final String toString() {
        return m5868a(this.f12465a);
    }
}
