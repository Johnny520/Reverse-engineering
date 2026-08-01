package org.apache.commons.lang3.time;

import androidx.activity.AbstractC0053;
import java.util.Objects;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5674 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f15597;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC5677 f15598;

    public C5674(AbstractC5677 abstractC5677, int i) {
        Objects.requireNonNull(abstractC5677, "strategy");
        this.f15598 = abstractC5677;
        this.f15597 = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StrategyAndWidth [strategy=");
        sb.append(this.f15598);
        sb.append(", width=");
        return AbstractC0053.m147(sb, "]", this.f15597);
    }
}
