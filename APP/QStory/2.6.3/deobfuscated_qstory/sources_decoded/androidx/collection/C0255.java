package androidx.collection;

import androidx.window.area.AbstractC2567;
import java.util.Arrays;
import p048.C6519;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0255 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f930;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long[] f931;

    public C0255(int i) {
        this.f931 = i == 0 ? AbstractC0264.f952 : new long[i];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0255) {
            C0255 c0255 = (C0255) obj;
            int i = c0255.f930;
            int i2 = this.f930;
            if (i == i2) {
                long[] jArr = this.f931;
                long[] jArr2 = c0255.f931;
                C6519 c6519M5067 = AbstractC2567.m5067(0, i2);
                int i3 = c6519M5067.f17818;
                int i4 = c6519M5067.f17816;
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
        long[] jArr = this.f931;
        int i = this.f930;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Long.hashCode(jArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.f931;
        int i = this.f930;
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
    public final void m819(long j) {
        int i = this.f930 + 1;
        long[] jArr = this.f931;
        if (jArr.length < i) {
            this.f931 = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.f931;
        int i2 = this.f930;
        jArr2[i2] = j;
        this.f930 = i2 + 1;
    }

    public /* synthetic */ C0255() {
        this(16);
    }
}
