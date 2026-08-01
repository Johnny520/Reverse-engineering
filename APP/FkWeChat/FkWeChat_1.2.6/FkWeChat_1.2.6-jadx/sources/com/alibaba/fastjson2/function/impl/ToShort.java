package com.alibaba.fastjson2.function.impl;

import com.alibaba.fastjson2.C1607k;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ToShort implements Function {
    final Short defaultValue;

    public ToShort(Short sh) {
        this.defaultValue = sh;
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        if (obj == null) {
            return this.defaultValue;
        }
        if (obj instanceof Boolean) {
            return Short.valueOf(((Boolean) obj).booleanValue() ? (short) 1 : (short) 0);
        }
        if (obj instanceof Number) {
            return Short.valueOf(((Number) obj).shortValue());
        }
        C1607k.m6296a("can not cast to Short ", obj.getClass());
        return null;
    }
}
