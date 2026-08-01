package p000;

/* JADX INFO: renamed from: op */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0559op implements InterfaceC0477mk {

    /* JADX INFO: renamed from: a */
    public final float f4601a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0559op(float f) {
        this.f4601a = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0477mk
    /* JADX INFO: renamed from: a */
    public final float mo722a(long j, InterfaceC0968ym interfaceC0968ym) {
        return interfaceC0968ym.mo654p(this.f4601a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0559op) && C0520np.m2732b(this.f4601a, ((C0559op) obj).f4601a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f4601a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CornerSize(size = " + this.f4601a + ".dp)";
    }
}
