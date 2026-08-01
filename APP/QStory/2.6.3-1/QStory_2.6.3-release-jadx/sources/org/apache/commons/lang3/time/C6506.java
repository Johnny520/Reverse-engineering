package org.apache.commons.lang3.time;

import androidx.activity.AbstractC0900;
import java.util.TimeZone;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6506 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f15944;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TimeZone f15945;

    public C6506(TimeZone timeZone, boolean z) {
        this.f15945 = timeZone;
        this.f15944 = z ? timeZone.getDSTSavings() : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TzInfo [zone=");
        sb.append(this.f15945);
        sb.append(", dstOffset=");
        return AbstractC0900.m707(sb, "]", this.f15944);
    }
}
