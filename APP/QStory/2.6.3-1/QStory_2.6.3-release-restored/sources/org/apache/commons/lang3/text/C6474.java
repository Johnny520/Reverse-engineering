package org.apache.commons.lang3.text;

import java.io.Writer;

/* JADX INFO: renamed from: org.apache.commons.lang3.text.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6474 extends Writer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ StrBuilder f15870;

    public C6474(StrBuilder strBuilder) {
        this.f15870 = strBuilder;
    }

    @Override // java.io.Writer
    public final void write(int i) {
        this.f15870.append((char) i);
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        this.f15870.append(cArr, i, i2);
    }

    @Override // java.io.Writer
    public final void write(char[] cArr) {
        this.f15870.append(cArr);
    }

    @Override // java.io.Writer
    public final void write(String str) {
        this.f15870.append(str);
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        this.f15870.append(str, i, i2);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }
}
