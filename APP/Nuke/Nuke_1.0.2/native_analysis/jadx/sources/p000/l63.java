package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l63 {

    /* JADX INFO: renamed from: a */
    public final mx2 f5961a;

    /* JADX INFO: renamed from: b */
    public final im0 f5962b;

    /* JADX INFO: renamed from: c */
    public final int f5963c;

    /* JADX INFO: renamed from: d */
    public final int f5964d;

    /* JADX INFO: renamed from: e */
    public final Object f5965e;

    public l63(mx2 mx2Var, im0 im0Var, int i, int i2, Object obj) {
        this.f5961a = mx2Var;
        this.f5962b = im0Var;
        this.f5963c = i;
        this.f5964d = i2;
        this.f5965e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l63)) {
            return false;
        }
        l63 l63Var = (l63) obj;
        return t11.m5086l(this.f5961a, l63Var.f5961a) && t11.m5086l(this.f5962b, l63Var.f5962b) && this.f5963c == l63Var.f5963c && this.f5964d == l63Var.f5964d && t11.m5086l(this.f5965e, l63Var.f5965e);
    }

    public final int hashCode() {
        mx2 mx2Var = this.f5961a;
        int iM5685d = vi0.m5685d(this.f5964d, vi0.m5685d(this.f5963c, (((mx2Var == null ? 0 : mx2Var.hashCode()) * 31) + this.f5962b.f4684h) * 31, 31), 31);
        Object obj = this.f5965e;
        return iM5685d + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f5961a);
        sb.append(", fontWeight=");
        sb.append(this.f5962b);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.f5963c;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.f5964d;
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
        sb.append(this.f5965e);
        sb.append(')');
        return sb.toString();
    }
}
