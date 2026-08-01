package p245u0;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: u0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C3320q extends AbstractC3295B {

    /* JADX INFO: renamed from: c */
    public final float f10337c;

    /* JADX INFO: renamed from: d */
    public final float f10338d;

    public C3320q(float f2, float f5) {
        super(1);
        this.f10337c = f2;
        this.f10338d = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3320q)) {
            return false;
        }
        C3320q c3320q = (C3320q) obj;
        return Float.compare(this.f10337c, c3320q.f10337c) == 0 && Float.compare(this.f10338d, c3320q.f10338d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10338d) + (Float.hashCode(this.f10337c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.f10337c);
        sb.append(", y=");
        return AbstractC0231b.m401l(sb, this.f10338d, ')');
    }
}
