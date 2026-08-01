package p044d4;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: d4.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1875c {

    /* JADX INFO: renamed from: a */
    public int f5206a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f5207b;

    /* JADX INFO: renamed from: c */
    public int f5208c;

    /* JADX INFO: renamed from: d */
    public int f5209d;

    /* JADX INFO: renamed from: e */
    public AbstractC1876d f5210e = AbstractC1876d.m6658a();

    /* JADX INFO: renamed from: a */
    public int m6653a(int i10) {
        return i10 + this.f5207b.getInt(i10);
    }

    /* JADX INFO: renamed from: b */
    public int m6654b(int i10) {
        if (i10 < this.f5209d) {
            return this.f5207b.getShort(this.f5208c + i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public void m6655c(int i10, ByteBuffer byteBuffer) {
        this.f5207b = byteBuffer;
        if (byteBuffer == null) {
            this.f5206a = 0;
            this.f5208c = 0;
            this.f5209d = 0;
        } else {
            this.f5206a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f5208c = i11;
            this.f5209d = this.f5207b.getShort(i11);
        }
    }

    /* JADX INFO: renamed from: d */
    public int m6656d(int i10) {
        int i11 = i10 + this.f5206a;
        return i11 + this.f5207b.getInt(i11) + 4;
    }

    /* JADX INFO: renamed from: e */
    public int m6657e(int i10) {
        int i11 = i10 + this.f5206a;
        return this.f5207b.getInt(i11 + this.f5207b.getInt(i11));
    }
}
