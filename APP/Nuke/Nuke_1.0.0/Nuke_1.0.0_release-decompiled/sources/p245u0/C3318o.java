package p245u0;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: u0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C3318o extends AbstractC3295B {

    /* JADX INFO: renamed from: c */
    public final float f10329c;

    /* JADX INFO: renamed from: d */
    public final float f10330d;

    /* JADX INFO: renamed from: e */
    public final float f10331e;

    /* JADX INFO: renamed from: f */
    public final float f10332f;

    public C3318o(float f2, float f5, float f6, float f7) {
        super(1);
        this.f10329c = f2;
        this.f10330d = f5;
        this.f10331e = f6;
        this.f10332f = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3318o)) {
            return false;
        }
        C3318o c3318o = (C3318o) obj;
        return Float.compare(this.f10329c, c3318o.f10329c) == 0 && Float.compare(this.f10330d, c3318o.f10330d) == 0 && Float.compare(this.f10331e, c3318o.f10331e) == 0 && Float.compare(this.f10332f, c3318o.f10332f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10332f) + AbstractC0231b.m390a(this.f10331e, AbstractC0231b.m390a(this.f10330d, Float.hashCode(this.f10329c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuadTo(x1=");
        sb.append(this.f10329c);
        sb.append(", y1=");
        sb.append(this.f10330d);
        sb.append(", x2=");
        sb.append(this.f10331e);
        sb.append(", y2=");
        return AbstractC0231b.m401l(sb, this.f10332f, ')');
    }
}
