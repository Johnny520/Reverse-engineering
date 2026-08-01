package org.apache.commons.lang3.time;

import androidx.activity.AbstractC0900;
import java.util.Objects;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6505 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f15942;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC6508 f15943;

    public C6505(AbstractC6508 abstractC6508, int i) {
        Objects.requireNonNull(abstractC6508, "strategy");
        this.f15943 = abstractC6508;
        this.f15942 = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StrategyAndWidth [strategy=");
        sb.append(this.f15943);
        sb.append(", width=");
        return AbstractC0900.m707(sb, "]", this.f15942);
    }
}
