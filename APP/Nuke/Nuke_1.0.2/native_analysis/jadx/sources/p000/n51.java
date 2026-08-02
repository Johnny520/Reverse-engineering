package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n51 {

    /* JADX INFO: renamed from: a */
    public final int f7009a;

    /* JADX INFO: renamed from: a */
    public static String m3249a(int i) {
        return i == 0 ? "Unspecified" : i == 1 ? "Text" : i == 2 ? "Ascii" : i == 3 ? "Number" : i == 4 ? "Phone" : i == 5 ? "Uri" : i == 6 ? "Email" : i == 7 ? "Password" : i == 8 ? "NumberPassword" : i == 9 ? "Decimal" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n51) {
            return this.f7009a == ((n51) obj).f7009a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7009a);
    }

    public final String toString() {
        return m3249a(this.f7009a);
    }
}
