package p007;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import lin.xposed.hook.view.main.SearchHelper$MatchType;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲楪苏.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6143 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object f16738;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final SearchHelper$MatchType f16739;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f16740;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f16741;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f16742;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f16743;

    public C6143(String str, String str2, String str3, int i, SearchHelper$MatchType searchHelper$MatchType, Object obj) {
        AbstractC3056.m6668(-3937688830954702247L);
        AbstractC3056.m6668(-3937688779415094695L);
        AbstractC3056.m6668(-3937688800889931175L);
        searchHelper$MatchType.getClass();
        AbstractC3056.m6668(-3937688740760389031L);
        this.f16743 = str;
        this.f16742 = str2;
        this.f16741 = str3;
        this.f16740 = i;
        this.f16739 = searchHelper$MatchType;
        this.f16738 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6143)) {
            return false;
        }
        C6143 c6143 = (C6143) obj;
        return AbstractC4394.m8917(this.f16743, c6143.f16743) && AbstractC4394.m8917(this.f16742, c6143.f16742) && AbstractC4394.m8917(this.f16741, c6143.f16741) && this.f16740 == c6143.f16740 && this.f16739 == c6143.f16739 && AbstractC4394.m8917(this.f16738, c6143.f16738);
    }

    public final int hashCode() {
        int iHashCode = this.f16743.hashCode() * 31;
        String str = this.f16742;
        return this.f16738.hashCode() + ((this.f16739.hashCode() + AbstractC0053.m143(this.f16740, AbstractC6136.m11539((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f16741), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC3056.m6668(-3937688624796272039L));
        AbstractC6136.m11531(sb, this.f16743, -3937688599026468263L);
        AbstractC6136.m11531(sb, this.f16742, -3937688526012024231L);
        AbstractC6136.m11531(sb, this.f16741, -3937688457292547495L);
        AbstractC6136.m11533(sb, this.f16740, -3937688405752939943L);
        sb.append(this.f16739);
        sb.append(AbstractC3056.m6668(-3937688289788822951L));
        sb.append(this.f16738);
        sb.append(')');
        return sb.toString();
    }
}
