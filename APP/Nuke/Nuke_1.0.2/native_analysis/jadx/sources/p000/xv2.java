package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xv2 extends op0 {

    /* JADX INFO: renamed from: h */
    public final float f13195h;

    /* JADX INFO: renamed from: i */
    public final float f13196i;

    /* JADX INFO: renamed from: j */
    public final int f13197j;

    /* JADX INFO: renamed from: k */
    public final int f13198k;

    public xv2(float f, float f2, int i, int i2, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.f13195h = f;
        this.f13196i = f2;
        this.f13197j = i;
        this.f13198k = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv2)) {
            return false;
        }
        xv2 xv2Var = (xv2) obj;
        return this.f13195h == xv2Var.f13195h && this.f13196i == xv2Var.f13196i && this.f13197j == xv2Var.f13197j && this.f13198k == xv2Var.f13198k;
    }

    public final int hashCode() {
        return vi0.m5685d(this.f13198k, vi0.m5685d(this.f13197j, vi0.m5684c(this.f13196i, Float.hashCode(this.f13195h) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f13195h);
        sb.append(", miter=");
        sb.append(this.f13196i);
        sb.append(", cap=");
        String str = "Unknown";
        int i = this.f13197j;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i2 = this.f13198k;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
