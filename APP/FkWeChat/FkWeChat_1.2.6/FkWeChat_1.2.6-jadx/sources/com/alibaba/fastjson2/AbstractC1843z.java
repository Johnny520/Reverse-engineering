package com.alibaba.fastjson2;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.alibaba.fastjson2.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1843z {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BigDecimal m6535a(BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
    }
}
