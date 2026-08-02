package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s21 {

    /* JADX INFO: renamed from: a */
    public final Integer f9878a;

    /* JADX INFO: renamed from: b */
    public final Object f9879b;

    public s21(Integer num, Object obj) {
        this.f9878a = num;
        this.f9879b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s21)) {
            return false;
        }
        s21 s21Var = (s21) obj;
        return this.f9878a.equals(s21Var.f9878a) && t11.m5086l(this.f9879b, s21Var.f9879b);
    }

    public final int hashCode() {
        int iHashCode = this.f9878a.hashCode() * 31;
        Object obj = this.f9879b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + iHashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f9878a + ", right=" + this.f9879b + ')';
    }
}
