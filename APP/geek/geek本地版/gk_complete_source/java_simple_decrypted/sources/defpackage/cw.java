package defpackage;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class cw {
    public long a;
    public long b;
    public TimeInterpolator c;
    public int d;
    public int e;

    public final TimeInterpolator a() {
        TimeInterpolator r0 = this.c;
        if (r0 == null) goto L6;
        return r0;
    L6:
        return q2.b;
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if ((r7 instanceof cw) == true) goto L8;
        return false;
    L8:
        cw r72 = (cw) r7;
        if (this.a == r72.a) goto L12;
        return false;
    L12:
        if (this.b == r72.b) goto L15;
        return false;
    L15:
        if (this.d == r72.d) goto L18;
        return false;
    L18:
        if (this.e == r72.e) goto L21;
        return false;
    L21:
        return a().getClass().equals(r72.a().getClass());
    }

    public final int hashCode() {
        long r0 = this.a;
        int r02 = ((int) (r0 ^ (r0 >>> 32))) * 31;
        long r3 = this.b;
        int r03 = (r02 + ((int) ((r3 >>> 32) ^ r3))) * 31;
        return ((((a().getClass().hashCode() + r03) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "\n" + cw.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.a + " duration: " + this.b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.e + "}\n";
    }
}
