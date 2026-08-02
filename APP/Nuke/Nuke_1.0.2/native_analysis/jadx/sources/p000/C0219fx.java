package p000;

/* JADX INFO: renamed from: fx */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0219fx {

    /* JADX INFO: renamed from: a */
    public final int f3159a;

    /* JADX INFO: renamed from: b */
    public final Integer f3160b;

    public C0219fx(int i, pp0 pp0Var, Integer num) {
        this.f3159a = i;
        this.f3160b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0219fx)) {
            return false;
        }
        C0219fx c0219fx = (C0219fx) obj;
        return this.f3159a == c0219fx.f3159a && t11.m5086l(null, null) && t11.m5086l(this.f3160b, c0219fx.f3160b);
    }

    public final int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f3159a) * 31) + 0) * 31;
        Integer num = this.f3160b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.f3159a + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.f3160b + ')';
    }
}
