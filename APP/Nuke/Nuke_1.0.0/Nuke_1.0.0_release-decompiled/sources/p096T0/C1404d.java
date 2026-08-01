package p096T0;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: T0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1404d {

    /* JADX INFO: renamed from: a */
    public final int f5025a;

    /* JADX INFO: renamed from: b */
    public final int f5026b;

    /* JADX INFO: renamed from: c */
    public final boolean f5027c;

    public C1404d(int i5, int i6, boolean z5) {
        this.f5025a = i5;
        this.f5026b = i6;
        this.f5027c = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1404d)) {
            return false;
        }
        C1404d c1404d = (C1404d) obj;
        return this.f5025a == c1404d.f5025a && this.f5026b == c1404d.f5026b && this.f5027c == c1404d.f5027c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5027c) + AbstractC0231b.m391b(this.f5026b, Integer.hashCode(this.f5025a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.f5025a + ", end=" + this.f5026b + ", isRtl=" + this.f5027c + ')';
    }
}
