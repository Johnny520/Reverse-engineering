package com.alibaba.fastjson2.reader;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface ByteArrayValueConsumer {
    void accept(int i10, int i11, byte[] bArr, int i12, int i13, Charset charset);

    default void end() {
    }

    default void start() {
    }

    default void afterRow(int i10) {
    }

    default void beforeRow(int i10) {
    }
}
