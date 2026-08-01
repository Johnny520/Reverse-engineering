package p020;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6933 implements InterfaceC6930 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f17022;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Inflater f17023;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f17024;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6928 f17025;

    public C6933(C6928 c6928, Inflater inflater) {
        this.f17025 = c6928;
        this.f17023 = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17022) {
            return;
        }
        this.f17023.end();
        this.f17022 = true;
        this.f17025.close();
    }

    @Override // p020.InterfaceC6930
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo11491(C6921 c6921, long j) throws IOException {
        long j2;
        Inflater inflater = this.f17023;
        c6921.getClass();
        while (!this.f17022) {
            try {
                C6927 c6927M12023 = c6921.m12023(1);
                int iMin = (int) Math.min(8192L, 8192 - c6927M12023.f17012);
                boolean zNeedsInput = inflater.needsInput();
                C6928 c6928 = this.f17025;
                if (zNeedsInput && !c6928.m12062()) {
                    C6927 c6927 = c6928.f17016.f16993;
                    c6927.getClass();
                    int i = c6927.f17012;
                    int i2 = c6927.f17013;
                    int i3 = i - i2;
                    this.f17024 = i3;
                    inflater.setInput(c6927.f17014, i2, i3);
                }
                int iInflate = inflater.inflate(c6927M12023.f17014, c6927M12023.f17012, iMin);
                int i4 = this.f17024;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f17024 -= remaining;
                    c6928.skip(remaining);
                }
                if (iInflate > 0) {
                    c6927M12023.f17012 += iInflate;
                    j2 = iInflate;
                    c6921.f16992 += j2;
                } else {
                    if (c6927M12023.f17013 == c6927M12023.f17012) {
                        c6921.f16993 = c6927M12023.m12059();
                        AbstractC6931.m12064(c6927M12023);
                    }
                    j2 = 0;
                }
                if (j2 > 0) {
                    return j2;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (c6928.m12062()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        C6755.m11870("closed");
        return 0L;
    }

    @Override // p020.InterfaceC6930
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6919 mo11492() {
        return this.f17025.f17018.mo11492();
    }
}
