package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class g31 extends pf1 {

    /* JADX INFO: renamed from: l */
    public final long f1852l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g31(long j) {
        this.f1852l = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g31) {
            return C0207ff.m1094c(this.f1852l, ((g31) obj).f1852l);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.pf1
    /* JADX INFO: renamed from: h */
    public final void mo1197h(float f, long j, C0877w5 c0877w5) {
        c0877w5.m4869c(1.0f);
        long jM1093b = this.f1852l;
        if (f != 1.0f) {
            jM1093b = C0207ff.m1093b(C0207ff.m1095d(jM1093b) * f, jM1093b);
        }
        c0877w5.m4871e(jM1093b);
        if (c0877w5.f7004c != null) {
            c0877w5.m4873g(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = C0207ff.f1708h;
        return Long.hashCode(this.f1852l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SolidColor(value=" + ((Object) C0207ff.m1100i(this.f1852l)) + ')';
    }
}
