package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rw1 {

    /* JADX INFO: renamed from: a */
    public final C0726t9 f9775a;

    /* JADX INFO: renamed from: b */
    public final int f9776b;

    /* JADX INFO: renamed from: c */
    public final int f9777c;

    /* JADX INFO: renamed from: d */
    public final int f9778d;

    /* JADX INFO: renamed from: e */
    public final int f9779e;

    /* JADX INFO: renamed from: f */
    public final float f9780f;

    /* JADX INFO: renamed from: g */
    public final float f9781g;

    public rw1(C0726t9 c0726t9, int i, int i2, int i3, int i4, float f, float f2) {
        this.f9775a = c0726t9;
        this.f9776b = i;
        this.f9777c = i2;
        this.f9778d = i3;
        this.f9779e = i4;
        this.f9780f = f;
        this.f9781g = f2;
    }

    /* JADX INFO: renamed from: a */
    public final o62 m4620a(o62 o62Var) {
        return o62Var.m3521i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f9780f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: b */
    public final long m4621b(long j, boolean z) {
        if (z) {
            long j2 = f13.f2737b;
            if (f13.m1493b(j, j2)) {
                return j2;
            }
        }
        int i = f13.f2738c;
        int i2 = this.f9776b;
        return fg1.m1636i(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    /* JADX INFO: renamed from: c */
    public final o62 m4622c(o62 o62Var) {
        float f = -this.f9780f;
        return o62Var.m3521i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public final int m4623d(int i) {
        int i2 = this.f9777c;
        int i3 = this.f9776b;
        return ci0.m779D(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rw1) {
            rw1 rw1Var = (rw1) obj;
            if (this.f9775a == rw1Var.f9775a && this.f9776b == rw1Var.f9776b && this.f9777c == rw1Var.f9777c && this.f9778d == rw1Var.f9778d && this.f9779e == rw1Var.f9779e && Float.compare(this.f9780f, rw1Var.f9780f) == 0 && Float.compare(this.f9781g, rw1Var.f9781g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9781g) + vi0.m5684c(this.f9780f, vi0.m5685d(this.f9779e, vi0.m5685d(this.f9778d, vi0.m5685d(this.f9777c, vi0.m5685d(this.f9776b, this.f9775a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f9775a);
        sb.append(", startIndex=");
        sb.append(this.f9776b);
        sb.append(", endIndex=");
        sb.append(this.f9777c);
        sb.append(", startLineIndex=");
        sb.append(this.f9778d);
        sb.append(", endLineIndex=");
        sb.append(this.f9779e);
        sb.append(", top=");
        sb.append(this.f9780f);
        sb.append(", bottom=");
        return vi0.m5693l(sb, this.f9781g, ')');
    }
}
