package p245u0;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: u0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C3314k extends AbstractC3295B {

    /* JADX INFO: renamed from: c */
    public final float f10318c;

    /* JADX INFO: renamed from: d */
    public final float f10319d;

    /* JADX INFO: renamed from: e */
    public final float f10320e;

    /* JADX INFO: renamed from: f */
    public final float f10321f;

    /* JADX INFO: renamed from: g */
    public final float f10322g;

    /* JADX INFO: renamed from: h */
    public final float f10323h;

    public C3314k(float f2, float f5, float f6, float f7, float f8, float f9) {
        super(2);
        this.f10318c = f2;
        this.f10319d = f5;
        this.f10320e = f6;
        this.f10321f = f7;
        this.f10322g = f8;
        this.f10323h = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3314k)) {
            return false;
        }
        C3314k c3314k = (C3314k) obj;
        return Float.compare(this.f10318c, c3314k.f10318c) == 0 && Float.compare(this.f10319d, c3314k.f10319d) == 0 && Float.compare(this.f10320e, c3314k.f10320e) == 0 && Float.compare(this.f10321f, c3314k.f10321f) == 0 && Float.compare(this.f10322g, c3314k.f10322g) == 0 && Float.compare(this.f10323h, c3314k.f10323h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10323h) + AbstractC0231b.m390a(this.f10322g, AbstractC0231b.m390a(this.f10321f, AbstractC0231b.m390a(this.f10320e, AbstractC0231b.m390a(this.f10319d, Float.hashCode(this.f10318c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f10318c);
        sb.append(", y1=");
        sb.append(this.f10319d);
        sb.append(", x2=");
        sb.append(this.f10320e);
        sb.append(", y2=");
        sb.append(this.f10321f);
        sb.append(", x3=");
        sb.append(this.f10322g);
        sb.append(", y3=");
        return AbstractC0231b.m401l(sb, this.f10323h, ')');
    }
}
