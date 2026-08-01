package p245u0;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: u0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C3316m extends AbstractC3295B {

    /* JADX INFO: renamed from: c */
    public final float f10325c;

    /* JADX INFO: renamed from: d */
    public final float f10326d;

    public C3316m(float f2, float f5) {
        super(3);
        this.f10325c = f2;
        this.f10326d = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3316m)) {
            return false;
        }
        C3316m c3316m = (C3316m) obj;
        return Float.compare(this.f10325c, c3316m.f10325c) == 0 && Float.compare(this.f10326d, c3316m.f10326d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10326d) + (Float.hashCode(this.f10325c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f10325c);
        sb.append(", y=");
        return AbstractC0231b.m401l(sb, this.f10326d, ')');
    }
}
