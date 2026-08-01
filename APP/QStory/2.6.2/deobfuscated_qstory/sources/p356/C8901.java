package p356;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import lin.xposed.hook.javaplugin.bean.GroupInfo;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8901 extends AbstractC8903 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f25076;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final GroupInfo f25077;

    public C8901(GroupInfo groupInfo, boolean z) {
        "troop";
        this.f25077 = groupInfo;
        this.f25076 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8901)) {
            return false;
        }
        C8901 c8901 = (C8901) obj;
        return AbstractC4394.m8917(this.f25077, c8901.f25077) && this.f25076 == c8901.f25076;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25076) + (this.f25077.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TroopItem(troop=");
        sb.append(this.f25077);
        sb.append(", isOwner=");
        return AbstractC0053.m150(sb, this.f25076, ')');
    }
}
