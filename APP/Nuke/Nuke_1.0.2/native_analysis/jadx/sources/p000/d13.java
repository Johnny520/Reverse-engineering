package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d13 {

    /* JADX INFO: renamed from: c */
    public static final d13 f1812c = new d13(2, false);

    /* JADX INFO: renamed from: d */
    public static final d13 f1813d = new d13(1, true);

    /* JADX INFO: renamed from: a */
    public final int f1814a;

    /* JADX INFO: renamed from: b */
    public final boolean f1815b;

    public d13(int i, boolean z) {
        this.f1814a = i;
        this.f1815b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d13)) {
            return false;
        }
        d13 d13Var = (d13) obj;
        return this.f1814a == d13Var.f1814a && this.f1815b == d13Var.f1815b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1815b) + (Integer.hashCode(this.f1814a) * 31);
    }

    public final String toString() {
        return equals(f1812c) ? "TextMotion.Static" : equals(f1813d) ? "TextMotion.Animated" : "Invalid";
    }
}
