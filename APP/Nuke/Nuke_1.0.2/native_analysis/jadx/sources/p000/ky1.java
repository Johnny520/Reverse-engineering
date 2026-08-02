package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ky1 extends qy1 {

    /* JADX INFO: renamed from: c */
    public final float f5849c;

    /* JADX INFO: renamed from: d */
    public final float f5850d;

    public ky1(float f, float f2) {
        super(3);
        this.f5849c = f;
        this.f5850d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky1)) {
            return false;
        }
        ky1 ky1Var = (ky1) obj;
        return Float.compare(this.f5849c, ky1Var.f5849c) == 0 && Float.compare(this.f5850d, ky1Var.f5850d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5850d) + (Float.hashCode(this.f5849c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.f5849c);
        sb.append(", dy=");
        return vi0.m5693l(sb, this.f5850d, ')');
    }
}
