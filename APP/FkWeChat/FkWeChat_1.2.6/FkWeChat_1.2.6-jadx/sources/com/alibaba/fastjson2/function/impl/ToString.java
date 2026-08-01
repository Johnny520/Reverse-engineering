package com.alibaba.fastjson2.function.impl;

import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ToString implements Function {
    @Override // java.util.function.Function
    public Object apply(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }
}
