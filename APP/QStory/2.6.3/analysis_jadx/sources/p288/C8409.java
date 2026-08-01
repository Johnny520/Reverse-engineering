package p288;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8409 extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C8408 f23288;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8409(C8408 c8408, int i) {
        super(i);
        this.f23288 = c8408;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i = ((ByteArrayOutputStream) this).count;
        if (i > 0) {
            int i2 = i - 1;
            if (((ByteArrayOutputStream) this).buf[i2] == 13) {
                i = i2;
            }
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i, this.f23288.f23285.name());
        } catch (UnsupportedEncodingException e) {
            C5925.m11304(e);
            return null;
        }
    }
}
