package p000;

/* JADX INFO: renamed from: rd */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0652rd {

    /* JADX INFO: renamed from: a */
    public final Object f9514a;

    /* JADX INFO: renamed from: b */
    public final int f9515b;

    /* JADX INFO: renamed from: c */
    public final int f9516c;

    /* JADX INFO: renamed from: d */
    public final String f9517d;

    public C0652rd(int i, int i2, Object obj, String str) {
        this.f9514a = obj;
        this.f9515b = i;
        this.f9516c = i2;
        this.f9517d = str;
        if (i <= i2) {
            return;
        }
        lz0.m2988a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0652rd)) {
            return false;
        }
        C0652rd c0652rd = (C0652rd) obj;
        return t11.m5086l(this.f9514a, c0652rd.f9514a) && this.f9515b == c0652rd.f9515b && this.f9516c == c0652rd.f9516c && t11.m5086l(this.f9517d, c0652rd.f9517d);
    }

    public final int hashCode() {
        Object obj = this.f9514a;
        return this.f9517d.hashCode() + vi0.m5685d(this.f9516c, vi0.m5685d(this.f9515b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.f9514a);
        sb.append(", start=");
        sb.append(this.f9515b);
        sb.append(", end=");
        sb.append(this.f9516c);
        sb.append(", tag=");
        return hk1.m2210i(sb, this.f9517d, ')');
    }

    public C0652rd(int i, int i2, Object obj) {
        this(i, i2, obj, "");
    }
}
