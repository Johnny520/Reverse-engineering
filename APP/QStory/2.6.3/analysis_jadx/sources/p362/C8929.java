package p362;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.google.flatbuffers.C3219;
import java.nio.ByteBuffer;
import org.luckypray.dexkit.query.enums.MatchType;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言苏子兰世哲楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8929 extends AbstractC0455 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final MatchType f25140;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f25141;

    public C8929(int i, MatchType matchType) {
        matchType.getClass();
        MatchType matchType2 = MatchType.Contains;
        this.f25141 = i;
        this.f25140 = matchType;
    }

    @Override // androidx.compose.foundation.draganddrop.AbstractC0455
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo1181(C3219 c3219) {
        int i = this.f25141;
        if (i == 0) {
            C5925.m11310("modifiers must not be 0");
            return 0;
        }
        byte value = this.f25140.getValue();
        c3219.m7299(2);
        if (i != 0) {
            c3219.m7298(4, 0);
            ByteBuffer byteBuffer = c3219.f10861;
            int i2 = c3219.f10860 - 4;
            c3219.f10860 = i2;
            byteBuffer.putInt(i2, i);
            c3219.m7297(0);
        }
        c3219.m7295(value, 1);
        int iM7305 = c3219.m7305();
        c3219.m7303(iM7305);
        return iM7305;
    }
}
