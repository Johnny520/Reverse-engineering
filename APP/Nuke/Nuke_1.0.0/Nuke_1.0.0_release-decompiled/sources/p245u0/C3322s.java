package p245u0;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: u0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C3322s extends AbstractC3295B {

    /* JADX INFO: renamed from: c */
    public final float f10346c;

    /* JADX INFO: renamed from: d */
    public final float f10347d;

    /* JADX INFO: renamed from: e */
    public final float f10348e;

    /* JADX INFO: renamed from: f */
    public final float f10349f;

    /* JADX INFO: renamed from: g */
    public final float f10350g;

    /* JADX INFO: renamed from: h */
    public final float f10351h;

    public C3322s(float f2, float f5, float f6, float f7, float f8, float f9) {
        super(2);
        this.f10346c = f2;
        this.f10347d = f5;
        this.f10348e = f6;
        this.f10349f = f7;
        this.f10350g = f8;
        this.f10351h = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3322s)) {
            return false;
        }
        C3322s c3322s = (C3322s) obj;
        return Float.compare(this.f10346c, c3322s.f10346c) == 0 && Float.compare(this.f10347d, c3322s.f10347d) == 0 && Float.compare(this.f10348e, c3322s.f10348e) == 0 && Float.compare(this.f10349f, c3322s.f10349f) == 0 && Float.compare(this.f10350g, c3322s.f10350g) == 0 && Float.compare(this.f10351h, c3322s.f10351h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10351h) + AbstractC0231b.m390a(this.f10350g, AbstractC0231b.m390a(this.f10349f, AbstractC0231b.m390a(this.f10348e, AbstractC0231b.m390a(this.f10347d, Float.hashCode(this.f10346c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f10346c);
        sb.append(", dy1=");
        sb.append(this.f10347d);
        sb.append(", dx2=");
        sb.append(this.f10348e);
        sb.append(", dy2=");
        sb.append(this.f10349f);
        sb.append(", dx3=");
        sb.append(this.f10350g);
        sb.append(", dy3=");
        return AbstractC0231b.m401l(sb, this.f10351h, ')');
    }
}
