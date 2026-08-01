package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class aa1 {

    /* JADX INFO: renamed from: a */
    public final z51 f77a;

    /* JADX INFO: renamed from: b */
    public final C1018zv f78b;

    /* JADX INFO: renamed from: c */
    public final int f79c;

    /* JADX INFO: renamed from: d */
    public final int f80d;

    /* JADX INFO: renamed from: e */
    public final Object f81e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public aa1(z51 z51Var, C1018zv c1018zv, int i, int i2, Object obj) {
        this.f77a = z51Var;
        this.f78b = c1018zv;
        this.f79c = i;
        this.f80d = i2;
        this.f81e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa1)) {
            return false;
        }
        aa1 aa1Var = (aa1) obj;
        return p30.m3002l(this.f77a, aa1Var.f77a) && p30.m3002l(this.f78b, aa1Var.f78b) && this.f79c == aa1Var.f79c && this.f80d == aa1Var.f80d && p30.m3002l(this.f81e, aa1Var.f81e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        z51 z51Var = this.f77a;
        int iM4144b = AbstractC0748t1.m4144b(this.f80d, AbstractC0748t1.m4144b(this.f79c, (((z51Var == null ? 0 : z51Var.hashCode()) * 31) + this.f78b.f8009d) * 31, 31), 31);
        Object obj = this.f81e;
        return iM4144b + (obj != null ? obj.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f77a);
        sb.append(", fontWeight=");
        sb.append(this.f78b);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.f79c;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.f80d;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f81e);
        sb.append(')');
        return sb.toString();
    }
}
