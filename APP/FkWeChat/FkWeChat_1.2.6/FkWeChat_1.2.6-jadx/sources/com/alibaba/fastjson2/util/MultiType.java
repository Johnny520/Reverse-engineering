package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSON;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class MultiType implements Type {
    private final Type[] types;

    public MultiType(Type... typeArr) {
        this.types = typeArr;
    }

    public Type getType(int i10) {
        return this.types[i10];
    }

    public int size() {
        return this.types.length;
    }

    public String toString() {
        return JSON.toJSONString(this.types);
    }
}
