package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jy0 {

    /* JADX INFO: renamed from: a */
    public final int f5273a;

    /* JADX INFO: renamed from: b */
    public final Object f5274b;

    public jy0(int i, Object obj) {
        this.f5273a = i;
        this.f5274b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy0)) {
            return false;
        }
        jy0 jy0Var = (jy0) obj;
        return this.f5273a == jy0Var.f5273a && t11.m5086l(this.f5274b, jy0Var.f5274b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f5273a) * 31;
        Object obj = this.f5274b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f5273a + ", value=" + this.f5274b + ')';
    }
}
