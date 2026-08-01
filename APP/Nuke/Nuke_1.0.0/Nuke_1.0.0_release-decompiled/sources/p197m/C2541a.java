package p197m;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: m.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2541a {

    /* JADX INFO: renamed from: a */
    public final float f8112a;

    /* JADX INFO: renamed from: b */
    public final float f8113b;

    public C2541a(float f2, float f5) {
        this.f8112a = f2;
        this.f8113b = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2541a)) {
            return false;
        }
        C2541a c2541a = (C2541a) obj;
        return Float.compare(this.f8112a, c2541a.f8112a) == 0 && Float.compare(this.f8113b, c2541a.f8113b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8113b) + (Float.hashCode(this.f8112a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f8112a);
        sb.append(", velocityCoefficient=");
        return AbstractC0231b.m401l(sb, this.f8113b, ')');
    }
}
