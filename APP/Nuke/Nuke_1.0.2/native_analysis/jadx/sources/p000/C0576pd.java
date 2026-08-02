package p000;

/* JADX INFO: renamed from: pd */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0576pd {

    /* JADX INFO: renamed from: a */
    public final Object f8257a;

    /* JADX INFO: renamed from: b */
    public final int f8258b;

    /* JADX INFO: renamed from: c */
    public final int f8259c;

    /* JADX INFO: renamed from: d */
    public final String f8260d;

    public C0576pd(int i, int i2, Object obj, String str) {
        this.f8257a = obj;
        this.f8258b = i;
        this.f8259c = i2;
        this.f8260d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0576pd)) {
            return false;
        }
        C0576pd c0576pd = (C0576pd) obj;
        return t11.m5086l(this.f8257a, c0576pd.f8257a) && this.f8258b == c0576pd.f8258b && this.f8259c == c0576pd.f8259c && t11.m5086l(this.f8260d, c0576pd.f8260d);
    }

    public final int hashCode() {
        Object obj = this.f8257a;
        return this.f8260d.hashCode() + vi0.m5685d(this.f8259c, vi0.m5685d(this.f8258b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.f8257a);
        sb.append(", start=");
        sb.append(this.f8258b);
        sb.append(", end=");
        sb.append(this.f8259c);
        sb.append(", tag=");
        return hk1.m2210i(sb, this.f8260d, ')');
    }
}
