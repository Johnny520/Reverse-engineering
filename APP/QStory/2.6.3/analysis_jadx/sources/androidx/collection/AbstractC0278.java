package androidx.collection;

import androidx.window.area.AbstractC2567;
import io.ktor.util.C4211;
import p048.C6519;
import p144.C7547;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0278 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f985;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int[] f986;

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC0278) {
            AbstractC0278 abstractC0278 = (AbstractC0278) obj;
            int i = abstractC0278.f985;
            int i2 = this.f985;
            if (i == i2) {
                int[] iArr = this.f986;
                int[] iArr2 = abstractC0278.f986;
                C6519 c6519M5067 = AbstractC2567.m5067(0, i2);
                int i3 = c6519M5067.f17818;
                int i4 = c6519M5067.f17816;
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
        int[] iArr = this.f986;
        int i = this.f985;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Integer.hashCode(iArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f986;
        int i = this.f985;
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
    public final int m855() {
        int i = this.f985;
        if (i != 0) {
            return this.f986[i - 1];
        }
        C4211.m8617("IntList is empty.");
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m856(int i) {
        if (i >= 0 && i < this.f985) {
            return this.f986[i];
        }
        C7547.m12772("Index must be between 0 and size");
        return 0;
    }
}
