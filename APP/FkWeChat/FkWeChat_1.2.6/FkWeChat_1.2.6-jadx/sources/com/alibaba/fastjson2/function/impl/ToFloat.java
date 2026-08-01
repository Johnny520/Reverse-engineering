package com.alibaba.fastjson2.function.impl;

import com.alibaba.fastjson2.C1607k;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ToFloat implements Function {
    final Float defaultValue;

    public ToFloat(Float f10) {
        this.defaultValue = f10;
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        if (obj == null) {
            return this.defaultValue;
        }
        if (obj instanceof Boolean) {
            return Float.valueOf(((Boolean) obj).booleanValue() ? 1.0f : 0.0f);
        }
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        C1607k.m6296a("can not cast to Float ", obj.getClass());
        return null;
    }
}
