package p071f1;

import android.graphics.Shader;

/* JADX INFO: renamed from: f1.t0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1030t0 extends AbstractC1027s {

    /* JADX INFO: renamed from: a */
    public final long f3253a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1030t0(long j3) {
        this.f3253a = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.AbstractC1027s
    /* JADX INFO: renamed from: a */
    public final void mo2628a(float f3, long j3, C1005h c1005h) {
        c1005h.m2586u(1.0f);
        long jM2634b = this.f3253a;
        if (f3 != 1.0f) {
            jM2634b = C1034w.m2634b(jM2634b, C1034w.m2636d(jM2634b) * f3);
        }
        c1005h.m2588w(jM2634b);
        if (((Shader) c1005h.f3183j) != null) {
            c1005h.m2591z(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1030t0) {
            return C1034w.m2635c(this.f3253a, ((C1030t0) obj).f3253a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i9 = C1034w.f3264h;
        return Long.hashCode(this.f3253a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SolidColor(value=" + ((Object) C1034w.m2641i(this.f3253a)) + ')';
    }
}
