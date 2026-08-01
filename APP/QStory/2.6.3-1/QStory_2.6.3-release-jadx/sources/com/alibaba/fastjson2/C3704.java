package com.alibaba.fastjson2;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3704 extends AbstractC3707 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public transient BigDecimal f9420;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f9421;

    public C3704(long j) {
        this.f9421 = j;
    }

    @Override // com.alibaba.fastjson2.AbstractC3707
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo6509(Object obj) {
        boolean z = obj instanceof Integer;
        long j = this.f9421;
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
        if (this.f9420 == null) {
            this.f9420 = BigDecimal.valueOf(j);
        }
        return this.f9420.equals(bigDecimal2);
    }
}
