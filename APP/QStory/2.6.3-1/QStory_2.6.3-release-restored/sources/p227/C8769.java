package p227;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.graphics.vector.C2378;

/* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8769 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f22319;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2378 f22320;

    public C8769(C2378 c2378, int i) {
        this.f22320 = c2378;
        this.f22319 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8769)) {
            return false;
        }
        C8769 c8769 = (C8769) obj;
        return this.f22320.equals(c8769.f22320) && this.f22319 == c8769.f22319;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22319) + (this.f22320.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.f22320);
        sb.append(", configFlags=");
        return AbstractC0900.m716(sb, this.f22319, ')');
    }
}
