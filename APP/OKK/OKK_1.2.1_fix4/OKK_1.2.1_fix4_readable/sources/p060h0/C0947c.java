package p060h0;

import android.animation.TimeInterpolator;

/* JADX INFO: renamed from: h0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0947c {

    /* JADX INFO: renamed from: a */
    public long f3360a;

    /* JADX INFO: renamed from: b */
    public long f3361b;

    /* JADX INFO: renamed from: c */
    public TimeInterpolator f3362c;

    /* JADX INFO: renamed from: d */
    public int f3363d;

    /* JADX INFO: renamed from: e */
    public int f3364e;

    /* JADX INFO: renamed from: a */
    public final TimeInterpolator m2280a() {
        TimeInterpolator timeInterpolator = this.f3362c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0945a.f3355b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0947c)) {
            return false;
        }
        C0947c c0947c = (C0947c) obj;
        if (this.f3360a == c0947c.f3360a && this.f3361b == c0947c.f3361b && this.f3363d == c0947c.f3363d && this.f3364e == c0947c.f3364e) {
            return m2280a().getClass().equals(c0947c.m2280a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f3360a;
        long j3 = this.f3361b;
        return ((((m2280a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.f3363d) * 31) + this.f3364e;
    }

    public final String toString() {
        return "\n" + C0947c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3360a + " duration: " + this.f3361b + " interpolator: " + m2280a().getClass() + " repeatCount: " + this.f3363d + " repeatMode: " + this.f3364e + "}\n";
    }
}
