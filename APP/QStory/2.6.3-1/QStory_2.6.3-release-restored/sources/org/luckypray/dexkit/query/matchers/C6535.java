package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C4051;
import java.nio.ByteBuffer;
import p383.InterfaceC9783;

/* JADX INFO: renamed from: org.luckypray.dexkit.query.matchers.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6535 extends AbstractC6538 implements InterfaceC9783 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f15989;

    public C6535(float f) {
        this.f15989 = f;
    }

    @Override // androidx.compose.foundation.draganddrop.AbstractC1298
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo1741(C4051 c4051) {
        c4051.m7858(1);
        float f = this.f15989;
        if (f != 0.0d) {
            c4051.m7857(4, 0);
            ByteBuffer byteBuffer = c4051.f11206;
            int i = c4051.f11205 - 4;
            c4051.f11205 = i;
            byteBuffer.putFloat(i, f);
            c4051.m7856(0);
        }
        int iM7864 = c4051.m7864();
        c4051.m7862(iM7864);
        return iM7864;
    }
}
