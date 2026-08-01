package p324;

import androidx.activity.AbstractC0053;
import p009.AbstractC6183;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪子哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8734 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f24617;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f24618;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f24619;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f24620;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f24621;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f24622;

    public C8734(int i, int i2, int i3, float f, float f2, float f3) {
        this.f24622 = i;
        this.f24621 = i2;
        this.f24620 = i3;
        this.f24619 = f;
        this.f24618 = f2;
        this.f24617 = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8734)) {
            return false;
        }
        C8734 c8734 = (C8734) obj;
        return this.f24622 == c8734.f24622 && this.f24621 == c8734.f24621 && this.f24620 == c8734.f24620 && Float.compare(this.f24619, c8734.f24619) == 0 && Float.compare(this.f24618, c8734.f24618) == 0 && Float.compare(this.f24617, c8734.f24617) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f24617) + AbstractC0053.m145(AbstractC0053.m145(AbstractC0053.m144(this.f24620, AbstractC0053.m144(this.f24621, Integer.hashCode(this.f24622) * 31, 31), 31), this.f24619, 31), this.f24618, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(2706));
        AbstractC6183.m11578(sb, this.f24622, 2707);
        AbstractC6183.m11578(sb, this.f24621, 2708);
        AbstractC6183.m11578(sb, this.f24620, 2709);
        sb.append(this.f24619);
        sb.append(AbstractC8405.m13972(2710));
        sb.append(this.f24618);
        sb.append(AbstractC8405.m13972(2711));
        return AbstractC0053.m155(sb, this.f24617, ')');
    }
}
