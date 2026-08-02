package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hq2 {

    /* JADX INFO: renamed from: a */
    public final fb2 f4111a;

    /* JADX INFO: renamed from: b */
    public final fb2 f4112b;

    /* JADX INFO: renamed from: c */
    public final fb2 f4113c;

    /* JADX INFO: renamed from: d */
    public final fb2 f4114d;

    /* JADX INFO: renamed from: e */
    public final fb2 f4115e;

    /* JADX INFO: renamed from: f */
    public final fb2 f4116f;

    /* JADX INFO: renamed from: g */
    public final fb2 f4117g;

    /* JADX INFO: renamed from: h */
    public final fb2 f4118h;

    public hq2() {
        fb2 fb2Var = fq2.f3110a;
        fb2 fb2Var2 = fq2.f3111b;
        fb2 fb2Var3 = fq2.f3112c;
        fb2 fb2Var4 = fq2.f3113d;
        fb2 fb2Var5 = fq2.f3115f;
        fb2 fb2Var6 = fq2.f3114e;
        fb2 fb2Var7 = fq2.f3116g;
        fb2 fb2Var8 = fq2.f3117h;
        this.f4111a = fb2Var;
        this.f4112b = fb2Var2;
        this.f4113c = fb2Var3;
        this.f4114d = fb2Var4;
        this.f4115e = fb2Var5;
        this.f4116f = fb2Var6;
        this.f4117g = fb2Var7;
        this.f4118h = fb2Var8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq2)) {
            return false;
        }
        hq2 hq2Var = (hq2) obj;
        return t11.m5086l(this.f4111a, hq2Var.f4111a) && t11.m5086l(this.f4112b, hq2Var.f4112b) && t11.m5086l(this.f4113c, hq2Var.f4113c) && t11.m5086l(this.f4114d, hq2Var.f4114d) && t11.m5086l(this.f4115e, hq2Var.f4115e) && t11.m5086l(this.f4116f, hq2Var.f4116f) && t11.m5086l(this.f4117g, hq2Var.f4117g) && t11.m5086l(this.f4118h, hq2Var.f4118h);
    }

    public final int hashCode() {
        return this.f4118h.hashCode() + ((this.f4117g.hashCode() + ((this.f4116f.hashCode() + ((this.f4115e.hashCode() + ((this.f4114d.hashCode() + ((this.f4113c.hashCode() + ((this.f4112b.hashCode() + (this.f4111a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f4111a + ", small=" + this.f4112b + ", medium=" + this.f4113c + ", large=" + this.f4114d + ", largeIncreased=" + this.f4116f + ", extraLarge=" + this.f4115e + ", extralargeIncreased=" + this.f4117g + ", extraExtraLarge=" + this.f4118h + ')';
    }
}
