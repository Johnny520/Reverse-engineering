package p245u0;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: u0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C3321r extends AbstractC3295B {

    /* JADX INFO: renamed from: c */
    public final float f10339c;

    /* JADX INFO: renamed from: d */
    public final float f10340d;

    /* JADX INFO: renamed from: e */
    public final float f10341e;

    /* JADX INFO: renamed from: f */
    public final boolean f10342f;

    /* JADX INFO: renamed from: g */
    public final boolean f10343g;

    /* JADX INFO: renamed from: h */
    public final float f10344h;

    /* JADX INFO: renamed from: i */
    public final float f10345i;

    public C3321r(float f2, float f5, float f6, boolean z5, boolean z6, float f7, float f8) {
        super(3);
        this.f10339c = f2;
        this.f10340d = f5;
        this.f10341e = f6;
        this.f10342f = z5;
        this.f10343g = z6;
        this.f10344h = f7;
        this.f10345i = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3321r)) {
            return false;
        }
        C3321r c3321r = (C3321r) obj;
        return Float.compare(this.f10339c, c3321r.f10339c) == 0 && Float.compare(this.f10340d, c3321r.f10340d) == 0 && Float.compare(this.f10341e, c3321r.f10341e) == 0 && this.f10342f == c3321r.f10342f && this.f10343g == c3321r.f10343g && Float.compare(this.f10344h, c3321r.f10344h) == 0 && Float.compare(this.f10345i, c3321r.f10345i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10345i) + AbstractC0231b.m390a(this.f10344h, AbstractC0231b.m395f(AbstractC0231b.m395f(AbstractC0231b.m390a(this.f10341e, AbstractC0231b.m390a(this.f10340d, Float.hashCode(this.f10339c) * 31, 31), 31), 31, this.f10342f), 31, this.f10343g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.f10339c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f10340d);
        sb.append(", theta=");
        sb.append(this.f10341e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f10342f);
        sb.append(", isPositiveArc=");
        sb.append(this.f10343g);
        sb.append(", arcStartDx=");
        sb.append(this.f10344h);
        sb.append(", arcStartDy=");
        return AbstractC0231b.m401l(sb, this.f10345i, ')');
    }
}
