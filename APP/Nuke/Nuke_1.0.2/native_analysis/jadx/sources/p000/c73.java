package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c73 {
    public static final x63 Companion = new x63();

    /* JADX INFO: renamed from: a */
    public final int f1221a;

    /* JADX INFO: renamed from: b */
    public final int f1222b;

    /* JADX INFO: renamed from: c */
    public final boolean f1223c;

    /* JADX INFO: renamed from: d */
    public final b73 f1224d;

    public /* synthetic */ c73(int i, int i2, int i3, boolean z, b73 b73Var) {
        if ((i & 1) == 0) {
            this.f1221a = 0;
        } else {
            this.f1221a = i2;
        }
        if ((i & 2) == 0) {
            this.f1222b = 0;
        } else {
            this.f1222b = i3;
        }
        if ((i & 4) == 0) {
            this.f1223c = false;
        } else {
            this.f1223c = z;
        }
        if ((i & 8) == 0) {
            this.f1224d = new b73();
        } else {
            this.f1224d = b73Var;
        }
    }

    /* JADX INFO: renamed from: a */
    public static c73 m662a(c73 c73Var, int i, int i2, boolean z, b73 b73Var, int i3) {
        if ((i3 & 1) != 0) {
            i = c73Var.f1221a;
        }
        if ((i3 & 2) != 0) {
            i2 = c73Var.f1222b;
        }
        if ((i3 & 4) != 0) {
            z = c73Var.f1223c;
        }
        if ((i3 & 8) != 0) {
            b73Var = c73Var.f1224d;
        }
        c73Var.getClass();
        b73Var.getClass();
        return new c73(i, i2, z, b73Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c73)) {
            return false;
        }
        c73 c73Var = (c73) obj;
        return this.f1221a == c73Var.f1221a && this.f1222b == c73Var.f1222b && this.f1223c == c73Var.f1223c && t11.m5086l(this.f1224d, c73Var.f1224d);
    }

    public final int hashCode() {
        return this.f1224d.hashCode() + hk1.m2205d(vi0.m5685d(this.f1222b, Integer.hashCode(this.f1221a) * 31, 31), 31, this.f1223c);
    }

    public final String toString() {
        StringBuilder sbM2212k = hk1.m2212k("UIConfig(appearanceMode=", this.f1221a, this.f1222b, ", languageMode=", ", clickHapticEnabled=");
        sbM2212k.append(this.f1223c);
        sbM2212k.append(", theme=");
        sbM2212k.append(this.f1224d);
        sbM2212k.append(")");
        return sbM2212k.toString();
    }

    public c73(int i, int i2, boolean z, b73 b73Var) {
        this.f1221a = i;
        this.f1222b = i2;
        this.f1223c = z;
        this.f1224d = b73Var;
    }

    public /* synthetic */ c73() {
        this(0, 0, false, new b73());
    }
}
