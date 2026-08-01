package p069i;

/* JADX INFO: renamed from: i.P0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0639P0 {

    /* JADX INFO: renamed from: a */
    public int f2186a;

    /* JADX INFO: renamed from: b */
    public int f2187b;

    /* JADX INFO: renamed from: c */
    public int f2188c;

    /* JADX INFO: renamed from: d */
    public int f2189d;

    /* JADX INFO: renamed from: e */
    public int f2190e;

    /* JADX INFO: renamed from: f */
    public int f2191f;

    /* JADX INFO: renamed from: g */
    public boolean f2192g;

    /* JADX INFO: renamed from: h */
    public boolean f2193h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1258a(int i2, int i3) {
        this.f2188c = i2;
        this.f2189d = i3;
        this.f2193h = true;
        if (this.f2192g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f2186a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f2187b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2186a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f2187b = i3;
        }
    }
}
