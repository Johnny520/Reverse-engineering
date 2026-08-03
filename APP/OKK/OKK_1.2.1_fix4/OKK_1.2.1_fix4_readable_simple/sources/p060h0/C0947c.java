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
        TimeInterpolator r02 = this.f3362c;
        if (r02 == null) goto L6;
        return r02;
    L6:
        return AbstractC0945a.f3355b;
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if ((r7 instanceof C0947c) == true) goto L8;
        return false;
    L8:
        C0947c r72 = (C0947c) r7;
        long r2 = r72.f3360a;
        if (this.f3360a == r2) goto L12;
        return false;
    L12:
        if (this.f3361b == r72.f3361b) goto L15;
        return false;
    L15:
        if (this.f3363d == r72.f3363d) goto L18;
        return false;
    L18:
        if (this.f3364e == r72.f3364e) goto L21;
        return false;
    L21:
        return m2280a().getClass().equals(r72.m2280a().getClass());
    }

    public final int hashCode() {
        long r02 = this.f3360a;
        int r03 = ((int) (r02 ^ (r02 >>> 32))) * 31;
        long r3 = this.f3361b;
        int r04 = (r03 + ((int) ((r3 >>> 32) ^ r3))) * 31;
        return ((((m2280a().getClass().hashCode() + r04) * 31) + this.f3363d) * 31) + this.f3364e;
    }

    public final String toString() {
        return "\n" + C0947c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3360a + " duration: " + this.f3361b + " interpolator: " + m2280a().getClass() + " repeatCount: " + this.f3363d + " repeatMode: " + this.f3364e + "}\n";
    }
}
