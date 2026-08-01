package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C3219;
import java.nio.ByteBuffer;
import p367.InterfaceC8954;

/* JADX INFO: renamed from: org.luckypray.dexkit.query.matchers.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5704 extends AbstractC5708 implements InterfaceC8954 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f15643;

    public C5704(int i) {
        this.f15643 = i;
    }

    @Override // androidx.compose.foundation.draganddrop.AbstractC0455
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo1181(C3219 c3219) {
        c3219.m7299(1);
        int i = this.f15643;
        if (i != 0) {
            c3219.m7298(4, 0);
            ByteBuffer byteBuffer = c3219.f10861;
            int i2 = c3219.f10860 - 4;
            c3219.f10860 = i2;
            byteBuffer.putInt(i2, i);
            c3219.m7297(0);
        }
        int iM7305 = c3219.m7305();
        c3219.m7303(iM7305);
        return iM7305;
    }
}
