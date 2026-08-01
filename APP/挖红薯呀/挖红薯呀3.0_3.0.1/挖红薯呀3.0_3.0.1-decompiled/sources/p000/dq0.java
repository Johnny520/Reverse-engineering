package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class dq0 implements InterfaceC0477mk {

    /* JADX INFO: renamed from: a */
    public final float f1166a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public dq0(float f) {
        this.f1166a = f;
        if (f < 0.0f || f > 100.0f) {
            z10.m5361a("The percent should be in the range of [0, 100]");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0477mk
    /* JADX INFO: renamed from: a */
    public final float mo722a(long j, InterfaceC0968ym interfaceC0968ym) {
        return (this.f1166a / 100.0f) * q11.m3186b(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dq0) && Float.compare(this.f1166a, ((dq0) obj).f1166a) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f1166a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CornerSize(size = " + this.f1166a + "%)";
    }
}
