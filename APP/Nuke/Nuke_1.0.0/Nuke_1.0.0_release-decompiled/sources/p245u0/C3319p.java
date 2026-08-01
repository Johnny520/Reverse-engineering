package p245u0;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: u0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C3319p extends AbstractC3295B {

    /* JADX INFO: renamed from: c */
    public final float f10333c;

    /* JADX INFO: renamed from: d */
    public final float f10334d;

    /* JADX INFO: renamed from: e */
    public final float f10335e;

    /* JADX INFO: renamed from: f */
    public final float f10336f;

    public C3319p(float f2, float f5, float f6, float f7) {
        super(2);
        this.f10333c = f2;
        this.f10334d = f5;
        this.f10335e = f6;
        this.f10336f = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3319p)) {
            return false;
        }
        C3319p c3319p = (C3319p) obj;
        return Float.compare(this.f10333c, c3319p.f10333c) == 0 && Float.compare(this.f10334d, c3319p.f10334d) == 0 && Float.compare(this.f10335e, c3319p.f10335e) == 0 && Float.compare(this.f10336f, c3319p.f10336f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10336f) + AbstractC0231b.m390a(this.f10335e, AbstractC0231b.m390a(this.f10334d, Float.hashCode(this.f10333c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f10333c);
        sb.append(", y1=");
        sb.append(this.f10334d);
        sb.append(", x2=");
        sb.append(this.f10335e);
        sb.append(", y2=");
        return AbstractC0231b.m401l(sb, this.f10336f, ')');
    }
}
