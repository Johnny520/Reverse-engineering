package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ny1 extends qy1 {

    /* JADX INFO: renamed from: c */
    public final float f7367c;

    /* JADX INFO: renamed from: d */
    public final float f7368d;

    public ny1(float f, float f2) {
        super(1);
        this.f7367c = f;
        this.f7368d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny1)) {
            return false;
        }
        ny1 ny1Var = (ny1) obj;
        return Float.compare(this.f7367c, ny1Var.f7367c) == 0 && Float.compare(this.f7368d, ny1Var.f7368d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7368d) + (Float.hashCode(this.f7367c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.f7367c);
        sb.append(", dy=");
        return vi0.m5693l(sb, this.f7368d, ')');
    }
}
