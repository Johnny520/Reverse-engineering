package com.alibaba.fastjson2.function.impl;

import com.alibaba.fastjson2.C1607k;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ToLong implements Function {
    final Long defaultValue;

    public ToLong(Long l10) {
        this.defaultValue = l10;
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        if (obj == null) {
            return this.defaultValue;
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        C1607k.m6296a("can not cast to Long ", obj.getClass());
        return null;
    }
}
