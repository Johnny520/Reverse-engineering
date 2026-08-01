package p217p0;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: p0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C2888s {

    /* JADX INFO: renamed from: a */
    public final float f9144a;

    /* JADX INFO: renamed from: b */
    public final float f9145b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2888s(float f2, float f5) {
        this.f9144a = f2;
        this.f9145b = f5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final float[] m5089a() {
        float f2 = this.f9144a;
        float f5 = this.f9145b;
        return new float[]{f2 / f5, 1.0f, ((1.0f - f2) - f5) / f5};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2888s)) {
            return false;
        }
        C2888s c2888s = (C2888s) obj;
        return Float.compare(this.f9144a, c2888s.f9144a) == 0 && Float.compare(this.f9145b, c2888s.f9145b) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f9145b) + (Float.hashCode(this.f9144a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f9144a);
        sb.append(", y=");
        return AbstractC0231b.m401l(sb, this.f9145b, ')');
    }
}
