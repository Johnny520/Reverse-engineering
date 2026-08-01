package top.suzhelan.qstory.hook.item;

import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5935 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final double f16123;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final double f16124;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final double f16125;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final double f16126;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f16127;

    public C5935(String str, double d, double d2, double d3, double d4) {
        AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜");
        this.f16127 = str;
        this.f16126 = d;
        this.f16125 = d2;
        this.f16124 = d3;
        this.f16123 = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5935)) {
            return false;
        }
        C5935 c5935 = (C5935) obj;
        return AbstractC4395.m8907(this.f16127, c5935.f16127) && Double.compare(this.f16126, c5935.f16126) == 0 && Double.compare(this.f16125, c5935.f16125) == 0 && Double.compare(this.f16124, c5935.f16124) == 0 && Double.compare(this.f16123, c5935.f16123) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f16123) + ((Double.hashCode(this.f16124) + ((Double.hashCode(this.f16125) + ((Double.hashCode(this.f16126) + (this.f16127.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(2020));
        AbstractC6183.m11579(sb, this.f16127, 2021);
        sb.append(this.f16126);
        sb.append(AbstractC8405.m13972(2022));
        sb.append(this.f16125);
        sb.append(AbstractC8405.m13972(2023));
        sb.append(this.f16124);
        sb.append(AbstractC8405.m13972(2024));
        sb.append(this.f16123);
        sb.append(')');
        return sb.toString();
    }
}
