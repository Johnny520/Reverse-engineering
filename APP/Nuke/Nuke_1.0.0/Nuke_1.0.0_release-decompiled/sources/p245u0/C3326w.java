package p245u0;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: u0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C3326w extends AbstractC3295B {

    /* JADX INFO: renamed from: c */
    public final float f10357c;

    /* JADX INFO: renamed from: d */
    public final float f10358d;

    /* JADX INFO: renamed from: e */
    public final float f10359e;

    /* JADX INFO: renamed from: f */
    public final float f10360f;

    public C3326w(float f2, float f5, float f6, float f7) {
        super(1);
        this.f10357c = f2;
        this.f10358d = f5;
        this.f10359e = f6;
        this.f10360f = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3326w)) {
            return false;
        }
        C3326w c3326w = (C3326w) obj;
        return Float.compare(this.f10357c, c3326w.f10357c) == 0 && Float.compare(this.f10358d, c3326w.f10358d) == 0 && Float.compare(this.f10359e, c3326w.f10359e) == 0 && Float.compare(this.f10360f, c3326w.f10360f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10360f) + AbstractC0231b.m390a(this.f10359e, AbstractC0231b.m390a(this.f10358d, Float.hashCode(this.f10357c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.f10357c);
        sb.append(", dy1=");
        sb.append(this.f10358d);
        sb.append(", dx2=");
        sb.append(this.f10359e);
        sb.append(", dy2=");
        return AbstractC0231b.m401l(sb, this.f10360f, ')');
    }
}
