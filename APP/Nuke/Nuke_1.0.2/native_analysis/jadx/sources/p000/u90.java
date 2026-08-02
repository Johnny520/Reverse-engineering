package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u90 {

    /* JADX INFO: renamed from: a */
    public final boolean f11155a;

    /* JADX INFO: renamed from: b */
    public final boolean f11156b;

    public u90(boolean z, boolean z2) {
        this.f11155a = z;
        this.f11156b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u90)) {
            return false;
        }
        u90 u90Var = (u90) obj;
        return this.f11155a == u90Var.f11155a && this.f11156b == u90Var.f11156b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11156b) + (Boolean.hashCode(this.f11155a) * 31);
    }

    public final String toString() {
        return "ClipState(clipChildren=" + this.f11155a + ", clipToPadding=" + this.f11156b + ")";
    }
}
