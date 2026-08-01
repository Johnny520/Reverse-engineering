package p000;

/* JADX INFO: renamed from: sf */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0724sf implements x61 {

    /* JADX INFO: renamed from: d */
    public final long f5753d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0724sf(long j) {
        this.f5753d = j;
        if (j != 16) {
            return;
        }
        x10.m5082a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.x61
    /* JADX INFO: renamed from: a */
    public final long mo2626a() {
        return this.f5753d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.x61
    /* JADX INFO: renamed from: e */
    public final pf1 mo2627e() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0724sf) && C0207ff.m1094c(this.f5753d, ((C0724sf) obj).f5753d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.x61
    /* JADX INFO: renamed from: f */
    public final float mo2628f() {
        return C0207ff.m1095d(this.f5753d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = C0207ff.f1708h;
        return Long.hashCode(this.f5753d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ColorStyle(value=" + ((Object) C0207ff.m1100i(this.f5753d)) + ')';
    }
}
