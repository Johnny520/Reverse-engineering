package p400;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p105.InterfaceC8010;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C9881 {
    public static final C9882 Companion = new C9882();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f25681;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f25682;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f25683;

    public /* synthetic */ C9881(int i, int i2, long j, String str) {
        this.f25683 = (i & 1) == 0 ? 0L : j;
        this.f25682 = (i & 2) == 0 ? 0 : i2;
        if ((i & 4) == 0) {
            this.f25681 = "";
        } else {
            this.f25681 = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9881)) {
            return false;
        }
        C9881 c9881 = (C9881) obj;
        return this.f25683 == c9881.f25683 && this.f25682 == c9881.f25682 && AbstractC5227.m9466(this.f25681, c9881.f25681);
    }

    public final int hashCode() {
        return this.f25681.hashCode() + AbstractC0900.m704(this.f25682, Long.hashCode(this.f25683) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC9234.m14531(1460));
        sb.append(this.f25683);
        sb.append(AbstractC9234.m14531(1454));
        AbstractC7012.m12137(sb, this.f25682, 1461);
        return AbstractC0900.m708(sb, this.f25681, ')');
    }
}
