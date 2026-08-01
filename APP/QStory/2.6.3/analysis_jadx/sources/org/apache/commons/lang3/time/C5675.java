package org.apache.commons.lang3.time;

import androidx.activity.AbstractC0053;
import java.util.Objects;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5675 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f15597;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC5678 f15598;

    public C5675(AbstractC5678 abstractC5678, int i) {
        Objects.requireNonNull(abstractC5678, "strategy");
        this.f15598 = abstractC5678;
        this.f15597 = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StrategyAndWidth [strategy=");
        sb.append(this.f15598);
        sb.append(", width=");
        return AbstractC0053.m147(sb, "]", this.f15597);
    }
}
