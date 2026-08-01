package p144;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7557 extends AbstractC7558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f20453;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7551 f20454;

    public C7557(C7551 c7551, int i) {
        c7551.getClass();
        this.f20454 = c7551;
        this.f20453 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7557.class != obj.getClass()) {
            return false;
        }
        C7557 c7557 = (C7557) obj;
        return this.f20453 == c7557.f20453 && AbstractC4395.m8907(this.f20454, c7557.f20454);
    }

    public final int hashCode() {
        return this.f20454.hashCode() + (this.f20453 * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InProgress(latestEvent=");
        sb.append(this.f20454);
        sb.append(", direction=");
        return AbstractC0053.m156(sb, this.f20453, ')');
    }
}
