package p354;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8881 extends AbstractC8882 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f25039;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f25040;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f25041;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f25042;

    public C8881(String str, int i, int i2, boolean z) {
        AbstractC8405.m13972(1597);
        this.f25042 = i;
        this.f25041 = str;
        this.f25040 = i2;
        this.f25039 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8881)) {
            return false;
        }
        C8881 c8881 = (C8881) obj;
        return this.f25042 == c8881.f25042 && AbstractC4395.m8907(this.f25041, c8881.f25041) && this.f25040 == c8881.f25040 && this.f25039 == c8881.f25039;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25039) + AbstractC0053.m144(this.f25040, AbstractC6183.m11572(Integer.hashCode(this.f25042) * 31, 31, this.f25041), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(2922));
        AbstractC6183.m11578(sb, this.f25042, 2923);
        AbstractC6183.m11579(sb, this.f25041, 2924);
        AbstractC6183.m11578(sb, this.f25040, 2925);
        return AbstractC0053.m152(sb, this.f25039, ')');
    }
}
