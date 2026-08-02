package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ck1 {

    /* JADX INFO: renamed from: a */
    public long[] f1598a;

    /* JADX INFO: renamed from: b */
    public int f1599b;

    public ck1(int i) {
        this.f1598a = i == 0 ? fd1.f2910a : new long[i];
    }

    /* JADX INFO: renamed from: a */
    public final void m848a(long j) {
        int i = this.f1599b + 1;
        long[] jArr = this.f1598a;
        if (jArr.length < i) {
            this.f1598a = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.f1598a;
        int i2 = this.f1599b;
        jArr2[i2] = j;
        this.f1599b = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ck1) {
            ck1 ck1Var = (ck1) obj;
            int i = ck1Var.f1599b;
            int i2 = this.f1599b;
            if (i == i2) {
                long[] jArr = this.f1598a;
                long[] jArr2 = ck1Var.f1598a;
                c11 c11VarM799X = ci0.m799X(0, i2);
                int i3 = c11VarM799X.f25h;
                int i4 = c11VarM799X.f26i;
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

    public final int hashCode() {
        long[] jArr = this.f1598a;
        int i = this.f1599b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Long.hashCode(jArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.f1598a;
        int i = this.f1599b;
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

    public /* synthetic */ ck1() {
        this(16);
    }
}
