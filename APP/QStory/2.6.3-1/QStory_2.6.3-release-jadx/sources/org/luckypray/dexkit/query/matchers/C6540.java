package org.luckypray.dexkit.query.matchers;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import com.google.flatbuffers.C4051;
import org.luckypray.dexkit.query.enums.UsingType;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: org.luckypray.dexkit.query.matchers.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6540 extends AbstractC1298 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public UsingType f15999 = UsingType.Any;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C6546 f16000;

    @Override // androidx.compose.foundation.draganddrop.AbstractC1298
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo1741(C4051 c4051) {
        C6546 c6546 = this.f16000;
        if (c6546 == null) {
            C6755.m11869("UsingFieldMatcher matcher not set");
            return 0;
        }
        int iMo1741 = c6546.mo1741(c4051);
        byte value = this.f15999.getValue();
        c4051.m7858(2);
        c4051.m7851(0, iMo1741);
        c4051.m7854(value, 1);
        int iM7864 = c4051.m7864();
        c4051.m7862(iM7864);
        return iM7864;
    }
}
