package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class b11 {

    /* JADX INFO: renamed from: a */
    public final dw0 f349a;

    /* JADX INFO: renamed from: b */
    public final dw0 f350b;

    /* JADX INFO: renamed from: c */
    public final dw0 f351c;

    /* JADX INFO: renamed from: d */
    public final dw0 f352d;

    /* JADX INFO: renamed from: e */
    public final dw0 f353e;

    /* JADX INFO: renamed from: f */
    public final dw0 f354f;

    /* JADX INFO: renamed from: g */
    public final dw0 f355g;

    /* JADX INFO: renamed from: h */
    public final dw0 f356h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b11() {
        dw0 dw0Var = y01.f7475a;
        dw0 dw0Var2 = y01.f7476b;
        dw0 dw0Var3 = y01.f7477c;
        dw0 dw0Var4 = y01.f7478d;
        dw0 dw0Var5 = y01.f7480f;
        dw0 dw0Var6 = y01.f7479e;
        dw0 dw0Var7 = y01.f7481g;
        dw0 dw0Var8 = y01.f7482h;
        this.f349a = dw0Var;
        this.f350b = dw0Var2;
        this.f351c = dw0Var3;
        this.f352d = dw0Var4;
        this.f353e = dw0Var5;
        this.f354f = dw0Var6;
        this.f355g = dw0Var7;
        this.f356h = dw0Var8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b11)) {
            return false;
        }
        b11 b11Var = (b11) obj;
        return p30.m3002l(this.f349a, b11Var.f349a) && p30.m3002l(this.f350b, b11Var.f350b) && p30.m3002l(this.f351c, b11Var.f351c) && p30.m3002l(this.f352d, b11Var.f352d) && p30.m3002l(this.f353e, b11Var.f353e) && p30.m3002l(this.f354f, b11Var.f354f) && p30.m3002l(this.f355g, b11Var.f355g) && p30.m3002l(this.f356h, b11Var.f356h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f356h.hashCode() + ((this.f355g.hashCode() + ((this.f354f.hashCode() + ((this.f353e.hashCode() + ((this.f352d.hashCode() + ((this.f351c.hashCode() + ((this.f350b.hashCode() + (this.f349a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Shapes(extraSmall=" + this.f349a + ", small=" + this.f350b + ", medium=" + this.f351c + ", large=" + this.f352d + ", largeIncreased=" + this.f354f + ", extraLarge=" + this.f353e + ", extralargeIncreased=" + this.f355g + ", extraExtraLarge=" + this.f356h + ')';
    }
}
