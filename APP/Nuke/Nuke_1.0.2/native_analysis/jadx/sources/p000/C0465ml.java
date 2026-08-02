package p000;

/* JADX INFO: renamed from: ml */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0465ml {

    /* JADX INFO: renamed from: a */
    public C0122d9 f6711a = null;

    /* JADX INFO: renamed from: b */
    public C0192f6 f6712b = null;

    /* JADX INFO: renamed from: c */
    public C0702sp f6713c = null;

    /* JADX INFO: renamed from: d */
    public C0915y9 f6714d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0465ml)) {
            return false;
        }
        C0465ml c0465ml = (C0465ml) obj;
        return t11.m5086l(this.f6711a, c0465ml.f6711a) && t11.m5086l(this.f6712b, c0465ml.f6712b) && t11.m5086l(this.f6713c, c0465ml.f6713c) && t11.m5086l(this.f6714d, c0465ml.f6714d);
    }

    public final int hashCode() {
        C0122d9 c0122d9 = this.f6711a;
        int iHashCode = (c0122d9 == null ? 0 : c0122d9.hashCode()) * 31;
        C0192f6 c0192f6 = this.f6712b;
        int iHashCode2 = (iHashCode + (c0192f6 == null ? 0 : c0192f6.hashCode())) * 31;
        C0702sp c0702sp = this.f6713c;
        int iHashCode3 = (iHashCode2 + (c0702sp == null ? 0 : c0702sp.hashCode())) * 31;
        C0915y9 c0915y9 = this.f6714d;
        return iHashCode3 + (c0915y9 != null ? c0915y9.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f6711a + ", canvas=" + this.f6712b + ", canvasDrawScope=" + this.f6713c + ", borderPath=" + this.f6714d + ')';
    }
}
