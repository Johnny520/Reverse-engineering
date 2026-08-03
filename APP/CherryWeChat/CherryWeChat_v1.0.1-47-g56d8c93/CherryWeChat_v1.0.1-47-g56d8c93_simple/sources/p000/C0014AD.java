package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: AD */
/* JADX INFO: loaded from: classes.dex */
public final class C0014AD implements Comparable, Serializable {

    /* JADX INFO: renamed from: c */
    public static final C0014AD f18c = null;

    /* JADX INFO: renamed from: a */
    public final long f19a;

    /* JADX INFO: renamed from: b */
    public final long f20b;

    static {
        f18c = new C0014AD(0, 0);
    }

    public C0014AD(long r1, long r3) {
        this.f19a = r1;
        this.f20b = r3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r6) {
        C0014AD r62 = (C0014AD) r6;
        long r0 = r62.f19a;
        long r2 = this.f19a;
        if (r2 == r0) goto L7;
        return Long.compareUnsigned(r2, r0);
    L7:
        return Long.compareUnsigned(this.f20b, r62.f20b);
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C0014AD) == true) goto L8;
        return false;
    L8:
        C0014AD r82 = (C0014AD) r8;
        long r3 = r82.f19a;
        if (this.f19a == r3) goto L11;
    L13:
        return false;
    L11:
        if (this.f20b != r82.f20b) goto L13;
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19a ^ this.f20b);
    }

    public final String toString() {
        byte[] r3 = new byte[36];
        AbstractC0714Qj.m1496r(this.f19a, r3, 0, 0, 4);
        r3[8] = 45;
        AbstractC0714Qj.m1496r(this.f19a, r3, 9, 4, 6);
        r3[13] = 45;
        AbstractC0714Qj.m1496r(this.f19a, r3, 14, 6, 8);
        r3[18] = 45;
        AbstractC0714Qj.m1496r(this.f20b, r3, 19, 0, 2);
        r3[23] = 45;
        AbstractC0714Qj.m1496r(this.f20b, r3, 24, 2, 8);
        return new String(r3, AbstractC2659w7.f9201a);
    }
}
