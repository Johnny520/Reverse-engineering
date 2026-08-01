package org.luckypray.dexkit.query.matchers;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.google.flatbuffers.C3219;
import org.luckypray.dexkit.query.enums.UsingType;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: org.luckypray.dexkit.query.matchers.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5710 extends AbstractC0455 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public UsingType f15654 = UsingType.Any;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C5716 f15655;

    @Override // androidx.compose.foundation.draganddrop.AbstractC0455
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo1181(C3219 c3219) {
        C5716 c5716 = this.f15655;
        if (c5716 == null) {
            C5925.m11310("UsingFieldMatcher matcher not set");
            return 0;
        }
        int iMo1181 = c5716.mo1181(c3219);
        byte value = this.f15654.getValue();
        c3219.m7299(2);
        c3219.m7292(0, iMo1181);
        c3219.m7295(value, 1);
        int iM7305 = c3219.m7305();
        c3219.m7303(iM7305);
        return iM7305;
    }
}
