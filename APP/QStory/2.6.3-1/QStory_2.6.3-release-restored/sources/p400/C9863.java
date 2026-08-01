package p400;

import androidx.activity.AbstractC0900;
import p025.AbstractC7012;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9863 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f25660;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f25661;

    public C9863(int i, int i2) {
        this.f25661 = i;
        this.f25660 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9863)) {
            return false;
        }
        C9863 c9863 = (C9863) obj;
        return this.f25661 == c9863.f25661 && this.f25660 == c9863.f25660;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25660) + (Integer.hashCode(this.f25661) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProtoVarInt(value=");
        AbstractC7012.m12137(sb, this.f25661, 1410);
        return AbstractC0900.m716(sb, this.f25660, ')');
    }
}
