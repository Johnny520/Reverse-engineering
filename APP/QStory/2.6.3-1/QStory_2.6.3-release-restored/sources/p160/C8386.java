package p160;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8386 extends AbstractC8387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f20798;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8380 f20799;

    public C8386(C8380 c8380, int i) {
        c8380.getClass();
        this.f20799 = c8380;
        this.f20798 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8386.class != obj.getClass()) {
            return false;
        }
        C8386 c8386 = (C8386) obj;
        return this.f20798 == c8386.f20798 && AbstractC5227.m9466(this.f20799, c8386.f20799);
    }

    public final int hashCode() {
        return this.f20799.hashCode() + (this.f20798 * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InProgress(latestEvent=");
        sb.append(this.f20799);
        sb.append(", direction=");
        return AbstractC0900.m716(sb, this.f20798, ')');
    }
}
