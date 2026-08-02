package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qd3 {

    /* JADX INFO: renamed from: a */
    public final float f8924a;

    /* JADX INFO: renamed from: b */
    public final float f8925b;

    public qd3(float f, float f2) {
        this.f8924a = f;
        this.f8925b = f2;
    }

    /* JADX INFO: renamed from: a */
    public final float[] m4147a() {
        float f = this.f8924a;
        float f2 = this.f8925b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd3)) {
            return false;
        }
        qd3 qd3Var = (qd3) obj;
        return Float.compare(this.f8924a, qd3Var.f8924a) == 0 && Float.compare(this.f8925b, qd3Var.f8925b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8925b) + (Float.hashCode(this.f8924a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f8924a);
        sb.append(", y=");
        return vi0.m5693l(sb, this.f8925b, ')');
    }
}
