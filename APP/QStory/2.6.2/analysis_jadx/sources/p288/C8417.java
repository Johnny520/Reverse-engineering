package p288;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8417 extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C8416 f23297;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8417(C8416 c8416, int i) {
        super(i);
        this.f23297 = c8416;
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
            return new String(((ByteArrayOutputStream) this).buf, 0, i, this.f23297.f23294.name());
        } catch (UnsupportedEncodingException e) {
            C5919.m11243(e);
            return null;
        }
    }
}
