package org.simpleframework.xml.stream;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class OutputBuffer {
    private StringBuilder text = new StringBuilder();

    public void append(char[] cArr) {
        this.text.append(cArr, 0, cArr.length);
    }

    public void clear() {
        this.text.setLength(0);
    }

    public void write(Writer writer) throws IOException {
        writer.append((CharSequence) this.text);
    }

    public void append(String str) {
        this.text.append(str);
    }

    public void append(char c) {
        this.text.append(c);
    }

    public void append(char[] cArr, int i, int i2) {
        this.text.append(cArr, i, i2);
    }

    public void append(String str, int i, int i2) {
        this.text.append((CharSequence) str, i, i2);
    }
}
