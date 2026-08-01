package p000;

import android.animation.TimeInterpolator;

/* JADX INFO: renamed from: cw */
/* JADX INFO: loaded from: classes.dex */
public final class C0129cw {

    /* JADX INFO: renamed from: a */
    public long f1325a;

    /* JADX INFO: renamed from: b */
    public long f1326b;

    /* JADX INFO: renamed from: c */
    public TimeInterpolator f1327c;

    /* JADX INFO: renamed from: d */
    public int f1328d;

    /* JADX INFO: renamed from: e */
    public int f1329e;

    /* JADX INFO: renamed from: a */
    public final TimeInterpolator m831a() {
        TimeInterpolator timeInterpolator = this.f1327c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0619q2.f3972b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0129cw)) {
            return false;
        }
        C0129cw c0129cw = (C0129cw) obj;
        if (this.f1325a == c0129cw.f1325a && this.f1326b == c0129cw.f1326b && this.f1328d == c0129cw.f1328d && this.f1329e == c0129cw.f1329e) {
            return m831a().getClass().equals(c0129cw.m831a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f1325a;
        long j2 = this.f1326b;
        return ((((m831a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f1328d) * 31) + this.f1329e;
    }

    public final String toString() {
        return "\n" + C0129cw.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f1325a + " duration: " + this.f1326b + " interpolator: " + m831a().getClass() + " repeatCount: " + this.f1328d + " repeatMode: " + this.f1329e + "}\n";
    }
}
