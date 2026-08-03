package p057e1;

import p007a7.AbstractC0018a;

/* JADX INFO: renamed from: e1.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0806a {

    /* JADX INFO: renamed from: a */
    public float f2410a = 0.0f;

    /* JADX INFO: renamed from: b */
    public float f2411b = 0.0f;

    /* JADX INFO: renamed from: c */
    public float f2412c = 0.0f;

    /* JADX INFO: renamed from: d */
    public float f2413d = 0.0f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2035a(float f3, float f10, float f11, float f12) {
        this.f2410a = Math.max(f3, this.f2410a);
        this.f2411b = Math.max(f10, this.f2411b);
        this.f2412c = Math.min(f11, this.f2412c);
        this.f2413d = Math.min(f12, this.f2413d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m2036b() {
        return (this.f2410a >= this.f2412c) | (this.f2411b >= this.f2413d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m2037c(long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        this.f2410a += fIntBitsToFloat;
        this.f2411b += fIntBitsToFloat2;
        this.f2412c += fIntBitsToFloat;
        this.f2413d += fIntBitsToFloat2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MutableRect(" + AbstractC0018a.m234V(this.f2410a) + ", " + AbstractC0018a.m234V(this.f2411b) + ", " + AbstractC0018a.m234V(this.f2412c) + ", " + AbstractC0018a.m234V(this.f2413d) + ')';
    }
}
