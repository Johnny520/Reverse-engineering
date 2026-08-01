package p158;

import java.io.IOException;
import java.io.InputStream;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7625 extends C7629 {
    public C7625(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f20676.mark(Integer.MAX_VALUE);
        } else {
            C5925.m11310("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12858(long j) throws IOException {
        int i = this.f20675;
        if (i > j) {
            this.f20675 = 0;
            this.f20676.reset();
        } else {
            j -= (long) i;
        }
        m12866((int) j);
    }

    public C7625(byte[] bArr) {
        super(bArr);
        this.f20676.mark(Integer.MAX_VALUE);
    }
}
