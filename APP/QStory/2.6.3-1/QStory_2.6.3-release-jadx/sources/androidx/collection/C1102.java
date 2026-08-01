package androidx.collection;

import androidx.window.area.AbstractC3400;
import java.util.Arrays;
import p064.C7348;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1102 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f1275;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long[] f1276;

    public C1102(int i) {
        this.f1276 = i == 0 ? AbstractC1111.f1297 : new long[i];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1102) {
            C1102 c1102 = (C1102) obj;
            int i = c1102.f1275;
            int i2 = this.f1275;
            if (i == i2) {
                long[] jArr = this.f1276;
                long[] jArr2 = c1102.f1276;
                C7348 c7348M5627 = AbstractC3400.m5627(0, i2);
                int i3 = c7348M5627.f18163;
                int i4 = c7348M5627.f18161;
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
        long[] jArr = this.f1276;
        int i = this.f1275;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Long.hashCode(jArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.f1276;
        int i = this.f1275;
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

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1379(long j) {
        int i = this.f1275 + 1;
        long[] jArr = this.f1276;
        if (jArr.length < i) {
            this.f1276 = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.f1276;
        int i2 = this.f1275;
        jArr2[i2] = j;
        this.f1275 = i2 + 1;
    }

    public /* synthetic */ C1102() {
        this(16);
    }
}
