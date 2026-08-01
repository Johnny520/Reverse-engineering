package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class na0 implements InterfaceC0817uv {

    /* JADX INFO: renamed from: a */
    public final float f4228a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public na0(float f) {
        this.f4228a = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0817uv
    /* JADX INFO: renamed from: a */
    public final float mo2685a(float f) {
        return f / this.f4228a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0817uv
    /* JADX INFO: renamed from: b */
    public final float mo2686b(float f) {
        return f * this.f4228a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof na0) && Float.compare(this.f4228a, ((na0) obj).f4228a) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f4228a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0748t1.m4155m(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f4228a, ')');
    }
}
