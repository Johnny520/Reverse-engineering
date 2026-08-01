package p366;

import com.bumptech.glide.AbstractC3055;
import com.google.flatbuffers.C3218;
import java.nio.ByteBuffer;
import org.luckypray.dexkit.query.enums.MatchType;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言苏子兰哲楪世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8948 extends AbstractC3055 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final MatchType f25156;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f25157;

    public C8948(int i, MatchType matchType) {
        matchType.getClass();
        MatchType matchType2 = MatchType.Contains;
        this.f25157 = i;
        this.f25156 = matchType;
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final int mo6650(C3218 c3218) {
        int i = this.f25157;
        if (i == 0) {
            C5919.m11249("modifiers must not be 0");
            return 0;
        }
        byte value = this.f25156.getValue();
        c3218.m7312(2);
        if (i != 0) {
            c3218.m7311(4, 0);
            ByteBuffer byteBuffer = c3218.f10856;
            int i2 = c3218.f10855 - 4;
            c3218.f10855 = i2;
            byteBuffer.putInt(i2, i);
            c3218.m7310(0);
        }
        c3218.m7308(value, 1);
        int iM7318 = c3218.m7318();
        c3218.m7316(iM7318);
        return iM7318;
    }
}
