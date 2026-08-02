package p000;

/* JADX INFO: renamed from: zt */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0974zt {

    /* JADX INFO: renamed from: a */
    public final int f14088a;

    /* JADX INFO: renamed from: b */
    public final int f14089b;

    public C0974zt(int i, int i2) {
        this.f14088a = i;
        this.f14089b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0974zt)) {
            return false;
        }
        C0974zt c0974zt = (C0974zt) obj;
        return this.f14088a == c0974zt.f14088a && this.f14089b == c0974zt.f14089b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14089b) + (Integer.hashCode(this.f14088a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionInfo(rowCount=");
        sb.append(this.f14088a);
        sb.append(", columnCount=");
        return vi0.m5694m(sb, this.f14089b, ')');
    }
}
