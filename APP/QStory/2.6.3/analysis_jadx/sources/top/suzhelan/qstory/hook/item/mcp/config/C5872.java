package top.suzhelan.qstory.hook.item.mcp.config;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.mcp.config.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5872 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f16041;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f16042;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f16043;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f16044;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f16045;

    public C5872(int i, String str, String str2, String str3, boolean z) {
        AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜");
        str.getClass();
        AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵喵");
        str2.getClass();
        AbstractC8405.m13972(2300);
        str3.getClass();
        this.f16045 = str;
        this.f16044 = str2;
        this.f16043 = str3;
        this.f16042 = z;
        this.f16041 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C5872 m11271(C5872 c5872, boolean z, int i, int i2) {
        String str = c5872.f16045;
        String str2 = c5872.f16044;
        String str3 = c5872.f16043;
        if ((i2 & 8) != 0) {
            z = c5872.f16042;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            i = c5872.f16041;
        }
        c5872.getClass();
        AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜");
        str.getClass();
        AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵喵");
        str2.getClass();
        AbstractC8405.m13972(2300);
        str3.getClass();
        return new C5872(i, str, str2, str3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5872)) {
            return false;
        }
        C5872 c5872 = (C5872) obj;
        return AbstractC4395.m8907(this.f16045, c5872.f16045) && AbstractC4395.m8907(this.f16044, c5872.f16044) && AbstractC4395.m8907(this.f16043, c5872.f16043) && this.f16042 == c5872.f16042 && this.f16041 == c5872.f16041;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16041) + AbstractC0053.m141(AbstractC6183.m11572(AbstractC6183.m11572(this.f16045.hashCode() * 31, 31, this.f16044), 31, this.f16043), 31, this.f16042);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(2301));
        AbstractC6183.m11579(sb, this.f16045, 1501);
        AbstractC6183.m11579(sb, this.f16044, 1317);
        AbstractC6183.m11579(sb, this.f16043, 783);
        sb.append(this.f16042);
        sb.append(AbstractC8405.m13972(2302));
        return AbstractC0053.m156(sb, this.f16041, ')');
    }
}
