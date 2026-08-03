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
        TimeInterpolator r0 = this.f7686c;
        if (r0 == null) goto L6;
        return r0;
    L6:
        return AbstractC0776S2.f2454b;
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if ((r7 instanceof C2205ls) == true) goto L8;
        return false;
    L8:
        C2205ls r72 = (C2205ls) r7;
        if (this.f7684a == r72.f7684a) goto L12;
        return false;
    L12:
        if (this.f7685b == r72.f7685b) goto L15;
        return false;
    L15:
        if (this.f7687d == r72.f7687d) goto L18;
        return false;
    L18:
        if (this.f7688e == r72.f7688e) goto L21;
        return false;
    L21:
        return m4443a().getClass().equals(r72.m4443a().getClass());
    }

    public final int hashCode() {
        long r0 = this.f7684a;
        int r02 = ((int) (r0 ^ (r0 >>> 32))) * 31;
        long r3 = this.f7685b;
        int r03 = (r02 + ((int) ((r3 >>> 32) ^ r3))) * 31;
        return ((((m4443a().getClass().hashCode() + r03) * 31) + this.f7687d) * 31) + this.f7688e;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("\n");
        r0.append(C2205ls.class.getName());
        r0.append('{');
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        r0.append(" delay: ");
        r0.append(this.f7684a);
        r0.append(" duration: ");
        r0.append(this.f7685b);
        r0.append(" interpolator: ");
        r0.append(m4443a().getClass());
        r0.append(" repeatCount: ");
        r0.append(this.f7687d);
        r0.append(" repeatMode: ");
        return AbstractC0213Ey.m409g(r0, this.f7688e, "}\n");
    }
}
