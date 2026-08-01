package p366;

import com.bumptech.glide.AbstractC3055;
import com.google.flatbuffers.C3218;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 飘花落叶言苏子兰哲楪世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8947 extends AbstractC3055 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f25154;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f25155;

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final int mo6650(C3218 c3218) {
        int i = this.f25155;
        int i2 = this.f25154;
        c3218.m7312(2);
        if (i2 != 0) {
            c3218.m7311(4, 0);
            ByteBuffer byteBuffer = c3218.f10856;
            int i3 = c3218.f10855 - 4;
            c3218.f10855 = i3;
            byteBuffer.putInt(i3, i2);
            c3218.m7310(1);
        }
        if (i != 0) {
            c3218.m7311(4, 0);
            ByteBuffer byteBuffer2 = c3218.f10856;
            int i4 = c3218.f10855 - 4;
            c3218.f10855 = i4;
            byteBuffer2.putInt(i4, i);
            c3218.m7310(0);
        }
        int iM7318 = c3218.m7318();
        c3218.m7316(iM7318);
        return iM7318;
    }
}
