package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class yg0 {

    /* JADX INFO: renamed from: a */
    public long[] f7621a;

    /* JADX INFO: renamed from: b */
    public int f7622b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yg0(int i) {
        this.f7621a = i == 0 ? tb0.f5972a : new long[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m5257a(long j) {
        int i = this.f7622b + 1;
        long[] jArr = this.f7621a;
        if (jArr.length < i) {
            this.f7621a = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.f7621a;
        int i2 = this.f7622b;
        jArr2[i2] = j;
        this.f7622b = i2 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof yg0) {
            yg0 yg0Var = (yg0) obj;
            int i = yg0Var.f7622b;
            int i2 = this.f7622b;
            if (i == i2) {
                long[] jArr = this.f7621a;
                long[] jArr2 = yg0Var.f7621a;
                z20 z20VarM4893O = w60.m4893O(0, i2);
                int i3 = z20VarM4893O.f7248d;
                int i4 = z20VarM4893O.f7249e;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        long[] jArr = this.f7621a;
        int i = this.f7622b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Long.hashCode(jArr[i2]) * 31;
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.f7621a;
        int i = this.f7622b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
            i2++;
        }
        return sb.toString();
    }
}
