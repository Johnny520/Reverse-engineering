package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ih2 {

    /* JADX INFO: renamed from: a */
    public final Object f4619a;

    /* JADX INFO: renamed from: b */
    public final String f4620b;

    public ih2(String str, Object obj) {
        this.f4619a = obj;
        this.f4620b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih2)) {
            return false;
        }
        ih2 ih2Var = (ih2) obj;
        return this.f4619a.equals(ih2Var.f4619a) && this.f4620b.equals(ih2Var.f4620b);
    }

    public final int hashCode() {
        return this.f4620b.hashCode() + (this.f4619a.hashCode() * 31);
    }

    public final String toString() {
        return "HostObjectEntry(value=" + this.f4619a + ", className=" + this.f4620b + ")";
    }
}
