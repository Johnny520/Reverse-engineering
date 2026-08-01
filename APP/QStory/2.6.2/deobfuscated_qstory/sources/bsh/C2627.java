package bsh;

import java.io.FilterReader;
import java.io.IOException;

/* JADX INFO: renamed from: bsh.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2627 extends FilterReader {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f7887;

    public C2627(C2633 c2633) {
        super(c2633);
        this.f7887 = 1;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public final int read() throws IOException {
        int i;
        if (this.f7887 == 2) {
            this.f7887 = 1;
            return 10;
        }
        do {
            i = ((FilterReader) this).in.read();
        } while (i == 13);
        if (i != 10) {
            this.f7887 = 0;
            return i;
        }
        if (this.f7887 == 1) {
            this.f7887 = 2;
            return 59;
        }
        this.f7887 = 1;
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
