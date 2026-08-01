package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public enum JSONPath$Feature {
    AlwaysReturnList(1),
    NullOnError(2),
    KeepNullValue(4),
    DisableStringArrayUnwrapping(8);

    public final long mask;

    JSONPath$Feature(long j) {
        this.mask = j;
    }
}
