package p340;

import androidx.activity.AbstractC0900;
import p025.AbstractC7012;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪子哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9563 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f24962;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f24963;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f24964;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f24965;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f24966;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f24967;

    public C9563(int i, int i2, int i3, float f, float f2, float f3) {
        this.f24967 = i;
        this.f24966 = i2;
        this.f24965 = i3;
        this.f24964 = f;
        this.f24963 = f2;
        this.f24962 = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9563)) {
            return false;
        }
        C9563 c9563 = (C9563) obj;
        return this.f24967 == c9563.f24967 && this.f24966 == c9563.f24966 && this.f24965 == c9563.f24965 && Float.compare(this.f24964, c9563.f24964) == 0 && Float.compare(this.f24963, c9563.f24963) == 0 && Float.compare(this.f24962, c9563.f24962) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f24962) + AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m704(this.f24965, AbstractC0900.m704(this.f24966, Integer.hashCode(this.f24967) * 31, 31), 31), this.f24964, 31), this.f24963, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC9234.m14531(2706));
        AbstractC7012.m12137(sb, this.f24967, 2707);
        AbstractC7012.m12137(sb, this.f24966, 2708);
        AbstractC7012.m12137(sb, this.f24965, 2709);
        sb.append(this.f24964);
        sb.append(AbstractC9234.m14531(2710));
        sb.append(this.f24963);
        sb.append(AbstractC9234.m14531(2711));
        return AbstractC0900.m715(sb, this.f24962, ')');
    }
}
