package p144;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7556 extends AbstractC7557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f20458;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7550 f20459;

    public C7556(C7550 c7550, int i) {
        c7550.getClass();
        this.f20459 = c7550;
        this.f20458 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7556.class != obj.getClass()) {
            return false;
        }
        C7556 c7556 = (C7556) obj;
        return this.f20458 == c7556.f20458 && AbstractC4394.m8917(this.f20459, c7556.f20459);
    }

    public final int hashCode() {
        return this.f20459.hashCode() + (this.f20458 * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InProgress(latestEvent=");
        sb.append(this.f20459);
        sb.append(", direction=");
        return AbstractC0053.m154(sb, this.f20458, ')');
    }
}
