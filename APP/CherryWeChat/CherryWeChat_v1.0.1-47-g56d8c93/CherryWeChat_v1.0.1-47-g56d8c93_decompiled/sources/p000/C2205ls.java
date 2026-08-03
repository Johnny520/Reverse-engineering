package p000;

import android.animation.TimeInterpolator;

/* JADX INFO: renamed from: ls */
/* JADX INFO: loaded from: classes.dex */
public final class C2205ls {

    /* JADX INFO: renamed from: a */
    public long f7684a;

    /* JADX INFO: renamed from: b */
    public long f7685b;

    /* JADX INFO: renamed from: c */
    public TimeInterpolator f7686c;

    /* JADX INFO: renamed from: d */
    public int f7687d;

    /* JADX INFO: renamed from: e */
    public int f7688e;

    /* JADX INFO: renamed from: a */
    public final TimeInterpolator m4443a() {
        TimeInterpolator timeInterpolator = this.f7686c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0776S2.f2454b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2205ls)) {
            return false;
        }
        C2205ls c2205ls = (C2205ls) obj;
        if (this.f7684a == c2205ls.f7684a && this.f7685b == c2205ls.f7685b && this.f7687d == c2205ls.f7687d && this.f7688e == c2205ls.f7688e) {
            return m4443a().getClass().equals(c2205ls.m4443a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f7684a;
        long j2 = this.f7685b;
        return ((((m4443a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f7687d) * 31) + this.f7688e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C2205ls.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f7684a);
        sb.append(" duration: ");
        sb.append(this.f7685b);
        sb.append(" interpolator: ");
        sb.append(m4443a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f7687d);
        sb.append(" repeatMode: ");
        return AbstractC0213Ey.m409g(sb, this.f7688e, "}\n");
    }
}
