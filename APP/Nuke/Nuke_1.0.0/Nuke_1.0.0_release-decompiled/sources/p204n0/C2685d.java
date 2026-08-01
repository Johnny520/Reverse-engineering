package p204n0;

import com.bumptech.glide.AbstractC1923e;
import p011B4.AbstractC0231b;
import p127Z2.AbstractC1784a;
import p128a.AbstractC1785a;

/* JADX INFO: renamed from: n0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2685d {

    /* JADX INFO: renamed from: a */
    public final float f8562a;

    /* JADX INFO: renamed from: b */
    public final float f8563b;

    /* JADX INFO: renamed from: c */
    public final float f8564c;

    /* JADX INFO: renamed from: d */
    public final float f8565d;

    /* JADX INFO: renamed from: e */
    public final long f8566e;

    /* JADX INFO: renamed from: f */
    public final long f8567f;

    /* JADX INFO: renamed from: g */
    public final long f8568g;

    /* JADX INFO: renamed from: h */
    public final long f8569h;

    static {
        AbstractC1923e.m3465c(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public C2685d(float f2, float f5, float f6, float f7, long j5, long j6, long j7, long j8) {
        this.f8562a = f2;
        this.f8563b = f5;
        this.f8564c = f6;
        this.f8565d = f7;
        this.f8566e = j5;
        this.f8567f = j6;
        this.f8568g = j7;
        this.f8569h = j8;
    }

    /* JADX INFO: renamed from: a */
    public final float m4659a() {
        return this.f8565d - this.f8563b;
    }

    /* JADX INFO: renamed from: b */
    public final float m4660b() {
        return this.f8564c - this.f8562a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2685d)) {
            return false;
        }
        C2685d c2685d = (C2685d) obj;
        return Float.compare(this.f8562a, c2685d.f8562a) == 0 && Float.compare(this.f8563b, c2685d.f8563b) == 0 && Float.compare(this.f8564c, c2685d.f8564c) == 0 && Float.compare(this.f8565d, c2685d.f8565d) == 0 && AbstractC1784a.m3231q(this.f8566e, c2685d.f8566e) && AbstractC1784a.m3231q(this.f8567f, c2685d.f8567f) && AbstractC1784a.m3231q(this.f8568g, c2685d.f8568g) && AbstractC1784a.m3231q(this.f8569h, c2685d.f8569h);
    }

    public final int hashCode() {
        return Long.hashCode(this.f8569h) + AbstractC0231b.m392c(AbstractC0231b.m392c(AbstractC0231b.m392c(AbstractC0231b.m390a(this.f8565d, AbstractC0231b.m390a(this.f8564c, AbstractC0231b.m390a(this.f8563b, Float.hashCode(this.f8562a) * 31, 31), 31), 31), 31, this.f8566e), 31, this.f8567f), 31, this.f8568g);
    }

    public final String toString() {
        String str = AbstractC1785a.m3258t(this.f8562a) + ", " + AbstractC1785a.m3258t(this.f8563b) + ", " + AbstractC1785a.m3258t(this.f8564c) + ", " + AbstractC1785a.m3258t(this.f8565d);
        long j5 = this.f8566e;
        long j6 = this.f8567f;
        boolean zM3231q = AbstractC1784a.m3231q(j5, j6);
        long j7 = this.f8568g;
        long j8 = this.f8569h;
        if (!zM3231q || !AbstractC1784a.m3231q(j6, j7) || !AbstractC1784a.m3231q(j7, j8)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) AbstractC1784a.m3208V(j5)) + ", topRight=" + ((Object) AbstractC1784a.m3208V(j6)) + ", bottomRight=" + ((Object) AbstractC1784a.m3208V(j7)) + ", bottomLeft=" + ((Object) AbstractC1784a.m3208V(j8)) + ')';
        }
        int i5 = (int) (j5 >> 32);
        int i6 = (int) (j5 & 4294967295L);
        if (Float.intBitsToFloat(i5) == Float.intBitsToFloat(i6)) {
            return "RoundRect(rect=" + str + ", radius=" + AbstractC1785a.m3258t(Float.intBitsToFloat(i5)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + AbstractC1785a.m3258t(Float.intBitsToFloat(i5)) + ", y=" + AbstractC1785a.m3258t(Float.intBitsToFloat(i6)) + ')';
    }
}
