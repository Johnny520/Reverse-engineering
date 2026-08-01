package com.alibaba.fastjson2.function;

import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class FieldSupplierFunction<T> implements Function<T, Object> {
    public final int fieldIndex;
    public final FieldSupplier<T> supplier;

    public FieldSupplierFunction(FieldSupplier<T> fieldSupplier, int i10) {
        this.supplier = fieldSupplier;
        this.fieldIndex = i10;
    }

    @Override // java.util.function.Function
    public Object apply(T t10) {
        return this.supplier.get(t10, this.fieldIndex);
    }
}
