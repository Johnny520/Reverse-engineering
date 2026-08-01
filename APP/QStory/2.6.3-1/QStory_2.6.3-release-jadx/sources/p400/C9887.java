package p400;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p105.InterfaceC8010;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C9887 {
    public static final C9884 Companion = new C9884();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C9881 f25691;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f25692;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f25693;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f25694;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f25695;

    public /* synthetic */ C9887(int i, long j, String str, long j2, String str2, C9881 c9881) {
        if ((i & 1) == 0) {
            this.f25695 = 0L;
        } else {
            this.f25695 = j;
        }
        if ((i & 2) == 0) {
            this.f25694 = "";
        } else {
            this.f25694 = str;
        }
        if ((i & 4) == 0) {
            this.f25693 = 0L;
        } else {
            this.f25693 = j2;
        }
        if ((i & 8) == 0) {
            this.f25692 = "";
        } else {
            this.f25692 = str2;
        }
        if ((i & 16) == 0) {
            this.f25691 = null;
        } else {
            this.f25691 = c9881;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9887)) {
            return false;
        }
        C9887 c9887 = (C9887) obj;
        return this.f25695 == c9887.f25695 && AbstractC5227.m9466(this.f25694, c9887.f25694) && this.f25693 == c9887.f25693 && AbstractC5227.m9466(this.f25692, c9887.f25692) && AbstractC5227.m9466(this.f25691, c9887.f25691);
    }

    public final int hashCode() {
        int iM12131 = AbstractC7012.m12131(AbstractC0900.m702(AbstractC7012.m12131(Long.hashCode(this.f25695) * 31, 31, this.f25694), 31, this.f25693), 31, this.f25692);
        C9881 c9881 = this.f25691;
        return iM12131 + (c9881 == null ? 0 : c9881.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC9234.m14531(1462));
        sb.append(this.f25695);
        sb.append(AbstractC9234.m14531(1433));
        AbstractC7012.m12138(sb, this.f25694, 1463);
        sb.append(this.f25693);
        sb.append(AbstractC9234.m14531(1424));
        AbstractC7012.m12138(sb, this.f25692, 1464);
        sb.append(this.f25691);
        sb.append(')');
        return sb.toString();
    }
}
