package p384;

import androidx.activity.AbstractC0053;
import p009.AbstractC6183;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9034 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f25315;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f25316;

    public C9034(int i, int i2) {
        this.f25316 = i;
        this.f25315 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9034)) {
            return false;
        }
        C9034 c9034 = (C9034) obj;
        return this.f25316 == c9034.f25316 && this.f25315 == c9034.f25315;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25315) + (Integer.hashCode(this.f25316) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(1409));
        AbstractC6183.m11578(sb, this.f25316, 1410);
        return AbstractC0053.m156(sb, this.f25315, ')');
    }
}
