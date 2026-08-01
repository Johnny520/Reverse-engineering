package org.apache.commons.lang3.text;

import java.io.Reader;

/* JADX INFO: renamed from: org.apache.commons.lang3.text.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5646 extends Reader {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f15527;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ StrBuilder f15528;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f15529;

    public C5646(StrBuilder strBuilder) {
        this.f15528 = strBuilder;
    }

    @Override // java.io.Reader
    public final void mark(int i) {
        this.f15527 = this.f15529;
    }

    @Override // java.io.Reader
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        int i3;
        if (i < 0 || i2 < 0 || i > cArr.length || (i3 = i + i2) > cArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int i4 = this.f15529;
        StrBuilder strBuilder = this.f15528;
        if (i4 >= strBuilder.size()) {
            return -1;
        }
        if (this.f15529 + i2 > strBuilder.size()) {
            i2 = strBuilder.size() - this.f15529;
        }
        int i5 = this.f15529;
        strBuilder.getChars(i5, i5 + i2, cArr, i);
        this.f15529 += i2;
        return i2;
    }

    @Override // java.io.Reader
    public final boolean ready() {
        return this.f15529 < this.f15528.size();
    }

    @Override // java.io.Reader
    public final void reset() {
        this.f15529 = this.f15527;
    }

    @Override // java.io.Reader
    public final long skip(long j) {
        long j2 = ((long) this.f15529) + j;
        StrBuilder strBuilder = this.f15528;
        if (j2 > strBuilder.size()) {
            j = strBuilder.size() - this.f15529;
        }
        if (j < 0) {
            return 0L;
        }
        this.f15529 = Math.addExact(this.f15529, Math.toIntExact(j));
        return j;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Reader
    public final int read() {
        if (!ready()) {
            return -1;
        }
        int i = this.f15529;
        this.f15529 = i + 1;
        return this.f15528.charAt(i);
    }
}
