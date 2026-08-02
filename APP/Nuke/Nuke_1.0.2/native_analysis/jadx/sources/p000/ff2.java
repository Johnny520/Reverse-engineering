package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ff2 {

    /* JADX INFO: renamed from: a */
    public final ef2 f2951a;

    /* JADX INFO: renamed from: b */
    public final String f2952b;

    public ff2(ef2 ef2Var, String str) {
        this.f2951a = ef2Var;
        this.f2952b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff2)) {
            return false;
        }
        ff2 ff2Var = (ff2) obj;
        return this.f2951a == ff2Var.f2951a && t11.m5086l(this.f2952b, ff2Var.f2952b);
    }

    public final int hashCode() {
        int iHashCode = this.f2951a.hashCode() * 31;
        String str = this.f2952b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ScriptCapabilityReason(capability=" + this.f2951a + ", reason=" + this.f2952b + ")";
    }
}
