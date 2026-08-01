package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class s41 extends o30 {

    /* JADX INFO: renamed from: Q */
    public final float f5636Q;

    /* JADX INFO: renamed from: R */
    public final float f5637R;

    /* JADX INFO: renamed from: S */
    public final int f5638S;

    /* JADX INFO: renamed from: T */
    public final int f5639T;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s41(float f, float f2, int i, int i2) {
        f2 = (i2 & 2) != 0 ? 4.0f : f2;
        i = (i2 & 8) != 0 ? 0 : i;
        this.f5636Q = f;
        this.f5637R = f2;
        this.f5638S = 0;
        this.f5639T = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s41)) {
            return false;
        }
        s41 s41Var = (s41) obj;
        return this.f5636Q == s41Var.f5636Q && this.f5637R == s41Var.f5637R && this.f5638S == s41Var.f5638S && this.f5639T == s41Var.f5639T;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return AbstractC0748t1.m4144b(this.f5639T, AbstractC0748t1.m4144b(this.f5638S, AbstractC0748t1.m4143a(this.f5637R, Float.hashCode(this.f5636Q) * 31, 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f5636Q);
        sb.append(", miter=");
        sb.append(this.f5637R);
        sb.append(", cap=");
        String str = "Unknown";
        int i = this.f5638S;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i2 = this.f5639T;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
