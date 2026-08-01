package androidx.collection;

import androidx.window.area.AbstractC3400;
import io.ktor.util.C5043;
import p064.C7348;
import p160.C8376;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1125 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f1330;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int[] f1331;

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC1125) {
            AbstractC1125 abstractC1125 = (AbstractC1125) obj;
            int i = abstractC1125.f1330;
            int i2 = this.f1330;
            if (i == i2) {
                int[] iArr = this.f1331;
                int[] iArr2 = abstractC1125.f1331;
                C7348 c7348M5627 = AbstractC3400.m5627(0, i2);
                int i3 = c7348M5627.f18163;
                int i4 = c7348M5627.f18161;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
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
        int[] iArr = this.f1331;
        int i = this.f1330;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Integer.hashCode(iArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f1331;
        int i = this.f1330;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
            i2++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m1415() {
        int i = this.f1330;
        if (i != 0) {
            return this.f1331[i - 1];
        }
        C5043.m9176("IntList is empty.");
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m1416(int i) {
        if (i >= 0 && i < this.f1330) {
            return this.f1331[i];
        }
        C8376.m13331("Index must be between 0 and size");
        return 0;
    }
}
