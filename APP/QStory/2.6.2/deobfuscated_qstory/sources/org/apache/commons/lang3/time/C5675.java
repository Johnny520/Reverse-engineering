package org.apache.commons.lang3.time;

import androidx.activity.AbstractC0053;
import java.util.TimeZone;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5675 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f15599;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TimeZone f15600;

    public C5675(TimeZone timeZone, boolean z) {
        this.f15600 = timeZone;
        this.f15599 = z ? timeZone.getDSTSavings() : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TzInfo [zone=");
        sb.append(this.f15600);
        sb.append(", dstOffset=");
        return AbstractC0053.m147(sb, "]", this.f15599);
    }
}
