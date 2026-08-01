package top.suzhelan.qstory.hook.item.mcp.config;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.mcp.config.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6702 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f16386;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f16387;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f16388;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f16389;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f16390;

    public C6702(int i, String str, String str2, String str3, boolean z) {
        "id";
        str.getClass();
        "title";
        str2.getClass();
        "description";
        str3.getClass();
        this.f16390 = str;
        this.f16389 = str2;
        this.f16388 = str3;
        this.f16387 = z;
        this.f16386 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C6702 m11830(C6702 c6702, boolean z, int i, int i2) {
        String str = c6702.f16390;
        String str2 = c6702.f16389;
        String str3 = c6702.f16388;
        if ((i2 & 8) != 0) {
            z = c6702.f16387;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            i = c6702.f16386;
        }
        c6702.getClass();
        "id";
        str.getClass();
        "title";
        str2.getClass();
        "description";
        str3.getClass();
        return new C6702(i, str, str2, str3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6702)) {
            return false;
        }
        C6702 c6702 = (C6702) obj;
        return AbstractC5227.m9466(this.f16390, c6702.f16390) && AbstractC5227.m9466(this.f16389, c6702.f16389) && AbstractC5227.m9466(this.f16388, c6702.f16388) && this.f16387 == c6702.f16387 && this.f16386 == c6702.f16386;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16386) + AbstractC0900.m701(AbstractC7012.m12131(AbstractC7012.m12131(this.f16390.hashCode() * 31, 31, this.f16389), 31, this.f16388), 31, this.f16387);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("McpToolConfigItem(id=");
        AbstractC7012.m12138(sb, this.f16390, 1501);
        AbstractC7012.m12138(sb, this.f16389, 1317);
        AbstractC7012.m12138(sb, this.f16388, 783);
        sb.append(this.f16387);
        sb.append(", order=");
        return AbstractC0900.m716(sb, this.f16386, ')');
    }
}
