package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i40 {

    /* JADX INFO: renamed from: a */
    public long f4257a;

    /* JADX INFO: renamed from: b */
    public float f4258b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i40)) {
            return false;
        }
        i40 i40Var = (i40) obj;
        return this.f4257a == i40Var.f4257a && Float.compare(this.f4258b, i40Var.f4258b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4258b) + (Long.hashCode(this.f4257a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f4257a);
        sb.append(", dataPoint=");
        return vi0.m5693l(sb, this.f4258b, ')');
    }
}
