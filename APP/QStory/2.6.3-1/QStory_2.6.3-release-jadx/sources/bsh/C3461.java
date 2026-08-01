package bsh;

import java.io.FilterReader;
import java.io.IOException;

/* JADX INFO: renamed from: bsh.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3461 extends FilterReader {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f8234;

    public C3461(C3467 c3467) {
        super(c3467);
        this.f8234 = 1;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public final int read() throws IOException {
        int i;
        if (this.f8234 == 2) {
            this.f8234 = 1;
            return 10;
        }
        do {
            i = ((FilterReader) this).in.read();
        } while (i == 13);
        if (i != 10) {
            this.f8234 = 0;
            return i;
        }
        if (this.f8234 == 1) {
            this.f8234 = 2;
            return 59;
        }
        this.f8234 = 1;
        return i;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        int i3 = read();
        if (i3 == -1) {
            return -1;
        }
        cArr[i] = (char) i3;
        return 1;
    }
}
