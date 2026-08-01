package p005;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏楪子.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6113 implements InterfaceC6110 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f16687;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Inflater f16688;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f16689;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6108 f16690;

    public C6113(C6108 c6108, Inflater inflater) {
        this.f16690 = c6108;
        this.f16688 = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f16687) {
            return;
        }
        this.f16688.end();
        this.f16687 = true;
        this.f16690.close();
    }

    @Override // p005.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6099 mo10875() {
        return this.f16690.f16683.mo10875();
    }

    @Override // p005.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final long mo10876(C6101 c6101, long j) throws IOException {
        long j2;
        Inflater inflater = this.f16688;
        c6101.getClass();
        while (!this.f16687) {
            try {
                C6107 c6107M11469 = c6101.m11469(1);
                int iMin = (int) Math.min(8192L, 8192 - c6107M11469.f16677);
                boolean zNeedsInput = inflater.needsInput();
                C6108 c6108 = this.f16690;
                if (zNeedsInput && !c6108.m11510()) {
                    C6107 c6107 = c6108.f16681.f16658;
                    c6107.getClass();
                    int i = c6107.f16677;
                    int i2 = c6107.f16678;
                    int i3 = i - i2;
                    this.f16689 = i3;
                    inflater.setInput(c6107.f16679, i2, i3);
                }
                int iInflate = inflater.inflate(c6107M11469.f16679, c6107M11469.f16677, iMin);
                int i4 = this.f16689;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f16689 -= remaining;
                    c6108.skip(remaining);
                }
                if (iInflate > 0) {
                    c6107M11469.f16677 += iInflate;
                    j2 = iInflate;
                    c6101.f16657 += j2;
                } else {
                    if (c6107M11469.f16678 == c6107M11469.f16677) {
                        c6101.f16658 = c6107M11469.m11507();
                        AbstractC6111.m11512(c6107M11469);
                    }
                    j2 = 0;
                }
                if (j2 > 0) {
                    return j2;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (c6108.m11510()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        C5919.m11250("closed");
        return 0L;
    }
}
