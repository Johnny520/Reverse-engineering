package org.apache.commons.io;

import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum StandardLineSeparator {
    CR("\r"),
    CRLF("\r\n"),
    LF("\n");

    private final String lineSeparator;

    StandardLineSeparator(String str) {
        Objects.requireNonNull(str, "lineSeparator");
        this.lineSeparator = str;
    }

    public byte[] getBytes(Charset charset) {
        return this.lineSeparator.getBytes(charset);
    }

    public String getString() {
        return this.lineSeparator;
    }
}
