package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hg2 {

    /* JADX INFO: renamed from: a */
    public final fg2 f4002a;

    /* JADX INFO: renamed from: b */
    public final String f4003b;

    public hg2(fg2 fg2Var, String str) {
        this.f4002a = fg2Var;
        this.f4003b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg2)) {
            return false;
        }
        hg2 hg2Var = (hg2) obj;
        return this.f4002a == hg2Var.f4002a && this.f4003b.equals(hg2Var.f4003b);
    }

    public final int hashCode() {
        return this.f4003b.hashCode() + (this.f4002a.hashCode() * 31);
    }

    public final String toString() {
        return "ScriptFileRef(area=" + this.f4002a + ", path=" + this.f4003b + ")";
    }
}
