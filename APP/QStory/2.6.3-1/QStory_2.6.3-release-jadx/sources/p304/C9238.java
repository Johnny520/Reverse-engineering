package p304;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9238 extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C9237 f23633;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9238(C9237 c9237, int i) {
        super(i);
        this.f23633 = c9237;
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
            return new String(((ByteArrayOutputStream) this).buf, 0, i, this.f23633.f23630.name());
        } catch (UnsupportedEncodingException e) {
            C6755.m11863(e);
            return null;
        }
    }
}
