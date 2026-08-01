package top.suzhelan.qstory.hook.item;

import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p303.AbstractC9234;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6765 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final double f16468;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final double f16469;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final double f16470;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final double f16471;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f16472;

    public C6765(String str, double d, double d2, double d3, double d4) {
        AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜");
        this.f16472 = str;
        this.f16471 = d;
        this.f16470 = d2;
        this.f16469 = d3;
        this.f16468 = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6765)) {
            return false;
        }
        C6765 c6765 = (C6765) obj;
        return AbstractC5227.m9466(this.f16472, c6765.f16472) && Double.compare(this.f16471, c6765.f16471) == 0 && Double.compare(this.f16470, c6765.f16470) == 0 && Double.compare(this.f16469, c6765.f16469) == 0 && Double.compare(this.f16468, c6765.f16468) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f16468) + ((Double.hashCode(this.f16469) + ((Double.hashCode(this.f16470) + ((Double.hashCode(this.f16471) + (this.f16472.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC9234.m14531(2020));
        AbstractC7012.m12138(sb, this.f16472, 2021);
        sb.append(this.f16471);
        sb.append(AbstractC9234.m14531(2022));
        sb.append(this.f16470);
        sb.append(AbstractC9234.m14531(2023));
        sb.append(this.f16469);
        sb.append(AbstractC9234.m14531(2024));
        sb.append(this.f16468);
        sb.append(')');
        return sb.toString();
    }
}
