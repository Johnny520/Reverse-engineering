package com.alibaba.fastjson2.function.impl;

import com.alibaba.fastjson2.C1607k;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ToBigInteger implements Function {
    @Override // java.util.function.Function
    public Object apply(Object obj) {
        if (obj == null || (obj instanceof BigInteger)) {
            return obj;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? BigInteger.ONE : BigInteger.ZERO;
        }
        if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof AtomicInteger) || (obj instanceof AtomicLong) || (obj instanceof Float) || (obj instanceof Double)) {
            return BigInteger.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof BigDecimal) {
            return ((BigDecimal) obj).toBigInteger();
        }
        C1607k.m6296a("can not cast to BigInteger ", obj.getClass());
        return null;
    }
}
