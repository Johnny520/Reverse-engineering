package p336;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲楪子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9515 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f24839;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f24840;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f24841;

    public C9515(int i, String str, ArrayList arrayList) {
        "errMsg";
        "msgList";
        this.f24841 = i;
        this.f24840 = str;
        this.f24839 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9515)) {
            return false;
        }
        C9515 c9515 = (C9515) obj;
        return this.f24841 == c9515.f24841 && AbstractC5227.m9466(this.f24840, c9515.f24840) && AbstractC5227.m9466(this.f24839, c9515.f24839);
    }

    public final int hashCode() {
        return this.f24839.hashCode() + AbstractC7012.m12131(Integer.hashCode(this.f24841) * 31, 31, this.f24840);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GetMsgsResult(result=");
        AbstractC7012.m12137(sb, this.f24841, 2797);
        AbstractC7012.m12138(sb, this.f24840, 1388);
        sb.append(this.f24839);
        sb.append(')');
        return sb.toString();
    }
}
