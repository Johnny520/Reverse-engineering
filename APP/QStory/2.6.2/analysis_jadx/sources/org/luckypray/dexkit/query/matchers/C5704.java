package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C3218;
import java.nio.ByteBuffer;
import p364.InterfaceC8942;

/* JADX INFO: renamed from: org.luckypray.dexkit.query.matchers.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5704 extends AbstractC5707 implements InterfaceC8942 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f15644;

    public C5704(float f) {
        this.f15644 = f;
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final int mo6650(C3218 c3218) {
        c3218.m7312(1);
        float f = this.f15644;
        if (f != 0.0d) {
            c3218.m7311(4, 0);
            ByteBuffer byteBuffer = c3218.f10856;
            int i = c3218.f10855 - 4;
            c3218.f10855 = i;
            byteBuffer.putFloat(i, f);
            c3218.m7310(0);
        }
        int iM7318 = c3218.m7318();
        c3218.m7316(iM7318);
        return iM7318;
    }
}
