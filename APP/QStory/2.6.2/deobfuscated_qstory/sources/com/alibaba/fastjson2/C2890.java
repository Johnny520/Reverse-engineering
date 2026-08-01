package com.alibaba.fastjson2;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2890 extends AbstractC2879 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long f9131;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final long f9132;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean f9133;

    public C2890(String str, long j, long j2, long j3, boolean z) {
        super(str, j);
        this.f9131 = j2;
        this.f9132 = j3;
        this.f9133 = z;
    }

    @Override // com.alibaba.fastjson2.AbstractC2879
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo5911() {
        return this.f9133;
    }

    @Override // com.alibaba.fastjson2.AbstractC2879
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo5912(Object obj) {
        boolean z = obj instanceof Byte;
        long j = this.f9132;
        long j2 = this.f9131;
        boolean z2 = this.f9133;
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
