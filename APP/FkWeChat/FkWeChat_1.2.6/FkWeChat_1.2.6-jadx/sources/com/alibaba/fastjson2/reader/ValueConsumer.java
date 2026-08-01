package com.alibaba.fastjson2.reader;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface ValueConsumer {
    default void accept(byte[] bArr, int i10, int i11) {
        accept(new String(bArr, i10, i11, StandardCharsets.UTF_8));
    }

    default void accept(String str) {
    }

    default void accept(List list) {
    }

    default void accept(Map map) {
    }

    default void accept(boolean z10) {
    }

    default void accept(Number number) {
    }

    default void acceptNull() {
    }

    default void accept(int i10) {
        accept(Integer.valueOf(i10));
    }

    default void accept(long j10) {
        accept(Long.valueOf(j10));
    }
}
