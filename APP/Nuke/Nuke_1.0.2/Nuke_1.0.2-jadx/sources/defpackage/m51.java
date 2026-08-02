package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m51 {
    public static final m51 c = new m51(0, 127);
    public final int a;
    public final int b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m51(int i, int i2) {
        int i3 = (i2 & 1) != 0 ? -1 : 1;
        i = (i2 & 4) != 0 ? 0 : i;
        this.a = i3;
        this.b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m51)) {
            return false;
        }
        m51 m51Var = (m51) obj;
        return this.a == m51Var.a && this.b == m51Var.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return vi0.d(-1, vi0.d(this.b, Integer.hashCode(this.a) * 961, 31), 29791);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) l51.a(this.a)) + ", autoCorrectEnabled=null, keyboardType=" + ((Object) n51.a(this.b)) + ", imeAction=" + ((Object) "Unspecified") + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
