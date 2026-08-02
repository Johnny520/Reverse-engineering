package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g93 implements Comparable, Serializable {

    /* JADX INFO: renamed from: j */
    public static final g93 f3368j = new g93(0, 0);

    /* JADX INFO: renamed from: h */
    public final long f3369h;

    /* JADX INFO: renamed from: i */
    public final long f3370i;

    public g93(long j, long j2) {
        this.f3369h = j;
        this.f3370i = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g93 g93Var = (g93) obj;
        g93Var.getClass();
        long j = g93Var.f3369h;
        long j2 = this.f3369h;
        return j2 != j ? Long.compareUnsigned(j2, j) : Long.compareUnsigned(this.f3370i, g93Var.f3370i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g93)) {
            return false;
        }
        g93 g93Var = (g93) obj;
        return this.f3369h == g93Var.f3369h && this.f3370i == g93Var.f3370i;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3369h ^ this.f3370i);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        lg3.m2911c(this.f3369h, bArr, 0, 0, 4);
        bArr[8] = 45;
        lg3.m2911c(this.f3369h, bArr, 9, 4, 6);
        bArr[13] = 45;
        lg3.m2911c(this.f3369h, bArr, 14, 6, 8);
        bArr[18] = 45;
        lg3.m2911c(this.f3370i, bArr, 19, 0, 2);
        bArr[23] = 45;
        lg3.m2911c(this.f3370i, bArr, 24, 2, 8);
        return new String(bArr, AbstractC0856wq.f12612a);
    }
}
