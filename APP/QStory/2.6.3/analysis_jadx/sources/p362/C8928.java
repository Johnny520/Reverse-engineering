package p362;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.google.flatbuffers.C3219;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 飘花落叶言苏子兰世哲楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8928 extends AbstractC0455 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f25138;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f25139;

    @Override // androidx.compose.foundation.draganddrop.AbstractC0455
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo1181(C3219 c3219) {
        int i = this.f25139;
        int i2 = this.f25138;
        c3219.m7299(2);
        if (i2 != 0) {
            c3219.m7298(4, 0);
            ByteBuffer byteBuffer = c3219.f10861;
            int i3 = c3219.f10860 - 4;
            c3219.f10860 = i3;
            byteBuffer.putInt(i3, i2);
            c3219.m7297(1);
        }
        if (i != 0) {
            c3219.m7298(4, 0);
            ByteBuffer byteBuffer2 = c3219.f10861;
            int i4 = c3219.f10860 - 4;
            c3219.f10860 = i4;
            byteBuffer2.putInt(i4, i);
            c3219.m7297(0);
        }
        int iM7305 = c3219.m7305();
        c3219.m7303(iM7305);
        return iM7305;
    }
}
