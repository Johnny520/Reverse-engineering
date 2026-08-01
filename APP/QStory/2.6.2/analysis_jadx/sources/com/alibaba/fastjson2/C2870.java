package com.alibaba.fastjson2;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2870 extends AbstractC2873 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public transient BigDecimal f9073;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f9074;

    public C2870(long j) {
        this.f9074 = j;
    }

    @Override // com.alibaba.fastjson2.AbstractC2873
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo5904(Object obj) {
        boolean z = obj instanceof Integer;
        long j = this.f9074;
        if (z || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short)) {
            return ((Number) obj).longValue() == j;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return ((Number) obj).doubleValue() == ((double) j);
        }
        if (!(obj instanceof BigDecimal)) {
            return false;
        }
        BigDecimal bigDecimal = (BigDecimal) obj;
        BigDecimal bigDecimal2 = bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
        if (this.f9073 == null) {
            this.f9073 = BigDecimal.valueOf(j);
        }
        return this.f9073.equals(bigDecimal2);
    }
}
