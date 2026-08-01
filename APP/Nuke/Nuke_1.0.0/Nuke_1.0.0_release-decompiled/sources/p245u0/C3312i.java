package p245u0;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: u0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C3312i extends AbstractC3295B {

    /* JADX INFO: renamed from: c */
    public final float f10310c;

    /* JADX INFO: renamed from: d */
    public final float f10311d;

    /* JADX INFO: renamed from: e */
    public final float f10312e;

    /* JADX INFO: renamed from: f */
    public final boolean f10313f;

    /* JADX INFO: renamed from: g */
    public final boolean f10314g;

    /* JADX INFO: renamed from: h */
    public final float f10315h;

    /* JADX INFO: renamed from: i */
    public final float f10316i;

    public C3312i(float f2, float f5, float f6, boolean z5, boolean z6, float f7, float f8) {
        super(3);
        this.f10310c = f2;
        this.f10311d = f5;
        this.f10312e = f6;
        this.f10313f = z5;
        this.f10314g = z6;
        this.f10315h = f7;
        this.f10316i = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3312i)) {
            return false;
        }
        C3312i c3312i = (C3312i) obj;
        return Float.compare(this.f10310c, c3312i.f10310c) == 0 && Float.compare(this.f10311d, c3312i.f10311d) == 0 && Float.compare(this.f10312e, c3312i.f10312e) == 0 && this.f10313f == c3312i.f10313f && this.f10314g == c3312i.f10314g && Float.compare(this.f10315h, c3312i.f10315h) == 0 && Float.compare(this.f10316i, c3312i.f10316i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10316i) + AbstractC0231b.m390a(this.f10315h, AbstractC0231b.m395f(AbstractC0231b.m395f(AbstractC0231b.m390a(this.f10312e, AbstractC0231b.m390a(this.f10311d, Float.hashCode(this.f10310c) * 31, 31), 31), 31, this.f10313f), 31, this.f10314g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.f10310c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f10311d);
        sb.append(", theta=");
        sb.append(this.f10312e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f10313f);
        sb.append(", isPositiveArc=");
        sb.append(this.f10314g);
        sb.append(", arcStartX=");
        sb.append(this.f10315h);
        sb.append(", arcStartY=");
        return AbstractC0231b.m401l(sb, this.f10316i, ')');
    }
}
