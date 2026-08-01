package p325;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏世哲兰子楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8741 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f24634;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f24635;

    public C8741(String str, String str2) {
        AbstractC8405.m13972(125);
        AbstractC8405.m13972(2600);
        this.f24635 = str;
        this.f24634 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8741)) {
            return false;
        }
        C8741 c8741 = (C8741) obj;
        return AbstractC4395.m8907(this.f24635, c8741.f24635) && AbstractC4395.m8907(this.f24634, c8741.f24634);
    }

    public final int hashCode() {
        return this.f24634.hashCode() + (this.f24635.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(2601));
        AbstractC6183.m11579(sb, this.f24635, 2602);
        return AbstractC0053.m148(sb, this.f24634, ')');
    }
}
