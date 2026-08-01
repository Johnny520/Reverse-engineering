package org.apache.commons.io.output;

import java.io.Serializable;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class StringBuilderWriter extends Writer implements Serializable {
    private static final long serialVersionUID = -146927496096066153L;
    private final StringBuilder builder;

    public StringBuilderWriter(StringBuilder sb) {
        this.builder = sb == null ? new StringBuilder() : sb;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) {
        this.builder.append(c);
        return this;
    }

    public StringBuilder getBuilder() {
        return this.builder;
    }

    public String toString() {
        return this.builder.toString();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            this.builder.append(cArr, i, i2);
        }
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.builder.append(str);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.builder.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        this.builder.append(charSequence, i, i2);
        return this;
    }

    public StringBuilderWriter(int i) {
        this.builder = new StringBuilder(i);
    }

    public StringBuilderWriter() {
        this.builder = new StringBuilder();
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }
}
