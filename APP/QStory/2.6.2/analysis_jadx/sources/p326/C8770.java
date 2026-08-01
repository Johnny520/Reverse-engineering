package p326;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;

/* JADX INFO: renamed from: 飘花落叶言苏世哲兰楪子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8770 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f24706;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f24707;

    public C8770(String str, String str2) {
        AbstractC3056.m6668(-3937565801616508327L);
        AbstractC3056.m6668(-3937824990007920039L);
        this.f24707 = str;
        this.f24706 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8770)) {
            return false;
        }
        C8770 c8770 = (C8770) obj;
        return AbstractC4394.m8917(this.f24707, c8770.f24707) && AbstractC4394.m8917(this.f24706, c8770.f24706);
    }

    public final int hashCode() {
        return this.f24706.hashCode() + (this.f24707.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC3056.m6668(-3937824998597854631L));
        AbstractC6136.m11531(sb, this.f24707, -3937824835389097383L);
        return AbstractC0053.m155(sb, this.f24706, ')');
    }
}
