package p245u0;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: u0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C3317n extends AbstractC3295B {

    /* JADX INFO: renamed from: c */
    public final float f10327c;

    /* JADX INFO: renamed from: d */
    public final float f10328d;

    public C3317n(float f2, float f5) {
        super(3);
        this.f10327c = f2;
        this.f10328d = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3317n)) {
            return false;
        }
        C3317n c3317n = (C3317n) obj;
        return Float.compare(this.f10327c, c3317n.f10327c) == 0 && Float.compare(this.f10328d, c3317n.f10328d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10328d) + (Float.hashCode(this.f10327c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f10327c);
        sb.append(", y=");
        return AbstractC0231b.m401l(sb, this.f10328d, ')');
    }
}
