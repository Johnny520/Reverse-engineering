package p370;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9704 extends AbstractC9703 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f25365;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f25366;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f25367;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f25368;

    public C9704(String str, int i, int i2, boolean z) {
        AbstractC9234.m14531(1597);
        this.f25368 = i;
        this.f25367 = str;
        this.f25366 = i2;
        this.f25365 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9704)) {
            return false;
        }
        C9704 c9704 = (C9704) obj;
        return this.f25368 == c9704.f25368 && AbstractC5227.m9466(this.f25367, c9704.f25367) && this.f25366 == c9704.f25366 && this.f25365 == c9704.f25365;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25365) + AbstractC0900.m704(this.f25366, AbstractC7012.m12131(Integer.hashCode(this.f25368) * 31, 31, this.f25367), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC9234.m14531(2922));
        AbstractC7012.m12137(sb, this.f25368, 2923);
        AbstractC7012.m12138(sb, this.f25367, 2924);
        AbstractC7012.m12137(sb, this.f25366, 2925);
        return AbstractC0900.m712(sb, this.f25365, ')');
    }
}
