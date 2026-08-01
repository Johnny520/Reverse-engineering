package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class k30 {

    /* JADX INFO: renamed from: a */
    public final int f3000a;

    /* JADX INFO: renamed from: b */
    public final int f3001b;

    /* JADX INFO: renamed from: c */
    public final h70 f3002c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k30(int i, int i2, h70 h70Var) {
        this.f3000a = i;
        this.f3001b = i2;
        this.f3002c = h70Var;
        if (i < 0) {
            z10.m5361a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        z10.m5361a("size should be > 0");
    }
}
