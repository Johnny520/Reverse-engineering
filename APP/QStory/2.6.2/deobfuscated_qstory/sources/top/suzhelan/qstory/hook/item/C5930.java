package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5930 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final double f16119;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final double f16120;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final double f16121;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final double f16122;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f16123;

    public C5930(String str, double d, double d2, double d3, double d4) {
        "name";
        this.f16123 = str;
        this.f16122 = d;
        this.f16121 = d2;
        this.f16120 = d3;
        this.f16119 = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5930)) {
            return false;
        }
        C5930 c5930 = (C5930) obj;
        return AbstractC4394.m8917(this.f16123, c5930.f16123) && Double.compare(this.f16122, c5930.f16122) == 0 && Double.compare(this.f16121, c5930.f16121) == 0 && Double.compare(this.f16120, c5930.f16120) == 0 && Double.compare(this.f16119, c5930.f16119) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f16119) + ((Double.hashCode(this.f16120) + ((Double.hashCode(this.f16121) + ((Double.hashCode(this.f16122) + (this.f16123.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LandRegion(name=");
        AbstractC6136.m11531(sb, this.f16123, -3937770310779274663L);
        sb.append(this.f16122);
        sb.append(", maxLat=");
        sb.append(this.f16121);
        sb.append(", minLon=");
        sb.append(this.f16120);
        sb.append(", maxLon=");
        sb.append(this.f16119);
        sb.append(')');
        return sb.toString();
    }
}
