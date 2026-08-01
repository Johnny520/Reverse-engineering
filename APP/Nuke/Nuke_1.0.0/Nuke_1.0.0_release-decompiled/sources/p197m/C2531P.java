package p197m;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: m.P */
/* JADX INFO: loaded from: classes.dex */
public final class C2531P {

    /* JADX INFO: renamed from: a */
    public final float f8094a;

    /* JADX INFO: renamed from: b */
    public final float f8095b;

    /* JADX INFO: renamed from: c */
    public final long f8096c;

    public C2531P(float f2, float f5, long j5) {
        this.f8094a = f2;
        this.f8095b = f5;
        this.f8096c = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2531P)) {
            return false;
        }
        C2531P c2531p = (C2531P) obj;
        return Float.compare(this.f8094a, c2531p.f8094a) == 0 && Float.compare(this.f8095b, c2531p.f8095b) == 0 && this.f8096c == c2531p.f8096c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8096c) + AbstractC0231b.m390a(this.f8095b, Float.hashCode(this.f8094a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f8094a + ", distance=" + this.f8095b + ", duration=" + this.f8096c + ')';
    }
}
