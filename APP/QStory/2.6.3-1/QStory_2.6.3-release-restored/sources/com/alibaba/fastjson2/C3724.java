package com.alibaba.fastjson2;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3724 extends AbstractC3713 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long f9478;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final long f9479;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean f9480;

    public C3724(String str, long j, long j2, long j3, boolean z) {
        super(str, j);
        this.f9478 = j2;
        this.f9479 = j3;
        this.f9480 = z;
    }

    @Override // com.alibaba.fastjson2.AbstractC3713
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo6516() {
        return this.f9480;
    }

    @Override // com.alibaba.fastjson2.AbstractC3713
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo6517(Object obj) {
        boolean z = obj instanceof Byte;
        long j = this.f9479;
        long j2 = this.f9478;
        boolean z2 = this.f9480;
        if (z || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
            long jLongValue = ((Number) obj).longValue();
            return (jLongValue < j2 || jLongValue > j) ? z2 : !z2;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            double dDoubleValue = ((Number) obj).doubleValue();
            return (dDoubleValue < ((double) j2) || dDoubleValue > ((double) j)) ? z2 : !z2;
        }
        if (obj instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) obj;
            return (bigDecimal.compareTo(BigDecimal.valueOf(j2)) < 0 || bigDecimal.compareTo(BigDecimal.valueOf(j)) > 0) ? z2 : !z2;
        }
        if (!(obj instanceof BigInteger)) {
            return z2;
        }
        BigInteger bigInteger = (BigInteger) obj;
        return (bigInteger.compareTo(BigInteger.valueOf(j2)) < 0 || bigInteger.compareTo(BigInteger.valueOf(j)) > 0) ? z2 : !z2;
    }
}
