package p320;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲楪子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8686 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f24494;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f24495;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f24496;

    public C8686(int i, String str, ArrayList arrayList) {
        AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵喵呜喵喵喵~喵喵呜喵喵呜喵呜~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵呜呜");
        AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜喵呜喵呜");
        this.f24496 = i;
        this.f24495 = str;
        this.f24494 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8686)) {
            return false;
        }
        C8686 c8686 = (C8686) obj;
        return this.f24496 == c8686.f24496 && AbstractC4395.m8907(this.f24495, c8686.f24495) && AbstractC4395.m8907(this.f24494, c8686.f24494);
    }

    public final int hashCode() {
        return this.f24494.hashCode() + AbstractC6183.m11572(Integer.hashCode(this.f24496) * 31, 31, this.f24495);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(2796));
        AbstractC6183.m11578(sb, this.f24496, 2797);
        AbstractC6183.m11579(sb, this.f24495, 1388);
        sb.append(this.f24494);
        sb.append(')');
        return sb.toString();
    }
}
