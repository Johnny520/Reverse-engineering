package p004;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6104 implements InterfaceC6101 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f16677;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Inflater f16678;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f16679;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6099 f16680;

    public C6104(C6099 c6099, Inflater inflater) {
        this.f16680 = c6099;
        this.f16678 = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f16677) {
            return;
        }
        this.f16678.end();
        this.f16677 = true;
        this.f16680.close();
    }

    @Override // p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo10932(C6092 c6092, long j) throws IOException {
        long j2;
        Inflater inflater = this.f16678;
        c6092.getClass();
        while (!this.f16677) {
            try {
                C6098 c6098M11464 = c6092.m11464(1);
                int iMin = (int) Math.min(8192L, 8192 - c6098M11464.f16667);
                boolean zNeedsInput = inflater.needsInput();
                C6099 c6099 = this.f16680;
                if (zNeedsInput && !c6099.m11503()) {
                    C6098 c6098 = c6099.f16671.f16648;
                    c6098.getClass();
                    int i = c6098.f16667;
                    int i2 = c6098.f16668;
                    int i3 = i - i2;
                    this.f16679 = i3;
                    inflater.setInput(c6098.f16669, i2, i3);
                }
                int iInflate = inflater.inflate(c6098M11464.f16669, c6098M11464.f16667, iMin);
                int i4 = this.f16679;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f16679 -= remaining;
                    c6099.skip(remaining);
                }
                if (iInflate > 0) {
                    c6098M11464.f16667 += iInflate;
                    j2 = iInflate;
                    c6092.f16647 += j2;
                } else {
                    if (c6098M11464.f16668 == c6098M11464.f16667) {
                        c6092.f16648 = c6098M11464.m11500();
                        AbstractC6102.m11505(c6098M11464);
                    }
                    j2 = 0;
                }
                if (j2 > 0) {
                    return j2;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (c6099.m11503()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        C5925.m11311("closed");
        return 0L;
    }

    @Override // p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6090 mo10933() {
        return this.f16680.f16673.mo10933();
    }
}
