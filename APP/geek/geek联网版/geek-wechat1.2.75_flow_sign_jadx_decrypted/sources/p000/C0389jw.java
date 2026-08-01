package p000;

import android.animation.TimeInterpolator;

/* JADX INFO: renamed from: jw */
/* JADX INFO: loaded from: classes.dex */
public final class C0389jw {

    /* JADX INFO: renamed from: a */
    public long f2746a;

    /* JADX INFO: renamed from: b */
    public long f2747b;

    /* JADX INFO: renamed from: c */
    public TimeInterpolator f2748c;

    /* JADX INFO: renamed from: d */
    public int f2749d;

    /* JADX INFO: renamed from: e */
    public int f2750e;

    /* JADX INFO: renamed from: a */
    public final TimeInterpolator m1638a() {
        TimeInterpolator timeInterpolator = this.f2748c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0618q2.f3771b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0389jw)) {
            return false;
        }
        C0389jw c0389jw = (C0389jw) obj;
        if (this.f2746a == c0389jw.f2746a && this.f2747b == c0389jw.f2747b && this.f2749d == c0389jw.f2749d && this.f2750e == c0389jw.f2750e) {
            return m1638a().getClass().equals(c0389jw.m1638a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f2746a;
        long j2 = this.f2747b;
        return ((((m1638a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f2749d) * 31) + this.f2750e;
    }

    public final String toString() {
        return "\n" + C0389jw.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f2746a + " duration: " + this.f2747b + " interpolator: " + m1638a().getClass() + " repeatCount: " + this.f2749d + " repeatMode: " + this.f2750e + "}\n";
    }
}
