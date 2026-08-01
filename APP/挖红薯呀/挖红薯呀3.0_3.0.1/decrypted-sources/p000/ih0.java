package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ih0 {

    /* JADX INFO: renamed from: a */
    public float f2568a = 0.0f;

    /* JADX INFO: renamed from: b */
    public float f2569b = 0.0f;

    /* JADX INFO: renamed from: c */
    public float f2570c = 0.0f;

    /* JADX INFO: renamed from: d */
    public float f2571d = 0.0f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1579a(float f, float f2, float f3, float f4) {
        this.f2568a = Math.max(f, this.f2568a);
        this.f2569b = Math.max(f2, this.f2569b);
        this.f2570c = Math.min(f3, this.f2570c);
        this.f2571d = Math.min(f4, this.f2571d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m1580b() {
        return (this.f2568a >= this.f2570c) | (this.f2569b >= this.f2571d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1581c(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.f2568a += fIntBitsToFloat;
        this.f2569b += fIntBitsToFloat2;
        this.f2570c += fIntBitsToFloat;
        this.f2571d += fIntBitsToFloat2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MutableRect(" + rd0.m3462U(this.f2568a) + ", " + rd0.m3462U(this.f2569b) + ", " + rd0.m3462U(this.f2570c) + ", " + rd0.m3462U(this.f2571d) + ')';
    }
}
