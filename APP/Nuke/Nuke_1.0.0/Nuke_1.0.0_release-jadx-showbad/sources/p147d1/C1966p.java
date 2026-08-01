package p147d1;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: d1.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1966p {

    /* JADX INFO: renamed from: c */
    public static final C1966p f6646c = new C1966p(1.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    public final float f6647a;

    /* JADX INFO: renamed from: b */
    public final float f6648b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1966p(float f2, float f5) {
        this.f6647a = f2;
        this.f6648b = f5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1966p)) {
            return false;
        }
        C1966p c1966p = (C1966p) obj;
        return this.f6647a == c1966p.f6647a && this.f6648b == c1966p.f6648b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f6648b) + (Float.hashCode(this.f6647a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f6647a);
        sb.append(", skewX=");
        return AbstractC0231b.m401l(sb, this.f6648b, ')');
    }
}
