package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qo2 implements so2 {

    /* JADX INFO: renamed from: a */
    public final jo2 f9058a;

    public qo2(jo2 jo2Var) {
        this.f9058a = jo2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qo2) && this.f9058a.equals(((qo2) obj).f9058a);
    }

    public final int hashCode() {
        return this.f9058a.hashCode();
    }

    public final String toString() {
        return "Err(error=" + this.f9058a + ")";
    }
}
