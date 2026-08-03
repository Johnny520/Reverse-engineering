package p000a;

import android.animation.TimeInterpolator;

/* JADX INFO: renamed from: a.vb */
/* JADX INFO: loaded from: classes.dex */
public final class C0880vb {

    /* JADX INFO: renamed from: a */
    public long f3452a;

    /* JADX INFO: renamed from: c */
    public TimeInterpolator f3454c = null;

    /* JADX INFO: renamed from: d */
    public int f3455d = 0;

    /* JADX INFO: renamed from: e */
    public int f3456e = 1;

    /* JADX INFO: renamed from: b */
    public long f3453b = 150;

    public C0880vb(long j) {
        this.f3452a = j;
    }

    /* JADX INFO: renamed from: a */
    public final TimeInterpolator m2106a() {
        TimeInterpolator timeInterpolator = this.f3454c;
        return timeInterpolator != null ? timeInterpolator : C0888w0.f3469b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0880vb)) {
            return false;
        }
        C0880vb c0880vb = (C0880vb) obj;
        if (this.f3452a == c0880vb.f3452a && this.f3453b == c0880vb.f3453b && this.f3455d == c0880vb.f3455d && this.f3456e == c0880vb.f3456e) {
            return m2106a().getClass().equals(c0880vb.m2106a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f3452a;
        long j2 = this.f3453b;
        return ((((m2106a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f3455d) * 31) + this.f3456e;
    }

    public final String toString() {
        return "\n" + C0880vb.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3452a + " duration: " + this.f3453b + " interpolator: " + m2106a().getClass() + " repeatCount: " + this.f3455d + " repeatMode: " + this.f3456e + "}\n";
    }
}
