package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: yp */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0931yp implements Comparable {

    /* JADX INFO: renamed from: h */
    public final int f13548h;

    /* JADX INFO: renamed from: i */
    public final int f13549i;

    /* JADX INFO: renamed from: j */
    public final C0855wp f13550j;

    public C0931yp(int i, int i2, C0855wp c0855wp) {
        if (i < 0) {
            C0676s.m4651j("start < 0");
            throw null;
        }
        if (i2 <= i) {
            C0676s.m4651j("end <= start");
            throw null;
        }
        if (c0855wp.f11990h) {
            C0676s.m4651j("handlers.isMutable()");
            throw null;
        }
        this.f13548h = i;
        this.f13549i = i2;
        this.f13550j = c0855wp;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0931yp c0931yp) {
        int i = c0931yp.f13548h;
        int i2 = this.f13548h;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int i3 = c0931yp.f13549i;
        int i4 = this.f13549i;
        if (i4 < i3) {
            return -1;
        }
        if (i4 > i3) {
            return 1;
        }
        return this.f13550j.compareTo(c0931yp.f13550j);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0931yp) && compareTo((C0931yp) obj) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f13550j.f5590i) + (((this.f13548h * 31) + this.f13549i) * 31);
    }
}
