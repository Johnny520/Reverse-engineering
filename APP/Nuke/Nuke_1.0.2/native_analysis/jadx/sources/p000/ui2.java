package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ui2 {

    /* JADX INFO: renamed from: a */
    public final boolean f11322a;

    /* JADX INFO: renamed from: b */
    public final boolean f11323b;

    public ui2(boolean z, boolean z2) {
        this.f11322a = z;
        this.f11323b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui2)) {
            return false;
        }
        ui2 ui2Var = (ui2) obj;
        return this.f11322a == ui2Var.f11322a && this.f11323b == ui2Var.f11323b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11323b) + (Boolean.hashCode(this.f11322a) * 31);
    }

    public final String toString() {
        return "ScriptRemoveOptions(recursive=" + this.f11322a + ", missingOk=" + this.f11323b + ")";
    }
}
