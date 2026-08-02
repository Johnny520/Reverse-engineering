package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qk1 {

    /* JADX INFO: renamed from: a */
    public float f9013a = 0.0f;

    /* JADX INFO: renamed from: b */
    public float f9014b = 0.0f;

    /* JADX INFO: renamed from: c */
    public float f9015c = 0.0f;

    /* JADX INFO: renamed from: d */
    public float f9016d = 0.0f;

    /* JADX INFO: renamed from: a */
    public final void m4193a(float f, float f2, float f3, float f4) {
        this.f9013a = Math.max(f, this.f9013a);
        this.f9014b = Math.max(f2, this.f9014b);
        this.f9015c = Math.min(f3, this.f9015c);
        this.f9016d = Math.min(f4, this.f9016d);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4194b() {
        return (this.f9013a >= this.f9015c) | (this.f9014b >= this.f9016d);
    }

    /* JADX INFO: renamed from: c */
    public final void m4195c(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.f9013a += fIntBitsToFloat;
        this.f9014b += fIntBitsToFloat2;
        this.f9015c += fIntBitsToFloat;
        this.f9016d += fIntBitsToFloat2;
    }

    public final String toString() {
        return "MutableRect(" + t11.m5072X(this.f9013a) + ", " + t11.m5072X(this.f9014b) + ", " + t11.m5072X(this.f9015c) + ", " + t11.m5072X(this.f9016d) + ')';
    }
}
