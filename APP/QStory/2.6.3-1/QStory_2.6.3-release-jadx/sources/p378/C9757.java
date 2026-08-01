package p378;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import com.google.flatbuffers.C4051;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 飘花落叶言苏子兰世哲楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9757 extends AbstractC1298 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f25483;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f25484;

    @Override // androidx.compose.foundation.draganddrop.AbstractC1298
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo1741(C4051 c4051) {
        int i = this.f25484;
        int i2 = this.f25483;
        c4051.m7858(2);
        if (i2 != 0) {
            c4051.m7857(4, 0);
            ByteBuffer byteBuffer = c4051.f11206;
            int i3 = c4051.f11205 - 4;
            c4051.f11205 = i3;
            byteBuffer.putInt(i3, i2);
            c4051.m7856(1);
        }
        if (i != 0) {
            c4051.m7857(4, 0);
            ByteBuffer byteBuffer2 = c4051.f11206;
            int i4 = c4051.f11205 - 4;
            c4051.f11205 = i4;
            byteBuffer2.putInt(i4, i);
            c4051.m7856(0);
        }
        int iM7864 = c4051.m7864();
        c4051.m7862(iM7864);
        return iM7864;
    }
}
