package com.alibaba.fastjson2.function;

import java.util.function.BiConsumer;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class FieldBiConsumer<T> implements BiConsumer<T, Object> {
    public final FieldConsumer<T> consumer;
    public final int fieldIndex;

    public FieldBiConsumer(int i10, FieldConsumer<T> fieldConsumer) {
        this.fieldIndex = i10;
        this.consumer = fieldConsumer;
    }

    @Override // java.util.function.BiConsumer
    public void accept(T t10, Object obj) {
        this.consumer.accept(t10, this.fieldIndex, obj);
    }
}
