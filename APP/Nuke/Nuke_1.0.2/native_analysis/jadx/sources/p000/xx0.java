package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xx0 {

    /* JADX INFO: renamed from: g */
    public static final xx0 f13213g = new xx0(false, 0, true, 1, 1, kc1.f5453j);

    /* JADX INFO: renamed from: a */
    public final boolean f13214a;

    /* JADX INFO: renamed from: b */
    public final int f13215b;

    /* JADX INFO: renamed from: c */
    public final boolean f13216c;

    /* JADX INFO: renamed from: d */
    public final int f13217d;

    /* JADX INFO: renamed from: e */
    public final int f13218e;

    /* JADX INFO: renamed from: f */
    public final kc1 f13219f;

    public xx0(boolean z, int i, boolean z2, int i2, int i3, kc1 kc1Var) {
        this.f13214a = z;
        this.f13215b = i;
        this.f13216c = z2;
        this.f13217d = i2;
        this.f13218e = i3;
        this.f13219f = kc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx0)) {
            return false;
        }
        xx0 xx0Var = (xx0) obj;
        return this.f13214a == xx0Var.f13214a && this.f13215b == xx0Var.f13215b && this.f13216c == xx0Var.f13216c && this.f13217d == xx0Var.f13217d && this.f13218e == xx0Var.f13218e && t11.m5086l(this.f13219f, xx0Var.f13219f);
    }

    public final int hashCode() {
        return this.f13219f.f5454h.hashCode() + vi0.m5685d(this.f13218e, vi0.m5685d(this.f13217d, hk1.m2205d(vi0.m5685d(this.f13215b, Boolean.hashCode(this.f13214a) * 31, 31), 31, this.f13216c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.f13214a + ", capitalization=" + ((Object) l51.m2840a(this.f13215b)) + ", autoCorrect=" + this.f13216c + ", keyboardType=" + ((Object) n51.m3249a(this.f13217d)) + ", imeAction=" + ((Object) wx0.m6018a(this.f13218e)) + ", platformImeOptions=null, hintLocales=" + this.f13219f + ')';
    }
}
