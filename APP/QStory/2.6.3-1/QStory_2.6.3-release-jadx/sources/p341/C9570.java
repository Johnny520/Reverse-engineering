package p341;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏世哲兰子楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9570 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f24979;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f24980;

    public C9570(String str, String str2) {
        AbstractC9234.m14531(125);
        AbstractC9234.m14531(2600);
        this.f24980 = str;
        this.f24979 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9570)) {
            return false;
        }
        C9570 c9570 = (C9570) obj;
        return AbstractC5227.m9466(this.f24980, c9570.f24980) && AbstractC5227.m9466(this.f24979, c9570.f24979);
    }

    public final int hashCode() {
        return this.f24979.hashCode() + (this.f24980.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC9234.m14531(2601));
        AbstractC7012.m12138(sb, this.f24980, 2602);
        return AbstractC0900.m708(sb, this.f24979, ')');
    }
}
