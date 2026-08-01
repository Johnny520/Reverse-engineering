package p174;

import java.io.IOException;
import java.io.InputStream;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8454 extends C8458 {
    public C8454(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f21021.mark(Integer.MAX_VALUE);
        } else {
            C6755.m11869("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13417(long j) throws IOException {
        int i = this.f21020;
        if (i > j) {
            this.f21020 = 0;
            this.f21021.reset();
        } else {
            j -= (long) i;
        }
        m13425((int) j);
    }

    public C8454(byte[] bArr) {
        super(bArr);
        this.f21021.mark(Integer.MAX_VALUE);
    }
}
