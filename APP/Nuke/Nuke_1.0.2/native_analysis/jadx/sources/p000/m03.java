package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m03 {

    /* JADX INFO: renamed from: c */
    public static final m03 f6426c = new m03(1.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    public final float f6427a;

    /* JADX INFO: renamed from: b */
    public final float f6428b;

    public m03(float f, float f2) {
        this.f6427a = f;
        this.f6428b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m03)) {
            return false;
        }
        m03 m03Var = (m03) obj;
        return this.f6427a == m03Var.f6427a && this.f6428b == m03Var.f6428b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6428b) + (Float.hashCode(this.f6427a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f6427a);
        sb.append(", skewX=");
        return vi0.m5693l(sb, this.f6428b, ')');
    }
}
