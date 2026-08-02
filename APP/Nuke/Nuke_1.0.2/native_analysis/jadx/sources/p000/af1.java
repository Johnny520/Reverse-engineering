package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class af1 {

    /* JADX INFO: renamed from: a */
    public final String f184a;

    /* JADX INFO: renamed from: b */
    public final c11 f185b;

    public af1(String str, c11 c11Var) {
        this.f184a = str;
        this.f185b = c11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af1)) {
            return false;
        }
        af1 af1Var = (af1) obj;
        return this.f184a.equals(af1Var.f184a) && this.f185b.equals(af1Var.f185b);
    }

    public final int hashCode() {
        return this.f185b.hashCode() + (this.f184a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f184a + ", range=" + this.f185b + ')';
    }
}
