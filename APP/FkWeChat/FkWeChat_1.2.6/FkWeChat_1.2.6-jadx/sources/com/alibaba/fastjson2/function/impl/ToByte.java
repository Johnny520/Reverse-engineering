package com.alibaba.fastjson2.function.impl;

import com.alibaba.fastjson2.C1607k;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ToByte implements Function {
    final Byte defaultValue;

    public ToByte(Byte b10) {
        this.defaultValue = b10;
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        if (obj == null) {
            return this.defaultValue;
        }
        if (obj instanceof Boolean) {
            return Byte.valueOf(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
        }
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        C1607k.m6296a("can not cast to Byte ", obj.getClass());
        return null;
    }
}
