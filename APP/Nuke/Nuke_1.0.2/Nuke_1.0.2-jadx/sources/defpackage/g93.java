package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g93 implements Comparable, Serializable {
    public static final g93 j = new g93(0, 0);
    public final long h;
    public final long i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g93(long j2, long j3) {
        this.h = j2;
        this.i = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g93 g93Var = (g93) obj;
        g93Var.getClass();
        long j2 = g93Var.h;
        long j3 = this.h;
        return j3 != j2 ? Long.compareUnsigned(j3, j2) : Long.compareUnsigned(this.i, g93Var.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g93)) {
            return false;
        }
        g93 g93Var = (g93) obj;
        return this.h == g93Var.h && this.i == g93Var.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.h ^ this.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        byte[] bArr = new byte[36];
        lg3.c(this.h, bArr, 0, 0, 4);
        bArr[8] = 45;
        lg3.c(this.h, bArr, 9, 4, 6);
        bArr[13] = 45;
        lg3.c(this.h, bArr, 14, 6, 8);
        bArr[18] = 45;
        lg3.c(this.i, bArr, 19, 0, 2);
        bArr[23] = 45;
        lg3.c(this.i, bArr, 24, 2, 8);
        return new String(bArr, wq.a);
    }
}
