package p245u0;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: u0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C3324u extends AbstractC3295B {

    /* JADX INFO: renamed from: c */
    public final float f10353c;

    /* JADX INFO: renamed from: d */
    public final float f10354d;

    public C3324u(float f2, float f5) {
        super(3);
        this.f10353c = f2;
        this.f10354d = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3324u)) {
            return false;
        }
        C3324u c3324u = (C3324u) obj;
        return Float.compare(this.f10353c, c3324u.f10353c) == 0 && Float.compare(this.f10354d, c3324u.f10354d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10354d) + (Float.hashCode(this.f10353c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f10353c);
        sb.append(", dy=");
        return AbstractC0231b.m401l(sb, this.f10354d, ')');
    }
}
