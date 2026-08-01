package p378;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import com.google.flatbuffers.C4051;
import java.nio.ByteBuffer;
import org.luckypray.dexkit.query.enums.MatchType;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言苏子兰世哲楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9758 extends AbstractC1298 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final MatchType f25485;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f25486;

    public C9758(int i, MatchType matchType) {
        matchType.getClass();
        MatchType matchType2 = MatchType.Contains;
        this.f25486 = i;
        this.f25485 = matchType;
    }

    @Override // androidx.compose.foundation.draganddrop.AbstractC1298
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo1741(C4051 c4051) {
        int i = this.f25486;
        if (i == 0) {
            C6755.m11869("modifiers must not be 0");
            return 0;
        }
        byte value = this.f25485.getValue();
        c4051.m7858(2);
        if (i != 0) {
            c4051.m7857(4, 0);
            ByteBuffer byteBuffer = c4051.f11206;
            int i2 = c4051.f11205 - 4;
            c4051.f11205 = i2;
            byteBuffer.putInt(i2, i);
            c4051.m7856(0);
        }
        c4051.m7854(value, 1);
        int iM7864 = c4051.m7864();
        c4051.m7862(iM7864);
        return iM7864;
    }
}
