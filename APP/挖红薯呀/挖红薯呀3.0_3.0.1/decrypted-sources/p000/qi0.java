package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class qi0 {

    /* JADX INFO: renamed from: a */
    public final int f5156a;

    /* JADX INFO: renamed from: b */
    public final float f5157b;

    /* JADX INFO: renamed from: c */
    public final float f5158c;

    /* JADX INFO: renamed from: d */
    public final float f5159d;

    /* JADX INFO: renamed from: e */
    public final long f5160e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qi0(int i, float f, float f2, float f3, long j) {
        this.f5156a = i;
        this.f5157b = f;
        this.f5158c = f2;
        this.f5159d = f3;
        this.f5160e = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qi0.class == obj.getClass()) {
            qi0 qi0Var = (qi0) obj;
            return this.f5158c == qi0Var.f5158c && this.f5159d == qi0Var.f5159d && this.f5157b == qi0Var.f5157b && this.f5156a == qi0Var.f5156a && this.f5160e == qi0Var.f5160e;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f5160e) + AbstractC0748t1.m4144b(this.f5156a, AbstractC0748t1.m4143a(this.f5157b, AbstractC0748t1.m4143a(this.f5159d, Float.hashCode(this.f5158c) * 31, 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "NavigationEvent(touchX=" + this.f5158c + ", touchY=" + this.f5159d + ", progress=" + this.f5157b + ", swipeEdge=" + this.f5156a + ", frameTimeMillis=" + this.f5160e + ')';
    }
}
