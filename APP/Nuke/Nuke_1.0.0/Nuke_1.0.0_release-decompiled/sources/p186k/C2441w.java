package p186k;

import com.bumptech.glide.AbstractC1926h;
import java.util.Arrays;
import p117X2.AbstractC1665j;
import p132a3.C1804d;

/* JADX INFO: renamed from: k.w */
/* JADX INFO: loaded from: classes.dex */
public final class C2441w {

    /* JADX INFO: renamed from: a */
    public long[] f7885a;

    /* JADX INFO: renamed from: b */
    public int f7886b;

    public C2441w(int i5) {
        this.f7885a = i5 == 0 ? AbstractC2432n.f7853a : new long[i5];
    }

    /* JADX INFO: renamed from: a */
    public final void m4351a(long j5) {
        int i5 = this.f7886b + 1;
        long[] jArr = this.f7885a;
        if (jArr.length < i5) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i5, (jArr.length * 3) / 2));
            AbstractC1665j.m2984d(jArrCopyOf, "copyOf(...)");
            this.f7885a = jArrCopyOf;
        }
        long[] jArr2 = this.f7885a;
        int i6 = this.f7886b;
        jArr2[i6] = j5;
        this.f7886b = i6 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2441w) {
            C2441w c2441w = (C2441w) obj;
            int i5 = c2441w.f7886b;
            int i6 = this.f7886b;
            if (i5 == i6) {
                long[] jArr = this.f7885a;
                long[] jArr2 = c2441w.f7885a;
                C1804d c1804dM3557J = AbstractC1926h.m3557J(0, i6);
                int i7 = c1804dM3557J.f6140d;
                int i8 = c1804dM3557J.f6141e;
                if (i7 > i8) {
                    return true;
                }
                while (jArr[i7] == jArr2[i7]) {
                    if (i7 == i8) {
                        return true;
                    }
                    i7++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f7885a;
        int i5 = this.f7886b;
        int iHashCode = 0;
        for (int i6 = 0; i6 < i5; i6++) {
            iHashCode += Long.hashCode(jArr[i6]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.f7885a;
        int i5 = this.f7886b;
        int i6 = 0;
        while (true) {
            if (i6 >= i5) {
                sb.append((CharSequence) "]");
                break;
            }
            long j5 = jArr[i6];
            if (i6 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i6 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j5);
            i6++;
        }
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "toString(...)");
        return string;
    }
}
