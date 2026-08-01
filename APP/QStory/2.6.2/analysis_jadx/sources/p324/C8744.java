package p324;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import p007.AbstractC6136;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪子哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8744 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f24645;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public String f24646;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public String f24647;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String f24648;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public String f24649;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8744)) {
            return false;
        }
        C8744 c8744 = (C8744) obj;
        return this.f24649.equals(c8744.f24649) && this.f24648.equals(c8744.f24648) && this.f24647.equals(c8744.f24647) && this.f24646.equals(c8744.f24646) && this.f24645 == c8744.f24645;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24645) + AbstractC6136.m11539(AbstractC6136.m11539(AbstractC0053.m143(1, AbstractC6136.m11539(this.f24649.hashCode() * 31, 31, this.f24648), 31), 31, this.f24647), 31, this.f24646);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC3056.m6668(-3937834593554793895L));
        AbstractC6136.m11531(sb, this.f24649, -3937834567784990119L);
        sb.append(this.f24648);
        sb.append(AbstractC3056.m6668(-3937834464705775015L));
        sb.append(1);
        sb.append(AbstractC3056.m6668(-3937834499065513383L));
        AbstractC6136.m11531(sb, this.f24647, -3937834391691330983L);
        AbstractC6136.m11531(sb, this.f24646, -3937705929219507623L);
        sb.append(this.f24645);
        sb.append(')');
        return sb.toString();
    }
}
