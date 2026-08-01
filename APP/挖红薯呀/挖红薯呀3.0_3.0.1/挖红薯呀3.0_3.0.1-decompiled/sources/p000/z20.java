package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class z20 extends x20 {

    /* JADX INFO: renamed from: g */
    public static final z20 f7777g = new z20(1, 0, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.x20
    public final boolean equals(Object obj) {
        if (!(obj instanceof z20)) {
            return false;
        }
        if (isEmpty() && ((z20) obj).isEmpty()) {
            return true;
        }
        z20 z20Var = (z20) obj;
        return this.f7248d == z20Var.f7248d && this.f7249e == z20Var.f7249e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.x20
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f7248d * 31) + this.f7249e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.x20
    public final boolean isEmpty() {
        return this.f7248d > this.f7249e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.x20
    public final String toString() {
        return this.f7248d + ".." + this.f7249e;
    }
}
