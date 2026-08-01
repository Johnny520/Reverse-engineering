package p158;

import java.io.IOException;
import java.io.InputStream;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7624 extends C7628 {
    public C7624(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f20681.mark(Integer.MAX_VALUE);
        } else {
            C5919.m11249("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12829(long j) throws IOException {
        int i = this.f20680;
        if (i > j) {
            this.f20680 = 0;
            this.f20681.reset();
        } else {
            j -= (long) i;
        }
        m12837((int) j);
    }

    public C7624(byte[] bArr) {
        super(bArr);
        this.f20681.mark(Integer.MAX_VALUE);
    }
}
