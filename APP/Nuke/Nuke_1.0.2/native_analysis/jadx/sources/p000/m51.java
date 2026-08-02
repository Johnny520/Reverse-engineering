package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m51 {

    /* JADX INFO: renamed from: c */
    public static final m51 f6481c = new m51(0, 127);

    /* JADX INFO: renamed from: a */
    public final int f6482a;

    /* JADX INFO: renamed from: b */
    public final int f6483b;

    public m51(int i, int i2) {
        int i3 = (i2 & 1) != 0 ? -1 : 1;
        i = (i2 & 4) != 0 ? 0 : i;
        this.f6482a = i3;
        this.f6483b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m51)) {
            return false;
        }
        m51 m51Var = (m51) obj;
        return this.f6482a == m51Var.f6482a && this.f6483b == m51Var.f6483b;
    }

    public final int hashCode() {
        return vi0.m5685d(-1, vi0.m5685d(this.f6483b, Integer.hashCode(this.f6482a) * 961, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) l51.m2840a(this.f6482a)) + ", autoCorrectEnabled=null, keyboardType=" + ((Object) n51.m3249a(this.f6483b)) + ", imeAction=" + ((Object) "Unspecified") + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
